package com.badlogic.gdx.utils;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public interface r0<T> {

    public static class a<T> implements Iterable<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Iterable<T> f95733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public r0<T> f95734b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b<T> f95735c = null;

        public a(Iterable<T> iterable, r0<T> r0Var) {
            c(iterable, r0Var);
        }

        public void c(Iterable<T> iterable, r0<T> r0Var) {
            this.f95733a = iterable;
            this.f95734b = r0Var;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            b<T> bVar = this.f95735c;
            if (bVar == null) {
                this.f95735c = new b<>(this.f95733a.iterator(), this.f95734b);
            } else {
                bVar.c(this.f95733a.iterator(), this.f95734b);
            }
            return this.f95735c;
        }
    }

    public static class b<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Iterator<T> f95736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public r0<T> f95737b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f95738c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f95739d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public T f95740e;

        public b(Iterable<T> iterable, r0<T> r0Var) {
            this(iterable.iterator(), r0Var);
        }

        public void b(Iterable<T> iterable, r0<T> r0Var) {
            c(iterable.iterator(), r0Var);
        }

        public void c(Iterator<T> it, r0<T> r0Var) {
            this.f95736a = it;
            this.f95737b = r0Var;
            this.f95739d = false;
            this.f95738c = false;
            this.f95740e = null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f95738c) {
                return false;
            }
            if (this.f95740e != null) {
                return true;
            }
            this.f95739d = true;
            while (this.f95736a.hasNext()) {
                T next = this.f95736a.next();
                if (this.f95737b.a(next)) {
                    this.f95740e = next;
                    return true;
                }
            }
            this.f95738c = true;
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f95740e == null && !hasNext()) {
                return null;
            }
            T t10 = this.f95740e;
            this.f95740e = null;
            this.f95739d = false;
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f95739d) {
                throw new t("Cannot remove between a call to hasNext() and next().");
            }
            this.f95736a.remove();
        }

        public b(Iterator<T> it, r0<T> r0Var) {
            this.f95738c = false;
            this.f95739d = false;
            this.f95740e = null;
            c(it, r0Var);
        }
    }

    boolean a(T t10);
}
