package com.entity.model;

import com.entity.GoutongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 沟通记录
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GoutongModel implements Serializable {
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
     * 沟通标题
     */
    private String goutongName;


    /**
     * 沟通类型
     */
    private Integer goutongTypes;


    /**
     * 沟通时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date goutongTime;


    /**
     * 沟通详情
     */
    private String goutongContent;


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
	 * 获取：沟通标题
	 */
    public String getGoutongName() {
        return goutongName;
    }


    /**
	 * 设置：沟通标题
	 */
    public void setGoutongName(String goutongName) {
        this.goutongName = goutongName;
    }
    /**
	 * 获取：沟通类型
	 */
    public Integer getGoutongTypes() {
        return goutongTypes;
    }


    /**
	 * 设置：沟通类型
	 */
    public void setGoutongTypes(Integer goutongTypes) {
        this.goutongTypes = goutongTypes;
    }
    /**
	 * 获取：沟通时间
	 */
    public Date getGoutongTime() {
        return goutongTime;
    }


    /**
	 * 设置：沟通时间
	 */
    public void setGoutongTime(Date goutongTime) {
        this.goutongTime = goutongTime;
    }
    /**
	 * 获取：沟通详情
	 */
    public String getGoutongContent() {
        return goutongContent;
    }


    /**
	 * 设置：沟通详情
	 */
    public void setGoutongContent(String goutongContent) {
        this.goutongContent = goutongContent;
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
