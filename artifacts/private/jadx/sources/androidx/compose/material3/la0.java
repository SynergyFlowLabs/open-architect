package androidx.compose.material3;

import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class la0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.m4<ja0> f30325a = androidx.compose.runtime.a1.m(new Function0() { // from class: androidx.compose.material3.ka0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return la0.b();
        }
    });

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30326a;

        static {
            int[] iArr = new int[d0.f3.values().length];
            try {
                iArr[d0.f3.DisplayLarge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d0.f3.DisplayMedium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d0.f3.DisplaySmall.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d0.f3.HeadlineLarge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d0.f3.HeadlineMedium.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[d0.f3.HeadlineSmall.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[d0.f3.TitleLarge.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[d0.f3.TitleMedium.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[d0.f3.TitleSmall.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[d0.f3.BodyLarge.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[d0.f3.BodyMedium.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[d0.f3.BodySmall.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[d0.f3.LabelLarge.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[d0.f3.LabelMedium.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[d0.f3.LabelSmall.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[d0.f3.DisplayLargeEmphasized.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[d0.f3.DisplayMediumEmphasized.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[d0.f3.DisplaySmallEmphasized.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[d0.f3.HeadlineLargeEmphasized.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[d0.f3.HeadlineMediumEmphasized.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[d0.f3.HeadlineSmallEmphasized.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[d0.f3.TitleLargeEmphasized.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[d0.f3.TitleMediumEmphasized.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[d0.f3.TitleSmallEmphasized.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[d0.f3.BodyLargeEmphasized.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[d0.f3.BodyMediumEmphasized.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[d0.f3.BodySmallEmphasized.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[d0.f3.LabelLargeEmphasized.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[d0.f3.LabelMediumEmphasized.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[d0.f3.LabelSmallEmphasized.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            f30326a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ja0 b() {
        return new ja0(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    @NotNull
    public static final androidx.compose.ui.text.y3 c(@NotNull ja0 ja0Var, @NotNull d0.f3 f3Var) {
        switch (a.f30326a[f3Var.ordinal()]) {
            case 1:
                return ja0Var.k();
            case 2:
                return ja0Var.m();
            case 3:
                return ja0Var.o();
            case 4:
                return ja0Var.q();
            case 5:
                return ja0Var.s();
            case 6:
                return ja0Var.u();
            case 7:
                return ja0Var.C();
            case 8:
                return ja0Var.E();
            case 9:
                return ja0Var.G();
            case 10:
                return ja0Var.e();
            case 11:
                return ja0Var.g();
            case 12:
                return ja0Var.i();
            case 13:
                return ja0Var.w();
            case 14:
                return ja0Var.y();
            case 15:
                return ja0Var.A();
            case 16:
                return ja0Var.l();
            case 17:
                return ja0Var.n();
            case 18:
                return ja0Var.p();
            case 19:
                return ja0Var.r();
            case 20:
                return ja0Var.t();
            case 21:
                return ja0Var.v();
            case 22:
                return ja0Var.D();
            case 23:
                return ja0Var.F();
            case 24:
                return ja0Var.H();
            case 25:
                return ja0Var.f();
            case 26:
                return ja0Var.h();
            case 27:
                return ja0Var.j();
            case 28:
                return ja0Var.x();
            case 29:
                return ja0Var.z();
            case 30:
                return ja0Var.B();
            default:
                throw new kotlin.k0();
        }
    }

    @NotNull
    public static final androidx.compose.runtime.m4<ja0> d() {
        return f30325a;
    }

    @NotNull
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p4
    @oj.i(name = "getValue")
    public static final androidx.compose.ui.text.y3 e(@NotNull d0.f3 f3Var, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1049072145, i10, -1, "androidx.compose.material3.<get-value> (Typography.kt:524)");
        }
        androidx.compose.ui.text.y3 y3VarC = c(pj.f31758a.e(c0Var, 6), f3Var);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return y3VarC;
    }
}
