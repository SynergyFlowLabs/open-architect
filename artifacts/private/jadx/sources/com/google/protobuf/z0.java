package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class z0 extends l1<z0, b> implements e1 {
    public static final int CARDINALITY_FIELD_NUMBER = 2;
    private static final z0 DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 11;
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    public static final int KIND_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int NUMBER_FIELD_NUMBER = 3;
    public static final int ONEOF_INDEX_FIELD_NUMBER = 7;
    public static final int OPTIONS_FIELD_NUMBER = 9;
    public static final int PACKED_FIELD_NUMBER = 8;
    private static volatile f3<z0> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 6;
    private int cardinality_;
    private int kind_;
    private int number_;
    private int oneofIndex_;
    private boolean packed_;
    private String name_ = "";
    private String typeUrl_ = "";
    private s1.k<d3> options_ = l1.Ij();
    private String jsonName_ = "";
    private String defaultValue_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126577a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126577a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126577a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126577a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126577a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126577a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126577a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126577a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<z0, b> implements e1 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.protobuf.e1
        public boolean C0() {
            return ((z0) this.f126038b).C0();
        }

        @Override // com.google.protobuf.e1
        public String K() {
            return ((z0) this.f126038b).K();
        }

        @Override // com.google.protobuf.e1
        public int K7() {
            return ((z0) this.f126038b).K7();
        }

        @Override // com.google.protobuf.e1
        public String M0() {
            return ((z0) this.f126038b).M0();
        }

        public b Ol(Iterable<? extends d3> values) {
            El();
            ((z0) this.f126038b).Em(values);
            return this;
        }

        @Override // com.google.protobuf.e1
        public u P0() {
            return ((z0) this.f126038b).P0();
        }

        public b Pl(int index, d3.b builderForValue) {
            El();
            ((z0) this.f126038b).Fm(index, builderForValue.build());
            return this;
        }

        public b Ql(int index, d3 value) {
            El();
            ((z0) this.f126038b).Fm(index, value);
            return this;
        }

        public b Rl(d3.b builderForValue) {
            El();
            ((z0) this.f126038b).Gm(builderForValue.build());
            return this;
        }

        public b Sl(d3 value) {
            El();
            ((z0) this.f126038b).Gm(value);
            return this;
        }

        public b Tl() {
            El();
            ((z0) this.f126038b).Hm();
            return this;
        }

        @Override // com.google.protobuf.e1
        public int U2() {
            return ((z0) this.f126038b).U2();
        }

        public b Ul() {
            El();
            ((z0) this.f126038b).Im();
            return this;
        }

        @Override // com.google.protobuf.e1
        public c V4() {
            return ((z0) this.f126038b).V4();
        }

        public b Vl() {
            El();
            ((z0) this.f126038b).Jm();
            return this;
        }

        public b Wl() {
            El();
            ((z0) this.f126038b).Km();
            return this;
        }

        public b Xl() {
            El();
            ((z0) this.f126038b).Lm();
            return this;
        }

        public b Yl() {
            El();
            ((z0) this.f126038b).Mm();
            return this;
        }

        public b Zl() {
            El();
            ((z0) this.f126038b).Nm();
            return this;
        }

        @Override // com.google.protobuf.e1
        public u a() {
            return ((z0) this.f126038b).a();
        }

        public b am() {
            El();
            ((z0) this.f126038b).Om();
            return this;
        }

        public b bm() {
            El();
            ((z0) this.f126038b).Pm();
            return this;
        }

        @Override // com.google.protobuf.e1
        public u c0() {
            return ((z0) this.f126038b).c0();
        }

        public b cm() {
            El();
            ((z0) this.f126038b).Qm();
            return this;
        }

        public b dm(int index) {
            El();
            ((z0) this.f126038b).kn(index);
            return this;
        }

        public b em(c value) {
            El();
            ((z0) this.f126038b).ln(value);
            return this;
        }

        public b fm(int value) {
            El();
            ((z0) this.f126038b).mn(value);
            return this;
        }

        @Override // com.google.protobuf.e1
        public d getKind() {
            return ((z0) this.f126038b).getKind();
        }

        @Override // com.google.protobuf.e1
        public String getName() {
            return ((z0) this.f126038b).getName();
        }

        public b gm(String value) {
            El();
            ((z0) this.f126038b).nn(value);
            return this;
        }

        public b hm(u value) {
            El();
            ((z0) this.f126038b).on(value);
            return this;
        }

        @Override // com.google.protobuf.e1
        public int i() {
            return ((z0) this.f126038b).i();
        }

        @Override // com.google.protobuf.e1
        public int i0() {
            return ((z0) this.f126038b).i0();
        }

        public b im(String value) {
            El();
            ((z0) this.f126038b).pn(value);
            return this;
        }

        @Override // com.google.protobuf.e1
        public u j0() {
            return ((z0) this.f126038b).j0();
        }

        public b jm(u value) {
            El();
            ((z0) this.f126038b).qn(value);
            return this;
        }

        public b km(d value) {
            El();
            ((z0) this.f126038b).rn(value);
            return this;
        }

        @Override // com.google.protobuf.e1
        public String l0() {
            return ((z0) this.f126038b).l0();
        }

        public b lm(int value) {
            El();
            ((z0) this.f126038b).sn(value);
            return this;
        }

        public b mm(String value) {
            El();
            ((z0) this.f126038b).tn(value);
            return this;
        }

        @Override // com.google.protobuf.e1
        public List<d3> n() {
            return Collections.unmodifiableList(((z0) this.f126038b).n());
        }

        public b nm(u value) {
            El();
            ((z0) this.f126038b).un(value);
            return this;
        }

        @Override // com.google.protobuf.e1
        public d3 o(int index) {
            return ((z0) this.f126038b).o(index);
        }

        public b om(int value) {
            El();
            ((z0) this.f126038b).vn(value);
            return this;
        }

        public b pm(int value) {
            El();
            ((z0) this.f126038b).wn(value);
            return this;
        }

        @Override // com.google.protobuf.e1
        public int q() {
            return ((z0) this.f126038b).q();
        }

        public b qm(int index, d3.b builderForValue) {
            El();
            ((z0) this.f126038b).xn(index, builderForValue.build());
            return this;
        }

        public b rm(int index, d3 value) {
            El();
            ((z0) this.f126038b).xn(index, value);
            return this;
        }

        public b sm(boolean value) {
            El();
            ((z0) this.f126038b).yn(value);
            return this;
        }

        public b tm(String value) {
            El();
            ((z0) this.f126038b).zn(value);
            return this;
        }

        public b um(u value) {
            El();
            ((z0) this.f126038b).An(value);
            return this;
        }

        private b() {
            super(z0.DEFAULT_INSTANCE);
        }
    }

    public enum c implements s1.c {
        CARDINALITY_UNKNOWN(0),
        CARDINALITY_OPTIONAL(1),
        CARDINALITY_REQUIRED(2),
        CARDINALITY_REPEATED(3),
        UNRECOGNIZED(-1);


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f126583g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f126584h = 1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f126585i = 2;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f126586j = 3;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final s1.d<c> f126587k = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f126589a;

        class a implements s1.d<c> {
            a() {
            }

            @Override // com.google.protobuf.s1.d
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c a(int number) {
                return c.b(number);
            }
        }

        private static final class b implements s1.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final s1.e f126590a = new b();

            private b() {
            }

            @Override // com.google.protobuf.s1.e
            public boolean a(int number) {
                return c.b(number) != null;
            }
        }

        c(int value) {
            this.f126589a = value;
        }

        public static c b(int value) {
            if (value == 0) {
                return CARDINALITY_UNKNOWN;
            }
            if (value == 1) {
                return CARDINALITY_OPTIONAL;
            }
            if (value == 2) {
                return CARDINALITY_REQUIRED;
            }
            if (value != 3) {
                return null;
            }
            return CARDINALITY_REPEATED;
        }

        public static s1.d<c> k() {
            return f126587k;
        }

        public static s1.e l() {
            return b.f126590a;
        }

        @Deprecated
        public static c n(int value) {
            return b(value);
        }

        @Override // com.google.protobuf.s1.c
        public final int i() {
            if (this != UNRECOGNIZED) {
                return this.f126589a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public enum d implements s1.c {
        TYPE_UNKNOWN(0),
        TYPE_DOUBLE(1),
        TYPE_FLOAT(2),
        TYPE_INT64(3),
        TYPE_UINT64(4),
        TYPE_INT32(5),
        TYPE_FIXED64(6),
        TYPE_FIXED32(7),
        TYPE_BOOL(8),
        TYPE_STRING(9),
        TYPE_GROUP(10),
        TYPE_MESSAGE(11),
        TYPE_BYTES(12),
        TYPE_UINT32(13),
        TYPE_ENUM(14),
        TYPE_SFIXED32(15),
        TYPE_SFIXED64(16),
        TYPE_SINT32(17),
        TYPE_SINT64(18),
        UNRECOGNIZED(-1);

        public static final int H1 = 3;
        public static final int Z = 0;

        /* JADX INFO: renamed from: g3, reason: collision with root package name */
        public static final int f126597g3 = 5;

        /* JADX INFO: renamed from: h3, reason: collision with root package name */
        public static final int f126599h3 = 6;

        /* JADX INFO: renamed from: i3, reason: collision with root package name */
        public static final int f126601i3 = 7;

        /* JADX INFO: renamed from: j3, reason: collision with root package name */
        public static final int f126603j3 = 8;

        /* JADX INFO: renamed from: k3, reason: collision with root package name */
        public static final int f126605k3 = 9;

        /* JADX INFO: renamed from: l3, reason: collision with root package name */
        public static final int f126607l3 = 10;

        /* JADX INFO: renamed from: m3, reason: collision with root package name */
        public static final int f126609m3 = 11;

        /* JADX INFO: renamed from: n3, reason: collision with root package name */
        public static final int f126611n3 = 12;

        /* JADX INFO: renamed from: o3, reason: collision with root package name */
        public static final int f126613o3 = 13;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final int f126614p0 = 1;

        /* JADX INFO: renamed from: p1, reason: collision with root package name */
        public static final int f126615p1 = 2;

        /* JADX INFO: renamed from: p2, reason: collision with root package name */
        public static final int f126616p2 = 4;

        /* JADX INFO: renamed from: p3, reason: collision with root package name */
        public static final int f126617p3 = 14;

        /* JADX INFO: renamed from: q3, reason: collision with root package name */
        public static final int f126618q3 = 15;

        /* JADX INFO: renamed from: r3, reason: collision with root package name */
        public static final int f126619r3 = 16;

        /* JADX INFO: renamed from: s3, reason: collision with root package name */
        public static final int f126621s3 = 17;

        /* JADX INFO: renamed from: t3, reason: collision with root package name */
        public static final int f126623t3 = 18;

        /* JADX INFO: renamed from: u3, reason: collision with root package name */
        private static final s1.d<d> f126624u3 = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f126628a;

        class a implements s1.d<d> {
            a() {
            }

            @Override // com.google.protobuf.s1.d
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d a(int number) {
                return d.b(number);
            }
        }

        private static final class b implements s1.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final s1.e f126629a = new b();

            private b() {
            }

            @Override // com.google.protobuf.s1.e
            public boolean a(int number) {
                return d.b(number) != null;
            }
        }

        d(int value) {
            this.f126628a = value;
        }

        public static d b(int value) {
            switch (value) {
                case 0:
                    return TYPE_UNKNOWN;
                case 1:
                    return TYPE_DOUBLE;
                case 2:
                    return TYPE_FLOAT;
                case 3:
                    return TYPE_INT64;
                case 4:
                    return TYPE_UINT64;
                case 5:
                    return TYPE_INT32;
                case 6:
                    return TYPE_FIXED64;
                case 7:
                    return TYPE_FIXED32;
                case 8:
                    return TYPE_BOOL;
                case 9:
                    return TYPE_STRING;
                case 10:
                    return TYPE_GROUP;
                case 11:
                    return TYPE_MESSAGE;
                case 12:
                    return TYPE_BYTES;
                case 13:
                    return TYPE_UINT32;
                case 14:
                    return TYPE_ENUM;
                case 15:
                    return TYPE_SFIXED32;
                case 16:
                    return TYPE_SFIXED64;
                case 17:
                    return TYPE_SINT32;
                case 18:
                    return TYPE_SINT64;
                default:
                    return null;
            }
        }

        public static s1.d<d> k() {
            return f126624u3;
        }

        public static s1.e l() {
            return b.f126629a;
        }

        @Deprecated
        public static d n(int value) {
            return b(value);
        }

        @Override // com.google.protobuf.s1.c
        public final int i() {
            if (this != UNRECOGNIZED) {
                return this.f126628a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        z0 z0Var = new z0();
        DEFAULT_INSTANCE = z0Var;
        l1.Wl(z0.class, z0Var);
    }

    private z0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void An(u value) {
        com.google.protobuf.a.R(value);
        this.typeUrl_ = value.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Em(Iterable<? extends d3> values) {
        Rm();
        com.google.protobuf.a.y(values, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Fm(int index, d3 value) {
        value.getClass();
        Rm();
        this.options_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Gm(d3 value) {
        value.getClass();
        Rm();
        this.options_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Hm() {
        this.cardinality_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Im() {
        this.defaultValue_ = Sm().K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Jm() {
        this.jsonName_ = Sm().M0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Km() {
        this.kind_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lm() {
        this.name_ = Sm().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Mm() {
        this.number_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Nm() {
        this.oneofIndex_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Om() {
        this.options_ = l1.Ij();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Pm() {
        this.packed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qm() {
        this.typeUrl_ = Sm().l0();
    }

    private void Rm() {
        s1.k<d3> kVar = this.options_;
        if (kVar.s1()) {
            return;
        }
        this.options_ = l1.yl(kVar);
    }

    public static z0 Sm() {
        return DEFAULT_INSTANCE;
    }

    public static b Vm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b Wm(z0 prototype) {
        return DEFAULT_INSTANCE.Uf(prototype);
    }

    public static z0 Xm(InputStream input) throws IOException {
        return (z0) l1.El(DEFAULT_INSTANCE, input);
    }

    public static z0 Ym(InputStream input, v0 extensionRegistry) throws IOException {
        return (z0) l1.Fl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static z0 Zm(u data) throws t1 {
        return (z0) l1.Gl(DEFAULT_INSTANCE, data);
    }

    public static z0 an(u data, v0 extensionRegistry) throws t1 {
        return (z0) l1.Hl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static z0 bn(z input) throws IOException {
        return (z0) l1.Il(DEFAULT_INSTANCE, input);
    }

    public static z0 cn(z input, v0 extensionRegistry) throws IOException {
        return (z0) l1.Jl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static z0 dn(InputStream input) throws IOException {
        return (z0) l1.Kl(DEFAULT_INSTANCE, input);
    }

    public static z0 en(InputStream input, v0 extensionRegistry) throws IOException {
        return (z0) l1.Ll(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static z0 fn(ByteBuffer data) throws t1 {
        return (z0) l1.Ml(DEFAULT_INSTANCE, data);
    }

    public static z0 gn(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (z0) l1.Nl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static z0 hn(byte[] data) throws t1 {
        return (z0) l1.Ol(DEFAULT_INSTANCE, data);
    }

    public static z0 in(byte[] data, v0 extensionRegistry) throws t1 {
        return (z0) l1.Pl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static f3<z0> jn() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kn(int index) {
        Rm();
        this.options_.remove(index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ln(c value) {
        this.cardinality_ = value.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mn(int value) {
        this.cardinality_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nn(String value) {
        value.getClass();
        this.defaultValue_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void on(u value) {
        com.google.protobuf.a.R(value);
        this.defaultValue_ = value.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pn(String value) {
        value.getClass();
        this.jsonName_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qn(u value) {
        com.google.protobuf.a.R(value);
        this.jsonName_ = value.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rn(d value) {
        this.kind_ = value.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sn(int value) {
        this.kind_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tn(String value) {
        value.getClass();
        this.name_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void un(u value) {
        com.google.protobuf.a.R(value);
        this.name_ = value.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vn(int value) {
        this.number_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wn(int value) {
        this.oneofIndex_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xn(int index, d3 value) {
        value.getClass();
        Rm();
        this.options_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yn(boolean value) {
        this.packed_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zn(String value) {
        value.getClass();
        this.typeUrl_ = value;
    }

    @Override // com.google.protobuf.e1
    public boolean C0() {
        return this.packed_;
    }

    @Override // com.google.protobuf.e1
    public String K() {
        return this.defaultValue_;
    }

    @Override // com.google.protobuf.e1
    public int K7() {
        return this.kind_;
    }

    @Override // com.google.protobuf.e1
    public String M0() {
        return this.jsonName_;
    }

    @Override // com.google.protobuf.e1
    public u P0() {
        return u.C(this.jsonName_);
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i method, Object arg0, Object arg1) {
        f3 cVar;
        int i10 = a.f126577a[method.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new z0();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\u000b\n\u0000\u0001\u0000\u0001\f\u0002\f\u0003\u0004\u0004Ȉ\u0006Ȉ\u0007\u0004\b\u0007\t\u001b\nȈ\u000bȈ", new Object[]{"kind_", "cardinality_", "number_", "name_", "typeUrl_", "oneofIndex_", "packed_", "options_", d3.class, "jsonName_", "defaultValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<z0> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (z0.class) {
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

    public e3 Tm(int index) {
        return this.options_.get(index);
    }

    @Override // com.google.protobuf.e1
    public int U2() {
        return this.cardinality_;
    }

    public List<? extends e3> Um() {
        return this.options_;
    }

    @Override // com.google.protobuf.e1
    public c V4() {
        c cVarB = c.b(this.cardinality_);
        return cVarB == null ? c.UNRECOGNIZED : cVarB;
    }

    @Override // com.google.protobuf.e1
    public u a() {
        return u.C(this.name_);
    }

    @Override // com.google.protobuf.e1
    public u c0() {
        return u.C(this.defaultValue_);
    }

    @Override // com.google.protobuf.e1
    public d getKind() {
        d dVarB = d.b(this.kind_);
        return dVarB == null ? d.UNRECOGNIZED : dVarB;
    }

    @Override // com.google.protobuf.e1
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.e1
    public int i() {
        return this.number_;
    }

    @Override // com.google.protobuf.e1
    public int i0() {
        return this.oneofIndex_;
    }

    @Override // com.google.protobuf.e1
    public u j0() {
        return u.C(this.typeUrl_);
    }

    @Override // com.google.protobuf.e1
    public String l0() {
        return this.typeUrl_;
    }

    @Override // com.google.protobuf.e1
    public List<d3> n() {
        return this.options_;
    }

    @Override // com.google.protobuf.e1
    public d3 o(int index) {
        return this.options_.get(index);
    }

    @Override // com.google.protobuf.e1
    public int q() {
        return this.options_.size();
    }
}
