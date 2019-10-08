/**
 */
package wsmodel3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bridge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wsmodel3.Bridge#getTopic <em>Topic</em>}</li>
 *   <li>{@link wsmodel3.Bridge#getRest <em>Rest</em>}</li>
 *   <li>{@link wsmodel3.Bridge#getHost <em>Host</em>}</li>
 *   <li>{@link wsmodel3.Bridge#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see wsmodel3.Wsmodel3Package#getBridge()
 * @model abstract="true"
 * @generated
 */
public interface Bridge extends EObject {
	/**
	 * Returns the value of the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic</em>' attribute.
	 * @see #setTopic(String)
	 * @see wsmodel3.Wsmodel3Package#getBridge_Topic()
	 * @model required="true"
	 * @generated
	 */
	String getTopic();

	/**
	 * Sets the value of the '{@link wsmodel3.Bridge#getTopic <em>Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic</em>' attribute.
	 * @see #getTopic()
	 * @generated
	 */
	void setTopic(String value);

	/**
	 * Returns the value of the '<em><b>Rest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rest</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest</em>' reference.
	 * @see #setRest(REST)
	 * @see wsmodel3.Wsmodel3Package#getBridge_Rest()
	 * @model
	 * @generated
	 */
	REST getRest();

	/**
	 * Sets the value of the '{@link wsmodel3.Bridge#getRest <em>Rest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rest</em>' reference.
	 * @see #getRest()
	 * @generated
	 */
	void setRest(REST value);

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
	 * @see wsmodel3.Wsmodel3Package#getBridge_Host()
	 * @model required="true"
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link wsmodel3.Bridge#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

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
	 * @see wsmodel3.Wsmodel3Package#getBridge_Port()
	 * @model required="true"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link wsmodel3.Bridge#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

} // Bridge
