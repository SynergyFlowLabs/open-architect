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

/* JADX INFO: loaded from: classes4.dex */
@androidx.annotation.m1
final class a6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final URL f109739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f109740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y5 f109741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f109742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f109743e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ b6 f109744f;

    public a6(b6 b6Var, String str, URL url, byte[] bArr, Map map, y5 y5Var) {
        Objects.requireNonNull(b6Var);
        this.f109744f = b6Var;
        com.google.android.gms.common.internal.w.l(str);
        com.google.android.gms.common.internal.w.r(url);
        com.google.android.gms.common.internal.w.r(y5Var);
        this.f109739a = url;
        this.f109740b = bArr;
        this.f109741c = y5Var;
        this.f109742d = str;
        this.f109743e = map;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0173  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:86:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0199 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0121: MOVE (r9 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:51:0x011e */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0124: MOVE (r10 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:52:0x0123 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        Map map;
        IOException iOException;
        int responseCode;
        Map map2;
        Throwable th2;
        Map map3;
        Map map4;
        InputStream inputStream;
        b6 b6Var = this.f109744f;
        b6Var.g();
        int i10 = 0;
        OutputStream outputStream = null;
        try {
            URL url = this.f109739a;
            int i11 = com.google.android.gms.internal.measurement.m1.f108672a;
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDefaultUseCaches(false);
            h7 h7Var = b6Var.f110184a;
            h7Var.w();
            httpURLConnection.setConnectTimeout(60000);
            h7Var.w();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                Map map5 = this.f109743e;
                if (map5 != null) {
                    for (Map.Entry entry : map5.entrySet()) {
                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                byte[] bArr = this.f109740b;
                if (bArr != null) {
                    byte[] bArrV = b6Var.f110700b.K0().V(bArr);
                    u5 u5VarW = h7Var.a().w();
                    int length = bArrV.length;
                    u5VarW.b("Uploading data. size", Integer.valueOf(length));
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.addRequestProperty(com.google.common.net.d.f119476b0, "gzip");
                    httpURLConnection.setFixedLengthStreamingMode(length);
                    httpURLConnection.connect();
                    OutputStream outputStream2 = httpURLConnection.getOutputStream();
                    try {
                        outputStream2.write(bArrV);
                        outputStream2.close();
                    } catch (IOException e10) {
                        iOException = e10;
                        responseCode = 0;
                        map2 = null;
                        outputStream = outputStream2;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e11) {
                                this.f109744f.f110184a.a().o().c("Error closing HTTP compressed POST connection output stream. appId", w5.x(this.f109742d), e11);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.f109744f.f110184a.b().t(new z5(this.f109742d, this.f109741c, responseCode, iOException, null, map2, null));
                    } catch (Throwable th3) {
                        th = th3;
                        map = null;
                        outputStream = outputStream2;
                        th2 = th;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e12) {
                                this.f109744f.f110184a.a().o().c("Error closing HTTP compressed POST connection output stream. appId", w5.x(this.f109742d), e12);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.f109744f.f110184a.b().t(new z5(this.f109742d, this.f109741c, i10, null, null, map, null));
                        throw th2;
                    }
                }
                responseCode = httpURLConnection.getResponseCode();
                try {
                    try {
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            inputStream = httpURLConnection.getInputStream();
                            try {
                                byte[] bArr2 = new byte[1024];
                                while (true) {
                                    int i12 = inputStream.read(bArr2);
                                    if (i12 <= 0) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        inputStream.close();
                                        httpURLConnection.disconnect();
                                        this.f109744f.f110184a.b().t(new z5(this.f109742d, this.f109741c, responseCode, null, byteArray, headerFields, null));
                                        return;
                                    }
                                    byteArrayOutputStream.write(bArr2, 0, i12);
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            inputStream = null;
                        }
                    } catch (IOException e13) {
                        e = e13;
                        map2 = map4;
                        iOException = e;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.f109744f.f110184a.b().t(new z5(this.f109742d, this.f109741c, responseCode, iOException, null, map2, null));
                    } catch (Throwable th6) {
                        th2 = th6;
                        i10 = responseCode;
                        map = map3;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.f109744f.f110184a.b().t(new z5(this.f109742d, this.f109741c, i10, null, null, map, null));
                        throw th2;
                    }
                } catch (IOException e14) {
                    e = e14;
                    map2 = null;
                    iOException = e;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    this.f109744f.f110184a.b().t(new z5(this.f109742d, this.f109741c, responseCode, iOException, null, map2, null));
                } catch (Throwable th7) {
                    th2 = th7;
                    map = null;
                    i10 = responseCode;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    this.f109744f.f110184a.b().t(new z5(this.f109742d, this.f109741c, i10, null, null, map, null));
                    throw th2;
                }
            } catch (IOException e15) {
                iOException = e15;
                responseCode = 0;
                map2 = null;
            } catch (Throwable th8) {
                th = th8;
                map = null;
            }
        } catch (IOException e16) {
            iOException = e16;
            responseCode = 0;
            httpURLConnection = null;
            map2 = null;
        } catch (Throwable th9) {
            th = th9;
            httpURLConnection = null;
            map = null;
        }
    }
}
