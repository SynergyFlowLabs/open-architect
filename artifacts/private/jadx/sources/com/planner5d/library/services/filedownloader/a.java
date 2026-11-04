package com.planner5d.library.services.filedownloader;

import android.content.Context;
import androidx.annotation.m1;
import com.facebook.share.internal.k;
import com.planner5d.library.services.utility.e0;
import com.planner5d.library.services.utility.h3;
import com.planner5d.library.services.utility.i3;
import com.planner5d.library.services.utility.o2;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import org.apache.commons.io.p;

/* JADX INFO: loaded from: classes10.dex */
public class a implements com.planner5d.library.services.backgroundexecutor.a<e> {
    private e g(e message, HttpURLConnection connection, Throwable throwable, String name) {
        String str = "no response";
        try {
            str = String.valueOf(connection.getResponseCode()) + " - " + connection.getResponseMessage();
        } catch (Throwable unused) {
        }
        return new e(message, o2.q.Q8, "(" + name + ", " + str + ", " + throwable.getClass().getSimpleName() + ", " + throwable.getMessage() + ")");
    }

    @Override // com.planner5d.library.services.backgroundexecutor.a
    public boolean a(com.planner5d.library.services.backgroundexecutor.e message) {
        return message instanceof e;
    }

    @Override // com.planner5d.library.services.backgroundexecutor.a
    public void b(Context context) {
    }

    @Override // com.planner5d.library.services.backgroundexecutor.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void d(e message) {
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0226 A[DONT_GENERATE] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v30, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.planner5d.library.services.utility.i3] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.FileOutputStream, java.io.OutputStream] */
    @Override // com.planner5d.library.services.backgroundexecutor.a
    @m1
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public e c(Context context, e eVar) {
        InputStream inputStream;
        File fileA;
        HttpURLConnection httpURLConnectionE0;
        ?? r10 = 0;
        inputStream = null;
        r10 = 0;
        InputStream inputStream2 = null;
        r10 = 0;
        try {
            if (eVar.f224331d == null) {
                throw new IOException("Empty file hash for file: " + eVar.f224330c.getAbsolutePath());
            }
            File parentFile = eVar.f224330c.getParentFile();
            if (!parentFile.isDirectory() && !parentFile.mkdirs()) {
                throw new IOException("Cannot create directory: " + parentFile.getAbsolutePath());
            }
            try {
                if (!h3.K(parentFile)) {
                    throw new IOException("Not enough free space for file: " + eVar.f224330c.getAbsolutePath());
                }
            } catch (Exception unused) {
            }
            httpURLConnectionE0 = h3.e0(eVar.f224329b);
            try {
                ?? fileOutputStream = i3.f225278a;
                fileA = fileOutputStream.a("temp", k.f101891c, parentFile);
                try {
                    try {
                        fileOutputStream = new FileOutputStream(fileA);
                        try {
                            inputStream2 = httpURLConnectionE0.getInputStream();
                            try {
                                p.v(inputStream2, fileOutputStream);
                                try {
                                    String strD = e0.d(fileA);
                                    if (!eVar.f224331d.equalsIgnoreCase(strD)) {
                                        throw new IOException("Downloaded file was corrupted: " + eVar.f224330c.getAbsolutePath() + ", hash - " + strD + " (" + eVar.f224331d + ")");
                                    }
                                    if (!eVar.f224330c.isFile() || eVar.f224330c.delete()) {
                                        if (fileA.renameTo(eVar.f224330c)) {
                                            p.r(new Closeable[]{inputStream2, fileOutputStream});
                                            httpURLConnectionE0.disconnect();
                                            org.apache.commons.io.k.C(fileA);
                                            return eVar;
                                        }
                                    }
                                    throw new IOException("Cannot rename to file: " + eVar.f224330c.getAbsolutePath());
                                } catch (Throwable th2) {
                                    throw new IOException("File check failed: " + th2.getMessage());
                                }
                            } catch (Throwable th3) {
                                e eVarG = g(eVar, httpURLConnectionE0, th3, "read");
                                p.r(new Closeable[]{inputStream2, fileOutputStream});
                                httpURLConnectionE0.disconnect();
                                org.apache.commons.io.k.C(fileA);
                                return eVarG;
                            }
                        } catch (Throwable th4) {
                            e eVarG2 = g(eVar, httpURLConnectionE0, th4, "open");
                            p.r(new Closeable[]{0, fileOutputStream});
                            if (httpURLConnectionE0 != null) {
                                httpURLConnectionE0.disconnect();
                            }
                            org.apache.commons.io.k.C(fileA);
                            return eVarG2;
                        }
                    } catch (Throwable th5) {
                        try {
                            throw new IOException("Cannot open temp file: " + th5.getClass().getSimpleName() + " " + th5.getMessage());
                        } catch (Throwable th6) {
                            th = th6;
                            inputStream = null;
                            try {
                                e eVar2 = new e(eVar, o2.q.f228180p8, th.getMessage());
                                p.r(new Closeable[]{inputStream, r10});
                                if (httpURLConnectionE0 != null) {
                                }
                                return eVar2;
                            } finally {
                                p.r(new Closeable[]{inputStream, r10});
                                if (httpURLConnectionE0 != null) {
                                    httpURLConnectionE0.disconnect();
                                }
                                org.apache.commons.io.k.C(fileA);
                            }
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                    inputStream = inputStream2;
                    r10 = fileOutputStream;
                    e eVar3 = new e(eVar, o2.q.f228180p8, th.getMessage());
                    p.r(new Closeable[]{inputStream, r10});
                    if (httpURLConnectionE0 != null) {
                    }
                    return eVar3;
                }
            } catch (Throwable th8) {
                try {
                    throw new IOException("Cannot create temp file: " + th8.getClass().getSimpleName() + " " + th8.getMessage());
                } catch (Throwable th9) {
                    th = th9;
                    inputStream = null;
                    fileA = null;
                    e eVar4 = new e(eVar, o2.q.f228180p8, th.getMessage());
                    p.r(new Closeable[]{inputStream, r10});
                    if (httpURLConnectionE0 != null) {
                    }
                    return eVar4;
                }
            }
        } catch (Throwable th10) {
            th = th10;
            inputStream = null;
            fileA = null;
            httpURLConnectionE0 = null;
        }
    }
}
