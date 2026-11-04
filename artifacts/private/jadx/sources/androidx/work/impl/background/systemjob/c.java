package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.core.util.e;
import androidx.work.c0;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.j;
import androidx.work.impl.model.m;
import androidx.work.impl.model.n;
import androidx.work.impl.model.z;
import androidx.work.impl.utils.l;
import androidx.work.impl.w;
import androidx.work.l0;
import androidx.work.v;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
@w0(23)
@b1({b1.a.LIBRARY_GROUP})
public class c implements w {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f76736f = v.i("SystemJobScheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f76737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JobScheduler f76738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f76739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WorkDatabase f76740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.work.c f76741e;

    public c(@NonNull Context context, @NonNull WorkDatabase workDatabase, @NonNull androidx.work.c configuration) {
        this(context, workDatabase, configuration, (JobScheduler) context.getSystemService("jobscheduler"), new b(context, configuration.a()));
    }

    public static void d(@NonNull Context context) {
        List<JobInfo> listG;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (listG = g(context, jobScheduler)) == null || listG.isEmpty()) {
            return;
        }
        Iterator<JobInfo> it = listG.iterator();
        while (it.hasNext()) {
            e(jobScheduler, it.next().getId());
        }
    }

    private static void e(@NonNull JobScheduler jobScheduler, int id2) {
        try {
            jobScheduler.cancel(id2);
        } catch (Throwable th2) {
            v.e().d(f76736f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(id2)), th2);
        }
    }

    @p0
    private static List<Integer> f(@NonNull Context context, @NonNull JobScheduler jobScheduler, @NonNull String workSpecId) {
        List<JobInfo> listG = g(context, jobScheduler);
        if (listG == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : listG) {
            n nVarH = h(jobInfo);
            if (nVarH != null && workSpecId.equals(nVarH.f())) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    @p0
    private static List<JobInfo> g(@NonNull Context context, @NonNull JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th2) {
            v.e().d(f76736f, "getAllPendingJobs() is not reliable on this device.", th2);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @p0
    private static n h(@NonNull JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras != null) {
            try {
                if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                    return new n(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
                }
            } catch (NullPointerException unused) {
            }
        }
        return null;
    }

    public static boolean i(@NonNull Context context, @NonNull WorkDatabase workDatabase) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> listG = g(context, jobScheduler);
        List<String> listF = workDatabase.h().f();
        boolean z10 = false;
        HashSet hashSet = new HashSet(listG != null ? listG.size() : 0);
        if (listG != null && !listG.isEmpty()) {
            for (JobInfo jobInfo : listG) {
                n nVarH = h(jobInfo);
                if (nVarH != null) {
                    hashSet.add(nVarH.f());
                } else {
                    e(jobScheduler, jobInfo.getId());
                }
            }
        }
        Iterator<String> it = listF.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(it.next())) {
                v.e().a(f76736f, "Reconciling jobs");
                z10 = true;
                break;
            }
        }
        if (!z10) {
            return z10;
        }
        workDatabase.beginTransaction();
        try {
            androidx.work.impl.model.w wVarK = workDatabase.k();
            Iterator<String> it2 = listF.iterator();
            while (it2.hasNext()) {
                wVarK.K(it2.next(), -1L);
            }
            workDatabase.setTransactionSuccessful();
            return z10;
        } finally {
            workDatabase.endTransaction();
        }
    }

    @Override // androidx.work.impl.w
    public boolean a() {
        return true;
    }

    @Override // androidx.work.impl.w
    public void b(@NonNull String workSpecId) {
        List<Integer> listF = f(this.f76737a, this.f76738b, workSpecId);
        if (listF != null && !listF.isEmpty()) {
            Iterator<Integer> it = listF.iterator();
            while (it.hasNext()) {
                e(this.f76738b, it.next().intValue());
            }
            this.f76740d.h().i(workSpecId);
        }
    }

    @Override // androidx.work.impl.w
    public void c(@NonNull androidx.work.impl.model.v... workSpecs) {
        l lVar = new l(this.f76740d);
        for (androidx.work.impl.model.v vVar : workSpecs) {
            this.f76740d.beginTransaction();
            try {
                androidx.work.impl.model.v vVarH = this.f76740d.k().H(vVar.f76983a);
                if (vVarH == null) {
                    v.e().l(f76736f, "Skipping scheduling " + vVar.f76983a + " because it's no longer in the DB");
                    this.f76740d.setTransactionSuccessful();
                } else if (vVarH.f76984b != l0.c.ENQUEUED) {
                    v.e().l(f76736f, "Skipping scheduling " + vVar.f76983a + " because it is no longer enqueued");
                    this.f76740d.setTransactionSuccessful();
                } else {
                    n nVarA = z.a(vVar);
                    j jVarE = this.f76740d.h().e(nVarA);
                    int iE = jVarE != null ? jVarE.f76956c : lVar.e(this.f76741e.i(), this.f76741e.g());
                    if (jVarE == null) {
                        this.f76740d.h().d(m.a(nVarA, iE));
                    }
                    j(vVar, iE);
                    this.f76740d.setTransactionSuccessful();
                }
                this.f76740d.endTransaction();
            } catch (Throwable th2) {
                this.f76740d.endTransaction();
                throw th2;
            }
        }
    }

    @l1
    public void j(@NonNull androidx.work.impl.model.v workSpec, int jobId) {
        JobInfo jobInfoA = this.f76739c.a(workSpec, jobId);
        v vVarE = v.e();
        String str = f76736f;
        vVarE.a(str, "Scheduling work ID " + workSpec.f76983a + "Job ID " + jobId);
        try {
            if (this.f76738b.schedule(jobInfoA) == 0) {
                v.e().l(str, "Unable to schedule work ID " + workSpec.f76983a);
                if (workSpec.f76999q && workSpec.f77000r == c0.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    workSpec.f76999q = false;
                    v.e().a(str, String.format("Scheduling a non-expedited job (work ID %s)", workSpec.f76983a));
                    j(workSpec, jobId);
                }
            }
        } catch (IllegalStateException e10) {
            List<JobInfo> listG = g(this.f76737a, this.f76738b);
            String str2 = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(listG != null ? listG.size() : 0), Integer.valueOf(this.f76740d.k().F().size()), Integer.valueOf(this.f76741e.h()));
            v.e().c(f76736f, str2);
            IllegalStateException illegalStateException = new IllegalStateException(str2, e10);
            e<Throwable> eVarL = this.f76741e.l();
            if (eVarL == null) {
                throw illegalStateException;
            }
            eVarL.accept(illegalStateException);
        } catch (Throwable th2) {
            v.e().d(f76736f, "Unable to schedule " + workSpec, th2);
        }
    }

    @l1
    public c(@NonNull Context context, @NonNull WorkDatabase workDatabase, @NonNull androidx.work.c configuration, @NonNull JobScheduler jobScheduler, @NonNull b systemJobInfoConverter) {
        this.f76737a = context;
        this.f76738b = jobScheduler;
        this.f76739c = systemJobInfoConverter;
        this.f76740d = workDatabase;
        this.f76741e = configuration;
    }
}
