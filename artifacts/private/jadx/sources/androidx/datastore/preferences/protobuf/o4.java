package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class o4 extends l1<o4, b> implements p4 {
    private static final o4 DEFAULT_INSTANCE;
    private static volatile h3<o4> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long value_;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50505a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f50505a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50505a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50505a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50505a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50505a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f50505a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f50505a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<o4, b> implements p4 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b L4() {
            V3();
            ((o4) this.f50422b).A7();
            return this;
        }

        public b P4(long value) {
            V3();
            ((o4) this.f50422b).w8(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.p4
        public long getValue() {
            return ((o4) this.f50422b).getValue();
        }

        private b() {
            super(o4.DEFAULT_INSTANCE);
        }
    }

    static {
        o4 o4Var = new o4();
        DEFAULT_INSTANCE = o4Var;
        l1.Y6(o4.class, o4Var);
    }

    private o4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A7() {
        this.value_ = 0L;
    }

    public static o4 C7() {
        return DEFAULT_INSTANCE;
    }

    public static b f8() {
        return DEFAULT_INSTANCE.s3();
    }

    public static b g8(o4 prototype) {
        return DEFAULT_INSTANCE.v3(prototype);
    }

    public static o4 h8(long value) {
        return f8().P4(value).build();
    }

    public static o4 j8(InputStream input) throws IOException {
        return (o4) l1.J5(DEFAULT_INSTANCE, input);
    }

    public static o4 k8(InputStream input, v0 extensionRegistry) throws IOException {
        return (o4) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static o4 l8(u data) throws t1 {
        return (o4) l1.R5(DEFAULT_INSTANCE, data);
    }

    public static o4 m8(u data, v0 extensionRegistry) throws t1 {
        return (o4) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static o4 n8(z input) throws IOException {
        return (o4) l1.a6(DEFAULT_INSTANCE, input);
    }

    public static o4 o8(z input, v0 extensionRegistry) throws IOException {
        return (o4) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static o4 p8(InputStream input) throws IOException {
        return (o4) l1.d6(DEFAULT_INSTANCE, input);
    }

    public static o4 q8(InputStream input, v0 extensionRegistry) throws IOException {
        return (o4) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static o4 r8(ByteBuffer data) throws t1 {
        return (o4) l1.i6(DEFAULT_INSTANCE, data);
    }

    public static o4 s8(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (o4) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static o4 t8(byte[] data) throws t1 {
        return (o4) l1.p6(DEFAULT_INSTANCE, data);
    }

    public static o4 u8(byte[] data, v0 extensionRegistry) throws t1 {
        return (o4) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static h3<o4> v8() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w8(long value) {
        this.value_ = value;
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    protected final Object D3(l1.i method, Object arg0, Object arg1) {
        h3 cVar;
        int i10 = a.f50505a[method.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new o4();
            case 2:
                return new b(aVar);
            case 3:
                return l1.A5(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0003", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                h3<o4> h3Var = PARSER;
                if (h3Var != null) {
                    return h3Var;
                }
                synchronized (o4.class) {
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

    @Override // androidx.datastore.preferences.protobuf.p4
    public long getValue() {
        return this.value_;
    }
}
