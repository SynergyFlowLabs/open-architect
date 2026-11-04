package androidx.media3.exoplayer;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f63927f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f63928g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f63929h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f63930i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f63931j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f63932k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f63933l = 4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f63934m = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f63935n = 16;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f63936o = 32;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f63937p = 64;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f63938q = 128;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f63939r = 256;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f63940s = 512;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f63941t = 1024;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f63942u = 2048;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f63943v = 4096;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f63944w = 8192;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f63945x = 16384;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f63946y = 32768;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.media3.common.w f63948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.media3.common.w f63949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f63950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f63951e;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public k(String str, androidx.media3.common.w wVar, androidx.media3.common.w wVar2, int i10, int i11) {
        androidx.media3.common.util.a.a(i10 == 0 || i11 == 0);
        this.f63947a = androidx.media3.common.util.a.e(str);
        this.f63948b = (androidx.media3.common.w) androidx.media3.common.util.a.g(wVar);
        this.f63949c = (androidx.media3.common.w) androidx.media3.common.util.a.g(wVar2);
        this.f63950d = i10;
        this.f63951e = i11;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (this.f63950d == kVar.f63950d && this.f63951e == kVar.f63951e && this.f63947a.equals(kVar.f63947a) && this.f63948b.equals(kVar.f63948b) && this.f63949c.equals(kVar.f63949c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f63950d) * 31) + this.f63951e) * 31) + this.f63947a.hashCode()) * 31) + this.f63948b.hashCode()) * 31) + this.f63949c.hashCode();
    }
}
