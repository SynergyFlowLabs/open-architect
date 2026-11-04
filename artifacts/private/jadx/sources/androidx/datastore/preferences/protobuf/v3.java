package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class v3 extends l1<v3, b> implements w3 {
    private static final v3 DEFAULT_INSTANCE;
    public static final int FILE_NAME_FIELD_NUMBER = 1;
    private static volatile h3<v3> PARSER;
    private String fileName_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50707a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f50707a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50707a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50707a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50707a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50707a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f50707a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                int i10 = 7 & 7;
                f50707a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<v3, b> implements w3 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b L4() {
            V3();
            ((v3) this.f50422b).C7();
            return this;
        }

        public b P4(String value) {
            V3();
            ((v3) this.f50422b).w8(value);
            return this;
        }

        public b Q4(u value) {
            V3();
            ((v3) this.f50422b).x8(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.w3
        public u e4() {
            return ((v3) this.f50422b).e4();
        }

        @Override // androidx.datastore.preferences.protobuf.w3
        public String getFileName() {
            return ((v3) this.f50422b).getFileName();
        }

        private b() {
            super(v3.DEFAULT_INSTANCE);
        }
    }

    static {
        v3 v3Var = new v3();
        DEFAULT_INSTANCE = v3Var;
        l1.Y6(v3.class, v3Var);
    }

    private v3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C7() {
        this.fileName_ = f8().getFileName();
    }

    public static v3 f8() {
        return DEFAULT_INSTANCE;
    }

    public static b g8() {
        return DEFAULT_INSTANCE.s3();
    }

    public static b h8(v3 prototype) {
        return DEFAULT_INSTANCE.v3(prototype);
    }

    public static v3 j8(InputStream input) throws IOException {
        return (v3) l1.J5(DEFAULT_INSTANCE, input);
    }

    public static v3 k8(InputStream input, v0 extensionRegistry) throws IOException {
        return (v3) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static v3 l8(u data) throws t1 {
        return (v3) l1.R5(DEFAULT_INSTANCE, data);
    }

    public static v3 m8(u data, v0 extensionRegistry) throws t1 {
        return (v3) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static v3 n8(z input) throws IOException {
        return (v3) l1.a6(DEFAULT_INSTANCE, input);
    }

    public static v3 o8(z input, v0 extensionRegistry) throws IOException {
        return (v3) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static v3 p8(InputStream input) throws IOException {
        return (v3) l1.d6(DEFAULT_INSTANCE, input);
    }

    public static v3 q8(InputStream input, v0 extensionRegistry) throws IOException {
        return (v3) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static v3 r8(ByteBuffer data) throws t1 {
        return (v3) l1.i6(DEFAULT_INSTANCE, data);
    }

    public static v3 s8(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (v3) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static v3 t8(byte[] data) throws t1 {
        return (v3) l1.p6(DEFAULT_INSTANCE, data);
    }

    public static v3 u8(byte[] data, v0 extensionRegistry) throws t1 {
        return (v3) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static h3<v3> v8() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w8(String value) {
        value.getClass();
        this.fileName_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x8(u value) {
        androidx.datastore.preferences.protobuf.a.y(value);
        this.fileName_ = value.A0();
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    protected final Object D3(l1.i method, Object arg0, Object arg1) {
        h3 cVar;
        int i10 = a.f50707a[method.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new v3();
            case 2:
                return new b(aVar);
            case 3:
                return l1.A5(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"fileName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                h3<v3> h3Var = PARSER;
                if (h3Var != null) {
                    return h3Var;
                }
                synchronized (v3.class) {
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

    @Override // androidx.datastore.preferences.protobuf.w3
    public u e4() {
        return u.C(this.fileName_);
    }

    @Override // androidx.datastore.preferences.protobuf.w3
    public String getFileName() {
        return this.fileName_;
    }
}
