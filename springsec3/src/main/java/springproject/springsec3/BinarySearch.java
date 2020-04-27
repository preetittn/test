/* to search an element in an array */
package springproject.springsec3;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {

@Autowired
    private SortAlgorithm sortAlgorithm;

    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {     //setter injection
        this.sortAlgorithm = sortAlgorithm;
    }

    public BinarySearch(SortAlgorithm sortAlgorithm) {              //constructor injection
        this.sortAlgorithm = sortAlgorithm;
    }

    //sorting the array
    public int binarySearch(int [] num,int numToSearch) {
//hard coded to use bubble sort algo
//        BubbleSortAlgo bubbleSortAlgo=new BubbleSortAlgo();
//        int[] sortedNumbers= bubbleSortAlgo.sort(num);

        int[] sortedNumbers=sortAlgorithm.sort(num);
        System.out.println(sortAlgorithm);
        return 3;

        //searching the array
        //bubble sort
        //tightly coupled as if want to change the algorithm then we need to change the code of binarySearch
        //this binarySearch is tightly coupled with bubble sort algo
        //now want to use quick sort then need to change every time
        //now if we want to use sometimes bubble and sometimes quick sort then we need loosely coupled scenario
        //method 1 : implement the bubble sort outside the binarySearch method
        //return the result

        //
    }




}
