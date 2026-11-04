package androidx.compose.ui.graphics;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0283a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37520a;

        static {
            int[] iArr = new int[BlendMode.values().length];
            try {
                iArr[BlendMode.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlendMode.SRC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BlendMode.DST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BlendMode.SRC_OVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BlendMode.DST_OVER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BlendMode.SRC_IN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BlendMode.DST_IN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BlendMode.SRC_OUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BlendMode.DST_OUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BlendMode.SRC_ATOP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BlendMode.DST_ATOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BlendMode.XOR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BlendMode.PLUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[BlendMode.MODULATE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[BlendMode.SCREEN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[BlendMode.OVERLAY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[BlendMode.DARKEN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[BlendMode.LIGHTEN.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[BlendMode.COLOR_DODGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[BlendMode.COLOR_BURN.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[BlendMode.HARD_LIGHT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[BlendMode.SOFT_LIGHT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[BlendMode.DIFFERENCE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[BlendMode.EXCLUSION.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[BlendMode.MULTIPLY.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[BlendMode.HUE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[BlendMode.SATURATION.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[BlendMode.COLOR.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[BlendMode.LUMINOSITY.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            f37520a = iArr;
        }
    }

    public static final boolean a(int i10) {
        return true;
    }

    @androidx.annotation.w0(29)
    @NotNull
    public static final BlendMode b(int i10) {
        d0.a aVar = d0.f37693b;
        if (d0.G(i10, aVar.a())) {
            return BlendMode.CLEAR;
        }
        if (d0.G(i10, aVar.x())) {
            return BlendMode.SRC;
        }
        if (d0.G(i10, aVar.g())) {
            return BlendMode.DST;
        }
        if (d0.G(i10, aVar.B())) {
            return BlendMode.SRC_OVER;
        }
        if (d0.G(i10, aVar.k())) {
            return BlendMode.DST_OVER;
        }
        if (d0.G(i10, aVar.z())) {
            return BlendMode.SRC_IN;
        }
        if (d0.G(i10, aVar.i())) {
            return BlendMode.DST_IN;
        }
        if (d0.G(i10, aVar.A())) {
            return BlendMode.SRC_OUT;
        }
        if (d0.G(i10, aVar.j())) {
            return BlendMode.DST_OUT;
        }
        if (d0.G(i10, aVar.y())) {
            return BlendMode.SRC_ATOP;
        }
        if (d0.G(i10, aVar.h())) {
            return BlendMode.DST_ATOP;
        }
        if (d0.G(i10, aVar.C())) {
            return BlendMode.XOR;
        }
        if (d0.G(i10, aVar.t())) {
            return BlendMode.PLUS;
        }
        if (d0.G(i10, aVar.q())) {
            return BlendMode.MODULATE;
        }
        if (d0.G(i10, aVar.v())) {
            return BlendMode.SCREEN;
        }
        if (d0.G(i10, aVar.s())) {
            return BlendMode.OVERLAY;
        }
        if (d0.G(i10, aVar.e())) {
            return BlendMode.DARKEN;
        }
        if (d0.G(i10, aVar.o())) {
            return BlendMode.LIGHTEN;
        }
        if (d0.G(i10, aVar.d())) {
            return BlendMode.COLOR_DODGE;
        }
        if (d0.G(i10, aVar.c())) {
            return BlendMode.COLOR_BURN;
        }
        if (d0.G(i10, aVar.m())) {
            return BlendMode.HARD_LIGHT;
        }
        if (d0.G(i10, aVar.w())) {
            return BlendMode.SOFT_LIGHT;
        }
        if (d0.G(i10, aVar.f())) {
            return BlendMode.DIFFERENCE;
        }
        if (d0.G(i10, aVar.l())) {
            return BlendMode.EXCLUSION;
        }
        if (d0.G(i10, aVar.r())) {
            return BlendMode.MULTIPLY;
        }
        if (d0.G(i10, aVar.n())) {
            return BlendMode.HUE;
        }
        if (d0.G(i10, aVar.u())) {
            return BlendMode.SATURATION;
        }
        if (d0.G(i10, aVar.b())) {
            return BlendMode.COLOR;
        }
        return d0.G(i10, aVar.p()) ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    @androidx.annotation.w0(29)
    public static final int c(@NotNull BlendMode blendMode) {
        switch (C0283a.f37520a[blendMode.ordinal()]) {
            case 1:
                return d0.f37693b.a();
            case 2:
                return d0.f37693b.x();
            case 3:
                return d0.f37693b.g();
            case 4:
                return d0.f37693b.B();
            case 5:
                return d0.f37693b.k();
            case 6:
                return d0.f37693b.z();
            case 7:
                return d0.f37693b.i();
            case 8:
                return d0.f37693b.A();
            case 9:
                return d0.f37693b.j();
            case 10:
                return d0.f37693b.y();
            case 11:
                return d0.f37693b.h();
            case 12:
                return d0.f37693b.C();
            case 13:
                return d0.f37693b.t();
            case 14:
                return d0.f37693b.q();
            case 15:
                return d0.f37693b.v();
            case 16:
                return d0.f37693b.s();
            case 17:
                return d0.f37693b.e();
            case 18:
                return d0.f37693b.o();
            case 19:
                return d0.f37693b.d();
            case 20:
                return d0.f37693b.c();
            case 21:
                return d0.f37693b.m();
            case 22:
                return d0.f37693b.w();
            case 23:
                return d0.f37693b.f();
            case 24:
                return d0.f37693b.l();
            case 25:
                return d0.f37693b.r();
            case 26:
                return d0.f37693b.n();
            case 27:
                return d0.f37693b.u();
            case 28:
                return d0.f37693b.b();
            case 29:
                return d0.f37693b.p();
            default:
                throw new kotlin.k0();
        }
    }

    @NotNull
    public static final PorterDuff.Mode d(int i10) {
        d0.a aVar = d0.f37693b;
        if (d0.G(i10, aVar.a())) {
            return PorterDuff.Mode.CLEAR;
        }
        if (d0.G(i10, aVar.x())) {
            return PorterDuff.Mode.SRC;
        }
        if (d0.G(i10, aVar.g())) {
            return PorterDuff.Mode.DST;
        }
        if (d0.G(i10, aVar.B())) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (d0.G(i10, aVar.k())) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (d0.G(i10, aVar.z())) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (d0.G(i10, aVar.i())) {
            return PorterDuff.Mode.DST_IN;
        }
        if (d0.G(i10, aVar.A())) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (d0.G(i10, aVar.j())) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (d0.G(i10, aVar.y())) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (d0.G(i10, aVar.h())) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (d0.G(i10, aVar.C())) {
            return PorterDuff.Mode.XOR;
        }
        if (d0.G(i10, aVar.t())) {
            return PorterDuff.Mode.ADD;
        }
        if (d0.G(i10, aVar.v())) {
            return PorterDuff.Mode.SCREEN;
        }
        if (d0.G(i10, aVar.s())) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (d0.G(i10, aVar.e())) {
            return PorterDuff.Mode.DARKEN;
        }
        if (d0.G(i10, aVar.o())) {
            return PorterDuff.Mode.LIGHTEN;
        }
        return d0.G(i10, aVar.q()) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}
