package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b1 extends l1<b1, b> implements c1 {
    private static final b1 DEFAULT_INSTANCE;
    private static volatile h3<b1> PARSER = null;
    public static final int PATHS_FIELD_NUMBER = 1;
    private s1.l<String> paths_ = l1.T3();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50032a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f50032a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50032a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50032a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50032a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50032a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f50032a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f50032a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<b1, b> implements c1 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.c1
        public String C4(int index) {
            return ((b1) this.f50422b).C4(index);
        }

        public b L4(Iterable<String> values) {
            V3();
            ((b1) this.f50422b).g8(values);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.c1
        public u M2(int index) {
            return ((b1) this.f50422b).M2(index);
        }

        public b P4(String value) {
            V3();
            ((b1) this.f50422b).h8(value);
            return this;
        }

        public b Q4(u value) {
            V3();
            ((b1) this.f50422b).j8(value);
            return this;
        }

        public b U4() {
            V3();
            ((b1) this.f50422b).k8();
            return this;
        }

        public b Z4(int index, String value) {
            V3();
            ((b1) this.f50422b).C8(index, value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.c1
        public List<String> i5() {
            return Collections.unmodifiableList(((b1) this.f50422b).i5());
        }

        @Override // androidx.datastore.preferences.protobuf.c1
        public int m5() {
            return ((b1) this.f50422b).m5();
        }

        private b() {
            super(b1.DEFAULT_INSTANCE);
        }
    }

    static {
        b1 b1Var = new b1();
        DEFAULT_INSTANCE = b1Var;
        l1.Y6(b1.class, b1Var);
    }

    private b1() {
    }

    public static b1 A8(byte[] data, v0 extensionRegistry) throws t1 {
        return (b1) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static h3<b1> B8() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C8(int index, String value) {
        value.getClass();
        l8();
        this.paths_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g8(Iterable<String> values) {
        l8();
        androidx.datastore.preferences.protobuf.a.m(values, this.paths_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h8(String value) {
        value.getClass();
        l8();
        this.paths_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j8(u value) {
        androidx.datastore.preferences.protobuf.a.y(value);
        l8();
        this.paths_.add(value.A0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k8() {
        this.paths_ = l1.T3();
    }

    private void l8() {
        s1.l<String> lVar = this.paths_;
        if (lVar.s1()) {
            return;
        }
        this.paths_ = l1.r5(lVar);
    }

    public static b1 m8() {
        return DEFAULT_INSTANCE;
    }

    public static b n8() {
        return DEFAULT_INSTANCE.s3();
    }

    public static b o8(b1 prototype) {
        return DEFAULT_INSTANCE.v3(prototype);
    }

    public static b1 p8(InputStream input) throws IOException {
        return (b1) l1.J5(DEFAULT_INSTANCE, input);
    }

    public static b1 q8(InputStream input, v0 extensionRegistry) throws IOException {
        return (b1) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static b1 r8(u data) throws t1 {
        return (b1) l1.R5(DEFAULT_INSTANCE, data);
    }

    public static b1 s8(u data, v0 extensionRegistry) throws t1 {
        return (b1) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static b1 t8(z input) throws IOException {
        return (b1) l1.a6(DEFAULT_INSTANCE, input);
    }

    public static b1 u8(z input, v0 extensionRegistry) throws IOException {
        return (b1) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static b1 v8(InputStream input) throws IOException {
        return (b1) l1.d6(DEFAULT_INSTANCE, input);
    }

    public static b1 w8(InputStream input, v0 extensionRegistry) throws IOException {
        return (b1) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static b1 x8(ByteBuffer data) throws t1 {
        return (b1) l1.i6(DEFAULT_INSTANCE, data);
    }

    public static b1 y8(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (b1) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static b1 z8(byte[] data) throws t1 {
        return (b1) l1.p6(DEFAULT_INSTANCE, data);
    }

    @Override // androidx.datastore.preferences.protobuf.c1
    public String C4(int index) {
        return this.paths_.get(index);
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    protected final Object D3(l1.i method, Object arg0, Object arg1) {
        h3 cVar;
        int i10 = a.f50032a[method.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new b1();
            case 2:
                return new b(aVar);
            case 3:
                return l1.A5(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"paths_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                h3<b1> h3Var = PARSER;
                if (h3Var != null) {
                    return h3Var;
                }
                synchronized (b1.class) {
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

    @Override // androidx.datastore.preferences.protobuf.c1
    public u M2(int index) {
        return u.C(this.paths_.get(index));
    }

    @Override // androidx.datastore.preferences.protobuf.c1
    public List<String> i5() {
        return this.paths_;
    }

    @Override // androidx.datastore.preferences.protobuf.c1
    public int m5() {
        return this.paths_.size();
    }
}
