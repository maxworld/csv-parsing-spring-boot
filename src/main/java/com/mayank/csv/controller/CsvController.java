package com.mayank.csv.controller;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.mayank.csv.repository.CsvRepository;
import com.mayank.csv.utils.CsvUtils;

@RestController
public class CsvController {

	@Autowired
	private CsvRepository csvRepository;

	@PostMapping(value = "/read", consumes = "text/csv")
	public void readAndPersistCsvInInMemoryDBH2(@RequestBody InputStream stream) throws IOException {
		csvRepository.saveAll(CsvUtils.csvUtils(stream));
	}

	@PostMapping(value = "/read", consumes = "multipart/form-data")
	public void readAndPersistCsvInInMemoryDB(@RequestParam("file") MultipartFile file) throws IOException {
		csvRepository.saveAll(CsvUtils.csvUtils(file.getInputStream()));
	}
}
