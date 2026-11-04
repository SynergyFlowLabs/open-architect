package com.google.api;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class r3 extends com.google.protobuf.l1<r3, b> implements s3 {
    public static final int ALLOW_UNREGISTERED_CALLS_FIELD_NUMBER = 2;
    private static final r3 DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.f3<r3> PARSER = null;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    public static final int SKIP_SERVICE_CONTROL_FIELD_NUMBER = 3;
    private boolean allowUnregisteredCalls_;
    private String selector_ = "";
    private boolean skipServiceControl_;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116294a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f116294a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116294a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116294a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116294a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116294a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116294a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116294a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1.b<r3, b> implements s3 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.api.s3
        public String A() {
            return ((r3) this.f126038b).A();
        }

        @Override // com.google.api.s3
        public com.google.protobuf.u B() {
            return ((r3) this.f126038b).B();
        }

        @Override // com.google.api.s3
        public boolean H9() {
            return ((r3) this.f126038b).H9();
        }

        public b Ol() {
            El();
            ((r3) this.f126038b).hm();
            return this;
        }

        @Override // com.google.api.s3
        public boolean Pa() {
            return ((r3) this.f126038b).Pa();
        }

        public b Pl() {
            El();
            ((r3) this.f126038b).im();
            return this;
        }

        public b Ql() {
            El();
            ((r3) this.f126038b).jm();
            return this;
        }

        public b Rl(boolean z10) {
            El();
            ((r3) this.f126038b).Am(z10);
            return this;
        }

        public b Sl(String str) {
            El();
            ((r3) this.f126038b).Bm(str);
            return this;
        }

        public b Tl(com.google.protobuf.u uVar) {
            El();
            ((r3) this.f126038b).Cm(uVar);
            return this;
        }

        public b Ul(boolean z10) {
            El();
            ((r3) this.f126038b).Dm(z10);
            return this;
        }

        private b() {
            super(r3.DEFAULT_INSTANCE);
        }
    }

    static {
        r3 r3Var = new r3();
        DEFAULT_INSTANCE = r3Var;
        com.google.protobuf.l1.Wl(r3.class, r3Var);
    }

    private r3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Am(boolean z10) {
        this.allowUnregisteredCalls_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bm(String str) {
        str.getClass();
        this.selector_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Cm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.selector_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dm(boolean z10) {
        this.skipServiceControl_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hm() {
        this.allowUnregisteredCalls_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void im() {
        this.selector_ = km().A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jm() {
        this.skipServiceControl_ = false;
    }

    public static r3 km() {
        return DEFAULT_INSTANCE;
    }

    public static b lm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b mm(r3 r3Var) {
        return DEFAULT_INSTANCE.Uf(r3Var);
    }

    public static r3 nm(InputStream inputStream) throws IOException {
        return (r3) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static r3 om(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (r3) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static r3 pm(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (r3) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static r3 qm(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (r3) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static r3 rm(com.google.protobuf.z zVar) throws IOException {
        return (r3) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static r3 sm(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (r3) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static r3 tm(InputStream inputStream) throws IOException {
        return (r3) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static r3 um(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (r3) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static r3 vm(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (r3) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r3 wm(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (r3) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static r3 xm(byte[] bArr) throws com.google.protobuf.t1 {
        return (r3) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static r3 ym(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (r3) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static com.google.protobuf.f3<r3> zm() {
        return DEFAULT_INSTANCE.W7();
    }

    @Override // com.google.api.s3
    public String A() {
        return this.selector_;
    }

    @Override // com.google.api.s3
    public com.google.protobuf.u B() {
        return com.google.protobuf.u.C(this.selector_);
    }

    @Override // com.google.api.s3
    public boolean H9() {
        return this.skipServiceControl_;
    }

    @Override // com.google.api.s3
    public boolean Pa() {
        return this.allowUnregisteredCalls_;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        int i10 = a.f116294a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new r3();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\u0007", new Object[]{"selector_", "allowUnregisteredCalls_", "skipServiceControl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f3<r3> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (r3.class) {
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
}
