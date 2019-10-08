/**
 */
package wsmodel3;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see wsmodel3.Wsmodel3Factory
 * @model kind="package"
 * @generated
 */
public interface Wsmodel3Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wsmodel3";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/wsmodel3";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wsmodel3";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Wsmodel3Package eINSTANCE = wsmodel3.impl.Wsmodel3PackageImpl.init();

	/**
	 * The meta object id for the '{@link wsmodel3.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wsmodel3.impl.SystemImpl
	 * @see wsmodel3.impl.Wsmodel3PackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Webservice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__WEBSERVICE = 1;

	/**
	 * The feature id for the '<em><b>Server</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SERVER = 2;

	/**
	 * The feature id for the '<em><b>Iotnode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__IOTNODE = 3;

	/**
	 * The feature id for the '<em><b>Accespoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ACCESPOINT = 4;

	/**
	 * The feature id for the '<em><b>Integrationpattern</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__INTEGRATIONPATTERN = 5;

	/**
	 * The feature id for the '<em><b>Messagebroker</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__MESSAGEBROKER = 6;

	/**
	 * The feature id for the '<em><b>Externalapi</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__EXTERNALAPI = 7;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wsmodel3.impl.IoTNodeImpl <em>Io TNode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wsmodel3.impl.IoTNodeImpl
	 * @see wsmodel3.impl.Wsmodel3PackageImpl#getIoTNode()
	 * @generated
	 */
	int IO_TNODE = 1;

	/**
	 * The feature id for the '<em><b>Device</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TNODE__DEVICE = 0;

	/**
	 * The number of structural features of the '<em>Io TNode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TNODE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Io TNode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TNODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wsmodel3.impl.ServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wsmodel3.impl.ServerImpl
	 * @see wsmodel3.impl.Wsmodel3PackageImpl#getServer()
	 * @generated
	 */
	int SERVER = 2;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__HOST = 0;

	/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wsmodel3.impl.WebServiceImpl <em>Web Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wsmodel3.impl.WebServiceImpl
	 * @see wsmodel3.impl.Wsmodel3PackageImpl#getWebService()
	 * @generated
	 */
	int WEB_SERVICE = 3;

	/**
	 * The feature id for the '<em><b>Rest</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SERVICE__REST = 0;

	/**
	 * The feature id for the '<em><b>Webserver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SERVICE__WEBSERVER = 1;

	/**
	 * The feature id for the '<em><b>Dbserver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SERVICE__DBSERVER = 2;

	/**
	 * The number of structural features of the '<em>Web Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SERVICE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Web Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wsmodel3.impl.RESTImpl <em>REST</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wsmodel3.impl.RESTImpl
	 * @see wsmodel3.impl.Wsmodel3PackageImpl#getREST()
	 * @generated
	 */
	int REST = 4;

	/**
	 * The feature id for the '<em><b>Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST__DEVICE = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST__URI = 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST__PORT = 2;

	/**
	 * The number of structural features of the '<em>REST</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>REST</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wsmodel3.impl.WebServerImpl <em>Web Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wsmodel3.impl.WebServerImpl
	 * @see wsmodel3.impl.Wsmodel3PackageImpl#getWebServer()
	 * @generated
	 */
	int WEB_SERVER = 5;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SERVER__HOST = SERVER__HOST;

	/**
	 * The number of structural features of the '<em>Web Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SERVER_FEATURE_COUNT = SERVER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Web Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SERVER_OPERATION_COUNT = SERVER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wsmodel3.impl.DBServerImpl <em>DB Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wsmodel3.impl.DBServerImpl
	 * @see wsmodel3.impl.Wsmodel3PackageImpl#getDBServer()
	 * @generated
	 */
	int DB_SERVER = 6;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SERVER__HOST = SERVER__HOST;

	/**
	 * The feature id for the '<em><b>Usser</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SERVER__USSER = SERVER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SERVER__PASS = SERVER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SERVER__TYPE = SERVER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SERVER__PORT = SERVER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Database</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SERVER__DATABASE = SERVER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>DB Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SERVER_FEATURE_COUNT = SERVER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>DB Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SERVER_OPERATION_COUNT = SERVER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wsmodel3.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wsmodel3.impl.DeviceImpl
	 * @see wsmodel3.impl.Wsmodel3PackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Devicedata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__DEVICEDATA = 1;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wsmodel3.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wsmodel3.impl.SensorImpl
	 * @see wsmodel3.impl.Wsmodel3PackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Devicedata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__DEVICEDATA = DEVICE__DEVICEDATA;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__TYPE = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wsmodel3.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wsmodel3.impl.ActuatorImpl
	 * @see wsmodel3.impl.Wsmodel3PackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__NAME = DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Devicedata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__DEVICEDATA = DEVICE__DEVICEDATA;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__TYPE = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wsmodel3.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wsmodel3.impl.ControllerImpl
	 * @see wsmodel3.impl.Wsmodel3PackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__NAME = DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Devicedata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__DEVICEDATA = DEVICE__DEVICEDATA;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__TYPE = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__PORT = DEVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Communication</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__COMMUNICATION = DEVICE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wsmodel3.impl.CommunicationImpl <em>Communication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wsmodel3.impl.CommunicationImpl
	 * @see wsmodel3.impl.Wsmodel3PackageImpl#getCommunication()
	 * @generated
	 */
	int COMMUNICATION = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Communicationdata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__COMMUNICATIONDATA = 1;

	/**
	 * The feature id for the '<em><b>Accespoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__ACCESPOINT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__NAME = 3;

	/**
	 * The feature id for the '<em><b>Messagebroker</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__MESSAGEBROKER = 4;

	/**
	 * The number of structural features of the '<em>Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wsmodel3.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wsmodel3.impl.PortImpl
	 * @see wsmodel3.impl.Wsmodel3PackageImpl#getPort()
	 * @generated
	 */
	int PORT = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wsmodel3.impl.InputPortImpl <em>Input Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wsmodel3.impl.InputPortImpl
	 * @see wsmodel3.impl.Wsmodel3PackageImpl#getInputPort()
	 * @generated
	 */
	int INPUT_PORT = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__ID = PORT__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__TYPE = PORT__TYPE;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__SENSOR = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wsmodel3.impl.OutputPortImpl <em>Output Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wsmodel3.impl.OutputPortImpl
	 * @see wsmodel3.impl.Wsmodel3PackageImpl#getOutputPort()
	 * @generated
	 */
	int OUTPUT_PORT = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__ID = PORT__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__TYPE = PORT__TYPE;

	/**
	 * The feature id for the '<em><b>Actuator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__ACTUATOR = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wsmodel3.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wsmodel3.impl.DataImpl
	 * @see wsmodel3.impl.Wsmodel3PackageImpl#getData()
	 * @generated
	 */
	int DATA = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ID = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__DATE = 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__TIME = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Artefact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ARTEFACT = 5;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wsmodel3.impl.DeviceDataImpl <em>Device Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wsmodel3.impl.DeviceDataImpl
	 * @see wsmodel3.impl.Wsmodel3PackageImpl#getDeviceData()
	 * @generated
	 */
	int DEVICE_DATA = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DATA__ID = DATA__ID;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DATA__DATE = DATA__DATE;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DATA__TIME = DATA__TIME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DATA__LOCATION = DATA__LOCATION;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DATA__ATTRIBUTE = DATA__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Artefact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DATA__ARTEFACT = DATA__ARTEFACT;

	/**
	 * The number of structural features of the '<em>Device Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DATA_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Device Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DATA_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wsmodel3.impl.CommunicationDataImpl <em>Communication Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wsmodel3.impl.CommunicationDataImpl
	 * @see wsmodel3.impl.Wsmodel3PackageImpl#getCommunicationData()
	 * @generated
	 */
	int COMMUNICATION_DATA = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_DATA__ID = DATA__ID;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_DATA__DATE = DATA__DATE;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_DATA__TIME = DATA__TIME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_DATA__LOCATION = DATA__LOCATION;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_DATA__ATTRIBUTE = DATA__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Artefact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_DATA__ARTEFACT = DATA__ARTEFACT;

	/**
	 * The number of structural features of the '<em>Communication Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_DATA_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Communication Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_DATA_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wsmodel3.impl.AccesPointImpl <em>Acces Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wsmodel3.impl.AccesPointImpl
	 * @see wsmodel3.impl.Wsmodel3PackageImpl#getAccesPoint()
	 * @generated
	 */
	int ACCES_POINT = 18;

	/**
	 * The feature id for the '<em><b>Ssid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCES_POINT__SSID = 0;

	/**
	 * The feature id for the '<em><b>Pass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCES_POINT__PASS = 1;

	/**
	 * The number of structural features of the '<em>Acces Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCES_POINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Acces Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCES_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wsmodel3.impl.BridgeImpl <em>Bridge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wsmodel3.impl.BridgeImpl
	 * @see wsmodel3.impl.Wsmodel3PackageImpl#getBridge()
	 * @generated
	 */
	int BRIDGE = 19;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE__TOPIC = 0;

	/**
	 * The feature id for the '<em><b>Rest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE__REST = 1;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE__HOST = 2;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE__PORT = 3;

	/**
	 * The number of structural features of the '<em>Bridge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Bridge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wsmodel3.impl.InputBridgeImpl <em>Input Bridge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wsmodel3.impl.InputBridgeImpl
	 * @see wsmodel3.impl.Wsmodel3PackageImpl#getInputBridge()
	 * @generated
	 */
	int INPUT_BRIDGE = 20;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BRIDGE__TOPIC = BRIDGE__TOPIC;

	/**
	 * The feature id for the '<em><b>Rest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BRIDGE__REST = BRIDGE__REST;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BRIDGE__HOST = BRIDGE__HOST;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BRIDGE__PORT = BRIDGE__PORT;

	/**
	 * The feature id for the '<em><b>Actuator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BRIDGE__ACTUATOR = BRIDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BRIDGE__URI = BRIDGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Input Bridge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BRIDGE_FEATURE_COUNT = BRIDGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Input Bridge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BRIDGE_OPERATION_COUNT = BRIDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wsmodel3.impl.OutputBridgeImpl <em>Output Bridge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wsmodel3.impl.OutputBridgeImpl
	 * @see wsmodel3.impl.Wsmodel3PackageImpl#getOutputBridge()
	 * @generated
	 */
	int OUTPUT_BRIDGE = 21;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BRIDGE__TOPIC = BRIDGE__TOPIC;

	/**
	 * The feature id for the '<em><b>Rest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BRIDGE__REST = BRIDGE__REST;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BRIDGE__HOST = BRIDGE__HOST;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BRIDGE__PORT = BRIDGE__PORT;

	/**
	 * The feature id for the '<em><b>Inputorchestrator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BRIDGE__INPUTORCHESTRATOR = BRIDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BRIDGE__SENSOR = BRIDGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Output Bridge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BRIDGE_FEATURE_COUNT = BRIDGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Output Bridge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BRIDGE_OPERATION_COUNT = BRIDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wsmodel3.impl.MessageBrokerImpl <em>Message Broker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wsmodel3.impl.MessageBrokerImpl
	 * @see wsmodel3.impl.Wsmodel3PackageImpl#getMessageBroker()
	 * @generated
	 */
	int MESSAGE_BROKER = 22;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BROKER__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BROKER__PORT = 1;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BROKER__HOST = 2;

	/**
	 * The feature id for the '<em><b>Bridge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BROKER__BRIDGE = 3;

	/**
	 * The feature id for the '<em><b>Usser</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BROKER__USSER = 4;

	/**
	 * The feature id for the '<em><b>Pass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BROKER__PASS = 5;

	/**
	 * The number of structural features of the '<em>Message Broker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BROKER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Message Broker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BROKER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wsmodel3.impl.IntegrationPatternImpl <em>Integration Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wsmodel3.impl.IntegrationPatternImpl
	 * @see wsmodel3.impl.Wsmodel3PackageImpl#getIntegrationPattern()
	 * @generated
	 */
	int INTEGRATION_PATTERN = 23;

	/**
	 * The feature id for the '<em><b>Orchestrator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_PATTERN__ORCHESTRATOR = 0;

	/**
	 * The feature id for the '<em><b>Webserver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_PATTERN__WEBSERVER = 1;

	/**
	 * The number of structural features of the '<em>Integration Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_PATTERN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Integration Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_PATTERN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wsmodel3.impl.OrchestratorImpl <em>Orchestrator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wsmodel3.impl.OrchestratorImpl
	 * @see wsmodel3.impl.Wsmodel3PackageImpl#getOrchestrator()
	 * @generated
	 */
	int ORCHESTRATOR = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Inputorchestrator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATOR__INPUTORCHESTRATOR = 1;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATOR__FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Outputorchestrator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATOR__OUTPUTORCHESTRATOR = 3;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATOR__PORT = 4;

	/**
	 * The feature id for the '<em><b>Externalapi</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATOR__EXTERNALAPI = 5;

	/**
	 * The feature id for the '<em><b>Rest</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATOR__REST = 6;

	/**
	 * The number of structural features of the '<em>Orchestrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATOR_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Orchestrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wsmodel3.impl.InputOrchestratorImpl <em>Input Orchestrator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wsmodel3.impl.InputOrchestratorImpl
	 * @see wsmodel3.impl.Wsmodel3PackageImpl#getInputOrchestrator()
	 * @generated
	 */
	int INPUT_ORCHESTRATOR = 25;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ORCHESTRATOR__URI = 0;

	/**
	 * The number of structural features of the '<em>Input Orchestrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ORCHESTRATOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Input Orchestrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ORCHESTRATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wsmodel3.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wsmodel3.impl.FunctionImpl
	 * @see wsmodel3.impl.Wsmodel3PackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 26;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Inputorchestrator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__INPUTORCHESTRATOR = 1;

	/**
	 * The feature id for the '<em><b>Outputorchestrator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OUTPUTORCHESTRATOR = 2;

	/**
	 * The feature id for the '<em><b>Break</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__BREAK = 3;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wsmodel3.impl.OutputOrchestratorImpl <em>Output Orchestrator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wsmodel3.impl.OutputOrchestratorImpl
	 * @see wsmodel3.impl.Wsmodel3PackageImpl#getOutputOrchestrator()
	 * @generated
	 */
	int OUTPUT_ORCHESTRATOR = 27;

	/**
	 * The feature id for the '<em><b>Inputorchestrator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ORCHESTRATOR__INPUTORCHESTRATOR = 0;

	/**
	 * The feature id for the '<em><b>Inputbridge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ORCHESTRATOR__INPUTBRIDGE = 1;

	/**
	 * The feature id for the '<em><b>Renponsedata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ORCHESTRATOR__RENPONSEDATA = 2;

	/**
	 * The feature id for the '<em><b>Rest</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ORCHESTRATOR__REST = 3;

	/**
	 * The feature id for the '<em><b>Externalapi</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ORCHESTRATOR__EXTERNALAPI = 4;

	/**
	 * The number of structural features of the '<em>Output Orchestrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ORCHESTRATOR_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Output Orchestrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ORCHESTRATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wsmodel3.impl.OrchestratorDataImpl <em>Orchestrator Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wsmodel3.impl.OrchestratorDataImpl
	 * @see wsmodel3.impl.Wsmodel3PackageImpl#getOrchestratorData()
	 * @generated
	 */
	int ORCHESTRATOR_DATA = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATOR_DATA__ID = DATA__ID;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATOR_DATA__DATE = DATA__DATE;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATOR_DATA__TIME = DATA__TIME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATOR_DATA__LOCATION = DATA__LOCATION;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATOR_DATA__ATTRIBUTE = DATA__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Artefact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATOR_DATA__ARTEFACT = DATA__ARTEFACT;

	/**
	 * The number of structural features of the '<em>Orchestrator Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATOR_DATA_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Orchestrator Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATOR_DATA_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wsmodel3.impl.ExternalAPIImpl <em>External API</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wsmodel3.impl.ExternalAPIImpl
	 * @see wsmodel3.impl.Wsmodel3PackageImpl#getExternalAPI()
	 * @generated
	 */
	int EXTERNAL_API = 29;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_API__URI = 0;

	/**
	 * The number of structural features of the '<em>External API</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_API_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>External API</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_API_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wsmodel3.impl.BreakImpl <em>Break</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wsmodel3.impl.BreakImpl
	 * @see wsmodel3.impl.Wsmodel3PackageImpl#getBreak()
	 * @generated
	 */
	int BREAK = 30;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK__EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Break</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Break</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wsmodel3.DBType <em>DB Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wsmodel3.DBType
	 * @see wsmodel3.impl.Wsmodel3PackageImpl#getDBType()
	 * @generated
	 */
	int DB_TYPE = 31;

	/**
	 * The meta object id for the '{@link wsmodel3.SensorType <em>Sensor Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wsmodel3.SensorType
	 * @see wsmodel3.impl.Wsmodel3PackageImpl#getSensorType()
	 * @generated
	 */
	int SENSOR_TYPE = 32;

	/**
	 * The meta object id for the '{@link wsmodel3.ActuatorType <em>Actuator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wsmodel3.ActuatorType
	 * @see wsmodel3.impl.Wsmodel3PackageImpl#getActuatorType()
	 * @generated
	 */
	int ACTUATOR_TYPE = 33;

	/**
	 * The meta object id for the '{@link wsmodel3.ControllerType <em>Controller Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wsmodel3.ControllerType
	 * @see wsmodel3.impl.Wsmodel3PackageImpl#getControllerType()
	 * @generated
	 */
	int CONTROLLER_TYPE = 34;

	/**
	 * The meta object id for the '{@link wsmodel3.PortType <em>Port Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wsmodel3.PortType
	 * @see wsmodel3.impl.Wsmodel3PackageImpl#getPortType()
	 * @generated
	 */
	int PORT_TYPE = 35;

	/**
	 * The meta object id for the '{@link wsmodel3.CommunicationType <em>Communication Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wsmodel3.CommunicationType
	 * @see wsmodel3.impl.Wsmodel3PackageImpl#getCommunicationType()
	 * @generated
	 */
	int COMMUNICATION_TYPE = 36;

	/**
	 * The meta object id for the '{@link wsmodel3.MessageBrokerType <em>Message Broker Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wsmodel3.MessageBrokerType
	 * @see wsmodel3.impl.Wsmodel3PackageImpl#getMessageBrokerType()
	 * @generated
	 */
	int MESSAGE_BROKER_TYPE = 37;

	/**
	 * Returns the meta object for class '{@link wsmodel3.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see wsmodel3.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the attribute '{@link wsmodel3.System#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see wsmodel3.System#getName()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link wsmodel3.System#getWebservice <em>Webservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Webservice</em>'.
	 * @see wsmodel3.System#getWebservice()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Webservice();

	/**
	 * Returns the meta object for the containment reference list '{@link wsmodel3.System#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Server</em>'.
	 * @see wsmodel3.System#getServer()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Server();

	/**
	 * Returns the meta object for the containment reference list '{@link wsmodel3.System#getIotnode <em>Iotnode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Iotnode</em>'.
	 * @see wsmodel3.System#getIotnode()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Iotnode();

	/**
	 * Returns the meta object for the containment reference list '{@link wsmodel3.System#getAccespoint <em>Accespoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Accespoint</em>'.
	 * @see wsmodel3.System#getAccespoint()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Accespoint();

	/**
	 * Returns the meta object for the containment reference list '{@link wsmodel3.System#getIntegrationpattern <em>Integrationpattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Integrationpattern</em>'.
	 * @see wsmodel3.System#getIntegrationpattern()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Integrationpattern();

	/**
	 * Returns the meta object for the containment reference list '{@link wsmodel3.System#getMessagebroker <em>Messagebroker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messagebroker</em>'.
	 * @see wsmodel3.System#getMessagebroker()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Messagebroker();

	/**
	 * Returns the meta object for the containment reference list '{@link wsmodel3.System#getExternalapi <em>Externalapi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Externalapi</em>'.
	 * @see wsmodel3.System#getExternalapi()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Externalapi();

	/**
	 * Returns the meta object for class '{@link wsmodel3.IoTNode <em>Io TNode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Io TNode</em>'.
	 * @see wsmodel3.IoTNode
	 * @generated
	 */
	EClass getIoTNode();

	/**
	 * Returns the meta object for the containment reference list '{@link wsmodel3.IoTNode#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Device</em>'.
	 * @see wsmodel3.IoTNode#getDevice()
	 * @see #getIoTNode()
	 * @generated
	 */
	EReference getIoTNode_Device();

	/**
	 * Returns the meta object for class '{@link wsmodel3.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see wsmodel3.Server
	 * @generated
	 */
	EClass getServer();

	/**
	 * Returns the meta object for the attribute '{@link wsmodel3.Server#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see wsmodel3.Server#getHost()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_Host();

	/**
	 * Returns the meta object for class '{@link wsmodel3.WebService <em>Web Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Service</em>'.
	 * @see wsmodel3.WebService
	 * @generated
	 */
	EClass getWebService();

	/**
	 * Returns the meta object for the containment reference list '{@link wsmodel3.WebService#getRest <em>Rest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rest</em>'.
	 * @see wsmodel3.WebService#getRest()
	 * @see #getWebService()
	 * @generated
	 */
	EReference getWebService_Rest();

	/**
	 * Returns the meta object for the reference '{@link wsmodel3.WebService#getWebserver <em>Webserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Webserver</em>'.
	 * @see wsmodel3.WebService#getWebserver()
	 * @see #getWebService()
	 * @generated
	 */
	EReference getWebService_Webserver();

	/**
	 * Returns the meta object for the reference '{@link wsmodel3.WebService#getDbserver <em>Dbserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dbserver</em>'.
	 * @see wsmodel3.WebService#getDbserver()
	 * @see #getWebService()
	 * @generated
	 */
	EReference getWebService_Dbserver();

	/**
	 * Returns the meta object for class '{@link wsmodel3.REST <em>REST</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>REST</em>'.
	 * @see wsmodel3.REST
	 * @generated
	 */
	EClass getREST();

	/**
	 * Returns the meta object for the reference '{@link wsmodel3.REST#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Device</em>'.
	 * @see wsmodel3.REST#getDevice()
	 * @see #getREST()
	 * @generated
	 */
	EReference getREST_Device();

	/**
	 * Returns the meta object for the attribute '{@link wsmodel3.REST#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see wsmodel3.REST#getURI()
	 * @see #getREST()
	 * @generated
	 */
	EAttribute getREST_URI();

	/**
	 * Returns the meta object for the attribute '{@link wsmodel3.REST#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see wsmodel3.REST#getPort()
	 * @see #getREST()
	 * @generated
	 */
	EAttribute getREST_Port();

	/**
	 * Returns the meta object for class '{@link wsmodel3.WebServer <em>Web Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Server</em>'.
	 * @see wsmodel3.WebServer
	 * @generated
	 */
	EClass getWebServer();

	/**
	 * Returns the meta object for class '{@link wsmodel3.DBServer <em>DB Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DB Server</em>'.
	 * @see wsmodel3.DBServer
	 * @generated
	 */
	EClass getDBServer();

	/**
	 * Returns the meta object for the attribute '{@link wsmodel3.DBServer#getUsser <em>Usser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usser</em>'.
	 * @see wsmodel3.DBServer#getUsser()
	 * @see #getDBServer()
	 * @generated
	 */
	EAttribute getDBServer_Usser();

	/**
	 * Returns the meta object for the attribute '{@link wsmodel3.DBServer#getPass <em>Pass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pass</em>'.
	 * @see wsmodel3.DBServer#getPass()
	 * @see #getDBServer()
	 * @generated
	 */
	EAttribute getDBServer_Pass();

	/**
	 * Returns the meta object for the attribute '{@link wsmodel3.DBServer#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see wsmodel3.DBServer#getType()
	 * @see #getDBServer()
	 * @generated
	 */
	EAttribute getDBServer_Type();

	/**
	 * Returns the meta object for the attribute '{@link wsmodel3.DBServer#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see wsmodel3.DBServer#getPort()
	 * @see #getDBServer()
	 * @generated
	 */
	EAttribute getDBServer_Port();

	/**
	 * Returns the meta object for the attribute '{@link wsmodel3.DBServer#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database</em>'.
	 * @see wsmodel3.DBServer#getDatabase()
	 * @see #getDBServer()
	 * @generated
	 */
	EAttribute getDBServer_Database();

	/**
	 * Returns the meta object for class '{@link wsmodel3.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see wsmodel3.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the attribute '{@link wsmodel3.Device#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see wsmodel3.Device#getName()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link wsmodel3.Device#getDevicedata <em>Devicedata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Devicedata</em>'.
	 * @see wsmodel3.Device#getDevicedata()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Devicedata();

	/**
	 * Returns the meta object for class '{@link wsmodel3.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see wsmodel3.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the attribute '{@link wsmodel3.Sensor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see wsmodel3.Sensor#getType()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Type();

	/**
	 * Returns the meta object for class '{@link wsmodel3.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see wsmodel3.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for the attribute '{@link wsmodel3.Actuator#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see wsmodel3.Actuator#getType()
	 * @see #getActuator()
	 * @generated
	 */
	EAttribute getActuator_Type();

	/**
	 * Returns the meta object for class '{@link wsmodel3.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see wsmodel3.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for the attribute '{@link wsmodel3.Controller#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see wsmodel3.Controller#getType()
	 * @see #getController()
	 * @generated
	 */
	EAttribute getController_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link wsmodel3.Controller#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see wsmodel3.Controller#getPort()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Port();

	/**
	 * Returns the meta object for the containment reference list '{@link wsmodel3.Controller#getCommunication <em>Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Communication</em>'.
	 * @see wsmodel3.Controller#getCommunication()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Communication();

	/**
	 * Returns the meta object for class '{@link wsmodel3.Communication <em>Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication</em>'.
	 * @see wsmodel3.Communication
	 * @generated
	 */
	EClass getCommunication();

	/**
	 * Returns the meta object for the attribute '{@link wsmodel3.Communication#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see wsmodel3.Communication#getType()
	 * @see #getCommunication()
	 * @generated
	 */
	EAttribute getCommunication_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link wsmodel3.Communication#getCommunicationdata <em>Communicationdata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Communicationdata</em>'.
	 * @see wsmodel3.Communication#getCommunicationdata()
	 * @see #getCommunication()
	 * @generated
	 */
	EReference getCommunication_Communicationdata();

	/**
	 * Returns the meta object for the reference '{@link wsmodel3.Communication#getAccespoint <em>Accespoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Accespoint</em>'.
	 * @see wsmodel3.Communication#getAccespoint()
	 * @see #getCommunication()
	 * @generated
	 */
	EReference getCommunication_Accespoint();

	/**
	 * Returns the meta object for the attribute '{@link wsmodel3.Communication#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see wsmodel3.Communication#getName()
	 * @see #getCommunication()
	 * @generated
	 */
	EAttribute getCommunication_Name();

	/**
	 * Returns the meta object for the reference '{@link wsmodel3.Communication#getMessagebroker <em>Messagebroker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Messagebroker</em>'.
	 * @see wsmodel3.Communication#getMessagebroker()
	 * @see #getCommunication()
	 * @generated
	 */
	EReference getCommunication_Messagebroker();

	/**
	 * Returns the meta object for class '{@link wsmodel3.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see wsmodel3.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link wsmodel3.Port#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see wsmodel3.Port#getId()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Id();

	/**
	 * Returns the meta object for the attribute '{@link wsmodel3.Port#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see wsmodel3.Port#getType()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Type();

	/**
	 * Returns the meta object for class '{@link wsmodel3.InputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Port</em>'.
	 * @see wsmodel3.InputPort
	 * @generated
	 */
	EClass getInputPort();

	/**
	 * Returns the meta object for the reference '{@link wsmodel3.InputPort#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensor</em>'.
	 * @see wsmodel3.InputPort#getSensor()
	 * @see #getInputPort()
	 * @generated
	 */
	EReference getInputPort_Sensor();

	/**
	 * Returns the meta object for class '{@link wsmodel3.OutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Port</em>'.
	 * @see wsmodel3.OutputPort
	 * @generated
	 */
	EClass getOutputPort();

	/**
	 * Returns the meta object for the reference '{@link wsmodel3.OutputPort#getActuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actuator</em>'.
	 * @see wsmodel3.OutputPort#getActuator()
	 * @see #getOutputPort()
	 * @generated
	 */
	EReference getOutputPort_Actuator();

	/**
	 * Returns the meta object for class '{@link wsmodel3.DeviceData <em>Device Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Data</em>'.
	 * @see wsmodel3.DeviceData
	 * @generated
	 */
	EClass getDeviceData();

	/**
	 * Returns the meta object for class '{@link wsmodel3.CommunicationData <em>Communication Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Data</em>'.
	 * @see wsmodel3.CommunicationData
	 * @generated
	 */
	EClass getCommunicationData();

	/**
	 * Returns the meta object for class '{@link wsmodel3.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see wsmodel3.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link wsmodel3.Data#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see wsmodel3.Data#getId()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Id();

	/**
	 * Returns the meta object for the attribute '{@link wsmodel3.Data#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see wsmodel3.Data#getDate()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Date();

	/**
	 * Returns the meta object for the attribute '{@link wsmodel3.Data#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see wsmodel3.Data#getTime()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Time();

	/**
	 * Returns the meta object for the attribute '{@link wsmodel3.Data#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see wsmodel3.Data#getLocation()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Location();

	/**
	 * Returns the meta object for the attribute '{@link wsmodel3.Data#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute</em>'.
	 * @see wsmodel3.Data#getAttribute()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link wsmodel3.Data#getArtefact <em>Artefact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artefact</em>'.
	 * @see wsmodel3.Data#getArtefact()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Artefact();

	/**
	 * Returns the meta object for class '{@link wsmodel3.AccesPoint <em>Acces Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acces Point</em>'.
	 * @see wsmodel3.AccesPoint
	 * @generated
	 */
	EClass getAccesPoint();

	/**
	 * Returns the meta object for the attribute '{@link wsmodel3.AccesPoint#getSsid <em>Ssid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssid</em>'.
	 * @see wsmodel3.AccesPoint#getSsid()
	 * @see #getAccesPoint()
	 * @generated
	 */
	EAttribute getAccesPoint_Ssid();

	/**
	 * Returns the meta object for the attribute '{@link wsmodel3.AccesPoint#getPass <em>Pass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pass</em>'.
	 * @see wsmodel3.AccesPoint#getPass()
	 * @see #getAccesPoint()
	 * @generated
	 */
	EAttribute getAccesPoint_Pass();

	/**
	 * Returns the meta object for class '{@link wsmodel3.Bridge <em>Bridge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bridge</em>'.
	 * @see wsmodel3.Bridge
	 * @generated
	 */
	EClass getBridge();

	/**
	 * Returns the meta object for the attribute '{@link wsmodel3.Bridge#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic</em>'.
	 * @see wsmodel3.Bridge#getTopic()
	 * @see #getBridge()
	 * @generated
	 */
	EAttribute getBridge_Topic();

	/**
	 * Returns the meta object for the reference '{@link wsmodel3.Bridge#getRest <em>Rest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rest</em>'.
	 * @see wsmodel3.Bridge#getRest()
	 * @see #getBridge()
	 * @generated
	 */
	EReference getBridge_Rest();

	/**
	 * Returns the meta object for the attribute '{@link wsmodel3.Bridge#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see wsmodel3.Bridge#getHost()
	 * @see #getBridge()
	 * @generated
	 */
	EAttribute getBridge_Host();

	/**
	 * Returns the meta object for the attribute '{@link wsmodel3.Bridge#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see wsmodel3.Bridge#getPort()
	 * @see #getBridge()
	 * @generated
	 */
	EAttribute getBridge_Port();

	/**
	 * Returns the meta object for class '{@link wsmodel3.InputBridge <em>Input Bridge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Bridge</em>'.
	 * @see wsmodel3.InputBridge
	 * @generated
	 */
	EClass getInputBridge();

	/**
	 * Returns the meta object for the reference '{@link wsmodel3.InputBridge#getActuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actuator</em>'.
	 * @see wsmodel3.InputBridge#getActuator()
	 * @see #getInputBridge()
	 * @generated
	 */
	EReference getInputBridge_Actuator();

	/**
	 * Returns the meta object for the attribute '{@link wsmodel3.InputBridge#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see wsmodel3.InputBridge#getURI()
	 * @see #getInputBridge()
	 * @generated
	 */
	EAttribute getInputBridge_URI();

	/**
	 * Returns the meta object for class '{@link wsmodel3.OutputBridge <em>Output Bridge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Bridge</em>'.
	 * @see wsmodel3.OutputBridge
	 * @generated
	 */
	EClass getOutputBridge();

	/**
	 * Returns the meta object for the reference list '{@link wsmodel3.OutputBridge#getInputorchestrator <em>Inputorchestrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputorchestrator</em>'.
	 * @see wsmodel3.OutputBridge#getInputorchestrator()
	 * @see #getOutputBridge()
	 * @generated
	 */
	EReference getOutputBridge_Inputorchestrator();

	/**
	 * Returns the meta object for the reference '{@link wsmodel3.OutputBridge#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensor</em>'.
	 * @see wsmodel3.OutputBridge#getSensor()
	 * @see #getOutputBridge()
	 * @generated
	 */
	EReference getOutputBridge_Sensor();

	/**
	 * Returns the meta object for class '{@link wsmodel3.MessageBroker <em>Message Broker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Broker</em>'.
	 * @see wsmodel3.MessageBroker
	 * @generated
	 */
	EClass getMessageBroker();

	/**
	 * Returns the meta object for the attribute '{@link wsmodel3.MessageBroker#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see wsmodel3.MessageBroker#getType()
	 * @see #getMessageBroker()
	 * @generated
	 */
	EAttribute getMessageBroker_Type();

	/**
	 * Returns the meta object for the attribute '{@link wsmodel3.MessageBroker#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see wsmodel3.MessageBroker#getPort()
	 * @see #getMessageBroker()
	 * @generated
	 */
	EAttribute getMessageBroker_Port();

	/**
	 * Returns the meta object for the attribute '{@link wsmodel3.MessageBroker#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see wsmodel3.MessageBroker#getHost()
	 * @see #getMessageBroker()
	 * @generated
	 */
	EAttribute getMessageBroker_Host();

	/**
	 * Returns the meta object for the containment reference list '{@link wsmodel3.MessageBroker#getBridge <em>Bridge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bridge</em>'.
	 * @see wsmodel3.MessageBroker#getBridge()
	 * @see #getMessageBroker()
	 * @generated
	 */
	EReference getMessageBroker_Bridge();

	/**
	 * Returns the meta object for the attribute '{@link wsmodel3.MessageBroker#getUsser <em>Usser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usser</em>'.
	 * @see wsmodel3.MessageBroker#getUsser()
	 * @see #getMessageBroker()
	 * @generated
	 */
	EAttribute getMessageBroker_Usser();

	/**
	 * Returns the meta object for the attribute '{@link wsmodel3.MessageBroker#getPass <em>Pass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pass</em>'.
	 * @see wsmodel3.MessageBroker#getPass()
	 * @see #getMessageBroker()
	 * @generated
	 */
	EAttribute getMessageBroker_Pass();

	/**
	 * Returns the meta object for class '{@link wsmodel3.IntegrationPattern <em>Integration Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integration Pattern</em>'.
	 * @see wsmodel3.IntegrationPattern
	 * @generated
	 */
	EClass getIntegrationPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link wsmodel3.IntegrationPattern#getOrchestrator <em>Orchestrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orchestrator</em>'.
	 * @see wsmodel3.IntegrationPattern#getOrchestrator()
	 * @see #getIntegrationPattern()
	 * @generated
	 */
	EReference getIntegrationPattern_Orchestrator();

	/**
	 * Returns the meta object for the reference '{@link wsmodel3.IntegrationPattern#getWebserver <em>Webserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Webserver</em>'.
	 * @see wsmodel3.IntegrationPattern#getWebserver()
	 * @see #getIntegrationPattern()
	 * @generated
	 */
	EReference getIntegrationPattern_Webserver();

	/**
	 * Returns the meta object for class '{@link wsmodel3.Orchestrator <em>Orchestrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orchestrator</em>'.
	 * @see wsmodel3.Orchestrator
	 * @generated
	 */
	EClass getOrchestrator();

	/**
	 * Returns the meta object for the attribute '{@link wsmodel3.Orchestrator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see wsmodel3.Orchestrator#getName()
	 * @see #getOrchestrator()
	 * @generated
	 */
	EAttribute getOrchestrator_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link wsmodel3.Orchestrator#getInputorchestrator <em>Inputorchestrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputorchestrator</em>'.
	 * @see wsmodel3.Orchestrator#getInputorchestrator()
	 * @see #getOrchestrator()
	 * @generated
	 */
	EReference getOrchestrator_Inputorchestrator();

	/**
	 * Returns the meta object for the containment reference list '{@link wsmodel3.Orchestrator#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function</em>'.
	 * @see wsmodel3.Orchestrator#getFunction()
	 * @see #getOrchestrator()
	 * @generated
	 */
	EReference getOrchestrator_Function();

	/**
	 * Returns the meta object for the containment reference list '{@link wsmodel3.Orchestrator#getOutputorchestrator <em>Outputorchestrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputorchestrator</em>'.
	 * @see wsmodel3.Orchestrator#getOutputorchestrator()
	 * @see #getOrchestrator()
	 * @generated
	 */
	EReference getOrchestrator_Outputorchestrator();

	/**
	 * Returns the meta object for the attribute '{@link wsmodel3.Orchestrator#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see wsmodel3.Orchestrator#getPort()
	 * @see #getOrchestrator()
	 * @generated
	 */
	EAttribute getOrchestrator_Port();

	/**
	 * Returns the meta object for the reference list '{@link wsmodel3.Orchestrator#getExternalapi <em>Externalapi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Externalapi</em>'.
	 * @see wsmodel3.Orchestrator#getExternalapi()
	 * @see #getOrchestrator()
	 * @generated
	 */
	EReference getOrchestrator_Externalapi();

	/**
	 * Returns the meta object for the reference list '{@link wsmodel3.Orchestrator#getRest <em>Rest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rest</em>'.
	 * @see wsmodel3.Orchestrator#getRest()
	 * @see #getOrchestrator()
	 * @generated
	 */
	EReference getOrchestrator_Rest();

	/**
	 * Returns the meta object for class '{@link wsmodel3.InputOrchestrator <em>Input Orchestrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Orchestrator</em>'.
	 * @see wsmodel3.InputOrchestrator
	 * @generated
	 */
	EClass getInputOrchestrator();

	/**
	 * Returns the meta object for the attribute '{@link wsmodel3.InputOrchestrator#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see wsmodel3.InputOrchestrator#getURI()
	 * @see #getInputOrchestrator()
	 * @generated
	 */
	EAttribute getInputOrchestrator_URI();

	/**
	 * Returns the meta object for class '{@link wsmodel3.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see wsmodel3.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link wsmodel3.Function#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see wsmodel3.Function#getExpression()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Expression();

	/**
	 * Returns the meta object for the reference '{@link wsmodel3.Function#getInputorchestrator <em>Inputorchestrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inputorchestrator</em>'.
	 * @see wsmodel3.Function#getInputorchestrator()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Inputorchestrator();

	/**
	 * Returns the meta object for the reference '{@link wsmodel3.Function#getOutputorchestrator <em>Outputorchestrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outputorchestrator</em>'.
	 * @see wsmodel3.Function#getOutputorchestrator()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Outputorchestrator();

	/**
	 * Returns the meta object for the containment reference list '{@link wsmodel3.Function#getBreak <em>Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Break</em>'.
	 * @see wsmodel3.Function#getBreak()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Break();

	/**
	 * Returns the meta object for class '{@link wsmodel3.OutputOrchestrator <em>Output Orchestrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Orchestrator</em>'.
	 * @see wsmodel3.OutputOrchestrator
	 * @generated
	 */
	EClass getOutputOrchestrator();

	/**
	 * Returns the meta object for the reference list '{@link wsmodel3.OutputOrchestrator#getInputorchestrator <em>Inputorchestrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputorchestrator</em>'.
	 * @see wsmodel3.OutputOrchestrator#getInputorchestrator()
	 * @see #getOutputOrchestrator()
	 * @generated
	 */
	EReference getOutputOrchestrator_Inputorchestrator();

	/**
	 * Returns the meta object for the reference '{@link wsmodel3.OutputOrchestrator#getInputbridge <em>Inputbridge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inputbridge</em>'.
	 * @see wsmodel3.OutputOrchestrator#getInputbridge()
	 * @see #getOutputOrchestrator()
	 * @generated
	 */
	EReference getOutputOrchestrator_Inputbridge();

	/**
	 * Returns the meta object for the containment reference list '{@link wsmodel3.OutputOrchestrator#getRenponsedata <em>Renponsedata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Renponsedata</em>'.
	 * @see wsmodel3.OutputOrchestrator#getRenponsedata()
	 * @see #getOutputOrchestrator()
	 * @generated
	 */
	EReference getOutputOrchestrator_Renponsedata();

	/**
	 * Returns the meta object for the reference list '{@link wsmodel3.OutputOrchestrator#getRest <em>Rest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rest</em>'.
	 * @see wsmodel3.OutputOrchestrator#getRest()
	 * @see #getOutputOrchestrator()
	 * @generated
	 */
	EReference getOutputOrchestrator_Rest();

	/**
	 * Returns the meta object for the reference list '{@link wsmodel3.OutputOrchestrator#getExternalapi <em>Externalapi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Externalapi</em>'.
	 * @see wsmodel3.OutputOrchestrator#getExternalapi()
	 * @see #getOutputOrchestrator()
	 * @generated
	 */
	EReference getOutputOrchestrator_Externalapi();

	/**
	 * Returns the meta object for class '{@link wsmodel3.OrchestratorData <em>Orchestrator Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orchestrator Data</em>'.
	 * @see wsmodel3.OrchestratorData
	 * @generated
	 */
	EClass getOrchestratorData();

	/**
	 * Returns the meta object for class '{@link wsmodel3.ExternalAPI <em>External API</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External API</em>'.
	 * @see wsmodel3.ExternalAPI
	 * @generated
	 */
	EClass getExternalAPI();

	/**
	 * Returns the meta object for the attribute '{@link wsmodel3.ExternalAPI#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see wsmodel3.ExternalAPI#getURI()
	 * @see #getExternalAPI()
	 * @generated
	 */
	EAttribute getExternalAPI_URI();

	/**
	 * Returns the meta object for class '{@link wsmodel3.Break <em>Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Break</em>'.
	 * @see wsmodel3.Break
	 * @generated
	 */
	EClass getBreak();

	/**
	 * Returns the meta object for the attribute '{@link wsmodel3.Break#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see wsmodel3.Break#getExpression()
	 * @see #getBreak()
	 * @generated
	 */
	EAttribute getBreak_Expression();

	/**
	 * Returns the meta object for enum '{@link wsmodel3.DBType <em>DB Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DB Type</em>'.
	 * @see wsmodel3.DBType
	 * @generated
	 */
	EEnum getDBType();

	/**
	 * Returns the meta object for enum '{@link wsmodel3.SensorType <em>Sensor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sensor Type</em>'.
	 * @see wsmodel3.SensorType
	 * @generated
	 */
	EEnum getSensorType();

	/**
	 * Returns the meta object for enum '{@link wsmodel3.ActuatorType <em>Actuator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Actuator Type</em>'.
	 * @see wsmodel3.ActuatorType
	 * @generated
	 */
	EEnum getActuatorType();

	/**
	 * Returns the meta object for enum '{@link wsmodel3.ControllerType <em>Controller Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Controller Type</em>'.
	 * @see wsmodel3.ControllerType
	 * @generated
	 */
	EEnum getControllerType();

	/**
	 * Returns the meta object for enum '{@link wsmodel3.PortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Port Type</em>'.
	 * @see wsmodel3.PortType
	 * @generated
	 */
	EEnum getPortType();

	/**
	 * Returns the meta object for enum '{@link wsmodel3.CommunicationType <em>Communication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Communication Type</em>'.
	 * @see wsmodel3.CommunicationType
	 * @generated
	 */
	EEnum getCommunicationType();

	/**
	 * Returns the meta object for enum '{@link wsmodel3.MessageBrokerType <em>Message Broker Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Broker Type</em>'.
	 * @see wsmodel3.MessageBrokerType
	 * @generated
	 */
	EEnum getMessageBrokerType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Wsmodel3Factory getWsmodel3Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link wsmodel3.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wsmodel3.impl.SystemImpl
		 * @see wsmodel3.impl.Wsmodel3PackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Webservice</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__WEBSERVICE = eINSTANCE.getSystem_Webservice();

		/**
		 * The meta object literal for the '<em><b>Server</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__SERVER = eINSTANCE.getSystem_Server();

		/**
		 * The meta object literal for the '<em><b>Iotnode</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__IOTNODE = eINSTANCE.getSystem_Iotnode();

		/**
		 * The meta object literal for the '<em><b>Accespoint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__ACCESPOINT = eINSTANCE.getSystem_Accespoint();

		/**
		 * The meta object literal for the '<em><b>Integrationpattern</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__INTEGRATIONPATTERN = eINSTANCE.getSystem_Integrationpattern();

		/**
		 * The meta object literal for the '<em><b>Messagebroker</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__MESSAGEBROKER = eINSTANCE.getSystem_Messagebroker();

		/**
		 * The meta object literal for the '<em><b>Externalapi</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__EXTERNALAPI = eINSTANCE.getSystem_Externalapi();

		/**
		 * The meta object literal for the '{@link wsmodel3.impl.IoTNodeImpl <em>Io TNode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wsmodel3.impl.IoTNodeImpl
		 * @see wsmodel3.impl.Wsmodel3PackageImpl#getIoTNode()
		 * @generated
		 */
		EClass IO_TNODE = eINSTANCE.getIoTNode();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_TNODE__DEVICE = eINSTANCE.getIoTNode_Device();

		/**
		 * The meta object literal for the '{@link wsmodel3.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wsmodel3.impl.ServerImpl
		 * @see wsmodel3.impl.Wsmodel3PackageImpl#getServer()
		 * @generated
		 */
		EClass SERVER = eINSTANCE.getServer();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__HOST = eINSTANCE.getServer_Host();

		/**
		 * The meta object literal for the '{@link wsmodel3.impl.WebServiceImpl <em>Web Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wsmodel3.impl.WebServiceImpl
		 * @see wsmodel3.impl.Wsmodel3PackageImpl#getWebService()
		 * @generated
		 */
		EClass WEB_SERVICE = eINSTANCE.getWebService();

		/**
		 * The meta object literal for the '<em><b>Rest</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SERVICE__REST = eINSTANCE.getWebService_Rest();

		/**
		 * The meta object literal for the '<em><b>Webserver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SERVICE__WEBSERVER = eINSTANCE.getWebService_Webserver();

		/**
		 * The meta object literal for the '<em><b>Dbserver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SERVICE__DBSERVER = eINSTANCE.getWebService_Dbserver();

		/**
		 * The meta object literal for the '{@link wsmodel3.impl.RESTImpl <em>REST</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wsmodel3.impl.RESTImpl
		 * @see wsmodel3.impl.Wsmodel3PackageImpl#getREST()
		 * @generated
		 */
		EClass REST = eINSTANCE.getREST();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST__DEVICE = eINSTANCE.getREST_Device();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST__URI = eINSTANCE.getREST_URI();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST__PORT = eINSTANCE.getREST_Port();

		/**
		 * The meta object literal for the '{@link wsmodel3.impl.WebServerImpl <em>Web Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wsmodel3.impl.WebServerImpl
		 * @see wsmodel3.impl.Wsmodel3PackageImpl#getWebServer()
		 * @generated
		 */
		EClass WEB_SERVER = eINSTANCE.getWebServer();

		/**
		 * The meta object literal for the '{@link wsmodel3.impl.DBServerImpl <em>DB Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wsmodel3.impl.DBServerImpl
		 * @see wsmodel3.impl.Wsmodel3PackageImpl#getDBServer()
		 * @generated
		 */
		EClass DB_SERVER = eINSTANCE.getDBServer();

		/**
		 * The meta object literal for the '<em><b>Usser</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_SERVER__USSER = eINSTANCE.getDBServer_Usser();

		/**
		 * The meta object literal for the '<em><b>Pass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_SERVER__PASS = eINSTANCE.getDBServer_Pass();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_SERVER__TYPE = eINSTANCE.getDBServer_Type();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_SERVER__PORT = eINSTANCE.getDBServer_Port();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_SERVER__DATABASE = eINSTANCE.getDBServer_Database();

		/**
		 * The meta object literal for the '{@link wsmodel3.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wsmodel3.impl.DeviceImpl
		 * @see wsmodel3.impl.Wsmodel3PackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__NAME = eINSTANCE.getDevice_Name();

		/**
		 * The meta object literal for the '<em><b>Devicedata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__DEVICEDATA = eINSTANCE.getDevice_Devicedata();

		/**
		 * The meta object literal for the '{@link wsmodel3.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wsmodel3.impl.SensorImpl
		 * @see wsmodel3.impl.Wsmodel3PackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__TYPE = eINSTANCE.getSensor_Type();

		/**
		 * The meta object literal for the '{@link wsmodel3.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wsmodel3.impl.ActuatorImpl
		 * @see wsmodel3.impl.Wsmodel3PackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATOR__TYPE = eINSTANCE.getActuator_Type();

		/**
		 * The meta object literal for the '{@link wsmodel3.impl.ControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wsmodel3.impl.ControllerImpl
		 * @see wsmodel3.impl.Wsmodel3PackageImpl#getController()
		 * @generated
		 */
		EClass CONTROLLER = eINSTANCE.getController();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER__TYPE = eINSTANCE.getController_Type();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__PORT = eINSTANCE.getController_Port();

		/**
		 * The meta object literal for the '<em><b>Communication</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__COMMUNICATION = eINSTANCE.getController_Communication();

		/**
		 * The meta object literal for the '{@link wsmodel3.impl.CommunicationImpl <em>Communication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wsmodel3.impl.CommunicationImpl
		 * @see wsmodel3.impl.Wsmodel3PackageImpl#getCommunication()
		 * @generated
		 */
		EClass COMMUNICATION = eINSTANCE.getCommunication();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION__TYPE = eINSTANCE.getCommunication_Type();

		/**
		 * The meta object literal for the '<em><b>Communicationdata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION__COMMUNICATIONDATA = eINSTANCE.getCommunication_Communicationdata();

		/**
		 * The meta object literal for the '<em><b>Accespoint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION__ACCESPOINT = eINSTANCE.getCommunication_Accespoint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION__NAME = eINSTANCE.getCommunication_Name();

		/**
		 * The meta object literal for the '<em><b>Messagebroker</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION__MESSAGEBROKER = eINSTANCE.getCommunication_Messagebroker();

		/**
		 * The meta object literal for the '{@link wsmodel3.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wsmodel3.impl.PortImpl
		 * @see wsmodel3.impl.Wsmodel3PackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__ID = eINSTANCE.getPort_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__TYPE = eINSTANCE.getPort_Type();

		/**
		 * The meta object literal for the '{@link wsmodel3.impl.InputPortImpl <em>Input Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wsmodel3.impl.InputPortImpl
		 * @see wsmodel3.impl.Wsmodel3PackageImpl#getInputPort()
		 * @generated
		 */
		EClass INPUT_PORT = eINSTANCE.getInputPort();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PORT__SENSOR = eINSTANCE.getInputPort_Sensor();

		/**
		 * The meta object literal for the '{@link wsmodel3.impl.OutputPortImpl <em>Output Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wsmodel3.impl.OutputPortImpl
		 * @see wsmodel3.impl.Wsmodel3PackageImpl#getOutputPort()
		 * @generated
		 */
		EClass OUTPUT_PORT = eINSTANCE.getOutputPort();

		/**
		 * The meta object literal for the '<em><b>Actuator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PORT__ACTUATOR = eINSTANCE.getOutputPort_Actuator();

		/**
		 * The meta object literal for the '{@link wsmodel3.impl.DeviceDataImpl <em>Device Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wsmodel3.impl.DeviceDataImpl
		 * @see wsmodel3.impl.Wsmodel3PackageImpl#getDeviceData()
		 * @generated
		 */
		EClass DEVICE_DATA = eINSTANCE.getDeviceData();

		/**
		 * The meta object literal for the '{@link wsmodel3.impl.CommunicationDataImpl <em>Communication Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wsmodel3.impl.CommunicationDataImpl
		 * @see wsmodel3.impl.Wsmodel3PackageImpl#getCommunicationData()
		 * @generated
		 */
		EClass COMMUNICATION_DATA = eINSTANCE.getCommunicationData();

		/**
		 * The meta object literal for the '{@link wsmodel3.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wsmodel3.impl.DataImpl
		 * @see wsmodel3.impl.Wsmodel3PackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__ID = eINSTANCE.getData_Id();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__DATE = eINSTANCE.getData_Date();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__TIME = eINSTANCE.getData_Time();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__LOCATION = eINSTANCE.getData_Location();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__ATTRIBUTE = eINSTANCE.getData_Attribute();

		/**
		 * The meta object literal for the '<em><b>Artefact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__ARTEFACT = eINSTANCE.getData_Artefact();

		/**
		 * The meta object literal for the '{@link wsmodel3.impl.AccesPointImpl <em>Acces Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wsmodel3.impl.AccesPointImpl
		 * @see wsmodel3.impl.Wsmodel3PackageImpl#getAccesPoint()
		 * @generated
		 */
		EClass ACCES_POINT = eINSTANCE.getAccesPoint();

		/**
		 * The meta object literal for the '<em><b>Ssid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCES_POINT__SSID = eINSTANCE.getAccesPoint_Ssid();

		/**
		 * The meta object literal for the '<em><b>Pass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCES_POINT__PASS = eINSTANCE.getAccesPoint_Pass();

		/**
		 * The meta object literal for the '{@link wsmodel3.impl.BridgeImpl <em>Bridge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wsmodel3.impl.BridgeImpl
		 * @see wsmodel3.impl.Wsmodel3PackageImpl#getBridge()
		 * @generated
		 */
		EClass BRIDGE = eINSTANCE.getBridge();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRIDGE__TOPIC = eINSTANCE.getBridge_Topic();

		/**
		 * The meta object literal for the '<em><b>Rest</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRIDGE__REST = eINSTANCE.getBridge_Rest();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRIDGE__HOST = eINSTANCE.getBridge_Host();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRIDGE__PORT = eINSTANCE.getBridge_Port();

		/**
		 * The meta object literal for the '{@link wsmodel3.impl.InputBridgeImpl <em>Input Bridge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wsmodel3.impl.InputBridgeImpl
		 * @see wsmodel3.impl.Wsmodel3PackageImpl#getInputBridge()
		 * @generated
		 */
		EClass INPUT_BRIDGE = eINSTANCE.getInputBridge();

		/**
		 * The meta object literal for the '<em><b>Actuator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_BRIDGE__ACTUATOR = eINSTANCE.getInputBridge_Actuator();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_BRIDGE__URI = eINSTANCE.getInputBridge_URI();

		/**
		 * The meta object literal for the '{@link wsmodel3.impl.OutputBridgeImpl <em>Output Bridge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wsmodel3.impl.OutputBridgeImpl
		 * @see wsmodel3.impl.Wsmodel3PackageImpl#getOutputBridge()
		 * @generated
		 */
		EClass OUTPUT_BRIDGE = eINSTANCE.getOutputBridge();

		/**
		 * The meta object literal for the '<em><b>Inputorchestrator</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_BRIDGE__INPUTORCHESTRATOR = eINSTANCE.getOutputBridge_Inputorchestrator();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_BRIDGE__SENSOR = eINSTANCE.getOutputBridge_Sensor();

		/**
		 * The meta object literal for the '{@link wsmodel3.impl.MessageBrokerImpl <em>Message Broker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wsmodel3.impl.MessageBrokerImpl
		 * @see wsmodel3.impl.Wsmodel3PackageImpl#getMessageBroker()
		 * @generated
		 */
		EClass MESSAGE_BROKER = eINSTANCE.getMessageBroker();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_BROKER__TYPE = eINSTANCE.getMessageBroker_Type();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_BROKER__PORT = eINSTANCE.getMessageBroker_Port();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_BROKER__HOST = eINSTANCE.getMessageBroker_Host();

		/**
		 * The meta object literal for the '<em><b>Bridge</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_BROKER__BRIDGE = eINSTANCE.getMessageBroker_Bridge();

		/**
		 * The meta object literal for the '<em><b>Usser</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_BROKER__USSER = eINSTANCE.getMessageBroker_Usser();

		/**
		 * The meta object literal for the '<em><b>Pass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_BROKER__PASS = eINSTANCE.getMessageBroker_Pass();

		/**
		 * The meta object literal for the '{@link wsmodel3.impl.IntegrationPatternImpl <em>Integration Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wsmodel3.impl.IntegrationPatternImpl
		 * @see wsmodel3.impl.Wsmodel3PackageImpl#getIntegrationPattern()
		 * @generated
		 */
		EClass INTEGRATION_PATTERN = eINSTANCE.getIntegrationPattern();

		/**
		 * The meta object literal for the '<em><b>Orchestrator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRATION_PATTERN__ORCHESTRATOR = eINSTANCE.getIntegrationPattern_Orchestrator();

		/**
		 * The meta object literal for the '<em><b>Webserver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRATION_PATTERN__WEBSERVER = eINSTANCE.getIntegrationPattern_Webserver();

		/**
		 * The meta object literal for the '{@link wsmodel3.impl.OrchestratorImpl <em>Orchestrator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wsmodel3.impl.OrchestratorImpl
		 * @see wsmodel3.impl.Wsmodel3PackageImpl#getOrchestrator()
		 * @generated
		 */
		EClass ORCHESTRATOR = eINSTANCE.getOrchestrator();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORCHESTRATOR__NAME = eINSTANCE.getOrchestrator_Name();

		/**
		 * The meta object literal for the '<em><b>Inputorchestrator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORCHESTRATOR__INPUTORCHESTRATOR = eINSTANCE.getOrchestrator_Inputorchestrator();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORCHESTRATOR__FUNCTION = eINSTANCE.getOrchestrator_Function();

		/**
		 * The meta object literal for the '<em><b>Outputorchestrator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORCHESTRATOR__OUTPUTORCHESTRATOR = eINSTANCE.getOrchestrator_Outputorchestrator();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORCHESTRATOR__PORT = eINSTANCE.getOrchestrator_Port();

		/**
		 * The meta object literal for the '<em><b>Externalapi</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORCHESTRATOR__EXTERNALAPI = eINSTANCE.getOrchestrator_Externalapi();

		/**
		 * The meta object literal for the '<em><b>Rest</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORCHESTRATOR__REST = eINSTANCE.getOrchestrator_Rest();

		/**
		 * The meta object literal for the '{@link wsmodel3.impl.InputOrchestratorImpl <em>Input Orchestrator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wsmodel3.impl.InputOrchestratorImpl
		 * @see wsmodel3.impl.Wsmodel3PackageImpl#getInputOrchestrator()
		 * @generated
		 */
		EClass INPUT_ORCHESTRATOR = eINSTANCE.getInputOrchestrator();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_ORCHESTRATOR__URI = eINSTANCE.getInputOrchestrator_URI();

		/**
		 * The meta object literal for the '{@link wsmodel3.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wsmodel3.impl.FunctionImpl
		 * @see wsmodel3.impl.Wsmodel3PackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__EXPRESSION = eINSTANCE.getFunction_Expression();

		/**
		 * The meta object literal for the '<em><b>Inputorchestrator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__INPUTORCHESTRATOR = eINSTANCE.getFunction_Inputorchestrator();

		/**
		 * The meta object literal for the '<em><b>Outputorchestrator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__OUTPUTORCHESTRATOR = eINSTANCE.getFunction_Outputorchestrator();

		/**
		 * The meta object literal for the '<em><b>Break</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__BREAK = eINSTANCE.getFunction_Break();

		/**
		 * The meta object literal for the '{@link wsmodel3.impl.OutputOrchestratorImpl <em>Output Orchestrator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wsmodel3.impl.OutputOrchestratorImpl
		 * @see wsmodel3.impl.Wsmodel3PackageImpl#getOutputOrchestrator()
		 * @generated
		 */
		EClass OUTPUT_ORCHESTRATOR = eINSTANCE.getOutputOrchestrator();

		/**
		 * The meta object literal for the '<em><b>Inputorchestrator</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_ORCHESTRATOR__INPUTORCHESTRATOR = eINSTANCE.getOutputOrchestrator_Inputorchestrator();

		/**
		 * The meta object literal for the '<em><b>Inputbridge</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_ORCHESTRATOR__INPUTBRIDGE = eINSTANCE.getOutputOrchestrator_Inputbridge();

		/**
		 * The meta object literal for the '<em><b>Renponsedata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_ORCHESTRATOR__RENPONSEDATA = eINSTANCE.getOutputOrchestrator_Renponsedata();

		/**
		 * The meta object literal for the '<em><b>Rest</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_ORCHESTRATOR__REST = eINSTANCE.getOutputOrchestrator_Rest();

		/**
		 * The meta object literal for the '<em><b>Externalapi</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_ORCHESTRATOR__EXTERNALAPI = eINSTANCE.getOutputOrchestrator_Externalapi();

		/**
		 * The meta object literal for the '{@link wsmodel3.impl.OrchestratorDataImpl <em>Orchestrator Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wsmodel3.impl.OrchestratorDataImpl
		 * @see wsmodel3.impl.Wsmodel3PackageImpl#getOrchestratorData()
		 * @generated
		 */
		EClass ORCHESTRATOR_DATA = eINSTANCE.getOrchestratorData();

		/**
		 * The meta object literal for the '{@link wsmodel3.impl.ExternalAPIImpl <em>External API</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wsmodel3.impl.ExternalAPIImpl
		 * @see wsmodel3.impl.Wsmodel3PackageImpl#getExternalAPI()
		 * @generated
		 */
		EClass EXTERNAL_API = eINSTANCE.getExternalAPI();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_API__URI = eINSTANCE.getExternalAPI_URI();

		/**
		 * The meta object literal for the '{@link wsmodel3.impl.BreakImpl <em>Break</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wsmodel3.impl.BreakImpl
		 * @see wsmodel3.impl.Wsmodel3PackageImpl#getBreak()
		 * @generated
		 */
		EClass BREAK = eINSTANCE.getBreak();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BREAK__EXPRESSION = eINSTANCE.getBreak_Expression();

		/**
		 * The meta object literal for the '{@link wsmodel3.DBType <em>DB Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wsmodel3.DBType
		 * @see wsmodel3.impl.Wsmodel3PackageImpl#getDBType()
		 * @generated
		 */
		EEnum DB_TYPE = eINSTANCE.getDBType();

		/**
		 * The meta object literal for the '{@link wsmodel3.SensorType <em>Sensor Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wsmodel3.SensorType
		 * @see wsmodel3.impl.Wsmodel3PackageImpl#getSensorType()
		 * @generated
		 */
		EEnum SENSOR_TYPE = eINSTANCE.getSensorType();

		/**
		 * The meta object literal for the '{@link wsmodel3.ActuatorType <em>Actuator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wsmodel3.ActuatorType
		 * @see wsmodel3.impl.Wsmodel3PackageImpl#getActuatorType()
		 * @generated
		 */
		EEnum ACTUATOR_TYPE = eINSTANCE.getActuatorType();

		/**
		 * The meta object literal for the '{@link wsmodel3.ControllerType <em>Controller Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wsmodel3.ControllerType
		 * @see wsmodel3.impl.Wsmodel3PackageImpl#getControllerType()
		 * @generated
		 */
		EEnum CONTROLLER_TYPE = eINSTANCE.getControllerType();

		/**
		 * The meta object literal for the '{@link wsmodel3.PortType <em>Port Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wsmodel3.PortType
		 * @see wsmodel3.impl.Wsmodel3PackageImpl#getPortType()
		 * @generated
		 */
		EEnum PORT_TYPE = eINSTANCE.getPortType();

		/**
		 * The meta object literal for the '{@link wsmodel3.CommunicationType <em>Communication Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wsmodel3.CommunicationType
		 * @see wsmodel3.impl.Wsmodel3PackageImpl#getCommunicationType()
		 * @generated
		 */
		EEnum COMMUNICATION_TYPE = eINSTANCE.getCommunicationType();

		/**
		 * The meta object literal for the '{@link wsmodel3.MessageBrokerType <em>Message Broker Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wsmodel3.MessageBrokerType
		 * @see wsmodel3.impl.Wsmodel3PackageImpl#getMessageBrokerType()
		 * @generated
		 */
		EEnum MESSAGE_BROKER_TYPE = eINSTANCE.getMessageBrokerType();

	}

} //Wsmodel3Package
