package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
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
    private static volatile h3<z0> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 6;
    private int cardinality_;
    private int kind_;
    private int number_;
    private int oneofIndex_;
    private boolean packed_;
    private String name_ = "";
    private String typeUrl_ = "";
    private s1.l<f3> options_ = l1.T3();
    private String jsonName_ = "";
    private String defaultValue_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50840a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f50840a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50840a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50840a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50840a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50840a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f50840a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f50840a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<z0, b> implements e1 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b A5() {
            V3();
            ((z0) this.f50422b).O8();
            return this;
        }

        public b A6(int value) {
            V3();
            ((z0) this.f50422b).y9(value);
            return this;
        }

        public b B5() {
            V3();
            ((z0) this.f50422b).P8();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.e1
        public boolean C0() {
            return ((z0) this.f50422b).C0();
        }

        public b D5() {
            V3();
            ((z0) this.f50422b).Q8();
            return this;
        }

        public b E6(int index, f3.b builderForValue) {
            V3();
            ((z0) this.f50422b).z9(index, builderForValue.build());
            return this;
        }

        public b I5() {
            V3();
            ((z0) this.f50422b).R8();
            return this;
        }

        public b J5() {
            V3();
            ((z0) this.f50422b).S8();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.e1
        public String K() {
            return ((z0) this.f50422b).K();
        }

        @Override // androidx.datastore.preferences.protobuf.e1
        public int K7() {
            return ((z0) this.f50422b).K7();
        }

        public b L4(Iterable<? extends f3> values) {
            V3();
            ((z0) this.f50422b).G8(values);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.e1
        public String M0() {
            return ((z0) this.f50422b).M0();
        }

        @Override // androidx.datastore.preferences.protobuf.e1
        public u P0() {
            return ((z0) this.f50422b).P0();
        }

        public b P4(int index, f3.b builderForValue) {
            V3();
            ((z0) this.f50422b).H8(index, builderForValue.build());
            return this;
        }

        public b Q4(int index, f3 value) {
            V3();
            ((z0) this.f50422b).H8(index, value);
            return this;
        }

        public b R5(int index) {
            V3();
            ((z0) this.f50422b).m9(index);
            return this;
        }

        public b R6(int index, f3 value) {
            V3();
            ((z0) this.f50422b).z9(index, value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.e1
        public int U2() {
            return ((z0) this.f50422b).U2();
        }

        public b U4(f3.b builderForValue) {
            V3();
            ((z0) this.f50422b).I8(builderForValue.build());
            return this;
        }

        public b U6(boolean value) {
            V3();
            ((z0) this.f50422b).A9(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.e1
        public c V4() {
            return ((z0) this.f50422b).V4();
        }

        public b Y6(String value) {
            V3();
            ((z0) this.f50422b).B9(value);
            return this;
        }

        public b Z4(f3 value) {
            V3();
            ((z0) this.f50422b).I8(value);
            return this;
        }

        public b Z5(c value) {
            V3();
            ((z0) this.f50422b).n9(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.e1
        public u a() {
            return ((z0) this.f50422b).a();
        }

        public b a5() {
            V3();
            ((z0) this.f50422b).J8();
            return this;
        }

        public b a6(int value) {
            V3();
            ((z0) this.f50422b).o9(value);
            return this;
        }

        public b b5() {
            V3();
            ((z0) this.f50422b).K8();
            return this;
        }

        public b b7(u value) {
            V3();
            ((z0) this.f50422b).C9(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.e1
        public u c0() {
            return ((z0) this.f50422b).c0();
        }

        public b c6(String value) {
            V3();
            ((z0) this.f50422b).p9(value);
            return this;
        }

        public b d5() {
            V3();
            ((z0) this.f50422b).L8();
            return this;
        }

        public b d6(u value) {
            V3();
            ((z0) this.f50422b).q9(value);
            return this;
        }

        public b e6(String value) {
            V3();
            ((z0) this.f50422b).r9(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.e1
        public d getKind() {
            return ((z0) this.f50422b).getKind();
        }

        @Override // androidx.datastore.preferences.protobuf.e1
        public String getName() {
            return ((z0) this.f50422b).getName();
        }

        @Override // androidx.datastore.preferences.protobuf.e1
        public int i() {
            return ((z0) this.f50422b).i();
        }

        @Override // androidx.datastore.preferences.protobuf.e1
        public int i0() {
            return ((z0) this.f50422b).i0();
        }

        public b i6(u value) {
            V3();
            ((z0) this.f50422b).s9(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.e1
        public u j0() {
            return ((z0) this.f50422b).j0();
        }

        @Override // androidx.datastore.preferences.protobuf.e1
        public String l0() {
            return ((z0) this.f50422b).l0();
        }

        @Override // androidx.datastore.preferences.protobuf.e1
        public List<f3> n() {
            return Collections.unmodifiableList(((z0) this.f50422b).n());
        }

        @Override // androidx.datastore.preferences.protobuf.e1
        public f3 o(int index) {
            return ((z0) this.f50422b).o(index);
        }

        public b o6(d value) {
            V3();
            ((z0) this.f50422b).t9(value);
            return this;
        }

        public b p6(int value) {
            V3();
            ((z0) this.f50422b).u9(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.e1
        public int q() {
            return ((z0) this.f50422b).q();
        }

        public b r5() {
            V3();
            ((z0) this.f50422b).M8();
            return this;
        }

        public b r6(String value) {
            V3();
            ((z0) this.f50422b).v9(value);
            return this;
        }

        public b t6(u value) {
            V3();
            ((z0) this.f50422b).w9(value);
            return this;
        }

        public b w6(int value) {
            V3();
            ((z0) this.f50422b).x9(value);
            return this;
        }

        public b y5() {
            V3();
            ((z0) this.f50422b).N8();
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
        public static final int f50846g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f50847h = 1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f50848i = 2;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f50849j = 3;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final s1.d<c> f50850k = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f50852a;

        class a implements s1.d<c> {
            a() {
            }

            @Override // androidx.datastore.preferences.protobuf.s1.d
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c a(int number) {
                return c.b(number);
            }
        }

        private static final class b implements s1.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final s1.e f50853a = new b();

            private b() {
            }

            @Override // androidx.datastore.preferences.protobuf.s1.e
            public boolean a(int number) {
                return c.b(number) != null;
            }
        }

        c(int value) {
            this.f50852a = value;
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
            return f50850k;
        }

        public static s1.e l() {
            return b.f50853a;
        }

        @Deprecated
        public static c n(int value) {
            return b(value);
        }

        @Override // androidx.datastore.preferences.protobuf.s1.c
        public final int i() {
            if (this != UNRECOGNIZED) {
                return this.f50852a;
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
        public static final int f50860g3 = 5;

        /* JADX INFO: renamed from: h3, reason: collision with root package name */
        public static final int f50862h3 = 6;

        /* JADX INFO: renamed from: i3, reason: collision with root package name */
        public static final int f50864i3 = 7;

        /* JADX INFO: renamed from: j3, reason: collision with root package name */
        public static final int f50866j3 = 8;

        /* JADX INFO: renamed from: k3, reason: collision with root package name */
        public static final int f50868k3 = 9;

        /* JADX INFO: renamed from: l3, reason: collision with root package name */
        public static final int f50870l3 = 10;

        /* JADX INFO: renamed from: m3, reason: collision with root package name */
        public static final int f50872m3 = 11;

        /* JADX INFO: renamed from: n3, reason: collision with root package name */
        public static final int f50874n3 = 12;

        /* JADX INFO: renamed from: o3, reason: collision with root package name */
        public static final int f50876o3 = 13;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final int f50877p0 = 1;

        /* JADX INFO: renamed from: p1, reason: collision with root package name */
        public static final int f50878p1 = 2;

        /* JADX INFO: renamed from: p2, reason: collision with root package name */
        public static final int f50879p2 = 4;

        /* JADX INFO: renamed from: p3, reason: collision with root package name */
        public static final int f50880p3 = 14;

        /* JADX INFO: renamed from: q3, reason: collision with root package name */
        public static final int f50881q3 = 15;

        /* JADX INFO: renamed from: r3, reason: collision with root package name */
        public static final int f50882r3 = 16;

        /* JADX INFO: renamed from: s3, reason: collision with root package name */
        public static final int f50884s3 = 17;

        /* JADX INFO: renamed from: t3, reason: collision with root package name */
        public static final int f50886t3 = 18;

        /* JADX INFO: renamed from: u3, reason: collision with root package name */
        private static final s1.d<d> f50887u3 = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f50891a;

        class a implements s1.d<d> {
            a() {
            }

            @Override // androidx.datastore.preferences.protobuf.s1.d
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d a(int number) {
                return d.b(number);
            }
        }

        private static final class b implements s1.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final s1.e f50892a = new b();

            private b() {
            }

            @Override // androidx.datastore.preferences.protobuf.s1.e
            public boolean a(int number) {
                return d.b(number) != null;
            }
        }

        d(int value) {
            this.f50891a = value;
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
            return f50887u3;
        }

        public static s1.e l() {
            return b.f50892a;
        }

        @Deprecated
        public static d n(int value) {
            return b(value);
        }

        @Override // androidx.datastore.preferences.protobuf.s1.c
        public final int i() {
            if (this != UNRECOGNIZED) {
                return this.f50891a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        z0 z0Var = new z0();
        DEFAULT_INSTANCE = z0Var;
        l1.Y6(z0.class, z0Var);
    }

    private z0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A9(boolean value) {
        this.packed_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B9(String value) {
        value.getClass();
        this.typeUrl_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C9(u value) {
        androidx.datastore.preferences.protobuf.a.y(value);
        this.typeUrl_ = value.A0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G8(Iterable<? extends f3> values) {
        T8();
        androidx.datastore.preferences.protobuf.a.m(values, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H8(int index, f3 value) {
        value.getClass();
        T8();
        this.options_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I8(f3 value) {
        value.getClass();
        T8();
        this.options_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J8() {
        this.cardinality_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K8() {
        this.defaultValue_ = U8().K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L8() {
        this.jsonName_ = U8().M0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M8() {
        this.kind_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N8() {
        this.name_ = U8().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O8() {
        this.number_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P8() {
        this.oneofIndex_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q8() {
        this.options_ = l1.T3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R8() {
        this.packed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S8() {
        this.typeUrl_ = U8().l0();
    }

    private void T8() {
        s1.l<f3> lVar = this.options_;
        if (lVar.s1()) {
            return;
        }
        this.options_ = l1.r5(lVar);
    }

    public static z0 U8() {
        return DEFAULT_INSTANCE;
    }

    public static b X8() {
        return DEFAULT_INSTANCE.s3();
    }

    public static b Y8(z0 prototype) {
        return DEFAULT_INSTANCE.v3(prototype);
    }

    public static z0 Z8(InputStream input) throws IOException {
        return (z0) l1.J5(DEFAULT_INSTANCE, input);
    }

    public static z0 a9(InputStream input, v0 extensionRegistry) throws IOException {
        return (z0) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static z0 b9(u data) throws t1 {
        return (z0) l1.R5(DEFAULT_INSTANCE, data);
    }

    public static z0 c9(u data, v0 extensionRegistry) throws t1 {
        return (z0) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static z0 d9(z input) throws IOException {
        return (z0) l1.a6(DEFAULT_INSTANCE, input);
    }

    public static z0 e9(z input, v0 extensionRegistry) throws IOException {
        return (z0) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static z0 f9(InputStream input) throws IOException {
        return (z0) l1.d6(DEFAULT_INSTANCE, input);
    }

    public static z0 g9(InputStream input, v0 extensionRegistry) throws IOException {
        return (z0) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static z0 h9(ByteBuffer data) throws t1 {
        return (z0) l1.i6(DEFAULT_INSTANCE, data);
    }

    public static z0 i9(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (z0) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static z0 j9(byte[] data) throws t1 {
        return (z0) l1.p6(DEFAULT_INSTANCE, data);
    }

    public static z0 k9(byte[] data, v0 extensionRegistry) throws t1 {
        return (z0) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static h3<z0> l9() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m9(int index) {
        T8();
        this.options_.remove(index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n9(c value) {
        this.cardinality_ = value.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o9(int value) {
        this.cardinality_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p9(String value) {
        value.getClass();
        this.defaultValue_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q9(u value) {
        androidx.datastore.preferences.protobuf.a.y(value);
        this.defaultValue_ = value.A0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r9(String value) {
        value.getClass();
        this.jsonName_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s9(u value) {
        androidx.datastore.preferences.protobuf.a.y(value);
        this.jsonName_ = value.A0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t9(d value) {
        this.kind_ = value.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u9(int value) {
        this.kind_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v9(String value) {
        value.getClass();
        this.name_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w9(u value) {
        androidx.datastore.preferences.protobuf.a.y(value);
        this.name_ = value.A0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x9(int value) {
        this.number_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y9(int value) {
        this.oneofIndex_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z9(int index, f3 value) {
        value.getClass();
        T8();
        this.options_.set(index, value);
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public boolean C0() {
        return this.packed_;
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    protected final Object D3(l1.i method, Object arg0, Object arg1) {
        h3 cVar;
        int i10 = a.f50840a[method.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new z0();
            case 2:
                return new b(aVar);
            case 3:
                return l1.A5(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\u000b\n\u0000\u0001\u0000\u0001\f\u0002\f\u0003\u0004\u0004Ȉ\u0006Ȉ\u0007\u0004\b\u0007\t\u001b\nȈ\u000bȈ", new Object[]{"kind_", "cardinality_", "number_", "name_", "typeUrl_", "oneofIndex_", "packed_", "options_", f3.class, "jsonName_", "defaultValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                h3<z0> h3Var = PARSER;
                if (h3Var != null) {
                    return h3Var;
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

    @Override // androidx.datastore.preferences.protobuf.e1
    public String K() {
        return this.defaultValue_;
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public int K7() {
        return this.kind_;
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public String M0() {
        return this.jsonName_;
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public u P0() {
        return u.C(this.jsonName_);
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public int U2() {
        return this.cardinality_;
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public c V4() {
        c cVarB = c.b(this.cardinality_);
        return cVarB == null ? c.UNRECOGNIZED : cVarB;
    }

    public g3 V8(int index) {
        return this.options_.get(index);
    }

    public List<? extends g3> W8() {
        return this.options_;
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public u a() {
        return u.C(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public u c0() {
        return u.C(this.defaultValue_);
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public d getKind() {
        d dVarB = d.b(this.kind_);
        return dVarB == null ? d.UNRECOGNIZED : dVarB;
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public int i() {
        return this.number_;
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public int i0() {
        return this.oneofIndex_;
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public u j0() {
        return u.C(this.typeUrl_);
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public String l0() {
        return this.typeUrl_;
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public List<f3> n() {
        return this.options_;
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public f3 o(int index) {
        return this.options_.get(index);
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public int q() {
        return this.options_.size();
    }
}
