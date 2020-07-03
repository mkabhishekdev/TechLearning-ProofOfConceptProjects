using System.Collections.Generic;
using Commander.Models;

namespace Commander.Data
{
    public class MockCommanderRepo : ICommanderRepo
    {
        public IEnumerable<Command> GetAppCommands()
        {
            var commands = new List<Command>
            {
               new Command{Id=0, HowTo="Coding July 4th", Line="Independence day", Platform="USA"},
               new Command{Id=1, HowTo="Coding August 15th", Line="Independence day", Platform="India"}, 
               new Command{Id=2, HowTo="Coding January 1st", Line="New year", Platform="USA"} 
            };

            return commands;
        }

        public Command GetCommandById(int id)
        {
            return new Command{Id=0, HowTo="Coding july 4th", Line="Independence day", Platform="USA"}; 
        }
    }
}