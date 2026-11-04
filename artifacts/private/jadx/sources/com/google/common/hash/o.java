package com.google.common.hash;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@k
@com.google.common.annotations.a
public final class o {

    private enum a implements n<byte[]> {
        INSTANCE;

        @Override // com.google.common.hash.n
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void e2(byte[] from, i0 into) {
            into.h(from);
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.byteArrayFunnel()";
        }
    }

    private enum b implements n<Integer> {
        INSTANCE;

        static {
            int i10 = 3 >> 0;
        }

        @Override // com.google.common.hash.n
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void e2(Integer from, i0 into) {
            into.b(from.intValue());
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.integerFunnel()";
        }
    }

    private enum c implements n<Long> {
        INSTANCE;

        @Override // com.google.common.hash.n
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void e2(Long from, i0 into) {
            into.c(from.longValue());
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.longFunnel()";
        }
    }

    private static class d<E> implements n<Iterable<? extends E>>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n<E> f118889a;

        d(n<E> elementFunnel) {
            this.f118889a = (n) com.google.common.base.j0.E(elementFunnel);
        }

        @Override // com.google.common.hash.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void e2(Iterable<? extends E> from, i0 into) {
            Iterator<? extends E> it = from.iterator();
            while (it.hasNext()) {
                this.f118889a.e2(it.next(), into);
            }
        }

        public boolean equals(@fj.a Object o10) {
            if (o10 instanceof d) {
                return this.f118889a.equals(((d) o10).f118889a);
            }
            return false;
        }

        public int hashCode() {
            return this.f118889a.hashCode() ^ d.class.hashCode();
        }

        public String toString() {
            return "Funnels.sequentialFunnel(" + this.f118889a + ")";
        }
    }

    private static class e extends OutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final i0 f118890a;

        e(i0 sink) {
            this.f118890a = (i0) com.google.common.base.j0.E(sink);
        }

        public String toString() {
            return "Funnels.asOutputStream(" + this.f118890a + ")";
        }

        @Override // java.io.OutputStream
        public void write(int b10) {
            this.f118890a.g((byte) b10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bytes) {
            this.f118890a.h(bytes);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bytes, int off, int len) {
            this.f118890a.k(bytes, off, len);
        }
    }

    private static class f implements n<CharSequence>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Charset f118891a;

        private static class a implements Serializable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final long f118892b = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f118893a;

            a(Charset charset) {
                this.f118893a = charset.name();
            }

            private Object readResolve() {
                return o.f(Charset.forName(this.f118893a));
            }
        }

        f(Charset charset) {
            this.f118891a = (Charset) com.google.common.base.j0.E(charset);
        }

        private void readObject(ObjectInputStream stream) throws InvalidObjectException {
            throw new InvalidObjectException("Use SerializedForm");
        }

        @Override // com.google.common.hash.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void e2(CharSequence from, i0 into) {
            into.m(from, this.f118891a);
        }

        public boolean equals(@fj.a Object o10) {
            if (o10 instanceof f) {
                return this.f118891a.equals(((f) o10).f118891a);
            }
            return false;
        }

        public int hashCode() {
            return this.f118891a.hashCode() ^ f.class.hashCode();
        }

        public String toString() {
            return "Funnels.stringFunnel(" + this.f118891a.name() + ")";
        }

        Object writeReplace() {
            return new a(this.f118891a);
        }
    }

    private enum g implements n<CharSequence> {
        INSTANCE;

        @Override // com.google.common.hash.n
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void e2(CharSequence from, i0 into) {
            into.j(from);
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.unencodedCharsFunnel()";
        }
    }

    private o() {
    }

    public static OutputStream a(i0 sink) {
        return new e(sink);
    }

    public static n<byte[]> b() {
        return a.INSTANCE;
    }

    public static n<Integer> c() {
        return b.INSTANCE;
    }

    public static n<Long> d() {
        return c.INSTANCE;
    }

    public static <E> n<Iterable<? extends E>> e(n<E> elementFunnel) {
        return new d(elementFunnel);
    }

    public static n<CharSequence> f(Charset charset) {
        return new f(charset);
    }

    public static n<CharSequence> g() {
        return g.INSTANCE;
    }
}
