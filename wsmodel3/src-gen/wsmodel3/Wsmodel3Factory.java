/**
 */
package wsmodel3;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see wsmodel3.Wsmodel3Package
 * @generated
 */
public interface Wsmodel3Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Wsmodel3Factory eINSTANCE = wsmodel3.impl.Wsmodel3FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System</em>'.
	 * @generated
	 */
	System createSystem();

	/**
	 * Returns a new object of class '<em>Io TNode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Io TNode</em>'.
	 * @generated
	 */
	IoTNode createIoTNode();

	/**
	 * Returns a new object of class '<em>Web Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Service</em>'.
	 * @generated
	 */
	WebService createWebService();

	/**
	 * Returns a new object of class '<em>REST</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>REST</em>'.
	 * @generated
	 */
	REST createREST();

	/**
	 * Returns a new object of class '<em>Web Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Server</em>'.
	 * @generated
	 */
	WebServer createWebServer();

	/**
	 * Returns a new object of class '<em>DB Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DB Server</em>'.
	 * @generated
	 */
	DBServer createDBServer();

	/**
	 * Returns a new object of class '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor</em>'.
	 * @generated
	 */
	Sensor createSensor();

	/**
	 * Returns a new object of class '<em>Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actuator</em>'.
	 * @generated
	 */
	Actuator createActuator();

	/**
	 * Returns a new object of class '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Controller</em>'.
	 * @generated
	 */
	Controller createController();

	/**
	 * Returns a new object of class '<em>Communication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication</em>'.
	 * @generated
	 */
	Communication createCommunication();

	/**
	 * Returns a new object of class '<em>Input Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Port</em>'.
	 * @generated
	 */
	InputPort createInputPort();

	/**
	 * Returns a new object of class '<em>Output Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Port</em>'.
	 * @generated
	 */
	OutputPort createOutputPort();

	/**
	 * Returns a new object of class '<em>Device Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Data</em>'.
	 * @generated
	 */
	DeviceData createDeviceData();

	/**
	 * Returns a new object of class '<em>Communication Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Data</em>'.
	 * @generated
	 */
	CommunicationData createCommunicationData();

	/**
	 * Returns a new object of class '<em>Acces Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Acces Point</em>'.
	 * @generated
	 */
	AccesPoint createAccesPoint();

	/**
	 * Returns a new object of class '<em>Input Bridge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Bridge</em>'.
	 * @generated
	 */
	InputBridge createInputBridge();

	/**
	 * Returns a new object of class '<em>Output Bridge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Bridge</em>'.
	 * @generated
	 */
	OutputBridge createOutputBridge();

	/**
	 * Returns a new object of class '<em>Message Broker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Broker</em>'.
	 * @generated
	 */
	MessageBroker createMessageBroker();

	/**
	 * Returns a new object of class '<em>Integration Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integration Pattern</em>'.
	 * @generated
	 */
	IntegrationPattern createIntegrationPattern();

	/**
	 * Returns a new object of class '<em>Orchestrator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orchestrator</em>'.
	 * @generated
	 */
	Orchestrator createOrchestrator();

	/**
	 * Returns a new object of class '<em>Input Orchestrator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Orchestrator</em>'.
	 * @generated
	 */
	InputOrchestrator createInputOrchestrator();

	/**
	 * Returns a new object of class '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function</em>'.
	 * @generated
	 */
	Function createFunction();

	/**
	 * Returns a new object of class '<em>Output Orchestrator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Orchestrator</em>'.
	 * @generated
	 */
	OutputOrchestrator createOutputOrchestrator();

	/**
	 * Returns a new object of class '<em>Orchestrator Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orchestrator Data</em>'.
	 * @generated
	 */
	OrchestratorData createOrchestratorData();

	/**
	 * Returns a new object of class '<em>External API</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External API</em>'.
	 * @generated
	 */
	ExternalAPI createExternalAPI();

	/**
	 * Returns a new object of class '<em>Break</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Break</em>'.
	 * @generated
	 */
	Break createBreak();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Wsmodel3Package getWsmodel3Package();

} //Wsmodel3Factory
