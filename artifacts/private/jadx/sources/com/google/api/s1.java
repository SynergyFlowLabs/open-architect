package com.google.api;

import com.google.protobuf.x4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class s1 extends com.google.protobuf.l1<s1, b> implements v1 {
    private static final s1 DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.f3<s1> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 3;
    private com.google.protobuf.h2<String, String> labels_ = com.google.protobuf.h2.f();
    private String type_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116296a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f116296a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116296a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int i10 = 3 ^ 3;
                f116296a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116296a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116296a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116296a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116296a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1.b<s1, b> implements v1 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.api.v1
        @Deprecated
        public Map<String, String> B0() {
            return x0();
        }

        @Override // com.google.api.v1
        public String D0(String str, String str2) {
            str.getClass();
            Map<String, String> mapX0 = ((s1) this.f126038b).x0();
            return mapX0.containsKey(str) ? mapX0.get(str) : str2;
        }

        @Override // com.google.api.v1
        public int E() {
            return ((s1) this.f126038b).x0().size();
        }

        public b Ol() {
            El();
            ((s1) this.f126038b).gm().clear();
            return this;
        }

        public b Pl() {
            El();
            ((s1) this.f126038b).em();
            return this;
        }

        public b Ql(Map<String, String> map) {
            El();
            ((s1) this.f126038b).gm().putAll(map);
            return this;
        }

        public b Rl(String str, String str2) {
            str.getClass();
            str2.getClass();
            El();
            ((s1) this.f126038b).gm().put(str, str2);
            return this;
        }

        public b Sl(String str) {
            str.getClass();
            El();
            ((s1) this.f126038b).gm().remove(str);
            return this;
        }

        public b Tl(String str) {
            El();
            ((s1) this.f126038b).ym(str);
            return this;
        }

        public b Ul(com.google.protobuf.u uVar) {
            El();
            ((s1) this.f126038b).zm(uVar);
            return this;
        }

        @Override // com.google.api.v1
        public String c() {
            return ((s1) this.f126038b).c();
        }

        @Override // com.google.api.v1
        public String p0(String str) {
            str.getClass();
            Map<String, String> mapX0 = ((s1) this.f126038b).x0();
            if (mapX0.containsKey(str)) {
                return mapX0.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.google.api.v1
        public com.google.protobuf.u s() {
            return ((s1) this.f126038b).s();
        }

        @Override // com.google.api.v1
        public Map<String, String> x0() {
            return Collections.unmodifiableMap(((s1) this.f126038b).x0());
        }

        @Override // com.google.api.v1
        public boolean z0(String str) {
            str.getClass();
            return ((s1) this.f126038b).x0().containsKey(str);
        }

        private b() {
            super(s1.DEFAULT_INSTANCE);
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final com.google.protobuf.g2<String, String> f116297a;

        static {
            x4.b bVar = x4.b.f126490k;
            f116297a = com.google.protobuf.g2.f(bVar, "", bVar, "");
        }

        private c() {
        }
    }

    static {
        s1 s1Var = new s1();
        DEFAULT_INSTANCE = s1Var;
        com.google.protobuf.l1.Wl(s1.class, s1Var);
    }

    private s1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void em() {
        this.type_ = fm().c();
    }

    public static s1 fm() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> gm() {
        return im();
    }

    private com.google.protobuf.h2<String, String> hm() {
        return this.labels_;
    }

    private com.google.protobuf.h2<String, String> im() {
        if (!this.labels_.j()) {
            this.labels_ = this.labels_.n();
        }
        return this.labels_;
    }

    public static b jm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b km(s1 s1Var) {
        return DEFAULT_INSTANCE.Uf(s1Var);
    }

    public static s1 lm(InputStream inputStream) throws IOException {
        return (s1) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static s1 mm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (s1) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static s1 nm(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (s1) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static s1 om(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (s1) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static s1 pm(com.google.protobuf.z zVar) throws IOException {
        return (s1) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static s1 qm(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (s1) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static s1 rm(InputStream inputStream) throws IOException {
        return (s1) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static s1 sm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (s1) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static s1 tm(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (s1) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static s1 um(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (s1) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static s1 vm(byte[] bArr) throws com.google.protobuf.t1 {
        return (s1) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static s1 wm(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (s1) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static com.google.protobuf.f3<s1> xm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ym(String str) {
        str.getClass();
        this.type_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.type_ = uVar.z0();
    }

    @Override // com.google.api.v1
    @Deprecated
    public Map<String, String> B0() {
        return x0();
    }

    @Override // com.google.api.v1
    public String D0(String str, String str2) {
        str.getClass();
        com.google.protobuf.h2<String, String> h2VarHm = hm();
        return h2VarHm.containsKey(str) ? h2VarHm.get(str) : str2;
    }

    @Override // com.google.api.v1
    public int E() {
        return hm().size();
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        int i10 = a.f116296a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new s1();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0001\u0000\u0000\u00022\u0003Ȉ", new Object[]{"labels_", c.f116297a, "type_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f3<s1> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (s1.class) {
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

    @Override // com.google.api.v1
    public String c() {
        return this.type_;
    }

    @Override // com.google.api.v1
    public String p0(String str) {
        str.getClass();
        com.google.protobuf.h2<String, String> h2VarHm = hm();
        if (h2VarHm.containsKey(str)) {
            return h2VarHm.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.api.v1
    public com.google.protobuf.u s() {
        return com.google.protobuf.u.C(this.type_);
    }

    @Override // com.google.api.v1
    public Map<String, String> x0() {
        return Collections.unmodifiableMap(hm());
    }

    @Override // com.google.api.v1
    public boolean z0(String str) {
        str.getClass();
        return hm().containsKey(str);
    }
}
