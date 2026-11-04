package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes4.dex */
@w0(api = 21)
public class JobInfoSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString(com.facebook.bolts.e.f99330c);
        int i10 = jobParameters.getExtras().getInt("priority");
        int i11 = jobParameters.getExtras().getInt("attemptNumber");
        com.google.android.datatransport.runtime.w.f(getApplicationContext());
        com.google.android.datatransport.runtime.r.a aVarD = com.google.android.datatransport.runtime.r.a().b(string).d(c6.a.b(i10));
        if (string2 != null) {
            aVarD.c(Base64.decode(string2, 0));
        }
        com.google.android.datatransport.runtime.w.c().e().m(aVarD.a(), i11, new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f103640a.jobFinished(jobParameters, false);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
