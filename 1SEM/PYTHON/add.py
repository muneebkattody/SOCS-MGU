# ADD TWO MATRIX

R = int(input("Enter the number of rows:"))
C = int(input("Enter the number of columns:"))
  
X = []
print("Enter First matrix the entries row wise:")
  
for i in range(R):       
    a =[]
    for j in range(C):      
         a.append(int(input()))
    X.append(a)
  
Y = []
print("Enter Second Matrix the entries row wise:")
  
for i in range(R):          
    a =[]
    for j in range(C):      
         a.append(int(input()))
    Y.append(a)


result = [ [0]*R for i in range(C)]

for i in range(len(X)):
	for j in range(len(X[0])):
		result[i][j] = X[i][j] + Y[i][j]

for r in result:
	print(r)
