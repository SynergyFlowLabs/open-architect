package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.w0;
import androidx.work.e;
import androidx.work.v;
import androidx.work.w;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
@e.a({"ClassVerificationFailure"})
@w0(api = 23)
@b1({b1.a.LIBRARY_GROUP})
class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f76729c = v.i("SystemJobInfoConverter");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f76730d = "EXTRA_WORK_SPEC_ID";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final String f76731e = "EXTRA_IS_PERIODIC";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final String f76732f = "EXTRA_WORK_SPEC_GENERATION";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ComponentName f76733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.work.b f76734b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f76735a;

        static {
            int[] iArr = new int[w.values().length];
            f76735a = iArr;
            try {
                iArr[w.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f76735a[w.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f76735a[w.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f76735a[w.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f76735a[w.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    b(@NonNull Context context, androidx.work.b clock) {
        this.f76734b = clock;
        this.f76733a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    @w0(24)
    private static JobInfo.TriggerContentUri b(e.c cVar) {
        return new JobInfo.TriggerContentUri(cVar.a(), cVar.b() ? 1 : 0);
    }

    static int c(w networkType) {
        int i10 = a.f76735a[networkType.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5) {
            return 4;
        }
        v.e().a(f76729c, "API version too low. Cannot convert network type value " + networkType);
        return 1;
    }

    static void d(@NonNull JobInfo.Builder builder, @NonNull w networkType) {
        if (Build.VERSION.SDK_INT < 30 || networkType != w.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(c(networkType));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    JobInfo a(androidx.work.impl.model.v workSpec, int jobId) {
        e eVar = workSpec.f76992j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(f76730d, workSpec.f76983a);
        persistableBundle.putInt(f76732f, workSpec.C());
        persistableBundle.putBoolean(f76731e, workSpec.J());
        JobInfo.Builder extras = new JobInfo.Builder(jobId, this.f76733a).setRequiresCharging(eVar.g()).setRequiresDeviceIdle(eVar.h()).setExtras(persistableBundle);
        d(extras, eVar.d());
        if (!eVar.h()) {
            extras.setBackoffCriteria(workSpec.f76995m, workSpec.f76994l == androidx.work.a.LINEAR ? 0 : 1);
        }
        long jMax = Math.max(workSpec.c() - this.f76734b.currentTimeMillis(), 0L);
        if (jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!workSpec.f76999q) {
            extras.setImportantWhileForeground(true);
        }
        if (eVar.e()) {
            Iterator<e.c> it = eVar.c().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(b(it.next()));
            }
            extras.setTriggerContentUpdateDelay(eVar.b());
            extras.setTriggerContentMaxDelay(eVar.a());
        }
        extras.setPersisted(false);
        int i10 = Build.VERSION.SDK_INT;
        extras.setRequiresBatteryNotLow(eVar.f());
        extras.setRequiresStorageNotLow(eVar.i());
        boolean z10 = workSpec.f76993k > 0;
        boolean z11 = jMax > 0;
        if (i10 >= 31 && workSpec.f76999q && !z10 && !z11) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
