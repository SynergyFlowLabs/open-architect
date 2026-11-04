package androidx.compose.foundation.contextmenu;

import androidx.compose.runtime.internal.w0;
import com.rabbitmq.client.k0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nContextMenuPopupPositionProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenuPopupPositionProvider.kt\nandroidx/compose/foundation/contextmenu/ContextMenuPopupPositionProvider\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,159:1\n54#2:160\n54#2:162\n59#2:164\n59#2:166\n85#3:161\n85#3:163\n90#3:165\n90#3:167\n80#3:169\n32#4:168\n*S KotlinDebug\n*F\n+ 1 ContextMenuPopupPositionProvider.kt\nandroidx/compose/foundation/contextmenu/ContextMenuPopupPositionProvider\n*L\n80#1:160\n81#1:162\n87#1:164\n88#1:166\n80#1:161\n81#1:163\n87#1:165\n88#1:167\n76#1:169\n76#1:168\n*E\n"})
public final class m implements androidx.compose.ui.window.s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f14052c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function0<androidx.compose.ui.unit.q> f14053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Function2<androidx.compose.ui.unit.q, androidx.compose.ui.unit.s, Unit> f14054b;

    public /* synthetic */ m(long j10, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, (Function2<? super androidx.compose.ui.unit.q, ? super androidx.compose.ui.unit.s, Unit>) function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.unit.q c(long j10) {
        return androidx.compose.ui.unit.q.c(j10);
    }

    @Override // androidx.compose.ui.window.s
    public long a(@NotNull androidx.compose.ui.unit.s sVar, long j10, @NotNull androidx.compose.ui.unit.w wVar, long j11) {
        long jX = this.f14053a.invoke().x();
        long jF = androidx.compose.ui.unit.q.f((((long) n.b(sVar.t() + androidx.compose.ui.unit.q.n(jX), (int) (j11 >> 32), (int) (j10 >> 32), wVar == androidx.compose.ui.unit.w.Ltr)) << 32) | (k0.f265952a & ((long) n.c(sVar.B() + androidx.compose.ui.unit.q.p(jX), (int) (j11 & k0.f265952a), (int) (j10 & k0.f265952a), false, 8, null))));
        Function2<androidx.compose.ui.unit.q, androidx.compose.ui.unit.s, Unit> function2 = this.f14054b;
        if (function2 != null) {
            function2.invoke(androidx.compose.ui.unit.q.c(jX), androidx.compose.ui.unit.t.b(jF, j11));
        }
        return jF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(@NotNull Function0<androidx.compose.ui.unit.q> function0, @Nullable Function2<? super androidx.compose.ui.unit.q, ? super androidx.compose.ui.unit.s, Unit> function2) {
        this.f14053a = function0;
        this.f14054b = function2;
    }

    public /* synthetic */ m(Function0 function0, Function2 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((Function0<androidx.compose.ui.unit.q>) function0, (Function2<? super androidx.compose.ui.unit.q, ? super androidx.compose.ui.unit.s, Unit>) ((i10 & 2) != 0 ? null : function2));
    }

    public /* synthetic */ m(long j10, Function2 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, (i10 & 2) != 0 ? null : function2, null);
    }

    private m(final long j10, Function2<? super androidx.compose.ui.unit.q, ? super androidx.compose.ui.unit.s, Unit> function2) {
        this((Function0<androidx.compose.ui.unit.q>) new Function0() { // from class: androidx.compose.foundation.contextmenu.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m.c(j10);
            }
        }, function2);
    }
}
