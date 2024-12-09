using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

namespace Assignment2
{
    class Program
    {
        public static string pathInventory = Path.Combine(Directory.GetCurrentDirectory(), "Inventory.txt");
        public static string pathTransaction = Path.Combine(Directory.GetCurrentDirectory(), "Transactions.txt");
        static void Main(string[] args)
        {
            string[] Program = new string[] { "Atlanta", "Baltimore", "Chicago", "Denver", "Ely", "Fargo" };
            int[] numbers = new int[] { 102, 215, 410, 525, 711 };
            char[] characters = new char[] { ',' };
            Invent[] inventories = new Inventory[6]; 
        }
    }
}
