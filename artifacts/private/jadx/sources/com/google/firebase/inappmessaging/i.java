package com.google.firebase.inappmessaging;

import com.google.protobuf.f3;
import com.google.protobuf.l1;
import com.google.protobuf.o2;
import com.google.protobuf.s1;
import com.google.protobuf.t1;
import com.google.protobuf.v0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f122566a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f122566a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f122566a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f122566a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f122566a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f122566a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f122566a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f122566a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1<b, a> implements c {
        private static final b DEFAULT_INSTANCE;
        public static final int EXPERIMENT_ID_FIELD_NUMBER = 1;
        private static volatile f3<b> PARSER;
        private String experimentId_ = "";

        public static final class a extends l1.b<b, a> implements c {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // com.google.firebase.inappmessaging.i.c
            public String H1() {
                return ((b) this.f126038b).H1();
            }

            public a Ol() {
                El();
                ((b) this.f126038b).dm();
                return this;
            }

            public a Pl(String str) {
                El();
                ((b) this.f126038b).um(str);
                return this;
            }

            public a Ql(com.google.protobuf.u uVar) {
                El();
                ((b) this.f126038b).vm(uVar);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.i.c
            public com.google.protobuf.u c1() {
                return ((b) this.f126038b).c1();
            }

            private a() {
                super(b.DEFAULT_INSTANCE);
            }
        }

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            l1.Wl(b.class, bVar);
        }

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void dm() {
            this.experimentId_ = em().H1();
        }

        public static b em() {
            return DEFAULT_INSTANCE;
        }

        public static a fm() {
            return DEFAULT_INSTANCE.jf();
        }

        public static a gm(b bVar) {
            return DEFAULT_INSTANCE.Uf(bVar);
        }

        public static b hm(InputStream inputStream) throws IOException {
            return (b) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static b im(InputStream inputStream, v0 v0Var) throws IOException {
            return (b) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static b jm(com.google.protobuf.u uVar) throws t1 {
            return (b) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static b km(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (b) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static b lm(com.google.protobuf.z zVar) throws IOException {
            return (b) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static b mm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (b) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static b nm(InputStream inputStream) throws IOException {
            return (b) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static b om(InputStream inputStream, v0 v0Var) throws IOException {
            return (b) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static b pm(ByteBuffer byteBuffer) throws t1 {
            return (b) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static b qm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (b) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static b rm(byte[] bArr) throws t1 {
            return (b) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static b sm(byte[] bArr, v0 v0Var) throws t1 {
            return (b) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<b> tm() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void um(String str) {
            str.getClass();
            this.experimentId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void vm(com.google.protobuf.u uVar) {
            com.google.protobuf.a.R(uVar);
            this.experimentId_ = uVar.z0();
        }

        @Override // com.google.firebase.inappmessaging.i.c
        public String H1() {
            return this.experimentId_;
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            int i10 = a.f122566a[iVar.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new b();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"experimentId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f3<b> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (b.class) {
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

        @Override // com.google.firebase.inappmessaging.i.c
        public com.google.protobuf.u c1() {
            return com.google.protobuf.u.C(this.experimentId_);
        }
    }

    public interface c extends o2 {
        String H1();

        com.google.protobuf.u c1();
    }

    public static final class d extends l1<d, a> implements e {
        public static final int ACTIVATE_EVENT_TO_LOG_FIELD_NUMBER = 8;
        public static final int CLEAR_EVENT_TO_LOG_FIELD_NUMBER = 9;
        private static final d DEFAULT_INSTANCE;
        public static final int EXPERIMENT_ID_FIELD_NUMBER = 1;
        public static final int EXPERIMENT_START_TIME_MILLIS_FIELD_NUMBER = 3;
        public static final int ONGOING_EXPERIMENTS_FIELD_NUMBER = 13;
        public static final int OVERFLOW_POLICY_FIELD_NUMBER = 12;
        private static volatile f3<d> PARSER = null;
        public static final int SET_EVENT_TO_LOG_FIELD_NUMBER = 7;
        public static final int TIMEOUT_EVENT_TO_LOG_FIELD_NUMBER = 10;
        public static final int TIME_TO_LIVE_MILLIS_FIELD_NUMBER = 6;
        public static final int TRIGGER_EVENT_FIELD_NUMBER = 4;
        public static final int TRIGGER_TIMEOUT_MILLIS_FIELD_NUMBER = 5;
        public static final int TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER = 11;
        public static final int VARIANT_ID_FIELD_NUMBER = 2;
        private long experimentStartTimeMillis_;
        private int overflowPolicy_;
        private long timeToLiveMillis_;
        private long triggerTimeoutMillis_;
        private String experimentId_ = "";
        private String variantId_ = "";
        private String triggerEvent_ = "";
        private String setEventToLog_ = "";
        private String activateEventToLog_ = "";
        private String clearEventToLog_ = "";
        private String timeoutEventToLog_ = "";
        private String ttlExpiryEventToLog_ = "";
        private s1.k<b> ongoingExperiments_ = l1.Ij();

        public static final class a extends l1.b<d, a> implements e {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a Am(String str) {
                El();
                ((d) this.f126038b).Pn(str);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.i.e
            public com.google.protobuf.u Bh() {
                return ((d) this.f126038b).Bh();
            }

            public a Bm(com.google.protobuf.u uVar) {
                El();
                ((d) this.f126038b).Qn(uVar);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.i.e
            public b Ca() {
                return ((d) this.f126038b).Ca();
            }

            public a Cm(String str) {
                El();
                ((d) this.f126038b).Rn(str);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.i.e
            public long D8() {
                return ((d) this.f126038b).D8();
            }

            public a Dm(com.google.protobuf.u uVar) {
                El();
                ((d) this.f126038b).Sn(uVar);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.i.e
            public com.google.protobuf.u Ef() {
                return ((d) this.f126038b).Ef();
            }

            @Override // com.google.firebase.inappmessaging.i.e
            public String Eh() {
                return ((d) this.f126038b).Eh();
            }

            @Override // com.google.firebase.inappmessaging.i.e
            public List<b> Fb() {
                return Collections.unmodifiableList(((d) this.f126038b).Fb());
            }

            @Override // com.google.firebase.inappmessaging.i.e
            public String Fj() {
                return ((d) this.f126038b).Fj();
            }

            @Override // com.google.firebase.inappmessaging.i.e
            public String H1() {
                return ((d) this.f126038b).H1();
            }

            @Override // com.google.firebase.inappmessaging.i.e
            public com.google.protobuf.u N9() {
                return ((d) this.f126038b).N9();
            }

            public a Ol(Iterable<? extends b> iterable) {
                El();
                ((d) this.f126038b).Nm(iterable);
                return this;
            }

            public a Pl(int i10, b.a aVar) {
                El();
                ((d) this.f126038b).Om(i10, aVar.build());
                return this;
            }

            public a Ql(int i10, b bVar) {
                El();
                ((d) this.f126038b).Om(i10, bVar);
                return this;
            }

            public a Rl(b.a aVar) {
                El();
                ((d) this.f126038b).Pm(aVar.build());
                return this;
            }

            public a Sl(b bVar) {
                El();
                ((d) this.f126038b).Pm(bVar);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.i.e
            public String Tc() {
                return ((d) this.f126038b).Tc();
            }

            public a Tl() {
                El();
                ((d) this.f126038b).Qm();
                return this;
            }

            public a Ul() {
                El();
                ((d) this.f126038b).Rm();
                return this;
            }

            public a Vl() {
                El();
                ((d) this.f126038b).Sm();
                return this;
            }

            @Override // com.google.firebase.inappmessaging.i.e
            public long Wa() {
                return ((d) this.f126038b).Wa();
            }

            @Override // com.google.firebase.inappmessaging.i.e
            public com.google.protobuf.u Wj() {
                return ((d) this.f126038b).Wj();
            }

            public a Wl() {
                El();
                ((d) this.f126038b).Tm();
                return this;
            }

            @Override // com.google.firebase.inappmessaging.i.e
            public b Xe(int i10) {
                return ((d) this.f126038b).Xe(i10);
            }

            @Override // com.google.firebase.inappmessaging.i.e
            public com.google.protobuf.u Xk() {
                return ((d) this.f126038b).Xk();
            }

            public a Xl() {
                El();
                ((d) this.f126038b).Um();
                return this;
            }

            public a Yl() {
                El();
                ((d) this.f126038b).Vm();
                return this;
            }

            @Override // com.google.firebase.inappmessaging.i.e
            public com.google.protobuf.u Zf() {
                return ((d) this.f126038b).Zf();
            }

            @Override // com.google.firebase.inappmessaging.i.e
            public String Zg() {
                return ((d) this.f126038b).Zg();
            }

            public a Zl() {
                El();
                ((d) this.f126038b).Wm();
                return this;
            }

            public a am() {
                El();
                ((d) this.f126038b).Xm();
                return this;
            }

            public a bm() {
                El();
                ((d) this.f126038b).Ym();
                return this;
            }

            @Override // com.google.firebase.inappmessaging.i.e
            public com.google.protobuf.u c1() {
                return ((d) this.f126038b).c1();
            }

            @Override // com.google.firebase.inappmessaging.i.e
            public String ce() {
                return ((d) this.f126038b).ce();
            }

            public a cm() {
                El();
                ((d) this.f126038b).Zm();
                return this;
            }

            @Override // com.google.firebase.inappmessaging.i.e
            public com.google.protobuf.u di() {
                return ((d) this.f126038b).di();
            }

            public a dm() {
                El();
                ((d) this.f126038b).an();
                return this;
            }

            public a em() {
                El();
                ((d) this.f126038b).bn();
                return this;
            }

            public a fm() {
                El();
                ((d) this.f126038b).cn();
                return this;
            }

            @Override // com.google.firebase.inappmessaging.i.e
            public int gc() {
                return ((d) this.f126038b).gc();
            }

            public a gm(int i10) {
                El();
                ((d) this.f126038b).wn(i10);
                return this;
            }

            public a hm(String str) {
                El();
                ((d) this.f126038b).xn(str);
                return this;
            }

            public a im(com.google.protobuf.u uVar) {
                El();
                ((d) this.f126038b).yn(uVar);
                return this;
            }

            public a jm(String str) {
                El();
                ((d) this.f126038b).zn(str);
                return this;
            }

            public a km(com.google.protobuf.u uVar) {
                El();
                ((d) this.f126038b).An(uVar);
                return this;
            }

            public a lm(String str) {
                El();
                ((d) this.f126038b).Bn(str);
                return this;
            }

            public a mm(com.google.protobuf.u uVar) {
                El();
                ((d) this.f126038b).Cn(uVar);
                return this;
            }

            public a nm(long j10) {
                El();
                ((d) this.f126038b).Dn(j10);
                return this;
            }

            public a om(int i10, b.a aVar) {
                El();
                ((d) this.f126038b).En(i10, aVar.build());
                return this;
            }

            public a pm(int i10, b bVar) {
                El();
                ((d) this.f126038b).En(i10, bVar);
                return this;
            }

            public a qm(b bVar) {
                El();
                ((d) this.f126038b).Fn(bVar);
                return this;
            }

            public a rm(int i10) {
                El();
                ((d) this.f126038b).Gn(i10);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.i.e
            public String sg() {
                return ((d) this.f126038b).sg();
            }

            public a sm(String str) {
                El();
                ((d) this.f126038b).Hn(str);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.i.e
            public int ta() {
                return ((d) this.f126038b).ta();
            }

            public a tm(com.google.protobuf.u uVar) {
                El();
                ((d) this.f126038b).In(uVar);
                return this;
            }

            public a um(long j10) {
                El();
                ((d) this.f126038b).Jn(j10);
                return this;
            }

            public a vm(String str) {
                El();
                ((d) this.f126038b).Kn(str);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.i.e
            public long wk() {
                return ((d) this.f126038b).wk();
            }

            public a wm(com.google.protobuf.u uVar) {
                El();
                ((d) this.f126038b).Ln(uVar);
                return this;
            }

            public a xm(String str) {
                El();
                ((d) this.f126038b).Mn(str);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.i.e
            public String yg() {
                return ((d) this.f126038b).yg();
            }

            public a ym(com.google.protobuf.u uVar) {
                El();
                ((d) this.f126038b).Nn(uVar);
                return this;
            }

            public a zm(long j10) {
                El();
                ((d) this.f126038b).On(j10);
                return this;
            }

            private a() {
                super(d.DEFAULT_INSTANCE);
            }
        }

        public enum b implements s1.c {
            POLICY_UNSPECIFIED(0),
            DISCARD_OLDEST(1),
            IGNORE_NEWEST(2),
            UNRECOGNIZED(-1);


            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f122571f = 0;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f122572g = 1;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final int f122573h = 2;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static final s1.d<b> f122574i = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f122576a;

            class a implements s1.d<b> {
                a() {
                }

                @Override // com.google.protobuf.s1.d
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public b a(int i10) {
                    return b.l(i10);
                }
            }

            /* JADX INFO: renamed from: com.google.firebase.inappmessaging.i$d$b$b, reason: collision with other inner class name */
            private static final class C1160b implements s1.e {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                static final s1.e f122577a = new C1160b();

                private C1160b() {
                }

                @Override // com.google.protobuf.s1.e
                public boolean a(int i10) {
                    return b.l(i10) != null;
                }
            }

            b(int i10) {
                this.f122576a = i10;
            }

            public static b l(int i10) {
                if (i10 == 0) {
                    return POLICY_UNSPECIFIED;
                }
                if (i10 == 1) {
                    return DISCARD_OLDEST;
                }
                if (i10 != 2) {
                    return null;
                }
                return IGNORE_NEWEST;
            }

            public static s1.d<b> n() {
                return f122574i;
            }

            public static s1.e o() {
                return C1160b.f122577a;
            }

            @Deprecated
            public static b p(int i10) {
                return l(i10);
            }

            @Override // com.google.protobuf.s1.c
            public final int i() {
                if (this != UNRECOGNIZED) {
                    return this.f122576a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            d dVar = new d();
            DEFAULT_INSTANCE = dVar;
            l1.Wl(d.class, dVar);
        }

        private d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void An(com.google.protobuf.u uVar) {
            com.google.protobuf.a.R(uVar);
            this.clearEventToLog_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Bn(String str) {
            str.getClass();
            this.experimentId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Cn(com.google.protobuf.u uVar) {
            com.google.protobuf.a.R(uVar);
            this.experimentId_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Dn(long j10) {
            this.experimentStartTimeMillis_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void En(int i10, b bVar) {
            bVar.getClass();
            dn();
            this.ongoingExperiments_.set(i10, bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Fn(b bVar) {
            this.overflowPolicy_ = bVar.i();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Gn(int i10) {
            this.overflowPolicy_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Hn(String str) {
            str.getClass();
            this.setEventToLog_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void In(com.google.protobuf.u uVar) {
            com.google.protobuf.a.R(uVar);
            this.setEventToLog_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Jn(long j10) {
            this.timeToLiveMillis_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Kn(String str) {
            str.getClass();
            this.timeoutEventToLog_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ln(com.google.protobuf.u uVar) {
            com.google.protobuf.a.R(uVar);
            this.timeoutEventToLog_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Mn(String str) {
            str.getClass();
            this.triggerEvent_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Nm(Iterable<? extends b> iterable) {
            dn();
            com.google.protobuf.a.y(iterable, this.ongoingExperiments_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Nn(com.google.protobuf.u uVar) {
            com.google.protobuf.a.R(uVar);
            this.triggerEvent_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Om(int i10, b bVar) {
            bVar.getClass();
            dn();
            this.ongoingExperiments_.add(i10, bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void On(long j10) {
            this.triggerTimeoutMillis_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Pm(b bVar) {
            bVar.getClass();
            dn();
            this.ongoingExperiments_.add(bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Pn(String str) {
            str.getClass();
            this.ttlExpiryEventToLog_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Qm() {
            this.activateEventToLog_ = en().Eh();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Qn(com.google.protobuf.u uVar) {
            com.google.protobuf.a.R(uVar);
            this.ttlExpiryEventToLog_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Rm() {
            this.clearEventToLog_ = en().yg();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Rn(String str) {
            str.getClass();
            this.variantId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Sm() {
            this.experimentId_ = en().H1();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Sn(com.google.protobuf.u uVar) {
            com.google.protobuf.a.R(uVar);
            this.variantId_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Tm() {
            this.experimentStartTimeMillis_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Um() {
            this.ongoingExperiments_ = l1.Ij();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Vm() {
            this.overflowPolicy_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Wm() {
            this.setEventToLog_ = en().sg();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Xm() {
            this.timeToLiveMillis_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ym() {
            this.timeoutEventToLog_ = en().Tc();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Zm() {
            this.triggerEvent_ = en().ce();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void an() {
            this.triggerTimeoutMillis_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void bn() {
            this.ttlExpiryEventToLog_ = en().Zg();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void cn() {
            this.variantId_ = en().Fj();
        }

        private void dn() {
            s1.k<b> kVar = this.ongoingExperiments_;
            if (!kVar.s1()) {
                this.ongoingExperiments_ = l1.yl(kVar);
            }
        }

        public static d en() {
            return DEFAULT_INSTANCE;
        }

        public static a hn() {
            return DEFAULT_INSTANCE.jf();
        }

        public static a in(d dVar) {
            return DEFAULT_INSTANCE.Uf(dVar);
        }

        public static d jn(InputStream inputStream) throws IOException {
            return (d) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static d kn(InputStream inputStream, v0 v0Var) throws IOException {
            return (d) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static d ln(com.google.protobuf.u uVar) throws t1 {
            return (d) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static d mn(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (d) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static d nn(com.google.protobuf.z zVar) throws IOException {
            return (d) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static d on(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (d) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static d pn(InputStream inputStream) throws IOException {
            return (d) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static d qn(InputStream inputStream, v0 v0Var) throws IOException {
            return (d) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static d rn(ByteBuffer byteBuffer) throws t1 {
            return (d) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static d sn(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (d) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static d tn(byte[] bArr) throws t1 {
            return (d) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static d un(byte[] bArr, v0 v0Var) throws t1 {
            return (d) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<d> vn() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void wn(int i10) {
            dn();
            this.ongoingExperiments_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void xn(String str) {
            str.getClass();
            this.activateEventToLog_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void yn(com.google.protobuf.u uVar) {
            com.google.protobuf.a.R(uVar);
            this.activateEventToLog_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zn(String str) {
            str.getClass();
            this.clearEventToLog_ = str;
        }

        @Override // com.google.firebase.inappmessaging.i.e
        public com.google.protobuf.u Bh() {
            return com.google.protobuf.u.C(this.setEventToLog_);
        }

        @Override // com.google.firebase.inappmessaging.i.e
        public b Ca() {
            b bVarL = b.l(this.overflowPolicy_);
            return bVarL == null ? b.UNRECOGNIZED : bVarL;
        }

        @Override // com.google.firebase.inappmessaging.i.e
        public long D8() {
            return this.timeToLiveMillis_;
        }

        @Override // com.google.firebase.inappmessaging.i.e
        public com.google.protobuf.u Ef() {
            return com.google.protobuf.u.C(this.ttlExpiryEventToLog_);
        }

        @Override // com.google.firebase.inappmessaging.i.e
        public String Eh() {
            return this.activateEventToLog_;
        }

        @Override // com.google.firebase.inappmessaging.i.e
        public List<b> Fb() {
            return this.ongoingExperiments_;
        }

        @Override // com.google.firebase.inappmessaging.i.e
        public String Fj() {
            return this.variantId_;
        }

        @Override // com.google.firebase.inappmessaging.i.e
        public String H1() {
            return this.experimentId_;
        }

        @Override // com.google.firebase.inappmessaging.i.e
        public com.google.protobuf.u N9() {
            return com.google.protobuf.u.C(this.triggerEvent_);
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            a aVar = null;
            switch (a.f122566a[iVar.ordinal()]) {
                case 1:
                    return new d();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0000\r\u0000\u0000\u0001\r\r\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004Ȉ\u0005\u0002\u0006\u0002\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\f\f\r\u001b", new Object[]{"experimentId_", "variantId_", "experimentStartTimeMillis_", "triggerEvent_", "triggerTimeoutMillis_", "timeToLiveMillis_", "setEventToLog_", "activateEventToLog_", "clearEventToLog_", "timeoutEventToLog_", "ttlExpiryEventToLog_", "overflowPolicy_", "ongoingExperiments_", b.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f3<d> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (d.class) {
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

        @Override // com.google.firebase.inappmessaging.i.e
        public String Tc() {
            return this.timeoutEventToLog_;
        }

        @Override // com.google.firebase.inappmessaging.i.e
        public long Wa() {
            return this.triggerTimeoutMillis_;
        }

        @Override // com.google.firebase.inappmessaging.i.e
        public com.google.protobuf.u Wj() {
            return com.google.protobuf.u.C(this.clearEventToLog_);
        }

        @Override // com.google.firebase.inappmessaging.i.e
        public b Xe(int i10) {
            return this.ongoingExperiments_.get(i10);
        }

        @Override // com.google.firebase.inappmessaging.i.e
        public com.google.protobuf.u Xk() {
            return com.google.protobuf.u.C(this.variantId_);
        }

        @Override // com.google.firebase.inappmessaging.i.e
        public com.google.protobuf.u Zf() {
            return com.google.protobuf.u.C(this.timeoutEventToLog_);
        }

        @Override // com.google.firebase.inappmessaging.i.e
        public String Zg() {
            return this.ttlExpiryEventToLog_;
        }

        @Override // com.google.firebase.inappmessaging.i.e
        public com.google.protobuf.u c1() {
            return com.google.protobuf.u.C(this.experimentId_);
        }

        @Override // com.google.firebase.inappmessaging.i.e
        public String ce() {
            return this.triggerEvent_;
        }

        @Override // com.google.firebase.inappmessaging.i.e
        public com.google.protobuf.u di() {
            return com.google.protobuf.u.C(this.activateEventToLog_);
        }

        public c fn(int i10) {
            return this.ongoingExperiments_.get(i10);
        }

        @Override // com.google.firebase.inappmessaging.i.e
        public int gc() {
            return this.overflowPolicy_;
        }

        public List<? extends c> gn() {
            return this.ongoingExperiments_;
        }

        @Override // com.google.firebase.inappmessaging.i.e
        public String sg() {
            return this.setEventToLog_;
        }

        @Override // com.google.firebase.inappmessaging.i.e
        public int ta() {
            return this.ongoingExperiments_.size();
        }

        @Override // com.google.firebase.inappmessaging.i.e
        public long wk() {
            return this.experimentStartTimeMillis_;
        }

        @Override // com.google.firebase.inappmessaging.i.e
        public String yg() {
            return this.clearEventToLog_;
        }
    }

    public interface e extends o2 {
        com.google.protobuf.u Bh();

        d.b Ca();

        long D8();

        com.google.protobuf.u Ef();

        String Eh();

        List<b> Fb();

        String Fj();

        String H1();

        com.google.protobuf.u N9();

        String Tc();

        long Wa();

        com.google.protobuf.u Wj();

        b Xe(int i10);

        com.google.protobuf.u Xk();

        com.google.protobuf.u Zf();

        String Zg();

        com.google.protobuf.u c1();

        String ce();

        com.google.protobuf.u di();

        int gc();

        String sg();

        int ta();

        long wk();

        String yg();
    }

    private i() {
    }

    public static void a(v0 v0Var) {
    }
}
