package org.community.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.community.dao.ElectricGaugeDao;
import org.community.dao.GasGaugeDao;
import org.community.dao.HomeGaugeRelationDao;
import org.community.dao.WaterGaugeDao;
import org.community.model.ElectricGauge;
import org.community.model.GasGauge;
import org.community.model.WaterGauge;
import org.community.model.complex.ComplexWaterGauge;
import org.community.param.WaterGaugeParam;
import org.community.service.GaugeService;
import org.community.util.Constant;
import org.community.util.ConvertTools;
import org.community.util.ValidTools;
import org.community.vo.ElectricGaugeVO;
import org.community.vo.GasGaugeVO;
import org.community.vo.WaterGaugeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 房屋相关表Service层服务<br>
 * @author henrybit
 * @version 1.0
 * @since 2015/02/25
 */
@Service
public class GaugeServiceImpl extends BaseService implements GaugeService {
	@Autowired
	private WaterGaugeDao waterGaugeDao;
	@Autowired
	private ElectricGaugeDao electricGaugeDao;
	@Autowired
	private GasGaugeDao gasGaugeDao;
	@Autowired
	private HomeGaugeRelationDao homeGaugeRelationDao;
	//get and set//
	public WaterGaugeDao getWaterGaugeDao() {
		return waterGaugeDao;
	}
	public void setWaterGaugeDao(WaterGaugeDao waterGaugeDao) {
		this.waterGaugeDao = waterGaugeDao;
	}
	public ElectricGaugeDao getElectricGaugeDao() {
		return electricGaugeDao;
	}
	public void setElectricGaugeDao(ElectricGaugeDao electricGaugeDao) {
		this.electricGaugeDao = electricGaugeDao;
	}
	public GasGaugeDao getGasGaugeDao() {
		return gasGaugeDao;
	}
	public void setGasGaugeDao(GasGaugeDao gasGaugeDao) {
		this.gasGaugeDao = gasGaugeDao;
	}
	public HomeGaugeRelationDao getHomeGaugeRelationDao() {
		return homeGaugeRelationDao;
	}
	public void setHomeGaugeRelationDao(HomeGaugeRelationDao homeGaugeRelationDao) {
		this.homeGaugeRelationDao = homeGaugeRelationDao;
	}
	//get and set end//
	
	@Override
	public List<WaterGaugeVO> getWaterGaugeList(int communityid, int pageNo, int pageNum) {
		// TODO Auto-generated method stub
		//1.查询相应社区下的所有水表
		List<WaterGaugeVO> voList = new ArrayList<WaterGaugeVO>();
		List<Long> waterGaugeIds = new ArrayList<Long>();
		try {
			List<WaterGauge> waterGaugeList = this.waterGaugeDao.query(communityid, pageNo, pageNum);
			for(int i=0; waterGaugeList!=null&&i<waterGaugeList.size(); i++) {
				WaterGauge waterGauge = waterGaugeList.get(i);
				WaterGaugeVO vo = ConvertTools.waterGaugeModelToVo(waterGauge);
				voList.add(vo);
				waterGaugeIds.add(vo.getId());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		//2.查询相应水表的相关房屋信息 TODO
		waterGaugeIds.clear();
		return voList;
	}
	
	@Override
	public List<ElectricGaugeVO> getElectricGaugeList(int communityid, int pageNo, int pageNum) {
		//1.查询相应社区下的所有电表
		List<ElectricGaugeVO> voList = new ArrayList<ElectricGaugeVO>();
		List<Long> electricGaugeIds = new ArrayList<Long>();
		try {
			List<ElectricGauge> electricGaugeList = this.electricGaugeDao.query(communityid, pageNo, pageNum);
			for(int i=0; electricGaugeList!=null&&i<electricGaugeList.size(); i++) {
				ElectricGauge electricGauge = electricGaugeList.get(i);
				ElectricGaugeVO vo = ConvertTools.electricGaugeModelToVo(electricGauge);
				voList.add(vo);
				electricGaugeIds.add(vo.getId());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		//2.查询相应电表的相关房屋信息 TODO
		electricGaugeIds.clear();
		return voList;
	}
	@Override
	public List<GasGaugeVO> getGasGaugeList(int communityid, int pageNo, int pageNum) {
		//1.查询相应社区下的所有天然气表
		List<GasGaugeVO> voList = new ArrayList<GasGaugeVO>();
		List<Long> gasGaugeIds = new ArrayList<Long>();
		try {
			List<GasGauge> gasGaugeList = this.gasGaugeDao.query(communityid, pageNo, pageNum);
			for(int i=0; gasGaugeList!=null&&i<gasGaugeList.size(); i++) {
				GasGauge gasGauge = gasGaugeList.get(i);
				GasGaugeVO vo = ConvertTools.gasGaugeModelToVo(gasGauge);
				voList.add(vo);
				gasGaugeIds.add(vo.getId());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		//2.查询相应天然气表的相关房屋信息 TODO
		gasGaugeIds.clear();
		return voList;
	}
	
	
	
	@Override
	public WaterGaugeVO getWaterGauge(long id) {
		WaterGaugeVO vo = null;
		try {
			WaterGauge waterGauge = this.waterGaugeDao.queryById(id);
			vo = ConvertTools.waterGaugeModelToVo(waterGauge);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}
	@Override
	public ElectricGaugeVO getElectricGauge(long id) {
		ElectricGaugeVO vo = null;
		try {
			ElectricGauge EeectricGauge = this.electricGaugeDao.queryById(id);
			vo = ConvertTools.electricGaugeModelToVo(EeectricGauge);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}
	@Override
	public GasGaugeVO getGasGauge(long id) {
		GasGaugeVO vo = null;
		try {
			GasGauge gasGauge = this.gasGaugeDao.queryById(id);
			vo = ConvertTools.gasGaugeModelToVo(gasGauge);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}
	@Override
	public boolean updateWaterGauge(WaterGaugeVO vo) {
		boolean success = false;
		try {
			WaterGauge waterGauge = ConvertTools.waterGaugeVoToModel(vo);
			int lineNum = this.waterGaugeDao.updateOneById(waterGauge);
			if(lineNum > 0)
				success = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return success;
	}
	@Override
	public boolean updateElectricGauge(ElectricGaugeVO vo) {
		boolean success = false;
		try {
			ElectricGauge electricGauge = ConvertTools.electricGaugeVoToModel(vo);
			int lineNum = this.electricGaugeDao.updateOneById(electricGauge);
			if(lineNum > 0)
				success = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return success;
	}
	@Override
	public boolean updateGasGauge(GasGaugeVO vo) {
		boolean success = false;
		try {
			GasGauge gasGauge = ConvertTools.gasGaugeVoToModel(vo);
			int lineNum = this.gasGaugeDao.updateOneById(gasGauge);
			if(lineNum > 0)
				success = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return success;
	}
	@Override
	public boolean addWaterGauge(WaterGaugeVO vo) {
		boolean success = false;
		try {
			Date now = new Date();
			WaterGauge waterGauge = ConvertTools.waterGaugeVoToModel(vo);
			waterGauge.setCreateTime(now);
			waterGauge.setDataStatus(Constant.DATA_STATUS_VALID);
			int lineNum = this.waterGaugeDao.addOne(waterGauge);
			if(lineNum > 0)
				success = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return success;
	}
	@Override
	public boolean addElectricGauge(ElectricGaugeVO vo) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean addGasGauge(GasGaugeVO vo) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean deleteWaterGauge(WaterGaugeVO vo) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean deleteElectricGauge(ElectricGaugeVO vo) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean deleteGasGauge(GasGaugeVO vo) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public List<WaterGaugeVO> queryWaterGaugeListByParam(WaterGaugeParam waterGaugeParam) {
		if(waterGaugeParam == null)
			return null;
		List<WaterGaugeVO> voList = new ArrayList<WaterGaugeVO>();
		try {
			int pageNo = waterGaugeParam.getPageNo();
			int pageNum = waterGaugeParam.getPageNum();
			if(pageNum <= 0)
				pageNum = Constant.DEFAULT_PAGE_NUM;
			HashMap<String, String> map = new HashMap<String, String>();
			String searchText = waterGaugeParam.getSearchText();
			int type = waterGaugeParam.getType();
			int orderWay = waterGaugeParam.getOrder();
			
			//参数验证 TODO
			if(!ValidTools.isEmptyString(searchText)) {
				map.put("homeNo", searchText);
				map.put("buildingNo", searchText);
			}
			map.put("type", ConvertTools.intToString(type));
			switch(orderWay) {
			case Constant.WaterGauge.ORDER_TYPE_NATURAL:break;
			case Constant.WaterGauge.ORDER_TYPE_TIME_ASC:map.put("orderByTimeAsc", "1");break;
			case Constant.WaterGauge.ORDER_TYPE_TIME_DESC:map.put("orderByTimeDesc", "1");break;
			default:break;
			}
			List<ComplexWaterGauge> complexWaterGaugeList = this.waterGaugeDao.queryListComplex(map, pageNo, pageNum);
			for(ComplexWaterGauge cWaterGauge : complexWaterGaugeList) {
				WaterGaugeVO vo = ConvertTools.waterGaugeComplexModelToVo(cWaterGauge);
				if(vo != null)
					voList.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return voList;
	}
	@Override
	public boolean dropWaterGauge(WaterGaugeVO vo) {
		boolean success = false;
		try {
			WaterGauge waterGauge = ConvertTools.waterGaugeVoToModel(vo);
			int lineNum = this.waterGaugeDao.dropOne(waterGauge);
			if(lineNum > 0)
				success = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return success;
	}
	@Override
	public boolean dropElectricGauge(ElectricGaugeVO vo) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean dropGasGauge(GasGaugeVO vo) {
		// TODO Auto-generated method stub
		return false;
	}
}
