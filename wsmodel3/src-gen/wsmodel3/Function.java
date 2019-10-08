/**
 */
package wsmodel3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wsmodel3.Function#getExpression <em>Expression</em>}</li>
 *   <li>{@link wsmodel3.Function#getInputorchestrator <em>Inputorchestrator</em>}</li>
 *   <li>{@link wsmodel3.Function#getOutputorchestrator <em>Outputorchestrator</em>}</li>
 *   <li>{@link wsmodel3.Function#getBreak <em>Break</em>}</li>
 * </ul>
 *
 * @see wsmodel3.Wsmodel3Package#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see wsmodel3.Wsmodel3Package#getFunction_Expression()
	 * @model required="true"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link wsmodel3.Function#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Returns the value of the '<em><b>Inputorchestrator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputorchestrator</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputorchestrator</em>' reference.
	 * @see #setInputorchestrator(InputOrchestrator)
	 * @see wsmodel3.Wsmodel3Package#getFunction_Inputorchestrator()
	 * @model required="true"
	 * @generated
	 */
	InputOrchestrator getInputorchestrator();

	/**
	 * Sets the value of the '{@link wsmodel3.Function#getInputorchestrator <em>Inputorchestrator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inputorchestrator</em>' reference.
	 * @see #getInputorchestrator()
	 * @generated
	 */
	void setInputorchestrator(InputOrchestrator value);

	/**
	 * Returns the value of the '<em><b>Outputorchestrator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputorchestrator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputorchestrator</em>' reference.
	 * @see #setOutputorchestrator(OutputOrchestrator)
	 * @see wsmodel3.Wsmodel3Package#getFunction_Outputorchestrator()
	 * @model required="true"
	 * @generated
	 */
	OutputOrchestrator getOutputorchestrator();

	/**
	 * Sets the value of the '{@link wsmodel3.Function#getOutputorchestrator <em>Outputorchestrator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outputorchestrator</em>' reference.
	 * @see #getOutputorchestrator()
	 * @generated
	 */
	void setOutputorchestrator(OutputOrchestrator value);

	/**
	 * Returns the value of the '<em><b>Break</b></em>' containment reference list.
	 * The list contents are of type {@link wsmodel3.Break}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Break</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Break</em>' containment reference list.
	 * @see wsmodel3.Wsmodel3Package#getFunction_Break()
	 * @model containment="true"
	 * @generated
	 */
	EList<Break> getBreak();

} // Function
