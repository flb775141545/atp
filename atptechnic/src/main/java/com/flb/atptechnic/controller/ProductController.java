package com.flb.atptechnic.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flb.atptechnic.AdminContext;
import com.flb.atptechnic.ao.ProductAO;
import com.flb.atptechnic.dto.ProductDTO;
import com.flb.atptechnic.model.Product;
import com.flb.base.common.NumberUtils;
import com.flb.base.page.PageSet;

@Controller
@RequestMapping("/atptechnic/manager/product")
public class ProductController {
	@Autowired
	private ProductAO productAO;
	
	private static final int PAGE_SIZE = 20;
	
	/**
	 * @Description: 根据request获取AdminContext
	 * @param request
	 * @return
	 */
	private AdminContext getAdminContext(HttpServletRequest request)
	{
		return (AdminContext) request.getAttribute("context");
	}
	
	/**
	 * 分页查询
	 * @return
	 */
	@RequestMapping(value = "/page")
	public String pageProduct(HttpServletRequest request, Model model, ProductDTO dto){
		int pageNo = NumberUtils.parseInt(request.getParameter("page")) == 0 ? 1 : NumberUtils.parseInt(request.getParameter("page"));
		StringBuffer url = new StringBuffer("/atptechnic/product/list.htm?");
		Map<String, Object> params = getParams(dto, url);
		PageSet<Product> pageSet = productAO.pageProduct(params, pageNo, PAGE_SIZE);
		
		model.addAttribute("datas", pageSet);
		
		return "/manager/product/list";
	}
	
	//封装查询参数
	private Map<String, Object> getParams(ProductDTO dto, StringBuffer url)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		
		return params;
	}
	
	/**
	 * 列表查询
	 * @return
	 */
	@RequestMapping(value = "/list")
	public String listProduct(HttpServletRequest request, Model model){
		return "";
	}
	
	/**
	 * 新增页面
	 * @return
	 */
	@RequestMapping(value = "/add")
	public String addProduct(HttpServletRequest request){
		return "/atptechnic/product/add";
	}
	
	/**
	 * 保存新增
	 * @return
	 */
	@RequestMapping(value = "/save")
	public String saveProduct(HttpServletRequest request, Model model, ProductDTO dto){
		productAO.saveProduct(getAdminContext(request),dto);
		
		model.addAttribute("message", "恭喜你，操作成功");
		model.addAttribute("refererURL", "/atptechnic/product/page.htm");
		
		return "/success";
	}
	
	/**
	 * 修改页面
	 * @return
	 */
	@RequestMapping(value = "/{id}/edit")
	public String editProduct(HttpServletRequest request, Model model, @PathVariable String id){
		model.addAttribute("product", productAO.queryById(id));
		return "/atptechnic/product/edit";
	}
	
	/**
	 * 确认修改
	 * @return
	 */
	@RequestMapping(value = "/update")
	public String updateProduct(HttpServletRequest request, Model model, ProductDTO dto){
		productAO.updateProduct(getAdminContext(request),dto);
		
		model.addAttribute("message", "恭喜你，操作成功");
		model.addAttribute("refererURL", "/atptechnic/product/page.htm");
		
		return "/success";
	}
	
	/**
	 * 详情
	 * @return
	 */
	@RequestMapping(value = "/{id}/detail")
	public String detailProduct(HttpServletRequest request, Model model, @PathVariable String id){
		model.addAttribute("product", productAO.queryById(id));
		return "/atptechnic/product/detail";
	}
	
	/**
	 * 删除
	 * @return
	 */
	@RequestMapping(value = "/{id}/delete")
	public String deleteProduct(HttpServletRequest request, Model model, @PathVariable String id){
		productAO.deleteById(id);
		
		model.addAttribute("message", "恭喜你，操作成功");
		model.addAttribute("refererURL", "/atptechnic/product/page.htm");
		
		return "/success";
	}
}
