namespace Commander.Models
{
    public class Command
    {
        // type prop followed by 'tab' button
        public int Id { get; set; }
        public string HowTo { get; set; }
        public string Line { get; set; }
        public string Platform { get; set; }
    }
}