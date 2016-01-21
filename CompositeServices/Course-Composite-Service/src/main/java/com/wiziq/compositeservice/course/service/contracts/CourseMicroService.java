package com.wiziq.compositeservice.course.service.contracts;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("asdf")
public interface CourseMicroService {
	
	@RequestMapping(method = RequestMethod.GET, value = "/processMsg?msg={msg}")
    String getMessage(@PathVariable(value = "msg") String msg);
}
