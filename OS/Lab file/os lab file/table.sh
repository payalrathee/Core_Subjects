echo "enter a number: "
read n
i=1
while [ $i -le 10 ]
do
	t=`expr $n \* $i`
	echo "$t"
	i=`expr $i + 1`
done
