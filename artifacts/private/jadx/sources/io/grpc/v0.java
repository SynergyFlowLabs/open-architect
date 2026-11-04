package io.grpc;

import java.net.SocketAddress;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes13.dex */
@t0
public final class v0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f291172f = Logger.getLogger(v0.class.getName());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final v0 f291173g = new v0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ boolean f291174h = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentNavigableMap<Long, a1<j>> f291175a = new ConcurrentSkipListMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentNavigableMap<Long, a1<b>> f291176b = new ConcurrentSkipListMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConcurrentMap<Long, a1<b>> f291177c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ConcurrentMap<Long, a1<l>> f291178d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ConcurrentMap<Long, h> f291179e = new ConcurrentHashMap();

    @gj.b
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f291180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u f291181b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @fj.h
        public final c f291182c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f291183d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f291184e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f291185f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f291186g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List<m1> f291187h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final List<m1> f291188i;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f291189a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private u f291190b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private c f291191c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private long f291192d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private long f291193e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private long f291194f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private long f291195g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private List<m1> f291196h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private List<m1> f291197i;

            public a() {
                List<m1> list = Collections.EMPTY_LIST;
                this.f291196h = list;
                this.f291197i = list;
            }

            public b a() {
                return new b(this.f291189a, this.f291190b, this.f291191c, this.f291192d, this.f291193e, this.f291194f, this.f291195g, this.f291196h, this.f291197i);
            }

            public a b(long j10) {
                this.f291194f = j10;
                return this;
            }

            public a c(long j10) {
                this.f291192d = j10;
                return this;
            }

            public a d(long j10) {
                this.f291193e = j10;
                return this;
            }

            public a e(c cVar) {
                this.f291191c = cVar;
                return this;
            }

            public a f(long j10) {
                this.f291195g = j10;
                return this;
            }

            public a g(List<m1> list) {
                com.google.common.base.j0.g0(this.f291196h.isEmpty());
                this.f291197i = Collections.unmodifiableList((List) com.google.common.base.j0.E(list));
                return this;
            }

            public a h(u uVar) {
                this.f291190b = uVar;
                return this;
            }

            public a i(List<m1> list) {
                com.google.common.base.j0.g0(this.f291197i.isEmpty());
                this.f291196h = Collections.unmodifiableList((List) com.google.common.base.j0.E(list));
                return this;
            }

            public a j(String str) {
                this.f291189a = str;
                return this;
            }
        }

        private b(String str, u uVar, @fj.h c cVar, long j10, long j11, long j12, long j13, List<m1> list, List<m1> list2) {
            com.google.common.base.j0.h0(list.isEmpty() || list2.isEmpty(), "channels can have subchannels only, subchannels can have either sockets OR subchannels, neither can have both");
            this.f291180a = str;
            this.f291181b = uVar;
            this.f291182c = cVar;
            this.f291183d = j10;
            this.f291184e = j11;
            this.f291185f = j12;
            this.f291186g = j13;
            this.f291187h = (List) com.google.common.base.j0.E(list);
            this.f291188i = (List) com.google.common.base.j0.E(list2);
        }
    }

    @gj.b
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f291198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f291199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<b> f291200c;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Long f291201a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Long f291202b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private List<b> f291203c = Collections.EMPTY_LIST;

            public c a() {
                com.google.common.base.j0.F(this.f291201a, "numEventsLogged");
                com.google.common.base.j0.F(this.f291202b, "creationTimeNanos");
                return new c(this.f291201a.longValue(), this.f291202b.longValue(), this.f291203c);
            }

            public a b(long j10) {
                this.f291202b = Long.valueOf(j10);
                return this;
            }

            public a c(List<b> list) {
                this.f291203c = Collections.unmodifiableList(new ArrayList(list));
                return this;
            }

            public a d(long j10) {
                this.f291201a = Long.valueOf(j10);
                return this;
            }
        }

        @gj.b
        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f291204a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final EnumC1995b f291205b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final long f291206c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @fj.h
            public final m1 f291207d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            @fj.h
            public final m1 f291208e;

            public static final class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private String f291209a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private EnumC1995b f291210b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private Long f291211c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private m1 f291212d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private m1 f291213e;

                public b a() {
                    com.google.common.base.j0.F(this.f291209a, "description");
                    com.google.common.base.j0.F(this.f291210b, "severity");
                    com.google.common.base.j0.F(this.f291211c, "timestampNanos");
                    com.google.common.base.j0.h0(this.f291212d == null || this.f291213e == null, "at least one of channelRef and subchannelRef must be null");
                    return new b(this.f291209a, this.f291210b, this.f291211c.longValue(), this.f291212d, this.f291213e);
                }

                public a b(m1 m1Var) {
                    this.f291212d = m1Var;
                    return this;
                }

                public a c(String str) {
                    this.f291209a = str;
                    return this;
                }

                public a d(EnumC1995b enumC1995b) {
                    this.f291210b = enumC1995b;
                    return this;
                }

                public a e(m1 m1Var) {
                    this.f291213e = m1Var;
                    return this;
                }

                public a f(long j10) {
                    this.f291211c = Long.valueOf(j10);
                    return this;
                }
            }

            /* JADX INFO: renamed from: io.grpc.v0$c$b$b, reason: collision with other inner class name */
            public enum EnumC1995b {
                CT_UNKNOWN,
                CT_INFO,
                CT_WARNING,
                CT_ERROR;

                static {
                    int i10 = 6 ^ 3;
                }
            }

            public boolean equals(Object obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (com.google.common.base.d0.a(this.f291204a, bVar.f291204a) && com.google.common.base.d0.a(this.f291205b, bVar.f291205b) && this.f291206c == bVar.f291206c && com.google.common.base.d0.a(this.f291207d, bVar.f291207d) && com.google.common.base.d0.a(this.f291208e, bVar.f291208e)) {
                        return true;
                    }
                }
                return false;
            }

            public int hashCode() {
                return com.google.common.base.d0.b(this.f291204a, this.f291205b, Long.valueOf(this.f291206c), this.f291207d, this.f291208e);
            }

            public String toString() {
                return com.google.common.base.b0.c(this).f("description", this.f291204a).f("severity", this.f291205b).e("timestampNanos", this.f291206c).f("channelRef", this.f291207d).f("subchannelRef", this.f291208e).toString();
            }

            private b(String str, EnumC1995b enumC1995b, long j10, @fj.h m1 m1Var, @fj.h m1 m1Var2) {
                this.f291204a = str;
                this.f291205b = (EnumC1995b) com.google.common.base.j0.F(enumC1995b, "severity");
                this.f291206c = j10;
                this.f291207d = m1Var;
                this.f291208e = m1Var2;
            }
        }

        private c(long j10, long j11, List<b> list) {
            this.f291198a = j10;
            this.f291199b = j11;
            this.f291200c = list;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f291219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @fj.h
        public final Object f291220b;

        public d(String str, @fj.h Object obj) {
            this.f291219a = (String) com.google.common.base.j0.E(str);
            com.google.common.base.j0.h0(obj == null || obj.getClass().getName().endsWith("com.google.protobuf.Any"), "the 'any' object must be of type com.google.protobuf.Any");
            this.f291220b = obj;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<a1<b>> f291221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f291222b;

        public e(List<a1<b>> list, boolean z10) {
            this.f291221a = (List) com.google.common.base.j0.E(list);
            this.f291222b = z10;
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<a1<j>> f291225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f291226b;

        public g(List<a1<j>> list, boolean z10) {
            this.f291225a = (List) com.google.common.base.j0.E(list);
            this.f291226b = z10;
        }
    }

    private static final class h extends ConcurrentSkipListMap<Long, a1<l>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final long f291227a = -7883772124944661414L;

        private h() {
        }
    }

    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<m1> f291228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f291229b;

        public i(List<m1> list, boolean z10) {
            this.f291228a = list;
            this.f291229b = z10;
        }
    }

    @gj.b
    public static final class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f291230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f291231b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f291232c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f291233d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<a1<l>> f291234e;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f291235a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f291236b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private long f291237c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private long f291238d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public List<a1<l>> f291239e = new ArrayList();

            public a a(List<a1<l>> list) {
                com.google.common.base.j0.F(list, "listenSockets");
                Iterator<a1<l>> it = list.iterator();
                while (it.hasNext()) {
                    this.f291239e.add((a1) com.google.common.base.j0.F(it.next(), "null listen socket"));
                }
                return this;
            }

            public j b() {
                return new j(this.f291235a, this.f291236b, this.f291237c, this.f291238d, this.f291239e);
            }

            public a c(long j10) {
                this.f291237c = j10;
                return this;
            }

            public a d(long j10) {
                this.f291235a = j10;
                return this;
            }

            public a e(long j10) {
                this.f291236b = j10;
                return this;
            }

            public a f(long j10) {
                this.f291238d = j10;
                return this;
            }
        }

        public j(long j10, long j11, long j12, long j13, List<a1<l>> list) {
            this.f291230a = j10;
            this.f291231b = j11;
            this.f291232c = j12;
            this.f291233d = j13;
            this.f291234e = (List) com.google.common.base.j0.E(list);
        }
    }

    public static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<String, String> f291240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @fj.h
        public final Integer f291241b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @fj.h
        public final Integer f291242c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @fj.h
        public final m f291243d;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Map<String, String> f291244a = new HashMap();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private m f291245b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Integer f291246c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private Integer f291247d;

            public a a(String str, int i10) {
                this.f291244a.put(str, Integer.toString(i10));
                return this;
            }

            public a b(String str, String str2) {
                this.f291244a.put(str, (String) com.google.common.base.j0.E(str2));
                return this;
            }

            public a c(String str, boolean z10) {
                this.f291244a.put(str, Boolean.toString(z10));
                return this;
            }

            public k d() {
                return new k(this.f291246c, this.f291247d, this.f291245b, this.f291244a);
            }

            public a e(Integer num) {
                this.f291247d = num;
                return this;
            }

            public a f(Integer num) {
                this.f291246c = num;
                return this;
            }

            public a g(m mVar) {
                this.f291245b = mVar;
                return this;
            }
        }

        public k(@fj.h Integer num, @fj.h Integer num2, @fj.h m mVar, Map<String, String> map) {
            com.google.common.base.j0.E(map);
            this.f291241b = num;
            this.f291242c = num2;
            this.f291243d = mVar;
            this.f291240a = Collections.unmodifiableMap(new HashMap(map));
        }
    }

    public static final class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @fj.h
        public final o f291248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @fj.h
        public final SocketAddress f291249b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @fj.h
        public final SocketAddress f291250c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final k f291251d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @fj.h
        public final f f291252e;

        public l(o oVar, @fj.h SocketAddress socketAddress, @fj.h SocketAddress socketAddress2, k kVar, f fVar) {
            this.f291248a = oVar;
            this.f291249b = (SocketAddress) com.google.common.base.j0.F(socketAddress, "local socket");
            this.f291250c = socketAddress2;
            this.f291251d = (k) com.google.common.base.j0.E(kVar);
            this.f291252e = fVar;
        }
    }

    public static final class m {
        public final int A;
        public final int B;
        public final int C;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f291253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f291254b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f291255c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f291256d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f291257e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f291258f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f291259g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f291260h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f291261i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f291262j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f291263k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f291264l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f291265m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f291266n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f291267o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f291268p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f291269q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f291270r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f291271s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f291272t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final int f291273u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final int f291274v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final int f291275w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final int f291276x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final int f291277y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final int f291278z;

        public static final class a {
            private int A;
            private int B;
            private int C;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f291279a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f291280b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f291281c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f291282d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f291283e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f291284f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f291285g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private int f291286h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private int f291287i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private int f291288j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private int f291289k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private int f291290l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private int f291291m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private int f291292n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private int f291293o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private int f291294p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            private int f291295q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private int f291296r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            private int f291297s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private int f291298t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            private int f291299u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            private int f291300v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            private int f291301w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            private int f291302x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            private int f291303y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            private int f291304z;

            public a A(int i10) {
                this.f291304z = i10;
                return this;
            }

            public a B(int i10) {
                this.f291285g = i10;
                return this;
            }

            public a C(int i10) {
                this.f291279a = i10;
                return this;
            }

            public a D(int i10) {
                this.f291291m = i10;
                return this;
            }

            public m a() {
                return new m(this.f291279a, this.f291280b, this.f291281c, this.f291282d, this.f291283e, this.f291284f, this.f291285g, this.f291286h, this.f291287i, this.f291288j, this.f291289k, this.f291290l, this.f291291m, this.f291292n, this.f291293o, this.f291294p, this.f291295q, this.f291296r, this.f291297s, this.f291298t, this.f291299u, this.f291300v, this.f291301w, this.f291302x, this.f291303y, this.f291304z, this.A, this.B, this.C);
            }

            public a b(int i10) {
                this.B = i10;
                return this;
            }

            public a c(int i10) {
                this.f291288j = i10;
                return this;
            }

            public a d(int i10) {
                this.f291283e = i10;
                return this;
            }

            public a e(int i10) {
                this.f291280b = i10;
                return this;
            }

            public a f(int i10) {
                this.f291295q = i10;
                return this;
            }

            public a g(int i10) {
                this.f291299u = i10;
                return this;
            }

            public a h(int i10) {
                this.f291297s = i10;
                return this;
            }

            public a i(int i10) {
                this.f291298t = i10;
                return this;
            }

            public a j(int i10) {
                this.f291296r = i10;
                return this;
            }

            public a k(int i10) {
                this.f291293o = i10;
                return this;
            }

            public a l(int i10) {
                this.f291284f = i10;
                return this;
            }

            public a m(int i10) {
                this.f291300v = i10;
                return this;
            }

            public a n(int i10) {
                this.f291282d = i10;
                return this;
            }

            public a o(int i10) {
                this.f291290l = i10;
                return this;
            }

            public a p(int i10) {
                this.f291301w = i10;
                return this;
            }

            public a q(int i10) {
                this.f291286h = i10;
                return this;
            }

            public a r(int i10) {
                this.C = i10;
                return this;
            }

            public a s(int i10) {
                this.f291294p = i10;
                return this;
            }

            public a t(int i10) {
                this.f291281c = i10;
                return this;
            }

            public a u(int i10) {
                this.f291287i = i10;
                return this;
            }

            public a v(int i10) {
                this.f291302x = i10;
                return this;
            }

            public a w(int i10) {
                this.f291303y = i10;
                return this;
            }

            public a x(int i10) {
                this.f291292n = i10;
                return this;
            }

            public a y(int i10) {
                this.A = i10;
                return this;
            }

            public a z(int i10) {
                this.f291289k = i10;
                return this;
            }
        }

        m(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, int i37, int i38) {
            this.f291253a = i10;
            this.f291254b = i11;
            this.f291255c = i12;
            this.f291256d = i13;
            this.f291257e = i14;
            this.f291258f = i15;
            this.f291259g = i16;
            this.f291260h = i17;
            this.f291261i = i18;
            this.f291262j = i19;
            this.f291263k = i20;
            this.f291264l = i21;
            this.f291265m = i22;
            this.f291266n = i23;
            this.f291267o = i24;
            this.f291268p = i25;
            this.f291269q = i26;
            this.f291270r = i27;
            this.f291271s = i28;
            this.f291272t = i29;
            this.f291273u = i30;
            this.f291274v = i31;
            this.f291275w = i32;
            this.f291276x = i33;
            this.f291277y = i34;
            this.f291278z = i35;
            this.A = i36;
            this.B = i37;
            this.C = i38;
        }
    }

    @gj.b
    public static final class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f291308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f291309b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f291310c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f291311d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f291312e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f291313f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f291314g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f291315h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f291316i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f291317j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final long f291318k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final long f291319l;

        public o(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
            this.f291308a = j10;
            this.f291309b = j11;
            this.f291310c = j12;
            this.f291311d = j13;
            this.f291312e = j14;
            this.f291313f = j15;
            this.f291314g = j16;
            this.f291315h = j17;
            this.f291316i = j18;
            this.f291317j = j19;
            this.f291318k = j20;
            this.f291319l = j21;
        }
    }

    @com.google.common.annotations.e
    public v0() {
    }

    private static <T extends a1<?>> void b(Map<Long, T> map, T t10) {
        map.put(Long.valueOf(t10.c().e()), t10);
    }

    private static <T extends a1<?>> boolean i(Map<Long, T> map, c1 c1Var) {
        return map.containsKey(Long.valueOf(c1Var.e()));
    }

    private a1<l> q(long j10) {
        Iterator<h> it = this.f291179e.values().iterator();
        while (it.hasNext()) {
            a1<l> a1Var = it.next().get(Long.valueOf(j10));
            if (a1Var != null) {
                return a1Var;
            }
        }
        return null;
    }

    public static long v(m1 m1Var) {
        return m1Var.c().e();
    }

    public static v0 w() {
        return f291173g;
    }

    private static <T extends a1<?>> void x(Map<Long, T> map, T t10) {
        map.remove(Long.valueOf(v(t10)));
    }

    public void A(a1<b> a1Var) {
        x(this.f291176b, a1Var);
    }

    public void B(a1<j> a1Var) {
        x(this.f291175a, a1Var);
        this.f291179e.remove(Long.valueOf(v(a1Var)));
    }

    public void C(a1<j> a1Var, a1<l> a1Var2) {
        x(this.f291179e.get(Long.valueOf(v(a1Var))), a1Var2);
    }

    public void D(a1<b> a1Var) {
        x(this.f291177c, a1Var);
    }

    public void c(a1<l> a1Var) {
        b(this.f291178d, a1Var);
    }

    public void d(a1<l> a1Var) {
        b(this.f291178d, a1Var);
    }

    public void e(a1<b> a1Var) {
        b(this.f291176b, a1Var);
    }

    public void f(a1<j> a1Var) {
        this.f291179e.put(Long.valueOf(v(a1Var)), new h());
        b(this.f291175a, a1Var);
    }

    public void g(a1<j> a1Var, a1<l> a1Var2) {
        b(this.f291179e.get(Long.valueOf(v(a1Var))), a1Var2);
    }

    public void h(a1<b> a1Var) {
        b(this.f291177c, a1Var);
    }

    @com.google.common.annotations.e
    public boolean j(c1 c1Var) {
        return i(this.f291178d, c1Var);
    }

    @com.google.common.annotations.e
    public boolean k(c1 c1Var) {
        return i(this.f291175a, c1Var);
    }

    @com.google.common.annotations.e
    public boolean l(c1 c1Var) {
        return i(this.f291177c, c1Var);
    }

    @fj.h
    public a1<b> m(long j10) {
        return this.f291176b.get(Long.valueOf(j10));
    }

    public a1<b> n(long j10) {
        return this.f291176b.get(Long.valueOf(j10));
    }

    public e o(long j10, int i10) {
        ArrayList arrayList = new ArrayList();
        Iterator<a1<b>> it = this.f291176b.tailMap(Long.valueOf(j10)).values().iterator();
        while (it.hasNext() && arrayList.size() < i10) {
            arrayList.add(it.next());
        }
        return new e(arrayList, !it.hasNext());
    }

    @fj.h
    public a1<j> p(long j10) {
        return this.f291175a.get(Long.valueOf(j10));
    }

    @fj.h
    public i r(long j10, long j11, int i10) {
        h hVar = this.f291179e.get(Long.valueOf(j10));
        if (hVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i10);
        Iterator<a1<l>> it = hVar.tailMap(Long.valueOf(j11)).values().iterator();
        while (arrayList.size() < i10 && it.hasNext()) {
            arrayList.add(it.next());
        }
        return new i(arrayList, !it.hasNext());
    }

    public g s(long j10, int i10) {
        ArrayList arrayList = new ArrayList(i10);
        Iterator<a1<j>> it = this.f291175a.tailMap(Long.valueOf(j10)).values().iterator();
        while (it.hasNext() && arrayList.size() < i10) {
            arrayList.add(it.next());
        }
        return new g(arrayList, !it.hasNext());
    }

    @fj.h
    public a1<l> t(long j10) {
        a1<l> a1Var = this.f291178d.get(Long.valueOf(j10));
        return a1Var != null ? a1Var : q(j10);
    }

    @fj.h
    public a1<b> u(long j10) {
        return this.f291177c.get(Long.valueOf(j10));
    }

    public void y(a1<l> a1Var) {
        x(this.f291178d, a1Var);
    }

    public void z(a1<l> a1Var) {
        x(this.f291178d, a1Var);
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @fj.h
        public final n f291223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @fj.h
        public final d f291224b;

        public f(n nVar) {
            this.f291223a = (n) com.google.common.base.j0.E(nVar);
            this.f291224b = null;
        }

        public f(d dVar) {
            this.f291223a = null;
            this.f291224b = (d) com.google.common.base.j0.E(dVar);
        }
    }

    @gj.b
    public static final class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f291305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @fj.h
        public final Certificate f291306b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @fj.h
        public final Certificate f291307c;

        public n(String str, Certificate certificate, Certificate certificate2) {
            this.f291305a = str;
            this.f291306b = certificate;
            this.f291307c = certificate2;
        }

        public n(SSLSession sSLSession) {
            String cipherSuite = sSLSession.getCipherSuite();
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            Certificate certificate = null;
            Certificate certificate2 = localCertificates != null ? localCertificates[0] : null;
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                if (peerCertificates != null) {
                    certificate = peerCertificates[0];
                }
            } catch (SSLPeerUnverifiedException e10) {
                v0.f291172f.log(Level.FINE, String.format("Peer cert not available for peerHost=%s", sSLSession.getPeerHost()), (Throwable) e10);
            }
            this.f291305a = cipherSuite;
            this.f291306b = certificate2;
            this.f291307c = certificate;
        }
    }
}
