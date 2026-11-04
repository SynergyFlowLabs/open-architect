package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class a4 extends l1<a4, b> implements b4 {
    private static final a4 DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile h3<a4> PARSER;
    private k2<String, y4> fields_ = k2.f();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f49944a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f49944a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49944a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f49944a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f49944a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f49944a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f49944a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f49944a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<a4, b> implements b4 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.b4
        @Deprecated
        public Map<String, y4> H5() {
            return P3();
        }

        @Override // androidx.datastore.preferences.protobuf.b4
        public y4 K4(String key) {
            key.getClass();
            Map<String, y4> mapP3 = ((a4) this.f50422b).P3();
            if (mapP3.containsKey(key)) {
                return mapP3.get(key);
            }
            throw new IllegalArgumentException();
        }

        public b L4() {
            V3();
            ((a4) this.f50422b).A7().clear();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.b4
        public boolean L6(String key) {
            key.getClass();
            return ((a4) this.f50422b).P3().containsKey(key);
        }

        @Override // androidx.datastore.preferences.protobuf.b4
        public y4 M6(String key, y4 defaultValue) {
            key.getClass();
            Map<String, y4> mapP3 = ((a4) this.f50422b).P3();
            return mapP3.containsKey(key) ? mapP3.get(key) : defaultValue;
        }

        @Override // androidx.datastore.preferences.protobuf.b4
        public Map<String, y4> P3() {
            return Collections.unmodifiableMap(((a4) this.f50422b).P3());
        }

        public b P4(Map<String, y4> values) {
            V3();
            ((a4) this.f50422b).A7().putAll(values);
            return this;
        }

        public b Q4(String key, y4 value) {
            key.getClass();
            value.getClass();
            V3();
            ((a4) this.f50422b).A7().put(key, value);
            return this;
        }

        public b U4(String key) {
            key.getClass();
            V3();
            ((a4) this.f50422b).A7().remove(key);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.b4
        public int d0() {
            return ((a4) this.f50422b).P3().size();
        }

        private b() {
            super(a4.DEFAULT_INSTANCE);
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final j2<String, y4> f49945a = j2.f(a5.b.f49975k, "", a5.b.f49977m, y4.A8());

        private c() {
        }
    }

    static {
        a4 a4Var = new a4();
        DEFAULT_INSTANCE = a4Var;
        l1.Y6(a4.class, a4Var);
    }

    private a4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, y4> A7() {
        return f8();
    }

    private k2<String, y4> C7() {
        return this.fields_;
    }

    private k2<String, y4> f8() {
        if (!this.fields_.j()) {
            this.fields_ = this.fields_.n();
        }
        return this.fields_;
    }

    public static b g8() {
        return DEFAULT_INSTANCE.s3();
    }

    public static b h8(a4 prototype) {
        return DEFAULT_INSTANCE.v3(prototype);
    }

    public static a4 j8(InputStream input) throws IOException {
        return (a4) l1.J5(DEFAULT_INSTANCE, input);
    }

    public static a4 k8(InputStream input, v0 extensionRegistry) throws IOException {
        return (a4) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static a4 l8(u data) throws t1 {
        return (a4) l1.R5(DEFAULT_INSTANCE, data);
    }

    public static a4 m8(u data, v0 extensionRegistry) throws t1 {
        return (a4) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static a4 n8(z input) throws IOException {
        return (a4) l1.a6(DEFAULT_INSTANCE, input);
    }

    public static a4 o8(z input, v0 extensionRegistry) throws IOException {
        return (a4) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static a4 p8(InputStream input) throws IOException {
        return (a4) l1.d6(DEFAULT_INSTANCE, input);
    }

    public static a4 q8(InputStream input, v0 extensionRegistry) throws IOException {
        return (a4) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static a4 r8(ByteBuffer data) throws t1 {
        return (a4) l1.i6(DEFAULT_INSTANCE, data);
    }

    public static a4 s8(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (a4) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static a4 t8(byte[] data) throws t1 {
        return (a4) l1.p6(DEFAULT_INSTANCE, data);
    }

    public static a4 u8(byte[] data, v0 extensionRegistry) throws t1 {
        return (a4) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static h3<a4> v8() {
        return DEFAULT_INSTANCE.W7();
    }

    public static a4 y7() {
        return DEFAULT_INSTANCE;
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    protected final Object D3(l1.i method, Object arg0, Object arg1) {
        h3 cVar;
        int i10 = a.f49944a[method.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new a4();
            case 2:
                return new b(aVar);
            case 3:
                return l1.A5(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", c.f49945a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                h3<a4> h3Var = PARSER;
                if (h3Var != null) {
                    return h3Var;
                }
                synchronized (a4.class) {
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

    @Override // androidx.datastore.preferences.protobuf.b4
    @Deprecated
    public Map<String, y4> H5() {
        return P3();
    }

    @Override // androidx.datastore.preferences.protobuf.b4
    public y4 K4(String key) {
        key.getClass();
        k2<String, y4> k2VarC7 = C7();
        if (k2VarC7.containsKey(key)) {
            return k2VarC7.get(key);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.b4
    public boolean L6(String key) {
        key.getClass();
        return C7().containsKey(key);
    }

    @Override // androidx.datastore.preferences.protobuf.b4
    public y4 M6(String key, y4 defaultValue) {
        key.getClass();
        k2<String, y4> k2VarC7 = C7();
        return k2VarC7.containsKey(key) ? k2VarC7.get(key) : defaultValue;
    }

    @Override // androidx.datastore.preferences.protobuf.b4
    public Map<String, y4> P3() {
        return Collections.unmodifiableMap(C7());
    }

    @Override // androidx.datastore.preferences.protobuf.b4
    public int d0() {
        return C7().size();
    }
}
