package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends l1<i, b> implements j {
    private static final i DEFAULT_INSTANCE;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile f3<i> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    private int bitField0_;
    private s3 sourceContext_;
    private int syntax_;
    private String name_ = "";
    private s1.k<s2> methods_ = l1.Ij();
    private s1.k<d3> options_ = l1.Ij();
    private String version_ = "";
    private s1.k<u2> mixins_ = l1.Ij();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126014a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126014a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126014a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126014a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126014a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126014a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126014a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126014a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<i, b> implements j {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b Am(String value) {
            El();
            ((i) this.f126038b).Fn(value);
            return this;
        }

        public b Bm(u value) {
            El();
            ((i) this.f126038b).Gn(value);
            return this;
        }

        @Override // com.google.protobuf.j
        public s2 D2(int index) {
            return ((i) this.f126038b).D2(index);
        }

        @Override // com.google.protobuf.j
        public List<s2> F5() {
            return Collections.unmodifiableList(((i) this.f126038b).F5());
        }

        @Override // com.google.protobuf.j
        public boolean J() {
            return ((i) this.f126038b).J();
        }

        @Override // com.google.protobuf.j
        public s3 M() {
            return ((i) this.f126038b).M();
        }

        @Override // com.google.protobuf.j
        public int O3() {
            return ((i) this.f126038b).O3();
        }

        public b Ol(Iterable<? extends s2> values) {
            El();
            ((i) this.f126038b).Em(values);
            return this;
        }

        public b Pl(Iterable<? extends u2> values) {
            El();
            ((i) this.f126038b).Fm(values);
            return this;
        }

        public b Ql(Iterable<? extends d3> values) {
            El();
            ((i) this.f126038b).Gm(values);
            return this;
        }

        public b Rl(int index, s2.b builderForValue) {
            El();
            ((i) this.f126038b).Hm(index, builderForValue.build());
            return this;
        }

        public b Sl(int index, s2 value) {
            El();
            ((i) this.f126038b).Hm(index, value);
            return this;
        }

        public b Tl(s2.b builderForValue) {
            El();
            ((i) this.f126038b).Im(builderForValue.build());
            return this;
        }

        @Override // com.google.protobuf.j
        public u2 U7(int index) {
            return ((i) this.f126038b).U7(index);
        }

        public b Ul(s2 value) {
            El();
            ((i) this.f126038b).Im(value);
            return this;
        }

        public b Vl(int index, u2.b builderForValue) {
            El();
            ((i) this.f126038b).Jm(index, builderForValue.build());
            return this;
        }

        public b Wl(int index, u2 value) {
            El();
            ((i) this.f126038b).Jm(index, value);
            return this;
        }

        public b Xl(u2.b builderForValue) {
            El();
            ((i) this.f126038b).Km(builderForValue.build());
            return this;
        }

        public b Yl(u2 value) {
            El();
            ((i) this.f126038b).Km(value);
            return this;
        }

        public b Zl(int index, d3.b builderForValue) {
            El();
            ((i) this.f126038b).Lm(index, builderForValue.build());
            return this;
        }

        @Override // com.google.protobuf.j
        public u a() {
            return ((i) this.f126038b).a();
        }

        public b am(int index, d3 value) {
            El();
            ((i) this.f126038b).Lm(index, value);
            return this;
        }

        public b bm(d3.b builderForValue) {
            El();
            ((i) this.f126038b).Mm(builderForValue.build());
            return this;
        }

        public b cm(d3 value) {
            El();
            ((i) this.f126038b).Mm(value);
            return this;
        }

        @Override // com.google.protobuf.j
        public int d3() {
            return ((i) this.f126038b).d3();
        }

        public b dm() {
            El();
            ((i) this.f126038b).Nm();
            return this;
        }

        public b em() {
            El();
            ((i) this.f126038b).Om();
            return this;
        }

        public b fm() {
            El();
            ((i) this.f126038b).Pm();
            return this;
        }

        @Override // com.google.protobuf.j
        public String getName() {
            return ((i) this.f126038b).getName();
        }

        @Override // com.google.protobuf.j
        public String getVersion() {
            return ((i) this.f126038b).getVersion();
        }

        public b gm() {
            El();
            ((i) this.f126038b).Qm();
            return this;
        }

        public b hm() {
            El();
            ((i) this.f126038b).Rm();
            return this;
        }

        public b im() {
            El();
            ((i) this.f126038b).Sm();
            return this;
        }

        @Override // com.google.protobuf.j
        public List<u2> j5() {
            return Collections.unmodifiableList(((i) this.f126038b).j5());
        }

        public b jm() {
            El();
            ((i) this.f126038b).Tm();
            return this;
        }

        public b km(s3 value) {
            El();
            ((i) this.f126038b).en(value);
            return this;
        }

        public b lm(int index) {
            El();
            ((i) this.f126038b).un(index);
            return this;
        }

        public b mm(int index) {
            El();
            ((i) this.f126038b).vn(index);
            return this;
        }

        @Override // com.google.protobuf.j
        public List<d3> n() {
            return Collections.unmodifiableList(((i) this.f126038b).n());
        }

        public b nm(int index) {
            El();
            ((i) this.f126038b).wn(index);
            return this;
        }

        @Override // com.google.protobuf.j
        public d3 o(int index) {
            return ((i) this.f126038b).o(index);
        }

        public b om(int index, s2.b builderForValue) {
            El();
            ((i) this.f126038b).xn(index, builderForValue.build());
            return this;
        }

        @Override // com.google.protobuf.j
        public b4 p() {
            return ((i) this.f126038b).p();
        }

        public b pm(int index, s2 value) {
            El();
            ((i) this.f126038b).xn(index, value);
            return this;
        }

        @Override // com.google.protobuf.j
        public int q() {
            return ((i) this.f126038b).q();
        }

        public b qm(int index, u2.b builderForValue) {
            El();
            ((i) this.f126038b).yn(index, builderForValue.build());
            return this;
        }

        public b rm(int index, u2 value) {
            El();
            ((i) this.f126038b).yn(index, value);
            return this;
        }

        @Override // com.google.protobuf.j
        public u s0() {
            return ((i) this.f126038b).s0();
        }

        public b sm(String value) {
            El();
            ((i) this.f126038b).zn(value);
            return this;
        }

        public b tm(u value) {
            El();
            ((i) this.f126038b).An(value);
            return this;
        }

        public b um(int index, d3.b builderForValue) {
            El();
            ((i) this.f126038b).Bn(index, builderForValue.build());
            return this;
        }

        public b vm(int index, d3 value) {
            El();
            ((i) this.f126038b).Bn(index, value);
            return this;
        }

        @Override // com.google.protobuf.j
        public int w() {
            return ((i) this.f126038b).w();
        }

        public b wm(s3.b builderForValue) {
            El();
            ((i) this.f126038b).Cn(builderForValue.build());
            return this;
        }

        public b xm(s3 value) {
            El();
            ((i) this.f126038b).Cn(value);
            return this;
        }

        public b ym(b4 value) {
            El();
            ((i) this.f126038b).Dn(value);
            return this;
        }

        public b zm(int value) {
            El();
            ((i) this.f126038b).En(value);
            return this;
        }

        private b() {
            super(i.DEFAULT_INSTANCE);
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
    public void An(u value) {
        com.google.protobuf.a.R(value);
        this.name_ = value.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bn(int index, d3 value) {
        value.getClass();
        Wm();
        this.options_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Cn(s3 value) {
        value.getClass();
        this.sourceContext_ = value;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dn(b4 value) {
        this.syntax_ = value.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Em(Iterable<? extends s2> values) {
        Um();
        com.google.protobuf.a.y(values, this.methods_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void En(int value) {
        this.syntax_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Fm(Iterable<? extends u2> values) {
        Vm();
        com.google.protobuf.a.y(values, this.mixins_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Fn(String value) {
        value.getClass();
        this.version_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Gm(Iterable<? extends d3> values) {
        Wm();
        com.google.protobuf.a.y(values, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Gn(u value) {
        com.google.protobuf.a.R(value);
        this.version_ = value.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Hm(int index, s2 value) {
        value.getClass();
        Um();
        this.methods_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Im(s2 value) {
        value.getClass();
        Um();
        this.methods_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Jm(int index, u2 value) {
        value.getClass();
        Vm();
        this.mixins_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Km(u2 value) {
        value.getClass();
        Vm();
        this.mixins_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lm(int index, d3 value) {
        value.getClass();
        Wm();
        this.options_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Mm(d3 value) {
        value.getClass();
        Wm();
        this.options_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Nm() {
        this.methods_ = l1.Ij();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Om() {
        this.mixins_ = l1.Ij();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Pm() {
        this.name_ = Xm().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qm() {
        this.options_ = l1.Ij();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Rm() {
        this.sourceContext_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sm() {
        this.syntax_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Tm() {
        this.version_ = Xm().getVersion();
    }

    private void Um() {
        s1.k<s2> kVar = this.methods_;
        if (kVar.s1()) {
            return;
        }
        this.methods_ = l1.yl(kVar);
    }

    private void Vm() {
        s1.k<u2> kVar = this.mixins_;
        if (!kVar.s1()) {
            this.mixins_ = l1.yl(kVar);
        }
    }

    private void Wm() {
        s1.k<d3> kVar = this.options_;
        if (kVar.s1()) {
            return;
        }
        this.options_ = l1.yl(kVar);
    }

    public static i Xm() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void en(s3 value) {
        value.getClass();
        s3 s3Var = this.sourceContext_;
        if (s3Var == null || s3Var == s3.em()) {
            this.sourceContext_ = value;
        } else {
            this.sourceContext_ = s3.gm(this.sourceContext_).Jl(value).B1();
        }
        this.bitField0_ |= 1;
    }

    public static b fn() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b gn(i prototype) {
        return DEFAULT_INSTANCE.Uf(prototype);
    }

    public static i hn(InputStream input) throws IOException {
        return (i) l1.El(DEFAULT_INSTANCE, input);
    }

    public static i in(InputStream input, v0 extensionRegistry) throws IOException {
        return (i) l1.Fl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static i jn(u data) throws t1 {
        return (i) l1.Gl(DEFAULT_INSTANCE, data);
    }

    public static i kn(u data, v0 extensionRegistry) throws t1 {
        return (i) l1.Hl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static i ln(z input) throws IOException {
        return (i) l1.Il(DEFAULT_INSTANCE, input);
    }

    public static i mn(z input, v0 extensionRegistry) throws IOException {
        return (i) l1.Jl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static i nn(InputStream input) throws IOException {
        return (i) l1.Kl(DEFAULT_INSTANCE, input);
    }

    public static i on(InputStream input, v0 extensionRegistry) throws IOException {
        return (i) l1.Ll(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static i pn(ByteBuffer data) throws t1 {
        return (i) l1.Ml(DEFAULT_INSTANCE, data);
    }

    public static i qn(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (i) l1.Nl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static i rn(byte[] data) throws t1 {
        return (i) l1.Ol(DEFAULT_INSTANCE, data);
    }

    public static i sn(byte[] data, v0 extensionRegistry) throws t1 {
        return (i) l1.Pl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static f3<i> tn() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void un(int index) {
        Um();
        this.methods_.remove(index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vn(int index) {
        Vm();
        this.mixins_.remove(index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wn(int index) {
        Wm();
        this.options_.remove(index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xn(int index, s2 value) {
        value.getClass();
        Um();
        this.methods_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yn(int index, u2 value) {
        value.getClass();
        Vm();
        this.mixins_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zn(String value) {
        value.getClass();
        this.name_ = value;
    }

    @Override // com.google.protobuf.j
    public s2 D2(int index) {
        return this.methods_.get(index);
    }

    @Override // com.google.protobuf.j
    public List<s2> F5() {
        return this.methods_;
    }

    @Override // com.google.protobuf.j
    public boolean J() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.j
    public s3 M() {
        s3 s3VarEm = this.sourceContext_;
        if (s3VarEm == null) {
            s3VarEm = s3.em();
        }
        return s3VarEm;
    }

    @Override // com.google.protobuf.j
    public int O3() {
        return this.methods_.size();
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i method, Object arg0, Object arg1) {
        f3 cVar;
        int i10 = a.f126014a[method.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new i();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004Ȉ\u0005ဉ\u0000\u0006\u001b\u0007\f", new Object[]{"bitField0_", "name_", "methods_", s2.class, "options_", d3.class, "version_", "sourceContext_", "mixins_", u2.class, "syntax_"});
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

    @Override // com.google.protobuf.j
    public u2 U7(int index) {
        return this.mixins_.get(index);
    }

    public t2 Ym(int index) {
        return this.methods_.get(index);
    }

    public List<? extends t2> Zm() {
        return this.methods_;
    }

    @Override // com.google.protobuf.j
    public u a() {
        return u.C(this.name_);
    }

    public v2 an(int index) {
        return this.mixins_.get(index);
    }

    public List<? extends v2> bn() {
        return this.mixins_;
    }

    public e3 cn(int index) {
        return this.options_.get(index);
    }

    @Override // com.google.protobuf.j
    public int d3() {
        return this.mixins_.size();
    }

    public List<? extends e3> dn() {
        return this.options_;
    }

    @Override // com.google.protobuf.j
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.j
    public String getVersion() {
        return this.version_;
    }

    @Override // com.google.protobuf.j
    public List<u2> j5() {
        return this.mixins_;
    }

    @Override // com.google.protobuf.j
    public List<d3> n() {
        return this.options_;
    }

    @Override // com.google.protobuf.j
    public d3 o(int index) {
        return this.options_.get(index);
    }

    @Override // com.google.protobuf.j
    public b4 p() {
        b4 b4VarB = b4.b(this.syntax_);
        if (b4VarB == null) {
            b4VarB = b4.UNRECOGNIZED;
        }
        return b4VarB;
    }

    @Override // com.google.protobuf.j
    public int q() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.j
    public u s0() {
        return u.C(this.version_);
    }

    @Override // com.google.protobuf.j
    public int w() {
        return this.syntax_;
    }
}
