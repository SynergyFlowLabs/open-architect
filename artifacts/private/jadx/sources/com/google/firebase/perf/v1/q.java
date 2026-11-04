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
public final class q extends l1<q, b> implements r {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final q DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile f3<q> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private long requestPayloadBytes_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private h2<String, String> customAttributes_ = h2.f();
    private String url_ = "";
    private String responseContentType_ = "";
    private s1.k<u> perfSessions_ = l1.Ij();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f124354a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f124354a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f124354a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f124354a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f124354a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f124354a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f124354a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f124354a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<q, b> implements r {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.firebase.perf.v1.r
        public u B5(int i10) {
            return ((q) this.f126038b).B5(i10);
        }

        @Override // com.google.firebase.perf.v1.r
        public List<u> C7() {
            return Collections.unmodifiableList(((q) this.f126038b).C7());
        }

        @Override // com.google.firebase.perf.v1.r
        public boolean C9() {
            return ((q) this.f126038b).C9();
        }

        @Override // com.google.firebase.perf.v1.r
        public com.google.protobuf.u F9() {
            return ((q) this.f126038b).F9();
        }

        @Override // com.google.firebase.perf.v1.r
        public long Gj() {
            return ((q) this.f126038b).Gj();
        }

        @Override // com.google.firebase.perf.v1.r
        public boolean H7() {
            return ((q) this.f126038b).H7();
        }

        @Override // com.google.firebase.perf.v1.r
        public boolean Id() {
            return ((q) this.f126038b).Id();
        }

        public b Ol(Iterable<? extends u> iterable) {
            El();
            ((q) this.f126038b).Fm(iterable);
            return this;
        }

        public b Pl(int i10, u.c cVar) {
            El();
            ((q) this.f126038b).Gm(i10, cVar.build());
            return this;
        }

        public b Ql(int i10, u uVar) {
            El();
            ((q) this.f126038b).Gm(i10, uVar);
            return this;
        }

        @Override // com.google.firebase.perf.v1.r
        public boolean R9() {
            return ((q) this.f126038b).R9();
        }

        public b Rl(u.c cVar) {
            El();
            ((q) this.f126038b).Hm(cVar.build());
            return this;
        }

        public b Sl(u uVar) {
            El();
            ((q) this.f126038b).Hm(uVar);
            return this;
        }

        public b Tl() {
            El();
            ((q) this.f126038b).Im();
            return this;
        }

        @Override // com.google.firebase.perf.v1.r
        public com.google.protobuf.u U4() {
            return ((q) this.f126038b).U4();
        }

        @Override // com.google.firebase.perf.v1.r
        public boolean Uh() {
            return ((q) this.f126038b).Uh();
        }

        @Override // com.google.firebase.perf.v1.r
        public e Ui() {
            return ((q) this.f126038b).Ui();
        }

        public b Ul() {
            El();
            ((q) this.f126038b).Wm().clear();
            return this;
        }

        public b Vl() {
            El();
            ((q) this.f126038b).Jm();
            return this;
        }

        @Override // com.google.firebase.perf.v1.r
        public String W0(String str) {
            str.getClass();
            Map<String, String> mapZ1 = ((q) this.f126038b).z1();
            if (mapZ1.containsKey(str)) {
                return mapZ1.get(str);
            }
            throw new IllegalArgumentException();
        }

        public b Wl() {
            El();
            ((q) this.f126038b).Km();
            return this;
        }

        @Override // com.google.firebase.perf.v1.r
        public long X7() {
            return ((q) this.f126038b).X7();
        }

        public b Xl() {
            El();
            ((q) this.f126038b).Lm();
            return this;
        }

        public b Yl() {
            El();
            ((q) this.f126038b).Mm();
            return this;
        }

        @Override // com.google.firebase.perf.v1.r
        public int Z5() {
            return ((q) this.f126038b).Z5();
        }

        @Override // com.google.firebase.perf.v1.r
        public boolean Z8() {
            return ((q) this.f126038b).Z8();
        }

        public b Zl() {
            El();
            ((q) this.f126038b).Nm();
            return this;
        }

        public b am() {
            El();
            ((q) this.f126038b).Om();
            return this;
        }

        @Override // com.google.firebase.perf.v1.r
        public long b9() {
            return ((q) this.f126038b).b9();
        }

        public b bm() {
            El();
            ((q) this.f126038b).Pm();
            return this;
        }

        public b cm() {
            El();
            ((q) this.f126038b).Qm();
            return this;
        }

        @Override // com.google.firebase.perf.v1.r
        public boolean dd() {
            return ((q) this.f126038b).dd();
        }

        public b dm() {
            El();
            ((q) this.f126038b).Rm();
            return this;
        }

        public b em() {
            El();
            ((q) this.f126038b).Sm();
            return this;
        }

        public b fm() {
            El();
            ((q) this.f126038b).Tm();
            return this;
        }

        @Override // com.google.firebase.perf.v1.r
        public String getUrl() {
            return ((q) this.f126038b).getUrl();
        }

        public b gm(Map<String, String> map) {
            El();
            ((q) this.f126038b).Wm().putAll(map);
            return this;
        }

        public b hm(String str, String str2) {
            str.getClass();
            str2.getClass();
            El();
            ((q) this.f126038b).Wm().put(str, str2);
            return this;
        }

        public b im(String str) {
            str.getClass();
            El();
            ((q) this.f126038b).Wm().remove(str);
            return this;
        }

        public b jm(int i10) {
            El();
            ((q) this.f126038b).qn(i10);
            return this;
        }

        public b km(long j10) {
            El();
            ((q) this.f126038b).rn(j10);
            return this;
        }

        @Override // com.google.firebase.perf.v1.r
        public int l1() {
            return ((q) this.f126038b).z1().size();
        }

        public b lm(d dVar) {
            El();
            ((q) this.f126038b).sn(dVar);
            return this;
        }

        public b mm(int i10) {
            El();
            ((q) this.f126038b).tn(i10);
            return this;
        }

        public b nm(e eVar) {
            El();
            ((q) this.f126038b).un(eVar);
            return this;
        }

        public b om(int i10, u.c cVar) {
            El();
            ((q) this.f126038b).vn(i10, cVar.build());
            return this;
        }

        @Override // com.google.firebase.perf.v1.r
        public String p1(String str, String str2) {
            str.getClass();
            Map<String, String> mapZ1 = ((q) this.f126038b).z1();
            return mapZ1.containsKey(str) ? mapZ1.get(str) : str2;
        }

        @Override // com.google.firebase.perf.v1.r
        public long p8() {
            return ((q) this.f126038b).p8();
        }

        @Override // com.google.firebase.perf.v1.r
        public boolean pf() {
            return ((q) this.f126038b).pf();
        }

        public b pm(int i10, u uVar) {
            El();
            ((q) this.f126038b).vn(i10, uVar);
            return this;
        }

        public b qm(long j10) {
            El();
            ((q) this.f126038b).wn(j10);
            return this;
        }

        @Override // com.google.firebase.perf.v1.r
        public boolean r8() {
            return ((q) this.f126038b).r8();
        }

        @Override // com.google.firebase.perf.v1.r
        public long r9() {
            return ((q) this.f126038b).r9();
        }

        public b rm(String str) {
            El();
            ((q) this.f126038b).xn(str);
            return this;
        }

        @Override // com.google.firebase.perf.v1.r
        @Deprecated
        public Map<String, String> s1() {
            return z1();
        }

        @Override // com.google.firebase.perf.v1.r
        public long s8() {
            return ((q) this.f126038b).s8();
        }

        @Override // com.google.firebase.perf.v1.r
        public d sc() {
            return ((q) this.f126038b).sc();
        }

        public b sm(com.google.protobuf.u uVar) {
            El();
            ((q) this.f126038b).yn(uVar);
            return this;
        }

        public b tm(long j10) {
            El();
            ((q) this.f126038b).zn(j10);
            return this;
        }

        public b um(long j10) {
            El();
            ((q) this.f126038b).An(j10);
            return this;
        }

        @Override // com.google.firebase.perf.v1.r
        public int vg() {
            return ((q) this.f126038b).vg();
        }

        public b vm(long j10) {
            El();
            ((q) this.f126038b).Bn(j10);
            return this;
        }

        @Override // com.google.firebase.perf.v1.r
        public boolean w9() {
            return ((q) this.f126038b).w9();
        }

        @Override // com.google.firebase.perf.v1.r
        public boolean wb() {
            return ((q) this.f126038b).wb();
        }

        @Override // com.google.firebase.perf.v1.r
        public String wd() {
            return ((q) this.f126038b).wd();
        }

        public b wm(long j10) {
            El();
            ((q) this.f126038b).Cn(j10);
            return this;
        }

        @Override // com.google.firebase.perf.v1.r
        public boolean x1(String str) {
            str.getClass();
            return ((q) this.f126038b).z1().containsKey(str);
        }

        public b xm(String str) {
            El();
            ((q) this.f126038b).Dn(str);
            return this;
        }

        public b ym(com.google.protobuf.u uVar) {
            El();
            ((q) this.f126038b).En(uVar);
            return this;
        }

        @Override // com.google.firebase.perf.v1.r
        public Map<String, String> z1() {
            return Collections.unmodifiableMap(((q) this.f126038b).z1());
        }

        private b() {
            super(q.DEFAULT_INSTANCE);
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final g2<String, String> f124355a;

        static {
            x4.b bVar = x4.b.f126490k;
            f124355a = g2.f(bVar, "", bVar, "");
        }

        private c() {
        }
    }

    public enum d implements s1.c {
        HTTP_METHOD_UNKNOWN(0),
        GET(1),
        PUT(2),
        POST(3),
        DELETE(4),
        HEAD(5),
        PATCH(6),
        OPTIONS(7),
        TRACE(8),
        CONNECT(9);

        public static final int X = 8;
        public static final int Y = 9;
        private static final s1.d<d> Z = new a();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f124366l = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f124367m = 1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f124368n = 2;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f124369o = 3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f124371s = 4;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f124372t = 5;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f124373v = 6;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f124374w = 7;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f124375a;

        class a implements s1.d<d> {
            a() {
            }

            @Override // com.google.protobuf.s1.d
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d a(int i10) {
                return d.l(i10);
            }
        }

        private static final class b implements s1.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final s1.e f124376a = new b();

            private b() {
            }

            @Override // com.google.protobuf.s1.e
            public boolean a(int i10) {
                return d.l(i10) != null;
            }
        }

        d(int i10) {
            this.f124375a = i10;
        }

        public static d l(int i10) {
            switch (i10) {
                case 0:
                    return HTTP_METHOD_UNKNOWN;
                case 1:
                    return GET;
                case 2:
                    return PUT;
                case 3:
                    return POST;
                case 4:
                    return DELETE;
                case 5:
                    return HEAD;
                case 6:
                    return PATCH;
                case 7:
                    return OPTIONS;
                case 8:
                    return TRACE;
                case 9:
                    return CONNECT;
                default:
                    return null;
            }
        }

        public static s1.d<d> n() {
            return Z;
        }

        public static s1.e o() {
            return b.f124376a;
        }

        @Deprecated
        public static d p(int i10) {
            return l(i10);
        }

        @Override // com.google.protobuf.s1.c
        public final int i() {
            return this.f124375a;
        }
    }

    public enum e implements s1.c {
        NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
        GENERIC_CLIENT_ERROR(1);


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f124379d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f124380e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final s1.d<e> f124381f = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f124383a;

        class a implements s1.d<e> {
            a() {
            }

            @Override // com.google.protobuf.s1.d
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public e a(int i10) {
                return e.l(i10);
            }
        }

        private static final class b implements s1.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final s1.e f124384a = new b();

            private b() {
            }

            @Override // com.google.protobuf.s1.e
            public boolean a(int i10) {
                return e.l(i10) != null;
            }
        }

        e(int i10) {
            this.f124383a = i10;
        }

        public static e l(int i10) {
            if (i10 == 0) {
                return NETWORK_CLIENT_ERROR_REASON_UNKNOWN;
            }
            if (i10 != 1) {
                return null;
            }
            return GENERIC_CLIENT_ERROR;
        }

        public static s1.d<e> n() {
            return f124381f;
        }

        public static s1.e o() {
            return b.f124384a;
        }

        @Deprecated
        public static e p(int i10) {
            return l(i10);
        }

        @Override // com.google.protobuf.s1.c
        public final int i() {
            return this.f124383a;
        }
    }

    static {
        q qVar = new q();
        DEFAULT_INSTANCE = qVar;
        l1.Wl(q.class, qVar);
    }

    private q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void An(long j10) {
        this.bitField0_ |= 256;
        this.timeToRequestCompletedUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bn(long j10) {
        this.bitField0_ |= 1024;
        this.timeToResponseCompletedUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Cn(long j10) {
        this.bitField0_ |= 512;
        this.timeToResponseInitiatedUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dn(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void En(com.google.protobuf.u uVar) {
        this.url_ = uVar.z0();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Fm(Iterable<? extends u> iterable) {
        Um();
        com.google.protobuf.a.y(iterable, this.perfSessions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Gm(int i10, u uVar) {
        uVar.getClass();
        Um();
        this.perfSessions_.add(i10, uVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Hm(u uVar) {
        uVar.getClass();
        Um();
        this.perfSessions_.add(uVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Im() {
        this.bitField0_ &= -129;
        this.clientStartTimeUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Jm() {
        this.bitField0_ &= -3;
        this.httpMethod_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Km() {
        this.bitField0_ &= -33;
        this.httpResponseCode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lm() {
        this.bitField0_ &= -17;
        this.networkClientErrorReason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Mm() {
        this.perfSessions_ = l1.Ij();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Nm() {
        this.bitField0_ &= -5;
        this.requestPayloadBytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Om() {
        this.bitField0_ &= -65;
        this.responseContentType_ = Vm().wd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Pm() {
        this.bitField0_ &= -9;
        this.responsePayloadBytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qm() {
        this.bitField0_ &= -257;
        this.timeToRequestCompletedUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Rm() {
        this.bitField0_ &= -1025;
        this.timeToResponseCompletedUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sm() {
        this.bitField0_ &= -513;
        this.timeToResponseInitiatedUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Tm() {
        this.bitField0_ &= -2;
        this.url_ = Vm().getUrl();
    }

    private void Um() {
        s1.k<u> kVar = this.perfSessions_;
        if (!kVar.s1()) {
            this.perfSessions_ = l1.yl(kVar);
        }
    }

    public static q Vm() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> Wm() {
        return an();
    }

    private h2<String, String> Zm() {
        return this.customAttributes_;
    }

    private h2<String, String> an() {
        if (!this.customAttributes_.j()) {
            this.customAttributes_ = this.customAttributes_.n();
        }
        return this.customAttributes_;
    }

    public static b bn() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b cn(q qVar) {
        return DEFAULT_INSTANCE.Uf(qVar);
    }

    public static q dn(InputStream inputStream) throws IOException {
        return (q) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static q en(InputStream inputStream, v0 v0Var) throws IOException {
        return (q) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static q fn(com.google.protobuf.u uVar) throws t1 {
        return (q) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static q gn(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
        return (q) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static q hn(com.google.protobuf.z zVar) throws IOException {
        return (q) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static q in(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
        return (q) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static q jn(InputStream inputStream) throws IOException {
        return (q) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static q kn(InputStream inputStream, v0 v0Var) throws IOException {
        return (q) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static q ln(ByteBuffer byteBuffer) throws t1 {
        return (q) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static q mn(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (q) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static q nn(byte[] bArr) throws t1 {
        return (q) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static q on(byte[] bArr, v0 v0Var) throws t1 {
        return (q) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<q> pn() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qn(int i10) {
        Um();
        this.perfSessions_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rn(long j10) {
        this.bitField0_ |= 128;
        this.clientStartTimeUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sn(d dVar) {
        this.httpMethod_ = dVar.i();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tn(int i10) {
        this.bitField0_ |= 32;
        this.httpResponseCode_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void un(e eVar) {
        this.networkClientErrorReason_ = eVar.i();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vn(int i10, u uVar) {
        uVar.getClass();
        Um();
        this.perfSessions_.set(i10, uVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wn(long j10) {
        this.bitField0_ |= 4;
        this.requestPayloadBytes_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xn(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.responseContentType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yn(com.google.protobuf.u uVar) {
        this.responseContentType_ = uVar.z0();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zn(long j10) {
        this.bitField0_ |= 8;
        this.responsePayloadBytes_ = j10;
    }

    @Override // com.google.firebase.perf.v1.r
    public u B5(int i10) {
        return this.perfSessions_.get(i10);
    }

    @Override // com.google.firebase.perf.v1.r
    public List<u> C7() {
        return this.perfSessions_;
    }

    @Override // com.google.firebase.perf.v1.r
    public boolean C9() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.firebase.perf.v1.r
    public com.google.protobuf.u F9() {
        return com.google.protobuf.u.C(this.responseContentType_);
    }

    @Override // com.google.firebase.perf.v1.r
    public long Gj() {
        return this.timeToResponseInitiatedUs_;
    }

    @Override // com.google.firebase.perf.v1.r
    public boolean H7() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // com.google.firebase.perf.v1.r
    public boolean Id() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.firebase.perf.v1.r
    public boolean R9() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        a aVar = null;
        switch (a.f124354a[iVar.ordinal()]) {
            case 1:
                return new q();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000b᠌\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", d.o(), "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", e.o(), "customAttributes_", c.f124355a, "perfSessions_", u.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<q> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (q.class) {
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

    @Override // com.google.firebase.perf.v1.r
    public com.google.protobuf.u U4() {
        return com.google.protobuf.u.C(this.url_);
    }

    @Override // com.google.firebase.perf.v1.r
    public boolean Uh() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.firebase.perf.v1.r
    public e Ui() {
        e eVarL = e.l(this.networkClientErrorReason_);
        return eVarL == null ? e.NETWORK_CLIENT_ERROR_REASON_UNKNOWN : eVarL;
    }

    @Override // com.google.firebase.perf.v1.r
    public String W0(String str) {
        str.getClass();
        h2<String, String> h2VarZm = Zm();
        if (h2VarZm.containsKey(str)) {
            return h2VarZm.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.firebase.perf.v1.r
    public long X7() {
        return this.clientStartTimeUs_;
    }

    public v Xm(int i10) {
        return this.perfSessions_.get(i10);
    }

    public List<? extends v> Ym() {
        return this.perfSessions_;
    }

    @Override // com.google.firebase.perf.v1.r
    public int Z5() {
        return this.perfSessions_.size();
    }

    @Override // com.google.firebase.perf.v1.r
    public boolean Z8() {
        if ((this.bitField0_ & 16) == 0) {
            return false;
        }
        boolean z10 = false | true;
        return true;
    }

    @Override // com.google.firebase.perf.v1.r
    public long b9() {
        return this.responsePayloadBytes_;
    }

    @Override // com.google.firebase.perf.v1.r
    public boolean dd() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // com.google.firebase.perf.v1.r
    public String getUrl() {
        return this.url_;
    }

    @Override // com.google.firebase.perf.v1.r
    public int l1() {
        return Zm().size();
    }

    @Override // com.google.firebase.perf.v1.r
    public String p1(String str, String str2) {
        str.getClass();
        h2<String, String> h2VarZm = Zm();
        return h2VarZm.containsKey(str) ? h2VarZm.get(str) : str2;
    }

    @Override // com.google.firebase.perf.v1.r
    public long p8() {
        return this.timeToRequestCompletedUs_;
    }

    @Override // com.google.firebase.perf.v1.r
    public boolean pf() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.firebase.perf.v1.r
    public boolean r8() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.google.firebase.perf.v1.r
    public long r9() {
        return this.requestPayloadBytes_;
    }

    @Override // com.google.firebase.perf.v1.r
    @Deprecated
    public Map<String, String> s1() {
        return z1();
    }

    @Override // com.google.firebase.perf.v1.r
    public long s8() {
        return this.timeToResponseCompletedUs_;
    }

    @Override // com.google.firebase.perf.v1.r
    public d sc() {
        d dVarL = d.l(this.httpMethod_);
        return dVarL == null ? d.HTTP_METHOD_UNKNOWN : dVarL;
    }

    @Override // com.google.firebase.perf.v1.r
    public int vg() {
        return this.httpResponseCode_;
    }

    @Override // com.google.firebase.perf.v1.r
    public boolean w9() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // com.google.firebase.perf.v1.r
    public boolean wb() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.firebase.perf.v1.r
    public String wd() {
        return this.responseContentType_;
    }

    @Override // com.google.firebase.perf.v1.r
    public boolean x1(String str) {
        str.getClass();
        return Zm().containsKey(str);
    }

    @Override // com.google.firebase.perf.v1.r
    public Map<String, String> z1() {
        return Collections.unmodifiableMap(Zm());
    }
}
