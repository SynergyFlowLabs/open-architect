package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.runtime.y7;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.errors.VoiceTranscriptionError;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.states.VoiceTranscriptionState;
import io.intercom.android.sdk.ui.common.StringProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$MessageComposerKt$lambda-6$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nMessageComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageComposer.kt\nio/intercom/android/sdk/m5/conversation/ui/components/composer/ComposableSingletons$MessageComposerKt$lambda-6$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,516:1\n113#2:517\n87#3:518\n83#3,10:519\n94#3:565\n80#4,6:529\n87#4,3:544\n90#4,2:553\n94#4:564\n391#5,9:535\n400#5:555\n401#5,2:562\n4360#6,6:547\n1282#7,6:556\n*S KotlinDebug\n*F\n+ 1 MessageComposer.kt\nio/intercom/android/sdk/m5/conversation/ui/components/composer/ComposableSingletons$MessageComposerKt$lambda-6$1\n*L\n485#1:517\n484#1:518\n484#1:519,10\n484#1:565\n484#1:529,6\n484#1:544,3\n484#1:553,2\n484#1:564\n484#1:535,9\n484#1:555\n484#1:562,2\n484#1:547,6\n487#1:556,6\n*E\n"})
final class ComposableSingletons$MessageComposerKt$lambda6$1 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
    public static final ComposableSingletons$MessageComposerKt$lambda6$1 INSTANCE = new ComposableSingletons$MessageComposerKt$lambda6$1();

    ComposableSingletons$MessageComposerKt$lambda6$1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$1(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$2(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(String it) {
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
        androidx.compose.foundation.layout.q.f fVarG = androidx.compose.foundation.layout.q.f16330a.G(androidx.compose.ui.unit.h.r(8));
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
        c0Var.E(-1782289977);
        Object objI0 = c0Var.i0();
        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = kotlinx.coroutines.flow.b1.a(Float.valueOf(0.5f));
            c0Var.Y(objI0);
        }
        c0Var.A();
        MessageComposerKt.MessageComposer(null, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComposableSingletons$MessageComposerKt$lambda6$1.invoke$lambda$4$lambda$1((String) obj);
            }
        }, new ComposerState.TextInput("", new StringProvider.StringRes(R.string.intercom_send_us_a_message, null, 2, null), false, null, null, 28, null), null, null, null, null, null, null, VoiceTranscriptionState.Recording.INSTANCE, (kotlinx.coroutines.flow.k0) objI0, null, null, null, c0Var, 805306928, 8, 14841);
        MessageComposerKt.MessageComposer(null, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComposableSingletons$MessageComposerKt$lambda6$1.invoke$lambda$4$lambda$2((String) obj);
            }
        }, new ComposerState.TextInput("", new StringProvider.StringRes(R.string.intercom_send_us_a_message, null, 2, null), false, null, null, 28, null), null, null, null, null, null, null, VoiceTranscriptionState.Processing.INSTANCE, null, null, null, null, c0Var, 805306928, 0, 15865);
        MessageComposerKt.MessageComposer(null, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComposableSingletons$MessageComposerKt$lambda6$1.invoke$lambda$4$lambda$3((String) obj);
            }
        }, new ComposerState.TextInput("", new StringProvider.StringRes(R.string.intercom_send_us_a_message, null, 2, null), false, null, null, 28, null), null, null, null, null, null, null, new VoiceTranscriptionState.Error(new VoiceTranscriptionError.TranscriptionFailed(null, 1, null)), null, null, null, null, c0Var, 1073742384, 0, 15865);
        c0Var.o();
    }
}
