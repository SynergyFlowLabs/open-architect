package com.google.firebase.messaging;

import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f123802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private final Map<String, Task<String>> f123803b = new androidx.collection.a();

    interface a {
        Task<String> start();
    }

    z0(Executor executor) {
        this.f123802a = executor;
    }

    public static /* synthetic */ Task a(z0 z0Var, String str, Task task) {
        synchronized (z0Var) {
            z0Var.f123803b.remove(str);
        }
        return task;
    }

    synchronized Task<String> b(final String str, a aVar) {
        Task<String> task = this.f123803b.get(str);
        if (task != null) {
            return task;
        }
        Task taskO = aVar.start().o(this.f123802a, new com.google.android.gms.tasks.c() { // from class: com.google.firebase.messaging.y0
            @Override // com.google.android.gms.tasks.c
            public final Object a(Task task2) {
                return z0.a(this.f123797a, str, task2);
            }
        });
        this.f123803b.put(str, (Task<String>) taskO);
        return taskO;
    }
}
