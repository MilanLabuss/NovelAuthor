import java.util.ArrayList;
import java.util.Scanner;

public class Novel{

    static Scanner sc=new Scanner(System.in);       //Scanner is static because it will only be used inside this class it belong to the class not the object

    private String novelName;                       //the novels name
    private int yearOfpublication;
    private String publisherName;
    ArrayList<String> sequenceOfContent = new ArrayList<String>();
    //this vairable will hold the number of novels created and it is static because it belongs to this class
    //and not to an object of this class
    public static int numNovels = 0;

//constructors
    public Novel(String novelName){              //constructor that takes a novel name only
        this.novelName=novelName;
        numNovels++;                                 //every time an object of this class is created(new novel) the number of novels static field increases by 1
    }
    public Novel(String novelName, Person author){      //constructor that takes a novel name and author object
        this.novelName=novelName;
        numNovels++;                                    //every time an object of this class is created(new novel) the number of novels static field increases by 1
    }

//getters and setters
    public String getNovelName(){
        return novelName;
    }
    public void setNovelName(String novelName) {
        this.novelName = novelName;
    }
    public int getYearOfpublication(){
        return yearOfpublication;
    }
    public void setYearOfpublication(int yearOfpublication){
       this.yearOfpublication=yearOfpublication;
    }
    public String getPublisherName(){
        return publisherName;
    }
    public void setPublisherName(String publisherName){
        this.publisherName=publisherName;
    }

    //methods
public void addContent(){           //method to add content to the sequence of content
        System.out.println("Please enter your Content: ");
        String newContent = sc.nextLine();
        sequenceOfContent.add(newContent+"\n");

}

    public void deleteContent(){        //method for deleting all of the content
    System.out.println("Are you sure you want to delete all of the content y/n");
    if(System.in.equals("y")) {
        sequenceOfContent.clear();
    }
    else{
        System.out.println("Content not deleted");
    }
}

    public void viewNovel(){        //method to view the entire Novel
    for (int i = 0; i < sequenceOfContent.size();i++)
    {
        System.out.println("Chapter " + (i + 1) + ": " + sequenceOfContent.get(i));
    }


}

    public void viewParagraph(){            //method to view a particular parahgraph
        System.out.println("Enter which Paragraph you wish to view: ");
        int selection = sc.nextInt();
        System.out.println(sequenceOfContent.get(selection+1));
}

    public void viewWordcount(){            //method to view the number of words in the Content
        int wordcount = 0;
        for(String s:sequenceOfContent) {
            wordcount += s.split(" ").length;
        }
        System.out.println("Word count: " + wordcount);

    }

    public void numberOfCharaters(){
        int charcount = 0;
        for(String s:sequenceOfContent) {
            charcount += s.length();
        }
        System.out.println("Character count: " + charcount);

    }

    public void findWord(String Word){      //method that will be called if one parameter is entered
        String word = Word;

        for (int i = 0; i < sequenceOfContent.size();i++)
        {
            if(sequenceOfContent.get(i).contains(word)){
                System.out.println(sequenceOfContent.get(i));
                break;
            }
        }


    }

    public void findWord(String Word1,String Word2){      //method that will be called if two parameters are entered
       String word1 = Word1;
       String word2=Word2;
       String oneWord="";       //this string will hold all of the elements that contain either word
                 //String to hold the entire content of the Arraylistelement that contains either of the two words
        for (int i = 0; i < sequenceOfContent.size();i++)
        {
            if(sequenceOfContent.get(i).contains(word1) || sequenceOfContent.get(i).contains(word2)){
                oneWord=oneWord+sequenceOfContent.get(i);               //adding the paragraphs that contain either word to the single string
            }
        }
        System.out.println(oneWord);
    }

    public String toString(){
        return "Novel name: " + novelName+"  Year of Publication:  "+yearOfpublication;
    }


}