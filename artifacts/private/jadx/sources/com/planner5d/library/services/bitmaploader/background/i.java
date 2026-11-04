package com.planner5d.library.services.bitmaploader.background;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.LocalServerSocket;
import android.os.AsyncTask;
import android.os.StrictMode;
import android.util.LongSparseArray;
import com.planner5d.library.services.backgroundexecutor.BackgroundExecutorService;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
class i extends AsyncTask<Object, Void, Void> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static LocalServerSocket f224087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f224088f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ThreadPoolExecutor f224089g = new ThreadPoolExecutor(2, 3, 15, TimeUnit.SECONDS, new LinkedBlockingDeque());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final com.planner5d.library.services.bitmaploader.buffers.b f224090h = new com.planner5d.library.services.bitmaploader.buffers.b(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f224091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LongSparseArray<Integer> f224092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LongSparseArray<Bitmap> f224093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WeakReference<Context> f224094d;

    private i(Context context, Object lockLoading, LongSparseArray<Integer> loading, LongSparseArray<Bitmap> loadedBitmaps) {
        this.f224094d = new WeakReference<>(context);
        this.f224091a = lockLoading;
        this.f224092b = loading;
        this.f224093c = loadedBitmaps;
    }

    public static void b(Context context, Object lockLoading, LongSparseArray<Integer> loading, LongSparseArray<Bitmap> loadedBitmaps) {
        synchronized (f224088f) {
            try {
                if (f224087e != null) {
                    return;
                }
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitNetwork().build());
                new i(context, lockLoading, loading, loadedBitmaps).execute(new Object[0]);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void doInBackground(Object... params) {
        while (true) {
            Context context = this.f224094d.get();
            if (context == null) {
                return null;
            }
            String strI = BackgroundExecutorService.i(context.getApplicationContext());
            synchronized (f224088f) {
                try {
                    if (f224087e != null) {
                        return null;
                    }
                    try {
                        f224087e = new LocalServerSocket(strI);
                    } catch (IOException unused) {
                        return null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            while (true) {
                try {
                    new h(f224087e.accept(), this.f224091a, f224090h, this.f224092b, this.f224093c).executeOnExecutor(f224089g, new Object[0]);
                } catch (IOException unused2) {
                }
            }
        }
    }
}
