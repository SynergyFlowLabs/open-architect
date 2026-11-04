package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: classes2.dex */
public class x {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static String f44145g = "VelocityMatrix";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    float f44146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f44147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    float f44148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    float f44149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f44150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f44151f;

    public void a(float f10, float f11, int i10, int i11, float[] fArr) {
        float f12 = fArr[0];
        float f13 = fArr[1];
        float f14 = (f10 - 0.5f) * 2.0f;
        float f15 = (f11 - 0.5f) * 2.0f;
        float f16 = f12 + this.f44148c;
        float f17 = f13 + this.f44149d;
        float f18 = f16 + (this.f44146a * f14);
        float f19 = f17 + (this.f44147b * f15);
        float radians = (float) Math.toRadians(this.f44151f);
        float radians2 = (float) Math.toRadians(this.f44150e);
        double d10 = radians;
        double d11 = i11 * f15;
        float fSin = f18 + (((float) ((((double) ((-i10) * f14)) * Math.sin(d10)) - (Math.cos(d10) * d11))) * radians2);
        float fCos = f19 + (radians2 * ((float) ((((double) (i10 * f14)) * Math.cos(d10)) - (d11 * Math.sin(d10)))));
        fArr[0] = fSin;
        fArr[1] = fCos;
    }

    public void b() {
        this.f44150e = 0.0f;
        this.f44149d = 0.0f;
        this.f44148c = 0.0f;
        this.f44147b = 0.0f;
        this.f44146a = 0.0f;
    }

    public void c(h hVar, float f10) {
        if (hVar != null) {
            this.f44150e = hVar.c(f10);
        }
    }

    public void d(o oVar, float f10) {
        if (oVar != null) {
            this.f44150e = oVar.c(f10);
            this.f44151f = oVar.a(f10);
        }
    }

    public void e(h hVar, h hVar2, float f10) {
        if (hVar != null) {
            this.f44146a = hVar.c(f10);
        }
        if (hVar2 != null) {
            this.f44147b = hVar2.c(f10);
        }
    }

    public void f(o oVar, o oVar2, float f10) {
        if (oVar != null) {
            this.f44146a = oVar.c(f10);
        }
        if (oVar2 != null) {
            this.f44147b = oVar2.c(f10);
        }
    }

    public void g(h hVar, h hVar2, float f10) {
        if (hVar != null) {
            this.f44148c = hVar.c(f10);
        }
        if (hVar2 != null) {
            this.f44149d = hVar2.c(f10);
        }
    }

    public void h(o oVar, o oVar2, float f10) {
        if (oVar != null) {
            this.f44148c = oVar.c(f10);
        }
        if (oVar2 != null) {
            this.f44149d = oVar2.c(f10);
        }
    }
}
