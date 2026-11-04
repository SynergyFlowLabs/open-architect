package androidx.compose.ui.text;

import androidx.compose.runtime.k7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nParagraphStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParagraphStyle.kt\nandroidx/compose/ui/text/ParagraphStyleKt\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n1#1,531:1\n252#2:532\n247#2,6:533\n252#2:539\n*S KotlinDebug\n*F\n+ 1 ParagraphStyle.kt\nandroidx/compose/ui/text/ParagraphStyleKt\n*L\n465#1:532\n492#1:533,6\n507#1:539\n*E\n"})
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f42283a = androidx.compose.ui.unit.z.f42728b.b();

    @NotNull
    public static final t0 a(@NotNull t0 t0Var, int i10, int i11, long j10, @Nullable androidx.compose.ui.text.style.s sVar, @Nullable x0 x0Var, @Nullable androidx.compose.ui.text.style.h hVar, int i12, int i13, @Nullable androidx.compose.ui.text.style.u uVar) {
        long j11;
        long j12;
        int iV = i10;
        androidx.compose.ui.text.style.s sVarZ = sVar;
        androidx.compose.ui.text.style.j.a aVar = androidx.compose.ui.text.style.j.f42206b;
        if (androidx.compose.ui.text.style.j.k(iV, aVar.g()) || androidx.compose.ui.text.style.j.k(iV, t0Var.v())) {
            if (androidx.compose.ui.unit.z.l(j10) == 0) {
                j11 = 0;
                j12 = j10;
            } else {
                j11 = 0;
                j12 = j10;
                if (androidx.compose.ui.unit.z.j(j12, t0Var.q())) {
                }
            }
            if ((sVarZ == null || Intrinsics.areEqual(sVarZ, t0Var.z())) && ((androidx.compose.ui.text.style.l.j(i11, androidx.compose.ui.text.style.l.f42221b.f()) || androidx.compose.ui.text.style.l.j(i11, t0Var.y())) && ((x0Var == null || Intrinsics.areEqual(x0Var, t0Var.s())) && ((hVar == null || Intrinsics.areEqual(hVar, t0Var.r())) && ((androidx.compose.ui.text.style.f.k(i12, androidx.compose.ui.text.style.f.f42154b.g()) || androidx.compose.ui.text.style.f.k(i12, t0Var.p())) && ((androidx.compose.ui.text.style.e.g(i13, androidx.compose.ui.text.style.e.f42149b.c()) || androidx.compose.ui.text.style.e.g(i13, t0Var.m())) && (uVar == null || Intrinsics.areEqual(uVar, t0Var.A())))))))) {
                return t0Var;
            }
        } else {
            j11 = 0;
            j12 = j10;
        }
        long jQ = androidx.compose.ui.unit.z.l(j12) == j11 ? t0Var.q() : j12;
        if (sVarZ == null) {
            sVarZ = t0Var.z();
        }
        androidx.compose.ui.text.style.s sVar2 = sVarZ;
        if (androidx.compose.ui.text.style.j.k(iV, aVar.g())) {
            iV = t0Var.v();
        }
        return new t0(iV, !androidx.compose.ui.text.style.l.j(i11, androidx.compose.ui.text.style.l.f42221b.f()) ? i11 : t0Var.y(), jQ, sVar2, d(t0Var, x0Var), hVar == null ? t0Var.r() : hVar, !androidx.compose.ui.text.style.f.k(i12, androidx.compose.ui.text.style.f.f42154b.g()) ? i12 : t0Var.p(), !androidx.compose.ui.text.style.e.g(i13, androidx.compose.ui.text.style.e.f42149b.c()) ? i13 : t0Var.m(), uVar == null ? t0Var.A() : uVar, (DefaultConstructorMarker) null);
    }

    @k7
    @NotNull
    public static final t0 b(@NotNull t0 t0Var, @NotNull t0 t0Var2, float f10) {
        int iN = ((androidx.compose.ui.text.style.j) e3.d(androidx.compose.ui.text.style.j.h(t0Var.v()), androidx.compose.ui.text.style.j.h(t0Var2.v()), f10)).n();
        int iM = ((androidx.compose.ui.text.style.l) e3.d(androidx.compose.ui.text.style.l.g(t0Var.y()), androidx.compose.ui.text.style.l.g(t0Var2.y()), f10)).m();
        long jF = e3.f(t0Var.q(), t0Var2.q(), f10);
        androidx.compose.ui.text.style.s sVarZ = t0Var.z();
        if (sVarZ == null) {
            sVarZ = androidx.compose.ui.text.style.s.f42240c.a();
        }
        androidx.compose.ui.text.style.s sVarZ2 = t0Var2.z();
        if (sVarZ2 == null) {
            sVarZ2 = androidx.compose.ui.text.style.s.f42240c.a();
        }
        return new t0(iN, iM, jF, androidx.compose.ui.text.style.t.a(sVarZ, sVarZ2, f10), c(t0Var.s(), t0Var2.s(), f10), (androidx.compose.ui.text.style.h) e3.d(t0Var.r(), t0Var2.r(), f10), ((androidx.compose.ui.text.style.f) e3.d(androidx.compose.ui.text.style.f.e(t0Var.p()), androidx.compose.ui.text.style.f.e(t0Var2.p()), f10)).q(), ((androidx.compose.ui.text.style.e) e3.d(androidx.compose.ui.text.style.e.d(t0Var.m()), androidx.compose.ui.text.style.e.d(t0Var2.m()), f10)).j(), (androidx.compose.ui.text.style.u) e3.d(t0Var.A(), t0Var2.A(), f10), (DefaultConstructorMarker) null);
    }

    private static final x0 c(x0 x0Var, x0 x0Var2, float f10) {
        if (x0Var == null && x0Var2 == null) {
            return null;
        }
        if (x0Var == null) {
            x0Var = x0.f42336c.a();
        }
        if (x0Var2 == null) {
            x0Var2 = x0.f42336c.a();
        }
        return e.b(x0Var, x0Var2, f10);
    }

    private static final x0 d(t0 t0Var, x0 x0Var) {
        if (t0Var.s() == null) {
            return x0Var;
        }
        return x0Var == null ? t0Var.s() : t0Var.s().e(x0Var);
    }

    @NotNull
    public static final t0 e(@NotNull t0 t0Var, @NotNull androidx.compose.ui.unit.w wVar) {
        int iV = t0Var.v();
        androidx.compose.ui.text.style.j.a aVar = androidx.compose.ui.text.style.j.f42206b;
        int iF = androidx.compose.ui.text.style.j.k(iV, aVar.g()) ? aVar.f() : t0Var.v();
        int iE = z3.e(wVar, t0Var.y());
        long jQ = androidx.compose.ui.unit.z.l(t0Var.q()) == 0 ? f42283a : t0Var.q();
        androidx.compose.ui.text.style.s sVarZ = t0Var.z();
        if (sVarZ == null) {
            sVarZ = androidx.compose.ui.text.style.s.f42240c.a();
        }
        androidx.compose.ui.text.style.s sVar = sVarZ;
        x0 x0VarS = t0Var.s();
        androidx.compose.ui.text.style.h hVarR = t0Var.r();
        int iP = t0Var.p();
        androidx.compose.ui.text.style.f.a aVar2 = androidx.compose.ui.text.style.f.f42154b;
        int iE2 = androidx.compose.ui.text.style.f.k(iP, aVar2.g()) ? aVar2.e() : t0Var.p();
        int iM = t0Var.m();
        androidx.compose.ui.text.style.e.a aVar3 = androidx.compose.ui.text.style.e.f42149b;
        int iB = androidx.compose.ui.text.style.e.g(iM, aVar3.c()) ? aVar3.b() : t0Var.m();
        androidx.compose.ui.text.style.u uVarA = t0Var.A();
        if (uVarA == null) {
            uVarA = androidx.compose.ui.text.style.u.f42245c.b();
        }
        return new t0(iF, iE, jQ, sVar, x0VarS, hVarR, iE2, iB, uVarA, (DefaultConstructorMarker) null);
    }
}
