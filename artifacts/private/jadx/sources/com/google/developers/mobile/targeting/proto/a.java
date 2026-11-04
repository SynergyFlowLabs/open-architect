package com.google.developers.mobile.targeting.proto;

import com.google.protobuf.f3;
import com.google.protobuf.l1;
import com.google.protobuf.o2;
import com.google.protobuf.t1;
import com.google.protobuf.u;
import com.google.protobuf.v0;
import com.google.protobuf.z;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: com.google.developers.mobile.targeting.proto.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C1119a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f120401a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f120401a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f120401a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f120401a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f120401a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f120401a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f120401a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f120401a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1<b, C1120a> implements c {
        public static final int APP_INSTANCE_ID_FIELD_NUMBER = 1;
        public static final int APP_INSTANCE_TOKEN_FIELD_NUMBER = 2;
        private static final b DEFAULT_INSTANCE;
        public static final int GMP_APP_ID_FIELD_NUMBER = 3;
        private static volatile f3<b> PARSER;
        private String appInstanceId_ = "";
        private String appInstanceToken_ = "";
        private String gmpAppId_ = "";

        /* JADX INFO: renamed from: com.google.developers.mobile.targeting.proto.a$b$a, reason: collision with other inner class name */
        public static final class C1120a extends l1.b<b, C1120a> implements c {
            /* synthetic */ C1120a(C1119a c1119a) {
                this();
            }

            @Override // com.google.developers.mobile.targeting.proto.a.c
            public String D5() {
                return ((b) this.f126038b).D5();
            }

            @Override // com.google.developers.mobile.targeting.proto.a.c
            public u J5() {
                return ((b) this.f126038b).J5();
            }

            @Override // com.google.developers.mobile.targeting.proto.a.c
            public u L1() {
                return ((b) this.f126038b).L1();
            }

            public C1120a Ol() {
                El();
                ((b) this.f126038b).jm();
                return this;
            }

            public C1120a Pl() {
                El();
                ((b) this.f126038b).km();
                return this;
            }

            public C1120a Ql() {
                El();
                ((b) this.f126038b).lm();
                return this;
            }

            public C1120a Rl(String str) {
                El();
                ((b) this.f126038b).Cm(str);
                return this;
            }

            public C1120a Sl(u uVar) {
                El();
                ((b) this.f126038b).Dm(uVar);
                return this;
            }

            @Override // com.google.developers.mobile.targeting.proto.a.c
            public String T0() {
                return ((b) this.f126038b).T0();
            }

            public C1120a Tl(String str) {
                El();
                ((b) this.f126038b).Em(str);
                return this;
            }

            public C1120a Ul(u uVar) {
                El();
                ((b) this.f126038b).Fm(uVar);
                return this;
            }

            public C1120a Vl(String str) {
                El();
                ((b) this.f126038b).Gm(str);
                return this;
            }

            public C1120a Wl(u uVar) {
                El();
                ((b) this.f126038b).Hm(uVar);
                return this;
            }

            @Override // com.google.developers.mobile.targeting.proto.a.c
            public String Xc() {
                return ((b) this.f126038b).Xc();
            }

            @Override // com.google.developers.mobile.targeting.proto.a.c
            public u zh() {
                return ((b) this.f126038b).zh();
            }

            private C1120a() {
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

        public static b Am(byte[] bArr, v0 v0Var) throws t1 {
            return (b) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<b> Bm() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Cm(String str) {
            str.getClass();
            this.appInstanceId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Dm(u uVar) {
            com.google.protobuf.a.R(uVar);
            this.appInstanceId_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Em(String str) {
            str.getClass();
            this.appInstanceToken_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Fm(u uVar) {
            com.google.protobuf.a.R(uVar);
            this.appInstanceToken_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Gm(String str) {
            str.getClass();
            this.gmpAppId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Hm(u uVar) {
            com.google.protobuf.a.R(uVar);
            this.gmpAppId_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void jm() {
            this.appInstanceId_ = mm().T0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void km() {
            this.appInstanceToken_ = mm().Xc();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lm() {
            this.gmpAppId_ = mm().D5();
        }

        public static b mm() {
            return DEFAULT_INSTANCE;
        }

        public static C1120a nm() {
            return DEFAULT_INSTANCE.jf();
        }

        public static C1120a om(b bVar) {
            return DEFAULT_INSTANCE.Uf(bVar);
        }

        public static b pm(InputStream inputStream) throws IOException {
            return (b) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static b qm(InputStream inputStream, v0 v0Var) throws IOException {
            return (b) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static b rm(u uVar) throws t1 {
            return (b) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static b sm(u uVar, v0 v0Var) throws t1 {
            return (b) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static b tm(z zVar) throws IOException {
            return (b) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static b um(z zVar, v0 v0Var) throws IOException {
            return (b) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static b vm(InputStream inputStream) throws IOException {
            return (b) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static b wm(InputStream inputStream, v0 v0Var) throws IOException {
            return (b) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static b xm(ByteBuffer byteBuffer) throws t1 {
            return (b) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static b ym(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (b) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static b zm(byte[] bArr) throws t1 {
            return (b) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        @Override // com.google.developers.mobile.targeting.proto.a.c
        public String D5() {
            return this.gmpAppId_;
        }

        @Override // com.google.developers.mobile.targeting.proto.a.c
        public u J5() {
            return u.C(this.gmpAppId_);
        }

        @Override // com.google.developers.mobile.targeting.proto.a.c
        public u L1() {
            return u.C(this.appInstanceId_);
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            int i10 = C1119a.f120401a[iVar.ordinal()];
            C1119a c1119a = null;
            switch (i10) {
                case 1:
                    return new b();
                case 2:
                    return new C1120a(c1119a);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"appInstanceId_", "appInstanceToken_", "gmpAppId_"});
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

        @Override // com.google.developers.mobile.targeting.proto.a.c
        public String T0() {
            return this.appInstanceId_;
        }

        @Override // com.google.developers.mobile.targeting.proto.a.c
        public String Xc() {
            return this.appInstanceToken_;
        }

        @Override // com.google.developers.mobile.targeting.proto.a.c
        public u zh() {
            return u.C(this.appInstanceToken_);
        }
    }

    public interface c extends o2 {
        String D5();

        u J5();

        u L1();

        String T0();

        String Xc();

        u zh();
    }

    public static final class d extends l1<d, C1121a> implements e {
        public static final int APP_VERSION_FIELD_NUMBER = 1;
        private static final d DEFAULT_INSTANCE;
        public static final int LANGUAGE_CODE_FIELD_NUMBER = 3;
        private static volatile f3<d> PARSER = null;
        public static final int PLATFORM_VERSION_FIELD_NUMBER = 2;
        public static final int TIME_ZONE_FIELD_NUMBER = 4;
        private String appVersion_ = "";
        private String platformVersion_ = "";
        private String languageCode_ = "";
        private String timeZone_ = "";

        /* JADX INFO: renamed from: com.google.developers.mobile.targeting.proto.a$d$a, reason: collision with other inner class name */
        public static final class C1121a extends l1.b<d, C1121a> implements e {
            /* synthetic */ C1121a(C1119a c1119a) {
                this();
            }

            @Override // com.google.developers.mobile.targeting.proto.a.e
            public u B2() {
                return ((d) this.f126038b).B2();
            }

            public C1121a Ol() {
                El();
                ((d) this.f126038b).mm();
                return this;
            }

            public C1121a Pl() {
                El();
                ((d) this.f126038b).nm();
                return this;
            }

            @Override // com.google.developers.mobile.targeting.proto.a.e
            public u Q4() {
                return ((d) this.f126038b).Q4();
            }

            public C1121a Ql() {
                El();
                ((d) this.f126038b).om();
                return this;
            }

            public C1121a Rl() {
                El();
                ((d) this.f126038b).pm();
                return this;
            }

            public C1121a Sl(String str) {
                El();
                ((d) this.f126038b).Gm(str);
                return this;
            }

            public C1121a Tl(u uVar) {
                El();
                ((d) this.f126038b).Hm(uVar);
                return this;
            }

            @Override // com.google.developers.mobile.targeting.proto.a.e
            public String U() {
                return ((d) this.f126038b).U();
            }

            public C1121a Ul(String str) {
                El();
                ((d) this.f126038b).Im(str);
                return this;
            }

            public C1121a Vl(u uVar) {
                El();
                ((d) this.f126038b).Jm(uVar);
                return this;
            }

            public C1121a Wl(String str) {
                El();
                ((d) this.f126038b).Km(str);
                return this;
            }

            public C1121a Xl(u uVar) {
                El();
                ((d) this.f126038b).Lm(uVar);
                return this;
            }

            public C1121a Yl(String str) {
                El();
                ((d) this.f126038b).Mm(str);
                return this;
            }

            @Override // com.google.developers.mobile.targeting.proto.a.e
            public u Zk() {
                return ((d) this.f126038b).Zk();
            }

            public C1121a Zl(u uVar) {
                El();
                ((d) this.f126038b).Nm(uVar);
                return this;
            }

            @Override // com.google.developers.mobile.targeting.proto.a.e
            public String getAppVersion() {
                return ((d) this.f126038b).getAppVersion();
            }

            @Override // com.google.developers.mobile.targeting.proto.a.e
            public String getLanguageCode() {
                return ((d) this.f126038b).getLanguageCode();
            }

            @Override // com.google.developers.mobile.targeting.proto.a.e
            public String og() {
                return ((d) this.f126038b).og();
            }

            @Override // com.google.developers.mobile.targeting.proto.a.e
            public u xa() {
                return ((d) this.f126038b).xa();
            }

            private C1121a() {
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
            return (d) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static d Bm(ByteBuffer byteBuffer) throws t1 {
            return (d) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static d Cm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (d) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static d Dm(byte[] bArr) throws t1 {
            return (d) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static d Em(byte[] bArr, v0 v0Var) throws t1 {
            return (d) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<d> Fm() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Gm(String str) {
            str.getClass();
            this.appVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Hm(u uVar) {
            com.google.protobuf.a.R(uVar);
            this.appVersion_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Im(String str) {
            str.getClass();
            this.languageCode_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Jm(u uVar) {
            com.google.protobuf.a.R(uVar);
            this.languageCode_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Km(String str) {
            str.getClass();
            this.platformVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Lm(u uVar) {
            com.google.protobuf.a.R(uVar);
            this.platformVersion_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Mm(String str) {
            str.getClass();
            this.timeZone_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Nm(u uVar) {
            com.google.protobuf.a.R(uVar);
            this.timeZone_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mm() {
            this.appVersion_ = qm().getAppVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void nm() {
            this.languageCode_ = qm().getLanguageCode();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void om() {
            this.platformVersion_ = qm().og();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void pm() {
            this.timeZone_ = qm().U();
        }

        public static d qm() {
            return DEFAULT_INSTANCE;
        }

        public static C1121a rm() {
            return DEFAULT_INSTANCE.jf();
        }

        public static C1121a sm(d dVar) {
            return DEFAULT_INSTANCE.Uf(dVar);
        }

        public static d tm(InputStream inputStream) throws IOException {
            return (d) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static d um(InputStream inputStream, v0 v0Var) throws IOException {
            return (d) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static d vm(u uVar) throws t1 {
            return (d) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static d wm(u uVar, v0 v0Var) throws t1 {
            return (d) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static d xm(z zVar) throws IOException {
            return (d) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static d ym(z zVar, v0 v0Var) throws IOException {
            return (d) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static d zm(InputStream inputStream) throws IOException {
            return (d) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        @Override // com.google.developers.mobile.targeting.proto.a.e
        public u B2() {
            return u.C(this.languageCode_);
        }

        @Override // com.google.developers.mobile.targeting.proto.a.e
        public u Q4() {
            return u.C(this.timeZone_);
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            int i10 = C1119a.f120401a[iVar.ordinal()];
            C1119a c1119a = null;
            switch (i10) {
                case 1:
                    return new d();
                case 2:
                    return new C1121a(c1119a);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"appVersion_", "platformVersion_", "languageCode_", "timeZone_"});
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

        @Override // com.google.developers.mobile.targeting.proto.a.e
        public String U() {
            return this.timeZone_;
        }

        @Override // com.google.developers.mobile.targeting.proto.a.e
        public u Zk() {
            return u.C(this.appVersion_);
        }

        @Override // com.google.developers.mobile.targeting.proto.a.e
        public String getAppVersion() {
            return this.appVersion_;
        }

        @Override // com.google.developers.mobile.targeting.proto.a.e
        public String getLanguageCode() {
            return this.languageCode_;
        }

        @Override // com.google.developers.mobile.targeting.proto.a.e
        public String og() {
            return this.platformVersion_;
        }

        @Override // com.google.developers.mobile.targeting.proto.a.e
        public u xa() {
            return u.C(this.platformVersion_);
        }
    }

    public interface e extends o2 {
        u B2();

        u Q4();

        String U();

        u Zk();

        String getAppVersion();

        String getLanguageCode();

        String og();

        u xa();
    }

    private a() {
    }

    public static void a(v0 v0Var) {
    }
}
