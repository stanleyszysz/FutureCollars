package fc.stream.task4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Doctors {

    public static List<String> doctorsSpecializations(List<String> doctors) {
        List<String> list = doctors.stream().map(doctor -> doctor.split(":"))
                .flatMap(array -> Arrays.stream(array))
                .distinct()
                .collect(Collectors.toList());
        list.removeIf(element -> element.equals("Szpital") || element.equals("Przychodnia"));
        return list;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Szpital:Chirurg:Radiolog:Chirurg Szczękowy:Pediatra", "Przychodnia:Pediatra", "Przychodnia:Internista:Laryngolog:Pediatra");

        List<String> specializations = doctorsSpecializations(list);
        System.out.println(specializations);
    }
}