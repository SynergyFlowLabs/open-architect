package com.google.firebase.remoteconfig.internal;

import androidx.annotation.b0;
import androidx.annotation.l1;
import com.google.android.gms.tasks.Task;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f124501i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f124502j = "latestTemplateVersionNumber";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f124503k = "featureDisabled";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @b0("this")
    private final Set<com.google.firebase.remoteconfig.d> f124504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HttpURLConnection f124505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f124506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g f124507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.d f124508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f124509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Random f124510g = new Random();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f124511h = false;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f124512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f124513b;

        a(int i10, long j10) {
            this.f124512a = i10;
            this.f124513b = j10;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            c.this.d(this.f124512a, this.f124513b);
        }
    }

    public c(HttpURLConnection httpURLConnection, n nVar, g gVar, Set<com.google.firebase.remoteconfig.d> set, com.google.firebase.remoteconfig.d dVar, ScheduledExecutorService scheduledExecutorService) {
        this.f124505b = httpURLConnection;
        this.f124506c = nVar;
        this.f124507d = gVar;
        this.f124504a = set;
        this.f124508e = dVar;
        this.f124509f = scheduledExecutorService;
    }

    public static /* synthetic */ Task a(c cVar, Task task, Task task2, long j10, int i10, Task task3) throws JSONException {
        cVar.getClass();
        if (!task.u()) {
            return com.google.android.gms.tasks.n.f(new com.google.firebase.remoteconfig.s("Failed to auto-fetch config update.", task.p()));
        }
        if (!task2.u()) {
            return com.google.android.gms.tasks.n.f(new com.google.firebase.remoteconfig.s("Failed to get activated config for auto-fetch", task2.p()));
        }
        n.a aVar = (n.a) task.q();
        h hVarA = (h) task2.q();
        if (!e(aVar, j10).booleanValue()) {
            cVar.b(i10, j10);
            return com.google.android.gms.tasks.n.g(null);
        }
        if (aVar.e() == null) {
            return com.google.android.gms.tasks.n.g(null);
        }
        if (hVarA == null) {
            hVarA = h.l().a();
        }
        Set<String> setF = hVarA.f(aVar.e());
        if (setF.isEmpty()) {
            return com.google.android.gms.tasks.n.g(null);
        }
        cVar.c(com.google.firebase.remoteconfig.c.a(setF));
        return com.google.android.gms.tasks.n.g(null);
    }

    private void b(int i10, long j10) {
        if (i10 == 0) {
            j(new com.google.firebase.remoteconfig.w("Unable to fetch the latest version of the template.", com.google.firebase.remoteconfig.t.a.CONFIG_UPDATE_NOT_FETCHED));
        } else {
            this.f124509f.schedule(new a(i10, j10), this.f124510g.nextInt(4), TimeUnit.SECONDS);
        }
    }

    private synchronized void c(com.google.firebase.remoteconfig.c cVar) {
        try {
            Iterator<com.google.firebase.remoteconfig.d> it = this.f124504a.iterator();
            while (it.hasNext()) {
                it.next().a(cVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static Boolean e(n.a aVar, long j10) {
        if (aVar.e() != null) {
            return Boolean.valueOf(aVar.e().k() >= j10);
        }
        return Boolean.valueOf(aVar.g() == 1);
    }

    private void f(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        loop0: while (true) {
            String strI = "";
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break loop0;
                }
                strI = strI + line;
                if (line.contains("}")) {
                    strI = i(strI);
                    if (strI.isEmpty()) {
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject(strI);
                if (jSONObject.has(f124503k) && jSONObject.getBoolean(f124503k)) {
                    this.f124508e.b(new com.google.firebase.remoteconfig.w("The server is temporarily unavailable. Try again in a few minutes.", com.google.firebase.remoteconfig.t.a.CONFIG_UPDATE_UNAVAILABLE));
                    break;
                } else {
                    if (g()) {
                        break;
                    }
                    if (jSONObject.has(f124502j)) {
                        long jS = this.f124506c.s();
                        long j10 = jSONObject.getLong(f124502j);
                        if (j10 > jS) {
                            b(3, j10);
                        }
                    }
                }
            } catch (JSONException e10) {
                j(new com.google.firebase.remoteconfig.s("Unable to parse config update message.", e10.getCause(), com.google.firebase.remoteconfig.t.a.CONFIG_UPDATE_MESSAGE_INVALID));
            }
        }
        bufferedReader.close();
    }

    private synchronized boolean g() {
        return this.f124504a.isEmpty();
    }

    private String i(String str) {
        int iIndexOf = str.indexOf(123);
        int iLastIndexOf = str.lastIndexOf(125);
        if (iIndexOf >= 0 && iLastIndexOf >= 0 && iIndexOf < iLastIndexOf) {
            return str.substring(iIndexOf, iLastIndexOf + 1);
        }
        return "";
    }

    private synchronized void j(com.google.firebase.remoteconfig.t tVar) {
        try {
            Iterator<com.google.firebase.remoteconfig.d> it = this.f124504a.iterator();
            while (it.hasNext()) {
                it.next().b(tVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @l1
    public synchronized Task<Void> d(int i10, final long j10) throws Throwable {
        final int i11 = i10 - 1;
        try {
            try {
                final Task<n.a> taskN = this.f124506c.n(n.b.REALTIME, 3 - i11);
                final Task<h> taskF = this.f124507d.f();
                return com.google.android.gms.tasks.n.m(taskN, taskF).o(this.f124509f, new com.google.android.gms.tasks.c() { // from class: com.google.firebase.remoteconfig.internal.b
                    @Override // com.google.android.gms.tasks.c
                    public final Object a(Task task) {
                        return c.a(this.f124496a, taskN, taskF, j10, i11, task);
                    }
                });
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @l1
    public void h() {
        HttpURLConnection httpURLConnection = this.f124505b;
        if (httpURLConnection == null) {
            return;
        }
        InputStream inputStream = null;
        try {
            try {
                inputStream = httpURLConnection.getInputStream();
                f(inputStream);
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException unused) {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th2;
            }
        } catch (IOException unused3) {
        }
    }

    public void k(boolean z10) {
        this.f124511h = z10;
    }
}
