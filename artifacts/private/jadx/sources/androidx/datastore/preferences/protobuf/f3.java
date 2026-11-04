package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class f3 extends l1<f3, b> implements g3 {
    private static final f3 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile h3<f3> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int bitField0_;
    private String name_ = "";
    private f value_;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50321a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f50321a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50321a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50321a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50321a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50321a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f50321a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f50321a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<f3, b> implements g3 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b L4() {
            V3();
            ((f3) this.f50422b).h8();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.g3
        public boolean P1() {
            return ((f3) this.f50422b).P1();
        }

        public b P4() {
            V3();
            ((f3) this.f50422b).j8();
            return this;
        }

        public b Q4(f value) {
            V3();
            ((f3) this.f50422b).l8(value);
            return this;
        }

        public b U4(String value) {
            V3();
            ((f3) this.f50422b).B8(value);
            return this;
        }

        public b Z4(u value) {
            V3();
            ((f3) this.f50422b).C8(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.g3
        public u a() {
            return ((f3) this.f50422b).a();
        }

        public b a5(f.b builderForValue) {
            V3();
            ((f3) this.f50422b).D8(builderForValue.build());
            return this;
        }

        public b b5(f value) {
            V3();
            ((f3) this.f50422b).D8(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.g3
        public String getName() {
            return ((f3) this.f50422b).getName();
        }

        @Override // androidx.datastore.preferences.protobuf.g3
        public f getValue() {
            return ((f3) this.f50422b).getValue();
        }

        private b() {
            super(f3.DEFAULT_INSTANCE);
        }
    }

    static {
        f3 f3Var = new f3();
        DEFAULT_INSTANCE = f3Var;
        l1.Y6(f3.class, f3Var);
    }

    private f3() {
    }

    public static h3<f3> A8() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B8(String value) {
        value.getClass();
        this.name_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C8(u value) {
        androidx.datastore.preferences.protobuf.a.y(value);
        this.name_ = value.A0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D8(f value) {
        value.getClass();
        this.value_ = value;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h8() {
        this.name_ = k8().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j8() {
        this.value_ = null;
        this.bitField0_ &= -2;
    }

    public static f3 k8() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l8(f value) {
        value.getClass();
        f fVar = this.value_;
        if (fVar == null || fVar == f.j8()) {
            this.value_ = value;
        } else {
            this.value_ = f.l8(this.value_).u4(value).B1();
        }
        this.bitField0_ |= 1;
    }

    public static b m8() {
        return DEFAULT_INSTANCE.s3();
    }

    public static b n8(f3 prototype) {
        return DEFAULT_INSTANCE.v3(prototype);
    }

    public static f3 o8(InputStream input) throws IOException {
        return (f3) l1.J5(DEFAULT_INSTANCE, input);
    }

    public static f3 p8(InputStream input, v0 extensionRegistry) throws IOException {
        return (f3) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static f3 q8(u data) throws t1 {
        return (f3) l1.R5(DEFAULT_INSTANCE, data);
    }

    public static f3 r8(u data, v0 extensionRegistry) throws t1 {
        return (f3) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static f3 s8(z input) throws IOException {
        return (f3) l1.a6(DEFAULT_INSTANCE, input);
    }

    public static f3 t8(z input, v0 extensionRegistry) throws IOException {
        return (f3) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static f3 u8(InputStream input) throws IOException {
        return (f3) l1.d6(DEFAULT_INSTANCE, input);
    }

    public static f3 v8(InputStream input, v0 extensionRegistry) throws IOException {
        return (f3) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static f3 w8(ByteBuffer data) throws t1 {
        return (f3) l1.i6(DEFAULT_INSTANCE, data);
    }

    public static f3 x8(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (f3) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static f3 y8(byte[] data) throws t1 {
        return (f3) l1.p6(DEFAULT_INSTANCE, data);
    }

    public static f3 z8(byte[] data, v0 extensionRegistry) throws t1 {
        return (f3) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    protected final Object D3(l1.i method, Object arg0, Object arg1) {
        h3 cVar;
        int i10 = a.f50321a[method.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new f3();
            case 2:
                return new b(aVar);
            case 3:
                return l1.A5(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "name_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                h3<f3> h3Var = PARSER;
                if (h3Var != null) {
                    return h3Var;
                }
                synchronized (f3.class) {
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

    @Override // androidx.datastore.preferences.protobuf.g3
    public boolean P1() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public u a() {
        return u.C(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public f getValue() {
        f fVar = this.value_;
        return fVar == null ? f.j8() : fVar;
    }
}
