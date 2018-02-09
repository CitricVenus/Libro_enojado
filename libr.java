package libr;
public class libr{
  private String Autor,
                Editorial,
                Titulo,
                ISBN,cantidad;
  public libr(){
	  this("","","","","");
  }
  public libr(String Autor, String Editorial, String Titulo, String ISBN,String cantidad){
      this.Autor=Autor;
      this.Editorial=Editorial;
      this.Titulo=Titulo;
      this.ISBN=ISBN;
      this.cantidad=cantidad;
  }
  public void setautor(String Autor){
    this.Autor=Autor;
  }
  public  void setedit(String Editorial){
    this.Editorial=Editorial;
  }
  public void setTitulo(String Titulo){
    this.Titulo=Titulo;
  }
  public void setisb(String ISBN){
    this.ISBN=ISBN;
  }
  public void setcant(String cantidad){
    this.cantidad=cantidad;
  }
  public String getautor(){
    return this.Autor;
  }
  public String getedit(){
    return this.Editorial;
  }
  public String gettit(){
    return this.Titulo;
  }
  public String getcant(){
    return this.cantidad;
  }
  public String toString(){
	  String nombre=this.Autor+" "+this.Editorial+" "+this.Titulo+" "+this.ISBN+" "+this.cantidad+"";
	  return nombre;
  }
  public void printlibro(){
	  System.out.println(this);
  }
}
