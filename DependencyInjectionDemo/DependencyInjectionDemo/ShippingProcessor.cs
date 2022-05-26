using System;
using System.Collections.Generic;
using System.Text;

namespace DependencyInjectionDemo
{
    public interface IShippingProcessor
    {
        void MailProduct(Product product);
    }
    public class ShippingProcessor : IShippingProcessor
    {
        private readonly IProductStockRepository _productStockRepository;
        public ShippingProcessor(IProductStockRepository productStockRepository)
        {
            _productStockRepository = productStockRepository;
        }
        public void MailProduct(Product product)
        {
            _productStockRepository.ReduceStock(product);
            Console.WriteLine("Call to Shipping API");
        }
    }
}
/*
 Think of this problem, this way
 MailProduct() needs an instance of ProductRepository which has the ReduceStock(). Now, instead of everytime making a var x = new ProductStockRepository(), we will do constructor injection
 of the dependency
 i.e,
 1. Create a constructor which will recieve a parameter of 'whatever' dependency you want to call in your progran
 2. create a private readonly instance of that interface
 3. call the instance in your methods
 */
