 
// Add , boolean addAll(Collection<? extends E> c,

// Iterator

public class ArrayListIteratorExample1
{
    ArrayList<String>arrlist = new ArrayList<String>();
    arrlist.add("d");
    arrlist.add("dd");
    arrlist.add("ddd");
    arrlist.add("dddd");
    arrlist.add("ddddd");
    System.out.println(arrlist);    // [d, dd, ddd, dddd, ddddd]

    Iterator<String> iterator = arrlist.iterator();
    while (iterator.hasNext())
    {
        String i = iterator.next();
        System.out.println(i);
    }

    Collections.sort(list1);
    al.add("Suresh");
    al.remove("Vijay");
}
