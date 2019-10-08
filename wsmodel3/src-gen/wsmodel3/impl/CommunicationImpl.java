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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import wsmodel3.AccesPoint;
import wsmodel3.Communication;
import wsmodel3.CommunicationData;
import wsmodel3.CommunicationType;
import wsmodel3.MessageBroker;
import wsmodel3.Wsmodel3Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wsmodel3.impl.CommunicationImpl#getType <em>Type</em>}</li>
 *   <li>{@link wsmodel3.impl.CommunicationImpl#getCommunicationdata <em>Communicationdata</em>}</li>
 *   <li>{@link wsmodel3.impl.CommunicationImpl#getAccespoint <em>Accespoint</em>}</li>
 *   <li>{@link wsmodel3.impl.CommunicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link wsmodel3.impl.CommunicationImpl#getMessagebroker <em>Messagebroker</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationImpl extends MinimalEObjectImpl.Container implements Communication {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final CommunicationType TYPE_EDEFAULT = CommunicationType.UNDEFINED;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CommunicationType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCommunicationdata() <em>Communicationdata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationdata()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationData> communicationdata;

	/**
	 * The cached value of the '{@link #getAccespoint() <em>Accespoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccespoint()
	 * @generated
	 * @ordered
	 */
	protected AccesPoint accespoint;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMessagebroker() <em>Messagebroker</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessagebroker()
	 * @generated
	 * @ordered
	 */
	protected MessageBroker messagebroker;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Wsmodel3Package.Literals.COMMUNICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(CommunicationType newType) {
		CommunicationType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Wsmodel3Package.COMMUNICATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommunicationData> getCommunicationdata() {
		if (communicationdata == null) {
			communicationdata = new EObjectContainmentEList<CommunicationData>(CommunicationData.class, this,
					Wsmodel3Package.COMMUNICATION__COMMUNICATIONDATA);
		}
		return communicationdata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccesPoint getAccespoint() {
		if (accespoint != null && accespoint.eIsProxy()) {
			InternalEObject oldAccespoint = (InternalEObject) accespoint;
			accespoint = (AccesPoint) eResolveProxy(oldAccespoint);
			if (accespoint != oldAccespoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Wsmodel3Package.COMMUNICATION__ACCESPOINT,
							oldAccespoint, accespoint));
			}
		}
		return accespoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccesPoint basicGetAccespoint() {
		return accespoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccespoint(AccesPoint newAccespoint) {
		AccesPoint oldAccespoint = accespoint;
		accespoint = newAccespoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Wsmodel3Package.COMMUNICATION__ACCESPOINT,
					oldAccespoint, accespoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Wsmodel3Package.COMMUNICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageBroker getMessagebroker() {
		if (messagebroker != null && messagebroker.eIsProxy()) {
			InternalEObject oldMessagebroker = (InternalEObject) messagebroker;
			messagebroker = (MessageBroker) eResolveProxy(oldMessagebroker);
			if (messagebroker != oldMessagebroker) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Wsmodel3Package.COMMUNICATION__MESSAGEBROKER, oldMessagebroker, messagebroker));
			}
		}
		return messagebroker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageBroker basicGetMessagebroker() {
		return messagebroker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessagebroker(MessageBroker newMessagebroker) {
		MessageBroker oldMessagebroker = messagebroker;
		messagebroker = newMessagebroker;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Wsmodel3Package.COMMUNICATION__MESSAGEBROKER,
					oldMessagebroker, messagebroker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Wsmodel3Package.COMMUNICATION__COMMUNICATIONDATA:
			return ((InternalEList<?>) getCommunicationdata()).basicRemove(otherEnd, msgs);
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
		case Wsmodel3Package.COMMUNICATION__TYPE:
			return getType();
		case Wsmodel3Package.COMMUNICATION__COMMUNICATIONDATA:
			return getCommunicationdata();
		case Wsmodel3Package.COMMUNICATION__ACCESPOINT:
			if (resolve)
				return getAccespoint();
			return basicGetAccespoint();
		case Wsmodel3Package.COMMUNICATION__NAME:
			return getName();
		case Wsmodel3Package.COMMUNICATION__MESSAGEBROKER:
			if (resolve)
				return getMessagebroker();
			return basicGetMessagebroker();
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
		case Wsmodel3Package.COMMUNICATION__TYPE:
			setType((CommunicationType) newValue);
			return;
		case Wsmodel3Package.COMMUNICATION__COMMUNICATIONDATA:
			getCommunicationdata().clear();
			getCommunicationdata().addAll((Collection<? extends CommunicationData>) newValue);
			return;
		case Wsmodel3Package.COMMUNICATION__ACCESPOINT:
			setAccespoint((AccesPoint) newValue);
			return;
		case Wsmodel3Package.COMMUNICATION__NAME:
			setName((String) newValue);
			return;
		case Wsmodel3Package.COMMUNICATION__MESSAGEBROKER:
			setMessagebroker((MessageBroker) newValue);
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
		case Wsmodel3Package.COMMUNICATION__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case Wsmodel3Package.COMMUNICATION__COMMUNICATIONDATA:
			getCommunicationdata().clear();
			return;
		case Wsmodel3Package.COMMUNICATION__ACCESPOINT:
			setAccespoint((AccesPoint) null);
			return;
		case Wsmodel3Package.COMMUNICATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Wsmodel3Package.COMMUNICATION__MESSAGEBROKER:
			setMessagebroker((MessageBroker) null);
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
		case Wsmodel3Package.COMMUNICATION__TYPE:
			return type != TYPE_EDEFAULT;
		case Wsmodel3Package.COMMUNICATION__COMMUNICATIONDATA:
			return communicationdata != null && !communicationdata.isEmpty();
		case Wsmodel3Package.COMMUNICATION__ACCESPOINT:
			return accespoint != null;
		case Wsmodel3Package.COMMUNICATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Wsmodel3Package.COMMUNICATION__MESSAGEBROKER:
			return messagebroker != null;
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
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CommunicationImpl
