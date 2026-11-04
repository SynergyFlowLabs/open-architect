package com.google.rpc;

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
public final class h extends l1<h, b> implements i {
    private static final h DEFAULT_INSTANCE;
    public static final int DOMAIN_FIELD_NUMBER = 2;
    public static final int METADATA_FIELD_NUMBER = 3;
    private static volatile f3<h> PARSER = null;
    public static final int REASON_FIELD_NUMBER = 1;
    private h2<String, String> metadata_ = h2.f();
    private String reason_ = "";
    private String domain_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126682a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126682a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126682a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126682a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126682a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126682a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126682a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                int i10 = 6 | 7;
                f126682a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<h, b> implements i {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.rpc.i
        public boolean Mc(String str) {
            str.getClass();
            return ((h) this.f126038b).d9().containsKey(str);
        }

        @Override // com.google.rpc.i
        public int Ni() {
            return ((h) this.f126038b).d9().size();
        }

        public b Ol() {
            El();
            ((h) this.f126038b).hm();
            return this;
        }

        public b Pl() {
            El();
            ((h) this.f126038b).km().clear();
            return this;
        }

        public b Ql() {
            El();
            ((h) this.f126038b).im();
            return this;
        }

        public b Rl(Map<String, String> map) {
            El();
            ((h) this.f126038b).km().putAll(map);
            return this;
        }

        public b Sl(String str, String str2) {
            str.getClass();
            str2.getClass();
            El();
            ((h) this.f126038b).km().put(str, str2);
            return this;
        }

        public b Tl(String str) {
            str.getClass();
            El();
            ((h) this.f126038b).km().remove(str);
            return this;
        }

        public b Ul(String str) {
            El();
            ((h) this.f126038b).Cm(str);
            return this;
        }

        public b Vl(com.google.protobuf.u uVar) {
            El();
            ((h) this.f126038b).Dm(uVar);
            return this;
        }

        public b Wl(String str) {
            El();
            ((h) this.f126038b).Em(str);
            return this;
        }

        public b Xl(com.google.protobuf.u uVar) {
            El();
            ((h) this.f126038b).Fm(uVar);
            return this;
        }

        @Override // com.google.rpc.i
        public String bh() {
            return ((h) this.f126038b).bh();
        }

        @Override // com.google.rpc.i
        public Map<String, String> d9() {
            return Collections.unmodifiableMap(((h) this.f126038b).d9());
        }

        @Override // com.google.rpc.i
        public String dg(String str) {
            str.getClass();
            Map<String, String> mapD9 = ((h) this.f126038b).d9();
            if (mapD9.containsKey(str)) {
                return mapD9.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.google.rpc.i
        public com.google.protobuf.u f7() {
            return ((h) this.f126038b).f7();
        }

        @Override // com.google.rpc.i
        public String qf(String str, String str2) {
            str.getClass();
            Map<String, String> mapD9 = ((h) this.f126038b).d9();
            return mapD9.containsKey(str) ? mapD9.get(str) : str2;
        }

        @Override // com.google.rpc.i
        public com.google.protobuf.u qk() {
            return ((h) this.f126038b).qk();
        }

        @Override // com.google.rpc.i
        public String u0() {
            return ((h) this.f126038b).u0();
        }

        @Override // com.google.rpc.i
        @Deprecated
        public Map<String, String> z() {
            return d9();
        }

        private b() {
            super(h.DEFAULT_INSTANCE);
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final g2<String, String> f126683a;

        static {
            x4.b bVar = x4.b.f126490k;
            f126683a = g2.f(bVar, "", bVar, "");
        }

        private c() {
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        l1.Wl(h.class, hVar);
    }

    private h() {
    }

    public static h Am(byte[] bArr, v0 v0Var) throws t1 {
        return (h) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<h> Bm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Cm(String str) {
        str.getClass();
        this.domain_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.domain_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Em(String str) {
        str.getClass();
        this.reason_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Fm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.reason_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hm() {
        this.domain_ = jm().bh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void im() {
        this.reason_ = jm().u0();
    }

    public static h jm() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> km() {
        return mm();
    }

    private h2<String, String> lm() {
        return this.metadata_;
    }

    private h2<String, String> mm() {
        if (!this.metadata_.j()) {
            this.metadata_ = this.metadata_.n();
        }
        return this.metadata_;
    }

    public static b nm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b om(h hVar) {
        return DEFAULT_INSTANCE.Uf(hVar);
    }

    public static h pm(InputStream inputStream) throws IOException {
        return (h) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static h qm(InputStream inputStream, v0 v0Var) throws IOException {
        return (h) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static h rm(com.google.protobuf.u uVar) throws t1 {
        return (h) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static h sm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
        return (h) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static h tm(com.google.protobuf.z zVar) throws IOException {
        return (h) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static h um(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
        return (h) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static h vm(InputStream inputStream) throws IOException {
        return (h) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static h wm(InputStream inputStream, v0 v0Var) throws IOException {
        return (h) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static h xm(ByteBuffer byteBuffer) throws t1 {
        return (h) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h ym(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (h) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static h zm(byte[] bArr) throws t1 {
        return (h) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.rpc.i
    public boolean Mc(String str) {
        str.getClass();
        return lm().containsKey(str);
    }

    @Override // com.google.rpc.i
    public int Ni() {
        return lm().size();
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f126682a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new h();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u00032", new Object[]{"reason_", "domain_", "metadata_", c.f126683a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<h> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (h.class) {
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

    @Override // com.google.rpc.i
    public String bh() {
        return this.domain_;
    }

    @Override // com.google.rpc.i
    public Map<String, String> d9() {
        return Collections.unmodifiableMap(lm());
    }

    @Override // com.google.rpc.i
    public String dg(String str) {
        str.getClass();
        h2<String, String> h2VarLm = lm();
        if (h2VarLm.containsKey(str)) {
            return h2VarLm.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.rpc.i
    public com.google.protobuf.u f7() {
        return com.google.protobuf.u.C(this.reason_);
    }

    @Override // com.google.rpc.i
    public String qf(String str, String str2) {
        str.getClass();
        h2<String, String> h2VarLm = lm();
        return h2VarLm.containsKey(str) ? h2VarLm.get(str) : str2;
    }

    @Override // com.google.rpc.i
    public com.google.protobuf.u qk() {
        return com.google.protobuf.u.C(this.domain_);
    }

    @Override // com.google.rpc.i
    public String u0() {
        return this.reason_;
    }

    @Override // com.google.rpc.i
    @Deprecated
    public Map<String, String> z() {
        return d9();
    }
}
