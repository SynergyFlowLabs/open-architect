package com.google.api;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class o3 extends com.google.protobuf.l1<o3, b> implements p3 {
    private static final o3 DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.f3<o3> PARSER = null;
    public static final int PRODUCER_NOTIFICATION_CHANNEL_FIELD_NUMBER = 7;
    public static final int REQUIREMENTS_FIELD_NUMBER = 1;
    public static final int RULES_FIELD_NUMBER = 6;
    private com.google.protobuf.s1.k<String> requirements_ = com.google.protobuf.l1.Ij();
    private com.google.protobuf.s1.k<r3> rules_ = com.google.protobuf.l1.Ij();
    private String producerNotificationChannel_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116256a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f116256a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116256a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116256a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116256a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116256a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116256a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116256a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1.b<o3, b> implements p3 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.api.p3
        public r3 F(int i10) {
            return ((o3) this.f126038b).F(i10);
        }

        @Override // com.google.api.p3
        public int G() {
            return ((o3) this.f126038b).G();
        }

        @Override // com.google.api.p3
        public List<r3> H() {
            return Collections.unmodifiableList(((o3) this.f126038b).H());
        }

        public b Ol(Iterable<String> iterable) {
            El();
            ((o3) this.f126038b).om(iterable);
            return this;
        }

        public b Pl(Iterable<? extends r3> iterable) {
            El();
            ((o3) this.f126038b).pm(iterable);
            return this;
        }

        public b Ql(String str) {
            El();
            ((o3) this.f126038b).qm(str);
            return this;
        }

        public b Rl(com.google.protobuf.u uVar) {
            El();
            ((o3) this.f126038b).rm(uVar);
            return this;
        }

        public b Sl(int i10, r3.b bVar) {
            El();
            ((o3) this.f126038b).sm(i10, bVar.build());
            return this;
        }

        public b Tl(int i10, r3 r3Var) {
            El();
            ((o3) this.f126038b).sm(i10, r3Var);
            return this;
        }

        public b Ul(r3.b bVar) {
            El();
            ((o3) this.f126038b).tm(bVar.build());
            return this;
        }

        public b Vl(r3 r3Var) {
            El();
            ((o3) this.f126038b).tm(r3Var);
            return this;
        }

        public b Wl() {
            El();
            ((o3) this.f126038b).um();
            return this;
        }

        public b Xl() {
            El();
            ((o3) this.f126038b).vm();
            return this;
        }

        @Override // com.google.api.p3
        public com.google.protobuf.u Yc() {
            return ((o3) this.f126038b).Yc();
        }

        public b Yl() {
            El();
            ((o3) this.f126038b).wm();
            return this;
        }

        public b Zl(int i10) {
            El();
            ((o3) this.f126038b).Rm(i10);
            return this;
        }

        public b am(String str) {
            El();
            ((o3) this.f126038b).Sm(str);
            return this;
        }

        public b bm(com.google.protobuf.u uVar) {
            El();
            ((o3) this.f126038b).Tm(uVar);
            return this;
        }

        public b cm(int i10, String str) {
            El();
            ((o3) this.f126038b).Um(i10, str);
            return this;
        }

        public b dm(int i10, r3.b bVar) {
            El();
            ((o3) this.f126038b).Vm(i10, bVar.build());
            return this;
        }

        public b em(int i10, r3 r3Var) {
            El();
            ((o3) this.f126038b).Vm(i10, r3Var);
            return this;
        }

        @Override // com.google.api.p3
        public String n8() {
            return ((o3) this.f126038b).n8();
        }

        @Override // com.google.api.p3
        public int o2() {
            return ((o3) this.f126038b).o2();
        }

        @Override // com.google.api.p3
        public List<String> r5() {
            return Collections.unmodifiableList(((o3) this.f126038b).r5());
        }

        @Override // com.google.api.p3
        public com.google.protobuf.u se(int i10) {
            return ((o3) this.f126038b).se(i10);
        }

        @Override // com.google.api.p3
        public String y5(int i10) {
            return ((o3) this.f126038b).y5(i10);
        }

        private b() {
            super(o3.DEFAULT_INSTANCE);
        }
    }

    static {
        o3 o3Var = new o3();
        DEFAULT_INSTANCE = o3Var;
        com.google.protobuf.l1.Wl(o3.class, o3Var);
    }

    private o3() {
    }

    public static b Cm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b Dm(o3 o3Var) {
        return DEFAULT_INSTANCE.Uf(o3Var);
    }

    public static o3 Em(InputStream inputStream) throws IOException {
        return (o3) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static o3 Fm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (o3) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static o3 Gm(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (o3) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static o3 Hm(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (o3) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static o3 Im(com.google.protobuf.z zVar) throws IOException {
        return (o3) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static o3 Jm(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (o3) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static o3 Km(InputStream inputStream) throws IOException {
        return (o3) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static o3 Lm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (o3) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static o3 Mm(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (o3) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static o3 Nm(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (o3) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static o3 Om(byte[] bArr) throws com.google.protobuf.t1 {
        return (o3) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static o3 Pm(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (o3) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static com.google.protobuf.f3<o3> Qm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Rm(int i10) {
        ym();
        this.rules_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sm(String str) {
        str.getClass();
        this.producerNotificationChannel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Tm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.producerNotificationChannel_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Um(int i10, String str) {
        str.getClass();
        xm();
        this.requirements_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Vm(int i10, r3 r3Var) {
        r3Var.getClass();
        ym();
        this.rules_.set(i10, r3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void om(Iterable<String> iterable) {
        xm();
        com.google.protobuf.a.y(iterable, this.requirements_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pm(Iterable<? extends r3> iterable) {
        ym();
        com.google.protobuf.a.y(iterable, this.rules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qm(String str) {
        str.getClass();
        xm();
        this.requirements_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        xm();
        this.requirements_.add(uVar.z0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sm(int i10, r3 r3Var) {
        r3Var.getClass();
        ym();
        this.rules_.add(i10, r3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tm(r3 r3Var) {
        r3Var.getClass();
        ym();
        this.rules_.add(r3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void um() {
        this.producerNotificationChannel_ = zm().n8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vm() {
        this.requirements_ = com.google.protobuf.l1.Ij();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wm() {
        this.rules_ = com.google.protobuf.l1.Ij();
    }

    private void xm() {
        com.google.protobuf.s1.k<String> kVar = this.requirements_;
        if (kVar.s1()) {
            return;
        }
        this.requirements_ = com.google.protobuf.l1.yl(kVar);
    }

    private void ym() {
        com.google.protobuf.s1.k<r3> kVar = this.rules_;
        if (!kVar.s1()) {
            this.rules_ = com.google.protobuf.l1.yl(kVar);
        }
    }

    public static o3 zm() {
        return DEFAULT_INSTANCE;
    }

    public s3 Am(int i10) {
        return this.rules_.get(i10);
    }

    public List<? extends s3> Bm() {
        return this.rules_;
    }

    @Override // com.google.api.p3
    public r3 F(int i10) {
        return this.rules_.get(i10);
    }

    @Override // com.google.api.p3
    public int G() {
        return this.rules_.size();
    }

    @Override // com.google.api.p3
    public List<r3> H() {
        return this.rules_;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        int i10 = a.f116256a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new o3();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0007\u0003\u0000\u0002\u0000\u0001Ț\u0006\u001b\u0007Ȉ", new Object[]{"requirements_", "rules_", r3.class, "producerNotificationChannel_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f3<o3> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (o3.class) {
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

    @Override // com.google.api.p3
    public com.google.protobuf.u Yc() {
        return com.google.protobuf.u.C(this.producerNotificationChannel_);
    }

    @Override // com.google.api.p3
    public String n8() {
        return this.producerNotificationChannel_;
    }

    @Override // com.google.api.p3
    public int o2() {
        return this.requirements_.size();
    }

    @Override // com.google.api.p3
    public List<String> r5() {
        return this.requirements_;
    }

    @Override // com.google.api.p3
    public com.google.protobuf.u se(int i10) {
        return com.google.protobuf.u.C(this.requirements_.get(i10));
    }

    @Override // com.google.api.p3
    public String y5(int i10) {
        return this.requirements_.get(i10);
    }
}
