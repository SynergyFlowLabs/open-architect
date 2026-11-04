package org.threeten.bp.temporal;

import androidx.collection.g3;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class o implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f340428e = -7317881728594519368L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f340429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f340430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f340431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f340432d;

    private o(long j10, long j11, long j12, long j13) {
        this.f340429a = j10;
        this.f340430b = j11;
        this.f340431c = j12;
        this.f340432d = j13;
    }

    public static o k(long j10, long j11) {
        if (j10 <= j11) {
            return new o(j10, j10, j11, j11);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public static o l(long j10, long j11, long j12) {
        return m(j10, j10, j11, j12);
    }

    public static o m(long j10, long j11, long j12, long j13) {
        if (j10 > j11) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        }
        if (j12 > j13) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (j11 <= j13) {
            return new o(j10, j11, j12, j13);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public int a(long j10, j jVar) {
        if (i(j10)) {
            return (int) j10;
        }
        throw new org.threeten.bp.b("Invalid int value for " + jVar + ": " + j10);
    }

    public long b(long j10, j jVar) {
        if (j(j10)) {
            return j10;
        }
        if (jVar == null) {
            throw new org.threeten.bp.b("Invalid value (valid values " + this + "): " + j10);
        }
        throw new org.threeten.bp.b("Invalid value for " + jVar + " (valid values " + this + "): " + j10);
    }

    public long c() {
        return this.f340430b;
    }

    public long d() {
        return this.f340432d;
    }

    public long e() {
        return this.f340429a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f340429a == oVar.f340429a && this.f340430b == oVar.f340430b && this.f340431c == oVar.f340431c && this.f340432d == oVar.f340432d) {
                return true;
            }
        }
        return false;
    }

    public long f() {
        return this.f340431c;
    }

    public boolean g() {
        return this.f340429a == this.f340430b && this.f340431c == this.f340432d;
    }

    public boolean h() {
        return e() >= g3.f12261h && d() <= g3.f12256c;
    }

    public int hashCode() {
        long j10 = this.f340429a;
        long j11 = this.f340430b;
        long j12 = (j10 + j11) << ((int) (j11 + 16));
        long j13 = this.f340431c;
        long j14 = (j12 >> ((int) (j13 + 48))) << ((int) (j13 + 32));
        long j15 = this.f340432d;
        long j16 = ((j14 >> ((int) (32 + j15))) << ((int) (j15 + 48))) >> 16;
        return (int) (j16 ^ (j16 >>> 32));
    }

    public boolean i(long j10) {
        return h() && j(j10);
    }

    public boolean j(long j10) {
        return j10 >= e() && j10 <= d();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f340429a);
        if (this.f340429a != this.f340430b) {
            sb2.append('/');
            sb2.append(this.f340430b);
        }
        sb2.append(" - ");
        sb2.append(this.f340431c);
        if (this.f340431c != this.f340432d) {
            sb2.append('/');
            sb2.append(this.f340432d);
        }
        return sb2.toString();
    }
}
