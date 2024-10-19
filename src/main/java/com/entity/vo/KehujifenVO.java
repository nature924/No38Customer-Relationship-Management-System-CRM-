package com.entity.vo;

import com.entity.KehujifenEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 客户积分
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("kehujifen")
public class KehujifenVO implements Serializable {
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

}
