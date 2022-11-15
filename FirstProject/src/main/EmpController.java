import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;





@RestController // add jasper dependancy in pom.xml
public class EmpController{
@Autowired
EmployeeRepo repo;
/*
@RequestMapping("/addEmployee")
public String addEmployee(Employee employee){    // add the employee details into h2 database
    repo.save(employee);
    return "home.jsp";
}*/
@RequestMapping("/getEmployee")
public String getEmployee(String eid){           // fetch the data from h2 database 
    ModelAndView mv=new ModelAndView("ShowEmployee.jsp");
    Employee emp= repo.findById(eid).orElse(new Employee());
    mv.addObject(employee);
    return mv;
}
}