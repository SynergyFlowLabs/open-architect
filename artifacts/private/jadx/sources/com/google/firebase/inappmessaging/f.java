package com.google.firebase.inappmessaging;

import com.google.protobuf.f3;
import com.google.protobuf.l1;
import com.google.protobuf.o2;
import com.google.protobuf.s1;
import com.google.protobuf.t1;
import com.google.protobuf.v0;
import com.google.type.f0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f122497a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f122497a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f122497a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f122497a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f122497a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f122497a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f122497a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f122497a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public enum b implements s1.c {
        UNKNOWN_CAMPAIGN_STATE(0),
        DRAFT(1),
        PUBLISHED(2),
        STOPPED(3),
        DELETED(4),
        UNRECOGNIZED(-1);


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f122504h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f122505i = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f122506j = 2;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f122507k = 3;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f122508l = 4;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final s1.d<b> f122509m = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f122511a;

        class a implements s1.d<b> {
            a() {
            }

            @Override // com.google.protobuf.s1.d
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(int i10) {
                return b.l(i10);
            }
        }

        /* JADX INFO: renamed from: com.google.firebase.inappmessaging.f$b$b, reason: collision with other inner class name */
        private static final class C1158b implements s1.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final s1.e f122512a = new C1158b();

            private C1158b() {
            }

            @Override // com.google.protobuf.s1.e
            public boolean a(int i10) {
                return b.l(i10) != null;
            }
        }

        b(int i10) {
            this.f122511a = i10;
        }

        public static b l(int i10) {
            if (i10 == 0) {
                return UNKNOWN_CAMPAIGN_STATE;
            }
            if (i10 == 1) {
                return DRAFT;
            }
            if (i10 == 2) {
                return PUBLISHED;
            }
            if (i10 == 3) {
                return STOPPED;
            }
            if (i10 != 4) {
                return null;
            }
            return DELETED;
        }

        public static s1.d<b> n() {
            return f122509m;
        }

        public static s1.e o() {
            return C1158b.f122512a;
        }

        @Deprecated
        public static b p(int i10) {
            return l(i10);
        }

        @Override // com.google.protobuf.s1.c
        public final int i() {
            if (this != UNRECOGNIZED) {
                return this.f122511a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static final class c extends l1<c, a> implements d {
        public static final int DATE_FIELD_NUMBER = 1;
        private static final c DEFAULT_INSTANCE;
        private static volatile f3<c> PARSER = null;
        public static final int TIME_FIELD_NUMBER = 2;
        public static final int TIME_ZONE_FIELD_NUMBER = 3;
        private int bitField0_;
        private com.google.type.f date_;
        private String timeZone_ = "";
        private f0 time_;

        public static final class a extends l1.b<c, a> implements d {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // com.google.firebase.inappmessaging.f.d
            public com.google.type.f Mh() {
                return ((c) this.f126038b).Mh();
            }

            public a Ol() {
                El();
                ((c) this.f126038b).jm();
                return this;
            }

            public a Pl() {
                El();
                ((c) this.f126038b).km();
                return this;
            }

            @Override // com.google.firebase.inappmessaging.f.d
            public com.google.protobuf.u Q4() {
                return ((c) this.f126038b).Q4();
            }

            public a Ql() {
                El();
                ((c) this.f126038b).lm();
                return this;
            }

            public a Rl(com.google.type.f fVar) {
                El();
                ((c) this.f126038b).nm(fVar);
                return this;
            }

            public a Sl(f0 f0Var) {
                El();
                ((c) this.f126038b).om(f0Var);
                return this;
            }

            public a Tl(com.google.type.f.b bVar) {
                El();
                ((c) this.f126038b).Em(bVar.build());
                return this;
            }

            @Override // com.google.firebase.inappmessaging.f.d
            public String U() {
                return ((c) this.f126038b).U();
            }

            @Override // com.google.firebase.inappmessaging.f.d
            public boolean U0() {
                return ((c) this.f126038b).U0();
            }

            public a Ul(com.google.type.f fVar) {
                El();
                ((c) this.f126038b).Em(fVar);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.f.d
            public f0 V() {
                return ((c) this.f126038b).V();
            }

            public a Vl(f0.b bVar) {
                El();
                ((c) this.f126038b).Fm(bVar.build());
                return this;
            }

            public a Wl(f0 f0Var) {
                El();
                ((c) this.f126038b).Fm(f0Var);
                return this;
            }

            public a Xl(String str) {
                El();
                ((c) this.f126038b).Gm(str);
                return this;
            }

            public a Yl(com.google.protobuf.u uVar) {
                El();
                ((c) this.f126038b).Hm(uVar);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.f.d
            public boolean bb() {
                return ((c) this.f126038b).bb();
            }

            private a() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            l1.Wl(c.class, cVar);
        }

        private c() {
        }

        public static c Am(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (c) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static c Bm(byte[] bArr) throws t1 {
            return (c) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static c Cm(byte[] bArr, v0 v0Var) throws t1 {
            return (c) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<c> Dm() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Em(com.google.type.f fVar) {
            fVar.getClass();
            this.date_ = fVar;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Fm(f0 f0Var) {
            f0Var.getClass();
            this.time_ = f0Var;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Gm(String str) {
            str.getClass();
            this.timeZone_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Hm(com.google.protobuf.u uVar) {
            com.google.protobuf.a.R(uVar);
            this.timeZone_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void jm() {
            this.date_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void km() {
            this.time_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lm() {
            this.timeZone_ = mm().U();
        }

        public static c mm() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void nm(com.google.type.f fVar) {
            fVar.getClass();
            com.google.type.f fVar2 = this.date_;
            if (fVar2 == null || fVar2 == com.google.type.f.jm()) {
                this.date_ = fVar;
            } else {
                this.date_ = com.google.type.f.lm(this.date_).Jl(fVar).B1();
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void om(f0 f0Var) {
            f0Var.getClass();
            f0 f0Var2 = this.time_;
            if (f0Var2 == null || f0Var2 == f0.mm()) {
                this.time_ = f0Var;
            } else {
                this.time_ = f0.om(this.time_).Jl(f0Var).B1();
            }
            this.bitField0_ |= 2;
        }

        public static a pm() {
            return DEFAULT_INSTANCE.jf();
        }

        public static a qm(c cVar) {
            return DEFAULT_INSTANCE.Uf(cVar);
        }

        public static c rm(InputStream inputStream) throws IOException {
            return (c) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static c sm(InputStream inputStream, v0 v0Var) throws IOException {
            return (c) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static c tm(com.google.protobuf.u uVar) throws t1 {
            return (c) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static c um(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (c) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static c vm(com.google.protobuf.z zVar) throws IOException {
            return (c) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static c wm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (c) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static c xm(InputStream inputStream) throws IOException {
            return (c) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static c ym(InputStream inputStream, v0 v0Var) throws IOException {
            return (c) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static c zm(ByteBuffer byteBuffer) throws t1 {
            return (c) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        @Override // com.google.firebase.inappmessaging.f.d
        public com.google.type.f Mh() {
            com.google.type.f fVarJm = this.date_;
            if (fVarJm == null) {
                fVarJm = com.google.type.f.jm();
            }
            return fVarJm;
        }

        @Override // com.google.firebase.inappmessaging.f.d
        public com.google.protobuf.u Q4() {
            return com.google.protobuf.u.C(this.timeZone_);
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            int i10 = a.f122497a[iVar.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new c();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ", new Object[]{"bitField0_", "date_", "time_", "timeZone_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f3<c> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (c.class) {
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

        @Override // com.google.firebase.inappmessaging.f.d
        public String U() {
            return this.timeZone_;
        }

        @Override // com.google.firebase.inappmessaging.f.d
        public boolean U0() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.firebase.inappmessaging.f.d
        public f0 V() {
            f0 f0Var = this.time_;
            return f0Var == null ? f0.mm() : f0Var;
        }

        @Override // com.google.firebase.inappmessaging.f.d
        public boolean bb() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    public interface d extends o2 {
        com.google.type.f Mh();

        com.google.protobuf.u Q4();

        String U();

        boolean U0();

        f0 V();

        boolean bb();
    }

    public static final class e extends l1<e, a> implements InterfaceC1159f {
        public static final int CLICKS_FIELD_NUMBER = 3;
        private static final e DEFAULT_INSTANCE;
        public static final int ERRORS_FIELD_NUMBER = 4;
        public static final int IMPRESSIONS_FIELD_NUMBER = 2;
        private static volatile f3<e> PARSER = null;
        public static final int START_OF_DAY_MILLIS_FIELD_NUMBER = 1;
        private int clicks_;
        private int errors_;
        private int impressions_;
        private long startOfDayMillis_;

        public static final class a extends l1.b<e, a> implements InterfaceC1159f {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a Ol() {
                El();
                ((e) this.f126038b).im();
                return this;
            }

            public a Pl() {
                El();
                ((e) this.f126038b).jm();
                return this;
            }

            public a Ql() {
                El();
                ((e) this.f126038b).km();
                return this;
            }

            public a Rl() {
                El();
                ((e) this.f126038b).lm();
                return this;
            }

            public a Sl(int i10) {
                El();
                ((e) this.f126038b).Cm(i10);
                return this;
            }

            public a Tl(int i10) {
                El();
                ((e) this.f126038b).Dm(i10);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.f.InterfaceC1159f
            public int Uk() {
                return ((e) this.f126038b).Uk();
            }

            public a Ul(int i10) {
                El();
                ((e) this.f126038b).Em(i10);
                return this;
            }

            public a Vl(long j10) {
                El();
                ((e) this.f126038b).Fm(j10);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.f.InterfaceC1159f
            public int Zd() {
                return ((e) this.f126038b).Zd();
            }

            @Override // com.google.firebase.inappmessaging.f.InterfaceC1159f
            public long c2() {
                return ((e) this.f126038b).c2();
            }

            @Override // com.google.firebase.inappmessaging.f.InterfaceC1159f
            public int fb() {
                return ((e) this.f126038b).fb();
            }

            private a() {
                super(e.DEFAULT_INSTANCE);
            }
        }

        static {
            e eVar = new e();
            DEFAULT_INSTANCE = eVar;
            l1.Wl(e.class, eVar);
        }

        private e() {
        }

        public static e Am(byte[] bArr, v0 v0Var) throws t1 {
            return (e) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<e> Bm() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Cm(int i10) {
            this.clicks_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Dm(int i10) {
            this.errors_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Em(int i10) {
            this.impressions_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Fm(long j10) {
            this.startOfDayMillis_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void im() {
            this.clicks_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void jm() {
            this.errors_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void km() {
            this.impressions_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lm() {
            this.startOfDayMillis_ = 0L;
        }

        public static e mm() {
            return DEFAULT_INSTANCE;
        }

        public static a nm() {
            return DEFAULT_INSTANCE.jf();
        }

        public static a om(e eVar) {
            return DEFAULT_INSTANCE.Uf(eVar);
        }

        public static e pm(InputStream inputStream) throws IOException {
            return (e) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static e qm(InputStream inputStream, v0 v0Var) throws IOException {
            return (e) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static e rm(com.google.protobuf.u uVar) throws t1 {
            return (e) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static e sm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (e) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static e tm(com.google.protobuf.z zVar) throws IOException {
            return (e) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static e um(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (e) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static e vm(InputStream inputStream) throws IOException {
            return (e) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static e wm(InputStream inputStream, v0 v0Var) throws IOException {
            return (e) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static e xm(ByteBuffer byteBuffer) throws t1 {
            return (e) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static e ym(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (e) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static e zm(byte[] bArr) throws t1 {
            return (e) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            int i10 = a.f122497a[iVar.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new e();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002\u0004\u0003\u0004\u0004\u0004", new Object[]{"startOfDayMillis_", "impressions_", "clicks_", "errors_"});
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
                        } finally {
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

        @Override // com.google.firebase.inappmessaging.f.InterfaceC1159f
        public int Uk() {
            return this.errors_;
        }

        @Override // com.google.firebase.inappmessaging.f.InterfaceC1159f
        public int Zd() {
            return this.clicks_;
        }

        @Override // com.google.firebase.inappmessaging.f.InterfaceC1159f
        public long c2() {
            return this.startOfDayMillis_;
        }

        @Override // com.google.firebase.inappmessaging.f.InterfaceC1159f
        public int fb() {
            return this.impressions_;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.inappmessaging.f$f, reason: collision with other inner class name */
    public interface InterfaceC1159f extends o2 {
        int Uk();

        int Zd();

        long c2();

        int fb();
    }

    public static final class g extends l1<g, a> implements h {
        public static final int CONVERSIONS_FIELD_NUMBER = 2;
        private static final g DEFAULT_INSTANCE;
        private static volatile f3<g> PARSER = null;
        public static final int START_OF_DAY_MILLIS_FIELD_NUMBER = 1;
        private int conversions_;
        private long startOfDayMillis_;

        public static final class a extends l1.b<g, a> implements h {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a Ol() {
                El();
                ((g) this.f126038b).em();
                return this;
            }

            public a Pl() {
                El();
                ((g) this.f126038b).fm();
                return this;
            }

            public a Ql(int i10) {
                El();
                ((g) this.f126038b).wm(i10);
                return this;
            }

            public a Rl(long j10) {
                El();
                ((g) this.f126038b).xm(j10);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.f.h
            public long c2() {
                return ((g) this.f126038b).c2();
            }

            @Override // com.google.firebase.inappmessaging.f.h
            public int f8() {
                return ((g) this.f126038b).f8();
            }

            private a() {
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
        public void em() {
            this.conversions_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fm() {
            this.startOfDayMillis_ = 0L;
        }

        public static g gm() {
            return DEFAULT_INSTANCE;
        }

        public static a hm() {
            return DEFAULT_INSTANCE.jf();
        }

        public static a im(g gVar) {
            return DEFAULT_INSTANCE.Uf(gVar);
        }

        public static g jm(InputStream inputStream) throws IOException {
            return (g) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static g km(InputStream inputStream, v0 v0Var) throws IOException {
            return (g) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static g lm(com.google.protobuf.u uVar) throws t1 {
            return (g) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static g mm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (g) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static g nm(com.google.protobuf.z zVar) throws IOException {
            return (g) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static g om(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (g) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static g pm(InputStream inputStream) throws IOException {
            return (g) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static g qm(InputStream inputStream, v0 v0Var) throws IOException {
            return (g) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static g rm(ByteBuffer byteBuffer) throws t1 {
            return (g) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static g sm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (g) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static g tm(byte[] bArr) throws t1 {
            return (g) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static g um(byte[] bArr, v0 v0Var) throws t1 {
            return (g) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<g> vm() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void wm(int i10) {
            this.conversions_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void xm(long j10) {
            this.startOfDayMillis_ = j10;
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            int i10 = a.f122497a[iVar.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new g();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"startOfDayMillis_", "conversions_"});
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

        @Override // com.google.firebase.inappmessaging.f.h
        public long c2() {
            return this.startOfDayMillis_;
        }

        @Override // com.google.firebase.inappmessaging.f.h
        public int f8() {
            return this.conversions_;
        }
    }

    public interface h extends o2 {
        long c2();

        int f8();
    }

    public static final class i extends l1<i, a> implements j {
        public static final int COUNT_FIELD_NUMBER = 5;
        private static final i DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile f3<i> PARSER = null;
        public static final int PREVIOUS_TIMESTAMP_MILLIS_FIELD_NUMBER = 4;
        public static final int TIMESTAMP_MILLIS_FIELD_NUMBER = 3;
        public static final int TRIGGER_PARAMS_FIELD_NUMBER = 1;
        private int count_;
        private long previousTimestampMillis_;
        private long timestampMillis_;
        private s1.k<s> triggerParams_ = l1.Ij();
        private String name_ = "";

        public static final class a extends l1.b<i, a> implements j {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // com.google.firebase.inappmessaging.f.j
            public List<s> Ek() {
                return Collections.unmodifiableList(((i) this.f126038b).Ek());
            }

            @Override // com.google.firebase.inappmessaging.f.j
            public s Hk(int i10) {
                return ((i) this.f126038b).Hk(i10);
            }

            @Override // com.google.firebase.inappmessaging.f.j
            public int Mf() {
                return ((i) this.f126038b).Mf();
            }

            public a Ol(Iterable<? extends s> iterable) {
                El();
                ((i) this.f126038b).pm(iterable);
                return this;
            }

            public a Pl(int i10, s.a aVar) {
                El();
                ((i) this.f126038b).qm(i10, aVar.build());
                return this;
            }

            public a Ql(int i10, s sVar) {
                El();
                ((i) this.f126038b).qm(i10, sVar);
                return this;
            }

            public a Rl(s.a aVar) {
                El();
                ((i) this.f126038b).rm(aVar.build());
                return this;
            }

            public a Sl(s sVar) {
                El();
                ((i) this.f126038b).rm(sVar);
                return this;
            }

            public a Tl() {
                El();
                ((i) this.f126038b).sm();
                return this;
            }

            public a Ul() {
                El();
                ((i) this.f126038b).tm();
                return this;
            }

            public a Vl() {
                El();
                ((i) this.f126038b).um();
                return this;
            }

            public a Wl() {
                El();
                ((i) this.f126038b).vm();
                return this;
            }

            @Override // com.google.firebase.inappmessaging.f.j
            public long Xb() {
                return ((i) this.f126038b).Xb();
            }

            public a Xl() {
                El();
                ((i) this.f126038b).wm();
                return this;
            }

            public a Yl(int i10) {
                El();
                ((i) this.f126038b).Qm(i10);
                return this;
            }

            public a Zl(int i10) {
                El();
                ((i) this.f126038b).Rm(i10);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.f.j
            public com.google.protobuf.u a() {
                return ((i) this.f126038b).a();
            }

            public a am(String str) {
                El();
                ((i) this.f126038b).Sm(str);
                return this;
            }

            public a bm(com.google.protobuf.u uVar) {
                El();
                ((i) this.f126038b).Tm(uVar);
                return this;
            }

            public a cm(long j10) {
                El();
                ((i) this.f126038b).Um(j10);
                return this;
            }

            public a dm(long j10) {
                El();
                ((i) this.f126038b).Vm(j10);
                return this;
            }

            public a em(int i10, s.a aVar) {
                El();
                ((i) this.f126038b).Wm(i10, aVar.build());
                return this;
            }

            public a fm(int i10, s sVar) {
                El();
                ((i) this.f126038b).Wm(i10, sVar);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.f.j
            public int getCount() {
                return ((i) this.f126038b).getCount();
            }

            @Override // com.google.firebase.inappmessaging.f.j
            public String getName() {
                return ((i) this.f126038b).getName();
            }

            @Override // com.google.firebase.inappmessaging.f.j
            public long sj() {
                return ((i) this.f126038b).sj();
            }

            private a() {
                super(i.DEFAULT_INSTANCE);
            }
        }

        static {
            i iVar = new i();
            DEFAULT_INSTANCE = iVar;
            l1.Wl(i.class, iVar);
        }

        private i() {
        }

        public static a Bm() {
            return DEFAULT_INSTANCE.jf();
        }

        public static a Cm(i iVar) {
            return DEFAULT_INSTANCE.Uf(iVar);
        }

        public static i Dm(InputStream inputStream) throws IOException {
            return (i) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static i Em(InputStream inputStream, v0 v0Var) throws IOException {
            return (i) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static i Fm(com.google.protobuf.u uVar) throws t1 {
            return (i) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static i Gm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (i) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static i Hm(com.google.protobuf.z zVar) throws IOException {
            return (i) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static i Im(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (i) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static i Jm(InputStream inputStream) throws IOException {
            return (i) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static i Km(InputStream inputStream, v0 v0Var) throws IOException {
            return (i) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static i Lm(ByteBuffer byteBuffer) throws t1 {
            return (i) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static i Mm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (i) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static i Nm(byte[] bArr) throws t1 {
            return (i) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static i Om(byte[] bArr, v0 v0Var) throws t1 {
            return (i) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<i> Pm() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Qm(int i10) {
            xm();
            this.triggerParams_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Rm(int i10) {
            this.count_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Sm(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Tm(com.google.protobuf.u uVar) {
            com.google.protobuf.a.R(uVar);
            this.name_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Um(long j10) {
            this.previousTimestampMillis_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Vm(long j10) {
            this.timestampMillis_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Wm(int i10, s sVar) {
            sVar.getClass();
            xm();
            this.triggerParams_.set(i10, sVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void pm(Iterable<? extends s> iterable) {
            xm();
            com.google.protobuf.a.y(iterable, this.triggerParams_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void qm(int i10, s sVar) {
            sVar.getClass();
            xm();
            this.triggerParams_.add(i10, sVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void rm(s sVar) {
            sVar.getClass();
            xm();
            this.triggerParams_.add(sVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void sm() {
            this.count_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void tm() {
            this.name_ = ym().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void um() {
            this.previousTimestampMillis_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void vm() {
            this.timestampMillis_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void wm() {
            this.triggerParams_ = l1.Ij();
        }

        private void xm() {
            s1.k<s> kVar = this.triggerParams_;
            if (kVar.s1()) {
                return;
            }
            this.triggerParams_ = l1.yl(kVar);
        }

        public static i ym() {
            return DEFAULT_INSTANCE;
        }

        public List<? extends t> Am() {
            return this.triggerParams_;
        }

        @Override // com.google.firebase.inappmessaging.f.j
        public List<s> Ek() {
            return this.triggerParams_;
        }

        @Override // com.google.firebase.inappmessaging.f.j
        public s Hk(int i10) {
            return this.triggerParams_.get(i10);
        }

        @Override // com.google.firebase.inappmessaging.f.j
        public int Mf() {
            return this.triggerParams_.size();
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            int i10 = a.f122497a[iVar.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new i();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003\u0002\u0004\u0002\u0005\u0004", new Object[]{"triggerParams_", s.class, "name_", "timestampMillis_", "previousTimestampMillis_", "count_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f3<i> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (i.class) {
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

        @Override // com.google.firebase.inappmessaging.f.j
        public long Xb() {
            return this.timestampMillis_;
        }

        @Override // com.google.firebase.inappmessaging.f.j
        public com.google.protobuf.u a() {
            return com.google.protobuf.u.C(this.name_);
        }

        @Override // com.google.firebase.inappmessaging.f.j
        public int getCount() {
            return this.count_;
        }

        @Override // com.google.firebase.inappmessaging.f.j
        public String getName() {
            return this.name_;
        }

        @Override // com.google.firebase.inappmessaging.f.j
        public long sj() {
            return this.previousTimestampMillis_;
        }

        public t zm(int i10) {
            return this.triggerParams_.get(i10);
        }
    }

    public interface j extends o2 {
        List<s> Ek();

        s Hk(int i10);

        int Mf();

        long Xb();

        com.google.protobuf.u a();

        int getCount();

        String getName();

        long sj();
    }

    public static final class k extends l1<k, a> implements l {
        public static final int CONTENT_FIELD_NUMBER = 2;
        private static final k DEFAULT_INSTANCE;
        public static final int INDEX_FIELD_NUMBER = 1;
        private static volatile f3<k> PARSER;
        private int bitField0_;
        private x.j content_;
        private int index_;

        public static final class a extends l1.b<k, a> implements l {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a Ol() {
                El();
                ((k) this.f126038b).fm();
                return this;
            }

            public a Pl() {
                El();
                ((k) this.f126038b).gm();
                return this;
            }

            public a Ql(x.j jVar) {
                El();
                ((k) this.f126038b).im(jVar);
                return this;
            }

            public a Rl(x.j.a aVar) {
                El();
                ((k) this.f126038b).ym(aVar.build());
                return this;
            }

            public a Sl(x.j jVar) {
                El();
                ((k) this.f126038b).ym(jVar);
                return this;
            }

            public a Tl(int i10) {
                El();
                ((k) this.f126038b).zm(i10);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.f.l
            public x.j getContent() {
                return ((k) this.f126038b).getContent();
            }

            @Override // com.google.firebase.inappmessaging.f.l
            public int getIndex() {
                return ((k) this.f126038b).getIndex();
            }

            @Override // com.google.firebase.inappmessaging.f.l
            public boolean y7() {
                return ((k) this.f126038b).y7();
            }

            private a() {
                super(k.DEFAULT_INSTANCE);
            }
        }

        static {
            k kVar = new k();
            DEFAULT_INSTANCE = kVar;
            l1.Wl(k.class, kVar);
        }

        private k() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fm() {
            this.content_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void gm() {
            this.index_ = 0;
        }

        public static k hm() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void im(x.j jVar) {
            jVar.getClass();
            x.j jVar2 = this.content_;
            if (jVar2 == null || jVar2 == x.j.sm()) {
                this.content_ = jVar;
            } else {
                this.content_ = x.j.ym(this.content_).Jl(jVar).B1();
            }
            this.bitField0_ |= 1;
        }

        public static a jm() {
            return DEFAULT_INSTANCE.jf();
        }

        public static a km(k kVar) {
            return DEFAULT_INSTANCE.Uf(kVar);
        }

        public static k lm(InputStream inputStream) throws IOException {
            return (k) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static k mm(InputStream inputStream, v0 v0Var) throws IOException {
            return (k) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static k nm(com.google.protobuf.u uVar) throws t1 {
            return (k) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static k om(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (k) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static k pm(com.google.protobuf.z zVar) throws IOException {
            return (k) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static k qm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (k) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static k rm(InputStream inputStream) throws IOException {
            return (k) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static k sm(InputStream inputStream, v0 v0Var) throws IOException {
            return (k) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static k tm(ByteBuffer byteBuffer) throws t1 {
            return (k) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static k um(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (k) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static k vm(byte[] bArr) throws t1 {
            return (k) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static k wm(byte[] bArr, v0 v0Var) throws t1 {
            return (k) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<k> xm() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ym(x.j jVar) {
            jVar.getClass();
            this.content_ = jVar;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zm(int i10) {
            this.index_ = i10;
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            int i10 = a.f122497a[iVar.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new k();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002ဉ\u0000", new Object[]{"bitField0_", androidx.room.util.g.f.f75121f, "content_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f3<k> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (k.class) {
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

        @Override // com.google.firebase.inappmessaging.f.l
        public x.j getContent() {
            x.j jVarSm = this.content_;
            if (jVarSm == null) {
                jVarSm = x.j.sm();
            }
            return jVarSm;
        }

        @Override // com.google.firebase.inappmessaging.f.l
        public int getIndex() {
            return this.index_;
        }

        @Override // com.google.firebase.inappmessaging.f.l
        public boolean y7() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    public interface l extends o2 {
        x.j getContent();

        int getIndex();

        boolean y7();
    }

    public enum m implements s1.c {
        UNKNOWN_EXPERIMENTAL_CAMPAIGN_STATE(0),
        EXPERIMENT_DRAFT(1),
        EXPERIMENT_RUNNING(2),
        EXPERIMENT_STOPPED(3),
        EXPERIMENT_ROLLED_OUT(4),
        UNRECOGNIZED(-1);


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f122519h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f122520i = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f122521j = 2;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f122522k = 3;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f122523l = 4;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final s1.d<m> f122524m = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f122526a;

        class a implements s1.d<m> {
            a() {
            }

            @Override // com.google.protobuf.s1.d
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public m a(int i10) {
                return m.l(i10);
            }
        }

        private static final class b implements s1.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final s1.e f122527a = new b();

            private b() {
            }

            @Override // com.google.protobuf.s1.e
            public boolean a(int i10) {
                return m.l(i10) != null;
            }
        }

        static {
            int i10 = 4 ^ 0;
        }

        m(int i10) {
            this.f122526a = i10;
        }

        public static m l(int i10) {
            if (i10 == 0) {
                return UNKNOWN_EXPERIMENTAL_CAMPAIGN_STATE;
            }
            if (i10 == 1) {
                return EXPERIMENT_DRAFT;
            }
            if (i10 == 2) {
                return EXPERIMENT_RUNNING;
            }
            if (i10 == 3) {
                return EXPERIMENT_STOPPED;
            }
            if (i10 != 4) {
                return null;
            }
            return EXPERIMENT_ROLLED_OUT;
        }

        public static s1.d<m> n() {
            return f122524m;
        }

        public static s1.e o() {
            return b.f122527a;
        }

        @Deprecated
        public static m p(int i10) {
            return l(i10);
        }

        @Override // com.google.protobuf.s1.c
        public final int i() {
            if (this != UNRECOGNIZED) {
                return this.f122526a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static final class n extends l1<n, a> implements o {
        private static final n DEFAULT_INSTANCE;
        private static volatile f3<n> PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 1;
        private int value_;

        public static final class a extends l1.b<n, a> implements o {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a Ol() {
                El();
                ((n) this.f126038b).cm();
                return this;
            }

            public a Pl(int i10) {
                El();
                ((n) this.f126038b).tm(i10);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.f.o
            public int getValue() {
                return ((n) this.f126038b).getValue();
            }

            private a() {
                super(n.DEFAULT_INSTANCE);
            }
        }

        static {
            n nVar = new n();
            DEFAULT_INSTANCE = nVar;
            l1.Wl(n.class, nVar);
        }

        private n() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void cm() {
            this.value_ = 0;
        }

        public static n dm() {
            return DEFAULT_INSTANCE;
        }

        public static a em() {
            return DEFAULT_INSTANCE.jf();
        }

        public static a fm(n nVar) {
            return DEFAULT_INSTANCE.Uf(nVar);
        }

        public static n gm(InputStream inputStream) throws IOException {
            return (n) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static n hm(InputStream inputStream, v0 v0Var) throws IOException {
            return (n) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static n im(com.google.protobuf.u uVar) throws t1 {
            return (n) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static n jm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (n) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static n km(com.google.protobuf.z zVar) throws IOException {
            return (n) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static n lm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (n) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static n mm(InputStream inputStream) throws IOException {
            return (n) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static n nm(InputStream inputStream, v0 v0Var) throws IOException {
            return (n) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static n om(ByteBuffer byteBuffer) throws t1 {
            return (n) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static n pm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (n) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static n qm(byte[] bArr) throws t1 {
            return (n) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static n rm(byte[] bArr, v0 v0Var) throws t1 {
            return (n) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<n> sm() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void tm(int i10) {
            this.value_ = i10;
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            int i10 = a.f122497a[iVar.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new n();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"value_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f3<n> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (n.class) {
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

        @Override // com.google.firebase.inappmessaging.f.o
        public int getValue() {
            return this.value_;
        }
    }

    public interface o extends o2 {
        int getValue();
    }

    public static final class p extends l1<p, a> implements q {
        private static final p DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile f3<p> PARSER;
        private String name_ = "";

        public static final class a extends l1.b<p, a> implements q {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a Ol() {
                El();
                ((p) this.f126038b).dm();
                return this;
            }

            public a Pl(String str) {
                El();
                ((p) this.f126038b).um(str);
                return this;
            }

            public a Ql(com.google.protobuf.u uVar) {
                El();
                ((p) this.f126038b).vm(uVar);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.f.q
            public com.google.protobuf.u a() {
                return ((p) this.f126038b).a();
            }

            @Override // com.google.firebase.inappmessaging.f.q
            public String getName() {
                return ((p) this.f126038b).getName();
            }

            private a() {
                super(p.DEFAULT_INSTANCE);
            }
        }

        static {
            p pVar = new p();
            DEFAULT_INSTANCE = pVar;
            l1.Wl(p.class, pVar);
        }

        private p() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void dm() {
            this.name_ = em().getName();
        }

        public static p em() {
            return DEFAULT_INSTANCE;
        }

        public static a fm() {
            return DEFAULT_INSTANCE.jf();
        }

        public static a gm(p pVar) {
            return DEFAULT_INSTANCE.Uf(pVar);
        }

        public static p hm(InputStream inputStream) throws IOException {
            return (p) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static p im(InputStream inputStream, v0 v0Var) throws IOException {
            return (p) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static p jm(com.google.protobuf.u uVar) throws t1 {
            return (p) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static p km(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (p) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static p lm(com.google.protobuf.z zVar) throws IOException {
            return (p) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static p mm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (p) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static p nm(InputStream inputStream) throws IOException {
            return (p) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static p om(InputStream inputStream, v0 v0Var) throws IOException {
            return (p) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static p pm(ByteBuffer byteBuffer) throws t1 {
            return (p) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static p qm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (p) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static p rm(byte[] bArr) throws t1 {
            return (p) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static p sm(byte[] bArr, v0 v0Var) throws t1 {
            return (p) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<p> tm() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void um(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void vm(com.google.protobuf.u uVar) {
            com.google.protobuf.a.R(uVar);
            this.name_ = uVar.z0();
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            int i10 = a.f122497a[iVar.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new p();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"name_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f3<p> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (p.class) {
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

        @Override // com.google.firebase.inappmessaging.f.q
        public com.google.protobuf.u a() {
            return com.google.protobuf.u.C(this.name_);
        }

        @Override // com.google.firebase.inappmessaging.f.q
        public String getName() {
            return this.name_;
        }
    }

    public interface q extends o2 {
        com.google.protobuf.u a();

        String getName();
    }

    public enum r implements s1.c {
        UNKNOWN_TRIGGER(0),
        APP_LAUNCH(1),
        ON_FOREGROUND(2),
        UNRECOGNIZED(-1);


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f122532f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f122533g = 1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f122534h = 2;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final s1.d<r> f122535i = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f122537a;

        class a implements s1.d<r> {
            a() {
            }

            @Override // com.google.protobuf.s1.d
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public r a(int i10) {
                return r.l(i10);
            }
        }

        private static final class b implements s1.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final s1.e f122538a = new b();

            private b() {
            }

            @Override // com.google.protobuf.s1.e
            public boolean a(int i10) {
                return r.l(i10) != null;
            }
        }

        r(int i10) {
            this.f122537a = i10;
        }

        public static r l(int i10) {
            if (i10 == 0) {
                return UNKNOWN_TRIGGER;
            }
            if (i10 == 1) {
                return APP_LAUNCH;
            }
            if (i10 != 2) {
                return null;
            }
            return ON_FOREGROUND;
        }

        public static s1.d<r> n() {
            return f122535i;
        }

        public static s1.e o() {
            return b.f122538a;
        }

        @Deprecated
        public static r p(int i10) {
            return l(i10);
        }

        @Override // com.google.protobuf.s1.c
        public final int i() {
            if (this != UNRECOGNIZED) {
                return this.f122537a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static final class s extends l1<s, a> implements t {
        private static final s DEFAULT_INSTANCE;
        public static final int DOUBLE_VALUE_FIELD_NUMBER = 5;
        public static final int FLOAT_VALUE_FIELD_NUMBER = 4;
        public static final int INT_VALUE_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile f3<s> PARSER = null;
        public static final int STRING_VALUE_FIELD_NUMBER = 2;
        private double doubleValue_;
        private float floatValue_;
        private long intValue_;
        private String name_ = "";
        private String stringValue_ = "";

        public static final class a extends l1.b<s, a> implements t {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // com.google.firebase.inappmessaging.f.t
            public com.google.protobuf.u I1() {
                return ((s) this.f126038b).I1();
            }

            public a Ol() {
                El();
                ((s) this.f126038b).mm();
                return this;
            }

            public a Pl() {
                El();
                ((s) this.f126038b).nm();
                return this;
            }

            public a Ql() {
                El();
                ((s) this.f126038b).om();
                return this;
            }

            public a Rl() {
                El();
                ((s) this.f126038b).pm();
                return this;
            }

            public a Sl() {
                El();
                ((s) this.f126038b).qm();
                return this;
            }

            public a Tl(double d10) {
                El();
                ((s) this.f126038b).Hm(d10);
                return this;
            }

            public a Ul(float f10) {
                El();
                ((s) this.f126038b).Im(f10);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.f.t
            public float V0() {
                return ((s) this.f126038b).V0();
            }

            public a Vl(long j10) {
                El();
                ((s) this.f126038b).Jm(j10);
                return this;
            }

            public a Wl(String str) {
                El();
                ((s) this.f126038b).Km(str);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.f.t
            public double X() {
                return ((s) this.f126038b).X();
            }

            public a Xl(com.google.protobuf.u uVar) {
                El();
                ((s) this.f126038b).Lm(uVar);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.f.t
            public String Y() {
                return ((s) this.f126038b).Y();
            }

            public a Yl(String str) {
                El();
                ((s) this.f126038b).Mm(str);
                return this;
            }

            public a Zl(com.google.protobuf.u uVar) {
                El();
                ((s) this.f126038b).Nm(uVar);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.f.t
            public com.google.protobuf.u a() {
                return ((s) this.f126038b).a();
            }

            @Override // com.google.firebase.inappmessaging.f.t
            public String getName() {
                return ((s) this.f126038b).getName();
            }

            @Override // com.google.firebase.inappmessaging.f.t
            public long m1() {
                return ((s) this.f126038b).m1();
            }

            private a() {
                super(s.DEFAULT_INSTANCE);
            }
        }

        static {
            s sVar = new s();
            DEFAULT_INSTANCE = sVar;
            l1.Wl(s.class, sVar);
        }

        private s() {
        }

        public static s Am(InputStream inputStream) throws IOException {
            return (s) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static s Bm(InputStream inputStream, v0 v0Var) throws IOException {
            return (s) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static s Cm(ByteBuffer byteBuffer) throws t1 {
            return (s) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static s Dm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (s) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static s Em(byte[] bArr) throws t1 {
            return (s) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static s Fm(byte[] bArr, v0 v0Var) throws t1 {
            return (s) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<s> Gm() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Hm(double d10) {
            this.doubleValue_ = d10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Im(float f10) {
            this.floatValue_ = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Jm(long j10) {
            this.intValue_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Km(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Lm(com.google.protobuf.u uVar) {
            com.google.protobuf.a.R(uVar);
            this.name_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Mm(String str) {
            str.getClass();
            this.stringValue_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Nm(com.google.protobuf.u uVar) {
            com.google.protobuf.a.R(uVar);
            this.stringValue_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mm() {
            this.doubleValue_ = 0.0d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void nm() {
            this.floatValue_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void om() {
            this.intValue_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void pm() {
            this.name_ = rm().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void qm() {
            this.stringValue_ = rm().Y();
        }

        public static s rm() {
            return DEFAULT_INSTANCE;
        }

        public static a sm() {
            return DEFAULT_INSTANCE.jf();
        }

        public static a tm(s sVar) {
            return DEFAULT_INSTANCE.Uf(sVar);
        }

        public static s um(InputStream inputStream) throws IOException {
            return (s) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static s vm(InputStream inputStream, v0 v0Var) throws IOException {
            return (s) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static s wm(com.google.protobuf.u uVar) throws t1 {
            return (s) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static s xm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (s) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static s ym(com.google.protobuf.z zVar) throws IOException {
            return (s) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static s zm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (s) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        @Override // com.google.firebase.inappmessaging.f.t
        public com.google.protobuf.u I1() {
            return com.google.protobuf.u.C(this.stringValue_);
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            int i10 = a.f122497a[iVar.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new s();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004\u0001\u0005\u0000", new Object[]{"name_", "stringValue_", "intValue_", "floatValue_", "doubleValue_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f3<s> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (s.class) {
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

        @Override // com.google.firebase.inappmessaging.f.t
        public float V0() {
            return this.floatValue_;
        }

        @Override // com.google.firebase.inappmessaging.f.t
        public double X() {
            return this.doubleValue_;
        }

        @Override // com.google.firebase.inappmessaging.f.t
        public String Y() {
            return this.stringValue_;
        }

        @Override // com.google.firebase.inappmessaging.f.t
        public com.google.protobuf.u a() {
            return com.google.protobuf.u.C(this.name_);
        }

        @Override // com.google.firebase.inappmessaging.f.t
        public String getName() {
            return this.name_;
        }

        @Override // com.google.firebase.inappmessaging.f.t
        public long m1() {
            return this.intValue_;
        }
    }

    public interface t extends o2 {
        com.google.protobuf.u I1();

        float V0();

        double X();

        String Y();

        com.google.protobuf.u a();

        String getName();

        long m1();
    }

    public static final class u extends l1<u, a> implements v {
        private static final u DEFAULT_INSTANCE;
        public static final int EVENT_FIELD_NUMBER = 2;
        public static final int FIAM_TRIGGER_FIELD_NUMBER = 1;
        private static volatile f3<u> PARSER;
        private int conditionCase_ = 0;
        private Object condition_;

        public static final class a extends l1.b<u, a> implements v {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // com.google.firebase.inappmessaging.f.v
            public b Eb() {
                return ((u) this.f126038b).Eb();
            }

            public a Ol() {
                El();
                ((u) this.f126038b).hm();
                return this;
            }

            public a Pl() {
                El();
                ((u) this.f126038b).im();
                return this;
            }

            public a Ql() {
                El();
                ((u) this.f126038b).jm();
                return this;
            }

            public a Rl(i iVar) {
                El();
                ((u) this.f126038b).lm(iVar);
                return this;
            }

            public a Sl(i.a aVar) {
                El();
                ((u) this.f126038b).Bm(aVar.build());
                return this;
            }

            public a Tl(i iVar) {
                El();
                ((u) this.f126038b).Bm(iVar);
                return this;
            }

            public a Ul(r rVar) {
                El();
                ((u) this.f126038b).Cm(rVar);
                return this;
            }

            public a Vl(int i10) {
                El();
                ((u) this.f126038b).Dm(i10);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.f.v
            public boolean a9() {
                return ((u) this.f126038b).a9();
            }

            @Override // com.google.firebase.inappmessaging.f.v
            public i getEvent() {
                return ((u) this.f126038b).getEvent();
            }

            @Override // com.google.firebase.inappmessaging.f.v
            public int mg() {
                return ((u) this.f126038b).mg();
            }

            @Override // com.google.firebase.inappmessaging.f.v
            public r pb() {
                return ((u) this.f126038b).pb();
            }

            @Override // com.google.firebase.inappmessaging.f.v
            public boolean xh() {
                return ((u) this.f126038b).xh();
            }

            private a() {
                super(u.DEFAULT_INSTANCE);
            }
        }

        public enum b {
            FIAM_TRIGGER(1),
            EVENT(2),
            CONDITION_NOT_SET(0);


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f122543a;

            b(int i10) {
                this.f122543a = i10;
            }

            public static b l(int i10) {
                if (i10 == 0) {
                    return CONDITION_NOT_SET;
                }
                if (i10 == 1) {
                    return FIAM_TRIGGER;
                }
                if (i10 != 2) {
                    return null;
                }
                return EVENT;
            }

            @Deprecated
            public static b n(int i10) {
                return l(i10);
            }

            public int i() {
                return this.f122543a;
            }
        }

        static {
            u uVar = new u();
            DEFAULT_INSTANCE = uVar;
            l1.Wl(u.class, uVar);
        }

        private u() {
        }

        public static f3<u> Am() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Bm(i iVar) {
            iVar.getClass();
            this.condition_ = iVar;
            this.conditionCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Cm(r rVar) {
            this.condition_ = Integer.valueOf(rVar.i());
            this.conditionCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Dm(int i10) {
            this.conditionCase_ = 1;
            this.condition_ = Integer.valueOf(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void hm() {
            this.conditionCase_ = 0;
            this.condition_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void im() {
            if (this.conditionCase_ == 2) {
                this.conditionCase_ = 0;
                this.condition_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void jm() {
            if (this.conditionCase_ == 1) {
                this.conditionCase_ = 0;
                this.condition_ = null;
            }
        }

        public static u km() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lm(i iVar) {
            iVar.getClass();
            if (this.conditionCase_ != 2 || this.condition_ == i.ym()) {
                this.condition_ = iVar;
            } else {
                this.condition_ = i.Cm((i) this.condition_).Jl(iVar).B1();
            }
            this.conditionCase_ = 2;
        }

        public static a mm() {
            return DEFAULT_INSTANCE.jf();
        }

        public static a nm(u uVar) {
            return DEFAULT_INSTANCE.Uf(uVar);
        }

        public static u om(InputStream inputStream) throws IOException {
            return (u) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static u pm(InputStream inputStream, v0 v0Var) throws IOException {
            return (u) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static u qm(com.google.protobuf.u uVar) throws t1 {
            return (u) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static u rm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (u) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static u sm(com.google.protobuf.z zVar) throws IOException {
            return (u) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static u tm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (u) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static u um(InputStream inputStream) throws IOException {
            return (u) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static u vm(InputStream inputStream, v0 v0Var) throws IOException {
            return (u) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static u wm(ByteBuffer byteBuffer) throws t1 {
            return (u) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static u xm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (u) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static u ym(byte[] bArr) throws t1 {
            return (u) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static u zm(byte[] bArr, v0 v0Var) throws t1 {
            return (u) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        @Override // com.google.firebase.inappmessaging.f.v
        public b Eb() {
            return b.l(this.conditionCase_);
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            int i10 = a.f122497a[iVar.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new u();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001?\u0000\u0002<\u0000", new Object[]{"condition_", "conditionCase_", i.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f3<u> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (u.class) {
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

        @Override // com.google.firebase.inappmessaging.f.v
        public boolean a9() {
            return this.conditionCase_ == 2;
        }

        @Override // com.google.firebase.inappmessaging.f.v
        public i getEvent() {
            return this.conditionCase_ == 2 ? (i) this.condition_ : i.ym();
        }

        @Override // com.google.firebase.inappmessaging.f.v
        public int mg() {
            if (this.conditionCase_ == 1) {
                return ((Integer) this.condition_).intValue();
            }
            return 0;
        }

        @Override // com.google.firebase.inappmessaging.f.v
        public r pb() {
            if (this.conditionCase_ != 1) {
                return r.UNKNOWN_TRIGGER;
            }
            r rVarL = r.l(((Integer) this.condition_).intValue());
            return rVarL == null ? r.UNRECOGNIZED : rVarL;
        }

        @Override // com.google.firebase.inappmessaging.f.v
        public boolean xh() {
            return this.conditionCase_ == 1;
        }
    }

    public interface v extends o2 {
        u.b Eb();

        boolean a9();

        i getEvent();

        int mg();

        r pb();

        boolean xh();
    }

    private f() {
    }

    public static void a(v0 v0Var) {
    }
}
