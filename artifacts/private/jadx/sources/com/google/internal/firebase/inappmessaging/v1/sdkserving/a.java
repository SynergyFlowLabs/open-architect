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
public final class a extends l1<a, b> implements d {
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 1;
    private static final a DEFAULT_INSTANCE;
    public static final int IMPRESSION_TIMESTAMP_MILLIS_FIELD_NUMBER = 2;
    private static volatile f3<a> PARSER;
    private String campaignId_ = "";
    private long impressionTimestampMillis_;

    /* JADX INFO: renamed from: com.google.internal.firebase.inappmessaging.v1.sdkserving.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C1208a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f125665a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f125665a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f125665a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f125665a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f125665a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f125665a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f125665a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f125665a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<a, b> implements d {
        /* synthetic */ b(C1208a c1208a) {
            this();
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.d
        public long A8() {
            return ((a) this.f126038b).A8();
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.d
        public String G0() {
            return ((a) this.f126038b).G0();
        }

        public b Ol() {
            El();
            ((a) this.f126038b).fm();
            return this;
        }

        public b Pl() {
            El();
            ((a) this.f126038b).gm();
            return this;
        }

        public b Ql(String str) {
            El();
            ((a) this.f126038b).xm(str);
            return this;
        }

        public b Rl(u uVar) {
            El();
            ((a) this.f126038b).ym(uVar);
            return this;
        }

        public b Sl(long j10) {
            El();
            ((a) this.f126038b).zm(j10);
            return this;
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.d
        public u g0() {
            return ((a) this.f126038b).g0();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void fm() {
        this.campaignId_ = hm().G0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm() {
        this.impressionTimestampMillis_ = 0L;
    }

    public static a hm() {
        return DEFAULT_INSTANCE;
    }

    public static b im() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b jm(a aVar) {
        return DEFAULT_INSTANCE.Uf(aVar);
    }

    public static a km(InputStream inputStream) throws IOException {
        return (a) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static a lm(InputStream inputStream, v0 v0Var) throws IOException {
        return (a) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static a mm(u uVar) throws t1 {
        return (a) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static a nm(u uVar, v0 v0Var) throws t1 {
        return (a) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static a om(z zVar) throws IOException {
        return (a) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static a pm(z zVar, v0 v0Var) throws IOException {
        return (a) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static a qm(InputStream inputStream) throws IOException {
        return (a) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static a rm(InputStream inputStream, v0 v0Var) throws IOException {
        return (a) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static a sm(ByteBuffer byteBuffer) throws t1 {
        return (a) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static a tm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (a) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static a um(byte[] bArr) throws t1 {
        return (a) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static a vm(byte[] bArr, v0 v0Var) throws t1 {
        return (a) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<a> wm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xm(String str) {
        str.getClass();
        this.campaignId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ym(u uVar) {
        com.google.protobuf.a.R(uVar);
        this.campaignId_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zm(long j10) {
        this.impressionTimestampMillis_ = j10;
    }

    @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.d
    public long A8() {
        return this.impressionTimestampMillis_;
    }

    @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.d
    public String G0() {
        return this.campaignId_;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = C1208a.f125665a[iVar.ordinal()];
        C1208a c1208a = null;
        switch (i10) {
            case 1:
                return new a();
            case 2:
                return new b(c1208a);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0002", new Object[]{"campaignId_", "impressionTimestampMillis_"});
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

    @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.d
    public u g0() {
        return u.C(this.campaignId_);
    }
}
