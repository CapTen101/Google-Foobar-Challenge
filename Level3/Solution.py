from math import sqrt, floor

def solution(n):
    # your code here
    if n<3 or n>200:
        return 0
        
    else:
        sum = 0
        cache = []
        for x in range(0, n):
          temp = []
          for y in range(0, n):
            temp.append(-1)
          cache.append(temp)
          
          
        for i in range(int(floor(sqrt(n*2))), n):
            sum += recurse(n-i, i, cache)
        return sum
    
    
def recurse(remaining, prev, cache):
    
    if remaining == 0: 
      return 0
    if prev == 1:
      return 0
    
    if cache[remaining][prev] != -1:
      return cache[remaining][prev]
    # if remaining < prev:
    #     return 0
    # elif remaining == 0:
    #     return 1
        
    sum = 0
    if prev >  remaining:
      sum += 1
      
    for i in range(int(floor(sqrt(remaining*2))), remaining):
        if i >= prev:
          break
        sum += recurse(remaining-i, i, cache)

    cache[remaining][prev] = sum
    return sum
    

print solution(200)

