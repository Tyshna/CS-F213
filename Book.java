package week8;

class Book 
{
    private long ISBN_no;
    private String name;
    private int Edition;
    private String Author;
    private String Publisher;
    private int Status;

    public Book(long ISBN_no, String name, int Edition, String Author, String Publisher)
    {
        this.ISBN_no = ISBN_no;
        this.name = name;
        this.Edition = Edition;
        this.Author = Author;
        this.Publisher = Publisher;
        this.Status = 0;
    }//constructor

    public int check_Status()
    {
        return Status;
    }//check_status

    public void change_Status(int newStatus) 
    {
        if (newStatus >= 0 && newStatus <= 2) 
            Status = newStatus;
        else
        	System.out.println("Invalid status code.");
    }//change_Status

    public void display() 
    {
        System.out.println("ISBN No: " + ISBN_no);
        System.out.println("Name: " + name);
        System.out.println("Edition: " + Edition);
        System.out.println("Author: " + Author);
        System.out.println("Publisher: " + Publisher);
        System.out.println("Status: " + getStatusString());
        System.out.println();
    }//display

    private String getStatusString() 
    {
        switch (Status) 
        {
            case 0:
                return "Available";
            case 1:
                return "Issued";
            case 2:
                return "Reserved";
            default:
                return "Unknown";
        }//switch
    }//getStatusString
}//class
