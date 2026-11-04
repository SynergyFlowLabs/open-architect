package com.planner5d.library.activity.helper;

import com.planner5d.library.activity.Main;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class f2 extends b<Main> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f136853b = 0;

    @ij.a
    public f2() {
    }

    @Override // com.planner5d.library.activity.helper.b, com.planner5d.library.model.manager.initialization.q
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull Main activity, @NotNull com.planner5d.library.model.manager.initialization.p.a pendingData, @NotNull com.planner5d.library.model.manager.initialization.a<Main> content) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(pendingData, "pendingData");
        Intrinsics.checkNotNullParameter(content, "content");
        super.a(activity, pendingData, content);
        List<Object> listN = pendingData.n();
        if (listN != null) {
            Object obj = listN.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj).intValue();
            Object obj2 = listN.get(1);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            Object obj3 = listN.get(2);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.IntArray");
            content.onRequestPermissionsResult(iIntValue, (String[]) obj2, (int[]) obj3);
        }
        if (pendingData.l()) {
            content.k();
        }
    }
}
