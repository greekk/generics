package tree;

public class MainApp {
    public BinaryTree<String> myTree = new BinaryTree<String>();

    public void fillTree(){
        int key;
        String data;

        for(int i = 0; i < 10; i++){
            key = i;
            data = "test string number: "+ i;
            myTree.insert(key, data);
        }
    }



    public static void main(String[] args){

        MainApp app = new MainApp();
        app.fillTree();
        try{
            System.out.println(app.myTree.find(2).getData());
            System.out.println(app.myTree.find(6).getData());
        }
        catch(NullPointerException ex){
            System.out.println("Element not found");
        }


    }
}
