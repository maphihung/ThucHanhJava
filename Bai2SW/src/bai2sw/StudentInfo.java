    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package bai2sw;

    /**
     *
     * @author Admin
     */
    public class StudentInfo {
        static private String name, year, sex;

        public void setName(String name) {
            this.name = name;
        }
        public void setYear(String year) {
            this.year = year;
        }
        public void setSex(String sex) {
            this.sex =sex;
        }
        public void setInfo(String name,String sex, String year) {
            this.name = name;
            this.year = year;
            this.sex = sex;
        }
        public String getName() {
            return name;
        }
        public String getYear() {
            return year;
        }
        public String getSex() {
            return sex;
        }
    }
