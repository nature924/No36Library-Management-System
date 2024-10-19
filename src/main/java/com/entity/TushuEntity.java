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
 * 图书信息
 *
 * @author 
 * @email
 */
@TableName("tushu")
public class TushuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public TushuEntity() {

	}

	public TushuEntity(T t) {
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
     * 图书编号
     */
    @TableField(value = "tushu_uuid_number")

    private String tushuUuidNumber;


    /**
     * 图书标题
     */
    @TableField(value = "tushu_name")

    private String tushuName;


    /**
     * 图书类型
     */
    @TableField(value = "tushu_types")

    private Integer tushuTypes;


    /**
     * 图书封面
     */
    @TableField(value = "tushu_photo")

    private String tushuPhoto;


    /**
     * 图书作者
     */
    @TableField(value = "tushu_zuozhe")

    private String tushuZuozhe;


    /**
     * 图书出版社
     */
    @TableField(value = "chubanshe_types")

    private Integer chubansheTypes;


    /**
     * 所在书架
     */
    @TableField(value = "shujia_types")

    private Integer shujiaTypes;


    /**
     * 图书数量
     */
    @TableField(value = "tushu_number")

    private Integer tushuNumber;


    /**
     * 图书详情
     */
    @TableField(value = "tushu_content")

    private String tushuContent;


    /**
     * 发布时间
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
	 * 设置：图书编号
	 */
    public String getTushuUuidNumber() {
        return tushuUuidNumber;
    }


    /**
	 * 获取：图书编号
	 */

    public void setTushuUuidNumber(String tushuUuidNumber) {
        this.tushuUuidNumber = tushuUuidNumber;
    }
    /**
	 * 设置：图书标题
	 */
    public String getTushuName() {
        return tushuName;
    }


    /**
	 * 获取：图书标题
	 */

    public void setTushuName(String tushuName) {
        this.tushuName = tushuName;
    }
    /**
	 * 设置：图书类型
	 */
    public Integer getTushuTypes() {
        return tushuTypes;
    }


    /**
	 * 获取：图书类型
	 */

    public void setTushuTypes(Integer tushuTypes) {
        this.tushuTypes = tushuTypes;
    }
    /**
	 * 设置：图书封面
	 */
    public String getTushuPhoto() {
        return tushuPhoto;
    }


    /**
	 * 获取：图书封面
	 */

    public void setTushuPhoto(String tushuPhoto) {
        this.tushuPhoto = tushuPhoto;
    }
    /**
	 * 设置：图书作者
	 */
    public String getTushuZuozhe() {
        return tushuZuozhe;
    }


    /**
	 * 获取：图书作者
	 */

    public void setTushuZuozhe(String tushuZuozhe) {
        this.tushuZuozhe = tushuZuozhe;
    }
    /**
	 * 设置：图书出版社
	 */
    public Integer getChubansheTypes() {
        return chubansheTypes;
    }


    /**
	 * 获取：图书出版社
	 */

    public void setChubansheTypes(Integer chubansheTypes) {
        this.chubansheTypes = chubansheTypes;
    }
    /**
	 * 设置：所在书架
	 */
    public Integer getShujiaTypes() {
        return shujiaTypes;
    }


    /**
	 * 获取：所在书架
	 */

    public void setShujiaTypes(Integer shujiaTypes) {
        this.shujiaTypes = shujiaTypes;
    }
    /**
	 * 设置：图书数量
	 */
    public Integer getTushuNumber() {
        return tushuNumber;
    }


    /**
	 * 获取：图书数量
	 */

    public void setTushuNumber(Integer tushuNumber) {
        this.tushuNumber = tushuNumber;
    }
    /**
	 * 设置：图书详情
	 */
    public String getTushuContent() {
        return tushuContent;
    }


    /**
	 * 获取：图书详情
	 */

    public void setTushuContent(String tushuContent) {
        this.tushuContent = tushuContent;
    }
    /**
	 * 设置：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：发布时间
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
        return "Tushu{" +
            "id=" + id +
            ", tushuUuidNumber=" + tushuUuidNumber +
            ", tushuName=" + tushuName +
            ", tushuTypes=" + tushuTypes +
            ", tushuPhoto=" + tushuPhoto +
            ", tushuZuozhe=" + tushuZuozhe +
            ", chubansheTypes=" + chubansheTypes +
            ", shujiaTypes=" + shujiaTypes +
            ", tushuNumber=" + tushuNumber +
            ", tushuContent=" + tushuContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
