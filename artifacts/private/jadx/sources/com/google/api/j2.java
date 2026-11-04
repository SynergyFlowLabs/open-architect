package com.google.api;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class j2 extends com.google.protobuf.l1<j2, b> implements k2 {
    public static final int CANONICAL_SCOPES_FIELD_NUMBER = 1;
    private static final j2 DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.f3<j2> PARSER;
    private String canonicalScopes_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116223a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f116223a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116223a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116223a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116223a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116223a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116223a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116223a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1.b<j2, b> implements k2 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b Ol() {
            El();
            ((j2) this.f126038b).dm();
            return this;
        }

        public b Pl(String str) {
            El();
            ((j2) this.f126038b).um(str);
            return this;
        }

        public b Ql(com.google.protobuf.u uVar) {
            El();
            ((j2) this.f126038b).vm(uVar);
            return this;
        }

        @Override // com.google.api.k2
        public String X9() {
            return ((j2) this.f126038b).X9();
        }

        @Override // com.google.api.k2
        public com.google.protobuf.u ud() {
            return ((j2) this.f126038b).ud();
        }

        private b() {
            super(j2.DEFAULT_INSTANCE);
        }
    }

    static {
        j2 j2Var = new j2();
        DEFAULT_INSTANCE = j2Var;
        com.google.protobuf.l1.Wl(j2.class, j2Var);
    }

    private j2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dm() {
        this.canonicalScopes_ = em().X9();
    }

    public static j2 em() {
        return DEFAULT_INSTANCE;
    }

    public static b fm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b gm(j2 j2Var) {
        return DEFAULT_INSTANCE.Uf(j2Var);
    }

    public static j2 hm(InputStream inputStream) throws IOException {
        return (j2) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static j2 im(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (j2) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static j2 jm(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (j2) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static j2 km(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (j2) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static j2 lm(com.google.protobuf.z zVar) throws IOException {
        return (j2) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static j2 mm(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (j2) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static j2 nm(InputStream inputStream) throws IOException {
        return (j2) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static j2 om(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (j2) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static j2 pm(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (j2) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j2 qm(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (j2) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static j2 rm(byte[] bArr) throws com.google.protobuf.t1 {
        return (j2) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static j2 sm(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (j2) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static com.google.protobuf.f3<j2> tm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void um(String str) {
        str.getClass();
        this.canonicalScopes_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.canonicalScopes_ = uVar.z0();
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        int i10 = a.f116223a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new j2();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"canonicalScopes_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f3<j2> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (j2.class) {
                    try {
                        cVar = PARSER;
                        if (cVar == null) {
                            cVar = new com.google.protobuf.l1.c(DEFAULT_INSTANCE);
                            PARSER = cVar;
                        }
                    } finally {
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

    @Override // com.google.api.k2
    public String X9() {
        return this.canonicalScopes_;
    }

    @Override // com.google.api.k2
    public com.google.protobuf.u ud() {
        return com.google.protobuf.u.C(this.canonicalScopes_);
    }
}
