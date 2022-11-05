package kodlama.io.springBoot2.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.springBoot2.business.abstracts.BrandService;
import kodlama.io.springBoot2.business.requests.CreateBrandRequest;
import kodlama.io.springBoot2.business.responses.GetAllBrandsResponse;

@RestController //annotation bilgilendirme
@RequestMapping("/api/brands") //adresleme

public class BrandsController {
	
	private BrandService brandService;
	
	public BrandsController(BrandService brandService) {
		super();
		this.brandService = brandService;
	}
	
	@GetMapping("/getall")
	public List <GetAllBrandsResponse> getAll(){
		return brandService.getAll();
	}
	
	@PostMapping("/add")
	public void add(CreateBrandRequest createBrandRequest) {
		this.brandService.add(createBrandRequest);
	}
	
}