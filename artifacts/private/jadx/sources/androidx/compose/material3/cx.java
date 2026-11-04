package androidx.compose.material3;

import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class cx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.m4<ax> f26932a = androidx.compose.runtime.a1.m(new Function0() { // from class: androidx.compose.material3.bx
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return cx.b();
        }
    });

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26933a;

        static {
            int[] iArr = new int[d0.j2.values().length];
            try {
                iArr[d0.j2.CornerExtraLarge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d0.j2.CornerExtraLargeIncreased.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d0.j2.CornerExtraExtraLarge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d0.j2.CornerExtraLargeTop.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d0.j2.CornerExtraSmall.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[d0.j2.CornerExtraSmallTop.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[d0.j2.CornerFull.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[d0.j2.CornerLarge.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[d0.j2.CornerLargeIncreased.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[d0.j2.CornerLargeEnd.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[d0.j2.CornerLargeTop.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[d0.j2.CornerMedium.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[d0.j2.CornerNone.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[d0.j2.CornerSmall.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[d0.j2.CornerLargeStart.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            f26933a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ax b() {
        return new ax(null, null, null, null, null, 31, null);
    }

    @NotNull
    public static final androidx.compose.foundation.shape.e c(@NotNull androidx.compose.foundation.shape.e eVar, @NotNull androidx.compose.foundation.shape.f fVar) {
        return androidx.compose.foundation.shape.e.c(eVar, fVar, fVar, null, null, 12, null);
    }

    public static /* synthetic */ androidx.compose.foundation.shape.e d(androidx.compose.foundation.shape.e eVar, androidx.compose.foundation.shape.f fVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = yw.f34847a.i();
        }
        return c(eVar, fVar);
    }

    @NotNull
    public static final androidx.compose.foundation.shape.e e(@NotNull androidx.compose.foundation.shape.e eVar, @NotNull androidx.compose.foundation.shape.f fVar) {
        return androidx.compose.foundation.shape.e.c(eVar, fVar, null, null, fVar, 6, null);
    }

    public static /* synthetic */ androidx.compose.foundation.shape.e f(androidx.compose.foundation.shape.e eVar, androidx.compose.foundation.shape.f fVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = yw.f34847a.i();
        }
        return e(eVar, fVar);
    }

    @NotNull
    public static final androidx.compose.ui.graphics.q3 g(@NotNull ax axVar, @NotNull d0.j2 j2Var) {
        switch (a.f26933a[j2Var.ordinal()]) {
            case 1:
                return axVar.g();
            case 2:
                return axVar.h();
            case 3:
                return axVar.f();
            case 4:
                return m(axVar.g(), null, 1, null);
            case 5:
                return axVar.i();
            case 6:
                return m(axVar.i(), null, 1, null);
            case 7:
                return androidx.compose.foundation.shape.o.k();
            case 8:
                return axVar.j();
            case 9:
                return axVar.k();
            case 10:
                return f(axVar.j(), null, 1, null);
            case 11:
                return m(axVar.j(), null, 1, null);
            case 12:
                return axVar.l();
            case 13:
                return androidx.compose.ui.graphics.d3.a();
            case 14:
                return axVar.m();
            case 15:
                return k(axVar.j(), null, 1, null);
            default:
                throw new kotlin.k0();
        }
    }

    @NotNull
    public static final androidx.compose.runtime.m4<ax> h() {
        return f26932a;
    }

    @NotNull
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p4
    @oj.i(name = "getValue")
    public static final androidx.compose.ui.graphics.q3 i(@NotNull d0.j2 j2Var, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1629172543, i10, -1, "androidx.compose.material3.<get-value> (Shapes.kt:358)");
        }
        androidx.compose.ui.graphics.q3 q3VarG = g(pj.f31758a.d(c0Var, 6), j2Var);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return q3VarG;
    }

    @NotNull
    public static final androidx.compose.foundation.shape.e j(@NotNull androidx.compose.foundation.shape.e eVar, @NotNull androidx.compose.foundation.shape.f fVar) {
        return androidx.compose.foundation.shape.e.c(eVar, null, fVar, fVar, null, 9, null);
    }

    public static /* synthetic */ androidx.compose.foundation.shape.e k(androidx.compose.foundation.shape.e eVar, androidx.compose.foundation.shape.f fVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = yw.f34847a.i();
        }
        return j(eVar, fVar);
    }

    @NotNull
    public static final androidx.compose.foundation.shape.e l(@NotNull androidx.compose.foundation.shape.e eVar, @NotNull androidx.compose.foundation.shape.f fVar) {
        return androidx.compose.foundation.shape.e.c(eVar, null, null, fVar, fVar, 3, null);
    }

    public static /* synthetic */ androidx.compose.foundation.shape.e m(androidx.compose.foundation.shape.e eVar, androidx.compose.foundation.shape.f fVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = yw.f34847a.i();
        }
        return l(eVar, fVar);
    }
}
