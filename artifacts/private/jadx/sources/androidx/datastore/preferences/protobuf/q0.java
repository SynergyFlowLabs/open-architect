package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class q0 extends l1<q0, b> implements r0 {
    private static final q0 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile h3<q0> PARSER;
    private int number_;
    private String name_ = "";
    private s1.l<f3> options_ = l1.T3();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50530a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f50530a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50530a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50530a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50530a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50530a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f50530a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f50530a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<q0, b> implements r0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b A5(u value) {
            V3();
            ((q0) this.f50422b).O8(value);
            return this;
        }

        public b B5(int value) {
            V3();
            ((q0) this.f50422b).P8(value);
            return this;
        }

        public b D5(int index, f3.b builderForValue) {
            V3();
            ((q0) this.f50422b).Q8(index, builderForValue.build());
            return this;
        }

        public b I5(int index, f3 value) {
            V3();
            ((q0) this.f50422b).Q8(index, value);
            return this;
        }

        public b L4(Iterable<? extends f3> values) {
            V3();
            ((q0) this.f50422b).n8(values);
            return this;
        }

        public b P4(int index, f3.b builderForValue) {
            V3();
            ((q0) this.f50422b).o8(index, builderForValue.build());
            return this;
        }

        public b Q4(int index, f3 value) {
            V3();
            ((q0) this.f50422b).o8(index, value);
            return this;
        }

        public b U4(f3.b builderForValue) {
            V3();
            ((q0) this.f50422b).p8(builderForValue.build());
            return this;
        }

        public b Z4(f3 value) {
            V3();
            ((q0) this.f50422b).p8(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.r0
        public u a() {
            return ((q0) this.f50422b).a();
        }

        public b a5() {
            V3();
            ((q0) this.f50422b).q8();
            return this;
        }

        public b b5() {
            V3();
            ((q0) this.f50422b).r8();
            return this;
        }

        public b d5() {
            V3();
            ((q0) this.f50422b).s8();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.r0
        public String getName() {
            return ((q0) this.f50422b).getName();
        }

        @Override // androidx.datastore.preferences.protobuf.r0
        public int i() {
            return ((q0) this.f50422b).i();
        }

        @Override // androidx.datastore.preferences.protobuf.r0
        public List<f3> n() {
            return Collections.unmodifiableList(((q0) this.f50422b).n());
        }

        @Override // androidx.datastore.preferences.protobuf.r0
        public f3 o(int index) {
            return ((q0) this.f50422b).o(index);
        }

        @Override // androidx.datastore.preferences.protobuf.r0
        public int q() {
            return ((q0) this.f50422b).q();
        }

        public b r5(int index) {
            V3();
            ((q0) this.f50422b).M8(index);
            return this;
        }

        public b y5(String value) {
            V3();
            ((q0) this.f50422b).N8(value);
            return this;
        }

        private b() {
            super(q0.DEFAULT_INSTANCE);
        }
    }

    static {
        q0 q0Var = new q0();
        DEFAULT_INSTANCE = q0Var;
        l1.Y6(q0.class, q0Var);
    }

    private q0() {
    }

    public static q0 A8(InputStream input, v0 extensionRegistry) throws IOException {
        return (q0) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static q0 B8(u data) throws t1 {
        return (q0) l1.R5(DEFAULT_INSTANCE, data);
    }

    public static q0 C8(u data, v0 extensionRegistry) throws t1 {
        return (q0) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static q0 D8(z input) throws IOException {
        return (q0) l1.a6(DEFAULT_INSTANCE, input);
    }

    public static q0 E8(z input, v0 extensionRegistry) throws IOException {
        return (q0) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static q0 F8(InputStream input) throws IOException {
        return (q0) l1.d6(DEFAULT_INSTANCE, input);
    }

    public static q0 G8(InputStream input, v0 extensionRegistry) throws IOException {
        return (q0) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static q0 H8(ByteBuffer data) throws t1 {
        return (q0) l1.i6(DEFAULT_INSTANCE, data);
    }

    public static q0 I8(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (q0) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static q0 J8(byte[] data) throws t1 {
        return (q0) l1.p6(DEFAULT_INSTANCE, data);
    }

    public static q0 K8(byte[] data, v0 extensionRegistry) throws t1 {
        return (q0) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static h3<q0> L8() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M8(int index) {
        t8();
        this.options_.remove(index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N8(String value) {
        value.getClass();
        this.name_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O8(u value) {
        androidx.datastore.preferences.protobuf.a.y(value);
        this.name_ = value.A0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P8(int value) {
        this.number_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q8(int index, f3 value) {
        value.getClass();
        t8();
        this.options_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n8(Iterable<? extends f3> values) {
        t8();
        androidx.datastore.preferences.protobuf.a.m(values, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o8(int index, f3 value) {
        value.getClass();
        t8();
        this.options_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p8(f3 value) {
        value.getClass();
        t8();
        this.options_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q8() {
        this.name_ = u8().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r8() {
        this.number_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s8() {
        this.options_ = l1.T3();
    }

    private void t8() {
        s1.l<f3> lVar = this.options_;
        if (lVar.s1()) {
            return;
        }
        this.options_ = l1.r5(lVar);
    }

    public static q0 u8() {
        return DEFAULT_INSTANCE;
    }

    public static b x8() {
        return DEFAULT_INSTANCE.s3();
    }

    public static b y8(q0 prototype) {
        return DEFAULT_INSTANCE.v3(prototype);
    }

    public static q0 z8(InputStream input) throws IOException {
        return (q0) l1.J5(DEFAULT_INSTANCE, input);
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    protected final Object D3(l1.i method, Object arg0, Object arg1) {
        h3 cVar;
        int i10 = a.f50530a[method.ordinal()];
        a aVar = null;
        int i11 = 4 ^ 0;
        switch (i10) {
            case 1:
                return new q0();
            case 2:
                return new b(aVar);
            case 3:
                return l1.A5(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u001b", new Object[]{"name_", "number_", "options_", f3.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                h3<q0> h3Var = PARSER;
                if (h3Var != null) {
                    return h3Var;
                }
                synchronized (q0.class) {
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

    @Override // androidx.datastore.preferences.protobuf.r0
    public u a() {
        return u.C(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public int i() {
        return this.number_;
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public List<f3> n() {
        return this.options_;
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public f3 o(int index) {
        return this.options_.get(index);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public int q() {
        return this.options_.size();
    }

    public g3 v8(int index) {
        return this.options_.get(index);
    }

    public List<? extends g3> w8() {
        return this.options_;
    }
}
