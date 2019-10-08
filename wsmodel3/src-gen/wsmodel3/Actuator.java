/**
 */
package wsmodel3;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wsmodel3.Actuator#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see wsmodel3.Wsmodel3Package#getActuator()
 * @model
 * @generated
 */
public interface Actuator extends Device {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link wsmodel3.ActuatorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see wsmodel3.ActuatorType
	 * @see #setType(ActuatorType)
	 * @see wsmodel3.Wsmodel3Package#getActuator_Type()
	 * @model required="true"
	 * @generated
	 */
	ActuatorType getType();

	/**
	 * Sets the value of the '{@link wsmodel3.Actuator#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see wsmodel3.ActuatorType
	 * @see #getType()
	 * @generated
	 */
	void setType(ActuatorType value);

} // Actuator
