package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.m1;
import androidx.annotation.p0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private static SoftReference f105748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private static SoftReference f105749b;

    /* JADX INFO: renamed from: com.google.android.gms.cloudmessaging.a$a, reason: collision with other inner class name */
    public static final class C0963a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public static final String f105750a = "com.google.firebase.messaging.NOTIFICATION_OPEN";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public static final String f105751b = "com.google.firebase.messaging.NOTIFICATION_DISMISS";

        private C0963a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public static final String f105752a = "pending_intent";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public static final String f105753b = "wrapped_intent";

        private b() {
        }
    }

    @m1
    private final int e(@NonNull Context context, @NonNull Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(b.f105752a);
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove(b.f105752a);
        } else {
            extras = new Bundle();
        }
        if (!Objects.equals(intent.getAction(), C0963a.f105751b)) {
            return 500;
        }
        c(context, extras);
        return -1;
    }

    @NonNull
    protected Executor a() {
        ExecutorService executorServiceUnconfigurableExecutorService;
        synchronized (a.class) {
            try {
                SoftReference softReference = f105748a;
                executorServiceUnconfigurableExecutorService = softReference != null ? (ExecutorService) softReference.get() : null;
                if (executorServiceUnconfigurableExecutorService == null) {
                    com.google.android.gms.internal.cloudmessaging.e.a();
                    executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new com.google.android.gms.common.util.concurrent.b("firebase-iid-executor")));
                    f105748a = new SoftReference(executorServiceUnconfigurableExecutorService);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return executorServiceUnconfigurableExecutorService;
    }

    @m1
    protected abstract int b(@NonNull Context context, @NonNull CloudMessage cloudMessage);

    @m1
    protected void c(@NonNull Context context, @NonNull Bundle bundle) {
    }

    final /* synthetic */ void d(Intent intent, final Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        Executor executorUnconfigurableExecutorService;
        int iE;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra(b.f105753b);
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                iE = e(context, intent2);
            } else if (intent.getExtras() == null) {
                iE = 500;
            } else {
                final CloudMessage cloudMessage = new CloudMessage(intent);
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                synchronized (a.class) {
                    try {
                        SoftReference softReference = f105749b;
                        executorUnconfigurableExecutorService = softReference != null ? (Executor) softReference.get() : null;
                        if (executorUnconfigurableExecutorService == null) {
                            com.google.android.gms.internal.cloudmessaging.e.a();
                            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.google.android.gms.common.util.concurrent.b("pscm-ack-executor"));
                            threadPoolExecutor.allowCoreThreadTimeOut(true);
                            executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                            f105749b = new SoftReference(executorUnconfigurableExecutorService);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                executorUnconfigurableExecutorService.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        Task taskC;
                        CloudMessage cloudMessage2 = cloudMessage;
                        if (TextUtils.isEmpty(cloudMessage2.f2())) {
                            taskC = com.google.android.gms.tasks.n.g(null);
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putString(com.google.firebase.messaging.e.d.f123517h, cloudMessage2.f2());
                            Integer numU2 = cloudMessage2.U2();
                            if (numU2 != null) {
                                bundle.putInt(com.google.firebase.messaging.e.d.f123524o, numU2.intValue());
                            }
                            Context context2 = context;
                            bundle.putBoolean("supports_message_handled", true);
                            taskC = d0.b(context2).c(2, bundle);
                        }
                        final CountDownLatch countDownLatch2 = countDownLatch;
                        taskC.e(new Executor() { // from class: com.google.android.gms.cloudmessaging.m
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                runnable.run();
                            }
                        }, new OnCompleteListener() { // from class: com.google.android.gms.cloudmessaging.n
                            @Override // com.google.android.gms.tasks.OnCompleteListener
                            public final void onComplete(Task task) {
                                countDownLatch2.countDown();
                            }
                        });
                    }
                });
                int iB = b(context, cloudMessage);
                try {
                    countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
                } catch (InterruptedException e10) {
                    "Message ack failed: ".concat(e10.toString());
                }
                iE = iB;
            }
            if (z10 && pendingResult != null) {
                pendingResult.setResultCode(iE);
            }
            if (pendingResult != null) {
                pendingResult.finish();
            }
        } catch (Throwable th3) {
            if (pendingResult != null) {
                pendingResult.finish();
            }
            throw th3;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NonNull final Context context, @NonNull final Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean zIsOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        a().execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f105794a.d(intent, context, zIsOrderedBroadcast, pendingResultGoAsync);
            }
        });
    }
}
