package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class j4 extends l1<j4, b> implements k4 {
    private static final j4 DEFAULT_INSTANCE;
    public static final int EDITION_FIELD_NUMBER = 7;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static volatile h3<j4> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    private int bitField0_;
    private v3 sourceContext_;
    private int syntax_;
    private String name_ = "";
    private s1.l<z0> fields_ = l1.T3();
    private s1.l<String> oneofs_ = l1.T3();
    private s1.l<f3> options_ = l1.T3();
    private String edition_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50403a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f50403a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50403a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50403a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50403a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50403a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f50403a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f50403a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<j4, b> implements k4 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b A5(int index, f3 value) {
            V3();
            ((j4) this.f50422b).M8(index, value);
            return this;
        }

        public b A6(String value) {
            V3();
            ((j4) this.f50422b).y9(value);
            return this;
        }

        public b B5(f3.b builderForValue) {
            V3();
            ((j4) this.f50422b).N8(builderForValue.build());
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.k4
        public String C() {
            return ((j4) this.f50422b).C();
        }

        public b D5(f3 value) {
            V3();
            ((j4) this.f50422b).N8(value);
            return this;
        }

        public b E6(u value) {
            V3();
            ((j4) this.f50422b).z9(value);
            return this;
        }

        public b I5() {
            V3();
            ((j4) this.f50422b).O8();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.k4
        public boolean J() {
            return ((j4) this.f50422b).J();
        }

        @Override // androidx.datastore.preferences.protobuf.k4
        public u J0() {
            return ((j4) this.f50422b).J0();
        }

        public b J5() {
            V3();
            ((j4) this.f50422b).P8();
            return this;
        }

        public b L4(Iterable<? extends z0> values) {
            V3();
            ((j4) this.f50422b).F8(values);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.k4
        public v3 M() {
            return ((j4) this.f50422b).M();
        }

        @Override // androidx.datastore.preferences.protobuf.k4
        public List<String> N4() {
            return Collections.unmodifiableList(((j4) this.f50422b).N4());
        }

        @Override // androidx.datastore.preferences.protobuf.k4
        public String N6(int index) {
            return ((j4) this.f50422b).N6(index);
        }

        public b P4(Iterable<String> values) {
            V3();
            ((j4) this.f50422b).G8(values);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.k4
        public u P5(int index) {
            return ((j4) this.f50422b).P5(index);
        }

        public b Q4(Iterable<? extends f3> values) {
            V3();
            ((j4) this.f50422b).H8(values);
            return this;
        }

        public b R5() {
            V3();
            ((j4) this.f50422b).Q8();
            return this;
        }

        public b R6(int index, String value) {
            V3();
            ((j4) this.f50422b).A9(index, value);
            return this;
        }

        public b U4(int index, z0.b builderForValue) {
            V3();
            ((j4) this.f50422b).I8(index, builderForValue.build());
            return this;
        }

        public b U6(int index, f3.b builderForValue) {
            V3();
            ((j4) this.f50422b).B9(index, builderForValue.build());
            return this;
        }

        public b Y6(int index, f3 value) {
            V3();
            ((j4) this.f50422b).B9(index, value);
            return this;
        }

        public b Z4(int index, z0 value) {
            V3();
            ((j4) this.f50422b).I8(index, value);
            return this;
        }

        public b Z5() {
            V3();
            ((j4) this.f50422b).R8();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.k4
        public u a() {
            return ((j4) this.f50422b).a();
        }

        @Override // androidx.datastore.preferences.protobuf.k4
        public int a3() {
            return ((j4) this.f50422b).a3();
        }

        public b a5(z0.b builderForValue) {
            V3();
            ((j4) this.f50422b).J8(builderForValue.build());
            return this;
        }

        public b a6() {
            V3();
            ((j4) this.f50422b).S8();
            return this;
        }

        public b b5(z0 value) {
            V3();
            ((j4) this.f50422b).J8(value);
            return this;
        }

        public b b7(v3.b builderForValue) {
            V3();
            ((j4) this.f50422b).C9(builderForValue.build());
            return this;
        }

        public b c6() {
            V3();
            ((j4) this.f50422b).T8();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.k4
        public int d0() {
            return ((j4) this.f50422b).d0();
        }

        public b d5(String value) {
            V3();
            ((j4) this.f50422b).K8(value);
            return this;
        }

        public b d6() {
            V3();
            ((j4) this.f50422b).U8();
            return this;
        }

        public b e6(v3 value) {
            V3();
            ((j4) this.f50422b).d9(value);
            return this;
        }

        public b f7(v3 value) {
            V3();
            ((j4) this.f50422b).C9(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.k4
        public String getName() {
            return ((j4) this.f50422b).getName();
        }

        public b i6(int index) {
            V3();
            ((j4) this.f50422b).t9(index);
            return this;
        }

        public b i7(e4 value) {
            V3();
            ((j4) this.f50422b).D9(value);
            return this;
        }

        public b j7(int value) {
            V3();
            ((j4) this.f50422b).E9(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.k4
        public List<f3> n() {
            return Collections.unmodifiableList(((j4) this.f50422b).n());
        }

        @Override // androidx.datastore.preferences.protobuf.k4
        public f3 o(int index) {
            return ((j4) this.f50422b).o(index);
        }

        public b o6(int index) {
            V3();
            ((j4) this.f50422b).u9(index);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.k4
        public e4 p() {
            return ((j4) this.f50422b).p();
        }

        public b p6(String value) {
            V3();
            ((j4) this.f50422b).v9(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.k4
        public int q() {
            return ((j4) this.f50422b).q();
        }

        @Override // androidx.datastore.preferences.protobuf.k4
        public List<z0> q2() {
            return Collections.unmodifiableList(((j4) this.f50422b).q2());
        }

        public b r5(u value) {
            V3();
            ((j4) this.f50422b).L8(value);
            return this;
        }

        public b r6(u value) {
            V3();
            ((j4) this.f50422b).w9(value);
            return this;
        }

        public b t6(int index, z0.b builderForValue) {
            V3();
            ((j4) this.f50422b).x9(index, builderForValue.build());
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.k4
        public int w() {
            return ((j4) this.f50422b).w();
        }

        public b w6(int index, z0 value) {
            V3();
            ((j4) this.f50422b).x9(index, value);
            return this;
        }

        public b y5(int index, f3.b builderForValue) {
            V3();
            ((j4) this.f50422b).M8(index, builderForValue.build());
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.k4
        public z0 z6(int index) {
            return ((j4) this.f50422b).z6(index);
        }

        private b() {
            super(j4.DEFAULT_INSTANCE);
        }
    }

    static {
        j4 j4Var = new j4();
        DEFAULT_INSTANCE = j4Var;
        l1.Y6(j4.class, j4Var);
    }

    private j4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A9(int index, String value) {
        value.getClass();
        W8();
        this.oneofs_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B9(int index, f3 value) {
        value.getClass();
        X8();
        this.options_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C9(v3 value) {
        value.getClass();
        this.sourceContext_ = value;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D9(e4 value) {
        this.syntax_ = value.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E9(int value) {
        this.syntax_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F8(Iterable<? extends z0> values) {
        V8();
        androidx.datastore.preferences.protobuf.a.m(values, this.fields_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G8(Iterable<String> values) {
        W8();
        androidx.datastore.preferences.protobuf.a.m(values, this.oneofs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H8(Iterable<? extends f3> values) {
        X8();
        androidx.datastore.preferences.protobuf.a.m(values, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I8(int index, z0 value) {
        value.getClass();
        V8();
        this.fields_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J8(z0 value) {
        value.getClass();
        V8();
        this.fields_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K8(String value) {
        value.getClass();
        W8();
        this.oneofs_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L8(u value) {
        androidx.datastore.preferences.protobuf.a.y(value);
        W8();
        this.oneofs_.add(value.A0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M8(int index, f3 value) {
        value.getClass();
        X8();
        this.options_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N8(f3 value) {
        value.getClass();
        X8();
        this.options_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O8() {
        this.edition_ = Y8().C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P8() {
        this.fields_ = l1.T3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q8() {
        this.name_ = Y8().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R8() {
        this.oneofs_ = l1.T3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S8() {
        this.options_ = l1.T3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T8() {
        this.sourceContext_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U8() {
        this.syntax_ = 0;
    }

    private void V8() {
        s1.l<z0> lVar = this.fields_;
        if (!lVar.s1()) {
            this.fields_ = l1.r5(lVar);
        }
    }

    private void W8() {
        s1.l<String> lVar = this.oneofs_;
        if (lVar.s1()) {
            return;
        }
        this.oneofs_ = l1.r5(lVar);
    }

    private void X8() {
        s1.l<f3> lVar = this.options_;
        if (lVar.s1()) {
            return;
        }
        this.options_ = l1.r5(lVar);
    }

    public static j4 Y8() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d9(v3 value) {
        value.getClass();
        v3 v3Var = this.sourceContext_;
        if (v3Var == null || v3Var == v3.f8()) {
            this.sourceContext_ = value;
        } else {
            this.sourceContext_ = v3.h8(this.sourceContext_).u4(value).B1();
        }
        this.bitField0_ |= 1;
    }

    public static b e9() {
        return DEFAULT_INSTANCE.s3();
    }

    public static b f9(j4 prototype) {
        return DEFAULT_INSTANCE.v3(prototype);
    }

    public static j4 g9(InputStream input) throws IOException {
        return (j4) l1.J5(DEFAULT_INSTANCE, input);
    }

    public static j4 h9(InputStream input, v0 extensionRegistry) throws IOException {
        return (j4) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static j4 i9(u data) throws t1 {
        return (j4) l1.R5(DEFAULT_INSTANCE, data);
    }

    public static j4 j9(u data, v0 extensionRegistry) throws t1 {
        return (j4) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static j4 k9(z input) throws IOException {
        return (j4) l1.a6(DEFAULT_INSTANCE, input);
    }

    public static j4 l9(z input, v0 extensionRegistry) throws IOException {
        return (j4) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static j4 m9(InputStream input) throws IOException {
        return (j4) l1.d6(DEFAULT_INSTANCE, input);
    }

    public static j4 n9(InputStream input, v0 extensionRegistry) throws IOException {
        return (j4) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static j4 o9(ByteBuffer data) throws t1 {
        return (j4) l1.i6(DEFAULT_INSTANCE, data);
    }

    public static j4 p9(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (j4) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static j4 q9(byte[] data) throws t1 {
        return (j4) l1.p6(DEFAULT_INSTANCE, data);
    }

    public static j4 r9(byte[] data, v0 extensionRegistry) throws t1 {
        return (j4) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static h3<j4> s9() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t9(int index) {
        V8();
        this.fields_.remove(index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u9(int index) {
        X8();
        this.options_.remove(index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v9(String value) {
        value.getClass();
        this.edition_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w9(u value) {
        androidx.datastore.preferences.protobuf.a.y(value);
        this.edition_ = value.A0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x9(int index, z0 value) {
        value.getClass();
        V8();
        this.fields_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y9(String value) {
        value.getClass();
        this.name_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z9(u value) {
        androidx.datastore.preferences.protobuf.a.y(value);
        this.name_ = value.A0();
    }

    @Override // androidx.datastore.preferences.protobuf.k4
    public String C() {
        return this.edition_;
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    protected final Object D3(l1.i method, Object arg0, Object arg1) {
        h3 cVar;
        int i10 = a.f50403a[method.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new j4();
            case 2:
                return new b(aVar);
            case 3:
                return l1.A5(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003Ț\u0004\u001b\u0005ဉ\u0000\u0006\f\u0007Ȉ", new Object[]{"bitField0_", "name_", "fields_", z0.class, "oneofs_", "options_", f3.class, "sourceContext_", "syntax_", "edition_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                h3<j4> h3Var = PARSER;
                if (h3Var != null) {
                    return h3Var;
                }
                synchronized (j4.class) {
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

    @Override // androidx.datastore.preferences.protobuf.k4
    public boolean J() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.k4
    public u J0() {
        return u.C(this.edition_);
    }

    @Override // androidx.datastore.preferences.protobuf.k4
    public v3 M() {
        v3 v3Var = this.sourceContext_;
        return v3Var == null ? v3.f8() : v3Var;
    }

    @Override // androidx.datastore.preferences.protobuf.k4
    public List<String> N4() {
        return this.oneofs_;
    }

    @Override // androidx.datastore.preferences.protobuf.k4
    public String N6(int index) {
        return this.oneofs_.get(index);
    }

    @Override // androidx.datastore.preferences.protobuf.k4
    public u P5(int index) {
        return u.C(this.oneofs_.get(index));
    }

    public e1 Z8(int index) {
        return this.fields_.get(index);
    }

    @Override // androidx.datastore.preferences.protobuf.k4
    public u a() {
        return u.C(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.k4
    public int a3() {
        return this.oneofs_.size();
    }

    public List<? extends e1> a9() {
        return this.fields_;
    }

    public g3 b9(int index) {
        return this.options_.get(index);
    }

    public List<? extends g3> c9() {
        return this.options_;
    }

    @Override // androidx.datastore.preferences.protobuf.k4
    public int d0() {
        return this.fields_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.k4
    public String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.k4
    public List<f3> n() {
        return this.options_;
    }

    @Override // androidx.datastore.preferences.protobuf.k4
    public f3 o(int index) {
        return this.options_.get(index);
    }

    @Override // androidx.datastore.preferences.protobuf.k4
    public e4 p() {
        e4 e4VarB = e4.b(this.syntax_);
        if (e4VarB == null) {
            e4VarB = e4.UNRECOGNIZED;
        }
        return e4VarB;
    }

    @Override // androidx.datastore.preferences.protobuf.k4
    public int q() {
        return this.options_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.k4
    public List<z0> q2() {
        return this.fields_;
    }

    @Override // androidx.datastore.preferences.protobuf.k4
    public int w() {
        return this.syntax_;
    }

    @Override // androidx.datastore.preferences.protobuf.k4
    public z0 z6(int index) {
        return this.fields_.get(index);
    }
}
