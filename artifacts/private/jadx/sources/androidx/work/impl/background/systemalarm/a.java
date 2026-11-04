package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.u;
import androidx.annotation.w0;
import androidx.core.app.w;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.j;
import androidx.work.impl.model.k;
import androidx.work.impl.model.m;
import androidx.work.impl.model.n;
import androidx.work.impl.utils.l;
import androidx.work.v;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP})
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f76659a = v.i("Alarms");

    /* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.a$a, reason: collision with other inner class name */
    @w0(19)
    static class C0777a {
        private C0777a() {
        }

        @u
        static void a(AlarmManager alarmManager, int type, long triggerAtMillis, PendingIntent operation) {
            alarmManager.setExact(type, triggerAtMillis, operation);
        }
    }

    private a() {
    }

    public static void a(@NonNull Context context, @NonNull WorkDatabase workDatabase, @NonNull n id2) {
        k kVarH = workDatabase.h();
        j jVarE = kVarH.e(id2);
        if (jVarE != null) {
            b(context, id2, jVarE.f76956c);
            v.e().a(f76659a, "Removing SystemIdInfo for workSpecId (" + id2 + ")");
            kVarH.c(id2);
        }
    }

    private static void b(@NonNull Context context, @NonNull n id2, int alarmId) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(w.K0);
        PendingIntent service = PendingIntent.getService(context, alarmId, b.b(context, id2), 603979776);
        if (service != null && alarmManager != null) {
            v.e().a(f76659a, "Cancelling existing alarm with (workSpecId, systemId) (" + id2 + ", " + alarmId + ")");
            alarmManager.cancel(service);
        }
    }

    public static void c(@NonNull Context context, @NonNull WorkDatabase workDatabase, @NonNull n id2, long triggerAtMillis) {
        k kVarH = workDatabase.h();
        j jVarE = kVarH.e(id2);
        if (jVarE != null) {
            b(context, id2, jVarE.f76956c);
            d(context, id2, jVarE.f76956c, triggerAtMillis);
        } else {
            int iC = new l(workDatabase).c();
            kVarH.d(m.a(id2, iC));
            d(context, id2, iC, triggerAtMillis);
        }
    }

    private static void d(@NonNull Context context, @NonNull n id2, int alarmId, long triggerAtMillis) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(w.K0);
        PendingIntent service = PendingIntent.getService(context, alarmId, b.b(context, id2), 201326592);
        if (alarmManager != null) {
            int i10 = 2 << 0;
            C0777a.a(alarmManager, 0, triggerAtMillis, service);
        }
    }
}
