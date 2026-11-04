package io.sentry.android.core;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import io.sentry.ILogger;
import io.sentry.n8;
import io.sentry.o7;
import io.sentry.protocol.DebugImage;
import io.sentry.y7;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@e.a({"NewApi"})
public class AnrV2Integration implements io.sentry.x1, Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final long f303944d = TimeUnit.DAYS.toMillis(91);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f303945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.sentry.transport.p f303946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private SentryAndroidOptions f303947c;

    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Context f303948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final io.sentry.i1 f303949b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final SentryAndroidOptions f303950c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f303951d;

        a(@NotNull Context context, @NotNull io.sentry.i1 i1Var, @NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull io.sentry.transport.p pVar) {
            this.f303948a = context;
            this.f303949b = i1Var;
            this.f303950c = sentryAndroidOptions;
            this.f303951d = pVar.a() - AnrV2Integration.f303944d;
        }

        private byte[] a(@NotNull InputStream inputStream) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i10 = inputStream.read(bArr, 0, 1024);
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

        @NotNull
        private c b(@NotNull ApplicationExitInfo applicationExitInfo, boolean z10) {
            try {
                InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
                try {
                    if (traceInputStream == null) {
                        c cVar = new c(c.a.NO_DUMP);
                        if (traceInputStream == null) {
                            return cVar;
                        }
                        traceInputStream.close();
                        return cVar;
                    }
                    byte[] bArrA = a(traceInputStream);
                    traceInputStream.close();
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArrA)));
                        try {
                            io.sentry.android.core.internal.threaddump.b bVarC = io.sentry.android.core.internal.threaddump.b.c(bufferedReader);
                            io.sentry.android.core.internal.threaddump.c cVar2 = new io.sentry.android.core.internal.threaddump.c(this.f303950c, z10);
                            cVar2.i(bVarC);
                            List<io.sentry.protocol.b0> listF = cVar2.f();
                            List<DebugImage> listC = cVar2.c();
                            if (listF.isEmpty()) {
                                c cVar3 = new c(c.a.NO_DUMP);
                                bufferedReader.close();
                                return cVar3;
                            }
                            c cVar4 = new c(c.a.DUMP, bArrA, listF, listC);
                            bufferedReader.close();
                            return cVar4;
                        } catch (Throwable th2) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        this.f303950c.getLogger().a(y7.WARNING, "Failed to parse ANR thread dump", th4);
                        return new c(c.a.ERROR, bArrA);
                    }
                } catch (Throwable th5) {
                    if (traceInputStream != null) {
                        try {
                            traceInputStream.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                    }
                    throw th5;
                }
            } catch (Throwable th7) {
                this.f303950c.getLogger().a(y7.WARNING, "Failed to read ANR thread dump", th7);
                return new c(c.a.NO_DUMP);
            }
        }

        private void c(@NotNull ApplicationExitInfo applicationExitInfo, boolean z10) {
            byte[] bArr;
            long timestamp = applicationExitInfo.getTimestamp();
            boolean z11 = applicationExitInfo.getImportance() != 100;
            c cVarB = b(applicationExitInfo, z11);
            if (cVarB.f303955a == c.a.NO_DUMP) {
                this.f303950c.getLogger().c(y7.WARNING, "Not reporting ANR event as there was no thread dump for the ANR %s", applicationExitInfo.toString());
                return;
            }
            b bVar = new b(this.f303950c.getFlushTimeoutMillis(), this.f303950c.getLogger(), timestamp, z10, z11);
            io.sentry.n0 n0VarE = io.sentry.util.n.e(bVar);
            o7 o7Var = new o7();
            c.a aVar = cVarB.f303955a;
            if (aVar == c.a.ERROR) {
                io.sentry.protocol.k kVar = new io.sentry.protocol.k();
                kVar.g("Sentry Android SDK failed to parse system thread dump for this ANR. We recommend enabling [SentryOptions.isAttachAnrThreadDump] option to attach the thread dump as plain text and report this issue on GitHub.");
                o7Var.O0(kVar);
            } else if (aVar == c.a.DUMP) {
                o7Var.R0(cVarB.f303957c);
                if (cVarB.f303958d != null) {
                    io.sentry.protocol.d dVar = new io.sentry.protocol.d();
                    dVar.f(cVarB.f303958d);
                    o7Var.Y(dVar);
                }
            }
            o7Var.M0(y7.FATAL);
            o7Var.S0(io.sentry.p.e(timestamp));
            if (this.f303950c.isAttachAnrThreadDump() && (bArr = cVarB.f303956b) != null) {
                n0VarE.r(io.sentry.b.c(bArr));
            }
            if (this.f303949b.o0(o7Var, n0VarE).equals(io.sentry.protocol.v.f306474b) || bVar.h()) {
                return;
            }
            this.f303950c.getLogger().c(y7.WARNING, "Timed out waiting to flush ANR event to disk. Event: %s", o7Var.I());
        }

        private void d(@NotNull List<ApplicationExitInfo> list, @Nullable Long l10) {
            Collections.reverse(list);
            Iterator<ApplicationExitInfo> it = list.iterator();
            while (it.hasNext()) {
                ApplicationExitInfo applicationExitInfoA = androidx.work.impl.utils.g.a(it.next());
                if (applicationExitInfoA.getReason() == 6) {
                    if (applicationExitInfoA.getTimestamp() < this.f303951d) {
                        this.f303950c.getLogger().c(y7.DEBUG, "ANR happened too long ago %s.", applicationExitInfoA);
                    } else if (l10 == null || applicationExitInfoA.getTimestamp() > l10.longValue()) {
                        c(applicationExitInfoA, false);
                    } else {
                        this.f303950c.getLogger().c(y7.DEBUG, "ANR has already been reported %s.", applicationExitInfoA);
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        @e.a({"NewApi"})
        public void run() {
            ApplicationExitInfo applicationExitInfo = null;
            boolean z10 = false | false;
            List historicalProcessExitReasons = ((ActivityManager) this.f303948a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() == 0) {
                this.f303950c.getLogger().c(y7.DEBUG, "No records in historical exit reasons.", new Object[0]);
                return;
            }
            io.sentry.cache.g envelopeDiskCache = this.f303950c.getEnvelopeDiskCache();
            if ((envelopeDiskCache instanceof io.sentry.cache.f) && this.f303950c.isEnableAutoSessionTracking()) {
                io.sentry.cache.f fVar = (io.sentry.cache.f) envelopeDiskCache;
                if (!fVar.O()) {
                    this.f303950c.getLogger().c(y7.WARNING, "Timed out waiting to flush previous session to its own file.", new Object[0]);
                    fVar.D();
                }
            }
            ArrayList arrayList = new ArrayList(historicalProcessExitReasons);
            Long lV = io.sentry.android.core.cache.b.V(this.f303950c);
            Iterator<ApplicationExitInfo> it = arrayList.iterator();
            while (it.hasNext()) {
                ApplicationExitInfo applicationExitInfoA = androidx.work.impl.utils.g.a(it.next());
                if (applicationExitInfoA.getReason() == 6) {
                    arrayList.remove(applicationExitInfoA);
                    applicationExitInfo = applicationExitInfoA;
                    break;
                }
            }
            if (applicationExitInfo == null) {
                this.f303950c.getLogger().c(y7.DEBUG, "No ANRs have been found in the historical exit reasons list.", new Object[0]);
                return;
            }
            if (applicationExitInfo.getTimestamp() < this.f303951d) {
                this.f303950c.getLogger().c(y7.DEBUG, "Latest ANR happened too long ago, returning early.", new Object[0]);
                return;
            }
            if (lV != null && applicationExitInfo.getTimestamp() <= lV.longValue()) {
                this.f303950c.getLogger().c(y7.DEBUG, "Latest ANR has already been reported, returning early.", new Object[0]);
                return;
            }
            if (this.f303950c.isReportHistoricalAnrs()) {
                d(arrayList, lV);
            }
            c(applicationExitInfo, true);
        }
    }

    @lm.a.c
    public static final class b extends io.sentry.hints.d implements io.sentry.hints.c, io.sentry.hints.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f303952d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f303953e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f303954f;

        public b(long j10, @NotNull ILogger iLogger, long j11, boolean z10, boolean z11) {
            super(j10, iLogger);
            this.f303952d = j11;
            this.f303953e = z10;
            this.f303954f = z11;
        }

        @Override // io.sentry.hints.a
        public Long b() {
            return Long.valueOf(this.f303952d);
        }

        @Override // io.sentry.hints.a
        public boolean c() {
            return false;
        }

        @Override // io.sentry.hints.a
        public String d() {
            return this.f303954f ? "anr_background" : "anr_foreground";
        }

        @Override // io.sentry.hints.c
        public boolean e() {
            return this.f303953e;
        }

        @Override // io.sentry.hints.f
        public boolean f(@Nullable io.sentry.protocol.v vVar) {
            return true;
        }

        @Override // io.sentry.hints.f
        public void g(@NotNull io.sentry.protocol.v vVar) {
        }
    }

    public AnrV2Integration(@NotNull Context context) {
        this(context, io.sentry.transport.n.b());
    }

    @Override // io.sentry.x1
    @e.a({"NewApi"})
    public void c(@NotNull io.sentry.i1 i1Var, @NotNull n8 n8Var) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.y.c(n8Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) n8Var : null, "SentryAndroidOptions is required");
        this.f303947c = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().c(y7.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(this.f303947c.isAnrEnabled()));
        if (this.f303947c.getCacheDirPath() == null) {
            this.f303947c.getLogger().c(y7.INFO, "Cache dir is not set, unable to process ANRs", new Object[0]);
            return;
        }
        if (this.f303947c.isAnrEnabled()) {
            try {
                n8Var.getExecutorService().submit(new a(this.f303945a, i1Var, this.f303947c, this.f303946b));
            } catch (Throwable th2) {
                n8Var.getLogger().a(y7.DEBUG, "Failed to start AnrProcessor.", th2);
            }
            n8Var.getLogger().c(y7.DEBUG, "AnrV2Integration installed.", new Object[0]);
            io.sentry.util.q.a("AnrV2");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        SentryAndroidOptions sentryAndroidOptions = this.f303947c;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(y7.DEBUG, "AnrV2Integration removed.", new Object[0]);
        }
    }

    AnrV2Integration(@NotNull Context context, @NotNull io.sentry.transport.p pVar) {
        this.f303945a = a1.g(context);
        this.f303946b = pVar;
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a f303955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final byte[] f303956b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        final List<io.sentry.protocol.b0> f303957c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        final List<DebugImage> f303958d;

        enum a {
            DUMP,
            NO_DUMP,
            ERROR
        }

        c(@NotNull a aVar) {
            this.f303955a = aVar;
            this.f303956b = null;
            this.f303957c = null;
            this.f303958d = null;
        }

        c(@NotNull a aVar, byte[] bArr) {
            this.f303955a = aVar;
            this.f303956b = bArr;
            this.f303957c = null;
            this.f303958d = null;
        }

        c(@NotNull a aVar, byte[] bArr, @Nullable List<io.sentry.protocol.b0> list, @Nullable List<DebugImage> list2) {
            this.f303955a = aVar;
            this.f303956b = bArr;
            this.f303957c = list;
            this.f303958d = list2;
        }
    }
}
