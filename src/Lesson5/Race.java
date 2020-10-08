package Lesson5;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Race {
    private List<Stage> stages;
    public List<Stage> getStages() { return stages; }
    public Race(Stage... stages) {
        this.stages = new ArrayList<>(Arrays.asList(stages));
    }
}