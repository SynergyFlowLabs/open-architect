package com.google.api;

import com.google.protobuf.x3;
import com.google.protobuf.x4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class c2 extends com.google.protobuf.l1<c2, b> implements d2 {
    private static final c2 DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.f3<c2> PARSER = null;
    public static final int SYSTEM_LABELS_FIELD_NUMBER = 1;
    public static final int USER_LABELS_FIELD_NUMBER = 2;
    private int bitField0_;
    private x3 systemLabels_;
    private com.google.protobuf.h2<String, String> userLabels_ = com.google.protobuf.h2.f();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f115125a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f115125a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f115125a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f115125a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f115125a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f115125a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f115125a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f115125a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1.b<c2, b> implements d2 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.api.d2
        public String Hf(String str, String str2) {
            str.getClass();
            Map<String, String> mapV8 = ((c2) this.f126038b).V8();
            return mapV8.containsKey(str) ? mapV8.get(str) : str2;
        }

        public b Ol() {
            El();
            ((c2) this.f126038b).em();
            return this;
        }

        public b Pl() {
            El();
            ((c2) this.f126038b).gm().clear();
            return this;
        }

        @Override // com.google.api.d2
        @Deprecated
        public Map<String, String> Qc() {
            return V8();
        }

        public b Ql(x3 x3Var) {
            El();
            ((c2) this.f126038b).jm(x3Var);
            return this;
        }

        public b Rl(Map<String, String> map) {
            El();
            ((c2) this.f126038b).gm().putAll(map);
            return this;
        }

        @Override // com.google.api.d2
        public int Sh() {
            return ((c2) this.f126038b).V8().size();
        }

        public b Sl(String str, String str2) {
            str.getClass();
            str2.getClass();
            El();
            ((c2) this.f126038b).gm().put(str, str2);
            return this;
        }

        public b Tl(String str) {
            str.getClass();
            El();
            ((c2) this.f126038b).gm().remove(str);
            return this;
        }

        public b Ul(x3.b bVar) {
            El();
            ((c2) this.f126038b).zm(bVar.build());
            return this;
        }

        @Override // com.google.api.d2
        public Map<String, String> V8() {
            return Collections.unmodifiableMap(((c2) this.f126038b).V8());
        }

        public b Vl(x3 x3Var) {
            El();
            ((c2) this.f126038b).zm(x3Var);
            return this;
        }

        @Override // com.google.api.d2
        public String Yj(String str) {
            str.getClass();
            Map<String, String> mapV8 = ((c2) this.f126038b).V8();
            if (mapV8.containsKey(str)) {
                return mapV8.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.google.api.d2
        public boolean k9(String str) {
            str.getClass();
            return ((c2) this.f126038b).V8().containsKey(str);
        }

        @Override // com.google.api.d2
        public x3 kc() {
            return ((c2) this.f126038b).kc();
        }

        @Override // com.google.api.d2
        public boolean va() {
            return ((c2) this.f126038b).va();
        }

        private b() {
            super(c2.DEFAULT_INSTANCE);
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final com.google.protobuf.g2<String, String> f115126a;

        static {
            x4.b bVar = x4.b.f126490k;
            f115126a = com.google.protobuf.g2.f(bVar, "", bVar, "");
        }

        private c() {
        }
    }

    static {
        c2 c2Var = new c2();
        DEFAULT_INSTANCE = c2Var;
        com.google.protobuf.l1.Wl(c2.class, c2Var);
    }

    private c2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void em() {
        this.systemLabels_ = null;
        this.bitField0_ &= -2;
    }

    public static c2 fm() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> gm() {
        return hm();
    }

    private com.google.protobuf.h2<String, String> hm() {
        if (!this.userLabels_.j()) {
            this.userLabels_ = this.userLabels_.n();
        }
        return this.userLabels_;
    }

    private com.google.protobuf.h2<String, String> im() {
        return this.userLabels_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jm(x3 x3Var) {
        x3Var.getClass();
        x3 x3Var2 = this.systemLabels_;
        if (x3Var2 == null || x3Var2 == x3.bm()) {
            this.systemLabels_ = x3Var;
        } else {
            this.systemLabels_ = x3.gm(this.systemLabels_).Jl(x3Var).B1();
        }
        this.bitField0_ |= 1;
    }

    public static b km() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b lm(c2 c2Var) {
        return DEFAULT_INSTANCE.Uf(c2Var);
    }

    public static c2 mm(InputStream inputStream) throws IOException {
        return (c2) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static c2 nm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (c2) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static c2 om(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (c2) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static c2 pm(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (c2) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static c2 qm(com.google.protobuf.z zVar) throws IOException {
        return (c2) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static c2 rm(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (c2) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static c2 sm(InputStream inputStream) throws IOException {
        return (c2) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static c2 tm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (c2) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static c2 um(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (c2) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static c2 vm(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (c2) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static c2 wm(byte[] bArr) throws com.google.protobuf.t1 {
        return (c2) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static c2 xm(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (c2) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static com.google.protobuf.f3<c2> ym() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zm(x3 x3Var) {
        x3Var.getClass();
        this.systemLabels_ = x3Var;
        this.bitField0_ |= 1;
    }

    @Override // com.google.api.d2
    public String Hf(String str, String str2) {
        str.getClass();
        com.google.protobuf.h2<String, String> h2VarIm = im();
        return h2VarIm.containsKey(str) ? h2VarIm.get(str) : str2;
    }

    @Override // com.google.api.d2
    @Deprecated
    public Map<String, String> Qc() {
        return V8();
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        int i10 = a.f115125a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new c2();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဉ\u0000\u00022", new Object[]{"bitField0_", "systemLabels_", "userLabels_", c.f115126a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f3<c2> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (c2.class) {
                    try {
                        cVar = PARSER;
                        if (cVar == null) {
                            cVar = new com.google.protobuf.l1.c(DEFAULT_INSTANCE);
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

    @Override // com.google.api.d2
    public int Sh() {
        return im().size();
    }

    @Override // com.google.api.d2
    public Map<String, String> V8() {
        return Collections.unmodifiableMap(im());
    }

    @Override // com.google.api.d2
    public String Yj(String str) {
        str.getClass();
        com.google.protobuf.h2<String, String> h2VarIm = im();
        if (h2VarIm.containsKey(str)) {
            return h2VarIm.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.api.d2
    public boolean k9(String str) {
        str.getClass();
        return im().containsKey(str);
    }

    @Override // com.google.api.d2
    public x3 kc() {
        x3 x3Var = this.systemLabels_;
        return x3Var == null ? x3.bm() : x3Var;
    }

    @Override // com.google.api.d2
    public boolean va() {
        return (this.bitField0_ & 1) != 0;
    }
}
