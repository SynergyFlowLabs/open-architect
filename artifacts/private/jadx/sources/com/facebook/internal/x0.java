package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class x0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f100250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Handler f100251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private b f100252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f100253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Messenger f100254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f100255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f100256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final String f100257h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f100258i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private final String f100259j;

    public static final class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message message) {
            if (com.facebook.internal.instrument.crashshield.b.e(this)) {
                return;
            }
            try {
                if (com.facebook.internal.instrument.crashshield.b.e(this)) {
                    return;
                }
                try {
                    Intrinsics.checkNotNullParameter(message, "message");
                    x0.this.e(message);
                } catch (Throwable th2) {
                    com.facebook.internal.instrument.crashshield.b.c(th2, this);
                }
            } catch (Throwable th3) {
                com.facebook.internal.instrument.crashshield.b.c(th3, this);
            }
        }
    }

    public interface b {
        void a(@Nullable Bundle bundle);
    }

    public x0(@NotNull Context context, int i10, int i11, int i12, @NotNull String applicationId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        this.f100250a = context;
        this.f100255f = i10;
        this.f100256g = i11;
        this.f100257h = applicationId;
        this.f100258i = i12;
        this.f100259j = str;
        this.f100251b = new a();
    }

    private final void a(Bundle bundle) {
        if (this.f100253d) {
            this.f100253d = false;
            b bVar = this.f100252c;
            if (bVar == null) {
                return;
            }
            bVar.a(bundle);
        }
    }

    private final void g() {
        Bundle bundle = new Bundle();
        bundle.putString(w0.f100200r0, this.f100257h);
        String str = this.f100259j;
        if (str != null) {
            bundle.putString(w0.f100212x0, str);
        }
        f(bundle);
        Message messageObtain = Message.obtain((Handler) null, this.f100255f);
        messageObtain.arg1 = this.f100258i;
        messageObtain.setData(bundle);
        messageObtain.replyTo = new Messenger(this.f100251b);
        try {
            Messenger messenger = this.f100254e;
            if (messenger == null) {
                return;
            }
            messenger.send(messageObtain);
        } catch (RemoteException unused) {
            a(null);
        }
    }

    public final void b() {
        this.f100253d = false;
    }

    @NotNull
    protected final Context c() {
        return this.f100250a;
    }

    @Nullable
    public final String d() {
        return this.f100259j;
    }

    protected final void e(@NotNull Message message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (message.what == this.f100256g) {
            Bundle data = message.getData();
            if (data.getString(w0.K0) != null) {
                a(null);
            } else {
                a(data);
            }
            try {
                this.f100250a.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    protected abstract void f(@NotNull Bundle bundle);

    public final void h(@Nullable b bVar) {
        this.f100252c = bVar;
    }

    public final boolean i() {
        synchronized (this) {
            try {
                boolean z10 = false;
                if (this.f100253d) {
                    return false;
                }
                w0 w0Var = w0.f100148a;
                if (w0.x(this.f100258i) == -1) {
                    return false;
                }
                Intent intentM = w0.m(c());
                if (intentM != null) {
                    z10 = true;
                    this.f100253d = true;
                    c().bindService(intentM, this, 1);
                }
                return z10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(@NotNull ComponentName name, @NotNull IBinder service) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(service, "service");
        this.f100254e = new Messenger(service);
        g();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(@NotNull ComponentName name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f100254e = null;
        try {
            this.f100250a.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        a(null);
    }
}
