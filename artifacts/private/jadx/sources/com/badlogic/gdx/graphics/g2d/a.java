package com.badlogic.gdx.graphics.g2d;

import com.badlogic.gdx.math.s;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final e[] f94232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f94233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f94234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f94235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f94236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f94237f;

    /* JADX INFO: renamed from: com.badlogic.gdx.graphics.g2d.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0838a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f94238a;

        static {
            int[] iArr = new int[b.values().length];
            f94238a = iArr;
            try {
                iArr[b.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94238a[b.LOOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f94238a[b.LOOP_PINGPONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f94238a[b.LOOP_RANDOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f94238a[b.REVERSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f94238a[b.LOOP_REVERSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum b {
        NORMAL,
        REVERSED,
        LOOP,
        LOOP_REVERSED,
        LOOP_PINGPONG,
        LOOP_RANDOM
    }

    public a(float f10, com.badlogic.gdx.utils.b<? extends e> bVar) {
        this.f94237f = b.NORMAL;
        this.f94233b = f10;
        int i10 = bVar.f95174b;
        this.f94234c = i10 * f10;
        this.f94232a = new e[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f94232a[i11] = bVar.get(i11);
        }
        this.f94237f = b.NORMAL;
    }

    public float a() {
        return this.f94234c;
    }

    public float b() {
        return this.f94233b;
    }

    public e c(float f10) {
        return this.f94232a[e(f10)];
    }

    public e d(float f10, boolean z10) {
        b bVar;
        b bVar2;
        b bVar3 = this.f94237f;
        if (z10 && (bVar3 == (bVar2 = b.NORMAL) || bVar3 == b.REVERSED)) {
            if (bVar3 == bVar2) {
                this.f94237f = b.LOOP;
            } else {
                this.f94237f = b.LOOP_REVERSED;
            }
        } else if (!z10 && bVar3 != b.NORMAL && bVar3 != (bVar = b.REVERSED)) {
            if (bVar3 == b.LOOP_REVERSED) {
                this.f94237f = bVar;
            } else {
                this.f94237f = b.LOOP;
            }
        }
        e eVarC = c(f10);
        this.f94237f = bVar3;
        return eVarC;
    }

    public int e(float f10) {
        if (this.f94232a.length == 1) {
            return 0;
        }
        int iMin = (int) (f10 / this.f94233b);
        switch (C0838a.f94238a[this.f94237f.ordinal()]) {
            case 1:
                iMin = Math.min(this.f94232a.length - 1, iMin);
                break;
            case 2:
                iMin %= this.f94232a.length;
                break;
            case 3:
                e[] eVarArr = this.f94232a;
                iMin %= (eVarArr.length * 2) - 2;
                if (iMin >= eVarArr.length) {
                    iMin = (eVarArr.length - 2) - (iMin - eVarArr.length);
                }
                break;
            case 4:
                iMin = ((int) (this.f94236e / this.f94233b)) == iMin ? this.f94235d : s.y(this.f94232a.length - 1);
                break;
            case 5:
                iMin = Math.max((this.f94232a.length - iMin) - 1, 0);
                break;
            case 6:
                e[] eVarArr2 = this.f94232a;
                iMin = (eVarArr2.length - (iMin % eVarArr2.length)) - 1;
                break;
        }
        this.f94235d = iMin;
        this.f94236e = f10;
        return iMin;
    }

    public e[] f() {
        return this.f94232a;
    }

    public b g() {
        return this.f94237f;
    }

    public boolean h(float f10) {
        return this.f94232a.length - 1 < ((int) (f10 / this.f94233b));
    }

    public void i(float f10) {
        this.f94233b = f10;
        this.f94234c = this.f94232a.length * f10;
    }

    public void j(b bVar) {
        this.f94237f = bVar;
    }

    public a(float f10, com.badlogic.gdx.utils.b<? extends e> bVar, b bVar2) {
        this.f94237f = b.NORMAL;
        this.f94233b = f10;
        int i10 = bVar.f95174b;
        this.f94234c = i10 * f10;
        this.f94232a = new e[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f94232a[i11] = bVar.get(i11);
        }
        this.f94237f = bVar2;
    }

    public a(float f10, e... eVarArr) {
        b bVar = b.NORMAL;
        this.f94237f = bVar;
        this.f94233b = f10;
        this.f94234c = eVarArr.length * f10;
        this.f94232a = eVarArr;
        this.f94237f = bVar;
    }
}
