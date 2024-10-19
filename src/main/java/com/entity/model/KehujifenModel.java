package com.entity.model;

import com.entity.KehujifenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 客户积分
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KehujifenModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 员工
     */
    private Integer yuangongId;


    /**
     * 客户
     */
    private Integer kehuId;


    /**
     * 增加类型
     */
    private Integer kehujifenTypes;


    /**
     * 备注
     */
    private String kehujifenContent;


    /**
     * 增加积分数量
     */
    private Double kehujifenNumber;


    /**
     * 增加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：员工
	 */
    public Integer getYuangongId() {
        return yuangongId;
    }


    /**
	 * 设置：员工
	 */
    public void setYuangongId(Integer yuangongId) {
        this.yuangongId = yuangongId;
    }
    /**
	 * 获取：客户
	 */
    public Integer getKehuId() {
        return kehuId;
    }


    /**
	 * 设置：客户
	 */
    public void setKehuId(Integer kehuId) {
        this.kehuId = kehuId;
    }
    /**
	 * 获取：增加类型
	 */
    public Integer getKehujifenTypes() {
        return kehujifenTypes;
    }


    /**
	 * 设置：增加类型
	 */
    public void setKehujifenTypes(Integer kehujifenTypes) {
        this.kehujifenTypes = kehujifenTypes;
    }
    /**
	 * 获取：备注
	 */
    public String getKehujifenContent() {
        return kehujifenContent;
    }


    /**
	 * 设置：备注
	 */
    public void setKehujifenContent(String kehujifenContent) {
        this.kehujifenContent = kehujifenContent;
    }
    /**
	 * 获取：增加积分数量
	 */
    public Double getKehujifenNumber() {
        return kehujifenNumber;
    }


    /**
	 * 设置：增加积分数量
	 */
    public void setKehujifenNumber(Double kehujifenNumber) {
        this.kehujifenNumber = kehujifenNumber;
    }
    /**
	 * 获取：增加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：增加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
