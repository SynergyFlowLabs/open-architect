package io.sentry.transport;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.sentry.ILogger;
import io.sentry.g6;
import io.sentry.n8;
import io.sentry.o1;
import io.sentry.q4;
import io.sentry.y7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Charset f306889e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Proxy f306890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final q4 f306891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final n8 f306892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final a0 f306893d;

    public o(@NotNull n8 n8Var, @NotNull q4 q4Var, @NotNull a0 a0Var) {
        this(n8Var, q4Var, m.a(), a0Var);
    }

    private void a(@NotNull HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
            httpURLConnection.disconnect();
        } catch (IOException unused) {
            httpURLConnection.disconnect();
        } catch (Throwable th2) {
            httpURLConnection.disconnect();
            throw th2;
        }
    }

    @NotNull
    private HttpURLConnection b() throws IOException {
        HttpURLConnection httpURLConnectionF = f();
        for (Map.Entry<String, String> entry : this.f306891b.a().entrySet()) {
            httpURLConnectionF.setRequestProperty(entry.getKey(), entry.getValue());
        }
        httpURLConnectionF.setRequestMethod("POST");
        httpURLConnectionF.setDoOutput(true);
        httpURLConnectionF.setRequestProperty(com.google.common.net.d.f119476b0, "gzip");
        httpURLConnectionF.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        httpURLConnectionF.setRequestProperty("Accept", "application/json");
        httpURLConnectionF.setRequestProperty(com.google.common.net.d.f119523o, "close");
        httpURLConnectionF.setConnectTimeout(this.f306892c.getConnectionTimeoutMillis());
        httpURLConnectionF.setReadTimeout(this.f306892c.getReadTimeoutMillis());
        SSLSocketFactory sslSocketFactory = this.f306892c.getSslSocketFactory();
        if ((httpURLConnectionF instanceof HttpsURLConnection) && sslSocketFactory != null) {
            ((HttpsURLConnection) httpURLConnectionF).setSSLSocketFactory(sslSocketFactory);
        }
        httpURLConnectionF.connect();
        return httpURLConnectionF;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @NotNull
    private String c(@NotNull HttpURLConnection httpURLConnection) {
        try {
            InputStream errorStream = httpURLConnection.getErrorStream();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f306889e));
                try {
                    StringBuilder sb2 = new StringBuilder();
                    boolean z10 = true;
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (!z10) {
                            sb2.append("\n");
                        }
                        sb2.append(line);
                        z10 = false;
                        if (errorStream != null) {
                            try {
                                errorStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                    String string = sb2.toString();
                    bufferedReader.close();
                    if (errorStream != null) {
                        errorStream.close();
                    }
                    return string;
                } catch (Throwable th3) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                if (errorStream != null) {
                    errorStream.close();
                }
                throw th5;
            }
        } catch (IOException unused) {
            return "Failed to obtain error message while analyzing send failure.";
        }
    }

    private boolean e(int i10) {
        return i10 == 200;
    }

    @NotNull
    private d0 g(@NotNull HttpURLConnection httpURLConnection) {
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                j(httpURLConnection, responseCode);
                if (e(responseCode)) {
                    this.f306892c.getLogger().c(y7.DEBUG, "Envelope sent successfully.", new Object[0]);
                    d0 d0VarE = d0.e();
                    a(httpURLConnection);
                    return d0VarE;
                }
                ILogger logger = this.f306892c.getLogger();
                y7 y7Var = y7.ERROR;
                logger.c(y7Var, "Request failed, API returned %s", Integer.valueOf(responseCode));
                if (this.f306892c.isDebug()) {
                    this.f306892c.getLogger().c(y7Var, "%s", c(httpURLConnection));
                }
                d0 d0VarB = d0.b(responseCode);
                a(httpURLConnection);
                return d0VarB;
            } catch (IOException e10) {
                this.f306892c.getLogger().b(y7.ERROR, e10, "Error reading and logging the response stream", new Object[0]);
                a(httpURLConnection);
                return d0.a();
            }
        } catch (Throwable th2) {
            a(httpURLConnection);
            throw th2;
        }
    }

    @Nullable
    private Proxy h(@Nullable n8.l lVar) {
        if (lVar != null) {
            String strC = lVar.c();
            String strA = lVar.a();
            if (strC != null && strA != null) {
                try {
                    return new Proxy(lVar.d() != null ? lVar.d() : Proxy.Type.HTTP, new InetSocketAddress(strA, Integer.parseInt(strC)));
                } catch (NumberFormatException e10) {
                    this.f306892c.getLogger().b(y7.ERROR, e10, "Failed to parse Sentry Proxy port: " + lVar.c() + ". Proxy is ignored", new Object[0]);
                }
            }
        }
        return null;
    }

    @lm.n
    @Nullable
    Proxy d() {
        return this.f306890a;
    }

    @NotNull
    HttpURLConnection f() throws IOException {
        return (HttpURLConnection) (this.f306890a == null ? (URLConnection) FirebasePerfUrlConnection.instrument(this.f306891b.b().openConnection()) : (URLConnection) FirebasePerfUrlConnection.instrument(this.f306891b.b().openConnection(this.f306890a)));
    }

    @NotNull
    public d0 i(@NotNull g6 g6Var) throws IOException {
        this.f306892c.getSocketTagger().b();
        HttpURLConnection httpURLConnectionB = b();
        try {
            OutputStream outputStream = httpURLConnectionB.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f306892c.getSerializer().b(g6Var, gZIPOutputStream);
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                } catch (Throwable th2) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        } catch (Throwable th6) {
            try {
                this.f306892c.getLogger().b(y7.ERROR, th6, "An exception occurred while submitting the envelope to the Sentry server.", new Object[0]);
            } finally {
                g(httpURLConnectionB);
                this.f306892c.getSocketTagger().a();
            }
        }
        d0 d0VarG = g(httpURLConnectionB);
        o1 socketTagger = this.f306892c.getSocketTagger();
        return d0VarG;
    }

    public void j(@NotNull HttpURLConnection httpURLConnection, int i10) {
        String headerField = httpURLConnection.getHeaderField(com.google.common.net.d.B0);
        this.f306893d.x(httpURLConnection.getHeaderField("X-Sentry-Rate-Limits"), headerField, i10);
    }

    o(@NotNull n8 n8Var, @NotNull q4 q4Var, @NotNull m mVar, @NotNull a0 a0Var) {
        this.f306891b = q4Var;
        this.f306892c = n8Var;
        this.f306893d = a0Var;
        Proxy proxyH = h(n8Var.getProxy());
        this.f306890a = proxyH;
        if (proxyH != null && n8Var.getProxy() != null) {
            String strE = n8Var.getProxy().e();
            String strB = n8Var.getProxy().b();
            if (strE != null && strB != null) {
                mVar.b(new v(strE, strB));
            }
        }
    }
}
