/**
 */
package featureModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solitary Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link featureModel.SolitaryFeature#getRequired <em>Required</em>}</li>
 * </ul>
 * </p>
 *
 * @see featureModel.FeatureModelPackage#getSolitaryFeature()
 * @model
 * @generated
 */
public interface SolitaryFeature extends Feature {
	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * The literals are from the enumeration {@link featureModel.SolitaryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see featureModel.SolitaryType
	 * @see #setRequired(SolitaryType)
	 * @see featureModel.FeatureModelPackage#getSolitaryFeature_Required()
	 * @model required="true"
	 * @generated
	 */
	SolitaryType getRequired();

	/**
	 * Sets the value of the '{@link featureModel.SolitaryFeature#getRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see featureModel.SolitaryType
	 * @see #getRequired()
	 * @generated
	 */
	void setRequired(SolitaryType value);

} // SolitaryFeature
