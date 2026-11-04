package com.google.firebase.crashlytics.internal;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.firebase.crashlytics.internal.model.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nProcessDetailsProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessDetailsProvider.kt\ncom/google/firebase/crashlytics/internal/ProcessDetailsProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n774#2:95\n865#2,2:96\n1557#2:98\n1628#2,3:99\n1#3:102\n*S KotlinDebug\n*F\n+ 1 ProcessDetailsProvider.kt\ncom/google/firebase/crashlytics/internal/ProcessDetailsProvider\n*L\n43#1:95\n43#1:96,2\n47#1:98\n47#1:99,3\n*E\n"})
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final j f121254a = new j();

    private j() {
    }

    public static /* synthetic */ f0.f.d.a.c e(j jVar, String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        if ((i12 & 8) != 0) {
            z10 = false;
        }
        return jVar.d(str, i10, i11, z10);
    }

    private final String h() {
        if (Build.VERSION.SDK_INT <= 33) {
            String processName = Application.getProcessName();
            return processName == null ? "" : processName;
        }
        String strMyProcessName = Process.myProcessName();
        Intrinsics.checkNotNull(strMyProcessName);
        return strMyProcessName;
    }

    @oj.j
    @NotNull
    public final f0.f.d.a.c a(@NotNull String processName) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        return e(this, processName, 0, 0, false, 14, null);
    }

    @oj.j
    @NotNull
    public final f0.f.d.a.c b(@NotNull String processName, int i10) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        return e(this, processName, i10, 0, false, 12, null);
    }

    @oj.j
    @NotNull
    public final f0.f.d.a.c c(@NotNull String processName, int i10, int i11) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        return e(this, processName, i10, i11, false, 8, null);
    }

    @oj.j
    @NotNull
    public final f0.f.d.a.c d(@NotNull String processName, int i10, int i11, boolean z10) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        f0.f.d.a.c cVarA = f0.f.d.a.c.a().e(processName).d(i10).c(i11).b(z10).a();
        Intrinsics.checkNotNullExpressionValue(cVarA, "build(...)");
        return cVarA;
    }

    @NotNull
    public final List<f0.f.d.a.c> f(@NotNull Context context) {
        List<ActivityManager.RunningAppProcessInfo> listEmptyList;
        Intrinsics.checkNotNullParameter(context, "context");
        int i10 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (listEmptyList = activityManager.getRunningAppProcesses()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List listFilterNotNull = CollectionsKt.filterNotNull(listEmptyList);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : listFilterNotNull) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i10) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            arrayList2.add(f0.f.d.a.c.a().e(runningAppProcessInfo.processName).d(runningAppProcessInfo.pid).c(runningAppProcessInfo.importance).b(Intrinsics.areEqual(runningAppProcessInfo.processName, str)).a());
        }
        return arrayList2;
    }

    @NotNull
    public final f0.f.d.a.c g(@NotNull Context context) {
        Object next;
        Intrinsics.checkNotNullParameter(context, "context");
        int iMyPid = Process.myPid();
        Iterator<T> it = f(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((f0.f.d.a.c) next).c() != iMyPid);
        f0.f.d.a.c cVar = (f0.f.d.a.c) next;
        return cVar == null ? e(this, h(), iMyPid, 0, false, 12, null) : cVar;
    }
}
