package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.collection.h3;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f105759h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static PendingIntent f105760i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Executor f105761j = new Executor() { // from class: com.google.android.gms.cloudmessaging.g0
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f105762k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f105764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e0 f105765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f105766d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Messenger f105768f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private zzd f105769g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h3 f105763a = new h3();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Messenger f105767e = new Messenger(new j(this, Looper.getMainLooper()));

    public d(@NonNull Context context) {
        this.f105764b = context;
        this.f105765c = new e0(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f105766d = scheduledThreadPoolExecutor;
    }

    static /* synthetic */ Task e(Bundle bundle) throws Exception {
        return m(bundle) ? com.google.android.gms.tasks.n.g(null) : com.google.android.gms.tasks.n.g(bundle);
    }

    static /* bridge */ /* synthetic */ void g(d dVar, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new l());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzd) {
                        dVar.f105769g = (zzd) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        dVar.f105768f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        "Unexpected response action: ".concat(String.valueOf(action));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = f105762k.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            "Unexpected response string: ".concat(stringExtra);
                            return;
                        }
                        return;
                    }
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    if (strGroup != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", strGroup2);
                        dVar.l(strGroup, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras()));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    "Received InstanceID error ".concat(stringExtra2);
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (dVar.f105763a) {
                        for (int i10 = 0; i10 < dVar.f105763a.size(); i10++) {
                            try {
                                dVar.l((String) dVar.f105763a.g(i10), intent2.getExtras());
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    return;
                }
                String[] strArrSplit = stringExtra2.split("\\|");
                if (strArrSplit.length <= 2 || !Objects.equals(strArrSplit[1], "ID")) {
                    "Unexpected structured response ".concat(stringExtra2);
                    return;
                }
                String str = strArrSplit[2];
                String strSubstring = strArrSplit[3];
                if (strSubstring.startsWith(":")) {
                    strSubstring = strSubstring.substring(1);
                }
                dVar.l(str, intent2.putExtra("error", strSubstring).getExtras());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b3  */
    @androidx.annotation.d
    private final Task i(Bundle bundle) {
        final String strJ = j();
        final com.google.android.gms.tasks.l lVar = new com.google.android.gms.tasks.l();
        synchronized (this.f105763a) {
            try {
                this.f105763a.put(strJ, lVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f105765c.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        k(this.f105764b, intent);
        intent.putExtra("kid", "|ID|" + strJ + "|");
        if (Log.isLoggable("Rpc", 3)) {
            "Sending ".concat(String.valueOf(intent.getExtras()));
        }
        intent.putExtra("google.messenger", this.f105767e);
        if (this.f105768f != null || this.f105769g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f105768f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    this.f105769g.b(messageObtain);
                }
            } catch (RemoteException unused) {
                if (this.f105765c.b() == 2) {
                    this.f105764b.sendBroadcast(intent);
                } else {
                    this.f105764b.startService(intent);
                }
            }
        } else if (this.f105765c.b() == 2) {
            this.f105764b.sendBroadcast(intent);
        } else {
            this.f105764b.startService(intent);
        }
        final ScheduledFuture<?> scheduledFutureSchedule = this.f105766d.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.h
            @Override // java.lang.Runnable
            public final void run() {
                lVar.d(new IOException("TIMEOUT"));
            }
        }, 30L, TimeUnit.SECONDS);
        lVar.a().e(f105761j, new OnCompleteListener() { // from class: com.google.android.gms.cloudmessaging.i
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f105785a.h(strJ, scheduledFutureSchedule, task);
            }
        });
        return lVar.a();
    }

    private static synchronized String j() {
        int i10;
        try {
            i10 = f105759h;
            f105759h = i10 + 1;
        } catch (Throwable th2) {
            throw th2;
        }
        return Integer.toString(i10);
    }

    private static synchronized void k(Context context, Intent intent) {
        try {
            if (f105760i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f105760i = PendingIntent.getBroadcast(context, 0, intent2, com.google.android.gms.internal.cloudmessaging.a.f107954a);
            }
            intent.putExtra("app", f105760i);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final void l(String str, @p0 Bundle bundle) {
        synchronized (this.f105763a) {
            try {
                com.google.android.gms.tasks.l lVar = (com.google.android.gms.tasks.l) this.f105763a.remove(str);
                if (lVar == null) {
                    return;
                }
                lVar.c(bundle);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static boolean m(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    @NonNull
    public Task<CloudMessage> a() {
        return this.f105765c.a() >= 241100000 ? d0.b(this.f105764b).d(5, Bundle.EMPTY).m(f105761j, new com.google.android.gms.tasks.c() { // from class: com.google.android.gms.cloudmessaging.g
            @Override // com.google.android.gms.tasks.c
            public final Object a(Task task) {
                Intent intent = (Intent) ((Bundle) task.q()).getParcelable("notification_data");
                if (intent != null) {
                    return new CloudMessage(intent);
                }
                return null;
            }
        }) : com.google.android.gms.tasks.n.f(new IOException("SERVICE_NOT_AVAILABLE"));
    }

    @NonNull
    public Task<Void> b(@NonNull CloudMessage cloudMessage) {
        if (this.f105765c.a() < 233700000) {
            return com.google.android.gms.tasks.n.f(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putString(com.google.firebase.messaging.e.d.f123517h, cloudMessage.f2());
        Integer numU2 = cloudMessage.U2();
        if (numU2 != null) {
            bundle.putInt(com.google.firebase.messaging.e.d.f123524o, numU2.intValue());
        }
        return d0.b(this.f105764b).c(3, bundle);
    }

    @NonNull
    public Task<Bundle> c(@NonNull final Bundle bundle) {
        if (this.f105765c.a() < 12000000) {
            return this.f105765c.b() != 0 ? i(bundle).o(f105761j, new com.google.android.gms.tasks.c() { // from class: com.google.android.gms.cloudmessaging.h0
                @Override // com.google.android.gms.tasks.c
                public final Object a(Task task) {
                    return this.f105783a.f(bundle, task);
                }
            }) : com.google.android.gms.tasks.n.f(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return d0.b(this.f105764b).d(1, bundle).m(f105761j, new com.google.android.gms.tasks.c() { // from class: com.google.android.gms.cloudmessaging.f
            @Override // com.google.android.gms.tasks.c
            public final Object a(Task task) throws IOException {
                if (task.u()) {
                    return (Bundle) task.q();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    "Error making request: ".concat(String.valueOf(task.p()));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", task.p());
            }
        });
    }

    @NonNull
    public Task<Void> d(boolean z10) {
        if (this.f105765c.a() < 241100000) {
            return com.google.android.gms.tasks.n.f(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("proxy_retention", z10);
        return d0.b(this.f105764b).c(4, bundle);
    }

    final /* synthetic */ Task f(Bundle bundle, Task task) throws Exception {
        return (task.u() && m((Bundle) task.q())) ? i(bundle).w(f105761j, new com.google.android.gms.tasks.k() { // from class: com.google.android.gms.cloudmessaging.f0
            @Override // com.google.android.gms.tasks.k
            public final Task a(Object obj) {
                return d.e((Bundle) obj);
            }
        }) : task;
    }

    final /* synthetic */ void h(String str, ScheduledFuture scheduledFuture, Task task) {
        synchronized (this.f105763a) {
            try {
                this.f105763a.remove(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        scheduledFuture.cancel(false);
    }
}
