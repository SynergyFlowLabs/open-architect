package com.badlogic.gdx.utils;

import java.util.NoSuchElementException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class m0<K, V> extends k0<K, V> {
    private k0.e H1;
    final com.badlogic.gdx.utils.b<K> Y;
    private k0.a Z;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private k0.c f95697g3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private k0.a f95698p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private k0.e f95699p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private k0.c f95700p2;

    public static class a<K, V> extends k0.a<K, V> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private com.badlogic.gdx.utils.b<K> f95701g;

        public a(m0<K, V> m0Var) {
            super(m0Var);
            this.f95701g = m0Var.Y;
        }

        @Override // com.badlogic.gdx.utils.k0.a, java.util.Iterator
        /* JADX INFO: renamed from: k */
        public k0.b next() {
            if (!this.f95632a) {
                throw new NoSuchElementException();
            }
            if (!this.f95636e) {
                throw new t("#iterator() cannot be used nested.");
            }
            this.f95629f.f95630a = this.f95701g.get(this.f95634c);
            k0.b<K, V> bVar = this.f95629f;
            bVar.f95631b = this.f95633b.p(bVar.f95630a);
            int i10 = this.f95634c + 1;
            this.f95634c = i10;
            this.f95632a = i10 < this.f95633b.f95612a;
            return this.f95629f;
        }

        @Override // com.badlogic.gdx.utils.k0.a, com.badlogic.gdx.utils.k0.d, java.util.Iterator
        public void remove() {
            if (this.f95635d < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            this.f95633b.K(this.f95629f.f95630a);
        }

        @Override // com.badlogic.gdx.utils.k0.a, com.badlogic.gdx.utils.k0.d
        public void reset() {
            this.f95634c = 0;
            this.f95632a = this.f95633b.f95612a > 0;
        }
    }

    public static class b<K> extends k0.c<K> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private com.badlogic.gdx.utils.b<K> f95702f;

        public b(m0<K, ?> m0Var) {
            super(m0Var);
            this.f95702f = m0Var.Y;
        }

        @Override // com.badlogic.gdx.utils.k0.c, java.util.Iterator
        public K next() {
            if (!this.f95632a) {
                throw new NoSuchElementException();
            }
            if (!this.f95636e) {
                throw new t("#iterator() cannot be used nested.");
            }
            K k10 = this.f95702f.get(this.f95634c);
            int i10 = 2 | 1;
            int i11 = this.f95634c + 1;
            this.f95634c = i11;
            this.f95632a = i11 < this.f95633b.f95612a;
            return k10;
        }

        @Override // com.badlogic.gdx.utils.k0.c, com.badlogic.gdx.utils.k0.d, java.util.Iterator
        public void remove() {
            if (this.f95635d < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            this.f95633b.K(this.f95702f.get(this.f95634c - 1));
        }

        @Override // com.badlogic.gdx.utils.k0.c, com.badlogic.gdx.utils.k0.d
        public void reset() {
            this.f95634c = 0;
            this.f95632a = this.f95633b.f95612a > 0;
        }
    }

    public static class c<V> extends k0.e<V> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private com.badlogic.gdx.utils.b f95703f;

        public c(m0<?, V> m0Var) {
            super(m0Var);
            this.f95703f = m0Var.Y;
        }

        @Override // com.badlogic.gdx.utils.k0.e, java.util.Iterator
        public V next() {
            if (!this.f95632a) {
                throw new NoSuchElementException();
            }
            if (!this.f95636e) {
                throw new t("#iterator() cannot be used nested.");
            }
            V vP = this.f95633b.p((K) this.f95703f.get(this.f95634c));
            int i10 = this.f95634c + 1;
            this.f95634c = i10;
            this.f95632a = i10 < this.f95633b.f95612a;
            return vP;
        }

        @Override // com.badlogic.gdx.utils.k0.e, com.badlogic.gdx.utils.k0.d, java.util.Iterator
        public void remove() {
            if (this.f95635d < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            this.f95633b.K((K) this.f95703f.get(this.f95634c - 1));
        }

        @Override // com.badlogic.gdx.utils.k0.e, com.badlogic.gdx.utils.k0.d
        public void reset() {
            this.f95634c = 0;
            this.f95632a = this.f95633b.f95612a > 0;
        }
    }

    public m0() {
        this.Y = new com.badlogic.gdx.utils.b<>();
    }

    @Override // com.badlogic.gdx.utils.k0
    public k0.c<K> A() {
        if (this.f95700p2 == null) {
            this.f95700p2 = new b(this);
            this.f95697g3 = new b(this);
        }
        k0.c cVar = this.f95700p2;
        if (cVar.f95636e) {
            this.f95697g3.reset();
            k0.c<K> cVar2 = this.f95697g3;
            cVar2.f95636e = true;
            this.f95700p2.f95636e = false;
            return cVar2;
        }
        cVar.reset();
        k0.c<K> cVar3 = this.f95700p2;
        cVar3.f95636e = true;
        this.f95697g3.f95636e = false;
        return cVar3;
    }

    @Override // com.badlogic.gdx.utils.k0
    public V C(K k10, V v10) {
        if (!d(k10)) {
            this.Y.c(k10);
        }
        return (V) super.C(k10, v10);
    }

    @Override // com.badlogic.gdx.utils.k0
    public V K(K k10) {
        this.Y.C(k10, false);
        return (V) super.K(k10);
    }

    @Override // com.badlogic.gdx.utils.k0
    public k0.e<V> R() {
        if (this.f95699p1 == null) {
            this.f95699p1 = new c(this);
            this.H1 = new c(this);
        }
        k0.e eVar = this.f95699p1;
        if (eVar.f95636e) {
            this.H1.reset();
            k0.e<V> eVar2 = this.H1;
            eVar2.f95636e = true;
            this.f95699p1.f95636e = false;
            return eVar2;
        }
        eVar.reset();
        k0.e<V> eVar3 = this.f95699p1;
        eVar3.f95636e = true;
        this.H1.f95636e = false;
        return eVar3;
    }

    public com.badlogic.gdx.utils.b<K> S() {
        return this.Y;
    }

    @Override // com.badlogic.gdx.utils.k0
    public void c(int i10) {
        this.Y.clear();
        super.c(i10);
    }

    @Override // com.badlogic.gdx.utils.k0
    public void clear() {
        this.Y.clear();
        super.clear();
    }

    @Override // com.badlogic.gdx.utils.k0
    public k0.a<K, V> m() {
        if (this.Z == null) {
            this.Z = new a(this);
            this.f95698p0 = new a(this);
        }
        k0.a aVar = this.Z;
        if (aVar.f95636e) {
            this.f95698p0.reset();
            k0.a<K, V> aVar2 = this.f95698p0;
            aVar2.f95636e = true;
            this.Z.f95636e = false;
            return aVar2;
        }
        aVar.reset();
        k0.a<K, V> aVar3 = this.Z;
        aVar3.f95636e = true;
        this.f95698p0.f95636e = false;
        return aVar3;
    }

    @Override // com.badlogic.gdx.utils.k0
    public String toString() {
        if (this.f95612a == 0) {
            return "{}";
        }
        f1 f1Var = new f1(32);
        f1Var.append(AbstractJsonLexerKt.BEGIN_OBJ);
        com.badlogic.gdx.utils.b<K> bVar = this.Y;
        int i10 = bVar.f95174b;
        int i11 = 3 & 0;
        for (int i12 = 0; i12 < i10; i12++) {
            K k10 = bVar.get(i12);
            if (i12 > 0) {
                f1Var.o(", ");
            }
            f1Var.n(k10);
            f1Var.append('=');
            f1Var.n(p(k10));
        }
        f1Var.append(AbstractJsonLexerKt.END_OBJ);
        return f1Var.toString();
    }

    @Override // com.badlogic.gdx.utils.k0, java.lang.Iterable
    /* JADX INFO: renamed from: w */
    public k0.a<K, V> iterator() {
        return m();
    }

    public m0(int i10) {
        super(i10);
        this.Y = new com.badlogic.gdx.utils.b<>(this.f95615d);
    }

    public m0(int i10, float f10) {
        super(i10, f10);
        this.Y = new com.badlogic.gdx.utils.b<>(this.f95615d);
    }

    public m0(k0<? extends K, ? extends V> k0Var) {
        super(k0Var);
        this.Y = new com.badlogic.gdx.utils.b<>(this.f95615d);
    }
}
