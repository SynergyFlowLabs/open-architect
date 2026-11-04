package com.planner5d.library.activity.helper;

import android.content.Intent;
import androidx.appcompat.app.d;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 2)
@SourceDebugExtension({"SMAP\nBaseContentPendingDataApplier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseContentPendingDataApplier.kt\ncom/planner5d/library/activity/helper/BaseContentPendingDataApplier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
public class b<T extends androidx.appcompat.app.d> implements com.planner5d.library.model.manager.initialization.q<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f136687a = 0;

    @ij.a
    public b() {
    }

    @Override // com.planner5d.library.model.manager.initialization.q
    public void a(@NotNull T activity, @NotNull com.planner5d.library.model.manager.initialization.p.a pendingData, @NotNull com.planner5d.library.model.manager.initialization.a<T> content) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(pendingData, "pendingData");
        Intrinsics.checkNotNullParameter(content, "content");
        content.i(activity, pendingData.p());
        if (activity instanceof com.planner5d.library.model.manager.initialization.b) {
            ((com.planner5d.library.model.manager.initialization.b) activity).a();
        }
        if (pendingData.k()) {
            content.m();
        }
        if (pendingData.j()) {
            content.l();
        }
        Intent intentM = pendingData.m();
        if (intentM != null) {
            content.c(intentM);
        }
        List<Object> listO = pendingData.o();
        if (listO != null) {
            Object obj = listO.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj).intValue();
            Object obj2 = listO.get(1);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue2 = ((Integer) obj2).intValue();
            Object obj3 = listO.get(2);
            content.e(iIntValue, iIntValue2, obj3 instanceof Intent ? (Intent) obj3 : null);
        }
    }
}
