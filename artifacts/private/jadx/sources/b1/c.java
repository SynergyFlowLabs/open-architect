package b1;

import androidx.compose.animation.tooling.ComposeAnimatedProperty;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.TransitionInfo;
import c1.b;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface c<T extends ComposeAnimation, TState extends c1.b> {
    static /* synthetic */ void f(c cVar, Object obj, Object obj2, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setStateParameters");
        }
        if ((i10 & 2) != 0) {
            obj2 = null;
        }
        cVar.e(obj, obj2);
    }

    void a(long j10);

    long b();

    @NotNull
    List<ComposeAnimatedProperty> c();

    @NotNull
    List<TransitionInfo> d(long j10);

    void e(@NotNull Object obj, @Nullable Object obj2);

    void g(@NotNull TState tstate);

    @NotNull
    TState getState();

    long h();

    @NotNull
    T i();
}
