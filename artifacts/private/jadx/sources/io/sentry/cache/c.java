package io.sentry.cache;

import io.sentry.g6;
import io.sentry.k9;
import io.sentry.m7;
import io.sentry.n1;
import io.sentry.n8;
import io.sentry.util.y;
import io.sentry.x7;
import io.sentry.y7;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
public abstract class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final Charset f305171e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    protected n8 f305172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    protected final io.sentry.util.s<n1> f305173b = new io.sentry.util.s<>(new io.sentry.util.s.a() { // from class: io.sentry.cache.a
        @Override // io.sentry.util.s.a
        public final Object a() {
            return this.f305170a.f305172a.getSerializer();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    protected final File f305174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f305175d;

    c(@NotNull n8 n8Var, @NotNull String str, int i10) {
        y.c(str, "Directory is required.");
        this.f305172a = (n8) y.c(n8Var, "SentryOptions is required.");
        this.f305174c = new File(str);
        this.f305175d = i10;
    }

    @NotNull
    private g6 i(@NotNull g6 g6Var, @NotNull m7 m7Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<m7> it = g6Var.e().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        arrayList.add(m7Var);
        return new g6(g6Var.d(), arrayList);
    }

    @Nullable
    private k9 k(@NotNull g6 g6Var) {
        for (m7 m7Var : g6Var.e()) {
            if (m(m7Var)) {
                return t(m7Var);
            }
        }
        return null;
    }

    private boolean m(@Nullable m7 m7Var) {
        if (m7Var == null) {
            return false;
        }
        return m7Var.S().f().equals(x7.Session);
    }

    private boolean n(@NotNull g6 g6Var) {
        return g6Var.e().iterator().hasNext();
    }

    private boolean p(@NotNull k9 k9Var) {
        return k9Var.q().equals(k9.c.Ok) && k9Var.o() != null;
    }

    private void r(@NotNull File file, @NotNull File[] fileArr) {
        Boolean boolJ;
        m7 m7VarN;
        k9 k9VarT;
        g6 g6VarS = s(file);
        if (g6VarS == null || !n(g6VarS)) {
            return;
        }
        this.f305172a.getClientReportRecorder().d(io.sentry.clientreport.f.CACHE_OVERFLOW, g6VarS);
        k9 k9VarK = k(g6VarS);
        if (k9VarK != null && p(k9VarK) && (boolJ = k9VarK.j()) != null && boolJ.booleanValue()) {
            for (File file2 : fileArr) {
                g6 g6VarS2 = s(file2);
                if (g6VarS2 != null && n(g6VarS2)) {
                    Iterator<m7> it = g6VarS2.e().iterator();
                    while (true) {
                        m7VarN = null;
                        if (!it.hasNext()) {
                            break;
                        }
                        m7 next = it.next();
                        if (m(next) && (k9VarT = t(next)) != null && p(k9VarT)) {
                            Boolean boolJ2 = k9VarT.j();
                            if (boolJ2 != null && boolJ2.booleanValue()) {
                                this.f305172a.getLogger().c(y7.ERROR, "Session %s has 2 times the init flag.", k9VarK.o());
                                return;
                            }
                            if (k9VarK.o() != null && k9VarK.o().equals(k9VarT.o())) {
                                k9VarT.u();
                                try {
                                    m7VarN = m7.N(this.f305173b.a(), k9VarT);
                                    it.remove();
                                    break;
                                } catch (IOException e10) {
                                    this.f305172a.getLogger().b(y7.ERROR, e10, "Failed to create new envelope item for the session %s", k9VarK.o());
                                    break;
                                }
                            }
                        }
                    }
                    if (m7VarN != null) {
                        g6 g6VarI = i(g6VarS2, m7VarN);
                        long jLastModified = file2.lastModified();
                        if (!file2.delete()) {
                            this.f305172a.getLogger().c(y7.WARNING, "File can't be deleted: %s", file2.getAbsolutePath());
                        }
                        v(g6VarI, file2, jLastModified);
                        return;
                    }
                }
            }
        }
    }

    @Nullable
    private g6 s(@NotNull File file) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                g6 g6VarE = this.f305173b.a().e(bufferedInputStream);
                bufferedInputStream.close();
                return g6VarE;
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            this.f305172a.getLogger().a(y7.ERROR, "Failed to deserialize the envelope.", e10);
            return null;
        }
    }

    @Nullable
    private k9 t(@NotNull m7 m7Var) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(m7Var.Q()), f305171e));
            try {
                k9 k9Var = (k9) this.f305173b.a().c(bufferedReader, k9.class);
                bufferedReader.close();
                return k9Var;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            this.f305172a.getLogger().a(y7.ERROR, "Failed to deserialize the session.", th4);
            return null;
        }
    }

    private void v(@NotNull g6 g6Var, @NotNull File file, long j10) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                this.f305173b.a().b(g6Var, fileOutputStream);
                file.setLastModified(j10);
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
            this.f305172a.getLogger().a(y7.ERROR, "Failed to serialize the new envelope to the disk.", th4);
        }
    }

    private void w(@NotNull File[] fileArr) {
        if (fileArr.length > 1) {
            Arrays.sort(fileArr, new Comparator() { // from class: io.sentry.cache.b
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
                }
            });
        }
    }

    protected boolean l() {
        if (this.f305174c.isDirectory() && this.f305174c.canWrite() && this.f305174c.canRead()) {
            return true;
        }
        this.f305172a.getLogger().c(y7.ERROR, "The directory for caching files is inaccessible.: %s", this.f305174c.getAbsolutePath());
        return false;
    }

    protected void u(@NotNull File[] fileArr) {
        int length = fileArr.length;
        if (length >= this.f305175d) {
            boolean z10 = false | false;
            this.f305172a.getLogger().c(y7.WARNING, "Cache folder if full (respecting maxSize). Rotating files", new Object[0]);
            int i10 = (length - this.f305175d) + 1;
            w(fileArr);
            File[] fileArr2 = (File[]) Arrays.copyOfRange(fileArr, i10, length);
            for (int i11 = 0; i11 < i10; i11++) {
                File file = fileArr[i11];
                r(file, fileArr2);
                if (!file.delete()) {
                    this.f305172a.getLogger().c(y7.WARNING, "File can't be deleted: %s", file.getAbsolutePath());
                }
            }
        }
    }
}
