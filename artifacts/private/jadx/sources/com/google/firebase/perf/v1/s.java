package com.google.firebase.perf.v1;

import com.google.protobuf.f3;
import com.google.protobuf.l1;
import com.google.protobuf.t1;
import com.google.protobuf.v0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class s extends l1<s, b> implements t {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final s DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile f3<s> PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private e applicationInfo_;
    private int bitField0_;
    private m gaugeMetric_;
    private q networkRequestMetric_;
    private x traceMetric_;
    private z transportInfo_;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f124385a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f124385a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f124385a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f124385a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f124385a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f124385a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f124385a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f124385a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<s, b> implements t {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.firebase.perf.v1.t
        public boolean Di() {
            return ((s) this.f126038b).Di();
        }

        @Override // com.google.firebase.perf.v1.t
        public x Hi() {
            return ((s) this.f126038b).Hi();
        }

        public b Ol() {
            El();
            ((s) this.f126038b).pm();
            return this;
        }

        public b Pl() {
            El();
            ((s) this.f126038b).qm();
            return this;
        }

        public b Ql() {
            El();
            ((s) this.f126038b).rm();
            return this;
        }

        public b Rl() {
            El();
            ((s) this.f126038b).sm();
            return this;
        }

        @Override // com.google.firebase.perf.v1.t
        public boolean Sf() {
            return ((s) this.f126038b).Sf();
        }

        public b Sl() {
            El();
            ((s) this.f126038b).tm();
            return this;
        }

        public b Tl(e eVar) {
            El();
            ((s) this.f126038b).vm(eVar);
            return this;
        }

        public b Ul(m mVar) {
            El();
            ((s) this.f126038b).wm(mVar);
            return this;
        }

        public b Vl(q qVar) {
            El();
            ((s) this.f126038b).xm(qVar);
            return this;
        }

        public b Wl(x xVar) {
            El();
            ((s) this.f126038b).ym(xVar);
            return this;
        }

        @Override // com.google.firebase.perf.v1.t
        public e X8() {
            return ((s) this.f126038b).X8();
        }

        public b Xl(z zVar) {
            El();
            ((s) this.f126038b).zm(zVar);
            return this;
        }

        public b Yl(e.b bVar) {
            El();
            ((s) this.f126038b).Pm(bVar.build());
            return this;
        }

        public b Zl(e eVar) {
            El();
            ((s) this.f126038b).Pm(eVar);
            return this;
        }

        public b am(m.b bVar) {
            El();
            ((s) this.f126038b).Qm(bVar.build());
            return this;
        }

        public b bm(m mVar) {
            El();
            ((s) this.f126038b).Qm(mVar);
            return this;
        }

        public b cm(q.b bVar) {
            El();
            ((s) this.f126038b).Rm(bVar.build());
            return this;
        }

        public b dm(q qVar) {
            El();
            ((s) this.f126038b).Rm(qVar);
            return this;
        }

        @Override // com.google.firebase.perf.v1.t
        public m ed() {
            return ((s) this.f126038b).ed();
        }

        public b em(x.b bVar) {
            El();
            ((s) this.f126038b).Sm(bVar.build());
            return this;
        }

        public b fm(x xVar) {
            El();
            ((s) this.f126038b).Sm(xVar);
            return this;
        }

        public b gm(z.b bVar) {
            El();
            ((s) this.f126038b).Tm(bVar.build());
            return this;
        }

        public b hm(z zVar) {
            El();
            ((s) this.f126038b).Tm(zVar);
            return this;
        }

        @Override // com.google.firebase.perf.v1.t
        public boolean pd() {
            return ((s) this.f126038b).pd();
        }

        @Override // com.google.firebase.perf.v1.t
        public boolean re() {
            return ((s) this.f126038b).re();
        }

        @Override // com.google.firebase.perf.v1.t
        public q u9() {
            return ((s) this.f126038b).u9();
        }

        @Override // com.google.firebase.perf.v1.t
        public boolean vf() {
            return ((s) this.f126038b).vf();
        }

        @Override // com.google.firebase.perf.v1.t
        public z zb() {
            return ((s) this.f126038b).zb();
        }

        private b() {
            super(s.DEFAULT_INSTANCE);
        }
    }

    static {
        s sVar = new s();
        DEFAULT_INSTANCE = sVar;
        l1.Wl(s.class, sVar);
    }

    private s() {
    }

    public static b Am() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b Bm(s sVar) {
        return DEFAULT_INSTANCE.Uf(sVar);
    }

    public static s Cm(InputStream inputStream) throws IOException {
        return (s) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static s Dm(InputStream inputStream, v0 v0Var) throws IOException {
        return (s) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static s Em(com.google.protobuf.u uVar) throws t1 {
        return (s) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static s Fm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
        return (s) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static s Gm(com.google.protobuf.z zVar) throws IOException {
        return (s) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static s Hm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
        return (s) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static s Im(InputStream inputStream) throws IOException {
        return (s) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static s Jm(InputStream inputStream, v0 v0Var) throws IOException {
        return (s) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static s Km(ByteBuffer byteBuffer) throws t1 {
        return (s) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static s Lm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (s) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static s Mm(byte[] bArr) throws t1 {
        return (s) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static s Nm(byte[] bArr, v0 v0Var) throws t1 {
        return (s) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<s> Om() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Pm(e eVar) {
        eVar.getClass();
        this.applicationInfo_ = eVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qm(m mVar) {
        mVar.getClass();
        this.gaugeMetric_ = mVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Rm(q qVar) {
        qVar.getClass();
        this.networkRequestMetric_ = qVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sm(x xVar) {
        xVar.getClass();
        this.traceMetric_ = xVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Tm(z zVar) {
        zVar.getClass();
        this.transportInfo_ = zVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pm() {
        this.applicationInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qm() {
        this.gaugeMetric_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rm() {
        this.networkRequestMetric_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sm() {
        this.traceMetric_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tm() {
        this.transportInfo_ = null;
        this.bitField0_ &= -17;
    }

    public static s um() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vm(e eVar) {
        eVar.getClass();
        e eVar2 = this.applicationInfo_;
        if (eVar2 == null || eVar2 == e.qm()) {
            this.applicationInfo_ = eVar;
        } else {
            this.applicationInfo_ = e.wm(this.applicationInfo_).Jl(eVar).B1();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wm(m mVar) {
        mVar.getClass();
        m mVar2 = this.gaugeMetric_;
        if (mVar2 == null || mVar2 == m.Im()) {
            this.gaugeMetric_ = mVar;
        } else {
            this.gaugeMetric_ = m.Lm(this.gaugeMetric_).Jl(mVar).B1();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xm(q qVar) {
        qVar.getClass();
        q qVar2 = this.networkRequestMetric_;
        if (qVar2 == null || qVar2 == q.Vm()) {
            this.networkRequestMetric_ = qVar;
        } else {
            this.networkRequestMetric_ = q.cn(this.networkRequestMetric_).Jl(qVar).B1();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ym(x xVar) {
        xVar.getClass();
        x xVar2 = this.traceMetric_;
        if (xVar2 == null || xVar2 == x.Lm()) {
            this.traceMetric_ = xVar;
        } else {
            this.traceMetric_ = x.Xm(this.traceMetric_).Jl(xVar).B1();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zm(z zVar) {
        zVar.getClass();
        z zVar2 = this.transportInfo_;
        if (zVar2 == null || zVar2 == z.dm()) {
            this.transportInfo_ = zVar;
        } else {
            this.transportInfo_ = z.fm(this.transportInfo_).Jl(zVar).B1();
        }
        this.bitField0_ |= 16;
    }

    @Override // com.google.firebase.perf.v1.t
    public boolean Di() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.firebase.perf.v1.t
    public x Hi() {
        x xVarLm = this.traceMetric_;
        if (xVarLm == null) {
            xVarLm = x.Lm();
        }
        return xVarLm;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f124385a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new s();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<s> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (s.class) {
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

    @Override // com.google.firebase.perf.v1.t
    public boolean Sf() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.firebase.perf.v1.t
    public e X8() {
        e eVar = this.applicationInfo_;
        return eVar == null ? e.qm() : eVar;
    }

    @Override // com.google.firebase.perf.v1.t
    public m ed() {
        m mVarIm = this.gaugeMetric_;
        if (mVarIm == null) {
            mVarIm = m.Im();
        }
        return mVarIm;
    }

    @Override // com.google.firebase.perf.v1.t
    public boolean pd() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.firebase.perf.v1.t
    public boolean re() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.firebase.perf.v1.t
    public q u9() {
        q qVar = this.networkRequestMetric_;
        return qVar == null ? q.Vm() : qVar;
    }

    @Override // com.google.firebase.perf.v1.t
    public boolean vf() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.firebase.perf.v1.t
    public z zb() {
        z zVar = this.transportInfo_;
        return zVar == null ? z.dm() : zVar;
    }
}
