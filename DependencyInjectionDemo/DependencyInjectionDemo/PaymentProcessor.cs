using System;
using System.Collections.Generic;
using System.Text;

namespace DependencyInjectionDemo
{
    public interface IPaymentProcessor
    {
        void chargeCreditNumber(string creditCardNumber, string expiryDate);
    }
    public class PaymentProcessor : IPaymentProcessor
    {
        public void chargeCreditNumber(string creditCardNumber, string expiryDate)
        {
            if(string.IsNullOrEmpty(creditCardNumber))
            {
                throw new ArgumentException("credit card number not found");
            }

            if (string.IsNullOrEmpty(expiryDate))
            {
                throw new ArgumentException("expiry date invalid");
            }

            Console.WriteLine("call to Credit card API");

        }
    }
}

// No dependency injection here, if you had a API call(as in line 25), than may have needed one 
