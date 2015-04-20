/**
 */
package featureModel.impl;

import featureModel.FeatureModelPackage;
import featureModel.Group;
import featureModel.GroupedFeature;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link featureModel.impl.GroupImpl#getGroupedFeatures <em>Grouped Features</em>}</li>
 *   <li>{@link featureModel.impl.GroupImpl#isInclusive <em>Inclusive</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupImpl extends MinimalEObjectImpl.Container implements Group {
	/**
	 * The cached value of the '{@link #getGroupedFeatures() <em>Grouped Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupedFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<GroupedFeature> groupedFeatures;

	/**
	 * The default value of the '{@link #isInclusive() <em>Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInclusive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUSIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInclusive() <em>Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInclusive()
	 * @generated
	 * @ordered
	 */
	protected boolean inclusive = INCLUSIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeatureModelPackage.Literals.GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GroupedFeature> getGroupedFeatures() {
		if (groupedFeatures == null) {
			groupedFeatures = new EObjectContainmentEList<GroupedFeature>(GroupedFeature.class, this, FeatureModelPackage.GROUP__GROUPED_FEATURES);
		}
		return groupedFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInclusive() {
		return inclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInclusive(boolean newInclusive) {
		boolean oldInclusive = inclusive;
		inclusive = newInclusive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureModelPackage.GROUP__INCLUSIVE, oldInclusive, inclusive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeatureModelPackage.GROUP__GROUPED_FEATURES:
				return ((InternalEList<?>)getGroupedFeatures()).basicRemove(otherEnd, msgs);
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
			case FeatureModelPackage.GROUP__GROUPED_FEATURES:
				return getGroupedFeatures();
			case FeatureModelPackage.GROUP__INCLUSIVE:
				return isInclusive();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FeatureModelPackage.GROUP__GROUPED_FEATURES:
				getGroupedFeatures().clear();
				getGroupedFeatures().addAll((Collection<? extends GroupedFeature>)newValue);
				return;
			case FeatureModelPackage.GROUP__INCLUSIVE:
				setInclusive((Boolean)newValue);
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
			case FeatureModelPackage.GROUP__GROUPED_FEATURES:
				getGroupedFeatures().clear();
				return;
			case FeatureModelPackage.GROUP__INCLUSIVE:
				setInclusive(INCLUSIVE_EDEFAULT);
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
			case FeatureModelPackage.GROUP__GROUPED_FEATURES:
				return groupedFeatures != null && !groupedFeatures.isEmpty();
			case FeatureModelPackage.GROUP__INCLUSIVE:
				return inclusive != INCLUSIVE_EDEFAULT;
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
		result.append(" (inclusive: ");
		result.append(inclusive);
		result.append(')');
		return result.toString();
	}

} //GroupImpl
