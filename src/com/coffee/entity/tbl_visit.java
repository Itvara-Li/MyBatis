/**
 * <p>Title: tbl_visit.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2018-5-23  
* @version 1.0  
 */
package com.coffee.entity;

import java.util.Date;

/**
 * @author coffeeliu
 *
 */
public class tbl_visit {
private Integer Visitid;
private tbl_user user;
private Date  Visitdate;
private String VisitIP;



public Integer getVisitid() {
	return Visitid;
}
public void setVisitid(Integer visitid) {
	Visitid = visitid;
}

public tbl_user getUser() {
	return user;
}
public void setUser(tbl_user user) {
	this.user = user;
}
public Date getVisitdate() {
	return Visitdate;
}
public void setVisitdate(Date visitdate) {
	Visitdate = visitdate;
}
public String getVisitIP() {
	return VisitIP;
}
public void setVisitIP(String visitIP) {
	VisitIP = visitIP;
}


}
