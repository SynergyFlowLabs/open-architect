package io.intercom.android.sdk.m5.conversation.ui.components.row;

import android.content.Context;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.g5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.utilities.Phrase;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nClickableMessageRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClickableMessageRow.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/ClickableMessageRowKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,92:1\n1282#2,6:93\n1282#2,6:100\n1282#2,6:106\n75#3:99\n75#3:149\n87#4:112\n84#4,9:113\n94#4:153\n80#5,6:122\n87#5,3:137\n90#5,2:146\n94#5:152\n391#6,9:128\n400#6:148\n401#6,2:150\n4360#7,6:140\n85#8:154\n117#8,2:155\n*S KotlinDebug\n*F\n+ 1 ClickableMessageRow.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/ClickableMessageRowKt\n*L\n43#1:93,6\n48#1:100,6\n53#1:106,6\n45#1:99\n73#1:149\n50#1:112\n50#1:113,9\n50#1:153\n50#1:122,6\n50#1:137,3\n50#1:146,2\n50#1:152\n50#1:128,9\n50#1:148\n50#1:150,2\n50#1:140,6\n43#1:154\n43#1:155,2\n*E\n"})
public final class ClickableMessageRowKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ClickableMessageRow(@NotNull final Part conversationPart, @Nullable androidx.compose.ui.a0 a0Var, @Nullable final BottomMetadata bottomMetadata, @Nullable androidx.compose.ui.e.b bVar, @Nullable g5 g5Var, @Nullable Function0<Unit> function0, @NotNull final pj.p<? super androidx.compose.foundation.layout.m0, ? super Part, ? super Function0<Unit>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> content, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Function0<Unit> function1;
        String attribution;
        Intrinsics.checkNotNullParameter(conversationPart, "conversationPart");
        Intrinsics.checkNotNullParameter(content, "content");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-932954058);
        androidx.compose.ui.a0 a0Var2 = (i11 & 2) != 0 ? androidx.compose.ui.a0.E : a0Var;
        androidx.compose.ui.e.b bVarU = (i11 & 8) != 0 ? androidx.compose.ui.e.f37317a.u() : bVar;
        g5 g5VarH = (i11 & 16) != 0 ? d5.h(0.0f, 0.0f, 3, null) : g5Var;
        Function0<Unit> function2 = (i11 & 32) != 0 ? null : function0;
        c0VarR.E(1099059020);
        Object objI0 = c0VarR.i0();
        androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
        if (objI0 == aVar.a()) {
            objI0 = d7.g(Boolean.FALSE, null, 2, null);
            c0VarR.Y(objI0);
        }
        final n3 n3Var = (n3) objI0;
        c0VarR.A();
        final androidx.compose.ui.platform.o1 o1Var = (androidx.compose.ui.platform.o1) c0VarR.W(androidx.compose.ui.platform.q1.j());
        Function0 function3 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClickableMessageRowKt.ClickableMessageRow$lambda$3(o1Var, conversationPart);
            }
        };
        c0VarR.E(1099065861);
        if (function2 == null) {
            c0VarR.E(1099066636);
            Object objI1 = c0VarR.i0();
            if (objI1 == aVar.a()) {
                objI1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.s
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ClickableMessageRowKt.ClickableMessageRow$lambda$5$lambda$4(n3Var);
                    }
                };
                c0VarR.Y(objI1);
            }
            function1 = (Function0) objI1;
            c0VarR.A();
        } else {
            function1 = function2;
        }
        c0VarR.A();
        androidx.compose.ui.a0 a0VarH = i6.h(a0Var2, 0.0f, 1, null);
        Unit unit = Unit.f312394a;
        c0VarR.E(1099071132);
        boolean zD = c0VarR.D(function3) | c0VarR.D(function1);
        Object objI2 = c0VarR.i0();
        if (zD || objI2 == aVar.a()) {
            objI2 = new ClickableMessageRowKt$ClickableMessageRow$1$1(function3, function1);
            c0VarR.Y(objI2);
        }
        c0VarR.A();
        androidx.compose.ui.a0 a0VarP = d5.p(androidx.compose.ui.input.pointer.w0.e(a0VarH, unit, (PointerInputEventHandler) objI2), g5VarH);
        androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), bVarU, c0VarR, (((i10 >> 3) & 896) >> 3) & com.planner5d.library.engine.input.f.b.B);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        androidx.compose.runtime.b1 b1VarK = c0VarR.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarP);
        androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
        Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
        if (c0VarR.S() == null) {
            androidx.compose.runtime.v.r();
        }
        c0VarR.q();
        if (c0VarR.P()) {
            c0VarR.q0(function0A);
        } else {
            c0VarR.l();
        }
        androidx.compose.runtime.c0 c0VarD = y7.d(c0VarR);
        y7.n(c0VarD, a1VarB, aVar2.e());
        y7.n(c0VarD, b1VarK, aVar2.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar2.f());
        content.invoke(androidx.compose.foundation.layout.n0.f16227a, conversationPart, function1, c0VarR, Integer.valueOf(((i10 >> 9) & 7168) | 70));
        c0VarR.E(-1990945499);
        if ((bottomMetadata != null && ClickableMessageRow$lambda$1(n3Var)) || (bottomMetadata != null && bottomMetadata.getAlwaysShow())) {
            l6.a(i6.i(androidx.compose.ui.a0.E, bottomMetadata.m274getPaddingD9Ej5fM()), c0VarR, 0);
            String text = bottomMetadata.getText();
            c0VarR.E(-1990935821);
            String string = "";
            if (BubbleMessageRowKt.shouldShowAttribution(conversationPart)) {
                Phrase phraseFrom = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_gif_attribution);
                List<Block> blocks = conversationPart.getBlocks();
                Intrinsics.checkNotNullExpressionValue(blocks, "getBlocks(...)");
                Block block = (Block) CollectionsKt.firstOrNull((List) blocks);
                if (block != null && (attribution = block.getAttribution()) != null) {
                    string = attribution;
                }
                string = phraseFrom.put("providername", string).format().toString();
            }
            c0VarR.A();
            BubbleMessageRowKt.MessageMeta(null, text, string, true, c0VarR, 3072, 1);
            c0VarR = c0VarR;
        }
        c0VarR.A();
        c0VarR.o();
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final androidx.compose.ui.a0 a0Var3 = a0Var2;
            final androidx.compose.ui.e.b bVar2 = bVarU;
            final g5 g5Var2 = g5VarH;
            final Function0<Unit> function4 = function2;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.t
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ClickableMessageRowKt.ClickableMessageRow$lambda$8(conversationPart, a0Var3, bottomMetadata, bVar2, g5Var2, function4, content, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean ClickableMessageRow$lambda$1(n3<Boolean> n3Var) {
        return n3Var.getValue().booleanValue();
    }

    private static final void ClickableMessageRow$lambda$2(n3<Boolean> n3Var, boolean z10) {
        n3Var.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClickableMessageRow$lambda$3(androidx.compose.ui.platform.o1 clipboardManager, Part conversationPart) {
        Intrinsics.checkNotNullParameter(clipboardManager, "$clipboardManager");
        Intrinsics.checkNotNullParameter(conversationPart, "$conversationPart");
        clipboardManager.V3(BubbleMessageRowKt.getCopyText(conversationPart));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClickableMessageRow$lambda$5$lambda$4(n3 showTimestamp$delegate) {
        Intrinsics.checkNotNullParameter(showTimestamp$delegate, "$showTimestamp$delegate");
        ClickableMessageRow$lambda$2(showTimestamp$delegate, !ClickableMessageRow$lambda$1(showTimestamp$delegate));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClickableMessageRow$lambda$8(Part conversationPart, androidx.compose.ui.a0 a0Var, BottomMetadata bottomMetadata, androidx.compose.ui.e.b bVar, g5 g5Var, Function0 function0, pj.p content, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(conversationPart, "$conversationPart");
        Intrinsics.checkNotNullParameter(content, "$content");
        ClickableMessageRow(conversationPart, a0Var, bottomMetadata, bVar, g5Var, function0, content, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
