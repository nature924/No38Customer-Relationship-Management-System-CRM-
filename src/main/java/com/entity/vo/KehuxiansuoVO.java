package com.entity.vo;

import com.entity.KehuxiansuoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 客户线索
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("kehuxiansuo")
public class KehuxiansuoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 员工
     */

    @TableField(value = "yuangong_id")
    private Integer yuangongId;


    /**
     * 姓名
     */

    @TableField(value = "kehuxiansuo_name")
    private String kehuxiansuoName;


    /**
     * 手机号
     */

    @TableField(value = "kehuxiansuo_phone")
    private String kehuxiansuoPhone;


    /**
     * 身份证号
     */

    @TableField(value = "kehuxiansuo_id_number")
    private String kehuxiansuoIdNumber;


    /**
     * 照片
     */

    @TableField(value = "kehuxiansuo_photo")
    private String kehuxiansuoPhoto;


    /**
     * 性别
     */

    @TableField(value = "sex_types")
    private Integer sexTypes;


    /**
     * 电子邮箱
     */

    @TableField(value = "kehuxiansuo_email")
    private String kehuxiansuoEmail;


    /**
     * 线索类型
     */

    @TableField(value = "kehuxiansuo_types")
    private Integer kehuxiansuoTypes;


    /**
     * 线索详情
     */

    @TableField(value = "kehuxiansuo_content")
    private String kehuxiansuoContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：员工
	 */
    public Integer getYuangongId() {
        return yuangongId;
    }


    /**
	 * 获取：员工
	 */

    public void setYuangongId(Integer yuangongId) {
        this.yuangongId = yuangongId;
    }
    /**
	 * 设置：姓名
	 */
    public String getKehuxiansuoName() {
        return kehuxiansuoName;
    }


    /**
	 * 获取：姓名
	 */

    public void setKehuxiansuoName(String kehuxiansuoName) {
        this.kehuxiansuoName = kehuxiansuoName;
    }
    /**
	 * 设置：手机号
	 */
    public String getKehuxiansuoPhone() {
        return kehuxiansuoPhone;
    }


    /**
	 * 获取：手机号
	 */

    public void setKehuxiansuoPhone(String kehuxiansuoPhone) {
        this.kehuxiansuoPhone = kehuxiansuoPhone;
    }
    /**
	 * 设置：身份证号
	 */
    public String getKehuxiansuoIdNumber() {
        return kehuxiansuoIdNumber;
    }


    /**
	 * 获取：身份证号
	 */

    public void setKehuxiansuoIdNumber(String kehuxiansuoIdNumber) {
        this.kehuxiansuoIdNumber = kehuxiansuoIdNumber;
    }
    /**
	 * 设置：照片
	 */
    public String getKehuxiansuoPhoto() {
        return kehuxiansuoPhoto;
    }


    /**
	 * 获取：照片
	 */

    public void setKehuxiansuoPhoto(String kehuxiansuoPhoto) {
        this.kehuxiansuoPhoto = kehuxiansuoPhoto;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：电子邮箱
	 */
    public String getKehuxiansuoEmail() {
        return kehuxiansuoEmail;
    }


    /**
	 * 获取：电子邮箱
	 */

    public void setKehuxiansuoEmail(String kehuxiansuoEmail) {
        this.kehuxiansuoEmail = kehuxiansuoEmail;
    }
    /**
	 * 设置：线索类型
	 */
    public Integer getKehuxiansuoTypes() {
        return kehuxiansuoTypes;
    }


    /**
	 * 获取：线索类型
	 */

    public void setKehuxiansuoTypes(Integer kehuxiansuoTypes) {
        this.kehuxiansuoTypes = kehuxiansuoTypes;
    }
    /**
	 * 设置：线索详情
	 */
    public String getKehuxiansuoContent() {
        return kehuxiansuoContent;
    }


    /**
	 * 获取：线索详情
	 */

    public void setKehuxiansuoContent(String kehuxiansuoContent) {
        this.kehuxiansuoContent = kehuxiansuoContent;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
