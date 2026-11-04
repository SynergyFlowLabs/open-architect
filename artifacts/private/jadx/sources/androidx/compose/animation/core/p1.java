package androidx.compose.animation.core;

import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public abstract class p1<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f13223c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f13224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private l0 f13225b;

    public /* synthetic */ p1(Object obj, l0 l0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, l0Var);
    }

    @NotNull
    public final l0 a() {
        return this.f13225b;
    }

    public final T b() {
        return this.f13224a;
    }

    public final void c(@NotNull l0 l0Var) {
        this.f13225b = l0Var;
    }

    @NotNull
    public final <V extends w> Pair<V, l0> d(@NotNull Function1<? super T, ? extends V> function1) {
        return TuplesKt.to(function1.invoke(this.f13224a), this.f13225b);
    }

    private p1(T t10, l0 l0Var) {
        this.f13224a = t10;
        this.f13225b = l0Var;
    }
}
