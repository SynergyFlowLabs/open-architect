package io.grpc.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes13.dex */
public final class v0 {
    public static final long A;
    public static final long B = Long.MAX_VALUE;
    public static final long C;
    public static final long D;
    public static final long E = Long.MAX_VALUE;
    public static final io.grpc.g2 F;
    public static final io.grpc.g2 G;
    public static final String H = "pick_first";
    public static final io.grpc.e.c<Boolean> I;
    private static final io.grpc.n J;
    public static final f3.d<Executor> K;
    public static final f3.d<ScheduledExecutorService> L;
    public static final com.google.common.base.s0<com.google.common.base.q0> M;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final io.grpc.v1.i<String> f289900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final io.grpc.v1.i<byte[]> f289901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final io.grpc.v1.i<String> f289902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final io.grpc.v1.i<byte[]> f289903h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final io.grpc.v1.i<String> f289904i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final io.grpc.v1.i<String> f289905j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final io.grpc.v1.i<String> f289906k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final io.grpc.v1.i<String> f289907l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f289908m = 80;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f289909n = 443;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f289910o = "application/grpc";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f289911p = "POST";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f289912q = "trailers";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f289914s = "grpc-encoding";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f289915t = "grpc-accept-encoding";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f289916u = "content-encoding";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f289917v = "accept-encoding";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f289918w = 4194304;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f289919x = 8192;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final com.google.common.base.o0 f289920y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f289921z = "1.62.2";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f289896a = Logger.getLogger(v0.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<io.grpc.y2.b> f289897b = Collections.unmodifiableSet(EnumSet.of(io.grpc.y2.b.OK, io.grpc.y2.b.INVALID_ARGUMENT, io.grpc.y2.b.NOT_FOUND, io.grpc.y2.b.ALREADY_EXISTS, io.grpc.y2.b.FAILED_PRECONDITION, io.grpc.y2.b.ABORTED, io.grpc.y2.b.OUT_OF_RANGE, io.grpc.y2.b.DATA_LOSS));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f289898c = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f289913r = "grpc-timeout";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final io.grpc.v1.i<Long> f289899d = io.grpc.v1.i.e(f289913r, new k());

    class a implements io.grpc.g2 {
        a() {
        }

        @Override // io.grpc.g2
        @fj.h
        public io.grpc.f2 a(SocketAddress socketAddress) {
            return null;
        }
    }

    class b extends io.grpc.n {
        b() {
        }
    }

    class c implements f3.d<Executor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String f289922a = "grpc-default-executor";

        c() {
        }

        @Override // io.grpc.internal.f3.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        @Override // io.grpc.internal.f3.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Executor k() {
            return Executors.newCachedThreadPool(v0.m("grpc-default-executor-%d", true));
        }

        public String toString() {
            return f289922a;
        }
    }

    class d implements f3.d<ScheduledExecutorService> {
        d() {
        }

        @Override // io.grpc.internal.f3.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(ScheduledExecutorService scheduledExecutorService) {
            scheduledExecutorService.shutdown();
        }

        @Override // io.grpc.internal.f3.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ScheduledExecutorService k() {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, v0.m("grpc-timer-%d", true));
            try {
                scheduledExecutorServiceNewScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(scheduledExecutorServiceNewScheduledThreadPool, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new RuntimeException(e11);
            }
            return Executors.unconfigurableScheduledExecutorService(scheduledExecutorServiceNewScheduledThreadPool);
        }
    }

    class e implements com.google.common.base.s0<com.google.common.base.q0> {
        e() {
        }

        @Override // com.google.common.base.s0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.google.common.base.q0 get() {
            return com.google.common.base.q0.e();
        }
    }

    class f implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.grpc.n.a f289923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f289924b;

        f(io.grpc.n.a aVar, u uVar) {
            this.f289923a = aVar;
            this.f289924b = uVar;
        }

        @Override // io.grpc.m1
        public io.grpc.c1 c() {
            return this.f289924b.c();
        }

        @Override // io.grpc.internal.u
        public void d(u.a aVar, Executor executor) {
            this.f289924b.d(aVar, executor);
        }

        @Override // io.grpc.internal.u
        public s e(io.grpc.w1<?, ?> w1Var, io.grpc.v1 v1Var, io.grpc.e eVar, io.grpc.n[] nVarArr) {
            io.grpc.n nVarA = this.f289923a.a(io.grpc.n.b.d().b(eVar).a(), v1Var);
            com.google.common.base.j0.h0(nVarArr[nVarArr.length - 1] == v0.J, "lb tracer already assigned");
            nVarArr[nVarArr.length - 1] = nVarA;
            return this.f289924b.e(w1Var, v1Var, eVar, nVarArr);
        }

        @Override // io.grpc.a1
        public com.google.common.util.concurrent.t1<io.grpc.v0.l> i() {
            return this.f289924b.i();
        }
    }

    private static final class g implements io.grpc.f1.a<byte[]> {
        private g() {
        }

        @Override // io.grpc.v1.m
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public byte[] b(byte[] bArr) {
            return bArr;
        }

        @Override // io.grpc.v1.m
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public byte[] a(byte[] bArr) {
            return bArr;
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final char[] f289925a = "0123456789ABCDEF".toCharArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Set<Character> f289926b = Collections.unmodifiableSet(new HashSet(Arrays.asList(Character.valueOf(org.apache.commons.codec.language.l.f335457d), '_', '.', '~')));

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Set<Character> f289927c = Collections.unmodifiableSet(new HashSet(Arrays.asList('!', '$', Character.valueOf(kotlin.text.b0.f313279d), '\'', '(', ')', '*', '+', Character.valueOf(AbstractJsonLexerKt.COMMA), ';', '=')));

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Set<Character> f289928d = Collections.unmodifiableSet(new HashSet(Arrays.asList(Character.valueOf(AbstractJsonLexerKt.COLON), Character.valueOf(AbstractJsonLexerKt.BEGIN_LIST), Character.valueOf(AbstractJsonLexerKt.END_LIST), '@')));

        public static String a(String str) {
            com.google.common.base.j0.F(str, "authority");
            int length = str.length();
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (b(str.charAt(i11))) {
                    i10++;
                }
            }
            if (i10 == 0) {
                return str;
            }
            StringBuilder sb2 = new StringBuilder((i10 * 2) + length);
            for (int i12 = 0; i12 < length; i12++) {
                char cCharAt = str.charAt(i12);
                if (b(cCharAt)) {
                    sb2.append('%');
                    char[] cArr = f289925a;
                    sb2.append(cArr[cCharAt >>> 4]);
                    sb2.append(cArr[cCharAt & 15]);
                } else {
                    sb2.append(cCharAt);
                }
            }
            return sb2.toString();
        }

        private static boolean b(char c10) {
            if (c10 > 127) {
                return false;
            }
            if ((c10 < 'a' || c10 > 'z') && (c10 < 'A' || c10 > 'Z')) {
                return ((c10 >= '0' && c10 <= '9') || f289926b.contains(Character.valueOf(c10)) || f289927c.contains(Character.valueOf(c10)) || f289928d.contains(Character.valueOf(c10))) ? false : true;
            }
            return false;
        }
    }

    @gj.b
    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f289929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f289930b;

        /* synthetic */ i(String str, String str2, a aVar) {
            this(str, str2);
        }

        public String a() {
            return this.f289930b;
        }

        public String b() {
            return this.f289929a;
        }

        public String toString() {
            return this.f289929a + " " + this.f289930b;
        }

        private i(String str, String str2) {
            this.f289929a = (String) com.google.common.base.j0.F(str, "userAgentName");
            this.f289930b = (String) com.google.common.base.j0.F(str2, "implementationVersion");
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class j {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f289931c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final j f289932d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final j f289933e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final j f289934f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final j f289935g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final j f289936h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final j f289937i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final j f289938j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final j f289939k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final j f289940l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final j f289941m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f289942n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final j f289943o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final j f289944s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final j[] f289945t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final /* synthetic */ j[] f289946v;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f289947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.grpc.y2 f289948b;

        static {
            io.grpc.y2 y2Var = io.grpc.y2.f291465t;
            j jVar = new j("NO_ERROR", 0, 0, y2Var);
            f289931c = jVar;
            io.grpc.y2 y2Var2 = io.grpc.y2.f291464s;
            j jVar2 = new j("PROTOCOL_ERROR", 1, 1, y2Var2);
            f289932d = jVar2;
            j jVar3 = new j("INTERNAL_ERROR", 2, 2, y2Var2);
            f289933e = jVar3;
            j jVar4 = new j("FLOW_CONTROL_ERROR", 3, 3, y2Var2);
            f289934f = jVar4;
            j jVar5 = new j("SETTINGS_TIMEOUT", 4, 4, y2Var2);
            f289935g = jVar5;
            j jVar6 = new j("STREAM_CLOSED", 5, 5, y2Var2);
            f289936h = jVar6;
            j jVar7 = new j("FRAME_SIZE_ERROR", 6, 6, y2Var2);
            f289937i = jVar7;
            j jVar8 = new j("REFUSED_STREAM", 7, 7, y2Var);
            f289938j = jVar8;
            j jVar9 = new j("CANCEL", 8, 8, io.grpc.y2.f291451f);
            f289939k = jVar9;
            j jVar10 = new j("COMPRESSION_ERROR", 9, 9, y2Var2);
            f289940l = jVar10;
            j jVar11 = new j("CONNECT_ERROR", 10, 10, y2Var2);
            f289941m = jVar11;
            j jVar12 = new j("ENHANCE_YOUR_CALM", 11, 11, io.grpc.y2.f291459n.u("Bandwidth exhausted"));
            f289942n = jVar12;
            j jVar13 = new j("INADEQUATE_SECURITY", 12, 12, io.grpc.y2.f291457l.u("Permission denied as protocol is not secure enough to call"));
            f289943o = jVar13;
            j jVar14 = new j("HTTP_1_1_REQUIRED", 13, 13, io.grpc.y2.f291452g);
            f289944s = jVar14;
            f289946v = new j[]{jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9, jVar10, jVar11, jVar12, jVar13, jVar14};
            f289945t = k();
        }

        private j(String str, int i10, int i11, io.grpc.y2 y2Var) {
            super(str, i10);
            this.f289947a = i11;
            String str2 = "HTTP/2 error code: " + name();
            if (y2Var.q() != null) {
                str2 = str2 + " (" + y2Var.q() + ")";
            }
            this.f289948b = y2Var.u(str2);
        }

        private static j[] k() {
            j[] jVarArrValues = values();
            j[] jVarArr = new j[((int) jVarArrValues[jVarArrValues.length - 1].l()) + 1];
            for (j jVar : jVarArrValues) {
                jVarArr[(int) jVar.l()] = jVar;
            }
            return jVarArr;
        }

        public static j n(long j10) {
            j[] jVarArr = f289945t;
            if (j10 < jVarArr.length && j10 >= 0) {
                return jVarArr[(int) j10];
            }
            return null;
        }

        public static io.grpc.y2 p(long j10) {
            j jVarN = n(j10);
            if (jVarN != null) {
                return jVarN.o();
            }
            return io.grpc.y2.k(f289933e.o().p().l()).u("Unrecognized HTTP/2 error code: " + j10);
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) f289946v.clone();
        }

        public long l() {
            return this.f289947a;
        }

        public io.grpc.y2 o() {
            return this.f289948b;
        }
    }

    @com.google.common.annotations.e
    static class k implements io.grpc.v1.d<Long> {
        k() {
        }

        @Override // io.grpc.v1.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Long b(String str) {
            com.google.common.base.j0.e(str.length() > 0, "empty timeout");
            com.google.common.base.j0.e(str.length() <= 9, "bad timeout format");
            long j10 = Long.parseLong(str.substring(0, str.length() - 1));
            char cCharAt = str.charAt(str.length() - 1);
            if (cCharAt == 'H') {
                return Long.valueOf(TimeUnit.HOURS.toNanos(j10));
            }
            if (cCharAt == 'M') {
                return Long.valueOf(TimeUnit.MINUTES.toNanos(j10));
            }
            if (cCharAt == 'S') {
                return Long.valueOf(TimeUnit.SECONDS.toNanos(j10));
            }
            if (cCharAt == 'u') {
                return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(j10));
            }
            if (cCharAt == 'm') {
                return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(j10));
            }
            if (cCharAt == 'n') {
                return Long.valueOf(j10);
            }
            throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", Character.valueOf(cCharAt)));
        }

        @Override // io.grpc.v1.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String a(Long l10) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (l10.longValue() < 0) {
                throw new IllegalArgumentException("Timeout too small");
            }
            if (l10.longValue() < 100000000) {
                return l10 + "n";
            }
            if (l10.longValue() < 100000000000L) {
                return timeUnit.toMicros(l10.longValue()) + "u";
            }
            if (l10.longValue() < 100000000000000L) {
                return timeUnit.toMillis(l10.longValue()) + androidx.media3.exoplayer.upstream.h.f66001o;
            }
            if (l10.longValue() < 100000000000000000L) {
                return timeUnit.toSeconds(l10.longValue()) + androidx.exifinterface.media.a.S4;
            }
            if (l10.longValue() < 6000000000000000000L) {
                return timeUnit.toMinutes(l10.longValue()) + "M";
            }
            return timeUnit.toHours(l10.longValue()) + "H";
        }
    }

    static {
        io.grpc.v1.d<String> dVar = io.grpc.v1.f291323f;
        f289900e = io.grpc.v1.i.e(f289914s, dVar);
        a aVar = null;
        f289901f = io.grpc.f1.b(f289915t, new g(aVar));
        f289902g = io.grpc.v1.i.e(f289916u, dVar);
        f289903h = io.grpc.f1.b(f289917v, new g(aVar));
        f289904i = io.grpc.v1.i.e("content-length", dVar);
        f289905j = io.grpc.v1.i.e("content-type", dVar);
        f289906k = io.grpc.v1.i.e("te", dVar);
        f289907l = io.grpc.v1.i.e("user-agent", dVar);
        f289920y = com.google.common.base.o0.h(AbstractJsonLexerKt.COMMA).q();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        A = timeUnit.toNanos(20L);
        C = TimeUnit.HOURS.toNanos(2L);
        D = timeUnit.toNanos(20L);
        F = new h2();
        G = new a();
        I = io.grpc.e.c.b("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
        J = new b();
        K = new c();
        L = new d();
        M = new e();
    }

    private v0() {
    }

    public static String b(String str, int i10) {
        String str2;
        int i11;
        try {
            str2 = str;
            i11 = i10;
            try {
                return new URI(null, null, str2, i11, null, null, null).getAuthority();
            } catch (URISyntaxException e10) {
                e = e10;
                throw new IllegalArgumentException("Invalid host or port: " + str2 + " " + i11, e);
            }
        } catch (URISyntaxException e11) {
            e = e11;
            str2 = str;
            i11 = i10;
        }
    }

    public static URI c(String str) {
        String str2;
        com.google.common.base.j0.F(str, "authority");
        try {
            str2 = str;
            try {
                return new URI(null, str2, null, null, null);
            } catch (URISyntaxException e10) {
                e = e10;
                throw new IllegalArgumentException("Invalid authority: " + str2, e);
            }
        } catch (URISyntaxException e11) {
            e = e11;
            str2 = str;
        }
    }

    public static String d(String str) {
        com.google.common.base.j0.u(c(str).getAuthority().indexOf(64) == -1, "Userinfo must not be present on authority: '%s'", str);
        return str;
    }

    static void e(k3.a aVar) {
        while (true) {
            InputStream next = aVar.next();
            if (next == null) {
                return;
            } else {
                f(next);
            }
        }
    }

    public static void f(@fj.h Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e10) {
            f289896a.log(Level.WARNING, "exception caught in closeQuietly", (Throwable) e10);
        }
    }

    public static void g(InputStream inputStream) throws IOException {
        while (inputStream.read(new byte[256]) != -1) {
        }
    }

    public static io.grpc.n[] h(io.grpc.e eVar, io.grpc.v1 v1Var, int i10, boolean z10) {
        List<io.grpc.n.a> listI = eVar.i();
        int size = listI.size();
        io.grpc.n[] nVarArr = new io.grpc.n[size + 1];
        io.grpc.n.b bVarA = io.grpc.n.b.d().b(eVar).d(i10).c(z10).a();
        for (int i11 = 0; i11 < listI.size(); i11++) {
            nVarArr[i11] = listI.get(i11).a(bVarA, v1Var);
        }
        nVarArr[size] = J;
        return nVarArr;
    }

    public static boolean i(String str, boolean z10) {
        String property = System.getenv(str);
        if (property == null) {
            property = System.getProperty(str);
        }
        if (z10) {
            return com.google.common.base.r0.d(property) || Boolean.parseBoolean(property);
        }
        return !com.google.common.base.r0.d(property) && Boolean.parseBoolean(property);
    }

    public static i j() {
        return new i("gRPC Java", f289921z, null);
    }

    public static String k(String str, @fj.h String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (str2 != null) {
            sb2.append(str2);
            sb2.append(' ');
        }
        sb2.append("grpc-java-");
        sb2.append(str);
        sb2.append('/');
        sb2.append(f289921z);
        return sb2.toString();
    }

    public static String l(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", null).invoke(inetSocketAddress, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    public static ThreadFactory m(String str, boolean z10) {
        return new com.google.common.util.concurrent.y2().e(z10).f(str).b();
    }

    @fj.h
    static u n(io.grpc.o1.g gVar, boolean z10) {
        io.grpc.o1.j jVarC = gVar.c();
        u uVarB = jVarC != null ? ((p3) jVarC.f()).b() : null;
        if (uVarB != null) {
            io.grpc.n.a aVarB = gVar.b();
            return aVarB == null ? uVarB : new f(aVarB, uVarB);
        }
        if (!gVar.a().r()) {
            if (gVar.d()) {
                return new j0(s(gVar.a()), t.a.DROPPED);
            }
            if (!z10) {
                return new j0(s(gVar.a()), t.a.PROCESSED);
            }
        }
        return null;
    }

    private static io.grpc.y2.b o(int i10) {
        if (i10 >= 100 && i10 < 200) {
            return io.grpc.y2.b.INTERNAL;
        }
        if (i10 != 400) {
            if (i10 == 401) {
                return io.grpc.y2.b.UNAUTHENTICATED;
            }
            if (i10 == 403) {
                return io.grpc.y2.b.PERMISSION_DENIED;
            }
            if (i10 == 404) {
                return io.grpc.y2.b.UNIMPLEMENTED;
            }
            if (i10 != 429) {
                if (i10 != 431) {
                    switch (i10) {
                        case 502:
                        case 503:
                        case 504:
                            break;
                        default:
                            return io.grpc.y2.b.UNKNOWN;
                    }
                }
            }
            return io.grpc.y2.b.UNAVAILABLE;
        }
        return io.grpc.y2.b.INTERNAL;
    }

    public static io.grpc.y2 p(int i10) {
        return o(i10).k().u("HTTP status code " + i10);
    }

    public static boolean q(String str) {
        char cCharAt;
        if (str == null || 16 > str.length()) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        if (lowerCase.startsWith(f289910o)) {
            return lowerCase.length() == 16 || (cCharAt = lowerCase.charAt(16)) == '+' || cCharAt == ';';
        }
        return false;
    }

    static <T> boolean r(Iterable<T> iterable, T t10) {
        if (iterable instanceof Collection) {
            try {
                return ((Collection) iterable).contains(t10);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            if (com.google.common.base.d0.a(it.next(), t10)) {
                int i10 = 7 | 1;
                return true;
            }
        }
        return false;
    }

    public static io.grpc.y2 s(io.grpc.y2 y2Var) {
        com.google.common.base.j0.d(y2Var != null);
        if (f289897b.contains(y2Var.p())) {
            y2Var = io.grpc.y2.f291464s.u("Inappropriate status code from control plane: " + y2Var.p() + " " + y2Var.q()).t(y2Var.o());
        }
        return y2Var;
    }

    public static boolean t(io.grpc.e eVar) {
        return !Boolean.TRUE.equals(eVar.h(I));
    }
}
