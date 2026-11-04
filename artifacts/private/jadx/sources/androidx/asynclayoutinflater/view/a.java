package androidx.asynclayoutinflater.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.j0;
import androidx.annotation.k1;
import androidx.annotation.p0;
import androidx.core.util.s;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f11724e = "AsyncLayoutInflater";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    LayoutInflater f11725a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Handler.Callback f11728d = new C0037a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Handler f11726b = new Handler(this.f11728d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    d f11727c = d.b();

    /* JADX INFO: renamed from: androidx.asynclayoutinflater.view.a$a, reason: collision with other inner class name */
    class C0037a implements Handler.Callback {
        C0037a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            c cVar = (c) message.obj;
            if (cVar.f11734d == null) {
                cVar.f11734d = a.this.f11725a.inflate(cVar.f11733c, cVar.f11732b, false);
            }
            cVar.f11735e.a(cVar.f11734d, cVar.f11733c, cVar.f11732b);
            a.this.f11727c.d(cVar);
            return true;
        }
    }

    private static class b extends LayoutInflater {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String[] f11730a = {"android.widget.", "android.webkit.", "android.app."};

        b(Context context) {
            super(context);
        }

        @Override // android.view.LayoutInflater
        public LayoutInflater cloneInContext(Context context) {
            return new b(context);
        }

        @Override // android.view.LayoutInflater
        protected View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
            for (String str2 : f11730a) {
                try {
                    View viewCreateView = createView(str, str2, attributeSet);
                    if (viewCreateView != null) {
                        return viewCreateView;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        a f11731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ViewGroup f11732b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f11733c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        View f11734d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        e f11735e;

        c() {
        }
    }

    private static class d extends Thread {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final d f11736c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ArrayBlockingQueue<c> f11737a = new ArrayBlockingQueue<>(10);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private s.c<c> f11738b = new s.c<>(10);

        static {
            d dVar = new d();
            f11736c = dVar;
            dVar.start();
        }

        private d() {
        }

        public static d b() {
            return f11736c;
        }

        public void a(c cVar) {
            try {
                this.f11737a.put(cVar);
            } catch (InterruptedException e10) {
                throw new RuntimeException("Failed to enqueue async inflate request", e10);
            }
        }

        public c c() {
            c cVarAcquire = this.f11738b.acquire();
            if (cVarAcquire == null) {
                cVarAcquire = new c();
            }
            return cVarAcquire;
        }

        public void d(c cVar) {
            cVar.f11735e = null;
            cVar.f11731a = null;
            cVar.f11732b = null;
            cVar.f11733c = 0;
            cVar.f11734d = null;
            this.f11738b.a(cVar);
        }

        public void e() {
            try {
                c cVarTake = this.f11737a.take();
                try {
                    cVarTake.f11734d = cVarTake.f11731a.f11725a.inflate(cVarTake.f11733c, cVarTake.f11732b, false);
                } catch (RuntimeException unused) {
                }
                Message.obtain(cVarTake.f11731a.f11726b, 0, cVarTake).sendToTarget();
            } catch (InterruptedException unused2) {
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                e();
            }
        }
    }

    public interface e {
        void a(@NonNull View view, @j0 int i10, @p0 ViewGroup viewGroup);
    }

    public a(@NonNull Context context) {
        this.f11725a = new b(context);
    }

    @k1
    public void a(@j0 int i10, @p0 ViewGroup viewGroup, @NonNull e eVar) {
        if (eVar == null) {
            throw new NullPointerException("callback argument may not be null!");
        }
        c cVarC = this.f11727c.c();
        cVarC.f11731a = this;
        cVarC.f11733c = i10;
        cVarC.f11732b = viewGroup;
        cVarC.f11735e = eVar;
        this.f11727c.a(cVarC);
    }
}
