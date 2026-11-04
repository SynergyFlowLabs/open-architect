package com.planner5d.library.activity.fragment.dialog.purchase;

import android.os.Bundle;
import com.planner5d.library.model.manager.statistics.events.y3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public interface t {

    @SourceDebugExtension({"SMAP\nPurchaseDialogFactoryService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchaseDialogFactoryService.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/PurchaseDialogFactoryService$DefaultImpls\n*L\n1#1,32:1\n29#1:33\n28#1,2:34\n*S KotlinDebug\n*F\n+ 1 PurchaseDialogFactoryService.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/PurchaseDialogFactoryService$DefaultImpls\n*L\n19#1:33\n25#1:34,2\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.dialog.purchase.t$a$a, reason: collision with other inner class name */
        public static final class C1460a implements Function1<Boolean, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1460a f132799a = new C1460a();

            public final void c(boolean z10) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                c(bool.booleanValue());
                return Unit.f312394a;
            }
        }

        private static Void a(t tVar) {
            return null;
        }

        private static Function1<Boolean, Unit> b(t tVar) {
            return C1460a.f132799a;
        }

        public static void c(@NotNull t tVar, @NotNull com.planner5d.library.activity.fragment.dialog.l presenter, @NotNull com.planner5d.library.model.manager.config.purchaseplacement.b.a placementName, @Nullable y3.c cVar) {
            Intrinsics.checkNotNullParameter(presenter, "presenter");
            Intrinsics.checkNotNullParameter(placementName, "placementName");
            tVar.b(presenter, placementName, cVar, null, C1460a.f132799a);
        }

        public static void d(@NotNull t tVar, @NotNull com.planner5d.library.activity.fragment.dialog.l presenter, @NotNull com.planner5d.library.model.manager.config.purchaseplacement.b.a placementName, @Nullable y3.c cVar, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(presenter, "presenter");
            Intrinsics.checkNotNullParameter(placementName, "placementName");
            tVar.b(presenter, placementName, cVar, bundle, C1460a.f132799a);
        }
    }

    void a(@NotNull com.planner5d.library.activity.fragment.dialog.l lVar, @NotNull com.planner5d.library.model.manager.config.purchaseplacement.b.a aVar, @Nullable y3.c cVar);

    void b(@NotNull com.planner5d.library.activity.fragment.dialog.l lVar, @NotNull com.planner5d.library.model.manager.config.purchaseplacement.b.a aVar, @Nullable y3.c cVar, @Nullable Bundle bundle, @NotNull Function1<? super Boolean, Unit> function1);

    void c(@NotNull com.planner5d.library.activity.fragment.dialog.l lVar, @NotNull com.planner5d.library.model.manager.config.purchaseplacement.b.a aVar, @Nullable y3.c cVar, @Nullable Bundle bundle);
}
