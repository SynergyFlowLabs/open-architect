package androidx.window.embedding;

import android.app.Activity;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@androidx.window.core.d
public interface j {
    void a(@NotNull Set<? extends m> set);

    @NotNull
    Set<m> b();

    void c(@NotNull Activity activity, @NotNull Executor executor, @NotNull androidx.core.util.e<List<t>> eVar);

    void d(@NotNull androidx.core.util.e<List<t>> eVar);

    boolean e();

    void f(@NotNull m mVar);

    void g(@NotNull m mVar);
}
