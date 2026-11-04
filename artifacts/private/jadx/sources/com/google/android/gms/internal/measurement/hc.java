package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public class hc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected volatile yc f108529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile ra f108530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f108531c;

    public final yc a(yc ycVar) {
        yc ycVar2 = this.f108529a;
        this.f108530b = null;
        this.f108529a = ycVar;
        return ycVar2;
    }

    public final int b() {
        if (this.f108530b != null) {
            return ((qa) this.f108530b).f108752c.length;
        }
        if (this.f108529a != null) {
            return this.f108529a.e();
        }
        return 0;
    }

    public final ra c() {
        if (this.f108530b != null) {
            return this.f108530b;
        }
        synchronized (this) {
            try {
                if (this.f108530b != null) {
                    return this.f108530b;
                }
                if (this.f108529a == null) {
                    this.f108530b = ra.f108771b;
                } else {
                    this.f108530b = this.f108529a.a();
                }
                return this.f108530b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final void d(yc ycVar) {
        if (this.f108529a == null) {
            synchronized (this) {
                try {
                    if (this.f108529a != null) {
                        return;
                    }
                    try {
                        this.f108529a = ycVar;
                        this.f108530b = ra.f108771b;
                    } catch (cc unused) {
                        this.f108531c = true;
                        this.f108529a = ycVar;
                        this.f108530b = ra.f108771b;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hc)) {
            return false;
        }
        hc hcVar = (hc) obj;
        yc ycVar = this.f108529a;
        yc ycVar2 = hcVar.f108529a;
        if (ycVar == null && ycVar2 == null) {
            return c().equals(hcVar.c());
        }
        if (ycVar != null && ycVar2 != null) {
            return ycVar.equals(ycVar2);
        }
        if (ycVar != null) {
            hcVar.d(ycVar.d());
            return ycVar.equals(hcVar.f108529a);
        }
        d(ycVar2.d());
        return this.f108529a.equals(ycVar2);
    }

    public int hashCode() {
        return 1;
    }
}
