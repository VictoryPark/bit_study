package coding_test;

import java.util.HashMap;
import java.util.Map;

 // 상관에게 보고할 병사의 수를 구하라.

class EstSoft_1_haedoang {

   private int index=0; //rank 배열의 인덱스

   private int result=0; //결과 

   public int solution(int[] ranks) {
        
        //ranks 길이 조건..
        if(ranks.length<2 || ranks.length >100000) System.exit(0);;

        //value , count Map 

        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<ranks.length;i++){
          if(map.get(ranks[i])!=null){

        	  map.put(ranks[i], map.get(ranks[i])+1);

          } else {

        	  map.put(ranks[i],1);

          }//if-else end

        }//for end

        

        //list 반복하여 rank 별 배열 만들기

        int[] rankArr = new int[map.size()];

        for(int key : map.keySet()){

           rankArr[index++] = key;

        }

        //rank배열이용하여 병사수가져오기

        for(int i=1;i<rankArr.length;i++){

          if(rankArr[i-1]+1 == rankArr[i]){

            result+= map.get(rankArr[i]-1);

          }

        }

 

        

       return result;

    }

}