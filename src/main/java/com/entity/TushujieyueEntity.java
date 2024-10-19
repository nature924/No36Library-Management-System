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
 * 借阅信息
 *
 * @author 
 * @email
 */
@TableName("tushujieyue")
public class TushujieyueEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public TushujieyueEntity() {

	}

	public TushujieyueEntity(T t) {
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
     * 图书
     */
    @TableField(value = "tushu_id")

    private Integer tushuId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 借阅时间（天）
     */
    @TableField(value = "tushujieyue_shijian")

    private Integer tushujieyueShijian;


    /**
     * 借阅状态
     */
    @TableField(value = "tushujieyue_types")

    private Integer tushujieyueTypes;


    /**
     * 借阅时间
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
	 * 设置：图书
	 */
    public Integer getTushuId() {
        return tushuId;
    }


    /**
	 * 获取：图书
	 */

    public void setTushuId(Integer tushuId) {
        this.tushuId = tushuId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：借阅时间（天）
	 */
    public Integer getTushujieyueShijian() {
        return tushujieyueShijian;
    }


    /**
	 * 获取：借阅时间（天）
	 */

    public void setTushujieyueShijian(Integer tushujieyueShijian) {
        this.tushujieyueShijian = tushujieyueShijian;
    }
    /**
	 * 设置：借阅状态
	 */
    public Integer getTushujieyueTypes() {
        return tushujieyueTypes;
    }


    /**
	 * 获取：借阅状态
	 */

    public void setTushujieyueTypes(Integer tushujieyueTypes) {
        this.tushujieyueTypes = tushujieyueTypes;
    }
    /**
	 * 设置：借阅时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：借阅时间
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
        return "Tushujieyue{" +
            "id=" + id +
            ", tushuId=" + tushuId +
            ", yonghuId=" + yonghuId +
            ", tushujieyueShijian=" + tushujieyueShijian +
            ", tushujieyueTypes=" + tushujieyueTypes +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
