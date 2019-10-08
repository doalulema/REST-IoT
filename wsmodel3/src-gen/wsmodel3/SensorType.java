/**
 */
package wsmodel3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sensor Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see wsmodel3.Wsmodel3Package#getSensorType()
 * @model
 * @generated
 */
public enum SensorType implements Enumerator {
	/**
	 * The '<em><b>Undefined</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	UNDEFINED(0, "Undefined", "Undefined"),

	/**
	 * The '<em><b>CO2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CO2_VALUE
	 * @generated
	 * @ordered
	 */
	CO2(1, "CO2", "CO2"),

	/**
	 * The '<em><b>Light</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	LIGHT(2, "Light", "Light"),

	/**
	 * The '<em><b>Button</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUTTON_VALUE
	 * @generated
	 * @ordered
	 */
	BUTTON(3, "Button", "Button"),

	/**
	 * The '<em><b>Humidity G</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HUMIDITY_G_VALUE
	 * @generated
	 * @ordered
	 */
	HUMIDITY_G(4, "HumidityG", "HumidityG"),
	/**
	 * The '<em><b>Vibration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #VIBRATION_VALUE
	 * @generated
	 * @ordered
	 */
	VIBRATION(5, "Vibration", "Vibration"),

	/**
	 * The '<em><b>Temperature</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPERATURE_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPERATURE(6, "Temperature", "Temperature"),

	/**
	 * The '<em><b>Movement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	MOVEMENT(7, "Movement", "Movement"),

	/**
	 * The '<em><b>Contact</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTACT_VALUE
	 * @generated
	 * @ordered
	 */
	CONTACT(8, "Contact", "Contact"),
	/**
	 * The '<em><b>Temp Hum</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #TEMP_HUM_VALUE
	 * @generated
	 * @ordered
	 */
	TEMP_HUM(9, "TempHum", "TempHum");

	/**
	 * The '<em><b>Undefined</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Undefined</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED
	 * @model name="Undefined"
	 * @generated
	 * @ordered
	 */
	public static final int UNDEFINED_VALUE = 0;

	/**
	 * The '<em><b>CO2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CO2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CO2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CO2_VALUE = 1;

	/**
	 * The '<em><b>Light</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Light</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIGHT
	 * @model name="Light"
	 * @generated
	 * @ordered
	 */
	public static final int LIGHT_VALUE = 2;

	/**
	 * The '<em><b>Button</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Button</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUTTON
	 * @model name="Button"
	 * @generated
	 * @ordered
	 */
	public static final int BUTTON_VALUE = 3;

	/**
	 * The '<em><b>Humidity G</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Humidity G</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HUMIDITY_G
	 * @model name="HumidityG"
	 * @generated
	 * @ordered
	 */
	public static final int HUMIDITY_G_VALUE = 4;

	/**
	 * The '<em><b>Vibration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vibration</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VIBRATION
	 * @model name="Vibration"
	 * @generated
	 * @ordered
	 */
	public static final int VIBRATION_VALUE = 5;

	/**
	 * The '<em><b>Temperature</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Temperature</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEMPERATURE
	 * @model name="Temperature"
	 * @generated
	 * @ordered
	 */
	public static final int TEMPERATURE_VALUE = 6;

	/**
	 * The '<em><b>Movement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Movement</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOVEMENT
	 * @model name="Movement"
	 * @generated
	 * @ordered
	 */
	public static final int MOVEMENT_VALUE = 7;

	/**
	 * The '<em><b>Contact</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Contact</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTACT
	 * @model name="Contact"
	 * @generated
	 * @ordered
	 */
	public static final int CONTACT_VALUE = 8;

	/**
	 * The '<em><b>Temp Hum</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Temp Hum</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEMP_HUM
	 * @model name="TempHum"
	 * @generated
	 * @ordered
	 */
	public static final int TEMP_HUM_VALUE = 9;

	/**
	 * An array of all the '<em><b>Sensor Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SensorType[] VALUES_ARRAY = new SensorType[] { UNDEFINED, CO2, LIGHT, BUTTON, HUMIDITY_G,
			VIBRATION, TEMPERATURE, MOVEMENT, CONTACT, TEMP_HUM, };

	/**
	 * A public read-only list of all the '<em><b>Sensor Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SensorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sensor Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SensorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SensorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sensor Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SensorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SensorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sensor Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SensorType get(int value) {
		switch (value) {
		case UNDEFINED_VALUE:
			return UNDEFINED;
		case CO2_VALUE:
			return CO2;
		case LIGHT_VALUE:
			return LIGHT;
		case BUTTON_VALUE:
			return BUTTON;
		case HUMIDITY_G_VALUE:
			return HUMIDITY_G;
		case VIBRATION_VALUE:
			return VIBRATION;
		case TEMPERATURE_VALUE:
			return TEMPERATURE;
		case MOVEMENT_VALUE:
			return MOVEMENT;
		case CONTACT_VALUE:
			return CONTACT;
		case TEMP_HUM_VALUE:
			return TEMP_HUM;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SensorType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //SensorType
