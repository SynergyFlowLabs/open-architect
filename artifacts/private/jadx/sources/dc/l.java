package dc;

import cc.a;
import com.planner5d.library.walls.WallsBuilder3DSide;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public interface l<T extends cc.a> extends c<T> {
    @NotNull
    e<T> h(@NotNull bc.b bVar);

    @NotNull
    e<T> i(boolean z10, @NotNull bc.b bVar);

    @NotNull
    T j(@NotNull T t10, @NotNull WallsBuilder3DSide wallsBuilder3DSide);

    @Nullable
    T p();
}
