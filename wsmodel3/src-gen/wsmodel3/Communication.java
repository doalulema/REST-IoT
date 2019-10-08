/**
 */
package wsmodel3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wsmodel3.Communication#getType <em>Type</em>}</li>
 *   <li>{@link wsmodel3.Communication#getCommunicationdata <em>Communicationdata</em>}</li>
 *   <li>{@link wsmodel3.Communication#getAccespoint <em>Accespoint</em>}</li>
 *   <li>{@link wsmodel3.Communication#getName <em>Name</em>}</li>
 *   <li>{@link wsmodel3.Communication#getMessagebroker <em>Messagebroker</em>}</li>
 * </ul>
 *
 * @see wsmodel3.Wsmodel3Package#getCommunication()
 * @model
 * @generated
 */
public interface Communication extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link wsmodel3.CommunicationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see wsmodel3.CommunicationType
	 * @see #setType(CommunicationType)
	 * @see wsmodel3.Wsmodel3Package#getCommunication_Type()
	 * @model required="true"
	 * @generated
	 */
	CommunicationType getType();

	/**
	 * Sets the value of the '{@link wsmodel3.Communication#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see wsmodel3.CommunicationType
	 * @see #getType()
	 * @generated
	 */
	void setType(CommunicationType value);

	/**
	 * Returns the value of the '<em><b>Communicationdata</b></em>' containment reference list.
	 * The list contents are of type {@link wsmodel3.CommunicationData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communicationdata</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communicationdata</em>' containment reference list.
	 * @see wsmodel3.Wsmodel3Package#getCommunication_Communicationdata()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommunicationData> getCommunicationdata();

	/**
	 * Returns the value of the '<em><b>Accespoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accespoint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accespoint</em>' reference.
	 * @see #setAccespoint(AccesPoint)
	 * @see wsmodel3.Wsmodel3Package#getCommunication_Accespoint()
	 * @model
	 * @generated
	 */
	AccesPoint getAccespoint();

	/**
	 * Sets the value of the '{@link wsmodel3.Communication#getAccespoint <em>Accespoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accespoint</em>' reference.
	 * @see #getAccespoint()
	 * @generated
	 */
	void setAccespoint(AccesPoint value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see wsmodel3.Wsmodel3Package#getCommunication_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link wsmodel3.Communication#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Messagebroker</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Messagebroker</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messagebroker</em>' reference.
	 * @see #setMessagebroker(MessageBroker)
	 * @see wsmodel3.Wsmodel3Package#getCommunication_Messagebroker()
	 * @model
	 * @generated
	 */
	MessageBroker getMessagebroker();

	/**
	 * Sets the value of the '{@link wsmodel3.Communication#getMessagebroker <em>Messagebroker</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Messagebroker</em>' reference.
	 * @see #getMessagebroker()
	 * @generated
	 */
	void setMessagebroker(MessageBroker value);

} // Communication
