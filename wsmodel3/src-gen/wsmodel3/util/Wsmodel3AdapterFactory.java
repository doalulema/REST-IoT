/**
 */
package wsmodel3.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import wsmodel3.AccesPoint;
import wsmodel3.Actuator;
import wsmodel3.Break;
import wsmodel3.Bridge;
import wsmodel3.Communication;
import wsmodel3.CommunicationData;
import wsmodel3.Controller;
import wsmodel3.DBServer;
import wsmodel3.Data;
import wsmodel3.Device;
import wsmodel3.DeviceData;
import wsmodel3.ExternalAPI;
import wsmodel3.Function;
import wsmodel3.InputBridge;
import wsmodel3.InputOrchestrator;
import wsmodel3.InputPort;
import wsmodel3.IntegrationPattern;
import wsmodel3.IoTNode;
import wsmodel3.MessageBroker;
import wsmodel3.Orchestrator;
import wsmodel3.OrchestratorData;
import wsmodel3.OutputBridge;
import wsmodel3.OutputOrchestrator;
import wsmodel3.OutputPort;
import wsmodel3.Port;
import wsmodel3.REST;
import wsmodel3.Sensor;
import wsmodel3.Server;
import wsmodel3.WebServer;
import wsmodel3.WebService;
import wsmodel3.Wsmodel3Package;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see wsmodel3.Wsmodel3Package
 * @generated
 */
public class Wsmodel3AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Wsmodel3Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wsmodel3AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Wsmodel3Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Wsmodel3Switch<Adapter> modelSwitch = new Wsmodel3Switch<Adapter>() {
		@Override
		public Adapter caseSystem(wsmodel3.System object) {
			return createSystemAdapter();
		}

		@Override
		public Adapter caseIoTNode(IoTNode object) {
			return createIoTNodeAdapter();
		}

		@Override
		public Adapter caseServer(Server object) {
			return createServerAdapter();
		}

		@Override
		public Adapter caseWebService(WebService object) {
			return createWebServiceAdapter();
		}

		@Override
		public Adapter caseREST(REST object) {
			return createRESTAdapter();
		}

		@Override
		public Adapter caseWebServer(WebServer object) {
			return createWebServerAdapter();
		}

		@Override
		public Adapter caseDBServer(DBServer object) {
			return createDBServerAdapter();
		}

		@Override
		public Adapter caseDevice(Device object) {
			return createDeviceAdapter();
		}

		@Override
		public Adapter caseSensor(Sensor object) {
			return createSensorAdapter();
		}

		@Override
		public Adapter caseActuator(Actuator object) {
			return createActuatorAdapter();
		}

		@Override
		public Adapter caseController(Controller object) {
			return createControllerAdapter();
		}

		@Override
		public Adapter caseCommunication(Communication object) {
			return createCommunicationAdapter();
		}

		@Override
		public Adapter casePort(Port object) {
			return createPortAdapter();
		}

		@Override
		public Adapter caseInputPort(InputPort object) {
			return createInputPortAdapter();
		}

		@Override
		public Adapter caseOutputPort(OutputPort object) {
			return createOutputPortAdapter();
		}

		@Override
		public Adapter caseDeviceData(DeviceData object) {
			return createDeviceDataAdapter();
		}

		@Override
		public Adapter caseCommunicationData(CommunicationData object) {
			return createCommunicationDataAdapter();
		}

		@Override
		public Adapter caseData(Data object) {
			return createDataAdapter();
		}

		@Override
		public Adapter caseAccesPoint(AccesPoint object) {
			return createAccesPointAdapter();
		}

		@Override
		public Adapter caseBridge(Bridge object) {
			return createBridgeAdapter();
		}

		@Override
		public Adapter caseInputBridge(InputBridge object) {
			return createInputBridgeAdapter();
		}

		@Override
		public Adapter caseOutputBridge(OutputBridge object) {
			return createOutputBridgeAdapter();
		}

		@Override
		public Adapter caseMessageBroker(MessageBroker object) {
			return createMessageBrokerAdapter();
		}

		@Override
		public Adapter caseIntegrationPattern(IntegrationPattern object) {
			return createIntegrationPatternAdapter();
		}

		@Override
		public Adapter caseOrchestrator(Orchestrator object) {
			return createOrchestratorAdapter();
		}

		@Override
		public Adapter caseInputOrchestrator(InputOrchestrator object) {
			return createInputOrchestratorAdapter();
		}

		@Override
		public Adapter caseFunction(Function object) {
			return createFunctionAdapter();
		}

		@Override
		public Adapter caseOutputOrchestrator(OutputOrchestrator object) {
			return createOutputOrchestratorAdapter();
		}

		@Override
		public Adapter caseOrchestratorData(OrchestratorData object) {
			return createOrchestratorDataAdapter();
		}

		@Override
		public Adapter caseExternalAPI(ExternalAPI object) {
			return createExternalAPIAdapter();
		}

		@Override
		public Adapter caseBreak(Break object) {
			return createBreakAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link wsmodel3.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wsmodel3.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wsmodel3.IoTNode <em>Io TNode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wsmodel3.IoTNode
	 * @generated
	 */
	public Adapter createIoTNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wsmodel3.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wsmodel3.Server
	 * @generated
	 */
	public Adapter createServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wsmodel3.WebService <em>Web Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wsmodel3.WebService
	 * @generated
	 */
	public Adapter createWebServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wsmodel3.REST <em>REST</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wsmodel3.REST
	 * @generated
	 */
	public Adapter createRESTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wsmodel3.WebServer <em>Web Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wsmodel3.WebServer
	 * @generated
	 */
	public Adapter createWebServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wsmodel3.DBServer <em>DB Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wsmodel3.DBServer
	 * @generated
	 */
	public Adapter createDBServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wsmodel3.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wsmodel3.Device
	 * @generated
	 */
	public Adapter createDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wsmodel3.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wsmodel3.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wsmodel3.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wsmodel3.Actuator
	 * @generated
	 */
	public Adapter createActuatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wsmodel3.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wsmodel3.Controller
	 * @generated
	 */
	public Adapter createControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wsmodel3.Communication <em>Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wsmodel3.Communication
	 * @generated
	 */
	public Adapter createCommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wsmodel3.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wsmodel3.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wsmodel3.InputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wsmodel3.InputPort
	 * @generated
	 */
	public Adapter createInputPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wsmodel3.OutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wsmodel3.OutputPort
	 * @generated
	 */
	public Adapter createOutputPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wsmodel3.DeviceData <em>Device Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wsmodel3.DeviceData
	 * @generated
	 */
	public Adapter createDeviceDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wsmodel3.CommunicationData <em>Communication Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wsmodel3.CommunicationData
	 * @generated
	 */
	public Adapter createCommunicationDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wsmodel3.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wsmodel3.Data
	 * @generated
	 */
	public Adapter createDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wsmodel3.AccesPoint <em>Acces Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wsmodel3.AccesPoint
	 * @generated
	 */
	public Adapter createAccesPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wsmodel3.Bridge <em>Bridge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wsmodel3.Bridge
	 * @generated
	 */
	public Adapter createBridgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wsmodel3.InputBridge <em>Input Bridge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wsmodel3.InputBridge
	 * @generated
	 */
	public Adapter createInputBridgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wsmodel3.OutputBridge <em>Output Bridge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wsmodel3.OutputBridge
	 * @generated
	 */
	public Adapter createOutputBridgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wsmodel3.MessageBroker <em>Message Broker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wsmodel3.MessageBroker
	 * @generated
	 */
	public Adapter createMessageBrokerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wsmodel3.IntegrationPattern <em>Integration Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wsmodel3.IntegrationPattern
	 * @generated
	 */
	public Adapter createIntegrationPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wsmodel3.Orchestrator <em>Orchestrator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wsmodel3.Orchestrator
	 * @generated
	 */
	public Adapter createOrchestratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wsmodel3.InputOrchestrator <em>Input Orchestrator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wsmodel3.InputOrchestrator
	 * @generated
	 */
	public Adapter createInputOrchestratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wsmodel3.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wsmodel3.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wsmodel3.OutputOrchestrator <em>Output Orchestrator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wsmodel3.OutputOrchestrator
	 * @generated
	 */
	public Adapter createOutputOrchestratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wsmodel3.OrchestratorData <em>Orchestrator Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wsmodel3.OrchestratorData
	 * @generated
	 */
	public Adapter createOrchestratorDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wsmodel3.ExternalAPI <em>External API</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wsmodel3.ExternalAPI
	 * @generated
	 */
	public Adapter createExternalAPIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wsmodel3.Break <em>Break</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wsmodel3.Break
	 * @generated
	 */
	public Adapter createBreakAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Wsmodel3AdapterFactory
