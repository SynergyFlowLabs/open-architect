package androidx.room;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCoroutinesRoom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutinesRoom.kt\nandroidx/room/CoroutinesRoomKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,162:1\n361#2,7:163\n361#2,7:170\n*S KotlinDebug\n*F\n+ 1 CoroutinesRoom.kt\nandroidx/room/CoroutinesRoomKt\n*L\n149#1:163,7\n159#1:170,7\n*E\n"})
public final class k {
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @NotNull
    public static final kotlinx.coroutines.n0 a(@NotNull b2 b2Var) {
        Map<String, Object> backingFieldMap = b2Var.getBackingFieldMap();
        Object objC = backingFieldMap.get("QueryDispatcher");
        if (objC == null) {
            objC = kotlinx.coroutines.b2.c(b2Var.getQueryExecutor());
            backingFieldMap.put("QueryDispatcher", objC);
        }
        Intrinsics.checkNotNull(objC, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (kotlinx.coroutines.n0) objC;
    }

    @NotNull
    public static final kotlinx.coroutines.n0 b(@NotNull b2 b2Var) {
        Map<String, Object> backingFieldMap = b2Var.getBackingFieldMap();
        Object objC = backingFieldMap.get("TransactionDispatcher");
        if (objC == null) {
            objC = kotlinx.coroutines.b2.c(b2Var.getTransactionExecutor());
            backingFieldMap.put("TransactionDispatcher", objC);
        }
        Intrinsics.checkNotNull(objC, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (kotlinx.coroutines.n0) objC;
    }
}
