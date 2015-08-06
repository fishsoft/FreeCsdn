package com.free.csdn.bean;

import com.lidroid.xutils.db.annotation.Column;

/**
 * 博客页面
 * 
 * @author tangqi
 * @data 2015年8月6日下午11:28:30
 */

public class BlogHtml extends BaseEntity {

	private static final long serialVersionUID = -590113455366277508L;

	@Column(column = "url")
	private String url;// 地址

	@Column(column = "html")
	private String html; // 标题

	@Column(column = "")
	private String reserve; // 保留

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getHtml() {
		return html;
	}

	public void setHtml(String html) {
		this.html = html;
	}

	public String getReserve() {
		return reserve;
	}

	public void setReserve(String reserve) {
		this.reserve = reserve;
	}

}
