package com.entity.vo;

import com.entity.GoutongEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 沟通记录
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("goutong")
public class GoutongVO implements Serializable {
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
     * 沟通标题
     */

    @TableField(value = "goutong_name")
    private String goutongName;


    /**
     * 沟通类型
     */

    @TableField(value = "goutong_types")
    private Integer goutongTypes;


    /**
     * 沟通时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "goutong_time")
    private Date goutongTime;


    /**
     * 沟通详情
     */

    @TableField(value = "goutong_content")
    private String goutongContent;


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
	 * 设置：沟通标题
	 */
    public String getGoutongName() {
        return goutongName;
    }


    /**
	 * 获取：沟通标题
	 */

    public void setGoutongName(String goutongName) {
        this.goutongName = goutongName;
    }
    /**
	 * 设置：沟通类型
	 */
    public Integer getGoutongTypes() {
        return goutongTypes;
    }


    /**
	 * 获取：沟通类型
	 */

    public void setGoutongTypes(Integer goutongTypes) {
        this.goutongTypes = goutongTypes;
    }
    /**
	 * 设置：沟通时间
	 */
    public Date getGoutongTime() {
        return goutongTime;
    }


    /**
	 * 获取：沟通时间
	 */

    public void setGoutongTime(Date goutongTime) {
        this.goutongTime = goutongTime;
    }
    /**
	 * 设置：沟通详情
	 */
    public String getGoutongContent() {
        return goutongContent;
    }


    /**
	 * 获取：沟通详情
	 */

    public void setGoutongContent(String goutongContent) {
        this.goutongContent = goutongContent;
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
