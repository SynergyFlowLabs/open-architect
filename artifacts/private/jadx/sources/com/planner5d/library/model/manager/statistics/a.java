package com.planner5d.library.model.manager.statistics;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C1619a f198140a = C1619a.f198141a;

    /* JADX INFO: renamed from: com.planner5d.library.model.manager.statistics.a$a, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nAnalyticsComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsComponent.kt\ncom/planner5d/library/model/manager/statistics/AnalyticsComponent$Companion\n+ 2 ContractUtils.kt\ncom/planner5d/library/services/utility/ContractUtils\n*L\n1#1,24:1\n18#2,6:25\n*S KotlinDebug\n*F\n+ 1 AnalyticsComponent.kt\ncom/planner5d/library/model/manager/statistics/AnalyticsComponent$Companion\n*L\n20#1:25,6\n*E\n"})
    public static final class C1619a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C1619a f198141a = new C1619a();

        private C1619a() {
        }

        @NotNull
        public final a a(@NotNull View view) throws IllegalStateException {
            Intrinsics.checkNotNullParameter(view, "<this>");
            com.planner5d.library.services.utility.p pVar = com.planner5d.library.services.utility.p.f229694a;
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Object applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof b)) {
                applicationContext = null;
            }
            b bVar = (b) applicationContext;
            if (bVar != null) {
                return bVar.f();
            }
            throw new IllegalStateException("The " + j1.d(b.class).Q() + " implementation is not available");
        }
    }

    public interface b {
        @NotNull
        a f();
    }

    @NotNull
    d0 a();
}
