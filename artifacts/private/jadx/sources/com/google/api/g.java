package com.google.api;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends com.google.protobuf.l1<g, b> implements h {
    public static final int AUDIENCES_FIELD_NUMBER = 2;
    private static final g DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.f3<g> PARSER = null;
    public static final int PROVIDER_ID_FIELD_NUMBER = 1;
    private String providerId_ = "";
    private String audiences_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116206a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f116206a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116206a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116206a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116206a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116206a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116206a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116206a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1.b<g, b> implements h {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.api.h
        public String G7() {
            return ((g) this.f126038b).G7();
        }

        public b Ol() {
            El();
            ((g) this.f126038b).gm();
            return this;
        }

        public b Pl() {
            El();
            ((g) this.f126038b).hm();
            return this;
        }

        public b Ql(String str) {
            El();
            ((g) this.f126038b).ym(str);
            return this;
        }

        public b Rl(com.google.protobuf.u uVar) {
            El();
            ((g) this.f126038b).zm(uVar);
            return this;
        }

        public b Sl(String str) {
            El();
            ((g) this.f126038b).Am(str);
            return this;
        }

        public b Tl(com.google.protobuf.u uVar) {
            El();
            ((g) this.f126038b).Bm(uVar);
            return this;
        }

        @Override // com.google.api.h
        public com.google.protobuf.u Vh() {
            return ((g) this.f126038b).Vh();
        }

        @Override // com.google.api.h
        public com.google.protobuf.u b5() {
            return ((g) this.f126038b).b5();
        }

        @Override // com.google.api.h
        public String lj() {
            return ((g) this.f126038b).lj();
        }

        private b() {
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
    public void Am(String str) {
        str.getClass();
        this.providerId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.providerId_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm() {
        this.audiences_ = im().G7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hm() {
        this.providerId_ = im().lj();
    }

    public static g im() {
        return DEFAULT_INSTANCE;
    }

    public static b jm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b km(g gVar) {
        return DEFAULT_INSTANCE.Uf(gVar);
    }

    public static g lm(InputStream inputStream) throws IOException {
        return (g) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static g mm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (g) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static g nm(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (g) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static g om(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (g) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static g pm(com.google.protobuf.z zVar) throws IOException {
        return (g) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static g qm(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (g) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static g rm(InputStream inputStream) throws IOException {
        return (g) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static g sm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (g) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static g tm(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (g) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static g um(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (g) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static g vm(byte[] bArr) throws com.google.protobuf.t1 {
        return (g) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static g wm(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (g) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static com.google.protobuf.f3<g> xm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ym(String str) {
        str.getClass();
        this.audiences_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.audiences_ = uVar.z0();
    }

    @Override // com.google.api.h
    public String G7() {
        return this.audiences_;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        int i10 = a.f116206a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new g();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"providerId_", "audiences_"});
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

    @Override // com.google.api.h
    public com.google.protobuf.u Vh() {
        return com.google.protobuf.u.C(this.providerId_);
    }

    @Override // com.google.api.h
    public com.google.protobuf.u b5() {
        return com.google.protobuf.u.C(this.audiences_);
    }

    @Override // com.google.api.h
    public String lj() {
        return this.providerId_;
    }
}
