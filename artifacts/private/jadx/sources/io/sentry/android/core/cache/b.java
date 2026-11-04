package io.sentry.android.core.cache;

import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.android.core.AnrV2Integration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.performance.h;
import io.sentry.cache.f;
import io.sentry.g6;
import io.sentry.n0;
import io.sentry.n8;
import io.sentry.transport.p;
import io.sentry.util.i;
import io.sentry.util.n;
import io.sentry.util.y;
import io.sentry.y7;
import java.io.File;
import java.io.FileOutputStream;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class b extends f {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f304102v = "last_anr_report";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final p f304103t;

    public b(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        this(sentryAndroidOptions, io.sentry.android.core.internal.util.f.b());
    }

    public static /* synthetic */ void S(b bVar, SentryAndroidOptions sentryAndroidOptions, AnrV2Integration.b bVar2) {
        bVar.getClass();
        Long lB = bVar2.b();
        sentryAndroidOptions.getLogger().c(y7.DEBUG, "Writing last reported ANR marker with timestamp %d", lB);
        bVar.Y(lB);
    }

    public static boolean U(@NotNull n8 n8Var) {
        String outboxPath = n8Var.getOutboxPath();
        if (outboxPath == null) {
            n8Var.getLogger().c(y7.DEBUG, "Outbox path is null, the startup crash marker file does not exist", new Object[0]);
            return false;
        }
        File file = new File(outboxPath, f.f305183s);
        try {
            boolean zExists = file.exists();
            if (!zExists || file.delete()) {
                return zExists;
            }
            n8Var.getLogger().c(y7.ERROR, "Failed to delete the startup crash marker file. %s.", file.getAbsolutePath());
            return zExists;
        } catch (Throwable th2) {
            n8Var.getLogger().a(y7.ERROR, "Error reading/deleting the startup crash marker file on the disk", th2);
            return false;
        }
    }

    @Nullable
    public static Long V(@NotNull n8 n8Var) {
        File file = new File((String) y.c(n8Var.getCacheDirPath(), "Cache dir path should be set for getting ANRs reported"), f304102v);
        try {
            if (!file.exists() || !file.canRead()) {
                n8Var.getLogger().c(y7.DEBUG, "Last ANR marker does not exist. %s.", file.getAbsolutePath());
                return null;
            }
            String strC = i.c(file);
            if (strC.equals(AbstractJsonLexerKt.NULL)) {
                return null;
            }
            return Long.valueOf(Long.parseLong(strC.trim()));
        } catch (Throwable th2) {
            n8Var.getLogger().a(y7.ERROR, "Error reading last ANR marker", th2);
        }
    }

    private boolean W(@NotNull g6 g6Var, @NotNull n0 n0Var) {
        boolean zM3 = super.M3(g6Var, n0Var);
        final SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f305172a;
        io.sentry.android.core.performance.i iVarT = h.s().t();
        if (n.h(n0Var, UncaughtExceptionHandlerIntegration.a.class) && iVarT.x()) {
            long jA = this.f304103t.a() - iVarT.t();
            if (jA <= sentryAndroidOptions.getStartupCrashDurationThresholdMillis()) {
                sentryAndroidOptions.getLogger().c(y7.DEBUG, "Startup Crash detected %d milliseconds after SDK init. Writing a startup crash marker file to disk.", Long.valueOf(jA));
                Z();
            }
        }
        n.k(n0Var, AnrV2Integration.b.class, new n.a() { // from class: io.sentry.android.core.cache.a
            @Override // io.sentry.util.n.a
            public final void accept(Object obj) {
                b.S(this.f304100a, sentryAndroidOptions, (AnrV2Integration.b) obj);
            }
        });
        return zM3;
    }

    private void Y(@Nullable Long l10) {
        String cacheDirPath = this.f305172a.getCacheDirPath();
        if (cacheDirPath == null) {
            this.f305172a.getLogger().c(y7.DEBUG, "Cache dir path is null, the ANR marker will not be written", new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(cacheDirPath, f304102v));
            try {
                fileOutputStream.write(String.valueOf(l10).getBytes(f305171e));
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
            this.f305172a.getLogger().a(y7.ERROR, "Error writing the ANR marker to the disk", th4);
        }
    }

    private void Z() {
        String outboxPath = this.f305172a.getOutboxPath();
        if (outboxPath == null) {
            this.f305172a.getLogger().c(y7.DEBUG, "Outbox path is null, the startup crash marker file will not be written", new Object[0]);
            return;
        }
        try {
            new File(outboxPath, f.f305183s).createNewFile();
        } catch (Throwable th2) {
            this.f305172a.getLogger().a(y7.ERROR, "Error writing the startup crash marker file to the disk", th2);
        }
    }

    @Override // io.sentry.cache.f, io.sentry.cache.g
    public void D3(@NotNull g6 g6Var, @NotNull n0 n0Var) {
        W(g6Var, n0Var);
    }

    @Override // io.sentry.cache.f, io.sentry.cache.g
    public boolean M3(@NotNull g6 g6Var, @NotNull n0 n0Var) {
        return W(g6Var, n0Var);
    }

    @lm.n
    @NotNull
    public File T() {
        return this.f305174c;
    }

    b(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull p pVar) {
        super(sentryAndroidOptions, (String) y.c(sentryAndroidOptions.getCacheDirPath(), "cacheDirPath must not be null"), sentryAndroidOptions.getMaxCacheItems());
        this.f304103t = pVar;
    }
}
