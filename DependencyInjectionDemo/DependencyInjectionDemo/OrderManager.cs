using System;
using System.Collections.Generic;
using System.Text;

namespace DependencyInjectionDemo
{
    public interface IOrderManager
    {
        void Submit(Product product, string creditCardNumber, string expiryDate);
    }

    public class OrderManager : IOrderManager
    {
        private readonly IProductStockRepository _productStockRepository;
        private readonly IPaymentProcessor _paymentProcessor;
        private readonly IShippingProcessor _shippingProcessor;
        public OrderManager(IProductStockRepository productStockRepository, IPaymentProcessor paymentProcessor, IShippingProcessor shippingProcessor)
        {
            _productStockRepository = productStockRepository;
            _paymentProcessor = paymentProcessor;
            _shippingProcessor = shippingProcessor;
        }

        public void Submit(Product product, string creditCardNumber, string expiryDate)
        {
            // check the product
            if(!_productStockRepository.IsInStock(product))
            {
                throw new Exception($"{product.ToString()} is not in stock");
            }

            // make a payment
            _paymentProcessor.chargeCreditNumber(creditCardNumber, expiryDate);

            //ship the product
            _shippingProcessor.MailProduct(product);
        }
    }
}
