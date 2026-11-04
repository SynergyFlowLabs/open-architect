package androidx.work.impl.utils;

import android.content.Context;
import android.os.PowerManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nWakeLocks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WakeLocks.kt\nandroidx/work/impl/utils/WakeLocks\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,73:1\n215#2,2:74\n*S KotlinDebug\n*F\n+ 1 WakeLocks.kt\nandroidx/work/impl/utils/WakeLocks\n*L\n65#1:74,2\n*E\n"})
@oj.i(name = "WakeLocks")
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f77174a;

    static {
        String strI = androidx.work.v.i("WakeLocks");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(\"WakeLocks\")");
        f77174a = strI;
    }

    public static final void a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d0 d0Var = d0.f77178a;
        synchronized (d0Var) {
            linkedHashMap.putAll(d0Var.a());
            Unit unit = Unit.f312394a;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                androidx.work.v.e().l(f77174a, "WakeLock held for " + str);
            }
        }
    }

    @NotNull
    public static final PowerManager.WakeLock b(@NotNull Context context, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String str = "WorkManager: " + tag;
        PowerManager.WakeLock wakeLock = ((PowerManager) systemService).newWakeLock(1, str);
        d0 d0Var = d0.f77178a;
        synchronized (d0Var) {
            try {
                d0Var.a().put(wakeLock, str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Intrinsics.checkNotNullExpressionValue(wakeLock, "wakeLock");
        return wakeLock;
    }
}
