package com.badlogic.gdx.utils;

/* JADX INFO: loaded from: classes3.dex */
public class p0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b<T> f95719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b<T> f95720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b<T> f95721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b<T> f95722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f95723e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o0<b<T>> f95724f;

    class a extends o0<b<T>> {
        a(int i10, int i11) {
            super(i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.badlogic.gdx.utils.o0
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b<T> e() {
            return new b<>();
        }
    }

    static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public T f95726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b<T> f95727b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b<T> f95728c;

        b() {
        }
    }

    public p0(int i10) {
        this.f95724f = new a(16, i10);
    }

    public void a(T t10) {
        b<T> bVarF = this.f95724f.f();
        bVarF.f95726a = t10;
        bVarF.f95727b = null;
        bVarF.f95728c = null;
        if (this.f95719a == null) {
            this.f95719a = bVarF;
            this.f95720b = bVarF;
            this.f95723e++;
        } else {
            b<T> bVar = this.f95720b;
            bVarF.f95728c = bVar;
            bVar.f95727b = bVarF;
            this.f95720b = bVarF;
            this.f95723e++;
        }
    }

    public void b() {
        c();
        while (e() != null) {
            g();
        }
    }

    public void c() {
        this.f95721c = this.f95719a;
    }

    public void d() {
        this.f95721c = this.f95720b;
    }

    public T e() {
        b<T> bVar = this.f95721c;
        if (bVar == null) {
            return null;
        }
        T t10 = bVar.f95726a;
        this.f95722d = bVar;
        this.f95721c = bVar.f95727b;
        return t10;
    }

    public T f() {
        b<T> bVar = this.f95721c;
        if (bVar == null) {
            return null;
        }
        T t10 = bVar.f95726a;
        this.f95722d = bVar;
        this.f95721c = bVar.f95728c;
        return t10;
    }

    public void g() {
        b<T> bVar = this.f95722d;
        if (bVar == null) {
            return;
        }
        this.f95723e--;
        this.f95724f.b(bVar);
        b<T> bVar2 = this.f95722d;
        b<T> bVar3 = bVar2.f95727b;
        b<T> bVar4 = bVar2.f95728c;
        this.f95722d = null;
        if (this.f95723e == 0) {
            this.f95719a = null;
            this.f95720b = null;
        } else if (bVar2 == this.f95719a) {
            bVar3.f95728c = null;
            this.f95719a = bVar3;
        } else if (bVar2 == this.f95720b) {
            bVar4.f95727b = null;
            this.f95720b = bVar4;
        } else {
            bVar4.f95727b = bVar3;
            bVar3.f95728c = bVar4;
        }
    }
}
