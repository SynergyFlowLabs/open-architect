package com.segment.analytics.kotlin.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class n {

    public static final class a extends h {
        a(HttpURLConnection httpURLConnection, InputStream inputStream) {
            super(httpURLConnection, inputStream, null);
        }

        @Override // com.segment.analytics.kotlin.core.h, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            InputStream inputStreamB = b();
            if (inputStreamB != null) {
                inputStreamB.close();
            }
        }
    }

    @SourceDebugExtension({"SMAP\nHTTPClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HTTPClient.kt\ncom/segment/analytics/kotlin/core/HTTPClientKt$createPostConnection$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,184:1\n1#2:185\n*E\n"})
    public static final class b extends h {
        b(HttpURLConnection httpURLConnection, OutputStream outputStream) {
            super(httpURLConnection, null, outputStream);
        }

        /* JADX WARN: Code duplicated, block: B:38:0x0097 A[Catch: all -> 0x004b, TryCatch #3 {all -> 0x004b, blocks: (B:2:0x0000, B:23:0x0047, B:35:0x0071, B:36:0x0094, B:38:0x0097, B:39:0x009b), top: B:51:0x0000 }] */
        /* JADX WARN: Not initialized variable reg: 2, insn: 0x0037: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:13:0x0037 */
        @Override // com.segment.analytics.kotlin.core.h, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            InputStream inputStreamC;
            IOException e10;
            InputStream inputStream;
            try {
                int responseCode = a().getResponseCode();
                if (responseCode < 300) {
                    super.close();
                    OutputStream outputStreamC = c();
                    if (outputStreamC != null) {
                        outputStreamC.close();
                        return;
                    }
                    return;
                }
                InputStream inputStream2 = null;
                String str = null;
                try {
                    try {
                        inputStreamC = n.c(a());
                        if (inputStreamC != null) {
                            try {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamC, Charsets.UTF_8), 8192);
                                try {
                                    String strK = kotlin.io.x.k(bufferedReader);
                                    kotlin.io.c.a(bufferedReader, null);
                                    str = strK;
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        kotlin.io.c.a(bufferedReader, th2);
                                        throw th3;
                                    }
                                }
                            } catch (IOException e11) {
                                e10 = e11;
                                k.c(com.segment.analytics.kotlin.core.a.Companion, e10);
                                str = "Could not read response body for rejected message: " + e10;
                                if (inputStreamC != null) {
                                }
                                String responseMessage = a().getResponseMessage();
                                Intrinsics.checkNotNullExpressionValue(responseMessage, "connection.responseMessage");
                                Map<String, List<String>> headerFields = a().getHeaderFields();
                                Intrinsics.checkNotNullExpressionValue(headerFields, "connection.headerFields");
                                throw new o(responseCode, responseMessage, str, headerFields);
                            }
                        }
                        if (inputStreamC != null) {
                            inputStreamC.close();
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream2 = inputStream;
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        throw th;
                    }
                } catch (IOException e12) {
                    inputStreamC = null;
                    e10 = e12;
                } catch (Throwable th5) {
                    th = th5;
                    if (inputStream2 != null) {
                        inputStream2.close();
                    }
                    throw th;
                }
                String responseMessage2 = a().getResponseMessage();
                Intrinsics.checkNotNullExpressionValue(responseMessage2, "connection.responseMessage");
                Map<String, List<String>> headerFields2 = a().getHeaderFields();
                Intrinsics.checkNotNullExpressionValue(headerFields2, "connection.headerFields");
                throw new o(responseCode, responseMessage2, str, headerFields2);
            } catch (Throwable th6) {
                super.close();
                OutputStream outputStreamC2 = c();
                if (outputStreamC2 != null) {
                    outputStreamC2.close();
                }
                throw th6;
            }
        }
    }

    @NotNull
    public static final h a(@NotNull HttpURLConnection httpURLConnection) {
        Intrinsics.checkNotNullParameter(httpURLConnection, "<this>");
        return new a(httpURLConnection, c(httpURLConnection));
    }

    @NotNull
    public static final h b(@NotNull HttpURLConnection httpURLConnection) throws IOException {
        OutputStream outputStream;
        Intrinsics.checkNotNullParameter(httpURLConnection, "<this>");
        String requestProperty = httpURLConnection.getRequestProperty(com.google.common.net.d.f119476b0);
        if (requestProperty == null) {
            requestProperty = "";
        }
        if (StringsKt.V2(requestProperty, "gzip", false, 2, null)) {
            outputStream = new GZIPOutputStream(httpURLConnection.getOutputStream());
        } else {
            outputStream = httpURLConnection.getOutputStream();
            Intrinsics.checkNotNullExpressionValue(outputStream, "{\n            this.outputStream\n        }");
        }
        return new b(httpURLConnection, outputStream);
    }

    @Nullable
    public static final InputStream c(@NotNull HttpURLConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        try {
            return connection.getInputStream();
        } catch (IOException unused) {
            return connection.getErrorStream();
        }
    }
}
