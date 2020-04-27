package springproject.springsec3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgo extends SortAlgorithm {

    public int[] sort(int[] num){
        //logic
        return num;
    }
}
