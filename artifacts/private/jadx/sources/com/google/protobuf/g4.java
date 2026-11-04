package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class g4 extends l1<g4, b> implements h4 {
    private static final g4 DEFAULT_INSTANCE;
    public static final int EDITION_FIELD_NUMBER = 7;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static volatile f3<g4> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    private int bitField0_;
    private s3 sourceContext_;
    private int syntax_;
    private String name_ = "";
    private s1.k<z0> fields_ = l1.Ij();
    private s1.k<String> oneofs_ = l1.Ij();
    private s1.k<d3> options_ = l1.Ij();
    private String edition_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126004a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126004a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126004a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126004a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126004a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126004a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126004a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126004a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<g4, b> implements h4 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.protobuf.h4
        public String C() {
            return ((g4) this.f126038b).C();
        }

        @Override // com.google.protobuf.h4
        public boolean J() {
            return ((g4) this.f126038b).J();
        }

        @Override // com.google.protobuf.h4
        public u J0() {
            return ((g4) this.f126038b).J0();
        }

        @Override // com.google.protobuf.h4
        public s3 M() {
            return ((g4) this.f126038b).M();
        }

        @Override // com.google.protobuf.h4
        public List<String> N4() {
            return Collections.unmodifiableList(((g4) this.f126038b).N4());
        }

        @Override // com.google.protobuf.h4
        public String N6(int index) {
            return ((g4) this.f126038b).N6(index);
        }

        public b Ol(Iterable<? extends z0> values) {
            El();
            ((g4) this.f126038b).Dm(values);
            return this;
        }

        @Override // com.google.protobuf.h4
        public u P5(int index) {
            return ((g4) this.f126038b).P5(index);
        }

        public b Pl(Iterable<String> values) {
            El();
            ((g4) this.f126038b).Em(values);
            return this;
        }

        public b Ql(Iterable<? extends d3> values) {
            El();
            ((g4) this.f126038b).Fm(values);
            return this;
        }

        public b Rl(int index, z0.b builderForValue) {
            El();
            ((g4) this.f126038b).Gm(index, builderForValue.build());
            return this;
        }

        public b Sl(int index, z0 value) {
            El();
            ((g4) this.f126038b).Gm(index, value);
            return this;
        }

        public b Tl(z0.b builderForValue) {
            El();
            ((g4) this.f126038b).Hm(builderForValue.build());
            return this;
        }

        public b Ul(z0 value) {
            El();
            ((g4) this.f126038b).Hm(value);
            return this;
        }

        public b Vl(String value) {
            El();
            ((g4) this.f126038b).Im(value);
            return this;
        }

        public b Wl(u value) {
            El();
            ((g4) this.f126038b).Jm(value);
            return this;
        }

        public b Xl(int index, d3.b builderForValue) {
            El();
            ((g4) this.f126038b).Km(index, builderForValue.build());
            return this;
        }

        public b Yl(int index, d3 value) {
            El();
            ((g4) this.f126038b).Km(index, value);
            return this;
        }

        public b Zl(d3.b builderForValue) {
            El();
            ((g4) this.f126038b).Lm(builderForValue.build());
            return this;
        }

        @Override // com.google.protobuf.h4
        public u a() {
            return ((g4) this.f126038b).a();
        }

        @Override // com.google.protobuf.h4
        public int a3() {
            return ((g4) this.f126038b).a3();
        }

        public b am(d3 value) {
            El();
            ((g4) this.f126038b).Lm(value);
            return this;
        }

        public b bm() {
            El();
            ((g4) this.f126038b).Mm();
            return this;
        }

        public b cm() {
            El();
            ((g4) this.f126038b).Nm();
            return this;
        }

        @Override // com.google.protobuf.h4
        public int d0() {
            return ((g4) this.f126038b).d0();
        }

        public b dm() {
            El();
            ((g4) this.f126038b).Om();
            return this;
        }

        public b em() {
            El();
            ((g4) this.f126038b).Pm();
            return this;
        }

        public b fm() {
            El();
            ((g4) this.f126038b).Qm();
            return this;
        }

        @Override // com.google.protobuf.h4
        public String getName() {
            return ((g4) this.f126038b).getName();
        }

        public b gm() {
            El();
            ((g4) this.f126038b).Rm();
            return this;
        }

        public b hm() {
            El();
            ((g4) this.f126038b).Sm();
            return this;
        }

        public b im(s3 value) {
            El();
            ((g4) this.f126038b).bn(value);
            return this;
        }

        public b jm(int index) {
            El();
            ((g4) this.f126038b).rn(index);
            return this;
        }

        public b km(int index) {
            El();
            ((g4) this.f126038b).sn(index);
            return this;
        }

        public b lm(String value) {
            El();
            ((g4) this.f126038b).tn(value);
            return this;
        }

        public b mm(u value) {
            El();
            ((g4) this.f126038b).un(value);
            return this;
        }

        @Override // com.google.protobuf.h4
        public List<d3> n() {
            return Collections.unmodifiableList(((g4) this.f126038b).n());
        }

        public b nm(int index, z0.b builderForValue) {
            El();
            ((g4) this.f126038b).vn(index, builderForValue.build());
            return this;
        }

        @Override // com.google.protobuf.h4
        public d3 o(int index) {
            return ((g4) this.f126038b).o(index);
        }

        public b om(int index, z0 value) {
            El();
            ((g4) this.f126038b).vn(index, value);
            return this;
        }

        @Override // com.google.protobuf.h4
        public b4 p() {
            return ((g4) this.f126038b).p();
        }

        public b pm(String value) {
            El();
            ((g4) this.f126038b).wn(value);
            return this;
        }

        @Override // com.google.protobuf.h4
        public int q() {
            return ((g4) this.f126038b).q();
        }

        @Override // com.google.protobuf.h4
        public List<z0> q2() {
            return Collections.unmodifiableList(((g4) this.f126038b).q2());
        }

        public b qm(u value) {
            El();
            ((g4) this.f126038b).xn(value);
            return this;
        }

        public b rm(int index, String value) {
            El();
            ((g4) this.f126038b).yn(index, value);
            return this;
        }

        public b sm(int index, d3.b builderForValue) {
            El();
            ((g4) this.f126038b).zn(index, builderForValue.build());
            return this;
        }

        public b tm(int index, d3 value) {
            El();
            ((g4) this.f126038b).zn(index, value);
            return this;
        }

        public b um(s3.b builderForValue) {
            El();
            ((g4) this.f126038b).An(builderForValue.build());
            return this;
        }

        public b vm(s3 value) {
            El();
            ((g4) this.f126038b).An(value);
            return this;
        }

        @Override // com.google.protobuf.h4
        public int w() {
            return ((g4) this.f126038b).w();
        }

        public b wm(b4 value) {
            El();
            ((g4) this.f126038b).Bn(value);
            return this;
        }

        public b xm(int value) {
            El();
            ((g4) this.f126038b).Cn(value);
            return this;
        }

        @Override // com.google.protobuf.h4
        public z0 z6(int index) {
            return ((g4) this.f126038b).z6(index);
        }

        private b() {
            super(g4.DEFAULT_INSTANCE);
        }
    }

    static {
        g4 g4Var = new g4();
        DEFAULT_INSTANCE = g4Var;
        l1.Wl(g4.class, g4Var);
    }

    private g4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void An(s3 value) {
        value.getClass();
        this.sourceContext_ = value;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bn(b4 value) {
        this.syntax_ = value.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Cn(int value) {
        this.syntax_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dm(Iterable<? extends z0> values) {
        Tm();
        com.google.protobuf.a.y(values, this.fields_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Em(Iterable<String> values) {
        Um();
        com.google.protobuf.a.y(values, this.oneofs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Fm(Iterable<? extends d3> values) {
        Vm();
        com.google.protobuf.a.y(values, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Gm(int index, z0 value) {
        value.getClass();
        Tm();
        this.fields_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Hm(z0 value) {
        value.getClass();
        Tm();
        this.fields_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Im(String value) {
        value.getClass();
        Um();
        this.oneofs_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Jm(u value) {
        com.google.protobuf.a.R(value);
        Um();
        this.oneofs_.add(value.z0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Km(int index, d3 value) {
        value.getClass();
        Vm();
        this.options_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lm(d3 value) {
        value.getClass();
        Vm();
        this.options_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Mm() {
        this.edition_ = Wm().C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Nm() {
        this.fields_ = l1.Ij();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Om() {
        this.name_ = Wm().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Pm() {
        this.oneofs_ = l1.Ij();
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

    private void Tm() {
        s1.k<z0> kVar = this.fields_;
        if (kVar.s1()) {
            return;
        }
        this.fields_ = l1.yl(kVar);
    }

    private void Um() {
        s1.k<String> kVar = this.oneofs_;
        if (!kVar.s1()) {
            this.oneofs_ = l1.yl(kVar);
        }
    }

    private void Vm() {
        s1.k<d3> kVar = this.options_;
        if (!kVar.s1()) {
            this.options_ = l1.yl(kVar);
        }
    }

    public static g4 Wm() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bn(s3 value) {
        value.getClass();
        s3 s3Var = this.sourceContext_;
        if (s3Var == null || s3Var == s3.em()) {
            this.sourceContext_ = value;
        } else {
            this.sourceContext_ = s3.gm(this.sourceContext_).Jl(value).B1();
        }
        this.bitField0_ |= 1;
    }

    public static b cn() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b dn(g4 prototype) {
        return DEFAULT_INSTANCE.Uf(prototype);
    }

    public static g4 en(InputStream input) throws IOException {
        return (g4) l1.El(DEFAULT_INSTANCE, input);
    }

    public static g4 fn(InputStream input, v0 extensionRegistry) throws IOException {
        return (g4) l1.Fl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static g4 gn(u data) throws t1 {
        return (g4) l1.Gl(DEFAULT_INSTANCE, data);
    }

    public static g4 hn(u data, v0 extensionRegistry) throws t1 {
        return (g4) l1.Hl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static g4 in(z input) throws IOException {
        return (g4) l1.Il(DEFAULT_INSTANCE, input);
    }

    public static g4 jn(z input, v0 extensionRegistry) throws IOException {
        return (g4) l1.Jl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static g4 kn(InputStream input) throws IOException {
        return (g4) l1.Kl(DEFAULT_INSTANCE, input);
    }

    public static g4 ln(InputStream input, v0 extensionRegistry) throws IOException {
        return (g4) l1.Ll(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static g4 mn(ByteBuffer data) throws t1 {
        return (g4) l1.Ml(DEFAULT_INSTANCE, data);
    }

    public static g4 nn(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (g4) l1.Nl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static g4 on(byte[] data) throws t1 {
        return (g4) l1.Ol(DEFAULT_INSTANCE, data);
    }

    public static g4 pn(byte[] data, v0 extensionRegistry) throws t1 {
        return (g4) l1.Pl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static f3<g4> qn() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rn(int index) {
        Tm();
        this.fields_.remove(index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sn(int index) {
        Vm();
        this.options_.remove(index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tn(String value) {
        value.getClass();
        this.edition_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void un(u value) {
        com.google.protobuf.a.R(value);
        this.edition_ = value.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vn(int index, z0 value) {
        value.getClass();
        Tm();
        this.fields_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wn(String value) {
        value.getClass();
        this.name_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xn(u value) {
        com.google.protobuf.a.R(value);
        this.name_ = value.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yn(int index, String value) {
        value.getClass();
        Um();
        this.oneofs_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zn(int index, d3 value) {
        value.getClass();
        Vm();
        this.options_.set(index, value);
    }

    @Override // com.google.protobuf.h4
    public String C() {
        return this.edition_;
    }

    @Override // com.google.protobuf.h4
    public boolean J() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.h4
    public u J0() {
        return u.C(this.edition_);
    }

    @Override // com.google.protobuf.h4
    public s3 M() {
        s3 s3Var = this.sourceContext_;
        return s3Var == null ? s3.em() : s3Var;
    }

    @Override // com.google.protobuf.h4
    public List<String> N4() {
        return this.oneofs_;
    }

    @Override // com.google.protobuf.h4
    public String N6(int index) {
        return this.oneofs_.get(index);
    }

    @Override // com.google.protobuf.h4
    public u P5(int index) {
        return u.C(this.oneofs_.get(index));
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i method, Object arg0, Object arg1) {
        f3 cVar;
        int i10 = a.f126004a[method.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new g4();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003Ț\u0004\u001b\u0005ဉ\u0000\u0006\f\u0007Ȉ", new Object[]{"bitField0_", "name_", "fields_", z0.class, "oneofs_", "options_", d3.class, "sourceContext_", "syntax_", "edition_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<g4> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (g4.class) {
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

    public e1 Xm(int index) {
        return this.fields_.get(index);
    }

    public List<? extends e1> Ym() {
        return this.fields_;
    }

    public e3 Zm(int index) {
        return this.options_.get(index);
    }

    @Override // com.google.protobuf.h4
    public u a() {
        return u.C(this.name_);
    }

    @Override // com.google.protobuf.h4
    public int a3() {
        return this.oneofs_.size();
    }

    public List<? extends e3> an() {
        return this.options_;
    }

    @Override // com.google.protobuf.h4
    public int d0() {
        return this.fields_.size();
    }

    @Override // com.google.protobuf.h4
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.h4
    public List<d3> n() {
        return this.options_;
    }

    @Override // com.google.protobuf.h4
    public d3 o(int index) {
        return this.options_.get(index);
    }

    @Override // com.google.protobuf.h4
    public b4 p() {
        b4 b4VarB = b4.b(this.syntax_);
        return b4VarB == null ? b4.UNRECOGNIZED : b4VarB;
    }

    @Override // com.google.protobuf.h4
    public int q() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.h4
    public List<z0> q2() {
        return this.fields_;
    }

    @Override // com.google.protobuf.h4
    public int w() {
        return this.syntax_;
    }

    @Override // com.google.protobuf.h4
    public z0 z6(int index) {
        return this.fields_.get(index);
    }
}
