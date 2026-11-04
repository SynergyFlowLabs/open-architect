package com.badlogic.gdx.utils;

import java.util.NoSuchElementException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class n0<T> extends l0<T> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final b<T> f95710s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    a f95711t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    a f95712v;

    public static class a<T> extends l0.a<T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private b<T> f95713f;

        public a(n0<T> n0Var) {
            super(n0Var);
            this.f95713f = n0Var.f95710s;
        }

        @Override // com.badlogic.gdx.utils.l0.a, java.util.Iterator
        public T next() {
            if (!this.f95668a) {
                throw new NoSuchElementException();
            }
            if (!this.f95672e) {
                throw new t("#iterator() cannot be used nested.");
            }
            T t10 = this.f95713f.get(this.f95670c);
            int i10 = this.f95670c + 1;
            this.f95670c = i10;
            this.f95668a = i10 < this.f95669b.f95656a;
            return t10;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // com.badlogic.gdx.utils.l0.a, java.util.Iterator
        public void remove() {
            int i10 = this.f95670c;
            if (i10 < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            int i11 = i10 - 1;
            this.f95670c = i11;
            this.f95669b.remove((K) this.f95713f.get(i11));
        }

        @Override // com.badlogic.gdx.utils.l0.a
        public void reset() {
            this.f95670c = 0;
            this.f95668a = this.f95669b.f95656a > 0;
        }
    }

    public n0() {
        this.f95710s = new b<>();
    }

    @Override // com.badlogic.gdx.utils.l0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public a<T> iterator() {
        if (this.f95711t == null) {
            this.f95711t = new a(this);
            this.f95712v = new a(this);
        }
        a aVar = this.f95711t;
        if (aVar.f95672e) {
            this.f95712v.reset();
            a<T> aVar2 = this.f95712v;
            aVar2.f95672e = true;
            this.f95711t.f95672e = false;
            return aVar2;
        }
        aVar.reset();
        a<T> aVar3 = this.f95711t;
        aVar3.f95672e = true;
        this.f95712v.f95672e = false;
        return aVar3;
    }

    public b<T> K() {
        return this.f95710s;
    }

    @Override // com.badlogic.gdx.utils.l0
    public boolean add(T t10) {
        if (!contains(t10)) {
            this.f95710s.c(t10);
        }
        return super.add(t10);
    }

    @Override // com.badlogic.gdx.utils.l0
    public void clear() {
        this.f95710s.clear();
        super.clear();
    }

    @Override // com.badlogic.gdx.utils.l0
    public void p(int i10) {
        this.f95710s.clear();
        super.p(i10);
    }

    @Override // com.badlogic.gdx.utils.l0
    public boolean remove(T t10) {
        this.f95710s.C(t10, false);
        return super.remove(t10);
    }

    @Override // com.badlogic.gdx.utils.l0
    public String toString() {
        if (this.f95656a == 0) {
            return "{}";
        }
        f1 f1Var = new f1(32);
        f1Var.append(AbstractJsonLexerKt.BEGIN_OBJ);
        b<T> bVar = this.f95710s;
        int i10 = bVar.f95174b;
        for (int i11 = 0; i11 < i10; i11++) {
            T t10 = bVar.get(i11);
            if (i11 > 0) {
                f1Var.o(", ");
            }
            f1Var.n(t10);
        }
        f1Var.append(AbstractJsonLexerKt.END_OBJ);
        return f1Var.toString();
    }

    public n0(int i10, float f10) {
        super(i10, f10);
        this.f95710s = new b<>(this.f95658c);
    }

    public n0(int i10) {
        super(i10);
        this.f95710s = new b<>(this.f95658c);
    }

    public n0(n0 n0Var) {
        super(n0Var);
        b<T> bVar = new b<>(this.f95658c);
        this.f95710s = bVar;
        bVar.d(n0Var.f95710s);
    }
}
