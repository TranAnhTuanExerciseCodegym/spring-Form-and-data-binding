package controller;


import model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("/employee")
public class EmployeeController {
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String showCreate(
            ModelMap modelMap
    ) {
        modelMap.addAttribute("employee", new Employee());
        return "employee/create";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String create(
            Employee employee,
            ModelMap modelMap
    ) {
        modelMap.addAttribute("id", employee.getId());
        modelMap.addAttribute("name", employee.getName());
        modelMap.addAttribute("contactNumber", employee.getContactNumber());
        return "employee/listEmployee";
    }
}
