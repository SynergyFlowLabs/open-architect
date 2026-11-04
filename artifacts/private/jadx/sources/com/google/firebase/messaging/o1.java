package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes5.dex */
class o1 extends Binder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f123690a;

    interface a {
        Task<Void> a(Intent intent);
    }

    o1(a aVar) {
        this.f123690a = aVar;
    }

    void b(final r1.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        this.f123690a.a(aVar.f123723a).e(new androidx.media3.exoplayer.offline.b(), new OnCompleteListener() { // from class: com.google.firebase.messaging.n1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                aVar.d();
            }
        });
    }
}
