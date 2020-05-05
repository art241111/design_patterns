package adapter;

import adapter.adapters.SquarePegAdapter;
import adapter.hole.RoundHole;
import adapter.peg.RoundPeg;
import adapter.peg.SquarePeg;

public class Application {
    /**
     * Клиентский код, точка запуска приложения
     */
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        roundPeg(hole);
        squarePegWithoutAdapter(hole);
        squarePegWithAdapter(hole);
    }

    /**
     * Проверка сочетаемости круглого колышка
     * и круглого отверстия
     * @param hole - круглое отверстие
     */
    private static void roundPeg(RoundHole hole){
        RoundPeg rpeg = new RoundPeg(5);
        System.out.println(hole.fits(rpeg)); // True
    }

    /**
     * Проверка совместимости квадратного колышка
     * и круглого отверстия
     * @param hole - круглое отверстие
     */
    private static void squarePegWithoutAdapter(RoundHole hole){
        SquarePeg small_sqpeg = new SquarePeg(5);
        SquarePeg large_sqpeg = new SquarePeg(10);
        //hole.fits(small_sqpeg); // Ошибка компиляции, несовместимые типы
    }

    /**
     * Проверка совместимости квадратных колышков
     * с круглым отверстиями через адаптеры
     * @param hole - круглое отверстие
     */
    private static void squarePegWithAdapter(RoundHole hole){
        SquarePeg small_sqpeg = new SquarePeg(5);
        SquarePeg large_sqpeg = new SquarePeg(10);

        SquarePegAdapter small_sqpeg_adapter = new SquarePegAdapter(small_sqpeg);
        SquarePegAdapter large_sqpeg_adapter = new SquarePegAdapter(large_sqpeg);
        System.out.println(hole.fits(small_sqpeg_adapter)); // TRUE
        System.out.println(hole.fits(large_sqpeg_adapter)); // FALSE
    }
}
