public class HesapMakinası {
    public int sayı1;
    public int sayı2;

  HesapMakinası(int sayı1,int sayı2 ){
       this.sayı1=sayı1;
       this.sayı2=sayı2;
  }
  public int toplama(){
      return this.sayı1+this.sayı2;
  }
  public int cıkarma(){
      return this.sayı1-this.sayı2;
  }
  public int carpma(){
      return this.sayı1*this.sayı2;
  }
  public int bölme(){
      return this.sayı1/this.sayı2;
  }

    public int getSayı1() {
        return sayı1;
    }

    public void setSayı1(int sayı1) {
        this.sayı1 = sayı1;
    }
}
