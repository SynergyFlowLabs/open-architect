package com.google.api;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends com.google.protobuf.l1<a, b> implements com.google.api.b {
    private static final a DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.f3<a> PARSER;
    private String description_ = "";

    /* JADX INFO: renamed from: com.google.api.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C1008a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f115119a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f115119a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f115119a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f115119a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f115119a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f115119a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f115119a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f115119a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1.b<a, b> implements com.google.api.b {
        /* synthetic */ b(C1008a c1008a) {
            this();
        }

        public b Ol() {
            El();
            ((a) this.f126038b).dm();
            return this;
        }

        public b Pl(String str) {
            El();
            ((a) this.f126038b).um(str);
            return this;
        }

        public b Ql(com.google.protobuf.u uVar) {
            El();
            ((a) this.f126038b).vm(uVar);
            return this;
        }

        @Override // com.google.api.b
        public String getDescription() {
            return ((a) this.f126038b).getDescription();
        }

        @Override // com.google.api.b
        public com.google.protobuf.u k() {
            return ((a) this.f126038b).k();
        }

        private b() {
            super(a.DEFAULT_INSTANCE);
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        com.google.protobuf.l1.Wl(a.class, aVar);
    }

    private a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dm() {
        this.description_ = em().getDescription();
    }

    public static a em() {
        return DEFAULT_INSTANCE;
    }

    public static b fm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b gm(a aVar) {
        return DEFAULT_INSTANCE.Uf(aVar);
    }

    public static a hm(InputStream inputStream) throws IOException {
        return (a) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static a im(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (a) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static a jm(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (a) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static a km(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (a) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static a lm(com.google.protobuf.z zVar) throws IOException {
        return (a) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static a mm(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (a) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static a nm(InputStream inputStream) throws IOException {
        return (a) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static a om(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (a) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static a pm(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (a) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static a qm(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (a) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static a rm(byte[] bArr) throws com.google.protobuf.t1 {
        return (a) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static a sm(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (a) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static com.google.protobuf.f3<a> tm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void um(String str) {
        str.getClass();
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.description_ = uVar.z0();
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        int i10 = C1008a.f115119a[iVar.ordinal()];
        C1008a c1008a = null;
        switch (i10) {
            case 1:
                return new a();
            case 2:
                return new b(c1008a);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"description_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f3<a> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (a.class) {
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

    @Override // com.google.api.b
    public String getDescription() {
        return this.description_;
    }

    @Override // com.google.api.b
    public com.google.protobuf.u k() {
        return com.google.protobuf.u.C(this.description_);
    }
}
