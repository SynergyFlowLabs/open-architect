package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class jg<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f29779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final pj.n<Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit>, androidx.compose.runtime.c0, Integer, Unit> f29780b;

    /* JADX WARN: Multi-variable type inference failed */
    public jg(T t10, @NotNull pj.n<? super Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
        this.f29779a = t10;
        this.f29780b = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ jg d(jg jgVar, Object obj, pj.n nVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = jgVar.f29779a;
        }
        if ((i10 & 2) != 0) {
            nVar = jgVar.f29780b;
        }
        return jgVar.c(obj, nVar);
    }

    public final T a() {
        return this.f29779a;
    }

    @NotNull
    public final pj.n<Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit>, androidx.compose.runtime.c0, Integer, Unit> b() {
        return this.f29780b;
    }

    @NotNull
    public final jg<T> c(T t10, @NotNull pj.n<? super Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
        return new jg<>(t10, nVar);
    }

    public final T e() {
        return this.f29779a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jg)) {
            return false;
        }
        jg jgVar = (jg) obj;
        return Intrinsics.areEqual(this.f29779a, jgVar.f29779a) && Intrinsics.areEqual(this.f29780b, jgVar.f29780b);
    }

    @NotNull
    public final pj.n<Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit>, androidx.compose.runtime.c0, Integer, Unit> f() {
        return this.f29780b;
    }

    public int hashCode() {
        T t10 = this.f29779a;
        return ((t10 == null ? 0 : t10.hashCode()) * 31) + this.f29780b.hashCode();
    }

    @NotNull
    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f29779a + ", transition=" + this.f29780b + ')';
    }
}
