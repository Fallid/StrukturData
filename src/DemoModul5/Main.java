package DemoModul5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinarryTree algoTree = new BinarryTree();
        BinaryTreeInt algoTreeInt = new BinaryTreeInt();
        String verif, dataNode;
        int dataN, dataNodeInt, verifInt;

        try (Scanner inputData = new Scanner(System.in)) {
            System.out.print("[1] BinaryTree for String. \n[2] BinaryTree for Integer \nPilih : ");
            verif = inputData.nextLine();
            switch(verif){
                case "1":
                    System.out.print("Jumlah data yang ingin dimasukkan : ");
                    dataN = inputData.nextInt();
                    inputData.nextLine();
                    do{
                        System.out.print("Data String : ");
                        dataNode = inputData.nextLine();
                        algoTree.AddNode(dataNode);
                        dataN--;
                    }while(dataN > 0);
                    do{
                        System.out.println("\n");
                        System.out.print("[1] Pre Oder. \n[2] In Order. \n[3] Pre Order. \n[4] Menu Utama \n[5]Exit \nPilih : ");
                        verif = inputData.nextLine();
                        switch(verif){
                            case "1":
                                System.out.print("Pre Order : ");
                                algoTree.preOrder(algoTree.root);
                                break;
                            case "2":
                                System.out.print("In Order : ");
                                algoTree.inOrder(algoTree.root);
                                break;
                            case "3":
                                System.out.print("Post Order : ");
                                algoTree.postOrder(algoTree.root);
                                break;
                            case "4":
                                main(args);
                                break;
                            case "5":
                                System.exit(100);
                                break;
                            default:
                                main(args);
                                break;
                        }
                        System.out.println("\n");
                    }while(!verif.equals("5"));
                    break;
                case "2":
                    System.out.print("Jumlah data yang ingin dimasukkan : ");
                    dataN = inputData.nextInt();
                    do{
                        System.out.print("Data Integer : ");
                        dataNodeInt = inputData.nextInt();
                        algoTreeInt.AddNodeInt(dataNodeInt);
                        dataN--;
                    }while(dataN > 0);
                    do{
                        System.out.println("\n");
                        System.out.print("[1] Pre Oder. \n[2] In Order. \n[3] Pre Order. \n[4] Menu Utama \n[5]Exit \nPilih : ");
                        verifInt = inputData.nextInt();
                        switch(verifInt){
                            case 1:
                                System.out.print("Pre Order : ");
                                algoTreeInt.preOrder(algoTreeInt.root);
                                break;
                            case 2:
                            System.out.print("In Order : ");
                                algoTreeInt.inOrder(algoTreeInt.root);
                                break;
                            case 3:
                                System.out.print("Post Order : ");
                                algoTreeInt.postOrder(algoTreeInt.root);
                                break;
                            case 4:
                                main(args);
                                break;
                            case 5:
                                System.exit(100);
                                break;
                            default:
                                System.out.println("Unknow Error");
                                main(args);
                        }
                        System.out.println("\n");
                    }while(verifInt != 5);
                    break;
                default:
                    throw new Error(verif);
            }
        }
    }
}
