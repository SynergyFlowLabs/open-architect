package com.google.common.collect;

import java.io.Serializable;
import java.lang.Comparable;
import java.math.BigInteger;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
public abstract class z3<C extends Comparable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f118414a;

    private static final class b extends z3<BigInteger> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final b f118415b = new b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final BigInteger f118416c = BigInteger.valueOf(Long.MIN_VALUE);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final BigInteger f118417d = BigInteger.valueOf(Long.MAX_VALUE);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f118418e = 0;

        b() {
            super(true);
        }

        private Object readResolve() {
            return f118415b;
        }

        @Override // com.google.common.collect.z3
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public long b(BigInteger start, BigInteger end) {
            return end.subtract(start).max(f118416c).min(f118417d).longValue();
        }

        @Override // com.google.common.collect.z3
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public BigInteger g(BigInteger value) {
            return value.add(BigInteger.ONE);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.z3
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public BigInteger h(BigInteger origin, long distance) {
            a3.c(distance, "distance");
            return origin.add(BigInteger.valueOf(distance));
        }

        @Override // com.google.common.collect.z3
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public BigInteger i(BigInteger value) {
            return value.subtract(BigInteger.ONE);
        }

        public String toString() {
            return "DiscreteDomain.bigIntegers()";
        }
    }

    private static final class c extends z3<Integer> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final c f118419b = new c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f118420c = 0;

        c() {
            super(true);
        }

        private Object readResolve() {
            return f118419b;
        }

        @Override // com.google.common.collect.z3
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public long b(Integer start, Integer end) {
            return ((long) end.intValue()) - ((long) start.intValue());
        }

        @Override // com.google.common.collect.z3
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public Integer e() {
            return Integer.MAX_VALUE;
        }

        @Override // com.google.common.collect.z3
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public Integer f() {
            return Integer.MIN_VALUE;
        }

        @Override // com.google.common.collect.z3
        @fj.a
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Integer g(Integer value) {
            int iIntValue = value.intValue();
            if (iIntValue == Integer.MAX_VALUE) {
                return null;
            }
            return Integer.valueOf(iIntValue + 1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.z3
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public Integer h(Integer origin, long distance) {
            a3.c(distance, "distance");
            return Integer.valueOf(com.google.common.primitives.l.e(origin.longValue() + distance));
        }

        @Override // com.google.common.collect.z3
        @fj.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Integer i(Integer value) {
            int iIntValue = value.intValue();
            if (iIntValue == Integer.MIN_VALUE) {
                return null;
            }
            return Integer.valueOf(iIntValue - 1);
        }

        public String toString() {
            return "DiscreteDomain.integers()";
        }
    }

    private static final class d extends z3<Long> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final d f118421b = new d();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f118422c = 0;

        d() {
            super(true);
        }

        private Object readResolve() {
            return f118421b;
        }

        @Override // com.google.common.collect.z3
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public long b(Long start, Long end) {
            long jLongValue = end.longValue() - start.longValue();
            if (end.longValue() > start.longValue() && jLongValue < 0) {
                return Long.MAX_VALUE;
            }
            if (end.longValue() >= start.longValue() || jLongValue <= 0) {
                return jLongValue;
            }
            return Long.MIN_VALUE;
        }

        @Override // com.google.common.collect.z3
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public Long e() {
            return Long.MAX_VALUE;
        }

        @Override // com.google.common.collect.z3
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public Long f() {
            return Long.MIN_VALUE;
        }

        @Override // com.google.common.collect.z3
        @fj.a
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Long g(Long value) {
            long jLongValue = value.longValue();
            if (jLongValue == Long.MAX_VALUE) {
                return null;
            }
            return Long.valueOf(jLongValue + 1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.z3
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public Long h(Long origin, long distance) {
            a3.c(distance, "distance");
            long jLongValue = origin.longValue() + distance;
            if (jLongValue < 0) {
                com.google.common.base.j0.e(origin.longValue() < 0, "overflow");
            }
            return Long.valueOf(jLongValue);
        }

        @Override // com.google.common.collect.z3
        @fj.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Long i(Long value) {
            long jLongValue = value.longValue();
            if (jLongValue == Long.MIN_VALUE) {
                return null;
            }
            return Long.valueOf(jLongValue - 1);
        }

        public String toString() {
            return "DiscreteDomain.longs()";
        }
    }

    public static z3<BigInteger> a() {
        return b.f118415b;
    }

    public static z3<Integer> c() {
        return c.f118419b;
    }

    public static z3<Long> d() {
        return d.f118421b;
    }

    public abstract long b(C start, C end);

    @z7.a
    public C e() {
        throw new NoSuchElementException();
    }

    @z7.a
    public C f() {
        throw new NoSuchElementException();
    }

    @fj.a
    public abstract C g(C value);

    C h(C c10, long j10) {
        a3.c(j10, "distance");
        C c11 = c10;
        for (long j11 = 0; j11 < j10; j11++) {
            c11 = (C) g(c11);
            if (c11 == null) {
                throw new IllegalArgumentException("overflowed computing offset(" + c10 + ", " + j10 + ")");
            }
        }
        return c11;
    }

    @fj.a
    public abstract C i(C value);

    protected z3() {
        this(false);
    }

    private z3(boolean supportsFastOffset) {
        this.f118414a = supportsFastOffset;
    }
}
