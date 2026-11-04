package androidx.loader.content;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.SystemClock;
import android.text.format.DateUtils;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.core.os.u;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a<D> extends c<D> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f52625p = "AsyncTaskLoader";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final boolean f52626q = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Executor f52627j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile a<D>.RunnableC0486a f52628k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile a<D>.RunnableC0486a f52629l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f52630m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f52631n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Handler f52632o;

    /* JADX INFO: renamed from: androidx.loader.content.a$a, reason: collision with other inner class name */
    final class RunnableC0486a extends d<D> implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f52633g;

        RunnableC0486a() {
        }

        @Override // androidx.loader.content.d
        protected D b() {
            try {
                return (D) a.this.L();
            } catch (u e10) {
                if (f()) {
                    return null;
                }
                throw e10;
            }
        }

        @Override // androidx.loader.content.d
        protected void g(D d10) {
            a.this.E(this, d10);
        }

        @Override // androidx.loader.content.d
        protected void h(D d10) {
            a.this.F(this, d10);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f52633g = false;
            a.this.G();
        }
    }

    public a(@NonNull Context context) {
        super(context);
        this.f52631n = -10000L;
    }

    public void D() {
    }

    void E(a<D>.RunnableC0486a runnableC0486a, D d10) {
        K(d10);
        if (this.f52629l == runnableC0486a) {
            x();
            this.f52631n = SystemClock.uptimeMillis();
            this.f52629l = null;
            e();
            G();
        }
    }

    void F(a<D>.RunnableC0486a runnableC0486a, D d10) {
        if (this.f52628k != runnableC0486a) {
            E(runnableC0486a, d10);
            return;
        }
        if (k()) {
            K(d10);
            return;
        }
        c();
        this.f52631n = SystemClock.uptimeMillis();
        this.f52628k = null;
        f(d10);
    }

    void G() {
        if (this.f52629l == null && this.f52628k != null) {
            if (this.f52628k.f52633g) {
                this.f52628k.f52633g = false;
                this.f52632o.removeCallbacks(this.f52628k);
            }
            if (this.f52630m > 0 && SystemClock.uptimeMillis() < this.f52631n + this.f52630m) {
                this.f52628k.f52633g = true;
                this.f52632o.postAtTime(this.f52628k, this.f52631n + this.f52630m);
            } else {
                if (this.f52627j == null) {
                    this.f52627j = H();
                }
                this.f52628k.c(this.f52627j);
            }
        }
    }

    @NonNull
    protected Executor H() {
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }

    public boolean I() {
        return this.f52629l != null;
    }

    @p0
    public abstract D J();

    public void K(@p0 D d10) {
    }

    @p0
    protected D L() {
        return J();
    }

    public void M(long j10) {
        this.f52630m = j10;
        if (j10 != 0) {
            this.f52632o = new Handler();
        }
    }

    @Override // androidx.loader.content.c
    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        super.g(str, fileDescriptor, printWriter, strArr);
        if (this.f52628k != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f52628k);
            printWriter.print(" waiting=");
            printWriter.println(this.f52628k.f52633g);
        }
        if (this.f52629l != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f52629l);
            printWriter.print(" waiting=");
            printWriter.println(this.f52629l.f52633g);
        }
        if (this.f52630m != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            printWriter.print(DateUtils.formatElapsedTime(timeUnit.toSeconds(this.f52630m)));
            printWriter.print(" mLastLoadCompleteTime=");
            if (this.f52631n == -10000) {
                str2 = "--";
            } else {
                str2 = "-" + DateUtils.formatElapsedTime(timeUnit.toSeconds(SystemClock.uptimeMillis() - this.f52631n));
            }
            printWriter.print(str2);
            printWriter.println();
        }
    }

    @Override // androidx.loader.content.c
    protected boolean o() {
        if (this.f52628k == null) {
            return false;
        }
        if (!m()) {
            p();
        }
        if (this.f52629l != null) {
            if (this.f52628k.f52633g) {
                this.f52628k.f52633g = false;
                this.f52632o.removeCallbacks(this.f52628k);
            }
            this.f52628k = null;
            return false;
        }
        if (this.f52628k.f52633g) {
            this.f52628k.f52633g = false;
            this.f52632o.removeCallbacks(this.f52628k);
            this.f52628k = null;
            return false;
        }
        boolean zA = this.f52628k.a(false);
        if (zA) {
            this.f52629l = this.f52628k;
            D();
        }
        this.f52628k = null;
        return zA;
    }

    @Override // androidx.loader.content.c
    protected void q() {
        super.q();
        b();
        this.f52628k = new RunnableC0486a();
        G();
    }
}
