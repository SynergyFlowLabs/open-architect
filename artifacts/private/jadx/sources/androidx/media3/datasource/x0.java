package androidx.media3.datasource;

import android.net.Uri;
import android.net.http.HttpEngine;
import android.net.http.HttpException;
import android.net.http.UrlRequest;
import android.net.http.UrlRequest$Callback;
import android.net.http.UrlRequest$StatusListener;
import android.net.http.UrlResponseInfo;
import android.text.TextUtils;
import com.google.common.collect.n6;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
@androidx.annotation.x0(extension = 31, version = 7)
public final class x0 extends e implements g0 {

    @androidx.media3.common.util.b1
    public static final int C = 8000;

    @androidx.media3.common.util.b1
    public static final int D = 8000;
    private static final int E = 32768;
    private static final String F = "HttpEngineDataSource";
    private boolean A;
    private volatile long B;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HttpEngine f62615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Executor f62616g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f62617h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f62618i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f62619j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f62620k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f62621l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.p0
    private final String f62622m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.p0
    private final g0.g f62623n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final g0.g f62624o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final androidx.media3.common.util.m f62625p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final androidx.media3.common.util.j f62626q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.p0
    private com.google.common.base.k0<String> f62627r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f62628s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f62629t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f62630u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.p0
    private x f62631v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.p0
    private d f62632w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.p0
    private ByteBuffer f62633x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.p0
    private UrlResponseInfo f62634y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.p0
    private IOException f62635z;

    public static final class a implements g0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HttpEngine f62636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Executor f62637b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        private com.google.common.base.k0<String> f62639d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.annotation.p0
        private r1 f62640e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @androidx.annotation.p0
        private String f62641f;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f62645j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f62646k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f62647l;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final g0.g f62638c = new g0.g();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f62642g = 3;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f62643h = 8000;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f62644i = 8000;

        public a(HttpEngine httpEngine, Executor executor) {
            this.f62636a = r0.a(androidx.media3.common.util.a.g(httpEngine));
            this.f62637b = executor;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public a c(int i10) {
            this.f62643h = i10;
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public a d(@androidx.annotation.p0 com.google.common.base.k0<String> k0Var) {
            this.f62639d = k0Var;
            return this;
        }

        @Override // androidx.media3.datasource.g0.c
        @androidx.media3.common.util.b1
        @z7.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final a b(Map<String, String> map) {
            this.f62638c.b(map);
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public a f(boolean z10) {
            this.f62646k = z10;
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public a g(boolean z10) {
            this.f62647l = z10;
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public a h(int i10) {
            this.f62644i = i10;
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public a i(int i10) {
            this.f62642g = i10;
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public a j(boolean z10) {
            this.f62645j = z10;
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public a k(@androidx.annotation.p0 r1 r1Var) {
            this.f62640e = r1Var;
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public a l(@androidx.annotation.p0 String str) {
            this.f62641f = str;
            return this;
        }

        @Override // androidx.media3.datasource.g0.c, androidx.media3.datasource.p.a
        @androidx.media3.common.util.b1
        public g0 a() {
            x0 x0Var = new x0(this.f62636a, this.f62637b, this.f62642g, this.f62643h, this.f62644i, this.f62645j, this.f62646k, this.f62641f, this.f62638c, this.f62639d, this.f62647l);
            r1 r1Var = this.f62640e;
            if (r1Var != null) {
                x0Var.s(r1Var);
            }
            return x0Var;
        }
    }

    final class c implements UrlRequest$Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile boolean f62649a = false;

        c() {
        }

        public void a() {
            this.f62649a = true;
        }

        public synchronized void onCanceled(UrlRequest urlRequest, @androidx.annotation.p0 UrlResponseInfo urlResponseInfo) {
        }

        public synchronized void onFailed(UrlRequest urlRequest, @androidx.annotation.p0 UrlResponseInfo urlResponseInfo, HttpException httpException) {
            try {
                if (this.f62649a) {
                    return;
                }
                if (y0.a(httpException) && z0.a(httpException).getErrorCode() == 1) {
                    x0.this.f62635z = new UnknownHostException();
                } else {
                    x0.this.f62635z = httpException;
                }
                x0.this.f62625p.f();
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public synchronized void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
            if (this.f62649a) {
                return;
            }
            x0.this.f62625p.f();
        }

        public synchronized void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
            try {
                if (this.f62649a) {
                    return;
                }
                x xVar = (x) androidx.media3.common.util.a.g(x0.this.f62631v);
                int httpStatusCode = urlResponseInfo.getHttpStatusCode();
                if (xVar.f62596c == 2 && (httpStatusCode == 307 || httpStatusCode == 308)) {
                    x0.this.f62635z = new g0.f(httpStatusCode, urlResponseInfo.getHttpStatusText(), null, urlResponseInfo.getHeaders().getAsMap(), xVar, androidx.media3.common.util.k1.f61545f);
                    x0.this.f62625p.f();
                    return;
                }
                if (x0.this.f62620k) {
                    x0.this.b0();
                }
                CookieHandler cookieManager = CookieHandler.getDefault();
                if (cookieManager == null && x0.this.f62621l) {
                    cookieManager = new CookieManager();
                }
                x0.e0(urlResponseInfo, cookieManager);
                String strT = x0.T(urlResponseInfo.getUrl(), urlResponseInfo.getHeaders().getAsMap(), cookieManager);
                boolean z10 = x0.this.f62628s && xVar.f62596c == 2 && httpStatusCode == 302;
                if (!z10 && (!x0.this.f62621l || TextUtils.isEmpty(strT))) {
                    urlRequest.followRedirect();
                    return;
                }
                urlRequest.cancel();
                x xVarI = (z10 || xVar.f62596c != 2) ? xVar.i(Uri.parse(str)) : xVar.a().k(str).e(1).d(null).a();
                if (!TextUtils.isEmpty(strT)) {
                    HashMap map = new HashMap();
                    map.putAll(xVar.f62598e);
                    map.put("Cookie", strT);
                    xVarI = xVarI.a().f(map).a();
                }
                try {
                    d dVarP = x0.this.P(xVarI);
                    if (x0.this.f62632w != null) {
                        x0.this.f62632w.a();
                    }
                    x0.this.f62632w = dVarP;
                    x0.this.f62632w.e();
                } catch (IOException e10) {
                    x0.this.f62635z = e10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public synchronized void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            try {
                if (this.f62649a) {
                    return;
                }
                x0.d0(urlResponseInfo);
                x0.this.f62634y = urlResponseInfo;
                x0.this.f62625p.f();
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public synchronized void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            if (this.f62649a) {
                return;
            }
            x0.this.A = true;
            x0.this.f62625p.f();
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final UrlRequest f62651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c f62652b;

        class a implements UrlRequest$StatusListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int[] f62653a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.media3.common.util.m f62654b;

            a(int[] iArr, androidx.media3.common.util.m mVar) {
                this.f62653a = iArr;
                this.f62654b = mVar;
            }

            public void onStatus(int i10) {
                this.f62653a[0] = i10;
                this.f62654b.f();
            }
        }

        d(UrlRequest urlRequest, c cVar) {
            this.f62651a = urlRequest;
            this.f62652b = cVar;
        }

        public void a() {
            this.f62652b.a();
            this.f62651a.cancel();
        }

        public int b() throws InterruptedException {
            androidx.media3.common.util.m mVar = new androidx.media3.common.util.m();
            int[] iArr = new int[1];
            this.f62651a.getStatus(new a(iArr, mVar));
            mVar.a();
            return iArr[0];
        }

        public c c() {
            return this.f62652b;
        }

        public void d(ByteBuffer byteBuffer) {
            this.f62651a.read(byteBuffer);
        }

        public void e() {
            this.f62651a.start();
        }
    }

    @androidx.media3.common.util.b1
    x0(HttpEngine httpEngine, Executor executor, int i10, int i11, int i12, boolean z10, boolean z11, @androidx.annotation.p0 String str, @androidx.annotation.p0 g0.g gVar, @androidx.annotation.p0 com.google.common.base.k0<String> k0Var, boolean z12) {
        super(true);
        this.f62615f = r0.a(androidx.media3.common.util.a.g(httpEngine));
        this.f62616g = (Executor) androidx.media3.common.util.a.g(executor);
        this.f62617h = i10;
        this.f62618i = i11;
        this.f62619j = i12;
        this.f62620k = z10;
        this.f62621l = z11;
        this.f62622m = str;
        this.f62623n = gVar;
        this.f62627r = k0Var;
        this.f62628s = z12;
        this.f62626q = androidx.media3.common.util.j.f61520a;
        this.f62624o = new g0.g();
        this.f62625p = new androidx.media3.common.util.m();
    }

    private boolean N() throws InterruptedException {
        long jB = this.f62626q.b();
        boolean zB = false;
        while (!zB && jB < this.B) {
            zB = this.f62625p.b((this.B - jB) + 5);
            jB = this.f62626q.b();
        }
        return zB;
    }

    private UrlRequest.Builder O(x xVar, UrlRequest$Callback urlRequest$Callback) throws IOException {
        UrlRequest.Builder directExecutorAllowed = this.f62615f.newUrlRequestBuilder(xVar.f62594a.toString(), this.f62616g, urlRequest$Callback).setPriority(this.f62617h).setDirectExecutorAllowed(true);
        HashMap map = new HashMap();
        g0.g gVar = this.f62623n;
        if (gVar != null) {
            map.putAll(gVar.c());
        }
        map.putAll(this.f62624o.c());
        map.putAll(xVar.f62598e);
        for (Map.Entry entry : map.entrySet()) {
            directExecutorAllowed.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        if (xVar.f62597d != null && !map.containsKey("Content-Type")) {
            throw new b("HTTP request with non-empty body must set Content-Type", xVar, 1004, 0);
        }
        String strA = g1.a(xVar.f62600g, xVar.f62601h);
        if (strA != null) {
            directExecutorAllowed.addHeader(com.google.common.net.d.I, strA);
        }
        String str = this.f62622m;
        if (str != null) {
            directExecutorAllowed.addHeader(com.google.common.net.d.P, str);
        }
        directExecutorAllowed.setHttpMethod(xVar.b());
        if (xVar.f62597d != null) {
            directExecutorAllowed.setUploadDataProvider(new l(xVar.f62597d), this.f62616g);
        }
        return directExecutorAllowed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public d P(x xVar) throws IOException {
        c cVar = new c();
        return new d(O(xVar, cVar).build(), cVar);
    }

    private static int Q(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int iMin = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer2.put(byteBuffer);
        byteBuffer.limit(iLimit);
        return iMin;
    }

    @androidx.annotation.l1
    static String R(String str) {
        return T(str, n6.q(), CookieHandler.getDefault());
    }

    @androidx.annotation.l1
    static String S(String str, @androidx.annotation.p0 CookieHandler cookieHandler) {
        return T(str, n6.q(), cookieHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String T(String str, Map<String, List<String>> map, @androidx.annotation.p0 CookieHandler cookieHandler) {
        List<String> list;
        if (cookieHandler == null) {
            return "";
        }
        Map<String, List<String>> mapQ = n6.q();
        try {
            mapQ = cookieHandler.get(new URI(str), map);
        } catch (Exception e10) {
            androidx.media3.common.util.z.o(F, "Failed to read cookies from CookieHandler", e10);
        }
        StringBuilder sb2 = new StringBuilder();
        if (mapQ.containsKey("Cookie") && (list = mapQ.get("Cookie")) != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                sb2.append(it.next());
                sb2.append("; ");
            }
        }
        return w0.a(sb2.toString());
    }

    @androidx.annotation.p0
    private static String V(Map<String, List<String>> map, String str) {
        List<String> list = map.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    private ByteBuffer W() {
        if (this.f62633x == null) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32768);
            this.f62633x = byteBufferAllocateDirect;
            byteBufferAllocateDirect.limit(0);
        }
        return this.f62633x;
    }

    private static boolean X(UrlResponseInfo urlResponseInfo) {
        for (Map.Entry entry : urlResponseInfo.getHeaders().getAsList()) {
            if (((String) entry.getKey()).equalsIgnoreCase(com.google.common.net.d.f119476b0)) {
                return !((String) entry.getValue()).equalsIgnoreCase("identity");
            }
        }
        return false;
    }

    private void Z(ByteBuffer byteBuffer, x xVar) throws g0.d {
        ((d) androidx.media3.common.util.k1.o(this.f62632w)).d(byteBuffer);
        int i10 = 3 << 0;
        try {
            if (!this.f62625p.b(this.f62619j)) {
                throw new SocketTimeoutException();
            }
        } catch (InterruptedException unused) {
            if (byteBuffer == this.f62633x) {
                this.f62633x = null;
            }
            Thread.currentThread().interrupt();
            this.f62635z = new InterruptedIOException();
        } catch (SocketTimeoutException e10) {
            if (byteBuffer == this.f62633x) {
                this.f62633x = null;
            }
            this.f62635z = new g0.d(e10, xVar, androidx.media3.common.x0.H1, 2);
        }
        IOException iOException = this.f62635z;
        if (iOException != null) {
            if (!(iOException instanceof g0.d)) {
                throw g0.d.c(iOException, xVar, 2);
            }
            throw ((g0.d) iOException);
        }
    }

    private byte[] a0() throws IOException {
        byte[] bArrCopyOf = androidx.media3.common.util.k1.f61545f;
        ByteBuffer byteBufferW = W();
        while (!this.A) {
            this.f62625p.d();
            byteBufferW.clear();
            Z(byteBufferW, (x) androidx.media3.common.util.k1.o(this.f62631v));
            byteBufferW.flip();
            if (byteBufferW.remaining() > 0) {
                int length = bArrCopyOf.length;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length + byteBufferW.remaining());
                byteBufferW.get(bArrCopyOf, length, byteBufferW.remaining());
            }
        }
        return bArrCopyOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0() {
        this.B = this.f62626q.b() + ((long) this.f62618i);
    }

    private void c0(long j10, x xVar) throws g0.d {
        if (j10 == 0) {
            return;
        }
        ByteBuffer byteBufferW = W();
        while (j10 > 0) {
            try {
                this.f62625p.d();
                byteBufferW.clear();
                Z(byteBufferW, xVar);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (this.A) {
                    throw new b(xVar, 2008, 14);
                }
                byteBufferW.flip();
                androidx.media3.common.util.a.i(byteBufferW.hasRemaining());
                int iMin = (int) Math.min(byteBufferW.remaining(), j10);
                byteBufferW.position(byteBufferW.position() + iMin);
                j10 -= (long) iMin;
            } catch (IOException e10) {
                if (e10 instanceof g0.d) {
                    throw ((g0.d) e10);
                }
                throw new b(e10, xVar, e10 instanceof SocketTimeoutException ? androidx.media3.common.x0.H1 : androidx.media3.common.x0.f61834p1, 14);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d0(UrlResponseInfo urlResponseInfo) {
        e0(urlResponseInfo, CookieHandler.getDefault());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e0(UrlResponseInfo urlResponseInfo, @androidx.annotation.p0 CookieHandler cookieHandler) {
        if (cookieHandler == null) {
            return;
        }
        try {
            cookieHandler.put(new URI(urlResponseInfo.getUrl()), urlResponseInfo.getHeaders().getAsMap());
        } catch (Exception e10) {
            androidx.media3.common.util.z.o(F, "Failed to store cookies in CookieHandler", e10);
        }
    }

    @androidx.media3.common.util.b1
    @androidx.annotation.l1
    @androidx.annotation.p0
    c U() {
        d dVar = this.f62632w;
        if (dVar == null) {
            return null;
        }
        return dVar.c();
    }

    @androidx.media3.common.util.b1
    public int Y(ByteBuffer byteBuffer) throws g0.d {
        int iQ;
        androidx.media3.common.util.a.i(this.f62629t);
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Passed buffer is not a direct ByteBuffer");
        }
        if (!byteBuffer.hasRemaining()) {
            return 0;
        }
        if (this.f62630u == 0) {
            return -1;
        }
        int iRemaining = byteBuffer.remaining();
        ByteBuffer byteBuffer2 = this.f62633x;
        if (byteBuffer2 != null && (iQ = Q(byteBuffer2, byteBuffer)) != 0) {
            long j10 = this.f62630u;
            if (j10 != -1) {
                this.f62630u = j10 - ((long) iQ);
            }
            u(iQ);
            return iQ;
        }
        this.f62625p.d();
        Z(byteBuffer, (x) androidx.media3.common.util.k1.o(this.f62631v));
        if (this.A) {
            this.f62630u = 0L;
            return -1;
        }
        androidx.media3.common.util.a.i(iRemaining > byteBuffer.remaining());
        int iRemaining2 = iRemaining - byteBuffer.remaining();
        long j11 = this.f62630u;
        if (j11 != -1) {
            this.f62630u = j11 - ((long) iRemaining2);
        }
        u(iRemaining2);
        return iRemaining2;
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    @androidx.media3.common.util.b1
    public Map<String, List<String>> a() {
        UrlResponseInfo urlResponseInfo = this.f62634y;
        return urlResponseInfo == null ? Collections.EMPTY_MAP : urlResponseInfo.getHeaders().getAsMap();
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    @androidx.media3.common.util.b1
    public long c(x xVar) throws g0.d {
        byte[] bArrA0;
        String strV;
        androidx.media3.common.util.a.g(xVar);
        androidx.media3.common.util.a.i(!this.f62629t);
        this.f62625p.d();
        b0();
        this.f62631v = xVar;
        try {
            d dVarP = P(xVar);
            this.f62632w = dVarP;
            dVarP.e();
            w(xVar);
            try {
                boolean zN = N();
                IOException iOException = this.f62635z;
                if (iOException != null) {
                    String message = iOException.getMessage();
                    if (message == null || !com.google.common.base.c.g(message).contains("err_cleartext_not_permitted")) {
                        throw new b(iOException, xVar, androidx.media3.common.x0.f61834p1, dVarP.b());
                    }
                    throw new g0.b(iOException, xVar);
                }
                if (!zN) {
                    throw new b(new SocketTimeoutException(), xVar, androidx.media3.common.x0.H1, dVarP.b());
                }
                UrlResponseInfo urlResponseInfoA = l0.a(androidx.media3.common.util.a.g(this.f62634y));
                int httpStatusCode = urlResponseInfoA.getHttpStatusCode();
                Map asMap = urlResponseInfoA.getHeaders().getAsMap();
                long j10 = 0;
                if (httpStatusCode < 200 || httpStatusCode > 299) {
                    if (httpStatusCode == 416) {
                        if (xVar.f62600g == g1.c(V(asMap, com.google.common.net.d.f119492f0))) {
                            this.f62629t = true;
                            x(xVar);
                            long j11 = xVar.f62601h;
                            if (j11 != -1) {
                                return j11;
                            }
                            return 0L;
                        }
                    }
                    try {
                        bArrA0 = a0();
                    } catch (IOException unused) {
                        bArrA0 = androidx.media3.common.util.k1.f61545f;
                    }
                    throw new g0.f(httpStatusCode, urlResponseInfoA.getHttpStatusText(), httpStatusCode == 416 ? new u(2008) : null, asMap, xVar, bArrA0);
                }
                com.google.common.base.k0<String> k0Var = this.f62627r;
                if (k0Var != null && (strV = V(asMap, "Content-Type")) != null && !k0Var.apply(strV)) {
                    throw new g0.e(strV, xVar);
                }
                if (httpStatusCode == 200) {
                    long j12 = xVar.f62600g;
                    if (j12 != 0) {
                        j10 = j12;
                    }
                }
                if (X(urlResponseInfoA)) {
                    this.f62630u = xVar.f62601h;
                } else {
                    long j13 = xVar.f62601h;
                    if (j13 != -1) {
                        this.f62630u = j13;
                    } else {
                        long jB = g1.b(V(asMap, "Content-Length"), V(asMap, com.google.common.net.d.f119492f0));
                        this.f62630u = jB != -1 ? jB - j10 : -1L;
                    }
                }
                this.f62629t = true;
                x(xVar);
                c0(j10, xVar);
                return this.f62630u;
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
                throw new b(new InterruptedIOException(), xVar, 1004, -1);
            }
        } catch (IOException e10) {
            if (e10 instanceof g0.d) {
                throw ((g0.d) e10);
            }
            throw new b(e10, xVar, 2000, 0);
        }
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    @androidx.media3.common.util.b1
    public synchronized void close() {
        try {
            d dVar = this.f62632w;
            if (dVar != null) {
                dVar.a();
                this.f62632w = null;
            }
            ByteBuffer byteBuffer = this.f62633x;
            if (byteBuffer != null) {
                byteBuffer.limit(0);
            }
            this.f62631v = null;
            this.f62634y = null;
            this.f62635z = null;
            this.A = false;
            if (this.f62629t) {
                this.f62629t = false;
                v();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // androidx.media3.datasource.g0
    @androidx.media3.common.util.b1
    public int f() {
        UrlResponseInfo urlResponseInfo = this.f62634y;
        if (urlResponseInfo == null || urlResponseInfo.getHttpStatusCode() <= 0) {
            return -1;
        }
        return this.f62634y.getHttpStatusCode();
    }

    @Override // androidx.media3.datasource.p
    @androidx.media3.common.util.b1
    @androidx.annotation.p0
    public Uri getUri() {
        UrlResponseInfo urlResponseInfo = this.f62634y;
        if (urlResponseInfo != null) {
            return Uri.parse(urlResponseInfo.getUrl());
        }
        x xVar = this.f62631v;
        if (xVar != null) {
            return xVar.f62594a;
        }
        return null;
    }

    @Override // androidx.media3.datasource.g0
    @androidx.media3.common.util.b1
    public void h() {
        this.f62624o.a();
    }

    @Override // androidx.media3.datasource.g0
    @androidx.media3.common.util.b1
    public void j(String str, String str2) {
        this.f62624o.e(str, str2);
    }

    @Override // androidx.media3.datasource.g0
    @androidx.media3.common.util.b1
    public void q(String str) {
        this.f62624o.d(str);
    }

    @Override // androidx.media3.common.l, androidx.media3.datasource.g0
    @androidx.media3.common.util.b1
    public int read(byte[] bArr, int i10, int i11) throws g0.d {
        androidx.media3.common.util.a.i(this.f62629t);
        if (i11 == 0) {
            return 0;
        }
        if (this.f62630u == 0) {
            return -1;
        }
        ByteBuffer byteBufferW = W();
        if (!byteBufferW.hasRemaining()) {
            this.f62625p.d();
            byteBufferW.clear();
            Z(byteBufferW, (x) androidx.media3.common.util.k1.o(this.f62631v));
            if (this.A) {
                this.f62630u = 0L;
                return -1;
            }
            byteBufferW.flip();
            androidx.media3.common.util.a.i(byteBufferW.hasRemaining());
        }
        long j10 = this.f62630u;
        if (j10 == -1) {
            j10 = Long.MAX_VALUE;
        }
        int iU = (int) com.google.common.primitives.n.u(j10, byteBufferW.remaining(), i11);
        byteBufferW.get(bArr, i10, iU);
        long j11 = this.f62630u;
        if (j11 != -1) {
            this.f62630u = j11 - ((long) iU);
        }
        u(iU);
        return iU;
    }

    @androidx.media3.common.util.b1
    public static final class b extends g0.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f62648h;

        public b(IOException iOException, x xVar, int i10, int i11) {
            super(iOException, xVar, i10, 1);
            this.f62648h = i11;
        }

        public b(String str, x xVar, int i10, int i11) {
            super(str, xVar, i10, 1);
            this.f62648h = i11;
        }

        public b(x xVar, int i10, int i11) {
            super(xVar, i10, 1);
            this.f62648h = i11;
        }
    }
}
