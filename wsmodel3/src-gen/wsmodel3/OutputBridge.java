/**
 */
package wsmodel3;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Bridge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wsmodel3.OutputBridge#getInputorchestrator <em>Inputorchestrator</em>}</li>
 *   <li>{@link wsmodel3.OutputBridge#getSensor <em>Sensor</em>}</li>
 * </ul>
 *
 * @see wsmodel3.Wsmodel3Package#getOutputBridge()
 * @model
 * @generated
 */
public interface OutputBridge extends Bridge {
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
	 * @see wsmodel3.Wsmodel3Package#getOutputBridge_Inputorchestrator()
	 * @model
	 * @generated
	 */
	EList<InputOrchestrator> getInputorchestrator();

	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' reference.
	 * @see #setSensor(Sensor)
	 * @see wsmodel3.Wsmodel3Package#getOutputBridge_Sensor()
	 * @model
	 * @generated
	 */
	Sensor getSensor();

	/**
	 * Sets the value of the '{@link wsmodel3.OutputBridge#getSensor <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor</em>' reference.
	 * @see #getSensor()
	 * @generated
	 */
	void setSensor(Sensor value);

} // OutputBridge
