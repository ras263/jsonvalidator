package schema.type.common;

import schema.Element;
import schema.TypeDeclaration;
import schema.restriction.interfaces.Combination;
import schema.restriction.interfaces.Restriction;

import java.util.Collections;

/**
 * Represents integer type declaration.
 *
 * Created by Lakhno Anton
 * at 17:08 08.07.17.
 *
 * @author Lakhno Anton
 * @version 1.0.0.SNAPSHOT
 * @since 1.0.0.SNAPSHOT
 */
public class IntegerType extends TypeDeclaration {

	public IntegerType() {
		this.setName("Integer");
		this.setAnnotation("Simple integer type declaration");
		this.setExtension(null);
		this.setElements(Collections.<Element>emptyList());
		this.setValueType(Number.class);
		this.setOrdered(false);
		this.setCombinations(Collections.<Combination>emptyList());
		this.setRestrictions(Collections.<Restriction>emptyList());
	}

	@Override
	public void setValue(String value) {
		super.setValue(value);
	}

}
