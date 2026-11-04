package com.badlogic.gdx.utils;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f95714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f95715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b<T> f95716c;

    public interface a {
        void reset();
    }

    public o0() {
        this(16, Integer.MAX_VALUE);
    }

    public void a() {
        this.f95716c.clear();
    }

    public void b(T t10) {
        if (t10 == null) {
            throw new IllegalArgumentException("object cannot be null.");
        }
        b<T> bVar = this.f95716c;
        if (bVar.f95174b < this.f95714a) {
            bVar.c(t10);
            this.f95715b = Math.max(this.f95715b, this.f95716c.f95174b);
        }
        if (t10 instanceof a) {
            ((a) t10).reset();
        }
    }

    public void c(b<T> bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("object cannot be null.");
        }
        b<T> bVar2 = this.f95716c;
        int i10 = this.f95714a;
        for (int i11 = 0; i11 < bVar.f95174b; i11++) {
            T t10 = bVar.get(i11);
            if (t10 != null) {
                if (bVar2.f95174b < i10) {
                    bVar2.c(t10);
                }
                if (t10 instanceof a) {
                    ((a) t10).reset();
                }
            }
        }
        this.f95715b = Math.max(this.f95715b, bVar2.f95174b);
    }

    public int d() {
        return this.f95716c.f95174b;
    }

    protected abstract T e();

    public T f() {
        b<T> bVar = this.f95716c;
        return bVar.f95174b == 0 ? e() : bVar.pop();
    }

    public o0(int i10) {
        this(i10, Integer.MAX_VALUE);
    }

    public o0(int i10, int i11) {
        this.f95716c = new b<>(false, i10);
        this.f95714a = i11;
    }
}
