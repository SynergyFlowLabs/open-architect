package androidx.constraintlayout.core.parser;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class c implements Cloneable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected static int f44158f = 80;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected static int f44159g = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char[] f44160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected long f44161b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected long f44162c = Long.MAX_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected b f44163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f44164e;

    public c(char[] cArr) {
        this.f44160a = cArr;
    }

    public boolean A() {
        return this.f44162c != Long.MAX_VALUE;
    }

    public boolean B() {
        return this.f44161b > -1;
    }

    public boolean C() {
        return this.f44161b == -1;
    }

    public void D(b bVar) {
        this.f44163d = bVar;
    }

    public void F(long j10) {
        if (this.f44162c != Long.MAX_VALUE) {
            return;
        }
        this.f44162c = j10;
        if (g.f44169d) {
            System.out.println("closing " + hashCode() + " -> " + this);
        }
        b bVar = this.f44163d;
        if (bVar != null) {
            bVar.M(this);
        }
    }

    public void G(int i10) {
        this.f44164e = i10;
    }

    public void J(long j10) {
        this.f44161b = j10;
    }

    protected String K(int i10, int i11) {
        return "";
    }

    protected String L() {
        return "";
    }

    protected void c(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append(' ');
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f44161b == cVar.f44161b && this.f44162c == cVar.f44162c && this.f44164e == cVar.f44164e && Arrays.equals(this.f44160a, cVar.f44160a)) {
            return Objects.equals(this.f44163d, cVar.f44163d);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.f44160a) * 31;
        long j10 = this.f44161b;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f44162c;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        b bVar = this.f44163d;
        return ((i11 + (bVar != null ? bVar.hashCode() : 0)) * 31) + this.f44164e;
    }

    @Override // 
    @NonNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public c clone() {
        try {
            return (c) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public String k() {
        String str = new String(this.f44160a);
        if (str.length() < 1) {
            return "";
        }
        long j10 = this.f44162c;
        if (j10 != Long.MAX_VALUE) {
            long j11 = this.f44161b;
            if (j10 >= j11) {
                return str.substring((int) j11, ((int) j10) + 1);
            }
        }
        long j12 = this.f44161b;
        return str.substring((int) j12, ((int) j12) + 1);
    }

    public c l() {
        return this.f44163d;
    }

    protected String n() {
        if (!g.f44169d) {
            return "";
        }
        return v() + " -> ";
    }

    public long p() {
        return this.f44162c;
    }

    public float r() {
        if (this instanceof e) {
            return ((e) this).r();
        }
        return Float.NaN;
    }

    public int s() {
        if (this instanceof e) {
            return ((e) this).s();
        }
        return 0;
    }

    public int t() {
        return this.f44164e;
    }

    public String toString() {
        long j10 = this.f44161b;
        long j11 = this.f44162c;
        if (j10 <= j11 && j11 != Long.MAX_VALUE) {
            return v() + " (" + this.f44161b + " : " + this.f44162c + ") <<" + new String(this.f44160a).substring((int) this.f44161b, ((int) this.f44162c) + 1) + ">>";
        }
        return getClass() + " (INVALID, " + this.f44161b + "-" + this.f44162c + ")";
    }

    public long u() {
        return this.f44161b;
    }

    protected String v() {
        String string = getClass().toString();
        return string.substring(string.lastIndexOf(46) + 1);
    }

    public boolean w() {
        char[] cArr = this.f44160a;
        return cArr != null && cArr.length >= 1;
    }
}
