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

import wsmodel3.IntegrationPattern;
import wsmodel3.Orchestrator;
import wsmodel3.WebServer;
import wsmodel3.Wsmodel3Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integration Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wsmodel3.impl.IntegrationPatternImpl#getOrchestrator <em>Orchestrator</em>}</li>
 *   <li>{@link wsmodel3.impl.IntegrationPatternImpl#getWebserver <em>Webserver</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegrationPatternImpl extends MinimalEObjectImpl.Container implements IntegrationPattern {
	/**
	 * The cached value of the '{@link #getOrchestrator() <em>Orchestrator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrchestrator()
	 * @generated
	 * @ordered
	 */
	protected EList<Orchestrator> orchestrator;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegrationPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Wsmodel3Package.Literals.INTEGRATION_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Orchestrator> getOrchestrator() {
		if (orchestrator == null) {
			orchestrator = new EObjectContainmentEList<Orchestrator>(Orchestrator.class, this,
					Wsmodel3Package.INTEGRATION_PATTERN__ORCHESTRATOR);
		}
		return orchestrator;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Wsmodel3Package.INTEGRATION_PATTERN__WEBSERVER, oldWebserver, webserver));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Wsmodel3Package.INTEGRATION_PATTERN__WEBSERVER,
					oldWebserver, webserver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Wsmodel3Package.INTEGRATION_PATTERN__ORCHESTRATOR:
			return ((InternalEList<?>) getOrchestrator()).basicRemove(otherEnd, msgs);
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
		case Wsmodel3Package.INTEGRATION_PATTERN__ORCHESTRATOR:
			return getOrchestrator();
		case Wsmodel3Package.INTEGRATION_PATTERN__WEBSERVER:
			if (resolve)
				return getWebserver();
			return basicGetWebserver();
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
		case Wsmodel3Package.INTEGRATION_PATTERN__ORCHESTRATOR:
			getOrchestrator().clear();
			getOrchestrator().addAll((Collection<? extends Orchestrator>) newValue);
			return;
		case Wsmodel3Package.INTEGRATION_PATTERN__WEBSERVER:
			setWebserver((WebServer) newValue);
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
		case Wsmodel3Package.INTEGRATION_PATTERN__ORCHESTRATOR:
			getOrchestrator().clear();
			return;
		case Wsmodel3Package.INTEGRATION_PATTERN__WEBSERVER:
			setWebserver((WebServer) null);
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
		case Wsmodel3Package.INTEGRATION_PATTERN__ORCHESTRATOR:
			return orchestrator != null && !orchestrator.isEmpty();
		case Wsmodel3Package.INTEGRATION_PATTERN__WEBSERVER:
			return webserver != null;
		}
		return super.eIsSet(featureID);
	}

} //IntegrationPatternImpl
