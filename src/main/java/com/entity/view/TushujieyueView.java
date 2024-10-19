package com.entity.view;

import com.entity.TushujieyueEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 借阅信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("tushujieyue")
public class TushujieyueView extends TushujieyueEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 借阅状态的值
		*/
		private String tushujieyueValue;



		//级联表 tushu
			/**
			* 图书编号
			*/
			private String tushuUuidNumber;
			/**
			* 图书标题
			*/
			private String tushuName;
			/**
			* 图书类型
			*/
			private Integer tushuTypes;
				/**
				* 图书类型的值
				*/
				private String tushuValue;
			/**
			* 图书封面
			*/
			private String tushuPhoto;
			/**
			* 图书作者
			*/
			private String tushuZuozhe;
			/**
			* 图书出版社
			*/
			private Integer chubansheTypes;
				/**
				* 图书出版社的值
				*/
				private String chubansheValue;
			/**
			* 所在书架
			*/
			private Integer shujiaTypes;
				/**
				* 所在书架的值
				*/
				private String shujiaValue;
			/**
			* 图书数量
			*/
			private Integer tushuNumber;
			/**
			* 图书详情
			*/
			private String tushuContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public TushujieyueView() {

	}

	public TushujieyueView(TushujieyueEntity tushujieyueEntity) {
		try {
			BeanUtils.copyProperties(this, tushujieyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 借阅状态的值
			*/
			public String getTushujieyueValue() {
				return tushujieyueValue;
			}
			/**
			* 设置： 借阅状态的值
			*/
			public void setTushujieyueValue(String tushujieyueValue) {
				this.tushujieyueValue = tushujieyueValue;
			}













				//级联表的get和set tushu
					/**
					* 获取： 图书编号
					*/
					public String getTushuUuidNumber() {
						return tushuUuidNumber;
					}
					/**
					* 设置： 图书编号
					*/
					public void setTushuUuidNumber(String tushuUuidNumber) {
						this.tushuUuidNumber = tushuUuidNumber;
					}
					/**
					* 获取： 图书标题
					*/
					public String getTushuName() {
						return tushuName;
					}
					/**
					* 设置： 图书标题
					*/
					public void setTushuName(String tushuName) {
						this.tushuName = tushuName;
					}
					/**
					* 获取： 图书类型
					*/
					public Integer getTushuTypes() {
						return tushuTypes;
					}
					/**
					* 设置： 图书类型
					*/
					public void setTushuTypes(Integer tushuTypes) {
						this.tushuTypes = tushuTypes;
					}


						/**
						* 获取： 图书类型的值
						*/
						public String getTushuValue() {
							return tushuValue;
						}
						/**
						* 设置： 图书类型的值
						*/
						public void setTushuValue(String tushuValue) {
							this.tushuValue = tushuValue;
						}
					/**
					* 获取： 图书封面
					*/
					public String getTushuPhoto() {
						return tushuPhoto;
					}
					/**
					* 设置： 图书封面
					*/
					public void setTushuPhoto(String tushuPhoto) {
						this.tushuPhoto = tushuPhoto;
					}
					/**
					* 获取： 图书作者
					*/
					public String getTushuZuozhe() {
						return tushuZuozhe;
					}
					/**
					* 设置： 图书作者
					*/
					public void setTushuZuozhe(String tushuZuozhe) {
						this.tushuZuozhe = tushuZuozhe;
					}
					/**
					* 获取： 图书出版社
					*/
					public Integer getChubansheTypes() {
						return chubansheTypes;
					}
					/**
					* 设置： 图书出版社
					*/
					public void setChubansheTypes(Integer chubansheTypes) {
						this.chubansheTypes = chubansheTypes;
					}


						/**
						* 获取： 图书出版社的值
						*/
						public String getChubansheValue() {
							return chubansheValue;
						}
						/**
						* 设置： 图书出版社的值
						*/
						public void setChubansheValue(String chubansheValue) {
							this.chubansheValue = chubansheValue;
						}
					/**
					* 获取： 所在书架
					*/
					public Integer getShujiaTypes() {
						return shujiaTypes;
					}
					/**
					* 设置： 所在书架
					*/
					public void setShujiaTypes(Integer shujiaTypes) {
						this.shujiaTypes = shujiaTypes;
					}


						/**
						* 获取： 所在书架的值
						*/
						public String getShujiaValue() {
							return shujiaValue;
						}
						/**
						* 设置： 所在书架的值
						*/
						public void setShujiaValue(String shujiaValue) {
							this.shujiaValue = shujiaValue;
						}
					/**
					* 获取： 图书数量
					*/
					public Integer getTushuNumber() {
						return tushuNumber;
					}
					/**
					* 设置： 图书数量
					*/
					public void setTushuNumber(Integer tushuNumber) {
						this.tushuNumber = tushuNumber;
					}
					/**
					* 获取： 图书详情
					*/
					public String getTushuContent() {
						return tushuContent;
					}
					/**
					* 设置： 图书详情
					*/
					public void setTushuContent(String tushuContent) {
						this.tushuContent = tushuContent;
					}







				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
