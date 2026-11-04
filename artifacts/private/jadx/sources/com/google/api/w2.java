package com.google.api;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class w2 extends com.google.protobuf.l1<w2, b> implements x2 {
    private static final w2 DEFAULT_INSTANCE;
    public static final int HISTORY_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_FIELD_NUMBER = 3;
    private static volatile com.google.protobuf.f3<w2> PARSER = null;
    public static final int PATTERN_FIELD_NUMBER = 2;
    public static final int PLURAL_FIELD_NUMBER = 5;
    public static final int SINGULAR_FIELD_NUMBER = 6;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int history_;
    private String type_ = "";
    private com.google.protobuf.s1.k<String> pattern_ = com.google.protobuf.l1.Ij();
    private String nameField_ = "";
    private String plural_ = "";
    private String singular_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116393a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f116393a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116393a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116393a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116393a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116393a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116393a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116393a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1.b<w2, b> implements x2 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.api.x2
        public String Cb() {
            return ((w2) this.f126038b).Cb();
        }

        @Override // com.google.api.x2
        public String Jb() {
            return ((w2) this.f126038b).Jb();
        }

        public b Ol(Iterable<String> iterable) {
            El();
            ((w2) this.f126038b).um(iterable);
            return this;
        }

        public b Pl(String str) {
            El();
            ((w2) this.f126038b).vm(str);
            return this;
        }

        @Override // com.google.api.x2
        public int Qi() {
            return ((w2) this.f126038b).Qi();
        }

        public b Ql(com.google.protobuf.u uVar) {
            El();
            ((w2) this.f126038b).wm(uVar);
            return this;
        }

        public b Rl() {
            El();
            ((w2) this.f126038b).xm();
            return this;
        }

        public b Sl() {
            El();
            ((w2) this.f126038b).ym();
            return this;
        }

        public b Tl() {
            El();
            ((w2) this.f126038b).zm();
            return this;
        }

        public b Ul() {
            El();
            ((w2) this.f126038b).Am();
            return this;
        }

        public b Vl() {
            El();
            ((w2) this.f126038b).Bm();
            return this;
        }

        @Override // com.google.api.x2
        public List<String> Wi() {
            return Collections.unmodifiableList(((w2) this.f126038b).Wi());
        }

        @Override // com.google.api.x2
        public com.google.protobuf.u Wk(int i10) {
            return ((w2) this.f126038b).Wk(i10);
        }

        public b Wl() {
            El();
            ((w2) this.f126038b).Cm();
            return this;
        }

        public b Xl(c cVar) {
            El();
            ((w2) this.f126038b).Um(cVar);
            return this;
        }

        public b Yl(int i10) {
            El();
            ((w2) this.f126038b).Vm(i10);
            return this;
        }

        public b Zl(String str) {
            El();
            ((w2) this.f126038b).Wm(str);
            return this;
        }

        @Override // com.google.api.x2
        public c a6() {
            return ((w2) this.f126038b).a6();
        }

        public b am(com.google.protobuf.u uVar) {
            El();
            ((w2) this.f126038b).Xm(uVar);
            return this;
        }

        public b bm(int i10, String str) {
            El();
            ((w2) this.f126038b).Ym(i10, str);
            return this;
        }

        @Override // com.google.api.x2
        public String c() {
            return ((w2) this.f126038b).c();
        }

        public b cm(String str) {
            El();
            ((w2) this.f126038b).Zm(str);
            return this;
        }

        public b dm(com.google.protobuf.u uVar) {
            El();
            ((w2) this.f126038b).an(uVar);
            return this;
        }

        public b em(String str) {
            El();
            ((w2) this.f126038b).bn(str);
            return this;
        }

        public b fm(com.google.protobuf.u uVar) {
            El();
            ((w2) this.f126038b).cn(uVar);
            return this;
        }

        @Override // com.google.api.x2
        public com.google.protobuf.u gg() {
            return ((w2) this.f126038b).gg();
        }

        public b gm(String str) {
            El();
            ((w2) this.f126038b).dn(str);
            return this;
        }

        public b hm(com.google.protobuf.u uVar) {
            El();
            ((w2) this.f126038b).en(uVar);
            return this;
        }

        @Override // com.google.api.x2
        public com.google.protobuf.u s() {
            return ((w2) this.f126038b).s();
        }

        @Override // com.google.api.x2
        public String td(int i10) {
            return ((w2) this.f126038b).td(i10);
        }

        @Override // com.google.api.x2
        public com.google.protobuf.u uc() {
            return ((w2) this.f126038b).uc();
        }

        @Override // com.google.api.x2
        public int wj() {
            return ((w2) this.f126038b).wj();
        }

        @Override // com.google.api.x2
        public com.google.protobuf.u xf() {
            return ((w2) this.f126038b).xf();
        }

        @Override // com.google.api.x2
        public String zf() {
            return ((w2) this.f126038b).zf();
        }

        private b() {
            super(w2.DEFAULT_INSTANCE);
        }
    }

    public enum c implements com.google.protobuf.s1.c {
        HISTORY_UNSPECIFIED(0),
        ORIGINALLY_SINGLE_PATTERN(1),
        FUTURE_MULTI_PATTERN(2),
        UNRECOGNIZED(-1);


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f116398f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f116399g = 1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f116400h = 2;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final com.google.protobuf.s1.d<c> f116401i = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f116403a;

        class a implements com.google.protobuf.s1.d<c> {
            a() {
            }

            @Override // com.google.protobuf.s1.d
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c a(int i10) {
                return c.l(i10);
            }
        }

        private static final class b implements com.google.protobuf.s1.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final com.google.protobuf.s1.e f116404a = new b();

            private b() {
            }

            @Override // com.google.protobuf.s1.e
            public boolean a(int i10) {
                return c.l(i10) != null;
            }
        }

        c(int i10) {
            this.f116403a = i10;
        }

        public static c l(int i10) {
            if (i10 == 0) {
                return HISTORY_UNSPECIFIED;
            }
            if (i10 == 1) {
                return ORIGINALLY_SINGLE_PATTERN;
            }
            if (i10 != 2) {
                return null;
            }
            return FUTURE_MULTI_PATTERN;
        }

        public static com.google.protobuf.s1.d<c> n() {
            return f116401i;
        }

        public static com.google.protobuf.s1.e o() {
            return b.f116404a;
        }

        @Deprecated
        public static c p(int i10) {
            return l(i10);
        }

        @Override // com.google.protobuf.s1.c
        public final int i() {
            if (this != UNRECOGNIZED) {
                return this.f116403a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        w2 w2Var = new w2();
        DEFAULT_INSTANCE = w2Var;
        com.google.protobuf.l1.Wl(w2.class, w2Var);
    }

    private w2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Am() {
        this.plural_ = Em().Cb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bm() {
        this.singular_ = Em().Jb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Cm() {
        this.type_ = Em().c();
    }

    private void Dm() {
        com.google.protobuf.s1.k<String> kVar = this.pattern_;
        if (kVar.s1()) {
            return;
        }
        this.pattern_ = com.google.protobuf.l1.yl(kVar);
    }

    public static w2 Em() {
        return DEFAULT_INSTANCE;
    }

    public static b Fm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b Gm(w2 w2Var) {
        return DEFAULT_INSTANCE.Uf(w2Var);
    }

    public static w2 Hm(InputStream inputStream) throws IOException {
        return (w2) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static w2 Im(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (w2) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static w2 Jm(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (w2) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static w2 Km(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (w2) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static w2 Lm(com.google.protobuf.z zVar) throws IOException {
        return (w2) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static w2 Mm(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (w2) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static w2 Nm(InputStream inputStream) throws IOException {
        return (w2) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static w2 Om(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (w2) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static w2 Pm(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (w2) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static w2 Qm(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (w2) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static w2 Rm(byte[] bArr) throws com.google.protobuf.t1 {
        return (w2) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static w2 Sm(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (w2) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static com.google.protobuf.f3<w2> Tm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Um(c cVar) {
        this.history_ = cVar.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Vm(int i10) {
        this.history_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Wm(String str) {
        str.getClass();
        this.nameField_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Xm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.nameField_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Ym(int i10, String str) {
        str.getClass();
        Dm();
        this.pattern_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Zm(String str) {
        str.getClass();
        this.plural_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void an(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.plural_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bn(String str) {
        str.getClass();
        this.singular_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cn(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.singular_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dn(String str) {
        str.getClass();
        this.type_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void en(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.type_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void um(Iterable<String> iterable) {
        Dm();
        com.google.protobuf.a.y(iterable, this.pattern_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vm(String str) {
        str.getClass();
        Dm();
        this.pattern_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        Dm();
        this.pattern_.add(uVar.z0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xm() {
        this.history_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ym() {
        this.nameField_ = Em().zf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zm() {
        this.pattern_ = com.google.protobuf.l1.Ij();
    }

    @Override // com.google.api.x2
    public String Cb() {
        return this.plural_;
    }

    @Override // com.google.api.x2
    public String Jb() {
        return this.singular_;
    }

    @Override // com.google.api.x2
    public int Qi() {
        return this.history_;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        int i10 = a.f116393a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new w2();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003Ȉ\u0004\f\u0005Ȉ\u0006Ȉ", new Object[]{"type_", "pattern_", "nameField_", "history_", "plural_", "singular_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f3<w2> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (w2.class) {
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

    @Override // com.google.api.x2
    public List<String> Wi() {
        return this.pattern_;
    }

    @Override // com.google.api.x2
    public com.google.protobuf.u Wk(int i10) {
        return com.google.protobuf.u.C(this.pattern_.get(i10));
    }

    @Override // com.google.api.x2
    public c a6() {
        c cVarL = c.l(this.history_);
        return cVarL == null ? c.UNRECOGNIZED : cVarL;
    }

    @Override // com.google.api.x2
    public String c() {
        return this.type_;
    }

    @Override // com.google.api.x2
    public com.google.protobuf.u gg() {
        return com.google.protobuf.u.C(this.plural_);
    }

    @Override // com.google.api.x2
    public com.google.protobuf.u s() {
        return com.google.protobuf.u.C(this.type_);
    }

    @Override // com.google.api.x2
    public String td(int i10) {
        return this.pattern_.get(i10);
    }

    @Override // com.google.api.x2
    public com.google.protobuf.u uc() {
        return com.google.protobuf.u.C(this.singular_);
    }

    @Override // com.google.api.x2
    public int wj() {
        return this.pattern_.size();
    }

    @Override // com.google.api.x2
    public com.google.protobuf.u xf() {
        return com.google.protobuf.u.C(this.nameField_);
    }

    @Override // com.google.api.x2
    public String zf() {
        return this.nameField_;
    }
}
