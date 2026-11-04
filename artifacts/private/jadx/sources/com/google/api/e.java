package com.google.api;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends com.google.protobuf.l1<e, b> implements f {
    public static final int AUDIENCES_FIELD_NUMBER = 4;
    public static final int AUTHORIZATION_URL_FIELD_NUMBER = 5;
    private static final e DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int ISSUER_FIELD_NUMBER = 2;
    public static final int JWKS_URI_FIELD_NUMBER = 3;
    public static final int JWT_LOCATIONS_FIELD_NUMBER = 6;
    private static volatile com.google.protobuf.f3<e> PARSER;
    private String id_ = "";
    private String issuer_ = "";
    private String jwksUri_ = "";
    private String audiences_ = "";
    private String authorizationUrl_ = "";
    private com.google.protobuf.s1.k<f1> jwtLocations_ = com.google.protobuf.l1.Ij();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116197a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f116197a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116197a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116197a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116197a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116197a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116197a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116197a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1.b<e, b> implements f {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.api.f
        public String G7() {
            return ((e) this.f126038b).G7();
        }

        @Override // com.google.api.f
        public String K9() {
            return ((e) this.f126038b).K9();
        }

        public b Ol(Iterable<? extends f1> iterable) {
            El();
            ((e) this.f126038b).vm(iterable);
            return this;
        }

        public b Pl(int i10, f1.b bVar) {
            El();
            ((e) this.f126038b).wm(i10, bVar.build());
            return this;
        }

        public b Ql(int i10, f1 f1Var) {
            El();
            ((e) this.f126038b).wm(i10, f1Var);
            return this;
        }

        public b Rl(f1.b bVar) {
            El();
            ((e) this.f126038b).xm(bVar.build());
            return this;
        }

        @Override // com.google.api.f
        public String S9() {
            return ((e) this.f126038b).S9();
        }

        public b Sl(f1 f1Var) {
            El();
            ((e) this.f126038b).xm(f1Var);
            return this;
        }

        public b Tl() {
            El();
            ((e) this.f126038b).ym();
            return this;
        }

        public b Ul() {
            El();
            ((e) this.f126038b).zm();
            return this;
        }

        public b Vl() {
            El();
            ((e) this.f126038b).Am();
            return this;
        }

        public b Wl() {
            El();
            ((e) this.f126038b).Bm();
            return this;
        }

        @Override // com.google.api.f
        public int Xf() {
            return ((e) this.f126038b).Xf();
        }

        public b Xl() {
            El();
            ((e) this.f126038b).Cm();
            return this;
        }

        public b Yl() {
            El();
            ((e) this.f126038b).Dm();
            return this;
        }

        public b Zl(int i10) {
            El();
            ((e) this.f126038b).Xm(i10);
            return this;
        }

        public b am(String str) {
            El();
            ((e) this.f126038b).Ym(str);
            return this;
        }

        @Override // com.google.api.f
        public com.google.protobuf.u b5() {
            return ((e) this.f126038b).b5();
        }

        public b bm(com.google.protobuf.u uVar) {
            El();
            ((e) this.f126038b).Zm(uVar);
            return this;
        }

        @Override // com.google.api.f
        public com.google.protobuf.u cb() {
            return ((e) this.f126038b).cb();
        }

        public b cm(String str) {
            El();
            ((e) this.f126038b).an(str);
            return this;
        }

        public b dm(com.google.protobuf.u uVar) {
            El();
            ((e) this.f126038b).bn(uVar);
            return this;
        }

        @Override // com.google.api.f
        public String ee() {
            return ((e) this.f126038b).ee();
        }

        public b em(String str) {
            El();
            ((e) this.f126038b).cn(str);
            return this;
        }

        public b fm(com.google.protobuf.u uVar) {
            El();
            ((e) this.f126038b).dn(uVar);
            return this;
        }

        @Override // com.google.api.f
        public String getId() {
            return ((e) this.f126038b).getId();
        }

        public b gm(String str) {
            El();
            ((e) this.f126038b).en(str);
            return this;
        }

        public b hm(com.google.protobuf.u uVar) {
            El();
            ((e) this.f126038b).fn(uVar);
            return this;
        }

        public b im(String str) {
            El();
            ((e) this.f126038b).gn(str);
            return this;
        }

        public b jm(com.google.protobuf.u uVar) {
            El();
            ((e) this.f126038b).hn(uVar);
            return this;
        }

        public b km(int i10, f1.b bVar) {
            El();
            ((e) this.f126038b).in(i10, bVar.build());
            return this;
        }

        public b lm(int i10, f1 f1Var) {
            El();
            ((e) this.f126038b).in(i10, f1Var);
            return this;
        }

        @Override // com.google.api.f
        public com.google.protobuf.u p9() {
            return ((e) this.f126038b).p9();
        }

        @Override // com.google.api.f
        public List<f1> pg() {
            return Collections.unmodifiableList(((e) this.f126038b).pg());
        }

        @Override // com.google.api.f
        public com.google.protobuf.u qg() {
            return ((e) this.f126038b).qg();
        }

        @Override // com.google.api.f
        public f1 ue(int i10) {
            return ((e) this.f126038b).ue(i10);
        }

        @Override // com.google.api.f
        public com.google.protobuf.u v0() {
            return ((e) this.f126038b).v0();
        }

        private b() {
            super(e.DEFAULT_INSTANCE);
        }
    }

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        com.google.protobuf.l1.Wl(e.class, eVar);
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Am() {
        this.id_ = Fm().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bm() {
        this.issuer_ = Fm().ee();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Cm() {
        this.jwksUri_ = Fm().K9();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dm() {
        this.jwtLocations_ = com.google.protobuf.l1.Ij();
    }

    private void Em() {
        com.google.protobuf.s1.k<f1> kVar = this.jwtLocations_;
        if (kVar.s1()) {
            return;
        }
        this.jwtLocations_ = com.google.protobuf.l1.yl(kVar);
    }

    public static e Fm() {
        return DEFAULT_INSTANCE;
    }

    public static b Im() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b Jm(e eVar) {
        return DEFAULT_INSTANCE.Uf(eVar);
    }

    public static e Km(InputStream inputStream) throws IOException {
        return (e) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static e Lm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (e) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static e Mm(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (e) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static e Nm(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (e) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static e Om(com.google.protobuf.z zVar) throws IOException {
        return (e) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static e Pm(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (e) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static e Qm(InputStream inputStream) throws IOException {
        return (e) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static e Rm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (e) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static e Sm(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (e) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static e Tm(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (e) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static e Um(byte[] bArr) throws com.google.protobuf.t1 {
        return (e) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static e Vm(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (e) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static com.google.protobuf.f3<e> Wm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Xm(int i10) {
        Em();
        this.jwtLocations_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Ym(String str) {
        str.getClass();
        this.audiences_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Zm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.audiences_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void an(String str) {
        str.getClass();
        this.authorizationUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bn(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.authorizationUrl_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cn(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dn(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.id_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void en(String str) {
        str.getClass();
        this.issuer_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fn(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.issuer_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gn(String str) {
        str.getClass();
        this.jwksUri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.jwksUri_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void in(int i10, f1 f1Var) {
        f1Var.getClass();
        Em();
        this.jwtLocations_.set(i10, f1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vm(Iterable<? extends f1> iterable) {
        Em();
        com.google.protobuf.a.y(iterable, this.jwtLocations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wm(int i10, f1 f1Var) {
        f1Var.getClass();
        Em();
        this.jwtLocations_.add(i10, f1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xm(f1 f1Var) {
        f1Var.getClass();
        Em();
        this.jwtLocations_.add(f1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ym() {
        this.audiences_ = Fm().G7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zm() {
        this.authorizationUrl_ = Fm().S9();
    }

    @Override // com.google.api.f
    public String G7() {
        return this.audiences_;
    }

    public g1 Gm(int i10) {
        return this.jwtLocations_.get(i10);
    }

    public List<? extends g1> Hm() {
        return this.jwtLocations_;
    }

    @Override // com.google.api.f
    public String K9() {
        return this.jwksUri_;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        int i10 = a.f116197a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new e();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u001b", new Object[]{"id_", "issuer_", "jwksUri_", "audiences_", "authorizationUrl_", "jwtLocations_", f1.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f3<e> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (e.class) {
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

    @Override // com.google.api.f
    public String S9() {
        return this.authorizationUrl_;
    }

    @Override // com.google.api.f
    public int Xf() {
        return this.jwtLocations_.size();
    }

    @Override // com.google.api.f
    public com.google.protobuf.u b5() {
        return com.google.protobuf.u.C(this.audiences_);
    }

    @Override // com.google.api.f
    public com.google.protobuf.u cb() {
        return com.google.protobuf.u.C(this.jwksUri_);
    }

    @Override // com.google.api.f
    public String ee() {
        return this.issuer_;
    }

    @Override // com.google.api.f
    public String getId() {
        return this.id_;
    }

    @Override // com.google.api.f
    public com.google.protobuf.u p9() {
        return com.google.protobuf.u.C(this.authorizationUrl_);
    }

    @Override // com.google.api.f
    public List<f1> pg() {
        return this.jwtLocations_;
    }

    @Override // com.google.api.f
    public com.google.protobuf.u qg() {
        return com.google.protobuf.u.C(this.issuer_);
    }

    @Override // com.google.api.f
    public f1 ue(int i10) {
        return this.jwtLocations_.get(i10);
    }

    @Override // com.google.api.f
    public com.google.protobuf.u v0() {
        return com.google.protobuf.u.C(this.id_);
    }
}
