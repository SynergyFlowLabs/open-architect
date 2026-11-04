package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class d3 extends l1<d3, b> implements e3 {
    private static final d3 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile f3<d3> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int bitField0_;
    private String name_ = "";
    private f value_;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f125829a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f125829a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f125829a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f125829a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f125829a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f125829a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f125829a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f125829a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<d3, b> implements e3 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b Ol() {
            El();
            ((d3) this.f126038b).gm();
            return this;
        }

        @Override // com.google.protobuf.e3
        public boolean P1() {
            return ((d3) this.f126038b).P1();
        }

        public b Pl() {
            El();
            ((d3) this.f126038b).hm();
            return this;
        }

        public b Ql(f value) {
            El();
            ((d3) this.f126038b).jm(value);
            return this;
        }

        public b Rl(String value) {
            El();
            ((d3) this.f126038b).zm(value);
            return this;
        }

        public b Sl(u value) {
            El();
            ((d3) this.f126038b).Am(value);
            return this;
        }

        public b Tl(f.b builderForValue) {
            El();
            ((d3) this.f126038b).Bm(builderForValue.build());
            return this;
        }

        public b Ul(f value) {
            El();
            ((d3) this.f126038b).Bm(value);
            return this;
        }

        @Override // com.google.protobuf.e3
        public u a() {
            return ((d3) this.f126038b).a();
        }

        @Override // com.google.protobuf.e3
        public String getName() {
            return ((d3) this.f126038b).getName();
        }

        @Override // com.google.protobuf.e3
        public f getValue() {
            return ((d3) this.f126038b).getValue();
        }

        private b() {
            super(d3.DEFAULT_INSTANCE);
        }
    }

    static {
        d3 d3Var = new d3();
        DEFAULT_INSTANCE = d3Var;
        l1.Wl(d3.class, d3Var);
    }

    private d3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Am(u value) {
        com.google.protobuf.a.R(value);
        this.name_ = value.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bm(f value) {
        value.getClass();
        this.value_ = value;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm() {
        this.name_ = im().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hm() {
        this.value_ = null;
        this.bitField0_ &= -2;
    }

    public static d3 im() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jm(f value) {
        value.getClass();
        f fVar = this.value_;
        if (fVar == null || fVar == f.hm()) {
            this.value_ = value;
        } else {
            this.value_ = f.jm(this.value_).Jl(value).B1();
        }
        this.bitField0_ |= 1;
    }

    public static b km() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b lm(d3 prototype) {
        return DEFAULT_INSTANCE.Uf(prototype);
    }

    public static d3 mm(InputStream input) throws IOException {
        return (d3) l1.El(DEFAULT_INSTANCE, input);
    }

    public static d3 nm(InputStream input, v0 extensionRegistry) throws IOException {
        return (d3) l1.Fl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static d3 om(u data) throws t1 {
        return (d3) l1.Gl(DEFAULT_INSTANCE, data);
    }

    public static d3 pm(u data, v0 extensionRegistry) throws t1 {
        return (d3) l1.Hl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static d3 qm(z input) throws IOException {
        return (d3) l1.Il(DEFAULT_INSTANCE, input);
    }

    public static d3 rm(z input, v0 extensionRegistry) throws IOException {
        return (d3) l1.Jl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static d3 sm(InputStream input) throws IOException {
        return (d3) l1.Kl(DEFAULT_INSTANCE, input);
    }

    public static d3 tm(InputStream input, v0 extensionRegistry) throws IOException {
        return (d3) l1.Ll(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static d3 um(ByteBuffer data) throws t1 {
        return (d3) l1.Ml(DEFAULT_INSTANCE, data);
    }

    public static d3 vm(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (d3) l1.Nl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static d3 wm(byte[] data) throws t1 {
        return (d3) l1.Ol(DEFAULT_INSTANCE, data);
    }

    public static d3 xm(byte[] data, v0 extensionRegistry) throws t1 {
        return (d3) l1.Pl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static f3<d3> ym() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zm(String value) {
        value.getClass();
        this.name_ = value;
    }

    @Override // com.google.protobuf.e3
    public boolean P1() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i method, Object arg0, Object arg1) {
        f3 cVar;
        int i10 = a.f125829a[method.ordinal()];
        a aVar = null;
        boolean z10 = true & false;
        switch (i10) {
            case 1:
                return new d3();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "name_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<d3> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (d3.class) {
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

    @Override // com.google.protobuf.e3
    public u a() {
        return u.C(this.name_);
    }

    @Override // com.google.protobuf.e3
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.e3
    public f getValue() {
        f fVarHm = this.value_;
        if (fVarHm == null) {
            fVarHm = f.hm();
        }
        return fVarHm;
    }
}
