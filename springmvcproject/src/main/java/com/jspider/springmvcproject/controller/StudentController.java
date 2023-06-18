package com.jspider.springmvcproject.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.jspider.springmvcproject.service.AdminService;
import com.jspider.springmvcproject.pojo.AdminPOJO;
import com.jspider.springmvcproject.pojo.StudentPOJO;
import com.jspider.springmvcproject.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService service;
	@Autowired
	private AdminService adminService;

	// Home Controller
	@GetMapping("/home")
	public String home() {
		return "Home";
	}
	

	// Add Form controller
		@GetMapping("/add")
		public String add(@SessionAttribute(name = "login", required = false) AdminPOJO login, ModelMap map) {
			if (login != null) {
				return "Add";
			}
			map.addAttribute("msg", "Login to proceed..!!");
			return "Login";
		}

		// Add response controller
		@PostMapping("/add")
		public String addStudent(@SessionAttribute(name = "login", required = false) AdminPOJO login,
				@RequestParam String name, @RequestParam String email, @RequestParam long contact,
				@RequestParam String city, ModelMap map) {
			if (login != null) {
				StudentPOJO student = service.add(name, email, contact, city);
				if (student != null) {
					map.addAttribute("student", student);
					map.addAttribute("msg", "Student added successfully..!!");
				} else {
					map.addAttribute("msg", "Student not added..!!");
				}
				return "Add";
			}
			map.addAttribute("msg", "Login to proceed..!!");
			return "Login";

		}
		// Search form controller
		@GetMapping("/search")
		public String search(@SessionAttribute(name = "login", required = false) AdminPOJO login, ModelMap map) {
			if (login != null) {
				return "Search";
			}
			map.addAttribute("msg", "Login to proceed..!!");
			return "Login";

		}

		// Search response controller
		@PostMapping("/search")
		public String searchData(@SessionAttribute(name = "login", required = false) AdminPOJO login,
				@RequestParam int id, ModelMap map) {
			if (login != null) {
				StudentPOJO student = service.search(id);
				if (student != null) {
					// success
					map.addAttribute("student", student);
					return "Search";
				}
				// failure
				map.addAttribute("msg", "Student data does not exist..!!");
				return "Search";
			}
			map.addAttribute("msg", "Login to proceed..!!");
			return "Login";

		}

		// Remove form controller
		@GetMapping("/remove")
		public String remove(@SessionAttribute(name = "login", required = false) AdminPOJO login, ModelMap map) {
			if (login != null) {
				List<StudentPOJO> students = service.searchAll();
				map.addAttribute("students", students);
				return "Remove";
			}
			map.addAttribute("msg", "Login to proceed..!!");
			return "Login";

		}

		// Remove response controller
		@PostMapping("/remove")
		public String removeData(@SessionAttribute(name = "login", required = false) AdminPOJO login,
				@RequestParam int id, ModelMap map) {
			if (login != null) {
				StudentPOJO student = service.remove(id);
				if (student != null) {
					// success
					List<StudentPOJO> students = service.searchAll();
					map.addAttribute("students", students);
					map.addAttribute("msg", "Student removed successfully..!!");
					return "Remove";
				}
				// failure
				List<StudentPOJO> students = service.searchAll();
				map.addAttribute("students", students);
				map.addAttribute("msg", "Student data does not exist..!!");
				return "Remove";
			}
			map.addAttribute("msg", "Login to proceed..!!");
			return "Login";

		}

		// Update page controller
		@GetMapping("/update")
		public String update(@SessionAttribute(name = "login", required = false) AdminPOJO login, ModelMap map) {
			if (login != null) {
				List<StudentPOJO> students = service.searchAll();
				map.addAttribute("students", students);
				return "Update";
			}
			map.addAttribute("msg", "Login to proceed..!!");
			return "Login";

		}

		// Update form controller
		@PostMapping("/update")
		public String updateForm(@SessionAttribute(name = "login", required = false) AdminPOJO login,
				@RequestParam int id, ModelMap map) {
			if (login != null) {
				StudentPOJO student = service.search(id);
				if (student != null) {
					// success
					map.addAttribute("student", student);
				}
				// failure
				List<StudentPOJO> students = service.searchAll();
				map.addAttribute("students", students);
				map.addAttribute("msg", "Student data does not exist..!!");
				return "Update";
			}
			map.addAttribute("msg", "Login to proceed..!!");
			return "Login";

		}

		// Update Data controller
		@PostMapping("/updateData")
		public String updateData(@SessionAttribute(name = "login", required = false) AdminPOJO login,
				@RequestParam int id, @RequestParam String name, @RequestParam String email, @RequestParam long contact,
				@RequestParam String city, ModelMap map) {
			if (login != null) {
				StudentPOJO student = service.update(id, name, email, contact, city);
				if (student != null) {
					// success
					map.addAttribute("msg", "Student data updated successfully..!!");
					List<StudentPOJO> students = service.searchAll();
					map.addAttribute("students", students);
					return "Update";
				}
				// failure
				map.addAttribute("msg", "Student not updated..!!");
				List<StudentPOJO> students = service.searchAll();
				map.addAttribute("students", students);
				return "Update";
			}
			map.addAttribute("msg", "Login to proceed..!!");
			return "Login";

		}

	// Login Controller
		@PostMapping("/login")
		public String login(HttpServletRequest request, @RequestParam String username, @RequestParam String password,
				ModelMap map) {
			AdminPOJO admin = adminService.login(username, password);
			if (admin != null) {
				// Success response
				HttpSession session = request.getSession();
				session.setAttribute("login", admin);
				return "Home";
			}
			// Failure response
			map.addAttribute("msg", "Invalid username or password");
			return "Login";
		}

	// logout controller
	@GetMapping("/logout")
	public String logout(HttpSession session, ModelMap map) {
		session.invalidate();
		map.addAttribute("msg", "Logged out successfully..!!");
		return "Login";
	}

	// Create Admin Page Controller
	@GetMapping("/createAccount")
	public String adminPage() {
		return "Admin";
	}

	// Create Admin Controller
	@PostMapping("/createAccount")
	public String admin(@RequestParam String username, @RequestParam String password, ModelMap map) {
		AdminPOJO admin = adminService.addAdmin(username, password);
		if (admin != null) {
			// Success response
			map.addAttribute("msg", "Account created successfully..!!");
			return "Login";
		}
		// Failure response
		map.addAttribute("msg", "Account not created..!!");
		return "Login";
	}
}
