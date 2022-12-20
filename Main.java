    public class Main {
        public static void main(String[] args) {
            Person pr0 = new Person();
            pr0.setName("Илья");
            pr0.setAge(58);
            System.out.println(pr0.getName()+pr0.getAge());
        }
    }
    class Person {
        private String name;
        private int age;
        void setName(String name) {
            if (name.isEmpty()){
                System.out.println("ТЫ ввел пустое имя!");
            }else{
                this.name = name;}
        }
        public String getName() {
            return name;
        }
        void setAge(int age) {
            if (age<0){
                System.out.println("Ты дурачек?");
            }else{
                this.age = age;}
        }
        public int getAge() {
            return age;
        }
    }
