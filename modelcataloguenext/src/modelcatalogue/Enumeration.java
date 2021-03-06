/**
 */
package modelcatalogue;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link modelcatalogue.Enumeration#getOrderedValues <em>Ordered Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see modelcatalogue.McnPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends DataType {
	/**
	 * Returns the value of the '<em><b>Ordered Values</b></em>' containment reference list.
	 * The list contents are of type {@link modelcatalogue.EnumValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordered Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordered Values</em>' containment reference list.
	 * @see modelcatalogue.McnPackage#getEnumeration_OrderedValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumValue> getOrderedValues();

} // Enumeration
