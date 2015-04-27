Given a 2D array A with M rows and N columns representing the flags of various contries. Find the total number of countries/flags.    
The flag of a particular nation can be represented by one or more entries A[i][j]  where -1 < i < M  and  -1 < j < N.   
Each number in the 2D array represensts a flag of a particular country.     
Two countries can be represented using the same number.    
If a cell has the same number as its adjacent neighbours, then they represent the flag of the same country.     
A neighbour can defined as the cell which is immidiately before, after, below or above the given cell.

Example 1 : Given A[0][0]=5, A[0][1]=4, A[0][2]= 4										
	          A[1][0]=4, A[1][1]=3, A[1][2]= 4			
                  A[2][0]=3, A[2][1]=2, A[2][2]= 4			
                  A[3][0]=2, A[3][1]=2, A[3][2]= 2			
                  A[4][0]=3, A[4][1]=3, A[4][2]= 4			
                  A[5][0]=1, A[5][1]=4, A[5][2]= 4			
                  A[6][0]=4, A[6][1]=1, A[6][2]= 1						
                  
        The output should be 11.
        
Please see the attached screenshot how it is grouped.
