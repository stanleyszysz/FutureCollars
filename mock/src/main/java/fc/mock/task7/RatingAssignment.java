package fc.mock.task7;

class RatingAssignment {

    public static Rating getRating(double rating) {
        if (rating < 1.2) {
            return Rating.SMALL;
        } else if (1.2 <= rating && rating < 2) {
            return Rating.GOOD;
        } else if (2 <= rating && rating < 3) {
            return Rating.VERY_GOOD;
        } else {
            return Rating.EXCELLENT;
        }
    }
}
