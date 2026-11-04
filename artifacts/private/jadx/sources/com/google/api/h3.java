package com.google.api;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class h3 extends com.google.protobuf.l1<h3, b> implements i3 {
    private static final h3 DEFAULT_INSTANCE;
    public static final int HTTP_HEADER_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.f3<h3> PARSER = null;
    public static final int URL_QUERY_PARAMETER_FIELD_NUMBER = 3;
    private String name_ = "";
    private String httpHeader_ = "";
    private String urlQueryParameter_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116220a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f116220a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116220a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116220a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116220a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116220a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116220a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116220a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1.b<h3, b> implements i3 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b Ol() {
            El();
            ((h3) this.f126038b).jm();
            return this;
        }

        public b Pl() {
            El();
            ((h3) this.f126038b).km();
            return this;
        }

        public b Ql() {
            El();
            ((h3) this.f126038b).lm();
            return this;
        }

        public b Rl(String str) {
            El();
            ((h3) this.f126038b).Cm(str);
            return this;
        }

        public b Sl(com.google.protobuf.u uVar) {
            El();
            ((h3) this.f126038b).Dm(uVar);
            return this;
        }

        public b Tl(String str) {
            El();
            ((h3) this.f126038b).Em(str);
            return this;
        }

        public b Ul(com.google.protobuf.u uVar) {
            El();
            ((h3) this.f126038b).Fm(uVar);
            return this;
        }

        public b Vl(String str) {
            El();
            ((h3) this.f126038b).Gm(str);
            return this;
        }

        public b Wl(com.google.protobuf.u uVar) {
            El();
            ((h3) this.f126038b).Hm(uVar);
            return this;
        }

        @Override // com.google.api.i3
        public com.google.protobuf.u a() {
            return ((h3) this.f126038b).a();
        }

        @Override // com.google.api.i3
        public com.google.protobuf.u bc() {
            return ((h3) this.f126038b).bc();
        }

        @Override // com.google.api.i3
        public String getName() {
            return ((h3) this.f126038b).getName();
        }

        @Override // com.google.api.i3
        public String ok() {
            return ((h3) this.f126038b).ok();
        }

        @Override // com.google.api.i3
        public String sf() {
            return ((h3) this.f126038b).sf();
        }

        @Override // com.google.api.i3
        public com.google.protobuf.u wh() {
            return ((h3) this.f126038b).wh();
        }

        private b() {
            super(h3.DEFAULT_INSTANCE);
        }
    }

    static {
        h3 h3Var = new h3();
        DEFAULT_INSTANCE = h3Var;
        com.google.protobuf.l1.Wl(h3.class, h3Var);
    }

    private h3() {
    }

    public static h3 Am(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (h3) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static com.google.protobuf.f3<h3> Bm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Cm(String str) {
        str.getClass();
        this.httpHeader_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.httpHeader_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Em(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Fm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.name_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Gm(String str) {
        str.getClass();
        this.urlQueryParameter_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Hm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.urlQueryParameter_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jm() {
        this.httpHeader_ = mm().ok();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void km() {
        this.name_ = mm().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lm() {
        this.urlQueryParameter_ = mm().sf();
    }

    public static h3 mm() {
        return DEFAULT_INSTANCE;
    }

    public static b nm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b om(h3 h3Var) {
        return DEFAULT_INSTANCE.Uf(h3Var);
    }

    public static h3 pm(InputStream inputStream) throws IOException {
        return (h3) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static h3 qm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (h3) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static h3 rm(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (h3) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static h3 sm(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (h3) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static h3 tm(com.google.protobuf.z zVar) throws IOException {
        return (h3) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static h3 um(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (h3) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static h3 vm(InputStream inputStream) throws IOException {
        return (h3) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static h3 wm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (h3) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static h3 xm(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (h3) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h3 ym(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (h3) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static h3 zm(byte[] bArr) throws com.google.protobuf.t1 {
        return (h3) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        int i10 = a.f116220a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new h3();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"name_", "httpHeader_", "urlQueryParameter_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f3<h3> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (h3.class) {
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

    @Override // com.google.api.i3
    public com.google.protobuf.u a() {
        return com.google.protobuf.u.C(this.name_);
    }

    @Override // com.google.api.i3
    public com.google.protobuf.u bc() {
        return com.google.protobuf.u.C(this.urlQueryParameter_);
    }

    @Override // com.google.api.i3
    public String getName() {
        return this.name_;
    }

    @Override // com.google.api.i3
    public String ok() {
        return this.httpHeader_;
    }

    @Override // com.google.api.i3
    public String sf() {
        return this.urlQueryParameter_;
    }

    @Override // com.google.api.i3
    public com.google.protobuf.u wh() {
        return com.google.protobuf.u.C(this.httpHeader_);
    }
}
