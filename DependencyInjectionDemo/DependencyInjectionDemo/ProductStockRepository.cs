using System;
using System.Collections.Generic;
using System.Text;

namespace DependencyInjectionDemo
{
    public interface IProductStockRepository
    {
        bool IsInStock(Product product);
        void ReduceStock(Product product);
        void AddStock(Product product);

    }
    public class ProductStockRepository : IProductStockRepository
    {
        private static Dictionary<Product, int> _productStorage = Setup();

        private static Dictionary<Product,int> Setup()
        {
            var productStorage = new Dictionary<Product, int>();
            productStorage.Add(Product.Keyboard, 1);
            productStorage.Add(Product.Mouse, 1);
            productStorage.Add(Product.Mic, 1);
            productStorage.Add(Product.Speaker, 1);
            return productStorage;
        }

        public bool IsInStock(Product product)
        {
            Console.WriteLine("Get from database");
            return _productStorage[product] > 0;
        }

        public void ReduceStock(Product product)
        {
            Console.WriteLine("updating the database");
            _productStorage[product]--;
        }

        public void AddStock(Product product)
        {
            Console.WriteLine("updating the database");
            _productStorage[product]++;
        }

    }
}
