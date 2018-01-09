package demo.api;

import java.util.List;

import demo.users.bean.Admin;

public interface AdminApi {
	public List<Admin> loadAll();
}
