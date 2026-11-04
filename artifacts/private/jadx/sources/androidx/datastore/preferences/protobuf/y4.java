package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class y4 extends l1<y4, b> implements z4 {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    private static final y4 DEFAULT_INSTANCE;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static volatile h3<y4> PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private int kindCase_ = 0;
    private Object kind_;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50776a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f50776a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50776a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50776a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50776a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50776a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f50776a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f50776a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<y4, b> implements z4 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b A5(f2.b builderForValue) {
            V3();
            ((y4) this.f50422b).T8(builderForValue.build());
            return this;
        }

        public b B5(f2 value) {
            V3();
            ((y4) this.f50422b).T8(value);
            return this;
        }

        public b D5(d3 value) {
            V3();
            ((y4) this.f50422b).U8(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.z4
        public u I1() {
            return ((y4) this.f50422b).I1();
        }

        public b I5(int value) {
            V3();
            ((y4) this.f50422b).V8(value);
            return this;
        }

        public b J5(double value) {
            V3();
            ((y4) this.f50422b).W8(value);
            return this;
        }

        public b L4() {
            V3();
            ((y4) this.f50422b).t8();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.z4
        public boolean L7() {
            return ((y4) this.f50422b).L7();
        }

        public b P4() {
            V3();
            ((y4) this.f50422b).u8();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.z4
        public boolean Q3() {
            return ((y4) this.f50422b).Q3();
        }

        public b Q4() {
            V3();
            ((y4) this.f50422b).v8();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.z4
        public double Q6() {
            return ((y4) this.f50422b).Q6();
        }

        public b R5(String value) {
            V3();
            ((y4) this.f50422b).X8(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.z4
        public boolean S3() {
            return ((y4) this.f50422b).S3();
        }

        public b U4() {
            V3();
            ((y4) this.f50422b).w8();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.z4
        public String Y() {
            return ((y4) this.f50422b).Y();
        }

        public b Z4() {
            V3();
            ((y4) this.f50422b).x8();
            return this;
        }

        public b Z5(u value) {
            V3();
            ((y4) this.f50422b).Y8(value);
            return this;
        }

        public b a5() {
            V3();
            ((y4) this.f50422b).y8();
            return this;
        }

        public b a6(a4.b builderForValue) {
            V3();
            ((y4) this.f50422b).Z8(builderForValue.build());
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.z4
        public boolean b0() {
            return ((y4) this.f50422b).b0();
        }

        public b b5() {
            V3();
            ((y4) this.f50422b).z8();
            return this;
        }

        public b c6(a4 value) {
            V3();
            ((y4) this.f50422b).Z8(value);
            return this;
        }

        public b d5(f2 value) {
            V3();
            ((y4) this.f50422b).B8(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.z4
        public a4 f6() {
            return ((y4) this.f50422b).f6();
        }

        @Override // androidx.datastore.preferences.protobuf.z4
        public c g6() {
            return ((y4) this.f50422b).g6();
        }

        @Override // androidx.datastore.preferences.protobuf.z4
        public boolean h7() {
            return ((y4) this.f50422b).h7();
        }

        @Override // androidx.datastore.preferences.protobuf.z4
        public int i4() {
            return ((y4) this.f50422b).i4();
        }

        @Override // androidx.datastore.preferences.protobuf.z4
        public boolean j3() {
            return ((y4) this.f50422b).j3();
        }

        @Override // androidx.datastore.preferences.protobuf.z4
        public f2 k3() {
            return ((y4) this.f50422b).k3();
        }

        @Override // androidx.datastore.preferences.protobuf.z4
        public d3 k4() {
            return ((y4) this.f50422b).k4();
        }

        @Override // androidx.datastore.preferences.protobuf.z4
        public boolean m6() {
            return ((y4) this.f50422b).m6();
        }

        public b r5(a4 value) {
            V3();
            ((y4) this.f50422b).C8(value);
            return this;
        }

        public b y5(boolean value) {
            V3();
            ((y4) this.f50422b).S8(value);
            return this;
        }

        private b() {
            super(y4.DEFAULT_INSTANCE);
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
        private final int f50785a;

        c(int value) {
            this.f50785a = value;
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
            return this.f50785a;
        }
    }

    static {
        y4 y4Var = new y4();
        DEFAULT_INSTANCE = y4Var;
        l1.Y6(y4.class, y4Var);
    }

    private y4() {
    }

    public static y4 A8() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B8(f2 value) {
        value.getClass();
        if (this.kindCase_ != 6 || this.kind_ == f2.n8()) {
            this.kind_ = value;
        } else {
            this.kind_ = f2.r8((f2) this.kind_).u4(value).B1();
        }
        this.kindCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C8(a4 value) {
        value.getClass();
        if (this.kindCase_ != 5 || this.kind_ == a4.y7()) {
            this.kind_ = value;
        } else {
            this.kind_ = a4.h8((a4) this.kind_).u4(value).B1();
        }
        this.kindCase_ = 5;
    }

    public static b D8() {
        return DEFAULT_INSTANCE.s3();
    }

    public static b E8(y4 prototype) {
        return DEFAULT_INSTANCE.v3(prototype);
    }

    public static y4 F8(InputStream input) throws IOException {
        return (y4) l1.J5(DEFAULT_INSTANCE, input);
    }

    public static y4 G8(InputStream input, v0 extensionRegistry) throws IOException {
        return (y4) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static y4 H8(u data) throws t1 {
        return (y4) l1.R5(DEFAULT_INSTANCE, data);
    }

    public static y4 I8(u data, v0 extensionRegistry) throws t1 {
        return (y4) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static y4 J8(z input) throws IOException {
        return (y4) l1.a6(DEFAULT_INSTANCE, input);
    }

    public static y4 K8(z input, v0 extensionRegistry) throws IOException {
        return (y4) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static y4 L8(InputStream input) throws IOException {
        return (y4) l1.d6(DEFAULT_INSTANCE, input);
    }

    public static y4 M8(InputStream input, v0 extensionRegistry) throws IOException {
        return (y4) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static y4 N8(ByteBuffer data) throws t1 {
        return (y4) l1.i6(DEFAULT_INSTANCE, data);
    }

    public static y4 O8(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (y4) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static y4 P8(byte[] data) throws t1 {
        return (y4) l1.p6(DEFAULT_INSTANCE, data);
    }

    public static y4 Q8(byte[] data, v0 extensionRegistry) throws t1 {
        return (y4) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static h3<y4> R8() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S8(boolean value) {
        this.kindCase_ = 4;
        this.kind_ = Boolean.valueOf(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T8(f2 value) {
        value.getClass();
        this.kind_ = value;
        this.kindCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U8(d3 value) {
        this.kind_ = Integer.valueOf(value.i());
        this.kindCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V8(int value) {
        this.kindCase_ = 1;
        this.kind_ = Integer.valueOf(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W8(double value) {
        this.kindCase_ = 2;
        this.kind_ = Double.valueOf(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X8(String value) {
        value.getClass();
        this.kindCase_ = 3;
        this.kind_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y8(u value) {
        androidx.datastore.preferences.protobuf.a.y(value);
        this.kind_ = value.A0();
        this.kindCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z8(a4 value) {
        value.getClass();
        this.kind_ = value;
        this.kindCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t8() {
        if (this.kindCase_ == 4) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u8() {
        this.kindCase_ = 0;
        this.kind_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v8() {
        if (this.kindCase_ == 6) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w8() {
        if (this.kindCase_ == 1) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x8() {
        if (this.kindCase_ == 2) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y8() {
        if (this.kindCase_ == 3) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z8() {
        if (this.kindCase_ == 5) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    protected final Object D3(l1.i method, Object arg0, Object arg1) {
        h3 cVar;
        int i10 = a.f50776a[method.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new y4();
            case 2:
                return new b(aVar);
            case 3:
                return l1.A5(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"kind_", "kindCase_", a4.class, f2.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                h3<y4> h3Var = PARSER;
                if (h3Var != null) {
                    return h3Var;
                }
                synchronized (y4.class) {
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

    @Override // androidx.datastore.preferences.protobuf.z4
    public u I1() {
        return u.C(this.kindCase_ == 3 ? (String) this.kind_ : "");
    }

    @Override // androidx.datastore.preferences.protobuf.z4
    public boolean L7() {
        if (this.kindCase_ == 4) {
            return ((Boolean) this.kind_).booleanValue();
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.z4
    public boolean Q3() {
        return this.kindCase_ == 6;
    }

    @Override // androidx.datastore.preferences.protobuf.z4
    public double Q6() {
        if (this.kindCase_ == 2) {
            return ((Double) this.kind_).doubleValue();
        }
        return 0.0d;
    }

    @Override // androidx.datastore.preferences.protobuf.z4
    public boolean S3() {
        return this.kindCase_ == 4;
    }

    @Override // androidx.datastore.preferences.protobuf.z4
    public String Y() {
        return this.kindCase_ == 3 ? (String) this.kind_ : "";
    }

    @Override // androidx.datastore.preferences.protobuf.z4
    public boolean b0() {
        return this.kindCase_ == 3;
    }

    @Override // androidx.datastore.preferences.protobuf.z4
    public a4 f6() {
        return this.kindCase_ == 5 ? (a4) this.kind_ : a4.y7();
    }

    @Override // androidx.datastore.preferences.protobuf.z4
    public c g6() {
        return c.b(this.kindCase_);
    }

    @Override // androidx.datastore.preferences.protobuf.z4
    public boolean h7() {
        return this.kindCase_ == 2;
    }

    @Override // androidx.datastore.preferences.protobuf.z4
    public int i4() {
        if (this.kindCase_ == 1) {
            return ((Integer) this.kind_).intValue();
        }
        return 0;
    }

    @Override // androidx.datastore.preferences.protobuf.z4
    public boolean j3() {
        return this.kindCase_ == 5;
    }

    @Override // androidx.datastore.preferences.protobuf.z4
    public f2 k3() {
        return this.kindCase_ == 6 ? (f2) this.kind_ : f2.n8();
    }

    @Override // androidx.datastore.preferences.protobuf.z4
    public d3 k4() {
        if (this.kindCase_ != 1) {
            return d3.NULL_VALUE;
        }
        d3 d3VarB = d3.b(((Integer) this.kind_).intValue());
        return d3VarB == null ? d3.UNRECOGNIZED : d3VarB;
    }

    @Override // androidx.datastore.preferences.protobuf.z4
    public boolean m6() {
        return this.kindCase_ == 1;
    }
}
