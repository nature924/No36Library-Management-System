package com.entity.vo;

import com.entity.TushujieyueEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 借阅信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("tushujieyue")
public class TushujieyueVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
