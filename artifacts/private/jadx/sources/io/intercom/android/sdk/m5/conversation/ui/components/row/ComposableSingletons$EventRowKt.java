package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.material3.u10;
import androidx.compose.runtime.y7;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.EventLabelSegment;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Weight;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$EventRowKt {

    @NotNull
    public static final ComposableSingletons$EventRowKt INSTANCE = new ComposableSingletons$EventRowKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f145lambda1 = androidx.compose.runtime.internal.w.c(340730863, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$EventRowKt$lambda-1$1
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
            androidx.compose.foundation.layout.q.f fVarG = androidx.compose.foundation.layout.q.f16330a.G(androidx.compose.ui.unit.h.r(16));
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(fVarG, androidx.compose.ui.e.f37317a.u(), c0Var, 6);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, aVar);
            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
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
            y7.n(c0VarD, a1VarB, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
            List listListOf = CollectionsKt.listOf(new EventLabelSegment("Participant added to conversation", null, 2, null));
            Avatar avatarBuild = new Avatar.Builder().withInitials("AA").build();
            Intrinsics.checkNotNullExpressionValue(avatarBuild, "build(...)");
            EventRowKt.EventRow(null, listListOf, new AvatarWrapper(avatarBuild, false, 2, null), c0Var, 512, 1);
            List listListOf2 = CollectionsKt.listOf((Object[]) new EventLabelSegment[]{new EventLabelSegment("John Doe", Weight.BOLD), new EventLabelSegment(" joined the conversation and ", null, 2, null), new EventLabelSegment("started typing", Weight.MEDIUM), new EventLabelSegment(" a very long message that should wrap to multiple lines", null, 2, null)});
            Avatar avatarBuild2 = new Avatar.Builder().withInitials("JD").build();
            Intrinsics.checkNotNullExpressionValue(avatarBuild2, "build(...)");
            EventRowKt.EventRow(null, listListOf2, new AvatarWrapper(avatarBuild2, false, 2, null), c0Var, 512, 1);
            List listListOf3 = CollectionsKt.listOf(new EventLabelSegment("This is a very long event message that should definitely wrap to multiple lines to test the FlowRow implementation and ensure it maintains proper center alignment", null, 2, null));
            Avatar avatarBuild3 = new Avatar.Builder().withInitials("TL").build();
            Intrinsics.checkNotNullExpressionValue(avatarBuild3, "build(...)");
            EventRowKt.EventRow(null, listListOf3, new AvatarWrapper(avatarBuild3, false, 2, null), c0Var, 512, 1);
            c0Var.o();
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f146lambda2 = androidx.compose.runtime.internal.w.c(-1878882646, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$EventRowKt$lambda-2$1
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
            } else {
                u10.c(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$EventRowKt.INSTANCE.m283getLambda1$intercom_sdk_base_release(), c0Var, 12582912, 127);
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m283getLambda1$intercom_sdk_base_release() {
        return f145lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m284getLambda2$intercom_sdk_base_release() {
        return f146lambda2;
    }
}
