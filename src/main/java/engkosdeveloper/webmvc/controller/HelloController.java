package engkosdeveloper.webmvc.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
public class HelloController {

    @RequestMapping(path = "/helo")
    public  void  helloWorld(HttpServletResponse response) throws IOException {
   response.getWriter().println("Hello Worls");
    }

}