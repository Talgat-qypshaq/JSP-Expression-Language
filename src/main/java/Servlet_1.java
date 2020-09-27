import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
@WebServlet(name = "Servlet_1")
public class Servlet_1 extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        //int [] arrayInt = new int[20];
        //String [] arrayString = new String[20];
        String studentFirstName = "";
        String studentLastName = "";
        String studentGrade = "";
        if(request.getParameter("studentFirstName")!=null)
            studentFirstName = request.getParameter("studentFirstName");
        if(request.getParameter("studentLastName")!=null)
            studentLastName = request.getParameter("studentLastName");
        if(request.getParameter("studentGrade")!=null)
            studentGrade = request.getParameter("studentGrade");
        int studentGradeInt = Integer.parseInt(studentGrade);
        writeFile(studentFirstName, studentLastName, studentGradeInt);
        readFile();
        request.getRequestDispatcher("results.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.sendRedirect("form.jsp");
    }
    public void writeFile(String firstName, String lastName, int grade)
    {
        try
        {
            DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("students.txt")));
            out.writeUTF(firstName+"\t");
            out.writeUTF(lastName+"\t");
            out.writeInt(grade);
            out.writeUTF("\n");
            out.close();
        }
        catch (Exception exception)
        {
            System.out.println("exception during output stream");
        }
    }

    public void readFile()
    {
        try
        {
            DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("students.txt")));
            boolean eof = false;
            while(!eof)
            {
                try
                {

                    System.out.print(in.readUTF());
                    System.out.print(in.readUTF());
                    System.out.print(in.readInt());
                }
                catch (EOFException exception)
                {
                    eof = true;
                }
            }
            in.close();
        }
        catch (Exception exception)
        {
            System.out.println("exception during output stream");
        }
    }
}