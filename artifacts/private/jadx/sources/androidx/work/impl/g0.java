package androidx.work.impl;

import android.content.Context;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nWorkDatabasePathHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkDatabasePathHelper.kt\nandroidx/work/impl/WorkDatabasePathHelper\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,126:1\n215#2,2:127\n8676#3,2:129\n9358#3,4:131\n*S KotlinDebug\n*F\n+ 1 WorkDatabasePathHelper.kt\nandroidx/work/impl/WorkDatabasePathHelper\n*L\n51#1:127,2\n78#1:129,2\n78#1:131,4\n*E\n"})
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g0 f76872a = new g0();

    private g0() {
    }

    @androidx.annotation.w0(23)
    private final File c(Context context) {
        return new File(a.f76576a.a(context), h0.f76875b);
    }

    @oj.n
    public static final void d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        g0 g0Var = f76872a;
        if (g0Var.b(context).exists()) {
            androidx.work.v.e().a(h0.f76874a, "Migrating WorkDatabase to the no-backup directory");
            for (Map.Entry<File, File> entry : g0Var.e(context).entrySet()) {
                File key = entry.getKey();
                File value = entry.getValue();
                if (key.exists()) {
                    if (value.exists()) {
                        androidx.work.v.e().l(h0.f76874a, "Over-writing contents of " + value);
                    }
                    androidx.work.v.e().a(h0.f76874a, key.renameTo(value) ? "Migrated " + key + "to " + value : "Renaming " + key + " to " + value + " failed");
                }
            }
        }
    }

    @NotNull
    public final File a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return c(context);
    }

    @NotNull
    public final File b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File databasePath = context.getDatabasePath(h0.f76875b);
        Intrinsics.checkNotNullExpressionValue(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        return databasePath;
    }

    @NotNull
    public final Map<File, File> e(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File fileB = b(context);
        File fileA = a(context);
        String[] strArr = h0.f76876c;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.r.u(MapsKt.mapCapacity(strArr.length), 16));
        for (String str : strArr) {
            Pair pair = TuplesKt.to(new File(fileB.getPath() + str), new File(fileA.getPath() + str));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return MapsKt.plus(linkedHashMap, TuplesKt.to(fileB, fileA));
    }
}
