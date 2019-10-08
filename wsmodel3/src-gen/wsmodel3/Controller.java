/**
 */
package wsmodel3;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wsmodel3.Controller#getType <em>Type</em>}</li>
 *   <li>{@link wsmodel3.Controller#getPort <em>Port</em>}</li>
 *   <li>{@link wsmodel3.Controller#getCommunication <em>Communication</em>}</li>
 * </ul>
 *
 * @see wsmodel3.Wsmodel3Package#getController()
 * @model
 * @generated
 */
public interface Controller extends Device {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link wsmodel3.ControllerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see wsmodel3.ControllerType
	 * @see #setType(ControllerType)
	 * @see wsmodel3.Wsmodel3Package#getController_Type()
	 * @model required="true"
	 * @generated
	 */
	ControllerType getType();

	/**
	 * Sets the value of the '{@link wsmodel3.Controller#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see wsmodel3.ControllerType
	 * @see #getType()
	 * @generated
	 */
	void setType(ControllerType value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link wsmodel3.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see wsmodel3.Wsmodel3Package#getController_Port()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPort();

	/**
	 * Returns the value of the '<em><b>Communication</b></em>' containment reference list.
	 * The list contents are of type {@link wsmodel3.Communication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication</em>' containment reference list.
	 * @see wsmodel3.Wsmodel3Package#getController_Communication()
	 * @model containment="true"
	 * @generated
	 */
	EList<Communication> getCommunication();

} // Controller
