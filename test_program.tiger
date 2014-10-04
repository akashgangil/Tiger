int function binary_search(a: array[100] of int, num: int)
begin
  begin
    var start : int = 0;
    var end : int = 99;
    var b : int := (a+b)/2;
    while (start <= end) 
    do
      if(a[b] = num) then
        break;
      endif;
  
      if(a[b] > num)then
        end := b-1;
      else
        start := b+1;
      endif;
      b := (start+end)/2;
    enddo;
    
    if (start > end) then
      return -1;
    else
      return b;
  end;
end;

void main()
begin
 begin
 type ArrayInt = array [100] of int;
 var X : ArrayInt := 10;
 var i, sum : int := 0;
 begin
 for i := 1 to 100 do
   X[i] = i;
 enddo;
 var result: int := -1;
 result := binary_search(X, 3);
 if(result = -1) then
   printi("Number not found\n");
 else
   printi("Number found\n"); 
 end;
 end;
end;
