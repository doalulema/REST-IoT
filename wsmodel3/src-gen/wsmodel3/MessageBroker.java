/**
 */
package wsmodel3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Broker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wsmodel3.MessageBroker#getType <em>Type</em>}</li>
 *   <li>{@link wsmodel3.MessageBroker#getPort <em>Port</em>}</li>
 *   <li>{@link wsmodel3.MessageBroker#getHost <em>Host</em>}</li>
 *   <li>{@link wsmodel3.MessageBroker#getBridge <em>Bridge</em>}</li>
 *   <li>{@link wsmodel3.MessageBroker#getUsser <em>Usser</em>}</li>
 *   <li>{@link wsmodel3.MessageBroker#getPass <em>Pass</em>}</li>
 * </ul>
 *
 * @see wsmodel3.Wsmodel3Package#getMessageBroker()
 * @model
 * @generated
 */
public interface MessageBroker extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link wsmodel3.MessageBrokerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see wsmodel3.MessageBrokerType
	 * @see #setType(MessageBrokerType)
	 * @see wsmodel3.Wsmodel3Package#getMessageBroker_Type()
	 * @model required="true"
	 * @generated
	 */
	MessageBrokerType getType();

	/**
	 * Sets the value of the '{@link wsmodel3.MessageBroker#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see wsmodel3.MessageBrokerType
	 * @see #getType()
	 * @generated
	 */
	void setType(MessageBrokerType value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see wsmodel3.Wsmodel3Package#getMessageBroker_Port()
	 * @model required="true"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link wsmodel3.MessageBroker#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see wsmodel3.Wsmodel3Package#getMessageBroker_Host()
	 * @model required="true"
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link wsmodel3.MessageBroker#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Bridge</b></em>' containment reference list.
	 * The list contents are of type {@link wsmodel3.Bridge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bridge</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bridge</em>' containment reference list.
	 * @see wsmodel3.Wsmodel3Package#getMessageBroker_Bridge()
	 * @model containment="true"
	 * @generated
	 */
	EList<Bridge> getBridge();

	/**
	 * Returns the value of the '<em><b>Usser</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usser</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usser</em>' attribute.
	 * @see #setUsser(String)
	 * @see wsmodel3.Wsmodel3Package#getMessageBroker_Usser()
	 * @model
	 * @generated
	 */
	String getUsser();

	/**
	 * Sets the value of the '{@link wsmodel3.MessageBroker#getUsser <em>Usser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usser</em>' attribute.
	 * @see #getUsser()
	 * @generated
	 */
	void setUsser(String value);

	/**
	 * Returns the value of the '<em><b>Pass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pass</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pass</em>' attribute.
	 * @see #setPass(String)
	 * @see wsmodel3.Wsmodel3Package#getMessageBroker_Pass()
	 * @model
	 * @generated
	 */
	String getPass();

	/**
	 * Sets the value of the '{@link wsmodel3.MessageBroker#getPass <em>Pass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pass</em>' attribute.
	 * @see #getPass()
	 * @generated
	 */
	void setPass(String value);

} // MessageBroker
