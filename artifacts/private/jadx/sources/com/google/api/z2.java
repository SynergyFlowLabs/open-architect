package com.google.api;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class z2 extends com.google.protobuf.l1<z2, b> implements a3 {
    public static final int CHILD_TYPE_FIELD_NUMBER = 2;
    private static final z2 DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.f3<z2> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private String type_ = "";
    private String childType_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116417a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f116417a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116417a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116417a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116417a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116417a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116417a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116417a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1.b<z2, b> implements a3 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.api.a3
        public String Bi() {
            return ((z2) this.f126038b).Bi();
        }

        public b Ol() {
            El();
            ((z2) this.f126038b).gm();
            return this;
        }

        public b Pl() {
            El();
            ((z2) this.f126038b).hm();
            return this;
        }

        public b Ql(String str) {
            El();
            ((z2) this.f126038b).ym(str);
            return this;
        }

        public b Rl(com.google.protobuf.u uVar) {
            El();
            ((z2) this.f126038b).zm(uVar);
            return this;
        }

        public b Sl(String str) {
            El();
            ((z2) this.f126038b).Am(str);
            return this;
        }

        public b Tl(com.google.protobuf.u uVar) {
            El();
            ((z2) this.f126038b).Bm(uVar);
            return this;
        }

        @Override // com.google.api.a3
        public String c() {
            return ((z2) this.f126038b).c();
        }

        @Override // com.google.api.a3
        public com.google.protobuf.u rc() {
            return ((z2) this.f126038b).rc();
        }

        @Override // com.google.api.a3
        public com.google.protobuf.u s() {
            return ((z2) this.f126038b).s();
        }

        private b() {
            super(z2.DEFAULT_INSTANCE);
        }
    }

    static {
        z2 z2Var = new z2();
        DEFAULT_INSTANCE = z2Var;
        com.google.protobuf.l1.Wl(z2.class, z2Var);
    }

    private z2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Am(String str) {
        str.getClass();
        this.type_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.type_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm() {
        this.childType_ = im().Bi();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hm() {
        this.type_ = im().c();
    }

    public static z2 im() {
        return DEFAULT_INSTANCE;
    }

    public static b jm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b km(z2 z2Var) {
        return DEFAULT_INSTANCE.Uf(z2Var);
    }

    public static z2 lm(InputStream inputStream) throws IOException {
        return (z2) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static z2 mm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (z2) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static z2 nm(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (z2) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static z2 om(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (z2) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static z2 pm(com.google.protobuf.z zVar) throws IOException {
        return (z2) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static z2 qm(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (z2) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static z2 rm(InputStream inputStream) throws IOException {
        return (z2) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static z2 sm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (z2) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static z2 tm(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (z2) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static z2 um(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (z2) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static z2 vm(byte[] bArr) throws com.google.protobuf.t1 {
        return (z2) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static z2 wm(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (z2) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static com.google.protobuf.f3<z2> xm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ym(String str) {
        str.getClass();
        this.childType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.childType_ = uVar.z0();
    }

    @Override // com.google.api.a3
    public String Bi() {
        return this.childType_;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        int i10 = a.f116417a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new z2();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"type_", "childType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f3<z2> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (z2.class) {
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

    @Override // com.google.api.a3
    public String c() {
        return this.type_;
    }

    @Override // com.google.api.a3
    public com.google.protobuf.u rc() {
        return com.google.protobuf.u.C(this.childType_);
    }

    @Override // com.google.api.a3
    public com.google.protobuf.u s() {
        return com.google.protobuf.u.C(this.type_);
    }
}
