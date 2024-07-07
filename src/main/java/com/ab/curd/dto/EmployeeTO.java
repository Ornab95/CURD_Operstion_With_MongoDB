package com.ab.curd.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeeTO {
	private String id;
	private String empname;
	private String location;
	private String salary;

}
