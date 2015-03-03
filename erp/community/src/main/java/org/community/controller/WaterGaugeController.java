package org.community.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.community.param.WaterGaugeParam;
import org.community.service.GaugeService;
import org.community.util.Constant;
import org.community.util.ConvertTools;
import org.community.vo.WaterGaugeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

/**
 * 水表管理相关controller<br>
 * @author henrybit
 * @version 1.0
 * @since 2015/02/25
 */
@Controller
@RequestMapping(value="/water_gauge")
public class WaterGaugeController {
	@Autowired
	private GaugeService gaugeService;
	public GaugeService getGaugeService() {
		return gaugeService;
	}
	public void setGaugeService(GaugeService gaugeService) {
		this.gaugeService = gaugeService;
	}
	
	@RequestMapping(value="list.do")
	public ModelAndView getList(HttpServletRequest request,HttpServletResponse response, WaterGaugeParam waterGaugeParam) {
		if(waterGaugeParam == null)
			return null;
		int pageNo = waterGaugeParam.getPageNo();
		int pageNum = waterGaugeParam.getPageNum();
		if(pageNum <= 0)
			pageNum = Constant.DEFAULT_PAGE_NUM;
		int communityid = waterGaugeParam.getCommunityid();
		List<WaterGaugeVO> voList = gaugeService.getWaterGaugeList(communityid, pageNo, pageNum);
		
		ModelAndView mv = new ModelAndView("/gauge/water_gauge");
		mv.addObject("voList", voList);
		return mv;
	}
	
	@RequestMapping(value="editPannel.do")
	public ModelAndView getEditPannel(HttpServletRequest request,HttpServletResponse response, WaterGaugeParam waterGaugeParam) {
		if(waterGaugeParam == null)
			return null;
		long id = waterGaugeParam.getId();
		WaterGaugeVO waterGaugeVo = this.gaugeService.getWaterGauge(id);
		ModelAndView mv = new ModelAndView("/gauge/water_gauge_edit");
		mv.addObject("waterGaugeVo", waterGaugeVo);
		return mv;
	}
	
	@RequestMapping(value="addPannel.do")
	public ModelAndView getAddPannel(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("/gauge/water_gauge_add");
		return mv;
	}
	
	@RequestMapping(value="updateOne.do")
	public ModelAndView updateOne(HttpServletRequest request,HttpServletResponse response, WaterGaugeParam waterGaugeParam) {
		if(waterGaugeParam == null)
			return null;
		boolean isSuccess = false;
		try {
			WaterGaugeVO vo = new WaterGaugeVO();
			vo = ConvertTools.waterGaugeParamToVo(waterGaugeParam);
			isSuccess = this.gaugeService.updateWaterGauge(vo);
		} catch (Exception e) {
			isSuccess = false;
		}
		ModelAndView mv = new ModelAndView();
		MappingJackson2JsonView view = new MappingJackson2JsonView();
        Map attributes = new HashMap();
        attributes.put("success", isSuccess);
        view.setAttributesMap(attributes);
        mv.setView(view);
		return mv;
	}
	
	@RequestMapping(value="addOne.do")
	public ModelAndView addOne(HttpServletRequest request,HttpServletResponse response, WaterGaugeParam waterGaugeParam) {
		if(waterGaugeParam == null)
			return null;
		boolean isSuccess = false;
		try {
			WaterGaugeVO vo = new WaterGaugeVO();
			vo = ConvertTools.waterGaugeParamToVo(waterGaugeParam);
			isSuccess = this.gaugeService.addWaterGauge(vo);
		} catch (Exception e) {
			isSuccess = false;
		}
		
		ModelAndView mv = new ModelAndView();
		MappingJackson2JsonView view = new MappingJackson2JsonView();
        Map attributes = new HashMap();
        attributes.put("success", isSuccess);
        view.setAttributesMap(attributes);
        mv.setView(view);
		return mv;
	}
	
	@RequestMapping(value="deleteOne.do")
	public ModelAndView deleteOne(HttpServletRequest request,HttpServletResponse response, WaterGaugeParam waterGaugeParam) {
		if(waterGaugeParam == null)
			return null;
		boolean isSuccess = false;
		try {
			WaterGaugeVO vo = new WaterGaugeVO();
			vo = ConvertTools.waterGaugeParamToVo(waterGaugeParam);
			isSuccess = this.gaugeService.deleteWaterGauge(vo);
		} catch (Exception e) {
			isSuccess = false;
		}
		ModelAndView mv = new ModelAndView();
		MappingJackson2JsonView view = new MappingJackson2JsonView();
        Map attributes = new HashMap();
        attributes.put("success", isSuccess);
        view.setAttributesMap(attributes);
        mv.setView(view);
		return mv;
	}
	
	@RequestMapping(value="dropOne.do")
	public ModelAndView dropOne(HttpServletRequest request,HttpServletResponse response, WaterGaugeParam waterGaugeParam) {
		if(waterGaugeParam == null)
			return null;
		boolean isSuccess = false;
		try {
			WaterGaugeVO vo = new WaterGaugeVO();
			vo = ConvertTools.waterGaugeParamToVo(waterGaugeParam);
			isSuccess = this.gaugeService.dropWaterGauge(vo);
		} catch (Exception e) {
			isSuccess = false;
		}
		ModelAndView mv = new ModelAndView();
		MappingJackson2JsonView view = new MappingJackson2JsonView();
        Map attributes = new HashMap();
        attributes.put("success", isSuccess);
        view.setAttributesMap(attributes);
        mv.setView(view);
		return mv;
	}
	
	@RequestMapping(value="search.do")
	public ModelAndView search(HttpServletRequest request,HttpServletResponse response, WaterGaugeParam waterGaugeParam) {
		if(waterGaugeParam == null) {
			return null;
		}
		List<WaterGaugeVO> voList = this.gaugeService.queryWaterGaugeListByParam(waterGaugeParam);
		ModelAndView mv = new ModelAndView("/gauge/water_gauge_search");
		mv.addObject("voList", voList);
		return mv;
	}
}
