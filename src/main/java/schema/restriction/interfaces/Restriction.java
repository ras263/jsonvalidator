package schema.restriction.interfaces;

/**
 * Interface of abstract type restriction.
 * Restriction describes what conditions must to satisfy the element.
 *
 * Created by Lakhno Anton
 * at 6:22 08.07.17.
 *
 * @author Lakhno Anton
 */
public interface Restriction<T> {

	public String getName();
	Boolean validateValue(T value);

}
