import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
class HomeController{

   @RequestMapping("home") //its handle the request.
   public void home(){

         System.out.println("Welcome to home");    //add the tomcate-jsper dependancy into the pom.xml
         return "home";                         //its redirect to the home.jsp page.
    }

}