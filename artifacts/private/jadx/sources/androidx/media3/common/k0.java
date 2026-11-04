package androidx.media3.common;

import android.net.Uri;
import android.os.Bundle;
import com.google.common.collect.l6;
import com.google.common.collect.n6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f60813i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final k0 f60814j = new c().a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f60815k = androidx.media3.common.util.k1.c1(0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f60816l = androidx.media3.common.util.k1.c1(1);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f60817m = androidx.media3.common.util.k1.c1(2);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f60818n = androidx.media3.common.util.k1.c1(3);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f60819o = androidx.media3.common.util.k1.c1(4);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f60820p = androidx.media3.common.util.k1.c1(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    public final h f60822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.media3.common.util.b1
    @androidx.annotation.p0
    @Deprecated
    public final h f60823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f60824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q0 f60825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f60826f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.media3.common.util.b1
    @Deprecated
    public final e f60827g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f60828h;

    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f60829c = androidx.media3.common.util.k1.c1(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f60830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        public final Object f60831b;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Uri f60832a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @androidx.annotation.p0
            private Object f60833b;

            public a(Uri uri) {
                this.f60832a = uri;
            }

            public b c() {
                return new b(this);
            }

            @z7.a
            public a d(Uri uri) {
                this.f60832a = uri;
                return this;
            }

            @z7.a
            public a e(@androidx.annotation.p0 Object obj) {
                this.f60833b = obj;
                return this;
            }
        }

        @androidx.media3.common.util.b1
        public static b b(Bundle bundle) {
            Uri uri = (Uri) bundle.getParcelable(f60829c);
            androidx.media3.common.util.a.g(uri);
            return new a(uri).c();
        }

        public a a() {
            return new a(this.f60830a).e(this.f60831b);
        }

        @androidx.media3.common.util.b1
        public Bundle c() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f60829c, this.f60830a);
            return bundle;
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f60830a.equals(bVar.f60830a) && Objects.equals(this.f60831b, bVar.f60831b);
        }

        public int hashCode() {
            int iHashCode = this.f60830a.hashCode() * 31;
            Object obj = this.f60831b;
            return iHashCode + (obj != null ? obj.hashCode() : 0);
        }

        private b(a aVar) {
            this.f60830a = aVar.f60832a;
            this.f60831b = aVar.f60833b;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        private String f60834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        private Uri f60835b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        private String f60836c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private d.a f60837d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private f.a f60838e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List<StreamKey> f60839f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @androidx.annotation.p0
        private String f60840g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private l6<k> f60841h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @androidx.annotation.p0
        private b f60842i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @androidx.annotation.p0
        private Object f60843j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f60844k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @androidx.annotation.p0
        private q0 f60845l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private g.a f60846m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private i f60847n;

        @androidx.media3.common.util.b1
        @z7.a
        @Deprecated
        public c A(float f10) {
            this.f60846m.h(f10);
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        @Deprecated
        public c B(long j10) {
            this.f60846m.i(j10);
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        @Deprecated
        public c C(float f10) {
            this.f60846m.j(f10);
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        @Deprecated
        public c D(long j10) {
            this.f60846m.k(j10);
            return this;
        }

        @z7.a
        public c E(String str) {
            this.f60834a = (String) androidx.media3.common.util.a.g(str);
            return this;
        }

        @z7.a
        public c F(q0 q0Var) {
            this.f60845l = q0Var;
            return this;
        }

        @z7.a
        public c G(@androidx.annotation.p0 String str) {
            this.f60836c = str;
            return this;
        }

        @z7.a
        public c H(i iVar) {
            this.f60847n = iVar;
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public c I(@androidx.annotation.p0 List<StreamKey> list) {
            this.f60839f = (list == null || list.isEmpty()) ? Collections.EMPTY_LIST : Collections.unmodifiableList(new ArrayList(list));
            return this;
        }

        @z7.a
        public c J(List<k> list) {
            this.f60841h = l6.w(list);
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        @Deprecated
        public c K(@androidx.annotation.p0 List<j> list) {
            this.f60841h = list != null ? l6.w(list) : l6.F();
            return this;
        }

        @z7.a
        public c L(@androidx.annotation.p0 Object obj) {
            this.f60843j = obj;
            return this;
        }

        @z7.a
        public c M(@androidx.annotation.p0 Uri uri) {
            this.f60835b = uri;
            return this;
        }

        @z7.a
        public c N(@androidx.annotation.p0 String str) {
            return M(str == null ? null : Uri.parse(str));
        }

        public k0 a() {
            h hVar;
            androidx.media3.common.util.a.i(this.f60838e.f60889b == null || this.f60838e.f60888a != null);
            Uri uri = this.f60835b;
            if (uri != null) {
                hVar = new h(uri, this.f60836c, this.f60838e.f60888a != null ? this.f60838e.j() : null, this.f60842i, this.f60839f, this.f60840g, this.f60841h, this.f60843j, this.f60844k);
            } else {
                hVar = null;
            }
            String str = this.f60834a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            e eVarG = this.f60837d.g();
            g gVarF = this.f60846m.f();
            q0 q0Var = this.f60845l;
            if (q0Var == null) {
                q0Var = q0.X0;
            }
            return new k0(str2, eVarG, hVar, gVarF, q0Var, this.f60847n);
        }

        @androidx.media3.common.util.b1
        @z7.a
        @Deprecated
        public c b(@androidx.annotation.p0 Uri uri) {
            return c(uri, null);
        }

        @androidx.media3.common.util.b1
        @z7.a
        @Deprecated
        public c c(@androidx.annotation.p0 Uri uri, @androidx.annotation.p0 Object obj) {
            this.f60842i = uri != null ? new b.a(uri).e(obj).c() : null;
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        @Deprecated
        public c d(@androidx.annotation.p0 String str) {
            return b(str != null ? Uri.parse(str) : null);
        }

        @z7.a
        public c e(@androidx.annotation.p0 b bVar) {
            this.f60842i = bVar;
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        @Deprecated
        public c f(long j10) {
            this.f60837d.h(j10);
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        @Deprecated
        public c g(boolean z10) {
            this.f60837d.j(z10);
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        @Deprecated
        public c h(boolean z10) {
            this.f60837d.k(z10);
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        @Deprecated
        public c i(@androidx.annotation.g0(from = 0) long j10) {
            this.f60837d.l(j10);
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        @Deprecated
        public c j(boolean z10) {
            this.f60837d.n(z10);
            return this;
        }

        @z7.a
        public c k(d dVar) {
            this.f60837d = dVar.a();
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public c l(@androidx.annotation.p0 String str) {
            this.f60840g = str;
            return this;
        }

        @z7.a
        public c m(@androidx.annotation.p0 f fVar) {
            this.f60838e = fVar != null ? fVar.b() : new f.a();
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        @Deprecated
        public c n(boolean z10) {
            this.f60838e.l(z10);
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        @Deprecated
        public c o(@androidx.annotation.p0 byte[] bArr) {
            this.f60838e.o(bArr);
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        @Deprecated
        public c p(@androidx.annotation.p0 Map<String, String> map) {
            f.a aVar = this.f60838e;
            if (map == null) {
                map = n6.q();
            }
            aVar.p(map);
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        @Deprecated
        public c q(@androidx.annotation.p0 Uri uri) {
            this.f60838e.q(uri);
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        @Deprecated
        public c r(@androidx.annotation.p0 String str) {
            this.f60838e.r(str);
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        @Deprecated
        public c s(boolean z10) {
            this.f60838e.s(z10);
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        @Deprecated
        public c t(boolean z10) {
            this.f60838e.u(z10);
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        @Deprecated
        public c u(boolean z10) {
            this.f60838e.m(z10);
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        @Deprecated
        public c v(@androidx.annotation.p0 List<Integer> list) {
            f.a aVar = this.f60838e;
            if (list == null) {
                list = l6.F();
            }
            aVar.n(list);
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        @Deprecated
        public c w(@androidx.annotation.p0 UUID uuid) {
            this.f60838e.t(uuid);
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public c x(long j10) {
            androidx.media3.common.util.a.a(j10 > 0 || j10 == -9223372036854775807L);
            this.f60844k = j10;
            return this;
        }

        @z7.a
        public c y(g gVar) {
            this.f60846m = gVar.a();
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        @Deprecated
        public c z(long j10) {
            this.f60846m.g(j10);
            return this;
        }

        public c() {
            this.f60837d = new d.a();
            this.f60838e = new f.a();
            this.f60839f = Collections.EMPTY_LIST;
            this.f60841h = l6.F();
            this.f60846m = new g.a();
            this.f60847n = i.f60930d;
            this.f60844k = -9223372036854775807L;
        }

        private c(k0 k0Var) {
            f.a aVar;
            this();
            this.f60837d = k0Var.f60826f.a();
            this.f60834a = k0Var.f60821a;
            this.f60845l = k0Var.f60825e;
            this.f60846m = k0Var.f60824d.a();
            this.f60847n = k0Var.f60828h;
            h hVar = k0Var.f60822b;
            if (hVar != null) {
                this.f60840g = hVar.f60925f;
                this.f60836c = hVar.f60921b;
                this.f60835b = hVar.f60920a;
                this.f60839f = hVar.f60924e;
                this.f60841h = hVar.f60926g;
                this.f60843j = hVar.f60928i;
                f fVar = hVar.f60922c;
                if (fVar != null) {
                    aVar = fVar.b();
                } else {
                    aVar = new f.a();
                }
                this.f60838e = aVar;
                this.f60842i = hVar.f60923d;
                this.f60844k = hVar.f60929j;
            }
        }
    }

    public static class d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final d f60848h = new a().f();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f60849i = androidx.media3.common.util.k1.c1(0);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f60850j = androidx.media3.common.util.k1.c1(1);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f60851k = androidx.media3.common.util.k1.c1(2);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f60852l = androidx.media3.common.util.k1.c1(3);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f60853m = androidx.media3.common.util.k1.c1(4);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final String f60854n = androidx.media3.common.util.k1.c1(5);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        static final String f60855o = androidx.media3.common.util.k1.c1(6);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.g0(from = 0)
        public final long f60856a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.media3.common.util.b1
        @androidx.annotation.g0(from = 0)
        public final long f60857b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f60858c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.media3.common.util.b1
        public final long f60859d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f60860e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f60861f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f60862g;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f60863a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f60864b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private boolean f60865c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f60866d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f60867e;

            public d f() {
                return new d(this);
            }

            @androidx.media3.common.util.b1
            @Deprecated
            public e g() {
                return new e(this);
            }

            @z7.a
            public a h(long j10) {
                return i(androidx.media3.common.util.k1.D1(j10));
            }

            @androidx.media3.common.util.b1
            @z7.a
            public a i(long j10) {
                androidx.media3.common.util.a.a(j10 == Long.MIN_VALUE || j10 >= 0);
                this.f60864b = j10;
                return this;
            }

            @z7.a
            public a j(boolean z10) {
                this.f60866d = z10;
                return this;
            }

            @z7.a
            public a k(boolean z10) {
                this.f60865c = z10;
                return this;
            }

            @z7.a
            public a l(@androidx.annotation.g0(from = 0) long j10) {
                return m(androidx.media3.common.util.k1.D1(j10));
            }

            @androidx.media3.common.util.b1
            @z7.a
            public a m(@androidx.annotation.g0(from = 0) long j10) {
                androidx.media3.common.util.a.a(j10 >= 0);
                this.f60863a = j10;
                return this;
            }

            @z7.a
            public a n(boolean z10) {
                this.f60867e = z10;
                return this;
            }

            public a() {
                this.f60864b = Long.MIN_VALUE;
            }

            private a(d dVar) {
                this.f60863a = dVar.f60857b;
                this.f60864b = dVar.f60859d;
                this.f60865c = dVar.f60860e;
                this.f60866d = dVar.f60861f;
                this.f60867e = dVar.f60862g;
            }
        }

        static {
            int i10 = 6 >> 0;
        }

        @androidx.media3.common.util.b1
        public static e b(Bundle bundle) {
            a aVar = new a();
            String str = f60849i;
            d dVar = f60848h;
            a aVarN = aVar.l(bundle.getLong(str, dVar.f60856a)).h(bundle.getLong(f60850j, dVar.f60858c)).k(bundle.getBoolean(f60851k, dVar.f60860e)).j(bundle.getBoolean(f60852l, dVar.f60861f)).n(bundle.getBoolean(f60853m, dVar.f60862g));
            long j10 = bundle.getLong(f60854n, dVar.f60857b);
            if (j10 != dVar.f60857b) {
                aVarN.m(j10);
            }
            long j11 = bundle.getLong(f60855o, dVar.f60859d);
            if (j11 != dVar.f60859d) {
                aVarN.i(j11);
            }
            return aVarN.g();
        }

        public a a() {
            return new a();
        }

        @androidx.media3.common.util.b1
        public Bundle c() {
            Bundle bundle = new Bundle();
            long j10 = this.f60856a;
            d dVar = f60848h;
            if (j10 != dVar.f60856a) {
                bundle.putLong(f60849i, j10);
            }
            long j11 = this.f60858c;
            if (j11 != dVar.f60858c) {
                bundle.putLong(f60850j, j11);
            }
            long j12 = this.f60857b;
            if (j12 != dVar.f60857b) {
                bundle.putLong(f60854n, j12);
            }
            long j13 = this.f60859d;
            if (j13 != dVar.f60859d) {
                bundle.putLong(f60855o, j13);
            }
            boolean z10 = this.f60860e;
            if (z10 != dVar.f60860e) {
                bundle.putBoolean(f60851k, z10);
            }
            boolean z11 = this.f60861f;
            if (z11 != dVar.f60861f) {
                bundle.putBoolean(f60852l, z11);
            }
            boolean z12 = this.f60862g;
            if (z12 != dVar.f60862g) {
                bundle.putBoolean(f60853m, z12);
            }
            return bundle;
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f60857b == dVar.f60857b && this.f60859d == dVar.f60859d && this.f60860e == dVar.f60860e && this.f60861f == dVar.f60861f && this.f60862g == dVar.f60862g;
        }

        public int hashCode() {
            long j10 = this.f60857b;
            int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
            long j11 = this.f60859d;
            return ((((((i10 + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f60860e ? 1 : 0)) * 31) + (this.f60861f ? 1 : 0)) * 31) + (this.f60862g ? 1 : 0);
        }

        private d(a aVar) {
            this.f60856a = androidx.media3.common.util.k1.A2(aVar.f60863a);
            this.f60858c = androidx.media3.common.util.k1.A2(aVar.f60864b);
            this.f60857b = aVar.f60863a;
            this.f60859d = aVar.f60864b;
            this.f60860e = aVar.f60865c;
            this.f60861f = aVar.f60866d;
            this.f60862g = aVar.f60867e;
        }
    }

    @androidx.media3.common.util.b1
    @Deprecated
    public static final class e extends d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final e f60868p = new d.a().g();

        private e(d.a aVar) {
            super(aVar);
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f60869l = androidx.media3.common.util.k1.c1(0);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f60870m = androidx.media3.common.util.k1.c1(1);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f60871n = androidx.media3.common.util.k1.c1(2);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f60872o = androidx.media3.common.util.k1.c1(3);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @androidx.annotation.l1
        static final String f60873p = androidx.media3.common.util.k1.c1(4);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f60874q = androidx.media3.common.util.k1.c1(5);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final String f60875r = androidx.media3.common.util.k1.c1(6);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final String f60876s = androidx.media3.common.util.k1.c1(7);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f60877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.media3.common.util.b1
        @Deprecated
        public final UUID f60878b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        public final Uri f60879c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.media3.common.util.b1
        @Deprecated
        public final n6<String, String> f60880d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final n6<String, String> f60881e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f60882f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f60883g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f60884h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @androidx.media3.common.util.b1
        @Deprecated
        public final l6<Integer> f60885i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final l6<Integer> f60886j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @androidx.annotation.p0
        private final byte[] f60887k;

        static {
            int i10 = 2 ^ 2;
        }

        @androidx.media3.common.util.b1
        public static f c(Bundle bundle) {
            UUID uuidFromString = UUID.fromString((String) androidx.media3.common.util.a.g(bundle.getString(f60869l)));
            Uri uri = (Uri) bundle.getParcelable(f60870m);
            n6<String, String> n6VarB = androidx.media3.common.util.i.b(androidx.media3.common.util.i.f(bundle, f60871n, Bundle.EMPTY));
            boolean z10 = bundle.getBoolean(f60872o, false);
            boolean z11 = bundle.getBoolean(f60873p, false);
            boolean z12 = bundle.getBoolean(f60874q, false);
            l6 l6VarW = l6.w(androidx.media3.common.util.i.g(bundle, f60875r, new ArrayList()));
            return new a(uuidFromString).q(uri).p(n6VarB).s(z10).l(z12).u(z11).n(l6VarW).o(bundle.getByteArray(f60876s)).j();
        }

        public a b() {
            return new a();
        }

        @androidx.annotation.p0
        public byte[] d() {
            byte[] bArr = this.f60887k;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        @androidx.media3.common.util.b1
        public Bundle e() {
            Bundle bundle = new Bundle();
            bundle.putString(f60869l, this.f60877a.toString());
            Uri uri = this.f60879c;
            if (uri != null) {
                bundle.putParcelable(f60870m, uri);
            }
            if (!this.f60881e.isEmpty()) {
                bundle.putBundle(f60871n, androidx.media3.common.util.i.h(this.f60881e));
            }
            boolean z10 = this.f60882f;
            if (z10) {
                bundle.putBoolean(f60872o, z10);
            }
            boolean z11 = this.f60883g;
            if (z11) {
                bundle.putBoolean(f60873p, z11);
            }
            boolean z12 = this.f60884h;
            if (z12) {
                bundle.putBoolean(f60874q, z12);
            }
            if (!this.f60886j.isEmpty()) {
                bundle.putIntegerArrayList(f60875r, new ArrayList<>(this.f60886j));
            }
            byte[] bArr = this.f60887k;
            if (bArr != null) {
                bundle.putByteArray(f60876s, bArr);
            }
            return bundle;
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f60877a.equals(fVar.f60877a) && Objects.equals(this.f60879c, fVar.f60879c) && Objects.equals(this.f60881e, fVar.f60881e) && this.f60882f == fVar.f60882f && this.f60884h == fVar.f60884h && this.f60883g == fVar.f60883g && this.f60886j.equals(fVar.f60886j) && Arrays.equals(this.f60887k, fVar.f60887k);
        }

        public int hashCode() {
            int iHashCode = this.f60877a.hashCode() * 31;
            Uri uri = this.f60879c;
            return ((((((((((((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f60881e.hashCode()) * 31) + (this.f60882f ? 1 : 0)) * 31) + (this.f60884h ? 1 : 0)) * 31) + (this.f60883g ? 1 : 0)) * 31) + this.f60886j.hashCode()) * 31) + Arrays.hashCode(this.f60887k);
        }

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @androidx.annotation.p0
            private UUID f60888a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @androidx.annotation.p0
            private Uri f60889b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private n6<String, String> f60890c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f60891d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f60892e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private boolean f60893f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private l6<Integer> f60894g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            @androidx.annotation.p0
            private byte[] f60895h;

            /* JADX INFO: Access modifiers changed from: private */
            @z7.a
            @Deprecated
            public a t(@androidx.annotation.p0 UUID uuid) {
                this.f60888a = uuid;
                return this;
            }

            public f j() {
                return new f(this);
            }

            @androidx.media3.common.util.b1
            @z7.a
            @Deprecated
            @z7.m(replacement = "this.setForceSessionsForAudioAndVideoTracks(forceSessionsForAudioAndVideoTracks)")
            public a k(boolean z10) {
                return m(z10);
            }

            @z7.a
            public a l(boolean z10) {
                this.f60893f = z10;
                return this;
            }

            @z7.a
            public a m(boolean z10) {
                n(z10 ? l6.J(2, 1) : l6.F());
                return this;
            }

            @z7.a
            public a n(List<Integer> list) {
                this.f60894g = l6.w(list);
                return this;
            }

            @z7.a
            public a o(@androidx.annotation.p0 byte[] bArr) {
                this.f60895h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
                return this;
            }

            @z7.a
            public a p(Map<String, String> map) {
                this.f60890c = n6.g(map);
                return this;
            }

            @z7.a
            public a q(@androidx.annotation.p0 Uri uri) {
                this.f60889b = uri;
                return this;
            }

            @z7.a
            public a r(@androidx.annotation.p0 String str) {
                this.f60889b = str == null ? null : Uri.parse(str);
                return this;
            }

            @z7.a
            public a s(boolean z10) {
                this.f60891d = z10;
                return this;
            }

            @z7.a
            public a u(boolean z10) {
                this.f60892e = z10;
                return this;
            }

            @z7.a
            public a v(UUID uuid) {
                this.f60888a = uuid;
                return this;
            }

            public a(UUID uuid) {
                this();
                this.f60888a = uuid;
            }

            @Deprecated
            private a() {
                this.f60890c = n6.q();
                int i10 = 7 & 1;
                this.f60892e = true;
                this.f60894g = l6.F();
            }

            private a(f fVar) {
                this.f60888a = fVar.f60877a;
                this.f60889b = fVar.f60879c;
                this.f60890c = fVar.f60881e;
                this.f60891d = fVar.f60882f;
                this.f60892e = fVar.f60883g;
                this.f60893f = fVar.f60884h;
                this.f60894g = fVar.f60886j;
                this.f60895h = fVar.f60887k;
            }
        }

        private f(a aVar) {
            androidx.media3.common.util.a.i((aVar.f60893f && aVar.f60889b == null) ? false : true);
            UUID uuid = (UUID) androidx.media3.common.util.a.g(aVar.f60888a);
            this.f60877a = uuid;
            this.f60878b = uuid;
            this.f60879c = aVar.f60889b;
            this.f60880d = aVar.f60890c;
            this.f60881e = aVar.f60890c;
            this.f60882f = aVar.f60891d;
            this.f60884h = aVar.f60893f;
            this.f60883g = aVar.f60892e;
            this.f60885i = aVar.f60894g;
            this.f60886j = aVar.f60894g;
            this.f60887k = aVar.f60895h != null ? Arrays.copyOf(aVar.f60895h, aVar.f60895h.length) : null;
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final g f60896f = new a().f();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f60897g = androidx.media3.common.util.k1.c1(0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f60898h = androidx.media3.common.util.k1.c1(1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f60899i = androidx.media3.common.util.k1.c1(2);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f60900j = androidx.media3.common.util.k1.c1(3);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f60901k = androidx.media3.common.util.k1.c1(4);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f60902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f60903b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f60904c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f60905d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f60906e;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f60907a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f60908b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private long f60909c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private float f60910d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private float f60911e;

            public g f() {
                return new g(this);
            }

            @z7.a
            public a g(long j10) {
                this.f60909c = j10;
                return this;
            }

            @z7.a
            public a h(float f10) {
                this.f60911e = f10;
                return this;
            }

            @z7.a
            public a i(long j10) {
                this.f60908b = j10;
                return this;
            }

            @z7.a
            public a j(float f10) {
                this.f60910d = f10;
                return this;
            }

            @z7.a
            public a k(long j10) {
                this.f60907a = j10;
                return this;
            }

            public a() {
                this.f60907a = -9223372036854775807L;
                this.f60908b = -9223372036854775807L;
                this.f60909c = -9223372036854775807L;
                this.f60910d = -3.4028235E38f;
                this.f60911e = -3.4028235E38f;
            }

            private a(g gVar) {
                this.f60907a = gVar.f60902a;
                this.f60908b = gVar.f60903b;
                this.f60909c = gVar.f60904c;
                this.f60910d = gVar.f60905d;
                this.f60911e = gVar.f60906e;
            }
        }

        @androidx.media3.common.util.b1
        public static g b(Bundle bundle) {
            a aVar = new a();
            String str = f60897g;
            g gVar = f60896f;
            return aVar.k(bundle.getLong(str, gVar.f60902a)).i(bundle.getLong(f60898h, gVar.f60903b)).g(bundle.getLong(f60899i, gVar.f60904c)).j(bundle.getFloat(f60900j, gVar.f60905d)).h(bundle.getFloat(f60901k, gVar.f60906e)).f();
        }

        public a a() {
            return new a();
        }

        @androidx.media3.common.util.b1
        public Bundle c() {
            Bundle bundle = new Bundle();
            long j10 = this.f60902a;
            g gVar = f60896f;
            if (j10 != gVar.f60902a) {
                bundle.putLong(f60897g, j10);
            }
            long j11 = this.f60903b;
            if (j11 != gVar.f60903b) {
                bundle.putLong(f60898h, j11);
            }
            long j12 = this.f60904c;
            if (j12 != gVar.f60904c) {
                bundle.putLong(f60899i, j12);
            }
            float f10 = this.f60905d;
            if (f10 != gVar.f60905d) {
                bundle.putFloat(f60900j, f10);
            }
            float f11 = this.f60906e;
            if (f11 != gVar.f60906e) {
                bundle.putFloat(f60901k, f11);
            }
            return bundle;
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f60902a == gVar.f60902a && this.f60903b == gVar.f60903b && this.f60904c == gVar.f60904c && this.f60905d == gVar.f60905d && this.f60906e == gVar.f60906e;
        }

        public int hashCode() {
            long j10 = this.f60902a;
            long j11 = this.f60903b;
            int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f60904c;
            int i11 = (i10 + ((int) ((j12 >>> 32) ^ j12))) * 31;
            float f10 = this.f60905d;
            int i12 = 7 ^ 0;
            int iFloatToIntBits = (i11 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.f60906e;
            return iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
        }

        private g(a aVar) {
            this(aVar.f60907a, aVar.f60908b, aVar.f60909c, aVar.f60910d, aVar.f60911e);
        }

        @androidx.media3.common.util.b1
        @Deprecated
        public g(long j10, long j11, long j12, float f10, float f11) {
            this.f60902a = j10;
            this.f60903b = j11;
            this.f60904c = j12;
            this.f60905d = f10;
            this.f60906e = f11;
        }
    }

    public static final class h {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f60912k = androidx.media3.common.util.k1.c1(0);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f60913l = androidx.media3.common.util.k1.c1(1);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f60914m = androidx.media3.common.util.k1.c1(2);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f60915n = androidx.media3.common.util.k1.c1(3);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f60916o = androidx.media3.common.util.k1.c1(4);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final String f60917p = androidx.media3.common.util.k1.c1(5);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f60918q = androidx.media3.common.util.k1.c1(6);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final String f60919r = androidx.media3.common.util.k1.c1(7);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f60920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        public final String f60921b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        public final f f60922c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        public final b f60923d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.media3.common.util.b1
        public final List<StreamKey> f60924e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @androidx.media3.common.util.b1
        @androidx.annotation.p0
        public final String f60925f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final l6<k> f60926g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @androidx.media3.common.util.b1
        @Deprecated
        public final List<j> f60927h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @androidx.annotation.p0
        public final Object f60928i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @androidx.media3.common.util.b1
        public final long f60929j;

        @androidx.media3.common.util.b1
        public static h a(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(f60914m);
            f fVarC = bundle2 == null ? null : f.c(bundle2);
            Bundle bundle3 = bundle.getBundle(f60915n);
            b bVarB = bundle3 != null ? b.b(bundle3) : null;
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f60916o);
            l6 l6VarF = parcelableArrayList == null ? l6.F() : androidx.media3.common.util.i.d(new com.google.common.base.t() { // from class: androidx.media3.common.n0
                @Override // com.google.common.base.t
                public final Object apply(Object obj) {
                    return StreamKey.c((Bundle) obj);
                }
            }, parcelableArrayList);
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(f60918q);
            return new h((Uri) androidx.media3.common.util.a.g((Uri) bundle.getParcelable(f60912k)), bundle.getString(f60913l), fVarC, bVarB, l6VarF, bundle.getString(f60917p), parcelableArrayList2 == null ? l6.F() : androidx.media3.common.util.i.d(new com.google.common.base.t() { // from class: androidx.media3.common.o0
                @Override // com.google.common.base.t
                public final Object apply(Object obj) {
                    return k0.k.b((Bundle) obj);
                }
            }, parcelableArrayList2), null, bundle.getLong(f60919r, -9223372036854775807L));
        }

        @androidx.media3.common.util.b1
        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f60912k, this.f60920a);
            String str = this.f60921b;
            if (str != null) {
                bundle.putString(f60913l, str);
            }
            f fVar = this.f60922c;
            if (fVar != null) {
                bundle.putBundle(f60914m, fVar.e());
            }
            b bVar = this.f60923d;
            if (bVar != null) {
                bundle.putBundle(f60915n, bVar.c());
            }
            if (!this.f60924e.isEmpty()) {
                bundle.putParcelableArrayList(f60916o, androidx.media3.common.util.i.i(this.f60924e, new com.google.common.base.t() { // from class: androidx.media3.common.l0
                    @Override // com.google.common.base.t
                    public final Object apply(Object obj) {
                        return ((StreamKey) obj).k();
                    }
                }));
            }
            String str2 = this.f60925f;
            if (str2 != null) {
                bundle.putString(f60917p, str2);
            }
            if (!this.f60926g.isEmpty()) {
                bundle.putParcelableArrayList(f60918q, androidx.media3.common.util.i.i(this.f60926g, new com.google.common.base.t() { // from class: androidx.media3.common.m0
                    @Override // com.google.common.base.t
                    public final Object apply(Object obj) {
                        return ((k0.k) obj).c();
                    }
                }));
            }
            long j10 = this.f60929j;
            if (j10 != -9223372036854775807L) {
                bundle.putLong(f60919r, j10);
            }
            return bundle;
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f60920a.equals(hVar.f60920a) && Objects.equals(this.f60921b, hVar.f60921b) && Objects.equals(this.f60922c, hVar.f60922c) && Objects.equals(this.f60923d, hVar.f60923d) && this.f60924e.equals(hVar.f60924e) && Objects.equals(this.f60925f, hVar.f60925f) && this.f60926g.equals(hVar.f60926g) && Objects.equals(this.f60928i, hVar.f60928i) && this.f60929j == hVar.f60929j;
        }

        public int hashCode() {
            int iHashCode = this.f60920a.hashCode() * 31;
            String str = this.f60921b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.f60922c;
            int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            b bVar = this.f60923d;
            int iHashCode4 = (((iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.f60924e.hashCode()) * 31;
            String str2 = this.f60925f;
            int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f60926g.hashCode()) * 31;
            Object obj = this.f60928i;
            return (int) ((((long) (iHashCode5 + (obj != null ? obj.hashCode() : 0))) * 31) + this.f60929j);
        }

        private h(Uri uri, @androidx.annotation.p0 String str, @androidx.annotation.p0 f fVar, @androidx.annotation.p0 b bVar, List<StreamKey> list, @androidx.annotation.p0 String str2, l6<k> l6Var, @androidx.annotation.p0 Object obj, long j10) {
            this.f60920a = uri;
            this.f60921b = s0.w(str);
            this.f60922c = fVar;
            this.f60923d = bVar;
            this.f60924e = list;
            this.f60925f = str2;
            this.f60926g = l6Var;
            l6.a aVarS = l6.s();
            for (int i10 = 0; i10 < l6Var.size(); i10++) {
                aVarS.a(l6Var.get(i10).a().j());
            }
            this.f60927h = aVarS.e();
            this.f60928i = obj;
            this.f60929j = j10;
        }
    }

    public static final class i {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final i f60930d = new a().d();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f60931e = androidx.media3.common.util.k1.c1(0);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f60932f = androidx.media3.common.util.k1.c1(1);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f60933g = androidx.media3.common.util.k1.c1(2);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        public final Uri f60934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        public final String f60935b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        public final Bundle f60936c;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @androidx.annotation.p0
            private Uri f60937a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @androidx.annotation.p0
            private String f60938b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @androidx.annotation.p0
            private Bundle f60939c;

            public i d() {
                return new i(this);
            }

            @z7.a
            public a e(@androidx.annotation.p0 Bundle bundle) {
                this.f60939c = bundle;
                return this;
            }

            @z7.a
            public a f(@androidx.annotation.p0 Uri uri) {
                this.f60937a = uri;
                return this;
            }

            @z7.a
            public a g(@androidx.annotation.p0 String str) {
                this.f60938b = str;
                return this;
            }

            public a() {
            }

            private a(i iVar) {
                this.f60937a = iVar.f60934a;
                this.f60938b = iVar.f60935b;
                this.f60939c = iVar.f60936c;
            }
        }

        @androidx.media3.common.util.b1
        public static i b(Bundle bundle) {
            return new a().f((Uri) bundle.getParcelable(f60931e)).g(bundle.getString(f60932f)).e(bundle.getBundle(f60933g)).d();
        }

        public a a() {
            return new a();
        }

        @androidx.media3.common.util.b1
        public Bundle c() {
            Bundle bundle = new Bundle();
            Uri uri = this.f60934a;
            if (uri != null) {
                bundle.putParcelable(f60931e, uri);
            }
            String str = this.f60935b;
            if (str != null) {
                bundle.putString(f60932f, str);
            }
            Bundle bundle2 = this.f60936c;
            if (bundle2 != null) {
                bundle.putBundle(f60933g, bundle2);
            }
            return bundle;
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (Objects.equals(this.f60934a, iVar.f60934a) && Objects.equals(this.f60935b, iVar.f60935b)) {
                if ((this.f60936c == null) == (iVar.f60936c == null)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Uri uri = this.f60934a;
            int i10 = 0;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f60935b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            if (this.f60936c != null) {
                i10 = 1;
            }
            return iHashCode2 + i10;
        }

        private i(a aVar) {
            this.f60934a = aVar.f60937a;
            this.f60935b = aVar.f60938b;
            this.f60936c = aVar.f60939c;
        }
    }

    @androidx.media3.common.util.b1
    @Deprecated
    public static final class j extends k {
        @androidx.media3.common.util.b1
        @Deprecated
        public j(Uri uri, String str, @androidx.annotation.p0 String str2) {
            this(uri, str, str2, 0);
        }

        @androidx.media3.common.util.b1
        @Deprecated
        public j(Uri uri, String str, @androidx.annotation.p0 String str2, int i10) {
            this(uri, str, str2, i10, 0, null);
        }

        @androidx.media3.common.util.b1
        @Deprecated
        public j(Uri uri, String str, @androidx.annotation.p0 String str2, int i10, int i11, @androidx.annotation.p0 String str3) {
            super(uri, str, str2, i10, i11, str3, null);
        }

        private j(k.a aVar) {
            super(aVar);
        }
    }

    static {
        int i10 = 4 ^ 5;
    }

    @androidx.media3.common.util.b1
    public static k0 b(Bundle bundle) {
        String str = (String) androidx.media3.common.util.a.g(bundle.getString(f60815k, ""));
        Bundle bundle2 = bundle.getBundle(f60816l);
        g gVarB = bundle2 == null ? g.f60896f : g.b(bundle2);
        Bundle bundle3 = bundle.getBundle(f60817m);
        q0 q0VarB = bundle3 == null ? q0.X0 : q0.b(bundle3);
        Bundle bundle4 = bundle.getBundle(f60818n);
        e eVarB = bundle4 == null ? e.f60868p : d.b(bundle4);
        Bundle bundle5 = bundle.getBundle(f60819o);
        i iVarB = bundle5 == null ? i.f60930d : i.b(bundle5);
        Bundle bundle6 = bundle.getBundle(f60820p);
        return new k0(str, eVarB, bundle6 == null ? null : h.a(bundle6), gVarB, q0VarB, iVarB);
    }

    public static k0 c(Uri uri) {
        return new c().M(uri).a();
    }

    public static k0 d(String str) {
        return new c().N(str).a();
    }

    @androidx.media3.common.util.b1
    private Bundle f(boolean z10) {
        h hVar;
        Bundle bundle = new Bundle();
        if (!this.f60821a.equals("")) {
            bundle.putString(f60815k, this.f60821a);
        }
        if (!this.f60824d.equals(g.f60896f)) {
            bundle.putBundle(f60816l, this.f60824d.c());
        }
        if (!this.f60825e.equals(q0.X0)) {
            bundle.putBundle(f60817m, this.f60825e.e());
        }
        if (!this.f60826f.equals(d.f60848h)) {
            bundle.putBundle(f60818n, this.f60826f.c());
        }
        if (!this.f60828h.equals(i.f60930d)) {
            bundle.putBundle(f60819o, this.f60828h.c());
        }
        if (z10 && (hVar = this.f60822b) != null) {
            bundle.putBundle(f60820p, hVar.b());
        }
        return bundle;
    }

    public c a() {
        return new c();
    }

    @androidx.media3.common.util.b1
    public Bundle e() {
        return f(false);
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return Objects.equals(this.f60821a, k0Var.f60821a) && this.f60826f.equals(k0Var.f60826f) && Objects.equals(this.f60822b, k0Var.f60822b) && Objects.equals(this.f60824d, k0Var.f60824d) && Objects.equals(this.f60825e, k0Var.f60825e) && Objects.equals(this.f60828h, k0Var.f60828h);
    }

    @androidx.media3.common.util.b1
    public Bundle g() {
        return f(true);
    }

    public int hashCode() {
        int iHashCode = this.f60821a.hashCode() * 31;
        h hVar = this.f60822b;
        return ((((((((iHashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f60824d.hashCode()) * 31) + this.f60826f.hashCode()) * 31) + this.f60825e.hashCode()) * 31) + this.f60828h.hashCode();
    }

    public static class k {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f60940h = androidx.media3.common.util.k1.c1(0);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f60941i = androidx.media3.common.util.k1.c1(1);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f60942j = androidx.media3.common.util.k1.c1(2);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f60943k = androidx.media3.common.util.k1.c1(3);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f60944l = androidx.media3.common.util.k1.c1(4);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f60945m = androidx.media3.common.util.k1.c1(5);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f60946n = androidx.media3.common.util.k1.c1(6);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f60947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        public final String f60948b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        public final String f60949c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f60950d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f60951e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @androidx.annotation.p0
        public final String f60952f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @androidx.annotation.p0
        public final String f60953g;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Uri f60954a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @androidx.annotation.p0
            private String f60955b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @androidx.annotation.p0
            private String f60956c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f60957d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f60958e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            @androidx.annotation.p0
            private String f60959f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            @androidx.annotation.p0
            private String f60960g;

            /* JADX INFO: Access modifiers changed from: private */
            public j j() {
                return new j(this);
            }

            public k i() {
                return new k(this);
            }

            @z7.a
            public a k(@androidx.annotation.p0 String str) {
                this.f60960g = str;
                return this;
            }

            @z7.a
            public a l(@androidx.annotation.p0 String str) {
                this.f60959f = str;
                return this;
            }

            @z7.a
            public a m(@androidx.annotation.p0 String str) {
                this.f60956c = str;
                return this;
            }

            @z7.a
            public a n(@androidx.annotation.p0 String str) {
                this.f60955b = s0.w(str);
                return this;
            }

            @z7.a
            public a o(int i10) {
                this.f60958e = i10;
                return this;
            }

            @z7.a
            public a p(int i10) {
                this.f60957d = i10;
                return this;
            }

            @z7.a
            public a q(Uri uri) {
                this.f60954a = uri;
                return this;
            }

            public a(Uri uri) {
                this.f60954a = uri;
            }

            private a(k kVar) {
                this.f60954a = kVar.f60947a;
                this.f60955b = kVar.f60948b;
                this.f60956c = kVar.f60949c;
                this.f60957d = kVar.f60950d;
                this.f60958e = kVar.f60951e;
                this.f60959f = kVar.f60952f;
                this.f60960g = kVar.f60953g;
            }
        }

        static {
            int i10 = 3 ^ 5;
        }

        @androidx.media3.common.util.b1
        public static k b(Bundle bundle) {
            Uri uri = (Uri) androidx.media3.common.util.a.g((Uri) bundle.getParcelable(f60940h));
            String string = bundle.getString(f60941i);
            String string2 = bundle.getString(f60942j);
            int i10 = bundle.getInt(f60943k, 0);
            int i11 = bundle.getInt(f60944l, 0);
            String string3 = bundle.getString(f60945m);
            return new a(uri).n(string).m(string2).p(i10).o(i11).l(string3).k(bundle.getString(f60946n)).i();
        }

        public a a() {
            return new a();
        }

        @androidx.media3.common.util.b1
        public Bundle c() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f60940h, this.f60947a);
            String str = this.f60948b;
            if (str != null) {
                bundle.putString(f60941i, str);
            }
            String str2 = this.f60949c;
            if (str2 != null) {
                bundle.putString(f60942j, str2);
            }
            int i10 = this.f60950d;
            if (i10 != 0) {
                bundle.putInt(f60943k, i10);
            }
            int i11 = this.f60951e;
            if (i11 != 0) {
                bundle.putInt(f60944l, i11);
            }
            String str3 = this.f60952f;
            if (str3 != null) {
                bundle.putString(f60945m, str3);
            }
            String str4 = this.f60953g;
            if (str4 != null) {
                bundle.putString(f60946n, str4);
            }
            return bundle;
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.f60947a.equals(kVar.f60947a) && Objects.equals(this.f60948b, kVar.f60948b) && Objects.equals(this.f60949c, kVar.f60949c) && this.f60950d == kVar.f60950d && this.f60951e == kVar.f60951e && Objects.equals(this.f60952f, kVar.f60952f) && Objects.equals(this.f60953g, kVar.f60953g);
        }

        public int hashCode() {
            int iHashCode = this.f60947a.hashCode() * 31;
            String str = this.f60948b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f60949c;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f60950d) * 31) + this.f60951e) * 31;
            String str3 = this.f60952f;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f60953g;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        private k(Uri uri, String str, @androidx.annotation.p0 String str2, int i10, int i11, @androidx.annotation.p0 String str3, @androidx.annotation.p0 String str4) {
            this.f60947a = uri;
            this.f60948b = s0.w(str);
            this.f60949c = str2;
            this.f60950d = i10;
            this.f60951e = i11;
            this.f60952f = str3;
            this.f60953g = str4;
        }

        private k(a aVar) {
            this.f60947a = aVar.f60954a;
            this.f60948b = aVar.f60955b;
            this.f60949c = aVar.f60956c;
            this.f60950d = aVar.f60957d;
            this.f60951e = aVar.f60958e;
            this.f60952f = aVar.f60959f;
            this.f60953g = aVar.f60960g;
        }
    }

    private k0(String str, e eVar, @androidx.annotation.p0 h hVar, g gVar, q0 q0Var, i iVar) {
        this.f60821a = str;
        this.f60822b = hVar;
        this.f60823c = hVar;
        this.f60824d = gVar;
        this.f60825e = q0Var;
        this.f60826f = eVar;
        this.f60827g = eVar;
        this.f60828h = iVar;
    }
}
