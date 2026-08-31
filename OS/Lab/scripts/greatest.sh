echo "enter three numbers: "
read a b c
if [ $a -gt $b -a $a -gt $c ]
then
	echo "$a is the largest"
elif [ $b -gt $c ]
then
	echo "$b is the largest"
else
	echo "$c is the largest"
fi
