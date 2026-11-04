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
import androidx.compose.ui.semantics.j;
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
@SourceDebugExtension({"SMAP\nSelectable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Selectable.kt\nandroidx/compose/foundation/selection/SelectableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n1#1,371:1\n110#2:372\n110#2:373\n692#3,17:374\n*S KotlinDebug\n*F\n+ 1 Selectable.kt\nandroidx/compose/foundation/selection/SelectableKt\n*L\n77#1:372\n163#1:373\n238#1:374,17\n*E\n"})
public final class c {

    @SourceDebugExtension({"SMAP\nSelectable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Selectable.kt\nandroidx/compose/foundation/selection/SelectableKt$selectable$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,371:1\n75#2:372\n1282#3,6:373\n*S KotlinDebug\n*F\n+ 1 Selectable.kt\nandroidx/compose/foundation/selection/SelectableKt$selectable$2\n*L\n85#1:372\n94#1:373,6\n*E\n"})
    static final class a implements n<a0, c0, Integer, a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f18658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f18659b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j f18660c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f18661d;

        a(boolean z10, boolean z11, j jVar, Function0<Unit> function0) {
            this.f18658a = z10;
            this.f18659b = z11;
            this.f18660c = jVar;
            this.f18661d = function0;
        }

        @o
        public final a0 c(a0 a0Var, c0 c0Var, int i10) {
            androidx.compose.foundation.interaction.j jVar;
            c0Var.E(-2124609672);
            if (m0.l0()) {
                m0.A0(-2124609672, i10, -1, "androidx.compose.foundation.selection.selectable.<anonymous> (Selectable.kt:84)");
            }
            t2 t2Var = (t2) c0Var.W(w2.c());
            if (t2Var instanceof z2) {
                c0Var.E(686451247);
                c0Var.A();
                jVar = null;
            } else {
                c0Var.E(686583865);
                Object objI0 = c0Var.i0();
                if (objI0 == c0.f35327a.a()) {
                    objI0 = androidx.compose.foundation.interaction.i.a();
                    c0Var.Y(objI0);
                }
                jVar = (androidx.compose.foundation.interaction.j) objI0;
                c0Var.A();
            }
            a0 a0VarA = c.a(a0.E, this.f18658a, jVar, t2Var, this.f18659b, this.f18660c, this.f18661d);
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

    @SourceDebugExtension({"SMAP\nSelectable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Selectable.kt\nandroidx/compose/foundation/selection/SelectableKt$selectable$4\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,371:1\n75#2:372\n1282#3,6:373\n*S KotlinDebug\n*F\n+ 1 Selectable.kt\nandroidx/compose/foundation/selection/SelectableKt$selectable$4\n*L\n171#1:372\n181#1:373,6\n*E\n"})
    static final class b implements n<a0, c0, Integer, a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.j f18662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f18663b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f18664c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j f18665d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f18666e;

        b(androidx.compose.foundation.interaction.j jVar, boolean z10, boolean z11, j jVar2, Function0<Unit> function0) {
            this.f18662a = jVar;
            this.f18663b = z10;
            this.f18664c = z11;
            this.f18665d = jVar2;
            this.f18666e = function0;
        }

        @o
        public final a0 c(a0 a0Var, c0 c0Var, int i10) {
            c0Var.E(-1776728079);
            if (m0.l0()) {
                m0.A0(-1776728079, i10, -1, "androidx.compose.foundation.selection.selectable.<anonymous> (Selectable.kt:170)");
            }
            t2 t2Var = (t2) c0Var.W(w2.c());
            androidx.compose.foundation.interaction.j jVar = this.f18662a;
            if (jVar == null) {
                if (t2Var instanceof z2) {
                    c0Var.E(670948446);
                    c0Var.A();
                    jVar = null;
                } else {
                    c0Var.E(671105368);
                    Object objI0 = c0Var.i0();
                    if (objI0 == c0.f35327a.a()) {
                        objI0 = androidx.compose.foundation.interaction.i.a();
                        c0Var.Y(objI0);
                    }
                    jVar = (androidx.compose.foundation.interaction.j) objI0;
                    c0Var.A();
                }
            }
            a0 a0VarA = c.a(a0.E, this.f18663b, jVar, t2Var, this.f18664c, this.f18665d, this.f18666e);
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

    /* JADX INFO: renamed from: androidx.compose.foundation.selection.c$c, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickableWithIndicationIfNeeded$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Selectable.kt\nandroidx/compose/foundation/selection/SelectableKt\n*L\n1#1,1799:1\n1282#2,6:1800\n242#3,9:1806\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickableWithIndicationIfNeeded$1\n*L\n709#1:1800,6\n*E\n"})
    public static final class C0122c implements n<a0, c0, Integer, a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t2 f18667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f18668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f18669c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j f18670d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f18671e;

        public C0122c(t2 t2Var, boolean z10, boolean z11, j jVar, Function0 function0) {
            this.f18667a = t2Var;
            this.f18668b = z10;
            this.f18669c = z11;
            this.f18670d = jVar;
            this.f18671e = function0;
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
            a0 a0VarB2 = w2.d(a0.E, jVar, this.f18667a).B2(new SelectableElement(this.f18668b, jVar, null, false, this.f18669c, this.f18670d, this.f18671e, null));
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

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Selectable.kt\nandroidx/compose/foundation/selection/SelectableKt\n*L\n1#1,110:1\n78#2,6:111\n*E\n"})
    public static final class d extends l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f18672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f18673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j f18674c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f18675d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z10, boolean z11, j jVar, Function0 function0) {
            super(1);
            this.f18672a = z10;
            this.f18673b = z11;
            this.f18674c = jVar;
            this.f18675d = function0;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("selectable");
            t2Var.b().c("selected", Boolean.valueOf(this.f18672a));
            t2Var.b().c("enabled", Boolean.valueOf(this.f18673b));
            t2Var.b().c("role", this.f18674c);
            t2Var.b().c("onClick", this.f18675d);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Selectable.kt\nandroidx/compose/foundation/selection/SelectableKt\n*L\n1#1,110:1\n164#2,6:111\n*E\n"})
    public static final class e extends l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f18676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f18677b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j f18678c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f18679d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z10, boolean z11, j jVar, Function0 function0) {
            super(1);
            this.f18676a = z10;
            this.f18677b = z11;
            this.f18678c = jVar;
            this.f18679d = function0;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("selectable");
            t2Var.b().c("selected", Boolean.valueOf(this.f18676a));
            t2Var.b().c("enabled", Boolean.valueOf(this.f18677b));
            t2Var.b().c("role", this.f18678c);
            t2Var.b().c("onClick", this.f18679d);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @NotNull
    public static final a0 a(@NotNull a0 a0Var, boolean z10, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable t2 t2Var, boolean z11, @Nullable j jVar2, @NotNull Function0<Unit> function0) {
        a0 a0VarB2;
        if (t2Var instanceof z2) {
            a0VarB2 = new SelectableElement(z10, jVar, (z2) t2Var, false, z11, jVar2, function0, null);
        } else if (t2Var == null) {
            a0VarB2 = new SelectableElement(z10, jVar, null, false, z11, jVar2, function0, null);
        } else {
            a0VarB2 = jVar != null ? w2.d(a0.E, jVar, t2Var).B2(new SelectableElement(z10, jVar, null, false, z11, jVar2, function0, null)) : m.k(a0.E, null, new C0122c(t2Var, z10, z11, jVar2, function0), 1, null);
        }
        return a0Var.B2(a0VarB2);
    }

    public static /* synthetic */ a0 b(a0 a0Var, boolean z10, androidx.compose.foundation.interaction.j jVar, t2 t2Var, boolean z11, j jVar2, Function0 function0, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        boolean z12 = z11;
        if ((i10 & 16) != 0) {
            jVar2 = null;
        }
        return a(a0Var, z10, jVar, t2Var, z12, jVar2, function0);
    }

    @l(level = kotlin.n.HIDDEN, message = "Replaced with new overload that only supports IndicationNodeFactory instances inside LocalIndication, and does not use composed")
    public static final /* synthetic */ a0 c(a0 a0Var, boolean z10, boolean z11, j jVar, Function0 function0) {
        return m.f(a0Var, r2.e() ? new d(z10, z11, jVar, function0) : r2.b(), new a(z10, z11, jVar, function0));
    }

    public static /* synthetic */ a0 d(a0 a0Var, boolean z10, boolean z11, j jVar, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            jVar = null;
        }
        return c(a0Var, z10, z11, jVar, function0);
    }

    @NotNull
    public static final a0 e(@NotNull a0 a0Var, boolean z10, boolean z11, @Nullable j jVar, @Nullable androidx.compose.foundation.interaction.j jVar2, @NotNull Function0<Unit> function0) {
        if (s1.f18603h) {
            return a0Var.B2(new SelectableElement(z10, jVar2, null, true, z11, jVar, function0, null));
        }
        return m.f(a0Var, r2.e() ? new e(z10, z11, jVar, function0) : r2.b(), new b(jVar2, z10, z11, jVar, function0));
    }

    public static /* synthetic */ a0 f(a0 a0Var, boolean z10, boolean z11, j jVar, androidx.compose.foundation.interaction.j jVar2, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return e(a0Var, z10, z11, (i10 & 4) != 0 ? null : jVar, (i10 & 8) != 0 ? null : jVar2, function0);
    }
}
