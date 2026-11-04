package com.google.firebase.installations;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
final class b implements OnCompleteListener<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CountDownLatch f123160a = new CountDownLatch(1);

    b() {
    }

    public boolean a(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f123160a.await(j10, timeUnit);
    }

    public void b() {
        this.f123160a.countDown();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(@NonNull Task<Void> task) {
        this.f123160a.countDown();
    }
}
