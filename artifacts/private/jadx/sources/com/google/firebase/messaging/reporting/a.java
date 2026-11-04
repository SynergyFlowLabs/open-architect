package com.google.firebase.messaging.reporting;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final a f123725p = new C1175a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f123726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f123727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f123728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f123729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f123730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f123731f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f123732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f123733h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f123734i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f123735j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f123736k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final b f123737l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f123738m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f123739n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f123740o;

    /* JADX INFO: renamed from: com.google.firebase.messaging.reporting.a$a, reason: collision with other inner class name */
    public static final class C1175a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f123741a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f123742b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f123743c = "";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f123744d = c.UNKNOWN;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d f123745e = d.UNKNOWN_OS;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f123746f = "";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f123747g = "";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f123748h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f123749i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f123750j = "";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f123751k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private b f123752l = b.UNKNOWN_EVENT;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private String f123753m = "";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f123754n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private String f123755o = "";

        C1175a() {
        }

        public a a() {
            return new a(this.f123741a, this.f123742b, this.f123743c, this.f123744d, this.f123745e, this.f123746f, this.f123747g, this.f123748h, this.f123749i, this.f123750j, this.f123751k, this.f123752l, this.f123753m, this.f123754n, this.f123755o);
        }

        public C1175a b(String str) {
            this.f123753m = str;
            return this;
        }

        public C1175a c(long j10) {
            this.f123751k = j10;
            return this;
        }

        public C1175a d(long j10) {
            this.f123754n = j10;
            return this;
        }

        public C1175a e(String str) {
            this.f123747g = str;
            return this;
        }

        public C1175a f(String str) {
            this.f123755o = str;
            return this;
        }

        public C1175a g(b bVar) {
            this.f123752l = bVar;
            return this;
        }

        public C1175a h(String str) {
            this.f123743c = str;
            return this;
        }

        public C1175a i(String str) {
            this.f123742b = str;
            return this;
        }

        public C1175a j(c cVar) {
            this.f123744d = cVar;
            return this;
        }

        public C1175a k(String str) {
            this.f123746f = str;
            return this;
        }

        public C1175a l(int i10) {
            this.f123748h = i10;
            return this;
        }

        public C1175a m(long j10) {
            this.f123741a = j10;
            return this;
        }

        public C1175a n(d dVar) {
            this.f123745e = dVar;
            return this;
        }

        public C1175a o(String str) {
            this.f123750j = str;
            return this;
        }

        public C1175a p(int i10) {
            this.f123749i = i10;
            return this;
        }
    }

    public enum b implements com.google.firebase.encoders.proto.c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f123760a;

        b(int i10) {
            this.f123760a = i10;
        }

        @Override // com.google.firebase.encoders.proto.c
        public int i() {
            return this.f123760a;
        }
    }

    public enum c implements com.google.firebase.encoders.proto.c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f123766a;

        c(int i10) {
            this.f123766a = i10;
        }

        @Override // com.google.firebase.encoders.proto.c
        public int i() {
            return this.f123766a;
        }
    }

    public enum d implements com.google.firebase.encoders.proto.c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f123772a;

        static {
            int i10 = 4 ^ 1;
        }

        d(int i10) {
            this.f123772a = i10;
        }

        @Override // com.google.firebase.encoders.proto.c
        public int i() {
            return this.f123772a;
        }
    }

    a(long j10, String str, String str2, c cVar, d dVar, String str3, String str4, int i10, int i11, String str5, long j11, b bVar, String str6, long j12, String str7) {
        this.f123726a = j10;
        this.f123727b = str;
        this.f123728c = str2;
        this.f123729d = cVar;
        this.f123730e = dVar;
        this.f123731f = str3;
        this.f123732g = str4;
        this.f123733h = i10;
        this.f123734i = i11;
        this.f123735j = str5;
        this.f123736k = j11;
        this.f123737l = bVar;
        this.f123738m = str6;
        this.f123739n = j12;
        this.f123740o = str7;
    }

    public static a f() {
        return f123725p;
    }

    public static C1175a q() {
        return new C1175a();
    }

    @com.google.firebase.encoders.proto.d(tag = 13)
    public String a() {
        return this.f123738m;
    }

    @com.google.firebase.encoders.proto.d(tag = 11)
    public long b() {
        return this.f123736k;
    }

    @com.google.firebase.encoders.proto.d(tag = 14)
    public long c() {
        return this.f123739n;
    }

    @com.google.firebase.encoders.proto.d(tag = 7)
    public String d() {
        return this.f123732g;
    }

    @com.google.firebase.encoders.proto.d(tag = 15)
    public String e() {
        return this.f123740o;
    }

    @com.google.firebase.encoders.proto.d(tag = 12)
    public b g() {
        return this.f123737l;
    }

    @com.google.firebase.encoders.proto.d(tag = 3)
    public String h() {
        return this.f123728c;
    }

    @com.google.firebase.encoders.proto.d(tag = 2)
    public String i() {
        return this.f123727b;
    }

    @com.google.firebase.encoders.proto.d(tag = 4)
    public c j() {
        return this.f123729d;
    }

    @com.google.firebase.encoders.proto.d(tag = 6)
    public String k() {
        return this.f123731f;
    }

    @com.google.firebase.encoders.proto.d(tag = 8)
    public int l() {
        return this.f123733h;
    }

    @com.google.firebase.encoders.proto.d(tag = 1)
    public long m() {
        return this.f123726a;
    }

    @com.google.firebase.encoders.proto.d(tag = 5)
    public d n() {
        return this.f123730e;
    }

    @com.google.firebase.encoders.proto.d(tag = 10)
    public String o() {
        return this.f123735j;
    }

    @com.google.firebase.encoders.proto.d(tag = 9)
    public int p() {
        return this.f123734i;
    }
}
