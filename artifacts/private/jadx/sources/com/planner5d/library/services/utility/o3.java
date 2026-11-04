package com.planner5d.library.services.utility;

import android.app.ActivityManager;
import android.app.Application;
import android.os.Looper;
import android.os.Process;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nThreadingUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadingUtils.kt\ncom/planner5d/library/services/utility/ThreadingUtils\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,29:1\n31#2:30\n1755#3,3:31\n*S KotlinDebug\n*F\n+ 1 ThreadingUtils.kt\ncom/planner5d/library/services/utility/ThreadingUtils\n*L\n12#1:30\n12#1:31,3\n*E\n"})
public final class o3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final o3 f229693a = new o3();

    private o3() {
    }

    @oj.n
    public static final boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @oj.n
    public static final void c(long j10) {
        try {
            Thread.sleep(j10);
        } catch (InterruptedException e10) {
            timber.log.b.f381052a.e(e10);
        }
    }

    public final boolean a(@NotNull Application application) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        Intrinsics.checkNotNullParameter(application, "application");
        ActivityManager activityManager = (ActivityManager) androidx.core.content.d.s(application, ActivityManager.class);
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            List<ActivityManager.RunningAppProcessInfo> list = runningAppProcesses;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : list) {
                if (runningAppProcessInfo.pid == Process.myPid() && Intrinsics.areEqual(runningAppProcessInfo.processName, application.getApplicationInfo().packageName)) {
                    return true;
                }
            }
        }
        return false;
    }
}
