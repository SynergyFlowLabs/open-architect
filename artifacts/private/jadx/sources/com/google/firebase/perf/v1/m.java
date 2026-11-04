package com.google.firebase.perf.v1;

import com.google.protobuf.f3;
import com.google.protobuf.l1;
import com.google.protobuf.s1;
import com.google.protobuf.t1;
import com.google.protobuf.v0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends l1<m, b> implements n {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final m DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile f3<m> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private k gaugeMetadata_;
    private String sessionId_ = "";
    private s1.k<h> cpuMetricReadings_ = l1.Ij();
    private s1.k<c> androidMemoryReadings_ = l1.Ij();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f124272a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f124272a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f124272a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f124272a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f124272a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f124272a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f124272a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f124272a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<m, b> implements n {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.firebase.perf.v1.n
        public c Bb(int i10) {
            return ((m) this.f126038b).Bb(i10);
        }

        @Override // com.google.firebase.perf.v1.n
        public k Kd() {
            return ((m) this.f126038b).Kd();
        }

        public b Ol(Iterable<? extends c> iterable) {
            El();
            ((m) this.f126038b).sm(iterable);
            return this;
        }

        public b Pl(Iterable<? extends h> iterable) {
            El();
            ((m) this.f126038b).tm(iterable);
            return this;
        }

        public b Ql(int i10, c.b bVar) {
            El();
            ((m) this.f126038b).um(i10, bVar.build());
            return this;
        }

        public b Rl(int i10, c cVar) {
            El();
            ((m) this.f126038b).um(i10, cVar);
            return this;
        }

        public b Sl(c.b bVar) {
            El();
            ((m) this.f126038b).vm(bVar.build());
            return this;
        }

        public b Tl(c cVar) {
            El();
            ((m) this.f126038b).vm(cVar);
            return this;
        }

        public b Ul(int i10, h.b bVar) {
            El();
            ((m) this.f126038b).wm(i10, bVar.build());
            return this;
        }

        public b Vl(int i10, h hVar) {
            El();
            ((m) this.f126038b).wm(i10, hVar);
            return this;
        }

        public b Wl(h.b bVar) {
            El();
            ((m) this.f126038b).xm(bVar.build());
            return this;
        }

        @Override // com.google.firebase.perf.v1.n
        public List<h> Xa() {
            return Collections.unmodifiableList(((m) this.f126038b).Xa());
        }

        public b Xl(h hVar) {
            El();
            ((m) this.f126038b).xm(hVar);
            return this;
        }

        public b Yl() {
            El();
            ((m) this.f126038b).ym();
            return this;
        }

        public b Zl() {
            El();
            ((m) this.f126038b).zm();
            return this;
        }

        public b am() {
            El();
            ((m) this.f126038b).Am();
            return this;
        }

        public b bm() {
            El();
            ((m) this.f126038b).Bm();
            return this;
        }

        public b cm(k kVar) {
            El();
            ((m) this.f126038b).Jm(kVar);
            return this;
        }

        public b dm(int i10) {
            El();
            ((m) this.f126038b).Zm(i10);
            return this;
        }

        public b em(int i10) {
            El();
            ((m) this.f126038b).an(i10);
            return this;
        }

        public b fm(int i10, c.b bVar) {
            El();
            ((m) this.f126038b).bn(i10, bVar.build());
            return this;
        }

        @Override // com.google.firebase.perf.v1.n
        public int g8() {
            return ((m) this.f126038b).g8();
        }

        @Override // com.google.firebase.perf.v1.n
        public String getSessionId() {
            return ((m) this.f126038b).getSessionId();
        }

        public b gm(int i10, c cVar) {
            El();
            ((m) this.f126038b).bn(i10, cVar);
            return this;
        }

        public b hm(int i10, h.b bVar) {
            El();
            ((m) this.f126038b).cn(i10, bVar.build());
            return this;
        }

        public b im(int i10, h hVar) {
            El();
            ((m) this.f126038b).cn(i10, hVar);
            return this;
        }

        @Override // com.google.firebase.perf.v1.n
        public int jd() {
            return ((m) this.f126038b).jd();
        }

        public b jm(k.b bVar) {
            El();
            ((m) this.f126038b).dn(bVar.build());
            return this;
        }

        @Override // com.google.firebase.perf.v1.n
        public List<c> ke() {
            return Collections.unmodifiableList(((m) this.f126038b).ke());
        }

        public b km(k kVar) {
            El();
            ((m) this.f126038b).dn(kVar);
            return this;
        }

        @Override // com.google.firebase.perf.v1.n
        public h lh(int i10) {
            return ((m) this.f126038b).lh(i10);
        }

        public b lm(String str) {
            El();
            ((m) this.f126038b).en(str);
            return this;
        }

        public b mm(com.google.protobuf.u uVar) {
            El();
            ((m) this.f126038b).fn(uVar);
            return this;
        }

        @Override // com.google.firebase.perf.v1.n
        public boolean pj() {
            return ((m) this.f126038b).pj();
        }

        @Override // com.google.firebase.perf.v1.n
        public com.google.protobuf.u s3() {
            return ((m) this.f126038b).s3();
        }

        @Override // com.google.firebase.perf.v1.n
        public boolean t6() {
            return ((m) this.f126038b).t6();
        }

        private b() {
            super(m.DEFAULT_INSTANCE);
        }
    }

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        l1.Wl(m.class, mVar);
    }

    private m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Am() {
        this.gaugeMetadata_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bm() {
        this.bitField0_ &= -2;
        this.sessionId_ = Im().getSessionId();
    }

    private void Cm() {
        s1.k<c> kVar = this.androidMemoryReadings_;
        if (kVar.s1()) {
            return;
        }
        this.androidMemoryReadings_ = l1.yl(kVar);
    }

    private void Dm() {
        s1.k<h> kVar = this.cpuMetricReadings_;
        if (kVar.s1()) {
            return;
        }
        this.cpuMetricReadings_ = l1.yl(kVar);
    }

    public static m Im() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Jm(k kVar) {
        kVar.getClass();
        k kVar2 = this.gaugeMetadata_;
        if (kVar2 == null || kVar2 == k.tm()) {
            this.gaugeMetadata_ = kVar;
        } else {
            this.gaugeMetadata_ = k.vm(this.gaugeMetadata_).Jl(kVar).B1();
        }
        this.bitField0_ |= 2;
    }

    public static b Km() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b Lm(m mVar) {
        return DEFAULT_INSTANCE.Uf(mVar);
    }

    public static m Mm(InputStream inputStream) throws IOException {
        return (m) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static m Nm(InputStream inputStream, v0 v0Var) throws IOException {
        return (m) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static m Om(com.google.protobuf.u uVar) throws t1 {
        return (m) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static m Pm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
        return (m) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static m Qm(com.google.protobuf.z zVar) throws IOException {
        return (m) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static m Rm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
        return (m) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static m Sm(InputStream inputStream) throws IOException {
        return (m) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static m Tm(InputStream inputStream, v0 v0Var) throws IOException {
        return (m) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static m Um(ByteBuffer byteBuffer) throws t1 {
        return (m) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m Vm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (m) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static m Wm(byte[] bArr) throws t1 {
        return (m) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static m Xm(byte[] bArr, v0 v0Var) throws t1 {
        return (m) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<m> Ym() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Zm(int i10) {
        Cm();
        this.androidMemoryReadings_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void an(int i10) {
        Dm();
        this.cpuMetricReadings_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bn(int i10, c cVar) {
        cVar.getClass();
        Cm();
        this.androidMemoryReadings_.set(i10, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cn(int i10, h hVar) {
        hVar.getClass();
        Dm();
        this.cpuMetricReadings_.set(i10, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dn(k kVar) {
        kVar.getClass();
        this.gaugeMetadata_ = kVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void en(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fn(com.google.protobuf.u uVar) {
        this.sessionId_ = uVar.z0();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sm(Iterable<? extends c> iterable) {
        Cm();
        com.google.protobuf.a.y(iterable, this.androidMemoryReadings_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tm(Iterable<? extends h> iterable) {
        Dm();
        com.google.protobuf.a.y(iterable, this.cpuMetricReadings_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void um(int i10, c cVar) {
        cVar.getClass();
        Cm();
        this.androidMemoryReadings_.add(i10, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vm(c cVar) {
        cVar.getClass();
        Cm();
        this.androidMemoryReadings_.add(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wm(int i10, h hVar) {
        hVar.getClass();
        Dm();
        this.cpuMetricReadings_.add(i10, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xm(h hVar) {
        hVar.getClass();
        Dm();
        this.cpuMetricReadings_.add(hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ym() {
        this.androidMemoryReadings_ = l1.Ij();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zm() {
        this.cpuMetricReadings_ = l1.Ij();
    }

    @Override // com.google.firebase.perf.v1.n
    public c Bb(int i10) {
        return this.androidMemoryReadings_.get(i10);
    }

    public d Em(int i10) {
        return this.androidMemoryReadings_.get(i10);
    }

    public List<? extends d> Fm() {
        return this.androidMemoryReadings_;
    }

    public i Gm(int i10) {
        return this.cpuMetricReadings_.get(i10);
    }

    public List<? extends i> Hm() {
        return this.cpuMetricReadings_;
    }

    @Override // com.google.firebase.perf.v1.n
    public k Kd() {
        k kVar = this.gaugeMetadata_;
        return kVar == null ? k.tm() : kVar;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f124272a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new m();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", h.class, "gaugeMetadata_", "androidMemoryReadings_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<m> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (m.class) {
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

    @Override // com.google.firebase.perf.v1.n
    public List<h> Xa() {
        return this.cpuMetricReadings_;
    }

    @Override // com.google.firebase.perf.v1.n
    public int g8() {
        return this.androidMemoryReadings_.size();
    }

    @Override // com.google.firebase.perf.v1.n
    public String getSessionId() {
        return this.sessionId_;
    }

    @Override // com.google.firebase.perf.v1.n
    public int jd() {
        return this.cpuMetricReadings_.size();
    }

    @Override // com.google.firebase.perf.v1.n
    public List<c> ke() {
        return this.androidMemoryReadings_;
    }

    @Override // com.google.firebase.perf.v1.n
    public h lh(int i10) {
        return this.cpuMetricReadings_.get(i10);
    }

    @Override // com.google.firebase.perf.v1.n
    public boolean pj() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.firebase.perf.v1.n
    public com.google.protobuf.u s3() {
        return com.google.protobuf.u.C(this.sessionId_);
    }

    @Override // com.google.firebase.perf.v1.n
    public boolean t6() {
        int i10 = 1 << 1;
        return (this.bitField0_ & 1) != 0;
    }
}
