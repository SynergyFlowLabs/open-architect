package com.google.api;

import com.google.protobuf.g4;
import com.google.protobuf.h4;
import com.google.protobuf.j4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class b3 extends com.google.protobuf.l1<b3, b> implements c3 {
    public static final int APIS_FIELD_NUMBER = 3;
    public static final int AUTHENTICATION_FIELD_NUMBER = 11;
    public static final int BACKEND_FIELD_NUMBER = 8;
    public static final int BILLING_FIELD_NUMBER = 26;
    public static final int CONFIG_VERSION_FIELD_NUMBER = 20;
    public static final int CONTEXT_FIELD_NUMBER = 12;
    public static final int CONTROL_FIELD_NUMBER = 21;
    private static final b3 DEFAULT_INSTANCE;
    public static final int DOCUMENTATION_FIELD_NUMBER = 6;
    public static final int ENDPOINTS_FIELD_NUMBER = 18;
    public static final int ENUMS_FIELD_NUMBER = 5;
    public static final int HTTP_FIELD_NUMBER = 9;
    public static final int ID_FIELD_NUMBER = 33;
    public static final int LOGGING_FIELD_NUMBER = 27;
    public static final int LOGS_FIELD_NUMBER = 23;
    public static final int METRICS_FIELD_NUMBER = 24;
    public static final int MONITORED_RESOURCES_FIELD_NUMBER = 25;
    public static final int MONITORING_FIELD_NUMBER = 28;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.f3<b3> PARSER = null;
    public static final int PRODUCER_PROJECT_ID_FIELD_NUMBER = 22;
    public static final int QUOTA_FIELD_NUMBER = 10;
    public static final int SOURCE_INFO_FIELD_NUMBER = 37;
    public static final int SYSTEM_PARAMETERS_FIELD_NUMBER = 29;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TYPES_FIELD_NUMBER = 4;
    public static final int USAGE_FIELD_NUMBER = 15;
    private i authentication_;
    private m backend_;
    private r billing_;
    private int bitField0_;
    private j4 configVersion_;
    private a0 context_;
    private f0 control_;
    private n0 documentation_;
    private x0 http_;
    private p1 logging_;
    private g2 monitoring_;
    private r2 quota_;
    private e3 sourceInfo_;
    private m3 systemParameters_;
    private o3 usage_;
    private String name_ = "";
    private String id_ = "";
    private String title_ = "";
    private String producerProjectId_ = "";
    private com.google.protobuf.s1.k<com.google.protobuf.i> apis_ = com.google.protobuf.l1.Ij();
    private com.google.protobuf.s1.k<g4> types_ = com.google.protobuf.l1.Ij();
    private com.google.protobuf.s1.k<com.google.protobuf.o0> enums_ = com.google.protobuf.l1.Ij();
    private com.google.protobuf.s1.k<s0> endpoints_ = com.google.protobuf.l1.Ij();
    private com.google.protobuf.s1.k<m1> logs_ = com.google.protobuf.l1.Ij();
    private com.google.protobuf.s1.k<t1> metrics_ = com.google.protobuf.l1.Ij();
    private com.google.protobuf.s1.k<a2> monitoredResources_ = com.google.protobuf.l1.Ij();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f115122a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f115122a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f115122a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f115122a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f115122a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f115122a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f115122a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f115122a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1.b<b3, b> implements c3 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b Am() {
            El();
            ((b3) this.f126038b).ro();
            return this;
        }

        public b An(j4 j4Var) {
            El();
            ((b3) this.f126038b).Xp(j4Var);
            return this;
        }

        public b Bm() {
            El();
            ((b3) this.f126038b).so();
            return this;
        }

        public b Bn(a0.b bVar) {
            El();
            ((b3) this.f126038b).Yp(bVar.build());
            return this;
        }

        @Override // com.google.api.c3
        public f0 Cg() {
            return ((b3) this.f126038b).Cg();
        }

        public b Cm() {
            El();
            ((b3) this.f126038b).to();
            return this;
        }

        public b Cn(a0 a0Var) {
            El();
            ((b3) this.f126038b).Yp(a0Var);
            return this;
        }

        @Override // com.google.api.c3
        public s0 Da(int i10) {
            return ((b3) this.f126038b).Da(i10);
        }

        @Override // com.google.api.c3
        public List<a2> Dd() {
            return Collections.unmodifiableList(((b3) this.f126038b).Dd());
        }

        public b Dm() {
            El();
            ((b3) this.f126038b).uo();
            return this;
        }

        public b Dn(f0.b bVar) {
            El();
            ((b3) this.f126038b).Zp(bVar.build());
            return this;
        }

        @Override // com.google.api.c3
        public r2 E9() {
            return ((b3) this.f126038b).E9();
        }

        public b Em() {
            El();
            ((b3) this.f126038b).vo();
            return this;
        }

        public b En(f0 f0Var) {
            El();
            ((b3) this.f126038b).Zp(f0Var);
            return this;
        }

        @Override // com.google.api.c3
        public List<t1> F1() {
            return Collections.unmodifiableList(((b3) this.f126038b).F1());
        }

        @Override // com.google.api.c3
        public int F4() {
            return ((b3) this.f126038b).F4();
        }

        @Override // com.google.api.c3
        public boolean Fa() {
            return ((b3) this.f126038b).Fa();
        }

        @Override // com.google.api.c3
        public boolean Fe() {
            return ((b3) this.f126038b).Fe();
        }

        public b Fm() {
            El();
            ((b3) this.f126038b).wo();
            return this;
        }

        public b Fn(n0.b bVar) {
            El();
            ((b3) this.f126038b).aq(bVar.build());
            return this;
        }

        public b Gm() {
            El();
            ((b3) this.f126038b).xo();
            return this;
        }

        public b Gn(n0 n0Var) {
            El();
            ((b3) this.f126038b).aq(n0Var);
            return this;
        }

        public b Hm() {
            El();
            ((b3) this.f126038b).yo();
            return this;
        }

        public b Hn(int i10, s0.b bVar) {
            El();
            ((b3) this.f126038b).bq(i10, bVar.build());
            return this;
        }

        public b Im() {
            El();
            ((b3) this.f126038b).zo();
            return this;
        }

        public b In(int i10, s0 s0Var) {
            El();
            ((b3) this.f126038b).bq(i10, s0Var);
            return this;
        }

        @Override // com.google.api.c3
        public x0 Jc() {
            return ((b3) this.f126038b).Jc();
        }

        @Override // com.google.api.c3
        public boolean Je() {
            return ((b3) this.f126038b).Je();
        }

        public b Jm() {
            El();
            ((b3) this.f126038b).Ao();
            return this;
        }

        public b Jn(int i10, com.google.protobuf.o0.b bVar) {
            El();
            ((b3) this.f126038b).cq(i10, bVar.build());
            return this;
        }

        @Override // com.google.api.c3
        public boolean Kf() {
            return ((b3) this.f126038b).Kf();
        }

        public b Km() {
            El();
            ((b3) this.f126038b).Bo();
            return this;
        }

        public b Kn(int i10, com.google.protobuf.o0 o0Var) {
            El();
            ((b3) this.f126038b).cq(i10, o0Var);
            return this;
        }

        @Override // com.google.api.c3
        public g2 L8() {
            return ((b3) this.f126038b).L8();
        }

        public b Lm() {
            El();
            ((b3) this.f126038b).Co();
            return this;
        }

        public b Ln(x0.b bVar) {
            El();
            ((b3) this.f126038b).dq(bVar.build());
            return this;
        }

        @Override // com.google.api.c3
        public com.google.protobuf.u M6() {
            return ((b3) this.f126038b).M6();
        }

        @Override // com.google.api.c3
        public int M9() {
            return ((b3) this.f126038b).M9();
        }

        @Override // com.google.api.c3
        public String Mg() {
            return ((b3) this.f126038b).Mg();
        }

        public b Mm() {
            El();
            ((b3) this.f126038b).Do();
            return this;
        }

        public b Mn(x0 x0Var) {
            El();
            ((b3) this.f126038b).dq(x0Var);
            return this;
        }

        @Override // com.google.api.c3
        public t1 N1(int i10) {
            return ((b3) this.f126038b).N1(i10);
        }

        @Override // com.google.api.c3
        public m1 N3(int i10) {
            return ((b3) this.f126038b).N3(i10);
        }

        public b Nm() {
            El();
            ((b3) this.f126038b).Eo();
            return this;
        }

        public b Nn(String str) {
            El();
            ((b3) this.f126038b).eq(str);
            return this;
        }

        @Override // com.google.api.c3
        public com.google.protobuf.i Oi(int i10) {
            return ((b3) this.f126038b).Oi(i10);
        }

        public b Ol(Iterable<? extends com.google.protobuf.i> iterable) {
            El();
            ((b3) this.f126038b).Sn(iterable);
            return this;
        }

        public b Om() {
            El();
            ((b3) this.f126038b).Fo();
            return this;
        }

        public b On(com.google.protobuf.u uVar) {
            El();
            ((b3) this.f126038b).fq(uVar);
            return this;
        }

        @Override // com.google.api.c3
        public List<m1> P4() {
            return Collections.unmodifiableList(((b3) this.f126038b).P4());
        }

        public b Pl(Iterable<? extends s0> iterable) {
            El();
            ((b3) this.f126038b).Tn(iterable);
            return this;
        }

        public b Pm() {
            El();
            ((b3) this.f126038b).Go();
            return this;
        }

        public b Pn(p1.b bVar) {
            El();
            ((b3) this.f126038b).gq(bVar.build());
            return this;
        }

        @Override // com.google.api.c3
        public int Qk() {
            return ((b3) this.f126038b).Qk();
        }

        public b Ql(Iterable<? extends com.google.protobuf.o0> iterable) {
            El();
            ((b3) this.f126038b).Un(iterable);
            return this;
        }

        public b Qm() {
            El();
            ((b3) this.f126038b).Ho();
            return this;
        }

        public b Qn(p1 p1Var) {
            El();
            ((b3) this.f126038b).gq(p1Var);
            return this;
        }

        public b Rl(Iterable<? extends m1> iterable) {
            El();
            ((b3) this.f126038b).Vn(iterable);
            return this;
        }

        public b Rm() {
            El();
            ((b3) this.f126038b).Io();
            return this;
        }

        public b Rn(int i10, m1.b bVar) {
            El();
            ((b3) this.f126038b).hq(i10, bVar.build());
            return this;
        }

        @Override // com.google.api.c3
        public int Sa() {
            return ((b3) this.f126038b).Sa();
        }

        @Override // com.google.api.c3
        public boolean Sk() {
            return ((b3) this.f126038b).Sk();
        }

        public b Sl(Iterable<? extends t1> iterable) {
            El();
            ((b3) this.f126038b).Wn(iterable);
            return this;
        }

        public b Sm() {
            El();
            ((b3) this.f126038b).Jo();
            return this;
        }

        public b Sn(int i10, m1 m1Var) {
            El();
            ((b3) this.f126038b).hq(i10, m1Var);
            return this;
        }

        @Override // com.google.api.c3
        public List<g4> Te() {
            return Collections.unmodifiableList(((b3) this.f126038b).Te());
        }

        @Override // com.google.api.c3
        public p1 Ti() {
            return ((b3) this.f126038b).Ti();
        }

        public b Tl(Iterable<? extends a2> iterable) {
            El();
            ((b3) this.f126038b).Xn(iterable);
            return this;
        }

        public b Tm() {
            El();
            ((b3) this.f126038b).Ko();
            return this;
        }

        public b Tn(int i10, t1.b bVar) {
            El();
            ((b3) this.f126038b).iq(i10, bVar.build());
            return this;
        }

        @Override // com.google.api.c3
        public e3 U1() {
            return ((b3) this.f126038b).U1();
        }

        public b Ul(Iterable<? extends g4> iterable) {
            El();
            ((b3) this.f126038b).Yn(iterable);
            return this;
        }

        public b Um() {
            El();
            ((b3) this.f126038b).Lo();
            return this;
        }

        public b Un(int i10, t1 t1Var) {
            El();
            ((b3) this.f126038b).iq(i10, t1Var);
            return this;
        }

        public b Vl(int i10, com.google.protobuf.i.b bVar) {
            El();
            ((b3) this.f126038b).Zn(i10, bVar.build());
            return this;
        }

        public b Vm() {
            El();
            ((b3) this.f126038b).Mo();
            return this;
        }

        public b Vn(int i10, a2.b bVar) {
            El();
            ((b3) this.f126038b).jq(i10, bVar.build());
            return this;
        }

        public b Wl(int i10, com.google.protobuf.i iVar) {
            El();
            ((b3) this.f126038b).Zn(i10, iVar);
            return this;
        }

        public b Wm(i iVar) {
            El();
            ((b3) this.f126038b).jp(iVar);
            return this;
        }

        public b Wn(int i10, a2 a2Var) {
            El();
            ((b3) this.f126038b).jq(i10, a2Var);
            return this;
        }

        @Override // com.google.api.c3
        public n0 Xd() {
            return ((b3) this.f126038b).Xd();
        }

        public b Xl(com.google.protobuf.i.b bVar) {
            El();
            ((b3) this.f126038b).ao(bVar.build());
            return this;
        }

        public b Xm(m mVar) {
            El();
            ((b3) this.f126038b).kp(mVar);
            return this;
        }

        public b Xn(g2.b bVar) {
            El();
            ((b3) this.f126038b).kq(bVar.build());
            return this;
        }

        public b Yl(com.google.protobuf.i iVar) {
            El();
            ((b3) this.f126038b).ao(iVar);
            return this;
        }

        public b Ym(r rVar) {
            El();
            ((b3) this.f126038b).lp(rVar);
            return this;
        }

        public b Yn(g2 g2Var) {
            El();
            ((b3) this.f126038b).kq(g2Var);
            return this;
        }

        @Override // com.google.api.c3
        public o3 Z4() {
            return ((b3) this.f126038b).Z4();
        }

        public b Zl(int i10, s0.b bVar) {
            El();
            ((b3) this.f126038b).bo(i10, bVar.build());
            return this;
        }

        public b Zm(j4 j4Var) {
            El();
            ((b3) this.f126038b).mp(j4Var);
            return this;
        }

        public b Zn(String str) {
            El();
            ((b3) this.f126038b).lq(str);
            return this;
        }

        @Override // com.google.api.c3
        public com.google.protobuf.u a() {
            return ((b3) this.f126038b).a();
        }

        @Override // com.google.api.c3
        public int a1() {
            return ((b3) this.f126038b).a1();
        }

        @Override // com.google.api.c3
        public a2 af(int i10) {
            return ((b3) this.f126038b).af(i10);
        }

        public b am(int i10, s0 s0Var) {
            El();
            ((b3) this.f126038b).bo(i10, s0Var);
            return this;
        }

        public b an(a0 a0Var) {
            El();
            ((b3) this.f126038b).np(a0Var);
            return this;
        }

        public b ao(com.google.protobuf.u uVar) {
            El();
            ((b3) this.f126038b).mq(uVar);
            return this;
        }

        public b bm(s0.b bVar) {
            El();
            ((b3) this.f126038b).co(bVar.build());
            return this;
        }

        public b bn(f0 f0Var) {
            El();
            ((b3) this.f126038b).op(f0Var);
            return this;
        }

        public b bo(String str) {
            El();
            ((b3) this.f126038b).nq(str);
            return this;
        }

        @Override // com.google.api.c3
        public boolean ca() {
            return ((b3) this.f126038b).ca();
        }

        public b cm(s0 s0Var) {
            El();
            ((b3) this.f126038b).co(s0Var);
            return this;
        }

        public b cn(n0 n0Var) {
            El();
            ((b3) this.f126038b).pp(n0Var);
            return this;
        }

        public b co(com.google.protobuf.u uVar) {
            El();
            ((b3) this.f126038b).oq(uVar);
            return this;
        }

        @Override // com.google.api.c3
        public r dc() {
            return ((b3) this.f126038b).dc();
        }

        @Override // com.google.api.c3
        public g4 de(int i10) {
            return ((b3) this.f126038b).de(i10);
        }

        public b dm(int i10, com.google.protobuf.o0.b bVar) {
            El();
            ((b3) this.f126038b).eo(i10, bVar.build());
            return this;
        }

        public b dn(x0 x0Var) {
            El();
            ((b3) this.f126038b).qp(x0Var);
            return this;
        }

        public b em(int i10, com.google.protobuf.o0 o0Var) {
            El();
            ((b3) this.f126038b).eo(i10, o0Var);
            return this;
        }

        public b en(p1 p1Var) {
            El();
            ((b3) this.f126038b).rp(p1Var);
            return this;
        }

        public b eo(r2.b bVar) {
            El();
            ((b3) this.f126038b).pq(bVar.build());
            return this;
        }

        @Override // com.google.api.c3
        public boolean fd() {
            return ((b3) this.f126038b).fd();
        }

        @Override // com.google.api.c3
        public List<com.google.protobuf.i> fg() {
            return Collections.unmodifiableList(((b3) this.f126038b).fg());
        }

        public b fm(com.google.protobuf.o0.b bVar) {
            El();
            ((b3) this.f126038b).fo(bVar.build());
            return this;
        }

        public b fn(g2 g2Var) {
            El();
            ((b3) this.f126038b).sp(g2Var);
            return this;
        }

        public b fo(r2 r2Var) {
            El();
            ((b3) this.f126038b).pq(r2Var);
            return this;
        }

        @Override // com.google.api.c3
        public m getBackend() {
            return ((b3) this.f126038b).getBackend();
        }

        @Override // com.google.api.c3
        public j4 getConfigVersion() {
            return ((b3) this.f126038b).getConfigVersion();
        }

        @Override // com.google.api.c3
        public a0 getContext() {
            return ((b3) this.f126038b).getContext();
        }

        @Override // com.google.api.c3
        public String getId() {
            return ((b3) this.f126038b).getId();
        }

        @Override // com.google.api.c3
        public String getName() {
            return ((b3) this.f126038b).getName();
        }

        @Override // com.google.api.c3
        public String getTitle() {
            return ((b3) this.f126038b).getTitle();
        }

        @Override // com.google.api.c3
        public boolean gh() {
            return ((b3) this.f126038b).gh();
        }

        @Override // com.google.api.c3
        public m3 gl() {
            return ((b3) this.f126038b).gl();
        }

        public b gm(com.google.protobuf.o0 o0Var) {
            El();
            ((b3) this.f126038b).fo(o0Var);
            return this;
        }

        public b gn(r2 r2Var) {
            El();
            ((b3) this.f126038b).tp(r2Var);
            return this;
        }

        public b go(e3.b bVar) {
            El();
            ((b3) this.f126038b).qq(bVar.build());
            return this;
        }

        public b hm(int i10, m1.b bVar) {
            El();
            ((b3) this.f126038b).go(i10, bVar.build());
            return this;
        }

        public b hn(e3 e3Var) {
            El();
            ((b3) this.f126038b).up(e3Var);
            return this;
        }

        public b ho(e3 e3Var) {
            El();
            ((b3) this.f126038b).qq(e3Var);
            return this;
        }

        public b im(int i10, m1 m1Var) {
            El();
            ((b3) this.f126038b).go(i10, m1Var);
            return this;
        }

        public b in(m3 m3Var) {
            El();
            ((b3) this.f126038b).vp(m3Var);
            return this;
        }

        public b io(m3.b bVar) {
            El();
            ((b3) this.f126038b).rq(bVar.build());
            return this;
        }

        @Override // com.google.api.c3
        public com.google.protobuf.o0 j8(int i10) {
            return ((b3) this.f126038b).j8(i10);
        }

        @Override // com.google.api.c3
        public List<com.google.protobuf.o0> j9() {
            return Collections.unmodifiableList(((b3) this.f126038b).j9());
        }

        public b jm(m1.b bVar) {
            El();
            ((b3) this.f126038b).ho(bVar.build());
            return this;
        }

        public b jn(o3 o3Var) {
            El();
            ((b3) this.f126038b).wp(o3Var);
            return this;
        }

        public b jo(m3 m3Var) {
            El();
            ((b3) this.f126038b).rq(m3Var);
            return this;
        }

        @Override // com.google.api.c3
        public int k8() {
            return ((b3) this.f126038b).k8();
        }

        @Override // com.google.api.c3
        public boolean ki() {
            return ((b3) this.f126038b).ki();
        }

        public b km(m1 m1Var) {
            El();
            ((b3) this.f126038b).ho(m1Var);
            return this;
        }

        public b kn(int i10) {
            El();
            ((b3) this.f126038b).Mp(i10);
            return this;
        }

        public b ko(String str) {
            El();
            ((b3) this.f126038b).sq(str);
            return this;
        }

        public b lm(int i10, t1.b bVar) {
            El();
            ((b3) this.f126038b).io(i10, bVar.build());
            return this;
        }

        public b ln(int i10) {
            El();
            ((b3) this.f126038b).Np(i10);
            return this;
        }

        public b lo(com.google.protobuf.u uVar) {
            El();
            ((b3) this.f126038b).tq(uVar);
            return this;
        }

        public b mm(int i10, t1 t1Var) {
            El();
            ((b3) this.f126038b).io(i10, t1Var);
            return this;
        }

        public b mn(int i10) {
            El();
            ((b3) this.f126038b).Op(i10);
            return this;
        }

        public b mo(int i10, g4.b bVar) {
            El();
            ((b3) this.f126038b).uq(i10, bVar.build());
            return this;
        }

        @Override // com.google.api.c3
        public boolean nb() {
            return ((b3) this.f126038b).nb();
        }

        public b nm(t1.b bVar) {
            El();
            ((b3) this.f126038b).jo(bVar.build());
            return this;
        }

        public b nn(int i10) {
            El();
            ((b3) this.f126038b).Pp(i10);
            return this;
        }

        public b no(int i10, g4 g4Var) {
            El();
            ((b3) this.f126038b).uq(i10, g4Var);
            return this;
        }

        public b om(t1 t1Var) {
            El();
            ((b3) this.f126038b).jo(t1Var);
            return this;
        }

        public b on(int i10) {
            El();
            ((b3) this.f126038b).Qp(i10);
            return this;
        }

        public b oo(o3.b bVar) {
            El();
            ((b3) this.f126038b).vq(bVar.build());
            return this;
        }

        @Override // com.google.api.c3
        public int ph() {
            return ((b3) this.f126038b).ph();
        }

        public b pm(int i10, a2.b bVar) {
            El();
            ((b3) this.f126038b).ko(i10, bVar.build());
            return this;
        }

        public b pn(int i10) {
            El();
            ((b3) this.f126038b).Rp(i10);
            return this;
        }

        public b po(o3 o3Var) {
            El();
            ((b3) this.f126038b).vq(o3Var);
            return this;
        }

        @Override // com.google.api.c3
        public List<s0> qb() {
            return Collections.unmodifiableList(((b3) this.f126038b).qb());
        }

        @Override // com.google.api.c3
        public i qc() {
            return ((b3) this.f126038b).qc();
        }

        public b qm(int i10, a2 a2Var) {
            El();
            ((b3) this.f126038b).ko(i10, a2Var);
            return this;
        }

        public b qn(int i10) {
            El();
            ((b3) this.f126038b).Sp(i10);
            return this;
        }

        public b rm(a2.b bVar) {
            El();
            ((b3) this.f126038b).lo(bVar.build());
            return this;
        }

        public b rn(int i10, com.google.protobuf.i.b bVar) {
            El();
            ((b3) this.f126038b).Tp(i10, bVar.build());
            return this;
        }

        @Override // com.google.api.c3
        public boolean si() {
            return ((b3) this.f126038b).si();
        }

        public b sm(a2 a2Var) {
            El();
            ((b3) this.f126038b).lo(a2Var);
            return this;
        }

        public b sn(int i10, com.google.protobuf.i iVar) {
            El();
            ((b3) this.f126038b).Tp(i10, iVar);
            return this;
        }

        public b tm(int i10, g4.b bVar) {
            El();
            ((b3) this.f126038b).mo(i10, bVar.build());
            return this;
        }

        public b tn(i.b bVar) {
            El();
            ((b3) this.f126038b).Up(bVar.build());
            return this;
        }

        @Override // com.google.api.c3
        public com.google.protobuf.u uf() {
            return ((b3) this.f126038b).uf();
        }

        @Override // com.google.api.c3
        public boolean uk() {
            return ((b3) this.f126038b).uk();
        }

        public b um(int i10, g4 g4Var) {
            El();
            ((b3) this.f126038b).mo(i10, g4Var);
            return this;
        }

        public b un(i iVar) {
            El();
            ((b3) this.f126038b).Up(iVar);
            return this;
        }

        @Override // com.google.api.c3
        public com.google.protobuf.u v0() {
            return ((b3) this.f126038b).v0();
        }

        public b vm(g4.b bVar) {
            El();
            ((b3) this.f126038b).no(bVar.build());
            return this;
        }

        public b vn(m.b bVar) {
            El();
            ((b3) this.f126038b).Vp(bVar.build());
            return this;
        }

        public b wm(g4 g4Var) {
            El();
            ((b3) this.f126038b).no(g4Var);
            return this;
        }

        public b wn(m mVar) {
            El();
            ((b3) this.f126038b).Vp(mVar);
            return this;
        }

        @Override // com.google.api.c3
        public boolean xj() {
            return ((b3) this.f126038b).xj();
        }

        public b xm() {
            El();
            ((b3) this.f126038b).oo();
            return this;
        }

        public b xn(r.d dVar) {
            El();
            ((b3) this.f126038b).Wp(dVar.build());
            return this;
        }

        @Override // com.google.api.c3
        public boolean yi() {
            return ((b3) this.f126038b).yi();
        }

        public b ym() {
            El();
            ((b3) this.f126038b).po();
            return this;
        }

        public b yn(r rVar) {
            El();
            ((b3) this.f126038b).Wp(rVar);
            return this;
        }

        public b zm() {
            El();
            ((b3) this.f126038b).qo();
            return this;
        }

        public b zn(j4.b bVar) {
            El();
            ((b3) this.f126038b).Xp(bVar.build());
            return this;
        }

        private b() {
            super(b3.DEFAULT_INSTANCE);
        }
    }

    static {
        b3 b3Var = new b3();
        DEFAULT_INSTANCE = b3Var;
        com.google.protobuf.l1.Wl(b3.class, b3Var);
    }

    private b3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Ao() {
        this.logging_ = null;
        this.bitField0_ &= -1025;
    }

    public static b3 Ap(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (b3) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bo() {
        this.logs_ = com.google.protobuf.l1.Ij();
    }

    public static b3 Bp(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (b3) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Co() {
        this.metrics_ = com.google.protobuf.l1.Ij();
    }

    public static b3 Cp(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (b3) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Do() {
        this.monitoredResources_ = com.google.protobuf.l1.Ij();
    }

    public static b3 Dp(com.google.protobuf.z zVar) throws IOException {
        return (b3) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Eo() {
        this.monitoring_ = null;
        this.bitField0_ &= -2049;
    }

    public static b3 Ep(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (b3) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Fo() {
        this.name_ = Wo().getName();
    }

    public static b3 Fp(InputStream inputStream) throws IOException {
        return (b3) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Go() {
        this.producerProjectId_ = Wo().Mg();
    }

    public static b3 Gp(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (b3) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Ho() {
        this.quota_ = null;
        this.bitField0_ &= -17;
    }

    public static b3 Hp(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (b3) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Io() {
        this.sourceInfo_ = null;
        this.bitField0_ &= -8193;
    }

    public static b3 Ip(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (b3) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Jo() {
        this.systemParameters_ = null;
        this.bitField0_ &= -4097;
    }

    public static b3 Jp(byte[] bArr) throws com.google.protobuf.t1 {
        return (b3) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Ko() {
        this.title_ = Wo().getTitle();
    }

    public static b3 Kp(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (b3) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lo() {
        this.types_ = com.google.protobuf.l1.Ij();
    }

    public static com.google.protobuf.f3<b3> Lp() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Mo() {
        this.usage_ = null;
        this.bitField0_ &= -129;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Mp(int i10) {
        No();
        this.apis_.remove(i10);
    }

    private void No() {
        com.google.protobuf.s1.k<com.google.protobuf.i> kVar = this.apis_;
        if (!kVar.s1()) {
            this.apis_ = com.google.protobuf.l1.yl(kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Np(int i10) {
        Oo();
        this.endpoints_.remove(i10);
    }

    private void Oo() {
        com.google.protobuf.s1.k<s0> kVar = this.endpoints_;
        if (kVar.s1()) {
            return;
        }
        this.endpoints_ = com.google.protobuf.l1.yl(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Op(int i10) {
        Po();
        this.enums_.remove(i10);
    }

    private void Po() {
        com.google.protobuf.s1.k<com.google.protobuf.o0> kVar = this.enums_;
        if (!kVar.s1()) {
            this.enums_ = com.google.protobuf.l1.yl(kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Pp(int i10) {
        Qo();
        this.logs_.remove(i10);
    }

    private void Qo() {
        com.google.protobuf.s1.k<m1> kVar = this.logs_;
        if (kVar.s1()) {
            return;
        }
        this.logs_ = com.google.protobuf.l1.yl(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qp(int i10) {
        Ro();
        this.metrics_.remove(i10);
    }

    private void Ro() {
        com.google.protobuf.s1.k<t1> kVar = this.metrics_;
        if (kVar.s1()) {
            return;
        }
        this.metrics_ = com.google.protobuf.l1.yl(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Rp(int i10) {
        So();
        this.monitoredResources_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sn(Iterable<? extends com.google.protobuf.i> iterable) {
        No();
        com.google.protobuf.a.y(iterable, this.apis_);
    }

    private void So() {
        com.google.protobuf.s1.k<a2> kVar = this.monitoredResources_;
        if (!kVar.s1()) {
            this.monitoredResources_ = com.google.protobuf.l1.yl(kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sp(int i10) {
        To();
        this.types_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Tn(Iterable<? extends s0> iterable) {
        Oo();
        com.google.protobuf.a.y(iterable, this.endpoints_);
    }

    private void To() {
        com.google.protobuf.s1.k<g4> kVar = this.types_;
        if (kVar.s1()) {
            return;
        }
        this.types_ = com.google.protobuf.l1.yl(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Tp(int i10, com.google.protobuf.i iVar) {
        iVar.getClass();
        No();
        this.apis_.set(i10, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Un(Iterable<? extends com.google.protobuf.o0> iterable) {
        Po();
        com.google.protobuf.a.y(iterable, this.enums_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Up(i iVar) {
        iVar.getClass();
        this.authentication_ = iVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Vn(Iterable<? extends m1> iterable) {
        Qo();
        com.google.protobuf.a.y(iterable, this.logs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Vp(m mVar) {
        mVar.getClass();
        this.backend_ = mVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Wn(Iterable<? extends t1> iterable) {
        Ro();
        com.google.protobuf.a.y(iterable, this.metrics_);
    }

    public static b3 Wo() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Wp(r rVar) {
        rVar.getClass();
        this.billing_ = rVar;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Xn(Iterable<? extends a2> iterable) {
        So();
        com.google.protobuf.a.y(iterable, this.monitoredResources_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Xp(j4 j4Var) {
        j4Var.getClass();
        this.configVersion_ = j4Var;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Yn(Iterable<? extends g4> iterable) {
        To();
        com.google.protobuf.a.y(iterable, this.types_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Yp(a0 a0Var) {
        a0Var.getClass();
        this.context_ = a0Var;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Zn(int i10, com.google.protobuf.i iVar) {
        iVar.getClass();
        No();
        this.apis_.add(i10, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Zp(f0 f0Var) {
        f0Var.getClass();
        this.control_ = f0Var;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ao(com.google.protobuf.i iVar) {
        iVar.getClass();
        No();
        this.apis_.add(iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aq(n0 n0Var) {
        n0Var.getClass();
        this.documentation_ = n0Var;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bo(int i10, s0 s0Var) {
        s0Var.getClass();
        Oo();
        this.endpoints_.add(i10, s0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bq(int i10, s0 s0Var) {
        s0Var.getClass();
        Oo();
        this.endpoints_.set(i10, s0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void co(s0 s0Var) {
        s0Var.getClass();
        Oo();
        this.endpoints_.add(s0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cq(int i10, com.google.protobuf.o0 o0Var) {
        o0Var.getClass();
        Po();
        this.enums_.set(i10, o0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dq(x0 x0Var) {
        x0Var.getClass();
        this.http_ = x0Var;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void eo(int i10, com.google.protobuf.o0 o0Var) {
        o0Var.getClass();
        Po();
        this.enums_.add(i10, o0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void eq(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fo(com.google.protobuf.o0 o0Var) {
        o0Var.getClass();
        Po();
        this.enums_.add(o0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fq(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.id_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void go(int i10, m1 m1Var) {
        m1Var.getClass();
        Qo();
        this.logs_.add(i10, m1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gq(p1 p1Var) {
        p1Var.getClass();
        this.logging_ = p1Var;
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ho(m1 m1Var) {
        m1Var.getClass();
        Qo();
        this.logs_.add(m1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hq(int i10, m1 m1Var) {
        m1Var.getClass();
        Qo();
        this.logs_.set(i10, m1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void io(int i10, t1 t1Var) {
        t1Var.getClass();
        Ro();
        this.metrics_.add(i10, t1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void iq(int i10, t1 t1Var) {
        t1Var.getClass();
        Ro();
        this.metrics_.set(i10, t1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jo(t1 t1Var) {
        t1Var.getClass();
        Ro();
        this.metrics_.add(t1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jp(i iVar) {
        iVar.getClass();
        i iVar2 = this.authentication_;
        if (iVar2 == null || iVar2 == i.wm()) {
            this.authentication_ = iVar;
        } else {
            this.authentication_ = i.Cm(this.authentication_).Jl(iVar).B1();
        }
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jq(int i10, a2 a2Var) {
        a2Var.getClass();
        So();
        this.monitoredResources_.set(i10, a2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ko(int i10, a2 a2Var) {
        a2Var.getClass();
        So();
        this.monitoredResources_.add(i10, a2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kp(m mVar) {
        mVar.getClass();
        m mVar2 = this.backend_;
        if (mVar2 == null || mVar2 == m.lm()) {
            this.backend_ = mVar;
        } else {
            this.backend_ = m.pm(this.backend_).Jl(mVar).B1();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kq(g2 g2Var) {
        g2Var.getClass();
        this.monitoring_ = g2Var;
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lo(a2 a2Var) {
        a2Var.getClass();
        So();
        this.monitoredResources_.add(a2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lp(r rVar) {
        rVar.getClass();
        r rVar2 = this.billing_;
        if (rVar2 == null || rVar2 == r.nm()) {
            this.billing_ = rVar;
        } else {
            this.billing_ = r.pm(this.billing_).Jl(rVar).B1();
        }
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lq(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mo(int i10, g4 g4Var) {
        g4Var.getClass();
        To();
        this.types_.add(i10, g4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mp(j4 j4Var) {
        j4Var.getClass();
        j4 j4Var2 = this.configVersion_;
        if (j4Var2 == null || j4Var2 == j4.dm()) {
            this.configVersion_ = j4Var;
        } else {
            this.configVersion_ = j4.fm(this.configVersion_).Jl(j4Var).B1();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mq(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.name_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void no(g4 g4Var) {
        g4Var.getClass();
        To();
        this.types_.add(g4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void np(a0 a0Var) {
        a0Var.getClass();
        a0 a0Var2 = this.context_;
        if (a0Var2 == null || a0Var2 == a0.lm()) {
            this.context_ = a0Var;
        } else {
            this.context_ = a0.pm(this.context_).Jl(a0Var).B1();
        }
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nq(String str) {
        str.getClass();
        this.producerProjectId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oo() {
        this.apis_ = com.google.protobuf.l1.Ij();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void op(f0 f0Var) {
        f0Var.getClass();
        f0 f0Var2 = this.control_;
        if (f0Var2 == null || f0Var2 == f0.em()) {
            this.control_ = f0Var;
        } else {
            this.control_ = f0.gm(this.control_).Jl(f0Var).B1();
        }
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oq(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.producerProjectId_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void po() {
        this.authentication_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pp(n0 n0Var) {
        n0Var.getClass();
        n0 n0Var2 = this.documentation_;
        if (n0Var2 == null || n0Var2 == n0.Im()) {
            this.documentation_ = n0Var;
        } else {
            this.documentation_ = n0.Om(this.documentation_).Jl(n0Var).B1();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pq(r2 r2Var) {
        r2Var.getClass();
        this.quota_ = r2Var;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qo() {
        this.backend_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qp(x0 x0Var) {
        x0Var.getClass();
        x0 x0Var2 = this.http_;
        if (x0Var2 == null || x0Var2 == x0.om()) {
            this.http_ = x0Var;
        } else {
            this.http_ = x0.sm(this.http_).Jl(x0Var).B1();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qq(e3 e3Var) {
        e3Var.getClass();
        this.sourceInfo_ = e3Var;
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ro() {
        this.billing_ = null;
        this.bitField0_ &= -513;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rp(p1 p1Var) {
        p1Var.getClass();
        p1 p1Var2 = this.logging_;
        if (p1Var2 == null || p1Var2 == p1.ym()) {
            this.logging_ = p1Var;
        } else {
            this.logging_ = p1.Cm(this.logging_).Jl(p1Var).B1();
        }
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rq(m3 m3Var) {
        m3Var.getClass();
        this.systemParameters_ = m3Var;
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void so() {
        this.configVersion_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sp(g2 g2Var) {
        g2Var.getClass();
        g2 g2Var2 = this.monitoring_;
        if (g2Var2 == null || g2Var2 == g2.ym()) {
            this.monitoring_ = g2Var;
        } else {
            this.monitoring_ = g2.Cm(this.monitoring_).Jl(g2Var).B1();
        }
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sq(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void to() {
        this.context_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tp(r2 r2Var) {
        r2Var.getClass();
        r2 r2Var2 = this.quota_;
        if (r2Var2 == null || r2Var2 == r2.wm()) {
            this.quota_ = r2Var;
        } else {
            this.quota_ = r2.Cm(this.quota_).Jl(r2Var).B1();
        }
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tq(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.title_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uo() {
        this.control_ = null;
        this.bitField0_ &= -257;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void up(e3 e3Var) {
        e3Var.getClass();
        e3 e3Var2 = this.sourceInfo_;
        if (e3Var2 == null || e3Var2 == e3.lm()) {
            this.sourceInfo_ = e3Var;
        } else {
            this.sourceInfo_ = e3.pm(this.sourceInfo_).Jl(e3Var).B1();
        }
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uq(int i10, g4 g4Var) {
        g4Var.getClass();
        To();
        this.types_.set(i10, g4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vo() {
        this.documentation_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vp(m3 m3Var) {
        m3Var.getClass();
        m3 m3Var2 = this.systemParameters_;
        if (m3Var2 == null || m3Var2 == m3.lm()) {
            this.systemParameters_ = m3Var;
        } else {
            this.systemParameters_ = m3.pm(this.systemParameters_).Jl(m3Var).B1();
        }
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vq(o3 o3Var) {
        o3Var.getClass();
        this.usage_ = o3Var;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wo() {
        this.endpoints_ = com.google.protobuf.l1.Ij();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wp(o3 o3Var) {
        o3Var.getClass();
        o3 o3Var2 = this.usage_;
        if (o3Var2 == null || o3Var2 == o3.zm()) {
            this.usage_ = o3Var;
        } else {
            this.usage_ = o3.Dm(this.usage_).Jl(o3Var).B1();
        }
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xo() {
        this.enums_ = com.google.protobuf.l1.Ij();
    }

    public static b xp() {
        return DEFAULT_INSTANCE.jf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yo() {
        this.http_ = null;
        this.bitField0_ &= -9;
    }

    public static b yp(b3 b3Var) {
        return DEFAULT_INSTANCE.Uf(b3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zo() {
        this.id_ = Wo().getId();
    }

    public static b3 zp(InputStream inputStream) throws IOException {
        return (b3) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    @Override // com.google.api.c3
    public f0 Cg() {
        f0 f0Var = this.control_;
        return f0Var == null ? f0.em() : f0Var;
    }

    @Override // com.google.api.c3
    public s0 Da(int i10) {
        return this.endpoints_.get(i10);
    }

    @Override // com.google.api.c3
    public List<a2> Dd() {
        return this.monitoredResources_;
    }

    @Override // com.google.api.c3
    public r2 E9() {
        r2 r2VarWm = this.quota_;
        if (r2VarWm == null) {
            r2VarWm = r2.wm();
        }
        return r2VarWm;
    }

    @Override // com.google.api.c3
    public List<t1> F1() {
        return this.metrics_;
    }

    @Override // com.google.api.c3
    public int F4() {
        return this.logs_.size();
    }

    @Override // com.google.api.c3
    public boolean Fa() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // com.google.api.c3
    public boolean Fe() {
        return (this.bitField0_ & 4096) != 0;
    }

    @Override // com.google.api.c3
    public x0 Jc() {
        x0 x0Var = this.http_;
        return x0Var == null ? x0.om() : x0Var;
    }

    @Override // com.google.api.c3
    public boolean Je() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // com.google.api.c3
    public boolean Kf() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.api.c3
    public g2 L8() {
        g2 g2Var = this.monitoring_;
        return g2Var == null ? g2.ym() : g2Var;
    }

    @Override // com.google.api.c3
    public com.google.protobuf.u M6() {
        return com.google.protobuf.u.C(this.title_);
    }

    @Override // com.google.api.c3
    public int M9() {
        return this.apis_.size();
    }

    @Override // com.google.api.c3
    public String Mg() {
        return this.producerProjectId_;
    }

    @Override // com.google.api.c3
    public t1 N1(int i10) {
        return this.metrics_.get(i10);
    }

    @Override // com.google.api.c3
    public m1 N3(int i10) {
        return this.logs_.get(i10);
    }

    @Override // com.google.api.c3
    public com.google.protobuf.i Oi(int i10) {
        return this.apis_.get(i10);
    }

    @Override // com.google.api.c3
    public List<m1> P4() {
        return this.logs_;
    }

    @Override // com.google.api.c3
    public int Qk() {
        return this.types_.size();
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        a aVar = null;
        switch (a.f115122a[iVar.ordinal()]) {
            case 1:
                return new b3();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0019\u0000\u0001\u0001%\u0019\u0000\u0007\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\u001b\u0005\u001b\u0006ဉ\u0001\bဉ\u0002\tဉ\u0003\nဉ\u0004\u000bဉ\u0005\fဉ\u0006\u000fဉ\u0007\u0012\u001b\u0014ဉ\u0000\u0015ဉ\b\u0016Ȉ\u0017\u001b\u0018\u001b\u0019\u001b\u001aဉ\t\u001bဉ\n\u001cဉ\u000b\u001dဉ\f!Ȉ%ဉ\r", new Object[]{"bitField0_", "name_", "title_", "apis_", com.google.protobuf.i.class, "types_", g4.class, "enums_", com.google.protobuf.o0.class, "documentation_", "backend_", "http_", "quota_", "authentication_", "context_", "usage_", "endpoints_", s0.class, "configVersion_", "control_", "producerProjectId_", "logs_", m1.class, "metrics_", t1.class, "monitoredResources_", a2.class, "billing_", "logging_", "monitoring_", "systemParameters_", "id_", "sourceInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f3<b3> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (b3.class) {
                    try {
                        cVar = PARSER;
                        if (cVar == null) {
                            cVar = new com.google.protobuf.l1.c(DEFAULT_INSTANCE);
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

    @Override // com.google.api.c3
    public int Sa() {
        return this.endpoints_.size();
    }

    @Override // com.google.api.c3
    public boolean Sk() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // com.google.api.c3
    public List<g4> Te() {
        return this.types_;
    }

    @Override // com.google.api.c3
    public p1 Ti() {
        p1 p1VarYm = this.logging_;
        if (p1VarYm == null) {
            p1VarYm = p1.ym();
        }
        return p1VarYm;
    }

    @Override // com.google.api.c3
    public e3 U1() {
        e3 e3Var = this.sourceInfo_;
        return e3Var == null ? e3.lm() : e3Var;
    }

    public com.google.protobuf.j Uo(int i10) {
        return this.apis_.get(i10);
    }

    public List<? extends com.google.protobuf.j> Vo() {
        return this.apis_;
    }

    @Override // com.google.api.c3
    public n0 Xd() {
        n0 n0Var = this.documentation_;
        return n0Var == null ? n0.Im() : n0Var;
    }

    public t0 Xo(int i10) {
        return this.endpoints_.get(i10);
    }

    public List<? extends t0> Yo() {
        return this.endpoints_;
    }

    @Override // com.google.api.c3
    public o3 Z4() {
        o3 o3Var = this.usage_;
        return o3Var == null ? o3.zm() : o3Var;
    }

    public com.google.protobuf.p0 Zo(int i10) {
        return this.enums_.get(i10);
    }

    @Override // com.google.api.c3
    public com.google.protobuf.u a() {
        return com.google.protobuf.u.C(this.name_);
    }

    @Override // com.google.api.c3
    public int a1() {
        return this.metrics_.size();
    }

    @Override // com.google.api.c3
    public a2 af(int i10) {
        return this.monitoredResources_.get(i10);
    }

    public List<? extends com.google.protobuf.p0> ap() {
        return this.enums_;
    }

    public n1 bp(int i10) {
        return this.logs_.get(i10);
    }

    @Override // com.google.api.c3
    public boolean ca() {
        return (this.bitField0_ & 128) != 0;
    }

    public List<? extends n1> cp() {
        return this.logs_;
    }

    @Override // com.google.api.c3
    public r dc() {
        r rVar = this.billing_;
        return rVar == null ? r.nm() : rVar;
    }

    @Override // com.google.api.c3
    public g4 de(int i10) {
        return this.types_.get(i10);
    }

    public u1 dp(int i10) {
        return this.metrics_.get(i10);
    }

    public List<? extends u1> ep() {
        return this.metrics_;
    }

    @Override // com.google.api.c3
    public boolean fd() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.api.c3
    public List<com.google.protobuf.i> fg() {
        return this.apis_;
    }

    public b2 fp(int i10) {
        return this.monitoredResources_.get(i10);
    }

    @Override // com.google.api.c3
    public m getBackend() {
        m mVarLm = this.backend_;
        if (mVarLm == null) {
            mVarLm = m.lm();
        }
        return mVarLm;
    }

    @Override // com.google.api.c3
    public j4 getConfigVersion() {
        j4 j4VarDm = this.configVersion_;
        if (j4VarDm == null) {
            j4VarDm = j4.dm();
        }
        return j4VarDm;
    }

    @Override // com.google.api.c3
    public a0 getContext() {
        a0 a0Var = this.context_;
        return a0Var == null ? a0.lm() : a0Var;
    }

    @Override // com.google.api.c3
    public String getId() {
        return this.id_;
    }

    @Override // com.google.api.c3
    public String getName() {
        return this.name_;
    }

    @Override // com.google.api.c3
    public String getTitle() {
        return this.title_;
    }

    @Override // com.google.api.c3
    public boolean gh() {
        return (this.bitField0_ & 8192) != 0;
    }

    @Override // com.google.api.c3
    public m3 gl() {
        m3 m3VarLm = this.systemParameters_;
        if (m3VarLm == null) {
            m3VarLm = m3.lm();
        }
        return m3VarLm;
    }

    public List<? extends b2> gp() {
        return this.monitoredResources_;
    }

    public h4 hp(int i10) {
        return this.types_.get(i10);
    }

    public List<? extends h4> ip() {
        return this.types_;
    }

    @Override // com.google.api.c3
    public com.google.protobuf.o0 j8(int i10) {
        return this.enums_.get(i10);
    }

    @Override // com.google.api.c3
    public List<com.google.protobuf.o0> j9() {
        return this.enums_;
    }

    @Override // com.google.api.c3
    public int k8() {
        return this.monitoredResources_.size();
    }

    @Override // com.google.api.c3
    public boolean ki() {
        return (this.bitField0_ & 2048) != 0;
    }

    @Override // com.google.api.c3
    public boolean nb() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.api.c3
    public int ph() {
        return this.enums_.size();
    }

    @Override // com.google.api.c3
    public List<s0> qb() {
        return this.endpoints_;
    }

    @Override // com.google.api.c3
    public i qc() {
        i iVarWm = this.authentication_;
        if (iVarWm == null) {
            iVarWm = i.wm();
        }
        return iVarWm;
    }

    @Override // com.google.api.c3
    public boolean si() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.api.c3
    public com.google.protobuf.u uf() {
        return com.google.protobuf.u.C(this.producerProjectId_);
    }

    @Override // com.google.api.c3
    public boolean uk() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.google.api.c3
    public com.google.protobuf.u v0() {
        return com.google.protobuf.u.C(this.id_);
    }

    @Override // com.google.api.c3
    public boolean xj() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.api.c3
    public boolean yi() {
        return (this.bitField0_ & 2) != 0;
    }
}
