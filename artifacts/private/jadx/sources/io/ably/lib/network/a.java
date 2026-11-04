package io.ably.lib.network;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Proxy f287424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f287425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HttpURLConnection f287426c;

    a(n nVar, Proxy proxy) {
        this.f287425b = nVar;
        this.f287424a = proxy;
    }

    private byte[] a(i iVar) throws IOException {
        this.f287426c.setDoOutput(true);
        byte[] bArrB = iVar.b();
        this.f287426c.setFixedLengthStreamingMode(bArrB.length);
        return bArrB;
    }

    private byte[] b(InputStream inputStream, int i10) throws IOException {
        if (inputStream == null) {
            throw new NullPointerException("inputStream == null");
        }
        int i11 = 0;
        if (i10 == -1) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            while (true) {
                int i12 = inputStream.read(bArr);
                if (i12 <= -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i12);
            }
        } else {
            byte[] bArr2 = new byte[i10];
            while (true) {
                int i13 = inputStream.read(bArr2, i11, i10 - i11);
                if (i13 <= -1) {
                    return bArr2;
                }
                i11 += i13;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private o c() throws IOException {
        InputStream errorStream;
        o.a aVarA = o.a();
        int responseCode = this.f287426c.getResponseCode();
        aVarA.c(responseCode).e(this.f287426c.getResponseMessage());
        Map<String, List<String>> headerFields = this.f287426c.getHeaderFields();
        HashMap map = new HashMap(headerFields.size(), 1.0f);
        for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
            if (entry.getKey() != null) {
                map.put(entry.getKey().toLowerCase(Locale.ROOT), entry.getValue());
            }
        }
        aVarA.d(map);
        if (responseCode == 204) {
            return aVarA.b();
        }
        String contentType = this.f287426c.getContentType();
        int contentLength = this.f287426c.getContentLength();
        try {
            errorStream = this.f287426c.getInputStream();
        } catch (Throwable unused) {
            errorStream = null;
        }
        if (errorStream == null) {
            errorStream = this.f287426c.getErrorStream();
        }
        try {
            aVarA.a(new i(contentType, b(errorStream, contentLength)));
            if (errorStream != null) {
                try {
                    errorStream.close();
                } catch (IOException unused2) {
                }
            }
        } catch (NullPointerException unused3) {
            if (errorStream != null) {
                errorStream.close();
            }
        } catch (Throwable th2) {
            if (errorStream != null) {
                try {
                    errorStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th2;
        }
        return aVarA.b();
    }

    private void d(byte[] bArr) throws IOException {
        this.f287426c.getOutputStream().write(bArr);
    }

    @Override // io.ably.lib.network.j
    public void cancel() {
        HttpURLConnection httpURLConnection = this.f287426c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // io.ably.lib.network.j
    public o execute() {
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(this.f287425b.h().openConnection(this.f287424a)));
                this.f287426c = httpURLConnection;
                httpURLConnection.setRequestMethod(this.f287425b.g());
                this.f287426c.setConnectTimeout(this.f287425b.e());
                this.f287426c.setReadTimeout(this.f287425b.f());
                this.f287426c.setDoInput(true);
                for (Map.Entry<String, List<String>> entry : this.f287425b.d().entrySet()) {
                    String key = entry.getKey();
                    Iterator<String> it = entry.getValue().iterator();
                    while (it.hasNext()) {
                        this.f287426c.setRequestProperty(key, it.next());
                    }
                }
                if (this.f287425b.c() != null) {
                    d(a(this.f287425b.c()));
                }
                o oVarC = c();
                cancel();
                return oVarC;
            } catch (ConnectException | NoRouteToHostException | SocketTimeoutException | UnknownHostException e10) {
                throw new h(e10);
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        } catch (Throwable th2) {
            cancel();
            throw th2;
        }
    }
}
