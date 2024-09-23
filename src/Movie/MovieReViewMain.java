package Movie;

// 배열을 이용해서 손 쉽게 관리해야 함.
public class MovieReViewMain {
    public static void main(String[] args) {
        MovieReView[] movies = new MovieReView[2];

        movies[0] = new MovieReView();
        movies[0].title = "어바웃 타임";
        movies[0].review = "재미 없어요";

        movies[1] = new MovieReView();
        movies[1].title = "원피스";
        movies[1].review = "완전 꿀잼이예요!!";

        for(MovieReView movie : movies){
            System.out.println("영화제목 : " + movie.title + "리뷰 : " + movie.review);
        }
    }
}
