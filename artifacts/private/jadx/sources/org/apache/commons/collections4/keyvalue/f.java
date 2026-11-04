package org.apache.commons.collections4.keyvalue;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class f<K> implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f335901c = 4465448607415788805L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K[] f335902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient int f335903b;

    public f(K k10, K k11) {
        this(new Object[]{k10, k11}, false);
    }

    private void a(Object[] objArr) {
        int iHashCode = 0;
        for (Object obj : objArr) {
            if (obj != null) {
                iHashCode ^= obj.hashCode();
            }
        }
        this.f335903b = iHashCode;
    }

    public K b(int i10) {
        return this.f335902a[i10];
    }

    public K[] c() {
        return (K[]) ((Object[]) this.f335902a.clone());
    }

    public int d() {
        return this.f335902a.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            return Arrays.equals(this.f335902a, ((f) obj).f335902a);
        }
        return false;
    }

    public int hashCode() {
        return this.f335903b;
    }

    protected Object readResolve() {
        a(this.f335902a);
        return this;
    }

    public String toString() {
        return "MultiKey" + Arrays.toString(this.f335902a);
    }

    public f(K k10, K k11, K k12) {
        this(new Object[]{k10, k11, k12}, false);
    }

    public f(K k10, K k11, K k12, K k13) {
        this(new Object[]{k10, k11, k12, k13}, false);
    }

    public f(K k10, K k11, K k12, K k13, K k14) {
        this(new Object[]{k10, k11, k12, k13, k14}, false);
    }

    public f(K[] kArr) {
        this((Object[]) kArr, true);
    }

    public f(K[] kArr, boolean z10) {
        if (kArr == null) {
            throw new IllegalArgumentException("The array of keys must not be null");
        }
        if (z10) {
            this.f335902a = (K[]) ((Object[]) kArr.clone());
        } else {
            this.f335902a = kArr;
        }
        a(kArr);
    }
}
