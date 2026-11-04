package com.planner5d.library.services.bitmaploader.target;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a implements com.planner5d.library.model.f, com.planner5d.library.services.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.planner5d.library.services.bitmaploader.d f224172a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference<Bitmap> f224174c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f224173b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Throwable f224175d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f224176e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<com.planner5d.library.model.f> f224177f = new LinkedList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f224178g = new Object();

    /* JADX INFO: renamed from: com.planner5d.library.services.bitmaploader.target.a$a, reason: collision with other inner class name */
    public static class C1664a {

        /* JADX INFO: renamed from: com.planner5d.library.services.bitmaploader.target.a$a$a, reason: collision with other inner class name */
        class C1665a extends a {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ androidx.core.util.e f224179h;

            C1665a(final androidx.core.util.e val$onLoadSuccess) {
                this.f224179h = val$onLoadSuccess;
            }

            @Override // com.planner5d.library.services.bitmaploader.target.a
            protected void h(Bitmap bitmap) {
                this.f224179h.accept(bitmap);
            }
        }

        @NonNull
        public a a(@NonNull androidx.core.util.e<Bitmap> onLoadSuccess) {
            return new C1665a(onLoadSuccess);
        }

        @NonNull
        public a b(@NonNull h bitmapTargetManager, @NonNull androidx.core.util.e<Bitmap> onLoadSuccess) {
            a aVarA = a(onLoadSuccess);
            bitmapTargetManager.c(aVarA);
            return aVarA;
        }
    }

    @Deprecated
    protected void a(com.planner5d.library.model.f disposable) {
        this.f224177f.add(disposable);
    }

    protected void b(boolean withoutBitmap) {
    }

    public final Bitmap c() {
        Bitmap bitmap;
        WeakReference<Bitmap> weakReference;
        synchronized (this.f224178g) {
            try {
                bitmap = (!this.f224176e || (weakReference = this.f224174c) == null) ? null : weakReference.get();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bitmap;
    }

    public final Throwable d() {
        Throwable th2;
        synchronized (this.f224178g) {
            try {
                th2 = this.f224175d;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return th2;
    }

    @Override // com.planner5d.library.model.f
    public final void dispose() {
        com.planner5d.library.services.bitmaploader.d dVar;
        synchronized (this.f224178g) {
            try {
                if (this.f224173b) {
                    return;
                }
                this.f224173b = true;
                Bitmap bitmapC = c();
                boolean z10 = bitmapC == null;
                b(z10);
                if (!z10 && (dVar = this.f224172a) != null) {
                    dVar.l(bitmapC);
                }
                Iterator<com.planner5d.library.model.f> it = this.f224177f.iterator();
                while (it.hasNext()) {
                    it.next().dispose();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean e() {
        boolean z10;
        synchronized (this.f224178g) {
            try {
                z10 = this.f224176e || this.f224173b;
            } finally {
            }
        }
        return z10;
    }

    public final boolean f() {
        boolean z10;
        synchronized (this.f224178g) {
            try {
                z10 = this.f224173b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    protected void g(@p0 Throwable error) {
    }

    protected abstract void h(Bitmap bitmap);

    public final void i(com.planner5d.library.services.bitmaploader.d loader) {
        this.f224172a = loader;
    }

    public void j(Bitmap bitmap, Throwable error) {
        synchronized (this.f224178g) {
            this.f224174c = new WeakReference<>(bitmap);
            this.f224175d = error;
            this.f224176e = true;
        }
        if (bitmap == null) {
            g(error);
        } else {
            h(bitmap);
        }
    }

    public void k() {
        while (!e()) {
            Thread.yield();
        }
    }
}
