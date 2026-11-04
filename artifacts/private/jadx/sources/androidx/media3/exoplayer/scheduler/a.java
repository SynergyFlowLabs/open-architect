package androidx.media3.exoplayer.scheduler;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import androidx.annotation.a1;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.z;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class a implements e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f64720d = "PlatformScheduler";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f64721e = "service_action";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f64722f = "service_package";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f64723g = "requirements";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f64724h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f64725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ComponentName f64726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JobScheduler f64727c;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.scheduler.a$a, reason: collision with other inner class name */
    public static final class JobServiceC0588a extends JobService {
        @Override // android.app.job.JobService
        public boolean onStartJob(JobParameters jobParameters) {
            PersistableBundle extras = jobParameters.getExtras();
            int iE = new Requirements(extras.getInt("requirements")).e(this);
            if (iE == 0) {
                k1.o2(this, new Intent((String) androidx.media3.common.util.a.g(extras.getString(a.f64721e))).setPackage((String) androidx.media3.common.util.a.g(extras.getString(a.f64722f))));
                return false;
            }
            z.n(a.f64720d, "Requirements not met: " + iE);
            jobFinished(jobParameters, true);
            return false;
        }

        @Override // android.app.job.JobService
        public boolean onStopJob(JobParameters jobParameters) {
            return false;
        }
    }

    static {
        f64724h = (k1.f61540a >= 26 ? 16 : 0) | 15;
    }

    @a1("android.permission.RECEIVE_BOOT_COMPLETED")
    public a(Context context, int i10) {
        Context applicationContext = context.getApplicationContext();
        this.f64725a = i10;
        this.f64726b = new ComponentName(applicationContext, (Class<?>) JobServiceC0588a.class);
        this.f64727c = (JobScheduler) androidx.media3.common.util.a.g((JobScheduler) applicationContext.getSystemService("jobscheduler"));
    }

    private static JobInfo c(int i10, ComponentName componentName, Requirements requirements, String str, String str2) {
        Requirements requirementsB = requirements.b(f64724h);
        if (!requirementsB.equals(requirements)) {
            z.n(f64720d, "Ignoring unsupported requirements: " + (requirementsB.f() ^ requirements.f()));
        }
        JobInfo.Builder builder = new JobInfo.Builder(i10, componentName);
        if (requirements.o()) {
            builder.setRequiredNetworkType(2);
        } else if (requirements.l()) {
            builder.setRequiredNetworkType(1);
        }
        builder.setRequiresDeviceIdle(requirements.j());
        builder.setRequiresCharging(requirements.g());
        if (k1.f61540a >= 26 && requirements.n()) {
            builder.setRequiresStorageNotLow(true);
        }
        builder.setPersisted(true);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(f64721e, str);
        persistableBundle.putString(f64722f, str2);
        persistableBundle.putInt("requirements", requirements.f());
        builder.setExtras(persistableBundle);
        return builder.build();
    }

    @Override // androidx.media3.exoplayer.scheduler.e
    public boolean a(Requirements requirements, String str, String str2) {
        return this.f64727c.schedule(c(this.f64725a, this.f64726b, requirements, str2, str)) == 1;
    }

    @Override // androidx.media3.exoplayer.scheduler.e
    public Requirements b(Requirements requirements) {
        return requirements.b(f64724h);
    }

    @Override // androidx.media3.exoplayer.scheduler.e
    public boolean cancel() {
        this.f64727c.cancel(this.f64725a);
        return true;
    }
}
