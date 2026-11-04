package androidx.profileinstaller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.NonNull;
import androidx.annotation.w0;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class ProfileInstallerInitializer implements androidx.startup.b<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f73712a = 5000;

    @w0(28)
    private static class a {
        private a() {
        }

        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static class b {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(@NonNull final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: androidx.profileinstaller.l
            @Override // java.lang.Runnable
            public final void run() {
                i.j(context);
            }
        });
    }

    @Override // androidx.startup.b
    @NonNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public b create(@NonNull Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.profileinstaller.j
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                this.f73780a.e(applicationContext);
            }
        });
        return new b();
    }

    @Override // androidx.startup.b
    @NonNull
    public List<Class<? extends androidx.startup.b<?>>> dependencies() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(@NonNull final Context context) {
        a.a(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: androidx.profileinstaller.k
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.f(context);
            }
        }, new Random().nextInt(Math.max(1000, 1)) + 5000);
    }
}
