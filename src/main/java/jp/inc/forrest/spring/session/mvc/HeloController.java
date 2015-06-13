package jp.inc.forrest.spring.session.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HeloController {

	@RequestMapping(value = "/mvc/helo/{message}", method = RequestMethod.GET)
	@ResponseBody
	public void helo(@PathVariable String message) {
		System.out.println("Received Message ... [" + message + "]");
	}

}
