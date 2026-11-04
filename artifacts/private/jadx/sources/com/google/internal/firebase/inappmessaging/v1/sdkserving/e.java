package com.google.internal.firebase.inappmessaging.v1.sdkserving;

import com.google.protobuf.f3;
import com.google.protobuf.l1;
import com.google.protobuf.t1;
import com.google.protobuf.u;
import com.google.protobuf.v0;
import com.google.protobuf.z;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends l1<e, b> implements f {
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int APP_INSTANCE_ID_TOKEN_FIELD_NUMBER = 3;
    private static final e DEFAULT_INSTANCE;
    public static final int GMP_APP_ID_FIELD_NUMBER = 1;
    private static volatile f3<e> PARSER;
    private String gmpAppId_ = "";
    private String appInstanceId_ = "";
    private String appInstanceIdToken_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f125667a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f125667a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f125667a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f125667a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f125667a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f125667a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f125667a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f125667a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<e, b> implements f {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.f
        public String D5() {
            return ((e) this.f126038b).D5();
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.f
        public u J5() {
            return ((e) this.f126038b).J5();
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.f
        public u L1() {
            return ((e) this.f126038b).L1();
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.f
        public String La() {
            return ((e) this.f126038b).La();
        }

        public b Ol() {
            El();
            ((e) this.f126038b).jm();
            return this;
        }

        public b Pl() {
            El();
            ((e) this.f126038b).km();
            return this;
        }

        public b Ql() {
            El();
            ((e) this.f126038b).lm();
            return this;
        }

        public b Rl(String str) {
            El();
            ((e) this.f126038b).Cm(str);
            return this;
        }

        public b Sl(u uVar) {
            El();
            ((e) this.f126038b).Dm(uVar);
            return this;
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.f
        public String T0() {
            return ((e) this.f126038b).T0();
        }

        public b Tl(String str) {
            El();
            ((e) this.f126038b).Em(str);
            return this;
        }

        public b Ul(u uVar) {
            El();
            ((e) this.f126038b).Fm(uVar);
            return this;
        }

        public b Vl(String str) {
            El();
            ((e) this.f126038b).Gm(str);
            return this;
        }

        public b Wl(u uVar) {
            El();
            ((e) this.f126038b).Hm(uVar);
            return this;
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.f
        public u d8() {
            return ((e) this.f126038b).d8();
        }

        private b() {
            super(e.DEFAULT_INSTANCE);
        }
    }

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        l1.Wl(e.class, eVar);
    }

    private e() {
    }

    public static e Am(byte[] bArr, v0 v0Var) throws t1 {
        return (e) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<e> Bm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Cm(String str) {
        str.getClass();
        this.appInstanceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dm(u uVar) {
        com.google.protobuf.a.R(uVar);
        this.appInstanceId_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Em(String str) {
        str.getClass();
        this.appInstanceIdToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Fm(u uVar) {
        com.google.protobuf.a.R(uVar);
        this.appInstanceIdToken_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Gm(String str) {
        str.getClass();
        this.gmpAppId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Hm(u uVar) {
        com.google.protobuf.a.R(uVar);
        this.gmpAppId_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jm() {
        this.appInstanceId_ = mm().T0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void km() {
        this.appInstanceIdToken_ = mm().La();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lm() {
        this.gmpAppId_ = mm().D5();
    }

    public static e mm() {
        return DEFAULT_INSTANCE;
    }

    public static b nm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b om(e eVar) {
        return DEFAULT_INSTANCE.Uf(eVar);
    }

    public static e pm(InputStream inputStream) throws IOException {
        return (e) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static e qm(InputStream inputStream, v0 v0Var) throws IOException {
        return (e) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static e rm(u uVar) throws t1 {
        return (e) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static e sm(u uVar, v0 v0Var) throws t1 {
        return (e) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static e tm(z zVar) throws IOException {
        return (e) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static e um(z zVar, v0 v0Var) throws IOException {
        return (e) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static e vm(InputStream inputStream) throws IOException {
        return (e) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static e wm(InputStream inputStream, v0 v0Var) throws IOException {
        return (e) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static e xm(ByteBuffer byteBuffer) throws t1 {
        return (e) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static e ym(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (e) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static e zm(byte[] bArr) throws t1 {
        return (e) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.f
    public String D5() {
        return this.gmpAppId_;
    }

    @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.f
    public u J5() {
        return u.C(this.gmpAppId_);
    }

    @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.f
    public u L1() {
        return u.C(this.appInstanceId_);
    }

    @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.f
    public String La() {
        return this.appInstanceIdToken_;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f125667a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new e();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"gmpAppId_", "appInstanceId_", "appInstanceIdToken_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<e> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (e.class) {
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

    @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.f
    public String T0() {
        return this.appInstanceId_;
    }

    @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.f
    public u d8() {
        return u.C(this.appInstanceIdToken_);
    }
}
