package Structures.Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import models.Person;

public class Sets {
    public Set<String> construirHashSet() {
        Set<String> miHashSet = new HashSet<>();
        
        miHashSet.add("A");
        miHashSet.add("B");
        miHashSet.add("C");
        miHashSet.add("A");
        miHashSet.add("D");
        miHashSet.add("sf");
        miHashSet.add("sdfsfg");
        miHashSet.add("sfgdf");
        miHashSet.add("fghr");
        miHashSet.add("wer");
        miHashSet.add("rty");
        miHashSet.add("3retgf");
        miHashSet.add("fgh");
        miHashSet.add("fyghj");
        miHashSet.add("erfg");
        return miHashSet;
    }

    public Set<String> construirLinkedHashSet() {
        Set<String> linkedHashSet = new LinkedHashSet<>();
        
        linkedHashSet.add("A");
        linkedHashSet.add("B");
        linkedHashSet.add("C");
        linkedHashSet.add("A");
        linkedHashSet.add("D");
        linkedHashSet.add("sf");
        linkedHashSet.add("sdfsfg");
        linkedHashSet.add("sfgdf");
        linkedHashSet.add("fghr");
        linkedHashSet.add("wer");
        linkedHashSet.add("rty");
        linkedHashSet.add("3retgf");
        linkedHashSet.add("fgh");
        linkedHashSet.add("fyghj");
        linkedHashSet.add("erfg");
        
        return linkedHashSet;
    }

    public Set<String> construirTreeSet() {
        Set<String> treeSet = new TreeSet<>();
        
        treeSet.add("D");
        treeSet.add("A");
        treeSet.add("C");
        treeSet.add("B");
        treeSet.add("A");
        treeSet.add("sf");
        treeSet.add("sdfsfg");
        treeSet.add("sfgdf");
        treeSet.add("fghr");
        treeSet.add("wer");
        treeSet.add("rty");
        treeSet.add("3retgf");
        treeSet.add("fgh");
        treeSet.add("fyghj");
        treeSet.add("erfg");
        
        return treeSet;
    }

    public Set<String> construirTreeSetConComparador() {
        Set<String> treeSet = new TreeSet<>(
            (pal1, pal2) -> pal1.compareToIgnoreCase(pal2));
        
        treeSet.add("D");
        treeSet.add("A");
        treeSet.add("C");
        treeSet.add("B");
        treeSet.add("A");
        treeSet.add("sf");
        treeSet.add("sdfsfg");
        treeSet.add("sfgdf");
        treeSet.add("fghr");
        treeSet.add("a");
        treeSet.add("rty");
        treeSet.add("3retgf");
        treeSet.add("fgh");
        treeSet.add("fyghj");
        treeSet.add("erfg");
        
        return treeSet;
    }

    public Set<Person> personsTreeSet() {
        Set<Person> treePersons = new TreeSet<>(
            /*(p1, p2) -> {
                //solo edad
                //int com = Integer.compare(p1.getAge(), p2.getAge());
                //solo nombre
                //int com = (p2.getName()).compareTo(p1.getName());
                //return com;

                int com = p1.getName().compareTo(p2.getName());
        
                if (com != 0) {
                    return com;
                }

                return Integer.compare(p2.getAge(), p1.getAge());
            }*/);
        
        treePersons.add(new Person("Carlos", 23));
        treePersons.add(new Person("Ana", 30));
        treePersons.add(new Person("Luis", 18));
        treePersons.add(new Person("Ana", 20));
        treePersons.add(new Person("Andres", 23));
        treePersons.add(new Person("Luis", 18));
        
        return treePersons;
    }

}
