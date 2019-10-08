/**
 */
package wsmodel3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orchestrator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wsmodel3.Orchestrator#getName <em>Name</em>}</li>
 *   <li>{@link wsmodel3.Orchestrator#getInputorchestrator <em>Inputorchestrator</em>}</li>
 *   <li>{@link wsmodel3.Orchestrator#getFunction <em>Function</em>}</li>
 *   <li>{@link wsmodel3.Orchestrator#getOutputorchestrator <em>Outputorchestrator</em>}</li>
 *   <li>{@link wsmodel3.Orchestrator#getPort <em>Port</em>}</li>
 *   <li>{@link wsmodel3.Orchestrator#getExternalapi <em>Externalapi</em>}</li>
 *   <li>{@link wsmodel3.Orchestrator#getRest <em>Rest</em>}</li>
 * </ul>
 *
 * @see wsmodel3.Wsmodel3Package#getOrchestrator()
 * @model
 * @generated
 */
public interface Orchestrator extends EObject {
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
	 * @see wsmodel3.Wsmodel3Package#getOrchestrator_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link wsmodel3.Orchestrator#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Inputorchestrator</b></em>' containment reference list.
	 * The list contents are of type {@link wsmodel3.InputOrchestrator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputorchestrator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputorchestrator</em>' containment reference list.
	 * @see wsmodel3.Wsmodel3Package#getOrchestrator_Inputorchestrator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InputOrchestrator> getInputorchestrator();

	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference list.
	 * The list contents are of type {@link wsmodel3.Function}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference list.
	 * @see wsmodel3.Wsmodel3Package#getOrchestrator_Function()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Function> getFunction();

	/**
	 * Returns the value of the '<em><b>Outputorchestrator</b></em>' containment reference list.
	 * The list contents are of type {@link wsmodel3.OutputOrchestrator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputorchestrator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputorchestrator</em>' containment reference list.
	 * @see wsmodel3.Wsmodel3Package#getOrchestrator_Outputorchestrator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<OutputOrchestrator> getOutputorchestrator();

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(String)
	 * @see wsmodel3.Wsmodel3Package#getOrchestrator_Port()
	 * @model required="true"
	 * @generated
	 */
	String getPort();

	/**
	 * Sets the value of the '{@link wsmodel3.Orchestrator#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(String value);

	/**
	 * Returns the value of the '<em><b>Externalapi</b></em>' reference list.
	 * The list contents are of type {@link wsmodel3.ExternalAPI}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Externalapi</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Externalapi</em>' reference list.
	 * @see wsmodel3.Wsmodel3Package#getOrchestrator_Externalapi()
	 * @model
	 * @generated
	 */
	EList<ExternalAPI> getExternalapi();

	/**
	 * Returns the value of the '<em><b>Rest</b></em>' reference list.
	 * The list contents are of type {@link wsmodel3.REST}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rest</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest</em>' reference list.
	 * @see wsmodel3.Wsmodel3Package#getOrchestrator_Rest()
	 * @model
	 * @generated
	 */
	EList<REST> getRest();

} // Orchestrator
