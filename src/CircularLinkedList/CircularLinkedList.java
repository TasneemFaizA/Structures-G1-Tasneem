public boolean isEmpty(){
    return size()==0;
}

public void addFirst(E data){
    if(isEmpty()){
        Node<E> newNode=new Node(data,null);
        @@ -31,6 +32,56 @@ public void addLast(E data){
            tail=tail.getNext();
        }

        public E getFirst(){
            if (isEmpty())return null;
            return tail.getNext().getData();
        }
        public E getLast(){
            if (isEmpty())return null;
            return tail.getData();
        }
        public E removeFirst(){
            if (isEmpty())return null;
            E delete=tail.getNext().getData();
            if (tail==tail.getNext()){
                tail=null;
            }
            else {
                tail.setNext(tail.getNext().getNext());
            }
            size--;
            return delete;
        }
        public E removeLast(){
            if (isEmpty())return null;
            E delete=tail.getData();
            if (tail==tail.getNext()){
                tail=null;
            }
            else {
                Node<E>temp=tail.getNext();
                while (temp.getNext()!=tail){
                    temp=temp.getNext();
                }temp.setNext(tail.getNext());
                tail=temp;
            }
            size--;
            return delete;
        }
        public void display(){
            if(isEmpty()){
                System.out.println("List  is Empty");
                return;
            }
            Node<E>temp=tail.getNext();
            do {
                System.out.print(temp.getData()+"---->");
                temp=temp.getNext();
            }while (temp!=tail.getNext());
            System.out.println("go first ("+temp.getData()+")");

        }


        class Node<E>{
            private E data;