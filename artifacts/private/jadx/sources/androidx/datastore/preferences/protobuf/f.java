package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends l1<f, b> implements g {
    private static final f DEFAULT_INSTANCE;
    private static volatile h3<f> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String typeUrl_ = "";
    private u value_ = u.f50632f;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50306a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f50306a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50306a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50306a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50306a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50306a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f50306a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f50306a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<f, b> implements g {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b L4() {
            V3();
            ((f) this.f50422b).g8();
            return this;
        }

        public b P4() {
            V3();
            ((f) this.f50422b).h8();
            return this;
        }

        public b Q4(String value) {
            V3();
            ((f) this.f50422b).z8(value);
            return this;
        }

        public b U4(u value) {
            V3();
            ((f) this.f50422b).A8(value);
            return this;
        }

        public b Z4(u value) {
            V3();
            ((f) this.f50422b).B8(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public u getValue() {
            return ((f) this.f50422b).getValue();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public u j0() {
            return ((f) this.f50422b).j0();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public String l0() {
            return ((f) this.f50422b).l0();
        }

        private b() {
            super(f.DEFAULT_INSTANCE);
        }
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        l1.Y6(f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A8(u value) {
        androidx.datastore.preferences.protobuf.a.y(value);
        this.typeUrl_ = value.A0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B8(u value) {
        value.getClass();
        this.value_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g8() {
        this.typeUrl_ = j8().l0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h8() {
        this.value_ = j8().getValue();
    }

    public static f j8() {
        return DEFAULT_INSTANCE;
    }

    public static b k8() {
        return DEFAULT_INSTANCE.s3();
    }

    public static b l8(f prototype) {
        return DEFAULT_INSTANCE.v3(prototype);
    }

    public static f m8(InputStream input) throws IOException {
        return (f) l1.J5(DEFAULT_INSTANCE, input);
    }

    public static f n8(InputStream input, v0 extensionRegistry) throws IOException {
        return (f) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static f o8(u data) throws t1 {
        return (f) l1.R5(DEFAULT_INSTANCE, data);
    }

    public static f p8(u data, v0 extensionRegistry) throws t1 {
        return (f) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static f q8(z input) throws IOException {
        return (f) l1.a6(DEFAULT_INSTANCE, input);
    }

    public static f r8(z input, v0 extensionRegistry) throws IOException {
        return (f) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static f s8(InputStream input) throws IOException {
        return (f) l1.d6(DEFAULT_INSTANCE, input);
    }

    public static f t8(InputStream input, v0 extensionRegistry) throws IOException {
        return (f) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static f u8(ByteBuffer data) throws t1 {
        return (f) l1.i6(DEFAULT_INSTANCE, data);
    }

    public static f v8(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (f) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static f w8(byte[] data) throws t1 {
        return (f) l1.p6(DEFAULT_INSTANCE, data);
    }

    public static f x8(byte[] data, v0 extensionRegistry) throws t1 {
        return (f) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static h3<f> y8() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z8(String value) {
        value.getClass();
        this.typeUrl_ = value;
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    protected final Object D3(l1.i method, Object arg0, Object arg1) {
        h3 cVar;
        int i10 = a.f50306a[method.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new f();
            case 2:
                return new b(aVar);
            case 3:
                return l1.A5(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"typeUrl_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                h3<f> h3Var = PARSER;
                if (h3Var != null) {
                    return h3Var;
                }
                synchronized (f.class) {
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

    @Override // androidx.datastore.preferences.protobuf.g
    public u getValue() {
        return this.value_;
    }

    @Override // androidx.datastore.preferences.protobuf.g
    public u j0() {
        return u.C(this.typeUrl_);
    }

    @Override // androidx.datastore.preferences.protobuf.g
    public String l0() {
        return this.typeUrl_;
    }
}
