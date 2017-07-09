import exception.JsonValidatorException;
import schema.Schema;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Validator implementation.
 * Created by Lakhno Anton
 * at 0:09 08.07.17.
 *
 * @author Lakhno Anton
 * @version 1.0.0.SNAPSHOT
 * @since 1.0.0.SNAPSHOT
 */
public class Validator implements interfaces.Validator {

	private List<Schema> schemas = new ArrayList<>();

	public boolean addSchema(File file) throws JsonValidatorException {
		try (InputStream is = new FileInputStream(file)) {
			return this.addSchema(is);
		} catch (FileNotFoundException fnfe) {
			throw new JsonValidatorException("File not found. Ensure that you set correct file path.");
		} catch (IOException ioe) {
			throw new JsonValidatorException("Can't read file");
		}
	}

	public boolean addSchema(InputStream inputStream) throws JsonValidatorException {
		return false;
	}

	//region Not implemented methods
	public boolean validateJson(File jsonFile) throws JsonValidatorException {
		return false;
	}

	public boolean validateJson(InputStream jsonInputStream) throws JsonValidatorException {
		return false;
	}

	public boolean validateJson(File jsonFile, File schemaFile) throws JsonValidatorException {
		return false;
	}

	public boolean validateJson(File jsonFile, InputStream schemaInputStream) throws JsonValidatorException {
		return false;
	}

	public boolean validateJson(InputStream jsonInputStream, File schemaInputStream) throws JsonValidatorException {
		return false;
	}

	public boolean validateJson(InputStream jsonInputStream, InputStream schemaInputStream) throws JsonValidatorException {
		return false;
	}

	public boolean validateXml(File jsonFile) throws JsonValidatorException {
		return false;
	}

	public boolean validateXml(InputStream jsonInputStream) throws JsonValidatorException {
		return false;
	}

	public boolean validateXml(File jsonFile, File schemaFile) throws JsonValidatorException {
		return false;
	}

	public boolean validateXml(File jsonFile, InputStream schemaInputStream) throws JsonValidatorException {
		return false;
	}

	public boolean validateXml(InputStream jsonInputStream, File schemaInputStream) throws JsonValidatorException {
		return false;
	}

	public boolean validateXml(InputStream jsonInputStream, InputStream schemaInputStream) throws JsonValidatorException {
		return false;
	}

	public boolean validatePojo(Object pojo) throws JsonValidatorException {
		return false;
	}

	public boolean validatePojo(Object pojo, File schemaFile) throws JsonValidatorException {
		return false;
	}

	public boolean validatePojo(Object pojo, InputStream schemaInputStream) throws JsonValidatorException {
		return false;
	}

	public Object deserializeAndValidateJson(File jsonFile) throws JsonValidatorException {
		return null;
	}

	public Object deserializeAndValidateJson(InputStream jsonInputStream) throws JsonValidatorException {
		return null;
	}

	public Object deserializeAndValidateJson(File jsonFile, File schemaFile) throws JsonValidatorException {
		return null;
	}

	public Object deserializeAndValidateJson(File jsonFile, InputStream schemaInputStream) throws JsonValidatorException {
		return null;
	}

	public Object deserializeAndValidateJson(InputStream jsonInputStream, File schemaInputStream) throws JsonValidatorException {
		return null;
	}

	public Object deserializeAndValidateJson(InputStream jsonInputStream, InputStream schemaInputStream) throws JsonValidatorException {
		return null;
	}
	//endregion

	//region Private utility methods
	private Schema readSchema(InputStream schemaInputStream) {
		return new Schema();
	}
	//endregion

}
