package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o0 extends l1<o0, b> implements p0 {
    private static final o0 DEFAULT_INSTANCE;
    public static final int EDITION_FIELD_NUMBER = 6;
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile h3<o0> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 5;
    private int bitField0_;
    private v3 sourceContext_;
    private int syntax_;
    private String name_ = "";
    private s1.l<q0> enumvalue_ = l1.T3();
    private s1.l<f3> options_ = l1.T3();
    private String edition_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50502a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f50502a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50502a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50502a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50502a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50502a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f50502a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f50502a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<o0, b> implements p0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b A5() {
            V3();
            ((o0) this.f50422b).G8();
            return this;
        }

        public b A6(v3.b builderForValue) {
            V3();
            ((o0) this.f50422b).r9(builderForValue.build());
            return this;
        }

        public b B5() {
            V3();
            ((o0) this.f50422b).H8();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.p0
        public String C() {
            return ((o0) this.f50422b).C();
        }

        @Override // androidx.datastore.preferences.protobuf.p0
        public List<q0> C2() {
            return Collections.unmodifiableList(((o0) this.f50422b).C2());
        }

        public b D5() {
            V3();
            ((o0) this.f50422b).I8();
            return this;
        }

        public b E6(v3 value) {
            V3();
            ((o0) this.f50422b).r9(value);
            return this;
        }

        public b I5() {
            V3();
            ((o0) this.f50422b).J8();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.p0
        public boolean J() {
            return ((o0) this.f50422b).J();
        }

        @Override // androidx.datastore.preferences.protobuf.p0
        public u J0() {
            return ((o0) this.f50422b).J0();
        }

        public b J5() {
            V3();
            ((o0) this.f50422b).K8();
            return this;
        }

        public b L4(Iterable<? extends q0> values) {
            V3();
            ((o0) this.f50422b).A8(values);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.p0
        public v3 M() {
            return ((o0) this.f50422b).M();
        }

        public b P4(Iterable<? extends f3> values) {
            V3();
            ((o0) this.f50422b).B8(values);
            return this;
        }

        public b Q4(int index, q0.b builderForValue) {
            V3();
            ((o0) this.f50422b).C8(index, builderForValue.build());
            return this;
        }

        public b R5() {
            V3();
            ((o0) this.f50422b).L8();
            return this;
        }

        public b R6(e4 value) {
            V3();
            ((o0) this.f50422b).s9(value);
            return this;
        }

        public b U4(int index, q0 value) {
            V3();
            ((o0) this.f50422b).C8(index, value);
            return this;
        }

        public b U6(int value) {
            V3();
            ((o0) this.f50422b).t9(value);
            return this;
        }

        public b Z4(q0.b builderForValue) {
            V3();
            ((o0) this.f50422b).D8(builderForValue.build());
            return this;
        }

        public b Z5(v3 value) {
            V3();
            ((o0) this.f50422b).T8(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.p0
        public u a() {
            return ((o0) this.f50422b).a();
        }

        public b a5(q0 value) {
            V3();
            ((o0) this.f50422b).D8(value);
            return this;
        }

        public b a6(int index) {
            V3();
            ((o0) this.f50422b).j9(index);
            return this;
        }

        public b b5(int index, f3.b builderForValue) {
            V3();
            ((o0) this.f50422b).E8(index, builderForValue.build());
            return this;
        }

        public b c6(int index) {
            V3();
            ((o0) this.f50422b).k9(index);
            return this;
        }

        public b d5(int index, f3 value) {
            V3();
            ((o0) this.f50422b).E8(index, value);
            return this;
        }

        public b d6(String value) {
            V3();
            ((o0) this.f50422b).l9(value);
            return this;
        }

        public b e6(u value) {
            V3();
            ((o0) this.f50422b).m9(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.p0
        public String getName() {
            return ((o0) this.f50422b).getName();
        }

        public b i6(int index, q0.b builderForValue) {
            V3();
            ((o0) this.f50422b).n9(index, builderForValue.build());
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.p0
        public q0 k5(int index) {
            return ((o0) this.f50422b).k5(index);
        }

        @Override // androidx.datastore.preferences.protobuf.p0
        public int l4() {
            return ((o0) this.f50422b).l4();
        }

        @Override // androidx.datastore.preferences.protobuf.p0
        public List<f3> n() {
            return Collections.unmodifiableList(((o0) this.f50422b).n());
        }

        @Override // androidx.datastore.preferences.protobuf.p0
        public f3 o(int index) {
            return ((o0) this.f50422b).o(index);
        }

        public b o6(int index, q0 value) {
            V3();
            ((o0) this.f50422b).n9(index, value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.p0
        public e4 p() {
            return ((o0) this.f50422b).p();
        }

        public b p6(String value) {
            V3();
            ((o0) this.f50422b).o9(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.p0
        public int q() {
            return ((o0) this.f50422b).q();
        }

        public b r5(f3.b builderForValue) {
            V3();
            ((o0) this.f50422b).F8(builderForValue.build());
            return this;
        }

        public b r6(u value) {
            V3();
            ((o0) this.f50422b).p9(value);
            return this;
        }

        public b t6(int index, f3.b builderForValue) {
            V3();
            ((o0) this.f50422b).q9(index, builderForValue.build());
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.p0
        public int w() {
            return ((o0) this.f50422b).w();
        }

        public b w6(int index, f3 value) {
            V3();
            ((o0) this.f50422b).q9(index, value);
            return this;
        }

        public b y5(f3 value) {
            V3();
            ((o0) this.f50422b).F8(value);
            return this;
        }

        private b() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void A8(Iterable<? extends q0> values) {
        M8();
        androidx.datastore.preferences.protobuf.a.m(values, this.enumvalue_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B8(Iterable<? extends f3> values) {
        N8();
        androidx.datastore.preferences.protobuf.a.m(values, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C8(int index, q0 value) {
        value.getClass();
        M8();
        this.enumvalue_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D8(q0 value) {
        value.getClass();
        M8();
        this.enumvalue_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E8(int index, f3 value) {
        value.getClass();
        N8();
        this.options_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F8(f3 value) {
        value.getClass();
        N8();
        this.options_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G8() {
        this.edition_ = O8().C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H8() {
        this.enumvalue_ = l1.T3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I8() {
        this.name_ = O8().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J8() {
        this.options_ = l1.T3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K8() {
        this.sourceContext_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L8() {
        this.syntax_ = 0;
    }

    private void M8() {
        s1.l<q0> lVar = this.enumvalue_;
        if (lVar.s1()) {
            return;
        }
        this.enumvalue_ = l1.r5(lVar);
    }

    private void N8() {
        s1.l<f3> lVar = this.options_;
        if (lVar.s1()) {
            return;
        }
        this.options_ = l1.r5(lVar);
    }

    public static o0 O8() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T8(v3 value) {
        value.getClass();
        v3 v3Var = this.sourceContext_;
        if (v3Var == null || v3Var == v3.f8()) {
            this.sourceContext_ = value;
        } else {
            this.sourceContext_ = v3.h8(this.sourceContext_).u4(value).B1();
        }
        this.bitField0_ |= 1;
    }

    public static b U8() {
        return DEFAULT_INSTANCE.s3();
    }

    public static b V8(o0 prototype) {
        return DEFAULT_INSTANCE.v3(prototype);
    }

    public static o0 W8(InputStream input) throws IOException {
        return (o0) l1.J5(DEFAULT_INSTANCE, input);
    }

    public static o0 X8(InputStream input, v0 extensionRegistry) throws IOException {
        return (o0) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static o0 Y8(u data) throws t1 {
        return (o0) l1.R5(DEFAULT_INSTANCE, data);
    }

    public static o0 Z8(u data, v0 extensionRegistry) throws t1 {
        return (o0) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static o0 a9(z input) throws IOException {
        return (o0) l1.a6(DEFAULT_INSTANCE, input);
    }

    public static o0 b9(z input, v0 extensionRegistry) throws IOException {
        return (o0) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static o0 c9(InputStream input) throws IOException {
        return (o0) l1.d6(DEFAULT_INSTANCE, input);
    }

    public static o0 d9(InputStream input, v0 extensionRegistry) throws IOException {
        return (o0) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static o0 e9(ByteBuffer data) throws t1 {
        return (o0) l1.i6(DEFAULT_INSTANCE, data);
    }

    public static o0 f9(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (o0) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static o0 g9(byte[] data) throws t1 {
        return (o0) l1.p6(DEFAULT_INSTANCE, data);
    }

    public static o0 h9(byte[] data, v0 extensionRegistry) throws t1 {
        return (o0) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static h3<o0> i9() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j9(int index) {
        M8();
        this.enumvalue_.remove(index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k9(int index) {
        N8();
        this.options_.remove(index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l9(String value) {
        value.getClass();
        this.edition_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m9(u value) {
        androidx.datastore.preferences.protobuf.a.y(value);
        this.edition_ = value.A0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n9(int index, q0 value) {
        value.getClass();
        M8();
        this.enumvalue_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o9(String value) {
        value.getClass();
        this.name_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p9(u value) {
        androidx.datastore.preferences.protobuf.a.y(value);
        this.name_ = value.A0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q9(int index, f3 value) {
        value.getClass();
        N8();
        this.options_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r9(v3 value) {
        value.getClass();
        this.sourceContext_ = value;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s9(e4 value) {
        this.syntax_ = value.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t9(int value) {
        this.syntax_ = value;
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public String C() {
        return this.edition_;
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public List<q0> C2() {
        return this.enumvalue_;
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    protected final Object D3(l1.i method, Object arg0, Object arg1) {
        h3 cVar;
        int i10 = a.f50502a[method.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new o0();
            case 2:
                return new b(aVar);
            case 3:
                return l1.A5(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004ဉ\u0000\u0005\f\u0006Ȉ", new Object[]{"bitField0_", "name_", "enumvalue_", q0.class, "options_", f3.class, "sourceContext_", "syntax_", "edition_"});
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
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public boolean J() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public u J0() {
        return u.C(this.edition_);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public v3 M() {
        v3 v3Var = this.sourceContext_;
        return v3Var == null ? v3.f8() : v3Var;
    }

    public r0 P8(int index) {
        return this.enumvalue_.get(index);
    }

    public List<? extends r0> Q8() {
        return this.enumvalue_;
    }

    public g3 R8(int index) {
        return this.options_.get(index);
    }

    public List<? extends g3> S8() {
        return this.options_;
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public u a() {
        return u.C(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public q0 k5(int index) {
        return this.enumvalue_.get(index);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public int l4() {
        return this.enumvalue_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public List<f3> n() {
        return this.options_;
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public f3 o(int index) {
        return this.options_.get(index);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public e4 p() {
        e4 e4VarB = e4.b(this.syntax_);
        return e4VarB == null ? e4.UNRECOGNIZED : e4VarB;
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public int q() {
        return this.options_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public int w() {
        return this.syntax_;
    }
}
