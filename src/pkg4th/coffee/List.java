/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class List{
        class Item{ //struct
        private String nameItem;
        private String menuName;
       private double price;  
       private int id;
        private Item next;    
        
        public Item(String nameItem ,   String menuName, double price,  int id ) {    
            this.price = price; 
            this.nameItem = nameItem;
            this.menuName = menuName;
            this.id =id;
            this.next = null;   
            
        }    
    }

    public Item head = null;    
    public Item tail = null;   
    //add item
    public void add_item(String nameItem, String menuName, double price, int id) {    
        Item newNode = new Item(nameItem , menuName, price, id );    
            
        if(head == null) {    
            head = newNode;    
            tail = newNode;    
        }    
        else {    
            tail.next = newNode;    
            tail = newNode;    
        }
        
        
        System.out.println("Has been added:");
        System.out.println("\t-Name:"+nameItem);
        System.out.println("\t-Price:"+price+"$");
        System.out.println("----------------------------");
    } 
    
    /* Given a key, deletes the first occurrence of key in linked list */
    //delete node
    void deleteNode(int id) 
    { 
         System.out.println("deleteNode ->" +id);
        // Store head node 
        Item temp = head, prev = null; 
  
        // If head node itself holds the key to be deleted 
        if (temp != null && temp.id == id) 
        { 
            head = temp.next; // Changed head 
            return; 
        } 
  
        // Search for the key to be deleted, keep track of the 
        // previous node as we need to change temp.next 
        while (temp != null && temp.id != id) 
        { 
            prev = temp; 
            temp = temp.next; 
        }     
  
        // If key was not present in linked list 
        if (temp == null) return; 
  
        // Unlink the node from linked list 
            prev.next = temp.next; 
       
    } 
      
        @SuppressWarnings("empty-statement")
    public  String[][]  display() {    
        Item current = head;    
        Item contH = head;    
        int cont = 0;
        int arrIndex = 0;
         while(contH != null) { 
             cont++;
              contH = contH.next;  
         }
            String data[][];
            data = new String[cont][4];
            
         while(current != null){
             
            data[arrIndex][0] = String.valueOf(current.id);
            data[arrIndex][1] = current.nameItem;
            data[arrIndex][2] = current.menuName;
            data[arrIndex][3] = String.valueOf(current.price);
            arrIndex++;
            current = current.next; 
        }
 
        return  data;
        
    } 
}
