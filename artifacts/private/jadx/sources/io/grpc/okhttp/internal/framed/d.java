package io.grpc.okhttp.internal.framed;

import okio.o;

/* JADX INFO: loaded from: classes13.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f290503d = o.x(okhttp3.internal.http2.c.f334266f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o f290504e = o.x(okhttp3.internal.http2.c.f334267g);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o f290505f = o.x(okhttp3.internal.http2.c.f334268h);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final o f290506g = o.x(okhttp3.internal.http2.c.f334269i);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final o f290507h = o.x(okhttp3.internal.http2.c.f334270j);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final o f290508i = o.x(":host");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final o f290509j = o.x(":version");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f290510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f290511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f290512c;

    public d(String str, String str2) {
        this(o.x(str), o.x(str2));
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f290510a.equals(dVar.f290510a) && this.f290511b.equals(dVar.f290511b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f290510a.hashCode()) * 31) + this.f290511b.hashCode();
    }

    public String toString() {
        return String.format("%s: %s", this.f290510a.G0(), this.f290511b.G0());
    }

    public d(o oVar, String str) {
        this(oVar, o.x(str));
    }

    public d(o oVar, o oVar2) {
        this.f290510a = oVar;
        this.f290511b = oVar2;
        this.f290512c = oVar.v0() + 32 + oVar2.v0();
    }
}
