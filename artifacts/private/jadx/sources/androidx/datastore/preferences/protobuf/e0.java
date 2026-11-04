package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50068a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f50068a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50068a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50068a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50068a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50068a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f50068a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f50068a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class a0 extends l1.e<a0, a> implements b0 {
        public static final int CC_ENABLE_ARENAS_FIELD_NUMBER = 31;
        public static final int CC_GENERIC_SERVICES_FIELD_NUMBER = 16;
        public static final int CSHARP_NAMESPACE_FIELD_NUMBER = 37;
        private static final a0 DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 23;
        public static final int FEATURES_FIELD_NUMBER = 50;
        public static final int GO_PACKAGE_FIELD_NUMBER = 11;
        public static final int JAVA_GENERATE_EQUALS_AND_HASH_FIELD_NUMBER = 20;
        public static final int JAVA_GENERIC_SERVICES_FIELD_NUMBER = 17;
        public static final int JAVA_MULTIPLE_FILES_FIELD_NUMBER = 10;
        public static final int JAVA_OUTER_CLASSNAME_FIELD_NUMBER = 8;
        public static final int JAVA_PACKAGE_FIELD_NUMBER = 1;
        public static final int JAVA_STRING_CHECK_UTF8_FIELD_NUMBER = 27;
        public static final int OBJC_CLASS_PREFIX_FIELD_NUMBER = 36;
        public static final int OPTIMIZE_FOR_FIELD_NUMBER = 9;
        private static volatile h3<a0> PARSER = null;
        public static final int PHP_CLASS_PREFIX_FIELD_NUMBER = 40;
        public static final int PHP_METADATA_NAMESPACE_FIELD_NUMBER = 44;
        public static final int PHP_NAMESPACE_FIELD_NUMBER = 41;
        public static final int PY_GENERIC_SERVICES_FIELD_NUMBER = 18;
        public static final int RUBY_PACKAGE_FIELD_NUMBER = 45;
        public static final int SWIFT_PREFIX_FIELD_NUMBER = 39;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean ccGenericServices_;
        private boolean deprecated_;
        private o features_;
        private boolean javaGenerateEqualsAndHash_;
        private boolean javaGenericServices_;
        private boolean javaMultipleFiles_;
        private boolean javaStringCheckUtf8_;
        private boolean pyGenericServices_;
        private byte memoizedIsInitialized = 2;
        private String javaPackage_ = "";
        private String javaOuterClassname_ = "";
        private int optimizeFor_ = 1;
        private String goPackage_ = "";
        private boolean ccEnableArenas_ = true;
        private String objcClassPrefix_ = "";
        private String csharpNamespace_ = "";
        private String swiftPrefix_ = "";
        private String phpClassPrefix_ = "";
        private String phpNamespace_ = "";
        private String phpMetadataNamespace_ = "";
        private String rubyPackage_ = "";
        private s1.l<u0> uninterpretedOption_ = l1.T3();

        public static final class a extends l1.d<a0, a> implements b0 {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public boolean A2() {
                return ((a0) this.f50422b).A2();
            }

            public a A5(int index, u0 value) {
                V3();
                ((a0) this.f50422b).w9(index, value);
                return this;
            }

            public a A6() {
                V3();
                ((a0) this.f50422b).M9();
                return this;
            }

            public a A7(boolean value) {
                V3();
                ((a0) this.f50422b).pa(value);
                return this;
            }

            public a A8(androidx.datastore.preferences.protobuf.u value) {
                V3();
                ((a0) this.f50422b).Ka(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public boolean B4() {
                return ((a0) this.f50422b).B4();
            }

            public a B5(u0.a builderForValue) {
                V3();
                ((a0) this.f50422b).x9(builderForValue.build());
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public String B6() {
                return ((a0) this.f50422b).B6();
            }

            public a B8(String value) {
                V3();
                ((a0) this.f50422b).La(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public String C5() {
                return ((a0) this.f50422b).C5();
            }

            public a C7(String value) {
                V3();
                ((a0) this.f50422b).qa(value);
                return this;
            }

            public a C8(androidx.datastore.preferences.protobuf.u value) {
                V3();
                ((a0) this.f50422b).Ma(value);
                return this;
            }

            public a D5(u0 value) {
                V3();
                ((a0) this.f50422b).x9(value);
                return this;
            }

            public a D8(boolean value) {
                V3();
                ((a0) this.f50422b).Na(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public boolean E2() {
                return ((a0) this.f50422b).E2();
            }

            public a E6() {
                V3();
                ((a0) this.f50422b).N9();
                return this;
            }

            public a E8(String value) {
                V3();
                ((a0) this.f50422b).Oa(value);
                return this;
            }

            public a F8(androidx.datastore.preferences.protobuf.u value) {
                V3();
                ((a0) this.f50422b).Pa(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public String G6() {
                return ((a0) this.f50422b).G6();
            }

            public a G8(String value) {
                V3();
                ((a0) this.f50422b).Qa(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public androidx.datastore.preferences.protobuf.u H6() {
                return ((a0) this.f50422b).H6();
            }

            public a H8(androidx.datastore.preferences.protobuf.u value) {
                V3();
                ((a0) this.f50422b).Sa(value);
                return this;
            }

            public a I5() {
                V3();
                ((a0) this.f50422b).y9();
                return this;
            }

            public a I8(int index, u0.a builderForValue) {
                V3();
                ((a0) this.f50422b).Ta(index, builderForValue.build());
                return this;
            }

            public a J5() {
                V3();
                ((a0) this.f50422b).z9();
                return this;
            }

            public a J8(int index, u0 value) {
                V3();
                ((a0) this.f50422b).Ta(index, value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public boolean K3() {
                return ((a0) this.f50422b).K3();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public boolean N2() {
                return ((a0) this.f50422b).N2();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public String O4() {
                return ((a0) this.f50422b).O4();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public boolean P6() {
                return ((a0) this.f50422b).P6();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public androidx.datastore.preferences.protobuf.u R2() {
                return ((a0) this.f50422b).R2();
            }

            public a R5() {
                V3();
                ((a0) this.f50422b).A9();
                return this;
            }

            public a R6() {
                V3();
                ((a0) this.f50422b).O9();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public boolean S2() {
                return ((a0) this.f50422b).S2();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public boolean S6() {
                return ((a0) this.f50422b).S6();
            }

            public a U6() {
                V3();
                ((a0) this.f50422b).P9();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public String V5() {
                return ((a0) this.f50422b).V5();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            @Deprecated
            public boolean V7() {
                return ((a0) this.f50422b).V7();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public b W1() {
                return ((a0) this.f50422b).W1();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public boolean W6() {
                return ((a0) this.f50422b).W6();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public boolean Y3() {
                return ((a0) this.f50422b).Y3();
            }

            public a Y6() {
                V3();
                ((a0) this.f50422b).Q9();
                return this;
            }

            public a Z5() {
                V3();
                ((a0) this.f50422b).B9();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public androidx.datastore.preferences.protobuf.u a2() {
                return ((a0) this.f50422b).a2();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public boolean a4() {
                return ((a0) this.f50422b).a4();
            }

            public a a6() {
                V3();
                ((a0) this.f50422b).C9();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public String a7() {
                return ((a0) this.f50422b).a7();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public boolean a8() {
                return ((a0) this.f50422b).a8();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public androidx.datastore.preferences.protobuf.u b2() {
                return ((a0) this.f50422b).b2();
            }

            public a b7() {
                V3();
                ((a0) this.f50422b).R9();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public androidx.datastore.preferences.protobuf.u c4() {
                return ((a0) this.f50422b).c4();
            }

            public a c6() {
                V3();
                ((a0) this.f50422b).D9();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public List<u0> d() {
                return Collections.unmodifiableList(((a0) this.f50422b).d());
            }

            @Deprecated
            public a d6() {
                V3();
                ((a0) this.f50422b).E9();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public boolean d7() {
                return ((a0) this.f50422b).d7();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public u0 e(int index) {
                return ((a0) this.f50422b).e(index);
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public String e5() {
                return ((a0) this.f50422b).e5();
            }

            public a e6() {
                V3();
                ((a0) this.f50422b).F9();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public androidx.datastore.preferences.protobuf.u e7() {
                return ((a0) this.f50422b).e7();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public int f() {
                return ((a0) this.f50422b).f();
            }

            public a f7() {
                V3();
                ((a0) this.f50422b).S9();
                return this;
            }

            public a f8(androidx.datastore.preferences.protobuf.u value) {
                V3();
                ((a0) this.f50422b).ra(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public boolean g4() {
                return ((a0) this.f50422b).g4();
            }

            public a g8(boolean value) {
                V3();
                ((a0) this.f50422b).sa(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public androidx.datastore.preferences.protobuf.u h3() {
                return ((a0) this.f50422b).h3();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public boolean h4() {
                return ((a0) this.f50422b).h4();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public boolean h5() {
                return ((a0) this.f50422b).h5();
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a h8(o.a builderForValue) {
                V3();
                ((a0) this.f50422b).ta((o) builderForValue.build());
                return this;
            }

            public a i6() {
                V3();
                ((a0) this.f50422b).G9();
                return this;
            }

            public a i7(o value) {
                V3();
                ((a0) this.f50422b).X9(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public boolean j() {
                return ((a0) this.f50422b).j();
            }

            public a j7(int index) {
                V3();
                ((a0) this.f50422b).na(index);
                return this;
            }

            public a j8(o value) {
                V3();
                ((a0) this.f50422b).ta(value);
                return this;
            }

            public a k8(String value) {
                V3();
                ((a0) this.f50422b).ua(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public boolean l() {
                return ((a0) this.f50422b).l();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public boolean l7() {
                return ((a0) this.f50422b).l7();
            }

            public a l8(androidx.datastore.preferences.protobuf.u value) {
                V3();
                ((a0) this.f50422b).va(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public String m4() {
                return ((a0) this.f50422b).m4();
            }

            @Deprecated
            public a m8(boolean value) {
                V3();
                ((a0) this.f50422b).wa(value);
                return this;
            }

            public a n8(boolean value) {
                V3();
                ((a0) this.f50422b).xa(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public androidx.datastore.preferences.protobuf.u o4() {
                return ((a0) this.f50422b).o4();
            }

            public a o6() {
                V3();
                ((a0) this.f50422b).H9();
                return this;
            }

            public a o8(boolean value) {
                V3();
                ((a0) this.f50422b).ya(value);
                return this;
            }

            public a p6() {
                V3();
                ((a0) this.f50422b).I9();
                return this;
            }

            public a p8(String value) {
                V3();
                ((a0) this.f50422b).za(value);
                return this;
            }

            public a q8(androidx.datastore.preferences.protobuf.u value) {
                V3();
                ((a0) this.f50422b).Aa(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public boolean r() {
                return ((a0) this.f50422b).r();
            }

            public a r5(Iterable<? extends u0> values) {
                V3();
                ((a0) this.f50422b).v9(values);
                return this;
            }

            public a r6() {
                V3();
                ((a0) this.f50422b).J9();
                return this;
            }

            public a r8(String value) {
                V3();
                ((a0) this.f50422b).Ba(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public String s5() {
                return ((a0) this.f50422b).s5();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public boolean s7() {
                return ((a0) this.f50422b).s7();
            }

            public a s8(androidx.datastore.preferences.protobuf.u value) {
                V3();
                ((a0) this.f50422b).Ca(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public o t() {
                return ((a0) this.f50422b).t();
            }

            public a t6() {
                V3();
                ((a0) this.f50422b).K9();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public boolean t7() {
                return ((a0) this.f50422b).t7();
            }

            public a t8(boolean value) {
                V3();
                ((a0) this.f50422b).Da(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public androidx.datastore.preferences.protobuf.u u5() {
                return ((a0) this.f50422b).u5();
            }

            public a u8(String value) {
                V3();
                ((a0) this.f50422b).Ea(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public boolean v2() {
                return ((a0) this.f50422b).v2();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public boolean v6() {
                return ((a0) this.f50422b).v6();
            }

            public a v8(androidx.datastore.preferences.protobuf.u value) {
                V3();
                ((a0) this.f50422b).Fa(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public boolean w5() {
                return ((a0) this.f50422b).w5();
            }

            public a w6() {
                V3();
                ((a0) this.f50422b).L9();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public androidx.datastore.preferences.protobuf.u w7() {
                return ((a0) this.f50422b).w7();
            }

            public a w8(b value) {
                V3();
                ((a0) this.f50422b).Ga(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            @Deprecated
            public boolean x7() {
                return ((a0) this.f50422b).x7();
            }

            public a x8(String value) {
                V3();
                ((a0) this.f50422b).Ha(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public boolean y4() {
                return ((a0) this.f50422b).y4();
            }

            public a y5(int index, u0.a builderForValue) {
                V3();
                ((a0) this.f50422b).w9(index, builderForValue.build());
                return this;
            }

            public a y7(boolean value) {
                V3();
                ((a0) this.f50422b).oa(value);
                return this;
            }

            public a y8(androidx.datastore.preferences.protobuf.u value) {
                V3();
                ((a0) this.f50422b).Ia(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b0
            public String z2() {
                return ((a0) this.f50422b).z2();
            }

            public a z8(String value) {
                V3();
                ((a0) this.f50422b).Ja(value);
                return this;
            }

            private a() {
                super(a0.DEFAULT_INSTANCE);
            }
        }

        public enum b implements s1.c {
            SPEED(1),
            CODE_SIZE(2),
            LITE_RUNTIME(3);


            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f50072e = 1;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f50073f = 2;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f50074g = 3;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static final s1.d<b> f50075h = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f50077a;

            class a implements s1.d<b> {
                a() {
                }

                @Override // androidx.datastore.preferences.protobuf.s1.d
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public b a(int number) {
                    return b.b(number);
                }
            }

            /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.e0$a0$b$b, reason: collision with other inner class name */
            private static final class C0446b implements s1.e {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                static final s1.e f50078a = new C0446b();

                private C0446b() {
                }

                @Override // androidx.datastore.preferences.protobuf.s1.e
                public boolean a(int number) {
                    return b.b(number) != null;
                }
            }

            b(int value) {
                this.f50077a = value;
            }

            public static b b(int value) {
                if (value == 1) {
                    return SPEED;
                }
                if (value == 2) {
                    return CODE_SIZE;
                }
                int i10 = 6 >> 3;
                if (value != 3) {
                    return null;
                }
                return LITE_RUNTIME;
            }

            public static s1.d<b> k() {
                return f50075h;
            }

            public static s1.e l() {
                return C0446b.f50078a;
            }

            @Deprecated
            public static b n(int value) {
                return b(value);
            }

            @Override // androidx.datastore.preferences.protobuf.s1.c
            public final int i() {
                return this.f50077a;
            }
        }

        static {
            a0 a0Var = new a0();
            DEFAULT_INSTANCE = a0Var;
            l1.Y6(a0.class, a0Var);
        }

        private a0() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void A9() {
            this.bitField0_ &= -8193;
            this.csharpNamespace_ = U9().s5();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Aa(androidx.datastore.preferences.protobuf.u value) {
            this.javaOuterClassname_ = value.A0();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void B9() {
            this.bitField0_ &= -1025;
            this.deprecated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ba(String value) {
            value.getClass();
            this.bitField0_ |= 1;
            this.javaPackage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C9() {
            this.features_ = null;
            this.bitField0_ &= -524289;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ca(androidx.datastore.preferences.protobuf.u value) {
            this.javaPackage_ = value.A0();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void D9() {
            this.bitField0_ &= -65;
            this.goPackage_ = U9().B6();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Da(boolean value) {
            this.bitField0_ |= 16;
            this.javaStringCheckUtf8_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void E9() {
            this.bitField0_ &= -9;
            this.javaGenerateEqualsAndHash_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ea(String value) {
            value.getClass();
            this.bitField0_ |= 4096;
            this.objcClassPrefix_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void F9() {
            this.bitField0_ &= -257;
            this.javaGenericServices_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Fa(androidx.datastore.preferences.protobuf.u value) {
            this.objcClassPrefix_ = value.A0();
            this.bitField0_ |= 4096;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void G9() {
            this.bitField0_ &= -5;
            this.javaMultipleFiles_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ga(b value) {
            this.optimizeFor_ = value.i();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void H9() {
            this.bitField0_ &= -3;
            this.javaOuterClassname_ = U9().G6();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ha(String value) {
            value.getClass();
            this.bitField0_ |= 32768;
            this.phpClassPrefix_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void I9() {
            this.bitField0_ &= -2;
            this.javaPackage_ = U9().C5();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ia(androidx.datastore.preferences.protobuf.u value) {
            this.phpClassPrefix_ = value.A0();
            this.bitField0_ |= 32768;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void J9() {
            this.bitField0_ &= -17;
            this.javaStringCheckUtf8_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ja(String value) {
            value.getClass();
            this.bitField0_ |= 131072;
            this.phpMetadataNamespace_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void K9() {
            this.bitField0_ &= -4097;
            this.objcClassPrefix_ = U9().m4();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ka(androidx.datastore.preferences.protobuf.u value) {
            this.phpMetadataNamespace_ = value.A0();
            this.bitField0_ |= 131072;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void L9() {
            this.bitField0_ &= -33;
            this.optimizeFor_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void La(String value) {
            value.getClass();
            this.bitField0_ |= 65536;
            this.phpNamespace_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void M9() {
            this.bitField0_ &= -32769;
            this.phpClassPrefix_ = U9().a7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ma(androidx.datastore.preferences.protobuf.u value) {
            this.phpNamespace_ = value.A0();
            this.bitField0_ |= 65536;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void N9() {
            this.bitField0_ &= -131073;
            this.phpMetadataNamespace_ = U9().z2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Na(boolean value) {
            this.bitField0_ |= 512;
            this.pyGenericServices_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void O9() {
            this.bitField0_ &= -65537;
            this.phpNamespace_ = U9().V5();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Oa(String value) {
            value.getClass();
            this.bitField0_ |= 262144;
            this.rubyPackage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void P9() {
            this.bitField0_ &= -513;
            this.pyGenericServices_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Pa(androidx.datastore.preferences.protobuf.u value) {
            this.rubyPackage_ = value.A0();
            this.bitField0_ |= 262144;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Q9() {
            this.bitField0_ &= -262145;
            this.rubyPackage_ = U9().O4();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Qa(String value) {
            value.getClass();
            this.bitField0_ |= 16384;
            this.swiftPrefix_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void R9() {
            this.bitField0_ &= -16385;
            this.swiftPrefix_ = U9().e5();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void S9() {
            this.uninterpretedOption_ = l1.T3();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Sa(androidx.datastore.preferences.protobuf.u value) {
            this.swiftPrefix_ = value.A0();
            this.bitField0_ |= 16384;
        }

        private void T9() {
            s1.l<u0> lVar = this.uninterpretedOption_;
            if (lVar.s1()) {
                return;
            }
            this.uninterpretedOption_ = l1.r5(lVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ta(int index, u0 value) {
            value.getClass();
            T9();
            this.uninterpretedOption_.set(index, value);
        }

        public static a0 U9() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void X9(o value) {
            value.getClass();
            o oVar = this.features_;
            if (oVar == null || oVar == o.I8()) {
                this.features_ = value;
            } else {
                this.features_ = ((o.a) o.K8(this.features_).u4(value)).B1();
            }
            this.bitField0_ |= 524288;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a Y9() {
            return (a) DEFAULT_INSTANCE.s3();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a Z9(a0 prototype) {
            return (a) DEFAULT_INSTANCE.v3(prototype);
        }

        public static a0 aa(InputStream input) throws IOException {
            return (a0) l1.J5(DEFAULT_INSTANCE, input);
        }

        public static a0 ba(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (a0) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static a0 ca(androidx.datastore.preferences.protobuf.u data) throws t1 {
            return (a0) l1.R5(DEFAULT_INSTANCE, data);
        }

        public static a0 da(androidx.datastore.preferences.protobuf.u data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (a0) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static a0 ea(androidx.datastore.preferences.protobuf.z input) throws IOException {
            return (a0) l1.a6(DEFAULT_INSTANCE, input);
        }

        public static a0 fa(androidx.datastore.preferences.protobuf.z input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (a0) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static a0 ga(InputStream input) throws IOException {
            return (a0) l1.d6(DEFAULT_INSTANCE, input);
        }

        public static a0 ha(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (a0) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static a0 ia(ByteBuffer data) throws t1 {
            return (a0) l1.i6(DEFAULT_INSTANCE, data);
        }

        public static a0 ja(ByteBuffer data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (a0) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static a0 ka(byte[] data) throws t1 {
            return (a0) l1.p6(DEFAULT_INSTANCE, data);
        }

        public static a0 la(byte[] data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (a0) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static h3<a0> ma() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void na(int index) {
            T9();
            this.uninterpretedOption_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void oa(boolean value) {
            this.bitField0_ |= 2048;
            this.ccEnableArenas_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void pa(boolean value) {
            this.bitField0_ |= 128;
            this.ccGenericServices_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void qa(String value) {
            value.getClass();
            this.bitField0_ |= 8192;
            this.csharpNamespace_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ra(androidx.datastore.preferences.protobuf.u value) {
            this.csharpNamespace_ = value.A0();
            this.bitField0_ |= 8192;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void sa(boolean value) {
            this.bitField0_ |= 1024;
            this.deprecated_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ta(o value) {
            value.getClass();
            this.features_ = value;
            this.bitField0_ |= 524288;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ua(String value) {
            value.getClass();
            this.bitField0_ |= 64;
            this.goPackage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void v9(Iterable<? extends u0> values) {
            T9();
            androidx.datastore.preferences.protobuf.a.m(values, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void va(androidx.datastore.preferences.protobuf.u value) {
            this.goPackage_ = value.A0();
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w9(int index, u0 value) {
            value.getClass();
            T9();
            this.uninterpretedOption_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void wa(boolean value) {
            this.bitField0_ |= 8;
            this.javaGenerateEqualsAndHash_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void x9(u0 value) {
            value.getClass();
            T9();
            this.uninterpretedOption_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void xa(boolean value) {
            this.bitField0_ |= 256;
            this.javaGenericServices_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void y9() {
            this.bitField0_ &= -2049;
            this.ccEnableArenas_ = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ya(boolean value) {
            this.bitField0_ |= 4;
            this.javaMultipleFiles_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void z9() {
            this.bitField0_ &= -129;
            this.ccGenericServices_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void za(String value) {
            value.getClass();
            this.bitField0_ |= 2;
            this.javaOuterClassname_ = value;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public boolean A2() {
            return this.ccEnableArenas_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public boolean B4() {
            return this.pyGenericServices_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public String B6() {
            return this.goPackage_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public String C5() {
            return this.javaPackage_;
        }

        @Override // androidx.datastore.preferences.protobuf.l1
        protected final Object D3(l1.i method, Object arg0, Object arg1) {
            h3 cVar;
            a aVar = null;
            switch (a.f50068a[method.ordinal()]) {
                case 1:
                    return new a0();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.A5(DEFAULT_INSTANCE, "\u0001\u0015\u0000\u0001\u0001ϧ\u0015\u0000\u0001\u0002\u0001ဈ\u0000\bဈ\u0001\t᠌\u0005\nဇ\u0002\u000bဈ\u0006\u0010ဇ\u0007\u0011ဇ\b\u0012ဇ\t\u0014ဇ\u0003\u0017ဇ\n\u001bဇ\u0004\u001fဇ\u000b$ဈ\f%ဈ\r'ဈ\u000e(ဈ\u000f)ဈ\u0010,ဈ\u0011-ဈ\u00122ᐉ\u0013ϧЛ", new Object[]{"bitField0_", "javaPackage_", "javaOuterClassname_", "optimizeFor_", b.l(), "javaMultipleFiles_", "goPackage_", "ccGenericServices_", "javaGenericServices_", "pyGenericServices_", "javaGenerateEqualsAndHash_", "deprecated_", "javaStringCheckUtf8_", "ccEnableArenas_", "objcClassPrefix_", "csharpNamespace_", "swiftPrefix_", "phpClassPrefix_", "phpNamespace_", "phpMetadataNamespace_", "rubyPackage_", "features_", "uninterpretedOption_", u0.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    h3<a0> h3Var = PARSER;
                    if (h3Var != null) {
                        return h3Var;
                    }
                    synchronized (a0.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public boolean E2() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public String G6() {
            return this.javaOuterClassname_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public androidx.datastore.preferences.protobuf.u H6() {
            return androidx.datastore.preferences.protobuf.u.C(this.rubyPackage_);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public boolean K3() {
            return this.javaGenericServices_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public boolean N2() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public String O4() {
            return this.rubyPackage_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public boolean P6() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public androidx.datastore.preferences.protobuf.u R2() {
            return androidx.datastore.preferences.protobuf.u.C(this.javaOuterClassname_);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public boolean S2() {
            return this.javaStringCheckUtf8_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public boolean S6() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public String V5() {
            return this.phpNamespace_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        @Deprecated
        public boolean V7() {
            return (this.bitField0_ & 8) != 0;
        }

        public v0 V9(int index) {
            return this.uninterpretedOption_.get(index);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public b W1() {
            b bVarB = b.b(this.optimizeFor_);
            return bVarB == null ? b.SPEED : bVarB;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public boolean W6() {
            return (this.bitField0_ & 1) != 0;
        }

        public List<? extends v0> W9() {
            return this.uninterpretedOption_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public boolean Y3() {
            return this.javaMultipleFiles_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public androidx.datastore.preferences.protobuf.u a2() {
            return androidx.datastore.preferences.protobuf.u.C(this.csharpNamespace_);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public boolean a4() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public String a7() {
            return this.phpClassPrefix_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public boolean a8() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public androidx.datastore.preferences.protobuf.u b2() {
            return androidx.datastore.preferences.protobuf.u.C(this.objcClassPrefix_);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public androidx.datastore.preferences.protobuf.u c4() {
            return androidx.datastore.preferences.protobuf.u.C(this.phpMetadataNamespace_);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public List<u0> d() {
            return this.uninterpretedOption_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public boolean d7() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public u0 e(int index) {
            return this.uninterpretedOption_.get(index);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public String e5() {
            return this.swiftPrefix_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public androidx.datastore.preferences.protobuf.u e7() {
            return androidx.datastore.preferences.protobuf.u.C(this.swiftPrefix_);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public int f() {
            return this.uninterpretedOption_.size();
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public boolean g4() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public androidx.datastore.preferences.protobuf.u h3() {
            return androidx.datastore.preferences.protobuf.u.C(this.phpClassPrefix_);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public boolean h4() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public boolean h5() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public boolean j() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public boolean l() {
            return this.deprecated_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public boolean l7() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public String m4() {
            return this.objcClassPrefix_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public androidx.datastore.preferences.protobuf.u o4() {
            return androidx.datastore.preferences.protobuf.u.C(this.phpNamespace_);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public boolean r() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public String s5() {
            return this.csharpNamespace_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public boolean s7() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public o t() {
            o oVar = this.features_;
            return oVar == null ? o.I8() : oVar;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public boolean t7() {
            return this.ccGenericServices_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public androidx.datastore.preferences.protobuf.u u5() {
            return androidx.datastore.preferences.protobuf.u.C(this.javaPackage_);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public boolean v2() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public boolean v6() {
            if ((this.bitField0_ & 2048) == 0) {
                return false;
            }
            int i10 = 7 ^ 1;
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public boolean w5() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public androidx.datastore.preferences.protobuf.u w7() {
            return androidx.datastore.preferences.protobuf.u.C(this.goPackage_);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        @Deprecated
        public boolean x7() {
            return this.javaGenerateEqualsAndHash_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public boolean y4() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.b0
        public String z2() {
            return this.phpMetadataNamespace_;
        }
    }

    public static final class b extends l1<b, a> implements c {
        private static final b DEFAULT_INSTANCE;
        public static final int ENUM_TYPE_FIELD_NUMBER = 4;
        public static final int EXTENSION_FIELD_NUMBER = 6;
        public static final int EXTENSION_RANGE_FIELD_NUMBER = 5;
        public static final int FIELD_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NESTED_TYPE_FIELD_NUMBER = 3;
        public static final int ONEOF_DECL_FIELD_NUMBER = 8;
        public static final int OPTIONS_FIELD_NUMBER = 7;
        private static volatile h3<b> PARSER = null;
        public static final int RESERVED_NAME_FIELD_NUMBER = 10;
        public static final int RESERVED_RANGE_FIELD_NUMBER = 9;
        private int bitField0_;
        private C0451e0 options_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private s1.l<s> field_ = l1.T3();
        private s1.l<s> extension_ = l1.T3();
        private s1.l<b> nestedType_ = l1.T3();
        private s1.l<e> enumType_ = l1.T3();
        private s1.l<C0447b> extensionRange_ = l1.T3();
        private s1.l<k0> oneofDecl_ = l1.T3();
        private s1.l<d> reservedRange_ = l1.T3();
        private s1.l<String> reservedName_ = l1.T3();

        public static final class a extends l1.b<b, a> implements c {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.c
            public d A0(int index) {
                return ((b) this.f50422b).A0(index);
            }

            public a A5(e.a builderForValue) {
                V3();
                ((b) this.f50422b).m9(builderForValue.build());
                return this;
            }

            public a A6(b value) {
                V3();
                ((b) this.f50422b).u9(value);
                return this;
            }

            public a A7(d value) {
                V3();
                ((b) this.f50422b).A9(value);
                return this;
            }

            public a A8(int index, s value) {
                V3();
                ((b) this.f50422b).Ga(index, value);
                return this;
            }

            public a B5(e value) {
                V3();
                ((b) this.f50422b).m9(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.c
            public k0 B7(int index) {
                return ((b) this.f50422b).B7(index);
            }

            public a B8(int index, C0447b.a builderForValue) {
                V3();
                ((b) this.f50422b).Ha(index, builderForValue.build());
                return this;
            }

            public a C7() {
                V3();
                ((b) this.f50422b).B9();
                return this;
            }

            public a C8(int index, C0447b value) {
                V3();
                ((b) this.f50422b).Ha(index, value);
                return this;
            }

            public a D5(int index, s.a builderForValue) {
                V3();
                ((b) this.f50422b).n9(index, builderForValue.build());
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.c
            public List<b> D6() {
                return Collections.unmodifiableList(((b) this.f50422b).D6());
            }

            public a D8(int index, s.a builderForValue) {
                V3();
                ((b) this.f50422b).Ia(index, builderForValue.build());
                return this;
            }

            public a E6(int index, k0.a builderForValue) {
                V3();
                ((b) this.f50422b).v9(index, builderForValue.build());
                return this;
            }

            public a E8(int index, s value) {
                V3();
                ((b) this.f50422b).Ia(index, value);
                return this;
            }

            public a F8(String value) {
                V3();
                ((b) this.f50422b).Ja(value);
                return this;
            }

            public a G8(androidx.datastore.preferences.protobuf.u value) {
                V3();
                ((b) this.f50422b).Ka(value);
                return this;
            }

            public a H8(int index, a builderForValue) {
                V3();
                ((b) this.f50422b).La(index, builderForValue.build());
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.c
            public List<String> I0() {
                return Collections.unmodifiableList(((b) this.f50422b).I0());
            }

            public a I5(int index, s value) {
                V3();
                ((b) this.f50422b).n9(index, value);
                return this;
            }

            public a I8(int index, b value) {
                V3();
                ((b) this.f50422b).La(index, value);
                return this;
            }

            public a J5(s.a builderForValue) {
                V3();
                ((b) this.f50422b).o9(builderForValue.build());
                return this;
            }

            public a J8(int index, k0.a builderForValue) {
                V3();
                ((b) this.f50422b).Ma(index, builderForValue.build());
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.c
            public s K0(int index) {
                return ((b) this.f50422b).K0(index);
            }

            public a K8(int index, k0 value) {
                V3();
                ((b) this.f50422b).Ma(index, value);
                return this;
            }

            public a L4(Iterable<? extends e> values) {
                V3();
                ((b) this.f50422b).d9(values);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.c
            public s L5(int index) {
                return ((b) this.f50422b).L5(index);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a L8(C0451e0.a builderForValue) {
                V3();
                ((b) this.f50422b).Na((C0451e0) builderForValue.build());
                return this;
            }

            public a M8(C0451e0 value) {
                V3();
                ((b) this.f50422b).Na(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.c
            public List<d> N0() {
                return Collections.unmodifiableList(((b) this.f50422b).N0());
            }

            public a N8(int index, String value) {
                V3();
                ((b) this.f50422b).Oa(index, value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.c
            public int O0() {
                return ((b) this.f50422b).O0();
            }

            public a O8(int index, d.a builderForValue) {
                V3();
                ((b) this.f50422b).Pa(index, builderForValue.build());
                return this;
            }

            public a P4(Iterable<? extends s> values) {
                V3();
                ((b) this.f50422b).e9(values);
                return this;
            }

            public a P8(int index, d value) {
                V3();
                ((b) this.f50422b).Pa(index, value);
                return this;
            }

            public a Q4(Iterable<? extends C0447b> values) {
                V3();
                ((b) this.f50422b).f9(values);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.c
            public int R4() {
                return ((b) this.f50422b).R4();
            }

            public a R5(s value) {
                V3();
                ((b) this.f50422b).o9(value);
                return this;
            }

            public a R6(int index, k0 value) {
                V3();
                ((b) this.f50422b).v9(index, value);
                return this;
            }

            public a U4(Iterable<? extends s> values) {
                V3();
                ((b) this.f50422b).g9(values);
                return this;
            }

            public a U6(k0.a builderForValue) {
                V3();
                ((b) this.f50422b).w9(builderForValue.build());
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.c
            public C0447b X3(int index) {
                return ((b) this.f50422b).X3(index);
            }

            public a Y6(k0 value) {
                V3();
                ((b) this.f50422b).w9(value);
                return this;
            }

            public a Z4(Iterable<? extends b> values) {
                V3();
                ((b) this.f50422b).h9(values);
                return this;
            }

            public a Z5(int index, C0447b.a builderForValue) {
                V3();
                ((b) this.f50422b).p9(index, builderForValue.build());
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.c
            public androidx.datastore.preferences.protobuf.u a() {
                return ((b) this.f50422b).a();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.c
            public List<e> a0() {
                return Collections.unmodifiableList(((b) this.f50422b).a0());
            }

            public a a5(Iterable<? extends k0> values) {
                V3();
                ((b) this.f50422b).i9(values);
                return this;
            }

            public a a6(int index, C0447b value) {
                V3();
                ((b) this.f50422b).p9(index, value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.c
            public C0451e0 b() {
                return ((b) this.f50422b).b();
            }

            public a b5(Iterable<String> values) {
                V3();
                ((b) this.f50422b).j9(values);
                return this;
            }

            public a b7(String value) {
                V3();
                ((b) this.f50422b).x9(value);
                return this;
            }

            public a c6(C0447b.a builderForValue) {
                V3();
                ((b) this.f50422b).q9(builderForValue.build());
                return this;
            }

            public a d5(Iterable<? extends d> values) {
                V3();
                ((b) this.f50422b).k9(values);
                return this;
            }

            public a d6(C0447b value) {
                V3();
                ((b) this.f50422b).q9(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.c
            public androidx.datastore.preferences.protobuf.u e0(int index) {
                return ((b) this.f50422b).e0(index);
            }

            public a e6(int index, s.a builderForValue) {
                V3();
                ((b) this.f50422b).r9(index, builderForValue.build());
                return this;
            }

            public a f7(androidx.datastore.preferences.protobuf.u value) {
                V3();
                ((b) this.f50422b).y9(value);
                return this;
            }

            public a f8() {
                V3();
                ((b) this.f50422b).C9();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.c
            public boolean g() {
                return ((b) this.f50422b).g();
            }

            public a g8() {
                V3();
                ((b) this.f50422b).D9();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.c
            public String getName() {
                return ((b) this.f50422b).getName();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.c
            public boolean h() {
                return ((b) this.f50422b).h();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.c
            public int h2() {
                return ((b) this.f50422b).h2();
            }

            public a h8() {
                V3();
                ((b) this.f50422b).E9();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.c
            public List<s> i3() {
                return Collections.unmodifiableList(((b) this.f50422b).i3());
            }

            public a i6(int index, s value) {
                V3();
                ((b) this.f50422b).r9(index, value);
                return this;
            }

            public a i7(int index, d.a builderForValue) {
                V3();
                ((b) this.f50422b).z9(index, builderForValue.build());
                return this;
            }

            public a j7(int index, d value) {
                V3();
                ((b) this.f50422b).z9(index, value);
                return this;
            }

            public a j8() {
                V3();
                ((b) this.f50422b).F9();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.c
            public int k6() {
                return ((b) this.f50422b).k6();
            }

            public a k8() {
                V3();
                ((b) this.f50422b).G9();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.c
            public List<k0> l5() {
                return Collections.unmodifiableList(((b) this.f50422b).l5());
            }

            public a l8() {
                V3();
                ((b) this.f50422b).H9();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.c
            public int m0() {
                return ((b) this.f50422b).m0();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.c
            public List<C0447b> m2() {
                return Collections.unmodifiableList(((b) this.f50422b).m2());
            }

            public a m8() {
                V3();
                ((b) this.f50422b).I9();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.c
            public b n6(int index) {
                return ((b) this.f50422b).n6(index);
            }

            public a n8() {
                V3();
                ((b) this.f50422b).J9();
                return this;
            }

            public a o6(s.a builderForValue) {
                V3();
                ((b) this.f50422b).s9(builderForValue.build());
                return this;
            }

            public a o8() {
                V3();
                ((b) this.f50422b).K9();
                return this;
            }

            public a p6(s value) {
                V3();
                ((b) this.f50422b).s9(value);
                return this;
            }

            public a p8(C0451e0 value) {
                V3();
                ((b) this.f50422b).ia(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.c
            public String q0(int index) {
                return ((b) this.f50422b).q0(index);
            }

            public a q8(int index) {
                V3();
                ((b) this.f50422b).ya(index);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.c
            public List<s> r0() {
                return Collections.unmodifiableList(((b) this.f50422b).r0());
            }

            public a r5(int index, e.a builderForValue) {
                V3();
                ((b) this.f50422b).l9(index, builderForValue.build());
                return this;
            }

            public a r6(int index, a builderForValue) {
                V3();
                ((b) this.f50422b).t9(index, builderForValue.build());
                return this;
            }

            public a r8(int index) {
                V3();
                ((b) this.f50422b).za(index);
                return this;
            }

            public a s8(int index) {
                V3();
                ((b) this.f50422b).Aa(index);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.c
            public int t0() {
                return ((b) this.f50422b).t0();
            }

            public a t6(int index, b value) {
                V3();
                ((b) this.f50422b).t9(index, value);
                return this;
            }

            public a t8(int index) {
                V3();
                ((b) this.f50422b).Ba(index);
                return this;
            }

            public a u8(int index) {
                V3();
                ((b) this.f50422b).Ca(index);
                return this;
            }

            public a v8(int index) {
                V3();
                ((b) this.f50422b).Da(index);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.c
            public int w0() {
                return ((b) this.f50422b).w0();
            }

            public a w6(a builderForValue) {
                V3();
                ((b) this.f50422b).u9(builderForValue.build());
                return this;
            }

            public a w8(int index) {
                V3();
                ((b) this.f50422b).Ea(index);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.c
            public int x2() {
                return ((b) this.f50422b).x2();
            }

            public a x8(int index, e.a builderForValue) {
                V3();
                ((b) this.f50422b).Fa(index, builderForValue.build());
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.c
            public e y0(int index) {
                return ((b) this.f50422b).y0(index);
            }

            public a y5(int index, e value) {
                V3();
                ((b) this.f50422b).l9(index, value);
                return this;
            }

            public a y7(d.a builderForValue) {
                V3();
                ((b) this.f50422b).A9(builderForValue.build());
                return this;
            }

            public a y8(int index, e value) {
                V3();
                ((b) this.f50422b).Fa(index, value);
                return this;
            }

            public a z8(int index, s.a builderForValue) {
                V3();
                ((b) this.f50422b).Ga(index, builderForValue.build());
                return this;
            }

            private a() {
                super(b.DEFAULT_INSTANCE);
            }
        }

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.e0$b$b, reason: collision with other inner class name */
        public static final class C0447b extends l1<C0447b, a> implements c {
            private static final C0447b DEFAULT_INSTANCE;
            public static final int END_FIELD_NUMBER = 2;
            public static final int OPTIONS_FIELD_NUMBER = 3;
            private static volatile h3<C0447b> PARSER = null;
            public static final int START_FIELD_NUMBER = 1;
            private int bitField0_;
            private int end_;
            private byte memoizedIsInitialized = 2;
            private m options_;
            private int start_;

            /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.e0$b$b$a */
            public static final class a extends l1.b<C0447b, a> implements c {
                /* synthetic */ a(a aVar) {
                    this();
                }

                @Override // androidx.datastore.preferences.protobuf.e0.b.c
                public boolean L() {
                    return ((C0447b) this.f50422b).L();
                }

                public a L4() {
                    V3();
                    ((C0447b) this.f50422b).j8();
                    return this;
                }

                public a P4() {
                    V3();
                    ((C0447b) this.f50422b).k8();
                    return this;
                }

                public a Q4() {
                    V3();
                    ((C0447b) this.f50422b).l8();
                    return this;
                }

                public a U4(m value) {
                    V3();
                    ((C0447b) this.f50422b).n8(value);
                    return this;
                }

                public a Z4(int value) {
                    V3();
                    ((C0447b) this.f50422b).D8(value);
                    return this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public a a5(m.a builderForValue) {
                    V3();
                    ((C0447b) this.f50422b).E8((m) builderForValue.build());
                    return this;
                }

                @Override // androidx.datastore.preferences.protobuf.e0.b.c
                public m b() {
                    return ((C0447b) this.f50422b).b();
                }

                public a b5(m value) {
                    V3();
                    ((C0447b) this.f50422b).E8(value);
                    return this;
                }

                public a d5(int value) {
                    V3();
                    ((C0447b) this.f50422b).F8(value);
                    return this;
                }

                @Override // androidx.datastore.preferences.protobuf.e0.b.c
                public boolean g() {
                    return ((C0447b) this.f50422b).g();
                }

                @Override // androidx.datastore.preferences.protobuf.e0.b.c
                public int u() {
                    return ((C0447b) this.f50422b).u();
                }

                @Override // androidx.datastore.preferences.protobuf.e0.b.c
                public int v() {
                    return ((C0447b) this.f50422b).v();
                }

                @Override // androidx.datastore.preferences.protobuf.e0.b.c
                public boolean x() {
                    return ((C0447b) this.f50422b).x();
                }

                private a() {
                    super(C0447b.DEFAULT_INSTANCE);
                }
            }

            static {
                C0447b c0447b = new C0447b();
                DEFAULT_INSTANCE = c0447b;
                l1.Y6(C0447b.class, c0447b);
            }

            private C0447b() {
            }

            public static C0447b A8(byte[] data) throws t1 {
                return (C0447b) l1.p6(DEFAULT_INSTANCE, data);
            }

            public static C0447b B8(byte[] data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
                return (C0447b) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static h3<C0447b> C8() {
                return DEFAULT_INSTANCE.W7();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void D8(int value) {
                this.bitField0_ |= 2;
                this.end_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void E8(m value) {
                value.getClass();
                this.options_ = value;
                this.bitField0_ |= 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void F8(int value) {
                this.bitField0_ |= 1;
                this.start_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void j8() {
                this.bitField0_ &= -3;
                this.end_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void k8() {
                this.options_ = null;
                this.bitField0_ &= -5;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void l8() {
                this.bitField0_ &= -2;
                this.start_ = 0;
            }

            public static C0447b m8() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Multi-variable type inference failed */
            public void n8(m value) {
                value.getClass();
                m mVar = this.options_;
                if (mVar == null || mVar == m.V8()) {
                    this.options_ = value;
                } else {
                    this.options_ = ((m.a) m.a9(this.options_).u4(value)).B1();
                }
                this.bitField0_ |= 4;
            }

            public static a o8() {
                return DEFAULT_INSTANCE.s3();
            }

            public static a p8(C0447b prototype) {
                return DEFAULT_INSTANCE.v3(prototype);
            }

            public static C0447b q8(InputStream input) throws IOException {
                return (C0447b) l1.J5(DEFAULT_INSTANCE, input);
            }

            public static C0447b r8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
                return (C0447b) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static C0447b s8(androidx.datastore.preferences.protobuf.u data) throws t1 {
                return (C0447b) l1.R5(DEFAULT_INSTANCE, data);
            }

            public static C0447b t8(androidx.datastore.preferences.protobuf.u data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
                return (C0447b) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static C0447b u8(androidx.datastore.preferences.protobuf.z input) throws IOException {
                return (C0447b) l1.a6(DEFAULT_INSTANCE, input);
            }

            public static C0447b v8(androidx.datastore.preferences.protobuf.z input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
                return (C0447b) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static C0447b w8(InputStream input) throws IOException {
                return (C0447b) l1.d6(DEFAULT_INSTANCE, input);
            }

            public static C0447b x8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
                return (C0447b) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static C0447b y8(ByteBuffer data) throws t1 {
                return (C0447b) l1.i6(DEFAULT_INSTANCE, data);
            }

            public static C0447b z8(ByteBuffer data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
                return (C0447b) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            @Override // androidx.datastore.preferences.protobuf.l1
            protected final Object D3(l1.i method, Object arg0, Object arg1) {
                h3 cVar;
                a aVar = null;
                switch (a.f50068a[method.ordinal()]) {
                    case 1:
                        return new C0447b();
                    case 2:
                        return new a(aVar);
                    case 3:
                        return l1.A5(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001င\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"bitField0_", "start_", "end_", "options_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        h3<C0447b> h3Var = PARSER;
                        if (h3Var != null) {
                            return h3Var;
                        }
                        synchronized (C0447b.class) {
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
                        return Byte.valueOf(this.memoizedIsInitialized);
                    case 7:
                        this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b.c
            public boolean L() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b.c
            public m b() {
                m mVar = this.options_;
                return mVar == null ? m.V8() : mVar;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b.c
            public boolean g() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b.c
            public int u() {
                return this.start_;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b.c
            public int v() {
                return this.end_;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b.c
            public boolean x() {
                return (this.bitField0_ & 2) != 0;
            }
        }

        public interface c extends r2 {
            boolean L();

            m b();

            boolean g();

            int u();

            int v();

            boolean x();
        }

        public static final class d extends l1<d, a> implements e {
            private static final d DEFAULT_INSTANCE;
            public static final int END_FIELD_NUMBER = 2;
            private static volatile h3<d> PARSER = null;
            public static final int START_FIELD_NUMBER = 1;
            private int bitField0_;
            private int end_;
            private int start_;

            public static final class a extends l1.b<d, a> implements e {
                /* synthetic */ a(a aVar) {
                    this();
                }

                @Override // androidx.datastore.preferences.protobuf.e0.b.e
                public boolean L() {
                    return ((d) this.f50422b).L();
                }

                public a L4() {
                    V3();
                    ((d) this.f50422b).f8();
                    return this;
                }

                public a P4() {
                    V3();
                    ((d) this.f50422b).g8();
                    return this;
                }

                public a Q4(int value) {
                    V3();
                    ((d) this.f50422b).y8(value);
                    return this;
                }

                public a U4(int value) {
                    V3();
                    ((d) this.f50422b).z8(value);
                    return this;
                }

                @Override // androidx.datastore.preferences.protobuf.e0.b.e
                public int u() {
                    return ((d) this.f50422b).u();
                }

                @Override // androidx.datastore.preferences.protobuf.e0.b.e
                public int v() {
                    return ((d) this.f50422b).v();
                }

                @Override // androidx.datastore.preferences.protobuf.e0.b.e
                public boolean x() {
                    return ((d) this.f50422b).x();
                }

                private a() {
                    super(d.DEFAULT_INSTANCE);
                }
            }

            static {
                d dVar = new d();
                DEFAULT_INSTANCE = dVar;
                l1.Y6(d.class, dVar);
            }

            private d() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void f8() {
                this.bitField0_ &= -3;
                this.end_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void g8() {
                this.bitField0_ &= -2;
                this.start_ = 0;
            }

            public static d h8() {
                return DEFAULT_INSTANCE;
            }

            public static a j8() {
                return DEFAULT_INSTANCE.s3();
            }

            public static a k8(d prototype) {
                return DEFAULT_INSTANCE.v3(prototype);
            }

            public static d l8(InputStream input) throws IOException {
                return (d) l1.J5(DEFAULT_INSTANCE, input);
            }

            public static d m8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
                return (d) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static d n8(androidx.datastore.preferences.protobuf.u data) throws t1 {
                return (d) l1.R5(DEFAULT_INSTANCE, data);
            }

            public static d o8(androidx.datastore.preferences.protobuf.u data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
                return (d) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static d p8(androidx.datastore.preferences.protobuf.z input) throws IOException {
                return (d) l1.a6(DEFAULT_INSTANCE, input);
            }

            public static d q8(androidx.datastore.preferences.protobuf.z input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
                return (d) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static d r8(InputStream input) throws IOException {
                return (d) l1.d6(DEFAULT_INSTANCE, input);
            }

            public static d s8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
                return (d) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static d t8(ByteBuffer data) throws t1 {
                return (d) l1.i6(DEFAULT_INSTANCE, data);
            }

            public static d u8(ByteBuffer data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
                return (d) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static d v8(byte[] data) throws t1 {
                return (d) l1.p6(DEFAULT_INSTANCE, data);
            }

            public static d w8(byte[] data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
                return (d) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static h3<d> x8() {
                return DEFAULT_INSTANCE.W7();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void y8(int value) {
                this.bitField0_ |= 2;
                this.end_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void z8(int value) {
                this.bitField0_ |= 1;
                this.start_ = value;
            }

            @Override // androidx.datastore.preferences.protobuf.l1
            protected final Object D3(l1.i method, Object arg0, Object arg1) {
                h3 cVar;
                int i10 = a.f50068a[method.ordinal()];
                a aVar = null;
                switch (i10) {
                    case 1:
                        return new d();
                    case 2:
                        return new a(aVar);
                    case 3:
                        return l1.A5(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "start_", "end_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        h3<d> h3Var = PARSER;
                        if (h3Var != null) {
                            return h3Var;
                        }
                        synchronized (d.class) {
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

            @Override // androidx.datastore.preferences.protobuf.e0.b.e
            public boolean L() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b.e
            public int u() {
                return this.start_;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b.e
            public int v() {
                return this.end_;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.b.e
            public boolean x() {
                return (this.bitField0_ & 2) != 0;
            }
        }

        public interface e extends r2 {
            boolean L();

            int u();

            int v();

            boolean x();
        }

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            l1.Y6(b.class, bVar);
        }

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void A9(d value) {
            value.getClass();
            S9();
            this.reservedRange_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Aa(int index) {
            N9();
            this.extensionRange_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void B9() {
            this.enumType_ = l1.T3();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ba(int index) {
            O9();
            this.field_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C9() {
            this.extension_ = l1.T3();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ca(int index) {
            P9();
            this.nestedType_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void D9() {
            this.extensionRange_ = l1.T3();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Da(int index) {
            Q9();
            this.oneofDecl_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void E9() {
            this.field_ = l1.T3();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ea(int index) {
            S9();
            this.reservedRange_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void F9() {
            this.bitField0_ &= -2;
            this.name_ = T9().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Fa(int index, e value) {
            value.getClass();
            L9();
            this.enumType_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void G9() {
            this.nestedType_ = l1.T3();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ga(int index, s value) {
            value.getClass();
            M9();
            this.extension_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void H9() {
            this.oneofDecl_ = l1.T3();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ha(int index, C0447b value) {
            value.getClass();
            N9();
            this.extensionRange_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void I9() {
            this.options_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ia(int index, s value) {
            value.getClass();
            O9();
            this.field_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void J9() {
            this.reservedName_ = l1.T3();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ja(String value) {
            value.getClass();
            this.bitField0_ |= 1;
            this.name_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void K9() {
            this.reservedRange_ = l1.T3();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ka(androidx.datastore.preferences.protobuf.u value) {
            this.name_ = value.A0();
            this.bitField0_ |= 1;
        }

        private void L9() {
            s1.l<e> lVar = this.enumType_;
            if (lVar.s1()) {
                return;
            }
            this.enumType_ = l1.r5(lVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void La(int index, b value) {
            value.getClass();
            P9();
            this.nestedType_.set(index, value);
        }

        private void M9() {
            s1.l<s> lVar = this.extension_;
            if (lVar.s1()) {
                return;
            }
            this.extension_ = l1.r5(lVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ma(int index, k0 value) {
            value.getClass();
            Q9();
            this.oneofDecl_.set(index, value);
        }

        private void N9() {
            s1.l<C0447b> lVar = this.extensionRange_;
            if (lVar.s1()) {
                return;
            }
            this.extensionRange_ = l1.r5(lVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Na(C0451e0 value) {
            value.getClass();
            this.options_ = value;
            this.bitField0_ |= 2;
        }

        private void O9() {
            s1.l<s> lVar = this.field_;
            if (lVar.s1()) {
                return;
            }
            this.field_ = l1.r5(lVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Oa(int index, String value) {
            value.getClass();
            R9();
            this.reservedName_.set(index, value);
        }

        private void P9() {
            s1.l<b> lVar = this.nestedType_;
            if (lVar.s1()) {
                return;
            }
            this.nestedType_ = l1.r5(lVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Pa(int index, d value) {
            value.getClass();
            S9();
            this.reservedRange_.set(index, value);
        }

        private void Q9() {
            s1.l<k0> lVar = this.oneofDecl_;
            if (lVar.s1()) {
                return;
            }
            this.oneofDecl_ = l1.r5(lVar);
        }

        private void R9() {
            s1.l<String> lVar = this.reservedName_;
            if (lVar.s1()) {
                return;
            }
            this.reservedName_ = l1.r5(lVar);
        }

        private void S9() {
            s1.l<d> lVar = this.reservedRange_;
            if (lVar.s1()) {
                return;
            }
            this.reservedRange_ = l1.r5(lVar);
        }

        public static b T9() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d9(Iterable<? extends e> values) {
            L9();
            androidx.datastore.preferences.protobuf.a.m(values, this.enumType_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e9(Iterable<? extends s> values) {
            M9();
            androidx.datastore.preferences.protobuf.a.m(values, this.extension_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f9(Iterable<? extends C0447b> values) {
            N9();
            androidx.datastore.preferences.protobuf.a.m(values, this.extensionRange_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g9(Iterable<? extends s> values) {
            O9();
            androidx.datastore.preferences.protobuf.a.m(values, this.field_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h9(Iterable<? extends b> values) {
            P9();
            androidx.datastore.preferences.protobuf.a.m(values, this.nestedType_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i9(Iterable<? extends k0> values) {
            Q9();
            androidx.datastore.preferences.protobuf.a.m(values, this.oneofDecl_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void ia(C0451e0 value) {
            value.getClass();
            C0451e0 c0451e0 = this.options_;
            if (c0451e0 == null || c0451e0 == C0451e0.U8()) {
                this.options_ = value;
            } else {
                this.options_ = ((C0451e0.a) C0451e0.Z8(this.options_).u4(value)).B1();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j9(Iterable<String> values) {
            R9();
            androidx.datastore.preferences.protobuf.a.m(values, this.reservedName_);
        }

        public static a ja() {
            return DEFAULT_INSTANCE.s3();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k9(Iterable<? extends d> values) {
            S9();
            androidx.datastore.preferences.protobuf.a.m(values, this.reservedRange_);
        }

        public static a ka(b prototype) {
            return DEFAULT_INSTANCE.v3(prototype);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l9(int index, e value) {
            value.getClass();
            L9();
            this.enumType_.add(index, value);
        }

        public static b la(InputStream input) throws IOException {
            return (b) l1.J5(DEFAULT_INSTANCE, input);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m9(e value) {
            value.getClass();
            L9();
            this.enumType_.add(value);
        }

        public static b ma(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (b) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n9(int index, s value) {
            value.getClass();
            M9();
            this.extension_.add(index, value);
        }

        public static b na(androidx.datastore.preferences.protobuf.u data) throws t1 {
            return (b) l1.R5(DEFAULT_INSTANCE, data);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o9(s value) {
            value.getClass();
            M9();
            this.extension_.add(value);
        }

        public static b oa(androidx.datastore.preferences.protobuf.u data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (b) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p9(int index, C0447b value) {
            value.getClass();
            N9();
            this.extensionRange_.add(index, value);
        }

        public static b pa(androidx.datastore.preferences.protobuf.z input) throws IOException {
            return (b) l1.a6(DEFAULT_INSTANCE, input);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q9(C0447b value) {
            value.getClass();
            N9();
            this.extensionRange_.add(value);
        }

        public static b qa(androidx.datastore.preferences.protobuf.z input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (b) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void r9(int index, s value) {
            value.getClass();
            O9();
            this.field_.add(index, value);
        }

        public static b ra(InputStream input) throws IOException {
            return (b) l1.d6(DEFAULT_INSTANCE, input);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s9(s value) {
            value.getClass();
            O9();
            this.field_.add(value);
        }

        public static b sa(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (b) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t9(int index, b value) {
            value.getClass();
            P9();
            this.nestedType_.add(index, value);
        }

        public static b ta(ByteBuffer data) throws t1 {
            return (b) l1.i6(DEFAULT_INSTANCE, data);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void u9(b value) {
            value.getClass();
            P9();
            this.nestedType_.add(value);
        }

        public static b ua(ByteBuffer data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (b) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void v9(int index, k0 value) {
            value.getClass();
            Q9();
            this.oneofDecl_.add(index, value);
        }

        public static b va(byte[] data) throws t1 {
            return (b) l1.p6(DEFAULT_INSTANCE, data);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w9(k0 value) {
            value.getClass();
            Q9();
            this.oneofDecl_.add(value);
        }

        public static b wa(byte[] data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (b) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void x9(String value) {
            value.getClass();
            R9();
            this.reservedName_.add(value);
        }

        public static h3<b> xa() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void y9(androidx.datastore.preferences.protobuf.u value) {
            R9();
            this.reservedName_.add(value.A0());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ya(int index) {
            L9();
            this.enumType_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void z9(int index, d value) {
            value.getClass();
            S9();
            this.reservedRange_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void za(int index) {
            M9();
            this.extension_.remove(index);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.c
        public d A0(int index) {
            return this.reservedRange_.get(index);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.c
        public k0 B7(int index) {
            return this.oneofDecl_.get(index);
        }

        @Override // androidx.datastore.preferences.protobuf.l1
        protected final Object D3(l1.i method, Object arg0, Object arg1) {
            h3 cVar;
            a aVar = null;
            switch (a.f50068a[method.ordinal()]) {
                case 1:
                    return new b();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.A5(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\b\u0007\u0001ဈ\u0000\u0002Л\u0003Л\u0004Л\u0005Л\u0006Л\u0007ᐉ\u0001\bЛ\t\u001b\n\u001a", new Object[]{"bitField0_", "name_", "field_", s.class, "nestedType_", b.class, "enumType_", e.class, "extensionRange_", C0447b.class, "extension_", s.class, "options_", "oneofDecl_", k0.class, "reservedRange_", d.class, "reservedName_"});
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.e0.c
        public List<b> D6() {
            return this.nestedType_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.c
        public List<String> I0() {
            return this.reservedName_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.c
        public s K0(int index) {
            return this.extension_.get(index);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.c
        public s L5(int index) {
            return this.field_.get(index);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.c
        public List<d> N0() {
            return this.reservedRange_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.c
        public int O0() {
            return this.reservedName_.size();
        }

        @Override // androidx.datastore.preferences.protobuf.e0.c
        public int R4() {
            return this.extensionRange_.size();
        }

        public f U9(int index) {
            return this.enumType_.get(index);
        }

        public List<? extends f> V9() {
            return this.enumType_;
        }

        public t W9(int index) {
            return this.extension_.get(index);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.c
        public C0447b X3(int index) {
            return this.extensionRange_.get(index);
        }

        public List<? extends t> X9() {
            return this.extension_;
        }

        public c Y9(int index) {
            return this.extensionRange_.get(index);
        }

        public List<? extends c> Z9() {
            return this.extensionRange_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.c
        public androidx.datastore.preferences.protobuf.u a() {
            return androidx.datastore.preferences.protobuf.u.C(this.name_);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.c
        public List<e> a0() {
            return this.enumType_;
        }

        public t aa(int index) {
            return this.field_.get(index);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.c
        public C0451e0 b() {
            C0451e0 c0451e0U8 = this.options_;
            if (c0451e0U8 == null) {
                c0451e0U8 = C0451e0.U8();
            }
            return c0451e0U8;
        }

        public List<? extends t> ba() {
            return this.field_;
        }

        public c ca(int index) {
            return this.nestedType_.get(index);
        }

        public List<? extends c> da() {
            return this.nestedType_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.c
        public androidx.datastore.preferences.protobuf.u e0(int index) {
            return androidx.datastore.preferences.protobuf.u.C(this.reservedName_.get(index));
        }

        public l0 ea(int index) {
            return this.oneofDecl_.get(index);
        }

        public List<? extends l0> fa() {
            return this.oneofDecl_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.c
        public boolean g() {
            return (this.bitField0_ & 2) != 0;
        }

        public e ga(int index) {
            return this.reservedRange_.get(index);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.c
        public String getName() {
            return this.name_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.c
        public boolean h() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.c
        public int h2() {
            return this.oneofDecl_.size();
        }

        public List<? extends e> ha() {
            return this.reservedRange_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.c
        public List<s> i3() {
            return this.field_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.c
        public int k6() {
            return this.nestedType_.size();
        }

        @Override // androidx.datastore.preferences.protobuf.e0.c
        public List<k0> l5() {
            return this.oneofDecl_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.c
        public int m0() {
            return this.extension_.size();
        }

        @Override // androidx.datastore.preferences.protobuf.e0.c
        public List<C0447b> m2() {
            return this.extensionRange_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.c
        public b n6(int index) {
            return this.nestedType_.get(index);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.c
        public String q0(int index) {
            return this.reservedName_.get(index);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.c
        public List<s> r0() {
            return this.extension_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.c
        public int t0() {
            return this.reservedRange_.size();
        }

        @Override // androidx.datastore.preferences.protobuf.e0.c
        public int w0() {
            return this.enumType_.size();
        }

        @Override // androidx.datastore.preferences.protobuf.e0.c
        public int x2() {
            return this.field_.size();
        }

        @Override // androidx.datastore.preferences.protobuf.e0.c
        public e y0(int index) {
            return this.enumType_.get(index);
        }
    }

    public interface b0 extends l1.f<a0, a0.a> {
        boolean A2();

        boolean B4();

        String B6();

        String C5();

        boolean E2();

        String G6();

        androidx.datastore.preferences.protobuf.u H6();

        boolean K3();

        boolean N2();

        String O4();

        boolean P6();

        androidx.datastore.preferences.protobuf.u R2();

        boolean S2();

        boolean S6();

        String V5();

        @Deprecated
        boolean V7();

        a0.b W1();

        boolean W6();

        boolean Y3();

        androidx.datastore.preferences.protobuf.u a2();

        boolean a4();

        String a7();

        boolean a8();

        androidx.datastore.preferences.protobuf.u b2();

        androidx.datastore.preferences.protobuf.u c4();

        List<u0> d();

        boolean d7();

        u0 e(int index);

        String e5();

        androidx.datastore.preferences.protobuf.u e7();

        int f();

        boolean g4();

        androidx.datastore.preferences.protobuf.u h3();

        boolean h4();

        boolean h5();

        boolean j();

        boolean l();

        boolean l7();

        String m4();

        androidx.datastore.preferences.protobuf.u o4();

        boolean r();

        String s5();

        boolean s7();

        o t();

        boolean t7();

        androidx.datastore.preferences.protobuf.u u5();

        boolean v2();

        boolean v6();

        boolean w5();

        androidx.datastore.preferences.protobuf.u w7();

        @Deprecated
        boolean x7();

        boolean y4();

        String z2();
    }

    public interface c extends r2 {
        b.d A0(int index);

        k0 B7(int index);

        List<b> D6();

        List<String> I0();

        s K0(int index);

        s L5(int index);

        List<b.d> N0();

        int O0();

        int R4();

        b.C0447b X3(int index);

        androidx.datastore.preferences.protobuf.u a();

        List<e> a0();

        C0451e0 b();

        androidx.datastore.preferences.protobuf.u e0(int index);

        boolean g();

        String getName();

        boolean h();

        int h2();

        List<s> i3();

        int k6();

        List<k0> l5();

        int m0();

        List<b.C0447b> m2();

        b n6(int index);

        String q0(int index);

        List<s> r0();

        int t0();

        int w0();

        int x2();

        e y0(int index);
    }

    public static final class c0 extends l1<c0, c> implements d0 {
        public static final int ANNOTATION_FIELD_NUMBER = 1;
        private static final c0 DEFAULT_INSTANCE;
        private static volatile h3<c0> PARSER;
        private s1.l<a> annotation_ = l1.T3();

        public static final class a extends l1<a, C0448a> implements b {
            public static final int BEGIN_FIELD_NUMBER = 3;
            private static final a DEFAULT_INSTANCE;
            public static final int END_FIELD_NUMBER = 4;
            private static volatile h3<a> PARSER = null;
            public static final int PATH_FIELD_NUMBER = 1;
            public static final int SEMANTIC_FIELD_NUMBER = 5;
            public static final int SOURCE_FILE_FIELD_NUMBER = 2;
            private int begin_;
            private int bitField0_;
            private int end_;
            private int semantic_;
            private int pathMemoizedSerializedSize = -1;
            private s1.g path_ = l1.N3();
            private String sourceFile_ = "";

            /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.e0$c0$a$a, reason: collision with other inner class name */
            public static final class C0448a extends l1.b<a, C0448a> implements b {
                /* synthetic */ C0448a(a aVar) {
                    this();
                }

                public C0448a A5(b value) {
                    V3();
                    ((a) this.f50422b).Q8(value);
                    return this;
                }

                public C0448a B5(String value) {
                    V3();
                    ((a) this.f50422b).R8(value);
                    return this;
                }

                public C0448a D5(androidx.datastore.preferences.protobuf.u value) {
                    V3();
                    ((a) this.f50422b).S8(value);
                    return this;
                }

                @Override // androidx.datastore.preferences.protobuf.e0.c0.b
                public int F0() {
                    return ((a) this.f50422b).F0();
                }

                public C0448a L4(Iterable<? extends Integer> values) {
                    V3();
                    ((a) this.f50422b).p8(values);
                    return this;
                }

                public C0448a P4(int value) {
                    V3();
                    ((a) this.f50422b).q8(value);
                    return this;
                }

                public C0448a Q4() {
                    V3();
                    ((a) this.f50422b).r8();
                    return this;
                }

                public C0448a U4() {
                    V3();
                    ((a) this.f50422b).s8();
                    return this;
                }

                @Override // androidx.datastore.preferences.protobuf.e0.c0.b
                public String X6() {
                    return ((a) this.f50422b).X6();
                }

                public C0448a Z4() {
                    V3();
                    ((a) this.f50422b).t8();
                    return this;
                }

                public C0448a a5() {
                    V3();
                    ((a) this.f50422b).u8();
                    return this;
                }

                public C0448a b5() {
                    V3();
                    ((a) this.f50422b).v8();
                    return this;
                }

                @Override // androidx.datastore.preferences.protobuf.e0.c0.b
                public boolean c7() {
                    return ((a) this.f50422b).c7();
                }

                public C0448a d5(int value) {
                    V3();
                    ((a) this.f50422b).N8(value);
                    return this;
                }

                @Override // androidx.datastore.preferences.protobuf.e0.c0.b
                public int f0(int index) {
                    return ((a) this.f50422b).f0(index);
                }

                @Override // androidx.datastore.preferences.protobuf.e0.c0.b
                public androidx.datastore.preferences.protobuf.u k7() {
                    return ((a) this.f50422b).k7();
                }

                @Override // androidx.datastore.preferences.protobuf.e0.c0.b
                public List<Integer> n0() {
                    return Collections.unmodifiableList(((a) this.f50422b).n0());
                }

                public C0448a r5(int value) {
                    V3();
                    ((a) this.f50422b).O8(value);
                    return this;
                }

                @Override // androidx.datastore.preferences.protobuf.e0.c0.b
                public b r7() {
                    return ((a) this.f50422b).r7();
                }

                @Override // androidx.datastore.preferences.protobuf.e0.c0.b
                public int v() {
                    return ((a) this.f50422b).v();
                }

                @Override // androidx.datastore.preferences.protobuf.e0.c0.b
                public boolean v7() {
                    return ((a) this.f50422b).v7();
                }

                @Override // androidx.datastore.preferences.protobuf.e0.c0.b
                public boolean x() {
                    return ((a) this.f50422b).x();
                }

                @Override // androidx.datastore.preferences.protobuf.e0.c0.b
                public boolean y2() {
                    return ((a) this.f50422b).y2();
                }

                public C0448a y5(int index, int value) {
                    V3();
                    ((a) this.f50422b).P8(index, value);
                    return this;
                }

                @Override // androidx.datastore.preferences.protobuf.e0.c0.b
                public int z3() {
                    return ((a) this.f50422b).z3();
                }

                private C0448a() {
                    super(a.DEFAULT_INSTANCE);
                }
            }

            public enum b implements s1.c {
                NONE(0),
                SET(1),
                ALIAS(2);


                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public static final int f50082e = 0;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public static final int f50083f = 1;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public static final int f50084g = 2;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private static final s1.d<b> f50085h = new C0449a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final int f50087a;

                /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.e0$c0$a$b$a, reason: collision with other inner class name */
                class C0449a implements s1.d<b> {
                    C0449a() {
                    }

                    @Override // androidx.datastore.preferences.protobuf.s1.d
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public b a(int number) {
                        return b.b(number);
                    }
                }

                /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.e0$c0$a$b$b, reason: collision with other inner class name */
                private static final class C0450b implements s1.e {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    static final s1.e f50088a = new C0450b();

                    private C0450b() {
                    }

                    @Override // androidx.datastore.preferences.protobuf.s1.e
                    public boolean a(int number) {
                        return b.b(number) != null;
                    }
                }

                b(int value) {
                    this.f50087a = value;
                }

                public static b b(int value) {
                    if (value == 0) {
                        return NONE;
                    }
                    if (value == 1) {
                        return SET;
                    }
                    if (value != 2) {
                        return null;
                    }
                    return ALIAS;
                }

                public static s1.d<b> k() {
                    return f50085h;
                }

                public static s1.e l() {
                    return C0450b.f50088a;
                }

                @Deprecated
                public static b n(int value) {
                    return b(value);
                }

                @Override // androidx.datastore.preferences.protobuf.s1.c
                public final int i() {
                    return this.f50087a;
                }
            }

            static {
                a aVar = new a();
                DEFAULT_INSTANCE = aVar;
                l1.Y6(a.class, aVar);
            }

            private a() {
            }

            public static a A8(InputStream input) throws IOException {
                return (a) l1.J5(DEFAULT_INSTANCE, input);
            }

            public static a B8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
                return (a) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static a C8(androidx.datastore.preferences.protobuf.u data) throws t1 {
                return (a) l1.R5(DEFAULT_INSTANCE, data);
            }

            public static a D8(androidx.datastore.preferences.protobuf.u data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
                return (a) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static a E8(androidx.datastore.preferences.protobuf.z input) throws IOException {
                return (a) l1.a6(DEFAULT_INSTANCE, input);
            }

            public static a F8(androidx.datastore.preferences.protobuf.z input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
                return (a) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static a G8(InputStream input) throws IOException {
                return (a) l1.d6(DEFAULT_INSTANCE, input);
            }

            public static a H8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
                return (a) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static a I8(ByteBuffer data) throws t1 {
                return (a) l1.i6(DEFAULT_INSTANCE, data);
            }

            public static a J8(ByteBuffer data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
                return (a) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static a K8(byte[] data) throws t1 {
                return (a) l1.p6(DEFAULT_INSTANCE, data);
            }

            public static a L8(byte[] data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
                return (a) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static h3<a> M8() {
                return DEFAULT_INSTANCE.W7();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void N8(int value) {
                this.bitField0_ |= 2;
                this.begin_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void O8(int value) {
                this.bitField0_ |= 4;
                this.end_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void P8(int index, int value) {
                w8();
                this.path_.X(index, value);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void Q8(b value) {
                this.semantic_ = value.i();
                this.bitField0_ |= 8;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void R8(String value) {
                value.getClass();
                this.bitField0_ |= 1;
                this.sourceFile_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void S8(androidx.datastore.preferences.protobuf.u value) {
                this.sourceFile_ = value.A0();
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void p8(Iterable<? extends Integer> values) {
                w8();
                androidx.datastore.preferences.protobuf.a.m(values, this.path_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void q8(int value) {
                w8();
                this.path_.w1(value);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void r8() {
                this.bitField0_ &= -3;
                this.begin_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void s8() {
                this.bitField0_ &= -5;
                this.end_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void t8() {
                this.path_ = l1.N3();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void u8() {
                this.bitField0_ &= -9;
                this.semantic_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void v8() {
                this.bitField0_ &= -2;
                this.sourceFile_ = x8().X6();
            }

            private void w8() {
                s1.g gVar = this.path_;
                if (gVar.s1()) {
                    return;
                }
                this.path_ = l1.b5(gVar);
            }

            public static a x8() {
                return DEFAULT_INSTANCE;
            }

            public static C0448a y8() {
                return DEFAULT_INSTANCE.s3();
            }

            public static C0448a z8(a prototype) {
                return DEFAULT_INSTANCE.v3(prototype);
            }

            @Override // androidx.datastore.preferences.protobuf.l1
            protected final Object D3(l1.i method, Object arg0, Object arg1) {
                h3 cVar;
                int i10 = a.f50068a[method.ordinal()];
                a aVar = null;
                switch (i10) {
                    case 1:
                        return new a();
                    case 2:
                        return new C0448a(aVar);
                    case 3:
                        return l1.A5(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001'\u0002ဈ\u0000\u0003င\u0001\u0004င\u0002\u0005᠌\u0003", new Object[]{"bitField0_", "path_", "sourceFile_", "begin_", "end_", "semantic_", b.l()});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        h3<a> h3Var = PARSER;
                        if (h3Var != null) {
                            return h3Var;
                        }
                        synchronized (a.class) {
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

            @Override // androidx.datastore.preferences.protobuf.e0.c0.b
            public int F0() {
                return this.path_.size();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.c0.b
            public String X6() {
                return this.sourceFile_;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.c0.b
            public boolean c7() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.c0.b
            public int f0(int index) {
                return this.path_.getInt(index);
            }

            @Override // androidx.datastore.preferences.protobuf.e0.c0.b
            public androidx.datastore.preferences.protobuf.u k7() {
                return androidx.datastore.preferences.protobuf.u.C(this.sourceFile_);
            }

            @Override // androidx.datastore.preferences.protobuf.e0.c0.b
            public List<Integer> n0() {
                return this.path_;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.c0.b
            public b r7() {
                b bVarB = b.b(this.semantic_);
                return bVarB == null ? b.NONE : bVarB;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.c0.b
            public int v() {
                return this.end_;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.c0.b
            public boolean v7() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.c0.b
            public boolean x() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.c0.b
            public boolean y2() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.c0.b
            public int z3() {
                return this.begin_;
            }
        }

        public interface b extends r2 {
            int F0();

            String X6();

            boolean c7();

            int f0(int index);

            androidx.datastore.preferences.protobuf.u k7();

            List<Integer> n0();

            a.b r7();

            int v();

            boolean v7();

            boolean x();

            boolean y2();

            int z3();
        }

        public static final class c extends l1.b<c0, c> implements d0 {
            /* synthetic */ c(a aVar) {
                this();
            }

            public c L4(Iterable<? extends a> values) {
                V3();
                ((c0) this.f50422b).h8(values);
                return this;
            }

            public c P4(int index, a.C0448a builderForValue) {
                V3();
                ((c0) this.f50422b).j8(index, builderForValue.build());
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.d0
            public List<a> Q2() {
                return Collections.unmodifiableList(((c0) this.f50422b).Q2());
            }

            public c Q4(int index, a value) {
                V3();
                ((c0) this.f50422b).j8(index, value);
                return this;
            }

            public c U4(a.C0448a builderForValue) {
                V3();
                ((c0) this.f50422b).k8(builderForValue.build());
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.d0
            public a Z3(int index) {
                return ((c0) this.f50422b).Z3(index);
            }

            public c Z4(a value) {
                V3();
                ((c0) this.f50422b).k8(value);
                return this;
            }

            public c a5() {
                V3();
                ((c0) this.f50422b).l8();
                return this;
            }

            public c b5(int index) {
                V3();
                ((c0) this.f50422b).F8(index);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.d0
            public int c5() {
                return ((c0) this.f50422b).c5();
            }

            public c d5(int index, a.C0448a builderForValue) {
                V3();
                ((c0) this.f50422b).G8(index, builderForValue.build());
                return this;
            }

            public c r5(int index, a value) {
                V3();
                ((c0) this.f50422b).G8(index, value);
                return this;
            }

            private c() {
                super(c0.DEFAULT_INSTANCE);
            }
        }

        static {
            c0 c0Var = new c0();
            DEFAULT_INSTANCE = c0Var;
            l1.Y6(c0.class, c0Var);
        }

        private c0() {
        }

        public static c0 A8(ByteBuffer data) throws t1 {
            return (c0) l1.i6(DEFAULT_INSTANCE, data);
        }

        public static c0 B8(ByteBuffer data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (c0) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static c0 C8(byte[] data) throws t1 {
            return (c0) l1.p6(DEFAULT_INSTANCE, data);
        }

        public static c0 D8(byte[] data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (c0) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static h3<c0> E8() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void F8(int index) {
            m8();
            this.annotation_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void G8(int index, a value) {
            value.getClass();
            m8();
            this.annotation_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h8(Iterable<? extends a> values) {
            m8();
            androidx.datastore.preferences.protobuf.a.m(values, this.annotation_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j8(int index, a value) {
            value.getClass();
            m8();
            this.annotation_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k8(a value) {
            value.getClass();
            m8();
            this.annotation_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l8() {
            this.annotation_ = l1.T3();
        }

        private void m8() {
            s1.l<a> lVar = this.annotation_;
            if (lVar.s1()) {
                return;
            }
            this.annotation_ = l1.r5(lVar);
        }

        public static c0 p8() {
            return DEFAULT_INSTANCE;
        }

        public static c q8() {
            return DEFAULT_INSTANCE.s3();
        }

        public static c r8(c0 prototype) {
            return DEFAULT_INSTANCE.v3(prototype);
        }

        public static c0 s8(InputStream input) throws IOException {
            return (c0) l1.J5(DEFAULT_INSTANCE, input);
        }

        public static c0 t8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (c0) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static c0 u8(androidx.datastore.preferences.protobuf.u data) throws t1 {
            return (c0) l1.R5(DEFAULT_INSTANCE, data);
        }

        public static c0 v8(androidx.datastore.preferences.protobuf.u data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (c0) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static c0 w8(androidx.datastore.preferences.protobuf.z input) throws IOException {
            return (c0) l1.a6(DEFAULT_INSTANCE, input);
        }

        public static c0 x8(androidx.datastore.preferences.protobuf.z input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (c0) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static c0 y8(InputStream input) throws IOException {
            return (c0) l1.d6(DEFAULT_INSTANCE, input);
        }

        public static c0 z8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (c0) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        @Override // androidx.datastore.preferences.protobuf.l1
        protected final Object D3(l1.i method, Object arg0, Object arg1) {
            h3 cVar;
            int i10 = a.f50068a[method.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new c0();
                case 2:
                    return new c(aVar);
                case 3:
                    return l1.A5(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"annotation_", a.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    h3<c0> h3Var = PARSER;
                    if (h3Var != null) {
                        return h3Var;
                    }
                    synchronized (c0.class) {
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

        @Override // androidx.datastore.preferences.protobuf.e0.d0
        public List<a> Q2() {
            return this.annotation_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.d0
        public a Z3(int index) {
            return this.annotation_.get(index);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.d0
        public int c5() {
            return this.annotation_.size();
        }

        public b n8(int index) {
            return this.annotation_.get(index);
        }

        public List<? extends b> o8() {
            return this.annotation_;
        }
    }

    public enum d implements s1.c {
        EDITION_UNKNOWN(0),
        EDITION_LEGACY(900),
        EDITION_PROTO2(f50107s),
        EDITION_PROTO3(999),
        EDITION_2023(1000),
        EDITION_2024(1001),
        EDITION_1_TEST_ONLY(1),
        EDITION_2_TEST_ONLY(2),
        EDITION_99997_TEST_ONLY(Z),
        EDITION_99998_TEST_ONLY(f50104p0),
        EDITION_99999_TEST_ONLY(f50105p1),
        EDITION_MAX(Integer.MAX_VALUE);

        public static final int H1 = Integer.MAX_VALUE;
        public static final int X = 1;
        public static final int Y = 2;
        public static final int Z = 99997;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f50102n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f50103o = 900;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final int f50104p0 = 99998;

        /* JADX INFO: renamed from: p1, reason: collision with root package name */
        public static final int f50105p1 = 99999;

        /* JADX INFO: renamed from: p2, reason: collision with root package name */
        private static final s1.d<d> f50106p2 = new a();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f50107s = 998;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f50108t = 999;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f50109v = 1000;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f50110w = 1001;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f50111a;

        class a implements s1.d<d> {
            a() {
            }

            @Override // androidx.datastore.preferences.protobuf.s1.d
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d a(int number) {
                return d.b(number);
            }
        }

        private static final class b implements s1.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final s1.e f50112a = new b();

            private b() {
            }

            @Override // androidx.datastore.preferences.protobuf.s1.e
            public boolean a(int number) {
                return d.b(number) != null;
            }
        }

        d(int value) {
            this.f50111a = value;
        }

        public static d b(int value) {
            if (value == 0) {
                return EDITION_UNKNOWN;
            }
            if (value == 1) {
                return EDITION_1_TEST_ONLY;
            }
            if (value == 2) {
                return EDITION_2_TEST_ONLY;
            }
            if (value == 900) {
                return EDITION_LEGACY;
            }
            if (value == Integer.MAX_VALUE) {
                return EDITION_MAX;
            }
            switch (value) {
                case f50107s:
                    return EDITION_PROTO2;
                case 999:
                    return EDITION_PROTO3;
                case 1000:
                    return EDITION_2023;
                case 1001:
                    return EDITION_2024;
                default:
                    switch (value) {
                        case Z:
                            return EDITION_99997_TEST_ONLY;
                        case f50104p0:
                            return EDITION_99998_TEST_ONLY;
                        case f50105p1:
                            return EDITION_99999_TEST_ONLY;
                        default:
                            return null;
                    }
            }
        }

        public static s1.d<d> k() {
            return f50106p2;
        }

        public static s1.e l() {
            return b.f50112a;
        }

        @Deprecated
        public static d n(int value) {
            return b(value);
        }

        @Override // androidx.datastore.preferences.protobuf.s1.c
        public final int i() {
            return this.f50111a;
        }
    }

    public interface d0 extends r2 {
        List<c0.a> Q2();

        c0.a Z3(int index);

        int c5();
    }

    public static final class e extends l1<e, a> implements f {
        private static final e DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static volatile h3<e> PARSER = null;
        public static final int RESERVED_NAME_FIELD_NUMBER = 5;
        public static final int RESERVED_RANGE_FIELD_NUMBER = 4;
        public static final int VALUE_FIELD_NUMBER = 2;
        private int bitField0_;
        private g options_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private s1.l<i> value_ = l1.T3();
        private s1.l<b> reservedRange_ = l1.T3();
        private s1.l<String> reservedName_ = l1.T3();

        public static final class a extends l1.b<e, a> implements f {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.f
            public b A0(int index) {
                return ((e) this.f50422b).A0(index);
            }

            public a A5(int index, i value) {
                V3();
                ((e) this.f50422b).G8(index, value);
                return this;
            }

            public a A6(int index, b value) {
                V3();
                ((e) this.f50422b).r9(index, value);
                return this;
            }

            public a B5(i.a builderForValue) {
                V3();
                ((e) this.f50422b).H8(builderForValue.build());
                return this;
            }

            public a D5(i value) {
                V3();
                ((e) this.f50422b).H8(value);
                return this;
            }

            public a E6(int index, i.a builderForValue) {
                V3();
                ((e) this.f50422b).s9(index, builderForValue.build());
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.f
            public List<String> I0() {
                return Collections.unmodifiableList(((e) this.f50422b).I0());
            }

            public a I5() {
                V3();
                ((e) this.f50422b).I8();
                return this;
            }

            public a J5() {
                V3();
                ((e) this.f50422b).J8();
                return this;
            }

            public a L4(Iterable<String> values) {
                V3();
                ((e) this.f50422b).z8(values);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.f
            public List<b> N0() {
                return Collections.unmodifiableList(((e) this.f50422b).N0());
            }

            @Override // androidx.datastore.preferences.protobuf.e0.f
            public int O0() {
                return ((e) this.f50422b).O0();
            }

            public a P4(Iterable<? extends b> values) {
                V3();
                ((e) this.f50422b).A8(values);
                return this;
            }

            public a Q4(Iterable<? extends i> values) {
                V3();
                ((e) this.f50422b).B8(values);
                return this;
            }

            public a R5() {
                V3();
                ((e) this.f50422b).K8();
                return this;
            }

            public a R6(int index, i value) {
                V3();
                ((e) this.f50422b).s9(index, value);
                return this;
            }

            public a U4(String value) {
                V3();
                ((e) this.f50422b).C8(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.f
            public int Y5() {
                return ((e) this.f50422b).Y5();
            }

            public a Z4(androidx.datastore.preferences.protobuf.u value) {
                V3();
                ((e) this.f50422b).D8(value);
                return this;
            }

            public a Z5() {
                V3();
                ((e) this.f50422b).L8();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.f
            public androidx.datastore.preferences.protobuf.u a() {
                return ((e) this.f50422b).a();
            }

            public a a5(int index, b.a builderForValue) {
                V3();
                ((e) this.f50422b).E8(index, builderForValue.build());
                return this;
            }

            public a a6() {
                V3();
                ((e) this.f50422b).M8();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.f
            public g b() {
                return ((e) this.f50422b).b();
            }

            public a b5(int index, b value) {
                V3();
                ((e) this.f50422b).E8(index, value);
                return this;
            }

            public a c6(g value) {
                V3();
                ((e) this.f50422b).V8(value);
                return this;
            }

            public a d5(b.a builderForValue) {
                V3();
                ((e) this.f50422b).F8(builderForValue.build());
                return this;
            }

            public a d6(int index) {
                V3();
                ((e) this.f50422b).l9(index);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.f
            public androidx.datastore.preferences.protobuf.u e0(int index) {
                return ((e) this.f50422b).e0(index);
            }

            public a e6(int index) {
                V3();
                ((e) this.f50422b).m9(index);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.f
            public boolean g() {
                return ((e) this.f50422b).g();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.f
            public String getName() {
                return ((e) this.f50422b).getName();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.f
            public i getValue(int index) {
                return ((e) this.f50422b).getValue(index);
            }

            @Override // androidx.datastore.preferences.protobuf.e0.f
            public boolean h() {
                return ((e) this.f50422b).h();
            }

            public a i6(String value) {
                V3();
                ((e) this.f50422b).n9(value);
                return this;
            }

            public a o6(androidx.datastore.preferences.protobuf.u value) {
                V3();
                ((e) this.f50422b).o9(value);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a p6(g.a builderForValue) {
                V3();
                ((e) this.f50422b).p9((g) builderForValue.build());
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.f
            public String q0(int index) {
                return ((e) this.f50422b).q0(index);
            }

            @Override // androidx.datastore.preferences.protobuf.e0.f
            public List<i> q7() {
                return Collections.unmodifiableList(((e) this.f50422b).q7());
            }

            public a r5(b value) {
                V3();
                ((e) this.f50422b).F8(value);
                return this;
            }

            public a r6(g value) {
                V3();
                ((e) this.f50422b).p9(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.f
            public int t0() {
                return ((e) this.f50422b).t0();
            }

            public a t6(int index, String value) {
                V3();
                ((e) this.f50422b).q9(index, value);
                return this;
            }

            public a w6(int index, b.a builderForValue) {
                V3();
                ((e) this.f50422b).r9(index, builderForValue.build());
                return this;
            }

            public a y5(int index, i.a builderForValue) {
                V3();
                ((e) this.f50422b).G8(index, builderForValue.build());
                return this;
            }

            private a() {
                super(e.DEFAULT_INSTANCE);
            }
        }

        public static final class b extends l1<b, a> implements c {
            private static final b DEFAULT_INSTANCE;
            public static final int END_FIELD_NUMBER = 2;
            private static volatile h3<b> PARSER = null;
            public static final int START_FIELD_NUMBER = 1;
            private int bitField0_;
            private int end_;
            private int start_;

            public static final class a extends l1.b<b, a> implements c {
                /* synthetic */ a(a aVar) {
                    this();
                }

                @Override // androidx.datastore.preferences.protobuf.e0.e.c
                public boolean L() {
                    return ((b) this.f50422b).L();
                }

                public a L4() {
                    V3();
                    ((b) this.f50422b).f8();
                    return this;
                }

                public a P4() {
                    V3();
                    ((b) this.f50422b).g8();
                    return this;
                }

                public a Q4(int value) {
                    V3();
                    ((b) this.f50422b).y8(value);
                    return this;
                }

                public a U4(int value) {
                    V3();
                    ((b) this.f50422b).z8(value);
                    return this;
                }

                @Override // androidx.datastore.preferences.protobuf.e0.e.c
                public int u() {
                    return ((b) this.f50422b).u();
                }

                @Override // androidx.datastore.preferences.protobuf.e0.e.c
                public int v() {
                    return ((b) this.f50422b).v();
                }

                @Override // androidx.datastore.preferences.protobuf.e0.e.c
                public boolean x() {
                    return ((b) this.f50422b).x();
                }

                private a() {
                    super(b.DEFAULT_INSTANCE);
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
                this.bitField0_ &= -3;
                this.end_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void g8() {
                this.bitField0_ &= -2;
                this.start_ = 0;
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

            public static b m8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
                return (b) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static b n8(androidx.datastore.preferences.protobuf.u data) throws t1 {
                return (b) l1.R5(DEFAULT_INSTANCE, data);
            }

            public static b o8(androidx.datastore.preferences.protobuf.u data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
                return (b) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static b p8(androidx.datastore.preferences.protobuf.z input) throws IOException {
                return (b) l1.a6(DEFAULT_INSTANCE, input);
            }

            public static b q8(androidx.datastore.preferences.protobuf.z input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
                return (b) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static b r8(InputStream input) throws IOException {
                return (b) l1.d6(DEFAULT_INSTANCE, input);
            }

            public static b s8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
                return (b) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static b t8(ByteBuffer data) throws t1 {
                return (b) l1.i6(DEFAULT_INSTANCE, data);
            }

            public static b u8(ByteBuffer data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
                return (b) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static b v8(byte[] data) throws t1 {
                return (b) l1.p6(DEFAULT_INSTANCE, data);
            }

            public static b w8(byte[] data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
                return (b) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static h3<b> x8() {
                return DEFAULT_INSTANCE.W7();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void y8(int value) {
                this.bitField0_ |= 2;
                this.end_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void z8(int value) {
                this.bitField0_ |= 1;
                this.start_ = value;
            }

            @Override // androidx.datastore.preferences.protobuf.l1
            protected final Object D3(l1.i method, Object arg0, Object arg1) {
                h3 cVar;
                int i10 = a.f50068a[method.ordinal()];
                a aVar = null;
                switch (i10) {
                    case 1:
                        return new b();
                    case 2:
                        return new a(aVar);
                    case 3:
                        return l1.A5(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "start_", "end_"});
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

            @Override // androidx.datastore.preferences.protobuf.e0.e.c
            public boolean L() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.e.c
            public int u() {
                return this.start_;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.e.c
            public int v() {
                return this.end_;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.e.c
            public boolean x() {
                if ((this.bitField0_ & 2) == 0) {
                    return false;
                }
                int i10 = 5 & 1;
                return true;
            }
        }

        public interface c extends r2 {
            boolean L();

            int u();

            int v();

            boolean x();
        }

        static {
            e eVar = new e();
            DEFAULT_INSTANCE = eVar;
            l1.Y6(e.class, eVar);
        }

        private e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void A8(Iterable<? extends b> values) {
            O8();
            androidx.datastore.preferences.protobuf.a.m(values, this.reservedRange_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void B8(Iterable<? extends i> values) {
            P8();
            androidx.datastore.preferences.protobuf.a.m(values, this.value_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C8(String value) {
            value.getClass();
            N8();
            this.reservedName_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void D8(androidx.datastore.preferences.protobuf.u value) {
            N8();
            this.reservedName_.add(value.A0());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void E8(int index, b value) {
            value.getClass();
            O8();
            this.reservedRange_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void F8(b value) {
            value.getClass();
            O8();
            this.reservedRange_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void G8(int index, i value) {
            value.getClass();
            P8();
            this.value_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void H8(i value) {
            value.getClass();
            P8();
            this.value_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void I8() {
            this.bitField0_ &= -2;
            this.name_ = Q8().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void J8() {
            this.options_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void K8() {
            this.reservedName_ = l1.T3();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void L8() {
            this.reservedRange_ = l1.T3();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void M8() {
            this.value_ = l1.T3();
        }

        private void N8() {
            s1.l<String> lVar = this.reservedName_;
            if (!lVar.s1()) {
                this.reservedName_ = l1.r5(lVar);
            }
        }

        private void O8() {
            s1.l<b> lVar = this.reservedRange_;
            if (!lVar.s1()) {
                this.reservedRange_ = l1.r5(lVar);
            }
        }

        private void P8() {
            s1.l<i> lVar = this.value_;
            if (lVar.s1()) {
                return;
            }
            this.value_ = l1.r5(lVar);
        }

        public static e Q8() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void V8(g value) {
            value.getClass();
            g gVar = this.options_;
            if (gVar == null || gVar == g.O8()) {
                this.options_ = value;
            } else {
                this.options_ = ((g.a) g.T8(this.options_).u4(value)).B1();
            }
            this.bitField0_ |= 2;
        }

        public static a W8() {
            return DEFAULT_INSTANCE.s3();
        }

        public static a X8(e prototype) {
            return DEFAULT_INSTANCE.v3(prototype);
        }

        public static e Y8(InputStream input) throws IOException {
            return (e) l1.J5(DEFAULT_INSTANCE, input);
        }

        public static e Z8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (e) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static e a9(androidx.datastore.preferences.protobuf.u data) throws t1 {
            return (e) l1.R5(DEFAULT_INSTANCE, data);
        }

        public static e b9(androidx.datastore.preferences.protobuf.u data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (e) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static e c9(androidx.datastore.preferences.protobuf.z input) throws IOException {
            return (e) l1.a6(DEFAULT_INSTANCE, input);
        }

        public static e d9(androidx.datastore.preferences.protobuf.z input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (e) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static e e9(InputStream input) throws IOException {
            return (e) l1.d6(DEFAULT_INSTANCE, input);
        }

        public static e f9(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (e) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static e g9(ByteBuffer data) throws t1 {
            return (e) l1.i6(DEFAULT_INSTANCE, data);
        }

        public static e h9(ByteBuffer data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (e) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static e i9(byte[] data) throws t1 {
            return (e) l1.p6(DEFAULT_INSTANCE, data);
        }

        public static e j9(byte[] data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (e) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static h3<e> k9() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l9(int index) {
            O8();
            this.reservedRange_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m9(int index) {
            P8();
            this.value_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n9(String value) {
            value.getClass();
            this.bitField0_ |= 1;
            this.name_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o9(androidx.datastore.preferences.protobuf.u value) {
            this.name_ = value.A0();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p9(g value) {
            value.getClass();
            this.options_ = value;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q9(int index, String value) {
            value.getClass();
            N8();
            this.reservedName_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void r9(int index, b value) {
            value.getClass();
            O8();
            this.reservedRange_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s9(int index, i value) {
            value.getClass();
            P8();
            this.value_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void z8(Iterable<String> values) {
            N8();
            androidx.datastore.preferences.protobuf.a.m(values, this.reservedName_);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.f
        public b A0(int index) {
            return this.reservedRange_.get(index);
        }

        @Override // androidx.datastore.preferences.protobuf.l1
        protected final Object D3(l1.i method, Object arg0, Object arg1) {
            h3 cVar;
            a aVar = null;
            switch (a.f50068a[method.ordinal()]) {
                case 1:
                    return new e();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.A5(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0002\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001\u0004\u001b\u0005\u001a", new Object[]{"bitField0_", "name_", "value_", i.class, "options_", "reservedRange_", b.class, "reservedName_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    h3<e> h3Var = PARSER;
                    if (h3Var != null) {
                        return h3Var;
                    }
                    synchronized (e.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.e0.f
        public List<String> I0() {
            return this.reservedName_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.f
        public List<b> N0() {
            return this.reservedRange_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.f
        public int O0() {
            return this.reservedName_.size();
        }

        public c R8(int index) {
            return this.reservedRange_.get(index);
        }

        public List<? extends c> S8() {
            return this.reservedRange_;
        }

        public j T8(int index) {
            return this.value_.get(index);
        }

        public List<? extends j> U8() {
            return this.value_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.f
        public int Y5() {
            return this.value_.size();
        }

        @Override // androidx.datastore.preferences.protobuf.e0.f
        public androidx.datastore.preferences.protobuf.u a() {
            return androidx.datastore.preferences.protobuf.u.C(this.name_);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.f
        public g b() {
            g gVarO8 = this.options_;
            if (gVarO8 == null) {
                gVarO8 = g.O8();
            }
            return gVarO8;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.f
        public androidx.datastore.preferences.protobuf.u e0(int index) {
            return androidx.datastore.preferences.protobuf.u.C(this.reservedName_.get(index));
        }

        @Override // androidx.datastore.preferences.protobuf.e0.f
        public boolean g() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.f
        public String getName() {
            return this.name_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.f
        public i getValue(int index) {
            return this.value_.get(index);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.f
        public boolean h() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.f
        public String q0(int index) {
            return this.reservedName_.get(index);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.f
        public List<i> q7() {
            return this.value_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.f
        public int t0() {
            return this.reservedRange_.size();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.e0$e0, reason: collision with other inner class name */
    public static final class C0451e0 extends l1.e<C0451e0, a> implements f0 {
        private static final C0451e0 DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        public static final int DEPRECATED_LEGACY_JSON_FIELD_CONFLICTS_FIELD_NUMBER = 11;
        public static final int FEATURES_FIELD_NUMBER = 12;
        public static final int MAP_ENTRY_FIELD_NUMBER = 7;
        public static final int MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER = 1;
        public static final int NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER = 2;
        private static volatile h3<C0451e0> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean deprecatedLegacyJsonFieldConflicts_;
        private boolean deprecated_;
        private o features_;
        private boolean mapEntry_;
        private boolean messageSetWireFormat_;
        private boolean noStandardDescriptorAccessor_;
        private byte memoizedIsInitialized = 2;
        private s1.l<u0> uninterpretedOption_ = l1.T3();

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.e0$e0$a */
        public static final class a extends l1.d<C0451e0, a> implements f0 {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a A5(int index, u0 value) {
                V3();
                ((C0451e0) this.f50422b).K8(index, value);
                return this;
            }

            public a A6(boolean value) {
                V3();
                ((C0451e0) this.f50422b).s9(value);
                return this;
            }

            public a B5(u0.a builderForValue) {
                V3();
                ((C0451e0) this.f50422b).L8(builderForValue.build());
                return this;
            }

            public a D5(u0 value) {
                V3();
                ((C0451e0) this.f50422b).L8(value);
                return this;
            }

            public a E6(boolean value) {
                V3();
                ((C0451e0) this.f50422b).t9(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.f0
            @Deprecated
            public boolean G() {
                return ((C0451e0) this.f50422b).G();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.f0
            public boolean G4() {
                return ((C0451e0) this.f50422b).G4();
            }

            public a I5() {
                V3();
                ((C0451e0) this.f50422b).M8();
                return this;
            }

            @Deprecated
            public a J5() {
                V3();
                ((C0451e0) this.f50422b).N8();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.f0
            @Deprecated
            public boolean K6() {
                return ((C0451e0) this.f50422b).K6();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.f0
            public boolean P7() {
                return ((C0451e0) this.f50422b).P7();
            }

            public a R5() {
                V3();
                ((C0451e0) this.f50422b).O8();
                return this;
            }

            public a R6(int index, u0.a builderForValue) {
                V3();
                ((C0451e0) this.f50422b).u9(index, builderForValue.build());
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.f0
            public boolean T4() {
                return ((C0451e0) this.f50422b).T4();
            }

            public a U6(int index, u0 value) {
                V3();
                ((C0451e0) this.f50422b).u9(index, value);
                return this;
            }

            public a Z5() {
                V3();
                ((C0451e0) this.f50422b).P8();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.f0
            public boolean Z7() {
                return ((C0451e0) this.f50422b).Z7();
            }

            public a a6() {
                V3();
                ((C0451e0) this.f50422b).Q8();
                return this;
            }

            public a c6() {
                V3();
                ((C0451e0) this.f50422b).R8();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.f0
            public List<u0> d() {
                return Collections.unmodifiableList(((C0451e0) this.f50422b).d());
            }

            public a d6() {
                V3();
                ((C0451e0) this.f50422b).S8();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.f0
            public u0 e(int index) {
                return ((C0451e0) this.f50422b).e(index);
            }

            public a e6(o value) {
                V3();
                ((C0451e0) this.f50422b).X8(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.f0
            public int f() {
                return ((C0451e0) this.f50422b).f();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.f0
            public boolean g5() {
                return ((C0451e0) this.f50422b).g5();
            }

            public a i6(int index) {
                V3();
                ((C0451e0) this.f50422b).n9(index);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.f0
            public boolean j() {
                return ((C0451e0) this.f50422b).j();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.f0
            public boolean l() {
                return ((C0451e0) this.f50422b).l();
            }

            public a o6(boolean value) {
                V3();
                ((C0451e0) this.f50422b).o9(value);
                return this;
            }

            @Deprecated
            public a p6(boolean value) {
                V3();
                ((C0451e0) this.f50422b).p9(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.f0
            public boolean r() {
                return ((C0451e0) this.f50422b).r();
            }

            public a r5(Iterable<? extends u0> values) {
                V3();
                ((C0451e0) this.f50422b).J8(values);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a r6(o.a builderForValue) {
                V3();
                ((C0451e0) this.f50422b).q9((o) builderForValue.build());
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.f0
            public o t() {
                return ((C0451e0) this.f50422b).t();
            }

            public a t6(o value) {
                V3();
                ((C0451e0) this.f50422b).q9(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.f0
            public boolean v4() {
                return ((C0451e0) this.f50422b).v4();
            }

            public a w6(boolean value) {
                V3();
                ((C0451e0) this.f50422b).r9(value);
                return this;
            }

            public a y5(int index, u0.a builderForValue) {
                V3();
                ((C0451e0) this.f50422b).K8(index, builderForValue.build());
                return this;
            }

            private a() {
                super(C0451e0.DEFAULT_INSTANCE);
            }
        }

        static {
            C0451e0 c0451e0 = new C0451e0();
            DEFAULT_INSTANCE = c0451e0;
            l1.Y6(C0451e0.class, c0451e0);
        }

        private C0451e0() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void J8(Iterable<? extends u0> values) {
            T8();
            androidx.datastore.preferences.protobuf.a.m(values, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void K8(int index, u0 value) {
            value.getClass();
            T8();
            this.uninterpretedOption_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void L8(u0 value) {
            value.getClass();
            T8();
            this.uninterpretedOption_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void M8() {
            this.bitField0_ &= -5;
            this.deprecated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void N8() {
            this.bitField0_ &= -17;
            int i10 = 3 << 0;
            this.deprecatedLegacyJsonFieldConflicts_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void O8() {
            this.features_ = null;
            this.bitField0_ &= -33;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void P8() {
            this.bitField0_ &= -9;
            this.mapEntry_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Q8() {
            this.bitField0_ &= -2;
            this.messageSetWireFormat_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void R8() {
            this.bitField0_ &= -3;
            this.noStandardDescriptorAccessor_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void S8() {
            this.uninterpretedOption_ = l1.T3();
        }

        private void T8() {
            s1.l<u0> lVar = this.uninterpretedOption_;
            if (lVar.s1()) {
                return;
            }
            this.uninterpretedOption_ = l1.r5(lVar);
        }

        public static C0451e0 U8() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void X8(o value) {
            value.getClass();
            o oVar = this.features_;
            if (oVar == null || oVar == o.I8()) {
                this.features_ = value;
            } else {
                this.features_ = ((o.a) o.K8(this.features_).u4(value)).B1();
            }
            this.bitField0_ |= 32;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a Y8() {
            return (a) DEFAULT_INSTANCE.s3();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a Z8(C0451e0 prototype) {
            return (a) DEFAULT_INSTANCE.v3(prototype);
        }

        public static C0451e0 a9(InputStream input) throws IOException {
            return (C0451e0) l1.J5(DEFAULT_INSTANCE, input);
        }

        public static C0451e0 b9(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (C0451e0) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C0451e0 c9(androidx.datastore.preferences.protobuf.u data) throws t1 {
            return (C0451e0) l1.R5(DEFAULT_INSTANCE, data);
        }

        public static C0451e0 d9(androidx.datastore.preferences.protobuf.u data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (C0451e0) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C0451e0 e9(androidx.datastore.preferences.protobuf.z input) throws IOException {
            return (C0451e0) l1.a6(DEFAULT_INSTANCE, input);
        }

        public static C0451e0 f9(androidx.datastore.preferences.protobuf.z input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (C0451e0) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C0451e0 g9(InputStream input) throws IOException {
            return (C0451e0) l1.d6(DEFAULT_INSTANCE, input);
        }

        public static C0451e0 h9(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (C0451e0) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C0451e0 i9(ByteBuffer data) throws t1 {
            return (C0451e0) l1.i6(DEFAULT_INSTANCE, data);
        }

        public static C0451e0 j9(ByteBuffer data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (C0451e0) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C0451e0 k9(byte[] data) throws t1 {
            return (C0451e0) l1.p6(DEFAULT_INSTANCE, data);
        }

        public static C0451e0 l9(byte[] data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (C0451e0) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static h3<C0451e0> m9() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n9(int index) {
            T8();
            this.uninterpretedOption_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o9(boolean value) {
            this.bitField0_ |= 4;
            this.deprecated_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p9(boolean value) {
            this.bitField0_ |= 16;
            this.deprecatedLegacyJsonFieldConflicts_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q9(o value) {
            value.getClass();
            this.features_ = value;
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void r9(boolean value) {
            this.bitField0_ |= 8;
            this.mapEntry_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s9(boolean value) {
            this.bitField0_ |= 1;
            this.messageSetWireFormat_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t9(boolean value) {
            this.bitField0_ |= 2;
            this.noStandardDescriptorAccessor_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void u9(int index, u0 value) {
            value.getClass();
            T8();
            this.uninterpretedOption_.set(index, value);
        }

        @Override // androidx.datastore.preferences.protobuf.l1
        protected final Object D3(l1.i method, Object arg0, Object arg1) {
            h3 cVar;
            a aVar = null;
            switch (a.f50068a[method.ordinal()]) {
                case 1:
                    return new C0451e0();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.A5(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001ϧ\u0007\u0000\u0001\u0002\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0007ဇ\u0003\u000bဇ\u0004\fᐉ\u0005ϧЛ", new Object[]{"bitField0_", "messageSetWireFormat_", "noStandardDescriptorAccessor_", "deprecated_", "mapEntry_", "deprecatedLegacyJsonFieldConflicts_", "features_", "uninterpretedOption_", u0.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    h3<C0451e0> h3Var = PARSER;
                    if (h3Var != null) {
                        return h3Var;
                    }
                    synchronized (C0451e0.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.e0.f0
        @Deprecated
        public boolean G() {
            return this.deprecatedLegacyJsonFieldConflicts_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.f0
        public boolean G4() {
            return this.noStandardDescriptorAccessor_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.f0
        @Deprecated
        public boolean K6() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.f0
        public boolean P7() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.f0
        public boolean T4() {
            return (this.bitField0_ & 8) != 0;
        }

        public v0 V8(int index) {
            return this.uninterpretedOption_.get(index);
        }

        public List<? extends v0> W8() {
            return this.uninterpretedOption_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.f0
        public boolean Z7() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.f0
        public List<u0> d() {
            return this.uninterpretedOption_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.f0
        public u0 e(int index) {
            return this.uninterpretedOption_.get(index);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.f0
        public int f() {
            return this.uninterpretedOption_.size();
        }

        @Override // androidx.datastore.preferences.protobuf.e0.f0
        public boolean g5() {
            return this.mapEntry_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.f0
        public boolean j() {
            if ((this.bitField0_ & 4) == 0) {
                return false;
            }
            int i10 = 2 << 1;
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.f0
        public boolean l() {
            return this.deprecated_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.f0
        public boolean r() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.f0
        public o t() {
            o oVarI8 = this.features_;
            if (oVarI8 == null) {
                oVarI8 = o.I8();
            }
            return oVarI8;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.f0
        public boolean v4() {
            return this.messageSetWireFormat_;
        }
    }

    public interface f extends r2 {
        e.b A0(int index);

        List<String> I0();

        List<e.b> N0();

        int O0();

        int Y5();

        androidx.datastore.preferences.protobuf.u a();

        g b();

        androidx.datastore.preferences.protobuf.u e0(int index);

        boolean g();

        String getName();

        i getValue(int index);

        boolean h();

        String q0(int index);

        List<i> q7();

        int t0();
    }

    public interface f0 extends l1.f<C0451e0, C0451e0.a> {
        @Deprecated
        boolean G();

        boolean G4();

        @Deprecated
        boolean K6();

        boolean P7();

        boolean T4();

        boolean Z7();

        List<u0> d();

        u0 e(int index);

        int f();

        boolean g5();

        boolean j();

        boolean l();

        boolean r();

        o t();

        boolean v4();
    }

    public static final class g extends l1.e<g, a> implements h {
        public static final int ALLOW_ALIAS_FIELD_NUMBER = 2;
        private static final g DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        public static final int DEPRECATED_LEGACY_JSON_FIELD_CONFLICTS_FIELD_NUMBER = 6;
        public static final int FEATURES_FIELD_NUMBER = 7;
        private static volatile h3<g> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private boolean allowAlias_;
        private int bitField0_;
        private boolean deprecatedLegacyJsonFieldConflicts_;
        private boolean deprecated_;
        private o features_;
        private byte memoizedIsInitialized = 2;
        private s1.l<u0> uninterpretedOption_ = l1.T3();

        public static final class a extends l1.d<g, a> implements h {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a A5(int index, u0 value) {
                V3();
                ((g) this.f50422b).G8(index, value);
                return this;
            }

            public a B5(u0.a builderForValue) {
                V3();
                ((g) this.f50422b).H8(builderForValue.build());
                return this;
            }

            public a D5(u0 value) {
                V3();
                ((g) this.f50422b).H8(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.h
            public boolean E5() {
                return ((g) this.f50422b).E5();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.h
            @Deprecated
            public boolean G() {
                return ((g) this.f50422b).G();
            }

            public a I5() {
                V3();
                ((g) this.f50422b).I8();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.h
            public boolean I6() {
                return ((g) this.f50422b).I6();
            }

            public a J5() {
                V3();
                ((g) this.f50422b).J8();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.h
            @Deprecated
            public boolean K6() {
                return ((g) this.f50422b).K6();
            }

            @Deprecated
            public a R5() {
                V3();
                ((g) this.f50422b).K8();
                return this;
            }

            public a Z5() {
                V3();
                ((g) this.f50422b).L8();
                return this;
            }

            public a a6() {
                V3();
                ((g) this.f50422b).M8();
                return this;
            }

            public a c6(o value) {
                V3();
                ((g) this.f50422b).R8(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.h
            public List<u0> d() {
                return Collections.unmodifiableList(((g) this.f50422b).d());
            }

            public a d6(int index) {
                V3();
                ((g) this.f50422b).h9(index);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.h
            public u0 e(int index) {
                return ((g) this.f50422b).e(index);
            }

            public a e6(boolean value) {
                V3();
                ((g) this.f50422b).i9(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.h
            public int f() {
                return ((g) this.f50422b).f();
            }

            public a i6(boolean value) {
                V3();
                ((g) this.f50422b).j9(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.h
            public boolean j() {
                return ((g) this.f50422b).j();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.h
            public boolean l() {
                return ((g) this.f50422b).l();
            }

            @Deprecated
            public a o6(boolean value) {
                V3();
                ((g) this.f50422b).k9(value);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a p6(o.a builderForValue) {
                V3();
                ((g) this.f50422b).l9((o) builderForValue.build());
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.h
            public boolean r() {
                return ((g) this.f50422b).r();
            }

            public a r5(Iterable<? extends u0> values) {
                V3();
                ((g) this.f50422b).F8(values);
                return this;
            }

            public a r6(o value) {
                V3();
                ((g) this.f50422b).l9(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.h
            public o t() {
                return ((g) this.f50422b).t();
            }

            public a t6(int index, u0.a builderForValue) {
                V3();
                ((g) this.f50422b).m9(index, builderForValue.build());
                return this;
            }

            public a w6(int index, u0 value) {
                V3();
                ((g) this.f50422b).m9(index, value);
                return this;
            }

            public a y5(int index, u0.a builderForValue) {
                V3();
                ((g) this.f50422b).G8(index, builderForValue.build());
                return this;
            }

            private a() {
                super(g.DEFAULT_INSTANCE);
            }
        }

        static {
            g gVar = new g();
            DEFAULT_INSTANCE = gVar;
            l1.Y6(g.class, gVar);
        }

        private g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void F8(Iterable<? extends u0> values) {
            N8();
            androidx.datastore.preferences.protobuf.a.m(values, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void G8(int index, u0 value) {
            value.getClass();
            N8();
            this.uninterpretedOption_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void H8(u0 value) {
            value.getClass();
            N8();
            this.uninterpretedOption_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void I8() {
            this.bitField0_ &= -2;
            this.allowAlias_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void J8() {
            this.bitField0_ &= -3;
            this.deprecated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void K8() {
            this.bitField0_ &= -5;
            this.deprecatedLegacyJsonFieldConflicts_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void L8() {
            this.features_ = null;
            this.bitField0_ &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void M8() {
            this.uninterpretedOption_ = l1.T3();
        }

        private void N8() {
            s1.l<u0> lVar = this.uninterpretedOption_;
            if (!lVar.s1()) {
                this.uninterpretedOption_ = l1.r5(lVar);
            }
        }

        public static g O8() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void R8(o value) {
            value.getClass();
            o oVar = this.features_;
            if (oVar == null || oVar == o.I8()) {
                this.features_ = value;
            } else {
                this.features_ = ((o.a) o.K8(this.features_).u4(value)).B1();
            }
            this.bitField0_ |= 8;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a S8() {
            return (a) DEFAULT_INSTANCE.s3();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a T8(g prototype) {
            return (a) DEFAULT_INSTANCE.v3(prototype);
        }

        public static g U8(InputStream input) throws IOException {
            return (g) l1.J5(DEFAULT_INSTANCE, input);
        }

        public static g V8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (g) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static g W8(androidx.datastore.preferences.protobuf.u data) throws t1 {
            return (g) l1.R5(DEFAULT_INSTANCE, data);
        }

        public static g X8(androidx.datastore.preferences.protobuf.u data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (g) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static g Y8(androidx.datastore.preferences.protobuf.z input) throws IOException {
            return (g) l1.a6(DEFAULT_INSTANCE, input);
        }

        public static g Z8(androidx.datastore.preferences.protobuf.z input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (g) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static g a9(InputStream input) throws IOException {
            return (g) l1.d6(DEFAULT_INSTANCE, input);
        }

        public static g b9(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (g) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static g c9(ByteBuffer data) throws t1 {
            return (g) l1.i6(DEFAULT_INSTANCE, data);
        }

        public static g d9(ByteBuffer data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (g) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static g e9(byte[] data) throws t1 {
            return (g) l1.p6(DEFAULT_INSTANCE, data);
        }

        public static g f9(byte[] data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (g) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static h3<g> g9() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h9(int index) {
            N8();
            this.uninterpretedOption_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i9(boolean value) {
            this.bitField0_ |= 1;
            this.allowAlias_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j9(boolean value) {
            this.bitField0_ |= 2;
            this.deprecated_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k9(boolean value) {
            this.bitField0_ |= 4;
            this.deprecatedLegacyJsonFieldConflicts_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l9(o value) {
            value.getClass();
            this.features_ = value;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m9(int index, u0 value) {
            value.getClass();
            N8();
            this.uninterpretedOption_.set(index, value);
        }

        @Override // androidx.datastore.preferences.protobuf.l1
        protected final Object D3(l1.i method, Object arg0, Object arg1) {
            h3 cVar;
            a aVar = null;
            switch (a.f50068a[method.ordinal()]) {
                case 1:
                    return new g();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.A5(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0002ϧ\u0005\u0000\u0001\u0002\u0002ဇ\u0000\u0003ဇ\u0001\u0006ဇ\u0002\u0007ᐉ\u0003ϧЛ", new Object[]{"bitField0_", "allowAlias_", "deprecated_", "deprecatedLegacyJsonFieldConflicts_", "features_", "uninterpretedOption_", u0.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    h3<g> h3Var = PARSER;
                    if (h3Var != null) {
                        return h3Var;
                    }
                    synchronized (g.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.e0.h
        public boolean E5() {
            return this.allowAlias_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.h
        @Deprecated
        public boolean G() {
            return this.deprecatedLegacyJsonFieldConflicts_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.h
        public boolean I6() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.h
        @Deprecated
        public boolean K6() {
            if ((this.bitField0_ & 4) == 0) {
                return false;
            }
            int i10 = 7 & 1;
            return true;
        }

        public v0 P8(int index) {
            return this.uninterpretedOption_.get(index);
        }

        public List<? extends v0> Q8() {
            return this.uninterpretedOption_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.h
        public List<u0> d() {
            return this.uninterpretedOption_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.h
        public u0 e(int index) {
            return this.uninterpretedOption_.get(index);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.h
        public int f() {
            return this.uninterpretedOption_.size();
        }

        @Override // androidx.datastore.preferences.protobuf.e0.h
        public boolean j() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.h
        public boolean l() {
            return this.deprecated_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.h
        public boolean r() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.h
        public o t() {
            o oVar = this.features_;
            return oVar == null ? o.I8() : oVar;
        }
    }

    public static final class g0 extends l1<g0, a> implements h0 {
        public static final int CLIENT_STREAMING_FIELD_NUMBER = 5;
        private static final g0 DEFAULT_INSTANCE;
        public static final int INPUT_TYPE_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 4;
        public static final int OUTPUT_TYPE_FIELD_NUMBER = 3;
        private static volatile h3<g0> PARSER = null;
        public static final int SERVER_STREAMING_FIELD_NUMBER = 6;
        private int bitField0_;
        private boolean clientStreaming_;
        private i0 options_;
        private boolean serverStreaming_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private String inputType_ = "";
        private String outputType_ = "";

        public static final class a extends l1.b<g0, a> implements h0 {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a A5(String value) {
                V3();
                ((g0) this.f50422b).S8(value);
                return this;
            }

            public a B5(androidx.datastore.preferences.protobuf.u value) {
                V3();
                ((g0) this.f50422b).T8(value);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a D5(i0.a builderForValue) {
                V3();
                ((g0) this.f50422b).U8((i0) builderForValue.build());
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.h0
            public boolean E3() {
                return ((g0) this.f50422b).E3();
            }

            public a I5(i0 value) {
                V3();
                ((g0) this.f50422b).U8(value);
                return this;
            }

            public a J5(String value) {
                V3();
                ((g0) this.f50422b).V8(value);
                return this;
            }

            public a L4() {
                V3();
                ((g0) this.f50422b).s8();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.h0
            public boolean M4() {
                return ((g0) this.f50422b).M4();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.h0
            public boolean O2() {
                return ((g0) this.f50422b).O2();
            }

            public a P4() {
                V3();
                ((g0) this.f50422b).t8();
                return this;
            }

            public a Q4() {
                V3();
                ((g0) this.f50422b).u8();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.h0
            public boolean Q7() {
                return ((g0) this.f50422b).Q7();
            }

            public a R5(androidx.datastore.preferences.protobuf.u value) {
                V3();
                ((g0) this.f50422b).W8(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.h0
            public androidx.datastore.preferences.protobuf.u T7() {
                return ((g0) this.f50422b).T7();
            }

            public a U4() {
                V3();
                ((g0) this.f50422b).v8();
                return this;
            }

            public a Z4() {
                V3();
                ((g0) this.f50422b).w8();
                return this;
            }

            public a Z5(boolean value) {
                V3();
                ((g0) this.f50422b).X8(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.h0
            public androidx.datastore.preferences.protobuf.u a() {
                return ((g0) this.f50422b).a();
            }

            public a a5() {
                V3();
                ((g0) this.f50422b).x8();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.h0
            public i0 b() {
                return ((g0) this.f50422b).b();
            }

            public a b5(i0 value) {
                V3();
                ((g0) this.f50422b).z8(value);
                return this;
            }

            public a d5(boolean value) {
                V3();
                ((g0) this.f50422b).P8(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.h0
            public String f3() {
                return ((g0) this.f50422b).f3();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.h0
            public boolean g() {
                return ((g0) this.f50422b).g();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.h0
            public boolean g7() {
                return ((g0) this.f50422b).g7();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.h0
            public String getInputType() {
                return ((g0) this.f50422b).getInputType();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.h0
            public String getName() {
                return ((g0) this.f50422b).getName();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.h0
            public boolean h() {
                return ((g0) this.f50422b).h();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.h0
            public androidx.datastore.preferences.protobuf.u j6() {
                return ((g0) this.f50422b).j6();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.h0
            public boolean o7() {
                return ((g0) this.f50422b).o7();
            }

            public a r5(String value) {
                V3();
                ((g0) this.f50422b).Q8(value);
                return this;
            }

            public a y5(androidx.datastore.preferences.protobuf.u value) {
                V3();
                ((g0) this.f50422b).R8(value);
                return this;
            }

            private a() {
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

        public static a A8() {
            return DEFAULT_INSTANCE.s3();
        }

        public static a B8(g0 prototype) {
            return DEFAULT_INSTANCE.v3(prototype);
        }

        public static g0 C8(InputStream input) throws IOException {
            return (g0) l1.J5(DEFAULT_INSTANCE, input);
        }

        public static g0 D8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (g0) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static g0 E8(androidx.datastore.preferences.protobuf.u data) throws t1 {
            return (g0) l1.R5(DEFAULT_INSTANCE, data);
        }

        public static g0 F8(androidx.datastore.preferences.protobuf.u data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (g0) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static g0 G8(androidx.datastore.preferences.protobuf.z input) throws IOException {
            return (g0) l1.a6(DEFAULT_INSTANCE, input);
        }

        public static g0 H8(androidx.datastore.preferences.protobuf.z input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (g0) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static g0 I8(InputStream input) throws IOException {
            return (g0) l1.d6(DEFAULT_INSTANCE, input);
        }

        public static g0 J8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (g0) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static g0 K8(ByteBuffer data) throws t1 {
            return (g0) l1.i6(DEFAULT_INSTANCE, data);
        }

        public static g0 L8(ByteBuffer data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (g0) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static g0 M8(byte[] data) throws t1 {
            return (g0) l1.p6(DEFAULT_INSTANCE, data);
        }

        public static g0 N8(byte[] data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (g0) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static h3<g0> O8() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void P8(boolean value) {
            this.bitField0_ |= 16;
            this.clientStreaming_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Q8(String value) {
            value.getClass();
            this.bitField0_ |= 2;
            this.inputType_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void R8(androidx.datastore.preferences.protobuf.u value) {
            this.inputType_ = value.A0();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void S8(String value) {
            value.getClass();
            this.bitField0_ |= 1;
            this.name_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void T8(androidx.datastore.preferences.protobuf.u value) {
            this.name_ = value.A0();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void U8(i0 value) {
            value.getClass();
            this.options_ = value;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void V8(String value) {
            value.getClass();
            this.bitField0_ |= 4;
            this.outputType_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void W8(androidx.datastore.preferences.protobuf.u value) {
            this.outputType_ = value.A0();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void X8(boolean value) {
            this.bitField0_ |= 32;
            this.serverStreaming_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s8() {
            this.bitField0_ &= -17;
            this.clientStreaming_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t8() {
            this.bitField0_ &= -3;
            this.inputType_ = y8().getInputType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void u8() {
            this.bitField0_ &= -2;
            this.name_ = y8().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void v8() {
            this.options_ = null;
            this.bitField0_ &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w8() {
            this.bitField0_ &= -5;
            this.outputType_ = y8().f3();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void x8() {
            this.bitField0_ &= -33;
            this.serverStreaming_ = false;
        }

        public static g0 y8() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void z8(i0 value) {
            value.getClass();
            i0 i0Var = this.options_;
            if (i0Var == null || i0Var == i0.L8()) {
                this.options_ = value;
            } else {
                this.options_ = ((i0.a) i0.Q8(this.options_).u4(value)).B1();
            }
            this.bitField0_ |= 8;
        }

        @Override // androidx.datastore.preferences.protobuf.l1
        protected final Object D3(l1.i method, Object arg0, Object arg1) {
            h3 cVar;
            a aVar = null;
            switch (a.f50068a[method.ordinal()]) {
                case 1:
                    return new g0();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.A5(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"bitField0_", "name_", "inputType_", "outputType_", "options_", "clientStreaming_", "serverStreaming_"});
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.e0.h0
        public boolean E3() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.h0
        public boolean M4() {
            if ((this.bitField0_ & 4) == 0) {
                return false;
            }
            int i10 = 1 << 1;
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.h0
        public boolean O2() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.h0
        public boolean Q7() {
            return this.clientStreaming_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.h0
        public androidx.datastore.preferences.protobuf.u T7() {
            return androidx.datastore.preferences.protobuf.u.C(this.inputType_);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.h0
        public androidx.datastore.preferences.protobuf.u a() {
            return androidx.datastore.preferences.protobuf.u.C(this.name_);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.h0
        public i0 b() {
            i0 i0VarL8 = this.options_;
            if (i0VarL8 == null) {
                i0VarL8 = i0.L8();
            }
            return i0VarL8;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.h0
        public String f3() {
            return this.outputType_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.h0
        public boolean g() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.h0
        public boolean g7() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.h0
        public String getInputType() {
            return this.inputType_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.h0
        public String getName() {
            return this.name_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.h0
        public boolean h() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.h0
        public androidx.datastore.preferences.protobuf.u j6() {
            return androidx.datastore.preferences.protobuf.u.C(this.outputType_);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.h0
        public boolean o7() {
            return this.serverStreaming_;
        }
    }

    public interface h extends l1.f<g, g.a> {
        boolean E5();

        @Deprecated
        boolean G();

        boolean I6();

        @Deprecated
        boolean K6();

        List<u0> d();

        u0 e(int index);

        int f();

        boolean j();

        boolean l();

        boolean r();

        o t();
    }

    public interface h0 extends r2 {
        boolean E3();

        boolean M4();

        boolean O2();

        boolean Q7();

        androidx.datastore.preferences.protobuf.u T7();

        androidx.datastore.preferences.protobuf.u a();

        i0 b();

        String f3();

        boolean g();

        boolean g7();

        String getInputType();

        String getName();

        boolean h();

        androidx.datastore.preferences.protobuf.u j6();

        boolean o7();
    }

    public static final class i extends l1<i, a> implements j {
        private static final i DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NUMBER_FIELD_NUMBER = 2;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static volatile h3<i> PARSER;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private int number_;
        private k options_;

        public static final class a extends l1.b<i, a> implements j {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a L4() {
                V3();
                ((i) this.f50422b).k8();
                return this;
            }

            public a P4() {
                V3();
                ((i) this.f50422b).l8();
                return this;
            }

            public a Q4() {
                V3();
                ((i) this.f50422b).m8();
                return this;
            }

            public a U4(k value) {
                V3();
                ((i) this.f50422b).o8(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.j
            public boolean W() {
                return ((i) this.f50422b).W();
            }

            public a Z4(String value) {
                V3();
                ((i) this.f50422b).E8(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.j
            public androidx.datastore.preferences.protobuf.u a() {
                return ((i) this.f50422b).a();
            }

            public a a5(androidx.datastore.preferences.protobuf.u value) {
                V3();
                ((i) this.f50422b).F8(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.j
            public k b() {
                return ((i) this.f50422b).b();
            }

            public a b5(int value) {
                V3();
                ((i) this.f50422b).G8(value);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a d5(k.a builderForValue) {
                V3();
                ((i) this.f50422b).H8((k) builderForValue.build());
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.j
            public boolean g() {
                return ((i) this.f50422b).g();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.j
            public String getName() {
                return ((i) this.f50422b).getName();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.j
            public boolean h() {
                return ((i) this.f50422b).h();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.j
            public int i() {
                return ((i) this.f50422b).i();
            }

            public a r5(k value) {
                V3();
                ((i) this.f50422b).H8(value);
                return this;
            }

            private a() {
                super(i.DEFAULT_INSTANCE);
            }
        }

        static {
            i iVar = new i();
            DEFAULT_INSTANCE = iVar;
            l1.Y6(i.class, iVar);
        }

        private i() {
        }

        public static i A8(ByteBuffer data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (i) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static i B8(byte[] data) throws t1 {
            return (i) l1.p6(DEFAULT_INSTANCE, data);
        }

        public static i C8(byte[] data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (i) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static h3<i> D8() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void E8(String value) {
            value.getClass();
            this.bitField0_ |= 1;
            this.name_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void F8(androidx.datastore.preferences.protobuf.u value) {
            this.name_ = value.A0();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void G8(int value) {
            this.bitField0_ |= 2;
            this.number_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void H8(k value) {
            value.getClass();
            this.options_ = value;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k8() {
            this.bitField0_ &= -2;
            this.name_ = n8().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l8() {
            this.bitField0_ &= -3;
            this.number_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m8() {
            this.options_ = null;
            this.bitField0_ &= -5;
        }

        public static i n8() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void o8(k value) {
            value.getClass();
            k kVar = this.options_;
            if (kVar == null || kVar == k.P8()) {
                this.options_ = value;
            } else {
                this.options_ = ((k.a) k.V8(this.options_).u4(value)).B1();
            }
            this.bitField0_ |= 4;
        }

        public static a p8() {
            return DEFAULT_INSTANCE.s3();
        }

        public static a q8(i prototype) {
            return DEFAULT_INSTANCE.v3(prototype);
        }

        public static i r8(InputStream input) throws IOException {
            return (i) l1.J5(DEFAULT_INSTANCE, input);
        }

        public static i s8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (i) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static i t8(androidx.datastore.preferences.protobuf.u data) throws t1 {
            return (i) l1.R5(DEFAULT_INSTANCE, data);
        }

        public static i u8(androidx.datastore.preferences.protobuf.u data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (i) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static i v8(androidx.datastore.preferences.protobuf.z input) throws IOException {
            return (i) l1.a6(DEFAULT_INSTANCE, input);
        }

        public static i w8(androidx.datastore.preferences.protobuf.z input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (i) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static i x8(InputStream input) throws IOException {
            return (i) l1.d6(DEFAULT_INSTANCE, input);
        }

        public static i y8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (i) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static i z8(ByteBuffer data) throws t1 {
            return (i) l1.i6(DEFAULT_INSTANCE, data);
        }

        @Override // androidx.datastore.preferences.protobuf.l1
        protected final Object D3(l1.i method, Object arg0, Object arg1) {
            h3 cVar;
            a aVar = null;
            switch (a.f50068a[method.ordinal()]) {
                case 1:
                    return new i();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.A5(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"bitField0_", "name_", "number_", "options_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    h3<i> h3Var = PARSER;
                    if (h3Var != null) {
                        return h3Var;
                    }
                    synchronized (i.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.e0.j
        public boolean W() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.j
        public androidx.datastore.preferences.protobuf.u a() {
            return androidx.datastore.preferences.protobuf.u.C(this.name_);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.j
        public k b() {
            k kVar = this.options_;
            return kVar == null ? k.P8() : kVar;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.j
        public boolean g() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.j
        public String getName() {
            return this.name_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.j
        public boolean h() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.j
        public int i() {
            return this.number_;
        }
    }

    public static final class i0 extends l1.e<i0, a> implements j0 {
        private static final i0 DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 33;
        public static final int FEATURES_FIELD_NUMBER = 35;
        public static final int IDEMPOTENCY_LEVEL_FIELD_NUMBER = 34;
        private static volatile h3<i0> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean deprecated_;
        private o features_;
        private int idempotencyLevel_;
        private byte memoizedIsInitialized = 2;
        private s1.l<u0> uninterpretedOption_ = l1.T3();

        public static final class a extends l1.d<i0, a> implements j0 {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a A5(int index, u0 value) {
                V3();
                ((i0) this.f50422b).E8(index, value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.j0
            public boolean B3() {
                return ((i0) this.f50422b).B3();
            }

            public a B5(u0.a builderForValue) {
                V3();
                ((i0) this.f50422b).F8(builderForValue.build());
                return this;
            }

            public a D5(u0 value) {
                V3();
                ((i0) this.f50422b).F8(value);
                return this;
            }

            public a I5() {
                V3();
                ((i0) this.f50422b).G8();
                return this;
            }

            public a J5() {
                V3();
                ((i0) this.f50422b).H8();
                return this;
            }

            public a R5() {
                V3();
                ((i0) this.f50422b).I8();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.j0
            public b X4() {
                return ((i0) this.f50422b).X4();
            }

            public a Z5() {
                V3();
                ((i0) this.f50422b).J8();
                return this;
            }

            public a a6(o value) {
                V3();
                ((i0) this.f50422b).O8(value);
                return this;
            }

            public a c6(int index) {
                V3();
                ((i0) this.f50422b).e9(index);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.j0
            public List<u0> d() {
                return Collections.unmodifiableList(((i0) this.f50422b).d());
            }

            public a d6(boolean value) {
                V3();
                ((i0) this.f50422b).f9(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.j0
            public u0 e(int index) {
                return ((i0) this.f50422b).e(index);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a e6(o.a builderForValue) {
                V3();
                ((i0) this.f50422b).g9((o) builderForValue.build());
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.j0
            public int f() {
                return ((i0) this.f50422b).f();
            }

            public a i6(o value) {
                V3();
                ((i0) this.f50422b).g9(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.j0
            public boolean j() {
                return ((i0) this.f50422b).j();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.j0
            public boolean l() {
                return ((i0) this.f50422b).l();
            }

            public a o6(b value) {
                V3();
                ((i0) this.f50422b).h9(value);
                return this;
            }

            public a p6(int index, u0.a builderForValue) {
                V3();
                ((i0) this.f50422b).i9(index, builderForValue.build());
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.j0
            public boolean r() {
                return ((i0) this.f50422b).r();
            }

            public a r5(Iterable<? extends u0> values) {
                V3();
                ((i0) this.f50422b).D8(values);
                return this;
            }

            public a r6(int index, u0 value) {
                V3();
                ((i0) this.f50422b).i9(index, value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.j0
            public o t() {
                return ((i0) this.f50422b).t();
            }

            public a y5(int index, u0.a builderForValue) {
                V3();
                ((i0) this.f50422b).E8(index, builderForValue.build());
                return this;
            }

            private a() {
                super(i0.DEFAULT_INSTANCE);
            }
        }

        public enum b implements s1.c {
            IDEMPOTENCY_UNKNOWN(0),
            NO_SIDE_EFFECTS(1),
            IDEMPOTENT(2);


            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f50116e = 0;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f50117f = 1;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f50118g = 2;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static final s1.d<b> f50119h = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f50121a;

            class a implements s1.d<b> {
                a() {
                }

                @Override // androidx.datastore.preferences.protobuf.s1.d
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public b a(int number) {
                    return b.b(number);
                }
            }

            /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.e0$i0$b$b, reason: collision with other inner class name */
            private static final class C0452b implements s1.e {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                static final s1.e f50122a = new C0452b();

                private C0452b() {
                }

                @Override // androidx.datastore.preferences.protobuf.s1.e
                public boolean a(int number) {
                    return b.b(number) != null;
                }
            }

            static {
                int i10 = 2 & 2;
            }

            b(int value) {
                this.f50121a = value;
            }

            public static b b(int value) {
                if (value == 0) {
                    return IDEMPOTENCY_UNKNOWN;
                }
                if (value == 1) {
                    return NO_SIDE_EFFECTS;
                }
                if (value != 2) {
                    return null;
                }
                return IDEMPOTENT;
            }

            public static s1.d<b> k() {
                return f50119h;
            }

            public static s1.e l() {
                return C0452b.f50122a;
            }

            @Deprecated
            public static b n(int value) {
                return b(value);
            }

            @Override // androidx.datastore.preferences.protobuf.s1.c
            public final int i() {
                return this.f50121a;
            }
        }

        static {
            i0 i0Var = new i0();
            DEFAULT_INSTANCE = i0Var;
            l1.Y6(i0.class, i0Var);
        }

        private i0() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void D8(Iterable<? extends u0> values) {
            K8();
            androidx.datastore.preferences.protobuf.a.m(values, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void E8(int index, u0 value) {
            value.getClass();
            K8();
            this.uninterpretedOption_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void F8(u0 value) {
            value.getClass();
            K8();
            this.uninterpretedOption_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void G8() {
            this.bitField0_ &= -2;
            this.deprecated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void H8() {
            this.features_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void I8() {
            this.bitField0_ &= -3;
            int i10 = 4 & 0;
            this.idempotencyLevel_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void J8() {
            this.uninterpretedOption_ = l1.T3();
        }

        private void K8() {
            s1.l<u0> lVar = this.uninterpretedOption_;
            if (lVar.s1()) {
                return;
            }
            this.uninterpretedOption_ = l1.r5(lVar);
        }

        public static i0 L8() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void O8(o value) {
            value.getClass();
            o oVar = this.features_;
            if (oVar == null || oVar == o.I8()) {
                this.features_ = value;
            } else {
                this.features_ = ((o.a) o.K8(this.features_).u4(value)).B1();
            }
            this.bitField0_ |= 4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a P8() {
            return (a) DEFAULT_INSTANCE.s3();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a Q8(i0 prototype) {
            return (a) DEFAULT_INSTANCE.v3(prototype);
        }

        public static i0 R8(InputStream input) throws IOException {
            return (i0) l1.J5(DEFAULT_INSTANCE, input);
        }

        public static i0 S8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (i0) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static i0 T8(androidx.datastore.preferences.protobuf.u data) throws t1 {
            return (i0) l1.R5(DEFAULT_INSTANCE, data);
        }

        public static i0 U8(androidx.datastore.preferences.protobuf.u data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (i0) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static i0 V8(androidx.datastore.preferences.protobuf.z input) throws IOException {
            return (i0) l1.a6(DEFAULT_INSTANCE, input);
        }

        public static i0 W8(androidx.datastore.preferences.protobuf.z input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (i0) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static i0 X8(InputStream input) throws IOException {
            return (i0) l1.d6(DEFAULT_INSTANCE, input);
        }

        public static i0 Y8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (i0) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static i0 Z8(ByteBuffer data) throws t1 {
            return (i0) l1.i6(DEFAULT_INSTANCE, data);
        }

        public static i0 a9(ByteBuffer data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (i0) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static i0 b9(byte[] data) throws t1 {
            return (i0) l1.p6(DEFAULT_INSTANCE, data);
        }

        public static i0 c9(byte[] data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (i0) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static h3<i0> d9() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e9(int index) {
            K8();
            this.uninterpretedOption_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f9(boolean value) {
            this.bitField0_ |= 1;
            this.deprecated_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g9(o value) {
            value.getClass();
            this.features_ = value;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h9(b value) {
            this.idempotencyLevel_ = value.i();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i9(int index, u0 value) {
            value.getClass();
            K8();
            this.uninterpretedOption_.set(index, value);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.j0
        public boolean B3() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.l1
        protected final Object D3(l1.i method, Object arg0, Object arg1) {
            h3 cVar;
            a aVar = null;
            switch (a.f50068a[method.ordinal()]) {
                case 1:
                    return new i0();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.A5(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001!ϧ\u0004\u0000\u0001\u0002!ဇ\u0000\"᠌\u0001#ᐉ\u0002ϧЛ", new Object[]{"bitField0_", "deprecated_", "idempotencyLevel_", b.l(), "features_", "uninterpretedOption_", u0.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    h3<i0> h3Var = PARSER;
                    if (h3Var != null) {
                        return h3Var;
                    }
                    synchronized (i0.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public v0 M8(int index) {
            return this.uninterpretedOption_.get(index);
        }

        public List<? extends v0> N8() {
            return this.uninterpretedOption_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.j0
        public b X4() {
            b bVarB = b.b(this.idempotencyLevel_);
            return bVarB == null ? b.IDEMPOTENCY_UNKNOWN : bVarB;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.j0
        public List<u0> d() {
            return this.uninterpretedOption_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.j0
        public u0 e(int index) {
            return this.uninterpretedOption_.get(index);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.j0
        public int f() {
            return this.uninterpretedOption_.size();
        }

        @Override // androidx.datastore.preferences.protobuf.e0.j0
        public boolean j() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.j0
        public boolean l() {
            return this.deprecated_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.j0
        public boolean r() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.j0
        public o t() {
            o oVarI8 = this.features_;
            if (oVarI8 == null) {
                oVarI8 = o.I8();
            }
            return oVarI8;
        }
    }

    public interface j extends r2 {
        boolean W();

        androidx.datastore.preferences.protobuf.u a();

        k b();

        boolean g();

        String getName();

        boolean h();

        int i();
    }

    public interface j0 extends l1.f<i0, i0.a> {
        boolean B3();

        i0.b X4();

        List<u0> d();

        u0 e(int index);

        int f();

        boolean j();

        boolean l();

        boolean r();

        o t();
    }

    public static final class k extends l1.e<k, a> implements l {
        public static final int DEBUG_REDACT_FIELD_NUMBER = 3;
        private static final k DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 1;
        public static final int FEATURES_FIELD_NUMBER = 2;
        public static final int FEATURE_SUPPORT_FIELD_NUMBER = 4;
        private static volatile h3<k> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean debugRedact_;
        private boolean deprecated_;
        private u.f featureSupport_;
        private o features_;
        private byte memoizedIsInitialized = 2;
        private s1.l<u0> uninterpretedOption_ = l1.T3();

        public static final class a extends l1.d<k, a> implements l {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a A5(int index, u0 value) {
                V3();
                ((k) this.f50422b).H8(index, value);
                return this;
            }

            public a A6(int index, u0.a builderForValue) {
                V3();
                ((k) this.f50422b).o9(index, builderForValue.build());
                return this;
            }

            public a B5(u0.a builderForValue) {
                V3();
                ((k) this.f50422b).I8(builderForValue.build());
                return this;
            }

            public a D5(u0 value) {
                V3();
                ((k) this.f50422b).I8(value);
                return this;
            }

            public a E6(int index, u0 value) {
                V3();
                ((k) this.f50422b).o9(index, value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.l
            public boolean H() {
                return ((k) this.f50422b).H();
            }

            public a I5() {
                V3();
                ((k) this.f50422b).J8();
                return this;
            }

            public a J5() {
                V3();
                ((k) this.f50422b).K8();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.l
            public boolean O() {
                return ((k) this.f50422b).O();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.l
            public boolean P() {
                return ((k) this.f50422b).P();
            }

            public a R5() {
                V3();
                ((k) this.f50422b).L8();
                return this;
            }

            public a Z5() {
                V3();
                ((k) this.f50422b).M8();
                return this;
            }

            public a a6() {
                V3();
                ((k) this.f50422b).N8();
                return this;
            }

            public a c6(u.f value) {
                V3();
                ((k) this.f50422b).S8(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.l
            public List<u0> d() {
                return Collections.unmodifiableList(((k) this.f50422b).d());
            }

            public a d6(o value) {
                V3();
                ((k) this.f50422b).T8(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.l
            public u0 e(int index) {
                return ((k) this.f50422b).e(index);
            }

            public a e6(int index) {
                V3();
                ((k) this.f50422b).j9(index);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.l
            public int f() {
                return ((k) this.f50422b).f();
            }

            public a i6(boolean value) {
                V3();
                ((k) this.f50422b).k9(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.l
            public boolean j() {
                return ((k) this.f50422b).j();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.l
            public u.f k() {
                return ((k) this.f50422b).k();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.l
            public boolean l() {
                return ((k) this.f50422b).l();
            }

            public a o6(boolean value) {
                V3();
                ((k) this.f50422b).l9(value);
                return this;
            }

            public a p6(u.f.a builderForValue) {
                V3();
                ((k) this.f50422b).m9(builderForValue.build());
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.l
            public boolean r() {
                return ((k) this.f50422b).r();
            }

            public a r5(Iterable<? extends u0> values) {
                V3();
                ((k) this.f50422b).G8(values);
                return this;
            }

            public a r6(u.f value) {
                V3();
                ((k) this.f50422b).m9(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.l
            public o t() {
                return ((k) this.f50422b).t();
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a t6(o.a builderForValue) {
                V3();
                ((k) this.f50422b).n9((o) builderForValue.build());
                return this;
            }

            public a w6(o value) {
                V3();
                ((k) this.f50422b).n9(value);
                return this;
            }

            public a y5(int index, u0.a builderForValue) {
                V3();
                ((k) this.f50422b).H8(index, builderForValue.build());
                return this;
            }

            private a() {
                super(k.DEFAULT_INSTANCE);
            }
        }

        static {
            k kVar = new k();
            DEFAULT_INSTANCE = kVar;
            l1.Y6(k.class, kVar);
        }

        private k() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void G8(Iterable<? extends u0> values) {
            O8();
            androidx.datastore.preferences.protobuf.a.m(values, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void H8(int index, u0 value) {
            value.getClass();
            O8();
            this.uninterpretedOption_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void I8(u0 value) {
            value.getClass();
            O8();
            this.uninterpretedOption_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void J8() {
            this.bitField0_ &= -5;
            this.debugRedact_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void K8() {
            this.bitField0_ &= -2;
            this.deprecated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void L8() {
            this.featureSupport_ = null;
            this.bitField0_ &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void M8() {
            this.features_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void N8() {
            this.uninterpretedOption_ = l1.T3();
        }

        private void O8() {
            s1.l<u0> lVar = this.uninterpretedOption_;
            if (lVar.s1()) {
                return;
            }
            this.uninterpretedOption_ = l1.r5(lVar);
        }

        public static k P8() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void S8(u.f value) {
            value.getClass();
            u.f fVar = this.featureSupport_;
            if (fVar == null || fVar == u.f.p8()) {
                this.featureSupport_ = value;
            } else {
                this.featureSupport_ = u.f.r8(this.featureSupport_).u4(value).B1();
            }
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void T8(o value) {
            value.getClass();
            o oVar = this.features_;
            if (oVar == null || oVar == o.I8()) {
                this.features_ = value;
            } else {
                this.features_ = ((o.a) o.K8(this.features_).u4(value)).B1();
            }
            this.bitField0_ |= 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a U8() {
            return (a) DEFAULT_INSTANCE.s3();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a V8(k prototype) {
            return (a) DEFAULT_INSTANCE.v3(prototype);
        }

        public static k W8(InputStream input) throws IOException {
            return (k) l1.J5(DEFAULT_INSTANCE, input);
        }

        public static k X8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (k) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static k Y8(androidx.datastore.preferences.protobuf.u data) throws t1 {
            return (k) l1.R5(DEFAULT_INSTANCE, data);
        }

        public static k Z8(androidx.datastore.preferences.protobuf.u data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (k) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static k a9(androidx.datastore.preferences.protobuf.z input) throws IOException {
            return (k) l1.a6(DEFAULT_INSTANCE, input);
        }

        public static k b9(androidx.datastore.preferences.protobuf.z input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (k) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static k c9(InputStream input) throws IOException {
            return (k) l1.d6(DEFAULT_INSTANCE, input);
        }

        public static k d9(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (k) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static k e9(ByteBuffer data) throws t1 {
            return (k) l1.i6(DEFAULT_INSTANCE, data);
        }

        public static k f9(ByteBuffer data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (k) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static k g9(byte[] data) throws t1 {
            return (k) l1.p6(DEFAULT_INSTANCE, data);
        }

        public static k h9(byte[] data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (k) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static h3<k> i9() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j9(int index) {
            O8();
            this.uninterpretedOption_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k9(boolean value) {
            this.bitField0_ |= 4;
            this.debugRedact_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l9(boolean value) {
            this.bitField0_ |= 1;
            this.deprecated_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m9(u.f value) {
            value.getClass();
            this.featureSupport_ = value;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n9(o value) {
            value.getClass();
            this.features_ = value;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o9(int index, u0 value) {
            value.getClass();
            O8();
            this.uninterpretedOption_.set(index, value);
        }

        @Override // androidx.datastore.preferences.protobuf.l1
        protected final Object D3(l1.i method, Object arg0, Object arg1) {
            h3 cVar;
            a aVar = null;
            switch (a.f50068a[method.ordinal()]) {
                case 1:
                    return new k();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.A5(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001ϧ\u0005\u0000\u0001\u0002\u0001ဇ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ဉ\u0003ϧЛ", new Object[]{"bitField0_", "deprecated_", "features_", "debugRedact_", "featureSupport_", "uninterpretedOption_", u0.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    h3<k> h3Var = PARSER;
                    if (h3Var != null) {
                        return h3Var;
                    }
                    synchronized (k.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.e0.l
        public boolean H() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.l
        public boolean O() {
            return this.debugRedact_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.l
        public boolean P() {
            return (this.bitField0_ & 4) != 0;
        }

        public v0 Q8(int index) {
            return this.uninterpretedOption_.get(index);
        }

        public List<? extends v0> R8() {
            return this.uninterpretedOption_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.l
        public List<u0> d() {
            return this.uninterpretedOption_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.l
        public u0 e(int index) {
            return this.uninterpretedOption_.get(index);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.l
        public int f() {
            return this.uninterpretedOption_.size();
        }

        @Override // androidx.datastore.preferences.protobuf.e0.l
        public boolean j() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.l
        public u.f k() {
            u.f fVarP8 = this.featureSupport_;
            if (fVarP8 == null) {
                fVarP8 = u.f.p8();
            }
            return fVarP8;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.l
        public boolean l() {
            return this.deprecated_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.l
        public boolean r() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.l
        public o t() {
            o oVar = this.features_;
            return oVar == null ? o.I8() : oVar;
        }
    }

    public static final class k0 extends l1<k0, a> implements l0 {
        private static final k0 DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 2;
        private static volatile h3<k0> PARSER;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private m0 options_;

        public static final class a extends l1.b<k0, a> implements l0 {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a L4() {
                V3();
                ((k0) this.f50422b).h8();
                return this;
            }

            public a P4() {
                V3();
                ((k0) this.f50422b).j8();
                return this;
            }

            public a Q4(m0 value) {
                V3();
                ((k0) this.f50422b).l8(value);
                return this;
            }

            public a U4(String value) {
                V3();
                ((k0) this.f50422b).B8(value);
                return this;
            }

            public a Z4(androidx.datastore.preferences.protobuf.u value) {
                V3();
                ((k0) this.f50422b).C8(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.l0
            public androidx.datastore.preferences.protobuf.u a() {
                return ((k0) this.f50422b).a();
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a a5(m0.a builderForValue) {
                V3();
                ((k0) this.f50422b).D8((m0) builderForValue.build());
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.l0
            public m0 b() {
                return ((k0) this.f50422b).b();
            }

            public a b5(m0 value) {
                V3();
                ((k0) this.f50422b).D8(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.l0
            public boolean g() {
                return ((k0) this.f50422b).g();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.l0
            public String getName() {
                return ((k0) this.f50422b).getName();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.l0
            public boolean h() {
                return ((k0) this.f50422b).h();
            }

            private a() {
                super(k0.DEFAULT_INSTANCE);
            }
        }

        static {
            k0 k0Var = new k0();
            DEFAULT_INSTANCE = k0Var;
            l1.Y6(k0.class, k0Var);
        }

        private k0() {
        }

        public static h3<k0> A8() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void B8(String value) {
            value.getClass();
            this.bitField0_ |= 1;
            this.name_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C8(androidx.datastore.preferences.protobuf.u value) {
            this.name_ = value.A0();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void D8(m0 value) {
            value.getClass();
            this.options_ = value;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h8() {
            this.bitField0_ &= -2;
            this.name_ = k8().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j8() {
            this.options_ = null;
            this.bitField0_ &= -3;
        }

        public static k0 k8() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void l8(m0 value) {
            value.getClass();
            m0 m0Var = this.options_;
            if (m0Var == null || m0Var == m0.F8()) {
                this.options_ = value;
            } else {
                this.options_ = ((m0.a) m0.K8(this.options_).u4(value)).B1();
            }
            this.bitField0_ |= 2;
        }

        public static a m8() {
            return DEFAULT_INSTANCE.s3();
        }

        public static a n8(k0 prototype) {
            return DEFAULT_INSTANCE.v3(prototype);
        }

        public static k0 o8(InputStream input) throws IOException {
            return (k0) l1.J5(DEFAULT_INSTANCE, input);
        }

        public static k0 p8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (k0) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static k0 q8(androidx.datastore.preferences.protobuf.u data) throws t1 {
            return (k0) l1.R5(DEFAULT_INSTANCE, data);
        }

        public static k0 r8(androidx.datastore.preferences.protobuf.u data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (k0) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static k0 s8(androidx.datastore.preferences.protobuf.z input) throws IOException {
            return (k0) l1.a6(DEFAULT_INSTANCE, input);
        }

        public static k0 t8(androidx.datastore.preferences.protobuf.z input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (k0) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static k0 u8(InputStream input) throws IOException {
            return (k0) l1.d6(DEFAULT_INSTANCE, input);
        }

        public static k0 v8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (k0) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static k0 w8(ByteBuffer data) throws t1 {
            return (k0) l1.i6(DEFAULT_INSTANCE, data);
        }

        public static k0 x8(ByteBuffer data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (k0) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static k0 y8(byte[] data) throws t1 {
            return (k0) l1.p6(DEFAULT_INSTANCE, data);
        }

        public static k0 z8(byte[] data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (k0) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        @Override // androidx.datastore.preferences.protobuf.l1
        protected final Object D3(l1.i method, Object arg0, Object arg1) {
            h3 cVar;
            a aVar = null;
            switch (a.f50068a[method.ordinal()]) {
                case 1:
                    return new k0();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.A5(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"bitField0_", "name_", "options_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    h3<k0> h3Var = PARSER;
                    if (h3Var != null) {
                        return h3Var;
                    }
                    synchronized (k0.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.e0.l0
        public androidx.datastore.preferences.protobuf.u a() {
            return androidx.datastore.preferences.protobuf.u.C(this.name_);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.l0
        public m0 b() {
            m0 m0VarF8 = this.options_;
            if (m0VarF8 == null) {
                m0VarF8 = m0.F8();
            }
            return m0VarF8;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.l0
        public boolean g() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.l0
        public String getName() {
            return this.name_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.l0
        public boolean h() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    public interface l extends l1.f<k, k.a> {
        boolean H();

        boolean O();

        boolean P();

        List<u0> d();

        u0 e(int index);

        int f();

        boolean j();

        u.f k();

        boolean l();

        boolean r();

        o t();
    }

    public interface l0 extends r2 {
        androidx.datastore.preferences.protobuf.u a();

        m0 b();

        boolean g();

        String getName();

        boolean h();
    }

    public static final class m extends l1.e<m, a> implements n {
        public static final int DECLARATION_FIELD_NUMBER = 2;
        private static final m DEFAULT_INSTANCE;
        public static final int FEATURES_FIELD_NUMBER = 50;
        private static volatile h3<m> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        public static final int VERIFICATION_FIELD_NUMBER = 3;
        private int bitField0_;
        private o features_;
        private byte memoizedIsInitialized = 2;
        private s1.l<u0> uninterpretedOption_ = l1.T3();
        private s1.l<b> declaration_ = l1.T3();
        private int verification_ = 1;

        public static final class a extends l1.d<m, a> implements n {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a A5(int index, b.a builderForValue) {
                V3();
                ((m) this.f50422b).J8(index, builderForValue.build());
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a A6(o.a builderForValue) {
                V3();
                ((m) this.f50422b).r9((o) builderForValue.build());
                return this;
            }

            public a B5(int index, b value) {
                V3();
                ((m) this.f50422b).J8(index, value);
                return this;
            }

            public a D5(b.a builderForValue) {
                V3();
                ((m) this.f50422b).K8(builderForValue.build());
                return this;
            }

            public a E6(o value) {
                V3();
                ((m) this.f50422b).r9(value);
                return this;
            }

            public a I5(b value) {
                V3();
                ((m) this.f50422b).K8(value);
                return this;
            }

            public a J5(int index, u0.a builderForValue) {
                V3();
                ((m) this.f50422b).L8(index, builderForValue.build());
                return this;
            }

            public a R5(int index, u0 value) {
                V3();
                ((m) this.f50422b).L8(index, value);
                return this;
            }

            public a R6(int index, u0.a builderForValue) {
                V3();
                ((m) this.f50422b).s9(index, builderForValue.build());
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.n
            public d S1() {
                return ((m) this.f50422b).S1();
            }

            public a U6(int index, u0 value) {
                V3();
                ((m) this.f50422b).s9(index, value);
                return this;
            }

            public a Y6(d value) {
                V3();
                ((m) this.f50422b).t9(value);
                return this;
            }

            public a Z5(u0.a builderForValue) {
                V3();
                ((m) this.f50422b).M8(builderForValue.build());
                return this;
            }

            public a a6(u0 value) {
                V3();
                ((m) this.f50422b).M8(value);
                return this;
            }

            public a c6() {
                V3();
                ((m) this.f50422b).N8();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.n
            public List<u0> d() {
                return Collections.unmodifiableList(((m) this.f50422b).d());
            }

            public a d6() {
                V3();
                ((m) this.f50422b).O8();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.n
            public u0 e(int index) {
                return ((m) this.f50422b).e(index);
            }

            public a e6() {
                V3();
                ((m) this.f50422b).P8();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.n
            public int f() {
                return ((m) this.f50422b).f();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.n
            public boolean f2() {
                return ((m) this.f50422b).f2();
            }

            public a i6() {
                V3();
                ((m) this.f50422b).Q8();
                return this;
            }

            public a o6(o value) {
                V3();
                ((m) this.f50422b).Y8(value);
                return this;
            }

            public a p6(int index) {
                V3();
                ((m) this.f50422b).o9(index);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.n
            public boolean r() {
                return ((m) this.f50422b).r();
            }

            public a r5(Iterable<? extends b> values) {
                V3();
                ((m) this.f50422b).H8(values);
                return this;
            }

            public a r6(int index) {
                V3();
                ((m) this.f50422b).p9(index);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.n
            public o t() {
                return ((m) this.f50422b).t();
            }

            public a t6(int index, b.a builderForValue) {
                V3();
                ((m) this.f50422b).q9(index, builderForValue.build());
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.n
            public int u0() {
                return ((m) this.f50422b).u0();
            }

            public a w6(int index, b value) {
                V3();
                ((m) this.f50422b).q9(index, value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.n
            public List<b> x0() {
                return Collections.unmodifiableList(((m) this.f50422b).x0());
            }

            public a y5(Iterable<? extends u0> values) {
                V3();
                ((m) this.f50422b).I8(values);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.n
            public b z0(int index) {
                return ((m) this.f50422b).z0(index);
            }

            private a() {
                super(m.DEFAULT_INSTANCE);
            }
        }

        public static final class b extends l1<b, a> implements c {
            private static final b DEFAULT_INSTANCE;
            public static final int FULL_NAME_FIELD_NUMBER = 2;
            public static final int NUMBER_FIELD_NUMBER = 1;
            private static volatile h3<b> PARSER = null;
            public static final int REPEATED_FIELD_NUMBER = 6;
            public static final int RESERVED_FIELD_NUMBER = 5;
            public static final int TYPE_FIELD_NUMBER = 3;
            private int bitField0_;
            private int number_;
            private boolean repeated_;
            private boolean reserved_;
            private String fullName_ = "";
            private String type_ = "";

            public static final class a extends l1.b<b, a> implements c {
                /* synthetic */ a(a aVar) {
                    this();
                }

                public a A5(String value) {
                    V3();
                    ((b) this.f50422b).O8(value);
                    return this;
                }

                public a B5(androidx.datastore.preferences.protobuf.u value) {
                    V3();
                    ((b) this.f50422b).P8(value);
                    return this;
                }

                public a L4() {
                    V3();
                    ((b) this.f50422b).o8();
                    return this;
                }

                public a P4() {
                    V3();
                    ((b) this.f50422b).p8();
                    return this;
                }

                public a Q4() {
                    V3();
                    ((b) this.f50422b).q8();
                    return this;
                }

                @Override // androidx.datastore.preferences.protobuf.e0.m.c
                public androidx.datastore.preferences.protobuf.u T1() {
                    return ((b) this.f50422b).T1();
                }

                public a U4() {
                    V3();
                    ((b) this.f50422b).r8();
                    return this;
                }

                @Override // androidx.datastore.preferences.protobuf.e0.m.c
                public boolean W() {
                    return ((b) this.f50422b).W();
                }

                public a Z4() {
                    V3();
                    ((b) this.f50422b).s8();
                    return this;
                }

                public a a5(String value) {
                    V3();
                    ((b) this.f50422b).J8(value);
                    return this;
                }

                public a b5(androidx.datastore.preferences.protobuf.u value) {
                    V3();
                    ((b) this.f50422b).K8(value);
                    return this;
                }

                @Override // androidx.datastore.preferences.protobuf.e0.m.c
                public String c() {
                    return ((b) this.f50422b).c();
                }

                public a d5(int value) {
                    V3();
                    ((b) this.f50422b).L8(value);
                    return this;
                }

                @Override // androidx.datastore.preferences.protobuf.e0.m.c
                public boolean h1() {
                    return ((b) this.f50422b).h1();
                }

                @Override // androidx.datastore.preferences.protobuf.e0.m.c
                public int i() {
                    return ((b) this.f50422b).i();
                }

                @Override // androidx.datastore.preferences.protobuf.e0.m.c
                public boolean i1() {
                    return ((b) this.f50422b).i1();
                }

                @Override // androidx.datastore.preferences.protobuf.e0.m.c
                public boolean j1() {
                    return ((b) this.f50422b).j1();
                }

                @Override // androidx.datastore.preferences.protobuf.e0.m.c
                public String k1() {
                    return ((b) this.f50422b).k1();
                }

                @Override // androidx.datastore.preferences.protobuf.e0.m.c
                public boolean l1() {
                    return ((b) this.f50422b).l1();
                }

                @Override // androidx.datastore.preferences.protobuf.e0.m.c
                public boolean p1() {
                    return ((b) this.f50422b).p1();
                }

                public a r5(boolean value) {
                    V3();
                    ((b) this.f50422b).M8(value);
                    return this;
                }

                @Override // androidx.datastore.preferences.protobuf.e0.m.c
                public androidx.datastore.preferences.protobuf.u s() {
                    return ((b) this.f50422b).s();
                }

                @Override // androidx.datastore.preferences.protobuf.e0.m.c
                public boolean t1() {
                    return ((b) this.f50422b).t1();
                }

                public a y5(boolean value) {
                    V3();
                    ((b) this.f50422b).N8(value);
                    return this;
                }

                private a() {
                    super(b.DEFAULT_INSTANCE);
                }
            }

            static {
                b bVar = new b();
                DEFAULT_INSTANCE = bVar;
                l1.Y6(b.class, bVar);
            }

            private b() {
            }

            public static b A8(androidx.datastore.preferences.protobuf.z input) throws IOException {
                return (b) l1.a6(DEFAULT_INSTANCE, input);
            }

            public static b B8(androidx.datastore.preferences.protobuf.z input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
                return (b) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static b C8(InputStream input) throws IOException {
                return (b) l1.d6(DEFAULT_INSTANCE, input);
            }

            public static b D8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
                return (b) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static b E8(ByteBuffer data) throws t1 {
                return (b) l1.i6(DEFAULT_INSTANCE, data);
            }

            public static b F8(ByteBuffer data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
                return (b) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static b G8(byte[] data) throws t1 {
                return (b) l1.p6(DEFAULT_INSTANCE, data);
            }

            public static b H8(byte[] data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
                return (b) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static h3<b> I8() {
                return DEFAULT_INSTANCE.W7();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void J8(String value) {
                value.getClass();
                this.bitField0_ |= 2;
                this.fullName_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void K8(androidx.datastore.preferences.protobuf.u value) {
                this.fullName_ = value.A0();
                this.bitField0_ |= 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void L8(int value) {
                this.bitField0_ |= 1;
                this.number_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void M8(boolean value) {
                this.bitField0_ |= 16;
                this.repeated_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void N8(boolean value) {
                this.bitField0_ |= 8;
                this.reserved_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void O8(String value) {
                value.getClass();
                this.bitField0_ |= 4;
                this.type_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void P8(androidx.datastore.preferences.protobuf.u value) {
                this.type_ = value.A0();
                this.bitField0_ |= 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void o8() {
                this.bitField0_ &= -3;
                this.fullName_ = t8().k1();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void p8() {
                this.bitField0_ &= -2;
                this.number_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void q8() {
                this.bitField0_ &= -17;
                this.repeated_ = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void r8() {
                this.bitField0_ &= -9;
                this.reserved_ = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void s8() {
                this.bitField0_ &= -5;
                this.type_ = t8().c();
            }

            public static b t8() {
                return DEFAULT_INSTANCE;
            }

            public static a u8() {
                return DEFAULT_INSTANCE.s3();
            }

            public static a v8(b prototype) {
                return DEFAULT_INSTANCE.v3(prototype);
            }

            public static b w8(InputStream input) throws IOException {
                return (b) l1.J5(DEFAULT_INSTANCE, input);
            }

            public static b x8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
                return (b) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static b y8(androidx.datastore.preferences.protobuf.u data) throws t1 {
                return (b) l1.R5(DEFAULT_INSTANCE, data);
            }

            public static b z8(androidx.datastore.preferences.protobuf.u data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
                return (b) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            @Override // androidx.datastore.preferences.protobuf.l1
            protected final Object D3(l1.i method, Object arg0, Object arg1) {
                h3 cVar;
                int i10 = a.f50068a[method.ordinal()];
                a aVar = null;
                switch (i10) {
                    case 1:
                        return new b();
                    case 2:
                        return new a(aVar);
                    case 3:
                        return l1.A5(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"bitField0_", "number_", "fullName_", "type_", "reserved_", "repeated_"});
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

            @Override // androidx.datastore.preferences.protobuf.e0.m.c
            public androidx.datastore.preferences.protobuf.u T1() {
                return androidx.datastore.preferences.protobuf.u.C(this.fullName_);
            }

            @Override // androidx.datastore.preferences.protobuf.e0.m.c
            public boolean W() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.m.c
            public String c() {
                return this.type_;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.m.c
            public boolean h1() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.m.c
            public int i() {
                return this.number_;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.m.c
            public boolean i1() {
                return this.reserved_;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.m.c
            public boolean j1() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.m.c
            public String k1() {
                return this.fullName_;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.m.c
            public boolean l1() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.m.c
            public boolean p1() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.m.c
            public androidx.datastore.preferences.protobuf.u s() {
                return androidx.datastore.preferences.protobuf.u.C(this.type_);
            }

            @Override // androidx.datastore.preferences.protobuf.e0.m.c
            public boolean t1() {
                return this.repeated_;
            }
        }

        public interface c extends r2 {
            androidx.datastore.preferences.protobuf.u T1();

            boolean W();

            String c();

            boolean h1();

            int i();

            boolean i1();

            boolean j1();

            String k1();

            boolean l1();

            boolean p1();

            androidx.datastore.preferences.protobuf.u s();

            boolean t1();
        }

        public enum d implements s1.c {
            DECLARATION(0),
            UNVERIFIED(1);


            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f50125d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f50126e = 1;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static final s1.d<d> f50127f = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f50129a;

            class a implements s1.d<d> {
                a() {
                }

                @Override // androidx.datastore.preferences.protobuf.s1.d
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public d a(int number) {
                    return d.b(number);
                }
            }

            private static final class b implements s1.e {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                static final s1.e f50130a = new b();

                private b() {
                }

                @Override // androidx.datastore.preferences.protobuf.s1.e
                public boolean a(int number) {
                    return d.b(number) != null;
                }
            }

            d(int value) {
                this.f50129a = value;
            }

            public static d b(int value) {
                if (value == 0) {
                    return DECLARATION;
                }
                if (value != 1) {
                    return null;
                }
                return UNVERIFIED;
            }

            public static s1.d<d> k() {
                return f50127f;
            }

            public static s1.e l() {
                return b.f50130a;
            }

            @Deprecated
            public static d n(int value) {
                return b(value);
            }

            @Override // androidx.datastore.preferences.protobuf.s1.c
            public final int i() {
                return this.f50129a;
            }
        }

        static {
            m mVar = new m();
            DEFAULT_INSTANCE = mVar;
            l1.Y6(m.class, mVar);
        }

        private m() {
            int i10 = 1 & 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void H8(Iterable<? extends b> values) {
            R8();
            androidx.datastore.preferences.protobuf.a.m(values, this.declaration_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void I8(Iterable<? extends u0> values) {
            S8();
            androidx.datastore.preferences.protobuf.a.m(values, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void J8(int index, b value) {
            value.getClass();
            R8();
            this.declaration_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void K8(b value) {
            value.getClass();
            R8();
            this.declaration_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void L8(int index, u0 value) {
            value.getClass();
            S8();
            this.uninterpretedOption_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void M8(u0 value) {
            value.getClass();
            S8();
            this.uninterpretedOption_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void N8() {
            this.declaration_ = l1.T3();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void O8() {
            this.features_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void P8() {
            this.uninterpretedOption_ = l1.T3();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Q8() {
            this.bitField0_ &= -3;
            this.verification_ = 1;
        }

        private void R8() {
            s1.l<b> lVar = this.declaration_;
            if (lVar.s1()) {
                return;
            }
            this.declaration_ = l1.r5(lVar);
        }

        private void S8() {
            s1.l<u0> lVar = this.uninterpretedOption_;
            if (lVar.s1()) {
                return;
            }
            this.uninterpretedOption_ = l1.r5(lVar);
        }

        public static m V8() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void Y8(o value) {
            value.getClass();
            o oVar = this.features_;
            if (oVar == null || oVar == o.I8()) {
                this.features_ = value;
            } else {
                this.features_ = ((o.a) o.K8(this.features_).u4(value)).B1();
            }
            this.bitField0_ |= 1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a Z8() {
            return (a) DEFAULT_INSTANCE.s3();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a a9(m prototype) {
            return (a) DEFAULT_INSTANCE.v3(prototype);
        }

        public static m b9(InputStream input) throws IOException {
            return (m) l1.J5(DEFAULT_INSTANCE, input);
        }

        public static m c9(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (m) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static m d9(androidx.datastore.preferences.protobuf.u data) throws t1 {
            return (m) l1.R5(DEFAULT_INSTANCE, data);
        }

        public static m e9(androidx.datastore.preferences.protobuf.u data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (m) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static m f9(androidx.datastore.preferences.protobuf.z input) throws IOException {
            return (m) l1.a6(DEFAULT_INSTANCE, input);
        }

        public static m g9(androidx.datastore.preferences.protobuf.z input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (m) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static m h9(InputStream input) throws IOException {
            return (m) l1.d6(DEFAULT_INSTANCE, input);
        }

        public static m i9(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (m) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static m j9(ByteBuffer data) throws t1 {
            return (m) l1.i6(DEFAULT_INSTANCE, data);
        }

        public static m k9(ByteBuffer data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (m) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static m l9(byte[] data) throws t1 {
            return (m) l1.p6(DEFAULT_INSTANCE, data);
        }

        public static m m9(byte[] data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (m) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static h3<m> n9() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o9(int index) {
            R8();
            this.declaration_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p9(int index) {
            S8();
            this.uninterpretedOption_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q9(int index, b value) {
            value.getClass();
            R8();
            this.declaration_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void r9(o value) {
            value.getClass();
            this.features_ = value;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s9(int index, u0 value) {
            value.getClass();
            S8();
            this.uninterpretedOption_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t9(d value) {
            this.verification_ = value.i();
            this.bitField0_ |= 2;
        }

        @Override // androidx.datastore.preferences.protobuf.l1
        protected final Object D3(l1.i method, Object arg0, Object arg1) {
            h3 cVar;
            a aVar = null;
            switch (a.f50068a[method.ordinal()]) {
                case 1:
                    return new m();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.A5(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0002ϧ\u0004\u0000\u0002\u0002\u0002\u001b\u0003᠌\u00012ᐉ\u0000ϧЛ", new Object[]{"bitField0_", "declaration_", b.class, "verification_", d.l(), "features_", "uninterpretedOption_", u0.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    h3<m> h3Var = PARSER;
                    if (h3Var != null) {
                        return h3Var;
                    }
                    synchronized (m.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.e0.n
        public d S1() {
            d dVarB = d.b(this.verification_);
            return dVarB == null ? d.UNVERIFIED : dVarB;
        }

        public c T8(int index) {
            return this.declaration_.get(index);
        }

        public List<? extends c> U8() {
            return this.declaration_;
        }

        public v0 W8(int index) {
            return this.uninterpretedOption_.get(index);
        }

        public List<? extends v0> X8() {
            return this.uninterpretedOption_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.n
        public List<u0> d() {
            return this.uninterpretedOption_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.n
        public u0 e(int index) {
            return this.uninterpretedOption_.get(index);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.n
        public int f() {
            return this.uninterpretedOption_.size();
        }

        @Override // androidx.datastore.preferences.protobuf.e0.n
        public boolean f2() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.n
        public boolean r() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.n
        public o t() {
            o oVarI8 = this.features_;
            if (oVarI8 == null) {
                oVarI8 = o.I8();
            }
            return oVarI8;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.n
        public int u0() {
            return this.declaration_.size();
        }

        @Override // androidx.datastore.preferences.protobuf.e0.n
        public List<b> x0() {
            return this.declaration_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.n
        public b z0(int index) {
            return this.declaration_.get(index);
        }
    }

    public static final class m0 extends l1.e<m0, a> implements n0 {
        private static final m0 DEFAULT_INSTANCE;
        public static final int FEATURES_FIELD_NUMBER = 1;
        private static volatile h3<m0> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private o features_;
        private byte memoizedIsInitialized = 2;
        private s1.l<u0> uninterpretedOption_ = l1.T3();

        public static final class a extends l1.d<m0, a> implements n0 {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a A5(int index, u0 value) {
                V3();
                ((m0) this.f50422b).A8(index, value);
                return this;
            }

            public a B5(u0.a builderForValue) {
                V3();
                ((m0) this.f50422b).B8(builderForValue.build());
                return this;
            }

            public a D5(u0 value) {
                V3();
                ((m0) this.f50422b).B8(value);
                return this;
            }

            public a I5() {
                V3();
                ((m0) this.f50422b).C8();
                return this;
            }

            public a J5() {
                V3();
                ((m0) this.f50422b).D8();
                return this;
            }

            public a R5(o value) {
                V3();
                ((m0) this.f50422b).I8(value);
                return this;
            }

            public a Z5(int index) {
                V3();
                ((m0) this.f50422b).Y8(index);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a a6(o.a builderForValue) {
                V3();
                ((m0) this.f50422b).Z8((o) builderForValue.build());
                return this;
            }

            public a c6(o value) {
                V3();
                ((m0) this.f50422b).Z8(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.n0
            public List<u0> d() {
                return Collections.unmodifiableList(((m0) this.f50422b).d());
            }

            public a d6(int index, u0.a builderForValue) {
                V3();
                ((m0) this.f50422b).a9(index, builderForValue.build());
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.n0
            public u0 e(int index) {
                return ((m0) this.f50422b).e(index);
            }

            public a e6(int index, u0 value) {
                V3();
                ((m0) this.f50422b).a9(index, value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.n0
            public int f() {
                return ((m0) this.f50422b).f();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.n0
            public boolean r() {
                return ((m0) this.f50422b).r();
            }

            public a r5(Iterable<? extends u0> values) {
                V3();
                ((m0) this.f50422b).z8(values);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.n0
            public o t() {
                return ((m0) this.f50422b).t();
            }

            public a y5(int index, u0.a builderForValue) {
                V3();
                ((m0) this.f50422b).A8(index, builderForValue.build());
                return this;
            }

            private a() {
                super(m0.DEFAULT_INSTANCE);
            }
        }

        static {
            m0 m0Var = new m0();
            DEFAULT_INSTANCE = m0Var;
            l1.Y6(m0.class, m0Var);
        }

        private m0() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void A8(int index, u0 value) {
            value.getClass();
            E8();
            this.uninterpretedOption_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void B8(u0 value) {
            value.getClass();
            E8();
            this.uninterpretedOption_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C8() {
            this.features_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void D8() {
            this.uninterpretedOption_ = l1.T3();
        }

        private void E8() {
            s1.l<u0> lVar = this.uninterpretedOption_;
            if (lVar.s1()) {
                return;
            }
            this.uninterpretedOption_ = l1.r5(lVar);
        }

        public static m0 F8() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void I8(o value) {
            value.getClass();
            o oVar = this.features_;
            if (oVar == null || oVar == o.I8()) {
                this.features_ = value;
            } else {
                this.features_ = ((o.a) o.K8(this.features_).u4(value)).B1();
            }
            this.bitField0_ |= 1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a J8() {
            return (a) DEFAULT_INSTANCE.s3();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a K8(m0 prototype) {
            return (a) DEFAULT_INSTANCE.v3(prototype);
        }

        public static m0 L8(InputStream input) throws IOException {
            return (m0) l1.J5(DEFAULT_INSTANCE, input);
        }

        public static m0 M8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (m0) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static m0 N8(androidx.datastore.preferences.protobuf.u data) throws t1 {
            return (m0) l1.R5(DEFAULT_INSTANCE, data);
        }

        public static m0 O8(androidx.datastore.preferences.protobuf.u data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (m0) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static m0 P8(androidx.datastore.preferences.protobuf.z input) throws IOException {
            return (m0) l1.a6(DEFAULT_INSTANCE, input);
        }

        public static m0 Q8(androidx.datastore.preferences.protobuf.z input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (m0) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static m0 R8(InputStream input) throws IOException {
            return (m0) l1.d6(DEFAULT_INSTANCE, input);
        }

        public static m0 S8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (m0) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static m0 T8(ByteBuffer data) throws t1 {
            return (m0) l1.i6(DEFAULT_INSTANCE, data);
        }

        public static m0 U8(ByteBuffer data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (m0) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static m0 V8(byte[] data) throws t1 {
            return (m0) l1.p6(DEFAULT_INSTANCE, data);
        }

        public static m0 W8(byte[] data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (m0) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static h3<m0> X8() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Y8(int index) {
            E8();
            this.uninterpretedOption_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Z8(o value) {
            value.getClass();
            this.features_ = value;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a9(int index, u0 value) {
            value.getClass();
            E8();
            this.uninterpretedOption_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void z8(Iterable<? extends u0> values) {
            E8();
            androidx.datastore.preferences.protobuf.a.m(values, this.uninterpretedOption_);
        }

        @Override // androidx.datastore.preferences.protobuf.l1
        protected final Object D3(l1.i method, Object arg0, Object arg1) {
            h3 cVar;
            a aVar = null;
            switch (a.f50068a[method.ordinal()]) {
                case 1:
                    return new m0();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.A5(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001ϧ\u0002\u0000\u0001\u0002\u0001ᐉ\u0000ϧЛ", new Object[]{"bitField0_", "features_", "uninterpretedOption_", u0.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    h3<m0> h3Var = PARSER;
                    if (h3Var != null) {
                        return h3Var;
                    }
                    synchronized (m0.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public v0 G8(int index) {
            return this.uninterpretedOption_.get(index);
        }

        public List<? extends v0> H8() {
            return this.uninterpretedOption_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.n0
        public List<u0> d() {
            return this.uninterpretedOption_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.n0
        public u0 e(int index) {
            return this.uninterpretedOption_.get(index);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.n0
        public int f() {
            return this.uninterpretedOption_.size();
        }

        @Override // androidx.datastore.preferences.protobuf.e0.n0
        public boolean r() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.n0
        public o t() {
            o oVarI8 = this.features_;
            if (oVarI8 == null) {
                oVarI8 = o.I8();
            }
            return oVarI8;
        }
    }

    public interface n extends l1.f<m, m.a> {
        m.d S1();

        List<u0> d();

        u0 e(int index);

        int f();

        boolean f2();

        boolean r();

        o t();

        int u0();

        List<m.b> x0();

        m.b z0(int index);
    }

    public interface n0 extends l1.f<m0, m0.a> {
        List<u0> d();

        u0 e(int index);

        int f();

        boolean r();

        o t();
    }

    public static final class o extends l1.e<o, a> implements r {
        private static final o DEFAULT_INSTANCE;
        public static final int ENUM_TYPE_FIELD_NUMBER = 2;
        public static final int FIELD_PRESENCE_FIELD_NUMBER = 1;
        public static final int JSON_FORMAT_FIELD_NUMBER = 6;
        public static final int MESSAGE_ENCODING_FIELD_NUMBER = 5;
        private static volatile h3<o> PARSER = null;
        public static final int REPEATED_FIELD_ENCODING_FIELD_NUMBER = 3;
        public static final int UTF8_VALIDATION_FIELD_NUMBER = 4;
        private int bitField0_;
        private int enumType_;
        private int fieldPresence_;
        private int jsonFormat_;
        private byte memoizedIsInitialized = 2;
        private int messageEncoding_;
        private int repeatedFieldEncoding_;
        private int utf8Validation_;

        public static final class a extends l1.d<o, a> implements r {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.r
            public b A() {
                return ((o) this.f50422b).A();
            }

            public a A5() {
                V3();
                ((o) this.f50422b).E8();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.r
            public e B() {
                return ((o) this.f50422b).B();
            }

            public a B5() {
                V3();
                ((o) this.f50422b).F8();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.r
            public f D0() {
                return ((o) this.f50422b).D0();
            }

            public a D5() {
                V3();
                ((o) this.f50422b).G8();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.r
            public boolean E0() {
                return ((o) this.f50422b).E0();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.r
            public boolean E1() {
                return ((o) this.f50422b).E1();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.r
            public g F() {
                return ((o) this.f50422b).F();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.r
            public boolean F1() {
                return ((o) this.f50422b).F1();
            }

            public a I5() {
                V3();
                ((o) this.f50422b).H8();
                return this;
            }

            public a J5(b value) {
                V3();
                ((o) this.f50422b).Y8(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.r
            public c L1() {
                return ((o) this.f50422b).L1();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.r
            public boolean N() {
                return ((o) this.f50422b).N();
            }

            public a R5(c value) {
                V3();
                ((o) this.f50422b).Z8(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.r
            public d Y0() {
                return ((o) this.f50422b).Y0();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.r
            public boolean Z0() {
                return ((o) this.f50422b).Z0();
            }

            public a Z5(d value) {
                V3();
                ((o) this.f50422b).a9(value);
                return this;
            }

            public a a6(e value) {
                V3();
                ((o) this.f50422b).b9(value);
                return this;
            }

            public a c6(f value) {
                V3();
                ((o) this.f50422b).c9(value);
                return this;
            }

            public a d6(g value) {
                V3();
                ((o) this.f50422b).d9(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.r
            public boolean g0() {
                return ((o) this.f50422b).g0();
            }

            public a r5() {
                V3();
                ((o) this.f50422b).C8();
                return this;
            }

            public a y5() {
                V3();
                ((o) this.f50422b).D8();
                return this;
            }

            private a() {
                super(o.DEFAULT_INSTANCE);
            }
        }

        public enum b implements s1.c {
            ENUM_TYPE_UNKNOWN(0),
            OPEN(1),
            CLOSED(2);


            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f50134e = 0;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f50135f = 1;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f50136g = 2;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static final s1.d<b> f50137h = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f50139a;

            class a implements s1.d<b> {
                a() {
                }

                @Override // androidx.datastore.preferences.protobuf.s1.d
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public b a(int number) {
                    return b.b(number);
                }
            }

            /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.e0$o$b$b, reason: collision with other inner class name */
            private static final class C0453b implements s1.e {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                static final s1.e f50140a = new C0453b();

                private C0453b() {
                }

                @Override // androidx.datastore.preferences.protobuf.s1.e
                public boolean a(int number) {
                    return b.b(number) != null;
                }
            }

            b(int value) {
                this.f50139a = value;
            }

            public static b b(int value) {
                if (value == 0) {
                    return ENUM_TYPE_UNKNOWN;
                }
                if (value == 1) {
                    return OPEN;
                }
                if (value != 2) {
                    return null;
                }
                return CLOSED;
            }

            public static s1.d<b> k() {
                return f50137h;
            }

            public static s1.e l() {
                return C0453b.f50140a;
            }

            @Deprecated
            public static b n(int value) {
                return b(value);
            }

            @Override // androidx.datastore.preferences.protobuf.s1.c
            public final int i() {
                return this.f50139a;
            }
        }

        public enum c implements s1.c {
            FIELD_PRESENCE_UNKNOWN(0),
            EXPLICIT(1),
            IMPLICIT(2),
            LEGACY_REQUIRED(3);


            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f50145f = 0;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f50146g = 1;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final int f50147h = 2;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public static final int f50148i = 3;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static final s1.d<c> f50149j = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f50151a;

            class a implements s1.d<c> {
                a() {
                }

                @Override // androidx.datastore.preferences.protobuf.s1.d
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public c a(int number) {
                    return c.b(number);
                }
            }

            private static final class b implements s1.e {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                static final s1.e f50152a = new b();

                private b() {
                }

                @Override // androidx.datastore.preferences.protobuf.s1.e
                public boolean a(int number) {
                    return c.b(number) != null;
                }
            }

            c(int value) {
                this.f50151a = value;
            }

            public static c b(int value) {
                if (value == 0) {
                    return FIELD_PRESENCE_UNKNOWN;
                }
                if (value == 1) {
                    return EXPLICIT;
                }
                if (value == 2) {
                    return IMPLICIT;
                }
                if (value != 3) {
                    return null;
                }
                return LEGACY_REQUIRED;
            }

            public static s1.d<c> k() {
                return f50149j;
            }

            public static s1.e l() {
                return b.f50152a;
            }

            @Deprecated
            public static c n(int value) {
                return b(value);
            }

            @Override // androidx.datastore.preferences.protobuf.s1.c
            public final int i() {
                return this.f50151a;
            }
        }

        public enum d implements s1.c {
            JSON_FORMAT_UNKNOWN(0),
            ALLOW(1),
            LEGACY_BEST_EFFORT(2);


            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f50156e = 0;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f50157f = 1;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f50158g = 2;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static final s1.d<d> f50159h = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f50161a;

            class a implements s1.d<d> {
                a() {
                }

                @Override // androidx.datastore.preferences.protobuf.s1.d
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public d a(int number) {
                    return d.b(number);
                }
            }

            private static final class b implements s1.e {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                static final s1.e f50162a = new b();

                private b() {
                }

                @Override // androidx.datastore.preferences.protobuf.s1.e
                public boolean a(int number) {
                    return d.b(number) != null;
                }
            }

            d(int value) {
                this.f50161a = value;
            }

            public static d b(int value) {
                if (value == 0) {
                    return JSON_FORMAT_UNKNOWN;
                }
                if (value == 1) {
                    return ALLOW;
                }
                if (value != 2) {
                    return null;
                }
                return LEGACY_BEST_EFFORT;
            }

            public static s1.d<d> k() {
                return f50159h;
            }

            public static s1.e l() {
                return b.f50162a;
            }

            @Deprecated
            public static d n(int value) {
                return b(value);
            }

            @Override // androidx.datastore.preferences.protobuf.s1.c
            public final int i() {
                return this.f50161a;
            }
        }

        public enum e implements s1.c {
            MESSAGE_ENCODING_UNKNOWN(0),
            LENGTH_PREFIXED(1),
            DELIMITED(2);


            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f50166e = 0;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f50167f = 1;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f50168g = 2;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static final s1.d<e> f50169h = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f50171a;

            class a implements s1.d<e> {
                a() {
                }

                @Override // androidx.datastore.preferences.protobuf.s1.d
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public e a(int number) {
                    return e.b(number);
                }
            }

            private static final class b implements s1.e {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                static final s1.e f50172a = new b();

                private b() {
                }

                @Override // androidx.datastore.preferences.protobuf.s1.e
                public boolean a(int number) {
                    return e.b(number) != null;
                }
            }

            e(int value) {
                this.f50171a = value;
            }

            public static e b(int value) {
                if (value == 0) {
                    return MESSAGE_ENCODING_UNKNOWN;
                }
                if (value == 1) {
                    return LENGTH_PREFIXED;
                }
                if (value != 2) {
                    return null;
                }
                return DELIMITED;
            }

            public static s1.d<e> k() {
                return f50169h;
            }

            public static s1.e l() {
                return b.f50172a;
            }

            @Deprecated
            public static e n(int value) {
                return b(value);
            }

            @Override // androidx.datastore.preferences.protobuf.s1.c
            public final int i() {
                return this.f50171a;
            }
        }

        public enum f implements s1.c {
            REPEATED_FIELD_ENCODING_UNKNOWN(0),
            PACKED(1),
            EXPANDED(2);


            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f50176e = 0;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f50177f = 1;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f50178g = 2;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static final s1.d<f> f50179h = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f50181a;

            class a implements s1.d<f> {
                a() {
                }

                @Override // androidx.datastore.preferences.protobuf.s1.d
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public f a(int number) {
                    return f.b(number);
                }
            }

            private static final class b implements s1.e {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                static final s1.e f50182a = new b();

                private b() {
                }

                @Override // androidx.datastore.preferences.protobuf.s1.e
                public boolean a(int number) {
                    return f.b(number) != null;
                }
            }

            f(int value) {
                this.f50181a = value;
            }

            public static f b(int value) {
                if (value == 0) {
                    return REPEATED_FIELD_ENCODING_UNKNOWN;
                }
                if (value == 1) {
                    return PACKED;
                }
                if (value != 2) {
                    return null;
                }
                return EXPANDED;
            }

            public static s1.d<f> k() {
                return f50179h;
            }

            public static s1.e l() {
                return b.f50182a;
            }

            @Deprecated
            public static f n(int value) {
                return b(value);
            }

            @Override // androidx.datastore.preferences.protobuf.s1.c
            public final int i() {
                return this.f50181a;
            }
        }

        public enum g implements s1.c {
            UTF8_VALIDATION_UNKNOWN(0),
            VERIFY(2),
            NONE(3);


            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f50186e = 0;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f50187f = 2;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f50188g = 3;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static final s1.d<g> f50189h = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f50191a;

            class a implements s1.d<g> {
                a() {
                }

                @Override // androidx.datastore.preferences.protobuf.s1.d
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public g a(int number) {
                    return g.b(number);
                }
            }

            private static final class b implements s1.e {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                static final s1.e f50192a = new b();

                private b() {
                }

                @Override // androidx.datastore.preferences.protobuf.s1.e
                public boolean a(int number) {
                    return g.b(number) != null;
                }
            }

            g(int value) {
                this.f50191a = value;
            }

            public static g b(int value) {
                if (value == 0) {
                    return UTF8_VALIDATION_UNKNOWN;
                }
                if (value == 2) {
                    return VERIFY;
                }
                if (value != 3) {
                    return null;
                }
                return NONE;
            }

            public static s1.d<g> k() {
                return f50189h;
            }

            public static s1.e l() {
                return b.f50192a;
            }

            @Deprecated
            public static g n(int value) {
                return b(value);
            }

            @Override // androidx.datastore.preferences.protobuf.s1.c
            public final int i() {
                return this.f50191a;
            }
        }

        static {
            o oVar = new o();
            DEFAULT_INSTANCE = oVar;
            l1.Y6(o.class, oVar);
        }

        private o() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C8() {
            this.bitField0_ &= -3;
            this.enumType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void D8() {
            this.bitField0_ &= -2;
            this.fieldPresence_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void E8() {
            this.bitField0_ &= -33;
            int i10 = 2 & 0;
            this.jsonFormat_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void F8() {
            this.bitField0_ &= -17;
            this.messageEncoding_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void G8() {
            this.bitField0_ &= -5;
            this.repeatedFieldEncoding_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void H8() {
            this.bitField0_ &= -9;
            this.utf8Validation_ = 0;
        }

        public static o I8() {
            return DEFAULT_INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a J8() {
            return (a) DEFAULT_INSTANCE.s3();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a K8(o prototype) {
            return (a) DEFAULT_INSTANCE.v3(prototype);
        }

        public static o L8(InputStream input) throws IOException {
            return (o) l1.J5(DEFAULT_INSTANCE, input);
        }

        public static o M8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (o) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static o N8(androidx.datastore.preferences.protobuf.u data) throws t1 {
            return (o) l1.R5(DEFAULT_INSTANCE, data);
        }

        public static o O8(androidx.datastore.preferences.protobuf.u data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (o) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static o P8(androidx.datastore.preferences.protobuf.z input) throws IOException {
            return (o) l1.a6(DEFAULT_INSTANCE, input);
        }

        public static o Q8(androidx.datastore.preferences.protobuf.z input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (o) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static o R8(InputStream input) throws IOException {
            return (o) l1.d6(DEFAULT_INSTANCE, input);
        }

        public static o S8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (o) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static o T8(ByteBuffer data) throws t1 {
            return (o) l1.i6(DEFAULT_INSTANCE, data);
        }

        public static o U8(ByteBuffer data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (o) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static o V8(byte[] data) throws t1 {
            return (o) l1.p6(DEFAULT_INSTANCE, data);
        }

        public static o W8(byte[] data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (o) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static h3<o> X8() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Y8(b value) {
            this.enumType_ = value.i();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Z8(c value) {
            this.fieldPresence_ = value.i();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a9(d value) {
            this.jsonFormat_ = value.i();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b9(e value) {
            this.messageEncoding_ = value.i();
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c9(f value) {
            this.repeatedFieldEncoding_ = value.i();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d9(g value) {
            this.utf8Validation_ = value.i();
            this.bitField0_ |= 8;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.r
        public b A() {
            b bVarB = b.b(this.enumType_);
            if (bVarB == null) {
                bVarB = b.ENUM_TYPE_UNKNOWN;
            }
            return bVarB;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.r
        public e B() {
            e eVarB = e.b(this.messageEncoding_);
            if (eVarB == null) {
                eVarB = e.MESSAGE_ENCODING_UNKNOWN;
            }
            return eVarB;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.r
        public f D0() {
            f fVarB = f.b(this.repeatedFieldEncoding_);
            return fVarB == null ? f.REPEATED_FIELD_ENCODING_UNKNOWN : fVarB;
        }

        @Override // androidx.datastore.preferences.protobuf.l1
        protected final Object D3(l1.i method, Object arg0, Object arg1) {
            h3 cVar;
            a aVar = null;
            switch (a.f50068a[method.ordinal()]) {
                case 1:
                    return new o();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.A5(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005", new Object[]{"bitField0_", "fieldPresence_", c.l(), "enumType_", b.l(), "repeatedFieldEncoding_", f.l(), "utf8Validation_", g.l(), "messageEncoding_", e.l(), "jsonFormat_", d.l()});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    h3<o> h3Var = PARSER;
                    if (h3Var != null) {
                        return h3Var;
                    }
                    synchronized (o.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.e0.r
        public boolean E0() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.r
        public boolean E1() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.r
        public g F() {
            g gVarB = g.b(this.utf8Validation_);
            return gVarB == null ? g.UTF8_VALIDATION_UNKNOWN : gVarB;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.r
        public boolean F1() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.r
        public c L1() {
            c cVarB = c.b(this.fieldPresence_);
            return cVarB == null ? c.FIELD_PRESENCE_UNKNOWN : cVarB;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.r
        public boolean N() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.r
        public d Y0() {
            d dVarB = d.b(this.jsonFormat_);
            if (dVarB == null) {
                dVarB = d.JSON_FORMAT_UNKNOWN;
            }
            return dVarB;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.r
        public boolean Z0() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.r
        public boolean g0() {
            return (this.bitField0_ & 32) != 0;
        }
    }

    public static final class o0 extends l1<o0, a> implements p0 {
        private static final o0 DEFAULT_INSTANCE;
        public static final int METHOD_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static volatile h3<o0> PARSER;
        private int bitField0_;
        private q0 options_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private s1.l<g0> method_ = l1.T3();

        public static final class a extends l1.b<o0, a> implements p0 {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a A5(int index, g0.a builderForValue) {
                V3();
                ((o0) this.f50422b).P8(index, builderForValue.build());
                return this;
            }

            public a B5(int index, g0 value) {
                V3();
                ((o0) this.f50422b).P8(index, value);
                return this;
            }

            public a D5(String value) {
                V3();
                ((o0) this.f50422b).Q8(value);
                return this;
            }

            public a I5(androidx.datastore.preferences.protobuf.u value) {
                V3();
                ((o0) this.f50422b).R8(value);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a J5(q0.a builderForValue) {
                V3();
                ((o0) this.f50422b).S8((q0) builderForValue.build());
                return this;
            }

            public a L4(Iterable<? extends g0> values) {
                V3();
                ((o0) this.f50422b).o8(values);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.p0
            public g0 M7(int index) {
                return ((o0) this.f50422b).M7(index);
            }

            public a P4(int index, g0.a builderForValue) {
                V3();
                ((o0) this.f50422b).p8(index, builderForValue.build());
                return this;
            }

            public a Q4(int index, g0 value) {
                V3();
                ((o0) this.f50422b).p8(index, value);
                return this;
            }

            public a R5(q0 value) {
                V3();
                ((o0) this.f50422b).S8(value);
                return this;
            }

            public a U4(g0.a builderForValue) {
                V3();
                ((o0) this.f50422b).q8(builderForValue.build());
                return this;
            }

            public a Z4(g0 value) {
                V3();
                ((o0) this.f50422b).q8(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.p0
            public androidx.datastore.preferences.protobuf.u a() {
                return ((o0) this.f50422b).a();
            }

            public a a5() {
                V3();
                ((o0) this.f50422b).r8();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.p0
            public q0 b() {
                return ((o0) this.f50422b).b();
            }

            public a b5() {
                V3();
                ((o0) this.f50422b).s8();
                return this;
            }

            public a d5() {
                V3();
                ((o0) this.f50422b).t8();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.p0
            public boolean g() {
                return ((o0) this.f50422b).g();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.p0
            public String getName() {
                return ((o0) this.f50422b).getName();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.p0
            public boolean h() {
                return ((o0) this.f50422b).h();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.p0
            public int p7() {
                return ((o0) this.f50422b).p7();
            }

            public a r5(q0 value) {
                V3();
                ((o0) this.f50422b).y8(value);
                return this;
            }

            public a y5(int index) {
                V3();
                ((o0) this.f50422b).O8(index);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.p0
            public List<g0> z4() {
                return Collections.unmodifiableList(((o0) this.f50422b).z4());
            }

            private a() {
                super(o0.DEFAULT_INSTANCE);
            }
        }

        static {
            o0 o0Var = new o0();
            DEFAULT_INSTANCE = o0Var;
            l1.Y6(o0.class, o0Var);
        }

        private o0() {
        }

        public static a A8(o0 prototype) {
            return DEFAULT_INSTANCE.v3(prototype);
        }

        public static o0 B8(InputStream input) throws IOException {
            return (o0) l1.J5(DEFAULT_INSTANCE, input);
        }

        public static o0 C8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (o0) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static o0 D8(androidx.datastore.preferences.protobuf.u data) throws t1 {
            return (o0) l1.R5(DEFAULT_INSTANCE, data);
        }

        public static o0 E8(androidx.datastore.preferences.protobuf.u data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (o0) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static o0 F8(androidx.datastore.preferences.protobuf.z input) throws IOException {
            return (o0) l1.a6(DEFAULT_INSTANCE, input);
        }

        public static o0 G8(androidx.datastore.preferences.protobuf.z input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (o0) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static o0 H8(InputStream input) throws IOException {
            return (o0) l1.d6(DEFAULT_INSTANCE, input);
        }

        public static o0 I8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (o0) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static o0 J8(ByteBuffer data) throws t1 {
            return (o0) l1.i6(DEFAULT_INSTANCE, data);
        }

        public static o0 K8(ByteBuffer data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (o0) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static o0 L8(byte[] data) throws t1 {
            return (o0) l1.p6(DEFAULT_INSTANCE, data);
        }

        public static o0 M8(byte[] data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (o0) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static h3<o0> N8() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void O8(int index) {
            u8();
            this.method_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void P8(int index, g0 value) {
            value.getClass();
            u8();
            this.method_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Q8(String value) {
            value.getClass();
            this.bitField0_ |= 1;
            this.name_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void R8(androidx.datastore.preferences.protobuf.u value) {
            this.name_ = value.A0();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void S8(q0 value) {
            value.getClass();
            this.options_ = value;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o8(Iterable<? extends g0> values) {
            u8();
            androidx.datastore.preferences.protobuf.a.m(values, this.method_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p8(int index, g0 value) {
            value.getClass();
            u8();
            this.method_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q8(g0 value) {
            value.getClass();
            u8();
            this.method_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void r8() {
            this.method_ = l1.T3();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s8() {
            this.bitField0_ &= -2;
            this.name_ = v8().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t8() {
            this.options_ = null;
            this.bitField0_ &= -3;
        }

        private void u8() {
            s1.l<g0> lVar = this.method_;
            if (lVar.s1()) {
                return;
            }
            this.method_ = l1.r5(lVar);
        }

        public static o0 v8() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void y8(q0 value) {
            value.getClass();
            q0 q0Var = this.options_;
            if (q0Var == null || q0Var == q0.I8()) {
                this.options_ = value;
            } else {
                this.options_ = ((q0.a) q0.N8(this.options_).u4(value)).B1();
            }
            this.bitField0_ |= 2;
        }

        public static a z8() {
            return DEFAULT_INSTANCE.s3();
        }

        @Override // androidx.datastore.preferences.protobuf.l1
        protected final Object D3(l1.i method, Object arg0, Object arg1) {
            h3 cVar;
            a aVar = null;
            switch (a.f50068a[method.ordinal()]) {
                case 1:
                    return new o0();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.A5(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001", new Object[]{"bitField0_", "name_", "method_", g0.class, "options_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    h3<o0> h3Var = PARSER;
                    if (h3Var != null) {
                        return h3Var;
                    }
                    synchronized (o0.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.e0.p0
        public g0 M7(int index) {
            return this.method_.get(index);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.p0
        public androidx.datastore.preferences.protobuf.u a() {
            return androidx.datastore.preferences.protobuf.u.C(this.name_);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.p0
        public q0 b() {
            q0 q0Var = this.options_;
            return q0Var == null ? q0.I8() : q0Var;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.p0
        public boolean g() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.p0
        public String getName() {
            return this.name_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.p0
        public boolean h() {
            int i10 = 6 << 1;
            return (this.bitField0_ & 1) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.p0
        public int p7() {
            return this.method_.size();
        }

        public h0 w8(int index) {
            return this.method_.get(index);
        }

        public List<? extends h0> x8() {
            return this.method_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.p0
        public List<g0> z4() {
            return this.method_;
        }
    }

    public static final class p extends l1<p, a> implements q {
        public static final int DEFAULTS_FIELD_NUMBER = 1;
        private static final p DEFAULT_INSTANCE;
        public static final int MAXIMUM_EDITION_FIELD_NUMBER = 5;
        public static final int MINIMUM_EDITION_FIELD_NUMBER = 4;
        private static volatile h3<p> PARSER;
        private int bitField0_;
        private int maximumEdition_;
        private int minimumEdition_;
        private byte memoizedIsInitialized = 2;
        private s1.l<b> defaults_ = l1.T3();

        public static final class a extends l1.b<p, a> implements q {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a A5(int index, b value) {
                V3();
                ((p) this.f50422b).M8(index, value);
                return this;
            }

            public a B5(d value) {
                V3();
                ((p) this.f50422b).N8(value);
                return this;
            }

            public a D5(d value) {
                V3();
                ((p) this.f50422b).O8(value);
                return this;
            }

            public a L4(Iterable<? extends b> values) {
                V3();
                ((p) this.f50422b).m8(values);
                return this;
            }

            public a P4(int index, b.a builderForValue) {
                V3();
                ((p) this.f50422b).n8(index, builderForValue.build());
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.q
            public d Q0() {
                return ((p) this.f50422b).Q0();
            }

            public a Q4(int index, b value) {
                V3();
                ((p) this.f50422b).n8(index, value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.q
            public int R0() {
                return ((p) this.f50422b).R0();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.q
            public boolean T0() {
                return ((p) this.f50422b).T0();
            }

            public a U4(b.a builderForValue) {
                V3();
                ((p) this.f50422b).o8(builderForValue.build());
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.q
            public List<b> V() {
                return Collections.unmodifiableList(((p) this.f50422b).V());
            }

            public a Z4(b value) {
                V3();
                ((p) this.f50422b).o8(value);
                return this;
            }

            public a a5() {
                V3();
                ((p) this.f50422b).p8();
                return this;
            }

            public a b5() {
                V3();
                ((p) this.f50422b).q8();
                return this;
            }

            public a d5() {
                V3();
                ((p) this.f50422b).r8();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.q
            public boolean f1() {
                return ((p) this.f50422b).f1();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.q
            public d n1() {
                return ((p) this.f50422b).n1();
            }

            public a r5(int index) {
                V3();
                ((p) this.f50422b).L8(index);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.q
            public b s1(int index) {
                return ((p) this.f50422b).s1(index);
            }

            public a y5(int index, b.a builderForValue) {
                V3();
                ((p) this.f50422b).M8(index, builderForValue.build());
                return this;
            }

            private a() {
                super(p.DEFAULT_INSTANCE);
            }
        }

        public static final class b extends l1<b, a> implements c {
            private static final b DEFAULT_INSTANCE;
            public static final int EDITION_FIELD_NUMBER = 3;
            public static final int FIXED_FEATURES_FIELD_NUMBER = 5;
            public static final int OVERRIDABLE_FEATURES_FIELD_NUMBER = 4;
            private static volatile h3<b> PARSER;
            private int bitField0_;
            private int edition_;
            private o fixedFeatures_;
            private byte memoizedIsInitialized = 2;
            private o overridableFeatures_;

            public static final class a extends l1.b<b, a> implements c {
                /* synthetic */ a(a aVar) {
                    this();
                }

                @Override // androidx.datastore.preferences.protobuf.e0.p.c
                public o B0() {
                    return ((b) this.f50422b).B0();
                }

                @Override // androidx.datastore.preferences.protobuf.e0.p.c
                public d C() {
                    return ((b) this.f50422b).C();
                }

                @Override // androidx.datastore.preferences.protobuf.e0.p.c
                public boolean E() {
                    return ((b) this.f50422b).E();
                }

                public a L4() {
                    V3();
                    ((b) this.f50422b).k8();
                    return this;
                }

                public a P4() {
                    V3();
                    ((b) this.f50422b).l8();
                    return this;
                }

                public a Q4() {
                    V3();
                    ((b) this.f50422b).m8();
                    return this;
                }

                public a U4(o value) {
                    V3();
                    ((b) this.f50422b).o8(value);
                    return this;
                }

                @Override // androidx.datastore.preferences.protobuf.e0.p.c
                public boolean V0() {
                    return ((b) this.f50422b).V0();
                }

                public a Z4(o value) {
                    V3();
                    ((b) this.f50422b).p8(value);
                    return this;
                }

                public a a5(d value) {
                    V3();
                    ((b) this.f50422b).F8(value);
                    return this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public a b5(o.a builderForValue) {
                    V3();
                    ((b) this.f50422b).G8((o) builderForValue.build());
                    return this;
                }

                public a d5(o value) {
                    V3();
                    ((b) this.f50422b).G8(value);
                    return this;
                }

                @Override // androidx.datastore.preferences.protobuf.e0.p.c
                public o e1() {
                    return ((b) this.f50422b).e1();
                }

                /* JADX WARN: Multi-variable type inference failed */
                public a r5(o.a builderForValue) {
                    V3();
                    ((b) this.f50422b).H8((o) builderForValue.build());
                    return this;
                }

                @Override // androidx.datastore.preferences.protobuf.e0.p.c
                public boolean x1() {
                    return ((b) this.f50422b).x1();
                }

                public a y5(o value) {
                    V3();
                    ((b) this.f50422b).H8(value);
                    return this;
                }

                private a() {
                    super(b.DEFAULT_INSTANCE);
                }
            }

            static {
                b bVar = new b();
                DEFAULT_INSTANCE = bVar;
                l1.Y6(b.class, bVar);
            }

            private b() {
            }

            public static b A8(ByteBuffer data) throws t1 {
                return (b) l1.i6(DEFAULT_INSTANCE, data);
            }

            public static b B8(ByteBuffer data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
                return (b) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static b C8(byte[] data) throws t1 {
                return (b) l1.p6(DEFAULT_INSTANCE, data);
            }

            public static b D8(byte[] data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
                return (b) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static h3<b> E8() {
                return DEFAULT_INSTANCE.W7();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void F8(d value) {
                this.edition_ = value.i();
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void G8(o value) {
                value.getClass();
                this.fixedFeatures_ = value;
                this.bitField0_ |= 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void H8(o value) {
                value.getClass();
                this.overridableFeatures_ = value;
                this.bitField0_ |= 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void k8() {
                this.bitField0_ &= -2;
                this.edition_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void l8() {
                this.fixedFeatures_ = null;
                this.bitField0_ &= -5;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void m8() {
                this.overridableFeatures_ = null;
                this.bitField0_ &= -3;
            }

            public static b n8() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Multi-variable type inference failed */
            public void o8(o value) {
                value.getClass();
                o oVar = this.fixedFeatures_;
                if (oVar == null || oVar == o.I8()) {
                    this.fixedFeatures_ = value;
                } else {
                    this.fixedFeatures_ = ((o.a) o.K8(this.fixedFeatures_).u4(value)).B1();
                }
                this.bitField0_ |= 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Multi-variable type inference failed */
            public void p8(o value) {
                value.getClass();
                o oVar = this.overridableFeatures_;
                if (oVar == null || oVar == o.I8()) {
                    this.overridableFeatures_ = value;
                } else {
                    this.overridableFeatures_ = ((o.a) o.K8(this.overridableFeatures_).u4(value)).B1();
                }
                this.bitField0_ |= 2;
            }

            public static a q8() {
                return DEFAULT_INSTANCE.s3();
            }

            public static a r8(b prototype) {
                return DEFAULT_INSTANCE.v3(prototype);
            }

            public static b s8(InputStream input) throws IOException {
                return (b) l1.J5(DEFAULT_INSTANCE, input);
            }

            public static b t8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
                return (b) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static b u8(androidx.datastore.preferences.protobuf.u data) throws t1 {
                return (b) l1.R5(DEFAULT_INSTANCE, data);
            }

            public static b v8(androidx.datastore.preferences.protobuf.u data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
                return (b) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static b w8(androidx.datastore.preferences.protobuf.z input) throws IOException {
                return (b) l1.a6(DEFAULT_INSTANCE, input);
            }

            public static b x8(androidx.datastore.preferences.protobuf.z input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
                return (b) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static b y8(InputStream input) throws IOException {
                return (b) l1.d6(DEFAULT_INSTANCE, input);
            }

            public static b z8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
                return (b) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            @Override // androidx.datastore.preferences.protobuf.e0.p.c
            public o B0() {
                o oVar = this.fixedFeatures_;
                return oVar == null ? o.I8() : oVar;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.p.c
            public d C() {
                d dVarB = d.b(this.edition_);
                return dVarB == null ? d.EDITION_UNKNOWN : dVarB;
            }

            @Override // androidx.datastore.preferences.protobuf.l1
            protected final Object D3(l1.i method, Object arg0, Object arg1) {
                h3 cVar;
                a aVar = null;
                switch (a.f50068a[method.ordinal()]) {
                    case 1:
                        return new b();
                    case 2:
                        return new a(aVar);
                    case 3:
                        return l1.A5(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0002\u0003᠌\u0000\u0004ᐉ\u0001\u0005ᐉ\u0002", new Object[]{"bitField0_", "edition_", d.l(), "overridableFeatures_", "fixedFeatures_"});
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
                        return Byte.valueOf(this.memoizedIsInitialized);
                    case 7:
                        this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            @Override // androidx.datastore.preferences.protobuf.e0.p.c
            public boolean E() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.p.c
            public boolean V0() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.p.c
            public o e1() {
                o oVarI8 = this.overridableFeatures_;
                if (oVarI8 == null) {
                    oVarI8 = o.I8();
                }
                return oVarI8;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.p.c
            public boolean x1() {
                return (this.bitField0_ & 2) != 0;
            }
        }

        public interface c extends r2 {
            o B0();

            d C();

            boolean E();

            boolean V0();

            o e1();

            boolean x1();
        }

        static {
            p pVar = new p();
            DEFAULT_INSTANCE = pVar;
            l1.Y6(p.class, pVar);
        }

        private p() {
        }

        public static p A8(androidx.datastore.preferences.protobuf.u data) throws t1 {
            return (p) l1.R5(DEFAULT_INSTANCE, data);
        }

        public static p B8(androidx.datastore.preferences.protobuf.u data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (p) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static p C8(androidx.datastore.preferences.protobuf.z input) throws IOException {
            return (p) l1.a6(DEFAULT_INSTANCE, input);
        }

        public static p D8(androidx.datastore.preferences.protobuf.z input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (p) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static p E8(InputStream input) throws IOException {
            return (p) l1.d6(DEFAULT_INSTANCE, input);
        }

        public static p F8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (p) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static p G8(ByteBuffer data) throws t1 {
            return (p) l1.i6(DEFAULT_INSTANCE, data);
        }

        public static p H8(ByteBuffer data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (p) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static p I8(byte[] data) throws t1 {
            return (p) l1.p6(DEFAULT_INSTANCE, data);
        }

        public static p J8(byte[] data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (p) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static h3<p> K8() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void L8(int index) {
            s8();
            this.defaults_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void M8(int index, b value) {
            value.getClass();
            s8();
            this.defaults_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void N8(d value) {
            this.maximumEdition_ = value.i();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void O8(d value) {
            this.minimumEdition_ = value.i();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m8(Iterable<? extends b> values) {
            s8();
            androidx.datastore.preferences.protobuf.a.m(values, this.defaults_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n8(int index, b value) {
            value.getClass();
            s8();
            this.defaults_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o8(b value) {
            value.getClass();
            s8();
            this.defaults_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p8() {
            this.defaults_ = l1.T3();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q8() {
            this.bitField0_ &= -3;
            this.maximumEdition_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void r8() {
            this.bitField0_ &= -2;
            this.minimumEdition_ = 0;
        }

        private void s8() {
            s1.l<b> lVar = this.defaults_;
            if (!lVar.s1()) {
                this.defaults_ = l1.r5(lVar);
            }
        }

        public static p t8() {
            return DEFAULT_INSTANCE;
        }

        public static a w8() {
            return DEFAULT_INSTANCE.s3();
        }

        public static a x8(p prototype) {
            return DEFAULT_INSTANCE.v3(prototype);
        }

        public static p y8(InputStream input) throws IOException {
            return (p) l1.J5(DEFAULT_INSTANCE, input);
        }

        public static p z8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (p) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        @Override // androidx.datastore.preferences.protobuf.l1
        protected final Object D3(l1.i method, Object arg0, Object arg1) {
            h3 cVar;
            a aVar = null;
            switch (a.f50068a[method.ordinal()]) {
                case 1:
                    return new p();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.A5(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0001\u0001Л\u0004᠌\u0000\u0005᠌\u0001", new Object[]{"bitField0_", "defaults_", b.class, "minimumEdition_", d.l(), "maximumEdition_", d.l()});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    h3<p> h3Var = PARSER;
                    if (h3Var != null) {
                        return h3Var;
                    }
                    synchronized (p.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.e0.q
        public d Q0() {
            d dVarB = d.b(this.maximumEdition_);
            if (dVarB == null) {
                dVarB = d.EDITION_UNKNOWN;
            }
            return dVarB;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.q
        public int R0() {
            return this.defaults_.size();
        }

        @Override // androidx.datastore.preferences.protobuf.e0.q
        public boolean T0() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.q
        public List<b> V() {
            return this.defaults_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.q
        public boolean f1() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.q
        public d n1() {
            d dVarB = d.b(this.minimumEdition_);
            if (dVarB == null) {
                dVarB = d.EDITION_UNKNOWN;
            }
            return dVarB;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.q
        public b s1(int index) {
            return this.defaults_.get(index);
        }

        public c u8(int index) {
            return this.defaults_.get(index);
        }

        public List<? extends c> v8() {
            return this.defaults_;
        }
    }

    public interface p0 extends r2 {
        g0 M7(int index);

        androidx.datastore.preferences.protobuf.u a();

        q0 b();

        boolean g();

        String getName();

        boolean h();

        int p7();

        List<g0> z4();
    }

    public interface q extends r2 {
        d Q0();

        int R0();

        boolean T0();

        List<p.b> V();

        boolean f1();

        d n1();

        p.b s1(int index);
    }

    public static final class q0 extends l1.e<q0, a> implements r0 {
        private static final q0 DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 33;
        public static final int FEATURES_FIELD_NUMBER = 34;
        private static volatile h3<q0> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean deprecated_;
        private o features_;
        private byte memoizedIsInitialized = 2;
        private s1.l<u0> uninterpretedOption_ = l1.T3();

        public static final class a extends l1.d<q0, a> implements r0 {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a A5(int index, u0 value) {
                V3();
                ((q0) this.f50422b).C8(index, value);
                return this;
            }

            public a B5(u0.a builderForValue) {
                V3();
                ((q0) this.f50422b).D8(builderForValue.build());
                return this;
            }

            public a D5(u0 value) {
                V3();
                ((q0) this.f50422b).D8(value);
                return this;
            }

            public a I5() {
                V3();
                ((q0) this.f50422b).E8();
                return this;
            }

            public a J5() {
                V3();
                ((q0) this.f50422b).F8();
                return this;
            }

            public a R5() {
                V3();
                ((q0) this.f50422b).G8();
                return this;
            }

            public a Z5(o value) {
                V3();
                ((q0) this.f50422b).L8(value);
                return this;
            }

            public a a6(int index) {
                V3();
                ((q0) this.f50422b).b9(index);
                return this;
            }

            public a c6(boolean value) {
                V3();
                ((q0) this.f50422b).c9(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.r0
            public List<u0> d() {
                return Collections.unmodifiableList(((q0) this.f50422b).d());
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a d6(o.a builderForValue) {
                V3();
                ((q0) this.f50422b).d9((o) builderForValue.build());
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.r0
            public u0 e(int index) {
                return ((q0) this.f50422b).e(index);
            }

            public a e6(o value) {
                V3();
                ((q0) this.f50422b).d9(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.r0
            public int f() {
                return ((q0) this.f50422b).f();
            }

            public a i6(int index, u0.a builderForValue) {
                V3();
                ((q0) this.f50422b).e9(index, builderForValue.build());
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.r0
            public boolean j() {
                return ((q0) this.f50422b).j();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.r0
            public boolean l() {
                return ((q0) this.f50422b).l();
            }

            public a o6(int index, u0 value) {
                V3();
                ((q0) this.f50422b).e9(index, value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.r0
            public boolean r() {
                return ((q0) this.f50422b).r();
            }

            public a r5(Iterable<? extends u0> values) {
                V3();
                ((q0) this.f50422b).B8(values);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.r0
            public o t() {
                return ((q0) this.f50422b).t();
            }

            public a y5(int index, u0.a builderForValue) {
                V3();
                ((q0) this.f50422b).C8(index, builderForValue.build());
                return this;
            }

            private a() {
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

        /* JADX INFO: Access modifiers changed from: private */
        public void B8(Iterable<? extends u0> values) {
            H8();
            androidx.datastore.preferences.protobuf.a.m(values, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C8(int index, u0 value) {
            value.getClass();
            H8();
            this.uninterpretedOption_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void D8(u0 value) {
            value.getClass();
            H8();
            this.uninterpretedOption_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void E8() {
            this.bitField0_ &= -3;
            this.deprecated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void F8() {
            this.features_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void G8() {
            this.uninterpretedOption_ = l1.T3();
        }

        private void H8() {
            s1.l<u0> lVar = this.uninterpretedOption_;
            if (lVar.s1()) {
                return;
            }
            this.uninterpretedOption_ = l1.r5(lVar);
        }

        public static q0 I8() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void L8(o value) {
            value.getClass();
            o oVar = this.features_;
            if (oVar == null || oVar == o.I8()) {
                this.features_ = value;
            } else {
                this.features_ = ((o.a) o.K8(this.features_).u4(value)).B1();
            }
            this.bitField0_ |= 1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a M8() {
            return (a) DEFAULT_INSTANCE.s3();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a N8(q0 prototype) {
            return (a) DEFAULT_INSTANCE.v3(prototype);
        }

        public static q0 O8(InputStream input) throws IOException {
            return (q0) l1.J5(DEFAULT_INSTANCE, input);
        }

        public static q0 P8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (q0) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static q0 Q8(androidx.datastore.preferences.protobuf.u data) throws t1 {
            return (q0) l1.R5(DEFAULT_INSTANCE, data);
        }

        public static q0 R8(androidx.datastore.preferences.protobuf.u data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (q0) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static q0 S8(androidx.datastore.preferences.protobuf.z input) throws IOException {
            return (q0) l1.a6(DEFAULT_INSTANCE, input);
        }

        public static q0 T8(androidx.datastore.preferences.protobuf.z input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (q0) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static q0 U8(InputStream input) throws IOException {
            return (q0) l1.d6(DEFAULT_INSTANCE, input);
        }

        public static q0 V8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (q0) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static q0 W8(ByteBuffer data) throws t1 {
            return (q0) l1.i6(DEFAULT_INSTANCE, data);
        }

        public static q0 X8(ByteBuffer data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (q0) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static q0 Y8(byte[] data) throws t1 {
            return (q0) l1.p6(DEFAULT_INSTANCE, data);
        }

        public static q0 Z8(byte[] data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (q0) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static h3<q0> a9() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b9(int index) {
            H8();
            this.uninterpretedOption_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c9(boolean value) {
            this.bitField0_ |= 2;
            this.deprecated_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d9(o value) {
            value.getClass();
            this.features_ = value;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e9(int index, u0 value) {
            value.getClass();
            H8();
            this.uninterpretedOption_.set(index, value);
        }

        @Override // androidx.datastore.preferences.protobuf.l1
        protected final Object D3(l1.i method, Object arg0, Object arg1) {
            h3 cVar;
            a aVar = null;
            switch (a.f50068a[method.ordinal()]) {
                case 1:
                    return new q0();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.A5(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001!ϧ\u0003\u0000\u0001\u0002!ဇ\u0001\"ᐉ\u0000ϧЛ", new Object[]{"bitField0_", "deprecated_", "features_", "uninterpretedOption_", u0.class});
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public v0 J8(int index) {
            return this.uninterpretedOption_.get(index);
        }

        public List<? extends v0> K8() {
            return this.uninterpretedOption_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.r0
        public List<u0> d() {
            return this.uninterpretedOption_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.r0
        public u0 e(int index) {
            return this.uninterpretedOption_.get(index);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.r0
        public int f() {
            return this.uninterpretedOption_.size();
        }

        @Override // androidx.datastore.preferences.protobuf.e0.r0
        public boolean j() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.r0
        public boolean l() {
            return this.deprecated_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.r0
        public boolean r() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.r0
        public o t() {
            o oVarI8 = this.features_;
            if (oVarI8 == null) {
                oVarI8 = o.I8();
            }
            return oVarI8;
        }
    }

    public interface r extends l1.f<o, o.a> {
        o.b A();

        o.e B();

        o.f D0();

        boolean E0();

        boolean E1();

        o.g F();

        boolean F1();

        o.c L1();

        boolean N();

        o.d Y0();

        boolean Z0();

        boolean g0();
    }

    public interface r0 extends l1.f<q0, q0.a> {
        List<u0> d();

        u0 e(int index);

        int f();

        boolean j();

        boolean l();

        boolean r();

        o t();
    }

    public static final class s extends l1<s, a> implements t {
        private static final s DEFAULT_INSTANCE;
        public static final int DEFAULT_VALUE_FIELD_NUMBER = 7;
        public static final int EXTENDEE_FIELD_NUMBER = 2;
        public static final int JSON_NAME_FIELD_NUMBER = 10;
        public static final int LABEL_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NUMBER_FIELD_NUMBER = 3;
        public static final int ONEOF_INDEX_FIELD_NUMBER = 9;
        public static final int OPTIONS_FIELD_NUMBER = 8;
        private static volatile h3<s> PARSER = null;
        public static final int PROTO3_OPTIONAL_FIELD_NUMBER = 17;
        public static final int TYPE_FIELD_NUMBER = 5;
        public static final int TYPE_NAME_FIELD_NUMBER = 6;
        private int bitField0_;
        private int number_;
        private int oneofIndex_;
        private u options_;
        private boolean proto3Optional_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private int label_ = 1;
        private int type_ = 1;
        private String typeName_ = "";
        private String extendee_ = "";
        private String defaultValue_ = "";
        private String jsonName_ = "";

        public static final class a extends l1.b<s, a> implements t {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a A5() {
                V3();
                ((s) this.f50422b).O8();
                return this;
            }

            public a A6(String value) {
                V3();
                ((s) this.f50422b).u9(value);
                return this;
            }

            public a B5(u value) {
                V3();
                ((s) this.f50422b).Q8(value);
                return this;
            }

            public a D5(String value) {
                V3();
                ((s) this.f50422b).g9(value);
                return this;
            }

            public a E6(androidx.datastore.preferences.protobuf.u value) {
                V3();
                ((s) this.f50422b).v9(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.t
            public boolean H4() {
                return ((s) this.f50422b).H4();
            }

            public a I5(androidx.datastore.preferences.protobuf.u value) {
                V3();
                ((s) this.f50422b).h9(value);
                return this;
            }

            public a J5(String value) {
                V3();
                ((s) this.f50422b).i9(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.t
            public String K() {
                return ((s) this.f50422b).K();
            }

            public a L4() {
                V3();
                ((s) this.f50422b).E8();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.t
            public String M0() {
                return ((s) this.f50422b).M0();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.t
            public androidx.datastore.preferences.protobuf.u P0() {
                return ((s) this.f50422b).P0();
            }

            public a P4() {
                V3();
                ((s) this.f50422b).F8();
                return this;
            }

            public a Q4() {
                V3();
                ((s) this.f50422b).G8();
                return this;
            }

            public a R5(androidx.datastore.preferences.protobuf.u value) {
                V3();
                ((s) this.f50422b).j9(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.t
            public boolean T5() {
                return ((s) this.f50422b).T5();
            }

            public a U4() {
                V3();
                ((s) this.f50422b).H8();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.t
            public androidx.datastore.preferences.protobuf.u V6() {
                return ((s) this.f50422b).V6();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.t
            public boolean W() {
                return ((s) this.f50422b).W();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.t
            public boolean W4() {
                return ((s) this.f50422b).W4();
            }

            public a Z4() {
                V3();
                ((s) this.f50422b).I8();
                return this;
            }

            public a Z5(String value) {
                V3();
                ((s) this.f50422b).k9(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.t
            public boolean Z6() {
                return ((s) this.f50422b).Z6();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.t
            public androidx.datastore.preferences.protobuf.u a() {
                return ((s) this.f50422b).a();
            }

            public a a5() {
                V3();
                ((s) this.f50422b).J8();
                return this;
            }

            public a a6(androidx.datastore.preferences.protobuf.u value) {
                V3();
                ((s) this.f50422b).l9(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.t
            public u b() {
                return ((s) this.f50422b).b();
            }

            public a b5() {
                V3();
                ((s) this.f50422b).K8();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.t
            public c c() {
                return ((s) this.f50422b).c();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.t
            public androidx.datastore.preferences.protobuf.u c0() {
                return ((s) this.f50422b).c0();
            }

            public a c6(b value) {
                V3();
                ((s) this.f50422b).m9(value);
                return this;
            }

            public a d5() {
                V3();
                ((s) this.f50422b).L8();
                return this;
            }

            public a d6(String value) {
                V3();
                ((s) this.f50422b).n9(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.t
            public boolean e2() {
                return ((s) this.f50422b).e2();
            }

            public a e6(androidx.datastore.preferences.protobuf.u value) {
                V3();
                ((s) this.f50422b).o9(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.t
            public androidx.datastore.preferences.protobuf.u f4() {
                return ((s) this.f50422b).f4();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.t
            public b f5() {
                return ((s) this.f50422b).f5();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.t
            public boolean g() {
                return ((s) this.f50422b).g();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.t
            public String getName() {
                return ((s) this.f50422b).getName();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.t
            public String getTypeName() {
                return ((s) this.f50422b).getTypeName();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.t
            public boolean h() {
                return ((s) this.f50422b).h();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.t
            public boolean h1() {
                return ((s) this.f50422b).h1();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.t
            public int i() {
                return ((s) this.f50422b).i();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.t
            public int i0() {
                return ((s) this.f50422b).i0();
            }

            public a i6(int value) {
                V3();
                ((s) this.f50422b).p9(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.t
            public String m7() {
                return ((s) this.f50422b).m7();
            }

            public a o6(int value) {
                V3();
                ((s) this.f50422b).q9(value);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a p6(u.b builderForValue) {
                V3();
                ((s) this.f50422b).r9((u) builderForValue.build());
                return this;
            }

            public a r5() {
                V3();
                ((s) this.f50422b).M8();
                return this;
            }

            public a r6(u value) {
                V3();
                ((s) this.f50422b).r9(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.t
            public boolean t5() {
                return ((s) this.f50422b).t5();
            }

            public a t6(boolean value) {
                V3();
                ((s) this.f50422b).s9(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.t
            public boolean u3() {
                return ((s) this.f50422b).u3();
            }

            public a w6(c value) {
                V3();
                ((s) this.f50422b).t9(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.t
            public boolean x5() {
                return ((s) this.f50422b).x5();
            }

            public a y5() {
                V3();
                ((s) this.f50422b).N8();
                return this;
            }

            private a() {
                super(s.DEFAULT_INSTANCE);
            }
        }

        public enum b implements s1.c {
            LABEL_OPTIONAL(1),
            LABEL_REPEATED(3),
            LABEL_REQUIRED(2);


            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f50196e = 1;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f50197f = 3;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f50198g = 2;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static final s1.d<b> f50199h = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f50201a;

            class a implements s1.d<b> {
                a() {
                }

                @Override // androidx.datastore.preferences.protobuf.s1.d
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public b a(int number) {
                    return b.b(number);
                }
            }

            /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.e0$s$b$b, reason: collision with other inner class name */
            private static final class C0454b implements s1.e {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                static final s1.e f50202a = new C0454b();

                private C0454b() {
                }

                @Override // androidx.datastore.preferences.protobuf.s1.e
                public boolean a(int number) {
                    return b.b(number) != null;
                }
            }

            b(int value) {
                this.f50201a = value;
            }

            public static b b(int value) {
                if (value == 1) {
                    return LABEL_OPTIONAL;
                }
                if (value == 2) {
                    return LABEL_REQUIRED;
                }
                if (value != 3) {
                    return null;
                }
                return LABEL_REPEATED;
            }

            public static s1.d<b> k() {
                return f50199h;
            }

            public static s1.e l() {
                return C0454b.f50202a;
            }

            @Deprecated
            public static b n(int value) {
                return b(value);
            }

            @Override // androidx.datastore.preferences.protobuf.s1.c
            public final int i() {
                return this.f50201a;
            }
        }

        public enum c implements s1.c {
            TYPE_DOUBLE(1),
            TYPE_FLOAT(2),
            TYPE_INT64(3),
            TYPE_UINT64(4),
            TYPE_INT32(5),
            TYPE_FIXED64(6),
            TYPE_FIXED32(7),
            TYPE_BOOL(8),
            TYPE_STRING(9),
            TYPE_GROUP(10),
            TYPE_MESSAGE(11),
            TYPE_BYTES(12),
            TYPE_UINT32(13),
            TYPE_ENUM(14),
            TYPE_SFIXED32(15),
            TYPE_SFIXED64(16),
            TYPE_SINT32(17),
            TYPE_SINT64(18);

            public static final int H1 = 6;
            public static final int X = 1;
            public static final int Y = 2;
            public static final int Z = 3;

            /* JADX INFO: renamed from: g3, reason: collision with root package name */
            public static final int f50209g3 = 8;

            /* JADX INFO: renamed from: h3, reason: collision with root package name */
            public static final int f50211h3 = 9;

            /* JADX INFO: renamed from: i3, reason: collision with root package name */
            public static final int f50213i3 = 10;

            /* JADX INFO: renamed from: j3, reason: collision with root package name */
            public static final int f50215j3 = 11;

            /* JADX INFO: renamed from: k3, reason: collision with root package name */
            public static final int f50217k3 = 12;

            /* JADX INFO: renamed from: l3, reason: collision with root package name */
            public static final int f50219l3 = 13;

            /* JADX INFO: renamed from: m3, reason: collision with root package name */
            public static final int f50221m3 = 14;

            /* JADX INFO: renamed from: n3, reason: collision with root package name */
            public static final int f50223n3 = 15;

            /* JADX INFO: renamed from: o3, reason: collision with root package name */
            public static final int f50225o3 = 16;

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final int f50226p0 = 4;

            /* JADX INFO: renamed from: p1, reason: collision with root package name */
            public static final int f50227p1 = 5;

            /* JADX INFO: renamed from: p2, reason: collision with root package name */
            public static final int f50228p2 = 7;

            /* JADX INFO: renamed from: p3, reason: collision with root package name */
            public static final int f50229p3 = 17;

            /* JADX INFO: renamed from: q3, reason: collision with root package name */
            public static final int f50230q3 = 18;

            /* JADX INFO: renamed from: r3, reason: collision with root package name */
            private static final s1.d<c> f50231r3 = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f50237a;

            class a implements s1.d<c> {
                a() {
                }

                @Override // androidx.datastore.preferences.protobuf.s1.d
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public c a(int number) {
                    return c.b(number);
                }
            }

            private static final class b implements s1.e {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                static final s1.e f50238a = new b();

                private b() {
                }

                @Override // androidx.datastore.preferences.protobuf.s1.e
                public boolean a(int number) {
                    return c.b(number) != null;
                }
            }

            c(int value) {
                this.f50237a = value;
            }

            public static c b(int value) {
                switch (value) {
                    case 1:
                        return TYPE_DOUBLE;
                    case 2:
                        return TYPE_FLOAT;
                    case 3:
                        return TYPE_INT64;
                    case 4:
                        return TYPE_UINT64;
                    case 5:
                        return TYPE_INT32;
                    case 6:
                        return TYPE_FIXED64;
                    case 7:
                        return TYPE_FIXED32;
                    case 8:
                        return TYPE_BOOL;
                    case 9:
                        return TYPE_STRING;
                    case 10:
                        return TYPE_GROUP;
                    case 11:
                        return TYPE_MESSAGE;
                    case 12:
                        return TYPE_BYTES;
                    case 13:
                        return TYPE_UINT32;
                    case 14:
                        return TYPE_ENUM;
                    case 15:
                        return TYPE_SFIXED32;
                    case 16:
                        return TYPE_SFIXED64;
                    case 17:
                        return TYPE_SINT32;
                    case 18:
                        return TYPE_SINT64;
                    default:
                        return null;
                }
            }

            public static s1.d<c> k() {
                return f50231r3;
            }

            public static s1.e l() {
                return b.f50238a;
            }

            @Deprecated
            public static c n(int value) {
                return b(value);
            }

            @Override // androidx.datastore.preferences.protobuf.s1.c
            public final int i() {
                return this.f50237a;
            }
        }

        static {
            s sVar = new s();
            DEFAULT_INSTANCE = sVar;
            l1.Y6(s.class, sVar);
        }

        private s() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void E8() {
            this.bitField0_ &= -65;
            this.defaultValue_ = P8().K();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void F8() {
            this.bitField0_ &= -33;
            this.extendee_ = P8().m7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void G8() {
            this.bitField0_ &= -257;
            this.jsonName_ = P8().M0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void H8() {
            this.bitField0_ &= -5;
            this.label_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void I8() {
            this.bitField0_ &= -2;
            this.name_ = P8().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void J8() {
            this.bitField0_ &= -3;
            this.number_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void K8() {
            this.bitField0_ &= -129;
            this.oneofIndex_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void L8() {
            this.options_ = null;
            this.bitField0_ &= -513;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void M8() {
            this.bitField0_ &= -1025;
            this.proto3Optional_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void N8() {
            this.bitField0_ &= -9;
            this.type_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void O8() {
            this.bitField0_ &= -17;
            this.typeName_ = P8().getTypeName();
        }

        public static s P8() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void Q8(u value) {
            value.getClass();
            u uVar = this.options_;
            if (uVar == null || uVar == u.D9()) {
                this.options_ = value;
            } else {
                this.options_ = ((u.b) u.L9(this.options_).u4(value)).B1();
            }
            this.bitField0_ |= 512;
        }

        public static a R8() {
            return DEFAULT_INSTANCE.s3();
        }

        public static a S8(s prototype) {
            return DEFAULT_INSTANCE.v3(prototype);
        }

        public static s T8(InputStream input) throws IOException {
            return (s) l1.J5(DEFAULT_INSTANCE, input);
        }

        public static s U8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (s) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static s V8(androidx.datastore.preferences.protobuf.u data) throws t1 {
            return (s) l1.R5(DEFAULT_INSTANCE, data);
        }

        public static s W8(androidx.datastore.preferences.protobuf.u data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (s) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static s X8(androidx.datastore.preferences.protobuf.z input) throws IOException {
            return (s) l1.a6(DEFAULT_INSTANCE, input);
        }

        public static s Y8(androidx.datastore.preferences.protobuf.z input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (s) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static s Z8(InputStream input) throws IOException {
            return (s) l1.d6(DEFAULT_INSTANCE, input);
        }

        public static s a9(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (s) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static s b9(ByteBuffer data) throws t1 {
            return (s) l1.i6(DEFAULT_INSTANCE, data);
        }

        public static s c9(ByteBuffer data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (s) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static s d9(byte[] data) throws t1 {
            return (s) l1.p6(DEFAULT_INSTANCE, data);
        }

        public static s e9(byte[] data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (s) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static h3<s> f9() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g9(String value) {
            value.getClass();
            this.bitField0_ |= 64;
            this.defaultValue_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h9(androidx.datastore.preferences.protobuf.u value) {
            this.defaultValue_ = value.A0();
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i9(String value) {
            value.getClass();
            this.bitField0_ |= 32;
            this.extendee_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j9(androidx.datastore.preferences.protobuf.u value) {
            this.extendee_ = value.A0();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k9(String value) {
            value.getClass();
            this.bitField0_ |= 256;
            this.jsonName_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l9(androidx.datastore.preferences.protobuf.u value) {
            this.jsonName_ = value.A0();
            this.bitField0_ |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m9(b value) {
            this.label_ = value.i();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n9(String value) {
            value.getClass();
            this.bitField0_ |= 1;
            this.name_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o9(androidx.datastore.preferences.protobuf.u value) {
            this.name_ = value.A0();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p9(int value) {
            this.bitField0_ |= 2;
            this.number_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q9(int value) {
            this.bitField0_ |= 128;
            this.oneofIndex_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void r9(u value) {
            value.getClass();
            this.options_ = value;
            this.bitField0_ |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s9(boolean value) {
            this.bitField0_ |= 1024;
            this.proto3Optional_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t9(c value) {
            this.type_ = value.i();
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void u9(String value) {
            value.getClass();
            this.bitField0_ |= 16;
            this.typeName_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void v9(androidx.datastore.preferences.protobuf.u value) {
            this.typeName_ = value.A0();
            this.bitField0_ |= 16;
        }

        @Override // androidx.datastore.preferences.protobuf.l1
        protected final Object D3(l1.i method, Object arg0, Object arg1) {
            h3 cVar;
            a aVar = null;
            switch (a.f50068a[method.ordinal()]) {
                case 1:
                    return new s();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.A5(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u0011\u000b\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0005\u0003င\u0001\u0004᠌\u0002\u0005᠌\u0003\u0006ဈ\u0004\u0007ဈ\u0006\bᐉ\t\tင\u0007\nဈ\b\u0011ဇ\n", new Object[]{"bitField0_", "name_", "extendee_", "number_", "label_", b.l(), "type_", c.l(), "typeName_", "defaultValue_", "options_", "oneofIndex_", "jsonName_", "proto3Optional_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    h3<s> h3Var = PARSER;
                    if (h3Var != null) {
                        return h3Var;
                    }
                    synchronized (s.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.e0.t
        public boolean H4() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.t
        public String K() {
            return this.defaultValue_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.t
        public String M0() {
            return this.jsonName_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.t
        public androidx.datastore.preferences.protobuf.u P0() {
            return androidx.datastore.preferences.protobuf.u.C(this.jsonName_);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.t
        public boolean T5() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.t
        public androidx.datastore.preferences.protobuf.u V6() {
            return androidx.datastore.preferences.protobuf.u.C(this.typeName_);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.t
        public boolean W() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.t
        public boolean W4() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.t
        public boolean Z6() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.t
        public androidx.datastore.preferences.protobuf.u a() {
            return androidx.datastore.preferences.protobuf.u.C(this.name_);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.t
        public u b() {
            u uVarD9 = this.options_;
            if (uVarD9 == null) {
                uVarD9 = u.D9();
            }
            return uVarD9;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.t
        public c c() {
            c cVarB = c.b(this.type_);
            return cVarB == null ? c.TYPE_DOUBLE : cVarB;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.t
        public androidx.datastore.preferences.protobuf.u c0() {
            return androidx.datastore.preferences.protobuf.u.C(this.defaultValue_);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.t
        public boolean e2() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.t
        public androidx.datastore.preferences.protobuf.u f4() {
            return androidx.datastore.preferences.protobuf.u.C(this.extendee_);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.t
        public b f5() {
            b bVarB = b.b(this.label_);
            if (bVarB == null) {
                bVarB = b.LABEL_OPTIONAL;
            }
            return bVarB;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.t
        public boolean g() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.t
        public String getName() {
            return this.name_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.t
        public String getTypeName() {
            return this.typeName_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.t
        public boolean h() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.t
        public boolean h1() {
            if ((this.bitField0_ & 8) == 0) {
                return false;
            }
            int i10 = 7 ^ 1;
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.t
        public int i() {
            return this.number_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.t
        public int i0() {
            return this.oneofIndex_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.t
        public String m7() {
            return this.extendee_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.t
        public boolean t5() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.t
        public boolean u3() {
            return this.proto3Optional_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.t
        public boolean x5() {
            return (this.bitField0_ & 32) != 0;
        }
    }

    public static final class s0 extends l1<s0, a> implements t0 {
        private static final s0 DEFAULT_INSTANCE;
        public static final int LOCATION_FIELD_NUMBER = 1;
        private static volatile h3<s0> PARSER;
        private s1.l<b> location_ = l1.T3();

        public static final class a extends l1.b<s0, a> implements t0 {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.t0
            public List<b> D7() {
                return Collections.unmodifiableList(((s0) this.f50422b).D7());
            }

            @Override // androidx.datastore.preferences.protobuf.e0.t0
            public int J4() {
                return ((s0) this.f50422b).J4();
            }

            public a L4(Iterable<? extends b> values) {
                V3();
                ((s0) this.f50422b).h8(values);
                return this;
            }

            public a P4(int index, b.a builderForValue) {
                V3();
                ((s0) this.f50422b).j8(index, builderForValue.build());
                return this;
            }

            public a Q4(int index, b value) {
                V3();
                ((s0) this.f50422b).j8(index, value);
                return this;
            }

            public a U4(b.a builderForValue) {
                V3();
                ((s0) this.f50422b).k8(builderForValue.build());
                return this;
            }

            public a Z4(b value) {
                V3();
                ((s0) this.f50422b).k8(value);
                return this;
            }

            public a a5() {
                V3();
                ((s0) this.f50422b).l8();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.t0
            public b b4(int index) {
                return ((s0) this.f50422b).b4(index);
            }

            public a b5(int index) {
                V3();
                ((s0) this.f50422b).F8(index);
                return this;
            }

            public a d5(int index, b.a builderForValue) {
                V3();
                ((s0) this.f50422b).G8(index, builderForValue.build());
                return this;
            }

            public a r5(int index, b value) {
                V3();
                ((s0) this.f50422b).G8(index, value);
                return this;
            }

            private a() {
                super(s0.DEFAULT_INSTANCE);
            }
        }

        public static final class b extends l1<b, a> implements c {
            private static final b DEFAULT_INSTANCE;
            public static final int LEADING_COMMENTS_FIELD_NUMBER = 3;
            public static final int LEADING_DETACHED_COMMENTS_FIELD_NUMBER = 6;
            private static volatile h3<b> PARSER = null;
            public static final int PATH_FIELD_NUMBER = 1;
            public static final int SPAN_FIELD_NUMBER = 2;
            public static final int TRAILING_COMMENTS_FIELD_NUMBER = 4;
            private int bitField0_;
            private int pathMemoizedSerializedSize = -1;
            private int spanMemoizedSerializedSize = -1;
            private s1.g path_ = l1.N3();
            private s1.g span_ = l1.N3();
            private String leadingComments_ = "";
            private String trailingComments_ = "";
            private s1.l<String> leadingDetachedComments_ = l1.T3();

            public static final class a extends l1.b<b, a> implements c {
                /* synthetic */ a(a aVar) {
                    this();
                }

                public a A5() {
                    V3();
                    ((b) this.f50422b).F8();
                    return this;
                }

                public a B5() {
                    V3();
                    ((b) this.f50422b).G8();
                    return this;
                }

                @Override // androidx.datastore.preferences.protobuf.e0.s0.c
                public String C6(int index) {
                    return ((b) this.f50422b).C6(index);
                }

                public a D5(String value) {
                    V3();
                    ((b) this.f50422b).a9(value);
                    return this;
                }

                @Override // androidx.datastore.preferences.protobuf.e0.s0.c
                public int F0() {
                    return ((b) this.f50422b).F0();
                }

                @Override // androidx.datastore.preferences.protobuf.e0.s0.c
                public List<String> H2() {
                    return Collections.unmodifiableList(((b) this.f50422b).H2());
                }

                public a I5(androidx.datastore.preferences.protobuf.u value) {
                    V3();
                    ((b) this.f50422b).b9(value);
                    return this;
                }

                public a J5(int index, String value) {
                    V3();
                    ((b) this.f50422b).c9(index, value);
                    return this;
                }

                @Override // androidx.datastore.preferences.protobuf.e0.s0.c
                public boolean L3() {
                    return ((b) this.f50422b).L3();
                }

                public a L4(Iterable<String> values) {
                    V3();
                    ((b) this.f50422b).v8(values);
                    return this;
                }

                public a P4(Iterable<? extends Integer> values) {
                    V3();
                    ((b) this.f50422b).w8(values);
                    return this;
                }

                public a Q4(Iterable<? extends Integer> values) {
                    V3();
                    ((b) this.f50422b).x8(values);
                    return this;
                }

                public a R5(int index, int value) {
                    V3();
                    ((b) this.f50422b).d9(index, value);
                    return this;
                }

                @Override // androidx.datastore.preferences.protobuf.e0.s0.c
                public androidx.datastore.preferences.protobuf.u T6() {
                    return ((b) this.f50422b).T6();
                }

                @Override // androidx.datastore.preferences.protobuf.e0.s0.c
                public boolean U3() {
                    return ((b) this.f50422b).U3();
                }

                public a U4(String value) {
                    V3();
                    ((b) this.f50422b).y8(value);
                    return this;
                }

                @Override // androidx.datastore.preferences.protobuf.e0.s0.c
                public List<Integer> Y4() {
                    return Collections.unmodifiableList(((b) this.f50422b).Y4());
                }

                public a Z4(androidx.datastore.preferences.protobuf.u value) {
                    V3();
                    ((b) this.f50422b).z8(value);
                    return this;
                }

                public a Z5(int index, int value) {
                    V3();
                    ((b) this.f50422b).e9(index, value);
                    return this;
                }

                public a a5(int value) {
                    V3();
                    ((b) this.f50422b).A8(value);
                    return this;
                }

                public a a6(String value) {
                    V3();
                    ((b) this.f50422b).f9(value);
                    return this;
                }

                public a b5(int value) {
                    V3();
                    ((b) this.f50422b).B8(value);
                    return this;
                }

                @Override // androidx.datastore.preferences.protobuf.e0.s0.c
                public String c3() {
                    return ((b) this.f50422b).c3();
                }

                public a c6(androidx.datastore.preferences.protobuf.u value) {
                    V3();
                    ((b) this.f50422b).g9(value);
                    return this;
                }

                @Override // androidx.datastore.preferences.protobuf.e0.s0.c
                public androidx.datastore.preferences.protobuf.u d4(int index) {
                    return ((b) this.f50422b).d4(index);
                }

                public a d5() {
                    V3();
                    ((b) this.f50422b).C8();
                    return this;
                }

                @Override // androidx.datastore.preferences.protobuf.e0.s0.c
                public int f0(int index) {
                    return ((b) this.f50422b).f0(index);
                }

                @Override // androidx.datastore.preferences.protobuf.e0.s0.c
                public int h6() {
                    return ((b) this.f50422b).h6();
                }

                @Override // androidx.datastore.preferences.protobuf.e0.s0.c
                public int m3() {
                    return ((b) this.f50422b).m3();
                }

                @Override // androidx.datastore.preferences.protobuf.e0.s0.c
                public List<Integer> n0() {
                    return Collections.unmodifiableList(((b) this.f50422b).n0());
                }

                @Override // androidx.datastore.preferences.protobuf.e0.s0.c
                public androidx.datastore.preferences.protobuf.u r4() {
                    return ((b) this.f50422b).r4();
                }

                public a r5() {
                    V3();
                    ((b) this.f50422b).D8();
                    return this;
                }

                @Override // androidx.datastore.preferences.protobuf.e0.s0.c
                public String t2() {
                    return ((b) this.f50422b).t2();
                }

                @Override // androidx.datastore.preferences.protobuf.e0.s0.c
                public int v5(int index) {
                    return ((b) this.f50422b).v5(index);
                }

                public a y5() {
                    V3();
                    ((b) this.f50422b).E8();
                    return this;
                }

                private a() {
                    super(b.DEFAULT_INSTANCE);
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
            public void A8(int value) {
                I8();
                this.path_.w1(value);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void B8(int value) {
                J8();
                this.span_.w1(value);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void C8() {
                this.bitField0_ &= -2;
                this.leadingComments_ = K8().c3();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void D8() {
                this.leadingDetachedComments_ = l1.T3();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void E8() {
                this.path_ = l1.N3();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void F8() {
                this.span_ = l1.N3();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void G8() {
                this.bitField0_ &= -3;
                this.trailingComments_ = K8().t2();
            }

            private void H8() {
                s1.l<String> lVar = this.leadingDetachedComments_;
                if (lVar.s1()) {
                    return;
                }
                this.leadingDetachedComments_ = l1.r5(lVar);
            }

            private void I8() {
                s1.g gVar = this.path_;
                if (gVar.s1()) {
                    return;
                }
                this.path_ = l1.b5(gVar);
            }

            private void J8() {
                s1.g gVar = this.span_;
                if (gVar.s1()) {
                    return;
                }
                this.span_ = l1.b5(gVar);
            }

            public static b K8() {
                return DEFAULT_INSTANCE;
            }

            public static a L8() {
                return DEFAULT_INSTANCE.s3();
            }

            public static a M8(b prototype) {
                return DEFAULT_INSTANCE.v3(prototype);
            }

            public static b N8(InputStream input) throws IOException {
                return (b) l1.J5(DEFAULT_INSTANCE, input);
            }

            public static b O8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
                return (b) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static b P8(androidx.datastore.preferences.protobuf.u data) throws t1 {
                return (b) l1.R5(DEFAULT_INSTANCE, data);
            }

            public static b Q8(androidx.datastore.preferences.protobuf.u data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
                return (b) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static b R8(androidx.datastore.preferences.protobuf.z input) throws IOException {
                return (b) l1.a6(DEFAULT_INSTANCE, input);
            }

            public static b S8(androidx.datastore.preferences.protobuf.z input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
                return (b) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static b T8(InputStream input) throws IOException {
                return (b) l1.d6(DEFAULT_INSTANCE, input);
            }

            public static b U8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
                return (b) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static b V8(ByteBuffer data) throws t1 {
                return (b) l1.i6(DEFAULT_INSTANCE, data);
            }

            public static b W8(ByteBuffer data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
                return (b) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static b X8(byte[] data) throws t1 {
                return (b) l1.p6(DEFAULT_INSTANCE, data);
            }

            public static b Y8(byte[] data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
                return (b) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static h3<b> Z8() {
                return DEFAULT_INSTANCE.W7();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void a9(String value) {
                value.getClass();
                this.bitField0_ |= 1;
                this.leadingComments_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void b9(androidx.datastore.preferences.protobuf.u value) {
                this.leadingComments_ = value.A0();
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void c9(int index, String value) {
                value.getClass();
                H8();
                this.leadingDetachedComments_.set(index, value);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void d9(int index, int value) {
                I8();
                this.path_.X(index, value);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void e9(int index, int value) {
                J8();
                this.span_.X(index, value);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void f9(String value) {
                value.getClass();
                this.bitField0_ |= 2;
                this.trailingComments_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void g9(androidx.datastore.preferences.protobuf.u value) {
                this.trailingComments_ = value.A0();
                this.bitField0_ |= 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void v8(Iterable<String> values) {
                H8();
                androidx.datastore.preferences.protobuf.a.m(values, this.leadingDetachedComments_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void w8(Iterable<? extends Integer> values) {
                I8();
                androidx.datastore.preferences.protobuf.a.m(values, this.path_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void x8(Iterable<? extends Integer> values) {
                J8();
                androidx.datastore.preferences.protobuf.a.m(values, this.span_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void y8(String value) {
                value.getClass();
                H8();
                this.leadingDetachedComments_.add(value);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void z8(androidx.datastore.preferences.protobuf.u value) {
                H8();
                this.leadingDetachedComments_.add(value.A0());
            }

            @Override // androidx.datastore.preferences.protobuf.e0.s0.c
            public String C6(int index) {
                return this.leadingDetachedComments_.get(index);
            }

            @Override // androidx.datastore.preferences.protobuf.l1
            protected final Object D3(l1.i method, Object arg0, Object arg1) {
                h3 cVar;
                int i10 = a.f50068a[method.ordinal()];
                a aVar = null;
                switch (i10) {
                    case 1:
                        return new b();
                    case 2:
                        return new a(aVar);
                    case 3:
                        return l1.A5(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0003\u0000\u0001'\u0002'\u0003ဈ\u0000\u0004ဈ\u0001\u0006\u001a", new Object[]{"bitField0_", "path_", "span_", "leadingComments_", "trailingComments_", "leadingDetachedComments_"});
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

            @Override // androidx.datastore.preferences.protobuf.e0.s0.c
            public int F0() {
                return this.path_.size();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.s0.c
            public List<String> H2() {
                return this.leadingDetachedComments_;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.s0.c
            public boolean L3() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.s0.c
            public androidx.datastore.preferences.protobuf.u T6() {
                return androidx.datastore.preferences.protobuf.u.C(this.trailingComments_);
            }

            @Override // androidx.datastore.preferences.protobuf.e0.s0.c
            public boolean U3() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.s0.c
            public List<Integer> Y4() {
                return this.span_;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.s0.c
            public String c3() {
                return this.leadingComments_;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.s0.c
            public androidx.datastore.preferences.protobuf.u d4(int index) {
                return androidx.datastore.preferences.protobuf.u.C(this.leadingDetachedComments_.get(index));
            }

            @Override // androidx.datastore.preferences.protobuf.e0.s0.c
            public int f0(int index) {
                return this.path_.getInt(index);
            }

            @Override // androidx.datastore.preferences.protobuf.e0.s0.c
            public int h6() {
                return this.span_.size();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.s0.c
            public int m3() {
                return this.leadingDetachedComments_.size();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.s0.c
            public List<Integer> n0() {
                return this.path_;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.s0.c
            public androidx.datastore.preferences.protobuf.u r4() {
                return androidx.datastore.preferences.protobuf.u.C(this.leadingComments_);
            }

            @Override // androidx.datastore.preferences.protobuf.e0.s0.c
            public String t2() {
                return this.trailingComments_;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.s0.c
            public int v5(int index) {
                return this.span_.getInt(index);
            }
        }

        public interface c extends r2 {
            String C6(int index);

            int F0();

            List<String> H2();

            boolean L3();

            androidx.datastore.preferences.protobuf.u T6();

            boolean U3();

            List<Integer> Y4();

            String c3();

            androidx.datastore.preferences.protobuf.u d4(int index);

            int f0(int index);

            int h6();

            int m3();

            List<Integer> n0();

            androidx.datastore.preferences.protobuf.u r4();

            String t2();

            int v5(int index);
        }

        static {
            s0 s0Var = new s0();
            DEFAULT_INSTANCE = s0Var;
            l1.Y6(s0.class, s0Var);
        }

        private s0() {
        }

        public static s0 A8(ByteBuffer data) throws t1 {
            return (s0) l1.i6(DEFAULT_INSTANCE, data);
        }

        public static s0 B8(ByteBuffer data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (s0) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static s0 C8(byte[] data) throws t1 {
            return (s0) l1.p6(DEFAULT_INSTANCE, data);
        }

        public static s0 D8(byte[] data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (s0) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static h3<s0> E8() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void F8(int index) {
            m8();
            this.location_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void G8(int index, b value) {
            value.getClass();
            m8();
            this.location_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h8(Iterable<? extends b> values) {
            m8();
            androidx.datastore.preferences.protobuf.a.m(values, this.location_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j8(int index, b value) {
            value.getClass();
            m8();
            this.location_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k8(b value) {
            value.getClass();
            m8();
            this.location_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l8() {
            this.location_ = l1.T3();
        }

        private void m8() {
            s1.l<b> lVar = this.location_;
            if (!lVar.s1()) {
                this.location_ = l1.r5(lVar);
            }
        }

        public static s0 n8() {
            return DEFAULT_INSTANCE;
        }

        public static a q8() {
            return DEFAULT_INSTANCE.s3();
        }

        public static a r8(s0 prototype) {
            return DEFAULT_INSTANCE.v3(prototype);
        }

        public static s0 s8(InputStream input) throws IOException {
            return (s0) l1.J5(DEFAULT_INSTANCE, input);
        }

        public static s0 t8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (s0) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static s0 u8(androidx.datastore.preferences.protobuf.u data) throws t1 {
            return (s0) l1.R5(DEFAULT_INSTANCE, data);
        }

        public static s0 v8(androidx.datastore.preferences.protobuf.u data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (s0) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static s0 w8(androidx.datastore.preferences.protobuf.z input) throws IOException {
            return (s0) l1.a6(DEFAULT_INSTANCE, input);
        }

        public static s0 x8(androidx.datastore.preferences.protobuf.z input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (s0) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static s0 y8(InputStream input) throws IOException {
            return (s0) l1.d6(DEFAULT_INSTANCE, input);
        }

        public static s0 z8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (s0) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        @Override // androidx.datastore.preferences.protobuf.l1
        protected final Object D3(l1.i method, Object arg0, Object arg1) {
            h3 cVar;
            int i10 = a.f50068a[method.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new s0();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.A5(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"location_", b.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    h3<s0> h3Var = PARSER;
                    if (h3Var != null) {
                        return h3Var;
                    }
                    synchronized (s0.class) {
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

        @Override // androidx.datastore.preferences.protobuf.e0.t0
        public List<b> D7() {
            return this.location_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.t0
        public int J4() {
            return this.location_.size();
        }

        @Override // androidx.datastore.preferences.protobuf.e0.t0
        public b b4(int index) {
            return this.location_.get(index);
        }

        public c o8(int index) {
            return this.location_.get(index);
        }

        public List<? extends c> p8() {
            return this.location_;
        }
    }

    public interface t extends r2 {
        boolean H4();

        String K();

        String M0();

        androidx.datastore.preferences.protobuf.u P0();

        boolean T5();

        androidx.datastore.preferences.protobuf.u V6();

        boolean W();

        boolean W4();

        boolean Z6();

        androidx.datastore.preferences.protobuf.u a();

        u b();

        s.c c();

        androidx.datastore.preferences.protobuf.u c0();

        boolean e2();

        androidx.datastore.preferences.protobuf.u f4();

        s.b f5();

        boolean g();

        String getName();

        String getTypeName();

        boolean h();

        boolean h1();

        int i();

        int i0();

        String m7();

        boolean t5();

        boolean u3();

        boolean x5();
    }

    public interface t0 extends r2 {
        List<s0.b> D7();

        int J4();

        s0.b b4(int index);
    }

    public static final class u extends l1.e<u, b> implements v {
        public static final int CTYPE_FIELD_NUMBER = 1;
        public static final int DEBUG_REDACT_FIELD_NUMBER = 16;
        private static final u DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        public static final int EDITION_DEFAULTS_FIELD_NUMBER = 20;
        public static final int FEATURES_FIELD_NUMBER = 21;
        public static final int FEATURE_SUPPORT_FIELD_NUMBER = 22;
        public static final int JSTYPE_FIELD_NUMBER = 6;
        public static final int LAZY_FIELD_NUMBER = 5;
        public static final int PACKED_FIELD_NUMBER = 2;
        private static volatile h3<u> PARSER = null;
        public static final int RETENTION_FIELD_NUMBER = 17;
        public static final int TARGETS_FIELD_NUMBER = 19;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        public static final int UNVERIFIED_LAZY_FIELD_NUMBER = 15;
        public static final int WEAK_FIELD_NUMBER = 10;
        private static final s1.h.a<j> targets_converter_ = new a();
        private int bitField0_;
        private int ctype_;
        private boolean debugRedact_;
        private boolean deprecated_;
        private f featureSupport_;
        private o features_;
        private int jstype_;
        private boolean lazy_;
        private boolean packed_;
        private int retention_;
        private boolean unverifiedLazy_;
        private boolean weak_;
        private byte memoizedIsInitialized = 2;
        private s1.g targets_ = l1.N3();
        private s1.l<d> editionDefaults_ = l1.T3();
        private s1.l<u0> uninterpretedOption_ = l1.T3();

        class a implements s1.h.a<j> {
            a() {
            }

            @Override // androidx.datastore.preferences.protobuf.s1.h.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public j a(int from) {
                j jVarB = j.b(from);
                return jVarB == null ? j.TARGET_TYPE_UNKNOWN : jVarB;
            }
        }

        public static final class b extends l1.d<u, b> implements v {
            /* synthetic */ b(a aVar) {
                this();
            }

            public b A5(Iterable<? extends u0> values) {
                V3();
                ((u) this.f50422b).g9(values);
                return this;
            }

            public b A6() {
                V3();
                ((u) this.f50422b).t9();
                return this;
            }

            public b A7(int index) {
                V3();
                ((u) this.f50422b).aa(index);
                return this;
            }

            public b B5(int index, d.a builderForValue) {
                V3();
                ((u) this.f50422b).h9(index, builderForValue.build());
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v
            public boolean C0() {
                return ((u) this.f50422b).C0();
            }

            public b C7(c value) {
                V3();
                ((u) this.f50422b).ba(value);
                return this;
            }

            public b D5(int index, d value) {
                V3();
                ((u) this.f50422b).h9(index, value);
                return this;
            }

            public b E6() {
                V3();
                ((u) this.f50422b).u9();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v
            public boolean E7() {
                return ((u) this.f50422b).E7();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v
            public int F7() {
                return ((u) this.f50422b).F7();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v
            public h G5() {
                return ((u) this.f50422b).G5();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v
            public boolean G7() {
                return ((u) this.f50422b).G7();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v
            public boolean H() {
                return ((u) this.f50422b).H();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v
            public boolean H3() {
                return ((u) this.f50422b).H3();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v
            public int H7() {
                return ((u) this.f50422b).H7();
            }

            public b I5(d.a builderForValue) {
                V3();
                ((u) this.f50422b).i9(builderForValue.build());
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v
            public boolean J2() {
                return ((u) this.f50422b).J2();
            }

            public b J5(d value) {
                V3();
                ((u) this.f50422b).i9(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v
            public boolean O() {
                return ((u) this.f50422b).O();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v
            public j O7(int index) {
                return ((u) this.f50422b).O7(index);
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v
            public boolean P() {
                return ((u) this.f50422b).P();
            }

            public b R5(j value) {
                V3();
                ((u) this.f50422b).j9(value);
                return this;
            }

            public b R6() {
                V3();
                ((u) this.f50422b).v9();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v
            public d R7(int index) {
                return ((u) this.f50422b).R7(index);
            }

            public b U6() {
                V3();
                ((u) this.f50422b).w9();
                return this;
            }

            public b Y6() {
                V3();
                ((u) this.f50422b).x9();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v
            public i Y7() {
                return ((u) this.f50422b).Y7();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v
            public boolean Z1() {
                return ((u) this.f50422b).Z1();
            }

            public b Z5(int index, u0.a builderForValue) {
                V3();
                ((u) this.f50422b).k9(index, builderForValue.build());
                return this;
            }

            public b a6(int index, u0 value) {
                V3();
                ((u) this.f50422b).k9(index, value);
                return this;
            }

            public b b7() {
                V3();
                ((u) this.f50422b).y9();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v
            public boolean b8() {
                return ((u) this.f50422b).b8();
            }

            public b c6(u0.a builderForValue) {
                V3();
                ((u) this.f50422b).l9(builderForValue.build());
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v
            public List<j> c8() {
                return ((u) this.f50422b).c8();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v
            public List<u0> d() {
                return Collections.unmodifiableList(((u) this.f50422b).d());
            }

            public b d6(u0 value) {
                V3();
                ((u) this.f50422b).l9(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v
            public boolean d8() {
                return ((u) this.f50422b).d8();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v
            public u0 e(int index) {
                return ((u) this.f50422b).e(index);
            }

            public b e6() {
                V3();
                ((u) this.f50422b).m9();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v
            public List<d> e8() {
                return Collections.unmodifiableList(((u) this.f50422b).e8());
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v
            public int f() {
                return ((u) this.f50422b).f();
            }

            public b f7() {
                V3();
                ((u) this.f50422b).z9();
                return this;
            }

            public b f8(boolean value) {
                V3();
                ((u) this.f50422b).ca(value);
                return this;
            }

            public b g8(boolean value) {
                V3();
                ((u) this.f50422b).da(value);
                return this;
            }

            public b h8(int index, d.a builderForValue) {
                V3();
                ((u) this.f50422b).ea(index, builderForValue.build());
                return this;
            }

            public b i6() {
                V3();
                ((u) this.f50422b).n9();
                return this;
            }

            public b i7(f value) {
                V3();
                ((u) this.f50422b).I9(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v
            public boolean j() {
                return ((u) this.f50422b).j();
            }

            public b j7(o value) {
                V3();
                ((u) this.f50422b).J9(value);
                return this;
            }

            public b j8(int index, d value) {
                V3();
                ((u) this.f50422b).ea(index, value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v
            public f k() {
                return ((u) this.f50422b).k();
            }

            public b k8(f.a builderForValue) {
                V3();
                ((u) this.f50422b).fa(builderForValue.build());
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v
            public boolean l() {
                return ((u) this.f50422b).l();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v
            public boolean l6() {
                return ((u) this.f50422b).l6();
            }

            public b l8(f value) {
                V3();
                ((u) this.f50422b).fa(value);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public b m8(o.a builderForValue) {
                V3();
                ((u) this.f50422b).ga((o) builderForValue.build());
                return this;
            }

            public b n8(o value) {
                V3();
                ((u) this.f50422b).ga(value);
                return this;
            }

            public b o6() {
                V3();
                ((u) this.f50422b).o9();
                return this;
            }

            public b o8(h value) {
                V3();
                ((u) this.f50422b).ha(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v
            public c p3() {
                return ((u) this.f50422b).p3();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v
            public boolean p4() {
                return ((u) this.f50422b).p4();
            }

            public b p6() {
                V3();
                ((u) this.f50422b).p9();
                return this;
            }

            public b p8(boolean value) {
                V3();
                ((u) this.f50422b).ia(value);
                return this;
            }

            public b q8(boolean value) {
                V3();
                ((u) this.f50422b).ja(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v
            public boolean r() {
                return ((u) this.f50422b).r();
            }

            public b r5(Iterable<? extends d> values) {
                V3();
                ((u) this.f50422b).e9(values);
                return this;
            }

            public b r6() {
                V3();
                ((u) this.f50422b).q9();
                return this;
            }

            public b r8(i value) {
                V3();
                ((u) this.f50422b).ka(value);
                return this;
            }

            public b s8(int index, j value) {
                V3();
                ((u) this.f50422b).la(index, value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v
            public o t() {
                return ((u) this.f50422b).t();
            }

            public b t6() {
                V3();
                ((u) this.f50422b).r9();
                return this;
            }

            public b t8(int index, u0.a builderForValue) {
                V3();
                ((u) this.f50422b).ma(index, builderForValue.build());
                return this;
            }

            public b u8(int index, u0 value) {
                V3();
                ((u) this.f50422b).ma(index, value);
                return this;
            }

            public b v8(boolean value) {
                V3();
                ((u) this.f50422b).na(value);
                return this;
            }

            public b w6() {
                V3();
                ((u) this.f50422b).s9();
                return this;
            }

            public b w8(boolean value) {
                V3();
                ((u) this.f50422b).oa(value);
                return this;
            }

            public b y5(Iterable<? extends j> values) {
                V3();
                ((u) this.f50422b).f9(values);
                return this;
            }

            public b y7(int index) {
                V3();
                ((u) this.f50422b).Z9(index);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v
            public boolean z5() {
                return ((u) this.f50422b).z5();
            }

            private b() {
                super(u.DEFAULT_INSTANCE);
            }
        }

        public enum c implements s1.c {
            STRING(0),
            CORD(1),
            STRING_PIECE(2);


            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f50242e = 0;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f50243f = 1;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f50244g = 2;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static final s1.d<c> f50245h = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f50247a;

            class a implements s1.d<c> {
                a() {
                }

                @Override // androidx.datastore.preferences.protobuf.s1.d
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public c a(int number) {
                    return c.b(number);
                }
            }

            private static final class b implements s1.e {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                static final s1.e f50248a = new b();

                private b() {
                }

                @Override // androidx.datastore.preferences.protobuf.s1.e
                public boolean a(int number) {
                    return c.b(number) != null;
                }
            }

            c(int value) {
                this.f50247a = value;
            }

            public static c b(int value) {
                if (value == 0) {
                    return STRING;
                }
                if (value == 1) {
                    return CORD;
                }
                if (value != 2) {
                    return null;
                }
                return STRING_PIECE;
            }

            public static s1.d<c> k() {
                return f50245h;
            }

            public static s1.e l() {
                return b.f50248a;
            }

            @Deprecated
            public static c n(int value) {
                return b(value);
            }

            @Override // androidx.datastore.preferences.protobuf.s1.c
            public final int i() {
                return this.f50247a;
            }
        }

        public static final class d extends l1<d, a> implements e {
            private static final d DEFAULT_INSTANCE;
            public static final int EDITION_FIELD_NUMBER = 3;
            private static volatile h3<d> PARSER = null;
            public static final int VALUE_FIELD_NUMBER = 2;
            private int bitField0_;
            private int edition_;
            private String value_ = "";

            public static final class a extends l1.b<d, a> implements e {
                /* synthetic */ a(a aVar) {
                    this();
                }

                @Override // androidx.datastore.preferences.protobuf.e0.u.e
                public d C() {
                    return ((d) this.f50422b).C();
                }

                @Override // androidx.datastore.preferences.protobuf.e0.u.e
                public boolean E() {
                    return ((d) this.f50422b).E();
                }

                public a L4() {
                    V3();
                    ((d) this.f50422b).g8();
                    return this;
                }

                @Override // androidx.datastore.preferences.protobuf.e0.u.e
                public boolean P1() {
                    return ((d) this.f50422b).P1();
                }

                public a P4() {
                    V3();
                    ((d) this.f50422b).h8();
                    return this;
                }

                public a Q4(d value) {
                    V3();
                    ((d) this.f50422b).z8(value);
                    return this;
                }

                @Override // androidx.datastore.preferences.protobuf.e0.u.e
                public androidx.datastore.preferences.protobuf.u R1() {
                    return ((d) this.f50422b).R1();
                }

                public a U4(String value) {
                    V3();
                    ((d) this.f50422b).A8(value);
                    return this;
                }

                public a Z4(androidx.datastore.preferences.protobuf.u value) {
                    V3();
                    ((d) this.f50422b).B8(value);
                    return this;
                }

                @Override // androidx.datastore.preferences.protobuf.e0.u.e
                public String getValue() {
                    return ((d) this.f50422b).getValue();
                }

                private a() {
                    super(d.DEFAULT_INSTANCE);
                }
            }

            static {
                d dVar = new d();
                DEFAULT_INSTANCE = dVar;
                l1.Y6(d.class, dVar);
            }

            private d() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void A8(String value) {
                value.getClass();
                this.bitField0_ |= 2;
                this.value_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void B8(androidx.datastore.preferences.protobuf.u value) {
                this.value_ = value.A0();
                this.bitField0_ |= 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void g8() {
                this.bitField0_ &= -2;
                this.edition_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void h8() {
                this.bitField0_ &= -3;
                this.value_ = j8().getValue();
            }

            public static d j8() {
                return DEFAULT_INSTANCE;
            }

            public static a k8() {
                return DEFAULT_INSTANCE.s3();
            }

            public static a l8(d prototype) {
                return DEFAULT_INSTANCE.v3(prototype);
            }

            public static d m8(InputStream input) throws IOException {
                return (d) l1.J5(DEFAULT_INSTANCE, input);
            }

            public static d n8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
                return (d) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static d o8(androidx.datastore.preferences.protobuf.u data) throws t1 {
                return (d) l1.R5(DEFAULT_INSTANCE, data);
            }

            public static d p8(androidx.datastore.preferences.protobuf.u data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
                return (d) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static d q8(androidx.datastore.preferences.protobuf.z input) throws IOException {
                return (d) l1.a6(DEFAULT_INSTANCE, input);
            }

            public static d r8(androidx.datastore.preferences.protobuf.z input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
                return (d) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static d s8(InputStream input) throws IOException {
                return (d) l1.d6(DEFAULT_INSTANCE, input);
            }

            public static d t8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
                return (d) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static d u8(ByteBuffer data) throws t1 {
                return (d) l1.i6(DEFAULT_INSTANCE, data);
            }

            public static d v8(ByteBuffer data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
                return (d) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static d w8(byte[] data) throws t1 {
                return (d) l1.p6(DEFAULT_INSTANCE, data);
            }

            public static d x8(byte[] data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
                return (d) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static h3<d> y8() {
                return DEFAULT_INSTANCE.W7();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void z8(d value) {
                this.edition_ = value.i();
                this.bitField0_ |= 1;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.u.e
            public d C() {
                d dVarB = d.b(this.edition_);
                return dVarB == null ? d.EDITION_UNKNOWN : dVarB;
            }

            @Override // androidx.datastore.preferences.protobuf.l1
            protected final Object D3(l1.i method, Object arg0, Object arg1) {
                h3 cVar;
                int i10 = a.f50068a[method.ordinal()];
                a aVar = null;
                switch (i10) {
                    case 1:
                        return new d();
                    case 2:
                        return new a(aVar);
                    case 3:
                        return l1.A5(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003᠌\u0000", new Object[]{"bitField0_", "value_", "edition_", d.l()});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        h3<d> h3Var = PARSER;
                        if (h3Var != null) {
                            return h3Var;
                        }
                        synchronized (d.class) {
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

            @Override // androidx.datastore.preferences.protobuf.e0.u.e
            public boolean E() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.u.e
            public boolean P1() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.u.e
            public androidx.datastore.preferences.protobuf.u R1() {
                return androidx.datastore.preferences.protobuf.u.C(this.value_);
            }

            @Override // androidx.datastore.preferences.protobuf.e0.u.e
            public String getValue() {
                return this.value_;
            }
        }

        public interface e extends r2 {
            d C();

            boolean E();

            boolean P1();

            androidx.datastore.preferences.protobuf.u R1();

            String getValue();
        }

        public static final class f extends l1<f, a> implements g {
            private static final f DEFAULT_INSTANCE;
            public static final int DEPRECATION_WARNING_FIELD_NUMBER = 3;
            public static final int EDITION_DEPRECATED_FIELD_NUMBER = 2;
            public static final int EDITION_INTRODUCED_FIELD_NUMBER = 1;
            public static final int EDITION_REMOVED_FIELD_NUMBER = 4;
            private static volatile h3<f> PARSER;
            private int bitField0_;
            private String deprecationWarning_ = "";
            private int editionDeprecated_;
            private int editionIntroduced_;
            private int editionRemoved_;

            public static final class a extends l1.b<f, a> implements g {
                /* synthetic */ a(a aVar) {
                    this();
                }

                @Override // androidx.datastore.preferences.protobuf.e0.u.g
                public d H1() {
                    return ((f) this.f50422b).H1();
                }

                public a L4() {
                    V3();
                    ((f) this.f50422b).l8();
                    return this;
                }

                @Override // androidx.datastore.preferences.protobuf.e0.u.g
                public boolean M1() {
                    return ((f) this.f50422b).M1();
                }

                public a P4() {
                    V3();
                    ((f) this.f50422b).m8();
                    return this;
                }

                public a Q4() {
                    V3();
                    ((f) this.f50422b).n8();
                    return this;
                }

                @Override // androidx.datastore.preferences.protobuf.e0.u.g
                public d U() {
                    return ((f) this.f50422b).U();
                }

                public a U4() {
                    V3();
                    ((f) this.f50422b).o8();
                    return this;
                }

                @Override // androidx.datastore.preferences.protobuf.e0.u.g
                public boolean X0() {
                    return ((f) this.f50422b).X0();
                }

                public a Z4(String value) {
                    V3();
                    ((f) this.f50422b).F8(value);
                    return this;
                }

                public a a5(androidx.datastore.preferences.protobuf.u value) {
                    V3();
                    ((f) this.f50422b).G8(value);
                    return this;
                }

                public a b5(d value) {
                    V3();
                    ((f) this.f50422b).H8(value);
                    return this;
                }

                @Override // androidx.datastore.preferences.protobuf.e0.u.g
                public String d2() {
                    return ((f) this.f50422b).d2();
                }

                public a d5(d value) {
                    V3();
                    ((f) this.f50422b).I8(value);
                    return this;
                }

                @Override // androidx.datastore.preferences.protobuf.e0.u.g
                public d h0() {
                    return ((f) this.f50422b).h0();
                }

                @Override // androidx.datastore.preferences.protobuf.e0.u.g
                public androidx.datastore.preferences.protobuf.u i2() {
                    return ((f) this.f50422b).i2();
                }

                @Override // androidx.datastore.preferences.protobuf.e0.u.g
                public boolean k0() {
                    return ((f) this.f50422b).k0();
                }

                @Override // androidx.datastore.preferences.protobuf.e0.u.g
                public boolean m1() {
                    return ((f) this.f50422b).m1();
                }

                public a r5(d value) {
                    V3();
                    ((f) this.f50422b).J8(value);
                    return this;
                }

                private a() {
                    super(f.DEFAULT_INSTANCE);
                }
            }

            static {
                f fVar = new f();
                DEFAULT_INSTANCE = fVar;
                l1.Y6(f.class, fVar);
            }

            private f() {
            }

            public static f A8(ByteBuffer data) throws t1 {
                return (f) l1.i6(DEFAULT_INSTANCE, data);
            }

            public static f B8(ByteBuffer data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
                return (f) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static f C8(byte[] data) throws t1 {
                return (f) l1.p6(DEFAULT_INSTANCE, data);
            }

            public static f D8(byte[] data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
                return (f) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static h3<f> E8() {
                return DEFAULT_INSTANCE.W7();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void F8(String value) {
                value.getClass();
                this.bitField0_ |= 4;
                this.deprecationWarning_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void G8(androidx.datastore.preferences.protobuf.u value) {
                this.deprecationWarning_ = value.A0();
                this.bitField0_ |= 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void H8(d value) {
                this.editionDeprecated_ = value.i();
                this.bitField0_ |= 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void I8(d value) {
                this.editionIntroduced_ = value.i();
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void J8(d value) {
                this.editionRemoved_ = value.i();
                this.bitField0_ |= 8;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void l8() {
                this.bitField0_ &= -5;
                this.deprecationWarning_ = p8().d2();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void m8() {
                this.bitField0_ &= -3;
                this.editionDeprecated_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void n8() {
                this.bitField0_ &= -2;
                this.editionIntroduced_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void o8() {
                this.bitField0_ &= -9;
                this.editionRemoved_ = 0;
            }

            public static f p8() {
                return DEFAULT_INSTANCE;
            }

            public static a q8() {
                return DEFAULT_INSTANCE.s3();
            }

            public static a r8(f prototype) {
                return DEFAULT_INSTANCE.v3(prototype);
            }

            public static f s8(InputStream input) throws IOException {
                return (f) l1.J5(DEFAULT_INSTANCE, input);
            }

            public static f t8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
                return (f) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static f u8(androidx.datastore.preferences.protobuf.u data) throws t1 {
                return (f) l1.R5(DEFAULT_INSTANCE, data);
            }

            public static f v8(androidx.datastore.preferences.protobuf.u data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
                return (f) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static f w8(androidx.datastore.preferences.protobuf.z input) throws IOException {
                return (f) l1.a6(DEFAULT_INSTANCE, input);
            }

            public static f x8(androidx.datastore.preferences.protobuf.z input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
                return (f) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static f y8(InputStream input) throws IOException {
                return (f) l1.d6(DEFAULT_INSTANCE, input);
            }

            public static f z8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
                return (f) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            @Override // androidx.datastore.preferences.protobuf.l1
            protected final Object D3(l1.i method, Object arg0, Object arg1) {
                h3 cVar;
                int i10 = a.f50068a[method.ordinal()];
                a aVar = null;
                switch (i10) {
                    case 1:
                        return new f();
                    case 2:
                        return new a(aVar);
                    case 3:
                        return l1.A5(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004᠌\u0003", new Object[]{"bitField0_", "editionIntroduced_", d.l(), "editionDeprecated_", d.l(), "deprecationWarning_", "editionRemoved_", d.l()});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        h3<f> h3Var = PARSER;
                        if (h3Var != null) {
                            return h3Var;
                        }
                        synchronized (f.class) {
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

            @Override // androidx.datastore.preferences.protobuf.e0.u.g
            public d H1() {
                d dVarB = d.b(this.editionRemoved_);
                if (dVarB == null) {
                    dVarB = d.EDITION_UNKNOWN;
                }
                return dVarB;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.u.g
            public boolean M1() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.u.g
            public d U() {
                d dVarB = d.b(this.editionDeprecated_);
                return dVarB == null ? d.EDITION_UNKNOWN : dVarB;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.u.g
            public boolean X0() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.u.g
            public String d2() {
                return this.deprecationWarning_;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.u.g
            public d h0() {
                d dVarB = d.b(this.editionIntroduced_);
                if (dVarB == null) {
                    dVarB = d.EDITION_UNKNOWN;
                }
                return dVarB;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.u.g
            public androidx.datastore.preferences.protobuf.u i2() {
                return androidx.datastore.preferences.protobuf.u.C(this.deprecationWarning_);
            }

            @Override // androidx.datastore.preferences.protobuf.e0.u.g
            public boolean k0() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.u.g
            public boolean m1() {
                return (this.bitField0_ & 8) != 0;
            }
        }

        public interface g extends r2 {
            d H1();

            boolean M1();

            d U();

            boolean X0();

            String d2();

            d h0();

            androidx.datastore.preferences.protobuf.u i2();

            boolean k0();

            boolean m1();
        }

        public enum h implements s1.c {
            JS_NORMAL(0),
            JS_STRING(1),
            JS_NUMBER(2);


            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f50252e = 0;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f50253f = 1;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f50254g = 2;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static final s1.d<h> f50255h = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f50257a;

            class a implements s1.d<h> {
                a() {
                }

                @Override // androidx.datastore.preferences.protobuf.s1.d
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public h a(int number) {
                    return h.b(number);
                }
            }

            private static final class b implements s1.e {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                static final s1.e f50258a = new b();

                private b() {
                }

                @Override // androidx.datastore.preferences.protobuf.s1.e
                public boolean a(int number) {
                    return h.b(number) != null;
                }
            }

            h(int value) {
                this.f50257a = value;
            }

            public static h b(int value) {
                if (value == 0) {
                    return JS_NORMAL;
                }
                if (value == 1) {
                    return JS_STRING;
                }
                if (value != 2) {
                    return null;
                }
                return JS_NUMBER;
            }

            public static s1.d<h> k() {
                return f50255h;
            }

            public static s1.e l() {
                return b.f50258a;
            }

            @Deprecated
            public static h n(int value) {
                return b(value);
            }

            @Override // androidx.datastore.preferences.protobuf.s1.c
            public final int i() {
                return this.f50257a;
            }
        }

        public enum i implements s1.c {
            RETENTION_UNKNOWN(0),
            RETENTION_RUNTIME(1),
            RETENTION_SOURCE(2);


            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f50262e = 0;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f50263f = 1;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f50264g = 2;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static final s1.d<i> f50265h = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f50267a;

            class a implements s1.d<i> {
                a() {
                }

                @Override // androidx.datastore.preferences.protobuf.s1.d
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public i a(int number) {
                    return i.b(number);
                }
            }

            private static final class b implements s1.e {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                static final s1.e f50268a = new b();

                private b() {
                }

                @Override // androidx.datastore.preferences.protobuf.s1.e
                public boolean a(int number) {
                    return i.b(number) != null;
                }
            }

            i(int value) {
                this.f50267a = value;
            }

            public static i b(int value) {
                if (value == 0) {
                    return RETENTION_UNKNOWN;
                }
                if (value == 1) {
                    return RETENTION_RUNTIME;
                }
                if (value != 2) {
                    return null;
                }
                return RETENTION_SOURCE;
            }

            public static s1.d<i> k() {
                return f50265h;
            }

            public static s1.e l() {
                return b.f50268a;
            }

            @Deprecated
            public static i n(int value) {
                return b(value);
            }

            @Override // androidx.datastore.preferences.protobuf.s1.c
            public final int i() {
                return this.f50267a;
            }
        }

        public enum j implements s1.c {
            TARGET_TYPE_UNKNOWN(0),
            TARGET_TYPE_FILE(1),
            TARGET_TYPE_EXTENSION_RANGE(2),
            TARGET_TYPE_MESSAGE(3),
            TARGET_TYPE_FIELD(4),
            TARGET_TYPE_ONEOF(5),
            TARGET_TYPE_ENUM(6),
            TARGET_TYPE_ENUM_ENTRY(7),
            TARGET_TYPE_SERVICE(8),
            TARGET_TYPE_METHOD(9);

            public static final int X = 8;
            public static final int Y = 9;
            private static final s1.d<j> Z = new a();

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public static final int f50279l = 0;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public static final int f50280m = 1;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final int f50281n = 2;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public static final int f50282o = 3;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public static final int f50284s = 4;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public static final int f50285t = 5;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public static final int f50286v = 6;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public static final int f50287w = 7;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f50288a;

            class a implements s1.d<j> {
                a() {
                }

                @Override // androidx.datastore.preferences.protobuf.s1.d
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public j a(int number) {
                    return j.b(number);
                }
            }

            private static final class b implements s1.e {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                static final s1.e f50289a = new b();

                private b() {
                }

                @Override // androidx.datastore.preferences.protobuf.s1.e
                public boolean a(int number) {
                    return j.b(number) != null;
                }
            }

            j(int value) {
                this.f50288a = value;
            }

            public static j b(int value) {
                switch (value) {
                    case 0:
                        return TARGET_TYPE_UNKNOWN;
                    case 1:
                        return TARGET_TYPE_FILE;
                    case 2:
                        return TARGET_TYPE_EXTENSION_RANGE;
                    case 3:
                        return TARGET_TYPE_MESSAGE;
                    case 4:
                        return TARGET_TYPE_FIELD;
                    case 5:
                        return TARGET_TYPE_ONEOF;
                    case 6:
                        return TARGET_TYPE_ENUM;
                    case 7:
                        return TARGET_TYPE_ENUM_ENTRY;
                    case 8:
                        return TARGET_TYPE_SERVICE;
                    case 9:
                        return TARGET_TYPE_METHOD;
                    default:
                        return null;
                }
            }

            public static s1.d<j> k() {
                return Z;
            }

            public static s1.e l() {
                return b.f50289a;
            }

            @Deprecated
            public static j n(int value) {
                return b(value);
            }

            @Override // androidx.datastore.preferences.protobuf.s1.c
            public final int i() {
                return this.f50288a;
            }
        }

        static {
            u uVar = new u();
            DEFAULT_INSTANCE = uVar;
            l1.Y6(u.class, uVar);
        }

        private u() {
        }

        private void A9() {
            s1.l<d> lVar = this.editionDefaults_;
            if (lVar.s1()) {
                return;
            }
            this.editionDefaults_ = l1.r5(lVar);
        }

        private void B9() {
            s1.g gVar = this.targets_;
            if (!gVar.s1()) {
                this.targets_ = l1.b5(gVar);
            }
        }

        private void C9() {
            s1.l<u0> lVar = this.uninterpretedOption_;
            if (lVar.s1()) {
                return;
            }
            this.uninterpretedOption_ = l1.r5(lVar);
        }

        public static u D9() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void I9(f value) {
            value.getClass();
            f fVar = this.featureSupport_;
            if (fVar == null || fVar == f.p8()) {
                this.featureSupport_ = value;
            } else {
                this.featureSupport_ = f.r8(this.featureSupport_).u4(value).B1();
            }
            this.bitField0_ |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void J9(o value) {
            value.getClass();
            o oVar = this.features_;
            if (oVar == null || oVar == o.I8()) {
                this.features_ = value;
            } else {
                this.features_ = ((o.a) o.K8(this.features_).u4(value)).B1();
            }
            this.bitField0_ |= 512;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static b K9() {
            return (b) DEFAULT_INSTANCE.s3();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static b L9(u prototype) {
            return (b) DEFAULT_INSTANCE.v3(prototype);
        }

        public static u M9(InputStream input) throws IOException {
            return (u) l1.J5(DEFAULT_INSTANCE, input);
        }

        public static u N9(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (u) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static u O9(androidx.datastore.preferences.protobuf.u data) throws t1 {
            return (u) l1.R5(DEFAULT_INSTANCE, data);
        }

        public static u P9(androidx.datastore.preferences.protobuf.u data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (u) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static u Q9(androidx.datastore.preferences.protobuf.z input) throws IOException {
            return (u) l1.a6(DEFAULT_INSTANCE, input);
        }

        public static u R9(androidx.datastore.preferences.protobuf.z input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (u) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static u S9(InputStream input) throws IOException {
            return (u) l1.d6(DEFAULT_INSTANCE, input);
        }

        public static u T9(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (u) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static u U9(ByteBuffer data) throws t1 {
            return (u) l1.i6(DEFAULT_INSTANCE, data);
        }

        public static u V9(ByteBuffer data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (u) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static u W9(byte[] data) throws t1 {
            return (u) l1.p6(DEFAULT_INSTANCE, data);
        }

        public static u X9(byte[] data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (u) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static h3<u> Y9() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Z9(int index) {
            A9();
            this.editionDefaults_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void aa(int index) {
            C9();
            this.uninterpretedOption_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ba(c value) {
            this.ctype_ = value.i();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ca(boolean value) {
            this.bitField0_ |= 128;
            this.debugRedact_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void da(boolean value) {
            this.bitField0_ |= 32;
            this.deprecated_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e9(Iterable<? extends d> values) {
            A9();
            androidx.datastore.preferences.protobuf.a.m(values, this.editionDefaults_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ea(int index, d value) {
            value.getClass();
            A9();
            this.editionDefaults_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f9(Iterable<? extends j> values) {
            B9();
            Iterator<? extends j> it = values.iterator();
            while (it.hasNext()) {
                this.targets_.w1(it.next().i());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fa(f value) {
            value.getClass();
            this.featureSupport_ = value;
            this.bitField0_ |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g9(Iterable<? extends u0> values) {
            C9();
            androidx.datastore.preferences.protobuf.a.m(values, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ga(o value) {
            value.getClass();
            this.features_ = value;
            this.bitField0_ |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h9(int index, d value) {
            value.getClass();
            A9();
            this.editionDefaults_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ha(h value) {
            this.jstype_ = value.i();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i9(d value) {
            value.getClass();
            A9();
            this.editionDefaults_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ia(boolean value) {
            this.bitField0_ |= 8;
            this.lazy_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j9(j value) {
            value.getClass();
            B9();
            this.targets_.w1(value.i());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ja(boolean value) {
            this.bitField0_ |= 2;
            this.packed_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k9(int index, u0 value) {
            value.getClass();
            C9();
            this.uninterpretedOption_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ka(i value) {
            this.retention_ = value.i();
            this.bitField0_ |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l9(u0 value) {
            value.getClass();
            C9();
            this.uninterpretedOption_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void la(int index, j value) {
            value.getClass();
            B9();
            this.targets_.X(index, value.i());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m9() {
            this.bitField0_ &= -2;
            this.ctype_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ma(int index, u0 value) {
            value.getClass();
            C9();
            this.uninterpretedOption_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n9() {
            this.bitField0_ &= -129;
            this.debugRedact_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void na(boolean value) {
            this.bitField0_ |= 16;
            this.unverifiedLazy_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o9() {
            this.bitField0_ &= -33;
            this.deprecated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void oa(boolean value) {
            this.bitField0_ |= 64;
            this.weak_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p9() {
            this.editionDefaults_ = l1.T3();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q9() {
            this.featureSupport_ = null;
            this.bitField0_ &= -1025;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void r9() {
            this.features_ = null;
            this.bitField0_ &= -513;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s9() {
            this.bitField0_ &= -5;
            this.jstype_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t9() {
            this.bitField0_ &= -9;
            this.lazy_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void u9() {
            this.bitField0_ &= -3;
            this.packed_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void v9() {
            this.bitField0_ &= -257;
            this.retention_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w9() {
            this.targets_ = l1.N3();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void x9() {
            this.uninterpretedOption_ = l1.T3();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void y9() {
            this.bitField0_ &= -17;
            this.unverifiedLazy_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void z9() {
            this.bitField0_ &= -65;
            this.weak_ = false;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v
        public boolean C0() {
            return this.packed_;
        }

        @Override // androidx.datastore.preferences.protobuf.l1
        protected final Object D3(l1.i method, Object arg0, Object arg1) {
            h3 cVar;
            a aVar = null;
            switch (a.f50068a[method.ordinal()]) {
                case 1:
                    return new u();
                case 2:
                    return new b(aVar);
                case 3:
                    return l1.A5(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001ϧ\u000e\u0000\u0003\u0002\u0001᠌\u0000\u0002ဇ\u0001\u0003ဇ\u0005\u0005ဇ\u0003\u0006᠌\u0002\nဇ\u0006\u000fဇ\u0004\u0010ဇ\u0007\u0011᠌\b\u0013ࠞ\u0014\u001b\u0015ᐉ\t\u0016ဉ\nϧЛ", new Object[]{"bitField0_", "ctype_", c.l(), "packed_", "deprecated_", "lazy_", "jstype_", h.l(), "weak_", "unverifiedLazy_", "debugRedact_", "retention_", i.l(), "targets_", j.l(), "editionDefaults_", d.class, "features_", "featureSupport_", "uninterpretedOption_", u0.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    h3<u> h3Var = PARSER;
                    if (h3Var != null) {
                        return h3Var;
                    }
                    synchronized (u.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v
        public boolean E7() {
            return (this.bitField0_ & 8) != 0;
        }

        public e E9(int index) {
            return this.editionDefaults_.get(index);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v
        public int F7() {
            return this.targets_.size();
        }

        public List<? extends e> F9() {
            return this.editionDefaults_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v
        public h G5() {
            h hVarB = h.b(this.jstype_);
            return hVarB == null ? h.JS_NORMAL : hVarB;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v
        public boolean G7() {
            return (this.bitField0_ & 16) != 0;
        }

        public v0 G9(int index) {
            return this.uninterpretedOption_.get(index);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v
        public boolean H() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v
        public boolean H3() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v
        public int H7() {
            return this.editionDefaults_.size();
        }

        public List<? extends v0> H9() {
            return this.uninterpretedOption_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v
        public boolean J2() {
            return this.weak_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v
        public boolean O() {
            return this.debugRedact_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v
        public j O7(int index) {
            j jVarB = j.b(this.targets_.getInt(index));
            return jVarB == null ? j.TARGET_TYPE_UNKNOWN : jVarB;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v
        public boolean P() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v
        public d R7(int index) {
            return this.editionDefaults_.get(index);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v
        public i Y7() {
            i iVarB = i.b(this.retention_);
            if (iVarB == null) {
                iVarB = i.RETENTION_UNKNOWN;
            }
            return iVarB;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v
        public boolean Z1() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v
        public boolean b8() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v
        public List<j> c8() {
            return new s1.h(this.targets_, targets_converter_);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v
        public List<u0> d() {
            return this.uninterpretedOption_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v
        public boolean d8() {
            return this.unverifiedLazy_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v
        public u0 e(int index) {
            return this.uninterpretedOption_.get(index);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v
        public List<d> e8() {
            return this.editionDefaults_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v
        public int f() {
            return this.uninterpretedOption_.size();
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v
        public boolean j() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v
        public f k() {
            f fVarP8 = this.featureSupport_;
            if (fVarP8 == null) {
                fVarP8 = f.p8();
            }
            return fVarP8;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v
        public boolean l() {
            return this.deprecated_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v
        public boolean l6() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v
        public c p3() {
            c cVarB = c.b(this.ctype_);
            return cVarB == null ? c.STRING : cVarB;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v
        public boolean p4() {
            return this.lazy_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v
        public boolean r() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v
        public o t() {
            o oVarI8 = this.features_;
            if (oVarI8 == null) {
                oVarI8 = o.I8();
            }
            return oVarI8;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v
        public boolean z5() {
            return (this.bitField0_ & 64) != 0;
        }
    }

    public static final class u0 extends l1<u0, a> implements v0 {
        public static final int AGGREGATE_VALUE_FIELD_NUMBER = 8;
        private static final u0 DEFAULT_INSTANCE;
        public static final int DOUBLE_VALUE_FIELD_NUMBER = 6;
        public static final int IDENTIFIER_VALUE_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int NEGATIVE_INT_VALUE_FIELD_NUMBER = 5;
        private static volatile h3<u0> PARSER = null;
        public static final int POSITIVE_INT_VALUE_FIELD_NUMBER = 4;
        public static final int STRING_VALUE_FIELD_NUMBER = 7;
        private int bitField0_;
        private double doubleValue_;
        private long negativeIntValue_;
        private long positiveIntValue_;
        private byte memoizedIsInitialized = 2;
        private s1.l<b> name_ = l1.T3();
        private String identifierValue_ = "";
        private androidx.datastore.preferences.protobuf.u stringValue_ = androidx.datastore.preferences.protobuf.u.f50632f;
        private String aggregateValue_ = "";

        public static final class a extends l1.b<u0, a> implements v0 {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a A5() {
                V3();
                ((u0) this.f50422b).E8();
                return this;
            }

            public a B5() {
                V3();
                ((u0) this.f50422b).F8();
                return this;
            }

            public a D5(int index) {
                V3();
                ((u0) this.f50422b).Z8(index);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v0
            public boolean G2() {
                return ((u0) this.f50422b).G2();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v0
            public long G3() {
                return ((u0) this.f50422b).G3();
            }

            public a I5(String value) {
                V3();
                ((u0) this.f50422b).a9(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v0
            public boolean I7() {
                return ((u0) this.f50422b).I7();
            }

            public a J5(androidx.datastore.preferences.protobuf.u value) {
                V3();
                ((u0) this.f50422b).b9(value);
                return this;
            }

            public a L4(Iterable<? extends b> values) {
                V3();
                ((u0) this.f50422b).w8(values);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v0
            public androidx.datastore.preferences.protobuf.u O6() {
                return ((u0) this.f50422b).O6();
            }

            public a P4(int index, b.a builderForValue) {
                V3();
                ((u0) this.f50422b).x8(index, builderForValue.build());
                return this;
            }

            public a Q4(int index, b value) {
                V3();
                ((u0) this.f50422b).x8(index, value);
                return this;
            }

            public a R5(double value) {
                V3();
                ((u0) this.f50422b).c9(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v0
            public boolean S4() {
                return ((u0) this.f50422b).S4();
            }

            public a U4(b.a builderForValue) {
                V3();
                ((u0) this.f50422b).y8(builderForValue.build());
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v0
            public boolean U5() {
                return ((u0) this.f50422b).U5();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v0
            public double X() {
                return ((u0) this.f50422b).X();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v0
            public String X2() {
                return ((u0) this.f50422b).X2();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v0
            public String X5() {
                return ((u0) this.f50422b).X5();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v0
            public androidx.datastore.preferences.protobuf.u Y() {
                return ((u0) this.f50422b).Y();
            }

            public a Z4(b value) {
                V3();
                ((u0) this.f50422b).y8(value);
                return this;
            }

            public a Z5(String value) {
                V3();
                ((u0) this.f50422b).d9(value);
                return this;
            }

            public a a5() {
                V3();
                ((u0) this.f50422b).z8();
                return this;
            }

            public a a6(androidx.datastore.preferences.protobuf.u value) {
                V3();
                ((u0) this.f50422b).e9(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v0
            public boolean b0() {
                return ((u0) this.f50422b).b0();
            }

            public a b5() {
                V3();
                ((u0) this.f50422b).A8();
                return this;
            }

            public a c6(int index, b.a builderForValue) {
                V3();
                ((u0) this.f50422b).f9(index, builderForValue.build());
                return this;
            }

            public a d5() {
                V3();
                ((u0) this.f50422b).B8();
                return this;
            }

            public a d6(int index, b value) {
                V3();
                ((u0) this.f50422b).f9(index, value);
                return this;
            }

            public a e6(long value) {
                V3();
                ((u0) this.f50422b).g9(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v0
            public b getName(int index) {
                return ((u0) this.f50422b).getName(index);
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v0
            public int getNameCount() {
                return ((u0) this.f50422b).getNameCount();
            }

            public a i6(long value) {
                V3();
                ((u0) this.f50422b).h9(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v0
            public List<b> k2() {
                return Collections.unmodifiableList(((u0) this.f50422b).k2());
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v0
            public long n3() {
                return ((u0) this.f50422b).n3();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v0
            public androidx.datastore.preferences.protobuf.u o5() {
                return ((u0) this.f50422b).o5();
            }

            public a o6(androidx.datastore.preferences.protobuf.u value) {
                V3();
                ((u0) this.f50422b).i9(value);
                return this;
            }

            public a r5() {
                V3();
                ((u0) this.f50422b).C8();
                return this;
            }

            public a y5() {
                V3();
                ((u0) this.f50422b).D8();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.v0
            public boolean y6() {
                return ((u0) this.f50422b).y6();
            }

            private a() {
                super(u0.DEFAULT_INSTANCE);
            }
        }

        public static final class b extends l1<b, a> implements c {
            private static final b DEFAULT_INSTANCE;
            public static final int IS_EXTENSION_FIELD_NUMBER = 2;
            public static final int NAME_PART_FIELD_NUMBER = 1;
            private static volatile h3<b> PARSER;
            private int bitField0_;
            private boolean isExtension_;
            private byte memoizedIsInitialized = 2;
            private String namePart_ = "";

            public static final class a extends l1.b<b, a> implements c {
                /* synthetic */ a(a aVar) {
                    this();
                }

                public a L4() {
                    V3();
                    ((b) this.f50422b).g8();
                    return this;
                }

                public a P4() {
                    V3();
                    ((b) this.f50422b).h8();
                    return this;
                }

                public a Q4(boolean value) {
                    V3();
                    ((b) this.f50422b).z8(value);
                    return this;
                }

                @Override // androidx.datastore.preferences.protobuf.e0.u0.c
                public boolean S5() {
                    return ((b) this.f50422b).S5();
                }

                public a U4(String value) {
                    V3();
                    ((b) this.f50422b).A8(value);
                    return this;
                }

                @Override // androidx.datastore.preferences.protobuf.e0.u0.c
                public androidx.datastore.preferences.protobuf.u V2() {
                    return ((b) this.f50422b).V2();
                }

                public a Z4(androidx.datastore.preferences.protobuf.u value) {
                    V3();
                    ((b) this.f50422b).B8(value);
                    return this;
                }

                @Override // androidx.datastore.preferences.protobuf.e0.u0.c
                public String n5() {
                    return ((b) this.f50422b).n5();
                }

                @Override // androidx.datastore.preferences.protobuf.e0.u0.c
                public boolean s6() {
                    return ((b) this.f50422b).s6();
                }

                @Override // androidx.datastore.preferences.protobuf.e0.u0.c
                public boolean u7() {
                    return ((b) this.f50422b).u7();
                }

                private a() {
                    super(b.DEFAULT_INSTANCE);
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
            public void A8(String value) {
                value.getClass();
                this.bitField0_ |= 1;
                this.namePart_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void B8(androidx.datastore.preferences.protobuf.u value) {
                this.namePart_ = value.A0();
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void g8() {
                this.bitField0_ &= -3;
                this.isExtension_ = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void h8() {
                this.bitField0_ &= -2;
                this.namePart_ = j8().n5();
            }

            public static b j8() {
                return DEFAULT_INSTANCE;
            }

            public static a k8() {
                return DEFAULT_INSTANCE.s3();
            }

            public static a l8(b prototype) {
                return DEFAULT_INSTANCE.v3(prototype);
            }

            public static b m8(InputStream input) throws IOException {
                return (b) l1.J5(DEFAULT_INSTANCE, input);
            }

            public static b n8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
                return (b) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static b o8(androidx.datastore.preferences.protobuf.u data) throws t1 {
                return (b) l1.R5(DEFAULT_INSTANCE, data);
            }

            public static b p8(androidx.datastore.preferences.protobuf.u data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
                return (b) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static b q8(androidx.datastore.preferences.protobuf.z input) throws IOException {
                return (b) l1.a6(DEFAULT_INSTANCE, input);
            }

            public static b r8(androidx.datastore.preferences.protobuf.z input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
                return (b) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static b s8(InputStream input) throws IOException {
                return (b) l1.d6(DEFAULT_INSTANCE, input);
            }

            public static b t8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
                return (b) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static b u8(ByteBuffer data) throws t1 {
                return (b) l1.i6(DEFAULT_INSTANCE, data);
            }

            public static b v8(ByteBuffer data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
                return (b) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static b w8(byte[] data) throws t1 {
                return (b) l1.p6(DEFAULT_INSTANCE, data);
            }

            public static b x8(byte[] data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
                return (b) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static h3<b> y8() {
                return DEFAULT_INSTANCE.W7();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void z8(boolean value) {
                this.bitField0_ |= 2;
                this.isExtension_ = value;
            }

            @Override // androidx.datastore.preferences.protobuf.l1
            protected final Object D3(l1.i method, Object arg0, Object arg1) {
                h3 cVar;
                a aVar = null;
                switch (a.f50068a[method.ordinal()]) {
                    case 1:
                        return new b();
                    case 2:
                        return new a(aVar);
                    case 3:
                        return l1.A5(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔇ\u0001", new Object[]{"bitField0_", "namePart_", "isExtension_"});
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
                        return Byte.valueOf(this.memoizedIsInitialized);
                    case 7:
                        this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            @Override // androidx.datastore.preferences.protobuf.e0.u0.c
            public boolean S5() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.u0.c
            public androidx.datastore.preferences.protobuf.u V2() {
                return androidx.datastore.preferences.protobuf.u.C(this.namePart_);
            }

            @Override // androidx.datastore.preferences.protobuf.e0.u0.c
            public String n5() {
                return this.namePart_;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.u0.c
            public boolean s6() {
                return this.isExtension_;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.u0.c
            public boolean u7() {
                return (this.bitField0_ & 2) != 0;
            }
        }

        public interface c extends r2 {
            boolean S5();

            androidx.datastore.preferences.protobuf.u V2();

            String n5();

            boolean s6();

            boolean u7();
        }

        static {
            u0 u0Var = new u0();
            DEFAULT_INSTANCE = u0Var;
            l1.Y6(u0.class, u0Var);
        }

        private u0() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void A8() {
            this.bitField0_ &= -9;
            this.doubleValue_ = 0.0d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void B8() {
            this.bitField0_ &= -2;
            this.identifierValue_ = H8().X2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C8() {
            this.name_ = l1.T3();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void D8() {
            this.bitField0_ &= -5;
            this.negativeIntValue_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void E8() {
            this.bitField0_ &= -3;
            this.positiveIntValue_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void F8() {
            this.bitField0_ &= -17;
            this.stringValue_ = H8().Y();
        }

        private void G8() {
            s1.l<b> lVar = this.name_;
            if (lVar.s1()) {
                return;
            }
            this.name_ = l1.r5(lVar);
        }

        public static u0 H8() {
            return DEFAULT_INSTANCE;
        }

        public static a K8() {
            return DEFAULT_INSTANCE.s3();
        }

        public static a L8(u0 prototype) {
            return DEFAULT_INSTANCE.v3(prototype);
        }

        public static u0 M8(InputStream input) throws IOException {
            return (u0) l1.J5(DEFAULT_INSTANCE, input);
        }

        public static u0 N8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (u0) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static u0 O8(androidx.datastore.preferences.protobuf.u data) throws t1 {
            return (u0) l1.R5(DEFAULT_INSTANCE, data);
        }

        public static u0 P8(androidx.datastore.preferences.protobuf.u data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (u0) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static u0 Q8(androidx.datastore.preferences.protobuf.z input) throws IOException {
            return (u0) l1.a6(DEFAULT_INSTANCE, input);
        }

        public static u0 R8(androidx.datastore.preferences.protobuf.z input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (u0) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static u0 S8(InputStream input) throws IOException {
            return (u0) l1.d6(DEFAULT_INSTANCE, input);
        }

        public static u0 T8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (u0) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static u0 U8(ByteBuffer data) throws t1 {
            return (u0) l1.i6(DEFAULT_INSTANCE, data);
        }

        public static u0 V8(ByteBuffer data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (u0) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static u0 W8(byte[] data) throws t1 {
            return (u0) l1.p6(DEFAULT_INSTANCE, data);
        }

        public static u0 X8(byte[] data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (u0) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static h3<u0> Y8() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Z8(int index) {
            G8();
            this.name_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a9(String value) {
            value.getClass();
            this.bitField0_ |= 32;
            this.aggregateValue_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b9(androidx.datastore.preferences.protobuf.u value) {
            this.aggregateValue_ = value.A0();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c9(double value) {
            this.bitField0_ |= 8;
            this.doubleValue_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d9(String value) {
            value.getClass();
            this.bitField0_ |= 1;
            this.identifierValue_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e9(androidx.datastore.preferences.protobuf.u value) {
            this.identifierValue_ = value.A0();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f9(int index, b value) {
            value.getClass();
            G8();
            this.name_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g9(long value) {
            this.bitField0_ |= 4;
            this.negativeIntValue_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h9(long value) {
            this.bitField0_ |= 2;
            this.positiveIntValue_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i9(androidx.datastore.preferences.protobuf.u value) {
            value.getClass();
            this.bitField0_ |= 16;
            this.stringValue_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w8(Iterable<? extends b> values) {
            G8();
            androidx.datastore.preferences.protobuf.a.m(values, this.name_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void x8(int index, b value) {
            value.getClass();
            G8();
            this.name_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void y8(b value) {
            value.getClass();
            G8();
            this.name_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void z8() {
            this.bitField0_ &= -33;
            this.aggregateValue_ = H8().X5();
        }

        @Override // androidx.datastore.preferences.protobuf.l1
        protected final Object D3(l1.i method, Object arg0, Object arg1) {
            h3 cVar;
            a aVar = null;
            switch (a.f50068a[method.ordinal()]) {
                case 1:
                    return new u0();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.A5(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0001\u0002Л\u0003ဈ\u0000\u0004ဃ\u0001\u0005ဂ\u0002\u0006က\u0003\u0007ည\u0004\bဈ\u0005", new Object[]{"bitField0_", "name_", b.class, "identifierValue_", "positiveIntValue_", "negativeIntValue_", "doubleValue_", "stringValue_", "aggregateValue_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    h3<u0> h3Var = PARSER;
                    if (h3Var != null) {
                        return h3Var;
                    }
                    synchronized (u0.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v0
        public boolean G2() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v0
        public long G3() {
            return this.positiveIntValue_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v0
        public boolean I7() {
            return (this.bitField0_ & 32) != 0;
        }

        public c I8(int index) {
            return this.name_.get(index);
        }

        public List<? extends c> J8() {
            return this.name_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v0
        public androidx.datastore.preferences.protobuf.u O6() {
            return androidx.datastore.preferences.protobuf.u.C(this.identifierValue_);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v0
        public boolean S4() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v0
        public boolean U5() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v0
        public double X() {
            return this.doubleValue_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v0
        public String X2() {
            return this.identifierValue_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v0
        public String X5() {
            return this.aggregateValue_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v0
        public androidx.datastore.preferences.protobuf.u Y() {
            return this.stringValue_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v0
        public boolean b0() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v0
        public b getName(int index) {
            return this.name_.get(index);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v0
        public int getNameCount() {
            return this.name_.size();
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v0
        public List<b> k2() {
            return this.name_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v0
        public long n3() {
            return this.negativeIntValue_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v0
        public androidx.datastore.preferences.protobuf.u o5() {
            return androidx.datastore.preferences.protobuf.u.C(this.aggregateValue_);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.v0
        public boolean y6() {
            return (this.bitField0_ & 4) != 0;
        }
    }

    public interface v extends l1.f<u, u.b> {
        boolean C0();

        boolean E7();

        int F7();

        u.h G5();

        boolean G7();

        boolean H();

        boolean H3();

        int H7();

        boolean J2();

        boolean O();

        u.j O7(int index);

        boolean P();

        u.d R7(int index);

        u.i Y7();

        boolean Z1();

        boolean b8();

        List<u.j> c8();

        List<u0> d();

        boolean d8();

        u0 e(int index);

        List<u.d> e8();

        int f();

        boolean j();

        u.f k();

        boolean l();

        boolean l6();

        u.c p3();

        boolean p4();

        boolean r();

        o t();

        boolean z5();
    }

    public interface v0 extends r2 {
        boolean G2();

        long G3();

        boolean I7();

        androidx.datastore.preferences.protobuf.u O6();

        boolean S4();

        boolean U5();

        double X();

        String X2();

        String X5();

        androidx.datastore.preferences.protobuf.u Y();

        boolean b0();

        u0.b getName(int index);

        int getNameCount();

        List<u0.b> k2();

        long n3();

        androidx.datastore.preferences.protobuf.u o5();

        boolean y6();
    }

    public static final class w extends l1<w, a> implements x {
        private static final w DEFAULT_INSTANCE;
        public static final int DEPENDENCY_FIELD_NUMBER = 3;
        public static final int EDITION_FIELD_NUMBER = 14;
        public static final int ENUM_TYPE_FIELD_NUMBER = 5;
        public static final int EXTENSION_FIELD_NUMBER = 7;
        public static final int MESSAGE_TYPE_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 8;
        public static final int PACKAGE_FIELD_NUMBER = 2;
        private static volatile h3<w> PARSER = null;
        public static final int PUBLIC_DEPENDENCY_FIELD_NUMBER = 10;
        public static final int SERVICE_FIELD_NUMBER = 6;
        public static final int SOURCE_CODE_INFO_FIELD_NUMBER = 9;
        public static final int SYNTAX_FIELD_NUMBER = 12;
        public static final int WEAK_DEPENDENCY_FIELD_NUMBER = 11;
        private int bitField0_;
        private int edition_;
        private a0 options_;
        private s0 sourceCodeInfo_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private String package_ = "";
        private s1.l<String> dependency_ = l1.T3();
        private s1.g publicDependency_ = l1.N3();
        private s1.g weakDependency_ = l1.N3();
        private s1.l<b> messageType_ = l1.T3();
        private s1.l<e> enumType_ = l1.T3();
        private s1.l<o0> service_ = l1.T3();
        private s1.l<s> extension_ = l1.T3();
        private String syntax_ = "";

        public static final class a extends l1.b<w, a> implements x {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.x
            public List<b> A3() {
                return Collections.unmodifiableList(((w) this.f50422b).A3());
            }

            public a A5(int index, e value) {
                V3();
                ((w) this.f50422b).n9(index, value);
                return this;
            }

            public a A6() {
                V3();
                ((w) this.f50422b).x9();
                return this;
            }

            public a A7() {
                V3();
                ((w) this.f50422b).H9();
                return this;
            }

            public a A8(androidx.datastore.preferences.protobuf.u value) {
                V3();
                ((w) this.f50422b).Ea(value);
                return this;
            }

            public a B5(e.a builderForValue) {
                V3();
                ((w) this.f50422b).o9(builderForValue.build());
                return this;
            }

            public a B8(int index, int value) {
                V3();
                ((w) this.f50422b).Fa(index, value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.x
            public d C() {
                return ((w) this.f50422b).C();
            }

            public a C7() {
                V3();
                ((w) this.f50422b).I9();
                return this;
            }

            public a C8(int index, o0.a builderForValue) {
                V3();
                ((w) this.f50422b).Ga(index, builderForValue.build());
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.x
            public boolean D4() {
                return ((w) this.f50422b).D4();
            }

            public a D5(e value) {
                V3();
                ((w) this.f50422b).o9(value);
                return this;
            }

            public a D8(int index, o0 value) {
                V3();
                ((w) this.f50422b).Ga(index, value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.x
            public boolean E() {
                return ((w) this.f50422b).E();
            }

            public a E6() {
                V3();
                ((w) this.f50422b).y9();
                return this;
            }

            public a E8(s0.a builderForValue) {
                V3();
                ((w) this.f50422b).Ha(builderForValue.build());
                return this;
            }

            public a F8(s0 value) {
                V3();
                ((w) this.f50422b).Ha(value);
                return this;
            }

            public a G8(String value) {
                V3();
                ((w) this.f50422b).Ia(value);
                return this;
            }

            public a H8(androidx.datastore.preferences.protobuf.u value) {
                V3();
                ((w) this.f50422b).Ja(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.x
            public int I2() {
                return ((w) this.f50422b).I2();
            }

            public a I5(int index, s.a builderForValue) {
                V3();
                ((w) this.f50422b).p9(index, builderForValue.build());
                return this;
            }

            public a I8(int index, int value) {
                V3();
                ((w) this.f50422b).Ka(index, value);
                return this;
            }

            public a J5(int index, s value) {
                V3();
                ((w) this.f50422b).p9(index, value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.x
            public List<Integer> J6() {
                return Collections.unmodifiableList(((w) this.f50422b).J6());
            }

            @Override // androidx.datastore.preferences.protobuf.e0.x
            public int J7() {
                return ((w) this.f50422b).J7();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.x
            public s K0(int index) {
                return ((w) this.f50422b).K0(index);
            }

            @Override // androidx.datastore.preferences.protobuf.e0.x
            public int K5() {
                return ((w) this.f50422b).K5();
            }

            public a L4(Iterable<String> values) {
                V3();
                ((w) this.f50422b).e9(values);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.x
            public String M5(int index) {
                return ((w) this.f50422b).M5(index);
            }

            @Override // androidx.datastore.preferences.protobuf.e0.x
            public int O5(int index) {
                return ((w) this.f50422b).O5(index);
            }

            public a P4(Iterable<? extends e> values) {
                V3();
                ((w) this.f50422b).f9(values);
                return this;
            }

            public a Q4(Iterable<? extends s> values) {
                V3();
                ((w) this.f50422b).g9(values);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.x
            public b Q5(int index) {
                return ((w) this.f50422b).Q5(index);
            }

            public a R5(s.a builderForValue) {
                V3();
                ((w) this.f50422b).q9(builderForValue.build());
                return this;
            }

            public a R6() {
                V3();
                ((w) this.f50422b).z9();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.x
            public List<Integer> T2() {
                return Collections.unmodifiableList(((w) this.f50422b).T2());
            }

            public a U4(Iterable<? extends b> values) {
                V3();
                ((w) this.f50422b).h9(values);
                return this;
            }

            public a U6() {
                V3();
                ((w) this.f50422b).A9();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.x
            public androidx.datastore.preferences.protobuf.u Y2() {
                return ((w) this.f50422b).Y2();
            }

            public a Y6() {
                V3();
                ((w) this.f50422b).B9();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.x
            public boolean Z2() {
                return ((w) this.f50422b).Z2();
            }

            public a Z4(Iterable<? extends Integer> values) {
                V3();
                ((w) this.f50422b).i9(values);
                return this;
            }

            public a Z5(s value) {
                V3();
                ((w) this.f50422b).q9(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.x
            public androidx.datastore.preferences.protobuf.u a() {
                return ((w) this.f50422b).a();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.x
            public List<e> a0() {
                return Collections.unmodifiableList(((w) this.f50422b).a0());
            }

            public a a5(Iterable<? extends o0> values) {
                V3();
                ((w) this.f50422b).j9(values);
                return this;
            }

            public a a6(int index, b.a builderForValue) {
                V3();
                ((w) this.f50422b).r9(index, builderForValue.build());
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.x
            public a0 b() {
                return ((w) this.f50422b).b();
            }

            public a b5(Iterable<? extends Integer> values) {
                V3();
                ((w) this.f50422b).k9(values);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.x
            public int b6() {
                return ((w) this.f50422b).b6();
            }

            public a b7() {
                V3();
                ((w) this.f50422b).C9();
                return this;
            }

            public a c6(int index, b value) {
                V3();
                ((w) this.f50422b).r9(index, value);
                return this;
            }

            public a d5(String value) {
                V3();
                ((w) this.f50422b).l9(value);
                return this;
            }

            public a d6(b.a builderForValue) {
                V3();
                ((w) this.f50422b).s9(builderForValue.build());
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.x
            public o0 e3(int index) {
                return ((w) this.f50422b).e3(index);
            }

            public a e6(b value) {
                V3();
                ((w) this.f50422b).s9(value);
                return this;
            }

            public a f7() {
                V3();
                ((w) this.f50422b).D9();
                return this;
            }

            public a f8() {
                V3();
                ((w) this.f50422b).J9();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.x
            public boolean g() {
                return ((w) this.f50422b).g();
            }

            public a g8(a0 value) {
                V3();
                ((w) this.f50422b).aa(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.x
            public String getName() {
                return ((w) this.f50422b).getName();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.x
            public boolean h() {
                return ((w) this.f50422b).h();
            }

            public a h8(s0 value) {
                V3();
                ((w) this.f50422b).ba(value);
                return this;
            }

            public a i6(int value) {
                V3();
                ((w) this.f50422b).t9(value);
                return this;
            }

            public a i7() {
                V3();
                ((w) this.f50422b).E9();
                return this;
            }

            public a j7() {
                V3();
                ((w) this.f50422b).F9();
                return this;
            }

            public a j8(int index) {
                V3();
                ((w) this.f50422b).ra(index);
                return this;
            }

            public a k8(int index) {
                V3();
                ((w) this.f50422b).sa(index);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.x
            public boolean l2() {
                return ((w) this.f50422b).l2();
            }

            public a l8(int index) {
                V3();
                ((w) this.f50422b).ta(index);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.x
            public int m0() {
                return ((w) this.f50422b).m0();
            }

            public a m8(int index) {
                V3();
                ((w) this.f50422b).ua(index);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.x
            public androidx.datastore.preferences.protobuf.u n7() {
                return ((w) this.f50422b).n7();
            }

            public a n8(int index, String value) {
                V3();
                ((w) this.f50422b).va(index, value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.x
            public androidx.datastore.preferences.protobuf.u o3(int index) {
                return ((w) this.f50422b).o3(index);
            }

            public a o6(int index, o0.a builderForValue) {
                V3();
                ((w) this.f50422b).u9(index, builderForValue.build());
                return this;
            }

            public a o8(d value) {
                V3();
                ((w) this.f50422b).wa(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.x
            public String p() {
                return ((w) this.f50422b).p();
            }

            public a p6(int index, o0 value) {
                V3();
                ((w) this.f50422b).u9(index, value);
                return this;
            }

            public a p8(int index, e.a builderForValue) {
                V3();
                ((w) this.f50422b).xa(index, builderForValue.build());
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.x
            public int q5(int index) {
                return ((w) this.f50422b).q5(index);
            }

            public a q8(int index, e value) {
                V3();
                ((w) this.f50422b).xa(index, value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.x
            public List<s> r0() {
                return Collections.unmodifiableList(((w) this.f50422b).r0());
            }

            public a r5(androidx.datastore.preferences.protobuf.u value) {
                V3();
                ((w) this.f50422b).m9(value);
                return this;
            }

            public a r6(o0.a builderForValue) {
                V3();
                ((w) this.f50422b).v9(builderForValue.build());
                return this;
            }

            public a r8(int index, s.a builderForValue) {
                V3();
                ((w) this.f50422b).ya(index, builderForValue.build());
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.x
            public List<o0> s4() {
                return Collections.unmodifiableList(((w) this.f50422b).s4());
            }

            public a s8(int index, s value) {
                V3();
                ((w) this.f50422b).ya(index, value);
                return this;
            }

            public a t6(o0 value) {
                V3();
                ((w) this.f50422b).v9(value);
                return this;
            }

            public a t8(int index, b.a builderForValue) {
                V3();
                ((w) this.f50422b).za(index, builderForValue.build());
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.x
            public String u6() {
                return ((w) this.f50422b).u6();
            }

            public a u8(int index, b value) {
                V3();
                ((w) this.f50422b).za(index, value);
                return this;
            }

            public a v8(String value) {
                V3();
                ((w) this.f50422b).Aa(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.x
            public int w0() {
                return ((w) this.f50422b).w0();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.x
            public s0 w3() {
                return ((w) this.f50422b).w3();
            }

            public a w6(int value) {
                V3();
                ((w) this.f50422b).w9(value);
                return this;
            }

            public a w8(androidx.datastore.preferences.protobuf.u value) {
                V3();
                ((w) this.f50422b).Ba(value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.x
            public int x3() {
                return ((w) this.f50422b).x3();
            }

            @Override // androidx.datastore.preferences.protobuf.e0.x
            public List<String> x6() {
                return Collections.unmodifiableList(((w) this.f50422b).x6());
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a x8(a0.a builderForValue) {
                V3();
                ((w) this.f50422b).Ca((a0) builderForValue.build());
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.x
            public e y0(int index) {
                return ((w) this.f50422b).y0(index);
            }

            public a y5(int index, e.a builderForValue) {
                V3();
                ((w) this.f50422b).n9(index, builderForValue.build());
                return this;
            }

            public a y7() {
                V3();
                ((w) this.f50422b).G9();
                return this;
            }

            public a y8(a0 value) {
                V3();
                ((w) this.f50422b).Ca(value);
                return this;
            }

            public a z8(String value) {
                V3();
                ((w) this.f50422b).Da(value);
                return this;
            }

            private a() {
                super(w.DEFAULT_INSTANCE);
            }
        }

        static {
            w wVar = new w();
            DEFAULT_INSTANCE = wVar;
            l1.Y6(w.class, wVar);
        }

        private w() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void A9() {
            this.extension_ = l1.T3();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Aa(String value) {
            value.getClass();
            this.bitField0_ |= 1;
            this.name_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void B9() {
            this.messageType_ = l1.T3();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ba(androidx.datastore.preferences.protobuf.u value) {
            this.name_ = value.A0();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C9() {
            this.bitField0_ &= -2;
            this.name_ = R9().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ca(a0 value) {
            value.getClass();
            this.options_ = value;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void D9() {
            this.options_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Da(String value) {
            value.getClass();
            this.bitField0_ |= 2;
            this.package_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void E9() {
            this.bitField0_ &= -3;
            this.package_ = R9().u6();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ea(androidx.datastore.preferences.protobuf.u value) {
            this.package_ = value.A0();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void F9() {
            this.publicDependency_ = l1.N3();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Fa(int index, int value) {
            O9();
            this.publicDependency_.X(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void G9() {
            this.service_ = l1.T3();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ga(int index, o0 value) {
            value.getClass();
            P9();
            this.service_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void H9() {
            this.sourceCodeInfo_ = null;
            this.bitField0_ &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ha(s0 value) {
            value.getClass();
            this.sourceCodeInfo_ = value;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void I9() {
            this.bitField0_ &= -17;
            this.syntax_ = R9().p();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ia(String value) {
            value.getClass();
            this.bitField0_ |= 16;
            this.syntax_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void J9() {
            this.weakDependency_ = l1.N3();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ja(androidx.datastore.preferences.protobuf.u value) {
            this.syntax_ = value.A0();
            this.bitField0_ |= 16;
        }

        private void K9() {
            s1.l<String> lVar = this.dependency_;
            if (lVar.s1()) {
                return;
            }
            this.dependency_ = l1.r5(lVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ka(int index, int value) {
            Q9();
            this.weakDependency_.X(index, value);
        }

        private void L9() {
            s1.l<e> lVar = this.enumType_;
            if (!lVar.s1()) {
                this.enumType_ = l1.r5(lVar);
            }
        }

        private void M9() {
            s1.l<s> lVar = this.extension_;
            if (lVar.s1()) {
                return;
            }
            this.extension_ = l1.r5(lVar);
        }

        private void N9() {
            s1.l<b> lVar = this.messageType_;
            if (lVar.s1()) {
                return;
            }
            this.messageType_ = l1.r5(lVar);
        }

        private void O9() {
            s1.g gVar = this.publicDependency_;
            if (gVar.s1()) {
                return;
            }
            this.publicDependency_ = l1.b5(gVar);
        }

        private void P9() {
            s1.l<o0> lVar = this.service_;
            if (lVar.s1()) {
                return;
            }
            this.service_ = l1.r5(lVar);
        }

        private void Q9() {
            s1.g gVar = this.weakDependency_;
            if (!gVar.s1()) {
                this.weakDependency_ = l1.b5(gVar);
            }
        }

        public static w R9() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void aa(a0 value) {
            value.getClass();
            a0 a0Var = this.options_;
            if (a0Var == null || a0Var == a0.U9()) {
                this.options_ = value;
            } else {
                this.options_ = ((a0.a) a0.Z9(this.options_).u4(value)).B1();
            }
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ba(s0 value) {
            value.getClass();
            s0 s0Var = this.sourceCodeInfo_;
            if (s0Var == null || s0Var == s0.n8()) {
                this.sourceCodeInfo_ = value;
            } else {
                this.sourceCodeInfo_ = s0.r8(this.sourceCodeInfo_).u4(value).B1();
            }
            this.bitField0_ |= 8;
        }

        public static a ca() {
            return DEFAULT_INSTANCE.s3();
        }

        public static a da(w prototype) {
            return DEFAULT_INSTANCE.v3(prototype);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e9(Iterable<String> values) {
            K9();
            androidx.datastore.preferences.protobuf.a.m(values, this.dependency_);
        }

        public static w ea(InputStream input) throws IOException {
            return (w) l1.J5(DEFAULT_INSTANCE, input);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f9(Iterable<? extends e> values) {
            L9();
            androidx.datastore.preferences.protobuf.a.m(values, this.enumType_);
        }

        public static w fa(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (w) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g9(Iterable<? extends s> values) {
            M9();
            androidx.datastore.preferences.protobuf.a.m(values, this.extension_);
        }

        public static w ga(androidx.datastore.preferences.protobuf.u data) throws t1 {
            return (w) l1.R5(DEFAULT_INSTANCE, data);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h9(Iterable<? extends b> values) {
            N9();
            androidx.datastore.preferences.protobuf.a.m(values, this.messageType_);
        }

        public static w ha(androidx.datastore.preferences.protobuf.u data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (w) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i9(Iterable<? extends Integer> values) {
            O9();
            androidx.datastore.preferences.protobuf.a.m(values, this.publicDependency_);
        }

        public static w ia(androidx.datastore.preferences.protobuf.z input) throws IOException {
            return (w) l1.a6(DEFAULT_INSTANCE, input);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j9(Iterable<? extends o0> values) {
            P9();
            androidx.datastore.preferences.protobuf.a.m(values, this.service_);
        }

        public static w ja(androidx.datastore.preferences.protobuf.z input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (w) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k9(Iterable<? extends Integer> values) {
            Q9();
            androidx.datastore.preferences.protobuf.a.m(values, this.weakDependency_);
        }

        public static w ka(InputStream input) throws IOException {
            return (w) l1.d6(DEFAULT_INSTANCE, input);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l9(String value) {
            value.getClass();
            K9();
            this.dependency_.add(value);
        }

        public static w la(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (w) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m9(androidx.datastore.preferences.protobuf.u value) {
            K9();
            this.dependency_.add(value.A0());
        }

        public static w ma(ByteBuffer data) throws t1 {
            return (w) l1.i6(DEFAULT_INSTANCE, data);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n9(int index, e value) {
            value.getClass();
            L9();
            this.enumType_.add(index, value);
        }

        public static w na(ByteBuffer data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (w) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o9(e value) {
            value.getClass();
            L9();
            this.enumType_.add(value);
        }

        public static w oa(byte[] data) throws t1 {
            return (w) l1.p6(DEFAULT_INSTANCE, data);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p9(int index, s value) {
            value.getClass();
            M9();
            this.extension_.add(index, value);
        }

        public static w pa(byte[] data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (w) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q9(s value) {
            value.getClass();
            M9();
            this.extension_.add(value);
        }

        public static h3<w> qa() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void r9(int index, b value) {
            value.getClass();
            N9();
            this.messageType_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ra(int index) {
            L9();
            this.enumType_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s9(b value) {
            value.getClass();
            N9();
            this.messageType_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void sa(int index) {
            M9();
            this.extension_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t9(int value) {
            O9();
            this.publicDependency_.w1(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ta(int index) {
            N9();
            this.messageType_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void u9(int index, o0 value) {
            value.getClass();
            P9();
            this.service_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ua(int index) {
            P9();
            this.service_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void v9(o0 value) {
            value.getClass();
            P9();
            this.service_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void va(int index, String value) {
            value.getClass();
            K9();
            this.dependency_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w9(int value) {
            Q9();
            this.weakDependency_.w1(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void wa(d value) {
            this.edition_ = value.i();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void x9() {
            this.dependency_ = l1.T3();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void xa(int index, e value) {
            value.getClass();
            L9();
            this.enumType_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void y9() {
            this.bitField0_ &= -33;
            this.edition_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ya(int index, s value) {
            value.getClass();
            M9();
            this.extension_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void z9() {
            this.enumType_ = l1.T3();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void za(int index, b value) {
            value.getClass();
            N9();
            this.messageType_.set(index, value);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.x
        public List<b> A3() {
            return this.messageType_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.x
        public d C() {
            d dVarB = d.b(this.edition_);
            return dVarB == null ? d.EDITION_UNKNOWN : dVarB;
        }

        @Override // androidx.datastore.preferences.protobuf.l1
        protected final Object D3(l1.i method, Object arg0, Object arg1) {
            h3 cVar;
            a aVar = null;
            switch (a.f50068a[method.ordinal()]) {
                case 1:
                    return new w();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.A5(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0007\u0005\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004Л\u0005Л\u0006Л\u0007Л\bᐉ\u0002\tဉ\u0003\n\u0016\u000b\u0016\fဈ\u0004\u000e᠌\u0005", new Object[]{"bitField0_", "name_", "package_", "dependency_", "messageType_", b.class, "enumType_", e.class, "service_", o0.class, "extension_", s.class, "options_", "sourceCodeInfo_", "publicDependency_", "weakDependency_", "syntax_", "edition_", d.l()});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    h3<w> h3Var = PARSER;
                    if (h3Var != null) {
                        return h3Var;
                    }
                    synchronized (w.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.e0.x
        public boolean D4() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.x
        public boolean E() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.x
        public int I2() {
            return this.publicDependency_.size();
        }

        @Override // androidx.datastore.preferences.protobuf.e0.x
        public List<Integer> J6() {
            return this.publicDependency_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.x
        public int J7() {
            return this.weakDependency_.size();
        }

        @Override // androidx.datastore.preferences.protobuf.e0.x
        public s K0(int index) {
            return this.extension_.get(index);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.x
        public int K5() {
            return this.dependency_.size();
        }

        @Override // androidx.datastore.preferences.protobuf.e0.x
        public String M5(int index) {
            return this.dependency_.get(index);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.x
        public int O5(int index) {
            return this.publicDependency_.getInt(index);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.x
        public b Q5(int index) {
            return this.messageType_.get(index);
        }

        public f S9(int index) {
            return this.enumType_.get(index);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.x
        public List<Integer> T2() {
            return this.weakDependency_;
        }

        public List<? extends f> T9() {
            return this.enumType_;
        }

        public t U9(int index) {
            return this.extension_.get(index);
        }

        public List<? extends t> V9() {
            return this.extension_;
        }

        public c W9(int index) {
            return this.messageType_.get(index);
        }

        public List<? extends c> X9() {
            return this.messageType_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.x
        public androidx.datastore.preferences.protobuf.u Y2() {
            return androidx.datastore.preferences.protobuf.u.C(this.syntax_);
        }

        public p0 Y9(int index) {
            return this.service_.get(index);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.x
        public boolean Z2() {
            return (this.bitField0_ & 8) != 0;
        }

        public List<? extends p0> Z9() {
            return this.service_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.x
        public androidx.datastore.preferences.protobuf.u a() {
            return androidx.datastore.preferences.protobuf.u.C(this.name_);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.x
        public List<e> a0() {
            return this.enumType_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.x
        public a0 b() {
            a0 a0Var = this.options_;
            return a0Var == null ? a0.U9() : a0Var;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.x
        public int b6() {
            return this.messageType_.size();
        }

        @Override // androidx.datastore.preferences.protobuf.e0.x
        public o0 e3(int index) {
            return this.service_.get(index);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.x
        public boolean g() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.x
        public String getName() {
            return this.name_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.x
        public boolean h() {
            int i10 = 5 >> 1;
            return (this.bitField0_ & 1) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.x
        public boolean l2() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.x
        public int m0() {
            return this.extension_.size();
        }

        @Override // androidx.datastore.preferences.protobuf.e0.x
        public androidx.datastore.preferences.protobuf.u n7() {
            return androidx.datastore.preferences.protobuf.u.C(this.package_);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.x
        public androidx.datastore.preferences.protobuf.u o3(int index) {
            return androidx.datastore.preferences.protobuf.u.C(this.dependency_.get(index));
        }

        @Override // androidx.datastore.preferences.protobuf.e0.x
        public String p() {
            return this.syntax_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.x
        public int q5(int index) {
            return this.weakDependency_.getInt(index);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.x
        public List<s> r0() {
            return this.extension_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.x
        public List<o0> s4() {
            return this.service_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.x
        public String u6() {
            return this.package_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.x
        public int w0() {
            return this.enumType_.size();
        }

        @Override // androidx.datastore.preferences.protobuf.e0.x
        public s0 w3() {
            s0 s0Var = this.sourceCodeInfo_;
            return s0Var == null ? s0.n8() : s0Var;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.x
        public int x3() {
            return this.service_.size();
        }

        @Override // androidx.datastore.preferences.protobuf.e0.x
        public List<String> x6() {
            return this.dependency_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.x
        public e y0(int index) {
            return this.enumType_.get(index);
        }
    }

    public interface x extends r2 {
        List<b> A3();

        d C();

        boolean D4();

        boolean E();

        int I2();

        List<Integer> J6();

        int J7();

        s K0(int index);

        int K5();

        String M5(int index);

        int O5(int index);

        b Q5(int index);

        List<Integer> T2();

        androidx.datastore.preferences.protobuf.u Y2();

        boolean Z2();

        androidx.datastore.preferences.protobuf.u a();

        List<e> a0();

        a0 b();

        int b6();

        o0 e3(int index);

        boolean g();

        String getName();

        boolean h();

        boolean l2();

        int m0();

        androidx.datastore.preferences.protobuf.u n7();

        androidx.datastore.preferences.protobuf.u o3(int index);

        String p();

        int q5(int index);

        List<s> r0();

        List<o0> s4();

        String u6();

        int w0();

        s0 w3();

        int x3();

        List<String> x6();

        e y0(int index);
    }

    public static final class y extends l1<y, a> implements z {
        private static final y DEFAULT_INSTANCE;
        public static final int FILE_FIELD_NUMBER = 1;
        private static volatile h3<y> PARSER;
        private byte memoizedIsInitialized = 2;
        private s1.l<w> file_ = l1.T3();

        public static final class a extends l1.b<y, a> implements z {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a L4(Iterable<? extends w> values) {
                V3();
                ((y) this.f50422b).h8(values);
                return this;
            }

            public a P4(int index, w.a builderForValue) {
                V3();
                ((y) this.f50422b).j8(index, builderForValue.build());
                return this;
            }

            public a Q4(int index, w value) {
                V3();
                ((y) this.f50422b).j8(index, value);
                return this;
            }

            public a U4(w.a builderForValue) {
                V3();
                ((y) this.f50422b).k8(builderForValue.build());
                return this;
            }

            public a Z4(w value) {
                V3();
                ((y) this.f50422b).k8(value);
                return this;
            }

            public a a5() {
                V3();
                ((y) this.f50422b).l8();
                return this;
            }

            public a b5(int index) {
                V3();
                ((y) this.f50422b).F8(index);
                return this;
            }

            public a d5(int index, w.a builderForValue) {
                V3();
                ((y) this.f50422b).G8(index, builderForValue.build());
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.z
            public List<w> p5() {
                return Collections.unmodifiableList(((y) this.f50422b).p5());
            }

            @Override // androidx.datastore.preferences.protobuf.e0.z
            public int r3() {
                return ((y) this.f50422b).r3();
            }

            public a r5(int index, w value) {
                V3();
                ((y) this.f50422b).G8(index, value);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.e0.z
            public w t3(int index) {
                return ((y) this.f50422b).t3(index);
            }

            private a() {
                super(y.DEFAULT_INSTANCE);
            }
        }

        static {
            y yVar = new y();
            DEFAULT_INSTANCE = yVar;
            l1.Y6(y.class, yVar);
        }

        private y() {
        }

        public static y A8(ByteBuffer data) throws t1 {
            return (y) l1.i6(DEFAULT_INSTANCE, data);
        }

        public static y B8(ByteBuffer data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (y) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static y C8(byte[] data) throws t1 {
            return (y) l1.p6(DEFAULT_INSTANCE, data);
        }

        public static y D8(byte[] data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (y) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static h3<y> E8() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void F8(int index) {
            m8();
            this.file_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void G8(int index, w value) {
            value.getClass();
            m8();
            this.file_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h8(Iterable<? extends w> values) {
            m8();
            androidx.datastore.preferences.protobuf.a.m(values, this.file_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j8(int index, w value) {
            value.getClass();
            m8();
            this.file_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k8(w value) {
            value.getClass();
            m8();
            this.file_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l8() {
            this.file_ = l1.T3();
        }

        private void m8() {
            s1.l<w> lVar = this.file_;
            if (!lVar.s1()) {
                this.file_ = l1.r5(lVar);
            }
        }

        public static y n8() {
            return DEFAULT_INSTANCE;
        }

        public static a q8() {
            return DEFAULT_INSTANCE.s3();
        }

        public static a r8(y prototype) {
            return DEFAULT_INSTANCE.v3(prototype);
        }

        public static y s8(InputStream input) throws IOException {
            return (y) l1.J5(DEFAULT_INSTANCE, input);
        }

        public static y t8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (y) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static y u8(androidx.datastore.preferences.protobuf.u data) throws t1 {
            return (y) l1.R5(DEFAULT_INSTANCE, data);
        }

        public static y v8(androidx.datastore.preferences.protobuf.u data, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws t1 {
            return (y) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static y w8(androidx.datastore.preferences.protobuf.z input) throws IOException {
            return (y) l1.a6(DEFAULT_INSTANCE, input);
        }

        public static y x8(androidx.datastore.preferences.protobuf.z input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (y) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static y y8(InputStream input) throws IOException {
            return (y) l1.d6(DEFAULT_INSTANCE, input);
        }

        public static y z8(InputStream input, androidx.datastore.preferences.protobuf.v0 extensionRegistry) throws IOException {
            return (y) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        @Override // androidx.datastore.preferences.protobuf.l1
        protected final Object D3(l1.i method, Object arg0, Object arg1) {
            h3 cVar;
            a aVar = null;
            switch (a.f50068a[method.ordinal()]) {
                case 1:
                    return new y();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.A5(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"file_", w.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    h3<y> h3Var = PARSER;
                    if (h3Var != null) {
                        return h3Var;
                    }
                    synchronized (y.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public x o8(int index) {
            return this.file_.get(index);
        }

        @Override // androidx.datastore.preferences.protobuf.e0.z
        public List<w> p5() {
            return this.file_;
        }

        public List<? extends x> p8() {
            return this.file_;
        }

        @Override // androidx.datastore.preferences.protobuf.e0.z
        public int r3() {
            return this.file_.size();
        }

        @Override // androidx.datastore.preferences.protobuf.e0.z
        public w t3(int index) {
            return this.file_.get(index);
        }
    }

    public interface z extends r2 {
        List<w> p5();

        int r3();

        w t3(int index);
    }

    private e0() {
    }

    public static void a(androidx.datastore.preferences.protobuf.v0 registry) {
    }
}
