__author__ = 'Mohamed Fawzy'


def pair_sum(arr, k):
    h = {}
    for i in range(len(arr)):
        complement = k - arr[i]
        h[arr[i]] = i
        if complement in h:
            return h[complement], i
