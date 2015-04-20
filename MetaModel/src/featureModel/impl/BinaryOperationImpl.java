/**
 */
package featureModel.impl;

import featureModel.BinaryOperation;
import featureModel.BinaryOperator;
import featureModel.Expression;
import featureModel.FeatureModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link featureModel.impl.BinaryOperationImpl#getRexp <em>Rexp</em>}</li>
 *   <li>{@link featureModel.impl.BinaryOperationImpl#getLexp <em>Lexp</em>}</li>
 *   <li>{@link featureModel.impl.BinaryOperationImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BinaryOperationImpl extends ExpressionImpl implements BinaryOperation {
	/**
	 * The cached value of the '{@link #getRexp() <em>Rexp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRexp()
	 * @generated
	 * @ordered
	 */
	protected Expression rexp;

	/**
	 * The cached value of the '{@link #getLexp() <em>Lexp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLexp()
	 * @generated
	 * @ordered
	 */
	protected Expression lexp;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final BinaryOperator OPERATOR_EDEFAULT = BinaryOperator.EQUALS;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected BinaryOperator operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeatureModelPackage.Literals.BINARY_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getRexp() {
		return rexp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRexp(Expression newRexp, NotificationChain msgs) {
		Expression oldRexp = rexp;
		rexp = newRexp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeatureModelPackage.BINARY_OPERATION__REXP, oldRexp, newRexp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRexp(Expression newRexp) {
		if (newRexp != rexp) {
			NotificationChain msgs = null;
			if (rexp != null)
				msgs = ((InternalEObject)rexp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeatureModelPackage.BINARY_OPERATION__REXP, null, msgs);
			if (newRexp != null)
				msgs = ((InternalEObject)newRexp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeatureModelPackage.BINARY_OPERATION__REXP, null, msgs);
			msgs = basicSetRexp(newRexp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureModelPackage.BINARY_OPERATION__REXP, newRexp, newRexp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLexp() {
		return lexp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLexp(Expression newLexp, NotificationChain msgs) {
		Expression oldLexp = lexp;
		lexp = newLexp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeatureModelPackage.BINARY_OPERATION__LEXP, oldLexp, newLexp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLexp(Expression newLexp) {
		if (newLexp != lexp) {
			NotificationChain msgs = null;
			if (lexp != null)
				msgs = ((InternalEObject)lexp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeatureModelPackage.BINARY_OPERATION__LEXP, null, msgs);
			if (newLexp != null)
				msgs = ((InternalEObject)newLexp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeatureModelPackage.BINARY_OPERATION__LEXP, null, msgs);
			msgs = basicSetLexp(newLexp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureModelPackage.BINARY_OPERATION__LEXP, newLexp, newLexp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(BinaryOperator newOperator) {
		BinaryOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureModelPackage.BINARY_OPERATION__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeatureModelPackage.BINARY_OPERATION__REXP:
				return basicSetRexp(null, msgs);
			case FeatureModelPackage.BINARY_OPERATION__LEXP:
				return basicSetLexp(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FeatureModelPackage.BINARY_OPERATION__REXP:
				return getRexp();
			case FeatureModelPackage.BINARY_OPERATION__LEXP:
				return getLexp();
			case FeatureModelPackage.BINARY_OPERATION__OPERATOR:
				return getOperator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FeatureModelPackage.BINARY_OPERATION__REXP:
				setRexp((Expression)newValue);
				return;
			case FeatureModelPackage.BINARY_OPERATION__LEXP:
				setLexp((Expression)newValue);
				return;
			case FeatureModelPackage.BINARY_OPERATION__OPERATOR:
				setOperator((BinaryOperator)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FeatureModelPackage.BINARY_OPERATION__REXP:
				setRexp((Expression)null);
				return;
			case FeatureModelPackage.BINARY_OPERATION__LEXP:
				setLexp((Expression)null);
				return;
			case FeatureModelPackage.BINARY_OPERATION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FeatureModelPackage.BINARY_OPERATION__REXP:
				return rexp != null;
			case FeatureModelPackage.BINARY_OPERATION__LEXP:
				return lexp != null;
			case FeatureModelPackage.BINARY_OPERATION__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //BinaryOperationImpl
