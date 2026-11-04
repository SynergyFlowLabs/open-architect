package com.planner5d.library.services.backgroundexecutor;

import android.app.Application;
import android.os.RemoteException;
import com.planner5d.library.services.utility.o3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
@ij.f
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f224020b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<BackgroundExecutorMessageContainer> f224019a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f224021c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f224022d = new Object();

    class a extends com.planner5d.library.d.b {
        a() {
        }

        @Override // com.planner5d.library.d
        public void w1(BackgroundExecutorMessageContainer message) throws RemoteException {
            boolean z10;
            synchronized (g.this.f224021c) {
                try {
                    Iterator it = g.this.f224019a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z10 = false;
                            break;
                        }
                        BackgroundExecutorMessageContainer backgroundExecutorMessageContainer = (BackgroundExecutorMessageContainer) it.next();
                        if (backgroundExecutorMessageContainer.f223967a.f224017a == message.f223967a.f224017a) {
                            backgroundExecutorMessageContainer.f223968b = message;
                            z10 = true;
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z10) {
                synchronized (g.this.f224022d) {
                    g.this.f224022d.notify();
                }
            }
        }
    }

    @ij.a
    g(Application application, com.planner5d.library.model.manager.k crashReporter) {
        k kVar = new k(application, crashReporter);
        this.f224020b = kVar;
        kVar.f224035f = new a();
        new Thread(new Runnable() { // from class: com.planner5d.library.services.backgroundexecutor.f
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f224018a.f();
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() throws Throwable {
        BackgroundExecutorMessageContainer next;
        Throwable th2;
        BackgroundExecutorMessageContainer backgroundExecutorMessageContainer = null;
        while (true) {
            try {
                synchronized (this.f224021c) {
                    try {
                        Iterator<BackgroundExecutorMessageContainer> it = this.f224019a.iterator();
                        while (it.hasNext()) {
                            next = it.next();
                            if (next.f223968b != null) {
                                try {
                                    this.f224019a.remove(next);
                                    backgroundExecutorMessageContainer = next;
                                    break;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    try {
                                        throw th2;
                                    } catch (OutOfMemoryError unused) {
                                        backgroundExecutorMessageContainer = next;
                                        o3.c(1000L);
                                    }
                                }
                            }
                        }
                        if (backgroundExecutorMessageContainer != null) {
                            synchronized (backgroundExecutorMessageContainer) {
                                try {
                                    backgroundExecutorMessageContainer.notify();
                                } catch (Throwable th4) {
                                    throw th4;
                                }
                            }
                            backgroundExecutorMessageContainer = null;
                        }
                    } catch (Throwable th5) {
                        next = backgroundExecutorMessageContainer;
                        th2 = th5;
                    }
                }
                synchronized (this.f224022d) {
                    try {
                        try {
                            this.f224022d.wait(2000L);
                        } catch (InterruptedException unused2) {
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
            } catch (OutOfMemoryError unused3) {
            }
        }
    }

    long e() {
        com.planner5d.library.c cVarE = this.f224020b.e(2);
        if (cVarE == null) {
            return -1L;
        }
        try {
            return cVarE.D2();
        } catch (Throwable unused) {
            return -1L;
        }
    }

    BackgroundExecutorMessageContainer g(boolean load, e message, long timeout) {
        com.planner5d.library.c cVarE = this.f224020b.e(2);
        if (cVarE == null) {
            return null;
        }
        try {
            BackgroundExecutorMessageContainer backgroundExecutorMessageContainer = new BackgroundExecutorMessageContainer(message);
            if (load) {
                synchronized (backgroundExecutorMessageContainer) {
                    try {
                        synchronized (this.f224021c) {
                            this.f224019a.add(backgroundExecutorMessageContainer);
                        }
                        cVarE.E2(backgroundExecutorMessageContainer);
                        backgroundExecutorMessageContainer.wait(timeout);
                        BackgroundExecutorMessageContainer backgroundExecutorMessageContainer2 = backgroundExecutorMessageContainer.f223968b;
                        if (backgroundExecutorMessageContainer2 != null) {
                            return backgroundExecutorMessageContainer2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            cVarE.uf(backgroundExecutorMessageContainer);
        } catch (RemoteException | InterruptedException unused) {
        }
        return null;
    }
}
