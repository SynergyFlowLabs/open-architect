package com.google.api;

import com.google.protobuf.x4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class s2 extends com.google.protobuf.l1<s2, b> implements t2 {
    private static final s2 DEFAULT_INSTANCE;
    public static final int DEFAULT_LIMIT_FIELD_NUMBER = 3;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 12;
    public static final int DURATION_FIELD_NUMBER = 5;
    public static final int FREE_TIER_FIELD_NUMBER = 7;
    public static final int MAX_LIMIT_FIELD_NUMBER = 4;
    public static final int METRIC_FIELD_NUMBER = 8;
    public static final int NAME_FIELD_NUMBER = 6;
    private static volatile com.google.protobuf.f3<s2> PARSER = null;
    public static final int UNIT_FIELD_NUMBER = 9;
    public static final int VALUES_FIELD_NUMBER = 10;
    private long defaultLimit_;
    private long freeTier_;
    private long maxLimit_;
    private com.google.protobuf.h2<String, Long> values_ = com.google.protobuf.h2.f();
    private String name_ = "";
    private String description_ = "";
    private String duration_ = "";
    private String metric_ = "";
    private String unit_ = "";
    private String displayName_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116298a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f116298a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116298a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116298a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116298a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116298a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116298a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116298a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1.b<s2, b> implements t2 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.api.t2
        public Map<String, Long> Ee() {
            return Collections.unmodifiableMap(((s2) this.f126038b).Ee());
        }

        @Override // com.google.api.t2
        public long Gh() {
            return ((s2) this.f126038b).Gh();
        }

        @Override // com.google.api.t2
        public com.google.protobuf.u L0() {
            return ((s2) this.f126038b).L0();
        }

        @Override // com.google.api.t2
        @Deprecated
        public Map<String, Long> O1() {
            return Ee();
        }

        @Override // com.google.api.t2
        public com.google.protobuf.u Oa() {
            return ((s2) this.f126038b).Oa();
        }

        public b Ol() {
            El();
            ((s2) this.f126038b).zm();
            return this;
        }

        public b Pl() {
            El();
            ((s2) this.f126038b).Am();
            return this;
        }

        public b Ql() {
            El();
            ((s2) this.f126038b).Bm();
            return this;
        }

        public b Rl() {
            El();
            ((s2) this.f126038b).Cm();
            return this;
        }

        public b Sl() {
            El();
            ((s2) this.f126038b).Dm();
            return this;
        }

        public b Tl() {
            El();
            ((s2) this.f126038b).Em();
            return this;
        }

        @Override // com.google.api.t2
        public long Uj() {
            return ((s2) this.f126038b).Uj();
        }

        public b Ul() {
            El();
            ((s2) this.f126038b).Fm();
            return this;
        }

        @Override // com.google.api.t2
        public long Vf(String str, long j10) {
            str.getClass();
            Map<String, Long> mapEe = ((s2) this.f126038b).Ee();
            return mapEe.containsKey(str) ? mapEe.get(str).longValue() : j10;
        }

        public b Vl() {
            El();
            ((s2) this.f126038b).Gm();
            return this;
        }

        public b Wl() {
            El();
            ((s2) this.f126038b).Hm();
            return this;
        }

        public b Xl() {
            El();
            ((s2) this.f126038b).Jm().clear();
            return this;
        }

        public b Yl(Map<String, Long> map) {
            El();
            ((s2) this.f126038b).Jm().putAll(map);
            return this;
        }

        @Override // com.google.api.t2
        public boolean Zh(String str) {
            str.getClass();
            return ((s2) this.f126038b).Ee().containsKey(str);
        }

        public b Zl(String str, long j10) {
            str.getClass();
            El();
            ((s2) this.f126038b).Jm().put(str, Long.valueOf(j10));
            return this;
        }

        @Override // com.google.api.t2
        public com.google.protobuf.u a() {
            return ((s2) this.f126038b).a();
        }

        public b am(String str) {
            str.getClass();
            El();
            ((s2) this.f126038b).Jm().remove(str);
            return this;
        }

        @Override // com.google.api.t2
        public int b1() {
            return ((s2) this.f126038b).Ee().size();
        }

        public b bm(long j10) {
            El();
            ((s2) this.f126038b).bn(j10);
            return this;
        }

        @Override // com.google.api.t2
        public long cd(String str) {
            str.getClass();
            Map<String, Long> mapEe = ((s2) this.f126038b).Ee();
            if (mapEe.containsKey(str)) {
                return mapEe.get(str).longValue();
            }
            throw new IllegalArgumentException();
        }

        public b cm(String str) {
            El();
            ((s2) this.f126038b).cn(str);
            return this;
        }

        @Override // com.google.api.t2
        public com.google.protobuf.u d6() {
            return ((s2) this.f126038b).d6();
        }

        public b dm(com.google.protobuf.u uVar) {
            El();
            ((s2) this.f126038b).dn(uVar);
            return this;
        }

        @Override // com.google.api.t2
        public String e6() {
            return ((s2) this.f126038b).e6();
        }

        public b em(String str) {
            El();
            ((s2) this.f126038b).en(str);
            return this;
        }

        @Override // com.google.api.t2
        public String f2() {
            return ((s2) this.f126038b).f2();
        }

        public b fm(com.google.protobuf.u uVar) {
            El();
            ((s2) this.f126038b).fn(uVar);
            return this;
        }

        @Override // com.google.api.t2
        public String getDescription() {
            return ((s2) this.f126038b).getDescription();
        }

        @Override // com.google.api.t2
        public String getDuration() {
            return ((s2) this.f126038b).getDuration();
        }

        @Override // com.google.api.t2
        public String getName() {
            return ((s2) this.f126038b).getName();
        }

        public b gm(String str) {
            El();
            ((s2) this.f126038b).gn(str);
            return this;
        }

        @Override // com.google.api.t2
        public String h0() {
            return ((s2) this.f126038b).h0();
        }

        public b hm(com.google.protobuf.u uVar) {
            El();
            ((s2) this.f126038b).hn(uVar);
            return this;
        }

        public b im(long j10) {
            El();
            ((s2) this.f126038b).in(j10);
            return this;
        }

        public b jm(long j10) {
            El();
            ((s2) this.f126038b).jn(j10);
            return this;
        }

        @Override // com.google.api.t2
        public com.google.protobuf.u k() {
            return ((s2) this.f126038b).k();
        }

        public b km(String str) {
            El();
            ((s2) this.f126038b).kn(str);
            return this;
        }

        public b lm(com.google.protobuf.u uVar) {
            El();
            ((s2) this.f126038b).ln(uVar);
            return this;
        }

        public b mm(String str) {
            El();
            ((s2) this.f126038b).mn(str);
            return this;
        }

        public b nm(com.google.protobuf.u uVar) {
            El();
            ((s2) this.f126038b).nn(uVar);
            return this;
        }

        public b om(String str) {
            El();
            ((s2) this.f126038b).on(str);
            return this;
        }

        public b pm(com.google.protobuf.u uVar) {
            El();
            ((s2) this.f126038b).pn(uVar);
            return this;
        }

        @Override // com.google.api.t2
        public long q9() {
            return ((s2) this.f126038b).q9();
        }

        @Override // com.google.api.t2
        public com.google.protobuf.u s9() {
            return ((s2) this.f126038b).s9();
        }

        private b() {
            super(s2.DEFAULT_INSTANCE);
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final com.google.protobuf.g2<String, Long> f116299a = com.google.protobuf.g2.f(x4.b.f126490k, "", x4.b.f126484e, 0L);

        private c() {
        }
    }

    static {
        s2 s2Var = new s2();
        DEFAULT_INSTANCE = s2Var;
        com.google.protobuf.l1.Wl(s2.class, s2Var);
    }

    private s2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Am() {
        this.description_ = Im().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bm() {
        this.displayName_ = Im().h0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Cm() {
        this.duration_ = Im().getDuration();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dm() {
        this.freeTier_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Em() {
        this.maxLimit_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Fm() {
        this.metric_ = Im().e6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Gm() {
        this.name_ = Im().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Hm() {
        this.unit_ = Im().f2();
    }

    public static s2 Im() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Long> Jm() {
        return Km();
    }

    private com.google.protobuf.h2<String, Long> Km() {
        if (!this.values_.j()) {
            this.values_ = this.values_.n();
        }
        return this.values_;
    }

    private com.google.protobuf.h2<String, Long> Lm() {
        return this.values_;
    }

    public static b Mm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b Nm(s2 s2Var) {
        return DEFAULT_INSTANCE.Uf(s2Var);
    }

    public static s2 Om(InputStream inputStream) throws IOException {
        return (s2) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static s2 Pm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (s2) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static s2 Qm(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (s2) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static s2 Rm(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (s2) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static s2 Sm(com.google.protobuf.z zVar) throws IOException {
        return (s2) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static s2 Tm(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (s2) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static s2 Um(InputStream inputStream) throws IOException {
        return (s2) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static s2 Vm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (s2) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static s2 Wm(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (s2) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static s2 Xm(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (s2) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static s2 Ym(byte[] bArr) throws com.google.protobuf.t1 {
        return (s2) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static s2 Zm(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (s2) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static com.google.protobuf.f3<s2> an() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bn(long j10) {
        this.defaultLimit_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cn(String str) {
        str.getClass();
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dn(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.description_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void en(String str) {
        str.getClass();
        this.displayName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fn(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.displayName_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gn(String str) {
        str.getClass();
        this.duration_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.duration_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void in(long j10) {
        this.freeTier_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jn(long j10) {
        this.maxLimit_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kn(String str) {
        str.getClass();
        this.metric_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ln(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.metric_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mn(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nn(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.name_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void on(String str) {
        str.getClass();
        this.unit_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pn(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.unit_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zm() {
        this.defaultLimit_ = 0L;
    }

    @Override // com.google.api.t2
    public Map<String, Long> Ee() {
        return Collections.unmodifiableMap(Lm());
    }

    @Override // com.google.api.t2
    public long Gh() {
        return this.defaultLimit_;
    }

    @Override // com.google.api.t2
    public com.google.protobuf.u L0() {
        return com.google.protobuf.u.C(this.displayName_);
    }

    @Override // com.google.api.t2
    @Deprecated
    public Map<String, Long> O1() {
        return Ee();
    }

    @Override // com.google.api.t2
    public com.google.protobuf.u Oa() {
        return com.google.protobuf.u.C(this.duration_);
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        int i10 = a.f116298a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new s2();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0002\f\n\u0001\u0000\u0000\u0002Ȉ\u0003\u0002\u0004\u0002\u0005Ȉ\u0006Ȉ\u0007\u0002\bȈ\tȈ\n2\fȈ", new Object[]{"description_", "defaultLimit_", "maxLimit_", "duration_", "name_", "freeTier_", "metric_", "unit_", "values_", c.f116299a, "displayName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f3<s2> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (s2.class) {
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

    @Override // com.google.api.t2
    public long Uj() {
        return this.freeTier_;
    }

    @Override // com.google.api.t2
    public long Vf(String str, long j10) {
        str.getClass();
        com.google.protobuf.h2<String, Long> h2VarLm = Lm();
        return h2VarLm.containsKey(str) ? h2VarLm.get(str).longValue() : j10;
    }

    @Override // com.google.api.t2
    public boolean Zh(String str) {
        str.getClass();
        return Lm().containsKey(str);
    }

    @Override // com.google.api.t2
    public com.google.protobuf.u a() {
        return com.google.protobuf.u.C(this.name_);
    }

    @Override // com.google.api.t2
    public int b1() {
        return Lm().size();
    }

    @Override // com.google.api.t2
    public long cd(String str) {
        str.getClass();
        com.google.protobuf.h2<String, Long> h2VarLm = Lm();
        if (h2VarLm.containsKey(str)) {
            return h2VarLm.get(str).longValue();
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.api.t2
    public com.google.protobuf.u d6() {
        return com.google.protobuf.u.C(this.unit_);
    }

    @Override // com.google.api.t2
    public String e6() {
        return this.metric_;
    }

    @Override // com.google.api.t2
    public String f2() {
        return this.unit_;
    }

    @Override // com.google.api.t2
    public String getDescription() {
        return this.description_;
    }

    @Override // com.google.api.t2
    public String getDuration() {
        return this.duration_;
    }

    @Override // com.google.api.t2
    public String getName() {
        return this.name_;
    }

    @Override // com.google.api.t2
    public String h0() {
        return this.displayName_;
    }

    @Override // com.google.api.t2
    public com.google.protobuf.u k() {
        return com.google.protobuf.u.C(this.description_);
    }

    @Override // com.google.api.t2
    public long q9() {
        return this.maxLimit_;
    }

    @Override // com.google.api.t2
    public com.google.protobuf.u s9() {
        return com.google.protobuf.u.C(this.metric_);
    }
}
