package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class o0 extends l1<o0, b> implements p0 {
    private static final o0 DEFAULT_INSTANCE;
    public static final int EDITION_FIELD_NUMBER = 6;
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile f3<o0> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 5;
    private int bitField0_;
    private s3 sourceContext_;
    private int syntax_;
    private String name_ = "";
    private s1.k<q0> enumvalue_ = l1.Ij();
    private s1.k<d3> options_ = l1.Ij();
    private String edition_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126231a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126231a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126231a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126231a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126231a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126231a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126231a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126231a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<o0, b> implements p0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.protobuf.p0
        public String C() {
            return ((o0) this.f126038b).C();
        }

        @Override // com.google.protobuf.p0
        public List<q0> C2() {
            return Collections.unmodifiableList(((o0) this.f126038b).C2());
        }

        @Override // com.google.protobuf.p0
        public boolean J() {
            return ((o0) this.f126038b).J();
        }

        @Override // com.google.protobuf.p0
        public u J0() {
            return ((o0) this.f126038b).J0();
        }

        @Override // com.google.protobuf.p0
        public s3 M() {
            return ((o0) this.f126038b).M();
        }

        public b Ol(Iterable<? extends q0> values) {
            El();
            ((o0) this.f126038b).ym(values);
            return this;
        }

        public b Pl(Iterable<? extends d3> values) {
            El();
            ((o0) this.f126038b).zm(values);
            return this;
        }

        public b Ql(int index, q0.b builderForValue) {
            El();
            ((o0) this.f126038b).Am(index, builderForValue.build());
            return this;
        }

        public b Rl(int index, q0 value) {
            El();
            ((o0) this.f126038b).Am(index, value);
            return this;
        }

        public b Sl(q0.b builderForValue) {
            El();
            ((o0) this.f126038b).Bm(builderForValue.build());
            return this;
        }

        public b Tl(q0 value) {
            El();
            ((o0) this.f126038b).Bm(value);
            return this;
        }

        public b Ul(int index, d3.b builderForValue) {
            El();
            ((o0) this.f126038b).Cm(index, builderForValue.build());
            return this;
        }

        public b Vl(int index, d3 value) {
            El();
            ((o0) this.f126038b).Cm(index, value);
            return this;
        }

        public b Wl(d3.b builderForValue) {
            El();
            ((o0) this.f126038b).Dm(builderForValue.build());
            return this;
        }

        public b Xl(d3 value) {
            El();
            ((o0) this.f126038b).Dm(value);
            return this;
        }

        public b Yl() {
            El();
            ((o0) this.f126038b).Em();
            return this;
        }

        public b Zl() {
            El();
            ((o0) this.f126038b).Fm();
            return this;
        }

        @Override // com.google.protobuf.p0
        public u a() {
            return ((o0) this.f126038b).a();
        }

        public b am() {
            El();
            ((o0) this.f126038b).Gm();
            return this;
        }

        public b bm() {
            El();
            ((o0) this.f126038b).Hm();
            return this;
        }

        public b cm() {
            El();
            ((o0) this.f126038b).Im();
            return this;
        }

        public b dm() {
            El();
            ((o0) this.f126038b).Jm();
            return this;
        }

        public b em(s3 value) {
            El();
            ((o0) this.f126038b).Rm(value);
            return this;
        }

        public b fm(int index) {
            El();
            ((o0) this.f126038b).hn(index);
            return this;
        }

        @Override // com.google.protobuf.p0
        public String getName() {
            return ((o0) this.f126038b).getName();
        }

        public b gm(int index) {
            El();
            ((o0) this.f126038b).in(index);
            return this;
        }

        public b hm(String value) {
            El();
            ((o0) this.f126038b).jn(value);
            return this;
        }

        public b im(u value) {
            El();
            ((o0) this.f126038b).kn(value);
            return this;
        }

        public b jm(int index, q0.b builderForValue) {
            El();
            ((o0) this.f126038b).ln(index, builderForValue.build());
            return this;
        }

        @Override // com.google.protobuf.p0
        public q0 k5(int index) {
            return ((o0) this.f126038b).k5(index);
        }

        public b km(int index, q0 value) {
            El();
            ((o0) this.f126038b).ln(index, value);
            return this;
        }

        @Override // com.google.protobuf.p0
        public int l4() {
            return ((o0) this.f126038b).l4();
        }

        public b lm(String value) {
            El();
            ((o0) this.f126038b).mn(value);
            return this;
        }

        public b mm(u value) {
            El();
            ((o0) this.f126038b).nn(value);
            return this;
        }

        @Override // com.google.protobuf.p0
        public List<d3> n() {
            return Collections.unmodifiableList(((o0) this.f126038b).n());
        }

        public b nm(int index, d3.b builderForValue) {
            El();
            ((o0) this.f126038b).on(index, builderForValue.build());
            return this;
        }

        @Override // com.google.protobuf.p0
        public d3 o(int index) {
            return ((o0) this.f126038b).o(index);
        }

        public b om(int index, d3 value) {
            El();
            ((o0) this.f126038b).on(index, value);
            return this;
        }

        @Override // com.google.protobuf.p0
        public b4 p() {
            return ((o0) this.f126038b).p();
        }

        public b pm(s3.b builderForValue) {
            El();
            ((o0) this.f126038b).pn(builderForValue.build());
            return this;
        }

        @Override // com.google.protobuf.p0
        public int q() {
            return ((o0) this.f126038b).q();
        }

        public b qm(s3 value) {
            El();
            ((o0) this.f126038b).pn(value);
            return this;
        }

        public b rm(b4 value) {
            El();
            ((o0) this.f126038b).qn(value);
            return this;
        }

        public b sm(int value) {
            El();
            ((o0) this.f126038b).rn(value);
            return this;
        }

        @Override // com.google.protobuf.p0
        public int w() {
            return ((o0) this.f126038b).w();
        }

        private b() {
            super(o0.DEFAULT_INSTANCE);
        }
    }

    static {
        o0 o0Var = new o0();
        DEFAULT_INSTANCE = o0Var;
        l1.Wl(o0.class, o0Var);
    }

    private o0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Am(int index, q0 value) {
        value.getClass();
        Km();
        this.enumvalue_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bm(q0 value) {
        value.getClass();
        Km();
        this.enumvalue_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Cm(int index, d3 value) {
        value.getClass();
        Lm();
        this.options_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dm(d3 value) {
        value.getClass();
        Lm();
        this.options_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Em() {
        this.edition_ = Mm().C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Fm() {
        this.enumvalue_ = l1.Ij();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Gm() {
        this.name_ = Mm().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Hm() {
        this.options_ = l1.Ij();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Im() {
        this.sourceContext_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Jm() {
        this.syntax_ = 0;
    }

    private void Km() {
        s1.k<q0> kVar = this.enumvalue_;
        if (!kVar.s1()) {
            this.enumvalue_ = l1.yl(kVar);
        }
    }

    private void Lm() {
        s1.k<d3> kVar = this.options_;
        if (kVar.s1()) {
            return;
        }
        this.options_ = l1.yl(kVar);
    }

    public static o0 Mm() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Rm(s3 value) {
        value.getClass();
        s3 s3Var = this.sourceContext_;
        if (s3Var == null || s3Var == s3.em()) {
            this.sourceContext_ = value;
        } else {
            this.sourceContext_ = s3.gm(this.sourceContext_).Jl(value).B1();
        }
        this.bitField0_ |= 1;
    }

    public static b Sm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b Tm(o0 prototype) {
        return DEFAULT_INSTANCE.Uf(prototype);
    }

    public static o0 Um(InputStream input) throws IOException {
        return (o0) l1.El(DEFAULT_INSTANCE, input);
    }

    public static o0 Vm(InputStream input, v0 extensionRegistry) throws IOException {
        return (o0) l1.Fl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static o0 Wm(u data) throws t1 {
        return (o0) l1.Gl(DEFAULT_INSTANCE, data);
    }

    public static o0 Xm(u data, v0 extensionRegistry) throws t1 {
        return (o0) l1.Hl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static o0 Ym(z input) throws IOException {
        return (o0) l1.Il(DEFAULT_INSTANCE, input);
    }

    public static o0 Zm(z input, v0 extensionRegistry) throws IOException {
        return (o0) l1.Jl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static o0 an(InputStream input) throws IOException {
        return (o0) l1.Kl(DEFAULT_INSTANCE, input);
    }

    public static o0 bn(InputStream input, v0 extensionRegistry) throws IOException {
        return (o0) l1.Ll(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static o0 cn(ByteBuffer data) throws t1 {
        return (o0) l1.Ml(DEFAULT_INSTANCE, data);
    }

    public static o0 dn(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (o0) l1.Nl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static o0 en(byte[] data) throws t1 {
        return (o0) l1.Ol(DEFAULT_INSTANCE, data);
    }

    public static o0 fn(byte[] data, v0 extensionRegistry) throws t1 {
        return (o0) l1.Pl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static f3<o0> gn() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn(int index) {
        Km();
        this.enumvalue_.remove(index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void in(int index) {
        Lm();
        this.options_.remove(index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jn(String value) {
        value.getClass();
        this.edition_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kn(u value) {
        com.google.protobuf.a.R(value);
        this.edition_ = value.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ln(int index, q0 value) {
        value.getClass();
        Km();
        this.enumvalue_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mn(String value) {
        value.getClass();
        this.name_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nn(u value) {
        com.google.protobuf.a.R(value);
        this.name_ = value.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void on(int index, d3 value) {
        value.getClass();
        Lm();
        this.options_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pn(s3 value) {
        value.getClass();
        this.sourceContext_ = value;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qn(b4 value) {
        this.syntax_ = value.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rn(int value) {
        this.syntax_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ym(Iterable<? extends q0> values) {
        Km();
        com.google.protobuf.a.y(values, this.enumvalue_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zm(Iterable<? extends d3> values) {
        Lm();
        com.google.protobuf.a.y(values, this.options_);
    }

    @Override // com.google.protobuf.p0
    public String C() {
        return this.edition_;
    }

    @Override // com.google.protobuf.p0
    public List<q0> C2() {
        return this.enumvalue_;
    }

    @Override // com.google.protobuf.p0
    public boolean J() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.p0
    public u J0() {
        return u.C(this.edition_);
    }

    @Override // com.google.protobuf.p0
    public s3 M() {
        s3 s3VarEm = this.sourceContext_;
        if (s3VarEm == null) {
            s3VarEm = s3.em();
        }
        return s3VarEm;
    }

    public r0 Nm(int index) {
        return this.enumvalue_.get(index);
    }

    public List<? extends r0> Om() {
        return this.enumvalue_;
    }

    public e3 Pm(int index) {
        return this.options_.get(index);
    }

    public List<? extends e3> Qm() {
        return this.options_;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i method, Object arg0, Object arg1) {
        f3 cVar;
        int i10 = a.f126231a[method.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new o0();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004ဉ\u0000\u0005\f\u0006Ȉ", new Object[]{"bitField0_", "name_", "enumvalue_", q0.class, "options_", d3.class, "sourceContext_", "syntax_", "edition_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<o0> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (o0.class) {
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

    @Override // com.google.protobuf.p0
    public u a() {
        return u.C(this.name_);
    }

    @Override // com.google.protobuf.p0
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.p0
    public q0 k5(int index) {
        return this.enumvalue_.get(index);
    }

    @Override // com.google.protobuf.p0
    public int l4() {
        return this.enumvalue_.size();
    }

    @Override // com.google.protobuf.p0
    public List<d3> n() {
        return this.options_;
    }

    @Override // com.google.protobuf.p0
    public d3 o(int index) {
        return this.options_.get(index);
    }

    @Override // com.google.protobuf.p0
    public b4 p() {
        b4 b4VarB = b4.b(this.syntax_);
        return b4VarB == null ? b4.UNRECOGNIZED : b4VarB;
    }

    @Override // com.google.protobuf.p0
    public int q() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.p0
    public int w() {
        return this.syntax_;
    }
}
