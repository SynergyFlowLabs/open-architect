package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class x2 extends l1<x2, b> implements y2 {
    private static final x2 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile h3<x2> PARSER = null;
    public static final int ROOT_FIELD_NUMBER = 2;
    private String name_ = "";
    private String root_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50763a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f50763a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50763a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50763a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50763a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50763a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f50763a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f50763a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<x2, b> implements y2 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b L4() {
            V3();
            ((x2) this.f50422b).h8();
            return this;
        }

        public b P4() {
            V3();
            ((x2) this.f50422b).j8();
            return this;
        }

        public b Q4(String value) {
            V3();
            ((x2) this.f50422b).A8(value);
            return this;
        }

        public b U4(u value) {
            V3();
            ((x2) this.f50422b).B8(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.y2
        public u V1() {
            return ((x2) this.f50422b).V1();
        }

        public b Z4(String value) {
            V3();
            ((x2) this.f50422b).C8(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.y2
        public u a() {
            return ((x2) this.f50422b).a();
        }

        public b a5(u value) {
            V3();
            ((x2) this.f50422b).D8(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.y2
        public String getName() {
            return ((x2) this.f50422b).getName();
        }

        @Override // androidx.datastore.preferences.protobuf.y2
        public String getRoot() {
            return ((x2) this.f50422b).getRoot();
        }

        private b() {
            super(x2.DEFAULT_INSTANCE);
        }
    }

    static {
        x2 x2Var = new x2();
        DEFAULT_INSTANCE = x2Var;
        l1.Y6(x2.class, x2Var);
    }

    private x2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A8(String value) {
        value.getClass();
        this.name_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B8(u value) {
        androidx.datastore.preferences.protobuf.a.y(value);
        this.name_ = value.A0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C8(String value) {
        value.getClass();
        this.root_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D8(u value) {
        androidx.datastore.preferences.protobuf.a.y(value);
        this.root_ = value.A0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h8() {
        this.name_ = k8().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j8() {
        this.root_ = k8().getRoot();
    }

    public static x2 k8() {
        return DEFAULT_INSTANCE;
    }

    public static b l8() {
        return DEFAULT_INSTANCE.s3();
    }

    public static b m8(x2 prototype) {
        return DEFAULT_INSTANCE.v3(prototype);
    }

    public static x2 n8(InputStream input) throws IOException {
        return (x2) l1.J5(DEFAULT_INSTANCE, input);
    }

    public static x2 o8(InputStream input, v0 extensionRegistry) throws IOException {
        return (x2) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static x2 p8(u data) throws t1 {
        return (x2) l1.R5(DEFAULT_INSTANCE, data);
    }

    public static x2 q8(u data, v0 extensionRegistry) throws t1 {
        return (x2) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static x2 r8(z input) throws IOException {
        return (x2) l1.a6(DEFAULT_INSTANCE, input);
    }

    public static x2 s8(z input, v0 extensionRegistry) throws IOException {
        return (x2) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static x2 t8(InputStream input) throws IOException {
        return (x2) l1.d6(DEFAULT_INSTANCE, input);
    }

    public static x2 u8(InputStream input, v0 extensionRegistry) throws IOException {
        return (x2) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static x2 v8(ByteBuffer data) throws t1 {
        return (x2) l1.i6(DEFAULT_INSTANCE, data);
    }

    public static x2 w8(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (x2) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static x2 x8(byte[] data) throws t1 {
        return (x2) l1.p6(DEFAULT_INSTANCE, data);
    }

    public static x2 y8(byte[] data, v0 extensionRegistry) throws t1 {
        return (x2) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static h3<x2> z8() {
        return DEFAULT_INSTANCE.W7();
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    protected final Object D3(l1.i method, Object arg0, Object arg1) {
        h3 cVar;
        int i10 = a.f50763a[method.ordinal()];
        a aVar = null;
        int i11 = 4 << 0;
        switch (i10) {
            case 1:
                return new x2();
            case 2:
                return new b(aVar);
            case 3:
                return l1.A5(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"name_", "root_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                h3<x2> h3Var = PARSER;
                if (h3Var != null) {
                    return h3Var;
                }
                synchronized (x2.class) {
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

    @Override // androidx.datastore.preferences.protobuf.y2
    public u V1() {
        return u.C(this.root_);
    }

    @Override // androidx.datastore.preferences.protobuf.y2
    public u a() {
        return u.C(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.y2
    public String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.y2
    public String getRoot() {
        return this.root_;
    }
}
