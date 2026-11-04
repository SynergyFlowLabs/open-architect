package androidx.compose.ui.modifier;

import androidx.compose.runtime.n7;
import androidx.compose.runtime.w6;
import androidx.compose.ui.a0;
import androidx.compose.ui.platform.r2;
import androidx.compose.ui.platform.t2;
import androidx.compose.ui.platform.u2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nModifierLocalProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalProvider.kt\nandroidx/compose/ui/modifier/ModifierLocalProviderKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,69:1\n110#2:70\n*S KotlinDebug\n*F\n+ 1 ModifierLocalProvider.kt\nandroidx/compose/ui/modifier/ModifierLocalProviderKt\n*L\n58#1:70\n*E\n"})
public final class m {

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 ModifierLocalProvider.kt\nandroidx/compose/ui/modifier/ModifierLocalProviderKt\n*L\n1#1,110:1\n59#2,4:111\n*E\n"})
    public static final class a extends l0 implements Function1<t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p f39631a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f39632b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p pVar, Function0 function0) {
            super(1);
            this.f39631a = pVar;
            this.f39632b = function0;
        }

        public final void c(t2 t2Var) {
            t2Var.d("modifierLocalProvider");
            t2Var.b().c("key", this.f39631a);
            t2Var.b().c("value", this.f39632b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nModifierLocalProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalProvider.kt\nandroidx/compose/ui/modifier/ModifierLocalProviderKt$modifierLocalProvider$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,69:1\n85#2:70\n*S KotlinDebug\n*F\n+ 1 ModifierLocalProvider.kt\nandroidx/compose/ui/modifier/ModifierLocalProviderKt$modifierLocalProvider$1\n*L\n65#1:70\n*E\n"})
    public static final class b<T> extends u2 implements l<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final p<T> f39633d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final n7 f39634e;

        b(p<T> pVar, Function0<? extends T> function0, Function1<? super t2, Unit> function1) {
            super(function1);
            this.f39633d = pVar;
            this.f39634e = w6.e(function0);
        }

        @Override // androidx.compose.ui.modifier.l
        public p<T> getKey() {
            return this.f39633d;
        }

        @Override // androidx.compose.ui.modifier.l
        public T getValue() {
            return (T) this.f39634e.getValue();
        }
    }

    @NotNull
    public static final <T> a0 a(@NotNull a0 a0Var, @NotNull p<T> pVar, @NotNull Function0<? extends T> function0) {
        return a0Var.B2(new b(pVar, function0, r2.e() ? new a(pVar, function0) : r2.b()));
    }
}
