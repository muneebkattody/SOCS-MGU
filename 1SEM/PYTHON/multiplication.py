R = int(input("Enter the number of rows:"))
C = int(input("Enter the number of columns:"))
  
X = []

print("Enter First matrix the entries row wise:")

a = []
  
for i in range(R):          
    for j in range(C):      
         a.append(int(input()))
    X.append(a)
  
Y = []

R2 = int(input("Enter the number of rows:"))
C2 = int(input("Enter the number of columns:"))

print("Enter Second Matrix the entries row wise:")
  
for i in range(R2):         
    a =[]
    for j in range(C2):     
         a.append(int(input()))
    Y.append(a)


result = [ [0]*R for i in range(C2)]

for i in range(len(X)):
 
    for j in range(len(Y[0])):
 
        for k in range(len(Y)):
            result[i][j] += X[i][k] * Y[k][j]

for r in result:
	print(r)