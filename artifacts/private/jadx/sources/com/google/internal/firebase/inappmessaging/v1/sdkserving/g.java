package com.google.internal.firebase.inappmessaging.v1.sdkserving;

import com.google.protobuf.f3;
import com.google.protobuf.l1;
import com.google.protobuf.s1;
import com.google.protobuf.t1;
import com.google.protobuf.u;
import com.google.protobuf.v0;
import com.google.protobuf.z;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends l1<g, b> implements h {
    public static final int ALREADY_SEEN_CAMPAIGNS_FIELD_NUMBER = 3;
    public static final int CLIENT_SIGNALS_FIELD_NUMBER = 4;
    private static final g DEFAULT_INSTANCE;
    private static volatile f3<g> PARSER = null;
    public static final int PROJECT_NUMBER_FIELD_NUMBER = 1;
    public static final int REQUESTING_CLIENT_APP_FIELD_NUMBER = 2;
    private int bitField0_;
    private com.google.developers.mobile.targeting.proto.a.d clientSignals_;
    private e requestingClientApp_;
    private String projectNumber_ = "";
    private s1.k<com.google.internal.firebase.inappmessaging.v1.sdkserving.a> alreadySeenCampaigns_ = l1.Ij();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f125668a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f125668a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f125668a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f125668a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f125668a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f125668a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f125668a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f125668a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<g, b> implements h {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.h
        public com.google.developers.mobile.targeting.proto.a.d Ja() {
            return ((g) this.f126038b).Ja();
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.h
        public List<com.google.internal.firebase.inappmessaging.v1.sdkserving.a> O7() {
            return Collections.unmodifiableList(((g) this.f126038b).O7());
        }

        public b Ol(Iterable<? extends com.google.internal.firebase.inappmessaging.v1.sdkserving.a> iterable) {
            El();
            ((g) this.f126038b).pm(iterable);
            return this;
        }

        public b Pl(int i10, com.google.internal.firebase.inappmessaging.v1.sdkserving.a.b bVar) {
            El();
            ((g) this.f126038b).qm(i10, bVar.build());
            return this;
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.h
        public boolean Qd() {
            return ((g) this.f126038b).Qd();
        }

        public b Ql(int i10, com.google.internal.firebase.inappmessaging.v1.sdkserving.a aVar) {
            El();
            ((g) this.f126038b).qm(i10, aVar);
            return this;
        }

        public b Rl(com.google.internal.firebase.inappmessaging.v1.sdkserving.a.b bVar) {
            El();
            ((g) this.f126038b).rm(bVar.build());
            return this;
        }

        public b Sl(com.google.internal.firebase.inappmessaging.v1.sdkserving.a aVar) {
            El();
            ((g) this.f126038b).rm(aVar);
            return this;
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.h
        public int T1() {
            return ((g) this.f126038b).T1();
        }

        public b Tl() {
            El();
            ((g) this.f126038b).sm();
            return this;
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.h
        public u U6() {
            return ((g) this.f126038b).U6();
        }

        public b Ul() {
            El();
            ((g) this.f126038b).tm();
            return this;
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.h
        public boolean Vj() {
            return ((g) this.f126038b).Vj();
        }

        public b Vl() {
            El();
            ((g) this.f126038b).um();
            return this;
        }

        public b Wl() {
            El();
            ((g) this.f126038b).vm();
            return this;
        }

        public b Xl(com.google.developers.mobile.targeting.proto.a.d dVar) {
            El();
            ((g) this.f126038b).Am(dVar);
            return this;
        }

        public b Yl(e eVar) {
            El();
            ((g) this.f126038b).Bm(eVar);
            return this;
        }

        public b Zl(int i10) {
            El();
            ((g) this.f126038b).Rm(i10);
            return this;
        }

        public b am(int i10, com.google.internal.firebase.inappmessaging.v1.sdkserving.a.b bVar) {
            El();
            ((g) this.f126038b).Sm(i10, bVar.build());
            return this;
        }

        public b bm(int i10, com.google.internal.firebase.inappmessaging.v1.sdkserving.a aVar) {
            El();
            ((g) this.f126038b).Sm(i10, aVar);
            return this;
        }

        public b cm(com.google.developers.mobile.targeting.proto.a.d.C1121a c1121a) {
            El();
            ((g) this.f126038b).Tm(c1121a.build());
            return this;
        }

        public b dm(com.google.developers.mobile.targeting.proto.a.d dVar) {
            El();
            ((g) this.f126038b).Tm(dVar);
            return this;
        }

        public b em(String str) {
            El();
            ((g) this.f126038b).Um(str);
            return this;
        }

        public b fm(u uVar) {
            El();
            ((g) this.f126038b).Vm(uVar);
            return this;
        }

        public b gm(e.b bVar) {
            El();
            ((g) this.f126038b).Wm(bVar.build());
            return this;
        }

        public b hm(e eVar) {
            El();
            ((g) this.f126038b).Wm(eVar);
            return this;
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.h
        public String i6() {
            return ((g) this.f126038b).i6();
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.h
        public e kk() {
            return ((g) this.f126038b).kk();
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.h
        public com.google.internal.firebase.inappmessaging.v1.sdkserving.a x4(int i10) {
            return ((g) this.f126038b).x4(i10);
        }

        private b() {
            super(g.DEFAULT_INSTANCE);
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        l1.Wl(g.class, gVar);
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Am(com.google.developers.mobile.targeting.proto.a.d dVar) {
        dVar.getClass();
        com.google.developers.mobile.targeting.proto.a.d dVar2 = this.clientSignals_;
        if (dVar2 == null || dVar2 == com.google.developers.mobile.targeting.proto.a.d.qm()) {
            this.clientSignals_ = dVar;
        } else {
            this.clientSignals_ = com.google.developers.mobile.targeting.proto.a.d.sm(this.clientSignals_).Jl(dVar).B1();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bm(e eVar) {
        eVar.getClass();
        e eVar2 = this.requestingClientApp_;
        if (eVar2 == null || eVar2 == e.mm()) {
            this.requestingClientApp_ = eVar;
        } else {
            this.requestingClientApp_ = e.om(this.requestingClientApp_).Jl(eVar).B1();
        }
        this.bitField0_ |= 1;
    }

    public static b Cm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b Dm(g gVar) {
        return DEFAULT_INSTANCE.Uf(gVar);
    }

    public static g Em(InputStream inputStream) throws IOException {
        return (g) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static g Fm(InputStream inputStream, v0 v0Var) throws IOException {
        return (g) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static g Gm(u uVar) throws t1 {
        return (g) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static g Hm(u uVar, v0 v0Var) throws t1 {
        return (g) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static g Im(z zVar) throws IOException {
        return (g) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static g Jm(z zVar, v0 v0Var) throws IOException {
        return (g) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static g Km(InputStream inputStream) throws IOException {
        return (g) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static g Lm(InputStream inputStream, v0 v0Var) throws IOException {
        return (g) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static g Mm(ByteBuffer byteBuffer) throws t1 {
        return (g) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static g Nm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (g) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static g Om(byte[] bArr) throws t1 {
        return (g) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static g Pm(byte[] bArr, v0 v0Var) throws t1 {
        return (g) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<g> Qm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Rm(int i10) {
        wm();
        this.alreadySeenCampaigns_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sm(int i10, com.google.internal.firebase.inappmessaging.v1.sdkserving.a aVar) {
        aVar.getClass();
        wm();
        this.alreadySeenCampaigns_.set(i10, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Tm(com.google.developers.mobile.targeting.proto.a.d dVar) {
        dVar.getClass();
        this.clientSignals_ = dVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Um(String str) {
        str.getClass();
        this.projectNumber_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Vm(u uVar) {
        com.google.protobuf.a.R(uVar);
        this.projectNumber_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Wm(e eVar) {
        eVar.getClass();
        this.requestingClientApp_ = eVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pm(Iterable<? extends com.google.internal.firebase.inappmessaging.v1.sdkserving.a> iterable) {
        wm();
        com.google.protobuf.a.y(iterable, this.alreadySeenCampaigns_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qm(int i10, com.google.internal.firebase.inappmessaging.v1.sdkserving.a aVar) {
        aVar.getClass();
        wm();
        this.alreadySeenCampaigns_.add(i10, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rm(com.google.internal.firebase.inappmessaging.v1.sdkserving.a aVar) {
        aVar.getClass();
        wm();
        this.alreadySeenCampaigns_.add(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sm() {
        this.alreadySeenCampaigns_ = l1.Ij();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tm() {
        this.clientSignals_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void um() {
        this.projectNumber_ = zm().i6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vm() {
        this.requestingClientApp_ = null;
        this.bitField0_ &= -2;
    }

    private void wm() {
        s1.k<com.google.internal.firebase.inappmessaging.v1.sdkserving.a> kVar = this.alreadySeenCampaigns_;
        if (kVar.s1()) {
            return;
        }
        this.alreadySeenCampaigns_ = l1.yl(kVar);
    }

    public static g zm() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.h
    public com.google.developers.mobile.targeting.proto.a.d Ja() {
        com.google.developers.mobile.targeting.proto.a.d dVarQm = this.clientSignals_;
        if (dVarQm == null) {
            dVarQm = com.google.developers.mobile.targeting.proto.a.d.qm();
        }
        return dVarQm;
    }

    @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.h
    public List<com.google.internal.firebase.inappmessaging.v1.sdkserving.a> O7() {
        return this.alreadySeenCampaigns_;
    }

    @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.h
    public boolean Qd() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f125668a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new g();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u001b\u0004ဉ\u0001", new Object[]{"bitField0_", "projectNumber_", "requestingClientApp_", "alreadySeenCampaigns_", com.google.internal.firebase.inappmessaging.v1.sdkserving.a.class, "clientSignals_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<g> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (g.class) {
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

    @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.h
    public int T1() {
        return this.alreadySeenCampaigns_.size();
    }

    @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.h
    public u U6() {
        return u.C(this.projectNumber_);
    }

    @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.h
    public boolean Vj() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.h
    public String i6() {
        return this.projectNumber_;
    }

    @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.h
    public e kk() {
        e eVar = this.requestingClientApp_;
        return eVar == null ? e.mm() : eVar;
    }

    @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.h
    public com.google.internal.firebase.inappmessaging.v1.sdkserving.a x4(int i10) {
        return this.alreadySeenCampaigns_.get(i10);
    }

    public d xm(int i10) {
        return this.alreadySeenCampaigns_.get(i10);
    }

    public List<? extends d> ym() {
        return this.alreadySeenCampaigns_;
    }
}
