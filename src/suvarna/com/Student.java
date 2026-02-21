package suvarna.com;

class Student {
    private String name;
    private  int id;

    public void setName(String name){
        this.name=name;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public String toString(){
        return "Student: [ name: "+name+", id: "+id+"]";
    }
}
