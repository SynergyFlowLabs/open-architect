package androidx.compose.animation;

import androidx.compose.runtime.o2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@o2
public final class k1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f13652c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.unit.u, androidx.compose.ui.unit.q> f13653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.y0<androidx.compose.ui.unit.q> f13654b;

    /* JADX WARN: Multi-variable type inference failed */
    public k1(@NotNull Function1<? super androidx.compose.ui.unit.u, androidx.compose.ui.unit.q> function1, @NotNull androidx.compose.animation.core.y0<androidx.compose.ui.unit.q> y0Var) {
        this.f13653a = function1;
        this.f13654b = y0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ k1 d(k1 k1Var, Function1 function1, androidx.compose.animation.core.y0 y0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = k1Var.f13653a;
        }
        if ((i10 & 2) != 0) {
            y0Var = k1Var.f13654b;
        }
        return k1Var.c(function1, y0Var);
    }

    @NotNull
    public final Function1<androidx.compose.ui.unit.u, androidx.compose.ui.unit.q> a() {
        return this.f13653a;
    }

    @NotNull
    public final androidx.compose.animation.core.y0<androidx.compose.ui.unit.q> b() {
        return this.f13654b;
    }

    @NotNull
    public final k1 c(@NotNull Function1<? super androidx.compose.ui.unit.u, androidx.compose.ui.unit.q> function1, @NotNull androidx.compose.animation.core.y0<androidx.compose.ui.unit.q> y0Var) {
        return new k1(function1, y0Var);
    }

    @NotNull
    public final androidx.compose.animation.core.y0<androidx.compose.ui.unit.q> e() {
        return this.f13654b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return Intrinsics.areEqual(this.f13653a, k1Var.f13653a) && Intrinsics.areEqual(this.f13654b, k1Var.f13654b);
    }

    @NotNull
    public final Function1<androidx.compose.ui.unit.u, androidx.compose.ui.unit.q> f() {
        return this.f13653a;
    }

    public int hashCode() {
        return (this.f13653a.hashCode() * 31) + this.f13654b.hashCode();
    }

    @NotNull
    public String toString() {
        return "Slide(slideOffset=" + this.f13653a + ", animationSpec=" + this.f13654b + ')';
    }
}
