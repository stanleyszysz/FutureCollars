package fc.stream.task3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class Cinema {

    public static void main(String[] args) {
        CinemaHall hall1 = new CinemaHall("hall1", HallType.DDD);
        CinemaHall hall2 = new CinemaHall("hall2", HallType.DD);
        CinemaHall hall3 = new CinemaHall("hall3", HallType.DDD);
        CinemaHall hall4 = new CinemaHall("hall4", HallType.DDDD);
        CinemaHall hall5 = new CinemaHall("hall5", HallType.DDDD);
        CinemaHall hall6 = new CinemaHall("hall6", HallType.DD);
        CinemaHall hall7 = new CinemaHall("hall7", HallType.DDD);
        CinemaHall hall8 = new CinemaHall("hall8", HallType.DDDD);
        CinemaHall hall9 = new CinemaHall("hall9", HallType.DD);
        CinemaHall hall10 = new CinemaHall("hall10", HallType.DD);

        List<CinemaHall> cinemaHallList = Arrays.asList(hall1, hall2, hall3, hall4, hall5, hall6, hall7, hall8, hall9,
                hall10);

        Map<HallType, List<CinemaHall>> hallsGroupedByHallType = groupByHallType(cinemaHallList);
        System.out.println(hallsGroupedByHallType);
        System.out.println();
        System.out.println("Number of 2D halls is: " + hallsGroupedByHallType.get(HallType.DD).size());
        System.out.println("Number of 3D halls is: " + hallsGroupedByHallType.get(HallType.DDD).size());
        System.out.println("Number of 4D halls is: " + hallsGroupedByHallType.get(HallType.DDDD).size());

    }

    public static Map<HallType, List<CinemaHall>> groupByHallType(List<CinemaHall> cinemaHallList) {
        return cinemaHallList.stream().collect(groupingBy(CinemaHall::getHallType));
    }

}
