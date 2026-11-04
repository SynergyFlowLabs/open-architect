package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f77250a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f77251b = "next_job_scheduler_id";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f77252c = "next_alarm_manager_id";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f77253d = "androidx.work.util.id";

    public static final void c(@NotNull Context context, @NotNull w3.d sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        SharedPreferences sharedPreferences = context.getSharedPreferences(f77253d, 0);
        if (sharedPreferences.contains(f77251b) || sharedPreferences.contains(f77251b)) {
            int i10 = sharedPreferences.getInt(f77251b, 0);
            int i11 = sharedPreferences.getInt(f77252c, 0);
            sqLiteDatabase.Q1();
            try {
                sqLiteDatabase.da(t.f77262b, new Object[]{f77251b, Integer.valueOf(i10)});
                sqLiteDatabase.da(t.f77262b, new Object[]{f77252c, Integer.valueOf(i11)});
                sharedPreferences.edit().clear().apply();
                sqLiteDatabase.W9();
            } finally {
                sqLiteDatabase.Ea();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(WorkDatabase workDatabase, String str) {
        Long lC = workDatabase.f().c(str);
        int i10 = 0;
        int iLongValue = lC != null ? (int) lC.longValue() : 0;
        if (iLongValue != Integer.MAX_VALUE) {
            i10 = iLongValue + 1;
        }
        e(workDatabase, str, i10);
        return iLongValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(WorkDatabase workDatabase, String str, int i10) {
        workDatabase.f().b(new androidx.work.impl.model.d(str, Long.valueOf(i10)));
    }
}
