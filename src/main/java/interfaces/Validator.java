package interfaces;

import exception.JsonValidatorException;

import java.io.File;
import java.io.InputStream;

/**
 * Interface for validator.
 * <p>
 * Created by Lakhno Anton
 * at 23:16 07.07.17.
 *
 * @author Lakhno Anton
 * @version 1.0.0.SNAPSHOT
 * @since 1.0.0.SNAPSHOT
 */
public interface Validator {
	public boolean addSchema(File file) throws JsonValidatorException;
	public boolean addSchema(InputStream inputStream) throws JsonValidatorException;

	public boolean validateJson(File jsonFile) throws JsonValidatorException;
	public boolean validateJson(InputStream jsonInputStream) throws JsonValidatorException;
	public boolean validateJson(File jsonFile, File schemaFile) throws JsonValidatorException;
	public boolean validateJson(File jsonFile, InputStream schemaInputStream) throws JsonValidatorException;
	public boolean validateJson(InputStream jsonInputStream, File schemaInputStream) throws JsonValidatorException;
	public boolean validateJson(InputStream jsonInputStream, InputStream schemaInputStream) throws JsonValidatorException;

	public boolean validateXml(File jsonFile) throws JsonValidatorException;
	public boolean validateXml(InputStream jsonInputStream) throws JsonValidatorException;
	public boolean validateXml(File jsonFile, File schemaFile) throws JsonValidatorException;
	public boolean validateXml(File jsonFile, InputStream schemaInputStream) throws JsonValidatorException;
	public boolean validateXml(InputStream jsonInputStream, File schemaInputStream) throws JsonValidatorException;
	public boolean validateXml(InputStream jsonInputStream, InputStream schemaInputStream) throws JsonValidatorException;

	public boolean validatePojo(Object pojo) throws JsonValidatorException;
	public boolean validatePojo(Object pojo, File schemaFile) throws JsonValidatorException;
	public boolean validatePojo(Object pojo, InputStream schemaInputStream) throws JsonValidatorException;

	public Object deserializeAndValidateJson(File jsonFile) throws JsonValidatorException;
	public Object deserializeAndValidateJson(InputStream jsonInputStream) throws JsonValidatorException;
	public Object deserializeAndValidateJson(File jsonFile, File schemaFile) throws JsonValidatorException;
	public Object deserializeAndValidateJson(File jsonFile, InputStream schemaInputStream) throws JsonValidatorException;
	public Object deserializeAndValidateJson(InputStream jsonInputStream, File schemaInputStream) throws JsonValidatorException;
	public Object deserializeAndValidateJson(InputStream jsonInputStream, InputStream schemaInputStream) throws JsonValidatorException;

}
