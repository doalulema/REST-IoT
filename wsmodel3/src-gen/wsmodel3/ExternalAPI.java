/**
 */
package wsmodel3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External API</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wsmodel3.ExternalAPI#getURI <em>URI</em>}</li>
 * </ul>
 *
 * @see wsmodel3.Wsmodel3Package#getExternalAPI()
 * @model
 * @generated
 */
public interface ExternalAPI extends EObject {
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
	 * @see wsmodel3.Wsmodel3Package#getExternalAPI_URI()
	 * @model required="true"
	 * @generated
	 */
	String getURI();

	/**
	 * Sets the value of the '{@link wsmodel3.ExternalAPI#getURI <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URI</em>' attribute.
	 * @see #getURI()
	 * @generated
	 */
	void setURI(String value);

} // ExternalAPI
