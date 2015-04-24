/*
 * generated by Xtext
 */
package org.xtext.example.mydsl1.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import featureModel.Feature
import featureModel.Model
import featureModel.Group
import javax.management.openmbean.SimpleType
import featureModel.SolitaryType

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class MyDslGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(typeof(Greeting))
//				.map[name]
//				.join(', '))
		fsa.generateFile('pokemon.html', toHTML(resource.contents.head as Model))
		
	}
	
	def toHTML(Model model) '''
		<!doctype html>
			<html>
				<head>
					<title>
					«FOR root : model.rootFeature» «root.name» : «ENDFOR»
					</title>
				</head>
				<body>
					«FOR root : model.rootFeature»
					<h1>
					«root.name»
					</h1>
					<form> 
						«getFeatureCode(root)»
						<br>
						
						<input type="submit" name="form" value="submit">
					</form>
					«ENDFOR»
					«FOR root : model.rootFeature»
						
					«ENDFOR»
				</body>
			</html>
	'''
	
	
	def String getFeatureCode(Feature f)'''
		«IF (f != null)»
			«FOR feature : f.features»
				 <fieldset>
				«IF (feature.type == featureModel.SimpleType.BOOLEAN)»
					«IF feature.required == SolitaryType.OPTIONAL»
						<br>
						<input type="checkbox" id="«feature.name.toLowerCase()»" name="«f.name»" value="«feature.name.toLowerCase»"> «feature.name» <br>
					«ELSE»
					<legend>«feature.name»*</legend>
					«ENDIF»
				«ELSE»
					«feature.name»:
					<input type="text" id="«feature.name.toLowerCase»" name="«feature.name.toLowerCase»"> <br>
				«ENDIF»
				«getFeatureCode(feature)»
				</fieldset>
			«ENDFOR»
			«FOR g : f.groups»
				«getGroupCode(g, f)»
			«ENDFOR»
			
		«ENDIF»
	'''
	
	def String getGroupCode(Group g, Feature f)'''
		«IF (g != null)»
			«IF g.inclusive» ««« select any 
				«FOR gf : g.groupedFeatures»
					<br> 
					<input type="checkbox" id="«gf.name.toLowerCase»" name="«f.name»" value="«gf.name.toLowerCase»"> 
					«gf.name» 
						«getFeatureCode(gf)»
				«ENDFOR»
			«ELSE» «««	select one
				<select name="«f.name»">
				«FOR gf : g.groupedFeatures»
					<br> <option value="«gf.name.toLowerCase»">«gf.name»</option> 
						«getFeatureCode(gf)»
				«ENDFOR»
				</select>
			«ENDIF»
				<br>
		«ENDIF»
	'''
}
