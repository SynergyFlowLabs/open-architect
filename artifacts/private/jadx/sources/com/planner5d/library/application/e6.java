package com.planner5d.library.application;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nWidgetsComponentExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WidgetsComponentExtensions.kt\ncom/planner5d/library/application/WidgetsComponentExtensions\n+ 2 ContractUtils.kt\ncom/planner5d/library/services/utility/ContractUtils\n*L\n1#1,14:1\n18#2,6:15\n*S KotlinDebug\n*F\n+ 1 WidgetsComponentExtensions.kt\ncom/planner5d/library/application/WidgetsComponentExtensions\n*L\n11#1:15,6\n*E\n"})
public final class e6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e6 f142532a = new e6();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f142533b = 0;

    private e6() {
    }

    @oj.n
    @NotNull
    public static final d6 a(@NotNull View view) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(view, "<this>");
        com.planner5d.library.services.utility.p pVar = com.planner5d.library.services.utility.p.f229694a;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Object applicationContext = context.getApplicationContext();
        if (!(applicationContext instanceof d6.a)) {
            applicationContext = null;
        }
        d6.a aVar = (d6.a) applicationContext;
        if (aVar != null) {
            return aVar.b();
        }
        throw new IllegalStateException("The " + kotlin.jvm.internal.j1.d(d6.a.class).Q() + " implementation is not available");
    }
}
