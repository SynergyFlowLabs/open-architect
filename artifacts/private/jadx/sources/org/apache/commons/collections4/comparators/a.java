package org.apache.commons.collections4.comparators;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes14.dex */
public final class a implements Comparator<Boolean>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f335618b = 1830042991606340609L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f335619c = new a(true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f335620d = new a(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f335621a;

    public a() {
        this(false);
    }

    public static a a(boolean z10) {
        return z10 ? f335619c : f335620d;
    }

    public static a c() {
        return f335620d;
    }

    public static a d() {
        return f335619c;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compare(Boolean bool, Boolean bool2) {
        boolean zBooleanValue = bool.booleanValue();
        if (bool2.booleanValue() ^ zBooleanValue) {
            return this.f335621a ^ zBooleanValue ? 1 : -1;
        }
        return 0;
    }

    public boolean e() {
        return this.f335621a;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof a) && this.f335621a == ((a) obj).f335621a);
    }

    public int hashCode() {
        return this.f335621a ? -478003966 : 478003966;
    }

    public a(boolean z10) {
        this.f335621a = z10;
    }
}
