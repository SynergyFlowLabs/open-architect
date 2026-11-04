package com.google.api;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class q0 extends com.google.protobuf.l1<q0, b> implements r0 {
    private static final q0 DEFAULT_INSTANCE;
    public static final int DEPRECATION_DESCRIPTION_FIELD_NUMBER = 3;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.f3<q0> PARSER = null;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private String selector_ = "";
    private String description_ = "";
    private String deprecationDescription_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116291a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f116291a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116291a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116291a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116291a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116291a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116291a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116291a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1.b<q0, b> implements r0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.api.r0
        public String A() {
            return ((q0) this.f126038b).A();
        }

        @Override // com.google.api.r0
        public com.google.protobuf.u B() {
            return ((q0) this.f126038b).B();
        }

        @Override // com.google.api.r0
        public com.google.protobuf.u Df() {
            return ((q0) this.f126038b).Df();
        }

        public b Ol() {
            El();
            ((q0) this.f126038b).jm();
            return this;
        }

        public b Pl() {
            El();
            ((q0) this.f126038b).km();
            return this;
        }

        public b Ql() {
            El();
            ((q0) this.f126038b).lm();
            return this;
        }

        public b Rl(String str) {
            El();
            ((q0) this.f126038b).Cm(str);
            return this;
        }

        public b Sl(com.google.protobuf.u uVar) {
            El();
            ((q0) this.f126038b).Dm(uVar);
            return this;
        }

        public b Tl(String str) {
            El();
            ((q0) this.f126038b).Em(str);
            return this;
        }

        public b Ul(com.google.protobuf.u uVar) {
            El();
            ((q0) this.f126038b).Fm(uVar);
            return this;
        }

        public b Vl(String str) {
            El();
            ((q0) this.f126038b).Gm(str);
            return this;
        }

        public b Wl(com.google.protobuf.u uVar) {
            El();
            ((q0) this.f126038b).Hm(uVar);
            return this;
        }

        @Override // com.google.api.r0
        public String Xj() {
            return ((q0) this.f126038b).Xj();
        }

        @Override // com.google.api.r0
        public String getDescription() {
            return ((q0) this.f126038b).getDescription();
        }

        @Override // com.google.api.r0
        public com.google.protobuf.u k() {
            return ((q0) this.f126038b).k();
        }

        private b() {
            super(q0.DEFAULT_INSTANCE);
        }
    }

    static {
        q0 q0Var = new q0();
        DEFAULT_INSTANCE = q0Var;
        com.google.protobuf.l1.Wl(q0.class, q0Var);
    }

    private q0() {
    }

    public static q0 Am(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (q0) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static com.google.protobuf.f3<q0> Bm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Cm(String str) {
        str.getClass();
        this.deprecationDescription_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.deprecationDescription_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Em(String str) {
        str.getClass();
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Fm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.description_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Gm(String str) {
        str.getClass();
        this.selector_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Hm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.selector_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jm() {
        this.deprecationDescription_ = mm().Xj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void km() {
        this.description_ = mm().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lm() {
        this.selector_ = mm().A();
    }

    public static q0 mm() {
        return DEFAULT_INSTANCE;
    }

    public static b nm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b om(q0 q0Var) {
        return DEFAULT_INSTANCE.Uf(q0Var);
    }

    public static q0 pm(InputStream inputStream) throws IOException {
        return (q0) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static q0 qm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (q0) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static q0 rm(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (q0) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static q0 sm(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (q0) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static q0 tm(com.google.protobuf.z zVar) throws IOException {
        return (q0) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static q0 um(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (q0) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static q0 vm(InputStream inputStream) throws IOException {
        return (q0) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static q0 wm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (q0) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static q0 xm(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (q0) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static q0 ym(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (q0) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static q0 zm(byte[] bArr) throws com.google.protobuf.t1 {
        return (q0) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.api.r0
    public String A() {
        return this.selector_;
    }

    @Override // com.google.api.r0
    public com.google.protobuf.u B() {
        return com.google.protobuf.u.C(this.selector_);
    }

    @Override // com.google.api.r0
    public com.google.protobuf.u Df() {
        return com.google.protobuf.u.C(this.deprecationDescription_);
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        int i10 = a.f116291a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new q0();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"selector_", "description_", "deprecationDescription_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f3<q0> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (q0.class) {
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

    @Override // com.google.api.r0
    public String Xj() {
        return this.deprecationDescription_;
    }

    @Override // com.google.api.r0
    public String getDescription() {
        return this.description_;
    }

    @Override // com.google.api.r0
    public com.google.protobuf.u k() {
        return com.google.protobuf.u.C(this.description_);
    }
}
