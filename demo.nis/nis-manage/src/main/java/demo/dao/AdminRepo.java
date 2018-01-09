package demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.users.bean.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer> {

}
