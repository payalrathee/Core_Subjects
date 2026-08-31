echo "enter the first number: "
read a
echo "enter the second number: "
read b
sum=`expr $a + $b`
echo "The sum is : $sum"
diff=`expr $a - $b`
echo "The difference is : $diff"
div=`expr $a / $b`
echo "The quotient is : $div"
mul=`expr $a \* $b`
echo "The product is : $mul"
