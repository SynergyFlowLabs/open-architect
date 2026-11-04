package com.badlogic.gdx.utils;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public class b1<T> extends b<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private T[] f95206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private T[] f95207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f95208h;

    public b1() {
    }

    private void W() {
        T[] tArr;
        T[] tArr2 = this.f95206f;
        if (tArr2 == null || tArr2 != (tArr = this.f95173a)) {
            return;
        }
        T[] tArr3 = this.f95207g;
        if (tArr3 != null) {
            int length = tArr3.length;
            int i10 = this.f95174b;
            if (length >= i10) {
                System.arraycopy(tArr, 0, tArr3, 0, i10);
                this.f95173a = this.f95207g;
                this.f95207g = null;
                return;
            }
        }
        D(tArr.length);
    }

    public static <T> b1<T> Y(T... tArr) {
        return new b1<>(tArr);
    }

    @Override // com.badlogic.gdx.utils.b
    public T A(int i10) {
        W();
        return (T) super.A(i10);
    }

    @Override // com.badlogic.gdx.utils.b
    public void B(int i10, int i11) {
        W();
        super.B(i10, i11);
    }

    @Override // com.badlogic.gdx.utils.b
    public boolean C(T t10, boolean z10) {
        W();
        return super.C(t10, z10);
    }

    @Override // com.badlogic.gdx.utils.b
    public void F() {
        W();
        super.F();
    }

    @Override // com.badlogic.gdx.utils.b
    public void L(int i10, T t10) {
        W();
        super.L(i10, t10);
    }

    @Override // com.badlogic.gdx.utils.b
    public void N() {
        W();
        super.N();
    }

    @Override // com.badlogic.gdx.utils.b
    public void O() {
        W();
        super.O();
    }

    @Override // com.badlogic.gdx.utils.b
    public void P(int i10, int i11) {
        W();
        super.P(i10, i11);
    }

    @Override // com.badlogic.gdx.utils.b
    public void S(int i10) {
        W();
        super.S(i10);
    }

    public T[] U() {
        W();
        T[] tArr = this.f95173a;
        this.f95206f = tArr;
        this.f95208h++;
        return tArr;
    }

    public void V() {
        int iMax = Math.max(0, this.f95208h - 1);
        this.f95208h = iMax;
        T[] tArr = this.f95206f;
        if (tArr == null) {
            return;
        }
        if (tArr != this.f95173a && iMax == 0) {
            this.f95207g = tArr;
            int length = tArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                this.f95207g[i10] = null;
            }
        }
        this.f95206f = null;
    }

    @Override // com.badlogic.gdx.utils.b
    public void clear() {
        W();
        super.clear();
    }

    @Override // com.badlogic.gdx.utils.b
    public T pop() {
        W();
        return (T) super.pop();
    }

    @Override // com.badlogic.gdx.utils.b
    public void r(int i10, T t10) {
        W();
        super.r(i10, t10);
    }

    @Override // com.badlogic.gdx.utils.b
    public void sort(Comparator<? super T> comparator) {
        W();
        super.sort(comparator);
    }

    @Override // com.badlogic.gdx.utils.b
    public boolean w(b<? extends T> bVar, boolean z10) {
        W();
        return super.w(bVar, z10);
    }

    public b1(b bVar) {
        super(bVar);
    }

    public b1(boolean z10, int i10, Class cls) {
        super(z10, i10, cls);
    }

    public b1(boolean z10, int i10) {
        super(z10, i10);
    }

    public b1(boolean z10, T[] tArr, int i10, int i11) {
        super(z10, tArr, i10, i11);
    }

    public b1(Class cls) {
        super(cls);
    }

    public b1(int i10) {
        super(i10);
    }

    public b1(T[] tArr) {
        super(tArr);
    }
}
