package com.google.api;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class f1 extends com.google.protobuf.l1<f1, b> implements g1 {
    private static final f1 DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.f3<f1> PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int VALUE_PREFIX_FIELD_NUMBER = 3;
    private Object in_;
    private int inCase_ = 0;
    private String valuePrefix_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116200a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f116200a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int i10 = 0 & 2;
                f116200a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116200a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116200a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116200a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116200a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116200a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1.b<f1, b> implements g1 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.api.g1
        public com.google.protobuf.u A7() {
            return ((f1) this.f126038b).A7();
        }

        @Override // com.google.api.g1
        public c Cj() {
            return ((f1) this.f126038b).Cj();
        }

        @Override // com.google.api.g1
        public boolean Ec() {
            return ((f1) this.f126038b).Ec();
        }

        public b Ol() {
            El();
            ((f1) this.f126038b).km();
            return this;
        }

        public b Pl() {
            El();
            ((f1) this.f126038b).lm();
            return this;
        }

        public b Ql() {
            El();
            ((f1) this.f126038b).mm();
            return this;
        }

        public b Rl() {
            El();
            ((f1) this.f126038b).nm();
            return this;
        }

        public b Sl(String str) {
            El();
            ((f1) this.f126038b).Em(str);
            return this;
        }

        public b Tl(com.google.protobuf.u uVar) {
            El();
            ((f1) this.f126038b).Fm(uVar);
            return this;
        }

        public b Ul(String str) {
            El();
            ((f1) this.f126038b).Gm(str);
            return this;
        }

        public b Vl(com.google.protobuf.u uVar) {
            El();
            ((f1) this.f126038b).Hm(uVar);
            return this;
        }

        public b Wl(String str) {
            El();
            ((f1) this.f126038b).Im(str);
            return this;
        }

        public b Xl(com.google.protobuf.u uVar) {
            El();
            ((f1) this.f126038b).Jm(uVar);
            return this;
        }

        @Override // com.google.api.g1
        public com.google.protobuf.u Yb() {
            return ((f1) this.f126038b).Yb();
        }

        @Override // com.google.api.g1
        public com.google.protobuf.u ch() {
            return ((f1) this.f126038b).ch();
        }

        @Override // com.google.api.g1
        public String d2() {
            return ((f1) this.f126038b).d2();
        }

        @Override // com.google.api.g1
        public String fi() {
            return ((f1) this.f126038b).fi();
        }

        @Override // com.google.api.g1
        public String getHeader() {
            return ((f1) this.f126038b).getHeader();
        }

        @Override // com.google.api.g1
        public boolean pc() {
            return ((f1) this.f126038b).pc();
        }

        private b() {
            super(f1.DEFAULT_INSTANCE);
        }
    }

    public enum c {
        HEADER(1),
        QUERY(2),
        IN_NOT_SET(0);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f116205a;

        c(int i10) {
            this.f116205a = i10;
        }

        public static c l(int i10) {
            if (i10 == 0) {
                return IN_NOT_SET;
            }
            if (i10 == 1) {
                return HEADER;
            }
            if (i10 != 2) {
                return null;
            }
            return QUERY;
        }

        @Deprecated
        public static c n(int i10) {
            return l(i10);
        }

        public int i() {
            return this.f116205a;
        }
    }

    static {
        f1 f1Var = new f1();
        DEFAULT_INSTANCE = f1Var;
        com.google.protobuf.l1.Wl(f1.class, f1Var);
    }

    private f1() {
    }

    public static f1 Am(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (f1) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static f1 Bm(byte[] bArr) throws com.google.protobuf.t1 {
        return (f1) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static f1 Cm(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (f1) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static com.google.protobuf.f3<f1> Dm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Em(String str) {
        str.getClass();
        this.inCase_ = 1;
        this.in_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Fm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.in_ = uVar.z0();
        this.inCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Gm(String str) {
        str.getClass();
        this.inCase_ = 2;
        this.in_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Hm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.in_ = uVar.z0();
        this.inCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Im(String str) {
        str.getClass();
        this.valuePrefix_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Jm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.valuePrefix_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void km() {
        if (this.inCase_ == 1) {
            this.inCase_ = 0;
            this.in_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lm() {
        this.inCase_ = 0;
        this.in_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mm() {
        if (this.inCase_ == 2) {
            this.inCase_ = 0;
            this.in_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nm() {
        this.valuePrefix_ = om().fi();
    }

    public static f1 om() {
        return DEFAULT_INSTANCE;
    }

    public static b pm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b qm(f1 f1Var) {
        return DEFAULT_INSTANCE.Uf(f1Var);
    }

    public static f1 rm(InputStream inputStream) throws IOException {
        return (f1) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static f1 sm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (f1) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static f1 tm(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (f1) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static f1 um(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (f1) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static f1 vm(com.google.protobuf.z zVar) throws IOException {
        return (f1) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static f1 wm(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (f1) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static f1 xm(InputStream inputStream) throws IOException {
        return (f1) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static f1 ym(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (f1) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static f1 zm(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (f1) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    @Override // com.google.api.g1
    public com.google.protobuf.u A7() {
        return com.google.protobuf.u.C(this.inCase_ == 2 ? (String) this.in_ : "");
    }

    @Override // com.google.api.g1
    public c Cj() {
        return c.l(this.inCase_);
    }

    @Override // com.google.api.g1
    public boolean Ec() {
        return this.inCase_ == 2;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        int i10 = a.f116200a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new f1();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000\u0003Ȉ", new Object[]{"in_", "inCase_", "valuePrefix_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f3<f1> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (f1.class) {
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

    @Override // com.google.api.g1
    public com.google.protobuf.u Yb() {
        return com.google.protobuf.u.C(this.inCase_ == 1 ? (String) this.in_ : "");
    }

    @Override // com.google.api.g1
    public com.google.protobuf.u ch() {
        return com.google.protobuf.u.C(this.valuePrefix_);
    }

    @Override // com.google.api.g1
    public String d2() {
        int i10 = 2 >> 2;
        return this.inCase_ == 2 ? (String) this.in_ : "";
    }

    @Override // com.google.api.g1
    public String fi() {
        return this.valuePrefix_;
    }

    @Override // com.google.api.g1
    public String getHeader() {
        return this.inCase_ == 1 ? (String) this.in_ : "";
    }

    @Override // com.google.api.g1
    public boolean pc() {
        return this.inCase_ == 1;
    }
}
