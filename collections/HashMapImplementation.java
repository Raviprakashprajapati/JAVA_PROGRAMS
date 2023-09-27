import java.util.HashMap;
import java.util.LinkedList;

class MyHashMap<k, v> {
    int defaulCapacity = 4;
    float loadFactor = 0.75f;
      int n; // no of entries in map
    LinkedList<Node>[] buckets;

    class Node {
        k key;
        v value;

        Node(k key, v value) {
            this.key = key;
            this.value = value;
        }

    }

    void initBuckets(int size) {
        buckets = new LinkedList[size];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    int hashFunc(k key) {
        int hc = key.hashCode();
        return (Math.abs(hc)) % buckets.length;
    }

    // travers the ll and looks for the nodw with key
    int searchInBucket(LinkedList<Node> ll, k key) {
        for (int i = 0; i < ll.size(); i++) {
            if (ll.get(i).key == key) {
                return i;

            }
        }
        return -1;
    }

    MyHashMap() {
        initBuckets(defaulCapacity);
    }

    int bucketCapacity(){
        return buckets.length;
    }

    void rehash() {
        LinkedList<Node>[] oldBucket = buckets;
        initBuckets(oldBucket.length*2);
        n=0;
        //traverse every node and put them in new buckets
        for(var bucket:oldBucket)
        {
            for(var node:bucket){
                
                k key = node.key;
                v value = node.value;
                put(key,value);
                
            }
        }

    }

    // All methods-----
    int size() {
        return n;
    }

    void put(k key, v value) {

        int bucIndex = hashFunc(key);
        LinkedList<Node> currentBucket = buckets[bucIndex];
        int index = searchInBucket(currentBucket, key);
        // insert new node
        if (index == -1) {
            Node node = new Node(key, value);
            currentBucket.add(node);
            n++;
        } else {
            Node currentNode = currentBucket.get(index);
            currentNode.value = value;

        }

        // rehash--- 4>=3
        if (n >= buckets.length * loadFactor) {
            rehash();
        }

    }

    v get(k key) {
        int bucIndex = hashFunc(key);
        LinkedList<Node> currentBucket = buckets[bucIndex];
        int index = searchInBucket(currentBucket, key);

        // if key present
        if (index != -1) {
            Node currNode = currentBucket.get(index);
            return currNode.value;
        }
        return null;

    }

    v remove(k key) {
        int bucIndex = hashFunc(key);
        LinkedList<Node> currentBucket = buckets[bucIndex];
        int index = searchInBucket(currentBucket, key);

        // if presen
        if (index != -1) {
            Node currBucket = currentBucket.get(index);
            v value = currBucket.value;

            currentBucket.remove(index);
            n--;
            return value;

        }
        return null;

    }



}



//main classs
public class HashMapImplementation {
    public static void main(String[] args) {

        // THRESHOLD VLAUE = LoadFactor * total bucket length
        // when to reHash = when nnumber of element greater than theadhol value

        // MyHashMap<Integer, Integer> hh = new MyHashMap<>();
        // hh.put(1, 100);
        // hh.put(2, 200);
        // hh.put(3, 300);
        // System.out.println(hh.get(1));
        // System.out.println(hh.get(2));
        // System.out.println(hh.get(3));
        // System.out.println(hh.bucketCapacity());

     


    
    }
}

