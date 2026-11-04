package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class y3 extends l1<y3, b> implements z3 {
    private static final y3 DEFAULT_INSTANCE;
    private static volatile h3<y3> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private String value_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50775a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f50775a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int i10 = 4 ^ 2;
                f50775a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int i11 = 7 ^ 3;
                f50775a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50775a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50775a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f50775a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f50775a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<y3, b> implements z3 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b L4() {
            V3();
            ((y3) this.f50422b).C7();
            return this;
        }

        public b P4(String value) {
            V3();
            ((y3) this.f50422b).x8(value);
            return this;
        }

        public b Q4(u value) {
            V3();
            ((y3) this.f50422b).y8(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.z3
        public u R1() {
            return ((y3) this.f50422b).R1();
        }

        @Override // androidx.datastore.preferences.protobuf.z3
        public String getValue() {
            return ((y3) this.f50422b).getValue();
        }

        private b() {
            super(y3.DEFAULT_INSTANCE);
        }
    }

    static {
        y3 y3Var = new y3();
        DEFAULT_INSTANCE = y3Var;
        l1.Y6(y3.class, y3Var);
    }

    private y3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C7() {
        this.value_ = f8().getValue();
    }

    public static y3 f8() {
        return DEFAULT_INSTANCE;
    }

    public static b g8() {
        return DEFAULT_INSTANCE.s3();
    }

    public static b h8(y3 prototype) {
        return DEFAULT_INSTANCE.v3(prototype);
    }

    public static y3 j8(String value) {
        return g8().P4(value).build();
    }

    public static y3 k8(InputStream input) throws IOException {
        return (y3) l1.J5(DEFAULT_INSTANCE, input);
    }

    public static y3 l8(InputStream input, v0 extensionRegistry) throws IOException {
        return (y3) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static y3 m8(u data) throws t1 {
        return (y3) l1.R5(DEFAULT_INSTANCE, data);
    }

    public static y3 n8(u data, v0 extensionRegistry) throws t1 {
        return (y3) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static y3 o8(z input) throws IOException {
        return (y3) l1.a6(DEFAULT_INSTANCE, input);
    }

    public static y3 p8(z input, v0 extensionRegistry) throws IOException {
        return (y3) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static y3 q8(InputStream input) throws IOException {
        return (y3) l1.d6(DEFAULT_INSTANCE, input);
    }

    public static y3 r8(InputStream input, v0 extensionRegistry) throws IOException {
        return (y3) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static y3 s8(ByteBuffer data) throws t1 {
        return (y3) l1.i6(DEFAULT_INSTANCE, data);
    }

    public static y3 t8(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (y3) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static y3 u8(byte[] data) throws t1 {
        return (y3) l1.p6(DEFAULT_INSTANCE, data);
    }

    public static y3 v8(byte[] data, v0 extensionRegistry) throws t1 {
        return (y3) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static h3<y3> w8() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x8(String value) {
        value.getClass();
        this.value_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y8(u value) {
        androidx.datastore.preferences.protobuf.a.y(value);
        this.value_ = value.A0();
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    protected final Object D3(l1.i method, Object arg0, Object arg1) {
        h3 cVar;
        int i10 = a.f50775a[method.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new y3();
            case 2:
                return new b(aVar);
            case 3:
                return l1.A5(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                h3<y3> h3Var = PARSER;
                if (h3Var != null) {
                    return h3Var;
                }
                synchronized (y3.class) {
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

    @Override // androidx.datastore.preferences.protobuf.z3
    public u R1() {
        return u.C(this.value_);
    }

    @Override // androidx.datastore.preferences.protobuf.z3
    public String getValue() {
        return this.value_;
    }
}
