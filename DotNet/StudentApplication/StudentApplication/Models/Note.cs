namespace StudentApplication.Models
{
    public class Note
    {
        //NoteID
        public int NoteID { get; set; }

        //CatalogID
        public int CatalogID { get; set; }

        //DisciplineID 
        public int DisciplineID { get; set; }

        //NoteNota1
        public double NoteNota1 { get; set; }

        //NoteNota2
        public double NoteNota2 { get; set; }

        //NoteMedia
        public double NoteMedia { get; set; }

        public virtual Catalog Catalogs { get; set; }
        public virtual Discipline Disciplines { get; set; }
    }
}