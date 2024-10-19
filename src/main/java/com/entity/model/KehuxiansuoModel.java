package com.entity.model;

import com.entity.KehuxiansuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 客户线索
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KehuxiansuoModel implements Serializable {
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
     * 姓名
     */
    private String kehuxiansuoName;


    /**
     * 手机号
     */
    private String kehuxiansuoPhone;


    /**
     * 身份证号
     */
    private String kehuxiansuoIdNumber;


    /**
     * 照片
     */
    private String kehuxiansuoPhoto;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 电子邮箱
     */
    private String kehuxiansuoEmail;


    /**
     * 线索类型
     */
    private Integer kehuxiansuoTypes;


    /**
     * 线索详情
     */
    private String kehuxiansuoContent;


    /**
     * 添加时间
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
	 * 获取：姓名
	 */
    public String getKehuxiansuoName() {
        return kehuxiansuoName;
    }


    /**
	 * 设置：姓名
	 */
    public void setKehuxiansuoName(String kehuxiansuoName) {
        this.kehuxiansuoName = kehuxiansuoName;
    }
    /**
	 * 获取：手机号
	 */
    public String getKehuxiansuoPhone() {
        return kehuxiansuoPhone;
    }


    /**
	 * 设置：手机号
	 */
    public void setKehuxiansuoPhone(String kehuxiansuoPhone) {
        this.kehuxiansuoPhone = kehuxiansuoPhone;
    }
    /**
	 * 获取：身份证号
	 */
    public String getKehuxiansuoIdNumber() {
        return kehuxiansuoIdNumber;
    }


    /**
	 * 设置：身份证号
	 */
    public void setKehuxiansuoIdNumber(String kehuxiansuoIdNumber) {
        this.kehuxiansuoIdNumber = kehuxiansuoIdNumber;
    }
    /**
	 * 获取：照片
	 */
    public String getKehuxiansuoPhoto() {
        return kehuxiansuoPhoto;
    }


    /**
	 * 设置：照片
	 */
    public void setKehuxiansuoPhoto(String kehuxiansuoPhoto) {
        this.kehuxiansuoPhoto = kehuxiansuoPhoto;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：电子邮箱
	 */
    public String getKehuxiansuoEmail() {
        return kehuxiansuoEmail;
    }


    /**
	 * 设置：电子邮箱
	 */
    public void setKehuxiansuoEmail(String kehuxiansuoEmail) {
        this.kehuxiansuoEmail = kehuxiansuoEmail;
    }
    /**
	 * 获取：线索类型
	 */
    public Integer getKehuxiansuoTypes() {
        return kehuxiansuoTypes;
    }


    /**
	 * 设置：线索类型
	 */
    public void setKehuxiansuoTypes(Integer kehuxiansuoTypes) {
        this.kehuxiansuoTypes = kehuxiansuoTypes;
    }
    /**
	 * 获取：线索详情
	 */
    public String getKehuxiansuoContent() {
        return kehuxiansuoContent;
    }


    /**
	 * 设置：线索详情
	 */
    public void setKehuxiansuoContent(String kehuxiansuoContent) {
        this.kehuxiansuoContent = kehuxiansuoContent;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
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
