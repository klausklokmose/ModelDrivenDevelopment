/**
 */
package featureModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link featureModel.Feature#getGroups <em>Groups</em>}</li>
 *   <li>{@link featureModel.Feature#getFeatures <em>Features</em>}</li>
 *   <li>{@link featureModel.Feature#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link featureModel.Feature#getName <em>Name</em>}</li>
 *   <li>{@link featureModel.Feature#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see featureModel.FeatureModelPackage#getFeature()
 * @model abstract="true"
 * @generated
 */
public interface Feature extends EObject {
	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link featureModel.Group}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see featureModel.FeatureModelPackage#getFeature_Groups()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group> getGroups();

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link featureModel.SolitaryFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see featureModel.FeatureModelPackage#getFeature_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<SolitaryFeature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link featureModel.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see featureModel.FeatureModelPackage#getFeature_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getConstraints();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see featureModel.FeatureModelPackage#getFeature_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link featureModel.Feature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link featureModel.SimpleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see featureModel.SimpleType
	 * @see #setType(SimpleType)
	 * @see featureModel.FeatureModelPackage#getFeature_Type()
	 * @model
	 * @generated
	 */
	SimpleType getType();

	/**
	 * Sets the value of the '{@link featureModel.Feature#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see featureModel.SimpleType
	 * @see #getType()
	 * @generated
	 */
	void setType(SimpleType value);

} // Feature
