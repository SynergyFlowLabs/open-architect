package com.google.api;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends com.google.protobuf.l1<k, b> implements l {
    public static final int ALLOW_WITHOUT_CREDENTIAL_FIELD_NUMBER = 5;
    private static final k DEFAULT_INSTANCE;
    public static final int OAUTH_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.f3<k> PARSER = null;
    public static final int REQUIREMENTS_FIELD_NUMBER = 7;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private boolean allowWithoutCredential_;
    private int bitField0_;
    private j2 oauth_;
    private String selector_ = "";
    private com.google.protobuf.s1.k<g> requirements_ = com.google.protobuf.l1.Ij();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116224a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f116224a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116224a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116224a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116224a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116224a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116224a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116224a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1.b<k, b> implements l {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.api.l
        public String A() {
            return ((k) this.f126038b).A();
        }

        @Override // com.google.api.l
        public com.google.protobuf.u B() {
            return ((k) this.f126038b).B();
        }

        @Override // com.google.api.l
        public j2 Kg() {
            return ((k) this.f126038b).Kg();
        }

        public b Ol(Iterable<? extends g> iterable) {
            El();
            ((k) this.f126038b).om(iterable);
            return this;
        }

        public b Pl(int i10, g.b bVar) {
            El();
            ((k) this.f126038b).pm(i10, bVar.build());
            return this;
        }

        public b Ql(int i10, g gVar) {
            El();
            ((k) this.f126038b).pm(i10, gVar);
            return this;
        }

        public b Rl(g.b bVar) {
            El();
            ((k) this.f126038b).qm(bVar.build());
            return this;
        }

        public b Sl(g gVar) {
            El();
            ((k) this.f126038b).qm(gVar);
            return this;
        }

        public b Tl() {
            El();
            ((k) this.f126038b).rm();
            return this;
        }

        public b Ul() {
            El();
            ((k) this.f126038b).sm();
            return this;
        }

        public b Vl() {
            El();
            ((k) this.f126038b).tm();
            return this;
        }

        public b Wl() {
            El();
            ((k) this.f126038b).um();
            return this;
        }

        public b Xl(j2 j2Var) {
            El();
            ((k) this.f126038b).zm(j2Var);
            return this;
        }

        public b Yl(int i10) {
            El();
            ((k) this.f126038b).Pm(i10);
            return this;
        }

        public b Zl(boolean z10) {
            El();
            ((k) this.f126038b).Qm(z10);
            return this;
        }

        @Override // com.google.api.l
        public boolean ag() {
            return ((k) this.f126038b).ag();
        }

        public b am(j2.b bVar) {
            El();
            ((k) this.f126038b).Rm(bVar.build());
            return this;
        }

        public b bm(j2 j2Var) {
            El();
            ((k) this.f126038b).Rm(j2Var);
            return this;
        }

        public b cm(int i10, g.b bVar) {
            El();
            ((k) this.f126038b).Sm(i10, bVar.build());
            return this;
        }

        public b dm(int i10, g gVar) {
            El();
            ((k) this.f126038b).Sm(i10, gVar);
            return this;
        }

        public b em(String str) {
            El();
            ((k) this.f126038b).Tm(str);
            return this;
        }

        public b fm(com.google.protobuf.u uVar) {
            El();
            ((k) this.f126038b).Um(uVar);
            return this;
        }

        @Override // com.google.api.l
        public int o2() {
            return ((k) this.f126038b).o2();
        }

        @Override // com.google.api.l
        public List<g> r5() {
            return Collections.unmodifiableList(((k) this.f126038b).r5());
        }

        @Override // com.google.api.l
        public boolean wi() {
            return ((k) this.f126038b).wi();
        }

        @Override // com.google.api.l
        public g y5(int i10) {
            return ((k) this.f126038b).y5(i10);
        }

        private b() {
            super(k.DEFAULT_INSTANCE);
        }
    }

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        com.google.protobuf.l1.Wl(k.class, kVar);
    }

    private k() {
    }

    public static b Am() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b Bm(k kVar) {
        return DEFAULT_INSTANCE.Uf(kVar);
    }

    public static k Cm(InputStream inputStream) throws IOException {
        return (k) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static k Dm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (k) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static k Em(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (k) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static k Fm(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (k) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static k Gm(com.google.protobuf.z zVar) throws IOException {
        return (k) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static k Hm(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (k) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static k Im(InputStream inputStream) throws IOException {
        return (k) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static k Jm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (k) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static k Km(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (k) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static k Lm(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (k) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static k Mm(byte[] bArr) throws com.google.protobuf.t1 {
        return (k) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static k Nm(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (k) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static com.google.protobuf.f3<k> Om() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Pm(int i10) {
        vm();
        this.requirements_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qm(boolean z10) {
        this.allowWithoutCredential_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Rm(j2 j2Var) {
        j2Var.getClass();
        this.oauth_ = j2Var;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sm(int i10, g gVar) {
        gVar.getClass();
        vm();
        this.requirements_.set(i10, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Tm(String str) {
        str.getClass();
        this.selector_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Um(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.selector_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void om(Iterable<? extends g> iterable) {
        vm();
        com.google.protobuf.a.y(iterable, this.requirements_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pm(int i10, g gVar) {
        gVar.getClass();
        vm();
        this.requirements_.add(i10, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qm(g gVar) {
        gVar.getClass();
        vm();
        this.requirements_.add(gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rm() {
        this.allowWithoutCredential_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sm() {
        this.oauth_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tm() {
        this.requirements_ = com.google.protobuf.l1.Ij();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void um() {
        this.selector_ = wm().A();
    }

    private void vm() {
        com.google.protobuf.s1.k<g> kVar = this.requirements_;
        if (kVar.s1()) {
            return;
        }
        this.requirements_ = com.google.protobuf.l1.yl(kVar);
    }

    public static k wm() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zm(j2 j2Var) {
        j2Var.getClass();
        j2 j2Var2 = this.oauth_;
        if (j2Var2 == null || j2Var2 == j2.em()) {
            this.oauth_ = j2Var;
        } else {
            this.oauth_ = j2.gm(this.oauth_).Jl(j2Var).B1();
        }
        this.bitField0_ |= 1;
    }

    @Override // com.google.api.l
    public String A() {
        return this.selector_;
    }

    @Override // com.google.api.l
    public com.google.protobuf.u B() {
        return com.google.protobuf.u.C(this.selector_);
    }

    @Override // com.google.api.l
    public j2 Kg() {
        j2 j2Var = this.oauth_;
        return j2Var == null ? j2.em() : j2Var;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        int i10 = a.f116224a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new k();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0005\u0007\u0007\u001b", new Object[]{"bitField0_", "selector_", "oauth_", "allowWithoutCredential_", "requirements_", g.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f3<k> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (k.class) {
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

    @Override // com.google.api.l
    public boolean ag() {
        return this.allowWithoutCredential_;
    }

    @Override // com.google.api.l
    public int o2() {
        return this.requirements_.size();
    }

    @Override // com.google.api.l
    public List<g> r5() {
        return this.requirements_;
    }

    @Override // com.google.api.l
    public boolean wi() {
        return (this.bitField0_ & 1) != 0;
    }

    public h xm(int i10) {
        return this.requirements_.get(i10);
    }

    @Override // com.google.api.l
    public g y5(int i10) {
        return this.requirements_.get(i10);
    }

    public List<? extends h> ym() {
        return this.requirements_;
    }
}
