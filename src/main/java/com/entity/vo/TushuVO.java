package com.entity.vo;

import com.entity.TushuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 图书信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("tushu")
public class TushuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
