import java.util.*;

public class Xplore_1 {
    public static void main(String args[]) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        Document[] docsArray = new Document[4];
        Document[] res = new Document[4];
        for (int i = 0; i < docsArray.length; i++) {
            docsArray[i] = new Document();
            res[i] = new Document();
        }
        for (int i = 0; i < docsArray.length; i++) {
            docsArray[i].id = sc.nextInt();
            docsArray[i].title = sc.next();
            docsArray[i].folderName = sc.next();
            docsArray[i].pages = sc.nextInt();
        }
        res = docsWithOddPages(docsArray);
        for (int i = 0; i < res.length; i++) {
            if (res[i].getTitle() != null)
                System.out.println(res[i].getId() + " " + res[i].getTitle() + " " + res[i].getFolderName() + " "
                        + res[i].getPages());
        }

        sc.close();
    }

    public static Document[] docsWithOddPages(Document[] docsArray) {
        Document[] oddDocs = new Document[4];
        for (int i = 0; i < docsArray.length; i++) {
            oddDocs[i] = new Document();
        }
        int k = 0;
        for (int i = 0; i < docsArray.length; i++) {
            if (docsArray[i].pages % 2 != 0) {
                oddDocs[k++] = docsArray[i];
            }
        }
        int p = oddDocs.length;
        for (int i = 0; i < p - 1; i++) {
            for (int j = 0; j < p - i - 1; j++) {
                if (oddDocs[j].id > oddDocs[j + 1].id) {
                    Document t = oddDocs[j];
                    oddDocs[j] = oddDocs[j + 1];
                    oddDocs[j + 1] = t;
                }
            }
        }
        return oddDocs;
    }
}

class Document {
    int id, pages;
    String title, folderName;

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getFolderName() {
        return this.folderName;
    }

    public int getPages() {
        return this.pages;
    }
}