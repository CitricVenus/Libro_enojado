public class libr{
  private String Autor,
                Editorial,
                Titulo,
                ISBN;
  private  int cantidad;
  public libr(String Autor, String Editorial, String Titulo, String ISBN,int cantidad){
      this.Autor="";
      this.Editorial="";
      this.Titulo="";
      this.ISBN="";
      this.cantidad=0;
  }
  public void setautor(){
    this.Autor=Autor;
  }
  public  void setedit(){
    this.Editorial=Editorial;
  }
  public void settit(){
    this.Titulo=Titulo;
  }
  public void setisb(){
    this.ISBN=ISBN;
  }
  public void setcant(){
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
  public int getcant(){
    return this.cantidad;
  }

}
