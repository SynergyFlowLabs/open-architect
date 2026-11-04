package androidx.compose.animation.core;

import androidx.compose.animation.core.w;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class c5<V extends w> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f12857d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final V f12858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final l0 f12859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f12860c;

    public /* synthetic */ c5(w wVar, l0 l0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(wVar, l0Var, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ c5 e(c5 c5Var, w wVar, l0 l0Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            wVar = c5Var.f12858a;
        }
        if ((i11 & 2) != 0) {
            l0Var = c5Var.f12859b;
        }
        if ((i11 & 4) != 0) {
            i10 = c5Var.f12860c;
        }
        return c5Var.d(wVar, l0Var, i10);
    }

    @NotNull
    public final V a() {
        return this.f12858a;
    }

    @NotNull
    public final l0 b() {
        return this.f12859b;
    }

    public final int c() {
        return this.f12860c;
    }

    @NotNull
    public final c5<V> d(@NotNull V v10, @NotNull l0 l0Var, int i10) {
        return new c5<>(v10, l0Var, i10, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5)) {
            return false;
        }
        c5 c5Var = (c5) obj;
        return Intrinsics.areEqual(this.f12858a, c5Var.f12858a) && Intrinsics.areEqual(this.f12859b, c5Var.f12859b) && a0.g(this.f12860c, c5Var.f12860c);
    }

    public final int f() {
        return this.f12860c;
    }

    @NotNull
    public final l0 g() {
        return this.f12859b;
    }

    @NotNull
    public final V h() {
        return this.f12858a;
    }

    public int hashCode() {
        return (((this.f12858a.hashCode() * 31) + this.f12859b.hashCode()) * 31) + a0.h(this.f12860c);
    }

    @NotNull
    public String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f12858a + ", easing=" + this.f12859b + ", arcMode=" + ((Object) a0.i(this.f12860c)) + ')';
    }

    private c5(V v10, l0 l0Var, int i10) {
        this.f12858a = v10;
        this.f12859b = l0Var;
        this.f12860c = i10;
    }
}
