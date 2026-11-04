package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class f2 extends l1<f2, b> implements g2 {
    private static final f2 DEFAULT_INSTANCE;
    private static volatile h3<f2> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private s1.l<y4> values_ = l1.T3();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50320a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f50320a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50320a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50320a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50320a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50320a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f50320a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f50320a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<f2, b> implements g2 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b L4(Iterable<? extends y4> values) {
            V3();
            ((f2) this.f50422b).h8(values);
            return this;
        }

        public b P4(int index, y4.b builderForValue) {
            V3();
            ((f2) this.f50422b).j8(index, builderForValue.build());
            return this;
        }

        public b Q4(int index, y4 value) {
            V3();
            ((f2) this.f50422b).j8(index, value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.g2
        public y4 S7(int index) {
            return ((f2) this.f50422b).S7(index);
        }

        public b U4(y4.b builderForValue) {
            V3();
            ((f2) this.f50422b).k8(builderForValue.build());
            return this;
        }

        public b Z4(y4 value) {
            V3();
            ((f2) this.f50422b).k8(value);
            return this;
        }

        public b a5() {
            V3();
            ((f2) this.f50422b).l8();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.g2
        public int b1() {
            return ((f2) this.f50422b).b1();
        }

        public b b5(int index) {
            V3();
            ((f2) this.f50422b).F8(index);
            return this;
        }

        public b d5(int index, y4.b builderForValue) {
            V3();
            ((f2) this.f50422b).G8(index, builderForValue.build());
            return this;
        }

        public b r5(int index, y4 value) {
            V3();
            ((f2) this.f50422b).G8(index, value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.g2
        public List<y4> z7() {
            return Collections.unmodifiableList(((f2) this.f50422b).z7());
        }

        private b() {
            super(f2.DEFAULT_INSTANCE);
        }
    }

    static {
        f2 f2Var = new f2();
        DEFAULT_INSTANCE = f2Var;
        l1.Y6(f2.class, f2Var);
    }

    private f2() {
    }

    public static f2 A8(ByteBuffer data) throws t1 {
        return (f2) l1.i6(DEFAULT_INSTANCE, data);
    }

    public static f2 B8(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (f2) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static f2 C8(byte[] data) throws t1 {
        return (f2) l1.p6(DEFAULT_INSTANCE, data);
    }

    public static f2 D8(byte[] data, v0 extensionRegistry) throws t1 {
        return (f2) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static h3<f2> E8() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F8(int index) {
        m8();
        this.values_.remove(index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G8(int index, y4 value) {
        value.getClass();
        m8();
        this.values_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h8(Iterable<? extends y4> values) {
        m8();
        androidx.datastore.preferences.protobuf.a.m(values, this.values_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j8(int index, y4 value) {
        value.getClass();
        m8();
        this.values_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k8(y4 value) {
        value.getClass();
        m8();
        this.values_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l8() {
        this.values_ = l1.T3();
    }

    private void m8() {
        s1.l<y4> lVar = this.values_;
        if (lVar.s1()) {
            return;
        }
        this.values_ = l1.r5(lVar);
    }

    public static f2 n8() {
        return DEFAULT_INSTANCE;
    }

    public static b q8() {
        return DEFAULT_INSTANCE.s3();
    }

    public static b r8(f2 prototype) {
        return DEFAULT_INSTANCE.v3(prototype);
    }

    public static f2 s8(InputStream input) throws IOException {
        return (f2) l1.J5(DEFAULT_INSTANCE, input);
    }

    public static f2 t8(InputStream input, v0 extensionRegistry) throws IOException {
        return (f2) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static f2 u8(u data) throws t1 {
        return (f2) l1.R5(DEFAULT_INSTANCE, data);
    }

    public static f2 v8(u data, v0 extensionRegistry) throws t1 {
        return (f2) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static f2 w8(z input) throws IOException {
        return (f2) l1.a6(DEFAULT_INSTANCE, input);
    }

    public static f2 x8(z input, v0 extensionRegistry) throws IOException {
        return (f2) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static f2 y8(InputStream input) throws IOException {
        return (f2) l1.d6(DEFAULT_INSTANCE, input);
    }

    public static f2 z8(InputStream input, v0 extensionRegistry) throws IOException {
        return (f2) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    protected final Object D3(l1.i method, Object arg0, Object arg1) {
        h3 cVar;
        int i10 = a.f50320a[method.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new f2();
            case 2:
                return new b(aVar);
            case 3:
                return l1.A5(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", y4.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                h3<f2> h3Var = PARSER;
                if (h3Var != null) {
                    return h3Var;
                }
                synchronized (f2.class) {
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

    @Override // androidx.datastore.preferences.protobuf.g2
    public y4 S7(int index) {
        return this.values_.get(index);
    }

    @Override // androidx.datastore.preferences.protobuf.g2
    public int b1() {
        return this.values_.size();
    }

    public z4 o8(int index) {
        return this.values_.get(index);
    }

    public List<? extends z4> p8() {
        return this.values_;
    }

    @Override // androidx.datastore.preferences.protobuf.g2
    public List<y4> z7() {
        return this.values_;
    }
}
