package com.mayank.csv;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.hamcrest.core.IsNull;
import org.junit.Before;
import org.junit.Test;

import com.mayank.csv.model.User;
import com.mayank.csv.utils.CsvUtils;

public class csvControllerTest {
	
	private File file;
	
	@Before
	public void testCsvData() {
	 this.file = new File("src/main/resources/static/simpleCsv.csv");
		
	}
	
	@Test
	public void testCorrectCsv() throws IOException {
		InputStream stream = new FileInputStream(this.file);
		List<User> user = CsvUtils.csvUtils(stream);
		
		assertThat(user, IsNull.notNullValue());
		assertThat(user.size(), is(8));
		
	}

}
