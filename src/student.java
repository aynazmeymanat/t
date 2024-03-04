public class student {

    private String firstname ;

            private String lastname ;

            private String id ;

            private String grade ;

    public student(String firstname, String lastname, String id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
        if(id.length() != 7){
            this.id ="invlaid idCode";
        }
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
        if (Double.valueOf(grade)<0 || Double.valueOf(grade)>20){
            this.grade = "invalid grade" ;
        }
    }

    public void PrintStudentInfo(){
        System.out.println(firstname + " " + lastname + "\nID : " + id + "\nGRADE : " + grade);
        System.out.println();
    }

}


