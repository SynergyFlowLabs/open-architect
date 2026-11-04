package com.google.firebase.perf.v1;

import com.google.protobuf.f3;
import com.google.protobuf.l1;
import com.google.protobuf.s1;
import com.google.protobuf.t1;
import com.google.protobuf.v0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends l1<o, b> implements p {
    private static final o DEFAULT_INSTANCE;
    public static final int MOBILE_SUBTYPE_FIELD_NUMBER = 2;
    public static final int NETWORK_TYPE_FIELD_NUMBER = 1;
    private static volatile f3<o> PARSER;
    private int bitField0_;
    private int mobileSubtype_;
    private int networkType_ = -1;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f124273a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f124273a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f124273a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f124273a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f124273a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f124273a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f124273a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f124273a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<o, b> implements p {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.firebase.perf.v1.p
        public boolean Cf() {
            return ((o) this.f126038b).Cf();
        }

        public b Ol() {
            El();
            ((o) this.f126038b).em();
            return this;
        }

        public b Pl() {
            El();
            ((o) this.f126038b).fm();
            return this;
        }

        public b Ql(c cVar) {
            El();
            ((o) this.f126038b).wm(cVar);
            return this;
        }

        public b Rl(d dVar) {
            El();
            ((o) this.f126038b).xm(dVar);
            return this;
        }

        @Override // com.google.firebase.perf.v1.p
        public d bj() {
            return ((o) this.f126038b).bj();
        }

        @Override // com.google.firebase.perf.v1.p
        public boolean ej() {
            return ((o) this.f126038b).ej();
        }

        @Override // com.google.firebase.perf.v1.p
        public c zd() {
            return ((o) this.f126038b).zd();
        }

        private b() {
            super(o.DEFAULT_INSTANCE);
        }
    }

    public enum c implements s1.c {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);

        public static final int H1 = 2;

        /* JADX INFO: renamed from: g3, reason: collision with root package name */
        public static final int f124280g3 = 4;

        /* JADX INFO: renamed from: h3, reason: collision with root package name */
        public static final int f124282h3 = 5;

        /* JADX INFO: renamed from: i3, reason: collision with root package name */
        public static final int f124284i3 = 6;

        /* JADX INFO: renamed from: j3, reason: collision with root package name */
        public static final int f124286j3 = 7;

        /* JADX INFO: renamed from: k3, reason: collision with root package name */
        public static final int f124288k3 = 8;

        /* JADX INFO: renamed from: l3, reason: collision with root package name */
        public static final int f124290l3 = 9;

        /* JADX INFO: renamed from: m3, reason: collision with root package name */
        public static final int f124292m3 = 10;

        /* JADX INFO: renamed from: n3, reason: collision with root package name */
        public static final int f124294n3 = 11;

        /* JADX INFO: renamed from: o3, reason: collision with root package name */
        public static final int f124296o3 = 12;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final int f124297p0 = 0;

        /* JADX INFO: renamed from: p1, reason: collision with root package name */
        public static final int f124298p1 = 1;

        /* JADX INFO: renamed from: p2, reason: collision with root package name */
        public static final int f124299p2 = 3;

        /* JADX INFO: renamed from: p3, reason: collision with root package name */
        public static final int f124300p3 = 13;

        /* JADX INFO: renamed from: q3, reason: collision with root package name */
        public static final int f124301q3 = 14;

        /* JADX INFO: renamed from: r3, reason: collision with root package name */
        public static final int f124302r3 = 15;

        /* JADX INFO: renamed from: s3, reason: collision with root package name */
        public static final int f124304s3 = 16;

        /* JADX INFO: renamed from: t3, reason: collision with root package name */
        public static final int f124306t3 = 17;

        /* JADX INFO: renamed from: u3, reason: collision with root package name */
        public static final int f124307u3 = 18;

        /* JADX INFO: renamed from: v3, reason: collision with root package name */
        public static final int f124309v3 = 19;

        /* JADX INFO: renamed from: w3, reason: collision with root package name */
        public static final int f124311w3 = 100;

        /* JADX INFO: renamed from: x3, reason: collision with root package name */
        private static final s1.d<c> f124312x3 = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f124314a;

        class a implements s1.d<c> {
            a() {
            }

            @Override // com.google.protobuf.s1.d
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c a(int i10) {
                return c.l(i10);
            }
        }

        private static final class b implements s1.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final s1.e f124315a = new b();

            private b() {
            }

            @Override // com.google.protobuf.s1.e
            public boolean a(int i10) {
                return c.l(i10) != null;
            }
        }

        static {
            int i10 = 4 ^ 6;
        }

        c(int i10) {
            this.f124314a = i10;
        }

        public static c l(int i10) {
            if (i10 == 100) {
                return COMBINED;
            }
            switch (i10) {
                case 0:
                    return UNKNOWN_MOBILE_SUBTYPE;
                case 1:
                    return GPRS;
                case 2:
                    return EDGE;
                case 3:
                    return UMTS;
                case 4:
                    return CDMA;
                case 5:
                    return EVDO_0;
                case 6:
                    return EVDO_A;
                case 7:
                    return RTT;
                case 8:
                    return HSDPA;
                case 9:
                    return HSUPA;
                case 10:
                    return HSPA;
                case 11:
                    return IDEN;
                case 12:
                    return EVDO_B;
                case 13:
                    return LTE;
                case 14:
                    return EHRPD;
                case 15:
                    return HSPAP;
                case 16:
                    return GSM;
                case 17:
                    return TD_SCDMA;
                case 18:
                    return IWLAN;
                case 19:
                    return LTE_CA;
                default:
                    return null;
            }
        }

        public static s1.d<c> n() {
            return f124312x3;
        }

        public static s1.e o() {
            return b.f124315a;
        }

        @Deprecated
        public static c p(int i10) {
            return l(i10);
        }

        @Override // com.google.protobuf.s1.c
        public final int i() {
            return this.f124314a;
        }
    }

    public enum d implements s1.c {
        NONE(-1),
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17);

        public static final int H1 = 3;
        public static final int Y = -1;
        public static final int Z = 0;

        /* JADX INFO: renamed from: g3, reason: collision with root package name */
        public static final int f124322g3 = 5;

        /* JADX INFO: renamed from: h3, reason: collision with root package name */
        public static final int f124324h3 = 6;

        /* JADX INFO: renamed from: i3, reason: collision with root package name */
        public static final int f124326i3 = 7;

        /* JADX INFO: renamed from: j3, reason: collision with root package name */
        public static final int f124328j3 = 8;

        /* JADX INFO: renamed from: k3, reason: collision with root package name */
        public static final int f124330k3 = 9;

        /* JADX INFO: renamed from: l3, reason: collision with root package name */
        public static final int f124332l3 = 10;

        /* JADX INFO: renamed from: m3, reason: collision with root package name */
        public static final int f124334m3 = 11;

        /* JADX INFO: renamed from: n3, reason: collision with root package name */
        public static final int f124336n3 = 12;

        /* JADX INFO: renamed from: o3, reason: collision with root package name */
        public static final int f124338o3 = 13;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final int f124339p0 = 1;

        /* JADX INFO: renamed from: p1, reason: collision with root package name */
        public static final int f124340p1 = 2;

        /* JADX INFO: renamed from: p2, reason: collision with root package name */
        public static final int f124341p2 = 4;

        /* JADX INFO: renamed from: p3, reason: collision with root package name */
        public static final int f124342p3 = 14;

        /* JADX INFO: renamed from: q3, reason: collision with root package name */
        public static final int f124343q3 = 15;

        /* JADX INFO: renamed from: r3, reason: collision with root package name */
        public static final int f124344r3 = 16;

        /* JADX INFO: renamed from: s3, reason: collision with root package name */
        public static final int f124346s3 = 17;

        /* JADX INFO: renamed from: t3, reason: collision with root package name */
        private static final s1.d<d> f124348t3 = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f124352a;

        class a implements s1.d<d> {
            a() {
            }

            @Override // com.google.protobuf.s1.d
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d a(int i10) {
                return d.l(i10);
            }
        }

        private static final class b implements s1.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final s1.e f124353a = new b();

            private b() {
            }

            @Override // com.google.protobuf.s1.e
            public boolean a(int i10) {
                return d.l(i10) != null;
            }
        }

        d(int i10) {
            this.f124352a = i10;
        }

        public static d l(int i10) {
            switch (i10) {
                case -1:
                    return NONE;
                case 0:
                    return MOBILE;
                case 1:
                    return WIFI;
                case 2:
                    return MOBILE_MMS;
                case 3:
                    return MOBILE_SUPL;
                case 4:
                    return MOBILE_DUN;
                case 5:
                    return MOBILE_HIPRI;
                case 6:
                    return WIMAX;
                case 7:
                    return BLUETOOTH;
                case 8:
                    return DUMMY;
                case 9:
                    return ETHERNET;
                case 10:
                    return MOBILE_FOTA;
                case 11:
                    return MOBILE_IMS;
                case 12:
                    return MOBILE_CBS;
                case 13:
                    return WIFI_P2P;
                case 14:
                    return MOBILE_IA;
                case 15:
                    return MOBILE_EMERGENCY;
                case 16:
                    return PROXY;
                case 17:
                    return VPN;
                default:
                    return null;
            }
        }

        public static s1.d<d> n() {
            return f124348t3;
        }

        public static s1.e o() {
            return b.f124353a;
        }

        @Deprecated
        public static d p(int i10) {
            return l(i10);
        }

        @Override // com.google.protobuf.s1.c
        public final int i() {
            return this.f124352a;
        }
    }

    static {
        o oVar = new o();
        DEFAULT_INSTANCE = oVar;
        l1.Wl(o.class, oVar);
    }

    private o() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void em() {
        this.bitField0_ &= -3;
        this.mobileSubtype_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fm() {
        this.bitField0_ &= -2;
        this.networkType_ = -1;
    }

    public static o gm() {
        return DEFAULT_INSTANCE;
    }

    public static b hm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b im(o oVar) {
        return DEFAULT_INSTANCE.Uf(oVar);
    }

    public static o jm(InputStream inputStream) throws IOException {
        return (o) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static o km(InputStream inputStream, v0 v0Var) throws IOException {
        return (o) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static o lm(com.google.protobuf.u uVar) throws t1 {
        return (o) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static o mm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
        return (o) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static o nm(com.google.protobuf.z zVar) throws IOException {
        return (o) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static o om(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
        return (o) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static o pm(InputStream inputStream) throws IOException {
        return (o) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static o qm(InputStream inputStream, v0 v0Var) throws IOException {
        return (o) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static o rm(ByteBuffer byteBuffer) throws t1 {
        return (o) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static o sm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (o) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static o tm(byte[] bArr) throws t1 {
        return (o) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static o um(byte[] bArr, v0 v0Var) throws t1 {
        return (o) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<o> vm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wm(c cVar) {
        this.mobileSubtype_ = cVar.i();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xm(d dVar) {
        this.networkType_ = dVar.i();
        this.bitField0_ |= 1;
    }

    @Override // com.google.firebase.perf.v1.p
    public boolean Cf() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f124273a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new o();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"bitField0_", "networkType_", d.o(), "mobileSubtype_", c.o()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<o> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (o.class) {
                    try {
                        cVar = PARSER;
                        if (cVar == null) {
                            cVar = new l1.c(DEFAULT_INSTANCE);
                            PARSER = cVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return cVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.firebase.perf.v1.p
    public d bj() {
        d dVarL = d.l(this.networkType_);
        if (dVarL == null) {
            dVarL = d.NONE;
        }
        return dVarL;
    }

    @Override // com.google.firebase.perf.v1.p
    public boolean ej() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.firebase.perf.v1.p
    public c zd() {
        c cVarL = c.l(this.mobileSubtype_);
        return cVarL == null ? c.UNKNOWN_MOBILE_SUBTYPE : cVarL;
    }
}
