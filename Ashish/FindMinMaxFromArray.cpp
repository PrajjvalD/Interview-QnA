#include <iostream>
using namespace std;

int main() {
    int arr[] = {12, 121, 32, 43, 432};
    int n = sizeof(arr) / sizeof(arr[0]);
    
    if (n == 0) {
        cout << "Array is empty." << endl;
        return 0;
    }

    int min = arr[0];
    int max = arr[0];

    for (int i = 1; i < n; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
        if (arr[i] > max) {
            max = arr[i];
        }

        
    }
    cout << "Minimum value: " << min << endl;
    cout << "Maximum value: " << max << endl;

    return 0;
}
