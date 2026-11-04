package io.intercom.android.sdk.m5.navigation;

import android.content.Intent;
import androidx.compose.foundation.layout.i6;
import androidx.compose.material3.u10;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.navigation.q3;
import io.intercom.android.sdk.logger.LumberMill;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nIntercomRootNavHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntercomRootNavHost.kt\nio/intercom/android/sdk/m5/navigation/IntercomRootNavHostKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,73:1\n607#2:74\n604#2,6:75\n1282#3,3:81\n1285#3,3:85\n605#4:84\n*S KotlinDebug\n*F\n+ 1 IntercomRootNavHost.kt\nio/intercom/android/sdk/m5/navigation/IntercomRootNavHostKt\n*L\n27#1:74\n27#1:75,6\n27#1:81,3\n27#1:85,3\n27#1:84\n*E\n"})
public final class IntercomRootNavHostKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.IntercomRootNavHostKt$IntercomRootNavHost$2, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nIntercomRootNavHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntercomRootNavHost.kt\nio/intercom/android/sdk/m5/navigation/IntercomRootNavHostKt$IntercomRootNavHost$2\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,73:1\n70#2:74\n67#2,9:75\n77#2:114\n80#3,6:84\n87#3,3:99\n90#3,2:108\n94#3:113\n391#4,9:90\n400#4,3:110\n4360#5,6:102\n*S KotlinDebug\n*F\n+ 1 IntercomRootNavHost.kt\nio/intercom/android/sdk/m5/navigation/IntercomRootNavHostKt$IntercomRootNavHost$2\n*L\n31#1:74\n31#1:75,9\n31#1:114\n31#1:84,6\n31#1:99,3\n31#1:108,2\n31#1:113\n31#1:90,9\n31#1:110,3\n31#1:102,6\n*E\n"})
    static final class AnonymousClass2 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
        final /* synthetic */ IntercomRootActivityArgs $intercomRootActivityArgs;
        final /* synthetic */ androidx.navigation.r2 $navController;
        final /* synthetic */ androidx.activity.l $rootActivity;
        final /* synthetic */ kotlinx.coroutines.s0 $scope;

        AnonymousClass2(androidx.navigation.r2 r2Var, IntercomRootActivityArgs intercomRootActivityArgs, androidx.activity.l lVar, kotlinx.coroutines.s0 s0Var) {
            this.$navController = r2Var;
            this.$intercomRootActivityArgs = intercomRootActivityArgs;
            this.$rootActivity = lVar;
            this.$scope = s0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(androidx.navigation.r2 navController, androidx.activity.l rootActivity, kotlinx.coroutines.s0 scope, IntercomRootActivityArgs intercomRootActivityArgs, androidx.navigation.g2 NavHost) {
            Intrinsics.checkNotNullParameter(navController, "$navController");
            Intrinsics.checkNotNullParameter(rootActivity, "$rootActivity");
            Intrinsics.checkNotNullParameter(scope, "$scope");
            Intrinsics.checkNotNullParameter(intercomRootActivityArgs, "$intercomRootActivityArgs");
            Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
            HomeScreenDestinationKt.homeScreen(NavHost, navController, rootActivity, scope);
            MessagesDestinationKt.messagesDestination(NavHost, navController, rootActivity);
            HelpCenterDestinationKt.helpCenterDestination(NavHost, rootActivity, navController, intercomRootActivityArgs);
            TicketDetailDestinationKt.ticketDetailDestination(NavHost, navController, rootActivity);
            ConversationDestinationKt.conversationDestination(NavHost, navController, rootActivity);
            TicketsDestinationKt.ticketsDestination(NavHost, navController, rootActivity);
            CreateTicketDestinationKt.createTicketDestination(NavHost, navController, rootActivity);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke(c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(androidx.compose.runtime.c0 c0Var, int i10) {
            if ((i10 & 11) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            androidx.compose.ui.a0 a0VarF = i6.f(androidx.compose.ui.a0.E, 0.0f, 1, null);
            final androidx.navigation.r2 r2Var = this.$navController;
            final IntercomRootActivityArgs intercomRootActivityArgs = this.$intercomRootActivityArgs;
            final androidx.activity.l lVar = this.$rootActivity;
            final kotlinx.coroutines.s0 s0Var = this.$scope;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarF);
            androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar.a();
            if (c0Var.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A);
            } else {
                c0Var.l();
            }
            androidx.compose.runtime.c0 c0VarD = y7.d(c0Var);
            y7.n(c0VarD, a1VarK, aVar.e());
            y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            androidx.navigation.compose.e1.J(r2Var, intercomRootActivityArgs.getRoute(), null, null, null, null, null, null, null, null, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.g1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return IntercomRootNavHostKt.AnonymousClass2.invoke$lambda$1$lambda$0(r2Var, lVar, s0Var, intercomRootActivityArgs, (androidx.navigation.g2) obj);
                }
            }, c0Var, 8, 0, 1020);
            c0Var.o();
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void IntercomRootNavHost(@NotNull final Intent intent, @NotNull final androidx.activity.l rootActivity, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(rootActivity, "rootActivity");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(884340874);
        IntercomRootActivityArgs argsForIntent = IntercomRootActivityArgsKt.getArgsForIntent(intent);
        if (argsForIntent instanceof IntercomRootActivityArgs.NoContent) {
            rootActivity.finish();
            LumberMill.getLogger().e("No content to display. Closing the activity.", new Object[0]);
            s5 s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.navigation.e1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IntercomRootNavHostKt.IntercomRootNavHost$lambda$0(intent, rootActivity, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        androidx.navigation.r2 r2VarB = androidx.navigation.compose.u.b(new q3[0], c0VarR, 8);
        Object objI0 = c0VarR.i0();
        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
            c0VarR.Y(objI0);
        }
        u10.c(null, null, 0L, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(1903672037, true, new AnonymousClass2(r2VarB, argsForIntent, rootActivity, (kotlinx.coroutines.s0) objI0), c0VarR, 54), c0VarR, 12582912, 127);
        s5 s5VarT2 = c0VarR.T();
        if (s5VarT2 != null) {
            s5VarT2.a(new Function2() { // from class: io.intercom.android.sdk.m5.navigation.f1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IntercomRootNavHostKt.IntercomRootNavHost$lambda$1(intent, rootActivity, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IntercomRootNavHost$lambda$0(Intent intent, androidx.activity.l rootActivity, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(intent, "$intent");
        Intrinsics.checkNotNullParameter(rootActivity, "$rootActivity");
        IntercomRootNavHost(intent, rootActivity, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IntercomRootNavHost$lambda$1(Intent intent, androidx.activity.l rootActivity, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(intent, "$intent");
        Intrinsics.checkNotNullParameter(rootActivity, "$rootActivity");
        IntercomRootNavHost(intent, rootActivity, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
