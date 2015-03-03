package org.community.model.complex;

import org.community.model.WaterGauge;

/**
 * 复杂水表Model实体<br>
 * @author henrybit
 * @version 1.0
 * @since 2015/02/26
 */
public class ComplexWaterGauge extends WaterGauge {
	//楼栋号
	private String buildingNo;
	//房间号
	private String homeNo;
	public String getBuildingNo() {
		return buildingNo;
	}
	public void setBuildingNo(String buildingNo) {
		this.buildingNo = buildingNo;
	}
	public String getHomeNo() {
		return homeNo;
	}
	public void setHomeNo(String homeNo) {
		this.homeNo = homeNo;
	}
}
