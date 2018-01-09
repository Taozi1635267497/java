package demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.api.AdminApi;
import demo.users.bean.Admin;

@Controller
@RequestMapping("/admin")
public class Admincontroller {
	@Autowired
	private AdminApi adminapi;
	@RequestMapping("/list")
	@ResponseBody
	public List<Admin> list(){
		return adminapi.loadAll();
	}
	
}
