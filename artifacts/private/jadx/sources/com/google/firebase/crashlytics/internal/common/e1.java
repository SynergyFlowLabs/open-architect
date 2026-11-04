package com.google.firebase.crashlytics.internal.common;

import android.app.ApplicationExitInfo;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import com.google.android.gms.tasks.Task;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public class e1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f121033h = "crash";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f121034i = "error";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f121035j = 4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f121036k = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f121037l = 8192;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e0 f121038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.persistence.e f121039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.send.b f121040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.metadata.f f121041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.metadata.p f121042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n0 f121043f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.concurrency.n f121044g;

    e1(e0 e0Var, com.google.firebase.crashlytics.internal.persistence.e eVar, com.google.firebase.crashlytics.internal.send.b bVar, com.google.firebase.crashlytics.internal.metadata.f fVar, com.google.firebase.crashlytics.internal.metadata.p pVar, n0 n0Var, com.google.firebase.crashlytics.internal.concurrency.n nVar) {
        this.f121038a = e0Var;
        this.f121039b = eVar;
        this.f121040c = bVar;
        this.f121041d = fVar;
        this.f121042e = pVar;
        this.f121043f = n0Var;
        this.f121044g = nVar;
    }

    public static /* synthetic */ void a(e1 e1Var, com.google.firebase.crashlytics.internal.model.f0.f.d dVar, com.google.firebase.crashlytics.internal.metadata.c cVar, boolean z10) {
        e1Var.getClass();
        com.google.firebase.crashlytics.internal.g.f().b("disk worker: log non-fatal event to persistence");
        e1Var.f121039b.x(dVar, cVar.g(), z10);
    }

    private com.google.firebase.crashlytics.internal.model.f0.f.d d(com.google.firebase.crashlytics.internal.model.f0.f.d dVar, com.google.firebase.crashlytics.internal.metadata.f fVar, com.google.firebase.crashlytics.internal.metadata.p pVar) {
        return e(dVar, fVar, pVar, Collections.EMPTY_MAP);
    }

    private com.google.firebase.crashlytics.internal.model.f0.f.d e(com.google.firebase.crashlytics.internal.model.f0.f.d dVar, com.google.firebase.crashlytics.internal.metadata.f fVar, com.google.firebase.crashlytics.internal.metadata.p pVar, Map<String, String> map) {
        com.google.firebase.crashlytics.internal.model.f0.f.d.b bVarH = dVar.h();
        String strC = fVar.c();
        if (strC != null) {
            bVarH.d(com.google.firebase.crashlytics.internal.model.f0.f.d.AbstractC1144d.a().b(strC).a());
        } else {
            com.google.firebase.crashlytics.internal.g.f().k("No log data to include with this event.");
        }
        List<com.google.firebase.crashlytics.internal.model.f0.d> listO = o(pVar.h(map));
        List<com.google.firebase.crashlytics.internal.model.f0.d> listO2 = o(pVar.i());
        if (!listO.isEmpty() || !listO2.isEmpty()) {
            bVarH.b(dVar.b().i().e(listO).g(listO2).a());
        }
        return bVarH.a();
    }

    private com.google.firebase.crashlytics.internal.model.f0.f.d f(com.google.firebase.crashlytics.internal.model.f0.f.d dVar, Map<String, String> map) {
        return g(e(dVar, this.f121041d, this.f121042e, map), this.f121042e);
    }

    private com.google.firebase.crashlytics.internal.model.f0.f.d g(com.google.firebase.crashlytics.internal.model.f0.f.d dVar, com.google.firebase.crashlytics.internal.metadata.p pVar) {
        List<com.google.firebase.crashlytics.internal.model.f0.f.d.e> listJ = pVar.j();
        if (listJ.isEmpty()) {
            return dVar;
        }
        com.google.firebase.crashlytics.internal.model.f0.f.d.b bVarH = dVar.h();
        bVarH.e(com.google.firebase.crashlytics.internal.model.f0.f.d.AbstractC1145f.a().b(listJ).a());
        return bVarH.a();
    }

    @androidx.annotation.w0(api = 30)
    private static com.google.firebase.crashlytics.internal.model.f0.a h(ApplicationExitInfo applicationExitInfo) {
        String strI = null;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                strI = i(traceInputStream);
            }
        } catch (IOException e10) {
            com.google.firebase.crashlytics.internal.g.f().m("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e10);
        }
        return com.google.firebase.crashlytics.internal.model.f0.a.a().c(applicationExitInfo.getImportance()).e(applicationExitInfo.getProcessName()).g(applicationExitInfo.getReason()).i(applicationExitInfo.getTimestamp()).d(applicationExitInfo.getPid()).f(applicationExitInfo.getPss()).h(applicationExitInfo.getRss()).j(strI).a();
    }

    @l1
    @androidx.annotation.w0(api = 19)
    public static String i(InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i10 = bufferedInputStream.read(bArr);
                    if (i10 == -1) {
                        String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return string;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            bufferedInputStream.close();
            throw th5;
        }
    }

    public static e1 j(Context context, n0 n0Var, com.google.firebase.crashlytics.internal.persistence.g gVar, a aVar, com.google.firebase.crashlytics.internal.metadata.f fVar, com.google.firebase.crashlytics.internal.metadata.p pVar, g8.d dVar, com.google.firebase.crashlytics.internal.settings.k kVar, s0 s0Var, m mVar, com.google.firebase.crashlytics.internal.concurrency.n nVar) {
        return new e1(new e0(context, n0Var, aVar, dVar, kVar), new com.google.firebase.crashlytics.internal.persistence.e(gVar, kVar, mVar), com.google.firebase.crashlytics.internal.send.b.b(context, kVar, s0Var), fVar, pVar, n0Var, nVar);
    }

    private f0 k(f0 f0Var) {
        if (f0Var.b().h() != null && f0Var.b().g() != null) {
            return f0Var;
        }
        m0 m0VarD = this.f121043f.d(true);
        return f0.a(f0Var.b().u(m0VarD.f()).t(m0VarD.e()), f0Var.d(), f0Var.c());
    }

    @androidx.annotation.w0(api = 30)
    @androidx.annotation.p0
    private ApplicationExitInfo n(String str, List<ApplicationExitInfo> list) {
        long jQ = this.f121039b.q(str);
        Iterator<ApplicationExitInfo> it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoA = androidx.work.impl.utils.g.a(it.next());
            if (applicationExitInfoA.getTimestamp() < jQ) {
                return null;
            }
            if (applicationExitInfoA.getReason() == 6) {
                return applicationExitInfoA;
            }
        }
        return null;
    }

    @NonNull
    private static List<com.google.firebase.crashlytics.internal.model.f0.d> o(@NonNull Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(com.google.firebase.crashlytics.internal.model.f0.d.a().b(entry.getKey()).c(entry.getValue()).a());
        }
        Collections.sort(arrayList, new Comparator() { // from class: com.google.firebase.crashlytics.internal.common.c1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((com.google.firebase.crashlytics.internal.model.f0.d) obj).b().compareTo(((com.google.firebase.crashlytics.internal.model.f0.d) obj2).b());
            }
        });
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean s(@NonNull Task<f0> task) {
        if (!task.u()) {
            com.google.firebase.crashlytics.internal.g.f().n("Crashlytics report could not be enqueued to DataTransport", task.p());
            return false;
        }
        f0 f0VarQ = task.q();
        com.google.firebase.crashlytics.internal.g.f().b("Crashlytics report successfully enqueued to DataTransport: " + f0VarQ.d());
        File fileC = f0VarQ.c();
        if (fileC.delete()) {
            com.google.firebase.crashlytics.internal.g.f().b("Deleted report file: " + fileC.getPath());
            return true;
        }
        com.google.firebase.crashlytics.internal.g.f().m("Crashlytics could not delete report file: " + fileC.getPath());
        return true;
    }

    private void t(@NonNull Throwable th2, @NonNull Thread thread, @NonNull String str, @NonNull final com.google.firebase.crashlytics.internal.metadata.c cVar, boolean z10) {
        final boolean zEquals = str.equals("crash");
        final com.google.firebase.crashlytics.internal.model.f0.f.d dVarF = f(this.f121038a.d(th2, thread, str, cVar.h(), 4, 8, z10), cVar.f());
        if (z10) {
            this.f121039b.x(dVarF, cVar.g(), zEquals);
        } else {
            this.f121044g.f121234b.j(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.b1
                @Override // java.lang.Runnable
                public final void run() {
                    e1.a(this.f120980a, dVarF, cVar, zEquals);
                }
            });
        }
    }

    public void l(@NonNull String str, @NonNull List<q0> list, com.google.firebase.crashlytics.internal.model.f0.a aVar) {
        com.google.firebase.crashlytics.internal.g.f().b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator<q0> it = list.iterator();
        while (it.hasNext()) {
            com.google.firebase.crashlytics.internal.model.f0.e.b bVarB = it.next().b();
            if (bVarB != null) {
                arrayList.add(bVarB);
            }
        }
        this.f121039b.l(str, com.google.firebase.crashlytics.internal.model.f0.e.a().b(Collections.unmodifiableList(arrayList)).a(), aVar);
    }

    public void m(long j10, @androidx.annotation.p0 String str) {
        this.f121039b.k(str, j10);
    }

    public boolean p() {
        return this.f121039b.r();
    }

    public SortedSet<String> q() {
        return this.f121039b.p();
    }

    public void r(@NonNull String str, long j10) {
        this.f121039b.y(this.f121038a.e(str, j10));
    }

    public void u(@NonNull Throwable th2, @NonNull Thread thread, @NonNull String str, long j10) {
        com.google.firebase.crashlytics.internal.g.f().k("Persisting fatal event for session " + str);
        t(th2, thread, "crash", new com.google.firebase.crashlytics.internal.metadata.c(str, j10), true);
    }

    public void v(@NonNull Throwable th2, @NonNull Thread thread, @NonNull com.google.firebase.crashlytics.internal.metadata.c cVar) {
        com.google.firebase.crashlytics.internal.g.f().k("Persisting non-fatal event for session " + cVar.g());
        t(th2, thread, "error", cVar, false);
    }

    @androidx.annotation.w0(api = 30)
    public void w(String str, List<ApplicationExitInfo> list, com.google.firebase.crashlytics.internal.metadata.f fVar, com.google.firebase.crashlytics.internal.metadata.p pVar) {
        ApplicationExitInfo applicationExitInfoN = n(str, list);
        if (applicationExitInfoN == null) {
            com.google.firebase.crashlytics.internal.g.f().k("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        com.google.firebase.crashlytics.internal.model.f0.f.d dVarC = this.f121038a.c(h(applicationExitInfoN));
        com.google.firebase.crashlytics.internal.g.f().b("Persisting anr for session " + str);
        this.f121039b.x(g(d(dVarC, fVar, pVar), pVar), str, true);
    }

    public void x() {
        this.f121039b.i();
    }

    public Task<Void> y(@NonNull Executor executor) {
        return z(executor, null);
    }

    public Task<Void> z(@NonNull Executor executor, @androidx.annotation.p0 String str) {
        List<f0> listU = this.f121039b.u();
        ArrayList arrayList = new ArrayList();
        for (f0 f0Var : listU) {
            if (str == null || str.equals(f0Var.d())) {
                arrayList.add(this.f121040c.c(k(f0Var), str != null).m(executor, new com.google.android.gms.tasks.c() { // from class: com.google.firebase.crashlytics.internal.common.d1
                    @Override // com.google.android.gms.tasks.c
                    public final Object a(Task task) {
                        return Boolean.valueOf(this.f121015a.s(task));
                    }
                }));
            }
        }
        return com.google.android.gms.tasks.n.h(arrayList);
    }
}
