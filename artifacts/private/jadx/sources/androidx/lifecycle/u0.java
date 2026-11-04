package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class u0 extends Service implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final v1 f52528a = new v1(this);

    @Override // androidx.lifecycle.o0
    @NotNull
    public c0 getLifecycle() {
        return this.f52528a.a();
    }

    @Override // android.app.Service
    @androidx.annotation.i
    @Nullable
    public IBinder onBind(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f52528a.b();
        return null;
    }

    @Override // android.app.Service
    @androidx.annotation.i
    public void onCreate() {
        this.f52528a.c();
        super.onCreate();
    }

    @Override // android.app.Service
    @androidx.annotation.i
    public void onDestroy() {
        this.f52528a.d();
        super.onDestroy();
    }

    @Override // android.app.Service
    @androidx.annotation.i
    @kotlin.l(message = "Deprecated in Java")
    public void onStart(@Nullable Intent intent, int i10) {
        this.f52528a.e();
        super.onStart(intent, i10);
    }

    @Override // android.app.Service
    @androidx.annotation.i
    public int onStartCommand(@Nullable Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
