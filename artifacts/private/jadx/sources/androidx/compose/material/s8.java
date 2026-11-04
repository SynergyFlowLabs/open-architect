package androidx.compose.material;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class s8<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Object f24903a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private List<r8<T>> f24904b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private androidx.compose.runtime.q4 f24905c;

    @Nullable
    public final Object a() {
        return this.f24903a;
    }

    @NotNull
    public final List<r8<T>> b() {
        return this.f24904b;
    }

    @Nullable
    public final androidx.compose.runtime.q4 c() {
        return this.f24905c;
    }

    public final void d(@Nullable Object obj) {
        this.f24903a = obj;
    }

    public final void e(@NotNull List<r8<T>> list) {
        this.f24904b = list;
    }

    public final void f(@Nullable androidx.compose.runtime.q4 q4Var) {
        this.f24905c = q4Var;
    }
}
