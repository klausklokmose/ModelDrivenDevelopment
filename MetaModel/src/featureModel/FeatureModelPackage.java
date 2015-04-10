/**
 */
package featureModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see featureModel.FeatureModelFactory
 * @model kind="package"
 * @generated
 */
public interface FeatureModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "featureModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.itu.dk/dijkstra/dk.itu.model.featuremodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FeatureModelPackage eINSTANCE = featureModel.impl.FeatureModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link featureModel.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.impl.FeatureImpl
	 * @see featureModel.impl.FeatureModelPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__GROUPS = 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__FEATURES = 1;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CONSTRAINTS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link featureModel.impl.SolitaryFeatureImpl <em>Solitary Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.impl.SolitaryFeatureImpl
	 * @see featureModel.impl.FeatureModelPackageImpl#getSolitaryFeature()
	 * @generated
	 */
	int SOLITARY_FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_FEATURE__GROUPS = FEATURE__GROUPS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_FEATURE__FEATURES = FEATURE__FEATURES;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_FEATURE__CONSTRAINTS = FEATURE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_FEATURE__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_FEATURE__TYPE = FEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_FEATURE__REQUIRED = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Solitary Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Solitary Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_FEATURE_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link featureModel.impl.GroupedFeatureImpl <em>Grouped Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.impl.GroupedFeatureImpl
	 * @see featureModel.impl.FeatureModelPackageImpl#getGroupedFeature()
	 * @generated
	 */
	int GROUPED_FEATURE = 2;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPED_FEATURE__GROUPS = FEATURE__GROUPS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPED_FEATURE__FEATURES = FEATURE__FEATURES;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPED_FEATURE__CONSTRAINTS = FEATURE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPED_FEATURE__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPED_FEATURE__TYPE = FEATURE__TYPE;

	/**
	 * The number of structural features of the '<em>Grouped Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPED_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Grouped Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPED_FEATURE_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link featureModel.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.impl.ModelImpl
	 * @see featureModel.impl.FeatureModelPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 3;

	/**
	 * The feature id for the '<em><b>Root Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ROOT_FEATURE = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link featureModel.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.impl.GroupImpl
	 * @see featureModel.impl.FeatureModelPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 4;

	/**
	 * The feature id for the '<em><b>Grouped Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__GROUPED_FEATURES = 0;

	/**
	 * The feature id for the '<em><b>Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__INCLUSIVE = 1;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link featureModel.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.impl.ExpressionImpl
	 * @see featureModel.impl.FeatureModelPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 5;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link featureModel.impl.BinaryOperationImpl <em>Binary Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.impl.BinaryOperationImpl
	 * @see featureModel.impl.FeatureModelPackageImpl#getBinaryOperation()
	 * @generated
	 */
	int BINARY_OPERATION = 6;

	/**
	 * The feature id for the '<em><b>Rexp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__REXP = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lexp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__LEXP = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__OPERATOR = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Binary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link featureModel.impl.UnaryOperationImpl <em>Unary Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.impl.UnaryOperationImpl
	 * @see featureModel.impl.FeatureModelPackageImpl#getUnaryOperation()
	 * @generated
	 */
	int UNARY_OPERATION = 7;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATION__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATION__EXP = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link featureModel.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.impl.ConstantImpl
	 * @see featureModel.impl.FeatureModelPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 8;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link featureModel.impl.NULLImpl <em>NULL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.impl.NULLImpl
	 * @see featureModel.impl.FeatureModelPackageImpl#getNULL()
	 * @generated
	 */
	int NULL = 9;

	/**
	 * The number of structural features of the '<em>NULL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>NULL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link featureModel.impl.NumberImpl <em>Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.impl.NumberImpl
	 * @see featureModel.impl.FeatureModelPackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__VALUE = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link featureModel.impl.IdentifierImpl <em>Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.impl.IdentifierImpl
	 * @see featureModel.impl.FeatureModelPackageImpl#getIdentifier()
	 * @generated
	 */
	int IDENTIFIER = 11;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__REF = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__NAME = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link featureModel.SimpleType <em>Simple Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.SimpleType
	 * @see featureModel.impl.FeatureModelPackageImpl#getSimpleType()
	 * @generated
	 */
	int SIMPLE_TYPE = 12;

	/**
	 * The meta object id for the '{@link featureModel.BinaryOperator <em>Binary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.BinaryOperator
	 * @see featureModel.impl.FeatureModelPackageImpl#getBinaryOperator()
	 * @generated
	 */
	int BINARY_OPERATOR = 13;

	/**
	 * The meta object id for the '{@link featureModel.UnaryOperator <em>Unary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.UnaryOperator
	 * @see featureModel.impl.FeatureModelPackageImpl#getUnaryOperator()
	 * @generated
	 */
	int UNARY_OPERATOR = 14;

	/**
	 * The meta object id for the '{@link featureModel.SolitaryType <em>Solitary Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.SolitaryType
	 * @see featureModel.impl.FeatureModelPackageImpl#getSolitaryType()
	 * @generated
	 */
	int SOLITARY_TYPE = 15;


	/**
	 * Returns the meta object for class '{@link featureModel.SolitaryFeature <em>Solitary Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solitary Feature</em>'.
	 * @see featureModel.SolitaryFeature
	 * @generated
	 */
	EClass getSolitaryFeature();

	/**
	 * Returns the meta object for the attribute '{@link featureModel.SolitaryFeature#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see featureModel.SolitaryFeature#getRequired()
	 * @see #getSolitaryFeature()
	 * @generated
	 */
	EAttribute getSolitaryFeature_Required();

	/**
	 * Returns the meta object for class '{@link featureModel.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see featureModel.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link featureModel.Feature#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see featureModel.Feature#getGroups()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Groups();

	/**
	 * Returns the meta object for the containment reference list '{@link featureModel.Feature#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see featureModel.Feature#getFeatures()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Features();

	/**
	 * Returns the meta object for the containment reference list '{@link featureModel.Feature#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see featureModel.Feature#getConstraints()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Constraints();

	/**
	 * Returns the meta object for the attribute '{@link featureModel.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see featureModel.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

	/**
	 * Returns the meta object for the attribute '{@link featureModel.Feature#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see featureModel.Feature#getType()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Type();

	/**
	 * Returns the meta object for class '{@link featureModel.GroupedFeature <em>Grouped Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grouped Feature</em>'.
	 * @see featureModel.GroupedFeature
	 * @generated
	 */
	EClass getGroupedFeature();

	/**
	 * Returns the meta object for class '{@link featureModel.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see featureModel.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link featureModel.Model#getRootFeature <em>Root Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Root Feature</em>'.
	 * @see featureModel.Model#getRootFeature()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_RootFeature();

	/**
	 * Returns the meta object for class '{@link featureModel.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see featureModel.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link featureModel.Group#getGroupedFeatures <em>Grouped Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Grouped Features</em>'.
	 * @see featureModel.Group#getGroupedFeatures()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_GroupedFeatures();

	/**
	 * Returns the meta object for the attribute '{@link featureModel.Group#isInclusive <em>Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inclusive</em>'.
	 * @see featureModel.Group#isInclusive()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Inclusive();

	/**
	 * Returns the meta object for class '{@link featureModel.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see featureModel.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link featureModel.BinaryOperation <em>Binary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Operation</em>'.
	 * @see featureModel.BinaryOperation
	 * @generated
	 */
	EClass getBinaryOperation();

	/**
	 * Returns the meta object for the containment reference '{@link featureModel.BinaryOperation#getRexp <em>Rexp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rexp</em>'.
	 * @see featureModel.BinaryOperation#getRexp()
	 * @see #getBinaryOperation()
	 * @generated
	 */
	EReference getBinaryOperation_Rexp();

	/**
	 * Returns the meta object for the containment reference '{@link featureModel.BinaryOperation#getLexp <em>Lexp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lexp</em>'.
	 * @see featureModel.BinaryOperation#getLexp()
	 * @see #getBinaryOperation()
	 * @generated
	 */
	EReference getBinaryOperation_Lexp();

	/**
	 * Returns the meta object for the attribute '{@link featureModel.BinaryOperation#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see featureModel.BinaryOperation#getOperator()
	 * @see #getBinaryOperation()
	 * @generated
	 */
	EAttribute getBinaryOperation_Operator();

	/**
	 * Returns the meta object for class '{@link featureModel.UnaryOperation <em>Unary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Operation</em>'.
	 * @see featureModel.UnaryOperation
	 * @generated
	 */
	EClass getUnaryOperation();

	/**
	 * Returns the meta object for the attribute '{@link featureModel.UnaryOperation#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see featureModel.UnaryOperation#getOperator()
	 * @see #getUnaryOperation()
	 * @generated
	 */
	EAttribute getUnaryOperation_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link featureModel.UnaryOperation#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see featureModel.UnaryOperation#getExp()
	 * @see #getUnaryOperation()
	 * @generated
	 */
	EReference getUnaryOperation_Exp();

	/**
	 * Returns the meta object for class '{@link featureModel.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see featureModel.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for class '{@link featureModel.NULL <em>NULL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NULL</em>'.
	 * @see featureModel.NULL
	 * @generated
	 */
	EClass getNULL();

	/**
	 * Returns the meta object for class '{@link featureModel.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number</em>'.
	 * @see featureModel.Number
	 * @generated
	 */
	EClass getNumber();

	/**
	 * Returns the meta object for the attribute '{@link featureModel.Number#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see featureModel.Number#getValue()
	 * @see #getNumber()
	 * @generated
	 */
	EAttribute getNumber_Value();

	/**
	 * Returns the meta object for class '{@link featureModel.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier</em>'.
	 * @see featureModel.Identifier
	 * @generated
	 */
	EClass getIdentifier();

	/**
	 * Returns the meta object for the reference '{@link featureModel.Identifier#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see featureModel.Identifier#getRef()
	 * @see #getIdentifier()
	 * @generated
	 */
	EReference getIdentifier_Ref();

	/**
	 * Returns the meta object for the attribute '{@link featureModel.Identifier#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see featureModel.Identifier#getName()
	 * @see #getIdentifier()
	 * @generated
	 */
	EAttribute getIdentifier_Name();

	/**
	 * Returns the meta object for enum '{@link featureModel.SimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Simple Type</em>'.
	 * @see featureModel.SimpleType
	 * @generated
	 */
	EEnum getSimpleType();

	/**
	 * Returns the meta object for enum '{@link featureModel.BinaryOperator <em>Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Operator</em>'.
	 * @see featureModel.BinaryOperator
	 * @generated
	 */
	EEnum getBinaryOperator();

	/**
	 * Returns the meta object for enum '{@link featureModel.UnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unary Operator</em>'.
	 * @see featureModel.UnaryOperator
	 * @generated
	 */
	EEnum getUnaryOperator();

	/**
	 * Returns the meta object for enum '{@link featureModel.SolitaryType <em>Solitary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Solitary Type</em>'.
	 * @see featureModel.SolitaryType
	 * @generated
	 */
	EEnum getSolitaryType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FeatureModelFactory getFeatureModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link featureModel.impl.SolitaryFeatureImpl <em>Solitary Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.impl.SolitaryFeatureImpl
		 * @see featureModel.impl.FeatureModelPackageImpl#getSolitaryFeature()
		 * @generated
		 */
		EClass SOLITARY_FEATURE = eINSTANCE.getSolitaryFeature();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLITARY_FEATURE__REQUIRED = eINSTANCE.getSolitaryFeature_Required();

		/**
		 * The meta object literal for the '{@link featureModel.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.impl.FeatureImpl
		 * @see featureModel.impl.FeatureModelPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__GROUPS = eINSTANCE.getFeature_Groups();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__FEATURES = eINSTANCE.getFeature_Features();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__CONSTRAINTS = eINSTANCE.getFeature_Constraints();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__TYPE = eINSTANCE.getFeature_Type();

		/**
		 * The meta object literal for the '{@link featureModel.impl.GroupedFeatureImpl <em>Grouped Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.impl.GroupedFeatureImpl
		 * @see featureModel.impl.FeatureModelPackageImpl#getGroupedFeature()
		 * @generated
		 */
		EClass GROUPED_FEATURE = eINSTANCE.getGroupedFeature();

		/**
		 * The meta object literal for the '{@link featureModel.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.impl.ModelImpl
		 * @see featureModel.impl.FeatureModelPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Root Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ROOT_FEATURE = eINSTANCE.getModel_RootFeature();

		/**
		 * The meta object literal for the '{@link featureModel.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.impl.GroupImpl
		 * @see featureModel.impl.FeatureModelPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Grouped Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__GROUPED_FEATURES = eINSTANCE.getGroup_GroupedFeatures();

		/**
		 * The meta object literal for the '<em><b>Inclusive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__INCLUSIVE = eINSTANCE.getGroup_Inclusive();

		/**
		 * The meta object literal for the '{@link featureModel.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.impl.ExpressionImpl
		 * @see featureModel.impl.FeatureModelPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link featureModel.impl.BinaryOperationImpl <em>Binary Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.impl.BinaryOperationImpl
		 * @see featureModel.impl.FeatureModelPackageImpl#getBinaryOperation()
		 * @generated
		 */
		EClass BINARY_OPERATION = eINSTANCE.getBinaryOperation();

		/**
		 * The meta object literal for the '<em><b>Rexp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATION__REXP = eINSTANCE.getBinaryOperation_Rexp();

		/**
		 * The meta object literal for the '<em><b>Lexp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATION__LEXP = eINSTANCE.getBinaryOperation_Lexp();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_OPERATION__OPERATOR = eINSTANCE.getBinaryOperation_Operator();

		/**
		 * The meta object literal for the '{@link featureModel.impl.UnaryOperationImpl <em>Unary Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.impl.UnaryOperationImpl
		 * @see featureModel.impl.FeatureModelPackageImpl#getUnaryOperation()
		 * @generated
		 */
		EClass UNARY_OPERATION = eINSTANCE.getUnaryOperation();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_OPERATION__OPERATOR = eINSTANCE.getUnaryOperation_Operator();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_OPERATION__EXP = eINSTANCE.getUnaryOperation_Exp();

		/**
		 * The meta object literal for the '{@link featureModel.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.impl.ConstantImpl
		 * @see featureModel.impl.FeatureModelPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '{@link featureModel.impl.NULLImpl <em>NULL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.impl.NULLImpl
		 * @see featureModel.impl.FeatureModelPackageImpl#getNULL()
		 * @generated
		 */
		EClass NULL = eINSTANCE.getNULL();

		/**
		 * The meta object literal for the '{@link featureModel.impl.NumberImpl <em>Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.impl.NumberImpl
		 * @see featureModel.impl.FeatureModelPackageImpl#getNumber()
		 * @generated
		 */
		EClass NUMBER = eINSTANCE.getNumber();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER__VALUE = eINSTANCE.getNumber_Value();

		/**
		 * The meta object literal for the '{@link featureModel.impl.IdentifierImpl <em>Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.impl.IdentifierImpl
		 * @see featureModel.impl.FeatureModelPackageImpl#getIdentifier()
		 * @generated
		 */
		EClass IDENTIFIER = eINSTANCE.getIdentifier();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIER__REF = eINSTANCE.getIdentifier_Ref();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIER__NAME = eINSTANCE.getIdentifier_Name();

		/**
		 * The meta object literal for the '{@link featureModel.SimpleType <em>Simple Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.SimpleType
		 * @see featureModel.impl.FeatureModelPackageImpl#getSimpleType()
		 * @generated
		 */
		EEnum SIMPLE_TYPE = eINSTANCE.getSimpleType();

		/**
		 * The meta object literal for the '{@link featureModel.BinaryOperator <em>Binary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.BinaryOperator
		 * @see featureModel.impl.FeatureModelPackageImpl#getBinaryOperator()
		 * @generated
		 */
		EEnum BINARY_OPERATOR = eINSTANCE.getBinaryOperator();

		/**
		 * The meta object literal for the '{@link featureModel.UnaryOperator <em>Unary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.UnaryOperator
		 * @see featureModel.impl.FeatureModelPackageImpl#getUnaryOperator()
		 * @generated
		 */
		EEnum UNARY_OPERATOR = eINSTANCE.getUnaryOperator();

		/**
		 * The meta object literal for the '{@link featureModel.SolitaryType <em>Solitary Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.SolitaryType
		 * @see featureModel.impl.FeatureModelPackageImpl#getSolitaryType()
		 * @generated
		 */
		EEnum SOLITARY_TYPE = eINSTANCE.getSolitaryType();

	}

} //FeatureModelPackage
