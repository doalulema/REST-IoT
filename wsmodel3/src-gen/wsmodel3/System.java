/**
 */
package wsmodel3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wsmodel3.System#getName <em>Name</em>}</li>
 *   <li>{@link wsmodel3.System#getWebservice <em>Webservice</em>}</li>
 *   <li>{@link wsmodel3.System#getServer <em>Server</em>}</li>
 *   <li>{@link wsmodel3.System#getIotnode <em>Iotnode</em>}</li>
 *   <li>{@link wsmodel3.System#getAccespoint <em>Accespoint</em>}</li>
 *   <li>{@link wsmodel3.System#getIntegrationpattern <em>Integrationpattern</em>}</li>
 *   <li>{@link wsmodel3.System#getMessagebroker <em>Messagebroker</em>}</li>
 *   <li>{@link wsmodel3.System#getExternalapi <em>Externalapi</em>}</li>
 * </ul>
 *
 * @see wsmodel3.Wsmodel3Package#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see wsmodel3.Wsmodel3Package#getSystem_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link wsmodel3.System#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Webservice</b></em>' containment reference list.
	 * The list contents are of type {@link wsmodel3.WebService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Webservice</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Webservice</em>' containment reference list.
	 * @see wsmodel3.Wsmodel3Package#getSystem_Webservice()
	 * @model containment="true"
	 * @generated
	 */
	EList<WebService> getWebservice();

	/**
	 * Returns the value of the '<em><b>Server</b></em>' containment reference list.
	 * The list contents are of type {@link wsmodel3.Server}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' containment reference list.
	 * @see wsmodel3.Wsmodel3Package#getSystem_Server()
	 * @model containment="true"
	 * @generated
	 */
	EList<Server> getServer();

	/**
	 * Returns the value of the '<em><b>Iotnode</b></em>' containment reference list.
	 * The list contents are of type {@link wsmodel3.IoTNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iotnode</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iotnode</em>' containment reference list.
	 * @see wsmodel3.Wsmodel3Package#getSystem_Iotnode()
	 * @model containment="true"
	 * @generated
	 */
	EList<IoTNode> getIotnode();

	/**
	 * Returns the value of the '<em><b>Accespoint</b></em>' containment reference list.
	 * The list contents are of type {@link wsmodel3.AccesPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accespoint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accespoint</em>' containment reference list.
	 * @see wsmodel3.Wsmodel3Package#getSystem_Accespoint()
	 * @model containment="true"
	 * @generated
	 */
	EList<AccesPoint> getAccespoint();

	/**
	 * Returns the value of the '<em><b>Integrationpattern</b></em>' containment reference list.
	 * The list contents are of type {@link wsmodel3.IntegrationPattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integrationpattern</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integrationpattern</em>' containment reference list.
	 * @see wsmodel3.Wsmodel3Package#getSystem_Integrationpattern()
	 * @model containment="true"
	 * @generated
	 */
	EList<IntegrationPattern> getIntegrationpattern();

	/**
	 * Returns the value of the '<em><b>Messagebroker</b></em>' containment reference list.
	 * The list contents are of type {@link wsmodel3.MessageBroker}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Messagebroker</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messagebroker</em>' containment reference list.
	 * @see wsmodel3.Wsmodel3Package#getSystem_Messagebroker()
	 * @model containment="true"
	 * @generated
	 */
	EList<MessageBroker> getMessagebroker();

	/**
	 * Returns the value of the '<em><b>Externalapi</b></em>' containment reference list.
	 * The list contents are of type {@link wsmodel3.ExternalAPI}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Externalapi</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Externalapi</em>' containment reference list.
	 * @see wsmodel3.Wsmodel3Package#getSystem_Externalapi()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalAPI> getExternalapi();

} // System
