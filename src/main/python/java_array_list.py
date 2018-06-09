# importing and using a java array list in jython code

import java.util.ArrayList as ArrayList

aList = ArrayList()
aList.add(10)
aList.add(20)

print(aList, type(aList))

aList.add(30)
aList.remove(20)

print(aList)