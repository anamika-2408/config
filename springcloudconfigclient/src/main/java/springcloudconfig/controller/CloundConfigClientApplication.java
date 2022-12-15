package springcloudconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class CloundConfigClientApplication {
	@RequestMapping("/hello")
	public String say() {
		return "hello all";
	}
	@Value("{text.greeting}")
	private String msg;
	@RequestMapping("/getmsg")
	public String name() {
		return msg;
	}
}
