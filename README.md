# Moving Average List

This data structure allows for efficient calculation of the moving average of the last N elements added to it.
It also allows arbitrary access to any elements.

## Implementation Details

To calculate the moving average when a new element is added incrementally in O(1) time, 
we can use the following formula:

`average = (average * n + num) / (n + 1)`

Where `n` is the number of elements, and `num` is the new number added to the list. When the list is empty, the `average` 
is initialized to 0.

However, since we want to calculate the moving average for only the last `N` elements added to the list, where `N <= n`,
we can use the following formula:

`average = (average * N - list[n - N] + num) / N`

This allows us to incrementally update the moving average without having to re-calculate it by summing up the last N
elements in the data structure and dividing by N.