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

import wsmodel3.Bridge;
import wsmodel3.MessageBroker;
import wsmodel3.MessageBrokerType;
import wsmodel3.Wsmodel3Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Broker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wsmodel3.impl.MessageBrokerImpl#getType <em>Type</em>}</li>
 *   <li>{@link wsmodel3.impl.MessageBrokerImpl#getPort <em>Port</em>}</li>
 *   <li>{@link wsmodel3.impl.MessageBrokerImpl#getHost <em>Host</em>}</li>
 *   <li>{@link wsmodel3.impl.MessageBrokerImpl#getBridge <em>Bridge</em>}</li>
 *   <li>{@link wsmodel3.impl.MessageBrokerImpl#getUsser <em>Usser</em>}</li>
 *   <li>{@link wsmodel3.impl.MessageBrokerImpl#getPass <em>Pass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageBrokerImpl extends MinimalEObjectImpl.Container implements MessageBroker {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final MessageBrokerType TYPE_EDEFAULT = MessageBrokerType.UNDEFINED;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected MessageBrokerType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected String host = HOST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBridge() <em>Bridge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBridge()
	 * @generated
	 * @ordered
	 */
	protected EList<Bridge> bridge;

	/**
	 * The default value of the '{@link #getUsser() <em>Usser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsser()
	 * @generated
	 * @ordered
	 */
	protected static final String USSER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsser() <em>Usser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsser()
	 * @generated
	 * @ordered
	 */
	protected String usser = USSER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPass() <em>Pass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPass()
	 * @generated
	 * @ordered
	 */
	protected static final String PASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPass() <em>Pass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPass()
	 * @generated
	 * @ordered
	 */
	protected String pass = PASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageBrokerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Wsmodel3Package.Literals.MESSAGE_BROKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageBrokerType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(MessageBrokerType newType) {
		MessageBrokerType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Wsmodel3Package.MESSAGE_BROKER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Wsmodel3Package.MESSAGE_BROKER__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHost(String newHost) {
		String oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Wsmodel3Package.MESSAGE_BROKER__HOST, oldHost, host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bridge> getBridge() {
		if (bridge == null) {
			bridge = new EObjectContainmentEList<Bridge>(Bridge.class, this, Wsmodel3Package.MESSAGE_BROKER__BRIDGE);
		}
		return bridge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUsser() {
		return usser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsser(String newUsser) {
		String oldUsser = usser;
		usser = newUsser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Wsmodel3Package.MESSAGE_BROKER__USSER, oldUsser,
					usser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPass() {
		return pass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPass(String newPass) {
		String oldPass = pass;
		pass = newPass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Wsmodel3Package.MESSAGE_BROKER__PASS, oldPass, pass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Wsmodel3Package.MESSAGE_BROKER__BRIDGE:
			return ((InternalEList<?>) getBridge()).basicRemove(otherEnd, msgs);
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
		case Wsmodel3Package.MESSAGE_BROKER__TYPE:
			return getType();
		case Wsmodel3Package.MESSAGE_BROKER__PORT:
			return getPort();
		case Wsmodel3Package.MESSAGE_BROKER__HOST:
			return getHost();
		case Wsmodel3Package.MESSAGE_BROKER__BRIDGE:
			return getBridge();
		case Wsmodel3Package.MESSAGE_BROKER__USSER:
			return getUsser();
		case Wsmodel3Package.MESSAGE_BROKER__PASS:
			return getPass();
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
		case Wsmodel3Package.MESSAGE_BROKER__TYPE:
			setType((MessageBrokerType) newValue);
			return;
		case Wsmodel3Package.MESSAGE_BROKER__PORT:
			setPort((Integer) newValue);
			return;
		case Wsmodel3Package.MESSAGE_BROKER__HOST:
			setHost((String) newValue);
			return;
		case Wsmodel3Package.MESSAGE_BROKER__BRIDGE:
			getBridge().clear();
			getBridge().addAll((Collection<? extends Bridge>) newValue);
			return;
		case Wsmodel3Package.MESSAGE_BROKER__USSER:
			setUsser((String) newValue);
			return;
		case Wsmodel3Package.MESSAGE_BROKER__PASS:
			setPass((String) newValue);
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
		case Wsmodel3Package.MESSAGE_BROKER__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case Wsmodel3Package.MESSAGE_BROKER__PORT:
			setPort(PORT_EDEFAULT);
			return;
		case Wsmodel3Package.MESSAGE_BROKER__HOST:
			setHost(HOST_EDEFAULT);
			return;
		case Wsmodel3Package.MESSAGE_BROKER__BRIDGE:
			getBridge().clear();
			return;
		case Wsmodel3Package.MESSAGE_BROKER__USSER:
			setUsser(USSER_EDEFAULT);
			return;
		case Wsmodel3Package.MESSAGE_BROKER__PASS:
			setPass(PASS_EDEFAULT);
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
		case Wsmodel3Package.MESSAGE_BROKER__TYPE:
			return type != TYPE_EDEFAULT;
		case Wsmodel3Package.MESSAGE_BROKER__PORT:
			return port != PORT_EDEFAULT;
		case Wsmodel3Package.MESSAGE_BROKER__HOST:
			return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
		case Wsmodel3Package.MESSAGE_BROKER__BRIDGE:
			return bridge != null && !bridge.isEmpty();
		case Wsmodel3Package.MESSAGE_BROKER__USSER:
			return USSER_EDEFAULT == null ? usser != null : !USSER_EDEFAULT.equals(usser);
		case Wsmodel3Package.MESSAGE_BROKER__PASS:
			return PASS_EDEFAULT == null ? pass != null : !PASS_EDEFAULT.equals(pass);
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
		result.append(", port: ");
		result.append(port);
		result.append(", host: ");
		result.append(host);
		result.append(", usser: ");
		result.append(usser);
		result.append(", pass: ");
		result.append(pass);
		result.append(')');
		return result.toString();
	}

} //MessageBrokerImpl
