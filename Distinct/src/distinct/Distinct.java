/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distinct;

/**
 *
 * @author Katuiche
 */
public class Distinct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        int array[] = {1,2,2,4,3,1,2,2,10,8,2,5,9,4,6,10,8,2,5,9,4,6,14,-5};
        
        System.out.println(solution.solution(array));
    }
    
}
