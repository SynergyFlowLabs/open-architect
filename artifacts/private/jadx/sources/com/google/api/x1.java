package com.google.api;

import com.google.protobuf.x4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class x1 extends com.google.protobuf.l1<x1, b> implements y1 {
    private static final x1 DEFAULT_INSTANCE;
    public static final int METRIC_COSTS_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.f3<x1> PARSER = null;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private com.google.protobuf.h2<String, Long> metricCosts_ = com.google.protobuf.h2.f();
    private String selector_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116406a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f116406a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116406a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116406a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116406a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116406a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116406a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116406a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1.b<x1, b> implements y1 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.api.y1
        public String A() {
            return ((x1) this.f126038b).A();
        }

        @Override // com.google.api.y1
        public com.google.protobuf.u B() {
            return ((x1) this.f126038b).B();
        }

        @Override // com.google.api.y1
        public int Hj() {
            return ((x1) this.f126038b).Pd().size();
        }

        @Override // com.google.api.y1
        public boolean Ie(String str) {
            str.getClass();
            return ((x1) this.f126038b).Pd().containsKey(str);
        }

        public b Ol() {
            El();
            ((x1) this.f126038b).gm().clear();
            return this;
        }

        @Override // com.google.api.y1
        public Map<String, Long> Pd() {
            return Collections.unmodifiableMap(((x1) this.f126038b).Pd());
        }

        public b Pl() {
            El();
            ((x1) this.f126038b).em();
            return this;
        }

        public b Ql(Map<String, Long> map) {
            El();
            ((x1) this.f126038b).gm().putAll(map);
            return this;
        }

        public b Rl(String str, long j10) {
            str.getClass();
            El();
            ((x1) this.f126038b).gm().put(str, Long.valueOf(j10));
            return this;
        }

        public b Sl(String str) {
            str.getClass();
            El();
            ((x1) this.f126038b).gm().remove(str);
            return this;
        }

        public b Tl(String str) {
            El();
            ((x1) this.f126038b).ym(str);
            return this;
        }

        public b Ul(com.google.protobuf.u uVar) {
            El();
            ((x1) this.f126038b).zm(uVar);
            return this;
        }

        @Override // com.google.api.y1
        public long jb(String str, long j10) {
            str.getClass();
            Map<String, Long> mapPd = ((x1) this.f126038b).Pd();
            return mapPd.containsKey(str) ? mapPd.get(str).longValue() : j10;
        }

        @Override // com.google.api.y1
        @Deprecated
        public Map<String, Long> tc() {
            return Pd();
        }

        @Override // com.google.api.y1
        public long vb(String str) {
            str.getClass();
            Map<String, Long> mapPd = ((x1) this.f126038b).Pd();
            if (mapPd.containsKey(str)) {
                return mapPd.get(str).longValue();
            }
            throw new IllegalArgumentException();
        }

        private b() {
            super(x1.DEFAULT_INSTANCE);
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final com.google.protobuf.g2<String, Long> f116407a = com.google.protobuf.g2.f(x4.b.f126490k, "", x4.b.f126484e, 0L);

        private c() {
        }
    }

    static {
        x1 x1Var = new x1();
        DEFAULT_INSTANCE = x1Var;
        com.google.protobuf.l1.Wl(x1.class, x1Var);
    }

    private x1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void em() {
        this.selector_ = fm().A();
    }

    public static x1 fm() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Long> gm() {
        return im();
    }

    private com.google.protobuf.h2<String, Long> hm() {
        return this.metricCosts_;
    }

    private com.google.protobuf.h2<String, Long> im() {
        if (!this.metricCosts_.j()) {
            this.metricCosts_ = this.metricCosts_.n();
        }
        return this.metricCosts_;
    }

    public static b jm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b km(x1 x1Var) {
        return DEFAULT_INSTANCE.Uf(x1Var);
    }

    public static x1 lm(InputStream inputStream) throws IOException {
        return (x1) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static x1 mm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (x1) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static x1 nm(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (x1) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static x1 om(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (x1) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static x1 pm(com.google.protobuf.z zVar) throws IOException {
        return (x1) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static x1 qm(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (x1) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static x1 rm(InputStream inputStream) throws IOException {
        return (x1) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static x1 sm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (x1) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static x1 tm(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (x1) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static x1 um(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (x1) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static x1 vm(byte[] bArr) throws com.google.protobuf.t1 {
        return (x1) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static x1 wm(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (x1) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static com.google.protobuf.f3<x1> xm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ym(String str) {
        str.getClass();
        this.selector_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.selector_ = uVar.z0();
    }

    @Override // com.google.api.y1
    public String A() {
        return this.selector_;
    }

    @Override // com.google.api.y1
    public com.google.protobuf.u B() {
        return com.google.protobuf.u.C(this.selector_);
    }

    @Override // com.google.api.y1
    public int Hj() {
        return hm().size();
    }

    @Override // com.google.api.y1
    public boolean Ie(String str) {
        str.getClass();
        return hm().containsKey(str);
    }

    @Override // com.google.api.y1
    public Map<String, Long> Pd() {
        return Collections.unmodifiableMap(hm());
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        int i10 = a.f116406a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new x1();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001Ȉ\u00022", new Object[]{"selector_", "metricCosts_", c.f116407a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f3<x1> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (x1.class) {
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

    @Override // com.google.api.y1
    public long jb(String str, long j10) {
        str.getClass();
        com.google.protobuf.h2<String, Long> h2VarHm = hm();
        return h2VarHm.containsKey(str) ? h2VarHm.get(str).longValue() : j10;
    }

    @Override // com.google.api.y1
    @Deprecated
    public Map<String, Long> tc() {
        return Pd();
    }

    @Override // com.google.api.y1
    public long vb(String str) {
        str.getClass();
        com.google.protobuf.h2<String, Long> h2VarHm = hm();
        if (h2VarHm.containsKey(str)) {
            return h2VarHm.get(str).longValue();
        }
        throw new IllegalArgumentException();
    }
}
