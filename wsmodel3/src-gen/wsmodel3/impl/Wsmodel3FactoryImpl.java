/**
 */
package wsmodel3.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import wsmodel3.AccesPoint;
import wsmodel3.Actuator;
import wsmodel3.ActuatorType;
import wsmodel3.Break;
import wsmodel3.Communication;
import wsmodel3.CommunicationData;
import wsmodel3.CommunicationType;
import wsmodel3.Controller;
import wsmodel3.ControllerType;
import wsmodel3.DBServer;
import wsmodel3.DBType;
import wsmodel3.DeviceData;
import wsmodel3.ExternalAPI;
import wsmodel3.Function;
import wsmodel3.InputBridge;
import wsmodel3.InputOrchestrator;
import wsmodel3.InputPort;
import wsmodel3.IntegrationPattern;
import wsmodel3.IoTNode;
import wsmodel3.MessageBroker;
import wsmodel3.MessageBrokerType;
import wsmodel3.Orchestrator;
import wsmodel3.OrchestratorData;
import wsmodel3.OutputBridge;
import wsmodel3.OutputOrchestrator;
import wsmodel3.OutputPort;
import wsmodel3.PortType;
import wsmodel3.REST;
import wsmodel3.Sensor;
import wsmodel3.SensorType;
import wsmodel3.WebServer;
import wsmodel3.WebService;
import wsmodel3.Wsmodel3Factory;
import wsmodel3.Wsmodel3Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Wsmodel3FactoryImpl extends EFactoryImpl implements Wsmodel3Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Wsmodel3Factory init() {
		try {
			Wsmodel3Factory theWsmodel3Factory = (Wsmodel3Factory) EPackage.Registry.INSTANCE
					.getEFactory(Wsmodel3Package.eNS_URI);
			if (theWsmodel3Factory != null) {
				return theWsmodel3Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Wsmodel3FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wsmodel3FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Wsmodel3Package.SYSTEM:
			return createSystem();
		case Wsmodel3Package.IO_TNODE:
			return createIoTNode();
		case Wsmodel3Package.WEB_SERVICE:
			return createWebService();
		case Wsmodel3Package.REST:
			return createREST();
		case Wsmodel3Package.WEB_SERVER:
			return createWebServer();
		case Wsmodel3Package.DB_SERVER:
			return createDBServer();
		case Wsmodel3Package.SENSOR:
			return createSensor();
		case Wsmodel3Package.ACTUATOR:
			return createActuator();
		case Wsmodel3Package.CONTROLLER:
			return createController();
		case Wsmodel3Package.COMMUNICATION:
			return createCommunication();
		case Wsmodel3Package.INPUT_PORT:
			return createInputPort();
		case Wsmodel3Package.OUTPUT_PORT:
			return createOutputPort();
		case Wsmodel3Package.DEVICE_DATA:
			return createDeviceData();
		case Wsmodel3Package.COMMUNICATION_DATA:
			return createCommunicationData();
		case Wsmodel3Package.ACCES_POINT:
			return createAccesPoint();
		case Wsmodel3Package.INPUT_BRIDGE:
			return createInputBridge();
		case Wsmodel3Package.OUTPUT_BRIDGE:
			return createOutputBridge();
		case Wsmodel3Package.MESSAGE_BROKER:
			return createMessageBroker();
		case Wsmodel3Package.INTEGRATION_PATTERN:
			return createIntegrationPattern();
		case Wsmodel3Package.ORCHESTRATOR:
			return createOrchestrator();
		case Wsmodel3Package.INPUT_ORCHESTRATOR:
			return createInputOrchestrator();
		case Wsmodel3Package.FUNCTION:
			return createFunction();
		case Wsmodel3Package.OUTPUT_ORCHESTRATOR:
			return createOutputOrchestrator();
		case Wsmodel3Package.ORCHESTRATOR_DATA:
			return createOrchestratorData();
		case Wsmodel3Package.EXTERNAL_API:
			return createExternalAPI();
		case Wsmodel3Package.BREAK:
			return createBreak();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case Wsmodel3Package.DB_TYPE:
			return createDBTypeFromString(eDataType, initialValue);
		case Wsmodel3Package.SENSOR_TYPE:
			return createSensorTypeFromString(eDataType, initialValue);
		case Wsmodel3Package.ACTUATOR_TYPE:
			return createActuatorTypeFromString(eDataType, initialValue);
		case Wsmodel3Package.CONTROLLER_TYPE:
			return createControllerTypeFromString(eDataType, initialValue);
		case Wsmodel3Package.PORT_TYPE:
			return createPortTypeFromString(eDataType, initialValue);
		case Wsmodel3Package.COMMUNICATION_TYPE:
			return createCommunicationTypeFromString(eDataType, initialValue);
		case Wsmodel3Package.MESSAGE_BROKER_TYPE:
			return createMessageBrokerTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case Wsmodel3Package.DB_TYPE:
			return convertDBTypeToString(eDataType, instanceValue);
		case Wsmodel3Package.SENSOR_TYPE:
			return convertSensorTypeToString(eDataType, instanceValue);
		case Wsmodel3Package.ACTUATOR_TYPE:
			return convertActuatorTypeToString(eDataType, instanceValue);
		case Wsmodel3Package.CONTROLLER_TYPE:
			return convertControllerTypeToString(eDataType, instanceValue);
		case Wsmodel3Package.PORT_TYPE:
			return convertPortTypeToString(eDataType, instanceValue);
		case Wsmodel3Package.COMMUNICATION_TYPE:
			return convertCommunicationTypeToString(eDataType, instanceValue);
		case Wsmodel3Package.MESSAGE_BROKER_TYPE:
			return convertMessageBrokerTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public wsmodel3.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IoTNode createIoTNode() {
		IoTNodeImpl ioTNode = new IoTNodeImpl();
		return ioTNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebService createWebService() {
		WebServiceImpl webService = new WebServiceImpl();
		return webService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public REST createREST() {
		RESTImpl rest = new RESTImpl();
		return rest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebServer createWebServer() {
		WebServerImpl webServer = new WebServerImpl();
		return webServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DBServer createDBServer() {
		DBServerImpl dbServer = new DBServerImpl();
		return dbServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Actuator createActuator() {
		ActuatorImpl actuator = new ActuatorImpl();
		return actuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Controller createController() {
		ControllerImpl controller = new ControllerImpl();
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Communication createCommunication() {
		CommunicationImpl communication = new CommunicationImpl();
		return communication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputPort createInputPort() {
		InputPortImpl inputPort = new InputPortImpl();
		return inputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputPort createOutputPort() {
		OutputPortImpl outputPort = new OutputPortImpl();
		return outputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceData createDeviceData() {
		DeviceDataImpl deviceData = new DeviceDataImpl();
		return deviceData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationData createCommunicationData() {
		CommunicationDataImpl communicationData = new CommunicationDataImpl();
		return communicationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccesPoint createAccesPoint() {
		AccesPointImpl accesPoint = new AccesPointImpl();
		return accesPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputBridge createInputBridge() {
		InputBridgeImpl inputBridge = new InputBridgeImpl();
		return inputBridge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputBridge createOutputBridge() {
		OutputBridgeImpl outputBridge = new OutputBridgeImpl();
		return outputBridge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageBroker createMessageBroker() {
		MessageBrokerImpl messageBroker = new MessageBrokerImpl();
		return messageBroker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegrationPattern createIntegrationPattern() {
		IntegrationPatternImpl integrationPattern = new IntegrationPatternImpl();
		return integrationPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Orchestrator createOrchestrator() {
		OrchestratorImpl orchestrator = new OrchestratorImpl();
		return orchestrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputOrchestrator createInputOrchestrator() {
		InputOrchestratorImpl inputOrchestrator = new InputOrchestratorImpl();
		return inputOrchestrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputOrchestrator createOutputOrchestrator() {
		OutputOrchestratorImpl outputOrchestrator = new OutputOrchestratorImpl();
		return outputOrchestrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrchestratorData createOrchestratorData() {
		OrchestratorDataImpl orchestratorData = new OrchestratorDataImpl();
		return orchestratorData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalAPI createExternalAPI() {
		ExternalAPIImpl externalAPI = new ExternalAPIImpl();
		return externalAPI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Break createBreak() {
		BreakImpl break_ = new BreakImpl();
		return break_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBType createDBTypeFromString(EDataType eDataType, String initialValue) {
		DBType result = DBType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDBTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorType createSensorTypeFromString(EDataType eDataType, String initialValue) {
		SensorType result = SensorType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSensorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuatorType createActuatorTypeFromString(EDataType eDataType, String initialValue) {
		ActuatorType result = ActuatorType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActuatorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerType createControllerTypeFromString(EDataType eDataType, String initialValue) {
		ControllerType result = ControllerType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertControllerTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType createPortTypeFromString(EDataType eDataType, String initialValue) {
		PortType result = PortType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationType createCommunicationTypeFromString(EDataType eDataType, String initialValue) {
		CommunicationType result = CommunicationType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommunicationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageBrokerType createMessageBrokerTypeFromString(EDataType eDataType, String initialValue) {
		MessageBrokerType result = MessageBrokerType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageBrokerTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Wsmodel3Package getWsmodel3Package() {
		return (Wsmodel3Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Wsmodel3Package getPackage() {
		return Wsmodel3Package.eINSTANCE;
	}

} //Wsmodel3FactoryImpl
