package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.n3;
import androidx.compose.runtime.w6;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
public final class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n3<Unit> f17489a;

    private /* synthetic */ n2(n3 n3Var) {
        this.f17489a = n3Var;
    }

    public static final void a(n3<Unit> n3Var) {
        n3Var.getValue();
    }

    public static final /* synthetic */ n2 b(n3 n3Var) {
        return new n2(n3Var);
    }

    @NotNull
    public static n3<Unit> c(@NotNull n3<Unit> n3Var) {
        return n3Var;
    }

    public static /* synthetic */ n3 d(n3 n3Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            n3Var = w6.k(Unit.f312394a, w6.o());
        }
        return c(n3Var);
    }

    public static boolean e(n3<Unit> n3Var, Object obj) {
        return (obj instanceof n2) && Intrinsics.areEqual(n3Var, ((n2) obj).j());
    }

    public static final boolean f(n3<Unit> n3Var, n3<Unit> n3Var2) {
        return Intrinsics.areEqual(n3Var, n3Var2);
    }

    public static int g(n3<Unit> n3Var) {
        return n3Var.hashCode();
    }

    public static final void h(n3<Unit> n3Var) {
        n3Var.setValue(Unit.f312394a);
    }

    public static String i(n3<Unit> n3Var) {
        return "ObservableScopeInvalidator(state=" + n3Var + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f17489a, obj);
    }

    public int hashCode() {
        return g(this.f17489a);
    }

    public final /* synthetic */ n3 j() {
        return this.f17489a;
    }

    public String toString() {
        return i(this.f17489a);
    }
}
