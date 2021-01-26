vector<int> twoSum(const vector<int>& a, int target) {
        int l = 0, r = a.size() - 1;
        vector<int> sol;
        while(l < r) {
            const int sum = a[l] + a[r];
            if(target == sum){
                sol.push_back(l + 1); 
                sol.push_back(r + 1); 
                break;
            } else if (target > sum) {
                ++l;
            } else {
                --r;
            }
        }
        return sol;
    }
