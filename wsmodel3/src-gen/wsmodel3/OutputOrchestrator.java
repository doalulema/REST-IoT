/**
 */
package wsmodel3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Orchestrator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wsmodel3.OutputOrchestrator#getInputorchestrator <em>Inputorchestrator</em>}</li>
 *   <li>{@link wsmodel3.OutputOrchestrator#getInputbridge <em>Inputbridge</em>}</li>
 *   <li>{@link wsmodel3.OutputOrchestrator#getRenponsedata <em>Renponsedata</em>}</li>
 *   <li>{@link wsmodel3.OutputOrchestrator#getRest <em>Rest</em>}</li>
 *   <li>{@link wsmodel3.OutputOrchestrator#getExternalapi <em>Externalapi</em>}</li>
 * </ul>
 *
 * @see wsmodel3.Wsmodel3Package#getOutputOrchestrator()
 * @model
 * @generated
 */
public interface OutputOrchestrator extends EObject {
	/**
	 * Returns the value of the '<em><b>Inputorchestrator</b></em>' reference list.
	 * The list contents are of type {@link wsmodel3.InputOrchestrator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputorchestrator</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputorchestrator</em>' reference list.
	 * @see wsmodel3.Wsmodel3Package#getOutputOrchestrator_Inputorchestrator()
	 * @model
	 * @generated
	 */
	EList<InputOrchestrator> getInputorchestrator();

	/**
	 * Returns the value of the '<em><b>Inputbridge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputbridge</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputbridge</em>' reference.
	 * @see #setInputbridge(InputBridge)
	 * @see wsmodel3.Wsmodel3Package#getOutputOrchestrator_Inputbridge()
	 * @model
	 * @generated
	 */
	InputBridge getInputbridge();

	/**
	 * Sets the value of the '{@link wsmodel3.OutputOrchestrator#getInputbridge <em>Inputbridge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inputbridge</em>' reference.
	 * @see #getInputbridge()
	 * @generated
	 */
	void setInputbridge(InputBridge value);

	/**
	 * Returns the value of the '<em><b>Renponsedata</b></em>' containment reference list.
	 * The list contents are of type {@link wsmodel3.OrchestratorData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Renponsedata</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Renponsedata</em>' containment reference list.
	 * @see wsmodel3.Wsmodel3Package#getOutputOrchestrator_Renponsedata()
	 * @model containment="true"
	 * @generated
	 */
	EList<OrchestratorData> getRenponsedata();

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
	 * @see wsmodel3.Wsmodel3Package#getOutputOrchestrator_Rest()
	 * @model
	 * @generated
	 */
	EList<REST> getRest();

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
	 * @see wsmodel3.Wsmodel3Package#getOutputOrchestrator_Externalapi()
	 * @model
	 * @generated
	 */
	EList<ExternalAPI> getExternalapi();

} // OutputOrchestrator
