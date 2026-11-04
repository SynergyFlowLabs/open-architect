package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.core.os.t0;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.r0;
import androidx.work.l0;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP})
public class ForceStopRunnable implements Runnable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @l1
    static final String f77150f = "ACTION_FORCE_STOP_RESCHEDULE";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @l1
    static final int f77151g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f77152h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f77153i = 300;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f77155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r0 f77156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t f77157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f77158d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f77149e = androidx.work.v.i("ForceStopRunnable");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f77154j = TimeUnit.DAYS.toMillis(3650);

    @b1({b1.a.LIBRARY_GROUP})
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String f77159a = androidx.work.v.i("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NonNull Context context, @p0 Intent intent) {
            if (intent != null && ForceStopRunnable.f77150f.equals(intent.getAction())) {
                androidx.work.v.e().j(f77159a, "Rescheduling alarm that keeps track of force-stops.");
                ForceStopRunnable.g(context);
            }
        }
    }

    public ForceStopRunnable(@NonNull Context context, @NonNull r0 workManager) {
        this.f77155a = context.getApplicationContext();
        this.f77156b = workManager;
        this.f77157c = workManager.N();
    }

    @l1
    static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction(f77150f);
        return intent;
    }

    private static PendingIntent d(Context context, int flags) {
        return PendingIntent.getBroadcast(context, -1, c(context), flags);
    }

    @e.a({"ClassVerificationFailure"})
    static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(androidx.core.app.w.K0);
        PendingIntent pendingIntentD = d(context, Build.VERSION.SDK_INT >= 31 ? 167772160 : androidx.media3.common.j.W0);
        long jCurrentTimeMillis = System.currentTimeMillis() + f77154j;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, pendingIntentD);
        }
    }

    @l1
    public boolean a() {
        boolean zI = androidx.work.impl.background.systemjob.c.i(this.f77155a, this.f77156b.S());
        WorkDatabase workDatabaseS = this.f77156b.S();
        androidx.work.impl.model.w wVarK = workDatabaseS.k();
        androidx.work.impl.model.s sVarJ = workDatabaseS.j();
        workDatabaseS.beginTransaction();
        try {
            List<androidx.work.impl.model.v> listO = wVarK.O();
            boolean z10 = (listO == null || listO.isEmpty()) ? false : true;
            if (z10) {
                for (androidx.work.impl.model.v vVar : listO) {
                    wVarK.q(l0.c.ENQUEUED, vVar.f76983a);
                    wVarK.b(vVar.f76983a, l0.f77348o);
                    wVarK.K(vVar.f76983a, -1L);
                }
            }
            sVarJ.deleteAll();
            workDatabaseS.setTransactionSuccessful();
            workDatabaseS.endTransaction();
            return z10 || zI;
        } catch (Throwable th2) {
            workDatabaseS.endTransaction();
            throw th2;
        }
    }

    @l1
    public void b() {
        boolean zA = a();
        if (h()) {
            androidx.work.v.e().a(f77149e, "Rescheduling Workers.");
            this.f77156b.W();
            this.f77156b.N().i(false);
        } else if (e()) {
            androidx.work.v.e().a(f77149e, "Application was force-stopped, rescheduling.");
            this.f77156b.W();
            this.f77157c.h(this.f77156b.o().a().currentTimeMillis());
        } else {
            if (zA) {
                androidx.work.v.e().a(f77149e, "Found unfinished work, scheduling it.");
                androidx.work.impl.z.f(this.f77156b.o(), this.f77156b.S(), this.f77156b.Q());
            }
        }
    }

    @e.a({"ClassVerificationFailure"})
    @l1
    public boolean e() {
        try {
            int i10 = Build.VERSION.SDK_INT;
            PendingIntent pendingIntentD = d(this.f77155a, i10 >= 31 ? 570425344 : 536870912);
            if (i10 >= 30) {
                if (pendingIntentD != null) {
                    pendingIntentD.cancel();
                }
                List historicalProcessExitReasons = ((ActivityManager) this.f77155a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    long jD = this.f77157c.d();
                    for (int i11 = 0; i11 < historicalProcessExitReasons.size(); i11++) {
                        ApplicationExitInfo applicationExitInfoA = g.a(historicalProcessExitReasons.get(i11));
                        if (applicationExitInfoA.getReason() == 10 && applicationExitInfoA.getTimestamp() >= jD) {
                            return true;
                        }
                    }
                }
            } else if (pendingIntentD == null) {
                g(this.f77155a);
                return true;
            }
            return false;
        } catch (IllegalArgumentException | SecurityException e10) {
            androidx.work.v.e().m(f77149e, "Ignoring exception", e10);
            return true;
        }
    }

    @l1
    public boolean f() {
        androidx.work.c cVarO = this.f77156b.o();
        if (TextUtils.isEmpty(cVarO.c())) {
            androidx.work.v.e().a(f77149e, "The default process name was not specified.");
            return true;
        }
        boolean zB = u.b(this.f77155a, cVarO);
        androidx.work.v.e().a(f77149e, "Is default app process = " + zB);
        return zB;
    }

    @l1
    public boolean h() {
        return this.f77156b.N().e();
    }

    @l1
    public void i(long duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (f()) {
                while (true) {
                    try {
                        androidx.work.impl.g0.d(this.f77155a);
                        androidx.work.v.e().a(f77149e, "Performing cleanup operations.");
                        try {
                            b();
                            break;
                        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e10) {
                            int i10 = this.f77158d + 1;
                            this.f77158d = i10;
                            if (i10 >= 3) {
                                String str = t0.a(this.f77155a) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                                androidx.work.v vVarE = androidx.work.v.e();
                                String str2 = f77149e;
                                vVarE.d(str2, str, e10);
                                IllegalStateException illegalStateException = new IllegalStateException(str, e10);
                                androidx.core.util.e<Throwable> eVarE = this.f77156b.o().e();
                                if (eVarE == null) {
                                    throw illegalStateException;
                                }
                                androidx.work.v.e().b(str2, "Routing exception to the specified exception handler", illegalStateException);
                                eVarE.accept(illegalStateException);
                                break;
                            }
                            androidx.work.v.e().b(f77149e, "Retrying after " + (((long) i10) * 300), e10);
                            i(((long) this.f77158d) * 300);
                        }
                    } catch (SQLiteException e11) {
                        androidx.work.v.e().c(f77149e, "Unexpected SQLite exception during migrations");
                        IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e11);
                        androidx.core.util.e<Throwable> eVarE2 = this.f77156b.o().e();
                        if (eVarE2 == null) {
                            throw illegalStateException2;
                        }
                        eVarE2.accept(illegalStateException2);
                    }
                }
            }
            this.f77156b.V();
        } catch (Throwable th2) {
            this.f77156b.V();
            throw th2;
        }
    }
}
