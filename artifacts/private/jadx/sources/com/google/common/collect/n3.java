package com.google.common.collect;

import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
public abstract class n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final n3 f117739a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final n3 f117740b = new b(-1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final n3 f117741c = new b(1);

    class a extends n3 {
        a() {
            super(null);
        }

        @Override // com.google.common.collect.n3
        public n3 d(double left, double right) {
            return o(Double.compare(left, right));
        }

        @Override // com.google.common.collect.n3
        public n3 e(float left, float right) {
            return o(Float.compare(left, right));
        }

        @Override // com.google.common.collect.n3
        public n3 f(int left, int right) {
            return o(Integer.compare(left, right));
        }

        @Override // com.google.common.collect.n3
        public n3 g(long left, long right) {
            return o(Long.compare(left, right));
        }

        @Override // com.google.common.collect.n3
        public n3 i(Comparable<?> left, Comparable<?> right) {
            return o(left.compareTo(right));
        }

        @Override // com.google.common.collect.n3
        public <T> n3 j(@b9 T left, @b9 T right, Comparator<T> comparator) {
            return o(comparator.compare(left, right));
        }

        @Override // com.google.common.collect.n3
        public n3 k(boolean left, boolean right) {
            return o(Boolean.compare(left, right));
        }

        @Override // com.google.common.collect.n3
        public n3 l(boolean left, boolean right) {
            return o(Boolean.compare(right, left));
        }

        @Override // com.google.common.collect.n3
        public int m() {
            return 0;
        }

        n3 o(int result) {
            if (result < 0) {
                return n3.f117740b;
            }
            return result > 0 ? n3.f117741c : n3.f117739a;
        }
    }

    private static final class b extends n3 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f117742d;

        b(int result) {
            super(null);
            this.f117742d = result;
        }

        @Override // com.google.common.collect.n3
        public n3 d(double left, double right) {
            return this;
        }

        @Override // com.google.common.collect.n3
        public n3 e(float left, float right) {
            return this;
        }

        @Override // com.google.common.collect.n3
        public n3 f(int left, int right) {
            return this;
        }

        @Override // com.google.common.collect.n3
        public n3 g(long left, long right) {
            return this;
        }

        @Override // com.google.common.collect.n3
        public n3 i(Comparable<?> left, Comparable<?> right) {
            return this;
        }

        @Override // com.google.common.collect.n3
        public <T> n3 j(@b9 T left, @b9 T right, Comparator<T> comparator) {
            return this;
        }

        @Override // com.google.common.collect.n3
        public n3 k(boolean left, boolean right) {
            return this;
        }

        @Override // com.google.common.collect.n3
        public n3 l(boolean left, boolean right) {
            return this;
        }

        @Override // com.google.common.collect.n3
        public int m() {
            return this.f117742d;
        }
    }

    /* synthetic */ n3(a aVar) {
        this();
    }

    public static n3 n() {
        return f117739a;
    }

    public abstract n3 d(double left, double right);

    public abstract n3 e(float left, float right);

    public abstract n3 f(int left, int right);

    public abstract n3 g(long left, long right);

    @Deprecated
    public final n3 h(Boolean left, Boolean right) {
        return k(left.booleanValue(), right.booleanValue());
    }

    public abstract n3 i(Comparable<?> left, Comparable<?> right);

    public abstract <T> n3 j(@b9 T left, @b9 T right, Comparator<T> comparator);

    public abstract n3 k(boolean left, boolean right);

    public abstract n3 l(boolean left, boolean right);

    public abstract int m();

    private n3() {
    }
}
