package com.google.logging.type;

import com.google.protobuf.f3;
import com.google.protobuf.i0;
import com.google.protobuf.l1;
import com.google.protobuf.t1;
import com.google.protobuf.u;
import com.google.protobuf.v0;
import com.google.protobuf.z;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends l1<a, b> implements com.google.logging.type.b {
    public static final int CACHE_FILL_BYTES_FIELD_NUMBER = 12;
    public static final int CACHE_HIT_FIELD_NUMBER = 9;
    public static final int CACHE_LOOKUP_FIELD_NUMBER = 11;
    public static final int CACHE_VALIDATED_WITH_ORIGIN_SERVER_FIELD_NUMBER = 10;
    private static final a DEFAULT_INSTANCE;
    public static final int LATENCY_FIELD_NUMBER = 14;
    private static volatile f3<a> PARSER = null;
    public static final int PROTOCOL_FIELD_NUMBER = 15;
    public static final int REFERER_FIELD_NUMBER = 8;
    public static final int REMOTE_IP_FIELD_NUMBER = 7;
    public static final int REQUEST_METHOD_FIELD_NUMBER = 1;
    public static final int REQUEST_SIZE_FIELD_NUMBER = 3;
    public static final int REQUEST_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_SIZE_FIELD_NUMBER = 5;
    public static final int SERVER_IP_FIELD_NUMBER = 13;
    public static final int STATUS_FIELD_NUMBER = 4;
    public static final int USER_AGENT_FIELD_NUMBER = 6;
    private int bitField0_;
    private long cacheFillBytes_;
    private boolean cacheHit_;
    private boolean cacheLookup_;
    private boolean cacheValidatedWithOriginServer_;
    private i0 latency_;
    private long requestSize_;
    private long responseSize_;
    private int status_;
    private String requestMethod_ = "";
    private String requestUrl_ = "";
    private String userAgent_ = "";
    private String remoteIp_ = "";
    private String serverIp_ = "";
    private String referer_ = "";
    private String protocol_ = "";

    /* JADX INFO: renamed from: com.google.logging.type.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C1210a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f125676a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f125676a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f125676a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f125676a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f125676a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f125676a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f125676a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f125676a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<a, b> implements com.google.logging.type.b {
        /* synthetic */ b(C1210a c1210a) {
            this();
        }

        @Override // com.google.logging.type.b
        public u A9() {
            return ((a) this.f126038b).A9();
        }

        public b Am(u uVar) {
            El();
            ((a) this.f126038b).Nn(uVar);
            return this;
        }

        @Override // com.google.logging.type.b
        public boolean F8() {
            return ((a) this.f126038b).F8();
        }

        @Override // com.google.logging.type.b
        public u G9() {
            return ((a) this.f126038b).G9();
        }

        @Override // com.google.logging.type.b
        public i0 K8() {
            return ((a) this.f126038b).K8();
        }

        @Override // com.google.logging.type.b
        public String Nj() {
            return ((a) this.f126038b).Nj();
        }

        @Override // com.google.logging.type.b
        public u Od() {
            return ((a) this.f126038b).Od();
        }

        @Override // com.google.logging.type.b
        public long Oh() {
            return ((a) this.f126038b).Oh();
        }

        public b Ol() {
            El();
            ((a) this.f126038b).Mm();
            return this;
        }

        public b Pl() {
            El();
            ((a) this.f126038b).Nm();
            return this;
        }

        @Override // com.google.logging.type.b
        public String Qf() {
            return ((a) this.f126038b).Qf();
        }

        @Override // com.google.logging.type.b
        public long Qj() {
            return ((a) this.f126038b).Qj();
        }

        public b Ql() {
            El();
            ((a) this.f126038b).Om();
            return this;
        }

        public b Rl() {
            El();
            ((a) this.f126038b).Pm();
            return this;
        }

        public b Sl() {
            El();
            ((a) this.f126038b).Qm();
            return this;
        }

        public b Tl() {
            El();
            ((a) this.f126038b).Rm();
            return this;
        }

        public b Ul() {
            El();
            ((a) this.f126038b).Sm();
            return this;
        }

        @Override // com.google.logging.type.b
        public String Vg() {
            return ((a) this.f126038b).Vg();
        }

        public b Vl() {
            El();
            ((a) this.f126038b).Tm();
            return this;
        }

        @Override // com.google.logging.type.b
        public u Wb() {
            return ((a) this.f126038b).Wb();
        }

        public b Wl() {
            El();
            ((a) this.f126038b).Um();
            return this;
        }

        public b Xl() {
            El();
            ((a) this.f126038b).Vm();
            return this;
        }

        @Override // com.google.logging.type.b
        public long Y9() {
            return ((a) this.f126038b).Y9();
        }

        public b Yl() {
            El();
            ((a) this.f126038b).Wm();
            return this;
        }

        public b Zl() {
            El();
            ((a) this.f126038b).Xm();
            return this;
        }

        public b am() {
            El();
            ((a) this.f126038b).Ym();
            return this;
        }

        public b bm() {
            El();
            ((a) this.f126038b).Zm();
            return this;
        }

        public b cm() {
            El();
            ((a) this.f126038b).an();
            return this;
        }

        public b dm(i0 i0Var) {
            El();
            ((a) this.f126038b).cn(i0Var);
            return this;
        }

        public b em(long j10) {
            El();
            ((a) this.f126038b).sn(j10);
            return this;
        }

        public b fm(boolean z10) {
            El();
            ((a) this.f126038b).tn(z10);
            return this;
        }

        @Override // com.google.logging.type.b
        public String getProtocol() {
            return ((a) this.f126038b).getProtocol();
        }

        @Override // com.google.logging.type.b
        public String getUserAgent() {
            return ((a) this.f126038b).getUserAgent();
        }

        public b gm(boolean z10) {
            El();
            ((a) this.f126038b).un(z10);
            return this;
        }

        public b hm(boolean z10) {
            El();
            ((a) this.f126038b).vn(z10);
            return this;
        }

        public b im(i0.b bVar) {
            El();
            ((a) this.f126038b).wn(bVar.build());
            return this;
        }

        public b jm(i0 i0Var) {
            El();
            ((a) this.f126038b).wn(i0Var);
            return this;
        }

        public b km(String str) {
            El();
            ((a) this.f126038b).xn(str);
            return this;
        }

        public b lm(u uVar) {
            El();
            ((a) this.f126038b).yn(uVar);
            return this;
        }

        @Override // com.google.logging.type.b
        public boolean mh() {
            return ((a) this.f126038b).mh();
        }

        public b mm(String str) {
            El();
            ((a) this.f126038b).zn(str);
            return this;
        }

        public b nm(u uVar) {
            El();
            ((a) this.f126038b).An(uVar);
            return this;
        }

        @Override // com.google.logging.type.b
        public u o0() {
            return ((a) this.f126038b).o0();
        }

        public b om(String str) {
            El();
            ((a) this.f126038b).Bn(str);
            return this;
        }

        public b pm(u uVar) {
            El();
            ((a) this.f126038b).Cn(uVar);
            return this;
        }

        public b qm(String str) {
            El();
            ((a) this.f126038b).Dn(str);
            return this;
        }

        public b rm(u uVar) {
            El();
            ((a) this.f126038b).En(uVar);
            return this;
        }

        @Override // com.google.logging.type.b
        public boolean sa() {
            return ((a) this.f126038b).sa();
        }

        public b sm(long j10) {
            El();
            ((a) this.f126038b).Fn(j10);
            return this;
        }

        @Override // com.google.logging.type.b
        public int t() {
            return ((a) this.f126038b).t();
        }

        @Override // com.google.logging.type.b
        public String tj() {
            return ((a) this.f126038b).tj();
        }

        public b tm(String str) {
            El();
            ((a) this.f126038b).Gn(str);
            return this;
        }

        @Override // com.google.logging.type.b
        public u ua() {
            return ((a) this.f126038b).ua();
        }

        public b um(u uVar) {
            El();
            ((a) this.f126038b).Hn(uVar);
            return this;
        }

        @Override // com.google.logging.type.b
        public String v8() {
            return ((a) this.f126038b).v8();
        }

        @Override // com.google.logging.type.b
        public boolean vc() {
            return ((a) this.f126038b).vc();
        }

        public b vm(long j10) {
            El();
            ((a) this.f126038b).In(j10);
            return this;
        }

        public b wm(String str) {
            El();
            ((a) this.f126038b).Jn(str);
            return this;
        }

        public b xm(u uVar) {
            El();
            ((a) this.f126038b).Kn(uVar);
            return this;
        }

        @Override // com.google.logging.type.b
        public u ya() {
            return ((a) this.f126038b).ya();
        }

        public b ym(int i10) {
            El();
            ((a) this.f126038b).Ln(i10);
            return this;
        }

        public b zm(String str) {
            El();
            ((a) this.f126038b).Mn(str);
            return this;
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
    public void An(u uVar) {
        com.google.protobuf.a.R(uVar);
        this.referer_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bn(String str) {
        str.getClass();
        this.remoteIp_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Cn(u uVar) {
        com.google.protobuf.a.R(uVar);
        this.remoteIp_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dn(String str) {
        str.getClass();
        this.requestMethod_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void En(u uVar) {
        com.google.protobuf.a.R(uVar);
        this.requestMethod_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Fn(long j10) {
        this.requestSize_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Gn(String str) {
        str.getClass();
        this.requestUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Hn(u uVar) {
        com.google.protobuf.a.R(uVar);
        this.requestUrl_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void In(long j10) {
        this.responseSize_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Jn(String str) {
        str.getClass();
        this.serverIp_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Kn(u uVar) {
        com.google.protobuf.a.R(uVar);
        this.serverIp_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Ln(int i10) {
        this.status_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Mm() {
        this.cacheFillBytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Mn(String str) {
        str.getClass();
        this.userAgent_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Nm() {
        this.cacheHit_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Nn(u uVar) {
        com.google.protobuf.a.R(uVar);
        this.userAgent_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Om() {
        this.cacheLookup_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Pm() {
        this.cacheValidatedWithOriginServer_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qm() {
        this.latency_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Rm() {
        this.protocol_ = bn().getProtocol();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sm() {
        this.referer_ = bn().Nj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Tm() {
        this.remoteIp_ = bn().Qf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Um() {
        this.requestMethod_ = bn().v8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Vm() {
        this.requestSize_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Wm() {
        this.requestUrl_ = bn().tj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Xm() {
        this.responseSize_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Ym() {
        this.serverIp_ = bn().Vg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Zm() {
        this.status_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void an() {
        this.userAgent_ = bn().getUserAgent();
    }

    public static a bn() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cn(i0 i0Var) {
        i0Var.getClass();
        i0 i0Var2 = this.latency_;
        if (i0Var2 == null || i0Var2 == i0.gm()) {
            this.latency_ = i0Var;
        } else {
            this.latency_ = i0.im(this.latency_).Jl(i0Var).B1();
        }
        this.bitField0_ |= 1;
    }

    public static b dn() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b en(a aVar) {
        return DEFAULT_INSTANCE.Uf(aVar);
    }

    public static a fn(InputStream inputStream) throws IOException {
        return (a) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static a gn(InputStream inputStream, v0 v0Var) throws IOException {
        return (a) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static a hn(u uVar) throws t1 {
        return (a) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static a in(u uVar, v0 v0Var) throws t1 {
        return (a) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static a jn(z zVar) throws IOException {
        return (a) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static a kn(z zVar, v0 v0Var) throws IOException {
        return (a) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static a ln(InputStream inputStream) throws IOException {
        return (a) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static a mn(InputStream inputStream, v0 v0Var) throws IOException {
        return (a) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static a nn(ByteBuffer byteBuffer) throws t1 {
        return (a) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static a on(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (a) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static a pn(byte[] bArr) throws t1 {
        return (a) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static a qn(byte[] bArr, v0 v0Var) throws t1 {
        return (a) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<a> rn() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sn(long j10) {
        this.cacheFillBytes_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tn(boolean z10) {
        this.cacheHit_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void un(boolean z10) {
        this.cacheLookup_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vn(boolean z10) {
        this.cacheValidatedWithOriginServer_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wn(i0 i0Var) {
        i0Var.getClass();
        this.latency_ = i0Var;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xn(String str) {
        str.getClass();
        this.protocol_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yn(u uVar) {
        com.google.protobuf.a.R(uVar);
        this.protocol_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zn(String str) {
        str.getClass();
        this.referer_ = str;
    }

    @Override // com.google.logging.type.b
    public u A9() {
        return u.C(this.userAgent_);
    }

    @Override // com.google.logging.type.b
    public boolean F8() {
        return this.cacheValidatedWithOriginServer_;
    }

    @Override // com.google.logging.type.b
    public u G9() {
        return u.C(this.requestUrl_);
    }

    @Override // com.google.logging.type.b
    public i0 K8() {
        i0 i0VarGm = this.latency_;
        if (i0VarGm == null) {
            i0VarGm = i0.gm();
        }
        return i0VarGm;
    }

    @Override // com.google.logging.type.b
    public String Nj() {
        return this.referer_;
    }

    @Override // com.google.logging.type.b
    public u Od() {
        return u.C(this.referer_);
    }

    @Override // com.google.logging.type.b
    public long Oh() {
        return this.requestSize_;
    }

    @Override // com.google.logging.type.b
    public String Qf() {
        return this.remoteIp_;
    }

    @Override // com.google.logging.type.b
    public long Qj() {
        return this.cacheFillBytes_;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        C1210a c1210a = null;
        switch (C1210a.f125676a[iVar.ordinal()]) {
            case 1:
                return new a();
            case 2:
                return new b(c1210a);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004\u0004\u0005\u0002\u0006Ȉ\u0007Ȉ\bȈ\t\u0007\n\u0007\u000b\u0007\f\u0002\rȈ\u000eဉ\u0000\u000fȈ", new Object[]{"bitField0_", "requestMethod_", "requestUrl_", "requestSize_", "status_", "responseSize_", "userAgent_", "remoteIp_", "referer_", "cacheHit_", "cacheValidatedWithOriginServer_", "cacheLookup_", "cacheFillBytes_", "serverIp_", "latency_", "protocol_"});
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

    @Override // com.google.logging.type.b
    public String Vg() {
        return this.serverIp_;
    }

    @Override // com.google.logging.type.b
    public u Wb() {
        return u.C(this.remoteIp_);
    }

    @Override // com.google.logging.type.b
    public long Y9() {
        return this.responseSize_;
    }

    @Override // com.google.logging.type.b
    public String getProtocol() {
        return this.protocol_;
    }

    @Override // com.google.logging.type.b
    public String getUserAgent() {
        return this.userAgent_;
    }

    @Override // com.google.logging.type.b
    public boolean mh() {
        return this.cacheLookup_;
    }

    @Override // com.google.logging.type.b
    public u o0() {
        return u.C(this.protocol_);
    }

    @Override // com.google.logging.type.b
    public boolean sa() {
        return this.cacheHit_;
    }

    @Override // com.google.logging.type.b
    public int t() {
        return this.status_;
    }

    @Override // com.google.logging.type.b
    public String tj() {
        return this.requestUrl_;
    }

    @Override // com.google.logging.type.b
    public u ua() {
        return u.C(this.serverIp_);
    }

    @Override // com.google.logging.type.b
    public String v8() {
        return this.requestMethod_;
    }

    @Override // com.google.logging.type.b
    public boolean vc() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.logging.type.b
    public u ya() {
        return u.C(this.requestMethod_);
    }
}
