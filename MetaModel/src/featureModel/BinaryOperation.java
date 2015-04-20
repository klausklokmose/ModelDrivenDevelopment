/**
 */
package featureModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link featureModel.BinaryOperation#getRexp <em>Rexp</em>}</li>
 *   <li>{@link featureModel.BinaryOperation#getLexp <em>Lexp</em>}</li>
 *   <li>{@link featureModel.BinaryOperation#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see featureModel.FeatureModelPackage#getBinaryOperation()
 * @model
 * @generated
 */
public interface BinaryOperation extends Expression {
	/**
	 * Returns the value of the '<em><b>Rexp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rexp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rexp</em>' containment reference.
	 * @see #setRexp(Expression)
	 * @see featureModel.FeatureModelPackage#getBinaryOperation_Rexp()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRexp();

	/**
	 * Sets the value of the '{@link featureModel.BinaryOperation#getRexp <em>Rexp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rexp</em>' containment reference.
	 * @see #getRexp()
	 * @generated
	 */
	void setRexp(Expression value);

	/**
	 * Returns the value of the '<em><b>Lexp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lexp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lexp</em>' containment reference.
	 * @see #setLexp(Expression)
	 * @see featureModel.FeatureModelPackage#getBinaryOperation_Lexp()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getLexp();

	/**
	 * Sets the value of the '{@link featureModel.BinaryOperation#getLexp <em>Lexp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lexp</em>' containment reference.
	 * @see #getLexp()
	 * @generated
	 */
	void setLexp(Expression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link featureModel.BinaryOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see featureModel.BinaryOperator
	 * @see #setOperator(BinaryOperator)
	 * @see featureModel.FeatureModelPackage#getBinaryOperation_Operator()
	 * @model required="true"
	 * @generated
	 */
	BinaryOperator getOperator();

	/**
	 * Sets the value of the '{@link featureModel.BinaryOperation#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see featureModel.BinaryOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BinaryOperator value);

} // BinaryOperation
