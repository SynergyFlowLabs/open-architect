package androidx.compose.animation;

import androidx.compose.runtime.k7;
import androidx.compose.runtime.o2;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@o2
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f13493a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f13494b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final f0 f13495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final f0 f13496d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final f0 a() {
            return f0.f13496d;
        }

        @NotNull
        public final f0 b() {
            return f0.f13495c;
        }

        private a() {
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        j0 j0Var = null;
        k1 k1Var = null;
        u uVar = null;
        t0 t0Var = null;
        Map map = null;
        f13495c = new g0(new p1(j0Var, k1Var, uVar, t0Var, false, map, 63, defaultConstructorMarker));
        f13496d = new g0(new p1(j0Var, k1Var, uVar, t0Var, true, map, 47, defaultConstructorMarker));
    }

    public /* synthetic */ f0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract p1 c();

    @k7
    @NotNull
    public final f0 d(@NotNull f0 f0Var) {
        j0 j0VarK = f0Var.c().k();
        if (j0VarK == null) {
            j0VarK = c().k();
        }
        k1 k1VarN = f0Var.c().n();
        if (k1VarN == null) {
            k1VarN = c().n();
        }
        u uVarI = f0Var.c().i();
        if (uVarI == null) {
            uVarI = c().i();
        }
        t0 t0VarM = f0Var.c().m();
        if (t0VarM == null) {
            t0VarM = c().m();
        }
        return new g0(new p1(j0VarK, k1VarN, uVarI, t0VarM, f0Var.c().l() || c().l(), MapsKt.plus(c().j(), f0Var.c().j())));
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof f0) && Intrinsics.areEqual(((f0) obj).c(), c());
    }

    public int hashCode() {
        return c().hashCode();
    }

    @NotNull
    public String toString() {
        if (Intrinsics.areEqual(this, f13495c)) {
            return "ExitTransition.None";
        }
        if (Intrinsics.areEqual(this, f13496d)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        p1 p1VarC = c();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ExitTransition: \nFade - ");
        j0 j0VarK = p1VarC.k();
        sb2.append(j0VarK != null ? j0VarK.toString() : null);
        sb2.append(",\nSlide - ");
        k1 k1VarN = p1VarC.n();
        sb2.append(k1VarN != null ? k1VarN.toString() : null);
        sb2.append(",\nShrink - ");
        u uVarI = p1VarC.i();
        sb2.append(uVarI != null ? uVarI.toString() : null);
        sb2.append(",\nScale - ");
        t0 t0VarM = p1VarC.m();
        sb2.append(t0VarM != null ? t0VarM.toString() : null);
        sb2.append(",\nKeepUntilTransitionsFinished - ");
        sb2.append(p1VarC.l());
        return sb2.toString();
    }

    private f0() {
    }
}
