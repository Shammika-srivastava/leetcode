int compare(const void *x, const void *y) {
    int X = *(int *)x;
    int Y = *(int *)y;
    return X-Y;
}
bool containsDuplicate(int* nums, int numsSize) {
    qsort(nums,numsSize,sizeof(int),compare);
     for (int i = 0; i < numsSize-1; i++) {
        if (nums[i] == nums[i+1]) {
            return true;
        }
    }
        return false;
}
