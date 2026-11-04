package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends l1<i, b> implements j {
    private static final i DEFAULT_INSTANCE;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile h3<i> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    private int bitField0_;
    private v3 sourceContext_;
    private int syntax_;
    private String name_ = "";
    private s1.l<v2> methods_ = l1.T3();
    private s1.l<f3> options_ = l1.T3();
    private String version_ = "";
    private s1.l<x2> mixins_ = l1.T3();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50382a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f50382a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50382a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50382a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50382a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50382a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f50382a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f50382a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<i, b> implements j {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b A5(x2 value) {
            V3();
            ((i) this.f50422b).M8(value);
            return this;
        }

        public b A6(int index, v2 value) {
            V3();
            ((i) this.f50422b).z9(index, value);
            return this;
        }

        public b A7(int value) {
            V3();
            ((i) this.f50422b).G9(value);
            return this;
        }

        public b B5(int index, f3.b builderForValue) {
            V3();
            ((i) this.f50422b).N8(index, builderForValue.build());
            return this;
        }

        public b C7(String value) {
            V3();
            ((i) this.f50422b).H9(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public v2 D2(int index) {
            return ((i) this.f50422b).D2(index);
        }

        public b D5(int index, f3 value) {
            V3();
            ((i) this.f50422b).N8(index, value);
            return this;
        }

        public b E6(int index, x2.b builderForValue) {
            V3();
            ((i) this.f50422b).A9(index, builderForValue.build());
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public List<v2> F5() {
            return Collections.unmodifiableList(((i) this.f50422b).F5());
        }

        public b I5(f3.b builderForValue) {
            V3();
            ((i) this.f50422b).O8(builderForValue.build());
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public boolean J() {
            return ((i) this.f50422b).J();
        }

        public b J5(f3 value) {
            V3();
            ((i) this.f50422b).O8(value);
            return this;
        }

        public b L4(Iterable<? extends v2> values) {
            V3();
            ((i) this.f50422b).G8(values);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public v3 M() {
            return ((i) this.f50422b).M();
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public int O3() {
            return ((i) this.f50422b).O3();
        }

        public b P4(Iterable<? extends x2> values) {
            V3();
            ((i) this.f50422b).H8(values);
            return this;
        }

        public b Q4(Iterable<? extends f3> values) {
            V3();
            ((i) this.f50422b).I8(values);
            return this;
        }

        public b R5() {
            V3();
            ((i) this.f50422b).P8();
            return this;
        }

        public b R6(int index, x2 value) {
            V3();
            ((i) this.f50422b).A9(index, value);
            return this;
        }

        public b U4(int index, v2.b builderForValue) {
            V3();
            ((i) this.f50422b).J8(index, builderForValue.build());
            return this;
        }

        public b U6(String value) {
            V3();
            ((i) this.f50422b).B9(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public x2 U7(int index) {
            return ((i) this.f50422b).U7(index);
        }

        public b Y6(u value) {
            V3();
            ((i) this.f50422b).C9(value);
            return this;
        }

        public b Z4(int index, v2 value) {
            V3();
            ((i) this.f50422b).J8(index, value);
            return this;
        }

        public b Z5() {
            V3();
            ((i) this.f50422b).Q8();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public u a() {
            return ((i) this.f50422b).a();
        }

        public b a5(v2.b builderForValue) {
            V3();
            ((i) this.f50422b).K8(builderForValue.build());
            return this;
        }

        public b a6() {
            V3();
            ((i) this.f50422b).R8();
            return this;
        }

        public b b5(v2 value) {
            V3();
            ((i) this.f50422b).K8(value);
            return this;
        }

        public b b7(int index, f3.b builderForValue) {
            V3();
            ((i) this.f50422b).D9(index, builderForValue.build());
            return this;
        }

        public b c6() {
            V3();
            ((i) this.f50422b).S8();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public int d3() {
            return ((i) this.f50422b).d3();
        }

        public b d5(int index, x2.b builderForValue) {
            V3();
            ((i) this.f50422b).L8(index, builderForValue.build());
            return this;
        }

        public b d6() {
            V3();
            ((i) this.f50422b).T8();
            return this;
        }

        public b e6() {
            V3();
            ((i) this.f50422b).U8();
            return this;
        }

        public b f7(int index, f3 value) {
            V3();
            ((i) this.f50422b).D9(index, value);
            return this;
        }

        public b f8(u value) {
            V3();
            ((i) this.f50422b).I9(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public String getName() {
            return ((i) this.f50422b).getName();
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public String getVersion() {
            return ((i) this.f50422b).getVersion();
        }

        public b i6() {
            V3();
            ((i) this.f50422b).V8();
            return this;
        }

        public b i7(v3.b builderForValue) {
            V3();
            ((i) this.f50422b).E9(builderForValue.build());
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public List<x2> j5() {
            return Collections.unmodifiableList(((i) this.f50422b).j5());
        }

        public b j7(v3 value) {
            V3();
            ((i) this.f50422b).E9(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public List<f3> n() {
            return Collections.unmodifiableList(((i) this.f50422b).n());
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public f3 o(int index) {
            return ((i) this.f50422b).o(index);
        }

        public b o6(v3 value) {
            V3();
            ((i) this.f50422b).g9(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public e4 p() {
            return ((i) this.f50422b).p();
        }

        public b p6(int index) {
            V3();
            ((i) this.f50422b).w9(index);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public int q() {
            return ((i) this.f50422b).q();
        }

        public b r5(int index, x2 value) {
            V3();
            ((i) this.f50422b).L8(index, value);
            return this;
        }

        public b r6(int index) {
            V3();
            ((i) this.f50422b).x9(index);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public u s0() {
            return ((i) this.f50422b).s0();
        }

        public b t6(int index) {
            V3();
            ((i) this.f50422b).y9(index);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public int w() {
            return ((i) this.f50422b).w();
        }

        public b w6(int index, v2.b builderForValue) {
            V3();
            ((i) this.f50422b).z9(index, builderForValue.build());
            return this;
        }

        public b y5(x2.b builderForValue) {
            V3();
            ((i) this.f50422b).M8(builderForValue.build());
            return this;
        }

        public b y7(e4 value) {
            V3();
            ((i) this.f50422b).F9(value);
            return this;
        }

        private b() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void A9(int index, x2 value) {
        value.getClass();
        X8();
        this.mixins_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B9(String value) {
        value.getClass();
        this.name_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C9(u value) {
        androidx.datastore.preferences.protobuf.a.y(value);
        this.name_ = value.A0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D9(int index, f3 value) {
        value.getClass();
        Y8();
        this.options_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E9(v3 value) {
        value.getClass();
        this.sourceContext_ = value;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F9(e4 value) {
        this.syntax_ = value.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G8(Iterable<? extends v2> values) {
        W8();
        androidx.datastore.preferences.protobuf.a.m(values, this.methods_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G9(int value) {
        this.syntax_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H8(Iterable<? extends x2> values) {
        X8();
        androidx.datastore.preferences.protobuf.a.m(values, this.mixins_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H9(String value) {
        value.getClass();
        this.version_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I8(Iterable<? extends f3> values) {
        Y8();
        androidx.datastore.preferences.protobuf.a.m(values, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I9(u value) {
        androidx.datastore.preferences.protobuf.a.y(value);
        this.version_ = value.A0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J8(int index, v2 value) {
        value.getClass();
        W8();
        this.methods_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K8(v2 value) {
        value.getClass();
        W8();
        this.methods_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L8(int index, x2 value) {
        value.getClass();
        X8();
        this.mixins_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M8(x2 value) {
        value.getClass();
        X8();
        this.mixins_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N8(int index, f3 value) {
        value.getClass();
        Y8();
        this.options_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O8(f3 value) {
        value.getClass();
        Y8();
        this.options_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P8() {
        this.methods_ = l1.T3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q8() {
        this.mixins_ = l1.T3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R8() {
        this.name_ = Z8().getName();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void V8() {
        this.version_ = Z8().getVersion();
    }

    private void W8() {
        s1.l<v2> lVar = this.methods_;
        if (lVar.s1()) {
            return;
        }
        this.methods_ = l1.r5(lVar);
    }

    private void X8() {
        s1.l<x2> lVar = this.mixins_;
        if (lVar.s1()) {
            return;
        }
        this.mixins_ = l1.r5(lVar);
    }

    private void Y8() {
        s1.l<f3> lVar = this.options_;
        if (lVar.s1()) {
            return;
        }
        this.options_ = l1.r5(lVar);
    }

    public static i Z8() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g9(v3 value) {
        value.getClass();
        v3 v3Var = this.sourceContext_;
        if (v3Var == null || v3Var == v3.f8()) {
            this.sourceContext_ = value;
        } else {
            this.sourceContext_ = v3.h8(this.sourceContext_).u4(value).B1();
        }
        this.bitField0_ |= 1;
    }

    public static b h9() {
        return DEFAULT_INSTANCE.s3();
    }

    public static b i9(i prototype) {
        return DEFAULT_INSTANCE.v3(prototype);
    }

    public static i j9(InputStream input) throws IOException {
        return (i) l1.J5(DEFAULT_INSTANCE, input);
    }

    public static i k9(InputStream input, v0 extensionRegistry) throws IOException {
        return (i) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static i l9(u data) throws t1 {
        return (i) l1.R5(DEFAULT_INSTANCE, data);
    }

    public static i m9(u data, v0 extensionRegistry) throws t1 {
        return (i) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static i n9(z input) throws IOException {
        return (i) l1.a6(DEFAULT_INSTANCE, input);
    }

    public static i o9(z input, v0 extensionRegistry) throws IOException {
        return (i) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static i p9(InputStream input) throws IOException {
        return (i) l1.d6(DEFAULT_INSTANCE, input);
    }

    public static i q9(InputStream input, v0 extensionRegistry) throws IOException {
        return (i) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static i r9(ByteBuffer data) throws t1 {
        return (i) l1.i6(DEFAULT_INSTANCE, data);
    }

    public static i s9(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (i) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static i t9(byte[] data) throws t1 {
        return (i) l1.p6(DEFAULT_INSTANCE, data);
    }

    public static i u9(byte[] data, v0 extensionRegistry) throws t1 {
        return (i) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static h3<i> v9() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w9(int index) {
        W8();
        this.methods_.remove(index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x9(int index) {
        X8();
        this.mixins_.remove(index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y9(int index) {
        Y8();
        this.options_.remove(index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z9(int index, v2 value) {
        value.getClass();
        W8();
        this.methods_.set(index, value);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public v2 D2(int index) {
        return this.methods_.get(index);
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    protected final Object D3(l1.i method, Object arg0, Object arg1) {
        h3 cVar;
        int i10 = a.f50382a[method.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new i();
            case 2:
                return new b(aVar);
            case 3:
                return l1.A5(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004Ȉ\u0005ဉ\u0000\u0006\u001b\u0007\f", new Object[]{"bitField0_", "name_", "methods_", v2.class, "options_", f3.class, "version_", "sourceContext_", "mixins_", x2.class, "syntax_"});
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
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public List<v2> F5() {
        return this.methods_;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public boolean J() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public v3 M() {
        v3 v3Var = this.sourceContext_;
        return v3Var == null ? v3.f8() : v3Var;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public int O3() {
        return this.methods_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public x2 U7(int index) {
        return this.mixins_.get(index);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public u a() {
        return u.C(this.name_);
    }

    public w2 a9(int index) {
        return this.methods_.get(index);
    }

    public List<? extends w2> b9() {
        return this.methods_;
    }

    public y2 c9(int index) {
        return this.mixins_.get(index);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public int d3() {
        return this.mixins_.size();
    }

    public List<? extends y2> d9() {
        return this.mixins_;
    }

    public g3 e9(int index) {
        return this.options_.get(index);
    }

    public List<? extends g3> f9() {
        return this.options_;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public String getVersion() {
        return this.version_;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public List<x2> j5() {
        return this.mixins_;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public List<f3> n() {
        return this.options_;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public f3 o(int index) {
        return this.options_.get(index);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public e4 p() {
        e4 e4VarB = e4.b(this.syntax_);
        return e4VarB == null ? e4.UNRECOGNIZED : e4VarB;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public int q() {
        return this.options_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public u s0() {
        return u.C(this.version_);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public int w() {
        return this.syntax_;
    }
}
