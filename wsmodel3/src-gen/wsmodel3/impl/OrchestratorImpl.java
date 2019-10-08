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
import wsmodel3.Function;
import wsmodel3.InputOrchestrator;
import wsmodel3.Orchestrator;
import wsmodel3.OutputOrchestrator;
import wsmodel3.REST;
import wsmodel3.Wsmodel3Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Orchestrator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wsmodel3.impl.OrchestratorImpl#getName <em>Name</em>}</li>
 *   <li>{@link wsmodel3.impl.OrchestratorImpl#getInputorchestrator <em>Inputorchestrator</em>}</li>
 *   <li>{@link wsmodel3.impl.OrchestratorImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link wsmodel3.impl.OrchestratorImpl#getOutputorchestrator <em>Outputorchestrator</em>}</li>
 *   <li>{@link wsmodel3.impl.OrchestratorImpl#getPort <em>Port</em>}</li>
 *   <li>{@link wsmodel3.impl.OrchestratorImpl#getExternalapi <em>Externalapi</em>}</li>
 *   <li>{@link wsmodel3.impl.OrchestratorImpl#getRest <em>Rest</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrchestratorImpl extends MinimalEObjectImpl.Container implements Orchestrator {
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
	 * The cached value of the '{@link #getInputorchestrator() <em>Inputorchestrator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputorchestrator()
	 * @generated
	 * @ordered
	 */
	protected EList<InputOrchestrator> inputorchestrator;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> function;

	/**
	 * The cached value of the '{@link #getOutputorchestrator() <em>Outputorchestrator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputorchestrator()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputOrchestrator> outputorchestrator;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected String port = PORT_EDEFAULT;

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
	 * The cached value of the '{@link #getRest() <em>Rest</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRest()
	 * @generated
	 * @ordered
	 */
	protected EList<REST> rest;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrchestratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Wsmodel3Package.Literals.ORCHESTRATOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Wsmodel3Package.ORCHESTRATOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InputOrchestrator> getInputorchestrator() {
		if (inputorchestrator == null) {
			inputorchestrator = new EObjectContainmentEList<InputOrchestrator>(InputOrchestrator.class, this,
					Wsmodel3Package.ORCHESTRATOR__INPUTORCHESTRATOR);
		}
		return inputorchestrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Function> getFunction() {
		if (function == null) {
			function = new EObjectContainmentEList<Function>(Function.class, this,
					Wsmodel3Package.ORCHESTRATOR__FUNCTION);
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OutputOrchestrator> getOutputorchestrator() {
		if (outputorchestrator == null) {
			outputorchestrator = new EObjectContainmentEList<OutputOrchestrator>(OutputOrchestrator.class, this,
					Wsmodel3Package.ORCHESTRATOR__OUTPUTORCHESTRATOR);
		}
		return outputorchestrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPort(String newPort) {
		String oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Wsmodel3Package.ORCHESTRATOR__PORT, oldPort, port));
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
					Wsmodel3Package.ORCHESTRATOR__EXTERNALAPI);
		}
		return externalapi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<REST> getRest() {
		if (rest == null) {
			rest = new EObjectResolvingEList<REST>(REST.class, this, Wsmodel3Package.ORCHESTRATOR__REST);
		}
		return rest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Wsmodel3Package.ORCHESTRATOR__INPUTORCHESTRATOR:
			return ((InternalEList<?>) getInputorchestrator()).basicRemove(otherEnd, msgs);
		case Wsmodel3Package.ORCHESTRATOR__FUNCTION:
			return ((InternalEList<?>) getFunction()).basicRemove(otherEnd, msgs);
		case Wsmodel3Package.ORCHESTRATOR__OUTPUTORCHESTRATOR:
			return ((InternalEList<?>) getOutputorchestrator()).basicRemove(otherEnd, msgs);
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
		case Wsmodel3Package.ORCHESTRATOR__NAME:
			return getName();
		case Wsmodel3Package.ORCHESTRATOR__INPUTORCHESTRATOR:
			return getInputorchestrator();
		case Wsmodel3Package.ORCHESTRATOR__FUNCTION:
			return getFunction();
		case Wsmodel3Package.ORCHESTRATOR__OUTPUTORCHESTRATOR:
			return getOutputorchestrator();
		case Wsmodel3Package.ORCHESTRATOR__PORT:
			return getPort();
		case Wsmodel3Package.ORCHESTRATOR__EXTERNALAPI:
			return getExternalapi();
		case Wsmodel3Package.ORCHESTRATOR__REST:
			return getRest();
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
		case Wsmodel3Package.ORCHESTRATOR__NAME:
			setName((String) newValue);
			return;
		case Wsmodel3Package.ORCHESTRATOR__INPUTORCHESTRATOR:
			getInputorchestrator().clear();
			getInputorchestrator().addAll((Collection<? extends InputOrchestrator>) newValue);
			return;
		case Wsmodel3Package.ORCHESTRATOR__FUNCTION:
			getFunction().clear();
			getFunction().addAll((Collection<? extends Function>) newValue);
			return;
		case Wsmodel3Package.ORCHESTRATOR__OUTPUTORCHESTRATOR:
			getOutputorchestrator().clear();
			getOutputorchestrator().addAll((Collection<? extends OutputOrchestrator>) newValue);
			return;
		case Wsmodel3Package.ORCHESTRATOR__PORT:
			setPort((String) newValue);
			return;
		case Wsmodel3Package.ORCHESTRATOR__EXTERNALAPI:
			getExternalapi().clear();
			getExternalapi().addAll((Collection<? extends ExternalAPI>) newValue);
			return;
		case Wsmodel3Package.ORCHESTRATOR__REST:
			getRest().clear();
			getRest().addAll((Collection<? extends REST>) newValue);
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
		case Wsmodel3Package.ORCHESTRATOR__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Wsmodel3Package.ORCHESTRATOR__INPUTORCHESTRATOR:
			getInputorchestrator().clear();
			return;
		case Wsmodel3Package.ORCHESTRATOR__FUNCTION:
			getFunction().clear();
			return;
		case Wsmodel3Package.ORCHESTRATOR__OUTPUTORCHESTRATOR:
			getOutputorchestrator().clear();
			return;
		case Wsmodel3Package.ORCHESTRATOR__PORT:
			setPort(PORT_EDEFAULT);
			return;
		case Wsmodel3Package.ORCHESTRATOR__EXTERNALAPI:
			getExternalapi().clear();
			return;
		case Wsmodel3Package.ORCHESTRATOR__REST:
			getRest().clear();
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
		case Wsmodel3Package.ORCHESTRATOR__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Wsmodel3Package.ORCHESTRATOR__INPUTORCHESTRATOR:
			return inputorchestrator != null && !inputorchestrator.isEmpty();
		case Wsmodel3Package.ORCHESTRATOR__FUNCTION:
			return function != null && !function.isEmpty();
		case Wsmodel3Package.ORCHESTRATOR__OUTPUTORCHESTRATOR:
			return outputorchestrator != null && !outputorchestrator.isEmpty();
		case Wsmodel3Package.ORCHESTRATOR__PORT:
			return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
		case Wsmodel3Package.ORCHESTRATOR__EXTERNALAPI:
			return externalapi != null && !externalapi.isEmpty();
		case Wsmodel3Package.ORCHESTRATOR__REST:
			return rest != null && !rest.isEmpty();
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
		result.append(", port: ");
		result.append(port);
		result.append(')');
		return result.toString();
	}

} //OrchestratorImpl
