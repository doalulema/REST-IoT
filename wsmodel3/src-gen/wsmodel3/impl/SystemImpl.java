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
import wsmodel3.ExternalAPI;
import wsmodel3.IntegrationPattern;
import wsmodel3.IoTNode;
import wsmodel3.MessageBroker;
import wsmodel3.Server;
import wsmodel3.WebService;
import wsmodel3.Wsmodel3Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wsmodel3.impl.SystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link wsmodel3.impl.SystemImpl#getWebservice <em>Webservice</em>}</li>
 *   <li>{@link wsmodel3.impl.SystemImpl#getServer <em>Server</em>}</li>
 *   <li>{@link wsmodel3.impl.SystemImpl#getIotnode <em>Iotnode</em>}</li>
 *   <li>{@link wsmodel3.impl.SystemImpl#getAccespoint <em>Accespoint</em>}</li>
 *   <li>{@link wsmodel3.impl.SystemImpl#getIntegrationpattern <em>Integrationpattern</em>}</li>
 *   <li>{@link wsmodel3.impl.SystemImpl#getMessagebroker <em>Messagebroker</em>}</li>
 *   <li>{@link wsmodel3.impl.SystemImpl#getExternalapi <em>Externalapi</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends MinimalEObjectImpl.Container implements wsmodel3.System {
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
	 * The cached value of the '{@link #getWebservice() <em>Webservice</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebservice()
	 * @generated
	 * @ordered
	 */
	protected EList<WebService> webservice;

	/**
	 * The cached value of the '{@link #getServer() <em>Server</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer()
	 * @generated
	 * @ordered
	 */
	protected EList<Server> server;

	/**
	 * The cached value of the '{@link #getIotnode() <em>Iotnode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIotnode()
	 * @generated
	 * @ordered
	 */
	protected EList<IoTNode> iotnode;

	/**
	 * The cached value of the '{@link #getAccespoint() <em>Accespoint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccespoint()
	 * @generated
	 * @ordered
	 */
	protected EList<AccesPoint> accespoint;

	/**
	 * The cached value of the '{@link #getIntegrationpattern() <em>Integrationpattern</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrationpattern()
	 * @generated
	 * @ordered
	 */
	protected EList<IntegrationPattern> integrationpattern;

	/**
	 * The cached value of the '{@link #getMessagebroker() <em>Messagebroker</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessagebroker()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageBroker> messagebroker;

	/**
	 * The cached value of the '{@link #getExternalapi() <em>Externalapi</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalapi()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalAPI> externalapi;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Wsmodel3Package.Literals.SYSTEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Wsmodel3Package.SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WebService> getWebservice() {
		if (webservice == null) {
			webservice = new EObjectContainmentEList<WebService>(WebService.class, this,
					Wsmodel3Package.SYSTEM__WEBSERVICE);
		}
		return webservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Server> getServer() {
		if (server == null) {
			server = new EObjectContainmentEList<Server>(Server.class, this, Wsmodel3Package.SYSTEM__SERVER);
		}
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IoTNode> getIotnode() {
		if (iotnode == null) {
			iotnode = new EObjectContainmentEList<IoTNode>(IoTNode.class, this, Wsmodel3Package.SYSTEM__IOTNODE);
		}
		return iotnode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AccesPoint> getAccespoint() {
		if (accespoint == null) {
			accespoint = new EObjectContainmentEList<AccesPoint>(AccesPoint.class, this,
					Wsmodel3Package.SYSTEM__ACCESPOINT);
		}
		return accespoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IntegrationPattern> getIntegrationpattern() {
		if (integrationpattern == null) {
			integrationpattern = new EObjectContainmentEList<IntegrationPattern>(IntegrationPattern.class, this,
					Wsmodel3Package.SYSTEM__INTEGRATIONPATTERN);
		}
		return integrationpattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MessageBroker> getMessagebroker() {
		if (messagebroker == null) {
			messagebroker = new EObjectContainmentEList<MessageBroker>(MessageBroker.class, this,
					Wsmodel3Package.SYSTEM__MESSAGEBROKER);
		}
		return messagebroker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExternalAPI> getExternalapi() {
		if (externalapi == null) {
			externalapi = new EObjectContainmentEList<ExternalAPI>(ExternalAPI.class, this,
					Wsmodel3Package.SYSTEM__EXTERNALAPI);
		}
		return externalapi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Wsmodel3Package.SYSTEM__WEBSERVICE:
			return ((InternalEList<?>) getWebservice()).basicRemove(otherEnd, msgs);
		case Wsmodel3Package.SYSTEM__SERVER:
			return ((InternalEList<?>) getServer()).basicRemove(otherEnd, msgs);
		case Wsmodel3Package.SYSTEM__IOTNODE:
			return ((InternalEList<?>) getIotnode()).basicRemove(otherEnd, msgs);
		case Wsmodel3Package.SYSTEM__ACCESPOINT:
			return ((InternalEList<?>) getAccespoint()).basicRemove(otherEnd, msgs);
		case Wsmodel3Package.SYSTEM__INTEGRATIONPATTERN:
			return ((InternalEList<?>) getIntegrationpattern()).basicRemove(otherEnd, msgs);
		case Wsmodel3Package.SYSTEM__MESSAGEBROKER:
			return ((InternalEList<?>) getMessagebroker()).basicRemove(otherEnd, msgs);
		case Wsmodel3Package.SYSTEM__EXTERNALAPI:
			return ((InternalEList<?>) getExternalapi()).basicRemove(otherEnd, msgs);
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
		case Wsmodel3Package.SYSTEM__NAME:
			return getName();
		case Wsmodel3Package.SYSTEM__WEBSERVICE:
			return getWebservice();
		case Wsmodel3Package.SYSTEM__SERVER:
			return getServer();
		case Wsmodel3Package.SYSTEM__IOTNODE:
			return getIotnode();
		case Wsmodel3Package.SYSTEM__ACCESPOINT:
			return getAccespoint();
		case Wsmodel3Package.SYSTEM__INTEGRATIONPATTERN:
			return getIntegrationpattern();
		case Wsmodel3Package.SYSTEM__MESSAGEBROKER:
			return getMessagebroker();
		case Wsmodel3Package.SYSTEM__EXTERNALAPI:
			return getExternalapi();
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
		case Wsmodel3Package.SYSTEM__NAME:
			setName((String) newValue);
			return;
		case Wsmodel3Package.SYSTEM__WEBSERVICE:
			getWebservice().clear();
			getWebservice().addAll((Collection<? extends WebService>) newValue);
			return;
		case Wsmodel3Package.SYSTEM__SERVER:
			getServer().clear();
			getServer().addAll((Collection<? extends Server>) newValue);
			return;
		case Wsmodel3Package.SYSTEM__IOTNODE:
			getIotnode().clear();
			getIotnode().addAll((Collection<? extends IoTNode>) newValue);
			return;
		case Wsmodel3Package.SYSTEM__ACCESPOINT:
			getAccespoint().clear();
			getAccespoint().addAll((Collection<? extends AccesPoint>) newValue);
			return;
		case Wsmodel3Package.SYSTEM__INTEGRATIONPATTERN:
			getIntegrationpattern().clear();
			getIntegrationpattern().addAll((Collection<? extends IntegrationPattern>) newValue);
			return;
		case Wsmodel3Package.SYSTEM__MESSAGEBROKER:
			getMessagebroker().clear();
			getMessagebroker().addAll((Collection<? extends MessageBroker>) newValue);
			return;
		case Wsmodel3Package.SYSTEM__EXTERNALAPI:
			getExternalapi().clear();
			getExternalapi().addAll((Collection<? extends ExternalAPI>) newValue);
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
		case Wsmodel3Package.SYSTEM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Wsmodel3Package.SYSTEM__WEBSERVICE:
			getWebservice().clear();
			return;
		case Wsmodel3Package.SYSTEM__SERVER:
			getServer().clear();
			return;
		case Wsmodel3Package.SYSTEM__IOTNODE:
			getIotnode().clear();
			return;
		case Wsmodel3Package.SYSTEM__ACCESPOINT:
			getAccespoint().clear();
			return;
		case Wsmodel3Package.SYSTEM__INTEGRATIONPATTERN:
			getIntegrationpattern().clear();
			return;
		case Wsmodel3Package.SYSTEM__MESSAGEBROKER:
			getMessagebroker().clear();
			return;
		case Wsmodel3Package.SYSTEM__EXTERNALAPI:
			getExternalapi().clear();
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
		case Wsmodel3Package.SYSTEM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Wsmodel3Package.SYSTEM__WEBSERVICE:
			return webservice != null && !webservice.isEmpty();
		case Wsmodel3Package.SYSTEM__SERVER:
			return server != null && !server.isEmpty();
		case Wsmodel3Package.SYSTEM__IOTNODE:
			return iotnode != null && !iotnode.isEmpty();
		case Wsmodel3Package.SYSTEM__ACCESPOINT:
			return accespoint != null && !accespoint.isEmpty();
		case Wsmodel3Package.SYSTEM__INTEGRATIONPATTERN:
			return integrationpattern != null && !integrationpattern.isEmpty();
		case Wsmodel3Package.SYSTEM__MESSAGEBROKER:
			return messagebroker != null && !messagebroker.isEmpty();
		case Wsmodel3Package.SYSTEM__EXTERNALAPI:
			return externalapi != null && !externalapi.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SystemImpl
