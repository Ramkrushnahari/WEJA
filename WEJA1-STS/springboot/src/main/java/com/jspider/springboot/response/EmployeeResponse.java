package com.jspider.springboot.response;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jspider.springboot.pojo.EmployeePOJO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeResponse {
	
	public EmployeeResponse(String string, String string2, EmployeePOJO pojo, Object object) {
		// TODO Auto-generated constructor stub
	}
	private String status;
	private String msg;
	private EmployeePOJO data;
	private List<EmployeePOJO> list;

}