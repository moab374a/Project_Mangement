# Project_Mangement

Here we’ve got a sample Factory which can produce the following Parts: Components, SingleComponent and Resource. Upon calling createPart(), it would create a part. The class Part represents what all parts have in common, and therefore is abstract. A Factory has a ReceivingStock, which is a type of Stock and a Purchasing department which performs actions on its stock as required (here: buy()).

A Stock‘s Parts are managed with a java.util.Map<Part, Integer>. This map has all Parts on the stock as keys, and their respective amounts as values. The following methods operate on this map:

getCount(): Returns the number of physical parts for a Part or -1 if the part is not in the stock.
insert(): If the part exists in the stock, this method increases the number of physical parts by the given value,
otherwise the Part is inserted into the map with the given number of physical parts.
remove():
If the part exists, this method decreases the number of physical parts only if there are enough parts in the stock (true case),
otherwise no changes are made (false case). Returns also false if the part does not exist.
The purchasing department observes the stock and has to be notified of operations performed on the stock. A ReceivingStock has the two attributes minStockItems and maxStockItems.
These attributes define the maximum and minimum number of physical parts for a Part and these limits apply to every Part in the stock separately. All methods that change the number of parts in the stock must emit a signal (notifyPartCountChanged()). Observing departments then check if the part count has dropped below minStockItems (onPartCountChange()), and if so, buy new parts. The purchasing department would then, 
for example, buy() the amount of parts needed to reach maxStockItems again.
