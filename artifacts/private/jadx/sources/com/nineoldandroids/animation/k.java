package com.nineoldandroids.animation;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f131216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    j f131217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    j f131218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Interpolator f131219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayList<j> f131220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    p f131221f;

    public k(j... jVarArr) {
        this.f131216a = jVarArr.length;
        ArrayList<j> arrayList = new ArrayList<>();
        this.f131220e = arrayList;
        arrayList.addAll(Arrays.asList(jVarArr));
        int i10 = 2 | 0;
        this.f131217b = this.f131220e.get(0);
        j jVar = this.f131220e.get(this.f131216a - 1);
        this.f131218c = jVar;
        this.f131219d = jVar.c();
    }

    public static k c(float... fArr) {
        int length = fArr.length;
        j.a[] aVarArr = new j.a[Math.max(length, 2)];
        if (length == 1) {
            aVarArr[0] = (j.a) j.g(0.0f);
            aVarArr[1] = (j.a) j.h(1.0f, fArr[0]);
        } else {
            aVarArr[0] = (j.a) j.h(0.0f, fArr[0]);
            for (int i10 = 1; i10 < length; i10++) {
                aVarArr[i10] = (j.a) j.h(i10 / (length - 1), fArr[i10]);
            }
        }
        return new g(aVarArr);
    }

    public static k d(int... iArr) {
        int length = iArr.length;
        j.b[] bVarArr = new j.b[Math.max(length, 2)];
        if (length == 1) {
            bVarArr[0] = (j.b) j.i(0.0f);
            bVarArr[1] = (j.b) j.j(1.0f, iArr[0]);
        } else {
            bVarArr[0] = (j.b) j.j(0.0f, iArr[0]);
            for (int i10 = 1; i10 < length; i10++) {
                bVarArr[i10] = (j.b) j.j(i10 / (length - 1), iArr[i10]);
            }
        }
        return new i(bVarArr);
    }

    public static k e(j... jVarArr) {
        int length = jVarArr.length;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        for (j jVar : jVarArr) {
            if (jVar instanceof j.a) {
                z10 = true;
            } else if (jVar instanceof j.b) {
                z11 = true;
            } else {
                z12 = true;
            }
        }
        if (z10 && !z11 && !z12) {
            j.a[] aVarArr = new j.a[length];
            while (i10 < length) {
                aVarArr[i10] = (j.a) jVarArr[i10];
                i10++;
            }
            return new g(aVarArr);
        }
        if (!z11 || z10 || z12) {
            return new k(jVarArr);
        }
        j.b[] bVarArr = new j.b[length];
        while (i10 < length) {
            bVarArr[i10] = (j.b) jVarArr[i10];
            i10++;
        }
        return new i(bVarArr);
    }

    public static k f(Object... objArr) {
        int length = objArr.length;
        j.c[] cVarArr = new j.c[Math.max(length, 2)];
        if (length == 1) {
            cVarArr[0] = (j.c) j.k(0.0f);
            cVarArr[1] = (j.c) j.l(1.0f, objArr[0]);
        } else {
            cVarArr[0] = (j.c) j.l(0.0f, objArr[0]);
            for (int i10 = 1; i10 < length; i10++) {
                cVarArr[i10] = (j.c) j.l(i10 / (length - 1), objArr[i10]);
            }
        }
        return new k(cVarArr);
    }

    @Override // 
    /* JADX INFO: renamed from: a */
    public k clone() {
        ArrayList<j> arrayList = this.f131220e;
        int size = arrayList.size();
        j[] jVarArr = new j[size];
        for (int i10 = 0; i10 < size; i10++) {
            jVarArr[i10] = arrayList.get(i10).clone();
        }
        return new k(jVarArr);
    }

    public Object b(float f10) {
        int i10 = this.f131216a;
        if (i10 == 2) {
            Interpolator interpolator = this.f131219d;
            if (interpolator != null) {
                f10 = interpolator.getInterpolation(f10);
            }
            return this.f131221f.evaluate(f10, this.f131217b.e(), this.f131218c.e());
        }
        int i11 = 1;
        if (f10 <= 0.0f) {
            j jVar = this.f131220e.get(1);
            Interpolator interpolatorC = jVar.c();
            if (interpolatorC != null) {
                f10 = interpolatorC.getInterpolation(f10);
            }
            float fB = this.f131217b.b();
            return this.f131221f.evaluate((f10 - fB) / (jVar.b() - fB), this.f131217b.e(), jVar.e());
        }
        if (f10 >= 1.0f) {
            j jVar2 = this.f131220e.get(i10 - 2);
            Interpolator interpolatorC2 = this.f131218c.c();
            if (interpolatorC2 != null) {
                f10 = interpolatorC2.getInterpolation(f10);
            }
            float fB2 = jVar2.b();
            return this.f131221f.evaluate((f10 - fB2) / (this.f131218c.b() - fB2), jVar2.e(), this.f131218c.e());
        }
        j jVar3 = this.f131217b;
        while (i11 < this.f131216a) {
            j jVar4 = this.f131220e.get(i11);
            if (f10 < jVar4.b()) {
                Interpolator interpolatorC3 = jVar4.c();
                if (interpolatorC3 != null) {
                    f10 = interpolatorC3.getInterpolation(f10);
                }
                float fB3 = jVar3.b();
                return this.f131221f.evaluate((f10 - fB3) / (jVar4.b() - fB3), jVar3.e(), jVar4.e());
            }
            i11++;
            jVar3 = jVar4;
        }
        return this.f131218c.e();
    }

    public void g(p pVar) {
        this.f131221f = pVar;
    }

    public String toString() {
        String str = " ";
        for (int i10 = 0; i10 < this.f131216a; i10++) {
            str = str + this.f131220e.get(i10).e() + "  ";
        }
        return str;
    }
}
