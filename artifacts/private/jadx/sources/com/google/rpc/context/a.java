package com.google.rpc.context;

import com.google.protobuf.d4;
import com.google.protobuf.f3;
import com.google.protobuf.g2;
import com.google.protobuf.h2;
import com.google.protobuf.l1;
import com.google.protobuf.o2;
import com.google.protobuf.s1;
import com.google.protobuf.t1;
import com.google.protobuf.u;
import com.google.protobuf.v0;
import com.google.protobuf.x3;
import com.google.protobuf.x4;
import com.google.protobuf.z;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends l1<a, f> implements com.google.rpc.context.b {
    public static final int API_FIELD_NUMBER = 6;
    private static final a DEFAULT_INSTANCE;
    public static final int DESTINATION_FIELD_NUMBER = 2;
    public static final int ORIGIN_FIELD_NUMBER = 7;
    private static volatile f3<a> PARSER = null;
    public static final int REQUEST_FIELD_NUMBER = 3;
    public static final int RESOURCE_FIELD_NUMBER = 5;
    public static final int RESPONSE_FIELD_NUMBER = 4;
    public static final int SOURCE_FIELD_NUMBER = 1;
    private b api_;
    private int bitField0_;
    private g destination_;
    private g origin_;
    private i request_;
    private k resource_;
    private m response_;
    private g source_;

    /* JADX INFO: renamed from: com.google.rpc.context.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C1224a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126676a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126676a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126676a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126676a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126676a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126676a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126676a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126676a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1<b, C1225a> implements c {
        private static final b DEFAULT_INSTANCE;
        public static final int OPERATION_FIELD_NUMBER = 2;
        private static volatile f3<b> PARSER = null;
        public static final int PROTOCOL_FIELD_NUMBER = 3;
        public static final int SERVICE_FIELD_NUMBER = 1;
        public static final int VERSION_FIELD_NUMBER = 4;
        private String service_ = "";
        private String operation_ = "";
        private String protocol_ = "";
        private String version_ = "";

        /* JADX INFO: renamed from: com.google.rpc.context.a$b$a, reason: collision with other inner class name */
        public static final class C1225a extends l1.b<b, C1225a> implements c {
            /* synthetic */ C1225a(C1224a c1224a) {
                this();
            }

            @Override // com.google.rpc.context.a.c
            public String E6() {
                return ((b) this.f126038b).E6();
            }

            @Override // com.google.rpc.context.a.c
            public String F2() {
                return ((b) this.f126038b).F2();
            }

            public C1225a Ol() {
                El();
                ((b) this.f126038b).mm();
                return this;
            }

            public C1225a Pl() {
                El();
                ((b) this.f126038b).nm();
                return this;
            }

            public C1225a Ql() {
                El();
                ((b) this.f126038b).om();
                return this;
            }

            public C1225a Rl() {
                El();
                ((b) this.f126038b).pm();
                return this;
            }

            public C1225a Sl(String str) {
                El();
                ((b) this.f126038b).Gm(str);
                return this;
            }

            public C1225a Tl(u uVar) {
                El();
                ((b) this.f126038b).Hm(uVar);
                return this;
            }

            public C1225a Ul(String str) {
                El();
                ((b) this.f126038b).Im(str);
                return this;
            }

            public C1225a Vl(u uVar) {
                El();
                ((b) this.f126038b).Jm(uVar);
                return this;
            }

            public C1225a Wl(String str) {
                El();
                ((b) this.f126038b).Km(str);
                return this;
            }

            public C1225a Xl(u uVar) {
                El();
                ((b) this.f126038b).Lm(uVar);
                return this;
            }

            public C1225a Yl(String str) {
                El();
                ((b) this.f126038b).Mm(str);
                return this;
            }

            public C1225a Zl(u uVar) {
                El();
                ((b) this.f126038b).Nm(uVar);
                return this;
            }

            @Override // com.google.rpc.context.a.c
            public u b3() {
                return ((b) this.f126038b).b3();
            }

            @Override // com.google.rpc.context.a.c
            public String getProtocol() {
                return ((b) this.f126038b).getProtocol();
            }

            @Override // com.google.rpc.context.a.c
            public String getVersion() {
                return ((b) this.f126038b).getVersion();
            }

            @Override // com.google.rpc.context.a.c
            public u o0() {
                return ((b) this.f126038b).o0();
            }

            @Override // com.google.rpc.context.a.c
            public u od() {
                return ((b) this.f126038b).od();
            }

            @Override // com.google.rpc.context.a.c
            public u s0() {
                return ((b) this.f126038b).s0();
            }

            private C1225a() {
                super(b.DEFAULT_INSTANCE);
            }
        }

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            l1.Wl(b.class, bVar);
        }

        private b() {
        }

        public static b Am(InputStream inputStream, v0 v0Var) throws IOException {
            return (b) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static b Bm(ByteBuffer byteBuffer) throws t1 {
            return (b) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static b Cm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (b) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static b Dm(byte[] bArr) throws t1 {
            return (b) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static b Em(byte[] bArr, v0 v0Var) throws t1 {
            return (b) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<b> Fm() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Gm(String str) {
            str.getClass();
            this.operation_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Hm(u uVar) {
            com.google.protobuf.a.R(uVar);
            this.operation_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Im(String str) {
            str.getClass();
            this.protocol_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Jm(u uVar) {
            com.google.protobuf.a.R(uVar);
            this.protocol_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Km(String str) {
            str.getClass();
            this.service_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Lm(u uVar) {
            com.google.protobuf.a.R(uVar);
            this.service_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Mm(String str) {
            str.getClass();
            this.version_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Nm(u uVar) {
            com.google.protobuf.a.R(uVar);
            this.version_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mm() {
            this.operation_ = qm().E6();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void nm() {
            this.protocol_ = qm().getProtocol();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void om() {
            this.service_ = qm().F2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void pm() {
            this.version_ = qm().getVersion();
        }

        public static b qm() {
            return DEFAULT_INSTANCE;
        }

        public static C1225a rm() {
            return DEFAULT_INSTANCE.jf();
        }

        public static C1225a sm(b bVar) {
            return DEFAULT_INSTANCE.Uf(bVar);
        }

        public static b tm(InputStream inputStream) throws IOException {
            return (b) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static b um(InputStream inputStream, v0 v0Var) throws IOException {
            return (b) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static b vm(u uVar) throws t1 {
            return (b) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static b wm(u uVar, v0 v0Var) throws t1 {
            return (b) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static b xm(z zVar) throws IOException {
            return (b) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static b ym(z zVar, v0 v0Var) throws IOException {
            return (b) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static b zm(InputStream inputStream) throws IOException {
            return (b) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        @Override // com.google.rpc.context.a.c
        public String E6() {
            return this.operation_;
        }

        @Override // com.google.rpc.context.a.c
        public String F2() {
            return this.service_;
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            int i10 = C1224a.f126676a[iVar.ordinal()];
            C1224a c1224a = null;
            switch (i10) {
                case 1:
                    return new b();
                case 2:
                    return new C1225a(c1224a);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"service_", "operation_", "protocol_", "version_"});
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

        @Override // com.google.rpc.context.a.c
        public u b3() {
            return u.C(this.service_);
        }

        @Override // com.google.rpc.context.a.c
        public String getProtocol() {
            return this.protocol_;
        }

        @Override // com.google.rpc.context.a.c
        public String getVersion() {
            return this.version_;
        }

        @Override // com.google.rpc.context.a.c
        public u o0() {
            return u.C(this.protocol_);
        }

        @Override // com.google.rpc.context.a.c
        public u od() {
            return u.C(this.operation_);
        }

        @Override // com.google.rpc.context.a.c
        public u s0() {
            return u.C(this.version_);
        }
    }

    public interface c extends o2 {
        String E6();

        String F2();

        u b3();

        String getProtocol();

        String getVersion();

        u o0();

        u od();

        u s0();
    }

    public static final class d extends l1<d, C1226a> implements e {
        public static final int ACCESS_LEVELS_FIELD_NUMBER = 5;
        public static final int AUDIENCES_FIELD_NUMBER = 2;
        public static final int CLAIMS_FIELD_NUMBER = 4;
        private static final d DEFAULT_INSTANCE;
        private static volatile f3<d> PARSER = null;
        public static final int PRESENTER_FIELD_NUMBER = 3;
        public static final int PRINCIPAL_FIELD_NUMBER = 1;
        private int bitField0_;
        private x3 claims_;
        private String principal_ = "";
        private s1.k<String> audiences_ = l1.Ij();
        private String presenter_ = "";
        private s1.k<String> accessLevels_ = l1.Ij();

        /* JADX INFO: renamed from: com.google.rpc.context.a$d$a, reason: collision with other inner class name */
        public static final class C1226a extends l1.b<d, C1226a> implements e {
            /* synthetic */ C1226a(C1224a c1224a) {
                this();
            }

            @Override // com.google.rpc.context.a.e
            public u Bg(int i10) {
                return ((d) this.f126038b).Bg(i10);
            }

            @Override // com.google.rpc.context.a.e
            public u Jg() {
                return ((d) this.f126038b).Jg();
            }

            @Override // com.google.rpc.context.a.e
            public String Ji(int i10) {
                return ((d) this.f126038b).Ji(i10);
            }

            public C1226a Ol(String str) {
                El();
                ((d) this.f126038b).tm(str);
                return this;
            }

            @Override // com.google.rpc.context.a.e
            public String Pj(int i10) {
                return ((d) this.f126038b).Pj(i10);
            }

            public C1226a Pl(u uVar) {
                El();
                ((d) this.f126038b).um(uVar);
                return this;
            }

            public C1226a Ql(Iterable<String> iterable) {
                El();
                ((d) this.f126038b).vm(iterable);
                return this;
            }

            @Override // com.google.rpc.context.a.e
            public List<String> Rd() {
                return Collections.unmodifiableList(((d) this.f126038b).Rd());
            }

            public C1226a Rl(Iterable<String> iterable) {
                El();
                ((d) this.f126038b).wm(iterable);
                return this;
            }

            @Override // com.google.rpc.context.a.e
            public boolean Si() {
                return ((d) this.f126038b).Si();
            }

            public C1226a Sl(String str) {
                El();
                ((d) this.f126038b).xm(str);
                return this;
            }

            public C1226a Tl(u uVar) {
                El();
                ((d) this.f126038b).ym(uVar);
                return this;
            }

            public C1226a Ul() {
                El();
                ((d) this.f126038b).zm();
                return this;
            }

            @Override // com.google.rpc.context.a.e
            public int V9() {
                return ((d) this.f126038b).V9();
            }

            public C1226a Vl() {
                El();
                ((d) this.f126038b).Am();
                return this;
            }

            @Override // com.google.rpc.context.a.e
            public String W2() {
                return ((d) this.f126038b).W2();
            }

            public C1226a Wl() {
                El();
                ((d) this.f126038b).Bm();
                return this;
            }

            public C1226a Xl() {
                El();
                ((d) this.f126038b).Cm();
                return this;
            }

            public C1226a Yl() {
                El();
                ((d) this.f126038b).Dm();
                return this;
            }

            public C1226a Zl(x3 x3Var) {
                El();
                ((d) this.f126038b).Hm(x3Var);
                return this;
            }

            public C1226a am(int i10, String str) {
                El();
                ((d) this.f126038b).Xm(i10, str);
                return this;
            }

            public C1226a bm(int i10, String str) {
                El();
                ((d) this.f126038b).Ym(i10, str);
                return this;
            }

            public C1226a cm(x3.b bVar) {
                El();
                ((d) this.f126038b).Zm(bVar.build());
                return this;
            }

            public C1226a dm(x3 x3Var) {
                El();
                ((d) this.f126038b).Zm(x3Var);
                return this;
            }

            @Override // com.google.rpc.context.a.e
            public x3 ea() {
                return ((d) this.f126038b).ea();
            }

            public C1226a em(String str) {
                El();
                ((d) this.f126038b).an(str);
                return this;
            }

            public C1226a fm(u uVar) {
                El();
                ((d) this.f126038b).bn(uVar);
                return this;
            }

            public C1226a gm(String str) {
                El();
                ((d) this.f126038b).cn(str);
                return this;
            }

            @Override // com.google.rpc.context.a.e
            public int h8() {
                return ((d) this.f126038b).h8();
            }

            public C1226a hm(u uVar) {
                El();
                ((d) this.f126038b).dn(uVar);
                return this;
            }

            @Override // com.google.rpc.context.a.e
            public List<String> of() {
                return Collections.unmodifiableList(((d) this.f126038b).of());
            }

            @Override // com.google.rpc.context.a.e
            public u q3() {
                return ((d) this.f126038b).q3();
            }

            @Override // com.google.rpc.context.a.e
            public String za() {
                return ((d) this.f126038b).za();
            }

            @Override // com.google.rpc.context.a.e
            public u zk(int i10) {
                return ((d) this.f126038b).zk(i10);
            }

            private C1226a() {
                super(d.DEFAULT_INSTANCE);
            }
        }

        static {
            d dVar = new d();
            DEFAULT_INSTANCE = dVar;
            l1.Wl(d.class, dVar);
        }

        private d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Am() {
            this.audiences_ = l1.Ij();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Bm() {
            this.claims_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Cm() {
            this.presenter_ = Gm().za();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Dm() {
            this.principal_ = Gm().W2();
        }

        private void Em() {
            s1.k<String> kVar = this.accessLevels_;
            if (kVar.s1()) {
                return;
            }
            this.accessLevels_ = l1.yl(kVar);
        }

        private void Fm() {
            s1.k<String> kVar = this.audiences_;
            if (kVar.s1()) {
                return;
            }
            this.audiences_ = l1.yl(kVar);
        }

        public static d Gm() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Hm(x3 x3Var) {
            x3Var.getClass();
            x3 x3Var2 = this.claims_;
            if (x3Var2 == null || x3Var2 == x3.bm()) {
                this.claims_ = x3Var;
            } else {
                this.claims_ = x3.gm(this.claims_).Jl(x3Var).B1();
            }
            this.bitField0_ |= 1;
        }

        public static C1226a Im() {
            return DEFAULT_INSTANCE.jf();
        }

        public static C1226a Jm(d dVar) {
            return DEFAULT_INSTANCE.Uf(dVar);
        }

        public static d Km(InputStream inputStream) throws IOException {
            return (d) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static d Lm(InputStream inputStream, v0 v0Var) throws IOException {
            return (d) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static d Mm(u uVar) throws t1 {
            return (d) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static d Nm(u uVar, v0 v0Var) throws t1 {
            return (d) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static d Om(z zVar) throws IOException {
            return (d) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static d Pm(z zVar, v0 v0Var) throws IOException {
            return (d) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static d Qm(InputStream inputStream) throws IOException {
            return (d) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static d Rm(InputStream inputStream, v0 v0Var) throws IOException {
            return (d) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static d Sm(ByteBuffer byteBuffer) throws t1 {
            return (d) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static d Tm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (d) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static d Um(byte[] bArr) throws t1 {
            return (d) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static d Vm(byte[] bArr, v0 v0Var) throws t1 {
            return (d) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<d> Wm() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Xm(int i10, String str) {
            str.getClass();
            Em();
            this.accessLevels_.set(i10, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ym(int i10, String str) {
            str.getClass();
            Fm();
            this.audiences_.set(i10, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Zm(x3 x3Var) {
            x3Var.getClass();
            this.claims_ = x3Var;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void an(String str) {
            str.getClass();
            this.presenter_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void bn(u uVar) {
            com.google.protobuf.a.R(uVar);
            this.presenter_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void cn(String str) {
            str.getClass();
            this.principal_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void dn(u uVar) {
            com.google.protobuf.a.R(uVar);
            this.principal_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void tm(String str) {
            str.getClass();
            Em();
            this.accessLevels_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void um(u uVar) {
            com.google.protobuf.a.R(uVar);
            Em();
            this.accessLevels_.add(uVar.z0());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void vm(Iterable<String> iterable) {
            Em();
            com.google.protobuf.a.y(iterable, this.accessLevels_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void wm(Iterable<String> iterable) {
            Fm();
            com.google.protobuf.a.y(iterable, this.audiences_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void xm(String str) {
            str.getClass();
            Fm();
            this.audiences_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ym(u uVar) {
            com.google.protobuf.a.R(uVar);
            Fm();
            this.audiences_.add(uVar.z0());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zm() {
            this.accessLevels_ = l1.Ij();
        }

        @Override // com.google.rpc.context.a.e
        public u Bg(int i10) {
            return u.C(this.audiences_.get(i10));
        }

        @Override // com.google.rpc.context.a.e
        public u Jg() {
            return u.C(this.presenter_);
        }

        @Override // com.google.rpc.context.a.e
        public String Ji(int i10) {
            return this.accessLevels_.get(i10);
        }

        @Override // com.google.rpc.context.a.e
        public String Pj(int i10) {
            return this.audiences_.get(i10);
        }

        @Override // com.google.rpc.context.a.e
        public List<String> Rd() {
            return this.accessLevels_;
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            int i10 = C1224a.f126676a[iVar.ordinal()];
            C1224a c1224a = null;
            switch (i10) {
                case 1:
                    return new d();
                case 2:
                    return new C1226a(c1224a);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002Ț\u0003Ȉ\u0004ဉ\u0000\u0005Ț", new Object[]{"bitField0_", "principal_", "audiences_", "presenter_", "claims_", "accessLevels_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f3<d> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (d.class) {
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

        @Override // com.google.rpc.context.a.e
        public boolean Si() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.rpc.context.a.e
        public int V9() {
            return this.audiences_.size();
        }

        @Override // com.google.rpc.context.a.e
        public String W2() {
            return this.principal_;
        }

        @Override // com.google.rpc.context.a.e
        public x3 ea() {
            x3 x3Var = this.claims_;
            return x3Var == null ? x3.bm() : x3Var;
        }

        @Override // com.google.rpc.context.a.e
        public int h8() {
            return this.accessLevels_.size();
        }

        @Override // com.google.rpc.context.a.e
        public List<String> of() {
            return this.audiences_;
        }

        @Override // com.google.rpc.context.a.e
        public u q3() {
            return u.C(this.principal_);
        }

        @Override // com.google.rpc.context.a.e
        public String za() {
            return this.presenter_;
        }

        @Override // com.google.rpc.context.a.e
        public u zk(int i10) {
            return u.C(this.accessLevels_.get(i10));
        }
    }

    public interface e extends o2 {
        u Bg(int i10);

        u Jg();

        String Ji(int i10);

        String Pj(int i10);

        List<String> Rd();

        boolean Si();

        int V9();

        String W2();

        x3 ea();

        int h8();

        List<String> of();

        u q3();

        String za();

        u zk(int i10);
    }

    public static final class f extends l1.b<a, f> implements com.google.rpc.context.b {
        /* synthetic */ f(C1224a c1224a) {
            this();
        }

        @Override // com.google.rpc.context.b
        public boolean Ak() {
            return ((a) this.f126038b).Ak();
        }

        @Override // com.google.rpc.context.b
        public boolean C3() {
            return ((a) this.f126038b).C3();
        }

        @Override // com.google.rpc.context.b
        public boolean Fc() {
            return ((a) this.f126038b).Fc();
        }

        @Override // com.google.rpc.context.b
        public m N() {
            return ((a) this.f126038b).N();
        }

        public f Ol() {
            El();
            ((a) this.f126038b).vm();
            return this;
        }

        @Override // com.google.rpc.context.b
        public g P() {
            return ((a) this.f126038b).P();
        }

        public f Pl() {
            El();
            ((a) this.f126038b).wm();
            return this;
        }

        public f Ql() {
            El();
            ((a) this.f126038b).xm();
            return this;
        }

        @Override // com.google.rpc.context.b
        public k R7() {
            return ((a) this.f126038b).R7();
        }

        public f Rl() {
            El();
            ((a) this.f126038b).ym();
            return this;
        }

        public f Sl() {
            El();
            ((a) this.f126038b).zm();
            return this;
        }

        public f Tl() {
            El();
            ((a) this.f126038b).Am();
            return this;
        }

        public f Ul() {
            El();
            ((a) this.f126038b).Bm();
            return this;
        }

        public f Vl(b bVar) {
            El();
            ((a) this.f126038b).Dm(bVar);
            return this;
        }

        @Override // com.google.rpc.context.b
        public g Wd() {
            return ((a) this.f126038b).Wd();
        }

        @Override // com.google.rpc.context.b
        public boolean Wh() {
            return ((a) this.f126038b).Wh();
        }

        public f Wl(g gVar) {
            El();
            ((a) this.f126038b).Em(gVar);
            return this;
        }

        public f Xl(g gVar) {
            El();
            ((a) this.f126038b).Fm(gVar);
            return this;
        }

        public f Yl(i iVar) {
            El();
            ((a) this.f126038b).Gm(iVar);
            return this;
        }

        public f Zl(k kVar) {
            El();
            ((a) this.f126038b).Hm(kVar);
            return this;
        }

        public f am(m mVar) {
            El();
            ((a) this.f126038b).Im(mVar);
            return this;
        }

        public f bm(g gVar) {
            El();
            ((a) this.f126038b).Jm(gVar);
            return this;
        }

        public f cm(b.C1225a c1225a) {
            El();
            ((a) this.f126038b).Zm(c1225a.build());
            return this;
        }

        public f dm(b bVar) {
            El();
            ((a) this.f126038b).Zm(bVar);
            return this;
        }

        @Override // com.google.rpc.context.b
        public boolean ef() {
            return ((a) this.f126038b).ef();
        }

        public f em(g.C1227a c1227a) {
            El();
            ((a) this.f126038b).an(c1227a.build());
            return this;
        }

        public f fm(g gVar) {
            El();
            ((a) this.f126038b).an(gVar);
            return this;
        }

        @Override // com.google.rpc.context.b
        public b getApi() {
            return ((a) this.f126038b).getApi();
        }

        @Override // com.google.rpc.context.b
        public i getRequest() {
            return ((a) this.f126038b).getRequest();
        }

        public f gm(g.C1227a c1227a) {
            El();
            ((a) this.f126038b).bn(c1227a.build());
            return this;
        }

        public f hm(g gVar) {
            El();
            ((a) this.f126038b).bn(gVar);
            return this;
        }

        public f im(i.C1228a c1228a) {
            El();
            ((a) this.f126038b).cn(c1228a.build());
            return this;
        }

        @Override // com.google.rpc.context.b
        public boolean jc() {
            return ((a) this.f126038b).jc();
        }

        public f jm(i iVar) {
            El();
            ((a) this.f126038b).cn(iVar);
            return this;
        }

        public f km(k.C1229a c1229a) {
            El();
            ((a) this.f126038b).dn(c1229a.build());
            return this;
        }

        public f lm(k kVar) {
            El();
            ((a) this.f126038b).dn(kVar);
            return this;
        }

        public f mm(m.C1230a c1230a) {
            El();
            ((a) this.f126038b).en(c1230a.build());
            return this;
        }

        @Override // com.google.rpc.context.b
        public boolean n1() {
            return ((a) this.f126038b).n1();
        }

        public f nm(m mVar) {
            El();
            ((a) this.f126038b).en(mVar);
            return this;
        }

        public f om(g.C1227a c1227a) {
            El();
            ((a) this.f126038b).fn(c1227a.build());
            return this;
        }

        public f pm(g gVar) {
            El();
            ((a) this.f126038b).fn(gVar);
            return this;
        }

        @Override // com.google.rpc.context.b
        public g q1() {
            return ((a) this.f126038b).q1();
        }

        private f() {
            super(a.DEFAULT_INSTANCE);
        }
    }

    public static final class g extends l1<g, C1227a> implements h {
        private static final g DEFAULT_INSTANCE;
        public static final int IP_FIELD_NUMBER = 1;
        public static final int LABELS_FIELD_NUMBER = 6;
        private static volatile f3<g> PARSER = null;
        public static final int PORT_FIELD_NUMBER = 2;
        public static final int PRINCIPAL_FIELD_NUMBER = 7;
        public static final int REGION_CODE_FIELD_NUMBER = 8;
        private long port_;
        private h2<String, String> labels_ = h2.f();
        private String ip_ = "";
        private String principal_ = "";
        private String regionCode_ = "";

        /* JADX INFO: renamed from: com.google.rpc.context.a$g$a, reason: collision with other inner class name */
        public static final class C1227a extends l1.b<g, C1227a> implements h {
            /* synthetic */ C1227a(C1224a c1224a) {
                this();
            }

            @Override // com.google.rpc.context.a.h
            @Deprecated
            public Map<String, String> B0() {
                return x0();
            }

            @Override // com.google.rpc.context.a.h
            public u Bd() {
                return ((g) this.f126038b).Bd();
            }

            @Override // com.google.rpc.context.a.h
            public String D0(String str, String str2) {
                str.getClass();
                Map<String, String> mapX0 = ((g) this.f126038b).x0();
                return mapX0.containsKey(str) ? mapX0.get(str) : str2;
            }

            @Override // com.google.rpc.context.a.h
            public int E() {
                return ((g) this.f126038b).x0().size();
            }

            @Override // com.google.rpc.context.a.h
            public String Ma() {
                return ((g) this.f126038b).Ma();
            }

            public C1227a Ol() {
                El();
                ((g) this.f126038b).mm();
                return this;
            }

            public C1227a Pl() {
                El();
                ((g) this.f126038b).rm().clear();
                return this;
            }

            public C1227a Ql() {
                El();
                ((g) this.f126038b).nm();
                return this;
            }

            public C1227a Rl() {
                El();
                ((g) this.f126038b).om();
                return this;
            }

            public C1227a Sl() {
                El();
                ((g) this.f126038b).pm();
                return this;
            }

            public C1227a Tl(Map<String, String> map) {
                El();
                ((g) this.f126038b).rm().putAll(map);
                return this;
            }

            public C1227a Ul(String str, String str2) {
                str.getClass();
                str2.getClass();
                El();
                ((g) this.f126038b).rm().put(str, str2);
                return this;
            }

            public C1227a Vl(String str) {
                str.getClass();
                El();
                ((g) this.f126038b).rm().remove(str);
                return this;
            }

            @Override // com.google.rpc.context.a.h
            public String W2() {
                return ((g) this.f126038b).W2();
            }

            public C1227a Wl(String str) {
                El();
                ((g) this.f126038b).Jm(str);
                return this;
            }

            public C1227a Xl(u uVar) {
                El();
                ((g) this.f126038b).Km(uVar);
                return this;
            }

            @Override // com.google.rpc.context.a.h
            public u Y1() {
                return ((g) this.f126038b).Y1();
            }

            public C1227a Yl(long j10) {
                El();
                ((g) this.f126038b).Lm(j10);
                return this;
            }

            public C1227a Zl(String str) {
                El();
                ((g) this.f126038b).Mm(str);
                return this;
            }

            public C1227a am(u uVar) {
                El();
                ((g) this.f126038b).Nm(uVar);
                return this;
            }

            public C1227a bm(String str) {
                El();
                ((g) this.f126038b).Om(str);
                return this;
            }

            public C1227a cm(u uVar) {
                El();
                ((g) this.f126038b).Pm(uVar);
                return this;
            }

            @Override // com.google.rpc.context.a.h
            public long getPort() {
                return ((g) this.f126038b).getPort();
            }

            @Override // com.google.rpc.context.a.h
            public String getRegionCode() {
                return ((g) this.f126038b).getRegionCode();
            }

            @Override // com.google.rpc.context.a.h
            public String p0(String str) {
                str.getClass();
                Map<String, String> mapX0 = ((g) this.f126038b).x0();
                if (mapX0.containsKey(str)) {
                    return mapX0.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // com.google.rpc.context.a.h
            public u q3() {
                return ((g) this.f126038b).q3();
            }

            @Override // com.google.rpc.context.a.h
            public Map<String, String> x0() {
                return Collections.unmodifiableMap(((g) this.f126038b).x0());
            }

            @Override // com.google.rpc.context.a.h
            public boolean z0(String str) {
                str.getClass();
                return ((g) this.f126038b).x0().containsKey(str);
            }

            private C1227a() {
                super(g.DEFAULT_INSTANCE);
            }
        }

        private static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final g2<String, String> f126677a;

            static {
                x4.b bVar = x4.b.f126490k;
                f126677a = g2.f(bVar, "", bVar, "");
            }

            private b() {
            }
        }

        static {
            g gVar = new g();
            DEFAULT_INSTANCE = gVar;
            l1.Wl(g.class, gVar);
        }

        private g() {
        }

        public static g Am(z zVar) throws IOException {
            return (g) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static g Bm(z zVar, v0 v0Var) throws IOException {
            return (g) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static g Cm(InputStream inputStream) throws IOException {
            return (g) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static g Dm(InputStream inputStream, v0 v0Var) throws IOException {
            return (g) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static g Em(ByteBuffer byteBuffer) throws t1 {
            return (g) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static g Fm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (g) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static g Gm(byte[] bArr) throws t1 {
            return (g) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static g Hm(byte[] bArr, v0 v0Var) throws t1 {
            return (g) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<g> Im() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Jm(String str) {
            str.getClass();
            this.ip_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Km(u uVar) {
            com.google.protobuf.a.R(uVar);
            this.ip_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Lm(long j10) {
            this.port_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Mm(String str) {
            str.getClass();
            this.principal_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Nm(u uVar) {
            com.google.protobuf.a.R(uVar);
            this.principal_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Om(String str) {
            str.getClass();
            this.regionCode_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Pm(u uVar) {
            com.google.protobuf.a.R(uVar);
            this.regionCode_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mm() {
            this.ip_ = qm().Ma();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void nm() {
            this.port_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void om() {
            this.principal_ = qm().W2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void pm() {
            this.regionCode_ = qm().getRegionCode();
        }

        public static g qm() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> rm() {
            return tm();
        }

        private h2<String, String> sm() {
            return this.labels_;
        }

        private h2<String, String> tm() {
            if (!this.labels_.j()) {
                this.labels_ = this.labels_.n();
            }
            return this.labels_;
        }

        public static C1227a um() {
            return DEFAULT_INSTANCE.jf();
        }

        public static C1227a vm(g gVar) {
            return DEFAULT_INSTANCE.Uf(gVar);
        }

        public static g wm(InputStream inputStream) throws IOException {
            return (g) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static g xm(InputStream inputStream, v0 v0Var) throws IOException {
            return (g) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static g ym(u uVar) throws t1 {
            return (g) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static g zm(u uVar, v0 v0Var) throws t1 {
            return (g) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        @Override // com.google.rpc.context.a.h
        @Deprecated
        public Map<String, String> B0() {
            return x0();
        }

        @Override // com.google.rpc.context.a.h
        public u Bd() {
            return u.C(this.ip_);
        }

        @Override // com.google.rpc.context.a.h
        public String D0(String str, String str2) {
            str.getClass();
            h2<String, String> h2VarSm = sm();
            return h2VarSm.containsKey(str) ? h2VarSm.get(str) : str2;
        }

        @Override // com.google.rpc.context.a.h
        public int E() {
            return sm().size();
        }

        @Override // com.google.rpc.context.a.h
        public String Ma() {
            return this.ip_;
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            int i10 = C1224a.f126676a[iVar.ordinal()];
            C1224a c1224a = null;
            switch (i10) {
                case 1:
                    return new g();
                case 2:
                    return new C1227a(c1224a);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\b\u0005\u0001\u0000\u0000\u0001Ȉ\u0002\u0002\u00062\u0007Ȉ\bȈ", new Object[]{"ip_", "port_", "labels_", b.f126677a, "principal_", "regionCode_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f3<g> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (g.class) {
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

        @Override // com.google.rpc.context.a.h
        public String W2() {
            return this.principal_;
        }

        @Override // com.google.rpc.context.a.h
        public u Y1() {
            return u.C(this.regionCode_);
        }

        @Override // com.google.rpc.context.a.h
        public long getPort() {
            return this.port_;
        }

        @Override // com.google.rpc.context.a.h
        public String getRegionCode() {
            return this.regionCode_;
        }

        @Override // com.google.rpc.context.a.h
        public String p0(String str) {
            str.getClass();
            h2<String, String> h2VarSm = sm();
            if (h2VarSm.containsKey(str)) {
                return h2VarSm.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.google.rpc.context.a.h
        public u q3() {
            return u.C(this.principal_);
        }

        @Override // com.google.rpc.context.a.h
        public Map<String, String> x0() {
            return Collections.unmodifiableMap(sm());
        }

        @Override // com.google.rpc.context.a.h
        public boolean z0(String str) {
            str.getClass();
            return sm().containsKey(str);
        }
    }

    public interface h extends o2 {
        @Deprecated
        Map<String, String> B0();

        u Bd();

        String D0(String str, String str2);

        int E();

        String Ma();

        String W2();

        u Y1();

        long getPort();

        String getRegionCode();

        String p0(String str);

        u q3();

        Map<String, String> x0();

        boolean z0(String str);
    }

    public static final class i extends l1<i, C1228a> implements j {
        public static final int AUTH_FIELD_NUMBER = 13;
        private static final i DEFAULT_INSTANCE;
        public static final int HEADERS_FIELD_NUMBER = 3;
        public static final int HOST_FIELD_NUMBER = 5;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int METHOD_FIELD_NUMBER = 2;
        private static volatile f3<i> PARSER = null;
        public static final int PATH_FIELD_NUMBER = 4;
        public static final int PROTOCOL_FIELD_NUMBER = 11;
        public static final int QUERY_FIELD_NUMBER = 7;
        public static final int REASON_FIELD_NUMBER = 12;
        public static final int SCHEME_FIELD_NUMBER = 6;
        public static final int SIZE_FIELD_NUMBER = 10;
        public static final int TIME_FIELD_NUMBER = 9;
        private d auth_;
        private int bitField0_;
        private long size_;
        private d4 time_;
        private h2<String, String> headers_ = h2.f();
        private String id_ = "";
        private String method_ = "";
        private String path_ = "";
        private String host_ = "";
        private String scheme_ = "";
        private String query_ = "";
        private String protocol_ = "";
        private String reason_ = "";

        /* JADX INFO: renamed from: com.google.rpc.context.a$i$a, reason: collision with other inner class name */
        public static final class C1228a extends l1.b<i, C1228a> implements j {
            /* synthetic */ C1228a(C1224a c1224a) {
                this();
            }

            @Override // com.google.rpc.context.a.j
            public String A1() {
                return ((i) this.f126038b).A1();
            }

            @Override // com.google.rpc.context.a.j
            public u A7() {
                return ((i) this.f126038b).A7();
            }

            @Override // com.google.rpc.context.a.j
            public boolean Ai() {
                return ((i) this.f126038b).Ai();
            }

            @Override // com.google.rpc.context.a.j
            public String K2(String str, String str2) {
                str.getClass();
                Map<String, String> mapR7 = ((i) this.f126038b).r7();
                return mapR7.containsKey(str) ? mapR7.get(str) : str2;
            }

            @Override // com.google.rpc.context.a.j
            public boolean L4(String str) {
                str.getClass();
                return ((i) this.f126038b).r7().containsKey(str);
            }

            @Override // com.google.rpc.context.a.j
            public u Me() {
                return ((i) this.f126038b).Me();
            }

            @Override // com.google.rpc.context.a.j
            @Deprecated
            public Map<String, String> O() {
                return r7();
            }

            public C1228a Ol() {
                El();
                ((i) this.f126038b).Hm();
                return this;
            }

            @Override // com.google.rpc.context.a.j
            public String P2() {
                return ((i) this.f126038b).P2();
            }

            public C1228a Pl() {
                El();
                ((i) this.f126038b).Tm().clear();
                return this;
            }

            @Override // com.google.rpc.context.a.j
            public d Qb() {
                return ((i) this.f126038b).Qb();
            }

            public C1228a Ql() {
                El();
                ((i) this.f126038b).Im();
                return this;
            }

            public C1228a Rl() {
                El();
                ((i) this.f126038b).Jm();
                return this;
            }

            @Override // com.google.rpc.context.a.j
            public String S() {
                return ((i) this.f126038b).S();
            }

            public C1228a Sl() {
                El();
                ((i) this.f126038b).Km();
                return this;
            }

            public C1228a Tl() {
                El();
                ((i) this.f126038b).Lm();
                return this;
            }

            @Override // com.google.rpc.context.a.j
            public boolean U0() {
                return ((i) this.f126038b).U0();
            }

            public C1228a Ul() {
                El();
                ((i) this.f126038b).Mm();
                return this;
            }

            @Override // com.google.rpc.context.a.j
            public d4 V() {
                return ((i) this.f126038b).V();
            }

            public C1228a Vl() {
                El();
                ((i) this.f126038b).Nm();
                return this;
            }

            public C1228a Wl() {
                El();
                ((i) this.f126038b).Om();
                return this;
            }

            public C1228a Xl() {
                El();
                ((i) this.f126038b).Pm();
                return this;
            }

            @Override // com.google.rpc.context.a.j
            public u Y7() {
                return ((i) this.f126038b).Y7();
            }

            public C1228a Yl() {
                El();
                ((i) this.f126038b).Qm();
                return this;
            }

            public C1228a Zl() {
                El();
                ((i) this.f126038b).Rm();
                return this;
            }

            public C1228a am(d dVar) {
                El();
                ((i) this.f126038b).Wm(dVar);
                return this;
            }

            public C1228a bm(d4 d4Var) {
                El();
                ((i) this.f126038b).Xm(d4Var);
                return this;
            }

            public C1228a cm(Map<String, String> map) {
                El();
                ((i) this.f126038b).Tm().putAll(map);
                return this;
            }

            @Override // com.google.rpc.context.a.j
            public String d2() {
                return ((i) this.f126038b).d2();
            }

            public C1228a dm(String str, String str2) {
                str.getClass();
                str2.getClass();
                El();
                ((i) this.f126038b).Tm().put(str, str2);
                return this;
            }

            @Override // com.google.rpc.context.a.j
            public u eb() {
                return ((i) this.f126038b).eb();
            }

            public C1228a em(String str) {
                str.getClass();
                El();
                ((i) this.f126038b).Tm().remove(str);
                return this;
            }

            @Override // com.google.rpc.context.a.j
            public u f7() {
                return ((i) this.f126038b).f7();
            }

            public C1228a fm(d.C1226a c1226a) {
                El();
                ((i) this.f126038b).nn(c1226a.build());
                return this;
            }

            @Override // com.google.rpc.context.a.j
            public String getId() {
                return ((i) this.f126038b).getId();
            }

            @Override // com.google.rpc.context.a.j
            public String getMethod() {
                return ((i) this.f126038b).getMethod();
            }

            @Override // com.google.rpc.context.a.j
            public String getProtocol() {
                return ((i) this.f126038b).getProtocol();
            }

            @Override // com.google.rpc.context.a.j
            public long getSize() {
                return ((i) this.f126038b).getSize();
            }

            public C1228a gm(d dVar) {
                El();
                ((i) this.f126038b).nn(dVar);
                return this;
            }

            public C1228a hm(String str) {
                El();
                ((i) this.f126038b).on(str);
                return this;
            }

            public C1228a im(u uVar) {
                El();
                ((i) this.f126038b).pn(uVar);
                return this;
            }

            public C1228a jm(String str) {
                El();
                ((i) this.f126038b).qn(str);
                return this;
            }

            public C1228a km(u uVar) {
                El();
                ((i) this.f126038b).rn(uVar);
                return this;
            }

            @Override // com.google.rpc.context.a.j
            public int l3() {
                return ((i) this.f126038b).r7().size();
            }

            public C1228a lm(String str) {
                El();
                ((i) this.f126038b).sn(str);
                return this;
            }

            public C1228a mm(u uVar) {
                El();
                ((i) this.f126038b).tn(uVar);
                return this;
            }

            public C1228a nm(String str) {
                El();
                ((i) this.f126038b).un(str);
                return this;
            }

            @Override // com.google.rpc.context.a.j
            public u o0() {
                return ((i) this.f126038b).o0();
            }

            public C1228a om(u uVar) {
                El();
                ((i) this.f126038b).vn(uVar);
                return this;
            }

            public C1228a pm(String str) {
                El();
                ((i) this.f126038b).wn(str);
                return this;
            }

            public C1228a qm(u uVar) {
                El();
                ((i) this.f126038b).xn(uVar);
                return this;
            }

            @Override // com.google.rpc.context.a.j
            public Map<String, String> r7() {
                return Collections.unmodifiableMap(((i) this.f126038b).r7());
            }

            public C1228a rm(String str) {
                El();
                ((i) this.f126038b).yn(str);
                return this;
            }

            public C1228a sm(u uVar) {
                El();
                ((i) this.f126038b).zn(uVar);
                return this;
            }

            public C1228a tm(String str) {
                El();
                ((i) this.f126038b).An(str);
                return this;
            }

            @Override // com.google.rpc.context.a.j
            public String u0() {
                return ((i) this.f126038b).u0();
            }

            public C1228a um(u uVar) {
                El();
                ((i) this.f126038b).Bn(uVar);
                return this;
            }

            @Override // com.google.rpc.context.a.j
            public u v0() {
                return ((i) this.f126038b).v0();
            }

            @Override // com.google.rpc.context.a.j
            public String v7(String str) {
                str.getClass();
                Map<String, String> mapR7 = ((i) this.f126038b).r7();
                if (mapR7.containsKey(str)) {
                    return mapR7.get(str);
                }
                throw new IllegalArgumentException();
            }

            public C1228a vm(String str) {
                El();
                ((i) this.f126038b).Cn(str);
                return this;
            }

            public C1228a wm(u uVar) {
                El();
                ((i) this.f126038b).Dn(uVar);
                return this;
            }

            public C1228a xm(long j10) {
                El();
                ((i) this.f126038b).En(j10);
                return this;
            }

            @Override // com.google.rpc.context.a.j
            public u yd() {
                return ((i) this.f126038b).yd();
            }

            public C1228a ym(d4.b bVar) {
                El();
                ((i) this.f126038b).Fn(bVar.build());
                return this;
            }

            public C1228a zm(d4 d4Var) {
                El();
                ((i) this.f126038b).Fn(d4Var);
                return this;
            }

            private C1228a() {
                super(i.DEFAULT_INSTANCE);
            }
        }

        private static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final g2<String, String> f126678a;

            static {
                x4.b bVar = x4.b.f126490k;
                f126678a = g2.f(bVar, "", bVar, "");
            }

            private b() {
            }
        }

        static {
            i iVar = new i();
            DEFAULT_INSTANCE = iVar;
            l1.Wl(i.class, iVar);
        }

        private i() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void An(String str) {
            str.getClass();
            this.reason_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Bn(u uVar) {
            com.google.protobuf.a.R(uVar);
            this.reason_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Cn(String str) {
            str.getClass();
            this.scheme_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Dn(u uVar) {
            com.google.protobuf.a.R(uVar);
            this.scheme_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void En(long j10) {
            this.size_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Fn(d4 d4Var) {
            d4Var.getClass();
            this.time_ = d4Var;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Hm() {
            this.auth_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Im() {
            this.host_ = Sm().A1();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Jm() {
            this.id_ = Sm().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Km() {
            this.method_ = Sm().getMethod();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Lm() {
            this.path_ = Sm().S();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Mm() {
            this.protocol_ = Sm().getProtocol();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Nm() {
            this.query_ = Sm().d2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Om() {
            this.reason_ = Sm().u0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Pm() {
            this.scheme_ = Sm().P2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Qm() {
            this.size_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Rm() {
            this.time_ = null;
            this.bitField0_ &= -2;
        }

        public static i Sm() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> Tm() {
            return Vm();
        }

        private h2<String, String> Um() {
            return this.headers_;
        }

        private h2<String, String> Vm() {
            if (!this.headers_.j()) {
                this.headers_ = this.headers_.n();
            }
            return this.headers_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Wm(d dVar) {
            dVar.getClass();
            d dVar2 = this.auth_;
            if (dVar2 == null || dVar2 == d.Gm()) {
                this.auth_ = dVar;
            } else {
                this.auth_ = d.Jm(this.auth_).Jl(dVar).B1();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Xm(d4 d4Var) {
            d4Var.getClass();
            d4 d4Var2 = this.time_;
            if (d4Var2 == null || d4Var2 == d4.gm()) {
                this.time_ = d4Var;
            } else {
                this.time_ = d4.im(this.time_).Jl(d4Var).B1();
            }
            this.bitField0_ |= 1;
        }

        public static C1228a Ym() {
            return DEFAULT_INSTANCE.jf();
        }

        public static C1228a Zm(i iVar) {
            return DEFAULT_INSTANCE.Uf(iVar);
        }

        public static i an(InputStream inputStream) throws IOException {
            return (i) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static i bn(InputStream inputStream, v0 v0Var) throws IOException {
            return (i) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static i cn(u uVar) throws t1 {
            return (i) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static i dn(u uVar, v0 v0Var) throws t1 {
            return (i) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static i en(z zVar) throws IOException {
            return (i) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static i fn(z zVar, v0 v0Var) throws IOException {
            return (i) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static i gn(InputStream inputStream) throws IOException {
            return (i) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static i hn(InputStream inputStream, v0 v0Var) throws IOException {
            return (i) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static i in(ByteBuffer byteBuffer) throws t1 {
            return (i) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static i jn(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (i) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static i kn(byte[] bArr) throws t1 {
            return (i) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static i ln(byte[] bArr, v0 v0Var) throws t1 {
            return (i) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<i> mn() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void nn(d dVar) {
            dVar.getClass();
            this.auth_ = dVar;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void on(String str) {
            str.getClass();
            this.host_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void pn(u uVar) {
            com.google.protobuf.a.R(uVar);
            this.host_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void qn(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void rn(u uVar) {
            com.google.protobuf.a.R(uVar);
            this.id_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void sn(String str) {
            str.getClass();
            this.method_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void tn(u uVar) {
            com.google.protobuf.a.R(uVar);
            this.method_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void un(String str) {
            str.getClass();
            this.path_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void vn(u uVar) {
            com.google.protobuf.a.R(uVar);
            this.path_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void wn(String str) {
            str.getClass();
            this.protocol_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void xn(u uVar) {
            com.google.protobuf.a.R(uVar);
            this.protocol_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void yn(String str) {
            str.getClass();
            this.query_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zn(u uVar) {
            com.google.protobuf.a.R(uVar);
            this.query_ = uVar.z0();
        }

        @Override // com.google.rpc.context.a.j
        public String A1() {
            return this.host_;
        }

        @Override // com.google.rpc.context.a.j
        public u A7() {
            return u.C(this.query_);
        }

        @Override // com.google.rpc.context.a.j
        public boolean Ai() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.rpc.context.a.j
        public String K2(String str, String str2) {
            str.getClass();
            h2<String, String> h2VarUm = Um();
            return h2VarUm.containsKey(str) ? h2VarUm.get(str) : str2;
        }

        @Override // com.google.rpc.context.a.j
        public boolean L4(String str) {
            str.getClass();
            return Um().containsKey(str);
        }

        @Override // com.google.rpc.context.a.j
        public u Me() {
            return u.C(this.host_);
        }

        @Override // com.google.rpc.context.a.j
        @Deprecated
        public Map<String, String> O() {
            return r7();
        }

        @Override // com.google.rpc.context.a.j
        public String P2() {
            return this.scheme_;
        }

        @Override // com.google.rpc.context.a.j
        public d Qb() {
            d dVarGm = this.auth_;
            if (dVarGm == null) {
                dVarGm = d.Gm();
            }
            return dVarGm;
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            C1224a c1224a = null;
            switch (C1224a.f126676a[iVar.ordinal()]) {
                case 1:
                    return new i();
                case 2:
                    return new C1228a(c1224a);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\r\f\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u00032\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\tဉ\u0000\n\u0002\u000bȈ\fȈ\rဉ\u0001", new Object[]{"bitField0_", "id_", "method_", "headers_", b.f126678a, "path_", "host_", "scheme_", "query_", "time_", "size_", "protocol_", "reason_", "auth_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f3<i> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (i.class) {
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

        @Override // com.google.rpc.context.a.j
        public String S() {
            return this.path_;
        }

        @Override // com.google.rpc.context.a.j
        public boolean U0() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.rpc.context.a.j
        public d4 V() {
            d4 d4VarGm = this.time_;
            if (d4VarGm == null) {
                d4VarGm = d4.gm();
            }
            return d4VarGm;
        }

        @Override // com.google.rpc.context.a.j
        public u Y7() {
            return u.C(this.path_);
        }

        @Override // com.google.rpc.context.a.j
        public String d2() {
            return this.query_;
        }

        @Override // com.google.rpc.context.a.j
        public u eb() {
            return u.C(this.method_);
        }

        @Override // com.google.rpc.context.a.j
        public u f7() {
            return u.C(this.reason_);
        }

        @Override // com.google.rpc.context.a.j
        public String getId() {
            return this.id_;
        }

        @Override // com.google.rpc.context.a.j
        public String getMethod() {
            return this.method_;
        }

        @Override // com.google.rpc.context.a.j
        public String getProtocol() {
            return this.protocol_;
        }

        @Override // com.google.rpc.context.a.j
        public long getSize() {
            return this.size_;
        }

        @Override // com.google.rpc.context.a.j
        public int l3() {
            return Um().size();
        }

        @Override // com.google.rpc.context.a.j
        public u o0() {
            return u.C(this.protocol_);
        }

        @Override // com.google.rpc.context.a.j
        public Map<String, String> r7() {
            return Collections.unmodifiableMap(Um());
        }

        @Override // com.google.rpc.context.a.j
        public String u0() {
            return this.reason_;
        }

        @Override // com.google.rpc.context.a.j
        public u v0() {
            return u.C(this.id_);
        }

        @Override // com.google.rpc.context.a.j
        public String v7(String str) {
            str.getClass();
            h2<String, String> h2VarUm = Um();
            if (h2VarUm.containsKey(str)) {
                return h2VarUm.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.google.rpc.context.a.j
        public u yd() {
            return u.C(this.scheme_);
        }
    }

    public interface j extends o2 {
        String A1();

        u A7();

        boolean Ai();

        String K2(String str, String str2);

        boolean L4(String str);

        u Me();

        @Deprecated
        Map<String, String> O();

        String P2();

        d Qb();

        String S();

        boolean U0();

        d4 V();

        u Y7();

        String d2();

        u eb();

        u f7();

        String getId();

        String getMethod();

        String getProtocol();

        long getSize();

        int l3();

        u o0();

        Map<String, String> r7();

        String u0();

        u v0();

        String v7(String str);

        u yd();
    }

    public static final class k extends l1<k, C1229a> implements l {
        private static final k DEFAULT_INSTANCE;
        public static final int LABELS_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile f3<k> PARSER = null;
        public static final int SERVICE_FIELD_NUMBER = 1;
        public static final int TYPE_FIELD_NUMBER = 3;
        private h2<String, String> labels_ = h2.f();
        private String service_ = "";
        private String name_ = "";
        private String type_ = "";

        /* JADX INFO: renamed from: com.google.rpc.context.a$k$a, reason: collision with other inner class name */
        public static final class C1229a extends l1.b<k, C1229a> implements l {
            /* synthetic */ C1229a(C1224a c1224a) {
                this();
            }

            @Override // com.google.rpc.context.a.l
            @Deprecated
            public Map<String, String> B0() {
                return x0();
            }

            @Override // com.google.rpc.context.a.l
            public String D0(String str, String str2) {
                str.getClass();
                Map<String, String> mapX0 = ((k) this.f126038b).x0();
                return mapX0.containsKey(str) ? mapX0.get(str) : str2;
            }

            @Override // com.google.rpc.context.a.l
            public int E() {
                return ((k) this.f126038b).x0().size();
            }

            @Override // com.google.rpc.context.a.l
            public String F2() {
                return ((k) this.f126038b).F2();
            }

            public C1229a Ol() {
                El();
                ((k) this.f126038b).om().clear();
                return this;
            }

            public C1229a Pl() {
                El();
                ((k) this.f126038b).km();
                return this;
            }

            public C1229a Ql() {
                El();
                ((k) this.f126038b).lm();
                return this;
            }

            public C1229a Rl() {
                El();
                ((k) this.f126038b).mm();
                return this;
            }

            public C1229a Sl(Map<String, String> map) {
                El();
                ((k) this.f126038b).om().putAll(map);
                return this;
            }

            public C1229a Tl(String str, String str2) {
                str.getClass();
                str2.getClass();
                El();
                ((k) this.f126038b).om().put(str, str2);
                return this;
            }

            public C1229a Ul(String str) {
                str.getClass();
                El();
                ((k) this.f126038b).om().remove(str);
                return this;
            }

            public C1229a Vl(String str) {
                El();
                ((k) this.f126038b).Gm(str);
                return this;
            }

            public C1229a Wl(u uVar) {
                El();
                ((k) this.f126038b).Hm(uVar);
                return this;
            }

            public C1229a Xl(String str) {
                El();
                ((k) this.f126038b).Im(str);
                return this;
            }

            public C1229a Yl(u uVar) {
                El();
                ((k) this.f126038b).Jm(uVar);
                return this;
            }

            public C1229a Zl(String str) {
                El();
                ((k) this.f126038b).Km(str);
                return this;
            }

            @Override // com.google.rpc.context.a.l
            public u a() {
                return ((k) this.f126038b).a();
            }

            public C1229a am(u uVar) {
                El();
                ((k) this.f126038b).Lm(uVar);
                return this;
            }

            @Override // com.google.rpc.context.a.l
            public u b3() {
                return ((k) this.f126038b).b3();
            }

            @Override // com.google.rpc.context.a.l
            public String c() {
                return ((k) this.f126038b).c();
            }

            @Override // com.google.rpc.context.a.l
            public String getName() {
                return ((k) this.f126038b).getName();
            }

            @Override // com.google.rpc.context.a.l
            public String p0(String str) {
                str.getClass();
                Map<String, String> mapX0 = ((k) this.f126038b).x0();
                if (mapX0.containsKey(str)) {
                    return mapX0.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // com.google.rpc.context.a.l
            public u s() {
                return ((k) this.f126038b).s();
            }

            @Override // com.google.rpc.context.a.l
            public Map<String, String> x0() {
                return Collections.unmodifiableMap(((k) this.f126038b).x0());
            }

            @Override // com.google.rpc.context.a.l
            public boolean z0(String str) {
                str.getClass();
                return ((k) this.f126038b).x0().containsKey(str);
            }

            private C1229a() {
                super(k.DEFAULT_INSTANCE);
            }
        }

        private static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final g2<String, String> f126679a;

            static {
                x4.b bVar = x4.b.f126490k;
                f126679a = g2.f(bVar, "", bVar, "");
            }

            private b() {
            }
        }

        static {
            k kVar = new k();
            DEFAULT_INSTANCE = kVar;
            l1.Wl(k.class, kVar);
        }

        private k() {
        }

        public static k Am(InputStream inputStream, v0 v0Var) throws IOException {
            return (k) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static k Bm(ByteBuffer byteBuffer) throws t1 {
            return (k) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static k Cm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (k) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static k Dm(byte[] bArr) throws t1 {
            return (k) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static k Em(byte[] bArr, v0 v0Var) throws t1 {
            return (k) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<k> Fm() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Gm(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Hm(u uVar) {
            com.google.protobuf.a.R(uVar);
            this.name_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Im(String str) {
            str.getClass();
            this.service_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Jm(u uVar) {
            com.google.protobuf.a.R(uVar);
            this.service_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Km(String str) {
            str.getClass();
            this.type_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Lm(u uVar) {
            com.google.protobuf.a.R(uVar);
            this.type_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void km() {
            this.name_ = nm().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lm() {
            this.service_ = nm().F2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mm() {
            this.type_ = nm().c();
        }

        public static k nm() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> om() {
            return qm();
        }

        private h2<String, String> pm() {
            return this.labels_;
        }

        private h2<String, String> qm() {
            if (!this.labels_.j()) {
                this.labels_ = this.labels_.n();
            }
            return this.labels_;
        }

        public static C1229a rm() {
            return DEFAULT_INSTANCE.jf();
        }

        public static C1229a sm(k kVar) {
            return DEFAULT_INSTANCE.Uf(kVar);
        }

        public static k tm(InputStream inputStream) throws IOException {
            return (k) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static k um(InputStream inputStream, v0 v0Var) throws IOException {
            return (k) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static k vm(u uVar) throws t1 {
            return (k) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static k wm(u uVar, v0 v0Var) throws t1 {
            return (k) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static k xm(z zVar) throws IOException {
            return (k) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static k ym(z zVar, v0 v0Var) throws IOException {
            return (k) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static k zm(InputStream inputStream) throws IOException {
            return (k) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        @Override // com.google.rpc.context.a.l
        @Deprecated
        public Map<String, String> B0() {
            return x0();
        }

        @Override // com.google.rpc.context.a.l
        public String D0(String str, String str2) {
            str.getClass();
            h2<String, String> h2VarPm = pm();
            return h2VarPm.containsKey(str) ? h2VarPm.get(str) : str2;
        }

        @Override // com.google.rpc.context.a.l
        public int E() {
            return pm().size();
        }

        @Override // com.google.rpc.context.a.l
        public String F2() {
            return this.service_;
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            int i10 = C1224a.f126676a[iVar.ordinal()];
            C1224a c1224a = null;
            switch (i10) {
                case 1:
                    return new k();
                case 2:
                    return new C1229a(c1224a);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u00042", new Object[]{"service_", "name_", "type_", "labels_", b.f126679a});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f3<k> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (k.class) {
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

        @Override // com.google.rpc.context.a.l
        public u a() {
            return u.C(this.name_);
        }

        @Override // com.google.rpc.context.a.l
        public u b3() {
            return u.C(this.service_);
        }

        @Override // com.google.rpc.context.a.l
        public String c() {
            return this.type_;
        }

        @Override // com.google.rpc.context.a.l
        public String getName() {
            return this.name_;
        }

        @Override // com.google.rpc.context.a.l
        public String p0(String str) {
            str.getClass();
            h2<String, String> h2VarPm = pm();
            if (h2VarPm.containsKey(str)) {
                return h2VarPm.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.google.rpc.context.a.l
        public u s() {
            return u.C(this.type_);
        }

        @Override // com.google.rpc.context.a.l
        public Map<String, String> x0() {
            return Collections.unmodifiableMap(pm());
        }

        @Override // com.google.rpc.context.a.l
        public boolean z0(String str) {
            str.getClass();
            return pm().containsKey(str);
        }
    }

    public interface l extends o2 {
        @Deprecated
        Map<String, String> B0();

        String D0(String str, String str2);

        int E();

        String F2();

        u a();

        u b3();

        String c();

        String getName();

        String p0(String str);

        u s();

        Map<String, String> x0();

        boolean z0(String str);
    }

    public static final class m extends l1<m, C1230a> implements n {
        public static final int CODE_FIELD_NUMBER = 1;
        private static final m DEFAULT_INSTANCE;
        public static final int HEADERS_FIELD_NUMBER = 3;
        private static volatile f3<m> PARSER = null;
        public static final int SIZE_FIELD_NUMBER = 2;
        public static final int TIME_FIELD_NUMBER = 4;
        private int bitField0_;
        private long code_;
        private h2<String, String> headers_ = h2.f();
        private long size_;
        private d4 time_;

        /* JADX INFO: renamed from: com.google.rpc.context.a$m$a, reason: collision with other inner class name */
        public static final class C1230a extends l1.b<m, C1230a> implements n {
            /* synthetic */ C1230a(C1224a c1224a) {
                this();
            }

            @Override // com.google.rpc.context.a.n
            public String K2(String str, String str2) {
                str.getClass();
                Map<String, String> mapR7 = ((m) this.f126038b).r7();
                return mapR7.containsKey(str) ? mapR7.get(str) : str2;
            }

            @Override // com.google.rpc.context.a.n
            public boolean L4(String str) {
                str.getClass();
                return ((m) this.f126038b).r7().containsKey(str);
            }

            @Override // com.google.rpc.context.a.n
            @Deprecated
            public Map<String, String> O() {
                return r7();
            }

            public C1230a Ol() {
                El();
                ((m) this.f126038b).im();
                return this;
            }

            public C1230a Pl() {
                El();
                ((m) this.f126038b).mm().clear();
                return this;
            }

            public C1230a Ql() {
                El();
                ((m) this.f126038b).jm();
                return this;
            }

            public C1230a Rl() {
                El();
                ((m) this.f126038b).km();
                return this;
            }

            public C1230a Sl(d4 d4Var) {
                El();
                ((m) this.f126038b).pm(d4Var);
                return this;
            }

            public C1230a Tl(Map<String, String> map) {
                El();
                ((m) this.f126038b).mm().putAll(map);
                return this;
            }

            @Override // com.google.rpc.context.a.n
            public boolean U0() {
                return ((m) this.f126038b).U0();
            }

            public C1230a Ul(String str, String str2) {
                str.getClass();
                str2.getClass();
                El();
                ((m) this.f126038b).mm().put(str, str2);
                return this;
            }

            @Override // com.google.rpc.context.a.n
            public d4 V() {
                return ((m) this.f126038b).V();
            }

            public C1230a Vl(String str) {
                str.getClass();
                El();
                ((m) this.f126038b).mm().remove(str);
                return this;
            }

            public C1230a Wl(long j10) {
                El();
                ((m) this.f126038b).Fm(j10);
                return this;
            }

            public C1230a Xl(long j10) {
                El();
                ((m) this.f126038b).Gm(j10);
                return this;
            }

            public C1230a Yl(d4.b bVar) {
                El();
                ((m) this.f126038b).Hm(bVar.build());
                return this;
            }

            public C1230a Zl(d4 d4Var) {
                El();
                ((m) this.f126038b).Hm(d4Var);
                return this;
            }

            @Override // com.google.rpc.context.a.n
            public long getCode() {
                return ((m) this.f126038b).getCode();
            }

            @Override // com.google.rpc.context.a.n
            public long getSize() {
                return ((m) this.f126038b).getSize();
            }

            @Override // com.google.rpc.context.a.n
            public int l3() {
                return ((m) this.f126038b).r7().size();
            }

            @Override // com.google.rpc.context.a.n
            public Map<String, String> r7() {
                return Collections.unmodifiableMap(((m) this.f126038b).r7());
            }

            @Override // com.google.rpc.context.a.n
            public String v7(String str) {
                str.getClass();
                Map<String, String> mapR7 = ((m) this.f126038b).r7();
                if (mapR7.containsKey(str)) {
                    return mapR7.get(str);
                }
                throw new IllegalArgumentException();
            }

            private C1230a() {
                super(m.DEFAULT_INSTANCE);
            }
        }

        private static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final g2<String, String> f126680a;

            static {
                x4.b bVar = x4.b.f126490k;
                f126680a = g2.f(bVar, "", bVar, "");
            }

            private b() {
            }
        }

        static {
            m mVar = new m();
            DEFAULT_INSTANCE = mVar;
            l1.Wl(m.class, mVar);
        }

        private m() {
        }

        public static m Am(ByteBuffer byteBuffer) throws t1 {
            return (m) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static m Bm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (m) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static m Cm(byte[] bArr) throws t1 {
            return (m) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static m Dm(byte[] bArr, v0 v0Var) throws t1 {
            return (m) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<m> Em() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Fm(long j10) {
            this.code_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Gm(long j10) {
            this.size_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Hm(d4 d4Var) {
            d4Var.getClass();
            this.time_ = d4Var;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void im() {
            this.code_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void jm() {
            this.size_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void km() {
            this.time_ = null;
            this.bitField0_ &= -2;
        }

        public static m lm() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> mm() {
            return om();
        }

        private h2<String, String> nm() {
            return this.headers_;
        }

        private h2<String, String> om() {
            if (!this.headers_.j()) {
                this.headers_ = this.headers_.n();
            }
            return this.headers_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void pm(d4 d4Var) {
            d4Var.getClass();
            d4 d4Var2 = this.time_;
            if (d4Var2 == null || d4Var2 == d4.gm()) {
                this.time_ = d4Var;
            } else {
                this.time_ = d4.im(this.time_).Jl(d4Var).B1();
            }
            this.bitField0_ |= 1;
        }

        public static C1230a qm() {
            return DEFAULT_INSTANCE.jf();
        }

        public static C1230a rm(m mVar) {
            return DEFAULT_INSTANCE.Uf(mVar);
        }

        public static m sm(InputStream inputStream) throws IOException {
            return (m) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static m tm(InputStream inputStream, v0 v0Var) throws IOException {
            return (m) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static m um(u uVar) throws t1 {
            return (m) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static m vm(u uVar, v0 v0Var) throws t1 {
            return (m) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static m wm(z zVar) throws IOException {
            return (m) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static m xm(z zVar, v0 v0Var) throws IOException {
            return (m) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static m ym(InputStream inputStream) throws IOException {
            return (m) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static m zm(InputStream inputStream, v0 v0Var) throws IOException {
            return (m) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        @Override // com.google.rpc.context.a.n
        public String K2(String str, String str2) {
            str.getClass();
            h2<String, String> h2VarNm = nm();
            return h2VarNm.containsKey(str) ? h2VarNm.get(str) : str2;
        }

        @Override // com.google.rpc.context.a.n
        public boolean L4(String str) {
            str.getClass();
            return nm().containsKey(str);
        }

        @Override // com.google.rpc.context.a.n
        @Deprecated
        public Map<String, String> O() {
            return r7();
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            int i10 = C1224a.f126676a[iVar.ordinal()];
            C1224a c1224a = null;
            switch (i10) {
                case 1:
                    return new m();
                case 2:
                    return new C1230a(c1224a);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0002\u0002\u0002\u00032\u0004ဉ\u0000", new Object[]{"bitField0_", "code_", "size_", "headers_", b.f126680a, "time_"});
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

        @Override // com.google.rpc.context.a.n
        public boolean U0() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.rpc.context.a.n
        public d4 V() {
            d4 d4VarGm = this.time_;
            if (d4VarGm == null) {
                d4VarGm = d4.gm();
            }
            return d4VarGm;
        }

        @Override // com.google.rpc.context.a.n
        public long getCode() {
            return this.code_;
        }

        @Override // com.google.rpc.context.a.n
        public long getSize() {
            return this.size_;
        }

        @Override // com.google.rpc.context.a.n
        public int l3() {
            return nm().size();
        }

        @Override // com.google.rpc.context.a.n
        public Map<String, String> r7() {
            return Collections.unmodifiableMap(nm());
        }

        @Override // com.google.rpc.context.a.n
        public String v7(String str) {
            str.getClass();
            h2<String, String> h2VarNm = nm();
            if (h2VarNm.containsKey(str)) {
                return h2VarNm.get(str);
            }
            throw new IllegalArgumentException();
        }
    }

    public interface n extends o2 {
        String K2(String str, String str2);

        boolean L4(String str);

        @Deprecated
        Map<String, String> O();

        boolean U0();

        d4 V();

        long getCode();

        long getSize();

        int l3();

        Map<String, String> r7();

        String v7(String str);
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        l1.Wl(a.class, aVar);
    }

    private a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Am() {
        this.response_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bm() {
        this.source_ = null;
        this.bitField0_ &= -3;
    }

    public static a Cm() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dm(b bVar) {
        bVar.getClass();
        b bVar2 = this.api_;
        if (bVar2 == null || bVar2 == b.qm()) {
            this.api_ = bVar;
        } else {
            this.api_ = b.sm(this.api_).Jl(bVar).B1();
        }
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Em(g gVar) {
        gVar.getClass();
        g gVar2 = this.destination_;
        if (gVar2 == null || gVar2 == g.qm()) {
            this.destination_ = gVar;
        } else {
            this.destination_ = g.vm(this.destination_).Jl(gVar).B1();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Fm(g gVar) {
        gVar.getClass();
        g gVar2 = this.origin_;
        if (gVar2 == null || gVar2 == g.qm()) {
            this.origin_ = gVar;
        } else {
            this.origin_ = g.vm(this.origin_).Jl(gVar).B1();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Gm(i iVar) {
        iVar.getClass();
        i iVar2 = this.request_;
        if (iVar2 == null || iVar2 == i.Sm()) {
            this.request_ = iVar;
        } else {
            this.request_ = i.Zm(this.request_).Jl(iVar).B1();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Hm(k kVar) {
        kVar.getClass();
        k kVar2 = this.resource_;
        if (kVar2 == null || kVar2 == k.nm()) {
            this.resource_ = kVar;
        } else {
            this.resource_ = k.sm(this.resource_).Jl(kVar).B1();
        }
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Im(m mVar) {
        mVar.getClass();
        m mVar2 = this.response_;
        if (mVar2 == null || mVar2 == m.lm()) {
            this.response_ = mVar;
        } else {
            this.response_ = m.rm(this.response_).Jl(mVar).B1();
        }
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Jm(g gVar) {
        gVar.getClass();
        g gVar2 = this.source_;
        if (gVar2 == null || gVar2 == g.qm()) {
            this.source_ = gVar;
        } else {
            this.source_ = g.vm(this.source_).Jl(gVar).B1();
        }
        this.bitField0_ |= 2;
    }

    public static f Km() {
        return DEFAULT_INSTANCE.jf();
    }

    public static f Lm(a aVar) {
        return DEFAULT_INSTANCE.Uf(aVar);
    }

    public static a Mm(InputStream inputStream) throws IOException {
        return (a) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static a Nm(InputStream inputStream, v0 v0Var) throws IOException {
        return (a) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static a Om(u uVar) throws t1 {
        return (a) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static a Pm(u uVar, v0 v0Var) throws t1 {
        return (a) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static a Qm(z zVar) throws IOException {
        return (a) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static a Rm(z zVar, v0 v0Var) throws IOException {
        return (a) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static a Sm(InputStream inputStream) throws IOException {
        return (a) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static a Tm(InputStream inputStream, v0 v0Var) throws IOException {
        return (a) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static a Um(ByteBuffer byteBuffer) throws t1 {
        return (a) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static a Vm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (a) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static a Wm(byte[] bArr) throws t1 {
        return (a) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static a Xm(byte[] bArr, v0 v0Var) throws t1 {
        return (a) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<a> Ym() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Zm(b bVar) {
        bVar.getClass();
        this.api_ = bVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void an(g gVar) {
        gVar.getClass();
        this.destination_ = gVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bn(g gVar) {
        gVar.getClass();
        this.origin_ = gVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cn(i iVar) {
        iVar.getClass();
        this.request_ = iVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dn(k kVar) {
        kVar.getClass();
        this.resource_ = kVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void en(m mVar) {
        mVar.getClass();
        this.response_ = mVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fn(g gVar) {
        gVar.getClass();
        this.source_ = gVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vm() {
        this.api_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wm() {
        this.destination_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xm() {
        this.origin_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ym() {
        this.request_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zm() {
        this.resource_ = null;
        this.bitField0_ &= -33;
    }

    @Override // com.google.rpc.context.b
    public boolean Ak() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.rpc.context.b
    public boolean C3() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.rpc.context.b
    public boolean Fc() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.rpc.context.b
    public m N() {
        m mVar = this.response_;
        return mVar == null ? m.lm() : mVar;
    }

    @Override // com.google.rpc.context.b
    public g P() {
        g gVarQm = this.source_;
        if (gVarQm == null) {
            gVarQm = g.qm();
        }
        return gVarQm;
    }

    @Override // com.google.rpc.context.b
    public k R7() {
        k kVar = this.resource_;
        return kVar == null ? k.nm() : kVar;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = C1224a.f126676a[iVar.ordinal()];
        C1224a c1224a = null;
        switch (i10) {
            case 1:
                return new a();
            case 2:
                return new f(c1224a);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဉ\u0004\u0005ဉ\u0005\u0006ဉ\u0006\u0007ဉ\u0000", new Object[]{"bitField0_", "source_", "destination_", "request_", "response_", "resource_", "api_", "origin_"});
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

    @Override // com.google.rpc.context.b
    public g Wd() {
        g gVar = this.origin_;
        return gVar == null ? g.qm() : gVar;
    }

    @Override // com.google.rpc.context.b
    public boolean Wh() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.rpc.context.b
    public boolean ef() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.google.rpc.context.b
    public b getApi() {
        b bVarQm = this.api_;
        if (bVarQm == null) {
            bVarQm = b.qm();
        }
        return bVarQm;
    }

    @Override // com.google.rpc.context.b
    public i getRequest() {
        i iVar = this.request_;
        return iVar == null ? i.Sm() : iVar;
    }

    @Override // com.google.rpc.context.b
    public boolean jc() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.rpc.context.b
    public boolean n1() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.rpc.context.b
    public g q1() {
        g gVarQm = this.destination_;
        if (gVarQm == null) {
            gVarQm = g.qm();
        }
        return gVarQm;
    }
}
