using System;
using System.Linq;
using System.Collections.Generic;

namespace CompetitiveProgramming
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(Answer(Console.ReadLine()));
        }

        static string Answer(string input)
        {
            if (input == "a" || input == "e" || input == "i" || input == "o" || input == "u") return "vowel";
            return "consonant";
        }
    }
}
