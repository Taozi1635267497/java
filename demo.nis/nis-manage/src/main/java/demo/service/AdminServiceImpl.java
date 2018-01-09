package demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.api.AdminApi;
import demo.dao.AdminRepo;
import demo.users.bean.Admin;
@Service
public class AdminServiceImpl implements AdminApi{
	@Autowired
	private AdminRepo adminrepo;
	public List<Admin> loadAll() {
		return adminrepo.findAll();
	}

}
