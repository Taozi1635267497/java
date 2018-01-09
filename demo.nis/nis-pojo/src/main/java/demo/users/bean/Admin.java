package demo.users.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 时间：2018/1/3
 * @author Taozi
 * 普通会员：可发布二手房源信息和发布租房房源信
 * 经纪人：可发布二手房源信息、发布租房房源信息
 * 品牌商家：可发布新盘信息、优惠资源信息、推送楼盘信息
 * 管理员：可设置所有分类信息、评论管理、设置应用信息
 *
 */
@Entity
@Table(name="admin")
public class Admin {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer adminId;
	private String adminName;
	private String password;
	private Integer permissions;//权限（1为普通会员，2经纪人，3品牌商家，4.管理员）
	public Integer getAdminId() {
		return adminId;
	}
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getPermissions() {
		return permissions;
	}
	public void setPermissions(Integer permissions) {
		this.permissions = permissions;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", password=" + password + ", permissions="
				+ permissions + "]";
	}

}
