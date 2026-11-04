package c0;

import androidx.annotation.p0;
import androidx.compose.runtime.internal.w0;
import androidx.core.graphics.h;
import com.canhub.cropper.core.CropImageOptions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final C0799a f82331i = new C0799a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f82332j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float f82333k = 0.2f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float f82334l = 1.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float f82335m = 0.4f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f82336n = 0.01f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f82337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f82338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f82339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f82340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f82341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f82342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f82343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f82344h;

    /* JADX INFO: renamed from: c0.a$a, reason: collision with other inner class name */
    public static final class C0799a {
        public /* synthetic */ C0799a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @p0
        private final a a(float f10, float f11, float f12) {
            float f13 = 100.0f;
            float f14 = 1000.0f;
            float f15 = 0.0f;
            a aVar = null;
            float f16 = 1000.0f;
            while (Math.abs(f15 - f13) > 0.009999999776482582d) {
                float f17 = ((f13 - f15) / 2) + f15;
                int iL = d(f17, f11, f10).l();
                float fL = b.f82345a.l(iL);
                float fAbs = (float) Math.abs(f12 - fL);
                if (fAbs < 0.2f) {
                    a aVarB = b(iL);
                    float fA = aVarB.a(d(aVarB.f(), aVarB.d(), f10));
                    if (fA <= 1.0f) {
                        aVar = aVarB;
                        f14 = fAbs;
                        f16 = fA;
                    }
                }
                if (f14 == 0.0f && f16 == 0.0f) {
                    return aVar;
                }
                if (fL < f12) {
                    f15 = f17;
                } else {
                    f13 = f17;
                }
            }
            return aVar;
        }

        private final a c(int i10, c cVar) {
            b bVar = b.f82345a;
            float[] fArrO = bVar.o(i10);
            float[][] fArrI = bVar.i();
            float f10 = fArrO[0];
            float[] fArr = fArrI[0];
            float f11 = fArr[0] * f10;
            float f12 = fArrO[1];
            float f13 = f11 + (fArr[1] * f12);
            float f14 = fArrO[2];
            float f15 = f13 + (fArr[2] * f14);
            float[] fArr2 = fArrI[1];
            float f16 = (fArr2[0] * f10) + (fArr2[1] * f12) + (fArr2[2] * f14);
            float[] fArr3 = fArrI[2];
            float f17 = (f10 * fArr3[0]) + (f12 * fArr3[1]) + (f14 * fArr3[2]);
            float f18 = cVar.j()[0] * f15;
            float f19 = cVar.j()[1] * f16;
            float f20 = cVar.j()[2] * f17;
            double d10 = 0.42f;
            float fPow = (float) Math.pow((cVar.d() * Math.abs(f18)) / 100.0f, d10);
            float fPow2 = (float) Math.pow((cVar.d() * Math.abs(f19)) / 100.0f, d10);
            float fPow3 = (float) Math.pow((cVar.d() * Math.abs(f20)) / 100.0f, d10);
            float fSignum = ((Math.signum(f18) * 400.0f) * fPow) / (fPow + 27.13f);
            float fSignum2 = ((Math.signum(f19) * 400.0f) * fPow2) / (fPow2 + 27.13f);
            float fSignum3 = ((Math.signum(f20) * 400.0f) * fPow3) / (fPow3 + 27.13f);
            float f21 = (((fSignum * 11.0f) + ((-12.0f) * fSignum2)) + fSignum3) / 11.0f;
            float f22 = ((fSignum + fSignum2) - (fSignum3 * 2.0f)) / 9.0f;
            float f23 = fSignum2 * 20.0f;
            float f24 = (((fSignum * 20.0f) + f23) + (21.0f * fSignum3)) / 20.0f;
            float f25 = (((fSignum * 40.0f) + f23) + fSignum3) / 20.0f;
            float fAtan2 = (((float) Math.atan2(f22, f21)) * 180.0f) / 3.1415927f;
            if (fAtan2 < 0.0f) {
                fAtan2 += 360.0f;
            } else if (fAtan2 >= 360.0f) {
                fAtan2 -= 360.0f;
            }
            float f26 = fAtan2;
            float f27 = (f26 * 3.1415927f) / 180.0f;
            float fPow4 = ((float) Math.pow((f25 * cVar.g()) / cVar.b(), cVar.c() * cVar.k())) * 100.0f;
            float fPow5 = ((float) Math.pow(((((((((float) Math.cos((((((double) f26) < 20.14d ? CropImageOptions.S3 + f26 : f26) * 3.1415927f) / 180.0f) + 2.0f)) + 3.8f) * 0.25f) * 3846.1538f) * cVar.h()) * cVar.i()) * ((float) Math.sqrt((f21 * f21) + (f22 * f22)))) / (f24 + 0.305f), 0.9f)) * ((float) Math.pow(1.64f - ((float) Math.pow(0.29f, cVar.f())), 0.73f));
            float fSqrt = fPow5 * ((float) Math.sqrt(fPow4 / 100.0f));
            float fE = fSqrt * cVar.e();
            float fSqrt2 = ((float) Math.sqrt((fPow5 * cVar.c()) / (cVar.b() + 4.0f))) * 50.0f;
            float f28 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
            float fLog = ((float) Math.log((0.0228f * fE) + 1.0f)) * 43.85965f;
            double d11 = f27;
            return new a(f26, fSqrt, fPow4, fE, fSqrt2, f28, fLog * ((float) Math.cos(d11)), fLog * ((float) Math.sin(d11)));
        }

        private final a d(float f10, float f11, float f12) {
            return e(f10, f11, f12, c.f82352k.a());
        }

        private final a e(float f10, float f11, float f12, c cVar) {
            float fE = f11 * cVar.e();
            float fSqrt = ((float) Math.sqrt(((f11 / ((float) Math.sqrt(((double) f10) / 100.0d))) * cVar.c()) / (cVar.b() + 4.0f))) * 50.0f;
            float f13 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
            float fLog = ((float) Math.log((((double) fE) * 0.0228d) + 1.0d)) * 43.85965f;
            double d10 = (3.1415927f * f12) / 180.0f;
            return new a(f12, f11, f10, fE, fSqrt, f13, fLog * ((float) Math.cos(d10)), fLog * ((float) Math.sin(d10)));
        }

        private final int g(float f10, float f11, float f12, c cVar) {
            if (Intrinsics.areEqual(cVar, c.f82352k.a())) {
                return e.f82365a.q(f10, f11, f12);
            }
            if (f11 >= 1.0d && Math.round(f12) > 0.0d && Math.round(f12) < 100.0d) {
                float fMin = f10 < 0.0f ? 0.0f : Math.min(360.0f, f10);
                a aVar = null;
                boolean z10 = true;
                float f13 = 0.0f;
                float f14 = f11;
                while (Math.abs(f13 - f11) >= 0.4000000059604645d) {
                    a aVarA = a(fMin, f14, f12);
                    if (!z10) {
                        if (aVarA == null) {
                            f11 = f14;
                        } else {
                            f13 = f14;
                            aVar = aVarA;
                        }
                        f14 = ((f11 - f13) / 2.0f) + f13;
                    } else {
                        if (aVarA != null) {
                            return aVarA.k(cVar);
                        }
                        f14 = ((f11 - f13) / 2.0f) + f13;
                        z10 = false;
                    }
                }
                return aVar == null ? b.f82345a.j(f12) : aVar.k(cVar);
            }
            return b.f82345a.j(f12);
        }

        @NotNull
        public final a b(int i10) {
            return c(i10, c.f82352k.a());
        }

        public final int f(float f10, float f11, float f12) {
            return g(f10, f11, f12, c.f82352k.a());
        }

        private C0799a() {
        }
    }

    public a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        this.f82337a = f10;
        this.f82338b = f11;
        this.f82339c = f12;
        this.f82340d = f13;
        this.f82341e = f14;
        this.f82342f = f15;
        this.f82343g = f16;
        this.f82344h = f17;
    }

    public final float a(@NotNull a aVar) {
        float f10 = this.f82342f - aVar.f82342f;
        float f11 = this.f82343g - aVar.f82343g;
        float f12 = this.f82344h - aVar.f82344h;
        return (float) (Math.pow(Math.sqrt((f10 * f10) + (f11 * f11) + (f12 * f12)), 0.63d) * 1.41d);
    }

    public final float b() {
        return this.f82343g;
    }

    public final float c() {
        return this.f82344h;
    }

    public final float d() {
        return this.f82338b;
    }

    public final float e() {
        return this.f82337a;
    }

    public final float f() {
        return this.f82339c;
    }

    public final float g() {
        return this.f82342f;
    }

    public final float h() {
        return this.f82340d;
    }

    public final float i() {
        return this.f82341e;
    }

    public final void j(float f10) {
        this.f82342f = f10;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final int k(@NotNull c cVar) {
        float fSqrt;
        float f10 = this.f82338b;
        if (f10 == 0.0f) {
            fSqrt = 0.0f;
        } else {
            float f11 = this.f82339c;
            if (f11 == 0.0f) {
                fSqrt = 0.0f;
            } else {
                fSqrt = f10 / ((float) Math.sqrt(f11 / 100.0f));
            }
        }
        float fPow = fSqrt / ((float) Math.pow(1.64f - ((float) Math.pow((float) Math.pow(0.29f, cVar.f()), 0.73f)), 1.1111112f));
        float f12 = (this.f82337a * 3.1415927f) / 180.0f;
        float fCos = (((float) Math.cos(2.0f + f12)) + 3.8f) * 0.25f;
        float fB = cVar.b() * ((float) Math.pow(this.f82339c / 100.0f, (1.0f / cVar.c()) / cVar.k()));
        float fH = fCos * 3846.1538f * cVar.h() * cVar.i();
        float fG = fB / cVar.g();
        double d10 = f12;
        float fSin = (float) Math.sin(d10);
        float fCos2 = (float) Math.cos(d10);
        float f13 = (((0.305f + fG) * 23.0f) * fPow) / (((fH * 23.0f) + ((11.0f * fPow) * fCos2)) + ((fPow * 108.0f) * fSin));
        float f14 = fCos2 * f13;
        float f15 = f13 * fSin;
        float f16 = fG * 460.0f;
        float f17 = (((451.0f * f14) + f16) + (288.0f * f15)) / 1403.0f;
        float f18 = ((f16 - (891.0f * f14)) - (261.0f * f15)) / 1403.0f;
        float f19 = ((f16 - (f14 * 220.0f)) - (f15 * 6300.0f)) / 1403.0f;
        double d11 = 2.3809524f;
        float fSignum = Math.signum(f17) * (100.0f / cVar.d()) * ((float) Math.pow(Math.max(0.0f, (Math.abs(f17) * 27.13f) / (400.0f - Math.abs(f17))), d11));
        float fSignum2 = Math.signum(f18) * (100.0f / cVar.d()) * ((float) Math.pow(Math.max(0.0f, (Math.abs(f18) * 27.13f) / (400.0f - Math.abs(f18))), d11));
        float fSignum3 = Math.signum(f19) * (100.0f / cVar.d()) * ((float) Math.pow(Math.max(0.0f, (Math.abs(f19) * 27.13f) / (400.0f - Math.abs(f19))), d11));
        float f20 = fSignum / cVar.j()[0];
        float f21 = fSignum2 / cVar.j()[1];
        float f22 = fSignum3 / cVar.j()[2];
        float[][] fArrG = b.f82345a.g();
        float[] fArr = fArrG[0];
        float f23 = (fArr[0] * f20) + (fArr[1] * f21) + (fArr[2] * f22);
        float[] fArr2 = fArrG[1];
        float f24 = (fArr2[0] * f20) + (fArr2[1] * f21) + (fArr2[2] * f22);
        float[] fArr3 = fArrG[2];
        return h.h(f23, f24, (f20 * fArr3[0]) + (f21 * fArr3[1]) + (f22 * fArr3[2]));
    }

    public final int l() {
        return k(c.f82352k.a());
    }
}
