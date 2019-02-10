#include <bits/stdc++.h>
#define li long long int
using namespace std;

li arr[100002];
li pref[100003];
int main() {
	int n;
	cin >> n;
	arr[0] = 0;
	for (int i = 1; i <= n; ++i)
	{
		cin >> arr[i];
		pref[i] = pref[i-1] + arr[i];
	}

	li maxi = -INT_MAX;
	float range = 0;
	int diff=0, f_range, index,loc_max=0;
	cout << f_range << index << endl;
	for (int i = 1; i <= n; ++i)
	{
		diff = n-i+1;
		range = (-1 + sqrt(1+8*diff))/2;
		f_range = floor(range);
		f_range = (f_range*(f_range+1))/2;
		index = i+f_range-1;
		loc_max = pref[index] - pref[i-1];
		// cout << "i: " << i << "  range: " << range << "  f_range: " << f_range << "  index: " << index << endl;
		// cout << "pref[" << index << "]: " << pref[index] << "  pref[" << i-1 << "]: " << pref[i-1] << endl << "loc_max: " << loc_max << endl;
		if(loc_max > maxi) maxi = loc_max;
	}

	cout << maxi << endl;
	return 0;
}