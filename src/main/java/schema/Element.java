package schema;

/**
 * Created by Lakhno Anton
 * at 23:47 07.07.17.
 *
 * @author Lakhno Anton
 * @version 1.0.0.SNAPSHOT
 * @since 1.0.0.SNAPSHOT
 */
public class Element {

	public static final Long UNBOUND_OCCURS = -1L;

	private String name;
	private TypeDeclaration type;
	private Long minOccurs;
	private Long maxOccurs;
	private Boolean required;
	private Boolean nullable;

	//region Properties accessors
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TypeDeclaration getType() {
		return type;
	}

	public void setType(TypeDeclaration type) {
		this.type = type;
	}

	public Long getMinOccurs() {
		return minOccurs;
	}

	public void setMinOccurs(Long minOccurs) {
		this.minOccurs = minOccurs;
	}

	public Long getMaxOccurs() {
		return maxOccurs;
	}

	public void setMaxOccurs(Long maxOccurs) {
		this.maxOccurs = maxOccurs;
	}

	public Boolean getRequired() {
		return required;
	}

	public void setRequired(Boolean required) {
		this.required = required;
	}

	public Boolean getNullable() {
		return nullable;
	}

	public void setNullable(Boolean nullable) {
		this.nullable = nullable;
	}
	//endregion

	@Override
	public String toString() {
		return "Element{" +
				"name='" + name + '\'' +
				", type=" + type +
				", minOccurs=" + minOccurs +
				", maxOccurs=" + maxOccurs +
				", required=" + required +
				", nullable=" + nullable +
				'}';
	}

}
