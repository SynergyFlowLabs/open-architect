package com.google.firebase.perf.v1;

import com.google.protobuf.f3;
import com.google.protobuf.g2;
import com.google.protobuf.h2;
import com.google.protobuf.l1;
import com.google.protobuf.s1;
import com.google.protobuf.t1;
import com.google.protobuf.v0;
import com.google.protobuf.x4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class x extends l1<x, b> implements y {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final x DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile f3<x> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private long durationUs_;
    private boolean isAuto_;
    private h2<String, Long> counters_ = h2.f();
    private h2<String, String> customAttributes_ = h2.f();
    private String name_ = "";
    private s1.k<x> subtraces_ = l1.Ij();
    private s1.k<u> perfSessions_ = l1.Ij();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f124395a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f124395a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f124395a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f124395a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f124395a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f124395a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f124395a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f124395a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<x, b> implements y {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.firebase.perf.v1.y
        public u B5(int i10) {
            return ((x) this.f126038b).B5(i10);
        }

        @Override // com.google.firebase.perf.v1.y
        public List<u> C7() {
            return Collections.unmodifiableList(((x) this.f126038b).C7());
        }

        @Override // com.google.firebase.perf.v1.y
        public boolean Dh() {
            return ((x) this.f126038b).Dh();
        }

        @Override // com.google.firebase.perf.v1.y
        public boolean H7() {
            return ((x) this.f126038b).H7();
        }

        @Override // com.google.firebase.perf.v1.y
        public int Nc() {
            return ((x) this.f126038b).Y8().size();
        }

        public b Ol(Iterable<? extends u> iterable) {
            El();
            ((x) this.f126038b).xm(iterable);
            return this;
        }

        public b Pl(Iterable<? extends x> iterable) {
            El();
            ((x) this.f126038b).ym(iterable);
            return this;
        }

        @Override // com.google.firebase.perf.v1.y
        public long Q1() {
            return ((x) this.f126038b).Q1();
        }

        public b Ql(int i10, u.c cVar) {
            El();
            ((x) this.f126038b).zm(i10, cVar.build());
            return this;
        }

        public b Rl(int i10, u uVar) {
            El();
            ((x) this.f126038b).zm(i10, uVar);
            return this;
        }

        public b Sl(u.c cVar) {
            El();
            ((x) this.f126038b).Am(cVar.build());
            return this;
        }

        public b Tl(u uVar) {
            El();
            ((x) this.f126038b).Am(uVar);
            return this;
        }

        public b Ul(int i10, b bVar) {
            El();
            ((x) this.f126038b).Bm(i10, bVar.build());
            return this;
        }

        public b Vl(int i10, x xVar) {
            El();
            ((x) this.f126038b).Bm(i10, xVar);
            return this;
        }

        @Override // com.google.firebase.perf.v1.y
        public String W0(String str) {
            str.getClass();
            Map<String, String> mapZ1 = ((x) this.f126038b).z1();
            if (mapZ1.containsKey(str)) {
                return mapZ1.get(str);
            }
            throw new IllegalArgumentException();
        }

        public b Wl(b bVar) {
            El();
            ((x) this.f126038b).Cm(bVar.build());
            return this;
        }

        @Override // com.google.firebase.perf.v1.y
        public long X7() {
            return ((x) this.f126038b).X7();
        }

        public b Xl(x xVar) {
            El();
            ((x) this.f126038b).Cm(xVar);
            return this;
        }

        @Override // com.google.firebase.perf.v1.y
        public Map<String, Long> Y8() {
            return Collections.unmodifiableMap(((x) this.f126038b).Y8());
        }

        public b Yl() {
            El();
            ((x) this.f126038b).Dm();
            return this;
        }

        @Override // com.google.firebase.perf.v1.y
        public int Z5() {
            return ((x) this.f126038b).Z5();
        }

        public b Zl() {
            El();
            ((x) this.f126038b).Mm().clear();
            return this;
        }

        @Override // com.google.firebase.perf.v1.y
        public com.google.protobuf.u a() {
            return ((x) this.f126038b).a();
        }

        public b am() {
            El();
            ((x) this.f126038b).Nm().clear();
            return this;
        }

        @Override // com.google.firebase.perf.v1.y
        public List<x> be() {
            return Collections.unmodifiableList(((x) this.f126038b).be());
        }

        public b bm() {
            El();
            ((x) this.f126038b).Em();
            return this;
        }

        public b cm() {
            El();
            ((x) this.f126038b).Fm();
            return this;
        }

        public b dm() {
            El();
            ((x) this.f126038b).Gm();
            return this;
        }

        @Override // com.google.firebase.perf.v1.y
        public x e9(int i10) {
            return ((x) this.f126038b).e9(i10);
        }

        public b em() {
            El();
            ((x) this.f126038b).Hm();
            return this;
        }

        public b fm() {
            El();
            ((x) this.f126038b).Im();
            return this;
        }

        @Override // com.google.firebase.perf.v1.y
        public String getName() {
            return ((x) this.f126038b).getName();
        }

        public b gm(Map<String, Long> map) {
            El();
            ((x) this.f126038b).Mm().putAll(map);
            return this;
        }

        @Override // com.google.firebase.perf.v1.y
        public boolean h() {
            return ((x) this.f126038b).h();
        }

        public b hm(Map<String, String> map) {
            El();
            ((x) this.f126038b).Nm().putAll(map);
            return this;
        }

        public b im(String str, long j10) {
            str.getClass();
            El();
            ((x) this.f126038b).Mm().put(str, Long.valueOf(j10));
            return this;
        }

        public b jm(String str, String str2) {
            str.getClass();
            str2.getClass();
            El();
            ((x) this.f126038b).Nm().put(str, str2);
            return this;
        }

        public b km(String str) {
            str.getClass();
            El();
            ((x) this.f126038b).Mm().remove(str);
            return this;
        }

        @Override // com.google.firebase.perf.v1.y
        public int l1() {
            return ((x) this.f126038b).z1().size();
        }

        public b lm(String str) {
            str.getClass();
            El();
            ((x) this.f126038b).Nm().remove(str);
            return this;
        }

        public b mm(int i10) {
            El();
            ((x) this.f126038b).ln(i10);
            return this;
        }

        @Override // com.google.firebase.perf.v1.y
        public long nc(String str, long j10) {
            str.getClass();
            Map<String, Long> mapY8 = ((x) this.f126038b).Y8();
            return mapY8.containsKey(str) ? mapY8.get(str).longValue() : j10;
        }

        public b nm(int i10) {
            El();
            ((x) this.f126038b).mn(i10);
            return this;
        }

        @Override // com.google.firebase.perf.v1.y
        public long oa(String str) {
            str.getClass();
            Map<String, Long> mapY8 = ((x) this.f126038b).Y8();
            if (mapY8.containsKey(str)) {
                return mapY8.get(str).longValue();
            }
            throw new IllegalArgumentException();
        }

        public b om(long j10) {
            El();
            ((x) this.f126038b).nn(j10);
            return this;
        }

        @Override // com.google.firebase.perf.v1.y
        public String p1(String str, String str2) {
            str.getClass();
            Map<String, String> mapZ1 = ((x) this.f126038b).z1();
            return mapZ1.containsKey(str) ? mapZ1.get(str) : str2;
        }

        public b pm(long j10) {
            El();
            ((x) this.f126038b).on(j10);
            return this;
        }

        public b qm(boolean z10) {
            El();
            ((x) this.f126038b).pn(z10);
            return this;
        }

        public b rm(String str) {
            El();
            ((x) this.f126038b).qn(str);
            return this;
        }

        @Override // com.google.firebase.perf.v1.y
        @Deprecated
        public Map<String, String> s1() {
            return z1();
        }

        public b sm(com.google.protobuf.u uVar) {
            El();
            ((x) this.f126038b).rn(uVar);
            return this;
        }

        @Override // com.google.firebase.perf.v1.y
        public boolean th(String str) {
            str.getClass();
            return ((x) this.f126038b).Y8().containsKey(str);
        }

        public b tm(int i10, u.c cVar) {
            El();
            ((x) this.f126038b).sn(i10, cVar.build());
            return this;
        }

        public b um(int i10, u uVar) {
            El();
            ((x) this.f126038b).sn(i10, uVar);
            return this;
        }

        @Override // com.google.firebase.perf.v1.y
        public boolean v9() {
            return ((x) this.f126038b).v9();
        }

        @Override // com.google.firebase.perf.v1.y
        @Deprecated
        public Map<String, Long> ve() {
            return Y8();
        }

        @Override // com.google.firebase.perf.v1.y
        public boolean vh() {
            return ((x) this.f126038b).vh();
        }

        public b vm(int i10, b bVar) {
            El();
            ((x) this.f126038b).tn(i10, bVar.build());
            return this;
        }

        public b wm(int i10, x xVar) {
            El();
            ((x) this.f126038b).tn(i10, xVar);
            return this;
        }

        @Override // com.google.firebase.perf.v1.y
        public boolean x1(String str) {
            str.getClass();
            return ((x) this.f126038b).z1().containsKey(str);
        }

        @Override // com.google.firebase.perf.v1.y
        public int x9() {
            return ((x) this.f126038b).x9();
        }

        @Override // com.google.firebase.perf.v1.y
        public Map<String, String> z1() {
            return Collections.unmodifiableMap(((x) this.f126038b).z1());
        }

        private b() {
            super(x.DEFAULT_INSTANCE);
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final g2<String, Long> f124396a = g2.f(x4.b.f126490k, "", x4.b.f126484e, 0L);

        private c() {
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final g2<String, String> f124397a;

        static {
            x4.b bVar = x4.b.f126490k;
            f124397a = g2.f(bVar, "", bVar, "");
        }

        private d() {
        }
    }

    static {
        x xVar = new x();
        DEFAULT_INSTANCE = xVar;
        l1.Wl(x.class, xVar);
    }

    private x() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Am(u uVar) {
        uVar.getClass();
        Jm();
        this.perfSessions_.add(uVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bm(int i10, x xVar) {
        xVar.getClass();
        Km();
        this.subtraces_.add(i10, xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Cm(x xVar) {
        xVar.getClass();
        Km();
        this.subtraces_.add(xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dm() {
        this.bitField0_ &= -5;
        this.clientStartTimeUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Em() {
        this.bitField0_ &= -9;
        this.durationUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Fm() {
        this.bitField0_ &= -3;
        this.isAuto_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Gm() {
        this.bitField0_ &= -2;
        this.name_ = Lm().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Hm() {
        this.perfSessions_ = l1.Ij();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Im() {
        this.subtraces_ = l1.Ij();
    }

    private void Jm() {
        s1.k<u> kVar = this.perfSessions_;
        if (!kVar.s1()) {
            this.perfSessions_ = l1.yl(kVar);
        }
    }

    private void Km() {
        s1.k<x> kVar = this.subtraces_;
        if (kVar.s1()) {
            return;
        }
        this.subtraces_ = l1.yl(kVar);
    }

    public static x Lm() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Long> Mm() {
        return Um();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> Nm() {
        return Vm();
    }

    private h2<String, Long> Sm() {
        return this.counters_;
    }

    private h2<String, String> Tm() {
        return this.customAttributes_;
    }

    private h2<String, Long> Um() {
        if (!this.counters_.j()) {
            this.counters_ = this.counters_.n();
        }
        return this.counters_;
    }

    private h2<String, String> Vm() {
        if (!this.customAttributes_.j()) {
            this.customAttributes_ = this.customAttributes_.n();
        }
        return this.customAttributes_;
    }

    public static b Wm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b Xm(x xVar) {
        return DEFAULT_INSTANCE.Uf(xVar);
    }

    public static x Ym(InputStream inputStream) throws IOException {
        return (x) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static x Zm(InputStream inputStream, v0 v0Var) throws IOException {
        return (x) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static x an(com.google.protobuf.u uVar) throws t1 {
        return (x) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static x bn(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
        return (x) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static x cn(com.google.protobuf.z zVar) throws IOException {
        return (x) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static x dn(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
        return (x) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static x en(InputStream inputStream) throws IOException {
        return (x) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static x fn(InputStream inputStream, v0 v0Var) throws IOException {
        return (x) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static x gn(ByteBuffer byteBuffer) throws t1 {
        return (x) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static x hn(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (x) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static x in(byte[] bArr) throws t1 {
        return (x) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static x jn(byte[] bArr, v0 v0Var) throws t1 {
        return (x) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<x> kn() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ln(int i10) {
        Jm();
        this.perfSessions_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mn(int i10) {
        Km();
        this.subtraces_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nn(long j10) {
        this.bitField0_ |= 4;
        this.clientStartTimeUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void on(long j10) {
        this.bitField0_ |= 8;
        this.durationUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pn(boolean z10) {
        this.bitField0_ |= 2;
        this.isAuto_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qn(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rn(com.google.protobuf.u uVar) {
        this.name_ = uVar.z0();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sn(int i10, u uVar) {
        uVar.getClass();
        Jm();
        this.perfSessions_.set(i10, uVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tn(int i10, x xVar) {
        xVar.getClass();
        Km();
        this.subtraces_.set(i10, xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xm(Iterable<? extends u> iterable) {
        Jm();
        com.google.protobuf.a.y(iterable, this.perfSessions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ym(Iterable<? extends x> iterable) {
        Km();
        com.google.protobuf.a.y(iterable, this.subtraces_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zm(int i10, u uVar) {
        uVar.getClass();
        Jm();
        this.perfSessions_.add(i10, uVar);
    }

    @Override // com.google.firebase.perf.v1.y
    public u B5(int i10) {
        return this.perfSessions_.get(i10);
    }

    @Override // com.google.firebase.perf.v1.y
    public List<u> C7() {
        return this.perfSessions_;
    }

    @Override // com.google.firebase.perf.v1.y
    public boolean Dh() {
        return this.isAuto_;
    }

    @Override // com.google.firebase.perf.v1.y
    public boolean H7() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.firebase.perf.v1.y
    public int Nc() {
        return Sm().size();
    }

    public v Om(int i10) {
        return this.perfSessions_.get(i10);
    }

    public List<? extends v> Pm() {
        return this.perfSessions_;
    }

    @Override // com.google.firebase.perf.v1.y
    public long Q1() {
        return this.durationUs_;
    }

    public y Qm(int i10) {
        return this.subtraces_.get(i10);
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f124395a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new x();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", c.f124396a, "subtraces_", x.class, "customAttributes_", d.f124397a, "perfSessions_", u.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<x> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (x.class) {
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

    public List<? extends y> Rm() {
        return this.subtraces_;
    }

    @Override // com.google.firebase.perf.v1.y
    public String W0(String str) {
        str.getClass();
        h2<String, String> h2VarTm = Tm();
        if (h2VarTm.containsKey(str)) {
            return h2VarTm.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.firebase.perf.v1.y
    public long X7() {
        return this.clientStartTimeUs_;
    }

    @Override // com.google.firebase.perf.v1.y
    public Map<String, Long> Y8() {
        return Collections.unmodifiableMap(Sm());
    }

    @Override // com.google.firebase.perf.v1.y
    public int Z5() {
        return this.perfSessions_.size();
    }

    @Override // com.google.firebase.perf.v1.y
    public com.google.protobuf.u a() {
        return com.google.protobuf.u.C(this.name_);
    }

    @Override // com.google.firebase.perf.v1.y
    public List<x> be() {
        return this.subtraces_;
    }

    @Override // com.google.firebase.perf.v1.y
    public x e9(int i10) {
        return this.subtraces_.get(i10);
    }

    @Override // com.google.firebase.perf.v1.y
    public String getName() {
        return this.name_;
    }

    @Override // com.google.firebase.perf.v1.y
    public boolean h() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.firebase.perf.v1.y
    public int l1() {
        return Tm().size();
    }

    @Override // com.google.firebase.perf.v1.y
    public long nc(String str, long j10) {
        str.getClass();
        h2<String, Long> h2VarSm = Sm();
        return h2VarSm.containsKey(str) ? h2VarSm.get(str).longValue() : j10;
    }

    @Override // com.google.firebase.perf.v1.y
    public long oa(String str) {
        str.getClass();
        h2<String, Long> h2VarSm = Sm();
        if (h2VarSm.containsKey(str)) {
            return h2VarSm.get(str).longValue();
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.firebase.perf.v1.y
    public String p1(String str, String str2) {
        str.getClass();
        h2<String, String> h2VarTm = Tm();
        return h2VarTm.containsKey(str) ? h2VarTm.get(str) : str2;
    }

    @Override // com.google.firebase.perf.v1.y
    @Deprecated
    public Map<String, String> s1() {
        return z1();
    }

    @Override // com.google.firebase.perf.v1.y
    public boolean th(String str) {
        str.getClass();
        return Sm().containsKey(str);
    }

    @Override // com.google.firebase.perf.v1.y
    public boolean v9() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.firebase.perf.v1.y
    @Deprecated
    public Map<String, Long> ve() {
        return Y8();
    }

    @Override // com.google.firebase.perf.v1.y
    public boolean vh() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.firebase.perf.v1.y
    public boolean x1(String str) {
        str.getClass();
        return Tm().containsKey(str);
    }

    @Override // com.google.firebase.perf.v1.y
    public int x9() {
        return this.subtraces_.size();
    }

    @Override // com.google.firebase.perf.v1.y
    public Map<String, String> z1() {
        return Collections.unmodifiableMap(Tm());
    }
}
