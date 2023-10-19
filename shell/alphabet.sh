echo "Enter a character: "
read ch

if [[ $ch =~ [A-Z] ]]
then
    echo "Upper Case Alphabet"
    
elif [[ $ch =~ [a-z] ]]
then
    echo "Lower Case Alphabet"
    
elif [[ $ch =~ [0-9] ]]
then
    echo "Digit"
    
else 
    echo "Special Symbol"
fi

read hold