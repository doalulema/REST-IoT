/**
 */
package wsmodel3.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import wsmodel3.DBServer;
import wsmodel3.DBType;
import wsmodel3.Wsmodel3Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DB Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wsmodel3.impl.DBServerImpl#getUsser <em>Usser</em>}</li>
 *   <li>{@link wsmodel3.impl.DBServerImpl#getPass <em>Pass</em>}</li>
 *   <li>{@link wsmodel3.impl.DBServerImpl#getType <em>Type</em>}</li>
 *   <li>{@link wsmodel3.impl.DBServerImpl#getPort <em>Port</em>}</li>
 *   <li>{@link wsmodel3.impl.DBServerImpl#getDatabase <em>Database</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DBServerImpl extends ServerImpl implements DBServer {
	/**
	 * The default value of the '{@link #getUsser() <em>Usser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsser()
	 * @generated
	 * @ordered
	 */
	protected static final String USSER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsser() <em>Usser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsser()
	 * @generated
	 * @ordered
	 */
	protected String usser = USSER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPass() <em>Pass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPass()
	 * @generated
	 * @ordered
	 */
	protected static final String PASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPass() <em>Pass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPass()
	 * @generated
	 * @ordered
	 */
	protected String pass = PASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final DBType TYPE_EDEFAULT = DBType.UNDEFINED;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DBType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatabase() <em>Database</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected String database = DATABASE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DBServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Wsmodel3Package.Literals.DB_SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUsser() {
		return usser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsser(String newUsser) {
		String oldUsser = usser;
		usser = newUsser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Wsmodel3Package.DB_SERVER__USSER, oldUsser, usser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPass() {
		return pass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPass(String newPass) {
		String oldPass = pass;
		pass = newPass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Wsmodel3Package.DB_SERVER__PASS, oldPass, pass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DBType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(DBType newType) {
		DBType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Wsmodel3Package.DB_SERVER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Wsmodel3Package.DB_SERVER__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDatabase() {
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatabase(String newDatabase) {
		String oldDatabase = database;
		database = newDatabase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Wsmodel3Package.DB_SERVER__DATABASE, oldDatabase,
					database));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Wsmodel3Package.DB_SERVER__USSER:
			return getUsser();
		case Wsmodel3Package.DB_SERVER__PASS:
			return getPass();
		case Wsmodel3Package.DB_SERVER__TYPE:
			return getType();
		case Wsmodel3Package.DB_SERVER__PORT:
			return getPort();
		case Wsmodel3Package.DB_SERVER__DATABASE:
			return getDatabase();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Wsmodel3Package.DB_SERVER__USSER:
			setUsser((String) newValue);
			return;
		case Wsmodel3Package.DB_SERVER__PASS:
			setPass((String) newValue);
			return;
		case Wsmodel3Package.DB_SERVER__TYPE:
			setType((DBType) newValue);
			return;
		case Wsmodel3Package.DB_SERVER__PORT:
			setPort((Integer) newValue);
			return;
		case Wsmodel3Package.DB_SERVER__DATABASE:
			setDatabase((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Wsmodel3Package.DB_SERVER__USSER:
			setUsser(USSER_EDEFAULT);
			return;
		case Wsmodel3Package.DB_SERVER__PASS:
			setPass(PASS_EDEFAULT);
			return;
		case Wsmodel3Package.DB_SERVER__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case Wsmodel3Package.DB_SERVER__PORT:
			setPort(PORT_EDEFAULT);
			return;
		case Wsmodel3Package.DB_SERVER__DATABASE:
			setDatabase(DATABASE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Wsmodel3Package.DB_SERVER__USSER:
			return USSER_EDEFAULT == null ? usser != null : !USSER_EDEFAULT.equals(usser);
		case Wsmodel3Package.DB_SERVER__PASS:
			return PASS_EDEFAULT == null ? pass != null : !PASS_EDEFAULT.equals(pass);
		case Wsmodel3Package.DB_SERVER__TYPE:
			return type != TYPE_EDEFAULT;
		case Wsmodel3Package.DB_SERVER__PORT:
			return port != PORT_EDEFAULT;
		case Wsmodel3Package.DB_SERVER__DATABASE:
			return DATABASE_EDEFAULT == null ? database != null : !DATABASE_EDEFAULT.equals(database);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (usser: ");
		result.append(usser);
		result.append(", pass: ");
		result.append(pass);
		result.append(", type: ");
		result.append(type);
		result.append(", port: ");
		result.append(port);
		result.append(", database: ");
		result.append(database);
		result.append(')');
		return result.toString();
	}

} //DBServerImpl
