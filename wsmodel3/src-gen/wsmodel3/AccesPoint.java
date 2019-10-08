/**
 */
package wsmodel3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Acces Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wsmodel3.AccesPoint#getSsid <em>Ssid</em>}</li>
 *   <li>{@link wsmodel3.AccesPoint#getPass <em>Pass</em>}</li>
 * </ul>
 *
 * @see wsmodel3.Wsmodel3Package#getAccesPoint()
 * @model
 * @generated
 */
public interface AccesPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Ssid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ssid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssid</em>' attribute.
	 * @see #setSsid(String)
	 * @see wsmodel3.Wsmodel3Package#getAccesPoint_Ssid()
	 * @model required="true"
	 * @generated
	 */
	String getSsid();

	/**
	 * Sets the value of the '{@link wsmodel3.AccesPoint#getSsid <em>Ssid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssid</em>' attribute.
	 * @see #getSsid()
	 * @generated
	 */
	void setSsid(String value);

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
	 * @see wsmodel3.Wsmodel3Package#getAccesPoint_Pass()
	 * @model
	 * @generated
	 */
	String getPass();

	/**
	 * Sets the value of the '{@link wsmodel3.AccesPoint#getPass <em>Pass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pass</em>' attribute.
	 * @see #getPass()
	 * @generated
	 */
	void setPass(String value);

} // AccesPoint
