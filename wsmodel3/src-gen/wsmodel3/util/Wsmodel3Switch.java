/**
 */
package wsmodel3.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see wsmodel3.Wsmodel3Package
 * @generated
 */
public class Wsmodel3Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Wsmodel3Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wsmodel3Switch() {
		if (modelPackage == null) {
			modelPackage = Wsmodel3Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case Wsmodel3Package.SYSTEM: {
			wsmodel3.System system = (wsmodel3.System) theEObject;
			T result = caseSystem(system);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Wsmodel3Package.IO_TNODE: {
			IoTNode ioTNode = (IoTNode) theEObject;
			T result = caseIoTNode(ioTNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Wsmodel3Package.SERVER: {
			Server server = (Server) theEObject;
			T result = caseServer(server);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Wsmodel3Package.WEB_SERVICE: {
			WebService webService = (WebService) theEObject;
			T result = caseWebService(webService);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Wsmodel3Package.REST: {
			REST rest = (REST) theEObject;
			T result = caseREST(rest);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Wsmodel3Package.WEB_SERVER: {
			WebServer webServer = (WebServer) theEObject;
			T result = caseWebServer(webServer);
			if (result == null)
				result = caseServer(webServer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Wsmodel3Package.DB_SERVER: {
			DBServer dbServer = (DBServer) theEObject;
			T result = caseDBServer(dbServer);
			if (result == null)
				result = caseServer(dbServer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Wsmodel3Package.DEVICE: {
			Device device = (Device) theEObject;
			T result = caseDevice(device);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Wsmodel3Package.SENSOR: {
			Sensor sensor = (Sensor) theEObject;
			T result = caseSensor(sensor);
			if (result == null)
				result = caseDevice(sensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Wsmodel3Package.ACTUATOR: {
			Actuator actuator = (Actuator) theEObject;
			T result = caseActuator(actuator);
			if (result == null)
				result = caseDevice(actuator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Wsmodel3Package.CONTROLLER: {
			Controller controller = (Controller) theEObject;
			T result = caseController(controller);
			if (result == null)
				result = caseDevice(controller);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Wsmodel3Package.COMMUNICATION: {
			Communication communication = (Communication) theEObject;
			T result = caseCommunication(communication);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Wsmodel3Package.PORT: {
			Port port = (Port) theEObject;
			T result = casePort(port);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Wsmodel3Package.INPUT_PORT: {
			InputPort inputPort = (InputPort) theEObject;
			T result = caseInputPort(inputPort);
			if (result == null)
				result = casePort(inputPort);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Wsmodel3Package.OUTPUT_PORT: {
			OutputPort outputPort = (OutputPort) theEObject;
			T result = caseOutputPort(outputPort);
			if (result == null)
				result = casePort(outputPort);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Wsmodel3Package.DEVICE_DATA: {
			DeviceData deviceData = (DeviceData) theEObject;
			T result = caseDeviceData(deviceData);
			if (result == null)
				result = caseData(deviceData);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Wsmodel3Package.COMMUNICATION_DATA: {
			CommunicationData communicationData = (CommunicationData) theEObject;
			T result = caseCommunicationData(communicationData);
			if (result == null)
				result = caseData(communicationData);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Wsmodel3Package.DATA: {
			Data data = (Data) theEObject;
			T result = caseData(data);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Wsmodel3Package.ACCES_POINT: {
			AccesPoint accesPoint = (AccesPoint) theEObject;
			T result = caseAccesPoint(accesPoint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Wsmodel3Package.BRIDGE: {
			Bridge bridge = (Bridge) theEObject;
			T result = caseBridge(bridge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Wsmodel3Package.INPUT_BRIDGE: {
			InputBridge inputBridge = (InputBridge) theEObject;
			T result = caseInputBridge(inputBridge);
			if (result == null)
				result = caseBridge(inputBridge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Wsmodel3Package.OUTPUT_BRIDGE: {
			OutputBridge outputBridge = (OutputBridge) theEObject;
			T result = caseOutputBridge(outputBridge);
			if (result == null)
				result = caseBridge(outputBridge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Wsmodel3Package.MESSAGE_BROKER: {
			MessageBroker messageBroker = (MessageBroker) theEObject;
			T result = caseMessageBroker(messageBroker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Wsmodel3Package.INTEGRATION_PATTERN: {
			IntegrationPattern integrationPattern = (IntegrationPattern) theEObject;
			T result = caseIntegrationPattern(integrationPattern);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Wsmodel3Package.ORCHESTRATOR: {
			Orchestrator orchestrator = (Orchestrator) theEObject;
			T result = caseOrchestrator(orchestrator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Wsmodel3Package.INPUT_ORCHESTRATOR: {
			InputOrchestrator inputOrchestrator = (InputOrchestrator) theEObject;
			T result = caseInputOrchestrator(inputOrchestrator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Wsmodel3Package.FUNCTION: {
			Function function = (Function) theEObject;
			T result = caseFunction(function);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Wsmodel3Package.OUTPUT_ORCHESTRATOR: {
			OutputOrchestrator outputOrchestrator = (OutputOrchestrator) theEObject;
			T result = caseOutputOrchestrator(outputOrchestrator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Wsmodel3Package.ORCHESTRATOR_DATA: {
			OrchestratorData orchestratorData = (OrchestratorData) theEObject;
			T result = caseOrchestratorData(orchestratorData);
			if (result == null)
				result = caseData(orchestratorData);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Wsmodel3Package.EXTERNAL_API: {
			ExternalAPI externalAPI = (ExternalAPI) theEObject;
			T result = caseExternalAPI(externalAPI);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Wsmodel3Package.BREAK: {
			Break break_ = (Break) theEObject;
			T result = caseBreak(break_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem(wsmodel3.System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Io TNode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Io TNode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIoTNode(IoTNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServer(Server object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebService(WebService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REST</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REST</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseREST(REST object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebServer(WebServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DB Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DB Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDBServer(DBServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevice(Device object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActuator(Actuator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseController(Controller object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunication(Communication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputPort(InputPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputPort(OutputPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceData(DeviceData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationData(CommunicationData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData(Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Acces Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Acces Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccesPoint(AccesPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bridge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bridge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBridge(Bridge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Bridge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Bridge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputBridge(InputBridge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Bridge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Bridge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputBridge(OutputBridge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Broker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Broker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageBroker(MessageBroker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integration Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integration Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegrationPattern(IntegrationPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orchestrator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orchestrator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrchestrator(Orchestrator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Orchestrator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Orchestrator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputOrchestrator(InputOrchestrator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Orchestrator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Orchestrator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputOrchestrator(OutputOrchestrator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orchestrator Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orchestrator Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrchestratorData(OrchestratorData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External API</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External API</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalAPI(ExternalAPI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Break</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Break</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreak(Break object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Wsmodel3Switch
