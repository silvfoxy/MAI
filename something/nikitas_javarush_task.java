package something;
/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
Новая задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
Если файла (который нужно копировать) с указанным именем не существует, то
программа должна вывести надпись «Файл не существует.» и еще раз прочитать имя файла с консоли, а уже потом считывать файл для записи.
*/
import java.io.*;
/**
 * Created by Srebroliska on 20.11.2014.
 */
public class nikitas_javarush_task {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = reader.readLine();
        FileInputStream fileInputStream;
        try
        {
            fileInputStream = new FileInputStream(sourceFileName);
        }
        catch (Exception e)
        {
            System.out.println("Файл не существует.");
            sourceFileName = reader.readLine();
            fileInputStream = new FileInputStream(sourceFileName);
        }
        String destinationFileName = reader.readLine();
        FileOutputStream fileOutputStream = new FileOutputStream(destinationFileName);

        if (fileInputStream.available()>0)
            while (fileInputStream.available() > 0)
            {
                int data = fileInputStream.read();
                fileOutputStream.write(data);
            }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
