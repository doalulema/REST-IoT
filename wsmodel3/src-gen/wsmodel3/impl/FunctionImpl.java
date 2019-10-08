/**
 */
package wsmodel3.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import wsmodel3.Break;
import wsmodel3.Function;
import wsmodel3.InputOrchestrator;
import wsmodel3.OutputOrchestrator;
import wsmodel3.Wsmodel3Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wsmodel3.impl.FunctionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link wsmodel3.impl.FunctionImpl#getInputorchestrator <em>Inputorchestrator</em>}</li>
 *   <li>{@link wsmodel3.impl.FunctionImpl#getOutputorchestrator <em>Outputorchestrator</em>}</li>
 *   <li>{@link wsmodel3.impl.FunctionImpl#getBreak <em>Break</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends MinimalEObjectImpl.Container implements Function {
	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputorchestrator() <em>Inputorchestrator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputorchestrator()
	 * @generated
	 * @ordered
	 */
	protected InputOrchestrator inputorchestrator;

	/**
	 * The cached value of the '{@link #getOutputorchestrator() <em>Outputorchestrator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputorchestrator()
	 * @generated
	 * @ordered
	 */
	protected OutputOrchestrator outputorchestrator;

	/**
	 * The cached value of the '{@link #getBreak() <em>Break</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreak()
	 * @generated
	 * @ordered
	 */
	protected EList<Break> break_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Wsmodel3Package.Literals.FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpression(String newExpression) {
		String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Wsmodel3Package.FUNCTION__EXPRESSION, oldExpression,
					expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputOrchestrator getInputorchestrator() {
		if (inputorchestrator != null && inputorchestrator.eIsProxy()) {
			InternalEObject oldInputorchestrator = (InternalEObject) inputorchestrator;
			inputorchestrator = (InputOrchestrator) eResolveProxy(oldInputorchestrator);
			if (inputorchestrator != oldInputorchestrator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Wsmodel3Package.FUNCTION__INPUTORCHESTRATOR, oldInputorchestrator, inputorchestrator));
			}
		}
		return inputorchestrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputOrchestrator basicGetInputorchestrator() {
		return inputorchestrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputorchestrator(InputOrchestrator newInputorchestrator) {
		InputOrchestrator oldInputorchestrator = inputorchestrator;
		inputorchestrator = newInputorchestrator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Wsmodel3Package.FUNCTION__INPUTORCHESTRATOR,
					oldInputorchestrator, inputorchestrator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputOrchestrator getOutputorchestrator() {
		if (outputorchestrator != null && outputorchestrator.eIsProxy()) {
			InternalEObject oldOutputorchestrator = (InternalEObject) outputorchestrator;
			outputorchestrator = (OutputOrchestrator) eResolveProxy(oldOutputorchestrator);
			if (outputorchestrator != oldOutputorchestrator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Wsmodel3Package.FUNCTION__OUTPUTORCHESTRATOR, oldOutputorchestrator, outputorchestrator));
			}
		}
		return outputorchestrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputOrchestrator basicGetOutputorchestrator() {
		return outputorchestrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputorchestrator(OutputOrchestrator newOutputorchestrator) {
		OutputOrchestrator oldOutputorchestrator = outputorchestrator;
		outputorchestrator = newOutputorchestrator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Wsmodel3Package.FUNCTION__OUTPUTORCHESTRATOR,
					oldOutputorchestrator, outputorchestrator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Break> getBreak() {
		if (break_ == null) {
			break_ = new EObjectContainmentEList<Break>(Break.class, this, Wsmodel3Package.FUNCTION__BREAK);
		}
		return break_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Wsmodel3Package.FUNCTION__BREAK:
			return ((InternalEList<?>) getBreak()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Wsmodel3Package.FUNCTION__EXPRESSION:
			return getExpression();
		case Wsmodel3Package.FUNCTION__INPUTORCHESTRATOR:
			if (resolve)
				return getInputorchestrator();
			return basicGetInputorchestrator();
		case Wsmodel3Package.FUNCTION__OUTPUTORCHESTRATOR:
			if (resolve)
				return getOutputorchestrator();
			return basicGetOutputorchestrator();
		case Wsmodel3Package.FUNCTION__BREAK:
			return getBreak();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Wsmodel3Package.FUNCTION__EXPRESSION:
			setExpression((String) newValue);
			return;
		case Wsmodel3Package.FUNCTION__INPUTORCHESTRATOR:
			setInputorchestrator((InputOrchestrator) newValue);
			return;
		case Wsmodel3Package.FUNCTION__OUTPUTORCHESTRATOR:
			setOutputorchestrator((OutputOrchestrator) newValue);
			return;
		case Wsmodel3Package.FUNCTION__BREAK:
			getBreak().clear();
			getBreak().addAll((Collection<? extends Break>) newValue);
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
		case Wsmodel3Package.FUNCTION__EXPRESSION:
			setExpression(EXPRESSION_EDEFAULT);
			return;
		case Wsmodel3Package.FUNCTION__INPUTORCHESTRATOR:
			setInputorchestrator((InputOrchestrator) null);
			return;
		case Wsmodel3Package.FUNCTION__OUTPUTORCHESTRATOR:
			setOutputorchestrator((OutputOrchestrator) null);
			return;
		case Wsmodel3Package.FUNCTION__BREAK:
			getBreak().clear();
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
		case Wsmodel3Package.FUNCTION__EXPRESSION:
			return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
		case Wsmodel3Package.FUNCTION__INPUTORCHESTRATOR:
			return inputorchestrator != null;
		case Wsmodel3Package.FUNCTION__OUTPUTORCHESTRATOR:
			return outputorchestrator != null;
		case Wsmodel3Package.FUNCTION__BREAK:
			return break_ != null && !break_.isEmpty();
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
		result.append(" (expression: ");
		result.append(expression);
		result.append(')');
		return result.toString();
	}

} //FunctionImpl
