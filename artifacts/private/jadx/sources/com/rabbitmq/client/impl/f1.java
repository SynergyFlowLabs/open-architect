package com.rabbitmq.client.impl;

import com.devtodev.analytics.internal.storage.sqlite.PeopleCardEntry;
import com.facebook.AccessToken;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* JADX INFO: loaded from: classes13.dex */
public class f1 extends i1<c> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f265176p = "UTF-8";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f265177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f265178g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f265179h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f265180i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map<String, String> f265181j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ObjectMapper f265182k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f265183l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final HostnameVerifier f265184m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SSLSocketFactory f265185n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Consumer<HttpURLConnection> f265186o;

    public static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f265188b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f265189c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f265190d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Consumer<HttpURLConnection> f265192f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<String, String> f265187a = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f265191e = net.openid.appauth.z.A;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private b f265193g = new b(this);

        public f1 a() {
            return new f1(this.f265188b, this.f265189c, this.f265190d, this.f265191e, this.f265187a, this.f265193g.f265195b, this.f265193g.h(), this.f265192f);
        }

        public a b(String str) {
            this.f265189c = str;
            return this;
        }

        public a c(String str) {
            this.f265190d = str;
            return this;
        }

        public a d(Consumer<HttpURLConnection> consumer) {
            this.f265192f = consumer;
            return this;
        }

        public a e(String str) {
            this.f265191e = str;
            return this;
        }

        public a f(String str, String str2) {
            this.f265187a.put(str, str2);
            return this;
        }

        public b g() {
            return this.f265193g;
        }

        public a h(String str) {
            this.f265188b = str;
            return this;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f265194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HostnameVerifier f265195b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private SSLSocketFactory f265196c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private SSLContext f265197d;

        public b(a aVar) {
            this.f265194a = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SSLSocketFactory h() {
            SSLSocketFactory sSLSocketFactory = this.f265196c;
            if (sSLSocketFactory != null) {
                return sSLSocketFactory;
            }
            SSLContext sSLContext = this.f265197d;
            if (sSLContext != null) {
                return sSLContext.getSocketFactory();
            }
            return null;
        }

        public a c() {
            return this.f265194a;
        }

        public b d() {
            try {
                SSLContext sSLContext = SSLContext.getInstance(com.rabbitmq.client.r.c(SSLContext.getDefault().getSupportedSSLParameters().getProtocols()));
                sSLContext.init(null, new TrustManager[]{new com.rabbitmq.client.h2()}, null);
                this.f265197d = sSLContext;
                return this;
            } catch (KeyManagementException | NoSuchAlgorithmException e10) {
                throw new g1("Error while creating TLS context for development configuration", e10);
            }
        }

        public b e(HostnameVerifier hostnameVerifier) {
            this.f265195b = hostnameVerifier;
            return this;
        }

        public b f(SSLContext sSLContext) {
            this.f265197d = sSLContext;
            return this;
        }

        public b g(SSLSocketFactory sSLSocketFactory) {
            this.f265196c = sSLSocketFactory;
            return this;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f265198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f265199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Instant f265200c;

        public c(String str, int i10, Instant instant) {
            this.f265198a = str;
            this.f265199b = i10;
            this.f265200c = instant;
        }

        public String a() {
            return this.f265198a;
        }

        public int b() {
            return this.f265199b;
        }

        public Instant c() {
            return this.f265200c;
        }

        public Duration d() {
            return Duration.ofSeconds(((long) this.f265199b) - this.f265200c.until(Instant.now(), ChronoUnit.SECONDS));
        }
    }

    public f1(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, new HashMap());
    }

    public static /* synthetic */ void i(HttpURLConnection httpURLConnection) {
    }

    private static String j(String str, String str2) {
        String str3 = str + ":" + str2;
        Charset charset = StandardCharsets.ISO_8859_1;
        return "Basic " + new String(Base64.getEncoder().encode(str3.getBytes(charset)), charset);
    }

    private static String o(String str, String str2) throws UnsupportedEncodingException {
        return URLEncoder.encode(str, str2);
    }

    private static StringBuilder p(StringBuilder sb2, String str, String str2) throws UnsupportedEncodingException {
        if (str2 != null) {
            if (sb2.length() > 0) {
                sb2.append("&");
            }
            sb2.append(o(str, "UTF-8"));
            sb2.append("=");
            sb2.append(o(str2, "UTF-8"));
        }
        return sb2;
    }

    @Override // com.rabbitmq.client.impl.i1, com.rabbitmq.client.impl.e0
    public String d() {
        return "";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f265183l.equals(((f1) obj).f265183l);
    }

    public int hashCode() {
        return this.f265183l.hashCode();
    }

    protected void k(String str) throws g1 {
        if (str == null || !str.toLowerCase().contains(PeopleCardEntry.json)) {
            throw new g1("HTTP request for token retrieval is not JSON: " + str);
        }
    }

    protected void l(int i10) throws g1 {
        if (i10 == 200) {
            return;
        }
        throw new g1("HTTP request for token retrieval did not return 200 response code: " + i10);
    }

    protected void m(HttpURLConnection httpURLConnection) {
        this.f265186o.accept(httpURLConnection);
        n(httpURLConnection);
    }

    protected void n(HttpURLConnection httpURLConnection) {
        if (httpURLConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            HostnameVerifier hostnameVerifier = this.f265184m;
            if (hostnameVerifier != null) {
                httpsURLConnection.setHostnameVerifier(hostnameVerifier);
            }
            SSLSocketFactory sSLSocketFactory = this.f265185n;
            if (sSLSocketFactory != null) {
                httpsURLConnection.setSSLSocketFactory(sSLSocketFactory);
            }
        }
    }

    protected String q(InputStream inputStream) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    return stringBuffer.toString();
                }
                stringBuffer.append(line);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th4) {
                        th2.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
        }
    }

    protected c r(String str) {
        try {
            Map map = (Map) this.f265182k.readValue(str, Map.class);
            return new c(map.get("access_token").toString(), ((Number) map.get(AccessToken.f98369n)).intValue(), Instant.now());
        } catch (IOException e10) {
            throw new g1("Error while parsing OAuth 2 token", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.rabbitmq.client.impl.i1
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public String e(c cVar) {
        return cVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.rabbitmq.client.impl.i1
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public c f() {
        try {
            StringBuilder sb2 = new StringBuilder();
            p(sb2, "grant_type", this.f265180i);
            for (Map.Entry<String, String> entry : this.f265181j.entrySet()) {
                p(sb2, entry.getKey(), entry.getValue());
            }
            byte[] bytes = sb2.toString().getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(this.f265177f).openConnection()));
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("authorization", j(this.f265178g, this.f265179h));
            httpURLConnection.setRequestProperty("content-type", "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty(hi.c.C1916c.f285814c, "UTF-8");
            httpURLConnection.setRequestProperty("accept", "application/json");
            httpURLConnection.setRequestProperty("content-length", Integer.toString(length));
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setReadTimeout(60000);
            m(httpURLConnection);
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            try {
                dataOutputStream.write(bytes);
                dataOutputStream.close();
                l(httpURLConnection.getResponseCode());
                k(httpURLConnection.getHeaderField("content-type"));
                return r(q(httpURLConnection.getInputStream()));
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        dataOutputStream.close();
                    } catch (Throwable th4) {
                        th2.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
        } catch (IOException e10) {
            throw new g1("Error while retrieving OAuth 2 token", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.rabbitmq.client.impl.i1
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public Duration g(c cVar) {
        return cVar.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.rabbitmq.client.impl.i1
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public String h(c cVar) {
        return "";
    }

    public f1(String str, String str2, String str3, String str4, Map<String, String> map) {
        this(str, str2, str3, str4, map, null, null, null);
    }

    public f1(String str, String str2, String str3, String str4, Map<String, String> map, Consumer<HttpURLConnection> consumer) {
        this(str, str2, str3, str4, map, null, null, consumer);
    }

    public f1(String str, String str2, String str3, String str4, HostnameVerifier hostnameVerifier, SSLSocketFactory sSLSocketFactory) {
        this(str, str2, str3, str4, new HashMap(), hostnameVerifier, sSLSocketFactory, null);
    }

    public f1(String str, String str2, String str3, String str4, Map<String, String> map, HostnameVerifier hostnameVerifier, SSLSocketFactory sSLSocketFactory) {
        this(str, str2, str3, str4, map, hostnameVerifier, sSLSocketFactory, null);
    }

    public f1(String str, String str2, String str3, String str4, Map<String, String> map, HostnameVerifier hostnameVerifier, SSLSocketFactory sSLSocketFactory, Consumer<HttpURLConnection> consumer) {
        this.f265182k = new ObjectMapper();
        this.f265177f = str;
        this.f265178g = str2;
        this.f265179h = str3;
        this.f265180i = str4;
        this.f265181j = Collections.unmodifiableMap(new HashMap(map));
        this.f265184m = hostnameVerifier;
        this.f265185n = sSLSocketFactory;
        this.f265186o = consumer == null ? new Consumer() { // from class: com.rabbitmq.client.impl.e1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                f1.i((HttpURLConnection) obj);
            }
        } : consumer;
        this.f265183l = UUID.randomUUID().toString();
    }
}
