package com.planner5d.library.application;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@fg.k
public interface t5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f148278a = a.f148279a;

    @SourceDebugExtension({"SMAP\nUtilsComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UtilsComponent.kt\ncom/planner5d/library/application/UtilsComponent$Companion\n+ 2 ContractUtils.kt\ncom/planner5d/library/services/utility/ContractUtils\n*L\n1#1,27:1\n18#2,6:28\n*S KotlinDebug\n*F\n+ 1 UtilsComponent.kt\ncom/planner5d/library/application/UtilsComponent$Companion\n*L\n22#1:28,6\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f148279a = new a();

        private a() {
        }

        @NotNull
        public final t5 a(@NotNull View view) throws IllegalStateException {
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
                return bVar.c();
            }
            throw new IllegalStateException("The " + kotlin.jvm.internal.j1.d(b.class).Q() + " implementation is not available");
        }
    }

    public interface b {
        @NotNull
        t5 c();
    }

    @NotNull
    com.planner5d.library.model.manager.u1 d();
}
