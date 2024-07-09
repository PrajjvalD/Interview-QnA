#include <iostream>
using namespace std;

int main() {
  int num;
  cout << "Enter Number : ";
  cin >> num;

  int lastDigit;
  int temp = 0;

  while(num != 0 ){
    lastDigit = num % 10; // 121 = >  1, 12 => 2
    temp = (10 * temp) + lastDigit; //1, 12, 121
    num = num/10; // 121 => 12
  }
  cout << "Resutl" << endl;
  cout << temp << endl;
}