package androidx.compose.runtime.tooling;

import androidx.compose.runtime.i0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.p0;
import androidx.compose.runtime.v5;
import androidx.compose.runtime.w5;
import androidx.compose.runtime.z5;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nComposeStackTraceBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeStackTraceBuilder.kt\nandroidx/compose/runtime/tooling/ComposeStackTraceBuilderKt\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n1#1,311:1\n159#2,7:312\n159#2,7:319\n*S KotlinDebug\n*F\n+ 1 ComposeStackTraceBuilder.kt\nandroidx/compose/runtime/tooling/ComposeStackTraceBuilderKt\n*L\n260#1:312,7\n282#1:319,7\n*E\n"})
public final class b {
    @NotNull
    public static final List<c> a(@NotNull v5 v5Var) {
        if (v5Var.k() || v5Var.C() == 0) {
            return CollectionsKt.emptyList();
        }
        a0 a0Var = new a0(v5Var);
        int iZ = v5Var.z();
        Object objValueOf = Integer.valueOf(v5Var.D());
        while (iZ >= 0) {
            a0Var.f(v5Var.E().t0(iZ), objValueOf);
            objValueOf = v5Var.a(iZ);
            iZ = v5Var.X(iZ);
        }
        return a0Var.i();
    }

    @NotNull
    public static final List<c> b(@NotNull z5 z5Var, @Nullable Object obj, int i10, @Nullable Integer num) {
        int iV0;
        if (z5Var.e0() || z5Var.l0() == 0) {
            return CollectionsKt.emptyList();
        }
        e0 e0Var = new e0(z5Var);
        if (num != null) {
            iV0 = num.intValue();
        } else {
            iV0 = z5Var.k0() < 0 ? z5Var.V0(i10) : z5Var.k0();
        }
        if (obj == null) {
            obj = Integer.valueOf(z5Var.u0(i10));
        }
        while (i10 >= 0) {
            e0Var.f(z5Var.A1(i10), obj);
            obj = z5Var.C(i10);
            if (iV0 >= 0) {
                int i11 = iV0;
                iV0 = z5Var.V0(iV0);
                i10 = i11;
            } else {
                i10 = iV0;
            }
        }
        return e0Var.i();
    }

    public static /* synthetic */ List c(z5 z5Var, Object obj, int i10, Integer num, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = null;
        }
        if ((i11 & 2) != 0) {
            i10 = z5Var.h0();
        }
        if ((i11 & 4) != 0) {
            num = null;
        }
        return b(z5Var, obj, i10, num);
    }

    @Nullable
    public static final w d(@NotNull w5 w5Var, @NotNull Function1<Object, Boolean> function1) {
        v5 v5VarY = w5Var.Y();
        try {
            i1.f fVar = new i1.f();
            while (fVar.f312749a < w5Var.F()) {
                if (v5VarY.R(fVar.f312749a) && function1.invoke(v5VarY.T(fVar.f312749a)).booleanValue()) {
                    w wVar = new w(fVar.f312749a, null);
                    v5VarY.e();
                    return wVar;
                }
                int iE0 = v5VarY.e0(fVar.f312749a);
                for (int i10 = 0; i10 < iE0; i10++) {
                    if (function1.invoke(v5VarY.I(fVar.f312749a, i10)).booleanValue()) {
                        w wVar2 = new w(fVar.f312749a, Integer.valueOf(i10));
                        v5VarY.e();
                        return wVar2;
                    }
                }
                fVar.f312749a++;
            }
            Unit unit = Unit.f312394a;
            v5VarY.e();
            return null;
        } catch (Throwable th2) {
            v5VarY.e();
            throw th2;
        }
    }

    @Nullable
    public static final Integer e(@NotNull w5 w5Var, @NotNull p0 p0Var) {
        v5 v5VarY = w5Var.Y();
        try {
            return f(v5VarY, p0Var, 0, v5VarY.C());
        } finally {
            v5VarY.e();
        }
    }

    private static final Integer f(v5 v5Var, p0 p0Var, int i10, int i11) {
        Integer numF;
        while (true) {
            if (i10 >= i11) {
                return null;
            }
            int iM = v5Var.M(i10) + i10;
            if (v5Var.N(i10) && v5Var.J(i10) == 206 && Intrinsics.areEqual(v5Var.L(i10), m0.e0())) {
                Object objI = v5Var.I(i10, 0);
                i0.a aVar = objI instanceof i0.a ? (i0.a) objI : null;
                if (aVar != null && Intrinsics.areEqual(aVar.a(), p0Var)) {
                    return Integer.valueOf(i10);
                }
            }
            if (v5Var.f(i10) && (numF = f(v5Var, p0Var, i10 + 1, iM)) != null) {
                return Integer.valueOf(numF.intValue());
            }
            i10 = iM;
        }
    }

    @NotNull
    public static final List<c> g(@NotNull v5 v5Var, int i10, @Nullable Object obj) {
        a0 a0Var = new a0(v5Var);
        i10 = v5Var.X(i10);
        androidx.compose.runtime.g gVarA = v5Var.a(i10);
        while (i10 >= 0) {
            a0Var.f(v5Var.E().t0(i10), obj);
            if (i10 >= 0) {
                androidx.compose.runtime.g gVar = gVarA;
                gVarA = v5Var.a(i10);
                i10 = v5Var.X(i10);
                obj = gVar;
            } else {
                obj = gVarA;
            }
        }
        return a0Var.i();
    }
}
