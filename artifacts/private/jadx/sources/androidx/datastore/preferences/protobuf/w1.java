package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f50708a = 1001;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l1.h<e0.o, b> f50709b = l1.I5(e0.o.I8(), b.h8(), b.h8(), null, 1001, a5.b.f49977m, b.class);

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50710a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f50710a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50710a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50710a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50710a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50710a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f50710a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f50710a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1<b, a> implements c {
        private static final b DEFAULT_INSTANCE;
        public static final int LEGACY_CLOSED_ENUM_FIELD_NUMBER = 1;
        private static volatile h3<b> PARSER = null;
        public static final int UTF8_VALIDATION_FIELD_NUMBER = 2;
        private int bitField0_;
        private boolean legacyClosedEnum_;
        private int utf8Validation_;

        public static final class a extends l1.b<b, a> implements c {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // androidx.datastore.preferences.protobuf.w1.c
            public EnumC0455b F() {
                return ((b) this.f50422b).F();
            }

            public a L4() {
                V3();
                ((b) this.f50422b).f8();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.w1.c
            public boolean N() {
                return ((b) this.f50422b).N();
            }

            public a P4() {
                V3();
                ((b) this.f50422b).g8();
                return this;
            }

            public a Q4(boolean value) {
                V3();
                ((b) this.f50422b).y8(value);
                return this;
            }

            public a U4(EnumC0455b value) {
                V3();
                ((b) this.f50422b).z8(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.w1.c
            public boolean n2() {
                return ((b) this.f50422b).n2();
            }

            @Override // androidx.datastore.preferences.protobuf.w1.c
            public boolean z1() {
                return ((b) this.f50422b).z1();
            }

            private a() {
                super(b.DEFAULT_INSTANCE);
            }
        }

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w1$b$b, reason: collision with other inner class name */
        public enum EnumC0455b implements s1.c {
            UTF8_VALIDATION_UNKNOWN(0),
            DEFAULT(1),
            VERIFY(2);


            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f50714e = 0;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f50715f = 1;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f50716g = 2;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static final s1.d<EnumC0455b> f50717h = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f50719a;

            /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w1$b$b$a */
            class a implements s1.d<EnumC0455b> {
                a() {
                }

                @Override // androidx.datastore.preferences.protobuf.s1.d
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public EnumC0455b a(int number) {
                    return EnumC0455b.b(number);
                }
            }

            /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w1$b$b$b, reason: collision with other inner class name */
            private static final class C0456b implements s1.e {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                static final s1.e f50720a = new C0456b();

                private C0456b() {
                }

                @Override // androidx.datastore.preferences.protobuf.s1.e
                public boolean a(int number) {
                    return EnumC0455b.b(number) != null;
                }
            }

            EnumC0455b(int value) {
                this.f50719a = value;
            }

            public static EnumC0455b b(int value) {
                if (value == 0) {
                    return UTF8_VALIDATION_UNKNOWN;
                }
                if (value == 1) {
                    return DEFAULT;
                }
                if (value != 2) {
                    return null;
                }
                return VERIFY;
            }

            public static s1.d<EnumC0455b> k() {
                return f50717h;
            }

            public static s1.e l() {
                return C0456b.f50720a;
            }

            @Deprecated
            public static EnumC0455b n(int value) {
                return b(value);
            }

            @Override // androidx.datastore.preferences.protobuf.s1.c
            public final int i() {
                return this.f50719a;
            }
        }

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            l1.Y6(b.class, bVar);
        }

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f8() {
            this.bitField0_ &= -2;
            this.legacyClosedEnum_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g8() {
            this.bitField0_ &= -3;
            this.utf8Validation_ = 0;
        }

        public static b h8() {
            return DEFAULT_INSTANCE;
        }

        public static a j8() {
            return DEFAULT_INSTANCE.s3();
        }

        public static a k8(b prototype) {
            return DEFAULT_INSTANCE.v3(prototype);
        }

        public static b l8(InputStream input) throws IOException {
            return (b) l1.J5(DEFAULT_INSTANCE, input);
        }

        public static b m8(InputStream input, v0 extensionRegistry) throws IOException {
            return (b) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static b n8(u data) throws t1 {
            return (b) l1.R5(DEFAULT_INSTANCE, data);
        }

        public static b o8(u data, v0 extensionRegistry) throws t1 {
            return (b) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static b p8(z input) throws IOException {
            return (b) l1.a6(DEFAULT_INSTANCE, input);
        }

        public static b q8(z input, v0 extensionRegistry) throws IOException {
            return (b) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static b r8(InputStream input) throws IOException {
            return (b) l1.d6(DEFAULT_INSTANCE, input);
        }

        public static b s8(InputStream input, v0 extensionRegistry) throws IOException {
            return (b) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static b t8(ByteBuffer data) throws t1 {
            return (b) l1.i6(DEFAULT_INSTANCE, data);
        }

        public static b u8(ByteBuffer data, v0 extensionRegistry) throws t1 {
            return (b) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static b v8(byte[] data) throws t1 {
            return (b) l1.p6(DEFAULT_INSTANCE, data);
        }

        public static b w8(byte[] data, v0 extensionRegistry) throws t1 {
            return (b) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static h3<b> x8() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void y8(boolean value) {
            this.bitField0_ |= 1;
            this.legacyClosedEnum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void z8(EnumC0455b value) {
            this.utf8Validation_ = value.i();
            this.bitField0_ |= 2;
        }

        @Override // androidx.datastore.preferences.protobuf.l1
        protected final Object D3(l1.i method, Object arg0, Object arg1) {
            h3 cVar;
            int i10 = a.f50710a[method.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new b();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.A5(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001", new Object[]{"bitField0_", "legacyClosedEnum_", "utf8Validation_", EnumC0455b.l()});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    h3<b> h3Var = PARSER;
                    if (h3Var != null) {
                        return h3Var;
                    }
                    synchronized (b.class) {
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

        @Override // androidx.datastore.preferences.protobuf.w1.c
        public EnumC0455b F() {
            EnumC0455b enumC0455bB = EnumC0455b.b(this.utf8Validation_);
            if (enumC0455bB == null) {
                enumC0455bB = EnumC0455b.UTF8_VALIDATION_UNKNOWN;
            }
            return enumC0455bB;
        }

        @Override // androidx.datastore.preferences.protobuf.w1.c
        public boolean N() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.w1.c
        public boolean n2() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.w1.c
        public boolean z1() {
            return this.legacyClosedEnum_;
        }
    }

    public interface c extends r2 {
        b.EnumC0455b F();

        boolean N();

        boolean n2();

        boolean z1();
    }

    static {
        int i10 = 6 & 0;
    }

    private w1() {
    }

    public static void a(v0 registry) {
        registry.b(f50709b);
    }
}
