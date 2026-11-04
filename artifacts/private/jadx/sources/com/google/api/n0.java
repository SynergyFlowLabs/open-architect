package com.google.api;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 extends com.google.protobuf.l1<n0, b> implements o0 {
    private static final n0 DEFAULT_INSTANCE;
    public static final int DOCUMENTATION_ROOT_URL_FIELD_NUMBER = 4;
    public static final int OVERVIEW_FIELD_NUMBER = 2;
    public static final int PAGES_FIELD_NUMBER = 5;
    private static volatile com.google.protobuf.f3<n0> PARSER = null;
    public static final int RULES_FIELD_NUMBER = 3;
    public static final int SUMMARY_FIELD_NUMBER = 1;
    private String summary_ = "";
    private com.google.protobuf.s1.k<l2> pages_ = com.google.protobuf.l1.Ij();
    private com.google.protobuf.s1.k<q0> rules_ = com.google.protobuf.l1.Ij();
    private String documentationRootUrl_ = "";
    private String overview_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116254a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f116254a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116254a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116254a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116254a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116254a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116254a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116254a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1.b<n0, b> implements o0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.api.o0
        public String Ad() {
            return ((n0) this.f126038b).Ad();
        }

        @Override // com.google.api.o0
        public q0 F(int i10) {
            return ((n0) this.f126038b).F(i10);
        }

        @Override // com.google.api.o0
        public int G() {
            return ((n0) this.f126038b).G();
        }

        @Override // com.google.api.o0
        public List<q0> H() {
            return Collections.unmodifiableList(((n0) this.f126038b).H());
        }

        @Override // com.google.api.o0
        public l2 Kc(int i10) {
            return ((n0) this.f126038b).Kc(i10);
        }

        public b Ol(Iterable<? extends l2> iterable) {
            El();
            ((n0) this.f126038b).vm(iterable);
            return this;
        }

        public b Pl(Iterable<? extends q0> iterable) {
            El();
            ((n0) this.f126038b).wm(iterable);
            return this;
        }

        public b Ql(int i10, l2.b bVar) {
            El();
            ((n0) this.f126038b).xm(i10, bVar.build());
            return this;
        }

        public b Rl(int i10, l2 l2Var) {
            El();
            ((n0) this.f126038b).xm(i10, l2Var);
            return this;
        }

        public b Sl(l2.b bVar) {
            El();
            ((n0) this.f126038b).ym(bVar.build());
            return this;
        }

        public b Tl(l2 l2Var) {
            El();
            ((n0) this.f126038b).ym(l2Var);
            return this;
        }

        public b Ul(int i10, q0.b bVar) {
            El();
            ((n0) this.f126038b).zm(i10, bVar.build());
            return this;
        }

        public b Vl(int i10, q0 q0Var) {
            El();
            ((n0) this.f126038b).zm(i10, q0Var);
            return this;
        }

        @Override // com.google.api.o0
        public String W9() {
            return ((n0) this.f126038b).W9();
        }

        public b Wl(q0.b bVar) {
            El();
            ((n0) this.f126038b).Am(bVar.build());
            return this;
        }

        public b Xl(q0 q0Var) {
            El();
            ((n0) this.f126038b).Am(q0Var);
            return this;
        }

        @Override // com.google.api.o0
        public String Ya() {
            return ((n0) this.f126038b).Ya();
        }

        public b Yl() {
            El();
            ((n0) this.f126038b).Bm();
            return this;
        }

        public b Zl() {
            El();
            ((n0) this.f126038b).Cm();
            return this;
        }

        public b am() {
            El();
            ((n0) this.f126038b).Dm();
            return this;
        }

        @Override // com.google.api.o0
        public List<l2> bi() {
            return Collections.unmodifiableList(((n0) this.f126038b).bi());
        }

        public b bm() {
            El();
            ((n0) this.f126038b).Em();
            return this;
        }

        @Override // com.google.api.o0
        public com.google.protobuf.u ck() {
            return ((n0) this.f126038b).ck();
        }

        public b cm() {
            El();
            ((n0) this.f126038b).Fm();
            return this;
        }

        public b dm(int i10) {
            El();
            ((n0) this.f126038b).cn(i10);
            return this;
        }

        public b em(int i10) {
            El();
            ((n0) this.f126038b).dn(i10);
            return this;
        }

        public b fm(String str) {
            El();
            ((n0) this.f126038b).en(str);
            return this;
        }

        public b gm(com.google.protobuf.u uVar) {
            El();
            ((n0) this.f126038b).fn(uVar);
            return this;
        }

        public b hm(String str) {
            El();
            ((n0) this.f126038b).gn(str);
            return this;
        }

        public b im(com.google.protobuf.u uVar) {
            El();
            ((n0) this.f126038b).hn(uVar);
            return this;
        }

        public b jm(int i10, l2.b bVar) {
            El();
            ((n0) this.f126038b).in(i10, bVar.build());
            return this;
        }

        public b km(int i10, l2 l2Var) {
            El();
            ((n0) this.f126038b).in(i10, l2Var);
            return this;
        }

        public b lm(int i10, q0.b bVar) {
            El();
            ((n0) this.f126038b).jn(i10, bVar.build());
            return this;
        }

        @Override // com.google.api.o0
        public com.google.protobuf.u m9() {
            return ((n0) this.f126038b).m9();
        }

        public b mm(int i10, q0 q0Var) {
            El();
            ((n0) this.f126038b).jn(i10, q0Var);
            return this;
        }

        public b nm(String str) {
            El();
            ((n0) this.f126038b).kn(str);
            return this;
        }

        public b om(com.google.protobuf.u uVar) {
            El();
            ((n0) this.f126038b).ln(uVar);
            return this;
        }

        @Override // com.google.api.o0
        public com.google.protobuf.u rf() {
            return ((n0) this.f126038b).rf();
        }

        @Override // com.google.api.o0
        public int yj() {
            return ((n0) this.f126038b).yj();
        }

        private b() {
            super(n0.DEFAULT_INSTANCE);
        }
    }

    static {
        n0 n0Var = new n0();
        DEFAULT_INSTANCE = n0Var;
        com.google.protobuf.l1.Wl(n0.class, n0Var);
    }

    private n0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Am(q0 q0Var) {
        q0Var.getClass();
        Hm();
        this.rules_.add(q0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bm() {
        this.documentationRootUrl_ = Im().Ad();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Cm() {
        this.overview_ = Im().W9();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dm() {
        this.pages_ = com.google.protobuf.l1.Ij();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Em() {
        this.rules_ = com.google.protobuf.l1.Ij();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Fm() {
        this.summary_ = Im().Ya();
    }

    private void Gm() {
        com.google.protobuf.s1.k<l2> kVar = this.pages_;
        if (kVar.s1()) {
            return;
        }
        this.pages_ = com.google.protobuf.l1.yl(kVar);
    }

    private void Hm() {
        com.google.protobuf.s1.k<q0> kVar = this.rules_;
        if (kVar.s1()) {
            return;
        }
        this.rules_ = com.google.protobuf.l1.yl(kVar);
    }

    public static n0 Im() {
        return DEFAULT_INSTANCE;
    }

    public static b Nm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b Om(n0 n0Var) {
        return DEFAULT_INSTANCE.Uf(n0Var);
    }

    public static n0 Pm(InputStream inputStream) throws IOException {
        return (n0) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static n0 Qm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (n0) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static n0 Rm(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (n0) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static n0 Sm(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (n0) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static n0 Tm(com.google.protobuf.z zVar) throws IOException {
        return (n0) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static n0 Um(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (n0) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static n0 Vm(InputStream inputStream) throws IOException {
        return (n0) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static n0 Wm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (n0) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static n0 Xm(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (n0) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static n0 Ym(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (n0) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static n0 Zm(byte[] bArr) throws com.google.protobuf.t1 {
        return (n0) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static n0 an(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (n0) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static com.google.protobuf.f3<n0> bn() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cn(int i10) {
        Gm();
        this.pages_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dn(int i10) {
        Hm();
        this.rules_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void en(String str) {
        str.getClass();
        this.documentationRootUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fn(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.documentationRootUrl_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gn(String str) {
        str.getClass();
        this.overview_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.overview_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void in(int i10, l2 l2Var) {
        l2Var.getClass();
        Gm();
        this.pages_.set(i10, l2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jn(int i10, q0 q0Var) {
        q0Var.getClass();
        Hm();
        this.rules_.set(i10, q0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kn(String str) {
        str.getClass();
        this.summary_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ln(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.summary_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vm(Iterable<? extends l2> iterable) {
        Gm();
        com.google.protobuf.a.y(iterable, this.pages_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wm(Iterable<? extends q0> iterable) {
        Hm();
        com.google.protobuf.a.y(iterable, this.rules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xm(int i10, l2 l2Var) {
        l2Var.getClass();
        Gm();
        this.pages_.add(i10, l2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ym(l2 l2Var) {
        l2Var.getClass();
        Gm();
        this.pages_.add(l2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zm(int i10, q0 q0Var) {
        q0Var.getClass();
        Hm();
        this.rules_.add(i10, q0Var);
    }

    @Override // com.google.api.o0
    public String Ad() {
        return this.documentationRootUrl_;
    }

    @Override // com.google.api.o0
    public q0 F(int i10) {
        return this.rules_.get(i10);
    }

    @Override // com.google.api.o0
    public int G() {
        return this.rules_.size();
    }

    @Override // com.google.api.o0
    public List<q0> H() {
        return this.rules_;
    }

    public m2 Jm(int i10) {
        return this.pages_.get(i10);
    }

    @Override // com.google.api.o0
    public l2 Kc(int i10) {
        return this.pages_.get(i10);
    }

    public List<? extends m2> Km() {
        return this.pages_;
    }

    public r0 Lm(int i10) {
        return this.rules_.get(i10);
    }

    public List<? extends r0> Mm() {
        return this.rules_;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        int i10 = a.f116254a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new n0();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004Ȉ\u0005\u001b", new Object[]{"summary_", "overview_", "rules_", q0.class, "documentationRootUrl_", "pages_", l2.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f3<n0> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (n0.class) {
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

    @Override // com.google.api.o0
    public String W9() {
        return this.overview_;
    }

    @Override // com.google.api.o0
    public String Ya() {
        return this.summary_;
    }

    @Override // com.google.api.o0
    public List<l2> bi() {
        return this.pages_;
    }

    @Override // com.google.api.o0
    public com.google.protobuf.u ck() {
        return com.google.protobuf.u.C(this.documentationRootUrl_);
    }

    @Override // com.google.api.o0
    public com.google.protobuf.u m9() {
        return com.google.protobuf.u.C(this.overview_);
    }

    @Override // com.google.api.o0
    public com.google.protobuf.u rf() {
        return com.google.protobuf.u.C(this.summary_);
    }

    @Override // com.google.api.o0
    public int yj() {
        return this.pages_.size();
    }
}
