package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.w0;
import com.facebook.AuthenticationTokenClaims;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class p extends Service {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final String f47125h = "JobIntentService";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final boolean f47126i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final Object f47127j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final HashMap<ComponentName, h> f47128k = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    b f47129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    h f47130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    a f47131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f47132d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f47133e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f47134f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final ArrayList<d> f47135g = null;

    final class a extends AsyncTask<Void, Void, Void> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                e eVarA = p.this.a();
                if (eVarA == null) {
                    return null;
                }
                p.this.h(eVarA.getIntent());
                eVarA.complete();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onCancelled(Void r10) {
            p.this.j();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r10) {
            p.this.j();
        }
    }

    interface b {
        IBinder a();

        e b();
    }

    static final class c extends h {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Context f47137d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final PowerManager.WakeLock f47138e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final PowerManager.WakeLock f47139f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f47140g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f47141h;

        c(Context context, ComponentName componentName) {
            super(componentName);
            this.f47137d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f47138e = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock wakeLockNewWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f47139f = wakeLockNewWakeLock2;
            wakeLockNewWakeLock2.setReferenceCounted(false);
        }

        @Override // androidx.core.app.p.h
        void a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f47154a);
            if (this.f47137d.startService(intent2) != null) {
                synchronized (this) {
                    try {
                        if (!this.f47140g) {
                            this.f47140g = true;
                            if (!this.f47141h) {
                                this.f47138e.acquire(60000L);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        @Override // androidx.core.app.p.h
        public void c() {
            synchronized (this) {
                try {
                    if (this.f47141h) {
                        if (this.f47140g) {
                            this.f47138e.acquire(60000L);
                        }
                        this.f47141h = false;
                        this.f47139f.release();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.core.app.p.h
        public void d() {
            synchronized (this) {
                try {
                    if (!this.f47141h) {
                        this.f47141h = true;
                        this.f47139f.acquire(AuthenticationTokenClaims.Z);
                        this.f47138e.release();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.core.app.p.h
        public void e() {
            synchronized (this) {
                try {
                    this.f47140g = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    final class d implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Intent f47142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f47143b;

        d(Intent intent, int i10) {
            this.f47142a = intent;
            this.f47143b = i10;
        }

        @Override // androidx.core.app.p.e
        public void complete() {
            p.this.stopSelf(this.f47143b);
        }

        @Override // androidx.core.app.p.e
        public Intent getIntent() {
            return this.f47142a;
        }
    }

    interface e {
        void complete();

        Intent getIntent();
    }

    @w0(26)
    static final class f extends JobServiceEngine implements b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final String f47145d = "JobServiceEngineImpl";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final boolean f47146e = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final p f47147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f47148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        JobParameters f47149c;

        final class a implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final JobWorkItem f47150a;

            a(JobWorkItem jobWorkItem) {
                this.f47150a = jobWorkItem;
            }

            @Override // androidx.core.app.p.e
            public void complete() {
                synchronized (f.this.f47148b) {
                    try {
                        JobParameters jobParameters = f.this.f47149c;
                        if (jobParameters != null) {
                            jobParameters.completeWork(this.f47150a);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }

            @Override // androidx.core.app.p.e
            public Intent getIntent() {
                return this.f47150a.getIntent();
            }
        }

        f(p pVar) {
            super(pVar);
            this.f47148b = new Object();
            this.f47147a = pVar;
        }

        @Override // androidx.core.app.p.b
        public IBinder a() {
            return getBinder();
        }

        @Override // androidx.core.app.p.b
        public e b() {
            synchronized (this.f47148b) {
                try {
                    JobParameters jobParameters = this.f47149c;
                    if (jobParameters == null) {
                        return null;
                    }
                    JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                    if (jobWorkItemDequeueWork == null) {
                        return null;
                    }
                    jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(this.f47147a.getClassLoader());
                    return new a(jobWorkItemDequeueWork);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStartJob(JobParameters jobParameters) {
            this.f47149c = jobParameters;
            this.f47147a.e(false);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStopJob(JobParameters jobParameters) {
            boolean zB = this.f47147a.b();
            synchronized (this.f47148b) {
                this.f47149c = null;
            }
            return zB;
        }
    }

    @w0(26)
    static final class g extends h {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final JobInfo f47152d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final JobScheduler f47153e;

        g(Context context, ComponentName componentName, int i10) {
            super(componentName);
            b(i10);
            this.f47152d = new JobInfo.Builder(i10, this.f47154a).setOverrideDeadline(0L).build();
            this.f47153e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // androidx.core.app.p.h
        void a(Intent intent) {
            this.f47153e.enqueue(this.f47152d, new JobWorkItem(intent));
        }
    }

    static abstract class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ComponentName f47154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f47155b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f47156c;

        h(ComponentName componentName) {
            this.f47154a = componentName;
        }

        abstract void a(Intent intent);

        void b(int i10) {
            if (!this.f47155b) {
                this.f47155b = true;
                this.f47156c = i10;
            } else {
                if (this.f47156c == i10) {
                    return;
                }
                throw new IllegalArgumentException("Given job ID " + i10 + " is different than previous " + this.f47156c);
            }
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }

    public static void c(@NonNull Context context, @NonNull ComponentName componentName, int i10, @NonNull Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        synchronized (f47127j) {
            try {
                h hVarF = f(context, componentName, true, i10);
                hVarF.b(i10);
                hVarF.a(intent);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void d(@NonNull Context context, @NonNull Class<?> cls, int i10, @NonNull Intent intent) {
        c(context, new ComponentName(context, cls), i10, intent);
    }

    static h f(Context context, ComponentName componentName, boolean z10, int i10) {
        HashMap<ComponentName, h> map = f47128k;
        h hVar = map.get(componentName);
        if (hVar != null) {
            return hVar;
        }
        if (!z10) {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        g gVar = new g(context, componentName, i10);
        map.put(componentName, gVar);
        return gVar;
    }

    e a() {
        b bVar = this.f47129a;
        if (bVar != null) {
            return bVar.b();
        }
        synchronized (this.f47135g) {
            try {
                if (this.f47135g.size() <= 0) {
                    return null;
                }
                return this.f47135g.remove(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    boolean b() {
        a aVar = this.f47131c;
        if (aVar != null) {
            aVar.cancel(this.f47132d);
        }
        this.f47133e = true;
        return i();
    }

    void e(boolean z10) {
        if (this.f47131c == null) {
            this.f47131c = new a();
            h hVar = this.f47130b;
            if (hVar != null && z10) {
                hVar.d();
            }
            this.f47131c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public boolean g() {
        return this.f47133e;
    }

    protected abstract void h(@NonNull Intent intent);

    public boolean i() {
        return true;
    }

    void j() {
        ArrayList<d> arrayList = this.f47135g;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.f47131c = null;
                    ArrayList<d> arrayList2 = this.f47135g;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        e(false);
                    } else if (!this.f47134f) {
                        this.f47130b.c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void k(boolean z10) {
        this.f47132d = z10;
    }

    @Override // android.app.Service
    public IBinder onBind(@NonNull Intent intent) {
        b bVar = this.f47129a;
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f47129a = new f(this);
        this.f47130b = null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<d> arrayList = this.f47135g;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f47134f = true;
                this.f47130b.c();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(@androidx.annotation.p0 Intent intent, int i10, int i11) {
        if (this.f47135g == null) {
            return 2;
        }
        this.f47130b.e();
        synchronized (this.f47135g) {
            try {
                ArrayList<d> arrayList = this.f47135g;
                if (intent == null) {
                    intent = new Intent();
                }
                arrayList.add(new d(intent, i11));
                e(true);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return 3;
    }
}
