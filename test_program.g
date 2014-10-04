int function binary_search(a: array[100] of int, num: int)
begin
  var start : int = 0;
  var end : int = 99;
  var b : int := (a+b)/2;
  while (start <= end) 
  do
    if a[b] = num then
      break;
    if a[b] > num then
      end = b-1;
    else
      start = b+1;
  enddo;
    
  if (start>end) then
    return -1;
  else
    return b;
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
 binary_search(X, 3);
 end;
 end;
end;
