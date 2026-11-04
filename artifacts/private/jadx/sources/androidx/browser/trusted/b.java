package androidx.browser.trusted;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.l0;
import androidx.annotation.p0;
import com.google.common.util.concurrent.t1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class b implements ServiceConnection {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f11954g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f11955h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f11956i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f11957j = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final Runnable f11958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final a f11959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private r f11961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private List<androidx.concurrent.futures.c.a<r>> f11962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private Exception f11963f;

    static class a {
        a() {
        }

        @NonNull
        r a(ComponentName componentName, IBinder iBinder) {
            return new r(android.support.customtabs.trusted.b.AbstractBinderC0010b.i(iBinder), componentName);
        }
    }

    @l0
    b(@NonNull Runnable runnable) {
        this(runnable, new a());
    }

    public static /* synthetic */ Object a(b bVar, androidx.concurrent.futures.c.a aVar) throws Exception {
        int i10 = bVar.f11960c;
        if (i10 == 0) {
            bVar.f11962e.add(aVar);
        } else {
            if (i10 != 1) {
                if (i10 == 2) {
                    throw new IllegalStateException("Service has been disconnected.");
                }
                if (i10 != 3) {
                    throw new IllegalStateException("Connection state is invalid");
                }
                throw bVar.f11963f;
            }
            r rVar = bVar.f11961d;
            if (rVar == null) {
                throw new IllegalStateException("ConnectionHolder state is incorrect.");
            }
            aVar.c(rVar);
        }
        return "ConnectionHolder, state = " + bVar.f11960c;
    }

    @l0
    public void b(@NonNull Exception exc) {
        Iterator<androidx.concurrent.futures.c.a<r>> it = this.f11962e.iterator();
        while (it.hasNext()) {
            it.next().f(exc);
        }
        this.f11962e.clear();
        this.f11958a.run();
        this.f11960c = 3;
        this.f11963f = exc;
    }

    @NonNull
    @l0
    public t1<r> c() {
        return androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0353c() { // from class: androidx.browser.trusted.a
            @Override // androidx.concurrent.futures.c.InterfaceC0353c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return b.a(this.f11953a, aVar);
            }
        });
    }

    @Override // android.content.ServiceConnection
    @l0
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f11961d = this.f11959b.a(componentName, iBinder);
        Iterator<androidx.concurrent.futures.c.a<r>> it = this.f11962e.iterator();
        while (it.hasNext()) {
            it.next().c(this.f11961d);
        }
        this.f11962e.clear();
        this.f11960c = 1;
    }

    @Override // android.content.ServiceConnection
    @l0
    public void onServiceDisconnected(ComponentName componentName) {
        this.f11961d = null;
        this.f11958a.run();
        this.f11960c = 2;
    }

    @l0
    b(@NonNull Runnable runnable, @NonNull a aVar) {
        this.f11960c = 0;
        this.f11962e = new ArrayList();
        this.f11958a = runnable;
        this.f11959b = aVar;
    }
}
