package org.xtext.example.mydsl1.validation

import featureModel.BinaryOperation
import featureModel.BinaryOperator
import featureModel.Expression
import featureModel.Feature
import featureModel.Identifier
import featureModel.Model
import featureModel.NULL
import featureModel.SimpleType
import featureModel.UnaryOperation
import featureModel.UnaryOperator
import java.util.ArrayList
import org.eclipse.xtext.validation.Check

class MyDslValidator extends AbstractMyDslValidator {
	
	@Check
	def featureShouldHaveUniquelyNamedSubFeatures(Feature it){
		val arr = new ArrayList<String>()
		features.forEach[f | 
			if(!arr.contains(f.name)){
				arr.add(f.name)
			}else{
				error("feature: \""+f.name+"\" appear multiple times inside feature: "+name, f, null, 'naming')
			}
		]
	}
	
	var count = 0;
	@Check
	def onlyOneExclusiveSelectGroupPerFeature(Feature it){
		count = 0;
		groups.forEach[group | if (!group.inclusive) count++ ]
		if(count > 1){
			error('Only one exclusive select in each feature!', it, null, 'one exclusive select')
		}
	}

	@Check
	def onlyRootFeatureCanHaveConstraints(Model it){
		val r = rootFeature.forall[features |  check(features)]
		if(!r){
			error('Put constraints after the last feature.', it, null, 'put constraints in root feature')
		}
	}

	def boolean check(Feature it){
		features.forall[features | checkNotContainConstraints(features)]
	}

	def boolean checkNotContainConstraints(Feature it) {
		val r = constraints.isEmpty
		if(!r){
			error('only rootfeature can have constraints', it, null, 'put constraints in root feature')
		}
		return r && features.forall[features | checkNotContainConstraints(features)]
	}

	@Check
	def topConstraintShouldBeBoolean(Feature f) {
//		f.constraints.forall[topConstraint | getType(topConstraint) == SimpleType.get('boolean')]
		for (Expression constraint : f.constraints) {
			if (!(getType(constraint) == SimpleType.BOOLEAN)){
					error('top constraint must be boolean', f, null, 'invalid type')
			}
		}
	}

	def SimpleType getType(Expression e) {
	//Identifier
		if (e instanceof Identifier) {
			val id = e as Identifier
			id.ref.get(id.ref.size - 1).type
	//BinaryOperation
		}else if (e instanceof BinaryOperation) {
			val binOp = e as BinaryOperation
			val op = binOp.operator
			val ltype = getType(binOp.lexp)
			val rtype = getType(binOp.rexp)
			//must be same type
			if (ltype == rtype) {
				if (op == BinaryOperator.AND || op == BinaryOperator.OR) {
					if (ltype == SimpleType.BOOLEAN) {
						ltype
					} else if (rtype == SimpleType.BOOLEAN) {
						rtype
					} else {
						error('top constraint must be boolean', e, null, 'invalid type')
						throw new Exception("invalid type, must be boolean with And or Or operator")
					}
				} else if (op == BinaryOperator.EQUALS || op == BinaryOperator.HIGHER || op == BinaryOperator.LOWER) {
					SimpleType.BOOLEAN
				
				}else if (	op == BinaryOperator.DIVIDE || op == BinaryOperator.MULTIPLY || op == BinaryOperator.ADD || op == BinaryOperator.SUBTRACT) {
					if (ltype == SimpleType.INT || ltype == SimpleType.DOUBLE) {
						ltype
					} else {
						error('division, multiply, addition or subtraction must be type int or Double', e, null, 'invalid type')
						throw new Exception("invalid type")
					}
				}
			} //END same type
			else if(ltype == SimpleType.NULLTYPE && rtype == SimpleType.STRING && op == BinaryOperator.EQUALS){
			//left type is null and right type is string
				SimpleType.BOOLEAN
				
			}
			else if(rtype == SimpleType.NULLTYPE && ltype == SimpleType.STRING && op == BinaryOperator.EQUALS){
			//left type is null and right type is string
				SimpleType.BOOLEAN
				
			}
			else if(ltype != rtype){
				error('left and right hand side of binary expression should be the same', e, null, 'invalid type')
				throw new Exception("invalid type"+ltype+" "+rtype+" "+op)
				
			}else{
				error('something else went wrong', e, null, 'invalid type')
				throw new Exception("invalid type")
			}

	//UnaryOperation
		} else if (e instanceof UnaryOperation) {
			val expression = e as UnaryOperation
			val eType = getType(expression.exp)
			val op = expression.operator
			if( (op == UnaryOperator.NOT && (eType == SimpleType.BOOLEAN))
					|| 
				(op == UnaryOperator.MINUS && (eType == SimpleType.INT || eType == SimpleType.DOUBLE)) ){
				eType
			}else{
				error('not correct type in unary expression', e, null, 'invalid type')
				throw new Exception("invalid type")
			}

	//NULL
		} else if(e instanceof NULL){
			SimpleType.NULLTYPE
	//Number
		}else {
			SimpleType.INT
		}
	}
}