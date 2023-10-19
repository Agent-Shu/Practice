echo "Enter a number: "
read n
for((i=2;i<=n/2;i++)) 
do
	if test `expr $n % $i` -eq 0
		then
		echo "$n is not prime number"
		read hold
		exit 1
	fi
done
echo "$n is a prime number"
read hold
