package com.badlogic.gdx.utils;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public class p<T> extends b<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f95717f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private v f95718g;

    public p() {
        this.f95718g = new v(0);
    }

    private void W(int i10) {
        int i11 = this.f95718g.f95785b;
        for (int i12 = 0; i12 < i11; i12++) {
            int iJ = this.f95718g.j(i12);
            if (i10 == iJ) {
                return;
            }
            if (i10 < iJ) {
                this.f95718g.m(i12, i10);
                return;
            }
        }
        this.f95718g.a(i10);
    }

    public static <T> p<T> Y(T... tArr) {
        return new p<>(tArr);
    }

    @Override // com.badlogic.gdx.utils.b
    public T A(int i10) {
        if (this.f95717f <= 0) {
            return (T) super.A(i10);
        }
        W(i10);
        return get(i10);
    }

    @Override // com.badlogic.gdx.utils.b
    public void B(int i10, int i11) {
        if (this.f95717f <= 0) {
            super.B(i10, i11);
            return;
        }
        while (i11 >= i10) {
            W(i11);
            i11--;
        }
    }

    @Override // com.badlogic.gdx.utils.b
    public boolean C(T t10, boolean z10) {
        if (this.f95717f <= 0) {
            return super.C(t10, z10);
        }
        int iP = p(t10, z10);
        if (iP == -1) {
            return false;
        }
        W(iP);
        return true;
    }

    @Override // com.badlogic.gdx.utils.b
    public void F() {
        if (this.f95717f > 0) {
            throw new IllegalStateException("Invalid between begin/end.");
        }
        super.F();
    }

    @Override // com.badlogic.gdx.utils.b
    public void L(int i10, T t10) {
        if (this.f95717f > 0) {
            throw new IllegalStateException("Invalid between begin/end.");
        }
        super.L(i10, t10);
    }

    @Override // com.badlogic.gdx.utils.b
    public void N() {
        if (this.f95717f > 0) {
            throw new IllegalStateException("Invalid between begin/end.");
        }
        super.N();
    }

    @Override // com.badlogic.gdx.utils.b
    public void O() {
        if (this.f95717f > 0) {
            throw new IllegalStateException("Invalid between begin/end.");
        }
        super.O();
    }

    @Override // com.badlogic.gdx.utils.b
    public void P(int i10, int i11) {
        if (this.f95717f > 0) {
            throw new IllegalStateException("Invalid between begin/end.");
        }
        super.P(i10, i11);
    }

    @Override // com.badlogic.gdx.utils.b
    public void S(int i10) {
        if (this.f95717f > 0) {
            throw new IllegalStateException("Invalid between begin/end.");
        }
        super.S(i10);
    }

    public void U() {
        this.f95717f++;
    }

    public void V() {
        int i10 = this.f95717f;
        if (i10 == 0) {
            throw new IllegalStateException("begin must be called before end.");
        }
        int i11 = i10 - 1;
        this.f95717f = i11;
        if (i11 == 0) {
            int i12 = this.f95718g.f95785b;
            int i13 = 0 >> 0;
            for (int i14 = 0; i14 < i12; i14++) {
                A(this.f95718g.q());
            }
        }
    }

    @Override // com.badlogic.gdx.utils.b
    public void clear() {
        if (this.f95717f > 0) {
            throw new IllegalStateException("Invalid between begin/end.");
        }
        super.clear();
    }

    @Override // com.badlogic.gdx.utils.b
    public T pop() {
        if (this.f95717f <= 0) {
            return (T) super.pop();
        }
        throw new IllegalStateException("Invalid between begin/end.");
    }

    @Override // com.badlogic.gdx.utils.b
    public void r(int i10, T t10) {
        if (this.f95717f > 0) {
            throw new IllegalStateException("Invalid between begin/end.");
        }
        super.r(i10, t10);
    }

    @Override // com.badlogic.gdx.utils.b
    public void sort(Comparator<? super T> comparator) {
        if (this.f95717f > 0) {
            throw new IllegalStateException("Invalid between begin/end.");
        }
        super.sort(comparator);
    }

    public p(b bVar) {
        super(bVar);
        this.f95718g = new v(0);
    }

    public p(boolean z10, int i10, Class cls) {
        super(z10, i10, cls);
        this.f95718g = new v(0);
    }

    public p(boolean z10, int i10) {
        super(z10, i10);
        this.f95718g = new v(0);
    }

    public p(boolean z10, T[] tArr, int i10, int i11) {
        super(z10, tArr, i10, i11);
        this.f95718g = new v(0);
    }

    public p(Class cls) {
        super(cls);
        this.f95718g = new v(0);
    }

    public p(int i10) {
        super(i10);
        this.f95718g = new v(0);
    }

    public p(T[] tArr) {
        super(tArr);
        this.f95718g = new v(0);
    }
}
