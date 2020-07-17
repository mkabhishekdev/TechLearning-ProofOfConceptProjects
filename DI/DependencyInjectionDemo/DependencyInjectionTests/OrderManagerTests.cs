using System;
using Xunit;
using DependencyInjectionDemo;

namespace DependencyInjectionTests
{
    public class OrderManagerTests
    {
        [Fact]
        public void Test1()
        {
            var orderManager = new OrderManager();
            orderManager.Submit(Product.Keyboard, "1111111111111111", "0620");
            Assert.ThrowsAny<Exception>(() => orderManager.Submit(Product.Keyboard, "1111111111111111", "0620"));

        }
    }
}
