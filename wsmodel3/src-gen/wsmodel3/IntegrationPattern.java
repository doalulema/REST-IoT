/**
 */
package wsmodel3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integration Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wsmodel3.IntegrationPattern#getOrchestrator <em>Orchestrator</em>}</li>
 *   <li>{@link wsmodel3.IntegrationPattern#getWebserver <em>Webserver</em>}</li>
 * </ul>
 *
 * @see wsmodel3.Wsmodel3Package#getIntegrationPattern()
 * @model
 * @generated
 */
public interface IntegrationPattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Orchestrator</b></em>' containment reference list.
	 * The list contents are of type {@link wsmodel3.Orchestrator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orchestrator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orchestrator</em>' containment reference list.
	 * @see wsmodel3.Wsmodel3Package#getIntegrationPattern_Orchestrator()
	 * @model containment="true"
	 * @generated
	 */
	EList<Orchestrator> getOrchestrator();

	/**
	 * Returns the value of the '<em><b>Webserver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Webserver</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Webserver</em>' reference.
	 * @see #setWebserver(WebServer)
	 * @see wsmodel3.Wsmodel3Package#getIntegrationPattern_Webserver()
	 * @model required="true"
	 * @generated
	 */
	WebServer getWebserver();

	/**
	 * Sets the value of the '{@link wsmodel3.IntegrationPattern#getWebserver <em>Webserver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Webserver</em>' reference.
	 * @see #getWebserver()
	 * @generated
	 */
	void setWebserver(WebServer value);

} // IntegrationPattern
