package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes5.dex */
@e.a({"UnwrappedWakefulBroadcastReceiver"})
public abstract class i extends Service {
    static final long MESSAGE_TIMEOUT_S = 20;
    private static final String TAG = "EnhancedIntentService";
    private Binder binder;
    private int lastStartId;

    @androidx.annotation.l1
    final ExecutorService executor = o.e();
    private final Object lock = new Object();
    private int runningTasks = 0;

    class a implements o1.a {
        a() {
        }

        @Override // com.google.firebase.messaging.o1.a
        @g6.a
        public Task<Void> a(Intent intent) {
            return i.this.d(intent);
        }
    }

    public static /* synthetic */ void a(i iVar, Intent intent, com.google.android.gms.tasks.l lVar) {
        iVar.getClass();
        try {
            iVar.handleIntent(intent);
            lVar.c(null);
        } catch (Throwable th2) {
            lVar.c(null);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Intent intent) {
        if (intent != null) {
            m1.d(intent);
        }
        synchronized (this.lock) {
            try {
                int i10 = this.runningTasks - 1;
                this.runningTasks = i10;
                if (i10 == 0) {
                    stopSelfResultHook(this.lastStartId);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.l0
    public Task<Void> d(final Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return com.google.android.gms.tasks.n.g(null);
        }
        final com.google.android.gms.tasks.l lVar = new com.google.android.gms.tasks.l();
        this.executor.execute(new Runnable() { // from class: com.google.firebase.messaging.h
            @Override // java.lang.Runnable
            public final void run() {
                i.a(this.f123586a, intent, lVar);
            }
        });
        return lVar.a();
    }

    protected Intent getStartCommandIntent(Intent intent) {
        return intent;
    }

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (this.binder == null) {
                this.binder = new o1(new a());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.binder;
    }

    @Override // android.app.Service
    @androidx.annotation.i
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i10, int i11) {
        synchronized (this.lock) {
            try {
                this.lastStartId = i11;
                this.runningTasks++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            c(intent);
            return 2;
        }
        Task<Void> taskD = d(startCommandIntent);
        if (taskD.t()) {
            c(intent);
            return 2;
        }
        taskD.e(new androidx.media3.exoplayer.offline.b(), new OnCompleteListener() { // from class: com.google.firebase.messaging.g
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f123576a.c(intent);
            }
        });
        return 3;
    }

    boolean stopSelfResultHook(int i10) {
        return stopSelfResult(i10);
    }
}
