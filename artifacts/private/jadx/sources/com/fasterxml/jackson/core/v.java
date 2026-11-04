package com.fasterxml.jackson.core;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class v implements Comparable<v>, Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f102857g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final v f102858h = new v(0, 0, 0, null, null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final int f102859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f102860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f102861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final String f102862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final String f102863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final String f102864f;

    static {
        int i10 = 0 << 0;
    }

    @Deprecated
    public v(int i10, int i11, int i12, String str) {
        this(i10, i11, i12, str, null, null);
    }

    public static v v() {
        return f102858h;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(v vVar) {
        if (vVar == this) {
            return 0;
        }
        int iCompareTo = this.f102862d.compareTo(vVar.f102862d);
        return (iCompareTo == 0 && (iCompareTo = this.f102863e.compareTo(vVar.f102863e)) == 0 && (iCompareTo = this.f102859a - vVar.f102859a) == 0 && (iCompareTo = this.f102860b - vVar.f102860b) == 0) ? this.f102861c - vVar.f102861c : iCompareTo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        v vVar = (v) obj;
        return vVar.f102859a == this.f102859a && vVar.f102860b == this.f102860b && vVar.f102861c == this.f102861c && vVar.f102863e.equals(this.f102863e) && vVar.f102862d.equals(this.f102862d);
    }

    public int hashCode() {
        return this.f102863e.hashCode() ^ (((this.f102862d.hashCode() + this.f102859a) - this.f102860b) + this.f102861c);
    }

    public String k() {
        return this.f102863e;
    }

    public String l() {
        return this.f102862d;
    }

    public int n() {
        return this.f102859a;
    }

    public int o() {
        return this.f102860b;
    }

    public int p() {
        return this.f102861c;
    }

    public boolean q() {
        String str = this.f102864f;
        return str != null && str.length() > 0;
    }

    @Deprecated
    public boolean r() {
        return s();
    }

    public boolean s() {
        return this == f102858h;
    }

    public String t() {
        return this.f102862d + '/' + this.f102863e + '/' + toString();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f102859a);
        sb2.append('.');
        sb2.append(this.f102860b);
        sb2.append('.');
        sb2.append(this.f102861c);
        if (q()) {
            sb2.append(org.apache.commons.codec.language.l.f335457d);
            sb2.append(this.f102864f);
        }
        return sb2.toString();
    }

    public v(int i10, int i11, int i12, String str, String str2, String str3) {
        this.f102859a = i10;
        this.f102860b = i11;
        this.f102861c = i12;
        this.f102864f = str;
        this.f102862d = str2 == null ? "" : str2;
        this.f102863e = str3 == null ? "" : str3;
    }
}
