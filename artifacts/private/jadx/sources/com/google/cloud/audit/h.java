package com.google.cloud.audit;

import com.google.protobuf.f3;
import com.google.protobuf.l1;
import com.google.protobuf.t1;
import com.google.protobuf.u;
import com.google.protobuf.v0;
import com.google.protobuf.z;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends l1<h, b> implements i {
    public static final int CALLER_IP_FIELD_NUMBER = 1;
    public static final int CALLER_SUPPLIED_USER_AGENT_FIELD_NUMBER = 2;
    private static final h DEFAULT_INSTANCE;
    private static volatile f3<h> PARSER;
    private String callerIp_ = "";
    private String callerSuppliedUserAgent_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116421a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f116421a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int i10 = 2 & 2;
                f116421a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116421a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116421a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116421a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116421a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116421a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<h, b> implements i {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.cloud.audit.i
        public String Jd() {
            return ((h) this.f126038b).Jd();
        }

        public b Ol() {
            El();
            ((h) this.f126038b).gm();
            return this;
        }

        public b Pl() {
            El();
            ((h) this.f126038b).hm();
            return this;
        }

        @Override // com.google.cloud.audit.i
        public u Qa() {
            return ((h) this.f126038b).Qa();
        }

        public b Ql(String str) {
            El();
            ((h) this.f126038b).ym(str);
            return this;
        }

        public b Rl(u uVar) {
            El();
            ((h) this.f126038b).zm(uVar);
            return this;
        }

        public b Sl(String str) {
            El();
            ((h) this.f126038b).Am(str);
            return this;
        }

        public b Tl(u uVar) {
            El();
            ((h) this.f126038b).Bm(uVar);
            return this;
        }

        @Override // com.google.cloud.audit.i
        public String We() {
            return ((h) this.f126038b).We();
        }

        @Override // com.google.cloud.audit.i
        public u kf() {
            return ((h) this.f126038b).kf();
        }

        private b() {
            super(h.DEFAULT_INSTANCE);
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        l1.Wl(h.class, hVar);
    }

    private h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Am(String str) {
        str.getClass();
        this.callerSuppliedUserAgent_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bm(u uVar) {
        com.google.protobuf.a.R(uVar);
        this.callerSuppliedUserAgent_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm() {
        this.callerIp_ = im().We();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hm() {
        this.callerSuppliedUserAgent_ = im().Jd();
    }

    public static h im() {
        return DEFAULT_INSTANCE;
    }

    public static b jm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b km(h hVar) {
        return DEFAULT_INSTANCE.Uf(hVar);
    }

    public static h lm(InputStream inputStream) throws IOException {
        return (h) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static h mm(InputStream inputStream, v0 v0Var) throws IOException {
        return (h) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static h nm(u uVar) throws t1 {
        return (h) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static h om(u uVar, v0 v0Var) throws t1 {
        return (h) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static h pm(z zVar) throws IOException {
        return (h) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static h qm(z zVar, v0 v0Var) throws IOException {
        return (h) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static h rm(InputStream inputStream) throws IOException {
        return (h) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static h sm(InputStream inputStream, v0 v0Var) throws IOException {
        return (h) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static h tm(ByteBuffer byteBuffer) throws t1 {
        return (h) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h um(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (h) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static h vm(byte[] bArr) throws t1 {
        return (h) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static h wm(byte[] bArr, v0 v0Var) throws t1 {
        return (h) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<h> xm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ym(String str) {
        str.getClass();
        this.callerIp_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zm(u uVar) {
        com.google.protobuf.a.R(uVar);
        this.callerIp_ = uVar.z0();
    }

    @Override // com.google.cloud.audit.i
    public String Jd() {
        return this.callerSuppliedUserAgent_;
    }

    @Override // com.google.cloud.audit.i
    public u Qa() {
        return u.C(this.callerSuppliedUserAgent_);
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f116421a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new h();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"callerIp_", "callerSuppliedUserAgent_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<h> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (h.class) {
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

    @Override // com.google.cloud.audit.i
    public String We() {
        return this.callerIp_;
    }

    @Override // com.google.cloud.audit.i
    public u kf() {
        return u.C(this.callerIp_);
    }
}
