package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.lifecycle.c2;
import androidx.lifecycle.w0;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP})
public class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f77262b = "INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f77263c = "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f77264d = "androidx.work.util.preferences";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f77265e = "last_cancel_all_time_ms";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f77266f = "reschedule_needed";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f77267g = "last_force_stop_ms";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WorkDatabase f77268a;

    public t(@NonNull WorkDatabase workDatabase) {
        this.f77268a = workDatabase;
    }

    public static void f(@NonNull Context context, @NonNull w3.d sqLiteDatabase) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(f77264d, 0);
        if (sharedPreferences.contains(f77266f) || sharedPreferences.contains(f77265e)) {
            long j10 = sharedPreferences.getLong(f77265e, 0L);
            long j11 = sharedPreferences.getBoolean(f77266f, false) ? 1L : 0L;
            sqLiteDatabase.Q1();
            try {
                sqLiteDatabase.da(f77262b, new Object[]{f77265e, Long.valueOf(j10)});
                sqLiteDatabase.da(f77262b, new Object[]{f77266f, Long.valueOf(j11)});
                sharedPreferences.edit().clear().apply();
                sqLiteDatabase.W9();
                sqLiteDatabase.Ea();
            } catch (Throwable th2) {
                sqLiteDatabase.Ea();
                throw th2;
            }
        }
    }

    public long b() {
        Long lC = this.f77268a.f().c(f77265e);
        if (lC != null) {
            return lC.longValue();
        }
        return 0L;
    }

    @NonNull
    public w0<Long> c() {
        return c2.i(this.f77268a.f().a(f77265e), new n.a() { // from class: androidx.work.impl.utils.s
            @Override // n.a
            public final Object apply(Object obj) {
                Long l10 = (Long) obj;
                return Long.valueOf(l10 != null ? l10.longValue() : 0L);
            }
        });
    }

    public long d() {
        Long lC = this.f77268a.f().c(f77267g);
        if (lC != null) {
            return lC.longValue();
        }
        return 0L;
    }

    public boolean e() {
        Long lC = this.f77268a.f().c(f77266f);
        return lC != null && lC.longValue() == 1;
    }

    public void g(final long timeMillis) {
        this.f77268a.f().b(new androidx.work.impl.model.d(f77265e, Long.valueOf(timeMillis)));
    }

    public void h(long lastForceStopTimeMillis) {
        this.f77268a.f().b(new androidx.work.impl.model.d(f77267g, Long.valueOf(lastForceStopTimeMillis)));
    }

    public void i(boolean needsReschedule) {
        this.f77268a.f().b(new androidx.work.impl.model.d(f77266f, needsReschedule));
    }
}
