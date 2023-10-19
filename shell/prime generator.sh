echo "1"
p=1
n=1
while [ $n -le 200 ]
do
	f=0
	p=$(( p + 2))

	for((i=2; i*i<=p; i++)) 
	do
		if test `expr $p % $i` -eq 0
		then f=1
		fi
	done
	if test $f -eq 0  
		then
		echo "$p"
		n=$(( n + 1 ))	
	fi
done