package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class v4 extends l1<v4, b> implements w4 {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    private static final v4 DEFAULT_INSTANCE;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static volatile f3<v4> PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private int kindCase_ = 0;
    private Object kind_;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126430a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126430a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126430a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126430a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126430a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126430a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126430a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126430a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<v4, b> implements w4 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.protobuf.w4
        public u I1() {
            return ((v4) this.f126038b).I1();
        }

        @Override // com.google.protobuf.w4
        public boolean L7() {
            return ((v4) this.f126038b).L7();
        }

        public b Ol() {
            El();
            ((v4) this.f126038b).rm();
            return this;
        }

        public b Pl() {
            El();
            ((v4) this.f126038b).sm();
            return this;
        }

        @Override // com.google.protobuf.w4
        public boolean Q3() {
            return ((v4) this.f126038b).Q3();
        }

        @Override // com.google.protobuf.w4
        public double Q6() {
            return ((v4) this.f126038b).Q6();
        }

        public b Ql() {
            El();
            ((v4) this.f126038b).tm();
            return this;
        }

        public b Rl() {
            El();
            ((v4) this.f126038b).um();
            return this;
        }

        @Override // com.google.protobuf.w4
        public boolean S3() {
            return ((v4) this.f126038b).S3();
        }

        public b Sl() {
            El();
            ((v4) this.f126038b).vm();
            return this;
        }

        public b Tl() {
            El();
            ((v4) this.f126038b).wm();
            return this;
        }

        public b Ul() {
            El();
            ((v4) this.f126038b).xm();
            return this;
        }

        public b Vl(c2 value) {
            El();
            ((v4) this.f126038b).zm(value);
            return this;
        }

        public b Wl(x3 value) {
            El();
            ((v4) this.f126038b).Am(value);
            return this;
        }

        public b Xl(boolean value) {
            El();
            ((v4) this.f126038b).Qm(value);
            return this;
        }

        @Override // com.google.protobuf.w4
        public String Y() {
            return ((v4) this.f126038b).Y();
        }

        public b Yl(c2.b builderForValue) {
            El();
            ((v4) this.f126038b).Rm(builderForValue.build());
            return this;
        }

        public b Zl(c2 value) {
            El();
            ((v4) this.f126038b).Rm(value);
            return this;
        }

        public b am(b3 value) {
            El();
            ((v4) this.f126038b).Sm(value);
            return this;
        }

        @Override // com.google.protobuf.w4
        public boolean b0() {
            return ((v4) this.f126038b).b0();
        }

        public b bm(int value) {
            El();
            ((v4) this.f126038b).Tm(value);
            return this;
        }

        public b cm(double value) {
            El();
            ((v4) this.f126038b).Um(value);
            return this;
        }

        public b dm(String value) {
            El();
            ((v4) this.f126038b).Vm(value);
            return this;
        }

        public b em(u value) {
            El();
            ((v4) this.f126038b).Wm(value);
            return this;
        }

        @Override // com.google.protobuf.w4
        public x3 f6() {
            return ((v4) this.f126038b).f6();
        }

        public b fm(x3.b builderForValue) {
            El();
            ((v4) this.f126038b).Xm(builderForValue.build());
            return this;
        }

        @Override // com.google.protobuf.w4
        public c g6() {
            return ((v4) this.f126038b).g6();
        }

        public b gm(x3 value) {
            El();
            ((v4) this.f126038b).Xm(value);
            return this;
        }

        @Override // com.google.protobuf.w4
        public boolean h7() {
            return ((v4) this.f126038b).h7();
        }

        @Override // com.google.protobuf.w4
        public int i4() {
            return ((v4) this.f126038b).i4();
        }

        @Override // com.google.protobuf.w4
        public boolean j3() {
            return ((v4) this.f126038b).j3();
        }

        @Override // com.google.protobuf.w4
        public c2 k3() {
            return ((v4) this.f126038b).k3();
        }

        @Override // com.google.protobuf.w4
        public b3 k4() {
            return ((v4) this.f126038b).k4();
        }

        @Override // com.google.protobuf.w4
        public boolean m6() {
            return ((v4) this.f126038b).m6();
        }

        private b() {
            super(v4.DEFAULT_INSTANCE);
        }
    }

    public enum c {
        NULL_VALUE(1),
        NUMBER_VALUE(2),
        STRING_VALUE(3),
        BOOL_VALUE(4),
        STRUCT_VALUE(5),
        LIST_VALUE(6),
        KIND_NOT_SET(0);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f126439a;

        static {
            int i10 = 1 & 2;
        }

        c(int value) {
            this.f126439a = value;
        }

        public static c b(int value) {
            switch (value) {
                case 0:
                    return KIND_NOT_SET;
                case 1:
                    return NULL_VALUE;
                case 2:
                    return NUMBER_VALUE;
                case 3:
                    return STRING_VALUE;
                case 4:
                    return BOOL_VALUE;
                case 5:
                    return STRUCT_VALUE;
                case 6:
                    return LIST_VALUE;
                default:
                    return null;
            }
        }

        @Deprecated
        public static c c(int value) {
            return b(value);
        }

        public int i() {
            return this.f126439a;
        }
    }

    static {
        v4 v4Var = new v4();
        DEFAULT_INSTANCE = v4Var;
        l1.Wl(v4.class, v4Var);
    }

    private v4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Am(x3 value) {
        value.getClass();
        if (this.kindCase_ != 5 || this.kind_ == x3.bm()) {
            this.kind_ = value;
        } else {
            this.kind_ = x3.gm((x3) this.kind_).Jl(value).B1();
        }
        this.kindCase_ = 5;
    }

    public static b Bm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b Cm(v4 prototype) {
        return DEFAULT_INSTANCE.Uf(prototype);
    }

    public static v4 Dm(InputStream input) throws IOException {
        return (v4) l1.El(DEFAULT_INSTANCE, input);
    }

    public static v4 Em(InputStream input, v0 extensionRegistry) throws IOException {
        return (v4) l1.Fl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static v4 Fm(u data) throws t1 {
        return (v4) l1.Gl(DEFAULT_INSTANCE, data);
    }

    public static v4 Gm(u data, v0 extensionRegistry) throws t1 {
        return (v4) l1.Hl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static v4 Hm(z input) throws IOException {
        return (v4) l1.Il(DEFAULT_INSTANCE, input);
    }

    public static v4 Im(z input, v0 extensionRegistry) throws IOException {
        return (v4) l1.Jl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static v4 Jm(InputStream input) throws IOException {
        return (v4) l1.Kl(DEFAULT_INSTANCE, input);
    }

    public static v4 Km(InputStream input, v0 extensionRegistry) throws IOException {
        return (v4) l1.Ll(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static v4 Lm(ByteBuffer data) throws t1 {
        return (v4) l1.Ml(DEFAULT_INSTANCE, data);
    }

    public static v4 Mm(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (v4) l1.Nl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static v4 Nm(byte[] data) throws t1 {
        return (v4) l1.Ol(DEFAULT_INSTANCE, data);
    }

    public static v4 Om(byte[] data, v0 extensionRegistry) throws t1 {
        return (v4) l1.Pl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static f3<v4> Pm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qm(boolean value) {
        this.kindCase_ = 4;
        this.kind_ = Boolean.valueOf(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Rm(c2 value) {
        value.getClass();
        this.kind_ = value;
        this.kindCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sm(b3 value) {
        this.kind_ = Integer.valueOf(value.i());
        this.kindCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Tm(int value) {
        this.kindCase_ = 1;
        this.kind_ = Integer.valueOf(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Um(double value) {
        this.kindCase_ = 2;
        this.kind_ = Double.valueOf(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Vm(String value) {
        value.getClass();
        this.kindCase_ = 3;
        this.kind_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Wm(u value) {
        com.google.protobuf.a.R(value);
        this.kind_ = value.z0();
        this.kindCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Xm(x3 value) {
        value.getClass();
        this.kind_ = value;
        this.kindCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rm() {
        if (this.kindCase_ == 4) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sm() {
        this.kindCase_ = 0;
        this.kind_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tm() {
        if (this.kindCase_ == 6) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void um() {
        if (this.kindCase_ == 1) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vm() {
        if (this.kindCase_ == 2) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wm() {
        if (this.kindCase_ == 3) {
            int i10 = 0 >> 0;
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xm() {
        if (this.kindCase_ == 5) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    public static v4 ym() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zm(c2 value) {
        value.getClass();
        if (this.kindCase_ != 6 || this.kind_ == c2.lm()) {
            this.kind_ = value;
        } else {
            this.kind_ = c2.pm((c2) this.kind_).Jl(value).B1();
        }
        this.kindCase_ = 6;
    }

    @Override // com.google.protobuf.w4
    public u I1() {
        return u.C(this.kindCase_ == 3 ? (String) this.kind_ : "");
    }

    @Override // com.google.protobuf.w4
    public boolean L7() {
        if (this.kindCase_ == 4) {
            return ((Boolean) this.kind_).booleanValue();
        }
        return false;
    }

    @Override // com.google.protobuf.w4
    public boolean Q3() {
        return this.kindCase_ == 6;
    }

    @Override // com.google.protobuf.w4
    public double Q6() {
        if (this.kindCase_ == 2) {
            return ((Double) this.kind_).doubleValue();
        }
        return 0.0d;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i method, Object arg0, Object arg1) {
        f3 cVar;
        int i10 = a.f126430a[method.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new v4();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"kind_", "kindCase_", x3.class, c2.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<v4> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (v4.class) {
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

    @Override // com.google.protobuf.w4
    public boolean S3() {
        return this.kindCase_ == 4;
    }

    @Override // com.google.protobuf.w4
    public String Y() {
        return this.kindCase_ == 3 ? (String) this.kind_ : "";
    }

    @Override // com.google.protobuf.w4
    public boolean b0() {
        return this.kindCase_ == 3;
    }

    @Override // com.google.protobuf.w4
    public x3 f6() {
        int i10 = 2 & 5;
        return this.kindCase_ == 5 ? (x3) this.kind_ : x3.bm();
    }

    @Override // com.google.protobuf.w4
    public c g6() {
        return c.b(this.kindCase_);
    }

    @Override // com.google.protobuf.w4
    public boolean h7() {
        return this.kindCase_ == 2;
    }

    @Override // com.google.protobuf.w4
    public int i4() {
        if (this.kindCase_ == 1) {
            return ((Integer) this.kind_).intValue();
        }
        return 0;
    }

    @Override // com.google.protobuf.w4
    public boolean j3() {
        return this.kindCase_ == 5;
    }

    @Override // com.google.protobuf.w4
    public c2 k3() {
        return this.kindCase_ == 6 ? (c2) this.kind_ : c2.lm();
    }

    @Override // com.google.protobuf.w4
    public b3 k4() {
        if (this.kindCase_ != 1) {
            return b3.NULL_VALUE;
        }
        b3 b3VarB = b3.b(((Integer) this.kind_).intValue());
        return b3VarB == null ? b3.UNRECOGNIZED : b3VarB;
    }

    @Override // com.google.protobuf.w4
    public boolean m6() {
        return this.kindCase_ == 1;
    }
}
