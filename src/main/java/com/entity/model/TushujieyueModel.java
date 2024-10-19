package com.entity.model;

import com.entity.TushujieyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 借阅信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class TushujieyueModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 图书
     */
    private Integer tushuId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 借阅时间（天）
     */
    private Integer tushujieyueShijian;


    /**
     * 借阅状态
     */
    private Integer tushujieyueTypes;


    /**
     * 借阅时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：图书
	 */
    public Integer getTushuId() {
        return tushuId;
    }


    /**
	 * 设置：图书
	 */
    public void setTushuId(Integer tushuId) {
        this.tushuId = tushuId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：借阅时间（天）
	 */
    public Integer getTushujieyueShijian() {
        return tushujieyueShijian;
    }


    /**
	 * 设置：借阅时间（天）
	 */
    public void setTushujieyueShijian(Integer tushujieyueShijian) {
        this.tushujieyueShijian = tushujieyueShijian;
    }
    /**
	 * 获取：借阅状态
	 */
    public Integer getTushujieyueTypes() {
        return tushujieyueTypes;
    }


    /**
	 * 设置：借阅状态
	 */
    public void setTushujieyueTypes(Integer tushujieyueTypes) {
        this.tushujieyueTypes = tushujieyueTypes;
    }
    /**
	 * 获取：借阅时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：借阅时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
