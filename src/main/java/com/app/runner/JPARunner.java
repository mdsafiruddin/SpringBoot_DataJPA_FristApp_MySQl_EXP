package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;

@Component
public class JPARunner implements CommandLineRunner {
	
	@Autowired
	private ProductRepository repo;
	

	@Override
	public void run(String... args) throws Exception {
		


     repo.save(new Product(22,"AAA",88.0));
     repo.save(new Product(23,"ABB90",64.0));
     repo.save(new Product(14,"egg",64.0));
     repo.save(new Product(14,"Butter",888.0));
     repo.save(new Product(17,"CUP",89.0));
     repo.save(new Product(19,"Biscuit",23.0));
     repo.save(new Product(20,"Shampoo",23.0));
     repo.save(new Product(21,"cream",64.0));
     repo.save(new Product(25,"essna",84.0));
     repo.save(new Product(27,"Copy",81.0));

        Product pd=new Product();
         pd.setProdId(44);
         pd.setProdCode("paper");
         pd.setProdCost(77.8);
         repo.save(pd);
    
		
		// findAll(sort)
	/*	repo.findAll(Sort.by(Direction.DESC,"prodCost"))
		.forEach(System.out::println);
		
		repo.findAll(Sort.by("prodCode"))
		.forEach(System.out::println);  */
		
		
           //   FindAll(pageable)
          /*  PageRequest p= PageRequest.of(1, 3);
             repo.findAll(p).forEach(System.out::println);*/
              
	     // findall(example)
        /* Product p=new Product();
         p.setProdCost(64.0);
        Example<Product> ex=  Example.of(p);
        repo.findAll(ex).forEach(System.out::println); */
         
         // sorting
         Product p=new Product();
         p.setProdCost(64.0);
        Example<Product> ex=  Example.of(p);
        repo.findAll(ex,Sort.by(Direction.DESC,"prodCost")).forEach(System.out::println); 
         
		
	}

}
