package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.NonNull;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public class b implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f106336a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BlockingQueue f106337b = new LinkedBlockingQueue();

    @NonNull
    @g6.a
    public IBinder a() throws InterruptedException {
        com.google.android.gms.common.internal.w.q("BlockingServiceConnection.getService() called on main thread");
        if (this.f106336a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f106336a = true;
        return (IBinder) this.f106337b.take();
    }

    @NonNull
    @g6.a
    public IBinder b(long j10, @NonNull TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        com.google.android.gms.common.internal.w.q("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f106336a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f106336a = true;
        IBinder iBinder = (IBinder) this.f106337b.poll(j10, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        this.f106337b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@NonNull ComponentName componentName) {
    }
}
