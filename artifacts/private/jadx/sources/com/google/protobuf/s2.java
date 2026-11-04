package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class s2 extends l1<s2, b> implements t2 {
    private static final s2 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 6;
    private static volatile f3<s2> PARSER = null;
    public static final int REQUEST_STREAMING_FIELD_NUMBER = 3;
    public static final int REQUEST_TYPE_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_STREAMING_FIELD_NUMBER = 5;
    public static final int RESPONSE_TYPE_URL_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    private boolean requestStreaming_;
    private boolean responseStreaming_;
    private int syntax_;
    private String name_ = "";
    private String requestTypeUrl_ = "";
    private String responseTypeUrl_ = "";
    private s1.k<d3> options_ = l1.Ij();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126342a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126342a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126342a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126342a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126342a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126342a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126342a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126342a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<s2, b> implements t2 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.protobuf.t2
        public u I4() {
            return ((s2) this.f126038b).I4();
        }

        @Override // com.google.protobuf.t2
        public boolean L2() {
            return ((s2) this.f126038b).L2();
        }

        public b Ol(Iterable<? extends d3> values) {
            El();
            ((s2) this.f126038b).wm(values);
            return this;
        }

        public b Pl(int index, d3.b builderForValue) {
            El();
            ((s2) this.f126038b).xm(index, builderForValue.build());
            return this;
        }

        public b Ql(int index, d3 value) {
            El();
            ((s2) this.f126038b).xm(index, value);
            return this;
        }

        public b Rl(d3.b builderForValue) {
            El();
            ((s2) this.f126038b).ym(builderForValue.build());
            return this;
        }

        public b Sl(d3 value) {
            El();
            ((s2) this.f126038b).ym(value);
            return this;
        }

        public b Tl() {
            El();
            ((s2) this.f126038b).zm();
            return this;
        }

        public b Ul() {
            El();
            ((s2) this.f126038b).Am();
            return this;
        }

        public b Vl() {
            El();
            ((s2) this.f126038b).Bm();
            return this;
        }

        @Override // com.google.protobuf.t2
        public String W5() {
            return ((s2) this.f126038b).W5();
        }

        public b Wl() {
            El();
            ((s2) this.f126038b).Cm();
            return this;
        }

        @Override // com.google.protobuf.t2
        public u X1() {
            return ((s2) this.f126038b).X1();
        }

        public b Xl() {
            El();
            ((s2) this.f126038b).Dm();
            return this;
        }

        public b Yl() {
            El();
            ((s2) this.f126038b).Em();
            return this;
        }

        public b Zl() {
            El();
            ((s2) this.f126038b).Fm();
            return this;
        }

        @Override // com.google.protobuf.t2
        public u a() {
            return ((s2) this.f126038b).a();
        }

        public b am(int index) {
            El();
            ((s2) this.f126038b).Zm(index);
            return this;
        }

        public b bm(String value) {
            El();
            ((s2) this.f126038b).an(value);
            return this;
        }

        public b cm(u value) {
            El();
            ((s2) this.f126038b).bn(value);
            return this;
        }

        public b dm(int index, d3.b builderForValue) {
            El();
            ((s2) this.f126038b).cn(index, builderForValue.build());
            return this;
        }

        public b em(int index, d3 value) {
            El();
            ((s2) this.f126038b).cn(index, value);
            return this;
        }

        public b fm(boolean value) {
            El();
            ((s2) this.f126038b).dn(value);
            return this;
        }

        @Override // com.google.protobuf.t2
        public String getName() {
            return ((s2) this.f126038b).getName();
        }

        public b gm(String value) {
            El();
            ((s2) this.f126038b).en(value);
            return this;
        }

        public b hm(u value) {
            El();
            ((s2) this.f126038b).fn(value);
            return this;
        }

        public b im(boolean value) {
            El();
            ((s2) this.f126038b).gn(value);
            return this;
        }

        public b jm(String value) {
            El();
            ((s2) this.f126038b).hn(value);
            return this;
        }

        public b km(u value) {
            El();
            ((s2) this.f126038b).in(value);
            return this;
        }

        public b lm(b4 value) {
            El();
            ((s2) this.f126038b).jn(value);
            return this;
        }

        public b mm(int value) {
            El();
            ((s2) this.f126038b).kn(value);
            return this;
        }

        @Override // com.google.protobuf.t2
        public List<d3> n() {
            return Collections.unmodifiableList(((s2) this.f126038b).n());
        }

        @Override // com.google.protobuf.t2
        public d3 o(int index) {
            return ((s2) this.f126038b).o(index);
        }

        @Override // com.google.protobuf.t2
        public b4 p() {
            return ((s2) this.f126038b).p();
        }

        @Override // com.google.protobuf.t2
        public int q() {
            return ((s2) this.f126038b).q();
        }

        @Override // com.google.protobuf.t2
        public boolean q4() {
            return ((s2) this.f126038b).q4();
        }

        @Override // com.google.protobuf.t2
        public String q6() {
            return ((s2) this.f126038b).q6();
        }

        @Override // com.google.protobuf.t2
        public int w() {
            return ((s2) this.f126038b).w();
        }

        private b() {
            super(s2.DEFAULT_INSTANCE);
        }
    }

    static {
        s2 s2Var = new s2();
        DEFAULT_INSTANCE = s2Var;
        l1.Wl(s2.class, s2Var);
    }

    private s2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Am() {
        this.options_ = l1.Ij();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bm() {
        this.requestStreaming_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Cm() {
        this.requestTypeUrl_ = Hm().W5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dm() {
        this.responseStreaming_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Em() {
        this.responseTypeUrl_ = Hm().q6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Fm() {
        this.syntax_ = 0;
    }

    private void Gm() {
        s1.k<d3> kVar = this.options_;
        if (!kVar.s1()) {
            this.options_ = l1.yl(kVar);
        }
    }

    public static s2 Hm() {
        return DEFAULT_INSTANCE;
    }

    public static b Km() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b Lm(s2 prototype) {
        return DEFAULT_INSTANCE.Uf(prototype);
    }

    public static s2 Mm(InputStream input) throws IOException {
        return (s2) l1.El(DEFAULT_INSTANCE, input);
    }

    public static s2 Nm(InputStream input, v0 extensionRegistry) throws IOException {
        return (s2) l1.Fl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static s2 Om(u data) throws t1 {
        return (s2) l1.Gl(DEFAULT_INSTANCE, data);
    }

    public static s2 Pm(u data, v0 extensionRegistry) throws t1 {
        return (s2) l1.Hl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static s2 Qm(z input) throws IOException {
        return (s2) l1.Il(DEFAULT_INSTANCE, input);
    }

    public static s2 Rm(z input, v0 extensionRegistry) throws IOException {
        return (s2) l1.Jl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static s2 Sm(InputStream input) throws IOException {
        return (s2) l1.Kl(DEFAULT_INSTANCE, input);
    }

    public static s2 Tm(InputStream input, v0 extensionRegistry) throws IOException {
        return (s2) l1.Ll(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static s2 Um(ByteBuffer data) throws t1 {
        return (s2) l1.Ml(DEFAULT_INSTANCE, data);
    }

    public static s2 Vm(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (s2) l1.Nl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static s2 Wm(byte[] data) throws t1 {
        return (s2) l1.Ol(DEFAULT_INSTANCE, data);
    }

    public static s2 Xm(byte[] data, v0 extensionRegistry) throws t1 {
        return (s2) l1.Pl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static f3<s2> Ym() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Zm(int index) {
        Gm();
        this.options_.remove(index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void an(String value) {
        value.getClass();
        this.name_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bn(u value) {
        com.google.protobuf.a.R(value);
        this.name_ = value.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cn(int index, d3 value) {
        value.getClass();
        Gm();
        this.options_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dn(boolean value) {
        this.requestStreaming_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void en(String value) {
        value.getClass();
        this.requestTypeUrl_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fn(u value) {
        com.google.protobuf.a.R(value);
        this.requestTypeUrl_ = value.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gn(boolean value) {
        this.responseStreaming_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn(String value) {
        value.getClass();
        this.responseTypeUrl_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void in(u value) {
        com.google.protobuf.a.R(value);
        this.responseTypeUrl_ = value.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jn(b4 value) {
        this.syntax_ = value.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kn(int value) {
        this.syntax_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wm(Iterable<? extends d3> values) {
        Gm();
        com.google.protobuf.a.y(values, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xm(int index, d3 value) {
        value.getClass();
        Gm();
        this.options_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ym(d3 value) {
        value.getClass();
        Gm();
        this.options_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zm() {
        this.name_ = Hm().getName();
    }

    @Override // com.google.protobuf.t2
    public u I4() {
        return u.C(this.responseTypeUrl_);
    }

    public e3 Im(int index) {
        return this.options_.get(index);
    }

    public List<? extends e3> Jm() {
        return this.options_;
    }

    @Override // com.google.protobuf.t2
    public boolean L2() {
        return this.requestStreaming_;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i method, Object arg0, Object arg1) {
        f3 cVar;
        int i10 = a.f126342a[method.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new s2();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005\u0007\u0006\u001b\u0007\f", new Object[]{"name_", "requestTypeUrl_", "requestStreaming_", "responseTypeUrl_", "responseStreaming_", "options_", d3.class, "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<s2> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (s2.class) {
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

    @Override // com.google.protobuf.t2
    public String W5() {
        return this.requestTypeUrl_;
    }

    @Override // com.google.protobuf.t2
    public u X1() {
        return u.C(this.requestTypeUrl_);
    }

    @Override // com.google.protobuf.t2
    public u a() {
        return u.C(this.name_);
    }

    @Override // com.google.protobuf.t2
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.t2
    public List<d3> n() {
        return this.options_;
    }

    @Override // com.google.protobuf.t2
    public d3 o(int index) {
        return this.options_.get(index);
    }

    @Override // com.google.protobuf.t2
    public b4 p() {
        b4 b4VarB = b4.b(this.syntax_);
        if (b4VarB == null) {
            b4VarB = b4.UNRECOGNIZED;
        }
        return b4VarB;
    }

    @Override // com.google.protobuf.t2
    public int q() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.t2
    public boolean q4() {
        return this.responseStreaming_;
    }

    @Override // com.google.protobuf.t2
    public String q6() {
        return this.responseTypeUrl_;
    }

    @Override // com.google.protobuf.t2
    public int w() {
        return this.syntax_;
    }
}
