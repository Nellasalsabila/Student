public class parttime {
    int hoursworked;

    public parttime() {
        hoursworked = 0;
    }

    public parttime(int hoursworked,
     int gajitahunan) {
        setgajitahunan(hoursworked);
      
      
         gajitahunan = gajitahunan;
    }

    // Getter-->mendapatkan nilai-->tipe data
    public int getHoursworked() {
        return hoursworked;

    }

    public int getGajitahunan() {
        return gajitahunan;
    }

    // Setter-->mengubah nilai-->void
    public void sethoursworked(int hoursworked) {
        this.hoursworked = hoursworked;
    }

    public void setgajitahunan(int Hoursworked) {
        this.gajitahunan = Hoursworked*10*20000;
    }

    public void print() {
        System.out.println("Hoursworked: " + hoursworked);
        System.out.println("Gajitahunan : " + gajitahunan);

    }
}
