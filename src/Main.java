public class Main {
    public static void main(String[] args) {
//        Задание 1.
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Семёнов";
        String fullName = lastName + " " + firstName + " " + middleName;
        fullName = fullName.replace("ё", "е");
        System.out.println("ФИО сотрудника - " + fullName);
//        Задание 2.
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName);
//        Задание 3.
        System.out.println("Данные ФИО сотрудника " + fullName);
// В конце задания я столкнулся с проблемой. В каждом задании было сказано, что я должен использовать строку "fullName" при этом с разными значениями в ней. По этому сначала я создал новые переменные "fFullName и eFullName" для каждого задания, но мне показалось что я без причины усложняю код. Поэтому решил просто изменить имя и поставить метод "replace" в начало.
//Подскажите, сделал ли я верно или надо было решить проблему как то иначе!?
    }
}