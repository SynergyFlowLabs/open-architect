package com.google.android.gms.measurement.internal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes4.dex */
@androidx.annotation.m1
final class xa implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final URL f110685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f110686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final va f110687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f110688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f110689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ ya f110690f;

    public xa(ya yaVar, String str, URL url, byte[] bArr, Map map, va vaVar) {
        Objects.requireNonNull(yaVar);
        this.f110690f = yaVar;
        com.google.android.gms.common.internal.w.l(str);
        com.google.android.gms.common.internal.w.r(url);
        com.google.android.gms.common.internal.w.r(vaVar);
        this.f110685a = url;
        this.f110686b = bArr;
        this.f110687c = vaVar;
        this.f110688d = str;
        this.f110689e = map;
    }

    private final void b(final int i10, final Exception exc, final byte[] bArr, final Map map) {
        this.f110690f.f110184a.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.wa
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f110641a.a(i10, exc, bArr, map);
            }
        });
    }

    final /* synthetic */ void a(int i10, Exception exc, byte[] bArr, Map map) {
        this.f110687c.a(this.f110688d, i10, exc, bArr, map);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x019d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0190  */
    /* JADX WARN: Code duplicated, block: B:89:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:94:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.android.gms.measurement.internal.xa] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.Map] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        OutputStream outputStream;
        OutputStream outputStream2;
        ?? r10;
        ?? r11;
        OutputStream outputStream3;
        OutputStream outputStream4;
        InputStream inputStream;
        ya yaVar = this.f110690f;
        yaVar.g();
        int i10 = 0;
        try {
            URL url = this.f110685a;
            int i11 = com.google.android.gms.internal.measurement.m1.f108672a;
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDefaultUseCaches(false);
            h7 h7Var = yaVar.f110184a;
            h7Var.w();
            httpURLConnection.setConnectTimeout(60000);
            h7Var.w();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            ?? r12 = 1;
            httpURLConnection.setDoInput(true);
            try {
                try {
                    Map map = this.f110689e;
                    if (map != null) {
                        for (Map.Entry entry : map.entrySet()) {
                            httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    byte[] bArr = this.f110686b;
                    if (bArr != null) {
                        try {
                            h7Var.c();
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                            gZIPOutputStream.write(bArr);
                            gZIPOutputStream.close();
                            byteArrayOutputStream.close();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            u5 u5VarW = this.f110690f.f110184a.a().w();
                            int length = byteArray.length;
                            u5VarW.b("Uploading data. size", Integer.valueOf(length));
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.addRequestProperty(com.google.common.net.d.f119476b0, "gzip");
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            httpURLConnection.connect();
                            OutputStream outputStream5 = httpURLConnection.getOutputStream();
                            try {
                                outputStream5.write(byteArray);
                                outputStream5.close();
                                r12 = outputStream5;
                            } catch (IOException e10) {
                                e = e10;
                                r11 = 0;
                                outputStream4 = outputStream5;
                                if (outputStream4 != null) {
                                    try {
                                        outputStream4.close();
                                    } catch (IOException e11) {
                                        this.f110690f.f110184a.a().o().c("Error closing HTTP compressed POST connection output stream. appId", w5.x(this.f110688d), e11);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                b(i10, e, null, r11);
                            } catch (Throwable th2) {
                                th = th2;
                                r10 = 0;
                                outputStream3 = outputStream5;
                                if (outputStream3 != null) {
                                    try {
                                        outputStream3.close();
                                    } catch (IOException e12) {
                                        this.f110690f.f110184a.a().o().c("Error closing HTTP compressed POST connection output stream. appId", w5.x(this.f110688d), e12);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                b(i10, null, null, r10);
                                throw th;
                            }
                        } catch (IOException e13) {
                            this.f110690f.f110184a.a().o().b("Failed to gzip post request content", e13);
                            throw e13;
                        }
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    try {
                        try {
                            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                inputStream = httpURLConnection.getInputStream();
                                try {
                                    byte[] bArr2 = new byte[1024];
                                    while (true) {
                                        int i12 = inputStream.read(bArr2);
                                        if (i12 <= 0) {
                                            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                            inputStream.close();
                                            httpURLConnection.disconnect();
                                            b(responseCode, null, byteArray2, headerFields);
                                            return;
                                        }
                                        byteArrayOutputStream2.write(bArr2, 0, i12);
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                inputStream = null;
                            }
                        } catch (IOException e14) {
                            i10 = responseCode;
                            e = e14;
                            r11 = r12;
                            outputStream4 = null;
                            if (outputStream4 != null) {
                                outputStream4.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            b(i10, e, null, r11);
                        } catch (Throwable th5) {
                            i10 = responseCode;
                            th = th5;
                            r10 = r12;
                            outputStream3 = null;
                            if (outputStream3 != null) {
                                outputStream3.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            b(i10, null, null, r10);
                            throw th;
                        }
                    } catch (IOException e15) {
                        i10 = responseCode;
                        e = e15;
                        outputStream2 = null;
                        r11 = outputStream2;
                        outputStream4 = outputStream2;
                        if (outputStream4 != null) {
                            outputStream4.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        b(i10, e, null, r11);
                    } catch (Throwable th6) {
                        i10 = responseCode;
                        th = th6;
                        outputStream = null;
                        r10 = outputStream;
                        outputStream3 = outputStream;
                        if (outputStream3 != null) {
                            outputStream3.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        b(i10, null, null, r10);
                        throw th;
                    }
                } catch (IOException e16) {
                    e = e16;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (IOException e17) {
            e = e17;
            httpURLConnection = null;
            outputStream2 = null;
        } catch (Throwable th8) {
            th = th8;
            httpURLConnection = null;
            outputStream = null;
        }
    }
}
