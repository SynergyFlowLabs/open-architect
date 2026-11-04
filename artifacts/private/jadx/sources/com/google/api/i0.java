package com.google.api;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class i0 extends com.google.protobuf.l1<i0, b> implements j0 {
    private static final i0 DEFAULT_INSTANCE;
    public static final int KIND_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.f3<i0> PARSER = null;
    public static final int PATH_FIELD_NUMBER = 2;
    private String kind_ = "";
    private String path_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116222a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f116222a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116222a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116222a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116222a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116222a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116222a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116222a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1.b<i0, b> implements j0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.api.j0
        public com.google.protobuf.u Aa() {
            return ((i0) this.f126038b).Aa();
        }

        public b Ol() {
            El();
            ((i0) this.f126038b).gm();
            return this;
        }

        public b Pl() {
            El();
            ((i0) this.f126038b).hm();
            return this;
        }

        public b Ql(String str) {
            El();
            ((i0) this.f126038b).ym(str);
            return this;
        }

        public b Rl(com.google.protobuf.u uVar) {
            El();
            ((i0) this.f126038b).zm(uVar);
            return this;
        }

        @Override // com.google.api.j0
        public String S() {
            return ((i0) this.f126038b).S();
        }

        public b Sl(String str) {
            El();
            ((i0) this.f126038b).Am(str);
            return this;
        }

        public b Tl(com.google.protobuf.u uVar) {
            El();
            ((i0) this.f126038b).Bm(uVar);
            return this;
        }

        @Override // com.google.api.j0
        public com.google.protobuf.u Y7() {
            return ((i0) this.f126038b).Y7();
        }

        @Override // com.google.api.j0
        public String getKind() {
            return ((i0) this.f126038b).getKind();
        }

        private b() {
            super(i0.DEFAULT_INSTANCE);
        }
    }

    static {
        i0 i0Var = new i0();
        DEFAULT_INSTANCE = i0Var;
        com.google.protobuf.l1.Wl(i0.class, i0Var);
    }

    private i0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Am(String str) {
        str.getClass();
        this.path_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.path_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm() {
        this.kind_ = im().getKind();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hm() {
        this.path_ = im().S();
    }

    public static i0 im() {
        return DEFAULT_INSTANCE;
    }

    public static b jm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b km(i0 i0Var) {
        return DEFAULT_INSTANCE.Uf(i0Var);
    }

    public static i0 lm(InputStream inputStream) throws IOException {
        return (i0) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static i0 mm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (i0) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static i0 nm(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (i0) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static i0 om(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (i0) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static i0 pm(com.google.protobuf.z zVar) throws IOException {
        return (i0) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static i0 qm(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (i0) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static i0 rm(InputStream inputStream) throws IOException {
        return (i0) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static i0 sm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (i0) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static i0 tm(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (i0) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static i0 um(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (i0) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static i0 vm(byte[] bArr) throws com.google.protobuf.t1 {
        return (i0) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static i0 wm(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (i0) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static com.google.protobuf.f3<i0> xm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ym(String str) {
        str.getClass();
        this.kind_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.kind_ = uVar.z0();
    }

    @Override // com.google.api.j0
    public com.google.protobuf.u Aa() {
        return com.google.protobuf.u.C(this.kind_);
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        int i10 = a.f116222a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new i0();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"kind_", "path_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f3<i0> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (i0.class) {
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

    @Override // com.google.api.j0
    public String S() {
        return this.path_;
    }

    @Override // com.google.api.j0
    public com.google.protobuf.u Y7() {
        return com.google.protobuf.u.C(this.path_);
    }

    @Override // com.google.api.j0
    public String getKind() {
        return this.kind_;
    }
}
