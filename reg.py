import re
#pseudo decorator function
#callback,closure,exection contexts,*args,**kwargs(unpacking and packing) understand this first then we will understand decorator
def decoFn(func):
    def caller(*args,**kwargs):
        result=func(*args,**kwargs)
        if result==None:
           print("not a match")
        else:
           print("match")
           print(result)
    return caller
re.fullmatch=decoFn(re.fullmatch)
re.match=decoFn(re.match)
re.search=decoFn(re.search)

fullmatch=re.fullmatch
match=re.match
search=re.search
        