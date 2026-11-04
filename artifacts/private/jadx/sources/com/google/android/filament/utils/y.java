package com.google.android.filament.utils;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nQuaternion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Quaternion.kt\ncom/google/android/filament/utils/QuaternionKt\n+ 2 Vector.kt\ncom/google/android/filament/utils/VectorKt\n+ 3 Quaternion.kt\ncom/google/android/filament/utils/Quaternion\n+ 4 Scalar.kt\ncom/google/android/filament/utils/ScalarKt\n*L\n1#1,509:1\n424#1:541\n426#1:542\n426#1:549\n426#1:551\n323#1:555\n622#2:510\n622#2:511\n622#2:512\n622#2:513\n622#2:514\n622#2:515\n622#2:516\n622#2:517\n622#2:518\n622#2:519\n622#2:520\n622#2:521\n622#2:522\n622#2:523\n622#2:524\n622#2:525\n622#2:526\n622#2:527\n622#2:528\n622#2:529\n622#2:530\n622#2:531\n622#2:532\n622#2:533\n622#2:534\n622#2:535\n622#2:536\n622#2:537\n622#2:538\n622#2:539\n622#2:540\n285#3,6:543\n265#3,2:552\n283#3:554\n283#3:556\n34#4:550\n*S KotlinDebug\n*F\n+ 1 Quaternion.kt\ncom/google/android/filament/utils/QuaternionKt\n*L\n432#1:541\n439#1:542\n449#1:549\n469#1:551\n492#1:555\n383#1:510\n384#1:511\n385#1:512\n386#1:513\n384#1:514\n385#1:515\n386#1:516\n390#1:517\n391#1:518\n392#1:519\n393#1:520\n390#1:521\n391#1:522\n392#1:523\n393#1:524\n397#1:525\n398#1:526\n399#1:527\n400#1:528\n397#1:529\n398#1:530\n399#1:531\n400#1:532\n404#1:533\n405#1:534\n406#1:535\n407#1:536\n404#1:537\n405#1:538\n406#1:539\n407#1:540\n444#1:543,6\n484#1:552,2\n484#1:554\n492#1:556\n449#1:550\n*E\n"})
public final class y {
    @NotNull
    public static final c A(@NotNull w a10, float f10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        return new c(a10.y() < f10, a10.B() < f10, a10.C() < f10, a10.x() < f10);
    }

    @NotNull
    public static final c B(@NotNull w a10, @NotNull w b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new c(a10.y() < b10.y(), a10.B() < b10.B(), a10.C() < b10.C(), a10.x() < b10.x());
    }

    @NotNull
    public static final c C(@NotNull w a10, float f10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        return new c(a10.y() <= f10, a10.B() <= f10, a10.C() <= f10, a10.x() <= f10);
    }

    @NotNull
    public static final c D(@NotNull w a10, @NotNull w b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new c(a10.y() <= b10.y(), a10.B() <= b10.B(), a10.C() <= b10.C(), a10.x() <= b10.x());
    }

    @NotNull
    public static final c E(@NotNull w wVar, float f10) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        int i10 = 4 | 0;
        return new c(wVar.y() < f10, wVar.B() < f10, wVar.C() < f10, wVar.x() < f10);
    }

    @NotNull
    public static final c F(@NotNull w wVar, @NotNull g b10) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new c(wVar.y() < b10.Q(), wVar.B() < b10.U(), wVar.C() < b10.V(), wVar.x() < b10.P());
    }

    @NotNull
    public static final c G(@NotNull w wVar, float f10) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        return new c(wVar.y() <= f10, wVar.B() <= f10, wVar.C() <= f10, wVar.x() <= f10);
    }

    @NotNull
    public static final c H(@NotNull w wVar, @NotNull g b10) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new c(wVar.y() <= b10.Q(), wVar.B() <= b10.U(), wVar.C() <= b10.V(), wVar.x() <= b10.P());
    }

    @NotNull
    public static final w I(float f10, @NotNull w q10) {
        Intrinsics.checkNotNullParameter(q10, "q");
        return new w(f10 - q10.y(), f10 - q10.B(), f10 - q10.C(), f10 - q10.x());
    }

    @NotNull
    public static final c J(@NotNull w wVar, float f10) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        return new c(!(wVar.y() == f10), !(wVar.B() == f10), !(wVar.C() == f10), !(wVar.x() == f10));
    }

    @NotNull
    public static final c K(@NotNull w wVar, @NotNull g b10) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        int i10 = 6 ^ 1;
        return new c(!(wVar.y() == b10.Q()), !(wVar.B() == b10.U()), !(wVar.C() == b10.V()), !(wVar.x() == b10.P()));
    }

    @NotNull
    public static final w L(@NotNull w a10, @NotNull w b10, float f10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return M(z(a10, b10, f10));
    }

    @NotNull
    public static final w M(@NotNull w q10) {
        Intrinsics.checkNotNullParameter(q10, "q");
        float fSqrt = 1.0f / ((float) Math.sqrt((((q10.y() * q10.y()) + (q10.B() * q10.B())) + (q10.C() * q10.C())) + (q10.x() * q10.x())));
        return new w(q10.y() * fSqrt, q10.B() * fSqrt, q10.C() * fSqrt, q10.x() * fSqrt);
    }

    @NotNull
    public static final c N(@NotNull w a10, float f10, float f11) {
        Intrinsics.checkNotNullParameter(a10, "a");
        return new c(!(Math.abs(a10.y() - f10) < f11), !(Math.abs(a10.B() - f10) < f11), !(Math.abs(a10.C() - f10) < f11), !(Math.abs(a10.x() - f10) < f11));
    }

    @NotNull
    public static final c O(@NotNull w a10, @NotNull w b10, float f10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        int i10 = 2 >> 0;
        return new c(!(Math.abs(a10.y() - b10.y()) < f10), !(Math.abs(a10.B() - b10.B()) < f10), !(Math.abs(a10.C() - b10.C()) < f10), !(Math.abs(a10.x() - b10.x()) < f10));
    }

    public static /* synthetic */ c P(w a10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(a10, "a");
        return new c(!(Math.abs(a10.y() - f10) < f11), !(Math.abs(a10.B() - f10) < f11), !(Math.abs(a10.C() - f10) < f11), !(Math.abs(a10.x() - f10) < f11));
    }

    public static /* synthetic */ c Q(w a10, w b10, float f10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f10 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new c(!(Math.abs(a10.y() - b10.y()) < f10), !(Math.abs(a10.B() - b10.B()) < f10), !(Math.abs(a10.C() - b10.C()) < f10), !(Math.abs(a10.x() - b10.x()) < f10));
    }

    @NotNull
    public static final w R(float f10, @NotNull w q10) {
        Intrinsics.checkNotNullParameter(q10, "q");
        return new w(q10.y() + f10, q10.B() + f10, q10.C() + f10, f10 + q10.x());
    }

    @NotNull
    public static final w S(@NotNull w a10, @NotNull w b10, float f10, float f11) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        float fY = (a10.y() * b10.y()) + (a10.B() * b10.B()) + (a10.C() * b10.C()) + (a10.x() * b10.x());
        if (fY < 0.0f) {
            fY = -fY;
            b10 = b10.f0();
        }
        if (fY >= f11) {
            return L(a10, b10, f10);
        }
        float fAcos = (float) Math.acos(fY);
        float fSin = (float) Math.sin(fAcos);
        float fSin2 = (float) Math.sin((1.0f - f10) * fAcos);
        w wVar = new w(a10.y() * fSin2, a10.B() * fSin2, a10.C() * fSin2, a10.x() * fSin2);
        w wVar2 = new w(wVar.y() / fSin, wVar.B() / fSin, wVar.C() / fSin, wVar.x() / fSin);
        float fSin3 = (float) Math.sin(f10 * fAcos);
        w wVar3 = new w(b10.y() * fSin3, b10.B() * fSin3, b10.C() * fSin3, b10.x() * fSin3);
        w wVar4 = new w(wVar3.y() / fSin, wVar3.B() / fSin, wVar3.C() / fSin, wVar3.x() / fSin);
        return new w(wVar2.y() + wVar4.y(), wVar2.B() + wVar4.B(), wVar2.C() + wVar4.C(), wVar2.x() + wVar4.x());
    }

    public static /* synthetic */ w T(w wVar, w wVar2, float f10, float f11, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            f11 = 0.9995f;
        }
        return S(wVar, wVar2, f10, f11);
    }

    @NotNull
    public static final w U(float f10, @NotNull w q10) {
        Intrinsics.checkNotNullParameter(q10, "q");
        return new w(q10.y() * f10, q10.B() * f10, q10.C() * f10, f10 * q10.x());
    }

    @NotNull
    public static final w a(@NotNull w q10) {
        Intrinsics.checkNotNullParameter(q10, "q");
        return new w(Math.abs(q10.y()), Math.abs(q10.B()), Math.abs(q10.C()), Math.abs(q10.x()));
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0041 A[PHI: r4
      0x0041: PHI (r4v10 float) = (r4v3 float), (r4v4 float) binds: [B:3:0x003f, B:6:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    public static final float b(@NotNull w a10, @NotNull w b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        float fY = (a10.y() * b10.y()) + (a10.B() * b10.B()) + (a10.C() * b10.C()) + (a10.x() * b10.x());
        float f10 = -1.0f;
        if (fY < -1.0f) {
            fY = f10;
        } else {
            f10 = 1.0f;
            if (fY > 1.0f) {
                fY = f10;
            }
        }
        return ((float) Math.acos(Math.abs(fY))) * 2.0f;
    }

    @NotNull
    public static final w c(@NotNull w q10) {
        Intrinsics.checkNotNullParameter(q10, "q");
        return new w(-q10.y(), -q10.B(), -q10.C(), q10.x());
    }

    @NotNull
    public static final w d(@NotNull w a10, @NotNull w b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        w wVar = new w((((a10.x() * b10.y()) + (a10.y() * b10.x())) + (a10.B() * b10.C())) - (a10.C() * b10.B()), ((a10.x() * b10.B()) - (a10.y() * b10.C())) + (a10.B() * b10.x()) + (a10.C() * b10.y()), (((a10.x() * b10.C()) + (a10.y() * b10.B())) - (a10.B() * b10.y())) + (a10.C() * b10.x()), (((a10.x() * b10.x()) - (a10.y() * b10.y())) - (a10.B() * b10.B())) - (a10.C() * b10.C()));
        return new w(wVar.y(), wVar.B(), wVar.C(), 0.0f);
    }

    @NotNull
    public static final w e(float f10, @NotNull w q10) {
        Intrinsics.checkNotNullParameter(q10, "q");
        return new w(f10 / q10.y(), f10 / q10.B(), f10 / q10.C(), f10 / q10.x());
    }

    public static final float f(@NotNull w a10, @NotNull w b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return (a10.y() * b10.y()) + (a10.B() * b10.B()) + (a10.C() * b10.C()) + (a10.x() * b10.x());
    }

    @NotNull
    public static final c g(@NotNull w wVar, float f10) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        return new c(wVar.y() == f10, wVar.B() == f10, wVar.C() == f10, wVar.x() == f10);
    }

    @NotNull
    public static final c h(@NotNull w wVar, @NotNull g b10) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new c(wVar.y() == b10.Q(), wVar.B() == b10.U(), wVar.C() == b10.V(), wVar.x() == b10.P());
    }

    @NotNull
    public static final c i(@NotNull w a10, float f10, float f11) {
        Intrinsics.checkNotNullParameter(a10, "a");
        int i10 = 3 << 1;
        return new c(Math.abs(a10.y() - f10) < f11, Math.abs(a10.B() - f10) < f11, Math.abs(a10.C() - f10) < f11, Math.abs(a10.x() - f10) < f11);
    }

    @NotNull
    public static final c j(@NotNull w a10, @NotNull w b10, float f10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new c(Math.abs(a10.y() - b10.y()) < f10, Math.abs(a10.B() - b10.B()) < f10, Math.abs(a10.C() - b10.C()) < f10, Math.abs(a10.x() - b10.x()) < f10);
    }

    public static /* synthetic */ c k(w a10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(a10, "a");
        return new c(Math.abs(a10.y() - f10) < f11, Math.abs(a10.B() - f10) < f11, Math.abs(a10.C() - f10) < f11, Math.abs(a10.x() - f10) < f11);
    }

    public static /* synthetic */ c l(w a10, w b10, float f10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f10 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new c(Math.abs(a10.y() - b10.y()) < f10, Math.abs(a10.B() - b10.B()) < f10, Math.abs(a10.C() - b10.C()) < f10, Math.abs(a10.x() - b10.x()) < f10);
    }

    @NotNull
    public static final f m(@NotNull w q10, @NotNull c0 order) {
        Intrinsics.checkNotNullParameter(q10, "q");
        Intrinsics.checkNotNullParameter(order, "order");
        return s.m(s.O(q10), order);
    }

    public static /* synthetic */ f n(w wVar, c0 c0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            c0Var = c0.f104828i;
        }
        return m(wVar, c0Var);
    }

    @NotNull
    public static final c o(@NotNull w a10, float f10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        return new c(a10.y() > f10, a10.B() > f10, a10.C() > f10, a10.x() > f10);
    }

    @NotNull
    public static final c p(@NotNull w a10, @NotNull w b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new c(a10.y() > b10.B(), a10.B() > b10.B(), a10.C() > b10.C(), a10.x() > b10.x());
    }

    @NotNull
    public static final c q(@NotNull w a10, float f10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        return new c(a10.y() >= f10, a10.B() >= f10, a10.C() >= f10, a10.x() >= f10);
    }

    @NotNull
    public static final c r(@NotNull w a10, @NotNull w b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new c(a10.y() >= b10.y(), a10.B() >= b10.B(), a10.C() >= b10.C(), a10.x() >= b10.x());
    }

    @NotNull
    public static final c s(@NotNull w wVar, float f10) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        return new c(wVar.y() > f10, wVar.B() > f10, wVar.C() > f10, wVar.x() > f10);
    }

    @NotNull
    public static final c t(@NotNull w wVar, @NotNull g b10) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new c(wVar.y() > b10.Q(), wVar.B() > b10.U(), wVar.C() > b10.V(), wVar.x() > b10.P());
    }

    @NotNull
    public static final c u(@NotNull w wVar, float f10) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        return new c(wVar.y() >= f10, wVar.B() >= f10, wVar.C() >= f10, wVar.x() >= f10);
    }

    @NotNull
    public static final c v(@NotNull w wVar, @NotNull g b10) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new c(wVar.y() >= b10.Q(), wVar.B() >= b10.U(), wVar.C() >= b10.V(), wVar.x() >= b10.P());
    }

    @NotNull
    public static final w w(@NotNull w q10) {
        Intrinsics.checkNotNullParameter(q10, "q");
        float fY = 1.0f / ((((q10.y() * q10.y()) + (q10.B() * q10.B())) + (q10.C() * q10.C())) + (q10.x() * q10.x()));
        return new w((-q10.y()) * fY, (-q10.B()) * fY, (-q10.C()) * fY, q10.x() * fY);
    }

    public static final float x(@NotNull w q10) {
        Intrinsics.checkNotNullParameter(q10, "q");
        return (float) Math.sqrt((q10.y() * q10.y()) + (q10.B() * q10.B()) + (q10.C() * q10.C()) + (q10.x() * q10.x()));
    }

    public static final float y(@NotNull w q10) {
        Intrinsics.checkNotNullParameter(q10, "q");
        return (q10.y() * q10.y()) + (q10.B() * q10.B()) + (q10.C() * q10.C()) + (q10.x() * q10.x());
    }

    @NotNull
    public static final w z(@NotNull w a10, @NotNull w b10, float f10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        float f11 = 1.0f - f10;
        w wVar = new w(a10.y() * f11, a10.B() * f11, a10.C() * f11, f11 * a10.x());
        w wVar2 = new w(b10.y() * f10, b10.B() * f10, b10.C() * f10, f10 * b10.x());
        return new w(wVar.y() + wVar2.y(), wVar.B() + wVar2.B(), wVar.C() + wVar2.C(), wVar.x() + wVar2.x());
    }
}
