echo "enter a number: "
read n
a=0
b=1
for (( i=1; $i <= $n; i++ ))
do
	f=`expr $a + $b`
	a=$b
	b=$f
	echo "$f"
done
