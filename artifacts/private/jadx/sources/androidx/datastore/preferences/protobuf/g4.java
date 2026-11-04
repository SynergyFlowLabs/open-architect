package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class g4 extends l1<g4, b> implements h4 {
    private static final g4 DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile h3<g4> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50375a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f50375a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50375a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50375a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50375a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50375a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f50375a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f50375a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<g4, b> implements h4 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.h4
        public int D() {
            return ((g4) this.f50422b).D();
        }

        @Override // androidx.datastore.preferences.protobuf.h4
        public long I() {
            return ((g4) this.f50422b).I();
        }

        public b L4() {
            V3();
            ((g4) this.f50422b).f8();
            return this;
        }

        public b P4() {
            V3();
            ((g4) this.f50422b).g8();
            return this;
        }

        public b Q4(int value) {
            V3();
            ((g4) this.f50422b).y8(value);
            return this;
        }

        public b U4(long value) {
            V3();
            ((g4) this.f50422b).z8(value);
            return this;
        }

        private b() {
            super(g4.DEFAULT_INSTANCE);
        }
    }

    static {
        g4 g4Var = new g4();
        DEFAULT_INSTANCE = g4Var;
        l1.Y6(g4.class, g4Var);
    }

    private g4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f8() {
        this.nanos_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g8() {
        this.seconds_ = 0L;
    }

    public static g4 h8() {
        return DEFAULT_INSTANCE;
    }

    public static b j8() {
        return DEFAULT_INSTANCE.s3();
    }

    public static b k8(g4 prototype) {
        return DEFAULT_INSTANCE.v3(prototype);
    }

    public static g4 l8(InputStream input) throws IOException {
        return (g4) l1.J5(DEFAULT_INSTANCE, input);
    }

    public static g4 m8(InputStream input, v0 extensionRegistry) throws IOException {
        return (g4) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static g4 n8(u data) throws t1 {
        return (g4) l1.R5(DEFAULT_INSTANCE, data);
    }

    public static g4 o8(u data, v0 extensionRegistry) throws t1 {
        return (g4) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static g4 p8(z input) throws IOException {
        return (g4) l1.a6(DEFAULT_INSTANCE, input);
    }

    public static g4 q8(z input, v0 extensionRegistry) throws IOException {
        return (g4) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static g4 r8(InputStream input) throws IOException {
        return (g4) l1.d6(DEFAULT_INSTANCE, input);
    }

    public static g4 s8(InputStream input, v0 extensionRegistry) throws IOException {
        return (g4) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static g4 t8(ByteBuffer data) throws t1 {
        return (g4) l1.i6(DEFAULT_INSTANCE, data);
    }

    public static g4 u8(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (g4) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static g4 v8(byte[] data) throws t1 {
        return (g4) l1.p6(DEFAULT_INSTANCE, data);
    }

    public static g4 w8(byte[] data, v0 extensionRegistry) throws t1 {
        return (g4) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static h3<g4> x8() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y8(int value) {
        this.nanos_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z8(long value) {
        this.seconds_ = value;
    }

    @Override // androidx.datastore.preferences.protobuf.h4
    public int D() {
        return this.nanos_;
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    protected final Object D3(l1.i method, Object arg0, Object arg1) {
        h3 cVar;
        int i10 = a.f50375a[method.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new g4();
            case 2:
                return new b(aVar);
            case 3:
                return l1.A5(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                h3<g4> h3Var = PARSER;
                if (h3Var != null) {
                    return h3Var;
                }
                synchronized (g4.class) {
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

    @Override // androidx.datastore.preferences.protobuf.h4
    public long I() {
        return this.seconds_;
    }
}
