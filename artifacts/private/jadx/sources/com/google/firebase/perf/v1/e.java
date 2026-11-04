package com.google.firebase.perf.v1;

import com.google.protobuf.f3;
import com.google.protobuf.g2;
import com.google.protobuf.h2;
import com.google.protobuf.l1;
import com.google.protobuf.t1;
import com.google.protobuf.v0;
import com.google.protobuf.x4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends l1<e, b> implements f {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final e DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile f3<e> PARSER;
    private com.google.firebase.perf.v1.a androidAppInfo_;
    private int applicationProcessState_;
    private int bitField0_;
    private h2<String, String> customAttributes_ = h2.f();
    private String googleAppId_ = "";
    private String appInstanceId_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f124256a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f124256a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f124256a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f124256a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f124256a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f124256a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f124256a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f124256a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<e, b> implements f {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.firebase.perf.v1.f
        public com.google.protobuf.u L1() {
            return ((e) this.f126038b).L1();
        }

        @Override // com.google.firebase.perf.v1.f
        public boolean Md() {
            return ((e) this.f126038b).Md();
        }

        @Override // com.google.firebase.perf.v1.f
        public boolean Mi() {
            return ((e) this.f126038b).Mi();
        }

        @Override // com.google.firebase.perf.v1.f
        public boolean Mk() {
            return ((e) this.f126038b).Mk();
        }

        @Override // com.google.firebase.perf.v1.f
        public com.google.firebase.perf.v1.a Og() {
            return ((e) this.f126038b).Og();
        }

        public b Ol() {
            El();
            ((e) this.f126038b).mm();
            return this;
        }

        public b Pl() {
            El();
            ((e) this.f126038b).nm();
            return this;
        }

        public b Ql() {
            El();
            ((e) this.f126038b).om();
            return this;
        }

        public b Rl() {
            El();
            ((e) this.f126038b).rm().clear();
            return this;
        }

        public b Sl() {
            El();
            ((e) this.f126038b).pm();
            return this;
        }

        @Override // com.google.firebase.perf.v1.f
        public String T0() {
            return ((e) this.f126038b).T0();
        }

        public b Tl(com.google.firebase.perf.v1.a aVar) {
            El();
            ((e) this.f126038b).um(aVar);
            return this;
        }

        public b Ul(Map<String, String> map) {
            El();
            ((e) this.f126038b).rm().putAll(map);
            return this;
        }

        public b Vl(String str, String str2) {
            str.getClass();
            str2.getClass();
            El();
            ((e) this.f126038b).rm().put(str, str2);
            return this;
        }

        @Override // com.google.firebase.perf.v1.f
        public String W0(String str) {
            str.getClass();
            Map<String, String> mapZ1 = ((e) this.f126038b).z1();
            if (mapZ1.containsKey(str)) {
                return mapZ1.get(str);
            }
            throw new IllegalArgumentException();
        }

        public b Wl(String str) {
            str.getClass();
            El();
            ((e) this.f126038b).rm().remove(str);
            return this;
        }

        public b Xl(com.google.firebase.perf.v1.a.b bVar) {
            El();
            ((e) this.f126038b).Km(bVar.build());
            return this;
        }

        public b Yl(com.google.firebase.perf.v1.a aVar) {
            El();
            ((e) this.f126038b).Km(aVar);
            return this;
        }

        public b Zl(String str) {
            El();
            ((e) this.f126038b).Lm(str);
            return this;
        }

        public b am(com.google.protobuf.u uVar) {
            El();
            ((e) this.f126038b).Mm(uVar);
            return this;
        }

        public b bm(g gVar) {
            El();
            ((e) this.f126038b).Nm(gVar);
            return this;
        }

        public b cm(String str) {
            El();
            ((e) this.f126038b).Om(str);
            return this;
        }

        public b dm(com.google.protobuf.u uVar) {
            El();
            ((e) this.f126038b).Pm(uVar);
            return this;
        }

        @Override // com.google.firebase.perf.v1.f
        public g hi() {
            return ((e) this.f126038b).hi();
        }

        @Override // com.google.firebase.perf.v1.f
        public int l1() {
            return ((e) this.f126038b).z1().size();
        }

        @Override // com.google.firebase.perf.v1.f
        public String n4() {
            return ((e) this.f126038b).n4();
        }

        @Override // com.google.firebase.perf.v1.f
        public String p1(String str, String str2) {
            str.getClass();
            Map<String, String> mapZ1 = ((e) this.f126038b).z1();
            return mapZ1.containsKey(str) ? mapZ1.get(str) : str2;
        }

        @Override // com.google.firebase.perf.v1.f
        public com.google.protobuf.u r2() {
            return ((e) this.f126038b).r2();
        }

        @Override // com.google.firebase.perf.v1.f
        @Deprecated
        public Map<String, String> s1() {
            return z1();
        }

        @Override // com.google.firebase.perf.v1.f
        public boolean u4() {
            return ((e) this.f126038b).u4();
        }

        @Override // com.google.firebase.perf.v1.f
        public boolean x1(String str) {
            str.getClass();
            return ((e) this.f126038b).z1().containsKey(str);
        }

        @Override // com.google.firebase.perf.v1.f
        public Map<String, String> z1() {
            return Collections.unmodifiableMap(((e) this.f126038b).z1());
        }

        private b() {
            super(e.DEFAULT_INSTANCE);
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final g2<String, String> f124257a;

        static {
            x4.b bVar = x4.b.f126490k;
            f124257a = g2.f(bVar, "", bVar, "");
        }

        private c() {
        }
    }

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        l1.Wl(e.class, eVar);
    }

    private e() {
    }

    public static e Am(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
        return (e) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static e Bm(com.google.protobuf.z zVar) throws IOException {
        return (e) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static e Cm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
        return (e) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static e Dm(InputStream inputStream) throws IOException {
        return (e) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static e Em(InputStream inputStream, v0 v0Var) throws IOException {
        return (e) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static e Fm(ByteBuffer byteBuffer) throws t1 {
        return (e) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static e Gm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (e) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static e Hm(byte[] bArr) throws t1 {
        return (e) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static e Im(byte[] bArr, v0 v0Var) throws t1 {
        return (e) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<e> Jm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Km(com.google.firebase.perf.v1.a aVar) {
        aVar.getClass();
        this.androidAppInfo_ = aVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lm(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.appInstanceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Mm(com.google.protobuf.u uVar) {
        this.appInstanceId_ = uVar.z0();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Nm(g gVar) {
        this.applicationProcessState_ = gVar.i();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Om(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.googleAppId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Pm(com.google.protobuf.u uVar) {
        this.googleAppId_ = uVar.z0();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mm() {
        this.androidAppInfo_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nm() {
        this.bitField0_ &= -3;
        this.appInstanceId_ = qm().T0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void om() {
        this.bitField0_ &= -9;
        this.applicationProcessState_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pm() {
        this.bitField0_ &= -2;
        this.googleAppId_ = qm().n4();
    }

    public static e qm() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> rm() {
        return tm();
    }

    private h2<String, String> sm() {
        return this.customAttributes_;
    }

    private h2<String, String> tm() {
        if (!this.customAttributes_.j()) {
            this.customAttributes_ = this.customAttributes_.n();
        }
        return this.customAttributes_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void um(com.google.firebase.perf.v1.a aVar) {
        aVar.getClass();
        com.google.firebase.perf.v1.a aVar2 = this.androidAppInfo_;
        if (aVar2 == null || aVar2 == com.google.firebase.perf.v1.a.mm()) {
            this.androidAppInfo_ = aVar;
        } else {
            this.androidAppInfo_ = com.google.firebase.perf.v1.a.om(this.androidAppInfo_).Jl(aVar).B1();
        }
        this.bitField0_ |= 4;
    }

    public static b vm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b wm(e eVar) {
        return DEFAULT_INSTANCE.Uf(eVar);
    }

    public static e xm(InputStream inputStream) throws IOException {
        return (e) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static e ym(InputStream inputStream, v0 v0Var) throws IOException {
        return (e) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static e zm(com.google.protobuf.u uVar) throws t1 {
        return (e) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    @Override // com.google.firebase.perf.v1.f
    public com.google.protobuf.u L1() {
        return com.google.protobuf.u.C(this.appInstanceId_);
    }

    @Override // com.google.firebase.perf.v1.f
    public boolean Md() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.firebase.perf.v1.f
    public boolean Mi() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.firebase.perf.v1.f
    public boolean Mk() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.firebase.perf.v1.f
    public com.google.firebase.perf.v1.a Og() {
        com.google.firebase.perf.v1.a aVarMm = this.androidAppInfo_;
        if (aVarMm == null) {
            aVarMm = com.google.firebase.perf.v1.a.mm();
        }
        return aVarMm;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f124256a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new e();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005᠌\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", g.o(), "customAttributes_", c.f124257a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<e> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
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
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.firebase.perf.v1.f
    public String T0() {
        return this.appInstanceId_;
    }

    @Override // com.google.firebase.perf.v1.f
    public String W0(String str) {
        str.getClass();
        h2<String, String> h2VarSm = sm();
        if (h2VarSm.containsKey(str)) {
            return h2VarSm.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.firebase.perf.v1.f
    public g hi() {
        g gVarL = g.l(this.applicationProcessState_);
        return gVarL == null ? g.APPLICATION_PROCESS_STATE_UNKNOWN : gVarL;
    }

    @Override // com.google.firebase.perf.v1.f
    public int l1() {
        return sm().size();
    }

    @Override // com.google.firebase.perf.v1.f
    public String n4() {
        return this.googleAppId_;
    }

    @Override // com.google.firebase.perf.v1.f
    public String p1(String str, String str2) {
        str.getClass();
        h2<String, String> h2VarSm = sm();
        return h2VarSm.containsKey(str) ? h2VarSm.get(str) : str2;
    }

    @Override // com.google.firebase.perf.v1.f
    public com.google.protobuf.u r2() {
        return com.google.protobuf.u.C(this.googleAppId_);
    }

    @Override // com.google.firebase.perf.v1.f
    @Deprecated
    public Map<String, String> s1() {
        return z1();
    }

    @Override // com.google.firebase.perf.v1.f
    public boolean u4() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.firebase.perf.v1.f
    public boolean x1(String str) {
        str.getClass();
        return sm().containsKey(str);
    }

    @Override // com.google.firebase.perf.v1.f
    public Map<String, String> z1() {
        return Collections.unmodifiableMap(sm());
    }
}
