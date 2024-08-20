echo "enter a number: "
read num
x=`expr $num % 2`
if [ $x -eq 0 ]
then
	echo "$num is even"
else
	echo "$num is odd"
fi
