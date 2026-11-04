package io.sentry;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URLConnection;
import java.util.concurrent.RejectedExecutionException;
import java.util.zip.GZIPOutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class SpotlightIntegration implements x1, n8.c, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private n8 f303875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private ILogger f303876b = c3.e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private l1 f303877c = p3.g();

    private void d(@NotNull HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } finally {
            httpURLConnection.disconnect();
        }
    }

    @NotNull
    private HttpURLConnection e(@NotNull String str) throws Exception {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(URI.create(str).toURL().openConnection()));
        httpURLConnection.setReadTimeout(1000);
        httpURLConnection.setConnectTimeout(1000);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty(com.google.common.net.d.f119476b0, "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty(com.google.common.net.d.f119523o, "close");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(@NotNull g6 g6Var) {
        try {
            if (this.f303875a == null) {
                throw new IllegalArgumentException("SentryOptions are required to send envelopes.");
            }
            HttpURLConnection httpURLConnectionE = e(f());
            try {
                OutputStream outputStream = httpURLConnectionE.getOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                    try {
                        this.f303875a.getSerializer().b(g6Var, gZIPOutputStream);
                        gZIPOutputStream.close();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        this.f303876b.c(y7.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(httpURLConnectionE.getResponseCode()));
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
                    this.f303876b.a(y7.ERROR, "An exception occurred while submitting the envelope to the Sentry server.", th6);
                    this.f303876b.c(y7.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(httpURLConnectionE.getResponseCode()));
                } finally {
                    this.f303876b.c(y7.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(httpURLConnectionE.getResponseCode()));
                    d(httpURLConnectionE);
                }
            }
        } catch (Exception e10) {
            this.f303876b.a(y7.ERROR, "An exception occurred while creating the connection to spotlight.", e10);
        }
    }

    @Override // io.sentry.n8.c
    public void a(@NotNull final g6 g6Var, @Nullable n0 n0Var) {
        try {
            this.f303877c.submit(new Runnable() { // from class: io.sentry.y9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f307148a.g(g6Var);
                }
            });
        } catch (RejectedExecutionException e10) {
            this.f303876b.a(y7.WARNING, "Spotlight envelope submission rejected.", e10);
        }
    }

    @Override // io.sentry.x1
    public void c(@NotNull i1 i1Var, @NotNull n8 n8Var) {
        this.f303875a = n8Var;
        this.f303876b = n8Var.getLogger();
        if (n8Var.getBeforeEnvelopeCallback() != null || !n8Var.isEnableSpotlight()) {
            this.f303876b.c(y7.DEBUG, "SpotlightIntegration is not enabled. BeforeEnvelopeCallback is already set or spotlight is not enabled.", new Object[0]);
            return;
        }
        this.f303877c = new s7(n8Var);
        n8Var.setBeforeEnvelopeCallback(this);
        this.f303876b.c(y7.DEBUG, "SpotlightIntegration enabled.", new Object[0]);
        io.sentry.util.q.a("Spotlight");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f303877c.c(0L);
        n8 n8Var = this.f303875a;
        if (n8Var != null && n8Var.getBeforeEnvelopeCallback() == this) {
            this.f303875a.setBeforeEnvelopeCallback(null);
        }
    }

    @lm.n
    public String f() {
        n8 n8Var = this.f303875a;
        if (n8Var == null || n8Var.getSpotlightConnectionUrl() == null) {
            return io.sentry.util.a0.a() ? "http://10.0.2.2:8969/stream" : "http://localhost:8969/stream";
        }
        return this.f303875a.getSpotlightConnectionUrl();
    }
}
