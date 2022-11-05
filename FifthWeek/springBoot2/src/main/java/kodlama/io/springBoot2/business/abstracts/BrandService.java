package kodlama.io.springBoot2.business.abstracts;

import java.util.List;

import kodlama.io.springBoot2.business.requests.CreateBrandRequest;
import kodlama.io.springBoot2.business.responses.GetAllBrandsResponse;

public interface BrandService {
	
	List <GetAllBrandsResponse> getAll();
	void add(CreateBrandRequest createBrandRequest);
}