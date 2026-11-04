package androidx.compose.animation.core;

import androidx.compose.animation.core.w;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class a4<T, V extends w> implements z3<T, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<T, V> f12767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<V, T> f12768b;

    /* JADX WARN: Multi-variable type inference failed */
    public a4(@NotNull Function1<? super T, ? extends V> function1, @NotNull Function1<? super V, ? extends T> function2) {
        this.f12767a = function1;
        this.f12768b = function2;
    }

    @Override // androidx.compose.animation.core.z3
    @NotNull
    public Function1<T, V> a() {
        return this.f12767a;
    }

    @Override // androidx.compose.animation.core.z3
    @NotNull
    public Function1<V, T> b() {
        return this.f12768b;
    }
}
