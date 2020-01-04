import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HeavenlyBody {
    private final String name;
    private final int orbitalTime;
    private final Set<HeavenlyBody> moons;

    public HeavenlyBody(String name, int orbitalTime) {
        this.name = name;
        this.orbitalTime = orbitalTime;
        this.moons = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public int getOrbitalTime() {
        return orbitalTime;
    }

    public Set<HeavenlyBody> getMoons() {
        return new HashSet<>(moons);
    }

    public void addMoon(HeavenlyBody moon) {
        this.moons.add(moon);
    }

//    @Override
//    public boolean equals(Object obj) {
//        if ()
//    }
}
