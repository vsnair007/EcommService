package com.mundackal.EcommService.repository;

import com.mundackal.EcommService.model.Category;
import com.mundackal.EcommService.model.Order;
import com.mundackal.EcommService.model.Price;
import com.mundackal.EcommService.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InitializingServiceImpl implements InitializingService{

    private CategoryRepository categoryRepository;
    private PriceRepository priceRepository;
    private ProductRepository productRepository;
    private OrderRepository orderRepository;

    public InitializingServiceImpl(CategoryRepository categoryRepository, PriceRepository priceRepository, ProductRepository productRepository, OrderRepository orderRepository) {
        this.categoryRepository = categoryRepository;
        this.priceRepository = priceRepository;
        this.productRepository = productRepository;
        this.orderRepository = orderRepository;
    }

    @Override
    public void initialise() {
        Category Electronics = new Category();
        Electronics.setName("Electronics");
        Electronics = categoryRepository.save(Electronics);

        Category Jewelery = new Category();
        Jewelery.setName("Jewelery");
        Jewelery = categoryRepository.save(Jewelery);

        Category Men = new Category();
        Men.setName("Men's Clothing");
        Men = categoryRepository.save(Men);

        Category Women = new Category();
        Women.setName("Women's Clothing");
        Women = categoryRepository.save(Women);

        Price FjallravenPrice = new Price();
        FjallravenPrice.setAmount(109.95);
        FjallravenPrice.setCurrency("INR");
        FjallravenPrice.setDiscountPercentage(0);
        FjallravenPrice = priceRepository.save(FjallravenPrice);

        Product Fjallraven = new Product();
        Fjallraven.setCategory(Men);
        Fjallraven.setTitle("Fjallraven - Foldsack No. 1 Backpack");
        Fjallraven.setDescription("Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday");
        Fjallraven.setImage( "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg" );
        Fjallraven.setPrice(FjallravenPrice);
        Fjallraven = productRepository.save(Fjallraven);

        Order newOrder = new Order();

        newOrder.setProductList(List.of(Fjallraven));
        orderRepository.save(newOrder);

    }
}
