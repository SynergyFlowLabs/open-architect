package com.google.api;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class t1 extends com.google.protobuf.l1<t1, b> implements u1 {
    private static final t1 DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 6;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 7;
    public static final int LABELS_FIELD_NUMBER = 2;
    public static final int LAUNCH_STAGE_FIELD_NUMBER = 12;
    public static final int METADATA_FIELD_NUMBER = 10;
    public static final int METRIC_KIND_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.f3<t1> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 8;
    public static final int UNIT_FIELD_NUMBER = 5;
    public static final int VALUE_TYPE_FIELD_NUMBER = 4;
    private int bitField0_;
    private int launchStage_;
    private c metadata_;
    private int metricKind_;
    private int valueType_;
    private String name_ = "";
    private String type_ = "";
    private com.google.protobuf.s1.k<h1> labels_ = com.google.protobuf.l1.Ij();
    private String unit_ = "";
    private String description_ = "";
    private String displayName_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116321a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f116321a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116321a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116321a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116321a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116321a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116321a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116321a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1.b<t1, b> implements u1 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.api.u1
        public int E() {
            return ((t1) this.f126038b).E();
        }

        @Override // com.google.api.u1
        public e Ii() {
            return ((t1) this.f126038b).Ii();
        }

        @Override // com.google.api.u1
        public h1 J1(int i10) {
            return ((t1) this.f126038b).J1(i10);
        }

        @Override // com.google.api.u1
        public int K1() {
            return ((t1) this.f126038b).K1();
        }

        @Override // com.google.api.u1
        public com.google.protobuf.u L0() {
            return ((t1) this.f126038b).L0();
        }

        public b Ol(Iterable<? extends h1> iterable) {
            El();
            ((t1) this.f126038b).Hm(iterable);
            return this;
        }

        public b Pl(int i10, h1.b bVar) {
            El();
            ((t1) this.f126038b).Im(i10, bVar.build());
            return this;
        }

        @Override // com.google.api.u1
        public List<h1> Q0() {
            return Collections.unmodifiableList(((t1) this.f126038b).Q0());
        }

        public b Ql(int i10, h1 h1Var) {
            El();
            ((t1) this.f126038b).Im(i10, h1Var);
            return this;
        }

        @Override // com.google.api.u1
        public k1 R0() {
            return ((t1) this.f126038b).R0();
        }

        @Override // com.google.api.u1
        public boolean R6() {
            return ((t1) this.f126038b).R6();
        }

        public b Rl(h1.b bVar) {
            El();
            ((t1) this.f126038b).Jm(bVar.build());
            return this;
        }

        public b Sl(h1 h1Var) {
            El();
            ((t1) this.f126038b).Jm(h1Var);
            return this;
        }

        public b Tl() {
            El();
            ((t1) this.f126038b).Km();
            return this;
        }

        public b Ul() {
            El();
            ((t1) this.f126038b).Lm();
            return this;
        }

        public b Vl() {
            El();
            ((t1) this.f126038b).Mm();
            return this;
        }

        public b Wl() {
            El();
            ((t1) this.f126038b).Nm();
            return this;
        }

        public b Xl() {
            El();
            ((t1) this.f126038b).Om();
            return this;
        }

        public b Yl() {
            El();
            ((t1) this.f126038b).Pm();
            return this;
        }

        @Override // com.google.api.u1
        public int Zi() {
            return ((t1) this.f126038b).Zi();
        }

        public b Zl() {
            El();
            ((t1) this.f126038b).Qm();
            return this;
        }

        @Override // com.google.api.u1
        public com.google.protobuf.u a() {
            return ((t1) this.f126038b).a();
        }

        public b am() {
            El();
            ((t1) this.f126038b).Rm();
            return this;
        }

        public b bm() {
            El();
            ((t1) this.f126038b).Sm();
            return this;
        }

        @Override // com.google.api.u1
        public String c() {
            return ((t1) this.f126038b).c();
        }

        public b cm() {
            El();
            ((t1) this.f126038b).Tm();
            return this;
        }

        @Override // com.google.api.u1
        public com.google.protobuf.u d6() {
            return ((t1) this.f126038b).d6();
        }

        public b dm(c cVar) {
            El();
            ((t1) this.f126038b).Ym(cVar);
            return this;
        }

        public b em(int i10) {
            El();
            ((t1) this.f126038b).on(i10);
            return this;
        }

        @Override // com.google.api.u1
        public String f2() {
            return ((t1) this.f126038b).f2();
        }

        public b fm(String str) {
            El();
            ((t1) this.f126038b).pn(str);
            return this;
        }

        @Override // com.google.api.u1
        public String getDescription() {
            return ((t1) this.f126038b).getDescription();
        }

        @Override // com.google.api.u1
        public String getName() {
            return ((t1) this.f126038b).getName();
        }

        public b gm(com.google.protobuf.u uVar) {
            El();
            ((t1) this.f126038b).qn(uVar);
            return this;
        }

        @Override // com.google.api.u1
        public String h0() {
            return ((t1) this.f126038b).h0();
        }

        public b hm(String str) {
            El();
            ((t1) this.f126038b).rn(str);
            return this;
        }

        @Override // com.google.api.u1
        public f i1() {
            return ((t1) this.f126038b).i1();
        }

        public b im(com.google.protobuf.u uVar) {
            El();
            ((t1) this.f126038b).sn(uVar);
            return this;
        }

        public b jm(int i10, h1.b bVar) {
            El();
            ((t1) this.f126038b).tn(i10, bVar.build());
            return this;
        }

        @Override // com.google.api.u1
        public com.google.protobuf.u k() {
            return ((t1) this.f126038b).k();
        }

        public b km(int i10, h1 h1Var) {
            El();
            ((t1) this.f126038b).tn(i10, h1Var);
            return this;
        }

        public b lm(k1 k1Var) {
            El();
            ((t1) this.f126038b).un(k1Var);
            return this;
        }

        public b mm(int i10) {
            El();
            ((t1) this.f126038b).vn(i10);
            return this;
        }

        public b nm(c.a aVar) {
            El();
            ((t1) this.f126038b).wn(aVar.build());
            return this;
        }

        public b om(c cVar) {
            El();
            ((t1) this.f126038b).wn(cVar);
            return this;
        }

        public b pm(e eVar) {
            El();
            ((t1) this.f126038b).xn(eVar);
            return this;
        }

        public b qm(int i10) {
            El();
            ((t1) this.f126038b).yn(i10);
            return this;
        }

        public b rm(String str) {
            El();
            ((t1) this.f126038b).zn(str);
            return this;
        }

        @Override // com.google.api.u1
        public com.google.protobuf.u s() {
            return ((t1) this.f126038b).s();
        }

        @Override // com.google.api.u1
        public int s2() {
            return ((t1) this.f126038b).s2();
        }

        public b sm(com.google.protobuf.u uVar) {
            El();
            ((t1) this.f126038b).An(uVar);
            return this;
        }

        public b tm(String str) {
            El();
            ((t1) this.f126038b).Bn(str);
            return this;
        }

        public b um(com.google.protobuf.u uVar) {
            El();
            ((t1) this.f126038b).Cn(uVar);
            return this;
        }

        public b vm(String str) {
            El();
            ((t1) this.f126038b).Dn(str);
            return this;
        }

        public b wm(com.google.protobuf.u uVar) {
            El();
            ((t1) this.f126038b).En(uVar);
            return this;
        }

        public b xm(f fVar) {
            El();
            ((t1) this.f126038b).Fn(fVar);
            return this;
        }

        public b ym(int i10) {
            El();
            ((t1) this.f126038b).Gn(i10);
            return this;
        }

        @Override // com.google.api.u1
        public c z() {
            return ((t1) this.f126038b).z();
        }

        private b() {
            super(t1.DEFAULT_INSTANCE);
        }
    }

    public static final class c extends com.google.protobuf.l1<c, a> implements d {
        private static final c DEFAULT_INSTANCE;
        public static final int INGEST_DELAY_FIELD_NUMBER = 3;
        public static final int LAUNCH_STAGE_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.f3<c> PARSER = null;
        public static final int SAMPLE_PERIOD_FIELD_NUMBER = 2;
        private int bitField0_;
        private com.google.protobuf.i0 ingestDelay_;
        private int launchStage_;
        private com.google.protobuf.i0 samplePeriod_;

        public static final class a extends com.google.protobuf.l1.b<c, a> implements d {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // com.google.api.t1.d
            public com.google.protobuf.i0 Gf() {
                return ((c) this.f126038b).Gf();
            }

            @Override // com.google.api.t1.d
            @Deprecated
            public int K1() {
                return ((c) this.f126038b).K1();
            }

            public a Ol() {
                El();
                ((c) this.f126038b).jm();
                return this;
            }

            @Deprecated
            public a Pl() {
                El();
                ((c) this.f126038b).km();
                return this;
            }

            public a Ql() {
                El();
                ((c) this.f126038b).lm();
                return this;
            }

            @Override // com.google.api.t1.d
            @Deprecated
            public k1 R0() {
                return ((c) this.f126038b).R0();
            }

            public a Rl(com.google.protobuf.i0 i0Var) {
                El();
                ((c) this.f126038b).nm(i0Var);
                return this;
            }

            public a Sl(com.google.protobuf.i0 i0Var) {
                El();
                ((c) this.f126038b).om(i0Var);
                return this;
            }

            public a Tl(com.google.protobuf.i0.b bVar) {
                El();
                ((c) this.f126038b).Em(bVar.build());
                return this;
            }

            public a Ul(com.google.protobuf.i0 i0Var) {
                El();
                ((c) this.f126038b).Em(i0Var);
                return this;
            }

            @Deprecated
            public a Vl(k1 k1Var) {
                El();
                ((c) this.f126038b).Fm(k1Var);
                return this;
            }

            @Deprecated
            public a Wl(int i10) {
                El();
                ((c) this.f126038b).Gm(i10);
                return this;
            }

            public a Xl(com.google.protobuf.i0.b bVar) {
                El();
                ((c) this.f126038b).Hm(bVar.build());
                return this;
            }

            @Override // com.google.api.t1.d
            public com.google.protobuf.i0 Yk() {
                return ((c) this.f126038b).Yk();
            }

            public a Yl(com.google.protobuf.i0 i0Var) {
                El();
                ((c) this.f126038b).Hm(i0Var);
                return this;
            }

            @Override // com.google.api.t1.d
            public boolean me() {
                return ((c) this.f126038b).me();
            }

            @Override // com.google.api.t1.d
            public boolean tk() {
                return ((c) this.f126038b).tk();
            }

            private a() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            com.google.protobuf.l1.Wl(c.class, cVar);
        }

        private c() {
        }

        public static c Am(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
            return (c) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static c Bm(byte[] bArr) throws com.google.protobuf.t1 {
            return (c) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static c Cm(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
            return (c) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static com.google.protobuf.f3<c> Dm() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Em(com.google.protobuf.i0 i0Var) {
            i0Var.getClass();
            this.ingestDelay_ = i0Var;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Fm(k1 k1Var) {
            this.launchStage_ = k1Var.i();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Gm(int i10) {
            this.launchStage_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Hm(com.google.protobuf.i0 i0Var) {
            i0Var.getClass();
            this.samplePeriod_ = i0Var;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void jm() {
            this.ingestDelay_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void km() {
            this.launchStage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lm() {
            this.samplePeriod_ = null;
            this.bitField0_ &= -2;
        }

        public static c mm() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void nm(com.google.protobuf.i0 i0Var) {
            i0Var.getClass();
            com.google.protobuf.i0 i0Var2 = this.ingestDelay_;
            if (i0Var2 == null || i0Var2 == com.google.protobuf.i0.gm()) {
                this.ingestDelay_ = i0Var;
            } else {
                this.ingestDelay_ = com.google.protobuf.i0.im(this.ingestDelay_).Jl(i0Var).B1();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void om(com.google.protobuf.i0 i0Var) {
            i0Var.getClass();
            com.google.protobuf.i0 i0Var2 = this.samplePeriod_;
            if (i0Var2 == null || i0Var2 == com.google.protobuf.i0.gm()) {
                this.samplePeriod_ = i0Var;
            } else {
                this.samplePeriod_ = com.google.protobuf.i0.im(this.samplePeriod_).Jl(i0Var).B1();
            }
            this.bitField0_ |= 1;
        }

        public static a pm() {
            return DEFAULT_INSTANCE.jf();
        }

        public static a qm(c cVar) {
            return DEFAULT_INSTANCE.Uf(cVar);
        }

        public static c rm(InputStream inputStream) throws IOException {
            return (c) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static c sm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
            return (c) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static c tm(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
            return (c) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static c um(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
            return (c) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static c vm(com.google.protobuf.z zVar) throws IOException {
            return (c) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static c wm(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
            return (c) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static c xm(InputStream inputStream) throws IOException {
            return (c) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static c ym(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
            return (c) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static c zm(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
            return (c) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        @Override // com.google.api.t1.d
        public com.google.protobuf.i0 Gf() {
            com.google.protobuf.i0 i0VarGm = this.samplePeriod_;
            if (i0VarGm == null) {
                i0VarGm = com.google.protobuf.i0.gm();
            }
            return i0VarGm;
        }

        @Override // com.google.api.t1.d
        @Deprecated
        public int K1() {
            return this.launchStage_;
        }

        @Override // com.google.api.t1.d
        @Deprecated
        public k1 R0() {
            k1 k1VarL = k1.l(this.launchStage_);
            return k1VarL == null ? k1.UNRECOGNIZED : k1VarL;
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
            com.google.protobuf.f3 cVar;
            int i10 = a.f116321a[iVar.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new c();
                case 2:
                    return new a(aVar);
                case 3:
                    return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "launchStage_", "samplePeriod_", "ingestDelay_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.f3<c> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (c.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new com.google.protobuf.l1.c(DEFAULT_INSTANCE);
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

        @Override // com.google.api.t1.d
        public com.google.protobuf.i0 Yk() {
            com.google.protobuf.i0 i0Var = this.ingestDelay_;
            return i0Var == null ? com.google.protobuf.i0.gm() : i0Var;
        }

        @Override // com.google.api.t1.d
        public boolean me() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.api.t1.d
        public boolean tk() {
            return (this.bitField0_ & 2) != 0;
        }
    }

    public interface d extends com.google.protobuf.o2 {
        com.google.protobuf.i0 Gf();

        @Deprecated
        int K1();

        @Deprecated
        k1 R0();

        com.google.protobuf.i0 Yk();

        boolean me();

        boolean tk();
    }

    public enum e implements com.google.protobuf.s1.c {
        METRIC_KIND_UNSPECIFIED(0),
        GAUGE(1),
        DELTA(2),
        CUMULATIVE(3),
        UNRECOGNIZED(-1);


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f116327g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f116328h = 1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f116329i = 2;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f116330j = 3;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final com.google.protobuf.s1.d<e> f116331k = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f116333a;

        class a implements com.google.protobuf.s1.d<e> {
            a() {
            }

            @Override // com.google.protobuf.s1.d
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public e a(int i10) {
                return e.l(i10);
            }
        }

        private static final class b implements com.google.protobuf.s1.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final com.google.protobuf.s1.e f116334a = new b();

            private b() {
            }

            @Override // com.google.protobuf.s1.e
            public boolean a(int i10) {
                if (e.l(i10) == null) {
                    return false;
                }
                int i11 = 5 | 1;
                return true;
            }
        }

        e(int i10) {
            this.f116333a = i10;
        }

        public static e l(int i10) {
            if (i10 == 0) {
                return METRIC_KIND_UNSPECIFIED;
            }
            if (i10 == 1) {
                return GAUGE;
            }
            if (i10 == 2) {
                return DELTA;
            }
            if (i10 != 3) {
                return null;
            }
            return CUMULATIVE;
        }

        public static com.google.protobuf.s1.d<e> n() {
            return f116331k;
        }

        public static com.google.protobuf.s1.e o() {
            return b.f116334a;
        }

        @Deprecated
        public static e p(int i10) {
            return l(i10);
        }

        @Override // com.google.protobuf.s1.c
        public final int i() {
            if (this != UNRECOGNIZED) {
                return this.f116333a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public enum f implements com.google.protobuf.s1.c {
        VALUE_TYPE_UNSPECIFIED(0),
        BOOL(1),
        INT64(2),
        DOUBLE(3),
        STRING(4),
        DISTRIBUTION(5),
        MONEY(6),
        UNRECOGNIZED(-1);


        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f116343j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f116344k = 1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f116345l = 2;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f116346m = 3;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f116347n = 4;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f116348o = 5;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f116349s = 6;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final com.google.protobuf.s1.d<f> f116350t = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f116352a;

        class a implements com.google.protobuf.s1.d<f> {
            a() {
            }

            @Override // com.google.protobuf.s1.d
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public f a(int i10) {
                return f.l(i10);
            }
        }

        private static final class b implements com.google.protobuf.s1.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final com.google.protobuf.s1.e f116353a = new b();

            private b() {
            }

            @Override // com.google.protobuf.s1.e
            public boolean a(int i10) {
                return f.l(i10) != null;
            }
        }

        f(int i10) {
            this.f116352a = i10;
        }

        public static f l(int i10) {
            switch (i10) {
                case 0:
                    return VALUE_TYPE_UNSPECIFIED;
                case 1:
                    return BOOL;
                case 2:
                    return INT64;
                case 3:
                    return DOUBLE;
                case 4:
                    return STRING;
                case 5:
                    return DISTRIBUTION;
                case 6:
                    return MONEY;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.s1.d<f> n() {
            return f116350t;
        }

        public static com.google.protobuf.s1.e o() {
            return b.f116353a;
        }

        @Deprecated
        public static f p(int i10) {
            return l(i10);
        }

        @Override // com.google.protobuf.s1.c
        public final int i() {
            if (this != UNRECOGNIZED) {
                return this.f116352a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        t1 t1Var = new t1();
        DEFAULT_INSTANCE = t1Var;
        com.google.protobuf.l1.Wl(t1.class, t1Var);
    }

    private t1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void An(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.name_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bn(String str) {
        str.getClass();
        this.type_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Cn(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.type_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dn(String str) {
        str.getClass();
        this.unit_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void En(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.unit_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Fn(f fVar) {
        this.valueType_ = fVar.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Gn(int i10) {
        this.valueType_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Hm(Iterable<? extends h1> iterable) {
        Um();
        com.google.protobuf.a.y(iterable, this.labels_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Im(int i10, h1 h1Var) {
        h1Var.getClass();
        Um();
        this.labels_.add(i10, h1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Jm(h1 h1Var) {
        h1Var.getClass();
        Um();
        this.labels_.add(h1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Km() {
        this.description_ = Vm().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lm() {
        this.displayName_ = Vm().h0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Mm() {
        this.labels_ = com.google.protobuf.l1.Ij();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Nm() {
        this.launchStage_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Om() {
        this.metadata_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Pm() {
        this.metricKind_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qm() {
        this.name_ = Vm().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Rm() {
        this.type_ = Vm().c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sm() {
        this.unit_ = Vm().f2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Tm() {
        this.valueType_ = 0;
    }

    private void Um() {
        com.google.protobuf.s1.k<h1> kVar = this.labels_;
        if (!kVar.s1()) {
            this.labels_ = com.google.protobuf.l1.yl(kVar);
        }
    }

    public static t1 Vm() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Ym(c cVar) {
        cVar.getClass();
        c cVar2 = this.metadata_;
        if (cVar2 == null || cVar2 == c.mm()) {
            this.metadata_ = cVar;
        } else {
            this.metadata_ = c.qm(this.metadata_).Jl(cVar).B1();
        }
        this.bitField0_ |= 1;
    }

    public static b Zm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b an(t1 t1Var) {
        return DEFAULT_INSTANCE.Uf(t1Var);
    }

    public static t1 bn(InputStream inputStream) throws IOException {
        return (t1) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static t1 cn(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (t1) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static t1 dn(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (t1) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static t1 en(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (t1) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static t1 fn(com.google.protobuf.z zVar) throws IOException {
        return (t1) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static t1 gn(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (t1) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static t1 hn(InputStream inputStream) throws IOException {
        return (t1) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static t1 in(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (t1) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static t1 jn(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (t1) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t1 kn(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (t1) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static t1 ln(byte[] bArr) throws com.google.protobuf.t1 {
        return (t1) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static t1 mn(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (t1) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static com.google.protobuf.f3<t1> nn() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void on(int i10) {
        Um();
        this.labels_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pn(String str) {
        str.getClass();
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qn(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.description_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rn(String str) {
        str.getClass();
        this.displayName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sn(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.displayName_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tn(int i10, h1 h1Var) {
        h1Var.getClass();
        Um();
        this.labels_.set(i10, h1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void un(k1 k1Var) {
        this.launchStage_ = k1Var.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vn(int i10) {
        this.launchStage_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wn(c cVar) {
        cVar.getClass();
        this.metadata_ = cVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xn(e eVar) {
        this.metricKind_ = eVar.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yn(int i10) {
        this.metricKind_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zn(String str) {
        str.getClass();
        this.name_ = str;
    }

    @Override // com.google.api.u1
    public int E() {
        return this.labels_.size();
    }

    @Override // com.google.api.u1
    public e Ii() {
        e eVarL = e.l(this.metricKind_);
        return eVarL == null ? e.UNRECOGNIZED : eVarL;
    }

    @Override // com.google.api.u1
    public h1 J1(int i10) {
        return this.labels_.get(i10);
    }

    @Override // com.google.api.u1
    public int K1() {
        return this.launchStage_;
    }

    @Override // com.google.api.u1
    public com.google.protobuf.u L0() {
        return com.google.protobuf.u.C(this.displayName_);
    }

    @Override // com.google.api.u1
    public List<h1> Q0() {
        return this.labels_;
    }

    @Override // com.google.api.u1
    public k1 R0() {
        k1 k1VarL = k1.l(this.launchStage_);
        if (k1VarL == null) {
            k1VarL = k1.UNRECOGNIZED;
        }
        return k1VarL;
    }

    @Override // com.google.api.u1
    public boolean R6() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        int i10 = a.f116321a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new t1();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\f\n\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003\f\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\nဉ\u0000\f\f", new Object[]{"bitField0_", "name_", "labels_", h1.class, "metricKind_", "valueType_", "unit_", "description_", "displayName_", "type_", "metadata_", "launchStage_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f3<t1> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (t1.class) {
                    try {
                        cVar = PARSER;
                        if (cVar == null) {
                            cVar = new com.google.protobuf.l1.c(DEFAULT_INSTANCE);
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

    public i1 Wm(int i10) {
        return this.labels_.get(i10);
    }

    public List<? extends i1> Xm() {
        return this.labels_;
    }

    @Override // com.google.api.u1
    public int Zi() {
        return this.metricKind_;
    }

    @Override // com.google.api.u1
    public com.google.protobuf.u a() {
        return com.google.protobuf.u.C(this.name_);
    }

    @Override // com.google.api.u1
    public String c() {
        return this.type_;
    }

    @Override // com.google.api.u1
    public com.google.protobuf.u d6() {
        return com.google.protobuf.u.C(this.unit_);
    }

    @Override // com.google.api.u1
    public String f2() {
        return this.unit_;
    }

    @Override // com.google.api.u1
    public String getDescription() {
        return this.description_;
    }

    @Override // com.google.api.u1
    public String getName() {
        return this.name_;
    }

    @Override // com.google.api.u1
    public String h0() {
        return this.displayName_;
    }

    @Override // com.google.api.u1
    public f i1() {
        f fVarL = f.l(this.valueType_);
        return fVarL == null ? f.UNRECOGNIZED : fVarL;
    }

    @Override // com.google.api.u1
    public com.google.protobuf.u k() {
        return com.google.protobuf.u.C(this.description_);
    }

    @Override // com.google.api.u1
    public com.google.protobuf.u s() {
        return com.google.protobuf.u.C(this.type_);
    }

    @Override // com.google.api.u1
    public int s2() {
        return this.valueType_;
    }

    @Override // com.google.api.u1
    public c z() {
        c cVar = this.metadata_;
        return cVar == null ? c.mm() : cVar;
    }
}
