package androidx.compose.material;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class r8<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f24629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final pj.n<Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit>, androidx.compose.runtime.c0, Integer, Unit> f24630b;

    /* JADX WARN: Multi-variable type inference failed */
    public r8(T t10, @NotNull pj.n<? super Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
        this.f24629a = t10;
        this.f24630b = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ r8 d(r8 r8Var, Object obj, pj.n nVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = r8Var.f24629a;
        }
        if ((i10 & 2) != 0) {
            nVar = r8Var.f24630b;
        }
        return r8Var.c(obj, nVar);
    }

    public final T a() {
        return this.f24629a;
    }

    @NotNull
    public final pj.n<Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit>, androidx.compose.runtime.c0, Integer, Unit> b() {
        return this.f24630b;
    }

    @NotNull
    public final r8<T> c(T t10, @NotNull pj.n<? super Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
        return new r8<>(t10, nVar);
    }

    public final T e() {
        return this.f24629a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8)) {
            return false;
        }
        r8 r8Var = (r8) obj;
        return Intrinsics.areEqual(this.f24629a, r8Var.f24629a) && Intrinsics.areEqual(this.f24630b, r8Var.f24630b);
    }

    @NotNull
    public final pj.n<Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit>, androidx.compose.runtime.c0, Integer, Unit> f() {
        return this.f24630b;
    }

    public int hashCode() {
        T t10 = this.f24629a;
        return ((t10 == null ? 0 : t10.hashCode()) * 31) + this.f24630b.hashCode();
    }

    @NotNull
    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f24629a + ", transition=" + this.f24630b + ')';
    }
}
