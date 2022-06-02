using namespace std;
#include <iostream>
#include <vector>

class MaxSumSubArrayOfSizeK_BF {
    public:
        static int findMaxSumSubArray(int k, const vector<int>& arr) {
            int maxSum = 0;
            int windowSum;
            for (int i = 0; i<=arr.size()-k; i++) {
                // Sliding window
                windowSum = 0;
                for (int j = i; j<i + k; j++) {
                    // Summation of current window
                    windowSum += arr[j];
                }
                maxSum = max(maxSum, windowSum);
            }

            return maxSum;
        }
};

int main(int argc, char* argv[]) {

    cout    << "Max subarray or size:"
            << MaxSumSubArrayOfSizeK_BF::findMaxSumSubArray(3, vector<int>{2,1,5,1,3,2}) 
            << endl;
}

// std::vector<int> ints = {10, 20, 30};