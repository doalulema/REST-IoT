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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import wsmodel3.ExternalAPI;
import wsmodel3.InputBridge;
import wsmodel3.InputOrchestrator;
import wsmodel3.OrchestratorData;
import wsmodel3.OutputOrchestrator;
import wsmodel3.REST;
import wsmodel3.Wsmodel3Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Orchestrator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wsmodel3.impl.OutputOrchestratorImpl#getInputorchestrator <em>Inputorchestrator</em>}</li>
 *   <li>{@link wsmodel3.impl.OutputOrchestratorImpl#getInputbridge <em>Inputbridge</em>}</li>
 *   <li>{@link wsmodel3.impl.OutputOrchestratorImpl#getRenponsedata <em>Renponsedata</em>}</li>
 *   <li>{@link wsmodel3.impl.OutputOrchestratorImpl#getRest <em>Rest</em>}</li>
 *   <li>{@link wsmodel3.impl.OutputOrchestratorImpl#getExternalapi <em>Externalapi</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputOrchestratorImpl extends MinimalEObjectImpl.Container implements OutputOrchestrator {
	/**
	 * The cached value of the '{@link #getInputorchestrator() <em>Inputorchestrator</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputorchestrator()
	 * @generated
	 * @ordered
	 */
	protected EList<InputOrchestrator> inputorchestrator;

	/**
	 * The cached value of the '{@link #getInputbridge() <em>Inputbridge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputbridge()
	 * @generated
	 * @ordered
	 */
	protected InputBridge inputbridge;

	/**
	 * The cached value of the '{@link #getRenponsedata() <em>Renponsedata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenponsedata()
	 * @generated
	 * @ordered
	 */
	protected EList<OrchestratorData> renponsedata;

	/**
	 * The cached value of the '{@link #getRest() <em>Rest</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRest()
	 * @generated
	 * @ordered
	 */
	protected EList<REST> rest;

	/**
	 * The cached value of the '{@link #getExternalapi() <em>Externalapi</em>}' reference list.
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
	protected OutputOrchestratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Wsmodel3Package.Literals.OUTPUT_ORCHESTRATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InputOrchestrator> getInputorchestrator() {
		if (inputorchestrator == null) {
			inputorchestrator = new EObjectResolvingEList<InputOrchestrator>(InputOrchestrator.class, this,
					Wsmodel3Package.OUTPUT_ORCHESTRATOR__INPUTORCHESTRATOR);
		}
		return inputorchestrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputBridge getInputbridge() {
		if (inputbridge != null && inputbridge.eIsProxy()) {
			InternalEObject oldInputbridge = (InternalEObject) inputbridge;
			inputbridge = (InputBridge) eResolveProxy(oldInputbridge);
			if (inputbridge != oldInputbridge) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Wsmodel3Package.OUTPUT_ORCHESTRATOR__INPUTBRIDGE, oldInputbridge, inputbridge));
			}
		}
		return inputbridge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputBridge basicGetInputbridge() {
		return inputbridge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputbridge(InputBridge newInputbridge) {
		InputBridge oldInputbridge = inputbridge;
		inputbridge = newInputbridge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Wsmodel3Package.OUTPUT_ORCHESTRATOR__INPUTBRIDGE,
					oldInputbridge, inputbridge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OrchestratorData> getRenponsedata() {
		if (renponsedata == null) {
			renponsedata = new EObjectContainmentEList<OrchestratorData>(OrchestratorData.class, this,
					Wsmodel3Package.OUTPUT_ORCHESTRATOR__RENPONSEDATA);
		}
		return renponsedata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<REST> getRest() {
		if (rest == null) {
			rest = new EObjectResolvingEList<REST>(REST.class, this, Wsmodel3Package.OUTPUT_ORCHESTRATOR__REST);
		}
		return rest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExternalAPI> getExternalapi() {
		if (externalapi == null) {
			externalapi = new EObjectResolvingEList<ExternalAPI>(ExternalAPI.class, this,
					Wsmodel3Package.OUTPUT_ORCHESTRATOR__EXTERNALAPI);
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
		case Wsmodel3Package.OUTPUT_ORCHESTRATOR__RENPONSEDATA:
			return ((InternalEList<?>) getRenponsedata()).basicRemove(otherEnd, msgs);
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
		case Wsmodel3Package.OUTPUT_ORCHESTRATOR__INPUTORCHESTRATOR:
			return getInputorchestrator();
		case Wsmodel3Package.OUTPUT_ORCHESTRATOR__INPUTBRIDGE:
			if (resolve)
				return getInputbridge();
			return basicGetInputbridge();
		case Wsmodel3Package.OUTPUT_ORCHESTRATOR__RENPONSEDATA:
			return getRenponsedata();
		case Wsmodel3Package.OUTPUT_ORCHESTRATOR__REST:
			return getRest();
		case Wsmodel3Package.OUTPUT_ORCHESTRATOR__EXTERNALAPI:
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
		case Wsmodel3Package.OUTPUT_ORCHESTRATOR__INPUTORCHESTRATOR:
			getInputorchestrator().clear();
			getInputorchestrator().addAll((Collection<? extends InputOrchestrator>) newValue);
			return;
		case Wsmodel3Package.OUTPUT_ORCHESTRATOR__INPUTBRIDGE:
			setInputbridge((InputBridge) newValue);
			return;
		case Wsmodel3Package.OUTPUT_ORCHESTRATOR__RENPONSEDATA:
			getRenponsedata().clear();
			getRenponsedata().addAll((Collection<? extends OrchestratorData>) newValue);
			return;
		case Wsmodel3Package.OUTPUT_ORCHESTRATOR__REST:
			getRest().clear();
			getRest().addAll((Collection<? extends REST>) newValue);
			return;
		case Wsmodel3Package.OUTPUT_ORCHESTRATOR__EXTERNALAPI:
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
		case Wsmodel3Package.OUTPUT_ORCHESTRATOR__INPUTORCHESTRATOR:
			getInputorchestrator().clear();
			return;
		case Wsmodel3Package.OUTPUT_ORCHESTRATOR__INPUTBRIDGE:
			setInputbridge((InputBridge) null);
			return;
		case Wsmodel3Package.OUTPUT_ORCHESTRATOR__RENPONSEDATA:
			getRenponsedata().clear();
			return;
		case Wsmodel3Package.OUTPUT_ORCHESTRATOR__REST:
			getRest().clear();
			return;
		case Wsmodel3Package.OUTPUT_ORCHESTRATOR__EXTERNALAPI:
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
		case Wsmodel3Package.OUTPUT_ORCHESTRATOR__INPUTORCHESTRATOR:
			return inputorchestrator != null && !inputorchestrator.isEmpty();
		case Wsmodel3Package.OUTPUT_ORCHESTRATOR__INPUTBRIDGE:
			return inputbridge != null;
		case Wsmodel3Package.OUTPUT_ORCHESTRATOR__RENPONSEDATA:
			return renponsedata != null && !renponsedata.isEmpty();
		case Wsmodel3Package.OUTPUT_ORCHESTRATOR__REST:
			return rest != null && !rest.isEmpty();
		case Wsmodel3Package.OUTPUT_ORCHESTRATOR__EXTERNALAPI:
			return externalapi != null && !externalapi.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OutputOrchestratorImpl
