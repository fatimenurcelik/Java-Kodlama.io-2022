using System;

namespace oopUcuncuHaftaOdev
{
    class Program
    {
        static void Main(string[] args)
        {
            //CreditManager creditManager = new CreditManager();
            //creditManager.Calculate();
            //creditManager.Save();

            //Customer customer = new Customer();
            //customer.Id = 1;
            //customer.City = "Ankara";

            //CustomerManager customerManager = new CustomerManager(customer); // instance oluşturmak, instance creation ,örneğini oluşturmak
            //customerManager.Save();
            //customerManager.Delete();

            //Company company = new Company();
            //company.TaxNumber =  "100000";
            //company.CompanyName = "Arçelik";
            //company.Id = 100;

            //CustomerManager customerManager2 = new CustomerManager(new Person());

            //Person person = new Person();
            //person.NationalIdendity = "";

            //Customer c1 = new Customer();
            //Customer c2 = new Person(); 
            //Customer c3 = new Company();


            //Dependency Injection  IoC Container 
            CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
            customerManager.GiveCredit();

            Console.ReadLine(); 
        }
    }

    class CreditManager
    { 
        public void Calculate()
        {
            Console.WriteLine("hesaplandı");
        }
        public void Save()
        {
            Console.WriteLine("kredi verildi");
        }
    }

    interface ICreditManager
    {
        void Calculate();
        void Save();
    }

    abstract class BaseCreditManager : ICreditManager
    {
        public abstract void Calculate();

        public void Save()
        {
            Console.WriteLine(" Kaydedildi");
        }
    }

    class TeacherCreditManager : BaseCreditManager ,ICreditManager
    {
        public override void Calculate()
        {
            Console.WriteLine("Öğretmen kredisi hesaplandı");
        }
        //DRY  do not repeat yourself
      
    }
    class MilitaryCreditManager : BaseCreditManager, ICreditManager
    {
        public override void Calculate()
        {
            Console.WriteLine("Asker kredisi hesaplandı");
        }
    }
    
    class CarCreditManager : BaseCreditManager, ICreditManager
    {
        public override void Calculate()
        {
            Console.WriteLine("Araba kredisi hesaplandı");
        }
    }

    //SOLID
    class Customer
    {
        public Customer()
        {
            Console.WriteLine("Müşteri nesnesi başlatıldı");
        }
        public int Id { get; set; }
       
        public string City { get; set; }
    }

    class Person : Customer
    {
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public string NationalIdendity { get; set; }
    }  
    
    class Company : Customer
    {
        public string CompanyName { get; set; }
        public string TaxNumber { get; set; }
    }

    //Katmanlı Mimariler
    class CustomerManager
    {
        private Customer _customer;
        private ICreditManager _creditManager;
        public CustomerManager(Customer customer, ICreditManager creditManager)
        {
            _customer = customer;
            _creditManager = creditManager;
        }
        public void Save()
        {
            Console.WriteLine("Müşteri Kaydedildi - ");
        }
        public void Delete()
        {
            Console.WriteLine("Müşteri silindi - ");
        }
        public void GiveCredit()
        {
            _creditManager.Calculate();
            Console.WriteLine("Kredi verildi.");
        }
    }
}
