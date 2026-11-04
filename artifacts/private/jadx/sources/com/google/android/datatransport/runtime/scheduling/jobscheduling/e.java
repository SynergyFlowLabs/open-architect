package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import androidx.annotation.l1;
import androidx.annotation.w0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes4.dex */
@w0(api = 21)
public class e implements y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f103632d = "JobInfoScheduler";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final String f103633e = "attemptNumber";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final String f103634f = "backendName";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final String f103635g = "priority";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final String f103636h = "extras";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f103637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.scheduling.persistence.d f103638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f103639c;

    public e(Context context, com.google.android.datatransport.runtime.scheduling.persistence.d dVar, g gVar) {
        this.f103637a = context;
        this.f103638b = dVar;
        this.f103639c = gVar;
    }

    private boolean d(JobScheduler jobScheduler, int i10, int i11) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i12 = jobInfo.getExtras().getInt(f103633e);
            if (jobInfo.getId() == i10) {
                if (i12 < i11) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.y
    public void a(com.google.android.datatransport.runtime.r rVar, int i10, boolean z10) {
        ComponentName componentName = new ComponentName(this.f103637a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f103637a.getSystemService("jobscheduler");
        int iC = c(rVar);
        if (!z10 && d(jobScheduler, iC, i10)) {
            z5.a.c(f103632d, "Upload for context %s is already scheduled. Returning...", rVar);
            return;
        }
        long jBb = this.f103638b.Bb(rVar);
        JobInfo.Builder builderC = this.f103639c.c(new JobInfo.Builder(iC, componentName), rVar.d(), jBb, i10);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt(f103633e, i10);
        persistableBundle.putString(f103634f, rVar.b());
        persistableBundle.putInt("priority", c6.a.a(rVar.d()));
        if (rVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(rVar.c(), 0));
        }
        builderC.setExtras(persistableBundle);
        z5.a.e(f103632d, "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", rVar, Integer.valueOf(iC), Long.valueOf(this.f103639c.h(rVar.d(), jBb, i10)), Long.valueOf(jBb), Integer.valueOf(i10));
        jobScheduler.schedule(builderC.build());
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.y
    public void b(com.google.android.datatransport.runtime.r rVar, int i10) {
        a(rVar, i10, false);
    }

    @l1
    int c(com.google.android.datatransport.runtime.r rVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f103637a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(rVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(c6.a.a(rVar.d())).array());
        if (rVar.c() != null) {
            adler32.update(rVar.c());
        }
        return (int) adler32.getValue();
    }
}
