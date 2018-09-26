class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean rows = checkRows(board);
        boolean columns = checkColumns(board);
        boolean subBoxes = checkSubBoxes(board);
        System.out.println("rows: " + rows + " columns: " + columns + "subBoxes: " + subBoxes);
        
        return (rows && columns && subBoxes);
    }
    
    private boolean checkRows(char[][] grid) {
        HashMap<Character, Boolean> checks = new HashMap<Character, Boolean>();
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.println(checks);
                if (checks.containsKey(grid[i][j]) && grid[i][j] != '.') {
                    return false;
                } else {
                    checks.put(grid[i][j], true);
                }
            }
            checks.clear();
        }
        return true;
    }
    
    private boolean checkColumns(char[][] grid) {
        HashMap<Character, Boolean> checks = new HashMap<Character, Boolean>();        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (checks.containsKey(grid[j][i]) && grid[j][i] != '.') return false;
                else checks.put(grid[j][i], true);
                
            }
            checks.clear();
        }
        return true;
    }
    
private boolean checkSubBoxes(char[][] grid) {
        HashMap<Character, Boolean> checks = new HashMap<Character, Boolean>();        
        for (int i = 0; i < 9; i=i+3) {
            for (int j = 0; j <9; j=j+3) {
                
                for(int row=i;row<i+3;row++){
                	for(int column=j;column<j+3;column++){
                
                if (checks.containsKey(grid[row][column]) && grid[row][column] != '.') return false;
                else checks.put(grid[row][column], true);
                }
            }
                
            checks.clear();
                
            }   
        }
        return true;
    }
    
}