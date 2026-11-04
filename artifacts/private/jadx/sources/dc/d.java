package dc;

import cc.a;
import com.planner5d.library.walls.WallsBuilder3D;
import com.planner5d.library.walls.WallsInfoWall;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public interface d<T extends cc.a> {
    @NotNull
    a<T> a(boolean z10, @NotNull com.planner5d.library.math.k kVar);

    @NotNull
    f<T> b();

    @NotNull
    i<T> c(@NotNull com.planner5d.library.engine.util.math.b bVar);

    @NotNull
    k<T> d(int i10, float f10);

    @NotNull
    j<T> e(@NotNull com.planner5d.library.math.k kVar);

    @NotNull
    g<T> f();

    @NotNull
    l<T> g(@NotNull WallsBuilder3D.WallPart wallPart, @NotNull WallsInfoWall wallsInfoWall);

    @NotNull
    b<T> h();
}
