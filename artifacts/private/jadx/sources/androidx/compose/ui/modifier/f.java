package androidx.compose.ui.modifier;

import androidx.compose.runtime.k7;
import androidx.compose.ui.a0;
import androidx.compose.ui.platform.r2;
import androidx.compose.ui.platform.t2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nModifierLocalConsumer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalConsumer.kt\nandroidx/compose/ui/modifier/ModifierLocalConsumerKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,73:1\n110#2:74\n*S KotlinDebug\n*F\n+ 1 ModifierLocalConsumer.kt\nandroidx/compose/ui/modifier/ModifierLocalConsumerKt\n*L\n49#1:74\n*E\n"})
public final class f {

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 ModifierLocalConsumer.kt\nandroidx/compose/ui/modifier/ModifierLocalConsumerKt\n*L\n1#1,110:1\n50#2,3:111\n*E\n"})
    public static final class a extends l0 implements Function1<t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f39621a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1) {
            super(1);
            this.f39621a = function1;
        }

        public final void c(t2 t2Var) {
            t2Var.d("modifierLocalConsumer");
            t2Var.b().c("consumer", this.f39621a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @k7
    @NotNull
    public static final a0 a(@NotNull a0 a0Var, @NotNull Function1<? super n, Unit> function1) {
        return a0Var.B2(new e(function1, r2.e() ? new a(function1) : r2.b()));
    }
}
