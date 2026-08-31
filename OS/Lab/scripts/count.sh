echo "enter a number: "
read n
x=1
echo "count upto $n is: "
while test $x -le $n
do
	echo "$x"
	x=`expr $x + 1`
done
