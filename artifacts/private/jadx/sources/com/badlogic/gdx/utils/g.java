package com.badlogic.gdx.utils;

import com.badlogic.gdx.utils.g.a;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class g<T extends a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f95495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a[] f95496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f95497c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f95498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f95499b;

        public a(float f10) {
            this.f95498a = f10;
        }

        public float a() {
            return this.f95498a;
        }

        public String toString() {
            return Float.toString(this.f95498a);
        }
    }

    public g() {
        this(16, false);
    }

    private void d(int i10) {
        a aVar;
        float f10;
        a[] aVarArr = this.f95496b;
        int i11 = this.f95495a;
        a aVar2 = aVarArr[i10];
        float f11 = aVar2.f95498a;
        while (true) {
            int i12 = i10 << 1;
            int i13 = i12 + 1;
            if (i13 >= i11) {
                break;
            }
            int i14 = i12 + 2;
            a aVar3 = aVarArr[i13];
            float f12 = aVar3.f95498a;
            if (i14 >= i11) {
                f10 = this.f95497c ? Float.MIN_VALUE : Float.MAX_VALUE;
                aVar = null;
            } else {
                aVar = aVarArr[i14];
                f10 = aVar.f95498a;
            }
            boolean z10 = f12 < f10;
            boolean z11 = this.f95497c;
            if (z10 ^ z11) {
                if (f12 == f11) {
                    break;
                }
                if ((f12 > f11) ^ z11) {
                    break;
                }
                aVarArr[i10] = aVar3;
                aVar3.f95499b = i10;
                i10 = i13;
            } else {
                if (f10 == f11) {
                    break;
                }
                if ((f10 > f11) ^ z11) {
                    break;
                }
                aVarArr[i10] = aVar;
                aVar.f95499b = i10;
                i10 = i14;
            }
        }
        aVarArr[i10] = aVar2;
        aVar2.f95499b = i10;
    }

    private T g(int i10) {
        a[] aVarArr = this.f95496b;
        T t10 = (T) aVarArr[i10];
        int i11 = this.f95495a - 1;
        this.f95495a = i11;
        aVarArr[i10] = aVarArr[i11];
        aVarArr[i11] = null;
        if (i11 > 0 && i10 < i11) {
            d(i10);
        }
        return t10;
    }

    private void j(int i10) {
        a[] aVarArr = this.f95496b;
        a aVar = aVarArr[i10];
        float f10 = aVar.f95498a;
        while (i10 > 0) {
            int i11 = (i10 - 1) >> 1;
            a aVar2 = aVarArr[i11];
            if (!((f10 < aVar2.f95498a) ^ this.f95497c)) {
                break;
            }
            aVarArr[i10] = aVar2;
            aVar2.f95499b = i10;
            i10 = i11;
        }
        aVarArr[i10] = aVar;
        aVar.f95499b = i10;
    }

    public T a(T t10) {
        int i10 = this.f95495a;
        a[] aVarArr = this.f95496b;
        if (i10 == aVarArr.length) {
            a[] aVarArr2 = new a[i10 << 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, i10);
            this.f95496b = aVarArr2;
        }
        int i11 = this.f95495a;
        t10.f95499b = i11;
        this.f95496b[i11] = t10;
        this.f95495a = i11 + 1;
        j(i11);
        return t10;
    }

    public T b(T t10, float f10) {
        t10.f95498a = f10;
        return (T) a(t10);
    }

    public void c() {
        a[] aVarArr = this.f95496b;
        int i10 = this.f95495a;
        for (int i11 = 0; i11 < i10; i11++) {
            aVarArr[i11] = null;
        }
        this.f95495a = 0;
    }

    public T e() {
        if (this.f95495a != 0) {
            return (T) this.f95496b[0];
        }
        throw new IllegalStateException("The heap is empty.");
    }

    public T f() {
        return (T) g(0);
    }

    public T h(T t10) {
        return (T) g(t10.f95499b);
    }

    public void i(T t10, float f10) {
        float f11 = t10.f95498a;
        t10.f95498a = f10;
        if ((f10 < f11) ^ this.f95497c) {
            j(t10.f95499b);
        } else {
            d(t10.f95499b);
        }
    }

    public String toString() {
        if (this.f95495a == 0) {
            return okhttp3.v.f334777p;
        }
        a[] aVarArr = this.f95496b;
        f1 f1Var = new f1(32);
        f1Var.append(AbstractJsonLexerKt.BEGIN_LIST);
        f1Var.c(aVarArr[0].f95498a);
        for (int i10 = 1; i10 < this.f95495a; i10++) {
            f1Var.o(", ");
            f1Var.c(aVarArr[i10].f95498a);
        }
        f1Var.append(AbstractJsonLexerKt.END_LIST);
        return f1Var.toString();
    }

    public g(int i10, boolean z10) {
        this.f95497c = z10;
        this.f95496b = new a[i10];
    }
}
