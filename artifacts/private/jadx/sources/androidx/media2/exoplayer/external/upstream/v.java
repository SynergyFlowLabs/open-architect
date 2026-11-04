package androidx.media2.exoplayer.external.upstream;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.b1;
import androidx.annotation.l1;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.superwall.sdk.network.Api;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public class v extends e implements e0 {
    private static final int A = 308;
    private static final long B = 2048;
    private static final Pattern C = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference<byte[]> D = new AtomicReference<>();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f57466v = 8000;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f57467w = 8000;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f57468x = "DefaultHttpDataSource";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f57469y = 20;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f57470z = 307;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f57471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f57472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f57473h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f57474i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    private final e0.f f57475j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final e0.f f57476k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media2.exoplayer.external.util.z<String> f57477l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.p0
    private o f57478m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.p0
    private HttpURLConnection f57479n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.p0
    private InputStream f57480o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f57481p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f57482q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f57483r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f57484s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f57485t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f57486u;

    public v(String userAgent) {
        this(userAgent, 8000, 8000);
    }

    private void n() {
        HttpURLConnection httpURLConnection = this.f57479n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                androidx.media2.exoplayer.external.util.p.e(f57468x, "Unexpected error while disconnecting", e10);
            }
            this.f57479n = null;
        }
    }

    private static long p(HttpURLConnection connection) {
        long j10;
        String headerField = connection.getHeaderField("Content-Length");
        if (TextUtils.isEmpty(headerField)) {
            j10 = -1;
        } else {
            try {
                j10 = Long.parseLong(headerField);
            } catch (NumberFormatException unused) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(headerField).length() + 28);
                sb2.append("Unexpected Content-Length [");
                sb2.append(headerField);
                sb2.append("]");
                androidx.media2.exoplayer.external.util.p.d(f57468x, sb2.toString());
                j10 = -1;
            }
        }
        String headerField2 = connection.getHeaderField(com.google.common.net.d.f119492f0);
        if (TextUtils.isEmpty(headerField2)) {
            return j10;
        }
        Matcher matcher = C.matcher(headerField2);
        if (!matcher.find()) {
            return j10;
        }
        try {
            long j11 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
            if (j10 < 0) {
                return j11;
            }
            if (j10 == j11) {
                return j10;
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(headerField).length() + 26 + String.valueOf(headerField2).length());
            sb3.append("Inconsistent headers [");
            sb3.append(headerField);
            sb3.append("] [");
            sb3.append(headerField2);
            sb3.append("]");
            androidx.media2.exoplayer.external.util.p.l(f57468x, sb3.toString());
            return Math.max(j10, j11);
        } catch (NumberFormatException unused2) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(headerField2).length() + 27);
            sb4.append("Unexpected Content-Range [");
            sb4.append(headerField2);
            sb4.append("]");
            androidx.media2.exoplayer.external.util.p.d(f57468x, sb4.toString());
            return j10;
        }
    }

    private static URL r(URL originalUrl, String location) throws IOException {
        if (location == null) {
            throw new ProtocolException("Null location redirect");
        }
        URL url = new URL(originalUrl, location);
        String protocol = url.getProtocol();
        if (Api.scheme.equals(protocol) || "http".equals(protocol)) {
            return url;
        }
        String strValueOf = String.valueOf(protocol);
        throw new ProtocolException(strValueOf.length() != 0 ? "Unsupported protocol redirect: ".concat(strValueOf) : new String("Unsupported protocol redirect: "));
    }

    private static boolean s(HttpURLConnection connection) {
        return "gzip".equalsIgnoreCase(connection.getHeaderField(com.google.common.net.d.f119476b0));
    }

    private HttpURLConnection t(o dataSpec) throws IOException {
        char c10;
        URL urlR;
        byte[] bArr;
        URL url = new URL(dataSpec.f57370a.toString());
        int i10 = dataSpec.f57371b;
        byte[] bArr2 = dataSpec.f57372c;
        long j10 = dataSpec.f57375f;
        long j11 = dataSpec.f57376g;
        int i11 = 1;
        boolean zC = dataSpec.c(1);
        char c11 = 2;
        boolean zC2 = dataSpec.c(2);
        if (!this.f57471f) {
            return u(url, i10, bArr2, j10, j11, zC, zC2, true, dataSpec.f57373d);
        }
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            if (i12 > 20) {
                StringBuilder sb2 = new StringBuilder(31);
                sb2.append("Too many redirects: ");
                sb2.append(i13);
                throw new NoRouteToHostException(sb2.toString());
            }
            long j12 = j10;
            URL url2 = url;
            long j13 = j11;
            int i14 = i10;
            byte[] bArr3 = bArr2;
            int i15 = i11;
            HttpURLConnection httpURLConnectionU = u(url2, i14, bArr3, j12, j13, zC, zC2, false, dataSpec.f57373d);
            j10 = j12;
            int i16 = i14;
            j11 = j13;
            int responseCode = httpURLConnectionU.getResponseCode();
            String headerField = httpURLConnectionU.getHeaderField(com.google.common.net.d.f119539t0);
            if ((i16 == i15 || i16 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                c10 = 2;
                httpURLConnectionU.disconnect();
                urlR = r(url2, headerField);
                bArr = bArr3;
            } else {
                c10 = 2;
                if (i16 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return httpURLConnectionU;
                }
                httpURLConnectionU.disconnect();
                urlR = r(url2, headerField);
                bArr = null;
                i16 = 1;
            }
            int i17 = i16;
            c11 = c10;
            i10 = i17;
            i12 = i13;
            url = urlR;
            bArr2 = bArr;
            i11 = 1;
        }
    }

    private HttpURLConnection u(URL url, int httpMethod, byte[] httpBody, long position, long length, boolean allowGzip, boolean allowIcyMetadata, boolean followRedirects, Map<String, String> requestParameters) throws IOException {
        HttpURLConnection httpURLConnectionW = w(url);
        httpURLConnectionW.setConnectTimeout(this.f57472g);
        httpURLConnectionW.setReadTimeout(this.f57473h);
        HashMap map = new HashMap();
        e0.f fVar = this.f57475j;
        if (fVar != null) {
            map.putAll(fVar.c());
        }
        map.putAll(this.f57476k.c());
        map.putAll(requestParameters);
        for (Map.Entry entry : map.entrySet()) {
            httpURLConnectionW.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (position != 0 || length != -1) {
            StringBuilder sb2 = new StringBuilder(27);
            sb2.append("bytes=");
            sb2.append(position);
            sb2.append("-");
            String string = sb2.toString();
            if (length != -1) {
                String strValueOf = String.valueOf(string);
                StringBuilder sb3 = new StringBuilder(strValueOf.length() + 20);
                sb3.append(strValueOf);
                sb3.append((position + length) - 1);
                string = sb3.toString();
            }
            httpURLConnectionW.setRequestProperty(com.google.common.net.d.I, string);
        }
        httpURLConnectionW.setRequestProperty(com.google.common.net.d.P, this.f57474i);
        httpURLConnectionW.setRequestProperty(com.google.common.net.d.f119507j, allowGzip ? "gzip" : "identity");
        if (allowIcyMetadata) {
            httpURLConnectionW.setRequestProperty("Icy-MetaData", "1");
        }
        httpURLConnectionW.setInstanceFollowRedirects(followRedirects);
        httpURLConnectionW.setDoOutput(httpBody != null);
        httpURLConnectionW.setRequestMethod(o.b(httpMethod));
        if (httpBody == null) {
            httpURLConnectionW.connect();
            return httpURLConnectionW;
        }
        httpURLConnectionW.setFixedLengthStreamingMode(httpBody.length);
        httpURLConnectionW.connect();
        OutputStream outputStream = httpURLConnectionW.getOutputStream();
        outputStream.write(httpBody);
        outputStream.close();
        return httpURLConnectionW;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002d A[Catch: Exception -> 0x0064, TryCatch #0 {Exception -> 0x0064, blocks: (B:7:0x000c, B:9:0x001a, B:15:0x002d, B:17:0x0041, B:19:0x004b), top: B:23:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:19:0x004b A[Catch: Exception -> 0x0064, TRY_LEAVE, TryCatch #0 {Exception -> 0x0064, blocks: (B:7:0x000c, B:9:0x001a, B:15:0x002d, B:17:0x0041, B:19:0x004b), top: B:23:0x000c }] */
    private static void v(HttpURLConnection connection, long bytesRemaining) {
        String name;
        int i10 = androidx.media2.exoplayer.external.util.q0.f57626a;
        if (i10 == 19 || i10 == 20) {
            try {
                InputStream inputStream = connection.getInputStream();
                if (bytesRemaining == -1) {
                    if (inputStream.read() != -1) {
                        name = inputStream.getClass().getName();
                        if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                            int i11 = 1 >> 0;
                            Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", null);
                            declaredMethod.setAccessible(true);
                            declaredMethod.invoke(inputStream, null);
                        }
                    }
                } else if (bytesRemaining > 2048) {
                    name = inputStream.getClass().getName();
                    if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name)) {
                        int i12 = 1 >> 0;
                        Method declaredMethod2 = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", null);
                        declaredMethod2.setAccessible(true);
                        declaredMethod2.invoke(inputStream, null);
                    } else {
                        int i13 = 1 >> 0;
                        Method declaredMethod3 = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", null);
                        declaredMethod3.setAccessible(true);
                        declaredMethod3.invoke(inputStream, null);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    private int x(byte[] buffer, int offset, int readLength) throws IOException {
        if (readLength == 0) {
            return 0;
        }
        long j10 = this.f57484s;
        if (j10 != -1) {
            long j11 = j10 - this.f57486u;
            if (j11 == 0) {
                return -1;
            }
            readLength = (int) Math.min(readLength, j11);
        }
        int i10 = this.f57480o.read(buffer, offset, readLength);
        if (i10 == -1) {
            if (this.f57484s == -1) {
                return -1;
            }
            throw new EOFException();
        }
        this.f57486u += (long) i10;
        d(i10);
        return i10;
    }

    private void z() throws IOException {
        if (this.f57485t == this.f57483r) {
            return;
        }
        byte[] andSet = D.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[4096];
        }
        while (true) {
            long j10 = this.f57485t;
            long j11 = this.f57483r;
            if (j10 == j11) {
                D.set(andSet);
                return;
            }
            int i10 = this.f57480o.read(andSet, 0, (int) Math.min(j11 - j10, andSet.length));
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedIOException();
            }
            if (i10 == -1) {
                throw new EOFException();
            }
            this.f57485t += (long) i10;
            d(i10);
        }
    }

    @Override // androidx.media2.exoplayer.external.upstream.e, androidx.media2.exoplayer.external.upstream.l
    public Map<String, List<String>> a() {
        HttpURLConnection httpURLConnection = this.f57479n;
        return httpURLConnection == null ? Collections.EMPTY_MAP : httpURLConnection.getHeaderFields();
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public long b(o dataSpec) throws e0.c {
        this.f57478m = dataSpec;
        long j10 = 0;
        this.f57486u = 0L;
        this.f57485t = 0L;
        g(dataSpec);
        try {
            HttpURLConnection httpURLConnectionT = t(dataSpec);
            this.f57479n = httpURLConnectionT;
            try {
                this.f57482q = httpURLConnectionT.getResponseCode();
                String responseMessage = this.f57479n.getResponseMessage();
                int i10 = this.f57482q;
                if (i10 < 200 || i10 > 299) {
                    Map<String, List<String>> headerFields = this.f57479n.getHeaderFields();
                    n();
                    e0.e eVar = new e0.e(this.f57482q, responseMessage, headerFields, dataSpec);
                    if (this.f57482q != 416) {
                        throw eVar;
                    }
                    eVar.initCause(new m(0));
                    throw eVar;
                }
                String contentType = this.f57479n.getContentType();
                androidx.media2.exoplayer.external.util.z<String> zVar = this.f57477l;
                if (zVar != null && !zVar.a(contentType)) {
                    n();
                    throw new e0.d(contentType, dataSpec);
                }
                if (this.f57482q == 200) {
                    long j11 = dataSpec.f57375f;
                    if (j11 != 0) {
                        j10 = j11;
                    }
                }
                this.f57483r = j10;
                boolean zS = s(this.f57479n);
                if (zS) {
                    this.f57484s = dataSpec.f57376g;
                } else {
                    long j12 = dataSpec.f57376g;
                    if (j12 != -1) {
                        this.f57484s = j12;
                    } else {
                        long jP = p(this.f57479n);
                        this.f57484s = jP != -1 ? jP - this.f57483r : -1L;
                    }
                }
                try {
                    this.f57480o = this.f57479n.getInputStream();
                    if (zS) {
                        this.f57480o = new GZIPInputStream(this.f57480o);
                    }
                    this.f57481p = true;
                    i(dataSpec);
                    return this.f57484s;
                } catch (IOException e10) {
                    n();
                    throw new e0.c(e10, dataSpec, 1);
                }
            } catch (IOException e11) {
                n();
                String strValueOf = String.valueOf(dataSpec.f57370a.toString());
                throw new e0.c(strValueOf.length() != 0 ? "Unable to connect to ".concat(strValueOf) : new String("Unable to connect to "), e11, dataSpec, 1);
            }
        } catch (IOException e12) {
            String strValueOf2 = String.valueOf(dataSpec.f57370a.toString());
            throw new e0.c(strValueOf2.length() != 0 ? "Unable to connect to ".concat(strValueOf2) : new String("Unable to connect to "), e12, dataSpec, 1);
        }
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public void close() throws e0.c {
        try {
            if (this.f57480o != null) {
                v(this.f57479n, l());
                try {
                    this.f57480o.close();
                } catch (IOException e10) {
                    throw new e0.c(e10, this.f57478m, 3);
                }
            }
            this.f57480o = null;
            n();
            if (this.f57481p) {
                this.f57481p = false;
                e();
            }
        } catch (Throwable th2) {
            this.f57480o = null;
            n();
            if (this.f57481p) {
                this.f57481p = false;
                e();
            }
            throw th2;
        }
    }

    @Override // androidx.media2.exoplayer.external.upstream.e0
    public int f() {
        int i10;
        if (this.f57479n == null || (i10 = this.f57482q) <= 0) {
            return -1;
        }
        return i10;
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    @androidx.annotation.p0
    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.f57479n;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // androidx.media2.exoplayer.external.upstream.e0
    public void h() {
        this.f57476k.a();
    }

    @Override // androidx.media2.exoplayer.external.upstream.e0
    public void j(String name, String value) {
        androidx.media2.exoplayer.external.util.a.g(name);
        androidx.media2.exoplayer.external.util.a.g(value);
        this.f57476k.e(name, value);
    }

    protected final long k() {
        return this.f57486u;
    }

    protected final long l() {
        long j10 = this.f57484s;
        return j10 == -1 ? j10 : j10 - this.f57486u;
    }

    protected final long m() {
        return this.f57485t;
    }

    @androidx.annotation.p0
    protected final HttpURLConnection o() {
        return this.f57479n;
    }

    @Override // androidx.media2.exoplayer.external.upstream.e0
    public void q(String name) {
        androidx.media2.exoplayer.external.util.a.g(name);
        this.f57476k.d(name);
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public int read(byte[] buffer, int offset, int readLength) throws e0.c {
        try {
            z();
            return x(buffer, offset, readLength);
        } catch (IOException e10) {
            throw new e0.c(e10, this.f57478m, 2);
        }
    }

    @l1
    HttpURLConnection w(URL url) throws IOException {
        return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
    }

    public void y(@androidx.annotation.p0 androidx.media2.exoplayer.external.util.z<String> contentTypePredicate) {
        this.f57477l = contentTypePredicate;
    }

    public v(String userAgent, int connectTimeoutMillis, int readTimeoutMillis) {
        this(userAgent, connectTimeoutMillis, readTimeoutMillis, false, null);
    }

    public v(String userAgent, int connectTimeoutMillis, int readTimeoutMillis, boolean allowCrossProtocolRedirects, @androidx.annotation.p0 e0.f defaultRequestProperties) {
        super(true);
        this.f57474i = androidx.media2.exoplayer.external.util.a.e(userAgent);
        this.f57476k = new e0.f();
        this.f57472g = connectTimeoutMillis;
        this.f57473h = readTimeoutMillis;
        this.f57471f = allowCrossProtocolRedirects;
        this.f57475j = defaultRequestProperties;
    }

    @Deprecated
    public v(String userAgent, @androidx.annotation.p0 androidx.media2.exoplayer.external.util.z<String> contentTypePredicate) {
        this(userAgent, contentTypePredicate, 8000, 8000);
    }

    @Deprecated
    public v(String userAgent, @androidx.annotation.p0 androidx.media2.exoplayer.external.util.z<String> contentTypePredicate, int connectTimeoutMillis, int readTimeoutMillis) {
        this(userAgent, contentTypePredicate, connectTimeoutMillis, readTimeoutMillis, false, null);
    }

    @Deprecated
    public v(String userAgent, @androidx.annotation.p0 androidx.media2.exoplayer.external.util.z<String> contentTypePredicate, int connectTimeoutMillis, int readTimeoutMillis, boolean allowCrossProtocolRedirects, @androidx.annotation.p0 e0.f defaultRequestProperties) {
        super(true);
        this.f57474i = androidx.media2.exoplayer.external.util.a.e(userAgent);
        this.f57477l = contentTypePredicate;
        this.f57476k = new e0.f();
        this.f57472g = connectTimeoutMillis;
        this.f57473h = readTimeoutMillis;
        this.f57471f = allowCrossProtocolRedirects;
        this.f57475j = defaultRequestProperties;
    }
}
