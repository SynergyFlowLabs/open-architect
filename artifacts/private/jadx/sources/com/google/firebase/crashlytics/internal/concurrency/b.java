package com.google.firebase.crashlytics.internal.concurrency;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Executor f121221a = new androidx.media3.exoplayer.offline.b();

    private b() {
    }

    public static /* synthetic */ Task a(com.google.android.gms.tasks.l lVar, AtomicBoolean atomicBoolean, com.google.android.gms.tasks.b bVar, Task task) {
        if (task.u()) {
            lVar.e(task.q());
        } else if (task.p() != null) {
            lVar.d(task.p());
        } else if (atomicBoolean.getAndSet(true)) {
            bVar.a();
        }
        return com.google.android.gms.tasks.n.g(null);
    }

    public static <T> Task<T> b(Task<T> task, Task<T> task2) {
        final com.google.android.gms.tasks.b bVar = new com.google.android.gms.tasks.b();
        final com.google.android.gms.tasks.l lVar = new com.google.android.gms.tasks.l(bVar.b());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        com.google.android.gms.tasks.c<T, Task<TContinuationResult>> cVar = new com.google.android.gms.tasks.c() { // from class: com.google.firebase.crashlytics.internal.concurrency.a
            @Override // com.google.android.gms.tasks.c
            public final Object a(Task task3) {
                return b.a(lVar, atomicBoolean, bVar, task3);
            }
        };
        Executor executor = f121221a;
        task.o(executor, cVar);
        task2.o(executor, cVar);
        return lVar.a();
    }
}
