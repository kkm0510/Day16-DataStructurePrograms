package unorderedlist;

public class Main {

    public static void main(String[] args) {
        String sentence="hello hey world this is kartikeya maan";
        String[] words=sentence.split(" ");
        UnorderedList<String> list=new UnorderedList<>();
        for(String word : words){
            list.add(word);
        }
        System.out.println(list);
        String word="hey";
        if(!list.search(word)) list.add(word);
        else list.remove(word);
        System.out.println(list);
    }

}
