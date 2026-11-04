package androidx.core.app;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.v0;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    @w0(21)
    static class a {
        private a() {
        }

        static AlarmManager.AlarmClockInfo a(long j10, PendingIntent pendingIntent) {
            return new AlarmManager.AlarmClockInfo(j10, pendingIntent);
        }

        static void b(AlarmManager alarmManager, Object obj, PendingIntent pendingIntent) {
            alarmManager.setAlarmClock((AlarmManager.AlarmClockInfo) obj, pendingIntent);
        }
    }

    @w0(23)
    static class b {
        private b() {
        }

        static void a(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
            alarmManager.setAndAllowWhileIdle(i10, j10, pendingIntent);
        }

        static void b(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
            alarmManager.setExactAndAllowWhileIdle(i10, j10, pendingIntent);
        }
    }

    @w0(31)
    static class c {
        private c() {
        }

        static boolean a(AlarmManager alarmManager) {
            return alarmManager.canScheduleExactAlarms();
        }
    }

    private g() {
    }

    public static boolean a(@NonNull AlarmManager alarmManager) {
        if (Build.VERSION.SDK_INT >= 31) {
            return c.a(alarmManager);
        }
        return true;
    }

    @e.a({"MissingPermission"})
    public static void b(@NonNull AlarmManager alarmManager, long j10, @NonNull PendingIntent pendingIntent, @NonNull PendingIntent pendingIntent2) {
        a.b(alarmManager, a.a(j10, pendingIntent), pendingIntent2);
    }

    public static void c(@NonNull AlarmManager alarmManager, int i10, long j10, @NonNull PendingIntent pendingIntent) {
        b.a(alarmManager, i10, j10, pendingIntent);
    }

    @v0(expression = "alarmManager.setExact(type, triggerAtMillis, operation)")
    @Deprecated
    public static void d(@NonNull AlarmManager alarmManager, int i10, long j10, @NonNull PendingIntent pendingIntent) {
        alarmManager.setExact(i10, j10, pendingIntent);
    }

    public static void e(@NonNull AlarmManager alarmManager, int i10, long j10, @NonNull PendingIntent pendingIntent) {
        b.b(alarmManager, i10, j10, pendingIntent);
    }
}
