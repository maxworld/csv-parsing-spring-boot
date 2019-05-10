package com.mayank.csv.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.mayank.csv.model.User;

public class CsvUtils {

	public static List<User> csvUtils(InputStream stream) throws IOException {

		CsvMapper mapper = new CsvMapper();

		CsvSchema schema = mapper.schemaFor(User.class).withHeader().withColumnReordering(true).withColumnSeparator('\t');

		ObjectReader reader = mapper.readerFor(User.class).with(schema);

		return reader.<User>readValues(stream).readAll();

	}

}
