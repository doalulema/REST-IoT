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

import wsmodel3.DBServer;
import wsmodel3.REST;
import wsmodel3.WebServer;
import wsmodel3.WebService;
import wsmodel3.Wsmodel3Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wsmodel3.impl.WebServiceImpl#getRest <em>Rest</em>}</li>
 *   <li>{@link wsmodel3.impl.WebServiceImpl#getWebserver <em>Webserver</em>}</li>
 *   <li>{@link wsmodel3.impl.WebServiceImpl#getDbserver <em>Dbserver</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebServiceImpl extends MinimalEObjectImpl.Container implements WebService {
	/**
	 * The cached value of the '{@link #getRest() <em>Rest</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRest()
	 * @generated
	 * @ordered
	 */
	protected EList<REST> rest;

	/**
	 * The cached value of the '{@link #getWebserver() <em>Webserver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebserver()
	 * @generated
	 * @ordered
	 */
	protected WebServer webserver;

	/**
	 * The cached value of the '{@link #getDbserver() <em>Dbserver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbserver()
	 * @generated
	 * @ordered
	 */
	protected DBServer dbserver;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Wsmodel3Package.Literals.WEB_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<REST> getRest() {
		if (rest == null) {
			rest = new EObjectContainmentEList<REST>(REST.class, this, Wsmodel3Package.WEB_SERVICE__REST);
		}
		return rest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebServer getWebserver() {
		if (webserver != null && webserver.eIsProxy()) {
			InternalEObject oldWebserver = (InternalEObject) webserver;
			webserver = (WebServer) eResolveProxy(oldWebserver);
			if (webserver != oldWebserver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Wsmodel3Package.WEB_SERVICE__WEBSERVER,
							oldWebserver, webserver));
			}
		}
		return webserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebServer basicGetWebserver() {
		return webserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebserver(WebServer newWebserver) {
		WebServer oldWebserver = webserver;
		webserver = newWebserver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Wsmodel3Package.WEB_SERVICE__WEBSERVER, oldWebserver,
					webserver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DBServer getDbserver() {
		if (dbserver != null && dbserver.eIsProxy()) {
			InternalEObject oldDbserver = (InternalEObject) dbserver;
			dbserver = (DBServer) eResolveProxy(oldDbserver);
			if (dbserver != oldDbserver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Wsmodel3Package.WEB_SERVICE__DBSERVER,
							oldDbserver, dbserver));
			}
		}
		return dbserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBServer basicGetDbserver() {
		return dbserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDbserver(DBServer newDbserver) {
		DBServer oldDbserver = dbserver;
		dbserver = newDbserver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Wsmodel3Package.WEB_SERVICE__DBSERVER, oldDbserver,
					dbserver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Wsmodel3Package.WEB_SERVICE__REST:
			return ((InternalEList<?>) getRest()).basicRemove(otherEnd, msgs);
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
		case Wsmodel3Package.WEB_SERVICE__REST:
			return getRest();
		case Wsmodel3Package.WEB_SERVICE__WEBSERVER:
			if (resolve)
				return getWebserver();
			return basicGetWebserver();
		case Wsmodel3Package.WEB_SERVICE__DBSERVER:
			if (resolve)
				return getDbserver();
			return basicGetDbserver();
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
		case Wsmodel3Package.WEB_SERVICE__REST:
			getRest().clear();
			getRest().addAll((Collection<? extends REST>) newValue);
			return;
		case Wsmodel3Package.WEB_SERVICE__WEBSERVER:
			setWebserver((WebServer) newValue);
			return;
		case Wsmodel3Package.WEB_SERVICE__DBSERVER:
			setDbserver((DBServer) newValue);
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
		case Wsmodel3Package.WEB_SERVICE__REST:
			getRest().clear();
			return;
		case Wsmodel3Package.WEB_SERVICE__WEBSERVER:
			setWebserver((WebServer) null);
			return;
		case Wsmodel3Package.WEB_SERVICE__DBSERVER:
			setDbserver((DBServer) null);
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
		case Wsmodel3Package.WEB_SERVICE__REST:
			return rest != null && !rest.isEmpty();
		case Wsmodel3Package.WEB_SERVICE__WEBSERVER:
			return webserver != null;
		case Wsmodel3Package.WEB_SERVICE__DBSERVER:
			return dbserver != null;
		}
		return super.eIsSet(featureID);
	}

} //WebServiceImpl
