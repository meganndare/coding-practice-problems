class Solution {
    public String intToRoman(int num) {
        if (num > 3999 || num < 1) {
            System.out.println("Number out of bounds.");
            return null;
        }
        
        StringBuilder solution = new StringBuilder();
        boolean flag = false;
        
        // Since maximum input is capped at 3999, we do not need to worry about special cases at this level
        for (int i=0; i<num/1000; i++) solution.append("M");
        num = num - ((num/1000)*1000);
        
        for (int i=0; i<num/500; i++) {
            solution.append("D");
            flag = true;
        }
        num = num - ((num/500)*500);
        
        if (num/100 == 4 && flag) {
            solution.deleteCharAt(solution.length()-1);
            solution.append("CM"); }
        else if (num/100 == 4 && !flag) solution.append("CD"); 
        else {
            for (int i=0; i < num / 100; i++) solution.append("C");
        }

        num = num - ((num/100)*100);
        flag = false;
        
        for (int i=0; i<num/50; i++) {
            solution.append("L");
            flag = true;
        }
        num = num - ((num/50)*50);
        
        if (num/10 == 4 && flag) {
            solution.deleteCharAt(solution.length()-1);
            solution.append("XC"); }
        else if (num/10 == 4 && !flag) solution.append("XL"); 
        else {
            for (int i=0; i<num/10; i++) solution.append("X");
        }
        num = num - ((num/10)*10);
        flag = false;
        
        for (int i=0; i<num/5; i++) {
            solution.append("V");
            flag = true;
        }
        num = num - ((num/5)*5);
        
        if (num == 4 && flag) {
            solution.deleteCharAt(solution.length()-1);
            solution.append("IX"); }
        else if (num == 4 && !flag) solution.append("IV"); 
        else {
            for (int i=0; i<num; i++) solution.append("I");
        }
        
        return solution.toString();
            
        
    }
    

}