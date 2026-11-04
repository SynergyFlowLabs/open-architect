package com.badlogic.gdx.utils;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class d1<E> implements Iterable<b<E>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d1<E>.a f95472b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    b<E> f95474d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c<E> f95471a = new c<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f95473c = 0;

    class a implements Iterator<b<E>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b<E> f95475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b<E> f95476b;

        a() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b<E> next() {
            b<E> bVar = this.f95475a;
            this.f95476b = bVar;
            this.f95475a = bVar.f95479b;
            return bVar;
        }

        public d1<E>.a c() {
            this.f95475a = d1.this.f95474d;
            this.f95476b = null;
            return this;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f95475a != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            b<E> bVar = this.f95476b;
            if (bVar != null) {
                d1 d1Var = d1.this;
                if (bVar == d1Var.f95474d) {
                    d1Var.f95474d = this.f95475a;
                } else {
                    b<E> bVar2 = bVar.f95478a;
                    b<E> bVar3 = this.f95475a;
                    bVar2.f95479b = bVar3;
                    if (bVar3 != null) {
                        bVar3.f95478a = bVar2;
                    }
                }
                d1Var.f95473c--;
            }
        }
    }

    public static class b<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected b<E> f95478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected b<E> f95479b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public E f95480c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f95481d;
    }

    static class c<E> extends o0<b<E>> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.badlogic.gdx.utils.o0
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b<E> e() {
            return new b<>();
        }

        public b<E> h(b<E> bVar, b<E> bVar2, E e10, int i10) {
            b<E> bVar3 = (b) super.f();
            bVar3.f95478a = bVar;
            bVar3.f95479b = bVar2;
            bVar3.f95480c = e10;
            bVar3.f95481d = i10;
            return bVar3;
        }
    }

    public E c(int i10, E e10) {
        b<E> bVar;
        b<E> bVar2 = this.f95474d;
        if (bVar2 != null) {
            while (true) {
                bVar = bVar2.f95479b;
                if (bVar == null || bVar.f95481d > i10) {
                    break;
                }
                bVar2 = bVar;
            }
            int i11 = bVar2.f95481d;
            if (i10 > i11) {
                b<E> bVarH = this.f95471a.h(bVar2, bVar, e10, i10);
                bVar2.f95479b = bVarH;
                b<E> bVar3 = bVarH.f95479b;
                if (bVar3 != null) {
                    bVar3.f95478a = bVarH;
                }
                this.f95473c++;
            } else if (i10 < i11) {
                b<E> bVarH2 = this.f95471a.h(null, this.f95474d, e10, i10);
                this.f95474d.f95478a = bVarH2;
                this.f95474d = bVarH2;
                this.f95473c++;
            } else {
                bVar2.f95480c = e10;
            }
        } else {
            this.f95474d = this.f95471a.h(null, null, e10, i10);
            this.f95473c++;
        }
        return null;
    }

    public void clear() {
        while (true) {
            b<E> bVar = this.f95474d;
            if (bVar == null) {
                this.f95473c = 0;
                return;
            } else {
                this.f95471a.b(bVar);
                this.f95474d = this.f95474d.f95479b;
            }
        }
    }

    public E get(int i10) {
        b<E> bVar = this.f95474d;
        if (bVar == null) {
            return null;
        }
        while (true) {
            b<E> bVar2 = bVar.f95479b;
            if (bVar2 == null || bVar.f95481d >= i10) {
                break;
            }
            bVar = bVar2;
        }
        if (bVar.f95481d == i10) {
            return bVar.f95480c;
        }
        return null;
    }

    @Override // java.lang.Iterable
    public Iterator<b<E>> iterator() {
        if (this.f95472b == null) {
            this.f95472b = new a();
        }
        return this.f95472b.c();
    }

    public int size() {
        return this.f95473c;
    }
}
