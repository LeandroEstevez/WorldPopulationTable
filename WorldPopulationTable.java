/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldpopulationtable;

/**
 *
 * @author leandroestevez
 */
public class WorldPopulationTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] years = {1750, 1800, 1850, 1900, 1950, 2000, 2050};
        
        String[] continent = {
        
            "Africa",
            "Asia",
            "Australia",
            "Europe",
            "North America",
            "South America"
            
        };
        
        int[][] population = {
            
            {106, 107, 111, 133, 221, 767, 1766},
            {502, 635, 809, 947, 1402, 3634, 5268},
            {2, 2, 2, 6, 13, 30, 46},
            {163, 203, 276, 408, 547, 729, 628},
            {2, 7, 26, 82, 172, 307, 392},
            {16, 24, 38, 74, 167, 511, 809},
            
        };
        
        System.out.printf("%20s", "Years   |   ");
        
        for(int i = 0; i < years.length; i++) {
            
            System.out.printf("%5d", years[i]);
            
        }
        
        System.out.println();
        
        for(int row = 0; row < population.length; row++) {
            
            System.out.printf("%20s", continent[row] + "   |   ");
            
            for(int col = 0; col < population[row].length; col++) {
            
                System.out.printf("%5d", population[row][col]);
            
            }
            
            System.out.println();
            
        }
        
        System.out.printf("%20s", "Total   |   ");
        
        for(int col = 0; col < population[0].length; col++) {
            
            int total = 0;
            
            for(int row = 0; row < population.length; row++) {
            
                total += population[row][col];
            
            }
            
            System.out.printf("%5d", total);
            
        }
        
    }
    
}
