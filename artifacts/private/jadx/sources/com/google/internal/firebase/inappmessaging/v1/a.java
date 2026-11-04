package com.google.internal.firebase.inappmessaging.v1;

import com.google.firebase.inappmessaging.x;
import com.google.protobuf.f3;
import com.google.protobuf.g2;
import com.google.protobuf.h2;
import com.google.protobuf.l1;
import com.google.protobuf.o2;
import com.google.protobuf.s1;
import com.google.protobuf.t1;
import com.google.protobuf.u;
import com.google.protobuf.v0;
import com.google.protobuf.x4;
import com.google.protobuf.z;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: com.google.internal.firebase.inappmessaging.v1.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C1203a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f125658a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f125658a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f125658a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f125658a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f125658a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f125658a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f125658a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f125658a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1<b, C1204a> implements c {
        public static final int CAMPAIGN_END_TIME_MILLIS_FIELD_NUMBER = 4;
        public static final int CAMPAIGN_ID_FIELD_NUMBER = 1;
        public static final int CAMPAIGN_NAME_FIELD_NUMBER = 5;
        public static final int CAMPAIGN_START_TIME_MILLIS_FIELD_NUMBER = 3;
        private static final b DEFAULT_INSTANCE;
        public static final int EXPERIMENT_PAYLOAD_FIELD_NUMBER = 2;
        private static volatile f3<b> PARSER;
        private int bitField0_;
        private long campaignEndTimeMillis_;
        private String campaignId_ = "";
        private String campaignName_ = "";
        private long campaignStartTimeMillis_;
        private com.google.firebase.inappmessaging.i.d experimentPayload_;

        /* JADX INFO: renamed from: com.google.internal.firebase.inappmessaging.v1.a$b$a, reason: collision with other inner class name */
        public static final class C1204a extends l1.b<b, C1204a> implements c {
            /* synthetic */ C1204a(C1203a c1203a) {
                this();
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.c
            public String A6() {
                return ((b) this.f126038b).A6();
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.c
            public String G0() {
                return ((b) this.f126038b).G0();
            }

            public C1204a Ol() {
                El();
                ((b) this.f126038b).nm();
                return this;
            }

            public C1204a Pl() {
                El();
                ((b) this.f126038b).om();
                return this;
            }

            public C1204a Ql() {
                El();
                ((b) this.f126038b).pm();
                return this;
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.c
            public u R5() {
                return ((b) this.f126038b).R5();
            }

            public C1204a Rl() {
                El();
                ((b) this.f126038b).qm();
                return this;
            }

            public C1204a Sl() {
                El();
                ((b) this.f126038b).rm();
                return this;
            }

            public C1204a Tl(com.google.firebase.inappmessaging.i.d dVar) {
                El();
                ((b) this.f126038b).tm(dVar);
                return this;
            }

            public C1204a Ul(long j10) {
                El();
                ((b) this.f126038b).Jm(j10);
                return this;
            }

            public C1204a Vl(String str) {
                El();
                ((b) this.f126038b).Km(str);
                return this;
            }

            public C1204a Wl(u uVar) {
                El();
                ((b) this.f126038b).Lm(uVar);
                return this;
            }

            public C1204a Xl(String str) {
                El();
                ((b) this.f126038b).Mm(str);
                return this;
            }

            public C1204a Yl(u uVar) {
                El();
                ((b) this.f126038b).Nm(uVar);
                return this;
            }

            public C1204a Zl(long j10) {
                El();
                ((b) this.f126038b).Om(j10);
                return this;
            }

            public C1204a am(com.google.firebase.inappmessaging.i.d.a aVar) {
                El();
                ((b) this.f126038b).Pm(aVar.build());
                return this;
            }

            public C1204a bm(com.google.firebase.inappmessaging.i.d dVar) {
                El();
                ((b) this.f126038b).Pm(dVar);
                return this;
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.c
            public u g0() {
                return ((b) this.f126038b).g0();
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.c
            public boolean he() {
                return ((b) this.f126038b).he();
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.c
            public long j2() {
                return ((b) this.f126038b).j2();
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.c
            public com.google.firebase.inappmessaging.i.d ob() {
                return ((b) this.f126038b).ob();
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.c
            public long t4() {
                return ((b) this.f126038b).t4();
            }

            private C1204a() {
                super(b.DEFAULT_INSTANCE);
            }
        }

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            l1.Wl(b.class, bVar);
        }

        private b() {
        }

        public static b Am(z zVar) throws IOException {
            return (b) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static b Bm(z zVar, v0 v0Var) throws IOException {
            return (b) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static b Cm(InputStream inputStream) throws IOException {
            return (b) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static b Dm(InputStream inputStream, v0 v0Var) throws IOException {
            return (b) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static b Em(ByteBuffer byteBuffer) throws t1 {
            return (b) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static b Fm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (b) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static b Gm(byte[] bArr) throws t1 {
            return (b) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static b Hm(byte[] bArr, v0 v0Var) throws t1 {
            return (b) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<b> Im() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Jm(long j10) {
            this.campaignEndTimeMillis_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Km(String str) {
            str.getClass();
            this.campaignId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Lm(u uVar) {
            com.google.protobuf.a.R(uVar);
            this.campaignId_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Mm(String str) {
            str.getClass();
            this.campaignName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Nm(u uVar) {
            com.google.protobuf.a.R(uVar);
            this.campaignName_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Om(long j10) {
            this.campaignStartTimeMillis_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Pm(com.google.firebase.inappmessaging.i.d dVar) {
            dVar.getClass();
            this.experimentPayload_ = dVar;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void nm() {
            this.campaignEndTimeMillis_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void om() {
            this.campaignId_ = sm().G0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void pm() {
            this.campaignName_ = sm().A6();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void qm() {
            this.campaignStartTimeMillis_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void rm() {
            this.experimentPayload_ = null;
            this.bitField0_ &= -2;
        }

        public static b sm() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void tm(com.google.firebase.inappmessaging.i.d dVar) {
            dVar.getClass();
            com.google.firebase.inappmessaging.i.d dVar2 = this.experimentPayload_;
            if (dVar2 == null || dVar2 == com.google.firebase.inappmessaging.i.d.en()) {
                this.experimentPayload_ = dVar;
            } else {
                this.experimentPayload_ = com.google.firebase.inappmessaging.i.d.in(this.experimentPayload_).Jl(dVar).B1();
            }
            this.bitField0_ |= 1;
        }

        public static C1204a um() {
            return DEFAULT_INSTANCE.jf();
        }

        public static C1204a vm(b bVar) {
            return DEFAULT_INSTANCE.Uf(bVar);
        }

        public static b wm(InputStream inputStream) throws IOException {
            return (b) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static b xm(InputStream inputStream, v0 v0Var) throws IOException {
            return (b) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static b ym(u uVar) throws t1 {
            return (b) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static b zm(u uVar, v0 v0Var) throws t1 {
            return (b) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.a.c
        public String A6() {
            return this.campaignName_;
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.a.c
        public String G0() {
            return this.campaignId_;
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.a.c
        public u R5() {
            return u.C(this.campaignName_);
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            int i10 = C1203a.f125658a[iVar.ordinal()];
            C1203a c1203a = null;
            switch (i10) {
                case 1:
                    return new b();
                case 2:
                    return new C1204a(c1203a);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u0002\u0004\u0002\u0005Ȉ", new Object[]{"bitField0_", "campaignId_", "experimentPayload_", "campaignStartTimeMillis_", "campaignEndTimeMillis_", "campaignName_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f3<b> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (b.class) {
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

        @Override // com.google.internal.firebase.inappmessaging.v1.a.c
        public u g0() {
            return u.C(this.campaignId_);
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.a.c
        public boolean he() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.a.c
        public long j2() {
            return this.campaignStartTimeMillis_;
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.a.c
        public com.google.firebase.inappmessaging.i.d ob() {
            com.google.firebase.inappmessaging.i.d dVarEn = this.experimentPayload_;
            if (dVarEn == null) {
                dVarEn = com.google.firebase.inappmessaging.i.d.en();
            }
            return dVarEn;
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.a.c
        public long t4() {
            return this.campaignEndTimeMillis_;
        }
    }

    public interface c extends o2 {
        String A6();

        String G0();

        u R5();

        u g0();

        boolean he();

        long j2();

        com.google.firebase.inappmessaging.i.d ob();

        long t4();
    }

    public static final class d extends l1<d, C1205a> implements e {
        private static final d DEFAULT_INSTANCE;
        public static final int END_TIME_FIELD_NUMBER = 5;
        public static final int EXPERIMENT_ID_FIELD_NUMBER = 1;
        private static volatile f3<d> PARSER = null;
        public static final int PRIORITY_FIELD_NUMBER = 3;
        public static final int SELECTED_VARIANT_INDEX_FIELD_NUMBER = 2;
        public static final int START_TIME_FIELD_NUMBER = 4;
        private int bitField0_;
        private com.google.firebase.inappmessaging.f.c endTime_;
        private String experimentId_ = "";
        private com.google.firebase.inappmessaging.f.n priority_;
        private int selectedVariantIndex_;
        private com.google.firebase.inappmessaging.f.c startTime_;

        /* JADX INFO: renamed from: com.google.internal.firebase.inappmessaging.v1.a$d$a, reason: collision with other inner class name */
        public static final class C1205a extends l1.b<d, C1205a> implements e {
            /* synthetic */ C1205a(C1203a c1203a) {
                this();
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.e
            public String H1() {
                return ((d) this.f126038b).H1();
            }

            public C1205a Ol() {
                El();
                ((d) this.f126038b).om();
                return this;
            }

            public C1205a Pl() {
                El();
                ((d) this.f126038b).pm();
                return this;
            }

            public C1205a Ql() {
                El();
                ((d) this.f126038b).qm();
                return this;
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.e
            public boolean R3() {
                return ((d) this.f126038b).R3();
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.e
            public com.google.firebase.inappmessaging.f.c Rb() {
                return ((d) this.f126038b).Rb();
            }

            public C1205a Rl() {
                El();
                ((d) this.f126038b).rm();
                return this;
            }

            public C1205a Sl() {
                El();
                ((d) this.f126038b).sm();
                return this;
            }

            public C1205a Tl(com.google.firebase.inappmessaging.f.c cVar) {
                El();
                ((d) this.f126038b).um(cVar);
                return this;
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.e
            public boolean Ua() {
                return ((d) this.f126038b).Ua();
            }

            public C1205a Ul(com.google.firebase.inappmessaging.f.n nVar) {
                El();
                ((d) this.f126038b).vm(nVar);
                return this;
            }

            public C1205a Vl(com.google.firebase.inappmessaging.f.c cVar) {
                El();
                ((d) this.f126038b).wm(cVar);
                return this;
            }

            public C1205a Wl(com.google.firebase.inappmessaging.f.c.a aVar) {
                El();
                ((d) this.f126038b).Mm(aVar.build());
                return this;
            }

            public C1205a Xl(com.google.firebase.inappmessaging.f.c cVar) {
                El();
                ((d) this.f126038b).Mm(cVar);
                return this;
            }

            public C1205a Yl(String str) {
                El();
                ((d) this.f126038b).Nm(str);
                return this;
            }

            public C1205a Zl(u uVar) {
                El();
                ((d) this.f126038b).Om(uVar);
                return this;
            }

            public C1205a am(com.google.firebase.inappmessaging.f.n.a aVar) {
                El();
                ((d) this.f126038b).Pm(aVar.build());
                return this;
            }

            public C1205a bm(com.google.firebase.inappmessaging.f.n nVar) {
                El();
                ((d) this.f126038b).Pm(nVar);
                return this;
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.e
            public u c1() {
                return ((d) this.f126038b).c1();
            }

            public C1205a cm(int i10) {
                El();
                ((d) this.f126038b).Qm(i10);
                return this;
            }

            public C1205a dm(com.google.firebase.inappmessaging.f.c.a aVar) {
                El();
                ((d) this.f126038b).Rm(aVar.build());
                return this;
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.e
            public com.google.firebase.inappmessaging.f.n e1() {
                return ((d) this.f126038b).e1();
            }

            public C1205a em(com.google.firebase.inappmessaging.f.c cVar) {
                El();
                ((d) this.f126038b).Rm(cVar);
                return this;
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.e
            public com.google.firebase.inappmessaging.f.c hd() {
                return ((d) this.f126038b).hd();
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.e
            public int je() {
                return ((d) this.f126038b).je();
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.e
            public boolean nj() {
                return ((d) this.f126038b).nj();
            }

            private C1205a() {
                super(d.DEFAULT_INSTANCE);
            }
        }

        static {
            d dVar = new d();
            DEFAULT_INSTANCE = dVar;
            l1.Wl(d.class, dVar);
        }

        private d() {
        }

        public static d Am(InputStream inputStream, v0 v0Var) throws IOException {
            return (d) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static d Bm(u uVar) throws t1 {
            return (d) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static d Cm(u uVar, v0 v0Var) throws t1 {
            return (d) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static d Dm(z zVar) throws IOException {
            return (d) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static d Em(z zVar, v0 v0Var) throws IOException {
            return (d) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static d Fm(InputStream inputStream) throws IOException {
            return (d) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static d Gm(InputStream inputStream, v0 v0Var) throws IOException {
            return (d) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static d Hm(ByteBuffer byteBuffer) throws t1 {
            return (d) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static d Im(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (d) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static d Jm(byte[] bArr) throws t1 {
            return (d) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static d Km(byte[] bArr, v0 v0Var) throws t1 {
            return (d) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<d> Lm() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Mm(com.google.firebase.inappmessaging.f.c cVar) {
            cVar.getClass();
            this.endTime_ = cVar;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Nm(String str) {
            str.getClass();
            this.experimentId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Om(u uVar) {
            com.google.protobuf.a.R(uVar);
            this.experimentId_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Pm(com.google.firebase.inappmessaging.f.n nVar) {
            nVar.getClass();
            this.priority_ = nVar;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Qm(int i10) {
            this.selectedVariantIndex_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Rm(com.google.firebase.inappmessaging.f.c cVar) {
            cVar.getClass();
            this.startTime_ = cVar;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void om() {
            this.endTime_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void pm() {
            this.experimentId_ = tm().H1();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void qm() {
            this.priority_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void rm() {
            this.selectedVariantIndex_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void sm() {
            this.startTime_ = null;
            this.bitField0_ &= -3;
        }

        public static d tm() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void um(com.google.firebase.inappmessaging.f.c cVar) {
            cVar.getClass();
            com.google.firebase.inappmessaging.f.c cVar2 = this.endTime_;
            if (cVar2 == null || cVar2 == com.google.firebase.inappmessaging.f.c.mm()) {
                this.endTime_ = cVar;
            } else {
                this.endTime_ = com.google.firebase.inappmessaging.f.c.qm(this.endTime_).Jl(cVar).B1();
            }
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void vm(com.google.firebase.inappmessaging.f.n nVar) {
            nVar.getClass();
            com.google.firebase.inappmessaging.f.n nVar2 = this.priority_;
            if (nVar2 == null || nVar2 == com.google.firebase.inappmessaging.f.n.dm()) {
                this.priority_ = nVar;
            } else {
                this.priority_ = com.google.firebase.inappmessaging.f.n.fm(this.priority_).Jl(nVar).B1();
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void wm(com.google.firebase.inappmessaging.f.c cVar) {
            cVar.getClass();
            com.google.firebase.inappmessaging.f.c cVar2 = this.startTime_;
            if (cVar2 == null || cVar2 == com.google.firebase.inappmessaging.f.c.mm()) {
                this.startTime_ = cVar;
            } else {
                this.startTime_ = com.google.firebase.inappmessaging.f.c.qm(this.startTime_).Jl(cVar).B1();
            }
            this.bitField0_ |= 2;
        }

        public static C1205a xm() {
            return DEFAULT_INSTANCE.jf();
        }

        public static C1205a ym(d dVar) {
            return DEFAULT_INSTANCE.Uf(dVar);
        }

        public static d zm(InputStream inputStream) throws IOException {
            return (d) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.a.e
        public String H1() {
            return this.experimentId_;
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.a.e
        public boolean R3() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.a.e
        public com.google.firebase.inappmessaging.f.c Rb() {
            com.google.firebase.inappmessaging.f.c cVarMm = this.startTime_;
            if (cVarMm == null) {
                cVarMm = com.google.firebase.inappmessaging.f.c.mm();
            }
            return cVarMm;
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            int i10 = C1203a.f125658a[iVar.ordinal()];
            C1203a c1203a = null;
            switch (i10) {
                case 1:
                    return new d();
                case 2:
                    return new C1205a(c1203a);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဉ\u0002", new Object[]{"bitField0_", "experimentId_", "selectedVariantIndex_", "priority_", "startTime_", "endTime_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f3<d> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (d.class) {
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

        @Override // com.google.internal.firebase.inappmessaging.v1.a.e
        public boolean Ua() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.a.e
        public u c1() {
            return u.C(this.experimentId_);
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.a.e
        public com.google.firebase.inappmessaging.f.n e1() {
            com.google.firebase.inappmessaging.f.n nVarDm = this.priority_;
            if (nVarDm == null) {
                nVarDm = com.google.firebase.inappmessaging.f.n.dm();
            }
            return nVarDm;
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.a.e
        public com.google.firebase.inappmessaging.f.c hd() {
            com.google.firebase.inappmessaging.f.c cVar = this.endTime_;
            return cVar == null ? com.google.firebase.inappmessaging.f.c.mm() : cVar;
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.a.e
        public int je() {
            return this.selectedVariantIndex_;
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.a.e
        public boolean nj() {
            return (this.bitField0_ & 4) != 0;
        }
    }

    public interface e extends o2 {
        String H1();

        boolean R3();

        com.google.firebase.inappmessaging.f.c Rb();

        boolean Ua();

        u c1();

        com.google.firebase.inappmessaging.f.n e1();

        com.google.firebase.inappmessaging.f.c hd();

        int je();

        boolean nj();
    }

    public static final class f extends l1<f, C1206a> implements g {
        public static final int CONTENT_FIELD_NUMBER = 3;
        public static final int DATA_BUNDLE_FIELD_NUMBER = 8;
        private static final f DEFAULT_INSTANCE;
        public static final int EXPERIMENTAL_PAYLOAD_FIELD_NUMBER = 2;
        public static final int IS_TEST_CAMPAIGN_FIELD_NUMBER = 7;
        private static volatile f3<f> PARSER = null;
        public static final int PRIORITY_FIELD_NUMBER = 4;
        public static final int TRIGGERING_CONDITIONS_FIELD_NUMBER = 5;
        public static final int VANILLA_PAYLOAD_FIELD_NUMBER = 1;
        private int bitField0_;
        private x.j content_;
        private boolean isTestCampaign_;
        private Object payload_;
        private com.google.firebase.inappmessaging.f.n priority_;
        private int payloadCase_ = 0;
        private h2<String, String> dataBundle_ = h2.f();
        private s1.k<com.google.firebase.inappmessaging.f.u> triggeringConditions_ = l1.Ij();

        /* JADX INFO: renamed from: com.google.internal.firebase.inappmessaging.v1.a$f$a, reason: collision with other inner class name */
        public static final class C1206a extends l1.b<f, C1206a> implements g {
            /* synthetic */ C1206a(C1203a c1203a) {
                this();
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.g
            public boolean Fh() {
                return ((f) this.f126038b).Fh();
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.g
            public h I8() {
                return ((f) this.f126038b).I8();
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.g
            public c N8() {
                return ((f) this.f126038b).N8();
            }

            public C1206a Ol(Iterable<? extends com.google.firebase.inappmessaging.f.u> iterable) {
                El();
                ((f) this.f126038b).wm(iterable);
                return this;
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.g
            public com.google.firebase.inappmessaging.f.u Pe(int i10) {
                return ((f) this.f126038b).Pe(i10);
            }

            public C1206a Pl(int i10, com.google.firebase.inappmessaging.f.u.a aVar) {
                El();
                ((f) this.f126038b).xm(i10, aVar.build());
                return this;
            }

            public C1206a Ql(int i10, com.google.firebase.inappmessaging.f.u uVar) {
                El();
                ((f) this.f126038b).xm(i10, uVar);
                return this;
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.g
            public boolean R3() {
                return ((f) this.f126038b).R3();
            }

            public C1206a Rl(com.google.firebase.inappmessaging.f.u.a aVar) {
                El();
                ((f) this.f126038b).ym(aVar.build());
                return this;
            }

            public C1206a Sl(com.google.firebase.inappmessaging.f.u uVar) {
                El();
                ((f) this.f126038b).ym(uVar);
                return this;
            }

            public C1206a Tl() {
                El();
                ((f) this.f126038b).zm();
                return this;
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.g
            public boolean Ud() {
                return ((f) this.f126038b).Ud();
            }

            public C1206a Ul() {
                El();
                ((f) this.f126038b).Im().clear();
                return this;
            }

            public C1206a Vl() {
                El();
                ((f) this.f126038b).Am();
                return this;
            }

            public C1206a Wl() {
                El();
                ((f) this.f126038b).Bm();
                return this;
            }

            public C1206a Xl() {
                El();
                ((f) this.f126038b).Cm();
                return this;
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.g
            public int Yd() {
                return ((f) this.f126038b).qd().size();
            }

            public C1206a Yl() {
                El();
                ((f) this.f126038b).Dm();
                return this;
            }

            public C1206a Zl() {
                El();
                ((f) this.f126038b).Em();
                return this;
            }

            public C1206a am() {
                El();
                ((f) this.f126038b).Fm();
                return this;
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.g
            public int bl() {
                return ((f) this.f126038b).bl();
            }

            public C1206a bm(x.j jVar) {
                El();
                ((f) this.f126038b).Nm(jVar);
                return this;
            }

            public C1206a cm(b bVar) {
                El();
                ((f) this.f126038b).Om(bVar);
                return this;
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.g
            @Deprecated
            public Map<String, String> dh() {
                return qd();
            }

            public C1206a dm(com.google.firebase.inappmessaging.f.n nVar) {
                El();
                ((f) this.f126038b).Pm(nVar);
                return this;
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.g
            public com.google.firebase.inappmessaging.f.n e1() {
                return ((f) this.f126038b).e1();
            }

            public C1206a em(h hVar) {
                El();
                ((f) this.f126038b).Qm(hVar);
                return this;
            }

            public C1206a fm(Map<String, String> map) {
                El();
                ((f) this.f126038b).Im().putAll(map);
                return this;
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.g
            public x.j getContent() {
                return ((f) this.f126038b).getContent();
            }

            public C1206a gm(String str, String str2) {
                str.getClass();
                str2.getClass();
                El();
                ((f) this.f126038b).Im().put(str, str2);
                return this;
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.g
            public b hk() {
                return ((f) this.f126038b).hk();
            }

            public C1206a hm(String str) {
                str.getClass();
                El();
                ((f) this.f126038b).Im().remove(str);
                return this;
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.g
            public String ic(String str, String str2) {
                str.getClass();
                Map<String, String> mapQd = ((f) this.f126038b).qd();
                return mapQd.containsKey(str) ? mapQd.get(str) : str2;
            }

            public C1206a im(int i10) {
                El();
                ((f) this.f126038b).gn(i10);
                return this;
            }

            public C1206a jm(x.j.a aVar) {
                El();
                ((f) this.f126038b).hn(aVar.build());
                return this;
            }

            public C1206a km(x.j jVar) {
                El();
                ((f) this.f126038b).hn(jVar);
                return this;
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.g
            public boolean l9() {
                return ((f) this.f126038b).l9();
            }

            public C1206a lm(b.C1204a c1204a) {
                El();
                ((f) this.f126038b).in(c1204a.build());
                return this;
            }

            public C1206a mm(b bVar) {
                El();
                ((f) this.f126038b).in(bVar);
                return this;
            }

            public C1206a nm(boolean z10) {
                El();
                ((f) this.f126038b).jn(z10);
                return this;
            }

            public C1206a om(com.google.firebase.inappmessaging.f.n.a aVar) {
                El();
                ((f) this.f126038b).kn(aVar.build());
                return this;
            }

            public C1206a pm(com.google.firebase.inappmessaging.f.n nVar) {
                El();
                ((f) this.f126038b).kn(nVar);
                return this;
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.g
            public Map<String, String> qd() {
                return Collections.unmodifiableMap(((f) this.f126038b).qd());
            }

            public C1206a qm(int i10, com.google.firebase.inappmessaging.f.u.a aVar) {
                El();
                ((f) this.f126038b).ln(i10, aVar.build());
                return this;
            }

            public C1206a rm(int i10, com.google.firebase.inappmessaging.f.u uVar) {
                El();
                ((f) this.f126038b).ln(i10, uVar);
                return this;
            }

            public C1206a sm(h.C1207a c1207a) {
                El();
                ((f) this.f126038b).mn(c1207a.build());
                return this;
            }

            public C1206a tm(h hVar) {
                El();
                ((f) this.f126038b).mn(hVar);
                return this;
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.g
            public List<com.google.firebase.inappmessaging.f.u> uj() {
                return Collections.unmodifiableList(((f) this.f126038b).uj());
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.g
            public boolean vd(String str) {
                str.getClass();
                return ((f) this.f126038b).qd().containsKey(str);
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.g
            public boolean y7() {
                return ((f) this.f126038b).y7();
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.g
            public String yc(String str) {
                str.getClass();
                Map<String, String> mapQd = ((f) this.f126038b).qd();
                if (mapQd.containsKey(str)) {
                    return mapQd.get(str);
                }
                throw new IllegalArgumentException();
            }

            private C1206a() {
                super(f.DEFAULT_INSTANCE);
            }
        }

        private static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final g2<String, String> f125659a;

            static {
                x4.b bVar = x4.b.f126490k;
                f125659a = g2.f(bVar, "", bVar, "");
            }

            private b() {
            }
        }

        public enum c {
            VANILLA_PAYLOAD(1),
            EXPERIMENTAL_PAYLOAD(2),
            PAYLOAD_NOT_SET(0);


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f125664a;

            c(int i10) {
                this.f125664a = i10;
            }

            public static c l(int i10) {
                if (i10 == 0) {
                    return PAYLOAD_NOT_SET;
                }
                if (i10 == 1) {
                    return VANILLA_PAYLOAD;
                }
                if (i10 != 2) {
                    return null;
                }
                return EXPERIMENTAL_PAYLOAD;
            }

            @Deprecated
            public static c n(int i10) {
                return l(i10);
            }

            public int i() {
                return this.f125664a;
            }
        }

        static {
            f fVar = new f();
            DEFAULT_INSTANCE = fVar;
            l1.Wl(f.class, fVar);
        }

        private f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Am() {
            if (this.payloadCase_ == 2) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Bm() {
            this.isTestCampaign_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Cm() {
            this.payloadCase_ = 0;
            this.payload_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Dm() {
            this.priority_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Em() {
            this.triggeringConditions_ = l1.Ij();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Fm() {
            if (this.payloadCase_ == 1) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
        }

        private void Gm() {
            s1.k<com.google.firebase.inappmessaging.f.u> kVar = this.triggeringConditions_;
            if (kVar.s1()) {
                return;
            }
            this.triggeringConditions_ = l1.yl(kVar);
        }

        public static f Hm() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> Im() {
            return Mm();
        }

        private h2<String, String> Lm() {
            return this.dataBundle_;
        }

        private h2<String, String> Mm() {
            if (!this.dataBundle_.j()) {
                this.dataBundle_ = this.dataBundle_.n();
            }
            return this.dataBundle_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Nm(x.j jVar) {
            jVar.getClass();
            x.j jVar2 = this.content_;
            if (jVar2 == null || jVar2 == x.j.sm()) {
                this.content_ = jVar;
            } else {
                this.content_ = x.j.ym(this.content_).Jl(jVar).B1();
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Om(b bVar) {
            bVar.getClass();
            if (this.payloadCase_ != 2 || this.payload_ == b.sm()) {
                this.payload_ = bVar;
            } else {
                this.payload_ = b.vm((b) this.payload_).Jl(bVar).B1();
            }
            this.payloadCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Pm(com.google.firebase.inappmessaging.f.n nVar) {
            nVar.getClass();
            com.google.firebase.inappmessaging.f.n nVar2 = this.priority_;
            if (nVar2 == null || nVar2 == com.google.firebase.inappmessaging.f.n.dm()) {
                this.priority_ = nVar;
            } else {
                this.priority_ = com.google.firebase.inappmessaging.f.n.fm(this.priority_).Jl(nVar).B1();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Qm(h hVar) {
            hVar.getClass();
            if (this.payloadCase_ != 1 || this.payload_ == h.sm()) {
                this.payload_ = hVar;
            } else {
                this.payload_ = h.um((h) this.payload_).Jl(hVar).B1();
            }
            this.payloadCase_ = 1;
        }

        public static C1206a Rm() {
            return DEFAULT_INSTANCE.jf();
        }

        public static C1206a Sm(f fVar) {
            return DEFAULT_INSTANCE.Uf(fVar);
        }

        public static f Tm(InputStream inputStream) throws IOException {
            return (f) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static f Um(InputStream inputStream, v0 v0Var) throws IOException {
            return (f) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static f Vm(u uVar) throws t1 {
            return (f) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static f Wm(u uVar, v0 v0Var) throws t1 {
            return (f) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static f Xm(z zVar) throws IOException {
            return (f) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static f Ym(z zVar, v0 v0Var) throws IOException {
            return (f) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static f Zm(InputStream inputStream) throws IOException {
            return (f) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static f an(InputStream inputStream, v0 v0Var) throws IOException {
            return (f) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static f bn(ByteBuffer byteBuffer) throws t1 {
            return (f) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static f cn(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (f) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static f dn(byte[] bArr) throws t1 {
            return (f) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static f en(byte[] bArr, v0 v0Var) throws t1 {
            return (f) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<f> fn() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void gn(int i10) {
            Gm();
            this.triggeringConditions_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void hn(x.j jVar) {
            jVar.getClass();
            this.content_ = jVar;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void in(b bVar) {
            bVar.getClass();
            this.payload_ = bVar;
            this.payloadCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void jn(boolean z10) {
            this.isTestCampaign_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void kn(com.google.firebase.inappmessaging.f.n nVar) {
            nVar.getClass();
            this.priority_ = nVar;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ln(int i10, com.google.firebase.inappmessaging.f.u uVar) {
            uVar.getClass();
            Gm();
            this.triggeringConditions_.set(i10, uVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mn(h hVar) {
            hVar.getClass();
            this.payload_ = hVar;
            this.payloadCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void wm(Iterable<? extends com.google.firebase.inappmessaging.f.u> iterable) {
            Gm();
            com.google.protobuf.a.y(iterable, this.triggeringConditions_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void xm(int i10, com.google.firebase.inappmessaging.f.u uVar) {
            uVar.getClass();
            Gm();
            this.triggeringConditions_.add(i10, uVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ym(com.google.firebase.inappmessaging.f.u uVar) {
            uVar.getClass();
            Gm();
            this.triggeringConditions_.add(uVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zm() {
            this.content_ = null;
            this.bitField0_ &= -2;
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.a.g
        public boolean Fh() {
            return this.isTestCampaign_;
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.a.g
        public h I8() {
            return this.payloadCase_ == 1 ? (h) this.payload_ : h.sm();
        }

        public com.google.firebase.inappmessaging.f.v Jm(int i10) {
            return this.triggeringConditions_.get(i10);
        }

        public List<? extends com.google.firebase.inappmessaging.f.v> Km() {
            return this.triggeringConditions_;
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.a.g
        public c N8() {
            return c.l(this.payloadCase_);
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.a.g
        public com.google.firebase.inappmessaging.f.u Pe(int i10) {
            return this.triggeringConditions_.get(i10);
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.a.g
        public boolean R3() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            int i10 = C1203a.f125658a[iVar.ordinal()];
            C1203a c1203a = null;
            switch (i10) {
                case 1:
                    return new f();
                case 2:
                    return new C1206a(c1203a);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\b\u0007\u0001\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003ဉ\u0000\u0004ဉ\u0001\u0005\u001b\u0007\u0007\b2", new Object[]{"payload_", "payloadCase_", "bitField0_", h.class, b.class, "content_", "priority_", "triggeringConditions_", com.google.firebase.inappmessaging.f.u.class, "isTestCampaign_", "dataBundle_", b.f125659a});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f3<f> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (f.class) {
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

        @Override // com.google.internal.firebase.inappmessaging.v1.a.g
        public boolean Ud() {
            if (this.payloadCase_ != 2) {
                return false;
            }
            int i10 = 5 >> 1;
            return true;
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.a.g
        public int Yd() {
            return Lm().size();
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.a.g
        public int bl() {
            return this.triggeringConditions_.size();
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.a.g
        @Deprecated
        public Map<String, String> dh() {
            return qd();
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.a.g
        public com.google.firebase.inappmessaging.f.n e1() {
            com.google.firebase.inappmessaging.f.n nVarDm = this.priority_;
            if (nVarDm == null) {
                nVarDm = com.google.firebase.inappmessaging.f.n.dm();
            }
            return nVarDm;
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.a.g
        public x.j getContent() {
            x.j jVar = this.content_;
            return jVar == null ? x.j.sm() : jVar;
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.a.g
        public b hk() {
            return this.payloadCase_ == 2 ? (b) this.payload_ : b.sm();
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.a.g
        public String ic(String str, String str2) {
            str.getClass();
            h2<String, String> h2VarLm = Lm();
            return h2VarLm.containsKey(str) ? h2VarLm.get(str) : str2;
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.a.g
        public boolean l9() {
            return this.payloadCase_ == 1;
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.a.g
        public Map<String, String> qd() {
            return Collections.unmodifiableMap(Lm());
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.a.g
        public List<com.google.firebase.inappmessaging.f.u> uj() {
            return this.triggeringConditions_;
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.a.g
        public boolean vd(String str) {
            str.getClass();
            return Lm().containsKey(str);
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.a.g
        public boolean y7() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.a.g
        public String yc(String str) {
            str.getClass();
            h2<String, String> h2VarLm = Lm();
            if (h2VarLm.containsKey(str)) {
                return h2VarLm.get(str);
            }
            throw new IllegalArgumentException();
        }
    }

    public interface g extends o2 {
        boolean Fh();

        h I8();

        f.c N8();

        com.google.firebase.inappmessaging.f.u Pe(int i10);

        boolean R3();

        boolean Ud();

        int Yd();

        int bl();

        @Deprecated
        Map<String, String> dh();

        com.google.firebase.inappmessaging.f.n e1();

        x.j getContent();

        b hk();

        String ic(String str, String str2);

        boolean l9();

        Map<String, String> qd();

        List<com.google.firebase.inappmessaging.f.u> uj();

        boolean vd(String str);

        boolean y7();

        String yc(String str);
    }

    public static final class h extends l1<h, C1207a> implements i {
        public static final int CAMPAIGN_END_TIME_MILLIS_FIELD_NUMBER = 4;
        public static final int CAMPAIGN_ID_FIELD_NUMBER = 1;
        public static final int CAMPAIGN_NAME_FIELD_NUMBER = 5;
        public static final int CAMPAIGN_START_TIME_MILLIS_FIELD_NUMBER = 3;
        private static final h DEFAULT_INSTANCE;
        public static final int EXPERIMENTAL_CAMPAIGN_ID_FIELD_NUMBER = 2;
        private static volatile f3<h> PARSER;
        private long campaignEndTimeMillis_;
        private long campaignStartTimeMillis_;
        private String campaignId_ = "";
        private String experimentalCampaignId_ = "";
        private String campaignName_ = "";

        /* JADX INFO: renamed from: com.google.internal.firebase.inappmessaging.v1.a$h$a, reason: collision with other inner class name */
        public static final class C1207a extends l1.b<h, C1207a> implements i {
            /* synthetic */ C1207a(C1203a c1203a) {
                this();
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.i
            public String A6() {
                return ((h) this.f126038b).A6();
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.i
            public String G0() {
                return ((h) this.f126038b).G0();
            }

            public C1207a Ol() {
                El();
                ((h) this.f126038b).nm();
                return this;
            }

            public C1207a Pl() {
                El();
                ((h) this.f126038b).om();
                return this;
            }

            public C1207a Ql() {
                El();
                ((h) this.f126038b).pm();
                return this;
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.i
            public u R5() {
                return ((h) this.f126038b).R5();
            }

            public C1207a Rl() {
                El();
                ((h) this.f126038b).qm();
                return this;
            }

            public C1207a Sl() {
                El();
                ((h) this.f126038b).rm();
                return this;
            }

            public C1207a Tl(long j10) {
                El();
                ((h) this.f126038b).Im(j10);
                return this;
            }

            public C1207a Ul(String str) {
                El();
                ((h) this.f126038b).Jm(str);
                return this;
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.i
            public u Vk() {
                return ((h) this.f126038b).Vk();
            }

            public C1207a Vl(u uVar) {
                El();
                ((h) this.f126038b).Km(uVar);
                return this;
            }

            public C1207a Wl(String str) {
                El();
                ((h) this.f126038b).Lm(str);
                return this;
            }

            public C1207a Xl(u uVar) {
                El();
                ((h) this.f126038b).Mm(uVar);
                return this;
            }

            public C1207a Yl(long j10) {
                El();
                ((h) this.f126038b).Nm(j10);
                return this;
            }

            public C1207a Zl(String str) {
                El();
                ((h) this.f126038b).Om(str);
                return this;
            }

            public C1207a am(u uVar) {
                El();
                ((h) this.f126038b).Pm(uVar);
                return this;
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.i
            public u g0() {
                return ((h) this.f126038b).g0();
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.i
            public String gk() {
                return ((h) this.f126038b).gk();
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.i
            public long j2() {
                return ((h) this.f126038b).j2();
            }

            @Override // com.google.internal.firebase.inappmessaging.v1.a.i
            public long t4() {
                return ((h) this.f126038b).t4();
            }

            private C1207a() {
                super(h.DEFAULT_INSTANCE);
            }
        }

        static {
            h hVar = new h();
            DEFAULT_INSTANCE = hVar;
            l1.Wl(h.class, hVar);
        }

        private h() {
        }

        public static h Am(z zVar, v0 v0Var) throws IOException {
            return (h) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static h Bm(InputStream inputStream) throws IOException {
            return (h) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static h Cm(InputStream inputStream, v0 v0Var) throws IOException {
            return (h) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static h Dm(ByteBuffer byteBuffer) throws t1 {
            return (h) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static h Em(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (h) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static h Fm(byte[] bArr) throws t1 {
            return (h) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static h Gm(byte[] bArr, v0 v0Var) throws t1 {
            return (h) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<h> Hm() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Im(long j10) {
            this.campaignEndTimeMillis_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Jm(String str) {
            str.getClass();
            this.campaignId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Km(u uVar) {
            com.google.protobuf.a.R(uVar);
            this.campaignId_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Lm(String str) {
            str.getClass();
            this.campaignName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Mm(u uVar) {
            com.google.protobuf.a.R(uVar);
            this.campaignName_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Nm(long j10) {
            this.campaignStartTimeMillis_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Om(String str) {
            str.getClass();
            this.experimentalCampaignId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Pm(u uVar) {
            com.google.protobuf.a.R(uVar);
            this.experimentalCampaignId_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void nm() {
            this.campaignEndTimeMillis_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void om() {
            this.campaignId_ = sm().G0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void pm() {
            this.campaignName_ = sm().A6();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void qm() {
            this.campaignStartTimeMillis_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void rm() {
            this.experimentalCampaignId_ = sm().gk();
        }

        public static h sm() {
            return DEFAULT_INSTANCE;
        }

        public static C1207a tm() {
            return DEFAULT_INSTANCE.jf();
        }

        public static C1207a um(h hVar) {
            return DEFAULT_INSTANCE.Uf(hVar);
        }

        public static h vm(InputStream inputStream) throws IOException {
            return (h) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static h wm(InputStream inputStream, v0 v0Var) throws IOException {
            return (h) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static h xm(u uVar) throws t1 {
            return (h) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static h ym(u uVar, v0 v0Var) throws t1 {
            return (h) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static h zm(z zVar) throws IOException {
            return (h) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.a.i
        public String A6() {
            return this.campaignName_;
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.a.i
        public String G0() {
            return this.campaignId_;
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.a.i
        public u R5() {
            return u.C(this.campaignName_);
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            int i10 = C1203a.f125658a[iVar.ordinal()];
            C1203a c1203a = null;
            switch (i10) {
                case 1:
                    return new h();
                case 2:
                    return new C1207a(c1203a);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004\u0002\u0005Ȉ", new Object[]{"campaignId_", "experimentalCampaignId_", "campaignStartTimeMillis_", "campaignEndTimeMillis_", "campaignName_"});
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

        @Override // com.google.internal.firebase.inappmessaging.v1.a.i
        public u Vk() {
            return u.C(this.experimentalCampaignId_);
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.a.i
        public u g0() {
            return u.C(this.campaignId_);
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.a.i
        public String gk() {
            return this.experimentalCampaignId_;
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.a.i
        public long j2() {
            return this.campaignStartTimeMillis_;
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.a.i
        public long t4() {
            return this.campaignEndTimeMillis_;
        }
    }

    public interface i extends o2 {
        String A6();

        String G0();

        u R5();

        u Vk();

        u g0();

        String gk();

        long j2();

        long t4();
    }

    private a() {
    }

    public static void a(v0 v0Var) {
    }
}
