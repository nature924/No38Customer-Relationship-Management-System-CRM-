package com.entity.view;

import com.entity.GoutongEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 沟通记录
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("goutong")
public class GoutongView extends GoutongEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 沟通类型的值
		*/
		private String goutongValue;



		//级联表 kehu
			/**
			* 客户 的 员工
			*/
			private Integer kehuYuangongId;
			/**
			* 客户姓名
			*/
			private String kehuName;
			/**
			* 客户手机号
			*/
			private String kehuPhone;
			/**
			* 客户身份证号
			*/
			private String kehuIdNumber;
			/**
			* 客户照片
			*/
			private String kehuPhoto;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			/**
			* 电子邮箱
			*/
			private String kehuEmail;
			/**
			* 积分
			*/
			private Double kehuJifenNumber;
			/**
			* 客户详细介绍
			*/
			private String kehuContent;

		//级联表 yuangong
			/**
			* 员工姓名
			*/
			private String yuangongName;
			/**
			* 员工手机号
			*/
			private String yuangongPhone;
			/**
			* 员工身份证号
			*/
			private String yuangongIdNumber;
			/**
			* 员工头像
			*/
			private String yuangongPhoto;
			/**
			* 电子邮箱
			*/
			private String yuangongEmail;
			/**
			* 是否禁用
			*/
			private Integer jinyongTypes;
				/**
				* 是否禁用的值
				*/
				private String jinyongValue;

	public GoutongView() {

	}

	public GoutongView(GoutongEntity goutongEntity) {
		try {
			BeanUtils.copyProperties(this, goutongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 沟通类型的值
			*/
			public String getGoutongValue() {
				return goutongValue;
			}
			/**
			* 设置： 沟通类型的值
			*/
			public void setGoutongValue(String goutongValue) {
				this.goutongValue = goutongValue;
			}











				//级联表的get和set kehu
					/**
					* 获取：客户 的 员工
					*/
					public Integer getKehuYuangongId() {
						return kehuYuangongId;
					}
					/**
					* 设置：客户 的 员工
					*/
					public void setKehuYuangongId(Integer kehuYuangongId) {
						this.kehuYuangongId = kehuYuangongId;
					}

					/**
					* 获取： 客户姓名
					*/
					public String getKehuName() {
						return kehuName;
					}
					/**
					* 设置： 客户姓名
					*/
					public void setKehuName(String kehuName) {
						this.kehuName = kehuName;
					}
					/**
					* 获取： 客户手机号
					*/
					public String getKehuPhone() {
						return kehuPhone;
					}
					/**
					* 设置： 客户手机号
					*/
					public void setKehuPhone(String kehuPhone) {
						this.kehuPhone = kehuPhone;
					}
					/**
					* 获取： 客户身份证号
					*/
					public String getKehuIdNumber() {
						return kehuIdNumber;
					}
					/**
					* 设置： 客户身份证号
					*/
					public void setKehuIdNumber(String kehuIdNumber) {
						this.kehuIdNumber = kehuIdNumber;
					}
					/**
					* 获取： 客户照片
					*/
					public String getKehuPhoto() {
						return kehuPhoto;
					}
					/**
					* 设置： 客户照片
					*/
					public void setKehuPhoto(String kehuPhoto) {
						this.kehuPhoto = kehuPhoto;
					}
					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}
					/**
					* 获取： 电子邮箱
					*/
					public String getKehuEmail() {
						return kehuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setKehuEmail(String kehuEmail) {
						this.kehuEmail = kehuEmail;
					}
					/**
					* 获取： 积分
					*/
					public Double getKehuJifenNumber() {
						return kehuJifenNumber;
					}
					/**
					* 设置： 积分
					*/
					public void setKehuJifenNumber(Double kehuJifenNumber) {
						this.kehuJifenNumber = kehuJifenNumber;
					}
					/**
					* 获取： 客户详细介绍
					*/
					public String getKehuContent() {
						return kehuContent;
					}
					/**
					* 设置： 客户详细介绍
					*/
					public void setKehuContent(String kehuContent) {
						this.kehuContent = kehuContent;
					}








				//级联表的get和set yuangong
					/**
					* 获取： 员工姓名
					*/
					public String getYuangongName() {
						return yuangongName;
					}
					/**
					* 设置： 员工姓名
					*/
					public void setYuangongName(String yuangongName) {
						this.yuangongName = yuangongName;
					}
					/**
					* 获取： 员工手机号
					*/
					public String getYuangongPhone() {
						return yuangongPhone;
					}
					/**
					* 设置： 员工手机号
					*/
					public void setYuangongPhone(String yuangongPhone) {
						this.yuangongPhone = yuangongPhone;
					}
					/**
					* 获取： 员工身份证号
					*/
					public String getYuangongIdNumber() {
						return yuangongIdNumber;
					}
					/**
					* 设置： 员工身份证号
					*/
					public void setYuangongIdNumber(String yuangongIdNumber) {
						this.yuangongIdNumber = yuangongIdNumber;
					}
					/**
					* 获取： 员工头像
					*/
					public String getYuangongPhoto() {
						return yuangongPhoto;
					}
					/**
					* 设置： 员工头像
					*/
					public void setYuangongPhoto(String yuangongPhoto) {
						this.yuangongPhoto = yuangongPhoto;
					}
					/**
					* 获取： 电子邮箱
					*/
					public String getYuangongEmail() {
						return yuangongEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYuangongEmail(String yuangongEmail) {
						this.yuangongEmail = yuangongEmail;
					}
					/**
					* 获取： 是否禁用
					*/
					public Integer getJinyongTypes() {
						return jinyongTypes;
					}
					/**
					* 设置： 是否禁用
					*/
					public void setJinyongTypes(Integer jinyongTypes) {
						this.jinyongTypes = jinyongTypes;
					}


						/**
						* 获取： 是否禁用的值
						*/
						public String getJinyongValue() {
							return jinyongValue;
						}
						/**
						* 设置： 是否禁用的值
						*/
						public void setJinyongValue(String jinyongValue) {
							this.jinyongValue = jinyongValue;
						}




}
