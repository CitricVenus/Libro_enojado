public class libre{
  private libr[] libros;
  public libre(){
    this.libros=new libr[10];
  }
  public void ponerlibros(int pos,String Autor, String Editorial, String Titulo, String ISBN,String cantidad){
    this.libros[pos]=new libr(Autor,Editorial,Titulo,ISBN,cantidad);
  }
  public String toString(){
    String resultado="";
    for(int i=0;i<this.libros.length;i++){
    	if(this.libros[i]!=null){
    		resultado+=this.libros[i]+"\n";
      }
    }
    return resultado;
}
  public static void main(String[] args){
    libre lb=new libre();
    lb.ponerlibros(0,"Luis","Mal","Amigo","5544588","5552454");
    lb.ponerlibros(1,"Mal","Amigo","Amigo","kdnfep","5552454");
    lb.ponerlibros(2,"pokemon","naruto","tu jefa","55525","2");
    System.out.println(lb);
  }
}
