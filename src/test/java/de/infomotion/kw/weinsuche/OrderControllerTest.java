package de.infomotion.kw.weinsuche;

import de.infomotion.kw.weinsuche.controller.OrderController;
import de.infomotion.kw.weinsuche.model.Order;
import de.infomotion.kw.weinsuche.repositories.OrderRepository;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.data.domain.Page;

public class OrderControllerTest {

    @InjectMocks
    private OrderController orderController;

    @Mock
    private OrderRepository orderRepository;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetPageSize(){
        OrderController orderController = new OrderController();

        Page<Order> page = orderController.getALlWines(0,10);
        System.out.println(page.getTotalElements());
    }
}
