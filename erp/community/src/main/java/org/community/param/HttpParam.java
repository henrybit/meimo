package org.community.param;

/**
 * HTTP相关参数<br>
 * @author henrybit
 * @version 1.0
 * @since 2015/03/02
 */
public class HttpParam {
	//访问的URI地址
	private String uri;
	//访问的URL地址
	private String url;
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
