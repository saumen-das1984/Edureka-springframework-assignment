package com.edureka.spring.intro.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DataBase {
	List<String> dbNameList = new ArrayList<String>();
}
