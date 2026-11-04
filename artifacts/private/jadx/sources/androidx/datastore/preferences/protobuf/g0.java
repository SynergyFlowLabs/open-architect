package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 extends l1<g0, b> implements h0 {
    private static final g0 DEFAULT_INSTANCE;
    private static volatile h3<g0> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private double value_;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50324a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f50324a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50324a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50324a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50324a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50324a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f50324a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                int i10 = 0 | 7;
                f50324a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<g0, b> implements h0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b L4() {
            V3();
            ((g0) this.f50422b).A7();
            return this;
        }

        public b P4(double value) {
            V3();
            ((g0) this.f50422b).w8(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.h0
        public double getValue() {
            return ((g0) this.f50422b).getValue();
        }

        private b() {
            super(g0.DEFAULT_INSTANCE);
        }
    }

    static {
        g0 g0Var = new g0();
        DEFAULT_INSTANCE = g0Var;
        l1.Y6(g0.class, g0Var);
    }

    private g0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A7() {
        this.value_ = 0.0d;
    }

    public static g0 C7() {
        return DEFAULT_INSTANCE;
    }

    public static b f8() {
        return DEFAULT_INSTANCE.s3();
    }

    public static b g8(g0 prototype) {
        return DEFAULT_INSTANCE.v3(prototype);
    }

    public static g0 h8(double value) {
        return f8().P4(value).build();
    }

    public static g0 j8(InputStream input) throws IOException {
        return (g0) l1.J5(DEFAULT_INSTANCE, input);
    }

    public static g0 k8(InputStream input, v0 extensionRegistry) throws IOException {
        return (g0) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static g0 l8(u data) throws t1 {
        return (g0) l1.R5(DEFAULT_INSTANCE, data);
    }

    public static g0 m8(u data, v0 extensionRegistry) throws t1 {
        return (g0) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static g0 n8(z input) throws IOException {
        return (g0) l1.a6(DEFAULT_INSTANCE, input);
    }

    public static g0 o8(z input, v0 extensionRegistry) throws IOException {
        return (g0) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static g0 p8(InputStream input) throws IOException {
        return (g0) l1.d6(DEFAULT_INSTANCE, input);
    }

    public static g0 q8(InputStream input, v0 extensionRegistry) throws IOException {
        return (g0) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static g0 r8(ByteBuffer data) throws t1 {
        return (g0) l1.i6(DEFAULT_INSTANCE, data);
    }

    public static g0 s8(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (g0) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static g0 t8(byte[] data) throws t1 {
        return (g0) l1.p6(DEFAULT_INSTANCE, data);
    }

    public static g0 u8(byte[] data, v0 extensionRegistry) throws t1 {
        return (g0) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static h3<g0> v8() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w8(double value) {
        this.value_ = value;
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    protected final Object D3(l1.i method, Object arg0, Object arg1) {
        h3 cVar;
        int i10 = a.f50324a[method.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new g0();
            case 2:
                return new b(aVar);
            case 3:
                return l1.A5(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                h3<g0> h3Var = PARSER;
                if (h3Var != null) {
                    return h3Var;
                }
                synchronized (g0.class) {
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

    @Override // androidx.datastore.preferences.protobuf.h0
    public double getValue() {
        return this.value_;
    }
}
