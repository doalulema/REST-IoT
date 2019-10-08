/**
 */
package wsmodel3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Io TNode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wsmodel3.IoTNode#getDevice <em>Device</em>}</li>
 * </ul>
 *
 * @see wsmodel3.Wsmodel3Package#getIoTNode()
 * @model
 * @generated
 */
public interface IoTNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference list.
	 * The list contents are of type {@link wsmodel3.Device}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' containment reference list.
	 * @see wsmodel3.Wsmodel3Package#getIoTNode_Device()
	 * @model containment="true"
	 * @generated
	 */
	EList<Device> getDevice();

} // IoTNode
