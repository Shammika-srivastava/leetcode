int reverse(int x){
    long int  n= x;
    long int digit;
    long int rev=0;
    
    while(n!=0) {
        digit = n%10;
        if( rev > INT_MAX/10 || rev < INT_MIN/10) {
        return 0;
    }
        rev = rev * 10 + digit;
        n= n/10;
    }
    
    return rev;
}