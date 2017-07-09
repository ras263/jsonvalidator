package schema;

import java.util.ArrayList;
import java.util.List;

/**
 * Describe restrictions of whole scheme with many types.
 * Created by Lakhno Anton
 * at 23:09 07.07.17.
 *
 * @author Lakhno Anton
 * @version 1.0.0.SNAPSHOT
 * @since 1.0.0.SNAPSHOT
 */
public class Schema {

    private List<Declaration> elements;

    //region Properties accessors
    public List<Declaration> getElements() {
		if (elements == null) {
			elements = new ArrayList<>();
		}
		return elements;
    }

    public void setElements(List<Declaration> elements) {
        this.elements = elements;
    }
    //endregion

    @Override
    public String toString() {
        return "Schema{" +
                "elements=" + elements +
                '}';
    }

}
