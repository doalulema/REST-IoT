/**
 */
package wsmodel3;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wsmodel3.Sensor#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see wsmodel3.Wsmodel3Package#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends Device {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link wsmodel3.SensorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see wsmodel3.SensorType
	 * @see #setType(SensorType)
	 * @see wsmodel3.Wsmodel3Package#getSensor_Type()
	 * @model required="true"
	 * @generated
	 */
	SensorType getType();

	/**
	 * Sets the value of the '{@link wsmodel3.Sensor#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see wsmodel3.SensorType
	 * @see #getType()
	 * @generated
	 */
	void setType(SensorType value);

} // Sensor
