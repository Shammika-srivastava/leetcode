bool isPalindrome(int x) {
    long long original = x;
    long long digit=x;
    long long n=x;
    long long num=0,i=0;
    if(x<0) {
        return false;
    }
    while(n!=0) {
        digit= n%10;
        num= num *10+ digit;
        n=n/10;
        i++;
    }
    if(original == num) {
        return true;
    }
    else {
        return false;
    }
}