package schema.restriction.common;

import schema.restriction.interfaces.Restriction;

/**
 * Restricts minimal and maximal values of number.
 *
 * Created by Lakhno Anton
 * at 22:09 08.07.17.
 *
 * @author Lakhno Anton
 * @version 1.0.0.SNAPSHOT
 * @since 1.0.0.SNAPSHOT
 */
public class NumberSizeRestriction implements Restriction<Number> {

	private Number minValue;
	private Number maxValue;

	public NumberSizeRestriction(Number minValue, Number maxValue) {
		this.minValue = minValue;
		this.maxValue = maxValue;
	}

	@Override
	public String getName() {
		return "number_size";
	}

	@Override
	public Boolean validateValue(Number value) {
		return (minValue != null && value.doubleValue() >= minValue.doubleValue())
				 && (maxValue != null && value.doubleValue() <= maxValue.doubleValue());
	}
}
