package io.sentry.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import io.sentry.ja;
import io.sentry.n8;
import io.sentry.y7;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class SystemEventsBreadcrumbsIntegration implements io.sentry.x1, Closeable, s0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f304013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @lm.n
    @Nullable
    volatile b f304014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private SentryAndroidOptions f304015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private io.sentry.i1 f304016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final String[] f304017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f304018f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile boolean f304019g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile IntentFilter f304020h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile HandlerThread f304021i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f304022j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f304023k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private a f304024l;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final Integer f304025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final Boolean f304026b;

        a(@Nullable Integer num, @Nullable Boolean bool) {
            this.f304025a = num;
            this.f304026b = bool;
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return io.sentry.util.y.a(this.f304025a, aVar.f304025a) && io.sentry.util.y.a(this.f304026b, aVar.f304026b);
        }

        public int hashCode() {
            return io.sentry.util.y.b(this.f304025a, this.f304026b);
        }
    }

    final class b extends BroadcastReceiver {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f304027f = 60000;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final io.sentry.i1 f304028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final SentryAndroidOptions f304029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final io.sentry.android.core.internal.util.m f304030c = new io.sentry.android.core.internal.util.m(io.sentry.android.core.internal.util.f.b(), 60000, 0);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final char[] f304031d = new char[64];

        b(@NotNull io.sentry.i1 i1Var, SentryAndroidOptions sentryAndroidOptions) {
            this.f304028a = i1Var;
            this.f304029b = sentryAndroidOptions;
        }

        @NotNull
        private io.sentry.f a(long j10, @NotNull Intent intent, @Nullable String str, @Nullable a aVar) {
            Bundle extras;
            io.sentry.f fVar = new io.sentry.f(j10);
            fVar.Y("system");
            fVar.T("device.event");
            String strB = b(str);
            if (strB != null) {
                fVar.U(com.facebook.internal.w0.f100156c1, strB);
            }
            if (aVar != null) {
                if (aVar.f304025a != null) {
                    fVar.U("level", aVar.f304025a);
                }
                if (aVar.f304026b != null) {
                    fVar.U(io.sentry.protocol.e.c.f306221i, aVar.f304026b);
                }
            } else if (this.f304029b.isEnableSystemEventBreadcrumbsExtras() && (extras = intent.getExtras()) != null && !extras.isEmpty()) {
                HashMap map = new HashMap(extras.size());
                for (String str2 : extras.keySet()) {
                    try {
                        Object obj = extras.get(str2);
                        if (obj != null) {
                            map.put(str2, obj.toString());
                        }
                    } catch (Throwable th2) {
                        this.f304029b.getLogger().b(y7.ERROR, th2, "%s key of the %s action threw an error.", str2, str);
                    }
                }
                fVar.U(com.facebook.bolts.e.f99330c, map);
            }
            fVar.V(y7.INFO);
            return fVar;
        }

        @lm.n
        @Nullable
        String b(@Nullable String str) {
            if (str == null) {
                int i10 = 6 >> 0;
                return null;
            }
            int length = str.length();
            int length2 = this.f304031d.length;
            for (int i11 = length - 1; i11 >= 0; i11--) {
                char cCharAt = str.charAt(i11);
                if (cCharAt == '.') {
                    char[] cArr = this.f304031d;
                    return new String(cArr, length2, cArr.length - length2);
                }
                if (length2 == 0) {
                    return io.sentry.util.h0.f(str);
                }
                length2--;
                this.f304031d[length2] = cCharAt;
            }
            return str;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, @NotNull Intent intent) {
            a aVar;
            String action = intent.getAction();
            if (!"android.intent.action.BATTERY_CHANGED".equals(action)) {
                aVar = null;
            } else {
                if (this.f304030c.a()) {
                    return;
                }
                Float fC = h1.c(intent, this.f304029b);
                a aVar2 = new a(fC != null ? Integer.valueOf(fC.intValue()) : null, h1.t(intent, this.f304029b));
                if (aVar2.equals(SystemEventsBreadcrumbsIntegration.this.f304024l)) {
                    return;
                }
                SystemEventsBreadcrumbsIntegration.this.f304024l = aVar2;
                aVar = aVar2;
            }
            io.sentry.f fVarA = a(System.currentTimeMillis(), intent, action, aVar);
            io.sentry.n0 n0Var = new io.sentry.n0();
            n0Var.o(ja.f305666j, intent);
            this.f304028a.m(fVarA, n0Var);
        }
    }

    public SystemEventsBreadcrumbsIntegration(@NotNull Context context) {
        this(context, j());
    }

    public static /* synthetic */ void d(SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration, io.sentry.i1 i1Var, SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.m1 m1VarA = systemEventsBreadcrumbsIntegration.f304023k.a();
        try {
            if (!systemEventsBreadcrumbsIntegration.f304018f && !systemEventsBreadcrumbsIntegration.f304019g && systemEventsBreadcrumbsIntegration.f304014b == null) {
                systemEventsBreadcrumbsIntegration.f304014b = systemEventsBreadcrumbsIntegration.new b(i1Var, sentryAndroidOptions);
                int i10 = 1 >> 0;
                if (systemEventsBreadcrumbsIntegration.f304020h == null) {
                    systemEventsBreadcrumbsIntegration.f304020h = new IntentFilter();
                    for (String str : systemEventsBreadcrumbsIntegration.f304017e) {
                        systemEventsBreadcrumbsIntegration.f304020h.addAction(str);
                    }
                }
                if (systemEventsBreadcrumbsIntegration.f304021i == null) {
                    systemEventsBreadcrumbsIntegration.f304021i = new HandlerThread("SystemEventsReceiver", 10);
                    systemEventsBreadcrumbsIntegration.f304021i.start();
                }
                try {
                    a1.u(systemEventsBreadcrumbsIntegration.f304013a, sentryAndroidOptions, systemEventsBreadcrumbsIntegration.f304014b, systemEventsBreadcrumbsIntegration.f304020h, new Handler(systemEventsBreadcrumbsIntegration.f304021i.getLooper()));
                    if (!systemEventsBreadcrumbsIntegration.f304022j.getAndSet(true)) {
                        sentryAndroidOptions.getLogger().c(y7.DEBUG, "SystemEventsBreadcrumbsIntegration installed.", new Object[0]);
                        io.sentry.util.q.a("SystemEventsBreadcrumbs");
                    }
                } catch (Throwable th2) {
                    sentryAndroidOptions.setEnableSystemEventBreadcrumbs(false);
                    sentryAndroidOptions.getLogger().a(y7.ERROR, "Failed to initialize SystemEventsBreadcrumbsIntegration.", th2);
                }
                if (m1VarA != null) {
                    m1VarA.close();
                    return;
                }
                return;
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

    @NotNull
    public static List<String> h() {
        return Arrays.asList(j());
    }

    @NotNull
    private static String[] j() {
        return new String[]{"android.intent.action.ACTION_SHUTDOWN", "android.intent.action.AIRPLANE_MODE", "android.intent.action.BATTERY_CHANGED", "android.intent.action.CAMERA_BUTTON", "android.intent.action.CONFIGURATION_CHANGED", "android.intent.action.DATE_CHANGED", "android.intent.action.DEVICE_STORAGE_LOW", "android.intent.action.DEVICE_STORAGE_OK", "android.intent.action.DOCK_EVENT", "android.intent.action.DREAMING_STARTED", "android.intent.action.DREAMING_STOPPED", "android.intent.action.INPUT_METHOD_CHANGED", "android.intent.action.LOCALE_CHANGED", "android.intent.action.SCREEN_OFF", "android.intent.action.SCREEN_ON", "android.intent.action.TIMEZONE_CHANGED", "android.intent.action.TIME_SET", "android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.POWER_SAVE_MODE_CHANGED"};
    }

    private void l(@NotNull final io.sentry.i1 i1Var, @NotNull final SentryAndroidOptions sentryAndroidOptions) {
        if (sentryAndroidOptions.isEnableSystemEventBreadcrumbs() && !this.f304018f && !this.f304019g && this.f304014b == null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.t2
                    @Override // java.lang.Runnable
                    public final void run() {
                        SystemEventsBreadcrumbsIntegration.d(this.f304526a, i1Var, sentryAndroidOptions);
                    }
                });
            } catch (Throwable unused) {
                sentryAndroidOptions.getLogger().c(y7.WARNING, "Failed to start SystemEventsBreadcrumbsIntegration on executor thread.", new Object[0]);
            }
        }
    }

    private void m() {
        SentryAndroidOptions sentryAndroidOptions = this.f304015c;
        if (sentryAndroidOptions == null) {
            return;
        }
        try {
            sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.s2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f304507a.o();
                }
            });
        } catch (RejectedExecutionException unused) {
            o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        io.sentry.m1 m1VarA = this.f304023k.a();
        try {
            this.f304019g = true;
            b bVar = this.f304014b;
            this.f304014b = null;
            if (m1VarA != null) {
                m1VarA.close();
            }
            if (bVar != null) {
                this.f304013a.unregisterReceiver(bVar);
            }
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

    @Override // io.sentry.android.core.s0.a
    public void a() {
        if (this.f304016d == null || this.f304015c == null) {
            return;
        }
        this.f304019g = false;
        l(this.f304016d, this.f304015c);
    }

    @Override // io.sentry.android.core.s0.a
    public void b() {
        m();
    }

    @Override // io.sentry.x1
    public void c(@NotNull io.sentry.i1 i1Var, @NotNull n8 n8Var) {
        io.sentry.util.y.c(i1Var, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.y.c(n8Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) n8Var : null, "SentryAndroidOptions is required");
        this.f304015c = sentryAndroidOptions;
        this.f304016d = i1Var;
        sentryAndroidOptions.getLogger().c(y7.DEBUG, "SystemEventsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f304015c.isEnableSystemEventBreadcrumbs()));
        if (this.f304015c.isEnableSystemEventBreadcrumbs()) {
            s0.g().d(this);
            if (a1.t()) {
                l(this.f304016d, this.f304015c);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        io.sentry.m1 m1VarA = this.f304023k.a();
        try {
            this.f304018f = true;
            this.f304020h = null;
            if (this.f304021i != null) {
                this.f304021i.quit();
            }
            this.f304021i = null;
            if (m1VarA != null) {
                m1VarA.close();
            }
            s0.g().m(this);
            m();
            SentryAndroidOptions sentryAndroidOptions = this.f304015c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(y7.DEBUG, "SystemEventsBreadcrumbsIntegration removed.", new Object[0]);
            }
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

    SystemEventsBreadcrumbsIntegration(@NotNull Context context, @NotNull String[] strArr) {
        this.f304018f = false;
        this.f304019g = false;
        this.f304020h = null;
        this.f304021i = null;
        this.f304022j = new AtomicBoolean(false);
        this.f304023k = new io.sentry.util.a();
        this.f304013a = a1.g(context);
        this.f304017e = strArr;
    }

    public SystemEventsBreadcrumbsIntegration(@NotNull Context context, @NotNull List<String> list) {
        this.f304018f = false;
        this.f304019g = false;
        this.f304020h = null;
        this.f304021i = null;
        this.f304022j = new AtomicBoolean(false);
        this.f304023k = new io.sentry.util.a();
        this.f304013a = a1.g(context);
        String[] strArr = new String[list.size()];
        this.f304017e = strArr;
        list.toArray(strArr);
    }
}
