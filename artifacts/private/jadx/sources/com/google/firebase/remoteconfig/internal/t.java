package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.annotation.b0;
import androidx.annotation.l1;
import com.facebook.internal.z0;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.e0;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class t {
    private static final String A = "X-Accept-Response-Streaming";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @l1
    static final int[] f124626t = {2, 4, 8, 16, 32, 64, 128, 256};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Pattern f124627u = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f124628v = "X-Goog-Api-Key";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f124629w = "X-Android-Package";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f124630x = "X-Android-Cert";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f124631y = "X-Google-GFE-Can-Retry";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f124632z = "X-Goog-Firebase-Installations-Auth";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @b0("this")
    private final Set<com.google.firebase.remoteconfig.d> f124633a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @b0("this")
    private int f124635c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private HttpURLConnection f124638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f124639g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ScheduledExecutorService f124641i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final n f124642j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.firebase.h f124643k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.google.firebase.installations.k f124644l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    g f124645m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f124646n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f124647o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final u f124650r;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f124640h = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @b0("this")
    private boolean f124634b = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Random f124648p = new Random();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.google.android.gms.common.util.g f124649q = com.google.android.gms.common.util.k.d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @b0("this")
    private boolean f124636d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f124637e = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Object f124651s = new Object();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            t.this.e();
        }
    }

    class b implements com.google.firebase.remoteconfig.d {
        b() {
        }

        @Override // com.google.firebase.remoteconfig.d
        public void a(@NonNull com.google.firebase.remoteconfig.c cVar) {
        }

        @Override // com.google.firebase.remoteconfig.d
        public void b(@NonNull com.google.firebase.remoteconfig.t tVar) {
            t.this.l();
            t.this.w(tVar);
        }
    }

    public t(com.google.firebase.h hVar, com.google.firebase.installations.k kVar, n nVar, g gVar, Context context, String str, Set<com.google.firebase.remoteconfig.d> set, u uVar, ScheduledExecutorService scheduledExecutorService) {
        this.f124633a = set;
        this.f124641i = scheduledExecutorService;
        this.f124635c = Math.max(8 - uVar.k().b(), 1);
        this.f124643k = hVar;
        this.f124642j = nVar;
        this.f124644l = kVar;
        this.f124645m = gVar;
        this.f124646n = context;
        this.f124647o = str;
        this.f124650r = uVar;
    }

    private synchronized void A(boolean z10) {
        try {
            this.f124634b = z10;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void F(Date date) {
        int iB = this.f124650r.k().b() + 1;
        this.f124650r.t(iB, new Date(date.getTime() + q(iB)));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d9 A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #7 {all -> 0x004f, blocks: (B:10:0x0038, B:43:0x00d5, B:45:0x00d9), top: B:86:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:72:0x0161  */
    /* JADX WARN: Code duplicated, block: B:75:0x0167  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a8  */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Task a(t tVar, Task task, Task task2) throws Throwable {
        InputStream errorStream;
        Integer numValueOf;
        Throwable th2;
        InputStream inputStream;
        com.google.firebase.remoteconfig.w wVar;
        tVar.getClass();
        boolean z10 = true;
        try {
            if (!task.u()) {
                throw new IOException(task.p());
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) task.q();
            tVar.f124638f = httpURLConnection;
            inputStream = httpURLConnection.getInputStream();
            try {
                errorStream = tVar.f124638f.getErrorStream();
                try {
                    int responseCode = tVar.f124638f.getResponseCode();
                    numValueOf = Integer.valueOf(responseCode);
                    if (responseCode == 200) {
                        try {
                            try {
                                tVar.x();
                                tVar.f124650r.m();
                                c cVarD = tVar.D(tVar.f124638f);
                                tVar.f124639g = cVarD;
                                cVarD.h();
                            } catch (IOException unused) {
                                if (tVar.f124637e) {
                                    tVar.x();
                                }
                                tVar.i(inputStream, errorStream);
                                tVar.A(false);
                                if (tVar.f124637e || (numValueOf != 0 && !tVar.t(numValueOf.intValue()))) {
                                    z10 = false;
                                }
                                if (z10) {
                                    tVar.F(new Date(tVar.f124649q.currentTimeMillis()));
                                }
                                if (!z10 || numValueOf.intValue() == 200) {
                                    tVar.y();
                                } else {
                                    String strV = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                                    if (numValueOf.intValue() == 403) {
                                        strV = tVar.v(tVar.f124638f.getErrorStream());
                                    }
                                    wVar = new com.google.firebase.remoteconfig.w(numValueOf.intValue(), strV, com.google.firebase.remoteconfig.t.a.CONFIG_UPDATE_STREAM_ERROR);
                                }
                                tVar.f124638f = null;
                                tVar.f124639g = null;
                                return com.google.android.gms.tasks.n.g(null);
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            tVar.i(inputStream, errorStream);
                            tVar.A(false);
                            if (tVar.f124637e || (numValueOf != 0 && !tVar.t(numValueOf.intValue()))) {
                                z10 = false;
                            }
                            if (z10) {
                                tVar.F(new Date(tVar.f124649q.currentTimeMillis()));
                            }
                            if (!z10 || numValueOf.intValue() == 200) {
                                tVar.y();
                            } else {
                                String strV2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                                if (numValueOf.intValue() == 403) {
                                    strV2 = tVar.v(tVar.f124638f.getErrorStream());
                                }
                                tVar.w(new com.google.firebase.remoteconfig.w(numValueOf.intValue(), strV2, com.google.firebase.remoteconfig.t.a.CONFIG_UPDATE_STREAM_ERROR));
                            }
                            throw th2;
                        }
                    }
                    tVar.i(inputStream, errorStream);
                    tVar.A(false);
                    z10 = !tVar.f124637e && tVar.t(responseCode);
                    if (z10) {
                        tVar.F(new Date(tVar.f124649q.currentTimeMillis()));
                    }
                    if (z10 || responseCode == 200) {
                        tVar.y();
                    } else {
                        String strV3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                        if (responseCode == 403) {
                            strV3 = tVar.v(tVar.f124638f.getErrorStream());
                        }
                        wVar = new com.google.firebase.remoteconfig.w(responseCode, strV3, com.google.firebase.remoteconfig.t.a.CONFIG_UPDATE_STREAM_ERROR);
                        tVar.w(wVar);
                    }
                } catch (IOException unused2) {
                    numValueOf = 0;
                } catch (Throwable th4) {
                    numValueOf = 0;
                    th2 = th4;
                    tVar.i(inputStream, errorStream);
                    tVar.A(false);
                    if (tVar.f124637e) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        tVar.F(new Date(tVar.f124649q.currentTimeMillis()));
                    }
                    if (z10) {
                        tVar.y();
                    } else {
                        tVar.y();
                    }
                    throw th2;
                }
            } catch (IOException unused3) {
                errorStream = null;
                numValueOf = errorStream;
                if (tVar.f124637e) {
                    tVar.x();
                }
                tVar.i(inputStream, errorStream);
                tVar.A(false);
                if (tVar.f124637e) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (z10) {
                    tVar.F(new Date(tVar.f124649q.currentTimeMillis()));
                }
                if (z10) {
                }
                tVar.y();
                tVar.f124638f = null;
                tVar.f124639g = null;
                return com.google.android.gms.tasks.n.g(null);
            } catch (Throwable th5) {
                numValueOf = 0;
                th2 = th5;
                errorStream = null;
            }
            tVar.f124638f = null;
            tVar.f124639g = null;
            return com.google.android.gms.tasks.n.g(null);
        } catch (IOException unused4) {
            inputStream = null;
            errorStream = null;
        } catch (Throwable th6) {
            errorStream = null;
            numValueOf = 0;
            th2 = th6;
            inputStream = null;
        }
    }

    public static /* synthetic */ Task b(t tVar, Task task, Task task2, Task task3) {
        tVar.getClass();
        if (!task.u()) {
            return com.google.android.gms.tasks.n.f(new com.google.firebase.remoteconfig.s("Firebase Installations failed to get installation auth token for config update listener connection.", task.p()));
        }
        if (!task2.u()) {
            return com.google.android.gms.tasks.n.f(new com.google.firebase.remoteconfig.s("Firebase Installations failed to get installation ID for config update listener connection.", task2.p()));
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) tVar.s().openConnection();
            tVar.C(httpURLConnection, (String) task2.q(), ((com.google.firebase.installations.p) task.q()).b());
            return com.google.android.gms.tasks.n.g(httpURLConnection);
        } catch (IOException e10) {
            return com.google.android.gms.tasks.n.f(new com.google.firebase.remoteconfig.s("Failed to open HTTP stream connection", e10));
        }
    }

    private synchronized boolean f() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return (this.f124633a.isEmpty() || this.f124634b || this.f124636d || this.f124637e) ? false : true;
    }

    private synchronized boolean g() {
        boolean zF;
        zF = f();
        if (zF) {
            A(true);
        }
        return zF;
    }

    private void h(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    private JSONObject k(String str) {
        HashMap map = new HashMap();
        map.put("project", m(this.f124643k.s().j()));
        map.put(com.segment.analytics.kotlin.android.plugins.a.f266546o, this.f124647o);
        map.put("lastKnownVersionNumber", Long.toString(this.f124642j.s()));
        map.put("appId", this.f124643k.s().j());
        map.put(e0.b.f124461v2, com.google.firebase.remoteconfig.b.f124425d);
        map.put(e0.b.f124451l2, str);
        return new JSONObject(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void l() {
        try {
            this.f124636d = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static String m(String str) {
        Matcher matcher = f124627u.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private String o() {
        try {
            Context context = this.f124646n;
            byte[] bArrA = com.google.android.gms.common.util.a.a(context, context.getPackageName());
            if (bArrA != null) {
                return com.google.android.gms.common.util.n.c(bArrA, false);
            }
            this.f124646n.getPackageName();
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            this.f124646n.getPackageName();
            return null;
        }
    }

    private long q(int i10) {
        int[] iArr = f124626t;
        int length = iArr.length;
        if (i10 >= length) {
            i10 = length;
        }
        long millis = TimeUnit.MINUTES.toMillis(iArr[i10 - 1]);
        return (millis / 2) + ((long) this.f124648p.nextInt((int) millis));
    }

    private String r(String str) {
        return String.format(e0.f124448b, m(this.f124643k.s().j()), str);
    }

    private URL s() {
        try {
            return new URL(r(this.f124647o));
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    private boolean t(int i10) {
        return i10 == 408 || i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504;
    }

    private synchronized void u(long j10) {
        try {
            if (f()) {
                int i10 = this.f124635c;
                if (i10 > 0) {
                    this.f124635c = i10 - 1;
                    this.f124641i.schedule(new a(), j10, TimeUnit.MILLISECONDS);
                } else if (!this.f124637e) {
                    w(new com.google.firebase.remoteconfig.s("Unable to connect to the server. Check your connection and try again.", com.google.firebase.remoteconfig.t.a.CONFIG_UPDATE_STREAM_ERROR));
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private String v(InputStream inputStream) {
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb2.append(line);
            }
        } catch (IOException unused) {
            if (sb2.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void w(com.google.firebase.remoteconfig.t tVar) {
        try {
            Iterator<com.google.firebase.remoteconfig.d> it = this.f124633a.iterator();
            while (it.hasNext()) {
                it.next().b(tVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized void x() {
        try {
            this.f124635c = 8;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void z(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty(f124632z, str);
        httpURLConnection.setRequestProperty(f124628v, this.f124643k.s().i());
        httpURLConnection.setRequestProperty(f124629w, this.f124646n.getPackageName());
        httpURLConnection.setRequestProperty(f124630x, o());
        httpURLConnection.setRequestProperty(f124631y, "yes");
        httpURLConnection.setRequestProperty(A, z0.P);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    public void B(boolean z10) {
        HttpURLConnection httpURLConnection;
        synchronized (this.f124651s) {
            try {
                this.f124637e = z10;
                c cVar = this.f124639g;
                if (cVar != null) {
                    cVar.k(z10);
                }
                if (z10 && (httpURLConnection = this.f124638f) != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @e.a({"VisibleForTests"})
    public void C(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        httpURLConnection.setRequestMethod("POST");
        z(httpURLConnection, str2);
        byte[] bytes = k(str).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    @e.a({"VisibleForTests"})
    public synchronized c D(HttpURLConnection httpURLConnection) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return new c(httpURLConnection, this.f124642j, this.f124645m, this.f124633a, new b(), this.f124641i);
    }

    public void E() {
        u(0L);
    }

    @e.a({"VisibleForTests", "DefaultLocale"})
    public void e() {
        if (g()) {
            if (new Date(this.f124649q.currentTimeMillis()).before(this.f124650r.k().a())) {
                y();
            } else {
                final Task<HttpURLConnection> taskJ = j();
                com.google.android.gms.tasks.n.m(taskJ).m(this.f124641i, new com.google.android.gms.tasks.c() { // from class: com.google.firebase.remoteconfig.internal.s
                    @Override // com.google.android.gms.tasks.c
                    public final Object a(Task task) {
                        return t.a(this.f124624a, taskJ, task);
                    }
                });
            }
        }
    }

    @l1
    public void i(InputStream inputStream, InputStream inputStream2) {
        HttpURLConnection httpURLConnection = this.f124638f;
        if (httpURLConnection != null && !this.f124637e) {
            httpURLConnection.disconnect();
        }
        h(inputStream);
        h(inputStream2);
    }

    @e.a({"VisibleForTests"})
    public Task<HttpURLConnection> j() {
        final Task<com.google.firebase.installations.p> taskB = this.f124644l.b(false);
        final Task<String> id2 = this.f124644l.getId();
        return com.google.android.gms.tasks.n.m(taskB, id2).o(this.f124641i, new com.google.android.gms.tasks.c() { // from class: com.google.firebase.remoteconfig.internal.r
            @Override // com.google.android.gms.tasks.c
            public final Object a(Task task) {
                return t.b(this.f124608a, taskB, id2, task);
            }
        });
    }

    @e.a({"VisibleForTests"})
    public Date n() {
        return this.f124650r.k().a();
    }

    @e.a({"VisibleForTests"})
    public int p() {
        return this.f124650r.k().b();
    }

    @e.a({"VisibleForTests"})
    public synchronized void y() {
        u(Math.max(0L, this.f124650r.k().a().getTime() - new Date(this.f124649q.currentTimeMillis()).getTime()));
    }
}
