package androidx.compose.material3;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class kg<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Object f30048a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private List<jg<T>> f30049b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private androidx.compose.runtime.q4 f30050c;

    @Nullable
    public final Object a() {
        return this.f30048a;
    }

    @NotNull
    public final List<jg<T>> b() {
        return this.f30049b;
    }

    @Nullable
    public final androidx.compose.runtime.q4 c() {
        return this.f30050c;
    }

    public final void d(@Nullable Object obj) {
        this.f30048a = obj;
    }

    public final void e(@NotNull List<jg<T>> list) {
        this.f30049b = list;
    }

    public final void f(@Nullable androidx.compose.runtime.q4 q4Var) {
        this.f30050c = q4Var;
    }
}
