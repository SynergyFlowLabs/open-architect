package com.badlogic.gdx;

import com.planner5d.library.services.utility.o3;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    private static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f89794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f89795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f89796c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object f89797d;

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            synchronized (this.f89797d) {
                try {
                    if (!this.f89796c) {
                        this.f89795b = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean d() {
            boolean z10;
            synchronized (this.f89797d) {
                try {
                    z10 = this.f89796c;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f89797d) {
                try {
                    if (this.f89795b) {
                        return;
                    }
                    this.f89796c = true;
                    this.f89794a.run();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        private a(Runnable runnable) {
            this.f89795b = false;
            this.f89796c = false;
            this.f89797d = new Object();
            this.f89794a = runnable;
        }
    }

    public static boolean b(com.planner5d.library.engine.a aVar, Runnable runnable) {
        if (aVar.k()) {
            return false;
        }
        runnable.run();
        return true;
    }

    public static boolean c(final com.planner5d.library.engine.a aVar, final Runnable runnable) {
        return b(aVar, new Runnable() { // from class: com.badlogic.gdx.c
            @Override // java.lang.Runnable
            public final void run() {
                aVar.i(runnable);
            }
        });
    }

    public static boolean d(com.planner5d.library.engine.a aVar, Runnable runnable, long j10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (System.currentTimeMillis() < jCurrentTimeMillis + j10) {
            if (c(aVar, runnable)) {
                return true;
            }
            o3.c(1000L);
        }
        return false;
    }

    public static boolean e(com.planner5d.library.engine.a aVar, Runnable runnable, long j10) {
        long jCurrentTimeMillis = System.currentTimeMillis() + j10;
        a aVar2 = new a(runnable);
        if (!d(aVar, aVar2, j10)) {
            return false;
        }
        while (System.currentTimeMillis() < jCurrentTimeMillis && !aVar2.d()) {
        }
        aVar2.c();
        return aVar2.d();
    }
}
