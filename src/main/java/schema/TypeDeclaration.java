package schema;

import schema.restriction.interfaces.Combination;
import schema.restriction.interfaces.Restriction;

import java.util.ArrayList;
import java.util.List;

/**
 * Type declaration.
 * Represents type of the element.
 *
 * Created by Lakhno Anton
 * at 23:51 07.07.17.
 *
 * @author Lakhno Anton
 * @version 1.0.0.SNAPSHOT
 * @since 1.0.0.SNAPSHOT
 */
abstract public class TypeDeclaration extends Declaration {

	private String name;
	private String annotation;
	private TypeDeclaration extension;
	private List<Element> elements = new ArrayList<>();
	private String value;
	private Class valueType;
	private Boolean ordered;
	private List<Combination> combinations = new ArrayList<>();
	private List<Restriction> restrictions = new ArrayList<>();

	//region Properties accessors
	public String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	public String getAnnotation() {
		return annotation;
	}

	protected void setAnnotation(String annotation) {
		this.annotation = annotation;
	}

	public TypeDeclaration getExtension() {
		return extension;
	}

	protected void setExtension(TypeDeclaration extension) {
		this.extension = extension;
	}

	public List<Element> getElements() {
		return elements;
	}

	protected void setElements(List<Element> elements) {
		this.elements = elements;
	}

	public String getValue() {
		return value;
	}

	protected void setValue(String value) {
		this.value = value;
	}

	public Class getValueType() {
		return valueType;
	}

	protected void setValueType(Class valueType) {
		this.valueType = valueType;
	}

	public Boolean getOrdered() {
		return ordered;
	}

	protected void setOrdered(Boolean ordered) {
		this.ordered = ordered;
	}

	public List<Combination> getCombinations() {
		return combinations;
	}

	protected void setCombinations(List<Combination> combinations) {
		this.combinations = combinations;
	}

	public List<Restriction> getRestrictions() {
		return restrictions;
	}

	protected void setRestrictions(List<Restriction> restrictions) {
		this.restrictions = restrictions;
	}
	//endregion

	@Override
	public String toString() {
		return "TypeDeclaration{" +
				"name='" + name + '\'' +
				", annotation='" + annotation + '\'' +
				", extension=" + extension +
				", elements=" + elements +
				", value=" + value +
				", valueType=" + valueType.getName() +
				", ordered=" + ordered +
				", combinations=" + combinations +
				", restrictions=" + restrictions +
				'}';
	}

}
