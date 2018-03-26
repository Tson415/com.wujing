package com.wujing.dao.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.wujing.dao.base.BaseUuIdEntity;
import com.wujing.enums.UserType;

@Data
@Entity
@Table(name="TB_USER")
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseUuIdEntity{
	
	@Column(name="IDNUMBER",nullable = false)
	private String idNumber;
	
	@Column(name="LOGINNAME",nullable = false)
	private String loginName;
	
	@Column(name="MOBILE",nullable = false)
	private String mobile;
	
	@Column(name="NANME",nullable = false)
	private  String name;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="REGISTERDATE",nullable = false)
	private Date  registerDate;

	@Enumerated(EnumType.STRING)
	@Column(name="USER_TYPE",nullable=false)
	private UserType  userType;
	
	@Column(name="IP",nullable = false)
	private String ip;

}
