package io.sentry.cache;

import io.sentry.ILogger;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.d6;
import io.sentry.e9;
import io.sentry.g6;
import io.sentry.k9;
import io.sentry.m1;
import io.sentry.m7;
import io.sentry.n0;
import io.sentry.n8;
import io.sentry.util.y;
import io.sentry.x7;
import io.sentry.y7;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public class f extends c implements g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f305177j = ".envelope";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f305178k = "session";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f305179l = "previous_session";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final String f305180m = ".json";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f305181n = "last_crash";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f305182o = ".sentry-native/last_crash";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f305183s = "startup_crash";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CountDownLatch f305184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Map<g6, String> f305185g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    protected final io.sentry.util.a f305186h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    protected final io.sentry.util.a f305187i;

    public f(@NotNull n8 n8Var, @NotNull String str, int i10) {
        super(n8Var, str, i10);
        this.f305185g = new WeakHashMap();
        this.f305186h = new io.sentry.util.a();
        this.f305187i = new io.sentry.util.a();
        this.f305184f = new CountDownLatch(1);
    }

    @NotNull
    private File[] B() {
        File[] fileArrListFiles;
        return (!l() || (fileArrListFiles = this.f305174c.listFiles(new FilenameFilter() { // from class: io.sentry.cache.e
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return str.endsWith(f.f305177j);
            }
        })) == null) ? new File[0] : fileArrListFiles;
    }

    @NotNull
    public static g C(@NotNull n8 n8Var) {
        String cacheDirPath = n8Var.getCacheDirPath();
        int maxCacheItems = n8Var.getMaxCacheItems();
        if (cacheDirPath != null) {
            return new f(n8Var, cacheDirPath, maxCacheItems);
        }
        n8Var.getLogger().c(y7.WARNING, "cacheDirPath is null, returning NoOpEnvelopeCache", new Object[0]);
        return io.sentry.transport.s.c();
    }

    @NotNull
    public static File F(@NotNull String str) {
        return new File(str, "session.json");
    }

    @NotNull
    private File G(@NotNull g6 g6Var) {
        String str;
        m1 m1VarA = this.f305186h.a();
        try {
            if (this.f305185g.containsKey(g6Var)) {
                str = this.f305185g.get(g6Var);
            } else {
                String str2 = e9.a() + f305177j;
                this.f305185g.put(g6Var, str2);
                str = str2;
            }
            File file = new File(this.f305174c.getAbsolutePath(), str);
            if (m1VarA != null) {
                m1VarA.close();
            }
            return file;
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @NotNull
    public static File J(@NotNull String str) {
        return new File(str, "previous_session.json");
    }

    private boolean L(@NotNull g6 g6Var, @NotNull n0 n0Var) {
        y.c(g6Var, "Envelope is required.");
        u(B());
        File fileF = F(this.f305174c.getAbsolutePath());
        File fileJ = J(this.f305174c.getAbsolutePath());
        if (io.sentry.util.n.h(n0Var, io.sentry.hints.l.class) && !fileF.delete()) {
            this.f305172a.getLogger().c(y7.WARNING, "Current envelope doesn't exist.", new Object[0]);
        }
        if (io.sentry.util.n.h(n0Var, io.sentry.hints.a.class)) {
            M(n0Var);
        }
        if (io.sentry.util.n.h(n0Var, io.sentry.hints.n.class)) {
            K(fileF, fileJ);
            N(fileF, g6Var);
            boolean zExists = new File(this.f305172a.getCacheDirPath(), f305182o).exists();
            if (!zExists) {
                File file = new File(this.f305172a.getCacheDirPath(), f305181n);
                if (file.exists()) {
                    this.f305172a.getLogger().c(y7.INFO, "Crash marker file exists, crashedLastRun will return true.", new Object[0]);
                    if (!file.delete()) {
                        this.f305172a.getLogger().c(y7.ERROR, "Failed to delete the crash marker file. %s.", file.getAbsolutePath());
                    }
                    zExists = true;
                }
            }
            d6.a().d(zExists);
            D();
        }
        File fileG = G(g6Var);
        if (fileG.exists()) {
            this.f305172a.getLogger().c(y7.WARNING, "Not adding Envelope to offline storage because it already exists: %s", fileG.getAbsolutePath());
            return true;
        }
        this.f305172a.getLogger().c(y7.DEBUG, "Adding Envelope to offline storage: %s", fileG.getAbsolutePath());
        boolean zQ = Q(fileG, g6Var);
        if (io.sentry.util.n.h(n0Var, UncaughtExceptionHandlerIntegration.a.class)) {
            P();
        }
        return zQ;
    }

    private void M(@NotNull n0 n0Var) {
        Date dateE;
        Object objG = io.sentry.util.n.g(n0Var);
        if (objG instanceof io.sentry.hints.a) {
            File fileJ = J(this.f305174c.getAbsolutePath());
            if (!fileJ.exists()) {
                this.f305172a.getLogger().c(y7.DEBUG, "No previous session file to end.", new Object[0]);
                return;
            }
            ILogger logger = this.f305172a.getLogger();
            y7 y7Var = y7.WARNING;
            logger.c(y7Var, "Previous session is not ended, we'd need to end it.", new Object[0]);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileJ), c.f305171e));
                try {
                    k9 k9Var = (k9) this.f305173b.a().c(bufferedReader, k9.class);
                    if (k9Var != null) {
                        io.sentry.hints.a aVar = (io.sentry.hints.a) objG;
                        Long lB = aVar.b();
                        if (lB != null) {
                            dateE = io.sentry.p.e(lB.longValue());
                            Date dateP = k9Var.p();
                            if (dateP == null || dateE.before(dateP)) {
                                this.f305172a.getLogger().c(y7Var, "Abnormal exit happened before previous session start, not ending the session.", new Object[0]);
                            }
                        } else {
                            dateE = null;
                        }
                        k9Var.w(k9.c.Abnormal, null, true, aVar.d());
                        k9Var.d(dateE);
                        R(fileJ, k9Var);
                    }
                    bufferedReader.close();
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                this.f305172a.getLogger().a(y7.ERROR, "Error processing previous session.", th4);
            }
        }
    }

    private void N(@NotNull File file, @NotNull g6 g6Var) {
        Iterable<m7> iterableE = g6Var.e();
        if (!iterableE.iterator().hasNext()) {
            this.f305172a.getLogger().c(y7.INFO, "Current envelope %s is empty", file.getAbsolutePath());
            return;
        }
        m7 next = iterableE.iterator().next();
        if (!x7.Session.equals(next.S().f())) {
            this.f305172a.getLogger().c(y7.INFO, "Current envelope has a different envelope type %s", next.S().f());
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(next.Q()), c.f305171e));
            try {
                k9 k9Var = (k9) this.f305173b.a().c(bufferedReader, k9.class);
                if (k9Var == null) {
                    this.f305172a.getLogger().c(y7.ERROR, "Item of type %s returned null by the parser.", next.S().f());
                } else {
                    R(file, k9Var);
                }
                bufferedReader.close();
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            this.f305172a.getLogger().a(y7.ERROR, "Item failed to process.", th4);
        }
    }

    private void P() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(this.f305172a.getCacheDirPath(), f305181n));
            try {
                fileOutputStream.write(io.sentry.p.h(io.sentry.p.d()).getBytes(c.f305171e));
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            this.f305172a.getLogger().a(y7.ERROR, "Error writing the crash marker file to the disk", th4);
        }
    }

    private boolean Q(@NotNull File file, @NotNull g6 g6Var) {
        if (file.exists()) {
            this.f305172a.getLogger().c(y7.DEBUG, "Overwriting envelope to offline storage: %s", file.getAbsolutePath());
            if (!file.delete()) {
                this.f305172a.getLogger().c(y7.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                this.f305173b.a().b(g6Var, fileOutputStream);
                fileOutputStream.close();
                return true;
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            this.f305172a.getLogger().b(y7.ERROR, th4, "Error writing Envelope %s to offline storage", file.getAbsolutePath());
            return false;
        }
    }

    private void R(@NotNull File file, @NotNull k9 k9Var) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, c.f305171e));
                try {
                    this.f305172a.getLogger().c(y7.DEBUG, "Overwriting session to offline storage: %s", k9Var.o());
                    this.f305173b.a().a(k9Var, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (Throwable th6) {
            this.f305172a.getLogger().b(y7.ERROR, th6, "Error writing Session to offline storage: %s", k9Var.o());
        }
    }

    public void D() {
        this.f305184f.countDown();
    }

    public void D3(@NotNull g6 g6Var, @NotNull n0 n0Var) {
        L(g6Var, n0Var);
    }

    public void K(@NotNull File file, @NotNull File file2) {
        m1 m1VarA = this.f305187i.a();
        try {
            if (file2.exists()) {
                this.f305172a.getLogger().c(y7.DEBUG, "Previous session file already exists, deleting it.", new Object[0]);
                if (!file2.delete()) {
                    this.f305172a.getLogger().c(y7.WARNING, "Unable to delete previous session file: %s", file2);
                }
            }
            if (file.exists()) {
                this.f305172a.getLogger().c(y7.INFO, "Moving current session to previous session.", new Object[0]);
                try {
                    if (!file.renameTo(file2)) {
                        this.f305172a.getLogger().c(y7.WARNING, "Unable to move current session to previous session.", new Object[0]);
                    }
                } catch (Throwable th2) {
                    this.f305172a.getLogger().a(y7.ERROR, "Error moving current session to previous session.", th2);
                }
            }
            if (m1VarA != null) {
                m1VarA.close();
            }
        } catch (Throwable th3) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    public boolean M3(@NotNull g6 g6Var, @NotNull n0 n0Var) {
        return L(g6Var, n0Var);
    }

    public boolean O() {
        try {
            return this.f305184f.await(this.f305172a.getSessionFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            this.f305172a.getLogger().c(y7.DEBUG, "Timed out waiting for previous session to flush.", new Object[0]);
            return false;
        }
    }

    @Override // io.sentry.cache.g
    public void e3(@NotNull g6 g6Var) {
        y.c(g6Var, "Envelope is required.");
        File fileG = G(g6Var);
        if (!fileG.exists()) {
            this.f305172a.getLogger().c(y7.DEBUG, "Envelope was not cached: %s", fileG.getAbsolutePath());
            return;
        }
        this.f305172a.getLogger().c(y7.DEBUG, "Discarding envelope from cache: %s", fileG.getAbsolutePath());
        if (!fileG.delete()) {
            this.f305172a.getLogger().c(y7.ERROR, "Failed to delete envelope: %s", fileG.getAbsolutePath());
        }
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<g6> iterator() {
        File[] fileArrB = B();
        ArrayList arrayList = new ArrayList(fileArrB.length);
        for (File file : fileArrB) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    arrayList.add(this.f305173b.a().e(bufferedInputStream));
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (FileNotFoundException unused) {
                this.f305172a.getLogger().c(y7.DEBUG, "Envelope file '%s' disappeared while converting all cached files to envelopes.", file.getAbsolutePath());
            } catch (IOException e10) {
                this.f305172a.getLogger().a(y7.ERROR, String.format("Error while reading cached envelope from file %s", file.getAbsolutePath()), e10);
            }
        }
        return arrayList.iterator();
    }
}
