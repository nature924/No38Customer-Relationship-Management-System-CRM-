package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 客户积分
 *
 * @author 
 * @email
 */
@TableName("kehujifen")
public class KehujifenEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public KehujifenEntity() {

	}

	public KehujifenEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 员工
     */
    @TableField(value = "yuangong_id")

    private Integer yuangongId;


    /**
     * 客户
     */
    @TableField(value = "kehu_id")

    private Integer kehuId;


    /**
     * 增加类型
     */
    @TableField(value = "kehujifen_types")

    private Integer kehujifenTypes;


    /**
     * 备注
     */
    @TableField(value = "kehujifen_content")

    private String kehujifenContent;


    /**
     * 增加积分数量
     */
    @TableField(value = "kehujifen_number")

    private Double kehujifenNumber;


    /**
     * 增加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：客户
	 */
    public Integer getKehuId() {
        return kehuId;
    }


    /**
	 * 获取：客户
	 */

    public void setKehuId(Integer kehuId) {
        this.kehuId = kehuId;
    }
    /**
	 * 设置：增加类型
	 */
    public Integer getKehujifenTypes() {
        return kehujifenTypes;
    }


    /**
	 * 获取：增加类型
	 */

    public void setKehujifenTypes(Integer kehujifenTypes) {
        this.kehujifenTypes = kehujifenTypes;
    }
    /**
	 * 设置：备注
	 */
    public String getKehujifenContent() {
        return kehujifenContent;
    }


    /**
	 * 获取：备注
	 */

    public void setKehujifenContent(String kehujifenContent) {
        this.kehujifenContent = kehujifenContent;
    }
    /**
	 * 设置：增加积分数量
	 */
    public Double getKehujifenNumber() {
        return kehujifenNumber;
    }


    /**
	 * 获取：增加积分数量
	 */

    public void setKehujifenNumber(Double kehujifenNumber) {
        this.kehujifenNumber = kehujifenNumber;
    }
    /**
	 * 设置：增加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：增加时间
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

    @Override
    public String toString() {
        return "Kehujifen{" +
            "id=" + id +
            ", yuangongId=" + yuangongId +
            ", kehuId=" + kehuId +
            ", kehujifenTypes=" + kehujifenTypes +
            ", kehujifenContent=" + kehujifenContent +
            ", kehujifenNumber=" + kehujifenNumber +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
