/**
 */
package featureModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link featureModel.Group#getGroupedFeatures <em>Grouped Features</em>}</li>
 *   <li>{@link featureModel.Group#isInclusive <em>Inclusive</em>}</li>
 * </ul>
 * </p>
 *
 * @see featureModel.FeatureModelPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends EObject {
	/**
	 * Returns the value of the '<em><b>Grouped Features</b></em>' containment reference list.
	 * The list contents are of type {@link featureModel.GroupedFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grouped Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouped Features</em>' containment reference list.
	 * @see featureModel.FeatureModelPackage#getGroup_GroupedFeatures()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<GroupedFeature> getGroupedFeatures();

	/**
	 * Returns the value of the '<em><b>Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inclusive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inclusive</em>' attribute.
	 * @see #setInclusive(boolean)
	 * @see featureModel.FeatureModelPackage#getGroup_Inclusive()
	 * @model required="true"
	 * @generated
	 */
	boolean isInclusive();

	/**
	 * Sets the value of the '{@link featureModel.Group#isInclusive <em>Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inclusive</em>' attribute.
	 * @see #isInclusive()
	 * @generated
	 */
	void setInclusive(boolean value);

} // Group
