/**
 */
package featureModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link featureModel.UnaryOperation#getOperator <em>Operator</em>}</li>
 *   <li>{@link featureModel.UnaryOperation#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see featureModel.FeatureModelPackage#getUnaryOperation()
 * @model
 * @generated
 */
public interface UnaryOperation extends Expression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link featureModel.UnaryOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see featureModel.UnaryOperator
	 * @see #setOperator(UnaryOperator)
	 * @see featureModel.FeatureModelPackage#getUnaryOperation_Operator()
	 * @model required="true"
	 * @generated
	 */
	UnaryOperator getOperator();

	/**
	 * Sets the value of the '{@link featureModel.UnaryOperation#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see featureModel.UnaryOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(UnaryOperator value);

	/**
	 * Returns the value of the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp</em>' containment reference.
	 * @see #setExp(Expression)
	 * @see featureModel.FeatureModelPackage#getUnaryOperation_Exp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="name='exp'"
	 * @generated
	 */
	Expression getExp();

	/**
	 * Sets the value of the '{@link featureModel.UnaryOperation#getExp <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp</em>' containment reference.
	 * @see #getExp()
	 * @generated
	 */
	void setExp(Expression value);

} // UnaryOperation
