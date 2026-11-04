package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 extends l1<l0, b> implements m0 {
    private static final l0 DEFAULT_INSTANCE;
    private static volatile h3<l0> PARSER;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50419a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f50419a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50419a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50419a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50419a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50419a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f50419a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f50419a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<l0, b> implements m0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            super(l0.DEFAULT_INSTANCE);
        }
    }

    static {
        l0 l0Var = new l0();
        DEFAULT_INSTANCE = l0Var;
        l1.Y6(l0.class, l0Var);
    }

    private l0() {
    }

    public static b A7(l0 prototype) {
        return DEFAULT_INSTANCE.v3(prototype);
    }

    public static l0 C7(InputStream input) throws IOException {
        return (l0) l1.J5(DEFAULT_INSTANCE, input);
    }

    public static l0 f8(InputStream input, v0 extensionRegistry) throws IOException {
        return (l0) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static l0 g8(u data) throws t1 {
        return (l0) l1.R5(DEFAULT_INSTANCE, data);
    }

    public static l0 h8(u data, v0 extensionRegistry) throws t1 {
        return (l0) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static l0 j7() {
        return DEFAULT_INSTANCE;
    }

    public static l0 j8(z input) throws IOException {
        return (l0) l1.a6(DEFAULT_INSTANCE, input);
    }

    public static l0 k8(z input, v0 extensionRegistry) throws IOException {
        return (l0) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static l0 l8(InputStream input) throws IOException {
        return (l0) l1.d6(DEFAULT_INSTANCE, input);
    }

    public static l0 m8(InputStream input, v0 extensionRegistry) throws IOException {
        return (l0) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static l0 n8(ByteBuffer data) throws t1 {
        return (l0) l1.i6(DEFAULT_INSTANCE, data);
    }

    public static l0 o8(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (l0) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static l0 p8(byte[] data) throws t1 {
        return (l0) l1.p6(DEFAULT_INSTANCE, data);
    }

    public static l0 q8(byte[] data, v0 extensionRegistry) throws t1 {
        return (l0) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static h3<l0> r8() {
        return DEFAULT_INSTANCE.W7();
    }

    public static b y7() {
        return DEFAULT_INSTANCE.s3();
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    protected final Object D3(l1.i method, Object arg0, Object arg1) {
        h3 cVar;
        int i10 = a.f50419a[method.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new l0();
            case 2:
                return new b(aVar);
            case 3:
                return l1.A5(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                h3<l0> h3Var = PARSER;
                if (h3Var != null) {
                    return h3Var;
                }
                synchronized (l0.class) {
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
}
