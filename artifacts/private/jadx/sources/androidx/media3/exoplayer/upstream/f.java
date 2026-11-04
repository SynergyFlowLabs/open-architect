package androidx.media3.exoplayer.upstream;

import androidx.annotation.p0;
import androidx.media3.common.k0;
import androidx.media3.common.util.b1;
import com.google.common.collect.m6;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class f {
    public static final String A = "nor";
    public static final String B = "nrr";
    public static final int C = 0;
    public static final int D = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f65965e = 64;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f65966f = "CMCD-Object";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f65967g = "CMCD-Request";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f65968h = "CMCD-Session";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f65969i = "CMCD-Status";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f65970j = "CMCD";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f65971k = "br";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f65972l = "bl";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f65973m = "cid";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f65974n = "sid";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f65975o = "rtp";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f65976p = "sf";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f65977q = "st";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f65978r = "v";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f65979s = "tb";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f65980t = "d";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f65981u = "mtp";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f65982v = "ot";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f65983w = "bs";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f65984x = "dl";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f65985y = "pr";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f65986z = "su";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    public final String f65987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public final String f65988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f65989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f65990d;

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

    public interface c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f65991a = new c() { // from class: androidx.media3.exoplayer.upstream.g
            @Override // androidx.media3.exoplayer.upstream.f.c
            public final f b(k0 k0Var) {
                return f.c.a(k0Var);
            }
        };

        class a implements e {
            a() {
            }
        }

        static /* synthetic */ f a(k0 k0Var) {
            String string = UUID.randomUUID().toString();
            String str = k0Var.f60821a;
            if (str == null) {
                str = "";
            }
            return new f(string, str, new a());
        }

        f b(k0 k0Var);
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    public interface e {
        default boolean a(String str) {
            return true;
        }

        default m6<String, String> b() {
            return m6.X();
        }

        default int c(int i10) {
            return androidx.media3.common.j.f60676f;
        }
    }

    public f(@p0 String str, @p0 String str2, e eVar) {
        this(str, str2, eVar, 0);
    }

    public boolean a() {
        return this.f65989c.a("br");
    }

    public boolean b() {
        return this.f65989c.a(f65972l);
    }

    public boolean c() {
        return this.f65989c.a("bs");
    }

    public boolean d() {
        return this.f65989c.a(f65973m);
    }

    public boolean e() {
        return this.f65989c.a(f65984x);
    }

    public boolean f() {
        return this.f65989c.a(f65975o);
    }

    public boolean g() {
        return this.f65989c.a(f65981u);
    }

    public boolean h() {
        return this.f65989c.a(A);
    }

    public boolean i() {
        return this.f65989c.a(B);
    }

    public boolean j() {
        return this.f65989c.a("d");
    }

    public boolean k() {
        return this.f65989c.a(f65982v);
    }

    public boolean l() {
        return this.f65989c.a("pr");
    }

    public boolean m() {
        return this.f65989c.a("sid");
    }

    public boolean n() {
        return this.f65989c.a(f65986z);
    }

    public boolean o() {
        return this.f65989c.a("st");
    }

    public boolean p() {
        return this.f65989c.a(f65976p);
    }

    public boolean q() {
        return this.f65989c.a("tb");
    }

    public f(@p0 String str, @p0 String str2, e eVar, int i10) {
        boolean z10 = true;
        androidx.media3.common.util.a.a(str == null || str.length() <= 64);
        if (str2 != null && str2.length() > 64) {
            z10 = false;
        }
        androidx.media3.common.util.a.a(z10);
        androidx.media3.common.util.a.g(eVar);
        this.f65987a = str;
        this.f65988b = str2;
        this.f65989c = eVar;
        this.f65990d = i10;
    }
}
