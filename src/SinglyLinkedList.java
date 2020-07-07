
public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head = null;
    }
    //Los metodos de la SLL van aqui. Al principio, les mostraremos cómo agregar nodos a la lista.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

	public void printValues() {
		Node current = head;
		 if(head == null) {    
	            System.out.println("Lista vacia");    
	            return;    
	        }    
	        System.out.println("Nodos de la lista: ");    
	        while(current != null) {    
	            //Imprime la lista   
	            System.out.print(current.value + " ");    
	            current = current.next;    
	        }    
		
	} 
	Node remove() {
		Node crr = head;
		if(crr==null || crr.next==null) {
		 head =null;
		 return crr;
		}
		Node nextNode = crr.next;
		while(crr.next!=null) {
			if(nextNode.next == null) {
				crr.next= null;
			}
			crr= nextNode;
			nextNode = nextNode.next;
		}
		return crr;
	}
	
	public void encontrar(int value) {
		Node crr = head;
		int valorr= value;
		if(crr.value==valorr || crr.next==null) {
			System.out.println("Valor encontrado : "+crr.value);
		}

		Node nextNode = crr.next;
		while(crr.next!=null) {
			if(nextNode.value == valorr) {
				System.out.println("Valor encontrado : "+nextNode.value);
			}
			crr=nextNode;
			nextNode =nextNode.next;
		}
		System.out.println("No existe el valor "+valorr+" en la lista");
	}
}
