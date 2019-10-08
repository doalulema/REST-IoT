/**
 */
package wsmodel3;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DB Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wsmodel3.DBServer#getUsser <em>Usser</em>}</li>
 *   <li>{@link wsmodel3.DBServer#getPass <em>Pass</em>}</li>
 *   <li>{@link wsmodel3.DBServer#getType <em>Type</em>}</li>
 *   <li>{@link wsmodel3.DBServer#getPort <em>Port</em>}</li>
 *   <li>{@link wsmodel3.DBServer#getDatabase <em>Database</em>}</li>
 * </ul>
 *
 * @see wsmodel3.Wsmodel3Package#getDBServer()
 * @model
 * @generated
 */
public interface DBServer extends Server {
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
	 * @see wsmodel3.Wsmodel3Package#getDBServer_Usser()
	 * @model required="true"
	 * @generated
	 */
	String getUsser();

	/**
	 * Sets the value of the '{@link wsmodel3.DBServer#getUsser <em>Usser</em>}' attribute.
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
	 * @see wsmodel3.Wsmodel3Package#getDBServer_Pass()
	 * @model required="true"
	 * @generated
	 */
	String getPass();

	/**
	 * Sets the value of the '{@link wsmodel3.DBServer#getPass <em>Pass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pass</em>' attribute.
	 * @see #getPass()
	 * @generated
	 */
	void setPass(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link wsmodel3.DBType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see wsmodel3.DBType
	 * @see #setType(DBType)
	 * @see wsmodel3.Wsmodel3Package#getDBServer_Type()
	 * @model required="true"
	 * @generated
	 */
	DBType getType();

	/**
	 * Sets the value of the '{@link wsmodel3.DBServer#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see wsmodel3.DBType
	 * @see #getType()
	 * @generated
	 */
	void setType(DBType value);

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
	 * @see wsmodel3.Wsmodel3Package#getDBServer_Port()
	 * @model required="true"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link wsmodel3.DBServer#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Database</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' attribute.
	 * @see #setDatabase(String)
	 * @see wsmodel3.Wsmodel3Package#getDBServer_Database()
	 * @model required="true"
	 * @generated
	 */
	String getDatabase();

	/**
	 * Sets the value of the '{@link wsmodel3.DBServer#getDatabase <em>Database</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database</em>' attribute.
	 * @see #getDatabase()
	 * @generated
	 */
	void setDatabase(String value);

} // DBServer
