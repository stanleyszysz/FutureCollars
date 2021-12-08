package fc.stream.task3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

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

        HashMap<HallType, List<CinemaHall>> hallsGroupedByHallType = groupByHallType(cinemaHallList);
        System.out.println(hallsGroupedByHallType);
        System.out.println();
        HashMap<HallType, Long> amountOfHallsGroupedByHallType = countHallType(cinemaHallList);
        System.out.println(amountOfHallsGroupedByHallType);

    }

    public static HashMap<HallType, List<CinemaHall>> groupByHallType(List<CinemaHall> cinemaHallList) {
        HashMap<HallType, List<CinemaHall>> resultGroup = new HashMap<>();
        resultGroup.put(HallType.DD,
                cinemaHallList.stream().filter(cinemaHall -> cinemaHall.getHallType() == HallType.DD).collect(Collectors.toList()));
        resultGroup.put(HallType.DDD,
                cinemaHallList.stream().filter(cinemaHall -> cinemaHall.getHallType() == HallType.DDD).collect(Collectors.toList()));
        resultGroup.put(HallType.DDDD,
                cinemaHallList.stream().filter(cinemaHall -> cinemaHall.getHallType() == HallType.DDDD).collect(Collectors.toList()));
        return resultGroup;
    }

    public static HashMap<HallType, Long> countHallType(List<CinemaHall> cinemaHallList) {
        HashMap<HallType, Long> resultCount = new HashMap<>();
        resultCount.put(HallType.DD,
                cinemaHallList.stream().filter(cinemaHall -> cinemaHall.getHallType() == HallType.DD).count());
        resultCount.put(HallType.DDD,
                cinemaHallList.stream().filter(cinemaHall -> cinemaHall.getHallType() == HallType.DDD).count());
        resultCount.put(HallType.DDDD,
                cinemaHallList.stream().filter(cinemaHall -> cinemaHall.getHallType() == HallType.DDDD).count());
        return resultCount;
    }


}
