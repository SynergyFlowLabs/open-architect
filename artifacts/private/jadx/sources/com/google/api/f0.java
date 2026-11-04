package com.google.api;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 extends com.google.protobuf.l1<f0, b> implements g0 {
    private static final f0 DEFAULT_INSTANCE;
    public static final int ENVIRONMENT_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.f3<f0> PARSER;
    private String environment_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116199a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f116199a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116199a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116199a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116199a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116199a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                int i10 = 0 & 6;
                f116199a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116199a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1.b<f0, b> implements g0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.api.g0
        public String Bf() {
            return ((f0) this.f126038b).Bf();
        }

        public b Ol() {
            El();
            ((f0) this.f126038b).dm();
            return this;
        }

        public b Pl(String str) {
            El();
            ((f0) this.f126038b).um(str);
            return this;
        }

        public b Ql(com.google.protobuf.u uVar) {
            El();
            ((f0) this.f126038b).vm(uVar);
            return this;
        }

        @Override // com.google.api.g0
        public com.google.protobuf.u b8() {
            return ((f0) this.f126038b).b8();
        }

        private b() {
            super(f0.DEFAULT_INSTANCE);
        }
    }

    static {
        f0 f0Var = new f0();
        DEFAULT_INSTANCE = f0Var;
        com.google.protobuf.l1.Wl(f0.class, f0Var);
    }

    private f0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dm() {
        this.environment_ = em().Bf();
    }

    public static f0 em() {
        return DEFAULT_INSTANCE;
    }

    public static b fm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b gm(f0 f0Var) {
        return DEFAULT_INSTANCE.Uf(f0Var);
    }

    public static f0 hm(InputStream inputStream) throws IOException {
        return (f0) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static f0 im(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (f0) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static f0 jm(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (f0) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static f0 km(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (f0) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static f0 lm(com.google.protobuf.z zVar) throws IOException {
        return (f0) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static f0 mm(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (f0) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static f0 nm(InputStream inputStream) throws IOException {
        return (f0) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static f0 om(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (f0) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static f0 pm(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (f0) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static f0 qm(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (f0) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static f0 rm(byte[] bArr) throws com.google.protobuf.t1 {
        return (f0) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static f0 sm(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (f0) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static com.google.protobuf.f3<f0> tm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void um(String str) {
        str.getClass();
        this.environment_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.environment_ = uVar.z0();
    }

    @Override // com.google.api.g0
    public String Bf() {
        return this.environment_;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        int i10 = a.f116199a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new f0();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"environment_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f3<f0> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (f0.class) {
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

    @Override // com.google.api.g0
    public com.google.protobuf.u b8() {
        return com.google.protobuf.u.C(this.environment_);
    }
}
