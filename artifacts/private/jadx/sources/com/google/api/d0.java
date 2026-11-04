package com.google.api;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends com.google.protobuf.l1<d0, b> implements e0 {
    public static final int ALLOWED_REQUEST_EXTENSIONS_FIELD_NUMBER = 4;
    public static final int ALLOWED_RESPONSE_EXTENSIONS_FIELD_NUMBER = 5;
    private static final d0 DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.f3<d0> PARSER = null;
    public static final int PROVIDED_FIELD_NUMBER = 3;
    public static final int REQUESTED_FIELD_NUMBER = 2;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private String selector_ = "";
    private com.google.protobuf.s1.k<String> requested_ = com.google.protobuf.l1.Ij();
    private com.google.protobuf.s1.k<String> provided_ = com.google.protobuf.l1.Ij();
    private com.google.protobuf.s1.k<String> allowedRequestExtensions_ = com.google.protobuf.l1.Ij();
    private com.google.protobuf.s1.k<String> allowedResponseExtensions_ = com.google.protobuf.l1.Ij();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116186a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f116186a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116186a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116186a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116186a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116186a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116186a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116186a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1.b<d0, b> implements e0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.api.e0
        public String A() {
            return ((d0) this.f126038b).A();
        }

        @Override // com.google.api.e0
        public int Ab() {
            return ((d0) this.f126038b).Ab();
        }

        @Override // com.google.api.e0
        public com.google.protobuf.u B() {
            return ((d0) this.f126038b).B();
        }

        @Override // com.google.api.e0
        public com.google.protobuf.u Dj(int i10) {
            return ((d0) this.f126038b).Dj(i10);
        }

        @Override // com.google.api.e0
        public int Eg() {
            return ((d0) this.f126038b).Eg();
        }

        @Override // com.google.api.e0
        public String Hg(int i10) {
            return ((d0) this.f126038b).Hg(i10);
        }

        @Override // com.google.api.e0
        public com.google.protobuf.u If(int i10) {
            return ((d0) this.f126038b).If(i10);
        }

        @Override // com.google.api.e0
        public int Jk() {
            return ((d0) this.f126038b).Jk();
        }

        @Override // com.google.api.e0
        public String Le(int i10) {
            return ((d0) this.f126038b).Le(i10);
        }

        public b Ol(Iterable<String> iterable) {
            El();
            ((d0) this.f126038b).xm(iterable);
            return this;
        }

        public b Pl(Iterable<String> iterable) {
            El();
            ((d0) this.f126038b).ym(iterable);
            return this;
        }

        public b Ql(Iterable<String> iterable) {
            El();
            ((d0) this.f126038b).zm(iterable);
            return this;
        }

        public b Rl(Iterable<String> iterable) {
            El();
            ((d0) this.f126038b).Am(iterable);
            return this;
        }

        @Override // com.google.api.e0
        public int S8() {
            return ((d0) this.f126038b).S8();
        }

        public b Sl(String str) {
            El();
            ((d0) this.f126038b).Bm(str);
            return this;
        }

        public b Tl(com.google.protobuf.u uVar) {
            El();
            ((d0) this.f126038b).Cm(uVar);
            return this;
        }

        public b Ul(String str) {
            El();
            ((d0) this.f126038b).Dm(str);
            return this;
        }

        @Override // com.google.api.e0
        public com.google.protobuf.u Vc(int i10) {
            return ((d0) this.f126038b).Vc(i10);
        }

        public b Vl(com.google.protobuf.u uVar) {
            El();
            ((d0) this.f126038b).Em(uVar);
            return this;
        }

        public b Wl(String str) {
            El();
            ((d0) this.f126038b).Fm(str);
            return this;
        }

        @Override // com.google.api.e0
        public String Xi(int i10) {
            return ((d0) this.f126038b).Xi(i10);
        }

        public b Xl(com.google.protobuf.u uVar) {
            El();
            ((d0) this.f126038b).Gm(uVar);
            return this;
        }

        public b Yl(String str) {
            El();
            ((d0) this.f126038b).Hm(str);
            return this;
        }

        public b Zl(com.google.protobuf.u uVar) {
            El();
            ((d0) this.f126038b).Im(uVar);
            return this;
        }

        public b am() {
            El();
            ((d0) this.f126038b).Jm();
            return this;
        }

        public b bm() {
            El();
            ((d0) this.f126038b).Km();
            return this;
        }

        public b cm() {
            El();
            ((d0) this.f126038b).Lm();
            return this;
        }

        public b dm() {
            El();
            ((d0) this.f126038b).Mm();
            return this;
        }

        public b em() {
            El();
            ((d0) this.f126038b).Nm();
            return this;
        }

        @Override // com.google.api.e0
        public List<String> fa() {
            return Collections.unmodifiableList(((d0) this.f126038b).fa());
        }

        public b fm(int i10, String str) {
            El();
            ((d0) this.f126038b).in(i10, str);
            return this;
        }

        public b gm(int i10, String str) {
            El();
            ((d0) this.f126038b).jn(i10, str);
            return this;
        }

        public b hm(int i10, String str) {
            El();
            ((d0) this.f126038b).kn(i10, str);
            return this;
        }

        @Override // com.google.api.e0
        public com.google.protobuf.u ie(int i10) {
            return ((d0) this.f126038b).ie(i10);
        }

        public b im(int i10, String str) {
            El();
            ((d0) this.f126038b).ln(i10, str);
            return this;
        }

        public b jm(String str) {
            El();
            ((d0) this.f126038b).mn(str);
            return this;
        }

        public b km(com.google.protobuf.u uVar) {
            El();
            ((d0) this.f126038b).nn(uVar);
            return this;
        }

        @Override // com.google.api.e0
        public String ne(int i10) {
            return ((d0) this.f126038b).ne(i10);
        }

        @Override // com.google.api.e0
        public List<String> ti() {
            return Collections.unmodifiableList(((d0) this.f126038b).ti());
        }

        @Override // com.google.api.e0
        public List<String> y8() {
            return Collections.unmodifiableList(((d0) this.f126038b).y8());
        }

        @Override // com.google.api.e0
        public List<String> z9() {
            return Collections.unmodifiableList(((d0) this.f126038b).z9());
        }

        private b() {
            super(d0.DEFAULT_INSTANCE);
        }
    }

    static {
        d0 d0Var = new d0();
        DEFAULT_INSTANCE = d0Var;
        com.google.protobuf.l1.Wl(d0.class, d0Var);
    }

    private d0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Am(Iterable<String> iterable) {
        Rm();
        com.google.protobuf.a.y(iterable, this.requested_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bm(String str) {
        str.getClass();
        Om();
        this.allowedRequestExtensions_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Cm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        Om();
        this.allowedRequestExtensions_.add(uVar.z0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dm(String str) {
        str.getClass();
        Pm();
        this.allowedResponseExtensions_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Em(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        Pm();
        this.allowedResponseExtensions_.add(uVar.z0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Fm(String str) {
        str.getClass();
        Qm();
        this.provided_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Gm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        Qm();
        this.provided_.add(uVar.z0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Hm(String str) {
        str.getClass();
        Rm();
        this.requested_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Im(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        Rm();
        this.requested_.add(uVar.z0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Jm() {
        this.allowedRequestExtensions_ = com.google.protobuf.l1.Ij();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Km() {
        this.allowedResponseExtensions_ = com.google.protobuf.l1.Ij();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lm() {
        this.provided_ = com.google.protobuf.l1.Ij();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Mm() {
        this.requested_ = com.google.protobuf.l1.Ij();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Nm() {
        this.selector_ = Sm().A();
    }

    private void Om() {
        com.google.protobuf.s1.k<String> kVar = this.allowedRequestExtensions_;
        if (!kVar.s1()) {
            this.allowedRequestExtensions_ = com.google.protobuf.l1.yl(kVar);
        }
    }

    private void Pm() {
        com.google.protobuf.s1.k<String> kVar = this.allowedResponseExtensions_;
        if (kVar.s1()) {
            return;
        }
        this.allowedResponseExtensions_ = com.google.protobuf.l1.yl(kVar);
    }

    private void Qm() {
        com.google.protobuf.s1.k<String> kVar = this.provided_;
        if (kVar.s1()) {
            return;
        }
        this.provided_ = com.google.protobuf.l1.yl(kVar);
    }

    private void Rm() {
        com.google.protobuf.s1.k<String> kVar = this.requested_;
        if (kVar.s1()) {
            return;
        }
        this.requested_ = com.google.protobuf.l1.yl(kVar);
    }

    public static d0 Sm() {
        return DEFAULT_INSTANCE;
    }

    public static b Tm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b Um(d0 d0Var) {
        return DEFAULT_INSTANCE.Uf(d0Var);
    }

    public static d0 Vm(InputStream inputStream) throws IOException {
        return (d0) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static d0 Wm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (d0) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static d0 Xm(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (d0) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static d0 Ym(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (d0) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static d0 Zm(com.google.protobuf.z zVar) throws IOException {
        return (d0) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static d0 an(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (d0) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static d0 bn(InputStream inputStream) throws IOException {
        return (d0) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static d0 cn(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (d0) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static d0 dn(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (d0) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static d0 en(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (d0) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static d0 fn(byte[] bArr) throws com.google.protobuf.t1 {
        return (d0) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static d0 gn(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (d0) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static com.google.protobuf.f3<d0> hn() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void in(int i10, String str) {
        str.getClass();
        Om();
        this.allowedRequestExtensions_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jn(int i10, String str) {
        str.getClass();
        Pm();
        this.allowedResponseExtensions_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kn(int i10, String str) {
        str.getClass();
        Qm();
        this.provided_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ln(int i10, String str) {
        str.getClass();
        Rm();
        this.requested_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mn(String str) {
        str.getClass();
        this.selector_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nn(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.selector_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xm(Iterable<String> iterable) {
        Om();
        com.google.protobuf.a.y(iterable, this.allowedRequestExtensions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ym(Iterable<String> iterable) {
        Pm();
        com.google.protobuf.a.y(iterable, this.allowedResponseExtensions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zm(Iterable<String> iterable) {
        Qm();
        com.google.protobuf.a.y(iterable, this.provided_);
    }

    @Override // com.google.api.e0
    public String A() {
        return this.selector_;
    }

    @Override // com.google.api.e0
    public int Ab() {
        return this.allowedRequestExtensions_.size();
    }

    @Override // com.google.api.e0
    public com.google.protobuf.u B() {
        return com.google.protobuf.u.C(this.selector_);
    }

    @Override // com.google.api.e0
    public com.google.protobuf.u Dj(int i10) {
        return com.google.protobuf.u.C(this.allowedResponseExtensions_.get(i10));
    }

    @Override // com.google.api.e0
    public int Eg() {
        return this.allowedResponseExtensions_.size();
    }

    @Override // com.google.api.e0
    public String Hg(int i10) {
        return this.allowedRequestExtensions_.get(i10);
    }

    @Override // com.google.api.e0
    public com.google.protobuf.u If(int i10) {
        return com.google.protobuf.u.C(this.provided_.get(i10));
    }

    @Override // com.google.api.e0
    public int Jk() {
        return this.provided_.size();
    }

    @Override // com.google.api.e0
    public String Le(int i10) {
        return this.requested_.get(i10);
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        int i10 = a.f116186a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new d0();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0004\u0000\u0001Ȉ\u0002Ț\u0003Ț\u0004Ț\u0005Ț", new Object[]{"selector_", "requested_", "provided_", "allowedRequestExtensions_", "allowedResponseExtensions_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f3<d0> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (d0.class) {
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

    @Override // com.google.api.e0
    public int S8() {
        return this.requested_.size();
    }

    @Override // com.google.api.e0
    public com.google.protobuf.u Vc(int i10) {
        return com.google.protobuf.u.C(this.allowedRequestExtensions_.get(i10));
    }

    @Override // com.google.api.e0
    public String Xi(int i10) {
        return this.provided_.get(i10);
    }

    @Override // com.google.api.e0
    public List<String> fa() {
        return this.allowedResponseExtensions_;
    }

    @Override // com.google.api.e0
    public com.google.protobuf.u ie(int i10) {
        return com.google.protobuf.u.C(this.requested_.get(i10));
    }

    @Override // com.google.api.e0
    public String ne(int i10) {
        return this.allowedResponseExtensions_.get(i10);
    }

    @Override // com.google.api.e0
    public List<String> ti() {
        return this.allowedRequestExtensions_;
    }

    @Override // com.google.api.e0
    public List<String> y8() {
        return this.provided_;
    }

    @Override // com.google.api.e0
    public List<String> z9() {
        return this.requested_;
    }
}
