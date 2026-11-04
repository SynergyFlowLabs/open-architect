package androidx.compose.animation;

import androidx.compose.runtime.k7;
import androidx.compose.runtime.o2;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@o2
public abstract class d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f13417b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f13416a = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final d0 f13418c = new e0(new p1(null, null, null, null, false, null, 63, null));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final d0 a() {
            return d0.f13418c;
        }

        private a() {
        }
    }

    public /* synthetic */ d0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract p1 b();

    @k7
    @NotNull
    public final d0 c(@NotNull d0 d0Var) {
        j0 j0VarK = d0Var.b().k();
        if (j0VarK == null) {
            j0VarK = b().k();
        }
        k1 k1VarN = d0Var.b().n();
        if (k1VarN == null) {
            k1VarN = b().n();
        }
        u uVarI = d0Var.b().i();
        if (uVarI == null) {
            uVarI = b().i();
        }
        t0 t0VarM = d0Var.b().m();
        if (t0VarM == null) {
            t0VarM = b().m();
        }
        return new e0(new p1(j0VarK, k1VarN, uVarI, t0VarM, false, MapsKt.plus(b().j(), d0Var.b().j()), 16, null));
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof d0) && Intrinsics.areEqual(((d0) obj).b(), b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    @NotNull
    public String toString() {
        if (Intrinsics.areEqual(this, f13418c)) {
            return "EnterTransition.None";
        }
        p1 p1VarB = b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("EnterTransition: \nFade - ");
        j0 j0VarK = p1VarB.k();
        sb2.append(j0VarK != null ? j0VarK.toString() : null);
        sb2.append(",\nSlide - ");
        k1 k1VarN = p1VarB.n();
        sb2.append(k1VarN != null ? k1VarN.toString() : null);
        sb2.append(",\nShrink - ");
        u uVarI = p1VarB.i();
        sb2.append(uVarI != null ? uVarI.toString() : null);
        sb2.append(",\nScale - ");
        t0 t0VarM = p1VarB.m();
        sb2.append(t0VarM != null ? t0VarM.toString() : null);
        return sb2.toString();
    }

    private d0() {
    }
}
