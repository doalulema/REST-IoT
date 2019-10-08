/**
 */
package wsmodel3.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import wsmodel3.Communication;
import wsmodel3.Controller;
import wsmodel3.ControllerType;
import wsmodel3.Port;
import wsmodel3.Wsmodel3Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wsmodel3.impl.ControllerImpl#getType <em>Type</em>}</li>
 *   <li>{@link wsmodel3.impl.ControllerImpl#getPort <em>Port</em>}</li>
 *   <li>{@link wsmodel3.impl.ControllerImpl#getCommunication <em>Communication</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControllerImpl extends DeviceImpl implements Controller {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ControllerType TYPE_EDEFAULT = ControllerType.UNDEFINED;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ControllerType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> port;

	/**
	 * The cached value of the '{@link #getCommunication() <em>Communication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunication()
	 * @generated
	 * @ordered
	 */
	protected EList<Communication> communication;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Wsmodel3Package.Literals.CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControllerType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ControllerType newType) {
		ControllerType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Wsmodel3Package.CONTROLLER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Port> getPort() {
		if (port == null) {
			port = new EObjectContainmentEList<Port>(Port.class, this, Wsmodel3Package.CONTROLLER__PORT);
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Communication> getCommunication() {
		if (communication == null) {
			communication = new EObjectContainmentEList<Communication>(Communication.class, this,
					Wsmodel3Package.CONTROLLER__COMMUNICATION);
		}
		return communication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Wsmodel3Package.CONTROLLER__PORT:
			return ((InternalEList<?>) getPort()).basicRemove(otherEnd, msgs);
		case Wsmodel3Package.CONTROLLER__COMMUNICATION:
			return ((InternalEList<?>) getCommunication()).basicRemove(otherEnd, msgs);
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
		case Wsmodel3Package.CONTROLLER__TYPE:
			return getType();
		case Wsmodel3Package.CONTROLLER__PORT:
			return getPort();
		case Wsmodel3Package.CONTROLLER__COMMUNICATION:
			return getCommunication();
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
		case Wsmodel3Package.CONTROLLER__TYPE:
			setType((ControllerType) newValue);
			return;
		case Wsmodel3Package.CONTROLLER__PORT:
			getPort().clear();
			getPort().addAll((Collection<? extends Port>) newValue);
			return;
		case Wsmodel3Package.CONTROLLER__COMMUNICATION:
			getCommunication().clear();
			getCommunication().addAll((Collection<? extends Communication>) newValue);
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
		case Wsmodel3Package.CONTROLLER__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case Wsmodel3Package.CONTROLLER__PORT:
			getPort().clear();
			return;
		case Wsmodel3Package.CONTROLLER__COMMUNICATION:
			getCommunication().clear();
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
		case Wsmodel3Package.CONTROLLER__TYPE:
			return type != TYPE_EDEFAULT;
		case Wsmodel3Package.CONTROLLER__PORT:
			return port != null && !port.isEmpty();
		case Wsmodel3Package.CONTROLLER__COMMUNICATION:
			return communication != null && !communication.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ControllerImpl
