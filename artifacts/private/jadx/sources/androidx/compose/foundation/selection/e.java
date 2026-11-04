package androidx.compose.foundation.selection;

import androidx.compose.foundation.s1;
import androidx.compose.foundation.t2;
import androidx.compose.foundation.w2;
import androidx.compose.foundation.z2;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.o;
import androidx.compose.ui.a0;
import androidx.compose.ui.m;
import androidx.compose.ui.platform.r2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pj.n;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nToggleable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n1#1,702:1\n110#2:703\n110#2:704\n110#2:722\n110#2:723\n692#3,17:705\n692#3,17:724\n*S KotlinDebug\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt\n*L\n75#1:703\n157#1:704\n408#1:722\n493#1:723\n228#1:705,17\n568#1:724,17\n*E\n"})
public final class e {

    @SourceDebugExtension({"SMAP\nToggleable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt$toggleable$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,702:1\n75#2:703\n1282#3,6:704\n*S KotlinDebug\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt$toggleable$2\n*L\n83#1:703\n92#1:704,6\n*E\n"})
    static final class a implements n<a0, c0, Integer, a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f18681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f18682b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.semantics.j f18683c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f18684d;

        /* JADX WARN: Multi-variable type inference failed */
        a(boolean z10, boolean z11, androidx.compose.ui.semantics.j jVar, Function1<? super Boolean, Unit> function1) {
            this.f18681a = z10;
            this.f18682b = z11;
            this.f18683c = jVar;
            this.f18684d = function1;
        }

        @o
        public final a0 c(a0 a0Var, c0 c0Var, int i10) {
            androidx.compose.foundation.interaction.j jVar;
            c0Var.E(290332169);
            if (m0.l0()) {
                m0.A0(290332169, i10, -1, "androidx.compose.foundation.selection.toggleable.<anonymous> (Toggleable.kt:82)");
            }
            t2 t2Var = (t2) c0Var.W(w2.c());
            if (t2Var instanceof z2) {
                c0Var.E(-778338818);
                c0Var.A();
                jVar = null;
            } else {
                c0Var.E(-778206200);
                Object objI0 = c0Var.i0();
                if (objI0 == c0.f35327a.a()) {
                    objI0 = androidx.compose.foundation.interaction.i.a();
                    c0Var.Y(objI0);
                }
                jVar = (androidx.compose.foundation.interaction.j) objI0;
                c0Var.A();
            }
            a0 a0VarA = e.a(a0.E, this.f18681a, jVar, t2Var, this.f18682b, this.f18683c, this.f18684d);
            if (m0.l0()) {
                m0.z0();
            }
            c0Var.A();
            return a0VarA;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ a0 invoke(a0 a0Var, c0 c0Var, Integer num) {
            return c(a0Var, c0Var, num.intValue());
        }
    }

    @SourceDebugExtension({"SMAP\nToggleable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt$toggleable$4\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,702:1\n75#2:703\n1282#3,6:704\n*S KotlinDebug\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt$toggleable$4\n*L\n165#1:703\n175#1:704,6\n*E\n"})
    static final class b implements n<a0, c0, Integer, a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.j f18685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f18686b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f18687c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.semantics.j f18688d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f18689e;

        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.foundation.interaction.j jVar, boolean z10, boolean z11, androidx.compose.ui.semantics.j jVar2, Function1<? super Boolean, Unit> function1) {
            this.f18685a = jVar;
            this.f18686b = z10;
            this.f18687c = z11;
            this.f18688d = jVar2;
            this.f18689e = function1;
        }

        @o
        public final a0 c(a0 a0Var, c0 c0Var, int i10) {
            c0Var.E(-903613902);
            if (m0.l0()) {
                m0.A0(-903613902, i10, -1, "androidx.compose.foundation.selection.toggleable.<anonymous> (Toggleable.kt:164)");
            }
            t2 t2Var = (t2) c0Var.W(w2.c());
            androidx.compose.foundation.interaction.j jVar = this.f18685a;
            if (jVar == null) {
                if (t2Var instanceof z2) {
                    c0Var.E(1293450877);
                    c0Var.A();
                    jVar = null;
                } else {
                    c0Var.E(1293607799);
                    Object objI0 = c0Var.i0();
                    if (objI0 == c0.f35327a.a()) {
                        objI0 = androidx.compose.foundation.interaction.i.a();
                        c0Var.Y(objI0);
                    }
                    jVar = (androidx.compose.foundation.interaction.j) objI0;
                    c0Var.A();
                }
            }
            a0 a0VarA = e.a(a0.E, this.f18686b, jVar, t2Var, this.f18687c, this.f18688d, this.f18689e);
            if (m0.l0()) {
                m0.z0();
            }
            c0Var.A();
            return a0VarA;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ a0 invoke(a0 a0Var, c0 c0Var, Integer num) {
            return c(a0Var, c0Var, num.intValue());
        }
    }

    @SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickableWithIndicationIfNeeded$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt\n*L\n1#1,1799:1\n1282#2,6:1800\n232#3,9:1806\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickableWithIndicationIfNeeded$1\n*L\n709#1:1800,6\n*E\n"})
    public static final class c implements n<a0, c0, Integer, a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t2 f18690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f18691b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f18692c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.semantics.j f18693d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1 f18694e;

        public c(t2 t2Var, boolean z10, boolean z11, androidx.compose.ui.semantics.j jVar, Function1 function1) {
            this.f18690a = t2Var;
            this.f18691b = z10;
            this.f18692c = z11;
            this.f18693d = jVar;
            this.f18694e = function1;
        }

        @o
        public final a0 c(a0 a0Var, c0 c0Var, int i10) {
            c0Var.E(-1525724089);
            if (m0.l0()) {
                m0.A0(-1525724089, i10, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:708)");
            }
            Object objI0 = c0Var.i0();
            if (objI0 == c0.f35327a.a()) {
                objI0 = androidx.compose.foundation.interaction.i.a();
                c0Var.Y(objI0);
            }
            androidx.compose.foundation.interaction.j jVar = (androidx.compose.foundation.interaction.j) objI0;
            a0 a0VarB2 = w2.d(a0.E, jVar, this.f18690a).B2(new ToggleableElement(this.f18691b, jVar, null, false, this.f18692c, this.f18693d, this.f18694e, null));
            if (m0.l0()) {
                m0.z0();
            }
            c0Var.A();
            return a0VarB2;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ a0 invoke(a0 a0Var, c0 c0Var, Integer num) {
            return c(a0Var, c0Var, num.intValue());
        }
    }

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt\n*L\n1#1,110:1\n76#2,6:111\n*E\n"})
    public static final class d extends l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f18695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f18696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.semantics.j f18697c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f18698d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z10, boolean z11, androidx.compose.ui.semantics.j jVar, Function1 function1) {
            super(1);
            this.f18695a = z10;
            this.f18696b = z11;
            this.f18697c = jVar;
            this.f18698d = function1;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("toggleable");
            t2Var.b().c("value", Boolean.valueOf(this.f18695a));
            t2Var.b().c("enabled", Boolean.valueOf(this.f18696b));
            t2Var.b().c("role", this.f18697c);
            t2Var.b().c("onValueChange", this.f18698d);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.selection.e$e, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt\n*L\n1#1,110:1\n158#2,6:111\n*E\n"})
    public static final class C0123e extends l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f18699a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f18700b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.semantics.j f18701c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f18702d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0123e(boolean z10, boolean z11, androidx.compose.ui.semantics.j jVar, Function1 function1) {
            super(1);
            this.f18699a = z10;
            this.f18700b = z11;
            this.f18701c = jVar;
            this.f18702d = function1;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("toggleable");
            t2Var.b().c("value", Boolean.valueOf(this.f18699a));
            t2Var.b().c("enabled", Boolean.valueOf(this.f18700b));
            t2Var.b().c("role", this.f18701c);
            t2Var.b().c("onValueChange", this.f18702d);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nToggleable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt$triStateToggleable$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,702:1\n75#2:703\n1282#3,6:704\n*S KotlinDebug\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt$triStateToggleable$2\n*L\n416#1:703\n425#1:704,6\n*E\n"})
    static final class f implements n<a0, c0, Integer, a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ v0.a f18703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f18704b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.semantics.j f18705c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f18706d;

        f(v0.a aVar, boolean z10, androidx.compose.ui.semantics.j jVar, Function0<Unit> function0) {
            this.f18703a = aVar;
            this.f18704b = z10;
            this.f18705c = jVar;
            this.f18706d = function0;
        }

        @o
        public final a0 c(a0 a0Var, c0 c0Var, int i10) {
            androidx.compose.foundation.interaction.j jVar;
            c0Var.E(-1808118329);
            if (m0.l0()) {
                m0.A0(-1808118329, i10, -1, "androidx.compose.foundation.selection.triStateToggleable.<anonymous> (Toggleable.kt:415)");
            }
            t2 t2Var = (t2) c0Var.W(w2.c());
            if (t2Var instanceof z2) {
                c0Var.E(1826835840);
                c0Var.A();
                jVar = null;
            } else {
                c0Var.E(1826968458);
                Object objI0 = c0Var.i0();
                if (objI0 == c0.f35327a.a()) {
                    objI0 = androidx.compose.foundation.interaction.i.a();
                    c0Var.Y(objI0);
                }
                jVar = (androidx.compose.foundation.interaction.j) objI0;
                c0Var.A();
            }
            a0 a0VarG = e.g(a0.E, this.f18703a, jVar, t2Var, this.f18704b, this.f18705c, this.f18706d);
            if (m0.l0()) {
                m0.z0();
            }
            c0Var.A();
            return a0VarG;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ a0 invoke(a0 a0Var, c0 c0Var, Integer num) {
            return c(a0Var, c0Var, num.intValue());
        }
    }

    @SourceDebugExtension({"SMAP\nToggleable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt$triStateToggleable$4\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,702:1\n75#2:703\n1282#3,6:704\n*S KotlinDebug\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt$triStateToggleable$4\n*L\n501#1:703\n511#1:704,6\n*E\n"})
    static final class g implements n<a0, c0, Integer, a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.j f18707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v0.a f18708b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f18709c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.semantics.j f18710d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f18711e;

        g(androidx.compose.foundation.interaction.j jVar, v0.a aVar, boolean z10, androidx.compose.ui.semantics.j jVar2, Function0<Unit> function0) {
            this.f18707a = jVar;
            this.f18708b = aVar;
            this.f18709c = z10;
            this.f18710d = jVar2;
            this.f18711e = function0;
        }

        @o
        public final a0 c(a0 a0Var, c0 c0Var, int i10) {
            c0Var.E(1737924818);
            if (m0.l0()) {
                m0.A0(1737924818, i10, -1, "androidx.compose.foundation.selection.triStateToggleable.<anonymous> (Toggleable.kt:500)");
            }
            t2 t2Var = (t2) c0Var.W(w2.c());
            androidx.compose.foundation.interaction.j jVar = this.f18707a;
            if (jVar == null) {
                if (t2Var instanceof z2) {
                    c0Var.E(-1312306211);
                    c0Var.A();
                    jVar = null;
                } else {
                    c0Var.E(-1312149289);
                    Object objI0 = c0Var.i0();
                    if (objI0 == c0.f35327a.a()) {
                        objI0 = androidx.compose.foundation.interaction.i.a();
                        c0Var.Y(objI0);
                    }
                    jVar = (androidx.compose.foundation.interaction.j) objI0;
                    c0Var.A();
                }
            }
            a0 a0VarG = e.g(a0.E, this.f18708b, jVar, t2Var, this.f18709c, this.f18710d, this.f18711e);
            if (m0.l0()) {
                m0.z0();
            }
            c0Var.A();
            return a0VarG;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ a0 invoke(a0 a0Var, c0 c0Var, Integer num) {
            return c(a0Var, c0Var, num.intValue());
        }
    }

    @SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickableWithIndicationIfNeeded$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt\n*L\n1#1,1799:1\n1282#2,6:1800\n572#3,9:1806\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickableWithIndicationIfNeeded$1\n*L\n709#1:1800,6\n*E\n"})
    public static final class h implements n<a0, c0, Integer, a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t2 f18712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v0.a f18713b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f18714c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.semantics.j f18715d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f18716e;

        public h(t2 t2Var, v0.a aVar, boolean z10, androidx.compose.ui.semantics.j jVar, Function0 function0) {
            this.f18712a = t2Var;
            this.f18713b = aVar;
            this.f18714c = z10;
            this.f18715d = jVar;
            this.f18716e = function0;
        }

        @o
        public final a0 c(a0 a0Var, c0 c0Var, int i10) {
            c0Var.E(-1525724089);
            if (m0.l0()) {
                m0.A0(-1525724089, i10, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:708)");
            }
            Object objI0 = c0Var.i0();
            if (objI0 == c0.f35327a.a()) {
                objI0 = androidx.compose.foundation.interaction.i.a();
                c0Var.Y(objI0);
            }
            androidx.compose.foundation.interaction.j jVar = (androidx.compose.foundation.interaction.j) objI0;
            a0 a0VarB2 = w2.d(a0.E, jVar, this.f18712a).B2(new TriStateToggleableElement(this.f18713b, jVar, null, false, this.f18714c, this.f18715d, this.f18716e, null));
            if (m0.l0()) {
                m0.z0();
            }
            c0Var.A();
            return a0VarB2;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ a0 invoke(a0 a0Var, c0 c0Var, Integer num) {
            return c(a0Var, c0Var, num.intValue());
        }
    }

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt\n*L\n1#1,110:1\n409#2,6:111\n*E\n"})
    public static final class i extends l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ v0.a f18717a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f18718b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.semantics.j f18719c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f18720d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(v0.a aVar, boolean z10, androidx.compose.ui.semantics.j jVar, Function0 function0) {
            super(1);
            this.f18717a = aVar;
            this.f18718b = z10;
            this.f18719c = jVar;
            this.f18720d = function0;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("triStateToggleable");
            t2Var.b().c("state", this.f18717a);
            t2Var.b().c("enabled", Boolean.valueOf(this.f18718b));
            t2Var.b().c("role", this.f18719c);
            t2Var.b().c("onClick", this.f18720d);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt\n*L\n1#1,110:1\n494#2,6:111\n*E\n"})
    public static final class j extends l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ v0.a f18721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f18722b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.semantics.j f18723c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f18724d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(v0.a aVar, boolean z10, androidx.compose.ui.semantics.j jVar, Function0 function0) {
            super(1);
            this.f18721a = aVar;
            this.f18722b = z10;
            this.f18723c = jVar;
            this.f18724d = function0;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("triStateToggleable");
            t2Var.b().c("state", this.f18721a);
            t2Var.b().c("enabled", Boolean.valueOf(this.f18722b));
            t2Var.b().c("role", this.f18723c);
            t2Var.b().c("onClick", this.f18724d);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @NotNull
    public static final a0 a(@NotNull a0 a0Var, boolean z10, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable t2 t2Var, boolean z11, @Nullable androidx.compose.ui.semantics.j jVar2, @NotNull Function1<? super Boolean, Unit> function1) {
        a0 a0VarB2;
        if (t2Var instanceof z2) {
            a0VarB2 = new ToggleableElement(z10, jVar, (z2) t2Var, false, z11, jVar2, function1, null);
        } else if (t2Var == null) {
            a0VarB2 = new ToggleableElement(z10, jVar, null, false, z11, jVar2, function1, null);
        } else {
            a0VarB2 = jVar != null ? w2.d(a0.E, jVar, t2Var).B2(new ToggleableElement(z10, jVar, null, false, z11, jVar2, function1, null)) : m.k(a0.E, null, new c(t2Var, z10, z11, jVar2, function1), 1, null);
        }
        return a0Var.B2(a0VarB2);
    }

    public static /* synthetic */ a0 b(a0 a0Var, boolean z10, androidx.compose.foundation.interaction.j jVar, t2 t2Var, boolean z11, androidx.compose.ui.semantics.j jVar2, Function1 function1, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        boolean z12 = z11;
        if ((i10 & 16) != 0) {
            jVar2 = null;
        }
        return a(a0Var, z10, jVar, t2Var, z12, jVar2, function1);
    }

    @l(level = kotlin.n.HIDDEN, message = "Replaced with new overload that only supports IndicationNodeFactory instances inside LocalIndication, and does not use composed")
    public static final /* synthetic */ a0 c(a0 a0Var, boolean z10, boolean z11, androidx.compose.ui.semantics.j jVar, Function1 function1) {
        return m.f(a0Var, r2.e() ? new d(z10, z11, jVar, function1) : r2.b(), new a(z10, z11, jVar, function1));
    }

    public static /* synthetic */ a0 d(a0 a0Var, boolean z10, boolean z11, androidx.compose.ui.semantics.j jVar, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            jVar = null;
        }
        return c(a0Var, z10, z11, jVar, function1);
    }

    @NotNull
    public static final a0 e(@NotNull a0 a0Var, boolean z10, boolean z11, @Nullable androidx.compose.ui.semantics.j jVar, @Nullable androidx.compose.foundation.interaction.j jVar2, @NotNull Function1<? super Boolean, Unit> function1) {
        if (s1.f18603h) {
            return a0Var.B2(new ToggleableElement(z10, jVar2, null, true, z11, jVar, function1, null));
        }
        return m.f(a0Var, r2.e() ? new C0123e(z10, z11, jVar, function1) : r2.b(), new b(jVar2, z10, z11, jVar, function1));
    }

    public static /* synthetic */ a0 f(a0 a0Var, boolean z10, boolean z11, androidx.compose.ui.semantics.j jVar, androidx.compose.foundation.interaction.j jVar2, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return e(a0Var, z10, z11, (i10 & 4) != 0 ? null : jVar, (i10 & 8) != 0 ? null : jVar2, function1);
    }

    @NotNull
    public static final a0 g(@NotNull a0 a0Var, @NotNull v0.a aVar, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable t2 t2Var, boolean z10, @Nullable androidx.compose.ui.semantics.j jVar2, @NotNull Function0<Unit> function0) {
        a0 a0VarB2;
        if (t2Var instanceof z2) {
            a0VarB2 = new TriStateToggleableElement(aVar, jVar, (z2) t2Var, false, z10, jVar2, function0, null);
        } else if (t2Var == null) {
            a0VarB2 = new TriStateToggleableElement(aVar, jVar, null, false, z10, jVar2, function0, null);
        } else {
            a0VarB2 = jVar != null ? w2.d(a0.E, jVar, t2Var).B2(new TriStateToggleableElement(aVar, jVar, null, false, z10, jVar2, function0, null)) : m.k(a0.E, null, new h(t2Var, aVar, z10, jVar2, function0), 1, null);
        }
        return a0Var.B2(a0VarB2);
    }

    public static /* synthetic */ a0 h(a0 a0Var, v0.a aVar, androidx.compose.foundation.interaction.j jVar, t2 t2Var, boolean z10, androidx.compose.ui.semantics.j jVar2, Function0 function0, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i10 & 16) != 0) {
            jVar2 = null;
        }
        return g(a0Var, aVar, jVar, t2Var, z11, jVar2, function0);
    }

    @l(level = kotlin.n.HIDDEN, message = "Replaced with new overload that only supports IndicationNodeFactory instances inside LocalIndication, and does not use composed")
    public static final /* synthetic */ a0 i(a0 a0Var, v0.a aVar, boolean z10, androidx.compose.ui.semantics.j jVar, Function0 function0) {
        return m.f(a0Var, r2.e() ? new i(aVar, z10, jVar, function0) : r2.b(), new f(aVar, z10, jVar, function0));
    }

    public static /* synthetic */ a0 j(a0 a0Var, v0.a aVar, boolean z10, androidx.compose.ui.semantics.j jVar, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            jVar = null;
        }
        return i(a0Var, aVar, z10, jVar, function0);
    }

    @NotNull
    public static final a0 k(@NotNull a0 a0Var, @NotNull v0.a aVar, boolean z10, @Nullable androidx.compose.ui.semantics.j jVar, @Nullable androidx.compose.foundation.interaction.j jVar2, @NotNull Function0<Unit> function0) {
        if (s1.f18603h) {
            return a0Var.B2(new TriStateToggleableElement(aVar, jVar2, null, true, z10, jVar, function0, null));
        }
        return m.f(a0Var, r2.e() ? new j(aVar, z10, jVar, function0) : r2.b(), new g(jVar2, aVar, z10, jVar, function0));
    }

    public static /* synthetic */ a0 l(a0 a0Var, v0.a aVar, boolean z10, androidx.compose.ui.semantics.j jVar, androidx.compose.foundation.interaction.j jVar2, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return k(a0Var, aVar, z10, (i10 & 4) != 0 ? null : jVar, (i10 & 8) != 0 ? null : jVar2, function0);
    }
}
