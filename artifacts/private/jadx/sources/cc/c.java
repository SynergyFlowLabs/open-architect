package cc;

import com.planner5d.library.engine.util.math.k;
import com.planner5d.library.math.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public interface c extends e {
    @NotNull
    <T extends bc.b> Iterable<T> a();

    @NotNull
    c b();

    void c(@NotNull float[] fArr);

    @Nullable
    bc.b d(@Nullable String str);

    void e(@Nullable Object obj);

    @Nullable
    Float g(@Nullable String str, @Nullable k kVar, @Nullable m mVar, @Nullable Runnable runnable);

    void h(int i10);

    int i();

    @NotNull
    m j();
}
