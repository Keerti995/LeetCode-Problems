// Still needs to reduce RTC
class Solution {
    public String intToRoman(int num) {
        int n=num,rem=0;
        StringBuilder b = new StringBuilder();
        for(int i=0;i<(n/1000);i++)
            b.append("M");
        
        n = n % 1000;
        if(n>=900){
            b.append("CM"); n-=900;}
        else if(n>=500){
            b.append("D"); n-=500;}
        else if(n>=400){
            b.append("CD"); n-= 400;}
        
        for(int i=0;i<(n/100);i++)
            b.append("C");
        
        n = n % 100;
        
        if(n>=90){
            b.append("XC");
            n -= 90;
        }else if(n>=50){
            b.append("L");
            n -= 50;
        }else if(n>=40){
            b.append("XL");
            n -= 40;
        }
         
        for(int i=0;i<(n/10);i++)
            b.append("X");
        
        n = n%10;
        if(n==9){
            b.append("IX");
            n = n-9;
        }else if(n>=5){
            b.append("V");
            n -= 5;
        }else if(n==4){
            b.append("IV");
            n -= 4;
        }
        for(int i=0;i<n;i++)
            b.append("I");
            
        return b.toString();
    }
}