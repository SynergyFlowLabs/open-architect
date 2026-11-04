package org.apache.commons.collections4.functors;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes14.dex */
public class j<T> implements org.apache.commons.collections4.l0<T>, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f335688d = -1863209236504077399L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f335689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Comparator<T> f335690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f335691c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f335692a;

        static {
            int[] iArr = new int[b.values().length];
            f335692a = iArr;
            try {
                iArr[b.EQUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f335692a[b.GREATER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f335692a[b.LESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f335692a[b.GREATER_OR_EQUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f335692a[b.LESS_OR_EQUAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum b {
        EQUAL,
        GREATER,
        LESS,
        GREATER_OR_EQUAL,
        LESS_OR_EQUAL
    }

    public j(T t10, Comparator<T> comparator, b bVar) {
        this.f335689a = t10;
        this.f335690b = comparator;
        this.f335691c = bVar;
    }

    public static <T> org.apache.commons.collections4.l0<T> c(T t10, Comparator<T> comparator) {
        return d(t10, comparator, b.EQUAL);
    }

    public static <T> org.apache.commons.collections4.l0<T> d(T t10, Comparator<T> comparator, b bVar) {
        if (comparator == null) {
            throw new NullPointerException("Comparator must not be null.");
        }
        if (bVar != null) {
            return new j(t10, comparator, bVar);
        }
        throw new NullPointerException("Criterion must not be null.");
    }

    @Override // org.apache.commons.collections4.l0
    public boolean a(T t10) {
        int iCompare = this.f335690b.compare(this.f335689a, t10);
        int i10 = a.f335692a[this.f335691c.ordinal()];
        if (i10 == 1) {
            return iCompare == 0;
        }
        if (i10 == 2) {
            return iCompare > 0;
        }
        if (i10 == 3) {
            return iCompare < 0;
        }
        if (i10 == 4) {
            return iCompare >= 0;
        }
        if (i10 == 5) {
            return iCompare <= 0;
        }
        throw new IllegalStateException("The current criterion '" + this.f335691c + "' is invalid.");
    }
}
