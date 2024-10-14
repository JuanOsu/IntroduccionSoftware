package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Model.CustomerType;
import service.DiscountCalculator;

class DiscountCalculatorTest {

    @Test
    void testCalculateDiscountForRegularCustomer() {
        // Instanciar DiscountCalculator
        DiscountCalculator discountCalculator = new DiscountCalculator();
        
        // Llamar al método para un cliente REGULAR con un monto total de 600
        double discount = discountCalculator.calculateDiscount(CustomerType.REGULAR, 600);
        
        // Verificar que el descuento sea el esperado (10% de 600 es 60)
        assertEquals(60, discount, "El descuento debería ser del 10% para un cliente regular con un monto superior a 500.");
    }
    
    @Test
    void testCalculateDiscountForVipCustomer() {
        // Instanciar DiscountCalculator
        DiscountCalculator discountCalculator = new DiscountCalculator();
        
        // Llamar al método para un cliente VIP con un monto total de 600
        double discount = discountCalculator.calculateDiscount(CustomerType.VIP, 600);
        
        // Verificar que el descuento sea el esperado (15% de 600 es 90)
        assertEquals(90, discount, "El descuento debería ser del 15% para un cliente VIP con un monto superior a 500.");
    }
}
