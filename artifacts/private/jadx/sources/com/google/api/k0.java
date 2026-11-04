package com.google.api;

import com.google.protobuf.d4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class k0 extends com.google.protobuf.l1<k0, d> implements l0 {
    public static final int BUCKET_COUNTS_FIELD_NUMBER = 7;
    public static final int BUCKET_OPTIONS_FIELD_NUMBER = 6;
    public static final int COUNT_FIELD_NUMBER = 1;
    private static final k0 DEFAULT_INSTANCE;
    public static final int EXEMPLARS_FIELD_NUMBER = 10;
    public static final int MEAN_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.f3<k0> PARSER = null;
    public static final int RANGE_FIELD_NUMBER = 4;
    public static final int SUM_OF_SQUARED_DEVIATION_FIELD_NUMBER = 3;
    private int bitField0_;
    private b bucketOptions_;
    private long count_;
    private double mean_;
    private g range_;
    private double sumOfSquaredDeviation_;
    private int bucketCountsMemoizedSerializedSize = -1;
    private com.google.protobuf.s1.i bucketCounts_ = com.google.protobuf.l1.ij();
    private com.google.protobuf.s1.k<e> exemplars_ = com.google.protobuf.l1.Ij();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116225a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f116225a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116225a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116225a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116225a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116225a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116225a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116225a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1<b, a> implements c {
        private static final b DEFAULT_INSTANCE;
        public static final int EXPLICIT_BUCKETS_FIELD_NUMBER = 3;
        public static final int EXPONENTIAL_BUCKETS_FIELD_NUMBER = 2;
        public static final int LINEAR_BUCKETS_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.f3<b> PARSER;
        private int optionsCase_ = 0;
        private Object options_;

        public static final class a extends com.google.protobuf.l1.b<b, a> implements c {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // com.google.api.k0.c
            public h Gc() {
                return ((b) this.f126038b).Gc();
            }

            public a Ol() {
                El();
                ((b) this.f126038b).km();
                return this;
            }

            public a Pl() {
                El();
                ((b) this.f126038b).lm();
                return this;
            }

            public a Ql() {
                El();
                ((b) this.f126038b).mm();
                return this;
            }

            @Override // com.google.api.k0.c
            public boolean R8() {
                return ((b) this.f126038b).R8();
            }

            public a Rl() {
                El();
                ((b) this.f126038b).nm();
                return this;
            }

            public a Sl(C1036b c1036b) {
                El();
                ((b) this.f126038b).pm(c1036b);
                return this;
            }

            public a Tl(d dVar) {
                El();
                ((b) this.f126038b).qm(dVar);
                return this;
            }

            public a Ul(f fVar) {
                El();
                ((b) this.f126038b).rm(fVar);
                return this;
            }

            public a Vl(C1036b.a aVar) {
                El();
                ((b) this.f126038b).Hm(aVar.build());
                return this;
            }

            public a Wl(C1036b c1036b) {
                El();
                ((b) this.f126038b).Hm(c1036b);
                return this;
            }

            public a Xl(d.a aVar) {
                El();
                ((b) this.f126038b).Im(aVar.build());
                return this;
            }

            public a Yl(d dVar) {
                El();
                ((b) this.f126038b).Im(dVar);
                return this;
            }

            public a Zl(f.a aVar) {
                El();
                ((b) this.f126038b).Jm(aVar.build());
                return this;
            }

            public a am(f fVar) {
                El();
                ((b) this.f126038b).Jm(fVar);
                return this;
            }

            @Override // com.google.api.k0.c
            public f dj() {
                return ((b) this.f126038b).dj();
            }

            @Override // com.google.api.k0.c
            public boolean fk() {
                return ((b) this.f126038b).fk();
            }

            @Override // com.google.api.k0.c
            public C1036b rh() {
                return ((b) this.f126038b).rh();
            }

            @Override // com.google.api.k0.c
            public d tb() {
                return ((b) this.f126038b).tb();
            }

            @Override // com.google.api.k0.c
            public boolean we() {
                return ((b) this.f126038b).we();
            }

            private a() {
                super(b.DEFAULT_INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.google.api.k0$b$b, reason: collision with other inner class name */
        public static final class C1036b extends com.google.protobuf.l1<C1036b, a> implements c {
            public static final int BOUNDS_FIELD_NUMBER = 1;
            private static final C1036b DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.f3<C1036b> PARSER;
            private int boundsMemoizedSerializedSize = -1;
            private com.google.protobuf.s1.b bounds_ = com.google.protobuf.l1.Ch();

            /* JADX INFO: renamed from: com.google.api.k0$b$b$a */
            public static final class a extends com.google.protobuf.l1.b<C1036b, a> implements c {
                /* synthetic */ a(a aVar) {
                    this();
                }

                @Override // com.google.api.k0.b.c
                public double O9(int i10) {
                    return ((C1036b) this.f126038b).O9(i10);
                }

                public a Ol(Iterable<? extends Double> iterable) {
                    El();
                    ((C1036b) this.f126038b).em(iterable);
                    return this;
                }

                public a Pl(double d10) {
                    El();
                    ((C1036b) this.f126038b).fm(d10);
                    return this;
                }

                public a Ql() {
                    El();
                    ((C1036b) this.f126038b).gm();
                    return this;
                }

                public a Rl(int i10, double d10) {
                    El();
                    ((C1036b) this.f126038b).ym(i10, d10);
                    return this;
                }

                @Override // com.google.api.k0.b.c
                public int Vi() {
                    return ((C1036b) this.f126038b).Vi();
                }

                @Override // com.google.api.k0.b.c
                public List<Double> ae() {
                    return Collections.unmodifiableList(((C1036b) this.f126038b).ae());
                }

                private a() {
                    super(C1036b.DEFAULT_INSTANCE);
                }
            }

            static {
                C1036b c1036b = new C1036b();
                DEFAULT_INSTANCE = c1036b;
                com.google.protobuf.l1.Wl(C1036b.class, c1036b);
            }

            private C1036b() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void em(Iterable<? extends Double> iterable) {
                hm();
                com.google.protobuf.a.y(iterable, this.bounds_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void fm(double d10) {
                hm();
                this.bounds_.R0(d10);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void gm() {
                this.bounds_ = com.google.protobuf.l1.Ch();
            }

            private void hm() {
                com.google.protobuf.s1.b bVar = this.bounds_;
                if (!bVar.s1()) {
                    this.bounds_ = com.google.protobuf.l1.ul(bVar);
                }
            }

            public static C1036b im() {
                return DEFAULT_INSTANCE;
            }

            public static a jm() {
                return DEFAULT_INSTANCE.jf();
            }

            public static a km(C1036b c1036b) {
                return DEFAULT_INSTANCE.Uf(c1036b);
            }

            public static C1036b lm(InputStream inputStream) throws IOException {
                return (C1036b) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
            }

            public static C1036b mm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
                return (C1036b) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
            }

            public static C1036b nm(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
                return (C1036b) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
            }

            public static C1036b om(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
                return (C1036b) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
            }

            public static C1036b pm(com.google.protobuf.z zVar) throws IOException {
                return (C1036b) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
            }

            public static C1036b qm(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
                return (C1036b) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
            }

            public static C1036b rm(InputStream inputStream) throws IOException {
                return (C1036b) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
            }

            public static C1036b sm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
                return (C1036b) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
            }

            public static C1036b tm(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
                return (C1036b) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
            }

            public static C1036b um(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
                return (C1036b) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
            }

            public static C1036b vm(byte[] bArr) throws com.google.protobuf.t1 {
                return (C1036b) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
            }

            public static C1036b wm(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
                return (C1036b) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
            }

            public static com.google.protobuf.f3<C1036b> xm() {
                return DEFAULT_INSTANCE.W7();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void ym(int i10, double d10) {
                hm();
                this.bounds_.g0(i10, d10);
            }

            @Override // com.google.api.k0.b.c
            public double O9(int i10) {
                return this.bounds_.getDouble(i10);
            }

            @Override // com.google.protobuf.l1
            protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
                com.google.protobuf.f3 cVar;
                int i10 = a.f116225a[iVar.ordinal()];
                a aVar = null;
                switch (i10) {
                    case 1:
                        return new C1036b();
                    case 2:
                        return new a(aVar);
                    case 3:
                        return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001#", new Object[]{"bounds_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.f3<C1036b> f3Var = PARSER;
                        if (f3Var != null) {
                            return f3Var;
                        }
                        synchronized (C1036b.class) {
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

            @Override // com.google.api.k0.b.c
            public int Vi() {
                return this.bounds_.size();
            }

            @Override // com.google.api.k0.b.c
            public List<Double> ae() {
                return this.bounds_;
            }
        }

        public interface c extends com.google.protobuf.o2 {
            double O9(int i10);

            int Vi();

            List<Double> ae();
        }

        public static final class d extends com.google.protobuf.l1<d, a> implements e {
            private static final d DEFAULT_INSTANCE;
            public static final int GROWTH_FACTOR_FIELD_NUMBER = 2;
            public static final int NUM_FINITE_BUCKETS_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.f3<d> PARSER = null;
            public static final int SCALE_FIELD_NUMBER = 3;
            private double growthFactor_;
            private int numFiniteBuckets_;
            private double scale_;

            public static final class a extends com.google.protobuf.l1.b<d, a> implements e {
                /* synthetic */ a(a aVar) {
                    this();
                }

                public a Ol() {
                    El();
                    ((d) this.f126038b).gm();
                    return this;
                }

                public a Pl() {
                    El();
                    ((d) this.f126038b).hm();
                    return this;
                }

                public a Ql() {
                    El();
                    ((d) this.f126038b).im();
                    return this;
                }

                public a Rl(double d10) {
                    El();
                    ((d) this.f126038b).zm(d10);
                    return this;
                }

                public a Sl(int i10) {
                    El();
                    ((d) this.f126038b).Am(i10);
                    return this;
                }

                public a Tl(double d10) {
                    El();
                    ((d) this.f126038b).Bm(d10);
                    return this;
                }

                @Override // com.google.api.k0.b.e
                public double Z0() {
                    return ((d) this.f126038b).Z0();
                }

                @Override // com.google.api.k0.b.e
                public int g3() {
                    return ((d) this.f126038b).g3();
                }

                @Override // com.google.api.k0.b.e
                public double tf() {
                    return ((d) this.f126038b).tf();
                }

                private a() {
                    super(d.DEFAULT_INSTANCE);
                }
            }

            static {
                d dVar = new d();
                DEFAULT_INSTANCE = dVar;
                com.google.protobuf.l1.Wl(d.class, dVar);
            }

            private d() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void Am(int i10) {
                this.numFiniteBuckets_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void Bm(double d10) {
                this.scale_ = d10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void gm() {
                this.growthFactor_ = 0.0d;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void hm() {
                this.numFiniteBuckets_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void im() {
                this.scale_ = 0.0d;
            }

            public static d jm() {
                return DEFAULT_INSTANCE;
            }

            public static a km() {
                return DEFAULT_INSTANCE.jf();
            }

            public static a lm(d dVar) {
                return DEFAULT_INSTANCE.Uf(dVar);
            }

            public static d mm(InputStream inputStream) throws IOException {
                return (d) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
            }

            public static d nm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
                return (d) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
            }

            public static d om(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
                return (d) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
            }

            public static d pm(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
                return (d) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
            }

            public static d qm(com.google.protobuf.z zVar) throws IOException {
                return (d) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
            }

            public static d rm(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
                return (d) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
            }

            public static d sm(InputStream inputStream) throws IOException {
                return (d) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
            }

            public static d tm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
                return (d) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
            }

            public static d um(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
                return (d) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
            }

            public static d vm(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
                return (d) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
            }

            public static d wm(byte[] bArr) throws com.google.protobuf.t1 {
                return (d) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
            }

            public static d xm(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
                return (d) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
            }

            public static com.google.protobuf.f3<d> ym() {
                return DEFAULT_INSTANCE.W7();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zm(double d10) {
                this.growthFactor_ = d10;
            }

            @Override // com.google.protobuf.l1
            protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
                com.google.protobuf.f3 cVar;
                int i10 = a.f116225a[iVar.ordinal()];
                a aVar = null;
                switch (i10) {
                    case 1:
                        return new d();
                    case 2:
                        return new a(aVar);
                    case 3:
                        return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0000\u0003\u0000", new Object[]{"numFiniteBuckets_", "growthFactor_", "scale_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.f3<d> f3Var = PARSER;
                        if (f3Var != null) {
                            return f3Var;
                        }
                        synchronized (d.class) {
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

            @Override // com.google.api.k0.b.e
            public double Z0() {
                return this.scale_;
            }

            @Override // com.google.api.k0.b.e
            public int g3() {
                return this.numFiniteBuckets_;
            }

            @Override // com.google.api.k0.b.e
            public double tf() {
                return this.growthFactor_;
            }
        }

        public interface e extends com.google.protobuf.o2 {
            double Z0();

            int g3();

            double tf();
        }

        public static final class f extends com.google.protobuf.l1<f, a> implements g {
            private static final f DEFAULT_INSTANCE;
            public static final int NUM_FINITE_BUCKETS_FIELD_NUMBER = 1;
            public static final int OFFSET_FIELD_NUMBER = 3;
            private static volatile com.google.protobuf.f3<f> PARSER = null;
            public static final int WIDTH_FIELD_NUMBER = 2;
            private int numFiniteBuckets_;
            private double offset_;
            private double width_;

            public static final class a extends com.google.protobuf.l1.b<f, a> implements g {
                /* synthetic */ a(a aVar) {
                    this();
                }

                public a Ol() {
                    El();
                    ((f) this.f126038b).gm();
                    return this;
                }

                public a Pl() {
                    El();
                    ((f) this.f126038b).hm();
                    return this;
                }

                public a Ql() {
                    El();
                    ((f) this.f126038b).im();
                    return this;
                }

                public a Rl(int i10) {
                    El();
                    ((f) this.f126038b).zm(i10);
                    return this;
                }

                public a Sl(double d10) {
                    El();
                    ((f) this.f126038b).Am(d10);
                    return this;
                }

                public a Tl(double d10) {
                    El();
                    ((f) this.f126038b).Bm(d10);
                    return this;
                }

                @Override // com.google.api.k0.b.g
                public int g3() {
                    return ((f) this.f126038b).g3();
                }

                @Override // com.google.api.k0.b.g
                public double getOffset() {
                    return ((f) this.f126038b).getOffset();
                }

                @Override // com.google.api.k0.b.g
                public double getWidth() {
                    return ((f) this.f126038b).getWidth();
                }

                private a() {
                    super(f.DEFAULT_INSTANCE);
                }
            }

            static {
                f fVar = new f();
                DEFAULT_INSTANCE = fVar;
                com.google.protobuf.l1.Wl(f.class, fVar);
            }

            private f() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void Am(double d10) {
                this.offset_ = d10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void Bm(double d10) {
                this.width_ = d10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void gm() {
                this.numFiniteBuckets_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void hm() {
                this.offset_ = 0.0d;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void im() {
                this.width_ = 0.0d;
            }

            public static f jm() {
                return DEFAULT_INSTANCE;
            }

            public static a km() {
                return DEFAULT_INSTANCE.jf();
            }

            public static a lm(f fVar) {
                return DEFAULT_INSTANCE.Uf(fVar);
            }

            public static f mm(InputStream inputStream) throws IOException {
                return (f) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
            }

            public static f nm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
                return (f) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
            }

            public static f om(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
                return (f) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
            }

            public static f pm(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
                return (f) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
            }

            public static f qm(com.google.protobuf.z zVar) throws IOException {
                return (f) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
            }

            public static f rm(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
                return (f) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
            }

            public static f sm(InputStream inputStream) throws IOException {
                return (f) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
            }

            public static f tm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
                return (f) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
            }

            public static f um(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
                return (f) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
            }

            public static f vm(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
                return (f) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
            }

            public static f wm(byte[] bArr) throws com.google.protobuf.t1 {
                return (f) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
            }

            public static f xm(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
                return (f) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
            }

            public static com.google.protobuf.f3<f> ym() {
                return DEFAULT_INSTANCE.W7();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zm(int i10) {
                this.numFiniteBuckets_ = i10;
            }

            @Override // com.google.protobuf.l1
            protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
                com.google.protobuf.f3 cVar;
                int i10 = a.f116225a[iVar.ordinal()];
                a aVar = null;
                switch (i10) {
                    case 1:
                        return new f();
                    case 2:
                        return new a(aVar);
                    case 3:
                        return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0000\u0003\u0000", new Object[]{"numFiniteBuckets_", "width_", "offset_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.f3<f> f3Var = PARSER;
                        if (f3Var != null) {
                            return f3Var;
                        }
                        synchronized (f.class) {
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

            @Override // com.google.api.k0.b.g
            public int g3() {
                return this.numFiniteBuckets_;
            }

            @Override // com.google.api.k0.b.g
            public double getOffset() {
                return this.offset_;
            }

            @Override // com.google.api.k0.b.g
            public double getWidth() {
                return this.width_;
            }
        }

        public interface g extends com.google.protobuf.o2 {
            int g3();

            double getOffset();

            double getWidth();
        }

        public enum h {
            LINEAR_BUCKETS(1),
            EXPONENTIAL_BUCKETS(2),
            EXPLICIT_BUCKETS(3),
            OPTIONS_NOT_SET(0);


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f116231a;

            h(int i10) {
                this.f116231a = i10;
            }

            public static h l(int i10) {
                if (i10 == 0) {
                    return OPTIONS_NOT_SET;
                }
                if (i10 == 1) {
                    return LINEAR_BUCKETS;
                }
                if (i10 == 2) {
                    return EXPONENTIAL_BUCKETS;
                }
                if (i10 != 3) {
                    return null;
                }
                return EXPLICIT_BUCKETS;
            }

            @Deprecated
            public static h n(int i10) {
                return l(i10);
            }

            public int i() {
                return this.f116231a;
            }
        }

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            com.google.protobuf.l1.Wl(b.class, bVar);
        }

        private b() {
        }

        public static b Am(InputStream inputStream) throws IOException {
            return (b) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static b Bm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
            return (b) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static b Cm(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
            return (b) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static b Dm(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
            return (b) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static b Em(byte[] bArr) throws com.google.protobuf.t1 {
            return (b) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static b Fm(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
            return (b) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static com.google.protobuf.f3<b> Gm() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Hm(C1036b c1036b) {
            c1036b.getClass();
            this.options_ = c1036b;
            this.optionsCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Im(d dVar) {
            dVar.getClass();
            this.options_ = dVar;
            this.optionsCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Jm(f fVar) {
            fVar.getClass();
            this.options_ = fVar;
            this.optionsCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void km() {
            if (this.optionsCase_ == 3) {
                this.optionsCase_ = 0;
                this.options_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lm() {
            if (this.optionsCase_ == 2) {
                this.optionsCase_ = 0;
                this.options_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mm() {
            if (this.optionsCase_ == 1) {
                this.optionsCase_ = 0;
                this.options_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void nm() {
            this.optionsCase_ = 0;
            this.options_ = null;
        }

        public static b om() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void pm(C1036b c1036b) {
            c1036b.getClass();
            if (this.optionsCase_ != 3 || this.options_ == C1036b.im()) {
                this.options_ = c1036b;
            } else {
                this.options_ = C1036b.km((C1036b) this.options_).Jl(c1036b).B1();
            }
            this.optionsCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void qm(d dVar) {
            dVar.getClass();
            if (this.optionsCase_ != 2 || this.options_ == d.jm()) {
                this.options_ = dVar;
            } else {
                this.options_ = d.lm((d) this.options_).Jl(dVar).B1();
            }
            this.optionsCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void rm(f fVar) {
            fVar.getClass();
            if (this.optionsCase_ != 1 || this.options_ == f.jm()) {
                this.options_ = fVar;
            } else {
                this.options_ = f.lm((f) this.options_).Jl(fVar).B1();
            }
            this.optionsCase_ = 1;
        }

        public static a sm() {
            return DEFAULT_INSTANCE.jf();
        }

        public static a tm(b bVar) {
            return DEFAULT_INSTANCE.Uf(bVar);
        }

        public static b um(InputStream inputStream) throws IOException {
            return (b) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static b vm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
            return (b) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static b wm(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
            return (b) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static b xm(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
            return (b) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static b ym(com.google.protobuf.z zVar) throws IOException {
            return (b) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static b zm(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
            return (b) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        @Override // com.google.api.k0.c
        public h Gc() {
            return h.l(this.optionsCase_);
        }

        @Override // com.google.api.k0.c
        public boolean R8() {
            return this.optionsCase_ == 2;
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
            com.google.protobuf.f3 cVar;
            int i10 = a.f116225a[iVar.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new b();
                case 2:
                    return new a(aVar);
                case 3:
                    return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"options_", "optionsCase_", f.class, d.class, C1036b.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.f3<b> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (b.class) {
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

        @Override // com.google.api.k0.c
        public f dj() {
            return this.optionsCase_ == 1 ? (f) this.options_ : f.jm();
        }

        @Override // com.google.api.k0.c
        public boolean fk() {
            return this.optionsCase_ == 3;
        }

        @Override // com.google.api.k0.c
        public C1036b rh() {
            return this.optionsCase_ == 3 ? (C1036b) this.options_ : C1036b.im();
        }

        @Override // com.google.api.k0.c
        public d tb() {
            return this.optionsCase_ == 2 ? (d) this.options_ : d.jm();
        }

        @Override // com.google.api.k0.c
        public boolean we() {
            return this.optionsCase_ == 1;
        }
    }

    public interface c extends com.google.protobuf.o2 {
        b.h Gc();

        boolean R8();

        b.f dj();

        boolean fk();

        b.C1036b rh();

        b.d tb();

        boolean we();
    }

    public static final class d extends com.google.protobuf.l1.b<k0, d> implements l0 {
        /* synthetic */ d(a aVar) {
            this();
        }

        @Override // com.google.api.l0
        public boolean Cd() {
            return ((k0) this.f126038b).Cd();
        }

        @Override // com.google.api.l0
        public int Ei() {
            return ((k0) this.f126038b).Ei();
        }

        public d Ol(Iterable<? extends Long> iterable) {
            El();
            ((k0) this.f126038b).wm(iterable);
            return this;
        }

        public d Pl(Iterable<? extends e> iterable) {
            El();
            ((k0) this.f126038b).xm(iterable);
            return this;
        }

        public d Ql(long j10) {
            El();
            ((k0) this.f126038b).ym(j10);
            return this;
        }

        public d Rl(int i10, e.a aVar) {
            El();
            ((k0) this.f126038b).zm(i10, aVar.build());
            return this;
        }

        public d Sl(int i10, e eVar) {
            El();
            ((k0) this.f126038b).zm(i10, eVar);
            return this;
        }

        public d Tl(e.a aVar) {
            El();
            ((k0) this.f126038b).Am(aVar.build());
            return this;
        }

        public d Ul(e eVar) {
            El();
            ((k0) this.f126038b).Am(eVar);
            return this;
        }

        public d Vl() {
            El();
            ((k0) this.f126038b).Bm();
            return this;
        }

        public d Wl() {
            El();
            ((k0) this.f126038b).Cm();
            return this;
        }

        public d Xl() {
            El();
            ((k0) this.f126038b).Dm();
            return this;
        }

        public d Yl() {
            El();
            ((k0) this.f126038b).Em();
            return this;
        }

        public d Zl() {
            El();
            ((k0) this.f126038b).Fm();
            return this;
        }

        public d am() {
            El();
            ((k0) this.f126038b).Gm();
            return this;
        }

        @Override // com.google.api.l0
        public boolean ba() {
            return ((k0) this.f126038b).ba();
        }

        public d bm() {
            El();
            ((k0) this.f126038b).Hm();
            return this;
        }

        @Override // com.google.api.l0
        public List<Long> c9() {
            return Collections.unmodifiableList(((k0) this.f126038b).c9());
        }

        public d cm(b bVar) {
            El();
            ((k0) this.f126038b).Nm(bVar);
            return this;
        }

        public d dm(g gVar) {
            El();
            ((k0) this.f126038b).Om(gVar);
            return this;
        }

        @Override // com.google.api.l0
        public int e8() {
            return ((k0) this.f126038b).e8();
        }

        public d em(int i10) {
            El();
            ((k0) this.f126038b).en(i10);
            return this;
        }

        @Override // com.google.api.l0
        public b fj() {
            return ((k0) this.f126038b).fj();
        }

        public d fm(int i10, long j10) {
            El();
            ((k0) this.f126038b).fn(i10, j10);
            return this;
        }

        @Override // com.google.api.l0
        public long getCount() {
            return ((k0) this.f126038b).getCount();
        }

        public d gm(b.a aVar) {
            El();
            ((k0) this.f126038b).gn(aVar.build());
            return this;
        }

        public d hm(b bVar) {
            El();
            ((k0) this.f126038b).gn(bVar);
            return this;
        }

        public d im(long j10) {
            El();
            ((k0) this.f126038b).hn(j10);
            return this;
        }

        @Override // com.google.api.l0
        public e ji(int i10) {
            return ((k0) this.f126038b).ji(i10);
        }

        @Override // com.google.api.l0
        public List<e> jk() {
            return Collections.unmodifiableList(((k0) this.f126038b).jk());
        }

        public d jm(int i10, e.a aVar) {
            El();
            ((k0) this.f126038b).in(i10, aVar.build());
            return this;
        }

        public d km(int i10, e eVar) {
            El();
            ((k0) this.f126038b).in(i10, eVar);
            return this;
        }

        public d lm(double d10) {
            El();
            ((k0) this.f126038b).jn(d10);
            return this;
        }

        @Override // com.google.api.l0
        public long mb(int i10) {
            return ((k0) this.f126038b).mb(i10);
        }

        public d mm(g.a aVar) {
            El();
            ((k0) this.f126038b).kn(aVar.build());
            return this;
        }

        public d nm(g gVar) {
            El();
            ((k0) this.f126038b).kn(gVar);
            return this;
        }

        @Override // com.google.api.l0
        public g o6() {
            return ((k0) this.f126038b).o6();
        }

        public d om(double d10) {
            El();
            ((k0) this.f126038b).ln(d10);
            return this;
        }

        @Override // com.google.api.l0
        public double sd() {
            return ((k0) this.f126038b).sd();
        }

        @Override // com.google.api.l0
        public double wf() {
            return ((k0) this.f126038b).wf();
        }

        private d() {
            super(k0.DEFAULT_INSTANCE);
        }
    }

    public static final class e extends com.google.protobuf.l1<e, a> implements f {
        public static final int ATTACHMENTS_FIELD_NUMBER = 3;
        private static final e DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.f3<e> PARSER = null;
        public static final int TIMESTAMP_FIELD_NUMBER = 2;
        public static final int VALUE_FIELD_NUMBER = 1;
        private com.google.protobuf.s1.k<com.google.protobuf.f> attachments_ = com.google.protobuf.l1.Ij();
        private int bitField0_;
        private d4 timestamp_;
        private double value_;

        public static final class a extends com.google.protobuf.l1.b<e, a> implements f {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a Ol(Iterable<? extends com.google.protobuf.f> iterable) {
                El();
                ((e) this.f126038b).lm(iterable);
                return this;
            }

            public a Pl(int i10, com.google.protobuf.f.b bVar) {
                El();
                ((e) this.f126038b).mm(i10, bVar.build());
                return this;
            }

            public a Ql(int i10, com.google.protobuf.f fVar) {
                El();
                ((e) this.f126038b).mm(i10, fVar);
                return this;
            }

            public a Rl(com.google.protobuf.f.b bVar) {
                El();
                ((e) this.f126038b).nm(bVar.build());
                return this;
            }

            @Override // com.google.api.k0.f
            public d4 S1() {
                return ((e) this.f126038b).S1();
            }

            @Override // com.google.api.k0.f
            public int Sb() {
                return ((e) this.f126038b).Sb();
            }

            public a Sl(com.google.protobuf.f fVar) {
                El();
                ((e) this.f126038b).nm(fVar);
                return this;
            }

            @Override // com.google.api.k0.f
            public boolean Tb() {
                return ((e) this.f126038b).Tb();
            }

            public a Tl() {
                El();
                ((e) this.f126038b).om();
                return this;
            }

            public a Ul() {
                El();
                ((e) this.f126038b).pm();
                return this;
            }

            public a Vl() {
                El();
                ((e) this.f126038b).qm();
                return this;
            }

            public a Wl(d4 d4Var) {
                El();
                ((e) this.f126038b).vm(d4Var);
                return this;
            }

            public a Xl(int i10) {
                El();
                ((e) this.f126038b).Lm(i10);
                return this;
            }

            public a Yl(int i10, com.google.protobuf.f.b bVar) {
                El();
                ((e) this.f126038b).Mm(i10, bVar.build());
                return this;
            }

            public a Zl(int i10, com.google.protobuf.f fVar) {
                El();
                ((e) this.f126038b).Mm(i10, fVar);
                return this;
            }

            public a am(d4.b bVar) {
                El();
                ((e) this.f126038b).Nm(bVar.build());
                return this;
            }

            public a bm(d4 d4Var) {
                El();
                ((e) this.f126038b).Nm(d4Var);
                return this;
            }

            public a cm(double d10) {
                El();
                ((e) this.f126038b).Om(d10);
                return this;
            }

            @Override // com.google.api.k0.f
            public double getValue() {
                return ((e) this.f126038b).getValue();
            }

            @Override // com.google.api.k0.f
            public com.google.protobuf.f qi(int i10) {
                return ((e) this.f126038b).qi(i10);
            }

            @Override // com.google.api.k0.f
            public List<com.google.protobuf.f> zi() {
                return Collections.unmodifiableList(((e) this.f126038b).zi());
            }

            private a() {
                super(e.DEFAULT_INSTANCE);
            }
        }

        static {
            e eVar = new e();
            DEFAULT_INSTANCE = eVar;
            com.google.protobuf.l1.Wl(e.class, eVar);
        }

        private e() {
        }

        public static e Am(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
            return (e) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static e Bm(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
            return (e) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static e Cm(com.google.protobuf.z zVar) throws IOException {
            return (e) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static e Dm(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
            return (e) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static e Em(InputStream inputStream) throws IOException {
            return (e) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static e Fm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
            return (e) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static e Gm(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
            return (e) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static e Hm(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
            return (e) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static e Im(byte[] bArr) throws com.google.protobuf.t1 {
            return (e) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static e Jm(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
            return (e) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static com.google.protobuf.f3<e> Km() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Lm(int i10) {
            rm();
            this.attachments_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Mm(int i10, com.google.protobuf.f fVar) {
            fVar.getClass();
            rm();
            this.attachments_.set(i10, fVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Nm(d4 d4Var) {
            d4Var.getClass();
            this.timestamp_ = d4Var;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Om(double d10) {
            this.value_ = d10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lm(Iterable<? extends com.google.protobuf.f> iterable) {
            rm();
            com.google.protobuf.a.y(iterable, this.attachments_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mm(int i10, com.google.protobuf.f fVar) {
            fVar.getClass();
            rm();
            this.attachments_.add(i10, fVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void nm(com.google.protobuf.f fVar) {
            fVar.getClass();
            rm();
            this.attachments_.add(fVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void om() {
            this.attachments_ = com.google.protobuf.l1.Ij();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void pm() {
            this.timestamp_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void qm() {
            this.value_ = 0.0d;
        }

        private void rm() {
            com.google.protobuf.s1.k<com.google.protobuf.f> kVar = this.attachments_;
            if (kVar.s1()) {
                return;
            }
            this.attachments_ = com.google.protobuf.l1.yl(kVar);
        }

        public static e um() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void vm(d4 d4Var) {
            d4Var.getClass();
            d4 d4Var2 = this.timestamp_;
            if (d4Var2 == null || d4Var2 == d4.gm()) {
                this.timestamp_ = d4Var;
            } else {
                this.timestamp_ = d4.im(this.timestamp_).Jl(d4Var).B1();
            }
            this.bitField0_ |= 1;
        }

        public static a wm() {
            return DEFAULT_INSTANCE.jf();
        }

        public static a xm(e eVar) {
            return DEFAULT_INSTANCE.Uf(eVar);
        }

        public static e ym(InputStream inputStream) throws IOException {
            return (e) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static e zm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
            return (e) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
            com.google.protobuf.f3 cVar;
            int i10 = a.f116225a[iVar.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new e();
                case 2:
                    return new a(aVar);
                case 3:
                    return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0000\u0002ဉ\u0000\u0003\u001b", new Object[]{"bitField0_", "value_", "timestamp_", "attachments_", com.google.protobuf.f.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.f3<e> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (e.class) {
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

        @Override // com.google.api.k0.f
        public d4 S1() {
            d4 d4VarGm = this.timestamp_;
            if (d4VarGm == null) {
                d4VarGm = d4.gm();
            }
            return d4VarGm;
        }

        @Override // com.google.api.k0.f
        public int Sb() {
            return this.attachments_.size();
        }

        @Override // com.google.api.k0.f
        public boolean Tb() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.api.k0.f
        public double getValue() {
            return this.value_;
        }

        @Override // com.google.api.k0.f
        public com.google.protobuf.f qi(int i10) {
            return this.attachments_.get(i10);
        }

        public com.google.protobuf.g sm(int i10) {
            return this.attachments_.get(i10);
        }

        public List<? extends com.google.protobuf.g> tm() {
            return this.attachments_;
        }

        @Override // com.google.api.k0.f
        public List<com.google.protobuf.f> zi() {
            return this.attachments_;
        }
    }

    public interface f extends com.google.protobuf.o2 {
        d4 S1();

        int Sb();

        boolean Tb();

        double getValue();

        com.google.protobuf.f qi(int i10);

        List<com.google.protobuf.f> zi();
    }

    public static final class g extends com.google.protobuf.l1<g, a> implements h {
        private static final g DEFAULT_INSTANCE;
        public static final int MAX_FIELD_NUMBER = 2;
        public static final int MIN_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.f3<g> PARSER;
        private double max_;
        private double min_;

        public static final class a extends com.google.protobuf.l1.b<g, a> implements h {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a Ol() {
                El();
                ((g) this.f126038b).em();
                return this;
            }

            @Override // com.google.api.k0.h
            public double Pk() {
                return ((g) this.f126038b).Pk();
            }

            public a Pl() {
                El();
                ((g) this.f126038b).fm();
                return this;
            }

            public a Ql(double d10) {
                El();
                ((g) this.f126038b).wm(d10);
                return this;
            }

            public a Rl(double d10) {
                El();
                ((g) this.f126038b).xm(d10);
                return this;
            }

            @Override // com.google.api.k0.h
            public double hl() {
                return ((g) this.f126038b).hl();
            }

            private a() {
                super(g.DEFAULT_INSTANCE);
            }
        }

        static {
            g gVar = new g();
            DEFAULT_INSTANCE = gVar;
            com.google.protobuf.l1.Wl(g.class, gVar);
        }

        private g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void em() {
            this.max_ = 0.0d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fm() {
            this.min_ = 0.0d;
        }

        public static g gm() {
            return DEFAULT_INSTANCE;
        }

        public static a hm() {
            return DEFAULT_INSTANCE.jf();
        }

        public static a im(g gVar) {
            return DEFAULT_INSTANCE.Uf(gVar);
        }

        public static g jm(InputStream inputStream) throws IOException {
            return (g) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static g km(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
            return (g) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static g lm(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
            return (g) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static g mm(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
            return (g) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static g nm(com.google.protobuf.z zVar) throws IOException {
            return (g) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static g om(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
            return (g) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static g pm(InputStream inputStream) throws IOException {
            return (g) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static g qm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
            return (g) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static g rm(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
            return (g) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static g sm(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
            return (g) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static g tm(byte[] bArr) throws com.google.protobuf.t1 {
            return (g) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static g um(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
            return (g) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static com.google.protobuf.f3<g> vm() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void wm(double d10) {
            this.max_ = d10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void xm(double d10) {
            this.min_ = d10;
        }

        @Override // com.google.api.k0.h
        public double Pk() {
            return this.min_;
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
            com.google.protobuf.f3 cVar;
            int i10 = a.f116225a[iVar.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new g();
                case 2:
                    return new a(aVar);
                case 3:
                    return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"min_", "max_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.f3<g> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (g.class) {
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

        @Override // com.google.api.k0.h
        public double hl() {
            return this.max_;
        }
    }

    public interface h extends com.google.protobuf.o2 {
        double Pk();

        double hl();
    }

    static {
        k0 k0Var = new k0();
        DEFAULT_INSTANCE = k0Var;
        com.google.protobuf.l1.Wl(k0.class, k0Var);
    }

    private k0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Am(e eVar) {
        eVar.getClass();
        Jm();
        this.exemplars_.add(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bm() {
        this.bucketCounts_ = com.google.protobuf.l1.ij();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Cm() {
        this.bucketOptions_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dm() {
        this.count_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Em() {
        this.exemplars_ = com.google.protobuf.l1.Ij();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Fm() {
        this.mean_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Gm() {
        this.range_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Hm() {
        this.sumOfSquaredDeviation_ = 0.0d;
    }

    private void Im() {
        com.google.protobuf.s1.i iVar = this.bucketCounts_;
        if (iVar.s1()) {
            return;
        }
        this.bucketCounts_ = com.google.protobuf.l1.xl(iVar);
    }

    private void Jm() {
        com.google.protobuf.s1.k<e> kVar = this.exemplars_;
        if (kVar.s1()) {
            return;
        }
        this.exemplars_ = com.google.protobuf.l1.yl(kVar);
    }

    public static k0 Km() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Nm(b bVar) {
        bVar.getClass();
        b bVar2 = this.bucketOptions_;
        if (bVar2 == null || bVar2 == b.om()) {
            this.bucketOptions_ = bVar;
        } else {
            this.bucketOptions_ = b.tm(this.bucketOptions_).Jl(bVar).B1();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Om(g gVar) {
        gVar.getClass();
        g gVar2 = this.range_;
        if (gVar2 == null || gVar2 == g.gm()) {
            this.range_ = gVar;
        } else {
            this.range_ = g.im(this.range_).Jl(gVar).B1();
        }
        this.bitField0_ |= 1;
    }

    public static d Pm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static d Qm(k0 k0Var) {
        return DEFAULT_INSTANCE.Uf(k0Var);
    }

    public static k0 Rm(InputStream inputStream) throws IOException {
        return (k0) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static k0 Sm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (k0) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static k0 Tm(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (k0) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static k0 Um(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (k0) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static k0 Vm(com.google.protobuf.z zVar) throws IOException {
        return (k0) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static k0 Wm(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (k0) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static k0 Xm(InputStream inputStream) throws IOException {
        return (k0) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static k0 Ym(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (k0) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static k0 Zm(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (k0) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static k0 an(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (k0) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static k0 bn(byte[] bArr) throws com.google.protobuf.t1 {
        return (k0) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static k0 cn(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (k0) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static com.google.protobuf.f3<k0> dn() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void en(int i10) {
        Jm();
        this.exemplars_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fn(int i10, long j10) {
        Im();
        this.bucketCounts_.k0(i10, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gn(b bVar) {
        bVar.getClass();
        this.bucketOptions_ = bVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn(long j10) {
        this.count_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void in(int i10, e eVar) {
        eVar.getClass();
        Jm();
        this.exemplars_.set(i10, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jn(double d10) {
        this.mean_ = d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kn(g gVar) {
        gVar.getClass();
        this.range_ = gVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ln(double d10) {
        this.sumOfSquaredDeviation_ = d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wm(Iterable<? extends Long> iterable) {
        Im();
        com.google.protobuf.a.y(iterable, this.bucketCounts_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xm(Iterable<? extends e> iterable) {
        Jm();
        com.google.protobuf.a.y(iterable, this.exemplars_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ym(long j10) {
        Im();
        this.bucketCounts_.M0(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zm(int i10, e eVar) {
        eVar.getClass();
        Jm();
        this.exemplars_.add(i10, eVar);
    }

    @Override // com.google.api.l0
    public boolean Cd() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.api.l0
    public int Ei() {
        return this.exemplars_.size();
    }

    public f Lm(int i10) {
        return this.exemplars_.get(i10);
    }

    public List<? extends f> Mm() {
        return this.exemplars_;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        int i10 = a.f116225a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new k0();
            case 2:
                return new d(aVar);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\n\u0007\u0000\u0002\u0000\u0001\u0002\u0002\u0000\u0003\u0000\u0004ဉ\u0000\u0006ဉ\u0001\u0007%\n\u001b", new Object[]{"bitField0_", "count_", "mean_", "sumOfSquaredDeviation_", "range_", "bucketOptions_", "bucketCounts_", "exemplars_", e.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f3<k0> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (k0.class) {
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

    @Override // com.google.api.l0
    public boolean ba() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.api.l0
    public List<Long> c9() {
        return this.bucketCounts_;
    }

    @Override // com.google.api.l0
    public int e8() {
        return this.bucketCounts_.size();
    }

    @Override // com.google.api.l0
    public b fj() {
        b bVarOm = this.bucketOptions_;
        if (bVarOm == null) {
            bVarOm = b.om();
        }
        return bVarOm;
    }

    @Override // com.google.api.l0
    public long getCount() {
        return this.count_;
    }

    @Override // com.google.api.l0
    public e ji(int i10) {
        return this.exemplars_.get(i10);
    }

    @Override // com.google.api.l0
    public List<e> jk() {
        return this.exemplars_;
    }

    @Override // com.google.api.l0
    public long mb(int i10) {
        return this.bucketCounts_.getLong(i10);
    }

    @Override // com.google.api.l0
    public g o6() {
        g gVarGm = this.range_;
        if (gVarGm == null) {
            gVarGm = g.gm();
        }
        return gVarGm;
    }

    @Override // com.google.api.l0
    public double sd() {
        return this.sumOfSquaredDeviation_;
    }

    @Override // com.google.api.l0
    public double wf() {
        return this.mean_;
    }
}
