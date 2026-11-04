package com.google.api;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends com.google.protobuf.l1<i, b> implements j {
    private static final i DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.f3<i> PARSER = null;
    public static final int PROVIDERS_FIELD_NUMBER = 4;
    public static final int RULES_FIELD_NUMBER = 3;
    private com.google.protobuf.s1.k<k> rules_ = com.google.protobuf.l1.Ij();
    private com.google.protobuf.s1.k<e> providers_ = com.google.protobuf.l1.Ij();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116221a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f116221a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116221a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int i10 = 1 << 3;
                f116221a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116221a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116221a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116221a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116221a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1.b<i, b> implements j {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.api.j
        public k F(int i10) {
            return ((i) this.f126038b).F(i10);
        }

        @Override // com.google.api.j
        public int G() {
            return ((i) this.f126038b).G();
        }

        @Override // com.google.api.j
        public List<k> H() {
            return Collections.unmodifiableList(((i) this.f126038b).H());
        }

        @Override // com.google.api.j
        public List<e> Ok() {
            return Collections.unmodifiableList(((i) this.f126038b).Ok());
        }

        public b Ol(Iterable<? extends e> iterable) {
            El();
            ((i) this.f126038b).mm(iterable);
            return this;
        }

        public b Pl(Iterable<? extends k> iterable) {
            El();
            ((i) this.f126038b).nm(iterable);
            return this;
        }

        public b Ql(int i10, e.b bVar) {
            El();
            ((i) this.f126038b).om(i10, bVar.build());
            return this;
        }

        public b Rl(int i10, e eVar) {
            El();
            ((i) this.f126038b).om(i10, eVar);
            return this;
        }

        public b Sl(e.b bVar) {
            El();
            ((i) this.f126038b).pm(bVar.build());
            return this;
        }

        public b Tl(e eVar) {
            El();
            ((i) this.f126038b).pm(eVar);
            return this;
        }

        public b Ul(int i10, k.b bVar) {
            El();
            ((i) this.f126038b).qm(i10, bVar.build());
            return this;
        }

        public b Vl(int i10, k kVar) {
            El();
            ((i) this.f126038b).qm(i10, kVar);
            return this;
        }

        public b Wl(k.b bVar) {
            El();
            ((i) this.f126038b).rm(bVar.build());
            return this;
        }

        public b Xl(k kVar) {
            El();
            ((i) this.f126038b).rm(kVar);
            return this;
        }

        public b Yl() {
            El();
            ((i) this.f126038b).sm();
            return this;
        }

        public b Zl() {
            El();
            ((i) this.f126038b).tm();
            return this;
        }

        public b am(int i10) {
            El();
            ((i) this.f126038b).Qm(i10);
            return this;
        }

        public b bm(int i10) {
            El();
            ((i) this.f126038b).Rm(i10);
            return this;
        }

        @Override // com.google.api.j
        public e cg(int i10) {
            return ((i) this.f126038b).cg(i10);
        }

        public b cm(int i10, e.b bVar) {
            El();
            ((i) this.f126038b).Sm(i10, bVar.build());
            return this;
        }

        public b dm(int i10, e eVar) {
            El();
            ((i) this.f126038b).Sm(i10, eVar);
            return this;
        }

        public b em(int i10, k.b bVar) {
            El();
            ((i) this.f126038b).Tm(i10, bVar.build());
            return this;
        }

        public b fm(int i10, k kVar) {
            El();
            ((i) this.f126038b).Tm(i10, kVar);
            return this;
        }

        @Override // com.google.api.j
        public int vk() {
            return ((i) this.f126038b).vk();
        }

        private b() {
            super(i.DEFAULT_INSTANCE);
        }
    }

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        com.google.protobuf.l1.Wl(i.class, iVar);
    }

    private i() {
    }

    public static b Bm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b Cm(i iVar) {
        return DEFAULT_INSTANCE.Uf(iVar);
    }

    public static i Dm(InputStream inputStream) throws IOException {
        return (i) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static i Em(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (i) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static i Fm(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (i) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static i Gm(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (i) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static i Hm(com.google.protobuf.z zVar) throws IOException {
        return (i) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static i Im(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (i) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static i Jm(InputStream inputStream) throws IOException {
        return (i) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static i Km(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (i) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static i Lm(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (i) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static i Mm(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (i) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static i Nm(byte[] bArr) throws com.google.protobuf.t1 {
        return (i) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static i Om(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (i) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static com.google.protobuf.f3<i> Pm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qm(int i10) {
        um();
        this.providers_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Rm(int i10) {
        vm();
        this.rules_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sm(int i10, e eVar) {
        eVar.getClass();
        um();
        this.providers_.set(i10, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Tm(int i10, k kVar) {
        kVar.getClass();
        vm();
        this.rules_.set(i10, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mm(Iterable<? extends e> iterable) {
        um();
        com.google.protobuf.a.y(iterable, this.providers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nm(Iterable<? extends k> iterable) {
        vm();
        com.google.protobuf.a.y(iterable, this.rules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void om(int i10, e eVar) {
        eVar.getClass();
        um();
        this.providers_.add(i10, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pm(e eVar) {
        eVar.getClass();
        um();
        this.providers_.add(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qm(int i10, k kVar) {
        kVar.getClass();
        vm();
        this.rules_.add(i10, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rm(k kVar) {
        kVar.getClass();
        vm();
        this.rules_.add(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sm() {
        this.providers_ = com.google.protobuf.l1.Ij();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tm() {
        this.rules_ = com.google.protobuf.l1.Ij();
    }

    private void um() {
        com.google.protobuf.s1.k<e> kVar = this.providers_;
        if (!kVar.s1()) {
            this.providers_ = com.google.protobuf.l1.yl(kVar);
        }
    }

    private void vm() {
        com.google.protobuf.s1.k<k> kVar = this.rules_;
        if (kVar.s1()) {
            return;
        }
        this.rules_ = com.google.protobuf.l1.yl(kVar);
    }

    public static i wm() {
        return DEFAULT_INSTANCE;
    }

    public List<? extends l> Am() {
        return this.rules_;
    }

    @Override // com.google.api.j
    public k F(int i10) {
        return this.rules_.get(i10);
    }

    @Override // com.google.api.j
    public int G() {
        return this.rules_.size();
    }

    @Override // com.google.api.j
    public List<k> H() {
        return this.rules_;
    }

    @Override // com.google.api.j
    public List<e> Ok() {
        return this.providers_;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        int i10 = a.f116221a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new i();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0002\u0000\u0003\u001b\u0004\u001b", new Object[]{"rules_", k.class, "providers_", e.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f3<i> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (i.class) {
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

    @Override // com.google.api.j
    public e cg(int i10) {
        return this.providers_.get(i10);
    }

    @Override // com.google.api.j
    public int vk() {
        return this.providers_.size();
    }

    public f xm(int i10) {
        return this.providers_.get(i10);
    }

    public List<? extends f> ym() {
        return this.providers_;
    }

    public l zm(int i10) {
        return this.rules_.get(i10);
    }
}
