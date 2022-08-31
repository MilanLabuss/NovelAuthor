//Author Milan Labus SD2
//Student ID: R00221283
//Date 01/11/2021


import java.lang.reflect.Array;
import java.util.ArrayList;

public class mainMet {
    public static void main(String[] args) {

    Novel novel1 = new Novel("Harry Potter");       //creating a novel object
    novel1.setYearOfpublication(2001);                        //setting its publish year

    Novel novel2 = new Novel("Java masterclass");
    novel2.setYearOfpublication(2014);

    Novel novel3 = new Novel("Klara");
    novel3.setYearOfpublication(2019);

        ArrayList<Novel> novels = new ArrayList<Novel>();       //creating an arraylist of objects
        novels.add(novel1);         //adding objects to the arraylist
        novels.add(novel2);
        novels.add(novel3);

        recentNovels(novels);       //calling the method to find the novels made after 2013

    }

    public static void recentNovels(ArrayList<Novel> novels){       //method to print the novels made after 2013

        novels.forEach(novel -> {
            if(novel.getYearOfpublication()>2013)          //printing all of the novels that were made 2013
            System.out.println(novel.toString());
        });

        }





    }

