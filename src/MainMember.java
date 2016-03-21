package tugaspraktikum4;

import java.util.ArrayList;

public class MainMember {

    public static void main(String[] args) {
        String a, b;
        int c, d, e, f;

        ArrayList<Member> listMember = new ArrayList<>();
        Member wong = new Member();
        Member wong1 = new Member();
        Member wong2 = new Member();
        listMember.add(wong);
        listMember.add(wong1);
        listMember.add(wong2);

        wong.setNama("Cindy Putri");
        wong.setTeam(1);
        wong.setUmur(25);
        wong.setNilaiPenampilan(90);
        wong.setNilaiSuara(60);
        wong.setNilaiAttitude(80);

        wong1.setNama("Sanjaya");
        wong1.setTeam(2);
        wong1.setUmur(21);
        wong1.setNilaiPenampilan(70);
        wong1.setNilaiSuara(80);
        wong1.setNilaiAttitude(30);

        wong2.setNama("Raisa Centil");
        wong2.setTeam(3);
        wong2.setUmur(41);
        wong2.setNilaiPenampilan(75);
        wong2.setNilaiSuara(65);
        wong2.setNilaiAttitude(45);

        for (int i = 0; i < listMember.size(); i++) {
            listMember.get(i).hasil();

        }

    }
}
