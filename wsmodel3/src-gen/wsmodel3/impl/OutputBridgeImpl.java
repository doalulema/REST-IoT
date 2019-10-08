/**
 */
package wsmodel3.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import wsmodel3.InputOrchestrator;
import wsmodel3.OutputBridge;
import wsmodel3.Sensor;
import wsmodel3.Wsmodel3Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Bridge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wsmodel3.impl.OutputBridgeImpl#getInputorchestrator <em>Inputorchestrator</em>}</li>
 *   <li>{@link wsmodel3.impl.OutputBridgeImpl#getSensor <em>Sensor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputBridgeImpl extends BridgeImpl implements OutputBridge {
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
	 * The cached value of the '{@link #getSensor() <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensor()
	 * @generated
	 * @ordered
	 */
	protected Sensor sensor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputBridgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Wsmodel3Package.Literals.OUTPUT_BRIDGE;
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
					Wsmodel3Package.OUTPUT_BRIDGE__INPUTORCHESTRATOR);
		}
		return inputorchestrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sensor getSensor() {
		if (sensor != null && sensor.eIsProxy()) {
			InternalEObject oldSensor = (InternalEObject) sensor;
			sensor = (Sensor) eResolveProxy(oldSensor);
			if (sensor != oldSensor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Wsmodel3Package.OUTPUT_BRIDGE__SENSOR,
							oldSensor, sensor));
			}
		}
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor basicGetSensor() {
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSensor(Sensor newSensor) {
		Sensor oldSensor = sensor;
		sensor = newSensor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Wsmodel3Package.OUTPUT_BRIDGE__SENSOR, oldSensor,
					sensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Wsmodel3Package.OUTPUT_BRIDGE__INPUTORCHESTRATOR:
			return getInputorchestrator();
		case Wsmodel3Package.OUTPUT_BRIDGE__SENSOR:
			if (resolve)
				return getSensor();
			return basicGetSensor();
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
		case Wsmodel3Package.OUTPUT_BRIDGE__INPUTORCHESTRATOR:
			getInputorchestrator().clear();
			getInputorchestrator().addAll((Collection<? extends InputOrchestrator>) newValue);
			return;
		case Wsmodel3Package.OUTPUT_BRIDGE__SENSOR:
			setSensor((Sensor) newValue);
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
		case Wsmodel3Package.OUTPUT_BRIDGE__INPUTORCHESTRATOR:
			getInputorchestrator().clear();
			return;
		case Wsmodel3Package.OUTPUT_BRIDGE__SENSOR:
			setSensor((Sensor) null);
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
		case Wsmodel3Package.OUTPUT_BRIDGE__INPUTORCHESTRATOR:
			return inputorchestrator != null && !inputorchestrator.isEmpty();
		case Wsmodel3Package.OUTPUT_BRIDGE__SENSOR:
			return sensor != null;
		}
		return super.eIsSet(featureID);
	}

} //OutputBridgeImpl
