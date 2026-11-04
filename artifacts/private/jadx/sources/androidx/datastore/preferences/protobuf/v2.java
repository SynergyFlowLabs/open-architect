package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class v2 extends l1<v2, b> implements w2 {
    private static final v2 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 6;
    private static volatile h3<v2> PARSER = null;
    public static final int REQUEST_STREAMING_FIELD_NUMBER = 3;
    public static final int REQUEST_TYPE_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_STREAMING_FIELD_NUMBER = 5;
    public static final int RESPONSE_TYPE_URL_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    private boolean requestStreaming_;
    private boolean responseStreaming_;
    private int syntax_;
    private String name_ = "";
    private String requestTypeUrl_ = "";
    private String responseTypeUrl_ = "";
    private s1.l<f3> options_ = l1.T3();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50706a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f50706a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50706a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50706a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50706a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50706a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f50706a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f50706a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<v2, b> implements w2 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b A5() {
            V3();
            ((v2) this.f50422b).G8();
            return this;
        }

        public b B5() {
            V3();
            ((v2) this.f50422b).H8();
            return this;
        }

        public b D5(int index) {
            V3();
            ((v2) this.f50422b).b9(index);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.w2
        public u I4() {
            return ((v2) this.f50422b).I4();
        }

        public b I5(String value) {
            V3();
            ((v2) this.f50422b).c9(value);
            return this;
        }

        public b J5(u value) {
            V3();
            ((v2) this.f50422b).d9(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.w2
        public boolean L2() {
            return ((v2) this.f50422b).L2();
        }

        public b L4(Iterable<? extends f3> values) {
            V3();
            ((v2) this.f50422b).y8(values);
            return this;
        }

        public b P4(int index, f3.b builderForValue) {
            V3();
            ((v2) this.f50422b).z8(index, builderForValue.build());
            return this;
        }

        public b Q4(int index, f3 value) {
            V3();
            ((v2) this.f50422b).z8(index, value);
            return this;
        }

        public b R5(int index, f3.b builderForValue) {
            V3();
            ((v2) this.f50422b).e9(index, builderForValue.build());
            return this;
        }

        public b U4(f3.b builderForValue) {
            V3();
            ((v2) this.f50422b).A8(builderForValue.build());
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.w2
        public String W5() {
            return ((v2) this.f50422b).W5();
        }

        @Override // androidx.datastore.preferences.protobuf.w2
        public u X1() {
            return ((v2) this.f50422b).X1();
        }

        public b Z4(f3 value) {
            V3();
            ((v2) this.f50422b).A8(value);
            return this;
        }

        public b Z5(int index, f3 value) {
            V3();
            ((v2) this.f50422b).e9(index, value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.w2
        public u a() {
            return ((v2) this.f50422b).a();
        }

        public b a5() {
            V3();
            ((v2) this.f50422b).B8();
            return this;
        }

        public b a6(boolean value) {
            V3();
            ((v2) this.f50422b).f9(value);
            return this;
        }

        public b b5() {
            V3();
            ((v2) this.f50422b).C8();
            return this;
        }

        public b c6(String value) {
            V3();
            ((v2) this.f50422b).g9(value);
            return this;
        }

        public b d5() {
            V3();
            ((v2) this.f50422b).D8();
            return this;
        }

        public b d6(u value) {
            V3();
            ((v2) this.f50422b).h9(value);
            return this;
        }

        public b e6(boolean value) {
            V3();
            ((v2) this.f50422b).i9(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.w2
        public String getName() {
            return ((v2) this.f50422b).getName();
        }

        public b i6(String value) {
            V3();
            ((v2) this.f50422b).j9(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.w2
        public List<f3> n() {
            return Collections.unmodifiableList(((v2) this.f50422b).n());
        }

        @Override // androidx.datastore.preferences.protobuf.w2
        public f3 o(int index) {
            return ((v2) this.f50422b).o(index);
        }

        public b o6(u value) {
            V3();
            ((v2) this.f50422b).k9(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.w2
        public e4 p() {
            return ((v2) this.f50422b).p();
        }

        public b p6(e4 value) {
            V3();
            ((v2) this.f50422b).l9(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.w2
        public int q() {
            return ((v2) this.f50422b).q();
        }

        @Override // androidx.datastore.preferences.protobuf.w2
        public boolean q4() {
            return ((v2) this.f50422b).q4();
        }

        @Override // androidx.datastore.preferences.protobuf.w2
        public String q6() {
            return ((v2) this.f50422b).q6();
        }

        public b r5() {
            V3();
            ((v2) this.f50422b).E8();
            return this;
        }

        public b r6(int value) {
            V3();
            ((v2) this.f50422b).m9(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.w2
        public int w() {
            return ((v2) this.f50422b).w();
        }

        public b y5() {
            V3();
            ((v2) this.f50422b).F8();
            return this;
        }

        private b() {
            super(v2.DEFAULT_INSTANCE);
        }
    }

    static {
        v2 v2Var = new v2();
        DEFAULT_INSTANCE = v2Var;
        l1.Y6(v2.class, v2Var);
    }

    private v2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A8(f3 value) {
        value.getClass();
        I8();
        this.options_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B8() {
        this.name_ = J8().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C8() {
        this.options_ = l1.T3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D8() {
        this.requestStreaming_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E8() {
        this.requestTypeUrl_ = J8().W5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F8() {
        this.responseStreaming_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G8() {
        this.responseTypeUrl_ = J8().q6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H8() {
        this.syntax_ = 0;
    }

    private void I8() {
        s1.l<f3> lVar = this.options_;
        if (!lVar.s1()) {
            this.options_ = l1.r5(lVar);
        }
    }

    public static v2 J8() {
        return DEFAULT_INSTANCE;
    }

    public static b M8() {
        return DEFAULT_INSTANCE.s3();
    }

    public static b N8(v2 prototype) {
        return DEFAULT_INSTANCE.v3(prototype);
    }

    public static v2 O8(InputStream input) throws IOException {
        return (v2) l1.J5(DEFAULT_INSTANCE, input);
    }

    public static v2 P8(InputStream input, v0 extensionRegistry) throws IOException {
        return (v2) l1.N5(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static v2 Q8(u data) throws t1 {
        return (v2) l1.R5(DEFAULT_INSTANCE, data);
    }

    public static v2 R8(u data, v0 extensionRegistry) throws t1 {
        return (v2) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static v2 S8(z input) throws IOException {
        return (v2) l1.a6(DEFAULT_INSTANCE, input);
    }

    public static v2 T8(z input, v0 extensionRegistry) throws IOException {
        return (v2) l1.c6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static v2 U8(InputStream input) throws IOException {
        return (v2) l1.d6(DEFAULT_INSTANCE, input);
    }

    public static v2 V8(InputStream input, v0 extensionRegistry) throws IOException {
        return (v2) l1.e6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static v2 W8(ByteBuffer data) throws t1 {
        return (v2) l1.i6(DEFAULT_INSTANCE, data);
    }

    public static v2 X8(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (v2) l1.o6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static v2 Y8(byte[] data) throws t1 {
        return (v2) l1.p6(DEFAULT_INSTANCE, data);
    }

    public static v2 Z8(byte[] data, v0 extensionRegistry) throws t1 {
        return (v2) l1.r6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static h3<v2> a9() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b9(int index) {
        I8();
        this.options_.remove(index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c9(String value) {
        value.getClass();
        this.name_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d9(u value) {
        androidx.datastore.preferences.protobuf.a.y(value);
        this.name_ = value.A0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e9(int index, f3 value) {
        value.getClass();
        I8();
        this.options_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f9(boolean value) {
        this.requestStreaming_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g9(String value) {
        value.getClass();
        this.requestTypeUrl_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h9(u value) {
        androidx.datastore.preferences.protobuf.a.y(value);
        this.requestTypeUrl_ = value.A0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i9(boolean value) {
        this.responseStreaming_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j9(String value) {
        value.getClass();
        this.responseTypeUrl_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k9(u value) {
        androidx.datastore.preferences.protobuf.a.y(value);
        this.responseTypeUrl_ = value.A0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l9(e4 value) {
        this.syntax_ = value.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m9(int value) {
        this.syntax_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y8(Iterable<? extends f3> values) {
        I8();
        androidx.datastore.preferences.protobuf.a.m(values, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z8(int index, f3 value) {
        value.getClass();
        I8();
        this.options_.add(index, value);
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    protected final Object D3(l1.i method, Object arg0, Object arg1) {
        h3 cVar;
        int i10 = a.f50706a[method.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new v2();
            case 2:
                return new b(aVar);
            case 3:
                return l1.A5(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005\u0007\u0006\u001b\u0007\f", new Object[]{"name_", "requestTypeUrl_", "requestStreaming_", "responseTypeUrl_", "responseStreaming_", "options_", f3.class, "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                h3<v2> h3Var = PARSER;
                if (h3Var != null) {
                    return h3Var;
                }
                synchronized (v2.class) {
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

    @Override // androidx.datastore.preferences.protobuf.w2
    public u I4() {
        return u.C(this.responseTypeUrl_);
    }

    public g3 K8(int index) {
        return this.options_.get(index);
    }

    @Override // androidx.datastore.preferences.protobuf.w2
    public boolean L2() {
        return this.requestStreaming_;
    }

    public List<? extends g3> L8() {
        return this.options_;
    }

    @Override // androidx.datastore.preferences.protobuf.w2
    public String W5() {
        return this.requestTypeUrl_;
    }

    @Override // androidx.datastore.preferences.protobuf.w2
    public u X1() {
        return u.C(this.requestTypeUrl_);
    }

    @Override // androidx.datastore.preferences.protobuf.w2
    public u a() {
        return u.C(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.w2
    public String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.w2
    public List<f3> n() {
        return this.options_;
    }

    @Override // androidx.datastore.preferences.protobuf.w2
    public f3 o(int index) {
        return this.options_.get(index);
    }

    @Override // androidx.datastore.preferences.protobuf.w2
    public e4 p() {
        e4 e4VarB = e4.b(this.syntax_);
        return e4VarB == null ? e4.UNRECOGNIZED : e4VarB;
    }

    @Override // androidx.datastore.preferences.protobuf.w2
    public int q() {
        return this.options_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.w2
    public boolean q4() {
        return this.responseStreaming_;
    }

    @Override // androidx.datastore.preferences.protobuf.w2
    public String q6() {
        return this.responseTypeUrl_;
    }

    @Override // androidx.datastore.preferences.protobuf.w2
    public int w() {
        return this.syntax_;
    }
}
