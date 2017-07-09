package schema.restriction;

import schema.restriction.interfaces.Restriction;

/**
 * Example restriction.
 * Restricts to use {@link Byte} object as number type.
 *
 * Created by Lakhno Anton
 * at 21:56 08.07.17.
 *
 * @author Lakhno Anton
 * @version 1.0.0.SNAPSHOT
 * @since 1.0.0.SNAPSHOT
 */
public class NumberRestriction implements Restriction<Number> {

	@Override
	public String getName() {
		return "number";
	}

	@Override
	public Boolean validateValue(Number value) {
		return !(value instanceof Byte);
	}

}
