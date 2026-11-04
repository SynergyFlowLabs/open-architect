package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class q0 extends l1<q0, b> implements r0 {
    private static final q0 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile f3<q0> PARSER;
    private int number_;
    private String name_ = "";
    private s1.k<d3> options_ = l1.Ij();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126250a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126250a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126250a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126250a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126250a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126250a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126250a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126250a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<q0, b> implements r0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b Ol(Iterable<? extends d3> values) {
            El();
            ((q0) this.f126038b).lm(values);
            return this;
        }

        public b Pl(int index, d3.b builderForValue) {
            El();
            ((q0) this.f126038b).mm(index, builderForValue.build());
            return this;
        }

        public b Ql(int index, d3 value) {
            El();
            ((q0) this.f126038b).mm(index, value);
            return this;
        }

        public b Rl(d3.b builderForValue) {
            El();
            ((q0) this.f126038b).nm(builderForValue.build());
            return this;
        }

        public b Sl(d3 value) {
            El();
            ((q0) this.f126038b).nm(value);
            return this;
        }

        public b Tl() {
            El();
            ((q0) this.f126038b).om();
            return this;
        }

        public b Ul() {
            El();
            ((q0) this.f126038b).pm();
            return this;
        }

        public b Vl() {
            El();
            ((q0) this.f126038b).qm();
            return this;
        }

        public b Wl(int index) {
            El();
            ((q0) this.f126038b).Km(index);
            return this;
        }

        public b Xl(String value) {
            El();
            ((q0) this.f126038b).Lm(value);
            return this;
        }

        public b Yl(u value) {
            El();
            ((q0) this.f126038b).Mm(value);
            return this;
        }

        public b Zl(int value) {
            El();
            ((q0) this.f126038b).Nm(value);
            return this;
        }

        @Override // com.google.protobuf.r0
        public u a() {
            return ((q0) this.f126038b).a();
        }

        public b am(int index, d3.b builderForValue) {
            El();
            ((q0) this.f126038b).Om(index, builderForValue.build());
            return this;
        }

        public b bm(int index, d3 value) {
            El();
            ((q0) this.f126038b).Om(index, value);
            return this;
        }

        @Override // com.google.protobuf.r0
        public String getName() {
            return ((q0) this.f126038b).getName();
        }

        @Override // com.google.protobuf.r0
        public int i() {
            return ((q0) this.f126038b).i();
        }

        @Override // com.google.protobuf.r0
        public List<d3> n() {
            return Collections.unmodifiableList(((q0) this.f126038b).n());
        }

        @Override // com.google.protobuf.r0
        public d3 o(int index) {
            return ((q0) this.f126038b).o(index);
        }

        @Override // com.google.protobuf.r0
        public int q() {
            return ((q0) this.f126038b).q();
        }

        private b() {
            super(q0.DEFAULT_INSTANCE);
        }
    }

    static {
        q0 q0Var = new q0();
        DEFAULT_INSTANCE = q0Var;
        l1.Wl(q0.class, q0Var);
    }

    private q0() {
    }

    public static q0 Am(u data, v0 extensionRegistry) throws t1 {
        return (q0) l1.Hl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static q0 Bm(z input) throws IOException {
        return (q0) l1.Il(DEFAULT_INSTANCE, input);
    }

    public static q0 Cm(z input, v0 extensionRegistry) throws IOException {
        return (q0) l1.Jl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static q0 Dm(InputStream input) throws IOException {
        return (q0) l1.Kl(DEFAULT_INSTANCE, input);
    }

    public static q0 Em(InputStream input, v0 extensionRegistry) throws IOException {
        return (q0) l1.Ll(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static q0 Fm(ByteBuffer data) throws t1 {
        return (q0) l1.Ml(DEFAULT_INSTANCE, data);
    }

    public static q0 Gm(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (q0) l1.Nl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static q0 Hm(byte[] data) throws t1 {
        return (q0) l1.Ol(DEFAULT_INSTANCE, data);
    }

    public static q0 Im(byte[] data, v0 extensionRegistry) throws t1 {
        return (q0) l1.Pl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static f3<q0> Jm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Km(int index) {
        rm();
        this.options_.remove(index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lm(String value) {
        value.getClass();
        this.name_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Mm(u value) {
        com.google.protobuf.a.R(value);
        this.name_ = value.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Nm(int value) {
        this.number_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Om(int index, d3 value) {
        value.getClass();
        rm();
        this.options_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lm(Iterable<? extends d3> values) {
        rm();
        com.google.protobuf.a.y(values, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mm(int index, d3 value) {
        value.getClass();
        rm();
        this.options_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nm(d3 value) {
        value.getClass();
        rm();
        this.options_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void om() {
        this.name_ = sm().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pm() {
        this.number_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qm() {
        this.options_ = l1.Ij();
    }

    private void rm() {
        s1.k<d3> kVar = this.options_;
        if (kVar.s1()) {
            return;
        }
        this.options_ = l1.yl(kVar);
    }

    public static q0 sm() {
        return DEFAULT_INSTANCE;
    }

    public static b vm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b wm(q0 prototype) {
        return DEFAULT_INSTANCE.Uf(prototype);
    }

    public static q0 xm(InputStream input) throws IOException {
        return (q0) l1.El(DEFAULT_INSTANCE, input);
    }

    public static q0 ym(InputStream input, v0 extensionRegistry) throws IOException {
        return (q0) l1.Fl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static q0 zm(u data) throws t1 {
        return (q0) l1.Gl(DEFAULT_INSTANCE, data);
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i method, Object arg0, Object arg1) {
        f3 cVar;
        int i10 = a.f126250a[method.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new q0();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u001b", new Object[]{"name_", "number_", "options_", d3.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<q0> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (q0.class) {
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

    @Override // com.google.protobuf.r0
    public u a() {
        return u.C(this.name_);
    }

    @Override // com.google.protobuf.r0
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.r0
    public int i() {
        return this.number_;
    }

    @Override // com.google.protobuf.r0
    public List<d3> n() {
        return this.options_;
    }

    @Override // com.google.protobuf.r0
    public d3 o(int index) {
        return this.options_.get(index);
    }

    @Override // com.google.protobuf.r0
    public int q() {
        return this.options_.size();
    }

    public e3 tm(int index) {
        return this.options_.get(index);
    }

    public List<? extends e3> um() {
        return this.options_;
    }
}
