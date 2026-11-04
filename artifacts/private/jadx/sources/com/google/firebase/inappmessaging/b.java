package com.google.firebase.inappmessaging;

import com.google.protobuf.f3;
import com.google.protobuf.l1;
import com.google.protobuf.t1;
import com.google.protobuf.v0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends l1<b, C1149b> implements com.google.firebase.inappmessaging.c {
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 2;
    public static final int CLIENT_APP_FIELD_NUMBER = 3;
    public static final int CLIENT_TIMESTAMP_MILLIS_FIELD_NUMBER = 4;
    private static final b DEFAULT_INSTANCE;
    public static final int DISMISS_TYPE_FIELD_NUMBER = 6;
    public static final int ENGAGEMENTMETRICS_DELIVERY_RETRY_COUNT_FIELD_NUMBER = 10;
    public static final int EVENT_TYPE_FIELD_NUMBER = 5;
    public static final int FETCH_ERROR_REASON_FIELD_NUMBER = 8;
    public static final int FIAM_SDK_VERSION_FIELD_NUMBER = 9;
    private static volatile f3<b> PARSER = null;
    public static final int PROJECT_NUMBER_FIELD_NUMBER = 1;
    public static final int RENDER_ERROR_REASON_FIELD_NUMBER = 7;
    private int bitField0_;
    private d clientApp_;
    private long clientTimestampMillis_;
    private int engagementMetricsDeliveryRetryCount_;
    private Object event_;
    private int eventCase_ = 0;
    private String projectNumber_ = "";
    private String campaignId_ = "";
    private String fiamSdkVersion_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f122117a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f122117a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f122117a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f122117a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f122117a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f122117a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f122117a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f122117a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.inappmessaging.b$b, reason: collision with other inner class name */
    public static final class C1149b extends l1.b<b, C1149b> implements com.google.firebase.inappmessaging.c {
        /* synthetic */ C1149b(a aVar) {
            this();
        }

        @Override // com.google.firebase.inappmessaging.c
        public boolean Af() {
            return ((b) this.f126038b).Af();
        }

        @Override // com.google.firebase.inappmessaging.c
        public String Be() {
            return ((b) this.f126038b).Be();
        }

        @Override // com.google.firebase.inappmessaging.c
        public c Cc() {
            return ((b) this.f126038b).Cc();
        }

        @Override // com.google.firebase.inappmessaging.c
        public String G0() {
            return ((b) this.f126038b).G0();
        }

        @Override // com.google.firebase.inappmessaging.c
        public long Lc() {
            return ((b) this.f126038b).Lc();
        }

        public C1149b Ol() {
            El();
            ((b) this.f126038b).zm();
            return this;
        }

        @Override // com.google.firebase.inappmessaging.c
        public boolean Pc() {
            return ((b) this.f126038b).Pc();
        }

        public C1149b Pl() {
            El();
            ((b) this.f126038b).Am();
            return this;
        }

        public C1149b Ql() {
            El();
            ((b) this.f126038b).Bm();
            return this;
        }

        public C1149b Rl() {
            El();
            ((b) this.f126038b).Cm();
            return this;
        }

        public C1149b Sl() {
            El();
            ((b) this.f126038b).Dm();
            return this;
        }

        public C1149b Tl() {
            El();
            ((b) this.f126038b).Em();
            return this;
        }

        @Override // com.google.firebase.inappmessaging.c
        public com.google.protobuf.u U6() {
            return ((b) this.f126038b).U6();
        }

        @Override // com.google.firebase.inappmessaging.c
        public g Ue() {
            return ((b) this.f126038b).Ue();
        }

        public C1149b Ul() {
            El();
            ((b) this.f126038b).Fm();
            return this;
        }

        public C1149b Vl() {
            El();
            ((b) this.f126038b).Gm();
            return this;
        }

        public C1149b Wl() {
            El();
            ((b) this.f126038b).Hm();
            return this;
        }

        public C1149b Xl() {
            El();
            ((b) this.f126038b).Im();
            return this;
        }

        @Override // com.google.firebase.inappmessaging.c
        public boolean Yf() {
            return ((b) this.f126038b).Yf();
        }

        public C1149b Yl() {
            El();
            ((b) this.f126038b).Jm();
            return this;
        }

        public C1149b Zl(d dVar) {
            El();
            ((b) this.f126038b).Lm(dVar);
            return this;
        }

        @Override // com.google.firebase.inappmessaging.c
        public boolean aj() {
            return ((b) this.f126038b).aj();
        }

        public C1149b am(String str) {
            El();
            ((b) this.f126038b).bn(str);
            return this;
        }

        public C1149b bm(com.google.protobuf.u uVar) {
            El();
            ((b) this.f126038b).cn(uVar);
            return this;
        }

        @Override // com.google.firebase.inappmessaging.c
        public j cj() {
            return ((b) this.f126038b).cj();
        }

        public C1149b cm(d.b bVar) {
            El();
            ((b) this.f126038b).dn(bVar.build());
            return this;
        }

        public C1149b dm(d dVar) {
            El();
            ((b) this.f126038b).dn(dVar);
            return this;
        }

        public C1149b em(long j10) {
            El();
            ((b) this.f126038b).en(j10);
            return this;
        }

        public C1149b fm(g gVar) {
            El();
            ((b) this.f126038b).fn(gVar);
            return this;
        }

        @Override // com.google.firebase.inappmessaging.c
        public com.google.protobuf.u g0() {
            return ((b) this.f126038b).g0();
        }

        @Override // com.google.firebase.inappmessaging.c
        public h getEventType() {
            return ((b) this.f126038b).getEventType();
        }

        public C1149b gm(int i10) {
            El();
            ((b) this.f126038b).gn(i10);
            return this;
        }

        public C1149b hm(h hVar) {
            El();
            ((b) this.f126038b).hn(hVar);
            return this;
        }

        @Override // com.google.firebase.inappmessaging.c
        public String i6() {
            return ((b) this.f126038b).i6();
        }

        public C1149b im(j jVar) {
            El();
            ((b) this.f126038b).in(jVar);
            return this;
        }

        public C1149b jm(String str) {
            El();
            ((b) this.f126038b).jn(str);
            return this;
        }

        public C1149b km(com.google.protobuf.u uVar) {
            El();
            ((b) this.f126038b).kn(uVar);
            return this;
        }

        public C1149b lm(String str) {
            El();
            ((b) this.f126038b).ln(str);
            return this;
        }

        @Override // com.google.firebase.inappmessaging.c
        public boolean md() {
            return ((b) this.f126038b).md();
        }

        public C1149b mm(com.google.protobuf.u uVar) {
            El();
            ((b) this.f126038b).mn(uVar);
            return this;
        }

        public C1149b nm(z zVar) {
            El();
            ((b) this.f126038b).nn(zVar);
            return this;
        }

        @Override // com.google.firebase.inappmessaging.c
        public boolean oc() {
            return ((b) this.f126038b).oc();
        }

        @Override // com.google.firebase.inappmessaging.c
        public boolean sk() {
            return ((b) this.f126038b).sk();
        }

        @Override // com.google.firebase.inappmessaging.c
        public int te() {
            return ((b) this.f126038b).te();
        }

        @Override // com.google.firebase.inappmessaging.c
        public boolean tg() {
            return ((b) this.f126038b).tg();
        }

        @Override // com.google.firebase.inappmessaging.c
        public z ub() {
            return ((b) this.f126038b).ub();
        }

        @Override // com.google.firebase.inappmessaging.c
        public boolean xd() {
            return ((b) this.f126038b).xd();
        }

        @Override // com.google.firebase.inappmessaging.c
        public boolean xi() {
            return ((b) this.f126038b).xi();
        }

        @Override // com.google.firebase.inappmessaging.c
        public com.google.protobuf.u zc() {
            return ((b) this.f126038b).zc();
        }

        @Override // com.google.firebase.inappmessaging.c
        public d zg() {
            return ((b) this.f126038b).zg();
        }

        private C1149b() {
            super(b.DEFAULT_INSTANCE);
        }
    }

    public enum c {
        EVENT_TYPE(5),
        DISMISS_TYPE(6),
        RENDER_ERROR_REASON(7),
        FETCH_ERROR_REASON(8),
        EVENT_NOT_SET(0);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f122124a;

        c(int i10) {
            this.f122124a = i10;
        }

        public static c l(int i10) {
            if (i10 == 0) {
                return EVENT_NOT_SET;
            }
            int i11 = 7 << 5;
            if (i10 == 5) {
                return EVENT_TYPE;
            }
            if (i10 == 6) {
                return DISMISS_TYPE;
            }
            if (i10 == 7) {
                return RENDER_ERROR_REASON;
            }
            if (i10 != 8) {
                return null;
            }
            return FETCH_ERROR_REASON;
        }

        @Deprecated
        public static c n(int i10) {
            return l(i10);
        }

        public int i() {
            return this.f122124a;
        }
    }

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        l1.Wl(b.class, bVar);
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Am() {
        this.clientApp_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bm() {
        this.bitField0_ &= -9;
        this.clientTimestampMillis_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Cm() {
        if (this.eventCase_ == 6) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dm() {
        this.bitField0_ &= -33;
        this.engagementMetricsDeliveryRetryCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Em() {
        this.eventCase_ = 0;
        this.event_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Fm() {
        if (this.eventCase_ == 5) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Gm() {
        if (this.eventCase_ == 8) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Hm() {
        this.bitField0_ &= -17;
        this.fiamSdkVersion_ = Km().Be();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Im() {
        this.bitField0_ &= -2;
        this.projectNumber_ = Km().i6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Jm() {
        if (this.eventCase_ == 7) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    public static b Km() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lm(d dVar) {
        dVar.getClass();
        d dVar2 = this.clientApp_;
        if (dVar2 == null || dVar2 == d.im()) {
            this.clientApp_ = dVar;
        } else {
            this.clientApp_ = d.km(this.clientApp_).Jl(dVar).B1();
        }
        this.bitField0_ |= 4;
    }

    public static C1149b Mm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static C1149b Nm(b bVar) {
        return DEFAULT_INSTANCE.Uf(bVar);
    }

    public static b Om(InputStream inputStream) throws IOException {
        return (b) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static b Pm(InputStream inputStream, v0 v0Var) throws IOException {
        return (b) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static b Qm(com.google.protobuf.u uVar) throws t1 {
        return (b) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static b Rm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
        return (b) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static b Sm(com.google.protobuf.z zVar) throws IOException {
        return (b) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static b Tm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
        return (b) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static b Um(InputStream inputStream) throws IOException {
        return (b) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static b Vm(InputStream inputStream, v0 v0Var) throws IOException {
        return (b) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static b Wm(ByteBuffer byteBuffer) throws t1 {
        return (b) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static b Xm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (b) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static b Ym(byte[] bArr) throws t1 {
        return (b) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static b Zm(byte[] bArr, v0 v0Var) throws t1 {
        return (b) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<b> an() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bn(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.campaignId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cn(com.google.protobuf.u uVar) {
        this.campaignId_ = uVar.z0();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dn(d dVar) {
        dVar.getClass();
        this.clientApp_ = dVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void en(long j10) {
        this.bitField0_ |= 8;
        this.clientTimestampMillis_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fn(g gVar) {
        this.event_ = Integer.valueOf(gVar.i());
        this.eventCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gn(int i10) {
        this.bitField0_ |= 32;
        this.engagementMetricsDeliveryRetryCount_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn(h hVar) {
        this.event_ = Integer.valueOf(hVar.i());
        this.eventCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void in(j jVar) {
        this.event_ = Integer.valueOf(jVar.i());
        this.eventCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jn(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.fiamSdkVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kn(com.google.protobuf.u uVar) {
        this.fiamSdkVersion_ = uVar.z0();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ln(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.projectNumber_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mn(com.google.protobuf.u uVar) {
        this.projectNumber_ = uVar.z0();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nn(z zVar) {
        this.event_ = Integer.valueOf(zVar.i());
        this.eventCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zm() {
        this.bitField0_ &= -3;
        this.campaignId_ = Km().G0();
    }

    @Override // com.google.firebase.inappmessaging.c
    public boolean Af() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.firebase.inappmessaging.c
    public String Be() {
        return this.fiamSdkVersion_;
    }

    @Override // com.google.firebase.inappmessaging.c
    public c Cc() {
        return c.l(this.eventCase_);
    }

    @Override // com.google.firebase.inappmessaging.c
    public String G0() {
        return this.campaignId_;
    }

    @Override // com.google.firebase.inappmessaging.c
    public long Lc() {
        return this.clientTimestampMillis_;
    }

    @Override // com.google.firebase.inappmessaging.c
    public boolean Pc() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f122117a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new b();
            case 2:
                return new C1149b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0001\n\u0001\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဂ\u0003\u0005\u083f\u0000\u0006\u083f\u0000\u0007\u083f\u0000\b\u083f\u0000\tဈ\u0004\nင\u0005", new Object[]{"event_", "eventCase_", "bitField0_", "projectNumber_", "campaignId_", "clientApp_", "clientTimestampMillis_", h.o(), g.o(), z.o(), j.o(), "fiamSdkVersion_", "engagementMetricsDeliveryRetryCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<b> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (b.class) {
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

    @Override // com.google.firebase.inappmessaging.c
    public com.google.protobuf.u U6() {
        return com.google.protobuf.u.C(this.projectNumber_);
    }

    @Override // com.google.firebase.inappmessaging.c
    public g Ue() {
        g gVarL;
        return (this.eventCase_ != 6 || (gVarL = g.l(((Integer) this.event_).intValue())) == null) ? g.UNKNOWN_DISMISS_TYPE : gVarL;
    }

    @Override // com.google.firebase.inappmessaging.c
    public boolean Yf() {
        return this.eventCase_ == 7;
    }

    @Override // com.google.firebase.inappmessaging.c
    public boolean aj() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.firebase.inappmessaging.c
    public j cj() {
        j jVarL;
        return (this.eventCase_ != 8 || (jVarL = j.l(((Integer) this.event_).intValue())) == null) ? j.UNSPECIFIED_FETCH_ERROR : jVarL;
    }

    @Override // com.google.firebase.inappmessaging.c
    public com.google.protobuf.u g0() {
        return com.google.protobuf.u.C(this.campaignId_);
    }

    @Override // com.google.firebase.inappmessaging.c
    public h getEventType() {
        h hVarL;
        return (this.eventCase_ != 5 || (hVarL = h.l(((Integer) this.event_).intValue())) == null) ? h.UNKNOWN_EVENT_TYPE : hVarL;
    }

    @Override // com.google.firebase.inappmessaging.c
    public String i6() {
        return this.projectNumber_;
    }

    @Override // com.google.firebase.inappmessaging.c
    public boolean md() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.firebase.inappmessaging.c
    public boolean oc() {
        return this.eventCase_ == 5;
    }

    @Override // com.google.firebase.inappmessaging.c
    public boolean sk() {
        return this.eventCase_ == 6;
    }

    @Override // com.google.firebase.inappmessaging.c
    public int te() {
        return this.engagementMetricsDeliveryRetryCount_;
    }

    @Override // com.google.firebase.inappmessaging.c
    public boolean tg() {
        return this.eventCase_ == 8;
    }

    @Override // com.google.firebase.inappmessaging.c
    public z ub() {
        if (this.eventCase_ != 7) {
            return z.UNSPECIFIED_RENDER_ERROR;
        }
        z zVarL = z.l(((Integer) this.event_).intValue());
        if (zVarL == null) {
            zVarL = z.UNSPECIFIED_RENDER_ERROR;
        }
        return zVarL;
    }

    @Override // com.google.firebase.inappmessaging.c
    public boolean xd() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.firebase.inappmessaging.c
    public boolean xi() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.firebase.inappmessaging.c
    public com.google.protobuf.u zc() {
        return com.google.protobuf.u.C(this.fiamSdkVersion_);
    }

    @Override // com.google.firebase.inappmessaging.c
    public d zg() {
        d dVar = this.clientApp_;
        return dVar == null ? d.im() : dVar;
    }
}
