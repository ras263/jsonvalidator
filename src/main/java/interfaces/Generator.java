package interfaces;

import java.io.File;
import java.io.OutputStream;

/**
 * Created by Lakhno Anton
 * at 23:43 07.07.17.
 *
 * @author Lakhno Anton
 * @version 1.0.0.SNAPSHOT
 * @since 1.0.0.SNAPSHOT
 */
public interface Generator {

	public OutputStream generateSchema(Class beanClass);
	public File generateSchema(Class beanClass, File outputFile);

	//TODO Implement logic for generating POJO classes (proxy and to file).

}
