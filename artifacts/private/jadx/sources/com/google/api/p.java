package com.google.api;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends com.google.protobuf.l1<p, c> implements q {
    public static final int ADDRESS_FIELD_NUMBER = 2;
    public static final int DEADLINE_FIELD_NUMBER = 3;
    private static final p DEFAULT_INSTANCE;
    public static final int DISABLE_AUTH_FIELD_NUMBER = 8;
    public static final int JWT_AUDIENCE_FIELD_NUMBER = 7;
    public static final int MIN_DEADLINE_FIELD_NUMBER = 4;
    public static final int OPERATION_DEADLINE_FIELD_NUMBER = 5;
    private static volatile com.google.protobuf.f3<p> PARSER = null;
    public static final int PATH_TRANSLATION_FIELD_NUMBER = 6;
    public static final int PROTOCOL_FIELD_NUMBER = 9;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private Object authentication_;
    private double deadline_;
    private double minDeadline_;
    private double operationDeadline_;
    private int pathTranslation_;
    private int authenticationCase_ = 0;
    private String selector_ = "";
    private String address_ = "";
    private String protocol_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116257a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f116257a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116257a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116257a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116257a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116257a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116257a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116257a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public enum b {
        JWT_AUDIENCE(7),
        DISABLE_AUTH(8),
        AUTHENTICATION_NOT_SET(0);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f116262a;

        b(int i10) {
            this.f116262a = i10;
        }

        public static b l(int i10) {
            if (i10 == 0) {
                return AUTHENTICATION_NOT_SET;
            }
            if (i10 == 7) {
                return JWT_AUDIENCE;
            }
            if (i10 != 8) {
                return null;
            }
            return DISABLE_AUTH;
        }

        @Deprecated
        public static b n(int i10) {
            return l(i10);
        }

        public int i() {
            return this.f116262a;
        }
    }

    public static final class c extends com.google.protobuf.l1.b<p, c> implements q {
        /* synthetic */ c(a aVar) {
            this();
        }

        @Override // com.google.api.q
        public String A() {
            return ((p) this.f126038b).A();
        }

        @Override // com.google.api.q
        public com.google.protobuf.u B() {
            return ((p) this.f126038b).B();
        }

        @Override // com.google.api.q
        public double Gi() {
            return ((p) this.f126038b).Gi();
        }

        @Override // com.google.api.q
        public double Nf() {
            return ((p) this.f126038b).Nf();
        }

        public c Ol() {
            El();
            ((p) this.f126038b).ym();
            return this;
        }

        public c Pl() {
            El();
            ((p) this.f126038b).zm();
            return this;
        }

        public c Ql() {
            El();
            ((p) this.f126038b).Am();
            return this;
        }

        @Override // com.google.api.q
        public boolean Rc() {
            return ((p) this.f126038b).Rc();
        }

        @Override // com.google.api.q
        public d Rj() {
            return ((p) this.f126038b).Rj();
        }

        public c Rl() {
            El();
            ((p) this.f126038b).Bm();
            return this;
        }

        public c Sl() {
            El();
            ((p) this.f126038b).Cm();
            return this;
        }

        public c Tl() {
            El();
            ((p) this.f126038b).Dm();
            return this;
        }

        public c Ul() {
            El();
            ((p) this.f126038b).Em();
            return this;
        }

        public c Vl() {
            El();
            ((p) this.f126038b).Fm();
            return this;
        }

        public c Wl() {
            El();
            ((p) this.f126038b).Gm();
            return this;
        }

        public c Xl() {
            El();
            ((p) this.f126038b).Hm();
            return this;
        }

        public c Yl(String str) {
            El();
            ((p) this.f126038b).Ym(str);
            return this;
        }

        public c Zl(com.google.protobuf.u uVar) {
            El();
            ((p) this.f126038b).Zm(uVar);
            return this;
        }

        public c am(double d10) {
            El();
            ((p) this.f126038b).an(d10);
            return this;
        }

        @Override // com.google.api.q
        public b bg() {
            return ((p) this.f126038b).bg();
        }

        public c bm(boolean z10) {
            El();
            ((p) this.f126038b).bn(z10);
            return this;
        }

        public c cm(String str) {
            El();
            ((p) this.f126038b).cn(str);
            return this;
        }

        public c dm(com.google.protobuf.u uVar) {
            El();
            ((p) this.f126038b).dn(uVar);
            return this;
        }

        public c em(double d10) {
            El();
            ((p) this.f126038b).en(d10);
            return this;
        }

        public c fm(double d10) {
            El();
            ((p) this.f126038b).fn(d10);
            return this;
        }

        @Override // com.google.api.q
        public boolean ge() {
            return ((p) this.f126038b).ge();
        }

        @Override // com.google.api.q
        public String getProtocol() {
            return ((p) this.f126038b).getProtocol();
        }

        public c gm(d dVar) {
            El();
            ((p) this.f126038b).gn(dVar);
            return this;
        }

        public c hm(int i10) {
            El();
            ((p) this.f126038b).hn(i10);
            return this;
        }

        public c im(String str) {
            El();
            ((p) this.f126038b).in(str);
            return this;
        }

        public c jm(com.google.protobuf.u uVar) {
            El();
            ((p) this.f126038b).jn(uVar);
            return this;
        }

        @Override // com.google.api.q
        public String ka() {
            return ((p) this.f126038b).ka();
        }

        public c km(String str) {
            El();
            ((p) this.f126038b).kn(str);
            return this;
        }

        @Override // com.google.api.q
        public int la() {
            return ((p) this.f126038b).la();
        }

        @Override // com.google.api.q
        public com.google.protobuf.u lb() {
            return ((p) this.f126038b).lb();
        }

        public c lm(com.google.protobuf.u uVar) {
            El();
            ((p) this.f126038b).ln(uVar);
            return this;
        }

        @Override // com.google.api.q
        public boolean mf() {
            return ((p) this.f126038b).mf();
        }

        @Override // com.google.api.q
        public com.google.protobuf.u o0() {
            return ((p) this.f126038b).o0();
        }

        @Override // com.google.api.q
        public com.google.protobuf.u t9() {
            return ((p) this.f126038b).t9();
        }

        @Override // com.google.api.q
        public String v1() {
            return ((p) this.f126038b).v1();
        }

        @Override // com.google.api.q
        public double xc() {
            return ((p) this.f126038b).xc();
        }

        private c() {
            super(p.DEFAULT_INSTANCE);
        }
    }

    public enum d implements com.google.protobuf.s1.c {
        PATH_TRANSLATION_UNSPECIFIED(0),
        CONSTANT_ADDRESS(1),
        APPEND_PATH_TO_ADDRESS(2),
        UNRECOGNIZED(-1);


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f116267f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f116268g = 1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f116269h = 2;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final com.google.protobuf.s1.d<d> f116270i = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f116272a;

        class a implements com.google.protobuf.s1.d<d> {
            a() {
            }

            @Override // com.google.protobuf.s1.d
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d a(int i10) {
                return d.l(i10);
            }
        }

        private static final class b implements com.google.protobuf.s1.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final com.google.protobuf.s1.e f116273a = new b();

            private b() {
            }

            @Override // com.google.protobuf.s1.e
            public boolean a(int i10) {
                return d.l(i10) != null;
            }
        }

        d(int i10) {
            this.f116272a = i10;
        }

        public static d l(int i10) {
            if (i10 == 0) {
                return PATH_TRANSLATION_UNSPECIFIED;
            }
            if (i10 == 1) {
                return CONSTANT_ADDRESS;
            }
            if (i10 != 2) {
                return null;
            }
            return APPEND_PATH_TO_ADDRESS;
        }

        public static com.google.protobuf.s1.d<d> n() {
            return f116270i;
        }

        public static com.google.protobuf.s1.e o() {
            return b.f116273a;
        }

        @Deprecated
        public static d p(int i10) {
            return l(i10);
        }

        @Override // com.google.protobuf.s1.c
        public final int i() {
            if (this != UNRECOGNIZED) {
                return this.f116272a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        p pVar = new p();
        DEFAULT_INSTANCE = pVar;
        com.google.protobuf.l1.Wl(p.class, pVar);
    }

    private p() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Am() {
        this.deadline_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bm() {
        if (this.authenticationCase_ == 8) {
            this.authenticationCase_ = 0;
            this.authentication_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Cm() {
        if (this.authenticationCase_ == 7) {
            this.authenticationCase_ = 0;
            this.authentication_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dm() {
        this.minDeadline_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Em() {
        this.operationDeadline_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Fm() {
        this.pathTranslation_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Gm() {
        this.protocol_ = Im().getProtocol();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Hm() {
        this.selector_ = Im().A();
    }

    public static p Im() {
        return DEFAULT_INSTANCE;
    }

    public static c Jm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static c Km(p pVar) {
        return DEFAULT_INSTANCE.Uf(pVar);
    }

    public static p Lm(InputStream inputStream) throws IOException {
        return (p) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static p Mm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (p) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static p Nm(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (p) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static p Om(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (p) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static p Pm(com.google.protobuf.z zVar) throws IOException {
        return (p) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static p Qm(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (p) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static p Rm(InputStream inputStream) throws IOException {
        return (p) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static p Sm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (p) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static p Tm(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (p) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static p Um(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (p) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static p Vm(byte[] bArr) throws com.google.protobuf.t1 {
        return (p) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static p Wm(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (p) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static com.google.protobuf.f3<p> Xm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Ym(String str) {
        str.getClass();
        this.address_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Zm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.address_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void an(double d10) {
        this.deadline_ = d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bn(boolean z10) {
        this.authenticationCase_ = 8;
        this.authentication_ = Boolean.valueOf(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cn(String str) {
        str.getClass();
        this.authenticationCase_ = 7;
        this.authentication_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dn(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.authentication_ = uVar.z0();
        this.authenticationCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void en(double d10) {
        this.minDeadline_ = d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fn(double d10) {
        this.operationDeadline_ = d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gn(d dVar) {
        this.pathTranslation_ = dVar.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn(int i10) {
        this.pathTranslation_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void in(String str) {
        str.getClass();
        this.protocol_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jn(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.protocol_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kn(String str) {
        str.getClass();
        this.selector_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ln(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.selector_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ym() {
        this.address_ = Im().v1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zm() {
        this.authenticationCase_ = 0;
        this.authentication_ = null;
    }

    @Override // com.google.api.q
    public String A() {
        return this.selector_;
    }

    @Override // com.google.api.q
    public com.google.protobuf.u B() {
        return com.google.protobuf.u.C(this.selector_);
    }

    @Override // com.google.api.q
    public double Gi() {
        return this.minDeadline_;
    }

    @Override // com.google.api.q
    public double Nf() {
        return this.operationDeadline_;
    }

    @Override // com.google.api.q
    public boolean Rc() {
        if (this.authenticationCase_ != 8) {
            return false;
        }
        int i10 = 6 ^ 1;
        return true;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        int i10 = a.f116257a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new p();
            case 2:
                return new c(aVar);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0000\u0004\u0000\u0005\u0000\u0006\f\u0007Ȼ\u0000\b:\u0000\tȈ", new Object[]{"authentication_", "authenticationCase_", "selector_", "address_", "deadline_", "minDeadline_", "operationDeadline_", "pathTranslation_", "protocol_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f3<p> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (p.class) {
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

    @Override // com.google.api.q
    public d Rj() {
        d dVarL = d.l(this.pathTranslation_);
        return dVarL == null ? d.UNRECOGNIZED : dVarL;
    }

    @Override // com.google.api.q
    public b bg() {
        return b.l(this.authenticationCase_);
    }

    @Override // com.google.api.q
    public boolean ge() {
        return this.authenticationCase_ == 7;
    }

    @Override // com.google.api.q
    public String getProtocol() {
        return this.protocol_;
    }

    @Override // com.google.api.q
    public String ka() {
        return this.authenticationCase_ == 7 ? (String) this.authentication_ : "";
    }

    @Override // com.google.api.q
    public int la() {
        return this.pathTranslation_;
    }

    @Override // com.google.api.q
    public com.google.protobuf.u lb() {
        return com.google.protobuf.u.C(this.authenticationCase_ == 7 ? (String) this.authentication_ : "");
    }

    @Override // com.google.api.q
    public boolean mf() {
        if (this.authenticationCase_ == 8) {
            return ((Boolean) this.authentication_).booleanValue();
        }
        return false;
    }

    @Override // com.google.api.q
    public com.google.protobuf.u o0() {
        return com.google.protobuf.u.C(this.protocol_);
    }

    @Override // com.google.api.q
    public com.google.protobuf.u t9() {
        return com.google.protobuf.u.C(this.address_);
    }

    @Override // com.google.api.q
    public String v1() {
        return this.address_;
    }

    @Override // com.google.api.q
    public double xc() {
        return this.deadline_;
    }
}
