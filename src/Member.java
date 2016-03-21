package tugaspraktikum4;

public class Member {
   private String Nama;
   private int Team;
   private int Umur;
   private int NilaiPenampilan;
   private int NilaiSuara;
   private int NilaiAttitude;
   private int Ratarata;
    
    Member(){
    Nama="";
    Team = 0;
    Umur = 0;
    NilaiPenampilan = 0;
    NilaiSuara = 0;
    NilaiAttitude = 0;
     }
    
    public void setNama(String Nama){
    this.Nama = Nama;
    }
    
    public void setTeam(int Team){
    this.Team = Team;
    }
    
    public void setUmur(int Umur){
    this.Umur = Umur;
    }
    
    public void setNilaiPenampilan(int NilaiPenampilan){
    this.NilaiPenampilan = NilaiPenampilan;
    }
    
    public void setNilaiSuara(int NilaiSuara){
    this.NilaiSuara = NilaiSuara;
    }
    
    public void setNilaiAttitude(int NilaiAttitude){
    this.NilaiAttitude = NilaiAttitude;
    }
    
    public String getNama(){
      return Nama;
    }
    
    public int getTeam(){
    return Team;
    }
    
    public int getUmur(){
    return Umur;
    }
    
    public int getNilaiPenampilan(){
    return NilaiPenampilan;
    }
    
    public int getNilaiSuara(){
    return NilaiSuara;
    }
    
    public int getNilaiAttitude(){
    return NilaiAttitude;
    }
    
    public int getRatarata(){
    return Ratarata= (NilaiPenampilan + NilaiSuara + NilaiAttitude)/3;
    }
    
    public void hasil(){
        System.out.println("-----------------------------");
        System.out.println("Nama    : "+getNama());
        System.out.println("Team    : "+getTeam());
        System.out.println("Umur    : "+getUmur());
        System.out.println("NilaiPenampilan   : "+getNilaiPenampilan());
        System.out.println("NilaiSuara        : "+getNilaiSuara());
        System.out.println("NilaiAttitude     : "+getNilaiAttitude());
        System.out.println("Ratarata          : "+getRatarata());
    
    }
}

    
    
    

