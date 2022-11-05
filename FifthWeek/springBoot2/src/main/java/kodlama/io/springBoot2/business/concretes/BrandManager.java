package kodlama.io.springBoot2.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.springBoot2.business.abstracts.BrandService;
import kodlama.io.springBoot2.business.requests.CreateBrandRequest;
import kodlama.io.springBoot2.business.responses.GetAllBrandsResponse;
import kodlama.io.springBoot2.dataAccess.abstracts.BrandRepository;
import kodlama.io.springBoot2.entities.concretes.Brand;

@Service //Bu sınıf bir business nesnesidir
public class BrandManager implements BrandService{

	private BrandRepository brandRepository;
	
	@Autowired
	public BrandManager(BrandRepository brandRepository) {
		super();
		this.brandRepository = brandRepository;
	}

	@Override
	public List<GetAllBrandsResponse> getAll() {
		
		List <Brand> brands =brandRepository.findAll();
		List <GetAllBrandsResponse> brandsResponse = new ArrayList<GetAllBrandsResponse>();
		
		for (Brand brand : brands) {
			GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
			responseItem.setId(brand.getId());
			responseItem.setName(brand.getName());
			
			brandsResponse.add(responseItem);
		}
		// is kurallari
		return brandsResponse;
	}

	@Override
	public void add(CreateBrandRequest createBrandRequest) {
		Brand brand= new Brand();
		brand.setName(createBrandRequest.getName());
		this.brandRepository.save(brand);
	}
}