/**
 */
package wsmodel3;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Bridge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wsmodel3.InputBridge#getActuator <em>Actuator</em>}</li>
 *   <li>{@link wsmodel3.InputBridge#getURI <em>URI</em>}</li>
 * </ul>
 *
 * @see wsmodel3.Wsmodel3Package#getInputBridge()
 * @model
 * @generated
 */
public interface InputBridge extends Bridge {
	/**
	 * Returns the value of the '<em><b>Actuator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actuator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuator</em>' reference.
	 * @see #setActuator(Actuator)
	 * @see wsmodel3.Wsmodel3Package#getInputBridge_Actuator()
	 * @model
	 * @generated
	 */
	Actuator getActuator();

	/**
	 * Sets the value of the '{@link wsmodel3.InputBridge#getActuator <em>Actuator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuator</em>' reference.
	 * @see #getActuator()
	 * @generated
	 */
	void setActuator(Actuator value);

	/**
	 * Returns the value of the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URI</em>' attribute.
	 * @see #setURI(String)
	 * @see wsmodel3.Wsmodel3Package#getInputBridge_URI()
	 * @model required="true"
	 * @generated
	 */
	String getURI();

	/**
	 * Sets the value of the '{@link wsmodel3.InputBridge#getURI <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URI</em>' attribute.
	 * @see #getURI()
	 * @generated
	 */
	void setURI(String value);

} // InputBridge
