package com.google.api;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class d1 extends com.google.protobuf.l1<d1, b> implements e1 {
    public static final int ADDITIONAL_BINDINGS_FIELD_NUMBER = 11;
    public static final int BODY_FIELD_NUMBER = 7;
    public static final int CUSTOM_FIELD_NUMBER = 8;
    private static final d1 DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 5;
    public static final int GET_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.f3<d1> PARSER = null;
    public static final int PATCH_FIELD_NUMBER = 6;
    public static final int POST_FIELD_NUMBER = 4;
    public static final int PUT_FIELD_NUMBER = 3;
    public static final int RESPONSE_BODY_FIELD_NUMBER = 12;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private Object pattern_;
    private int patternCase_ = 0;
    private String selector_ = "";
    private String body_ = "";
    private String responseBody_ = "";
    private com.google.protobuf.s1.k<d1> additionalBindings_ = com.google.protobuf.l1.Ij();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116187a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f116187a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116187a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116187a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116187a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116187a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116187a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116187a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1.b<d1, b> implements e1 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.api.e1
        public String A() {
            return ((d1) this.f126038b).A();
        }

        @Override // com.google.api.e1
        public com.google.protobuf.u Ah() {
            return ((d1) this.f126038b).Ah();
        }

        @Override // com.google.api.e1
        public com.google.protobuf.u B() {
            return ((d1) this.f126038b).B();
        }

        @Override // com.google.api.e1
        public int B8() {
            return ((d1) this.f126038b).B8();
        }

        @Override // com.google.api.e1
        public boolean Fg() {
            return ((d1) this.f126038b).Fg();
        }

        @Override // com.google.api.e1
        public String Gd() {
            return ((d1) this.f126038b).Gd();
        }

        @Override // com.google.api.e1
        public com.google.protobuf.u Hd() {
            return ((d1) this.f126038b).Hd();
        }

        @Override // com.google.api.e1
        public com.google.protobuf.u Kj() {
            return ((d1) this.f126038b).Kj();
        }

        @Override // com.google.api.e1
        public d1 Na(int i10) {
            return ((d1) this.f126038b).Na(i10);
        }

        @Override // com.google.api.e1
        public String Of() {
            return ((d1) this.f126038b).Of();
        }

        @Override // com.google.api.e1
        public boolean Oj() {
            return ((d1) this.f126038b).Oj();
        }

        public b Ol(int i10, b bVar) {
            El();
            ((d1) this.f126038b).Im(i10, bVar.build());
            return this;
        }

        @Override // com.google.api.e1
        public boolean P8() {
            return ((d1) this.f126038b).P8();
        }

        public b Pl(int i10, d1 d1Var) {
            El();
            ((d1) this.f126038b).Im(i10, d1Var);
            return this;
        }

        public b Ql(b bVar) {
            El();
            ((d1) this.f126038b).Jm(bVar.build());
            return this;
        }

        public b Rl(d1 d1Var) {
            El();
            ((d1) this.f126038b).Jm(d1Var);
            return this;
        }

        public b Sl(Iterable<? extends d1> iterable) {
            El();
            ((d1) this.f126038b).Km(iterable);
            return this;
        }

        public b Tl() {
            El();
            ((d1) this.f126038b).Lm();
            return this;
        }

        public b Ul() {
            El();
            ((d1) this.f126038b).Mm();
            return this;
        }

        public b Vl() {
            El();
            ((d1) this.f126038b).Nm();
            return this;
        }

        public b Wl() {
            El();
            ((d1) this.f126038b).Om();
            return this;
        }

        public b Xl() {
            El();
            ((d1) this.f126038b).Pm();
            return this;
        }

        public b Yl() {
            El();
            ((d1) this.f126038b).Qm();
            return this;
        }

        public b Zl() {
            El();
            ((d1) this.f126038b).Rm();
            return this;
        }

        public b am() {
            El();
            ((d1) this.f126038b).Sm();
            return this;
        }

        public b bm() {
            El();
            ((d1) this.f126038b).Tm();
            return this;
        }

        @Override // com.google.api.e1
        public String c8() {
            return ((d1) this.f126038b).c8();
        }

        public b cm() {
            El();
            ((d1) this.f126038b).Um();
            return this;
        }

        public b dm() {
            El();
            ((d1) this.f126038b).Vm();
            return this;
        }

        public b em(i0 i0Var) {
            El();
            ((d1) this.f126038b).an(i0Var);
            return this;
        }

        @Override // com.google.api.e1
        public com.google.protobuf.u fl() {
            return ((d1) this.f126038b).fl();
        }

        public b fm(int i10) {
            El();
            ((d1) this.f126038b).qn(i10);
            return this;
        }

        @Override // com.google.api.e1
        public boolean g9() {
            return ((d1) this.f126038b).g9();
        }

        @Override // com.google.api.e1
        public String ga() {
            return ((d1) this.f126038b).ga();
        }

        @Override // com.google.api.e1
        public String getBody() {
            return ((d1) this.f126038b).getBody();
        }

        public b gm(int i10, b bVar) {
            El();
            ((d1) this.f126038b).rn(i10, bVar.build());
            return this;
        }

        @Override // com.google.api.e1
        public com.google.protobuf.u hc() {
            return ((d1) this.f126038b).hc();
        }

        public b hm(int i10, d1 d1Var) {
            El();
            ((d1) this.f126038b).rn(i10, d1Var);
            return this;
        }

        public b im(String str) {
            El();
            ((d1) this.f126038b).sn(str);
            return this;
        }

        public b jm(com.google.protobuf.u uVar) {
            El();
            ((d1) this.f126038b).tn(uVar);
            return this;
        }

        public b km(i0.b bVar) {
            El();
            ((d1) this.f126038b).un(bVar.build());
            return this;
        }

        @Override // com.google.api.e1
        public boolean ld() {
            return ((d1) this.f126038b).ld();
        }

        public b lm(i0 i0Var) {
            El();
            ((d1) this.f126038b).un(i0Var);
            return this;
        }

        public b mm(String str) {
            El();
            ((d1) this.f126038b).vn(str);
            return this;
        }

        public b nm(com.google.protobuf.u uVar) {
            El();
            ((d1) this.f126038b).wn(uVar);
            return this;
        }

        public b om(String str) {
            El();
            ((d1) this.f126038b).xn(str);
            return this;
        }

        public b pm(com.google.protobuf.u uVar) {
            El();
            ((d1) this.f126038b).yn(uVar);
            return this;
        }

        public b qm(String str) {
            El();
            ((d1) this.f126038b).zn(str);
            return this;
        }

        @Override // com.google.api.e1
        public com.google.protobuf.u rb() {
            return ((d1) this.f126038b).rb();
        }

        @Override // com.google.api.e1
        public List<d1> ri() {
            return Collections.unmodifiableList(((d1) this.f126038b).ri());
        }

        @Override // com.google.api.e1
        public c rj() {
            return ((d1) this.f126038b).rj();
        }

        @Override // com.google.api.e1
        public i0 rk() {
            return ((d1) this.f126038b).rk();
        }

        public b rm(com.google.protobuf.u uVar) {
            El();
            ((d1) this.f126038b).An(uVar);
            return this;
        }

        public b sm(String str) {
            El();
            ((d1) this.f126038b).Bn(str);
            return this;
        }

        public b tm(com.google.protobuf.u uVar) {
            El();
            ((d1) this.f126038b).Cn(uVar);
            return this;
        }

        public b um(String str) {
            El();
            ((d1) this.f126038b).Dn(str);
            return this;
        }

        @Override // com.google.api.e1
        public com.google.protobuf.u vj() {
            return ((d1) this.f126038b).vj();
        }

        public b vm(com.google.protobuf.u uVar) {
            El();
            ((d1) this.f126038b).En(uVar);
            return this;
        }

        @Override // com.google.api.e1
        public boolean wg() {
            return ((d1) this.f126038b).wg();
        }

        public b wm(String str) {
            El();
            ((d1) this.f126038b).Fn(str);
            return this;
        }

        public b xm(com.google.protobuf.u uVar) {
            El();
            ((d1) this.f126038b).Gn(uVar);
            return this;
        }

        @Override // com.google.api.e1
        public String yb() {
            return ((d1) this.f126038b).yb();
        }

        public b ym(String str) {
            El();
            ((d1) this.f126038b).Hn(str);
            return this;
        }

        @Override // com.google.api.e1
        public String z8() {
            return ((d1) this.f126038b).z8();
        }

        public b zm(com.google.protobuf.u uVar) {
            El();
            ((d1) this.f126038b).In(uVar);
            return this;
        }

        private b() {
            super(d1.DEFAULT_INSTANCE);
        }
    }

    public enum c {
        GET(2),
        PUT(3),
        POST(4),
        DELETE(5),
        PATCH(6),
        CUSTOM(8),
        PATTERN_NOT_SET(0);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f116196a;

        static {
            boolean z10 = true;
            int i10 = 6 << 3;
        }

        c(int i10) {
            this.f116196a = i10;
        }

        public static c l(int i10) {
            if (i10 == 0) {
                return PATTERN_NOT_SET;
            }
            if (i10 == 8) {
                return CUSTOM;
            }
            if (i10 == 2) {
                return GET;
            }
            if (i10 == 3) {
                return PUT;
            }
            if (i10 == 4) {
                return POST;
            }
            if (i10 == 5) {
                return DELETE;
            }
            if (i10 != 6) {
                return null;
            }
            return PATCH;
        }

        @Deprecated
        public static c n(int i10) {
            return l(i10);
        }

        public int i() {
            return this.f116196a;
        }
    }

    static {
        d1 d1Var = new d1();
        DEFAULT_INSTANCE = d1Var;
        com.google.protobuf.l1.Wl(d1.class, d1Var);
    }

    private d1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void An(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.pattern_ = uVar.z0();
        this.patternCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bn(String str) {
        str.getClass();
        this.patternCase_ = 4;
        this.pattern_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Cn(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.pattern_ = uVar.z0();
        this.patternCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dn(String str) {
        str.getClass();
        this.patternCase_ = 3;
        this.pattern_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void En(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.pattern_ = uVar.z0();
        this.patternCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Fn(String str) {
        str.getClass();
        this.responseBody_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Gn(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.responseBody_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Hn(String str) {
        str.getClass();
        this.selector_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Im(int i10, d1 d1Var) {
        d1Var.getClass();
        Wm();
        this.additionalBindings_.add(i10, d1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void In(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.selector_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Jm(d1 d1Var) {
        d1Var.getClass();
        Wm();
        this.additionalBindings_.add(d1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Km(Iterable<? extends d1> iterable) {
        Wm();
        com.google.protobuf.a.y(iterable, this.additionalBindings_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lm() {
        this.additionalBindings_ = com.google.protobuf.l1.Ij();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Mm() {
        this.body_ = Zm().getBody();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Nm() {
        if (this.patternCase_ == 8) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Om() {
        if (this.patternCase_ == 5) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Pm() {
        if (this.patternCase_ == 2) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qm() {
        if (this.patternCase_ == 6) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Rm() {
        this.patternCase_ = 0;
        this.pattern_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sm() {
        if (this.patternCase_ == 4) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Tm() {
        if (this.patternCase_ == 3) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Um() {
        this.responseBody_ = Zm().Gd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Vm() {
        this.selector_ = Zm().A();
    }

    private void Wm() {
        com.google.protobuf.s1.k<d1> kVar = this.additionalBindings_;
        if (kVar.s1()) {
            return;
        }
        this.additionalBindings_ = com.google.protobuf.l1.yl(kVar);
    }

    public static d1 Zm() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void an(i0 i0Var) {
        i0Var.getClass();
        if (this.patternCase_ != 8 || this.pattern_ == i0.im()) {
            this.pattern_ = i0Var;
        } else {
            this.pattern_ = i0.km((i0) this.pattern_).Jl(i0Var).B1();
        }
        this.patternCase_ = 8;
    }

    public static b bn() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b cn(d1 d1Var) {
        return DEFAULT_INSTANCE.Uf(d1Var);
    }

    public static d1 dn(InputStream inputStream) throws IOException {
        return (d1) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static d1 en(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (d1) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static d1 fn(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (d1) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static d1 gn(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (d1) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static d1 hn(com.google.protobuf.z zVar) throws IOException {
        return (d1) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static d1 in(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (d1) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static d1 jn(InputStream inputStream) throws IOException {
        return (d1) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static d1 kn(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (d1) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static d1 ln(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (d1) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static d1 mn(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (d1) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static d1 nn(byte[] bArr) throws com.google.protobuf.t1 {
        return (d1) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static d1 on(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (d1) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static com.google.protobuf.f3<d1> pn() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qn(int i10) {
        Wm();
        this.additionalBindings_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rn(int i10, d1 d1Var) {
        d1Var.getClass();
        Wm();
        this.additionalBindings_.set(i10, d1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sn(String str) {
        str.getClass();
        this.body_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tn(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.body_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void un(i0 i0Var) {
        i0Var.getClass();
        this.pattern_ = i0Var;
        this.patternCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vn(String str) {
        str.getClass();
        this.patternCase_ = 5;
        this.pattern_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wn(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.pattern_ = uVar.z0();
        this.patternCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xn(String str) {
        str.getClass();
        this.patternCase_ = 2;
        this.pattern_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yn(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.pattern_ = uVar.z0();
        this.patternCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zn(String str) {
        str.getClass();
        this.patternCase_ = 6;
        this.pattern_ = str;
    }

    @Override // com.google.api.e1
    public String A() {
        return this.selector_;
    }

    @Override // com.google.api.e1
    public com.google.protobuf.u Ah() {
        return com.google.protobuf.u.C(this.patternCase_ == 6 ? (String) this.pattern_ : "");
    }

    @Override // com.google.api.e1
    public com.google.protobuf.u B() {
        return com.google.protobuf.u.C(this.selector_);
    }

    @Override // com.google.api.e1
    public int B8() {
        return this.additionalBindings_.size();
    }

    @Override // com.google.api.e1
    public boolean Fg() {
        return this.patternCase_ == 4;
    }

    @Override // com.google.api.e1
    public String Gd() {
        return this.responseBody_;
    }

    @Override // com.google.api.e1
    public com.google.protobuf.u Hd() {
        return com.google.protobuf.u.C(this.patternCase_ == 2 ? (String) this.pattern_ : "");
    }

    @Override // com.google.api.e1
    public com.google.protobuf.u Kj() {
        return com.google.protobuf.u.C(this.patternCase_ == 5 ? (String) this.pattern_ : "");
    }

    @Override // com.google.api.e1
    public d1 Na(int i10) {
        return this.additionalBindings_.get(i10);
    }

    @Override // com.google.api.e1
    public String Of() {
        return this.patternCase_ == 3 ? (String) this.pattern_ : "";
    }

    @Override // com.google.api.e1
    public boolean Oj() {
        return this.patternCase_ == 6;
    }

    @Override // com.google.api.e1
    public boolean P8() {
        return this.patternCase_ == 2;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        int i10 = a.f116187a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new d1();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\n\u0001\u0000\u0001\f\n\u0000\u0001\u0000\u0001Ȉ\u0002Ȼ\u0000\u0003Ȼ\u0000\u0004Ȼ\u0000\u0005Ȼ\u0000\u0006Ȼ\u0000\u0007Ȉ\b<\u0000\u000b\u001b\fȈ", new Object[]{"pattern_", "patternCase_", "selector_", "body_", i0.class, "additionalBindings_", d1.class, "responseBody_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f3<d1> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (d1.class) {
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

    public e1 Xm(int i10) {
        return this.additionalBindings_.get(i10);
    }

    public List<? extends e1> Ym() {
        return this.additionalBindings_;
    }

    @Override // com.google.api.e1
    public String c8() {
        return this.patternCase_ == 6 ? (String) this.pattern_ : "";
    }

    @Override // com.google.api.e1
    public com.google.protobuf.u fl() {
        return com.google.protobuf.u.C(this.patternCase_ == 3 ? (String) this.pattern_ : "");
    }

    @Override // com.google.api.e1
    public boolean g9() {
        return this.patternCase_ == 8;
    }

    @Override // com.google.api.e1
    public String ga() {
        return this.patternCase_ == 4 ? (String) this.pattern_ : "";
    }

    @Override // com.google.api.e1
    public String getBody() {
        return this.body_;
    }

    @Override // com.google.api.e1
    public com.google.protobuf.u hc() {
        return com.google.protobuf.u.C(this.body_);
    }

    @Override // com.google.api.e1
    public boolean ld() {
        return this.patternCase_ == 3;
    }

    @Override // com.google.api.e1
    public com.google.protobuf.u rb() {
        return com.google.protobuf.u.C(this.responseBody_);
    }

    @Override // com.google.api.e1
    public List<d1> ri() {
        return this.additionalBindings_;
    }

    @Override // com.google.api.e1
    public c rj() {
        return c.l(this.patternCase_);
    }

    @Override // com.google.api.e1
    public i0 rk() {
        return this.patternCase_ == 8 ? (i0) this.pattern_ : i0.im();
    }

    @Override // com.google.api.e1
    public com.google.protobuf.u vj() {
        return com.google.protobuf.u.C(this.patternCase_ == 4 ? (String) this.pattern_ : "");
    }

    @Override // com.google.api.e1
    public boolean wg() {
        return this.patternCase_ == 5;
    }

    @Override // com.google.api.e1
    public String yb() {
        return this.patternCase_ == 2 ? (String) this.pattern_ : "";
    }

    @Override // com.google.api.e1
    public String z8() {
        return this.patternCase_ == 5 ? (String) this.pattern_ : "";
    }
}
