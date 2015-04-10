/**
 */
package featureModel.impl;

import featureModel.BinaryOperation;
import featureModel.BinaryOperator;
import featureModel.FeatureModelFactory;
import featureModel.FeatureModelPackage;
import featureModel.Group;
import featureModel.GroupedFeature;
import featureModel.Identifier;
import featureModel.Model;
import featureModel.NULL;
import featureModel.SimpleType;
import featureModel.SolitaryFeature;
import featureModel.SolitaryType;
import featureModel.UnaryOperation;
import featureModel.UnaryOperator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureModelFactoryImpl extends EFactoryImpl implements FeatureModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FeatureModelFactory init() {
		try {
			FeatureModelFactory theFeatureModelFactory = (FeatureModelFactory)EPackage.Registry.INSTANCE.getEFactory(FeatureModelPackage.eNS_URI);
			if (theFeatureModelFactory != null) {
				return theFeatureModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FeatureModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FeatureModelPackage.SOLITARY_FEATURE: return createSolitaryFeature();
			case FeatureModelPackage.GROUPED_FEATURE: return createGroupedFeature();
			case FeatureModelPackage.MODEL: return createModel();
			case FeatureModelPackage.GROUP: return createGroup();
			case FeatureModelPackage.BINARY_OPERATION: return createBinaryOperation();
			case FeatureModelPackage.UNARY_OPERATION: return createUnaryOperation();
			case FeatureModelPackage.NULL: return createNULL();
			case FeatureModelPackage.NUMBER: return createNumber();
			case FeatureModelPackage.IDENTIFIER: return createIdentifier();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FeatureModelPackage.SIMPLE_TYPE:
				return createSimpleTypeFromString(eDataType, initialValue);
			case FeatureModelPackage.BINARY_OPERATOR:
				return createBinaryOperatorFromString(eDataType, initialValue);
			case FeatureModelPackage.UNARY_OPERATOR:
				return createUnaryOperatorFromString(eDataType, initialValue);
			case FeatureModelPackage.SOLITARY_TYPE:
				return createSolitaryTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FeatureModelPackage.SIMPLE_TYPE:
				return convertSimpleTypeToString(eDataType, instanceValue);
			case FeatureModelPackage.BINARY_OPERATOR:
				return convertBinaryOperatorToString(eDataType, instanceValue);
			case FeatureModelPackage.UNARY_OPERATOR:
				return convertUnaryOperatorToString(eDataType, instanceValue);
			case FeatureModelPackage.SOLITARY_TYPE:
				return convertSolitaryTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolitaryFeature createSolitaryFeature() {
		SolitaryFeatureImpl solitaryFeature = new SolitaryFeatureImpl();
		return solitaryFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupedFeature createGroupedFeature() {
		GroupedFeatureImpl groupedFeature = new GroupedFeatureImpl();
		return groupedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOperation createBinaryOperation() {
		BinaryOperationImpl binaryOperation = new BinaryOperationImpl();
		return binaryOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryOperation createUnaryOperation() {
		UnaryOperationImpl unaryOperation = new UnaryOperationImpl();
		return unaryOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NULL createNULL() {
		NULLImpl null_ = new NULLImpl();
		return null_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public featureModel.Number createNumber() {
		NumberImpl number = new NumberImpl();
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier createIdentifier() {
		IdentifierImpl identifier = new IdentifierImpl();
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleType createSimpleTypeFromString(EDataType eDataType, String initialValue) {
		SimpleType result = SimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOperator createBinaryOperatorFromString(EDataType eDataType, String initialValue) {
		BinaryOperator result = BinaryOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinaryOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryOperator createUnaryOperatorFromString(EDataType eDataType, String initialValue) {
		UnaryOperator result = UnaryOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnaryOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolitaryType createSolitaryTypeFromString(EDataType eDataType, String initialValue) {
		SolitaryType result = SolitaryType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSolitaryTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureModelPackage getFeatureModelPackage() {
		return (FeatureModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FeatureModelPackage getPackage() {
		return FeatureModelPackage.eINSTANCE;
	}

} //FeatureModelFactoryImpl
