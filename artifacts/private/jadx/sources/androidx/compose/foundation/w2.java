package androidx.compose.foundation;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nIndication.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/IndicationKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,348:1\n110#2:349\n*S KotlinDebug\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/IndicationKt\n*L\n182#1:349\n*E\n"})
public final class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.m4<t2> f21867a = androidx.compose.runtime.a1.k(null, new Function0() { // from class: androidx.compose.foundation.v2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return w2.b();
        }
    }, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f21868b = "rememberUpdatedInstance has been deprecated - implementers should instead implement IndicationNodeFactory#create for improved performance and efficiency. Callers should check if the Indication is an IndicationNodeFactory, and call that API instead. For a migration guide and background information, please visit developer.android.com";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f21869c = "IndicationInstance has been deprecated along with the rememberUpdatedInstance that returns it. Indication implementations should instead use Modifier.Node APIs, and should be returned from IndicationNodeFactory#create. For a migration guide and background information, please visit developer.android.com";

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Indication.kt\nandroidx/compose/foundation/IndicationKt\n*L\n1#1,110:1\n183#2,4:111\n*E\n"})
    public static final class a extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.h f21870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t2 f21871b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.foundation.interaction.h hVar, t2 t2Var) {
            super(1);
            this.f21870a = hVar;
            this.f21871b = t2Var;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("indication");
            t2Var.b().c("interactionSource", this.f21870a);
            t2Var.b().c("indication", this.f21871b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nIndication.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/IndicationKt$indication$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,348:1\n1282#2,6:349\n*S KotlinDebug\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/IndicationKt$indication$2\n*L\n179#1:349,6\n*E\n"})
    static final class b implements pj.n<androidx.compose.ui.a0, androidx.compose.runtime.c0, Integer, androidx.compose.ui.a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t2 f21872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.h f21873b;

        b(t2 t2Var, androidx.compose.foundation.interaction.h hVar) {
            this.f21872a = t2Var;
            this.f21873b = hVar;
        }

        @androidx.compose.runtime.o
        public final androidx.compose.ui.a0 c(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(-353972293);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-353972293, i10, -1, "androidx.compose.foundation.indication.<anonymous> (Indication.kt:176)");
            }
            u2 u2VarB = this.f21872a.b(this.f21873b, c0Var, 0);
            boolean zD = c0Var.D(u2VarB);
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new x2(u2VarB);
                c0Var.Y(objI0);
            }
            x2 x2Var = (x2) objI0;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return x2Var;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.ui.a0 invoke(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(a0Var, c0Var, num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t2 b() {
        return v1.f21846a;
    }

    @NotNull
    public static final androidx.compose.runtime.m4<t2> c() {
        return f21867a;
    }

    @NotNull
    public static final androidx.compose.ui.a0 d(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.foundation.interaction.h hVar, @Nullable t2 t2Var) {
        if (t2Var == null) {
            return a0Var;
        }
        if (t2Var instanceof z2) {
            return a0Var.B2(new IndicationModifierElement(hVar, (z2) t2Var));
        }
        return androidx.compose.ui.m.f(a0Var, androidx.compose.ui.platform.r2.e() ? new a(hVar, t2Var) : androidx.compose.ui.platform.r2.b(), new b(t2Var, hVar));
    }
}
