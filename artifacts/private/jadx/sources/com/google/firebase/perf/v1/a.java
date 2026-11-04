package com.google.firebase.perf.v1;

import com.google.protobuf.f3;
import com.google.protobuf.l1;
import com.google.protobuf.t1;
import com.google.protobuf.v0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends l1<a, b> implements com.google.firebase.perf.v1.b {
    private static final a DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile f3<a> PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String packageName_ = "";
    private String sdkVersion_ = "";
    private String versionName_ = "";

    /* JADX INFO: renamed from: com.google.firebase.perf.v1.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C1181a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f124254a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f124254a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f124254a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f124254a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f124254a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f124254a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f124254a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f124254a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<a, b> implements com.google.firebase.perf.v1.b {
        /* synthetic */ b(C1181a c1181a) {
            this();
        }

        @Override // com.google.firebase.perf.v1.b
        public boolean G8() {
            return ((a) this.f126038b).G8();
        }

        public b Ol() {
            El();
            ((a) this.f126038b).jm();
            return this;
        }

        public b Pl() {
            El();
            ((a) this.f126038b).km();
            return this;
        }

        public b Ql() {
            El();
            ((a) this.f126038b).lm();
            return this;
        }

        public b Rl(String str) {
            El();
            ((a) this.f126038b).Cm(str);
            return this;
        }

        public b Sl(com.google.protobuf.u uVar) {
            El();
            ((a) this.f126038b).Dm(uVar);
            return this;
        }

        @Override // com.google.firebase.perf.v1.b
        public boolean Tg() {
            return ((a) this.f126038b).Tg();
        }

        @Override // com.google.firebase.perf.v1.b
        public com.google.protobuf.u Tj() {
            return ((a) this.f126038b).Tj();
        }

        public b Tl(String str) {
            El();
            ((a) this.f126038b).Em(str);
            return this;
        }

        public b Ul(com.google.protobuf.u uVar) {
            El();
            ((a) this.f126038b).Fm(uVar);
            return this;
        }

        public b Vl(String str) {
            El();
            ((a) this.f126038b).Gm(str);
            return this;
        }

        public b Wl(com.google.protobuf.u uVar) {
            El();
            ((a) this.f126038b).Hm(uVar);
            return this;
        }

        @Override // com.google.firebase.perf.v1.b
        public com.google.protobuf.u ek() {
            return ((a) this.f126038b).ek();
        }

        @Override // com.google.firebase.perf.v1.b
        public String getPackageName() {
            return ((a) this.f126038b).getPackageName();
        }

        @Override // com.google.firebase.perf.v1.b
        public String getVersionName() {
            return ((a) this.f126038b).getVersionName();
        }

        @Override // com.google.firebase.perf.v1.b
        public String ih() {
            return ((a) this.f126038b).ih();
        }

        @Override // com.google.firebase.perf.v1.b
        public boolean ja() {
            return ((a) this.f126038b).ja();
        }

        @Override // com.google.firebase.perf.v1.b
        public com.google.protobuf.u kj() {
            return ((a) this.f126038b).kj();
        }

        private b() {
            super(a.DEFAULT_INSTANCE);
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        l1.Wl(a.class, aVar);
    }

    private a() {
    }

    public static a Am(byte[] bArr, v0 v0Var) throws t1 {
        return (a) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<a> Bm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Cm(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.packageName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dm(com.google.protobuf.u uVar) {
        this.packageName_ = uVar.z0();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Em(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.sdkVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Fm(com.google.protobuf.u uVar) {
        this.sdkVersion_ = uVar.z0();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Gm(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.versionName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Hm(com.google.protobuf.u uVar) {
        this.versionName_ = uVar.z0();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jm() {
        this.bitField0_ &= -2;
        this.packageName_ = mm().getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void km() {
        this.bitField0_ &= -3;
        this.sdkVersion_ = mm().ih();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lm() {
        this.bitField0_ &= -5;
        this.versionName_ = mm().getVersionName();
    }

    public static a mm() {
        return DEFAULT_INSTANCE;
    }

    public static b nm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b om(a aVar) {
        return DEFAULT_INSTANCE.Uf(aVar);
    }

    public static a pm(InputStream inputStream) throws IOException {
        return (a) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static a qm(InputStream inputStream, v0 v0Var) throws IOException {
        return (a) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static a rm(com.google.protobuf.u uVar) throws t1 {
        return (a) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static a sm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
        return (a) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static a tm(com.google.protobuf.z zVar) throws IOException {
        return (a) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static a um(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
        return (a) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static a vm(InputStream inputStream) throws IOException {
        return (a) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static a wm(InputStream inputStream, v0 v0Var) throws IOException {
        return (a) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static a xm(ByteBuffer byteBuffer) throws t1 {
        return (a) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static a ym(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (a) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static a zm(byte[] bArr) throws t1 {
        return (a) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.firebase.perf.v1.b
    public boolean G8() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = C1181a.f124254a[iVar.ordinal()];
        C1181a c1181a = null;
        switch (i10) {
            case 1:
                return new a();
            case 2:
                return new b(c1181a);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "packageName_", "sdkVersion_", "versionName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<a> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (a.class) {
                    try {
                        cVar = PARSER;
                        if (cVar == null) {
                            cVar = new l1.c(DEFAULT_INSTANCE);
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

    @Override // com.google.firebase.perf.v1.b
    public boolean Tg() {
        if ((this.bitField0_ & 4) == 0) {
            return false;
        }
        int i10 = 3 | 1;
        return true;
    }

    @Override // com.google.firebase.perf.v1.b
    public com.google.protobuf.u Tj() {
        return com.google.protobuf.u.C(this.versionName_);
    }

    @Override // com.google.firebase.perf.v1.b
    public com.google.protobuf.u ek() {
        return com.google.protobuf.u.C(this.sdkVersion_);
    }

    @Override // com.google.firebase.perf.v1.b
    public String getPackageName() {
        return this.packageName_;
    }

    @Override // com.google.firebase.perf.v1.b
    public String getVersionName() {
        return this.versionName_;
    }

    @Override // com.google.firebase.perf.v1.b
    public String ih() {
        return this.sdkVersion_;
    }

    @Override // com.google.firebase.perf.v1.b
    public boolean ja() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.firebase.perf.v1.b
    public com.google.protobuf.u kj() {
        return com.google.protobuf.u.C(this.packageName_);
    }
}
