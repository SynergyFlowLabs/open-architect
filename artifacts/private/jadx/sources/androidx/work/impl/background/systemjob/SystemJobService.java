package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.u;
import androidx.annotation.w0;
import androidx.work.WorkerParameters;
import androidx.work.impl.a0;
import androidx.work.impl.b0;
import androidx.work.impl.f;
import androidx.work.impl.model.n;
import androidx.work.impl.p0;
import androidx.work.impl.q0;
import androidx.work.impl.r0;
import androidx.work.l0;
import androidx.work.v;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@w0(23)
@b1({b1.a.LIBRARY_GROUP})
public class SystemJobService extends JobService implements f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f76724e = v.i("SystemJobService");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r0 f76725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<n, JobParameters> f76726b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b0 f76727c = new b0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p0 f76728d;

    @w0(24)
    static class a {
        private a() {
        }

        @u
        static String[] a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        @u
        static Uri[] b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    @w0(28)
    static class b {
        private b() {
        }

        @u
        static Network a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    @w0(31)
    static class c {
        private c() {
        }

        @u
        static int a(JobParameters jobParameters) {
            return SystemJobService.a(jobParameters.getStopReason());
        }
    }

    static int a(int jobReason) {
        switch (jobReason) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return jobReason;
            default:
                return l0.f77348o;
        }
    }

    @androidx.annotation.p0
    private static n b(@NonNull JobParameters parameters) {
        try {
            PersistableBundle extras = parameters.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return new n(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
            }
        } catch (NullPointerException unused) {
        }
        return null;
    }

    @Override // androidx.work.impl.f
    public void d(@NonNull n id2, boolean needsReschedule) {
        JobParameters jobParametersRemove;
        v.e().a(f76724e, id2.f() + " executed on JobScheduler");
        synchronized (this.f76726b) {
            jobParametersRemove = this.f76726b.remove(id2);
        }
        this.f76727c.b(id2);
        if (jobParametersRemove != null) {
            jobFinished(jobParametersRemove, needsReschedule);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            r0 r0VarM = r0.M(getApplicationContext());
            this.f76725a = r0VarM;
            androidx.work.impl.u uVarO = r0VarM.O();
            this.f76728d = new q0(uVarO, this.f76725a.U());
            uVarO.e(this);
        } catch (IllegalStateException e10) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
            }
            v.e().l(f76724e, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        r0 r0Var = this.f76725a;
        if (r0Var != null) {
            r0Var.O().n(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(@NonNull JobParameters params) {
        if (this.f76725a == null) {
            v.e().a(f76724e, "WorkManager is not initialized; requesting retry.");
            jobFinished(params, true);
            return false;
        }
        n nVarB = b(params);
        if (nVarB == null) {
            v.e().c(f76724e, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.f76726b) {
            try {
                if (this.f76726b.containsKey(nVarB)) {
                    v.e().a(f76724e, "Job is already being executed by SystemJobService: " + nVarB);
                    return false;
                }
                v.e().a(f76724e, "onStartJob for " + nVarB);
                this.f76726b.put(nVarB, params);
                WorkerParameters.a aVar = new WorkerParameters.a();
                if (a.b(params) != null) {
                    aVar.f76484b = Arrays.asList(a.b(params));
                }
                if (a.a(params) != null) {
                    aVar.f76483a = Arrays.asList(a.a(params));
                }
                aVar.f76485c = b.a(params);
                this.f76728d.c(this.f76727c.e(nVarB), aVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(@NonNull JobParameters params) {
        if (this.f76725a == null) {
            v.e().a(f76724e, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        n nVarB = b(params);
        if (nVarB == null) {
            v.e().c(f76724e, "WorkSpec id not found!");
            return false;
        }
        v.e().a(f76724e, "onStopJob for " + nVarB);
        synchronized (this.f76726b) {
            this.f76726b.remove(nVarB);
        }
        a0 a0VarB = this.f76727c.b(nVarB);
        if (a0VarB != null) {
            this.f76728d.a(a0VarB, Build.VERSION.SDK_INT >= 31 ? c.a(params) : l0.f77348o);
        }
        return !this.f76725a.O().k(nVarB.f());
    }
}
