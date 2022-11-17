

import org.frameworkspringboot.stereotype.Controller;



@Controller  // @RestController= @Controller + @ResponseBody
public class PlayerController{

@Autowired   //it connect to the playerService class 
private PlayerService playerService;

/* @RequestMapping("/message" method= RequestMapping.GET)
@ResponseBody
public String getMessage(){
    return "hi, there is controller!!";
}
*/

}