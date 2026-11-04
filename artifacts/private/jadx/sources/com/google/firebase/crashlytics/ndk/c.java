package com.google.firebase.crashlytics.ndk;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.google.firebase.crashlytics.internal.model.f0;
import com.google.firebase.crashlytics.internal.model.g0;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Charset f121936d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f121937e = "start-time";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f121938f = "session.json";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f121939g = "app.json";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f121940h = "device.json";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f121941i = "os.json";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f121942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f121943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.persistence.g f121944c;

    c(Context context, g gVar, com.google.firebase.crashlytics.internal.persistence.g gVar2) {
        this.f121942a = context;
        this.f121943b = gVar;
        this.f121944c = gVar2;
    }

    @w0(api = 31)
    private static f0.a a(ApplicationExitInfo applicationExitInfo) {
        return f0.a.a().c(applicationExitInfo.getImportance()).e(applicationExitInfo.getProcessName()).g(applicationExitInfo.getReason()).i(applicationExitInfo.getTimestamp()).d(applicationExitInfo.getPid()).f(applicationExitInfo.getPss()).h(applicationExitInfo.getRss()).j(i(applicationExitInfo)).a();
    }

    @l1
    @w0(api = 31)
    public static String b(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return r(byteArrayOutputStream.toByteArray());
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    private f0.a c(String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            return f(str);
        }
        return null;
    }

    private i.c e(String str, File file) {
        return new i.c(h(file, ".dmp"), c(str));
    }

    @w0(api = 31)
    private f0.a f(String str) {
        List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f121942a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        File fileR = this.f121944c.r(str, f121937e);
        return g(fileR == null ? System.currentTimeMillis() : fileR.lastModified(), historicalProcessExitReasons);
    }

    @w0(api = 31)
    private f0.a g(long j10, List<ApplicationExitInfo> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<ApplicationExitInfo> it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoA = androidx.work.impl.utils.g.a(it.next());
            if (applicationExitInfoA.getReason() == 5 && applicationExitInfoA.getTimestamp() >= j10) {
                arrayList.add(applicationExitInfoA);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return a(androidx.work.impl.utils.g.a(arrayList.get(0)));
    }

    @p0
    private static File h(File file, String str) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return null;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.getName().endsWith(str)) {
                return file2;
            }
        }
        return null;
    }

    @w0(api = 31)
    private static String i(ApplicationExitInfo applicationExitInfo) {
        try {
            return b(applicationExitInfo.getTraceInputStream());
        } catch (IOException unused) {
            com.google.firebase.crashlytics.internal.g.f().m("Failed to get input stream from ApplicationExitInfo");
            return null;
        }
    }

    private static void o(com.google.firebase.crashlytics.internal.persistence.g gVar, String str, String str2, String str3) throws Throwable {
        q(new File(gVar.l(str), str3), str2);
    }

    private static void q(File file, String str) throws Throwable {
        BufferedWriter bufferedWriter = null;
        try {
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), f121936d));
            try {
                bufferedWriter2.write(str);
                com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter2, "Failed to close " + file);
            } catch (IOException unused) {
                bufferedWriter = bufferedWriter2;
                com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter, "Failed to close " + file);
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter, "Failed to close " + file);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @w0(api = 31)
    private static String r(byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.finish();
                String strEncodeToString = Base64.getEncoder().encodeToString(byteArrayOutputStream.toByteArray());
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return strEncodeToString;
            } catch (Throwable th2) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    @NonNull
    public i d(String str) {
        File fileL = this.f121944c.l(str);
        File file = new File(fileL, "pending");
        com.google.firebase.crashlytics.internal.g.f().k("Minidump directory: " + file.getAbsolutePath());
        File fileH = h(file, ".dmp");
        com.google.firebase.crashlytics.internal.g gVarF = com.google.firebase.crashlytics.internal.g.f();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Minidump file ");
        sb2.append((fileH == null || !fileH.exists()) ? "does not exist" : "exists");
        gVarF.k(sb2.toString());
        i.b bVar = new i.b();
        if (fileL != null && fileL.exists() && file.exists()) {
            bVar.m(e(str, file)).l(h(fileL, ".device_info")).o(new File(fileL, f121938f)).h(new File(fileL, f121939g)).k(new File(fileL, f121940h)).n(new File(fileL, f121941i));
        }
        return bVar.j();
    }

    public boolean j(String str) {
        i.c cVar = d(str).f121955a;
        return cVar != null && cVar.a();
    }

    public boolean k(String str, String str2, long j10, g0 g0Var) throws Throwable {
        File fileL = this.f121944c.l(str);
        if (fileL != null) {
            try {
                if (this.f121943b.a(fileL.getCanonicalPath(), this.f121942a.getAssets())) {
                    l(str, str2, j10);
                    m(str, g0Var.a());
                    p(str, g0Var.d());
                    n(str, g0Var.c());
                    return true;
                }
            } catch (IOException e10) {
                com.google.firebase.crashlytics.internal.g.f().e("Error initializing Crashlytics NDK", e10);
            }
        }
        return false;
    }

    public void l(String str, String str2, long j10) throws Throwable {
        o(this.f121944c, str, k.b(str, str2, j10), f121938f);
    }

    public void m(String str, g0.a aVar) throws Throwable {
        o(this.f121944c, str, k.c(aVar.a(), aVar.f(), aVar.g(), aVar.e(), aVar.c(), aVar.d().d(), aVar.d().e()), f121939g);
    }

    public void n(String str, g0.b bVar) throws Throwable {
        o(this.f121944c, str, k.d(bVar.a(), bVar.g(), bVar.b(), bVar.j(), bVar.d(), bVar.e(), bVar.i(), bVar.f(), bVar.h()), f121940h);
    }

    public void p(String str, g0.c cVar) throws Throwable {
        o(this.f121944c, str, k.e(cVar.d(), cVar.c(), cVar.b()), f121941i);
    }
}
