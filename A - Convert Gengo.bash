#!/bin/bash

read str
nengo=${str:0:1}
y=${str:1}

if [[ $nengo == 'M' ]]; then
    ans=$((1868 + $y - 1))
elif [[ $nengo == 'T' ]]; then
    ans=$((1912 + $y - 1))
elif [[ $nengo == 'S' ]]; then
    ans=$((1926 + $y - 1))
elif [[ $nengo == 'H' ]]; then
    ans=$((1989 + $y - 1))
else
    ans=$((2019 + $y - 1))
fi

echo $ans