package com.google.cloud.audit;

import com.google.protobuf.f3;
import com.google.protobuf.l1;
import com.google.protobuf.s1;
import com.google.protobuf.t1;
import com.google.protobuf.u;
import com.google.protobuf.v0;
import com.google.protobuf.x3;
import com.google.protobuf.z;
import com.google.rpc.x;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends l1<a, b> implements com.google.cloud.audit.b {
    public static final int AUTHENTICATION_INFO_FIELD_NUMBER = 3;
    public static final int AUTHORIZATION_INFO_FIELD_NUMBER = 9;
    private static final a DEFAULT_INSTANCE;
    public static final int METHOD_NAME_FIELD_NUMBER = 8;
    public static final int NUM_RESPONSE_ITEMS_FIELD_NUMBER = 12;
    private static volatile f3<a> PARSER = null;
    public static final int REQUEST_FIELD_NUMBER = 16;
    public static final int REQUEST_METADATA_FIELD_NUMBER = 4;
    public static final int RESOURCE_NAME_FIELD_NUMBER = 11;
    public static final int RESPONSE_FIELD_NUMBER = 17;
    public static final int SERVICE_DATA_FIELD_NUMBER = 15;
    public static final int SERVICE_NAME_FIELD_NUMBER = 7;
    public static final int STATUS_FIELD_NUMBER = 2;
    private d authenticationInfo_;
    private int bitField0_;
    private long numResponseItems_;
    private h requestMetadata_;
    private x3 request_;
    private x3 response_;
    private com.google.protobuf.f serviceData_;
    private x status_;
    private String serviceName_ = "";
    private String methodName_ = "";
    private String resourceName_ = "";
    private s1.k<f> authorizationInfo_ = l1.Ij();

    /* JADX INFO: renamed from: com.google.cloud.audit.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C1041a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116418a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f116418a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116418a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116418a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116418a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116418a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116418a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116418a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<a, b> implements com.google.cloud.audit.b {
        /* synthetic */ b(C1041a c1041a) {
            this();
        }

        public b Am(com.google.protobuf.f.b bVar) {
            El();
            ((a) this.f126038b).Hn(bVar.build());
            return this;
        }

        public b Bm(com.google.protobuf.f fVar) {
            El();
            ((a) this.f126038b).Hn(fVar);
            return this;
        }

        @Override // com.google.cloud.audit.b
        public boolean C3() {
            return ((a) this.f126038b).C3();
        }

        public b Cm(String str) {
            El();
            ((a) this.f126038b).In(str);
            return this;
        }

        @Override // com.google.cloud.audit.b
        public u De() {
            return ((a) this.f126038b).De();
        }

        public b Dm(u uVar) {
            El();
            ((a) this.f126038b).Jn(uVar);
            return this;
        }

        @Override // com.google.cloud.audit.b
        public u E4() {
            return ((a) this.f126038b).E4();
        }

        @Override // com.google.cloud.audit.b
        public f E8(int i10) {
            return ((a) this.f126038b).E8(i10);
        }

        public b Em(x.b bVar) {
            El();
            ((a) this.f126038b).Kn(bVar.build());
            return this;
        }

        public b Fm(x xVar) {
            El();
            ((a) this.f126038b).Kn(xVar);
            return this;
        }

        @Override // com.google.cloud.audit.b
        public x3 N() {
            return ((a) this.f126038b).N();
        }

        public b Ol(Iterable<? extends f> iterable) {
            El();
            ((a) this.f126038b).Jm(iterable);
            return this;
        }

        @Override // com.google.cloud.audit.b
        public u Pg() {
            return ((a) this.f126038b).Pg();
        }

        @Override // com.google.cloud.audit.b
        public boolean Pi() {
            return ((a) this.f126038b).Pi();
        }

        public b Pl(int i10, f.b bVar) {
            El();
            ((a) this.f126038b).Km(i10, bVar.build());
            return this;
        }

        @Override // com.google.cloud.audit.b
        public com.google.protobuf.f Q9() {
            return ((a) this.f126038b).Q9();
        }

        public b Ql(int i10, f fVar) {
            El();
            ((a) this.f126038b).Km(i10, fVar);
            return this;
        }

        public b Rl(f.b bVar) {
            El();
            ((a) this.f126038b).Lm(bVar.build());
            return this;
        }

        @Override // com.google.cloud.audit.b
        public String Sd() {
            return ((a) this.f126038b).Sd();
        }

        public b Sl(f fVar) {
            El();
            ((a) this.f126038b).Lm(fVar);
            return this;
        }

        public b Tl() {
            El();
            ((a) this.f126038b).Mm();
            return this;
        }

        public b Ul() {
            El();
            ((a) this.f126038b).Nm();
            return this;
        }

        @Override // com.google.cloud.audit.b
        public boolean Ve() {
            return ((a) this.f126038b).Ve();
        }

        public b Vl() {
            El();
            ((a) this.f126038b).Om();
            return this;
        }

        public b Wl() {
            El();
            ((a) this.f126038b).Pm();
            return this;
        }

        public b Xl() {
            El();
            ((a) this.f126038b).Qm();
            return this;
        }

        public b Yl() {
            El();
            ((a) this.f126038b).Rm();
            return this;
        }

        public b Zl() {
            El();
            ((a) this.f126038b).Sm();
            return this;
        }

        public b am() {
            El();
            ((a) this.f126038b).Tm();
            return this;
        }

        public b bm() {
            El();
            ((a) this.f126038b).Um();
            return this;
        }

        @Override // com.google.cloud.audit.b
        public int cl() {
            return ((a) this.f126038b).cl();
        }

        public b cm() {
            El();
            ((a) this.f126038b).Vm();
            return this;
        }

        @Override // com.google.cloud.audit.b
        public String d5() {
            return ((a) this.f126038b).d5();
        }

        public b dm() {
            El();
            ((a) this.f126038b).Wm();
            return this;
        }

        public b em(d dVar) {
            El();
            ((a) this.f126038b).bn(dVar);
            return this;
        }

        public b fm(x3 x3Var) {
            El();
            ((a) this.f126038b).cn(x3Var);
            return this;
        }

        @Override // com.google.cloud.audit.b
        public List<f> gb() {
            return Collections.unmodifiableList(((a) this.f126038b).gb());
        }

        @Override // com.google.cloud.audit.b
        public x3 getRequest() {
            return ((a) this.f126038b).getRequest();
        }

        public b gm(h hVar) {
            El();
            ((a) this.f126038b).dn(hVar);
            return this;
        }

        public b hm(x3 x3Var) {
            El();
            ((a) this.f126038b).en(x3Var);
            return this;
        }

        public b im(com.google.protobuf.f fVar) {
            El();
            ((a) this.f126038b).fn(fVar);
            return this;
        }

        public b jm(x xVar) {
            El();
            ((a) this.f126038b).gn(xVar);
            return this;
        }

        public b km(int i10) {
            El();
            ((a) this.f126038b).wn(i10);
            return this;
        }

        @Override // com.google.cloud.audit.b
        public boolean le() {
            return ((a) this.f126038b).le();
        }

        public b lm(d.b bVar) {
            El();
            ((a) this.f126038b).xn(bVar.build());
            return this;
        }

        @Override // com.google.cloud.audit.b
        public long m8() {
            return ((a) this.f126038b).m8();
        }

        public b mm(d dVar) {
            El();
            ((a) this.f126038b).xn(dVar);
            return this;
        }

        @Override // com.google.cloud.audit.b
        public boolean n1() {
            return ((a) this.f126038b).n1();
        }

        @Override // com.google.cloud.audit.b
        public h ni() {
            return ((a) this.f126038b).ni();
        }

        public b nm(int i10, f.b bVar) {
            El();
            ((a) this.f126038b).yn(i10, bVar.build());
            return this;
        }

        public b om(int i10, f fVar) {
            El();
            ((a) this.f126038b).yn(i10, fVar);
            return this;
        }

        @Override // com.google.cloud.audit.b
        public String p2() {
            return ((a) this.f126038b).p2();
        }

        public b pm(String str) {
            El();
            ((a) this.f126038b).zn(str);
            return this;
        }

        @Override // com.google.cloud.audit.b
        public d qh() {
            return ((a) this.f126038b).qh();
        }

        public b qm(u uVar) {
            El();
            ((a) this.f126038b).An(uVar);
            return this;
        }

        public b rm(long j10) {
            El();
            ((a) this.f126038b).Bn(j10);
            return this;
        }

        public b sm(x3.b bVar) {
            El();
            ((a) this.f126038b).Cn(bVar.build());
            return this;
        }

        @Override // com.google.cloud.audit.b
        public x t() {
            return ((a) this.f126038b).t();
        }

        @Override // com.google.cloud.audit.b
        public boolean t8() {
            return ((a) this.f126038b).t8();
        }

        public b tm(x3 x3Var) {
            El();
            ((a) this.f126038b).Cn(x3Var);
            return this;
        }

        public b um(h.b bVar) {
            El();
            ((a) this.f126038b).Dn(bVar.build());
            return this;
        }

        public b vm(h hVar) {
            El();
            ((a) this.f126038b).Dn(hVar);
            return this;
        }

        public b wm(String str) {
            El();
            ((a) this.f126038b).En(str);
            return this;
        }

        public b xm(u uVar) {
            El();
            ((a) this.f126038b).Fn(uVar);
            return this;
        }

        public b ym(x3.b bVar) {
            El();
            ((a) this.f126038b).Gn(bVar.build());
            return this;
        }

        public b zm(x3 x3Var) {
            El();
            ((a) this.f126038b).Gn(x3Var);
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
        this.methodName_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bn(long j10) {
        this.numResponseItems_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Cn(x3 x3Var) {
        x3Var.getClass();
        this.request_ = x3Var;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dn(h hVar) {
        hVar.getClass();
        this.requestMetadata_ = hVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void En(String str) {
        str.getClass();
        this.resourceName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Fn(u uVar) {
        com.google.protobuf.a.R(uVar);
        this.resourceName_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Gn(x3 x3Var) {
        x3Var.getClass();
        this.response_ = x3Var;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Hn(com.google.protobuf.f fVar) {
        fVar.getClass();
        this.serviceData_ = fVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void In(String str) {
        str.getClass();
        this.serviceName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Jm(Iterable<? extends f> iterable) {
        Xm();
        com.google.protobuf.a.y(iterable, this.authorizationInfo_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Jn(u uVar) {
        com.google.protobuf.a.R(uVar);
        this.serviceName_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Km(int i10, f fVar) {
        fVar.getClass();
        Xm();
        this.authorizationInfo_.add(i10, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Kn(x xVar) {
        xVar.getClass();
        this.status_ = xVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lm(f fVar) {
        fVar.getClass();
        Xm();
        this.authorizationInfo_.add(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Mm() {
        this.authenticationInfo_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Nm() {
        this.authorizationInfo_ = l1.Ij();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Om() {
        this.methodName_ = an().Sd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Pm() {
        this.numResponseItems_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qm() {
        this.request_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Rm() {
        this.requestMetadata_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sm() {
        this.resourceName_ = an().p2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Tm() {
        this.response_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Um() {
        this.serviceData_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Vm() {
        this.serviceName_ = an().d5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Wm() {
        this.status_ = null;
        this.bitField0_ &= -2;
    }

    private void Xm() {
        s1.k<f> kVar = this.authorizationInfo_;
        if (kVar.s1()) {
            return;
        }
        this.authorizationInfo_ = l1.yl(kVar);
    }

    public static a an() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bn(d dVar) {
        dVar.getClass();
        d dVar2 = this.authenticationInfo_;
        if (dVar2 == null || dVar2 == d.em()) {
            this.authenticationInfo_ = dVar;
        } else {
            this.authenticationInfo_ = d.gm(this.authenticationInfo_).Jl(dVar).B1();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cn(x3 x3Var) {
        x3Var.getClass();
        x3 x3Var2 = this.request_;
        if (x3Var2 == null || x3Var2 == x3.bm()) {
            this.request_ = x3Var;
        } else {
            this.request_ = x3.gm(this.request_).Jl(x3Var).B1();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dn(h hVar) {
        hVar.getClass();
        h hVar2 = this.requestMetadata_;
        if (hVar2 == null || hVar2 == h.im()) {
            this.requestMetadata_ = hVar;
        } else {
            this.requestMetadata_ = h.km(this.requestMetadata_).Jl(hVar).B1();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void en(x3 x3Var) {
        x3Var.getClass();
        x3 x3Var2 = this.response_;
        if (x3Var2 == null || x3Var2 == x3.bm()) {
            this.response_ = x3Var;
        } else {
            this.response_ = x3.gm(this.response_).Jl(x3Var).B1();
        }
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fn(com.google.protobuf.f fVar) {
        fVar.getClass();
        com.google.protobuf.f fVar2 = this.serviceData_;
        if (fVar2 == null || fVar2 == com.google.protobuf.f.hm()) {
            this.serviceData_ = fVar;
        } else {
            this.serviceData_ = com.google.protobuf.f.jm(this.serviceData_).Jl(fVar).B1();
        }
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gn(x xVar) {
        xVar.getClass();
        x xVar2 = this.status_;
        if (xVar2 == null || xVar2 == x.sm()) {
            this.status_ = xVar;
        } else {
            this.status_ = x.wm(this.status_).Jl(xVar).B1();
        }
        this.bitField0_ |= 1;
    }

    public static b hn() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b in(a aVar) {
        return DEFAULT_INSTANCE.Uf(aVar);
    }

    public static a jn(InputStream inputStream) throws IOException {
        return (a) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static a kn(InputStream inputStream, v0 v0Var) throws IOException {
        return (a) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static a ln(u uVar) throws t1 {
        return (a) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static a mn(u uVar, v0 v0Var) throws t1 {
        return (a) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static a nn(z zVar) throws IOException {
        return (a) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static a on(z zVar, v0 v0Var) throws IOException {
        return (a) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static a pn(InputStream inputStream) throws IOException {
        return (a) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static a qn(InputStream inputStream, v0 v0Var) throws IOException {
        return (a) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static a rn(ByteBuffer byteBuffer) throws t1 {
        return (a) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static a sn(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (a) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static a tn(byte[] bArr) throws t1 {
        return (a) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static a un(byte[] bArr, v0 v0Var) throws t1 {
        return (a) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<a> vn() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wn(int i10) {
        Xm();
        this.authorizationInfo_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xn(d dVar) {
        dVar.getClass();
        this.authenticationInfo_ = dVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yn(int i10, f fVar) {
        fVar.getClass();
        Xm();
        this.authorizationInfo_.set(i10, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zn(String str) {
        str.getClass();
        this.methodName_ = str;
    }

    @Override // com.google.cloud.audit.b
    public boolean C3() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.cloud.audit.b
    public u De() {
        return u.C(this.serviceName_);
    }

    @Override // com.google.cloud.audit.b
    public u E4() {
        return u.C(this.resourceName_);
    }

    @Override // com.google.cloud.audit.b
    public f E8(int i10) {
        return this.authorizationInfo_.get(i10);
    }

    @Override // com.google.cloud.audit.b
    public x3 N() {
        x3 x3Var = this.response_;
        return x3Var == null ? x3.bm() : x3Var;
    }

    @Override // com.google.cloud.audit.b
    public u Pg() {
        return u.C(this.methodName_);
    }

    @Override // com.google.cloud.audit.b
    public boolean Pi() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.cloud.audit.b
    public com.google.protobuf.f Q9() {
        com.google.protobuf.f fVarHm = this.serviceData_;
        if (fVarHm == null) {
            fVarHm = com.google.protobuf.f.hm();
        }
        return fVarHm;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = C1041a.f116418a[iVar.ordinal()];
        C1041a c1041a = null;
        switch (i10) {
            case 1:
                return new a();
            case 2:
                return new b(c1041a);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0002\u0011\u000b\u0000\u0001\u0000\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0007Ȉ\bȈ\t\u001b\u000bȈ\f\u0002\u000fဉ\u0005\u0010ဉ\u0003\u0011ဉ\u0004", new Object[]{"bitField0_", "status_", "authenticationInfo_", "requestMetadata_", "serviceName_", "methodName_", "authorizationInfo_", f.class, "resourceName_", "numResponseItems_", "serviceData_", "request_", "response_"});
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

    @Override // com.google.cloud.audit.b
    public String Sd() {
        return this.methodName_;
    }

    @Override // com.google.cloud.audit.b
    public boolean Ve() {
        return (this.bitField0_ & 32) != 0;
    }

    public g Ym(int i10) {
        return this.authorizationInfo_.get(i10);
    }

    public List<? extends g> Zm() {
        return this.authorizationInfo_;
    }

    @Override // com.google.cloud.audit.b
    public int cl() {
        return this.authorizationInfo_.size();
    }

    @Override // com.google.cloud.audit.b
    public String d5() {
        return this.serviceName_;
    }

    @Override // com.google.cloud.audit.b
    public List<f> gb() {
        return this.authorizationInfo_;
    }

    @Override // com.google.cloud.audit.b
    public x3 getRequest() {
        x3 x3Var = this.request_;
        return x3Var == null ? x3.bm() : x3Var;
    }

    @Override // com.google.cloud.audit.b
    public boolean le() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.cloud.audit.b
    public long m8() {
        return this.numResponseItems_;
    }

    @Override // com.google.cloud.audit.b
    public boolean n1() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.cloud.audit.b
    public h ni() {
        h hVarIm = this.requestMetadata_;
        if (hVarIm == null) {
            hVarIm = h.im();
        }
        return hVarIm;
    }

    @Override // com.google.cloud.audit.b
    public String p2() {
        return this.resourceName_;
    }

    @Override // com.google.cloud.audit.b
    public d qh() {
        d dVarEm = this.authenticationInfo_;
        if (dVarEm == null) {
            dVarEm = d.em();
        }
        return dVarEm;
    }

    @Override // com.google.cloud.audit.b
    public x t() {
        x xVar = this.status_;
        return xVar == null ? x.sm() : xVar;
    }

    @Override // com.google.cloud.audit.b
    public boolean t8() {
        return (this.bitField0_ & 1) != 0;
    }
}
