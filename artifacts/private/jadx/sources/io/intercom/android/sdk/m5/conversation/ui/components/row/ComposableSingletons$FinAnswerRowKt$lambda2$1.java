package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.runtime.y7;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.avatar.AvatarShape;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Metadata;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Source;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$FinAnswerRowKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nFinAnswerRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinAnswerRow.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/ComposableSingletons$FinAnswerRowKt$lambda-2$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,249:1\n87#2:250\n84#2,9:251\n94#2:292\n80#3,6:260\n87#3,3:275\n90#3,2:284\n94#3:291\n391#4,9:266\n400#4:286\n401#4,2:289\n4360#5,6:278\n113#6:287\n113#6:288\n*S KotlinDebug\n*F\n+ 1 FinAnswerRow.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/ComposableSingletons$FinAnswerRowKt$lambda-2$1\n*L\n208#1:250\n208#1:251,9\n208#1:292\n208#1:260,6\n208#1:275,3\n208#1:284,2\n208#1:291\n208#1:266,9\n208#1:286\n208#1:289,2\n208#1:278,6\n213#1:287\n245#1:288\n*E\n"})
final class ComposableSingletons$FinAnswerRowKt$lambda2$1 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
    public static final ComposableSingletons$FinAnswerRowKt$lambda2$1 INSTANCE = new ComposableSingletons$FinAnswerRowKt$lambda2$1();

    ComposableSingletons$FinAnswerRowKt$lambda2$1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
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
        androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
        androidx.compose.ui.a0 a0VarD = androidx.compose.foundation.v.d(i6.h(aVar, 0.0f, 1, null), IntercomTheme.INSTANCE.getColors(c0Var, IntercomTheme.$stable).m690getBackground0d7_KjU(), null, 2, null);
        androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var, 0);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
        androidx.compose.runtime.b1 b1VarK = c0Var.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarD);
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
        float f10 = 16;
        l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(f10)), c0Var, 6);
        Part partBuild = new Part.Builder().withParticipantIsAdmin(true).withBlocks(CollectionsKt.listOf((Object[]) new Block.Builder[]{BubbleMessageRowKt.getAnswerBlock(), BubbleMessageRowKt.getLongParagraphBlock()})).withMetadata(new Metadata("Bot", "AI Agent", Long.valueOf(System.currentTimeMillis()), CollectionsKt.listOf(new Avatar.Builder().withInitials("BB").withShape(AvatarShape.SQUIRCLE)))).withSources(CollectionsKt.listOf((Object[]) new Source[]{new Source("1", "other", "Changing the date of your stay using our mobile app", "http://external.source.com"), new Source("2", "article", "Cancel your booking", "http://intercom.com")})).build();
        Intrinsics.checkNotNullExpressionValue(partBuild, "build(...)");
        FinAnswerRowKt.FinAnswerRow(partBuild, GroupingPosition.STANDALONE, null, null, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComposableSingletons$FinAnswerRowKt$lambda2$1.invoke$lambda$1$lambda$0((List) obj);
            }
        }, false, null, c0Var, 24632, 108);
        l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(f10)), c0Var, 6);
        c0Var.o();
    }
}
