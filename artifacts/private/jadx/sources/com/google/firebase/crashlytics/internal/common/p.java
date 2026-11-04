package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
class p {
    private static final String A = "com.crashlytics.version-control-info";
    private static final String B = "version-control-info.textproto";
    private static final String C = "META-INF/";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final String f121148t = "fatal";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final String f121149u = "timestamp";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final String f121150v = "_ae";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final String f121151w = ".ae";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final int f121153y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f121154z = "Crashlytics Android SDK/%s";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f121155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i0 f121156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f121157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.metadata.p f121158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.concurrency.n f121159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n0 f121160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.persistence.g f121161g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.common.a f121162h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.metadata.f f121163i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.a f121164j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.analytics.a f121165k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final m f121166l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final e1 f121167m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private g0 f121168n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private com.google.firebase.crashlytics.internal.settings.k f121169o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final com.google.android.gms.tasks.l<Boolean> f121170p = new com.google.android.gms.tasks.l<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final com.google.android.gms.tasks.l<Boolean> f121171q = new com.google.android.gms.tasks.l<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final com.google.android.gms.tasks.l<Void> f121172r = new com.google.android.gms.tasks.l<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final AtomicBoolean f121173s = new AtomicBoolean(false);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final FilenameFilter f121152x = new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.common.o
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith(p.f121151w);
        }
    };
    private static final Charset D = Charset.forName("UTF-8");

    class a implements g0.a {
        a() {
        }

        @Override // com.google.firebase.crashlytics.internal.common.g0.a
        public void a(@NonNull com.google.firebase.crashlytics.internal.settings.k kVar, @NonNull Thread thread, @NonNull Throwable th2) throws Throwable {
            p.this.J(kVar, thread, th2);
        }
    }

    class b implements Callable<Task<Void>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f121175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f121176b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Thread f121177c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.google.firebase.crashlytics.internal.settings.k f121178d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f121179e;

        class a implements com.google.android.gms.tasks.k<com.google.firebase.crashlytics.internal.settings.d, Void> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f121181a;

            a(String str) {
                this.f121181a = str;
            }

            @Override // com.google.android.gms.tasks.k
            @NonNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Task<Void> a(@androidx.annotation.p0 com.google.firebase.crashlytics.internal.settings.d dVar) throws Exception {
                if (dVar != null) {
                    return com.google.android.gms.tasks.n.i(p.this.O(), p.this.f121167m.z(p.this.f121159e.f121233a, b.this.f121179e ? this.f121181a : null));
                }
                com.google.firebase.crashlytics.internal.g.f().m("Received null app settings, cannot send reports at crash time.");
                return com.google.android.gms.tasks.n.g(null);
            }
        }

        b(long j10, Throwable th2, Thread thread, com.google.firebase.crashlytics.internal.settings.k kVar, boolean z10) {
            this.f121175a = j10;
            this.f121176b = th2;
            this.f121177c = thread;
            this.f121178d = kVar;
            this.f121179e = z10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task<Void> call() throws Exception {
            long jG = p.G(this.f121175a);
            String strC = p.this.C();
            if (strC == null) {
                com.google.firebase.crashlytics.internal.g.f().d("Tried to write a fatal exception while no session was open.");
                return com.google.android.gms.tasks.n.g(null);
            }
            p.this.f121157c.a();
            p.this.f121167m.u(this.f121176b, this.f121177c, strC, jG);
            p.this.x(this.f121175a);
            p.this.u(this.f121178d);
            p.this.w(new h().c(), Boolean.valueOf(this.f121179e));
            return !p.this.f121156b.d() ? com.google.android.gms.tasks.n.g(null) : this.f121178d.b().w(p.this.f121159e.f121233a, new a(strC));
        }
    }

    class c implements com.google.android.gms.tasks.k<Void, Boolean> {
        c() {
        }

        @Override // com.google.android.gms.tasks.k
        @NonNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Task<Boolean> a(@androidx.annotation.p0 Void r10) throws Exception {
            return com.google.android.gms.tasks.n.g(Boolean.TRUE);
        }
    }

    class d implements com.google.android.gms.tasks.k<Boolean, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Task f121184a;

        class a implements com.google.android.gms.tasks.k<com.google.firebase.crashlytics.internal.settings.d, Void> {
            a() {
            }

            @Override // com.google.android.gms.tasks.k
            @NonNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Task<Void> a(@androidx.annotation.p0 com.google.firebase.crashlytics.internal.settings.d dVar) throws Exception {
                if (dVar == null) {
                    com.google.firebase.crashlytics.internal.g.f().m("Received null app settings at app startup. Cannot send cached reports");
                    return com.google.android.gms.tasks.n.g(null);
                }
                p.this.O();
                p.this.f121167m.y(p.this.f121159e.f121233a);
                p.this.f121172r.e(null);
                return com.google.android.gms.tasks.n.g(null);
            }
        }

        d(Task task) {
            this.f121184a = task;
        }

        @Override // com.google.android.gms.tasks.k
        @NonNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Task<Void> a(@androidx.annotation.p0 Boolean bool) throws Exception {
            if (bool.booleanValue()) {
                com.google.firebase.crashlytics.internal.g.f().b("Sending cached crash reports...");
                p.this.f121156b.c(bool.booleanValue());
                return this.f121184a.w(p.this.f121159e.f121233a, new a());
            }
            com.google.firebase.crashlytics.internal.g.f().k("Deleting cached crash reports...");
            p.r(p.this.M());
            p.this.f121167m.x();
            p.this.f121172r.e(null);
            return com.google.android.gms.tasks.n.g(null);
        }
    }

    class e implements Callable<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f121187a;

        e(long j10) {
            this.f121187a = j10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            Bundle bundle = new Bundle();
            bundle.putInt(p.f121148t, 1);
            bundle.putLong("timestamp", this.f121187a);
            p.this.f121165k.a(p.f121150v, bundle);
            return null;
        }
    }

    p(Context context, n0 n0Var, i0 i0Var, com.google.firebase.crashlytics.internal.persistence.g gVar, d0 d0Var, com.google.firebase.crashlytics.internal.common.a aVar, com.google.firebase.crashlytics.internal.metadata.p pVar, com.google.firebase.crashlytics.internal.metadata.f fVar, e1 e1Var, com.google.firebase.crashlytics.internal.a aVar2, com.google.firebase.crashlytics.internal.analytics.a aVar3, m mVar, com.google.firebase.crashlytics.internal.concurrency.n nVar) {
        this.f121155a = context;
        this.f121160f = n0Var;
        this.f121156b = i0Var;
        this.f121161g = gVar;
        this.f121157c = d0Var;
        this.f121162h = aVar;
        this.f121158d = pVar;
        this.f121163i = fVar;
        this.f121164j = aVar2;
        this.f121165k = aVar3;
        this.f121166l = mVar;
        this.f121167m = e1Var;
        this.f121159e = nVar;
    }

    private static boolean B() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.p0
    public String C() {
        SortedSet<String> sortedSetQ = this.f121167m.q();
        if (sortedSetQ.isEmpty()) {
            return null;
        }
        return sortedSetQ.first();
    }

    private static long D() {
        return G(System.currentTimeMillis());
    }

    @NonNull
    static List<q0> E(com.google.firebase.crashlytics.internal.h hVar, String str, com.google.firebase.crashlytics.internal.persistence.g gVar, byte[] bArr) {
        File fileR = gVar.r(str, com.google.firebase.crashlytics.internal.metadata.p.f121326h);
        File fileR2 = gVar.r(str, com.google.firebase.crashlytics.internal.metadata.p.f121327i);
        File fileR3 = gVar.r(str, com.google.firebase.crashlytics.internal.metadata.p.f121329k);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new g("logs_file", "logs", bArr));
        arrayList.add(new l0("crash_meta_file", "metadata", hVar.h()));
        arrayList.add(new l0("session_meta_file", io.sentry.cache.f.f305178k, hVar.g()));
        arrayList.add(new l0("app_meta_file", "app", hVar.e()));
        arrayList.add(new l0("device_meta_file", "device", hVar.a()));
        arrayList.add(new l0("os_meta_file", "os", hVar.f()));
        arrayList.add(R(hVar));
        arrayList.add(new l0("user_meta_file", "user", fileR));
        arrayList.add(new l0("keys_file", com.google.firebase.crashlytics.internal.metadata.p.f121327i, fileR2));
        arrayList.add(new l0("rollouts_file", "rollouts", fileR3));
        return arrayList;
    }

    private InputStream F(String str) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader != null) {
            return classLoader.getResourceAsStream(str);
        }
        com.google.firebase.crashlytics.internal.g.f().m("Couldn't get Class Loader");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long G(long j10) {
        return j10 / 1000;
    }

    private Task<Void> N(long j10) {
        if (B()) {
            com.google.firebase.crashlytics.internal.g.f().m("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return com.google.android.gms.tasks.n.g(null);
        }
        com.google.firebase.crashlytics.internal.g.f().b("Logging app exception event to Firebase Analytics");
        return com.google.android.gms.tasks.n.d(new ScheduledThreadPoolExecutor(1), new e(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> O() {
        ArrayList arrayList = new ArrayList();
        for (File file : M()) {
            try {
                arrayList.add(N(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                com.google.firebase.crashlytics.internal.g.f().m("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return com.google.android.gms.tasks.n.h(arrayList);
    }

    private static boolean Q(String str, File file, com.google.firebase.crashlytics.internal.model.f0.a aVar) {
        if (file == null || !file.exists()) {
            com.google.firebase.crashlytics.internal.g.f().m("No minidump data found for session " + str);
        }
        if (aVar == null) {
            com.google.firebase.crashlytics.internal.g.f().g("No Tombstones data found for session " + str);
        }
        return (file == null || !file.exists()) && aVar == null;
    }

    private static q0 R(com.google.firebase.crashlytics.internal.h hVar) {
        File fileD = hVar.d();
        if (fileD != null && fileD.exists()) {
            return new l0("minidump_file", "minidump", fileD);
        }
        return new g("minidump_file", "minidump", new byte[]{0});
    }

    private static byte[] T(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private Task<Boolean> b0() {
        if (this.f121156b.d()) {
            com.google.firebase.crashlytics.internal.g.f().b("Automatic data collection is enabled. Allowing upload.");
            this.f121170p.e(Boolean.FALSE);
            return com.google.android.gms.tasks.n.g(Boolean.TRUE);
        }
        com.google.firebase.crashlytics.internal.g.f().b("Automatic data collection is disabled.");
        com.google.firebase.crashlytics.internal.g.f().k("Notifying that unsent reports are available.");
        this.f121170p.e(Boolean.TRUE);
        Task<TContinuationResult> taskV = this.f121156b.j().v(new c());
        com.google.firebase.crashlytics.internal.g.f().b("Waiting for send/deleteUnsentReports to be called.");
        return com.google.firebase.crashlytics.internal.concurrency.b.b(taskV, this.f121171q.a());
    }

    private void c0(String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30) {
            com.google.firebase.crashlytics.internal.g.f().k("ANR feature enabled, but device is API " + i10);
            return;
        }
        List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f121155a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.size() != 0) {
            this.f121167m.w(str, historicalProcessExitReasons, new com.google.firebase.crashlytics.internal.metadata.f(this.f121161g, str), com.google.firebase.crashlytics.internal.metadata.p.l(str, this.f121161g, this.f121159e));
        } else {
            com.google.firebase.crashlytics.internal.g.f().k("No ApplicationExitInfo available. Session: " + str);
        }
    }

    private static com.google.firebase.crashlytics.internal.model.g0.a o(n0 n0Var, com.google.firebase.crashlytics.internal.common.a aVar) {
        return com.google.firebase.crashlytics.internal.model.g0.a.b(n0Var.f(), aVar.f120970f, aVar.f120971g, n0Var.a().c(), j0.l(aVar.f120968d).n(), aVar.f120972h);
    }

    private static com.google.firebase.crashlytics.internal.model.g0.b p(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return com.google.firebase.crashlytics.internal.model.g0.b.c(i.k(), Build.MODEL, Runtime.getRuntime().availableProcessors(), i.b(context), ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()), i.y(), i.l(), Build.MANUFACTURER, Build.PRODUCT);
    }

    private static com.google.firebase.crashlytics.internal.model.g0.c q() {
        return com.google.firebase.crashlytics.internal.model.g0.c.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, i.A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(List<File> list) {
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void v(boolean z10, com.google.firebase.crashlytics.internal.settings.k kVar, boolean z11) {
        String str;
        com.google.firebase.crashlytics.internal.concurrency.n.c();
        ArrayList arrayList = new ArrayList(this.f121167m.q());
        if (arrayList.size() <= z10) {
            com.google.firebase.crashlytics.internal.g.f().k("No open sessions to be closed.");
            return;
        }
        String str2 = (String) arrayList.get(z10 ? 1 : 0);
        if (z11 && kVar.a().f121861b.f121869b) {
            c0(str2);
        } else {
            com.google.firebase.crashlytics.internal.g.f().k("ANR feature disabled.");
        }
        if (z11 && this.f121164j.d(str2)) {
            z(str2);
        }
        if (z10 != 0) {
            str = (String) arrayList.get(0);
        } else {
            this.f121166l.e(null);
            str = null;
        }
        this.f121167m.m(D(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(String str, Boolean bool) {
        long jD = D();
        com.google.firebase.crashlytics.internal.g.f().b("Opening a new session with ID " + str);
        this.f121164j.a(str, String.format(Locale.US, f121154z, c0.u()), jD, com.google.firebase.crashlytics.internal.model.g0.b(o(this.f121160f, this.f121162h), q(), p(this.f121155a)));
        if (bool.booleanValue() && str != null) {
            this.f121158d.r(str);
        }
        this.f121163i.e(str);
        this.f121166l.e(str);
        this.f121167m.r(str, jD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(long j10) {
        try {
            if (this.f121161g.h(f121151w + j10).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e10) {
            com.google.firebase.crashlytics.internal.g.f().n("Could not create app exception marker file.", e10);
        }
    }

    private void z(String str) {
        com.google.firebase.crashlytics.internal.g.f().k("Finalizing native report for session " + str);
        com.google.firebase.crashlytics.internal.h hVarB = this.f121164j.b(str);
        File fileD = hVarB.d();
        com.google.firebase.crashlytics.internal.model.f0.a aVarB = hVarB.b();
        if (Q(str, fileD, aVarB)) {
            com.google.firebase.crashlytics.internal.g.f().m("No native core present");
            return;
        }
        long jLastModified = fileD.lastModified();
        com.google.firebase.crashlytics.internal.metadata.f fVar = new com.google.firebase.crashlytics.internal.metadata.f(this.f121161g, str);
        File fileL = this.f121161g.l(str);
        if (!fileL.isDirectory()) {
            com.google.firebase.crashlytics.internal.g.f().m("Couldn't create directory to store native session files, aborting.");
            return;
        }
        x(jLastModified);
        List<q0> listE = E(hVarB, str, this.f121161g, fVar.b());
        r0.b(fileL, listE);
        com.google.firebase.crashlytics.internal.g.f().b("CrashlyticsController#finalizePreviousNativeSession");
        this.f121167m.l(str, listE, aVarB);
        fVar.a();
    }

    boolean A(com.google.firebase.crashlytics.internal.settings.k kVar) {
        com.google.firebase.crashlytics.internal.concurrency.n.c();
        if (L()) {
            com.google.firebase.crashlytics.internal.g.f().m("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        com.google.firebase.crashlytics.internal.g.f().k("Finalizing previously open sessions.");
        try {
            v(true, kVar, true);
            com.google.firebase.crashlytics.internal.g.f().k("Closed all previously open sessions.");
            return true;
        } catch (Exception e10) {
            com.google.firebase.crashlytics.internal.g.f().e("Unable to finalize previously open sessions.", e10);
            return false;
        }
    }

    com.google.firebase.crashlytics.internal.metadata.p H() {
        return this.f121158d;
    }

    String I() throws IOException {
        String strS = i.s(this.f121155a);
        if (strS != null) {
            com.google.firebase.crashlytics.internal.g.f().b("Read version control info from string resource");
            return Base64.encodeToString(strS.getBytes(D), 0);
        }
        InputStream inputStreamF = F("META-INF/version-control-info.textproto");
        if (inputStreamF == null) {
            if (inputStreamF != null) {
                inputStreamF.close();
            }
            com.google.firebase.crashlytics.internal.g.f().g("No version control information found");
            return null;
        }
        try {
            com.google.firebase.crashlytics.internal.g.f().b("Read version control info from file");
            String strEncodeToString = Base64.encodeToString(T(inputStreamF), 0);
            inputStreamF.close();
            return strEncodeToString;
        } catch (Throwable th2) {
            try {
                inputStreamF.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    void J(@NonNull com.google.firebase.crashlytics.internal.settings.k kVar, @NonNull Thread thread, @NonNull Throwable th2) throws Throwable {
        K(kVar, thread, th2, false);
    }

    synchronized void K(@NonNull com.google.firebase.crashlytics.internal.settings.k kVar, @NonNull Thread thread, @NonNull Throwable th2, boolean z10) throws Throwable {
        p pVar;
        Throwable th3;
        try {
            try {
                com.google.firebase.crashlytics.internal.g.f().b("Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName());
                if (!z10) {
                    try {
                        com.google.firebase.sessions.api.a.c();
                    } catch (Throwable th4) {
                        th3 = th4;
                        pVar = this;
                        throw th3;
                    }
                }
                pVar = this;
                Task taskL = this.f121159e.f121233a.l(pVar.new b(System.currentTimeMillis(), th2, thread, kVar, z10));
                if (!z10) {
                    try {
                        h1.b(taskL);
                    } catch (TimeoutException unused) {
                        com.google.firebase.crashlytics.internal.g.f().d("Cannot send reports. Timed out while fetching settings.");
                    } catch (Exception e10) {
                        com.google.firebase.crashlytics.internal.g.f().e("Error handling uncaught exception", e10);
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                pVar = this;
                th3 = th;
                throw th3;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    boolean L() {
        g0 g0Var = this.f121168n;
        return g0Var != null && g0Var.a();
    }

    List<File> M() {
        return this.f121161g.i(f121152x);
    }

    void P(Thread thread, Throwable th2) {
        com.google.firebase.crashlytics.internal.settings.k kVar = this.f121169o;
        if (kVar == null) {
            com.google.firebase.crashlytics.internal.g.f().m("settingsProvider not set");
        } else {
            K(kVar, thread, th2, true);
        }
    }

    void S(final String str) {
        this.f121159e.f121233a.j(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f121131a.w(str, Boolean.FALSE);
            }
        });
    }

    void U() {
        try {
            String strI = I();
            if (strI != null) {
                Y(A, strI);
                com.google.firebase.crashlytics.internal.g.f().g("Saved version control info");
            }
        } catch (IOException e10) {
            com.google.firebase.crashlytics.internal.g.f().n("Unable to save version control info", e10);
        }
    }

    Task<Void> V() {
        this.f121171q.e(Boolean.TRUE);
        return this.f121172r.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void W(String str, String str2) {
        try {
            this.f121158d.o(str, str2);
        } catch (IllegalArgumentException e10) {
            Context context = this.f121155a;
            if (context != null && i.w(context)) {
                throw e10;
            }
            com.google.firebase.crashlytics.internal.g.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void X(Map<String, String> map) {
        this.f121158d.p(map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Y(String str, String str2) {
        try {
            this.f121158d.q(str, str2);
        } catch (IllegalArgumentException e10) {
            Context context = this.f121155a;
            if (context != null && i.w(context)) {
                throw e10;
            }
            com.google.firebase.crashlytics.internal.g.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Z(String str) {
        this.f121158d.s(str);
    }

    void a0(Task<com.google.firebase.crashlytics.internal.settings.d> task) {
        if (this.f121167m.p()) {
            com.google.firebase.crashlytics.internal.g.f().k("Crash reports are available to be sent.");
            b0().w(this.f121159e.f121233a, new d(task));
        } else {
            com.google.firebase.crashlytics.internal.g.f().k("No crash reports are available to be sent.");
            this.f121170p.e(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d0(@NonNull Thread thread, @NonNull Throwable th2, @NonNull Map<String, String> map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (L()) {
            return;
        }
        long jG = G(jCurrentTimeMillis);
        String strC = C();
        if (strC == null) {
            com.google.firebase.crashlytics.internal.g.f().m("Tried to write a non-fatal exception while no session was open.");
        } else {
            this.f121167m.v(th2, thread, new com.google.firebase.crashlytics.internal.metadata.c(strC, jG, map));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e0(long j10, String str) {
        if (L()) {
            return;
        }
        this.f121163i.g(j10, str);
    }

    @NonNull
    Task<Boolean> n() {
        if (this.f121173s.compareAndSet(false, true)) {
            return this.f121170p.a();
        }
        com.google.firebase.crashlytics.internal.g.f().m("checkForUnsentReports should only be called once per execution.");
        return com.google.android.gms.tasks.n.g(Boolean.FALSE);
    }

    Task<Void> s() {
        this.f121171q.e(Boolean.FALSE);
        return this.f121172r.a();
    }

    boolean t() {
        com.google.firebase.crashlytics.internal.concurrency.n.c();
        if (!this.f121157c.c()) {
            String strC = C();
            return strC != null && this.f121164j.d(strC);
        }
        com.google.firebase.crashlytics.internal.g.f().k("Found previous crash marker.");
        this.f121157c.d();
        return true;
    }

    void u(com.google.firebase.crashlytics.internal.settings.k kVar) {
        v(false, kVar, false);
    }

    void y(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, com.google.firebase.crashlytics.internal.settings.k kVar) {
        this.f121169o = kVar;
        S(str);
        g0 g0Var = new g0(new a(), kVar, uncaughtExceptionHandler, this.f121164j);
        this.f121168n = g0Var;
        Thread.setDefaultUncaughtExceptionHandler(g0Var);
    }
}
