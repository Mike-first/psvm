//Flyweight
//saves memory by separating internal (same for many objects) and external (unique/context) state
//flyweight is immutable, has no setters, gets state via constructor, fields are not public
//complements factory method

package com.hill.pattern.structural.flyweight;


import java.util.LinkedList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Tree> trees = new LinkedList<>();
        //poplars
        TreeType treeType = Factory.getTreeType("poplar", "grey", "light white soft"); //now factory's map is empty, so new type will be created
        for (int i = 0; i < 10; i++) {
            //10 objects will will refer to it's common treeType, so it required not 10//"full tree" bytes of RAM, but 10//"light tree" + common part
            trees.add(new Tree(positionGenerator(i), positionGenerator(i), heightGenerator(i), treeType));
        }

        //Pine
        treeType = Factory.getTreeType("Pine", "brown", "light yellow resinous");//one more new type
        for (int i = 0; i < 10; i++) {
            trees.add(new Tree(positionGenerator(i), positionGenerator(i), heightGenerator(i), treeType));
        }
        //one more poplar
        treeType = Factory.getTreeType("poplar", "grey", "light white soft"); //now factory's map contains such type, so factory won't create new type, but return existing
        trees.add(new Tree(positionGenerator(13), positionGenerator(80), heightGenerator(6), treeType));

        forest(trees);

    }

    static void forest(List<Tree> trees) {
        trees.forEach(Tree::grow);
    }


    private static int positionGenerator(int i) {
        return (int) (Math.random() * 100 * Math.sin(i + 0.5));
    }

    private static int heightGenerator(int i) {
        return (int) Math.abs(Math.random() * 100 * Math.sin(i + 0.5));
    }

}
