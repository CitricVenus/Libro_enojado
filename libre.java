public class libre{
  private libr[] libros;
  public libre(){
    this.libros=new libr[10];

  }
  public void ponerlibros(String Autor, String Editorial, String Titulo, String ISBN,String cantidad,int pos){
    this.libros[pos]=new libr(Autor,Editorial,Titulo,ISBN,cantidad);
  }
  public String toSting(){
    String resultado="";
    for(int i=0;i<this.libros.length;i++){
      if(this.libros[i]!=null){
      resultado=this.libros[i]+"\n";
  }
  return resultado;
 }
}
  public static void main(String []args){
    libre lb=new libre();
    lb.ponerlibros("","","","","");
    System.out.println(lb);

  }
}
