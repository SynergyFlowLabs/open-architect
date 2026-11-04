package com.planner5d.library.services.bitmaploader.target;

import androidx.annotation.NonNull;
import androidx.lifecycle.c0;
import androidx.lifecycle.e1;
import androidx.lifecycle.n0;
import androidx.lifecycle.o0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<com.planner5d.library.services.bitmaploader.target.a> f224190a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f224191b = false;

    public static class a {

        /* JADX INFO: renamed from: com.planner5d.library.services.bitmaploader.target.h$a$a, reason: collision with other inner class name */
        class C1666a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f224192a;

            C1666a(final h val$bitmapTargetManager) {
                this.f224192a = val$bitmapTargetManager;
            }

            @e1(c0.a.ON_DESTROY)
            private void onDestroy() {
                this.f224192a.a();
            }
        }

        @NonNull
        public h a(@NonNull o0 lifecycleOwner) {
            h hVar = new h();
            lifecycleOwner.getLifecycle().c(new C1666a(hVar));
            return hVar;
        }
    }

    public void a() {
        synchronized (this.f224190a) {
            try {
                if (!this.f224191b) {
                    this.f224191b = true;
                    e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean b() {
        boolean z10;
        synchronized (this.f224190a) {
            try {
                z10 = this.f224191b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public com.planner5d.library.services.bitmaploader.target.a c(com.planner5d.library.services.bitmaploader.target.a target) {
        if (target == null) {
            return target;
        }
        synchronized (this.f224190a) {
            try {
                if (this.f224191b) {
                    throw new RuntimeException("Manager destroyed");
                }
                if (!this.f224190a.contains(target)) {
                    this.f224190a.add(target);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return target;
    }

    public void d(com.planner5d.library.services.bitmaploader.target.a... targets) {
        if (targets != null) {
            for (com.planner5d.library.services.bitmaploader.target.a aVar : targets) {
                if (aVar != null) {
                    aVar.dispose();
                    synchronized (this.f224190a) {
                        try {
                            this.f224190a.remove(aVar);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        }
    }

    public void e() {
        synchronized (this.f224190a) {
            while (!this.f224190a.isEmpty()) {
                try {
                    this.f224190a.remove(0).dispose();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
