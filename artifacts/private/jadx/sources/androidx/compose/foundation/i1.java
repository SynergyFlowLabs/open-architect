package androidx.compose.foundation;

import android.view.KeyEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,1799:1\n692#1,17:1802\n692#1,17:1822\n692#1,17:1839\n110#2:1800\n110#2:1801\n110#2:1819\n110#2:1820\n110#2:1821\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n303#1:1802,17\n632#1:1822,17\n663#1:1839,17\n130#1:1800\n221#1:1801\n371#1:1819\n484#1:1820\n535#1:1821\n*E\n"})
public final class i1 {

    @SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickable$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1799:1\n75#2:1800\n1282#3,6:1801\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickable$2\n*L\n138#1:1800\n147#1:1801,6\n*E\n"})
    static final class a implements pj.n<androidx.compose.ui.a0, androidx.compose.runtime.c0, Integer, androidx.compose.ui.a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f15520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f15521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.semantics.j f15522c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f15523d;

        a(boolean z10, String str, androidx.compose.ui.semantics.j jVar, Function0<Unit> function0) {
            this.f15520a = z10;
            this.f15521b = str;
            this.f15522c = jVar;
            this.f15523d = function0;
        }

        @androidx.compose.runtime.o
        public final androidx.compose.ui.a0 c(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            androidx.compose.foundation.interaction.j jVar;
            c0Var.E(-756081143);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-756081143, i10, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:137)");
            }
            t2 t2Var = (t2) c0Var.W(w2.c());
            if (t2Var instanceof z2) {
                c0Var.E(-1604682242);
                c0Var.A();
                jVar = null;
            } else {
                c0Var.E(-1604549624);
                Object objI0 = c0Var.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = androidx.compose.foundation.interaction.i.a();
                    c0Var.Y(objI0);
                }
                jVar = (androidx.compose.foundation.interaction.j) objI0;
                c0Var.A();
            }
            androidx.compose.ui.a0 a0VarE = i1.e(androidx.compose.ui.a0.E, jVar, t2Var, this.f15520a, this.f15521b, this.f15522c, this.f15523d);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return a0VarE;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.ui.a0 invoke(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(a0Var, c0Var, num.intValue());
        }
    }

    @SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickable$4\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1799:1\n75#2:1800\n1282#3,6:1801\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickable$4\n*L\n230#1:1800\n240#1:1801,6\n*E\n"})
    static final class b implements pj.n<androidx.compose.ui.a0, androidx.compose.runtime.c0, Integer, androidx.compose.ui.a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.j f15524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f15525b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f15526c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.semantics.j f15527d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f15528e;

        b(androidx.compose.foundation.interaction.j jVar, boolean z10, String str, androidx.compose.ui.semantics.j jVar2, Function0<Unit> function0) {
            this.f15524a = jVar;
            this.f15525b = z10;
            this.f15526c = str;
            this.f15527d = jVar2;
            this.f15528e = function0;
        }

        @androidx.compose.runtime.o
        public final androidx.compose.ui.a0 c(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(-691633986);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-691633986, i10, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:229)");
            }
            t2 t2Var = (t2) c0Var.W(w2.c());
            androidx.compose.foundation.interaction.j jVar = this.f15524a;
            if (jVar == null) {
                if (t2Var instanceof z2) {
                    c0Var.E(-1509763983);
                    c0Var.A();
                    jVar = null;
                } else {
                    c0Var.E(-1509607061);
                    Object objI0 = c0Var.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.foundation.interaction.i.a();
                        c0Var.Y(objI0);
                    }
                    jVar = (androidx.compose.foundation.interaction.j) objI0;
                    c0Var.A();
                }
            }
            androidx.compose.ui.a0 a0VarE = i1.e(androidx.compose.ui.a0.E, jVar, t2Var, this.f15525b, this.f15526c, this.f15527d, this.f15528e);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return a0VarE;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.ui.a0 invoke(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(a0Var, c0Var, num.intValue());
        }
    }

    @SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickableWithIndicationIfNeeded$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n1#1,1799:1\n1282#2,6:1800\n307#3,9:1806\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickableWithIndicationIfNeeded$1\n*L\n709#1:1800,6\n*E\n"})
    public static final class c implements pj.n<androidx.compose.ui.a0, androidx.compose.runtime.c0, Integer, androidx.compose.ui.a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t2 f15529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f15530b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f15531c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.semantics.j f15532d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f15533e;

        public c(t2 t2Var, boolean z10, String str, androidx.compose.ui.semantics.j jVar, Function0 function0) {
            this.f15529a = t2Var;
            this.f15530b = z10;
            this.f15531c = str;
            this.f15532d = jVar;
            this.f15533e = function0;
        }

        @androidx.compose.runtime.o
        public final androidx.compose.ui.a0 c(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(-1525724089);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1525724089, i10, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:708)");
            }
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = androidx.compose.foundation.interaction.i.a();
                c0Var.Y(objI0);
            }
            androidx.compose.foundation.interaction.j jVar = (androidx.compose.foundation.interaction.j) objI0;
            androidx.compose.ui.a0 a0VarB2 = w2.d(androidx.compose.ui.a0.E, jVar, this.f15529a).B2(new ClickableElement(jVar, null, false, this.f15530b, this.f15531c, this.f15532d, this.f15533e, null));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return a0VarB2;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.ui.a0 invoke(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(a0Var, c0Var, num.intValue());
        }
    }

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n1#1,110:1\n131#2,6:111\n*E\n"})
    public static final class d extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f15534a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f15535b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.semantics.j f15536c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f15537d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z10, String str, androidx.compose.ui.semantics.j jVar, Function0 function0) {
            super(1);
            this.f15534a = z10;
            this.f15535b = str;
            this.f15536c = jVar;
            this.f15537d = function0;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("clickable");
            t2Var.b().c("enabled", Boolean.valueOf(this.f15534a));
            t2Var.b().c("onClickLabel", this.f15535b);
            t2Var.b().c("role", this.f15536c);
            t2Var.b().c("onClick", this.f15537d);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n1#1,110:1\n222#2,7:111\n*E\n"})
    public static final class e extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f15538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f15539b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.semantics.j f15540c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.j f15541d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f15542e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z10, String str, androidx.compose.ui.semantics.j jVar, androidx.compose.foundation.interaction.j jVar2, Function0 function0) {
            super(1);
            this.f15538a = z10;
            this.f15539b = str;
            this.f15540c = jVar;
            this.f15541d = jVar2;
            this.f15542e = function0;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("clickable");
            t2Var.b().c("enabled", Boolean.valueOf(this.f15538a));
            t2Var.b().c("onClickLabel", this.f15539b);
            t2Var.b().c("role", this.f15540c);
            t2Var.b().c("interactionSource", this.f15541d);
            t2Var.b().c("onClick", this.f15542e);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickableWithIndicationIfNeeded$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1799:1\n1282#2,6:1800\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickableWithIndicationIfNeeded$1\n*L\n709#1:1800,6\n*E\n"})
    public static final class f implements pj.n<androidx.compose.ui.a0, androidx.compose.runtime.c0, Integer, androidx.compose.ui.a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t2 f15543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.foundation.interaction.j, z2, androidx.compose.ui.a0> f15544b;

        /* JADX WARN: Multi-variable type inference failed */
        public f(t2 t2Var, Function2<? super androidx.compose.foundation.interaction.j, ? super z2, ? extends androidx.compose.ui.a0> function2) {
            this.f15543a = t2Var;
            this.f15544b = function2;
        }

        @androidx.compose.runtime.o
        public final androidx.compose.ui.a0 c(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(-1525724089);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1525724089, i10, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:708)");
            }
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = androidx.compose.foundation.interaction.i.a();
                c0Var.Y(objI0);
            }
            androidx.compose.foundation.interaction.j jVar = (androidx.compose.foundation.interaction.j) objI0;
            androidx.compose.ui.a0 a0VarB2 = w2.d(androidx.compose.ui.a0.E, jVar, this.f15543a).B2(this.f15544b.invoke(jVar, null));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return a0VarB2;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.ui.a0 invoke(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(a0Var, c0Var, num.intValue());
        }
    }

    @SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$combinedClickable$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1799:1\n75#2:1800\n1282#3,6:1801\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$combinedClickable$2\n*L\n383#1:1800\n392#1:1801,6\n*E\n"})
    static final class g implements pj.n<androidx.compose.ui.a0, androidx.compose.runtime.c0, Integer, androidx.compose.ui.a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f15545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f15546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.semantics.j f15547c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f15548d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f15549e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f15550f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f15551g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f15552h;

        g(boolean z10, String str, androidx.compose.ui.semantics.j jVar, String str2, Function0<Unit> function0, Function0<Unit> function1, boolean z11, Function0<Unit> function2) {
            this.f15545a = z10;
            this.f15546b = str;
            this.f15547c = jVar;
            this.f15548d = str2;
            this.f15549e = function0;
            this.f15550f = function1;
            this.f15551g = z11;
            this.f15552h = function2;
        }

        @androidx.compose.runtime.o
        public final androidx.compose.ui.a0 c(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            androidx.compose.foundation.interaction.j jVar;
            c0Var.E(-1534186401);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1534186401, i10, -1, "androidx.compose.foundation.combinedClickable.<anonymous> (Clickable.kt:382)");
            }
            t2 t2Var = (t2) c0Var.W(w2.c());
            if (t2Var instanceof z2) {
                c0Var.E(2095040488);
                c0Var.A();
                jVar = null;
            } else {
                c0Var.E(2095173106);
                Object objI0 = c0Var.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = androidx.compose.foundation.interaction.i.a();
                    c0Var.Y(objI0);
                }
                jVar = (androidx.compose.foundation.interaction.j) objI0;
                c0Var.A();
            }
            androidx.compose.ui.a0 a0VarN = i1.n(androidx.compose.ui.a0.E, jVar, t2Var, this.f15545a, this.f15546b, this.f15547c, this.f15548d, this.f15549e, this.f15550f, this.f15551g, this.f15552h);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return a0VarN;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.ui.a0 invoke(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(a0Var, c0Var, num.intValue());
        }
    }

    @SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$combinedClickable$4\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1799:1\n75#2:1800\n1282#3,6:1801\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$combinedClickable$4\n*L\n496#1:1800\n506#1:1801,6\n*E\n"})
    static final class h implements pj.n<androidx.compose.ui.a0, androidx.compose.runtime.c0, Integer, androidx.compose.ui.a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.j f15553a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f15554b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f15555c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.semantics.j f15556d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f15557e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f15558f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f15559g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f15560h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f15561i;

        h(androidx.compose.foundation.interaction.j jVar, boolean z10, String str, androidx.compose.ui.semantics.j jVar2, String str2, Function0<Unit> function0, Function0<Unit> function1, boolean z11, Function0<Unit> function2) {
            this.f15553a = jVar;
            this.f15554b = z10;
            this.f15555c = str;
            this.f15556d = jVar2;
            this.f15557e = str2;
            this.f15558f = function0;
            this.f15559g = function1;
            this.f15560h = z11;
            this.f15561i = function2;
        }

        @androidx.compose.runtime.o
        public final androidx.compose.ui.a0 c(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(-769426448);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-769426448, i10, -1, "androidx.compose.foundation.combinedClickable.<anonymous> (Clickable.kt:495)");
            }
            t2 t2Var = (t2) c0Var.W(w2.c());
            androidx.compose.foundation.interaction.j jVar = this.f15553a;
            if (jVar == null) {
                if (t2Var instanceof z2) {
                    c0Var.E(257340415);
                    c0Var.A();
                    jVar = null;
                } else {
                    c0Var.E(257497337);
                    Object objI0 = c0Var.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.foundation.interaction.i.a();
                        c0Var.Y(objI0);
                    }
                    jVar = (androidx.compose.foundation.interaction.j) objI0;
                    c0Var.A();
                }
            }
            androidx.compose.ui.a0 a0VarN = i1.n(androidx.compose.ui.a0.E, jVar, t2Var, this.f15554b, this.f15555c, this.f15556d, this.f15557e, this.f15558f, this.f15559g, this.f15560h, this.f15561i);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return a0VarN;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.ui.a0 invoke(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(a0Var, c0Var, num.intValue());
        }
    }

    @SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$combinedClickable$6\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1799:1\n75#2:1800\n1282#3,6:1801\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$combinedClickable$6\n*L\n546#1:1800\n555#1:1801,6\n*E\n"})
    static final class i implements pj.n<androidx.compose.ui.a0, androidx.compose.runtime.c0, Integer, androidx.compose.ui.a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f15562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f15563b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.semantics.j f15564c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f15565d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f15566e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f15567f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f15568g;

        i(boolean z10, String str, androidx.compose.ui.semantics.j jVar, String str2, Function0<Unit> function0, Function0<Unit> function1, Function0<Unit> function2) {
            this.f15562a = z10;
            this.f15563b = str;
            this.f15564c = jVar;
            this.f15565d = str2;
            this.f15566e = function0;
            this.f15567f = function1;
            this.f15568g = function2;
        }

        @androidx.compose.runtime.o
        public final androidx.compose.ui.a0 c(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            androidx.compose.foundation.interaction.j jVar;
            c0Var.E(1969174843);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1969174843, i10, -1, "androidx.compose.foundation.combinedClickable.<anonymous> (Clickable.kt:545)");
            }
            t2 t2Var = (t2) c0Var.W(w2.c());
            if (t2Var instanceof z2) {
                c0Var.E(-1270399604);
                c0Var.A();
                jVar = null;
            } else {
                c0Var.E(-1270266986);
                Object objI0 = c0Var.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = androidx.compose.foundation.interaction.i.a();
                    c0Var.Y(objI0);
                }
                jVar = (androidx.compose.foundation.interaction.j) objI0;
                c0Var.A();
            }
            androidx.compose.ui.a0 a0VarN = i1.n(androidx.compose.ui.a0.E, jVar, t2Var, this.f15562a, this.f15563b, this.f15564c, this.f15565d, this.f15566e, this.f15567f, true, this.f15568g);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return a0VarN;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.ui.a0 invoke(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(a0Var, c0Var, num.intValue());
        }
    }

    @SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickableWithIndicationIfNeeded$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n1#1,1799:1\n1282#2,6:1800\n667#3,13:1806\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickableWithIndicationIfNeeded$1\n*L\n709#1:1800,6\n*E\n"})
    public static final class j implements pj.n<androidx.compose.ui.a0, androidx.compose.runtime.c0, Integer, androidx.compose.ui.a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t2 f15569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f15570b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f15571c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.semantics.j f15572d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f15573e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f15574f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0 f15575g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f15576h;

        public j(t2 t2Var, boolean z10, String str, androidx.compose.ui.semantics.j jVar, Function0 function0, String str2, Function0 function1, Function0 function2) {
            this.f15569a = t2Var;
            this.f15570b = z10;
            this.f15571c = str;
            this.f15572d = jVar;
            this.f15573e = function0;
            this.f15574f = str2;
            this.f15575g = function1;
            this.f15576h = function2;
        }

        @androidx.compose.runtime.o
        public final androidx.compose.ui.a0 c(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(-1525724089);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1525724089, i10, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:708)");
            }
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = androidx.compose.foundation.interaction.i.a();
                c0Var.Y(objI0);
            }
            androidx.compose.foundation.interaction.j jVar = (androidx.compose.foundation.interaction.j) objI0;
            androidx.compose.ui.a0 a0VarB2 = w2.d(androidx.compose.ui.a0.E, jVar, this.f15569a).B2(new CombinedClickableElement(jVar, null, false, this.f15570b, this.f15571c, this.f15572d, this.f15573e, this.f15574f, this.f15575g, this.f15576h, true, null));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return a0VarB2;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.ui.a0 invoke(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(a0Var, c0Var, num.intValue());
        }
    }

    @SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickableWithIndicationIfNeeded$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n1#1,1799:1\n1282#2,6:1800\n636#3,13:1806\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickableWithIndicationIfNeeded$1\n*L\n709#1:1800,6\n*E\n"})
    public static final class k implements pj.n<androidx.compose.ui.a0, androidx.compose.runtime.c0, Integer, androidx.compose.ui.a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t2 f15577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f15578b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f15579c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.semantics.j f15580d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f15581e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f15582f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0 f15583g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f15584h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f15585i;

        public k(t2 t2Var, boolean z10, String str, androidx.compose.ui.semantics.j jVar, Function0 function0, String str2, Function0 function1, Function0 function2, boolean z11) {
            this.f15577a = t2Var;
            this.f15578b = z10;
            this.f15579c = str;
            this.f15580d = jVar;
            this.f15581e = function0;
            this.f15582f = str2;
            this.f15583g = function1;
            this.f15584h = function2;
            this.f15585i = z11;
        }

        @androidx.compose.runtime.o
        public final androidx.compose.ui.a0 c(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(-1525724089);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1525724089, i10, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:708)");
            }
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = androidx.compose.foundation.interaction.i.a();
                c0Var.Y(objI0);
            }
            androidx.compose.foundation.interaction.j jVar = (androidx.compose.foundation.interaction.j) objI0;
            androidx.compose.ui.a0 a0VarB2 = w2.d(androidx.compose.ui.a0.E, jVar, this.f15577a).B2(new CombinedClickableElement(jVar, null, false, this.f15578b, this.f15579c, this.f15580d, this.f15581e, this.f15582f, this.f15583g, this.f15584h, this.f15585i, null));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return a0VarB2;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.ui.a0 invoke(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(a0Var, c0Var, num.intValue());
        }
    }

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n1#1,110:1\n536#2,9:111\n*E\n"})
    public static final class l extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f15586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f15587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.semantics.j f15588c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f15589d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f15590e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f15591f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f15592g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(boolean z10, String str, androidx.compose.ui.semantics.j jVar, Function0 function0, Function0 function1, Function0 function2, String str2) {
            super(1);
            this.f15586a = z10;
            this.f15587b = str;
            this.f15588c = jVar;
            this.f15589d = function0;
            this.f15590e = function1;
            this.f15591f = function2;
            this.f15592g = str2;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("combinedClickable");
            t2Var.b().c("enabled", Boolean.valueOf(this.f15586a));
            t2Var.b().c("onClickLabel", this.f15587b);
            t2Var.b().c("role", this.f15588c);
            t2Var.b().c("onClick", this.f15589d);
            t2Var.b().c("onDoubleClick", this.f15590e);
            t2Var.b().c("onLongClick", this.f15591f);
            t2Var.b().c("onLongClickLabel", this.f15592g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n1#1,110:1\n372#2,10:111\n*E\n"})
    public static final class m extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f15593a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f15594b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.semantics.j f15595c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f15596d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f15597e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f15598f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f15599g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f15600h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(boolean z10, String str, androidx.compose.ui.semantics.j jVar, Function0 function0, Function0 function1, Function0 function2, String str2, boolean z11) {
            super(1);
            this.f15593a = z10;
            this.f15594b = str;
            this.f15595c = jVar;
            this.f15596d = function0;
            this.f15597e = function1;
            this.f15598f = function2;
            this.f15599g = str2;
            this.f15600h = z11;
            int i10 = 4 | 1;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("combinedClickable");
            t2Var.b().c("enabled", Boolean.valueOf(this.f15593a));
            t2Var.b().c("onClickLabel", this.f15594b);
            t2Var.b().c("role", this.f15595c);
            t2Var.b().c("onClick", this.f15596d);
            t2Var.b().c("onDoubleClick", this.f15597e);
            t2Var.b().c("onLongClick", this.f15598f);
            t2Var.b().c("onLongClickLabel", this.f15599g);
            t2Var.b().c("hapticFeedbackEnabled", Boolean.valueOf(this.f15600h));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n1#1,110:1\n485#2,10:111\n*E\n"})
    public static final class n extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f15601a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f15602b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.semantics.j f15603c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f15604d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f15605e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f15606f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f15607g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f15608h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(boolean z10, String str, androidx.compose.ui.semantics.j jVar, Function0 function0, Function0 function1, Function0 function2, String str2, boolean z11) {
            super(1);
            this.f15601a = z10;
            this.f15602b = str;
            this.f15603c = jVar;
            this.f15604d = function0;
            this.f15605e = function1;
            this.f15606f = function2;
            this.f15607g = str2;
            this.f15608h = z11;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("combinedClickable");
            t2Var.b().c("enabled", Boolean.valueOf(this.f15601a));
            t2Var.b().c("onClickLabel", this.f15602b);
            t2Var.b().c("role", this.f15603c);
            t2Var.b().c("onClick", this.f15604d);
            t2Var.b().c("onDoubleClick", this.f15605e);
            t2Var.b().c("onLongClick", this.f15606f);
            t2Var.b().c("onLongClickLabel", this.f15607g);
            t2Var.b().c("hapticFeedbackEnabled", Boolean.valueOf(this.f15608h));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String A(t2 t2Var) {
        return "clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. You can also use ComposeFoundationFlags.isNonComposedClickableEnabled to temporarily opt-out; note that this flag will be removed in a future release and is only intended to be a temporary migration aid. The Indication instance provided here was: " + t2Var;
    }

    @NotNull
    public static final androidx.compose.ui.a0 e(@NotNull androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable t2 t2Var, boolean z10, @Nullable String str, @Nullable androidx.compose.ui.semantics.j jVar2, @NotNull Function0<Unit> function0) {
        androidx.compose.ui.a0 a0VarK;
        if (t2Var instanceof z2) {
            a0VarK = new ClickableElement(jVar, (z2) t2Var, false, z10, str, jVar2, function0, null);
        } else if (t2Var == null) {
            a0VarK = new ClickableElement(jVar, null, false, z10, str, jVar2, function0, null);
        } else if (jVar != null) {
            a0VarK = w2.d(androidx.compose.ui.a0.E, jVar, t2Var).B2(new ClickableElement(jVar, null, false, z10, str, jVar2, function0, null));
        } else {
            a0VarK = androidx.compose.ui.m.k(androidx.compose.ui.a0.E, null, new c(t2Var, z10, str, jVar2, function0), 1, null);
        }
        return a0Var.B2(a0VarK);
    }

    public static /* synthetic */ androidx.compose.ui.a0 f(androidx.compose.ui.a0 a0Var, androidx.compose.foundation.interaction.j jVar, t2 t2Var, boolean z10, String str, androidx.compose.ui.semantics.j jVar2, Function0 function0, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return e(a0Var, jVar, t2Var, z10, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : jVar2, function0);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Replaced with new overload that only supports IndicationNodeFactory instances inside LocalIndication, and does not use composed")
    public static final /* synthetic */ androidx.compose.ui.a0 g(androidx.compose.ui.a0 a0Var, boolean z10, String str, androidx.compose.ui.semantics.j jVar, Function0 function0) {
        return androidx.compose.ui.m.f(a0Var, androidx.compose.ui.platform.r2.e() ? new d(z10, str, jVar, function0) : androidx.compose.ui.platform.r2.b(), new a(z10, str, jVar, function0));
    }

    public static /* synthetic */ androidx.compose.ui.a0 h(androidx.compose.ui.a0 a0Var, boolean z10, String str, androidx.compose.ui.semantics.j jVar, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            jVar = null;
        }
        return g(a0Var, z10, str, jVar, function0);
    }

    @NotNull
    public static final androidx.compose.ui.a0 i(@NotNull androidx.compose.ui.a0 a0Var, boolean z10, @Nullable String str, @Nullable androidx.compose.ui.semantics.j jVar, @Nullable androidx.compose.foundation.interaction.j jVar2, @NotNull Function0<Unit> function0) {
        if (s1.f18603h) {
            return a0Var.B2(new ClickableElement(jVar2, null, true, z10, str, jVar, function0, null));
        }
        return androidx.compose.ui.m.f(a0Var, androidx.compose.ui.platform.r2.e() ? new e(z10, str, jVar, jVar2, function0) : androidx.compose.ui.platform.r2.b(), new b(jVar2, z10, str, jVar, function0));
    }

    public static /* synthetic */ androidx.compose.ui.a0 j(androidx.compose.ui.a0 a0Var, boolean z10, String str, androidx.compose.ui.semantics.j jVar, androidx.compose.foundation.interaction.j jVar2, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            jVar = null;
        }
        return i(a0Var, z10, str, jVar, (i10 & 8) != 0 ? null : jVar2, function0);
    }

    @NotNull
    public static final androidx.compose.ui.a0 k(@NotNull androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable t2 t2Var, @NotNull Function2<? super androidx.compose.foundation.interaction.j, ? super z2, ? extends androidx.compose.ui.a0> function2) {
        androidx.compose.ui.a0 a0VarB2;
        if (t2Var instanceof z2) {
            a0VarB2 = function2.invoke(jVar, t2Var);
        } else if (t2Var == null) {
            a0VarB2 = function2.invoke(jVar, null);
        } else {
            a0VarB2 = jVar != null ? w2.d(androidx.compose.ui.a0.E, jVar, t2Var).B2(function2.invoke(jVar, null)) : androidx.compose.ui.m.k(androidx.compose.ui.a0.E, null, new f(t2Var, function2), 1, null);
        }
        return a0Var.B2(a0VarB2);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Maintained for binary compatibility")
    public static final /* synthetic */ androidx.compose.ui.a0 l(androidx.compose.ui.a0 a0Var, androidx.compose.foundation.interaction.j jVar, t2 t2Var, boolean z10, String str, androidx.compose.ui.semantics.j jVar2, String str2, Function0 function0, Function0 function1, Function0 function2) {
        androidx.compose.ui.a0 a0VarK;
        if (t2Var instanceof z2) {
            a0VarK = new CombinedClickableElement(jVar, (z2) t2Var, false, z10, str, jVar2, function2, str2, function0, function1, true, null);
        } else if (t2Var == null) {
            a0VarK = new CombinedClickableElement(jVar, null, false, z10, str, jVar2, function2, str2, function0, function1, true, null);
        } else if (jVar != null) {
            a0VarK = w2.d(androidx.compose.ui.a0.E, jVar, t2Var).B2(new CombinedClickableElement(jVar, null, false, z10, str, jVar2, function2, str2, function0, function1, true, null));
        } else {
            a0VarK = androidx.compose.ui.m.k(androidx.compose.ui.a0.E, null, new j(t2Var, z10, str, jVar2, function2, str2, function0, function1), 1, null);
        }
        return a0Var.B2(a0VarK);
    }

    public static /* synthetic */ androidx.compose.ui.a0 m(androidx.compose.ui.a0 a0Var, androidx.compose.foundation.interaction.j jVar, t2 t2Var, boolean z10, String str, androidx.compose.ui.semantics.j jVar2, String str2, Function0 function0, Function0 function1, Function0 function2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return l(a0Var, jVar, t2Var, z10, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : jVar2, (i10 & 32) != 0 ? null : str2, (i10 & 64) != 0 ? null : function0, (i10 & 128) != 0 ? null : function1, function2);
    }

    @NotNull
    public static final androidx.compose.ui.a0 n(@NotNull androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable t2 t2Var, boolean z10, @Nullable String str, @Nullable androidx.compose.ui.semantics.j jVar2, @Nullable String str2, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, boolean z11, @NotNull Function0<Unit> function2) {
        androidx.compose.ui.a0 a0VarK;
        if (t2Var instanceof z2) {
            a0VarK = new CombinedClickableElement(jVar, (z2) t2Var, false, z10, str, jVar2, function2, str2, function0, function1, z11, null);
        } else if (t2Var == null) {
            a0VarK = new CombinedClickableElement(jVar, null, false, z10, str, jVar2, function2, str2, function0, function1, z11, null);
        } else if (jVar != null) {
            a0VarK = w2.d(androidx.compose.ui.a0.E, jVar, t2Var).B2(new CombinedClickableElement(jVar, null, false, z10, str, jVar2, function2, str2, function0, function1, z11, null));
        } else {
            a0VarK = androidx.compose.ui.m.k(androidx.compose.ui.a0.E, null, new k(t2Var, z10, str, jVar2, function2, str2, function0, function1, z11), 1, null);
        }
        return a0Var.B2(a0VarK);
    }

    public static /* synthetic */ androidx.compose.ui.a0 o(androidx.compose.ui.a0 a0Var, androidx.compose.foundation.interaction.j jVar, t2 t2Var, boolean z10, String str, androidx.compose.ui.semantics.j jVar2, String str2, Function0 function0, Function0 function1, boolean z11, Function0 function2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            str = null;
        }
        if ((i10 & 16) != 0) {
            jVar2 = null;
        }
        if ((i10 & 32) != 0) {
            str2 = null;
        }
        if ((i10 & 64) != 0) {
            function0 = null;
        }
        if ((i10 & 128) != 0) {
            function1 = null;
        }
        if ((i10 & 256) != 0) {
            z11 = true;
        }
        return n(a0Var, jVar, t2Var, z10, str, jVar2, str2, function0, function1, z11, function2);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Maintained for binary compatibility")
    public static final /* synthetic */ androidx.compose.ui.a0 p(androidx.compose.ui.a0 a0Var, boolean z10, String str, androidx.compose.ui.semantics.j jVar, String str2, Function0 function0, Function0 function1, Function0 function2) {
        return androidx.compose.ui.m.f(a0Var, androidx.compose.ui.platform.r2.e() ? new l(z10, str, jVar, function2, function1, function0, str2) : androidx.compose.ui.platform.r2.b(), new i(z10, str, jVar, str2, function0, function1, function2));
    }

    public static /* synthetic */ androidx.compose.ui.a0 q(androidx.compose.ui.a0 a0Var, boolean z10, String str, androidx.compose.ui.semantics.j jVar, String str2, Function0 function0, Function0 function1, Function0 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            jVar = null;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        if ((i10 & 16) != 0) {
            function0 = null;
        }
        return p(a0Var, z10, str, jVar, str2, function0, (i10 & 32) != 0 ? null : function1, function2);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Replaced with new overload that only supports IndicationNodeFactory instances inside LocalIndication, and does not use composed")
    public static final /* synthetic */ androidx.compose.ui.a0 r(androidx.compose.ui.a0 a0Var, boolean z10, String str, androidx.compose.ui.semantics.j jVar, String str2, Function0 function0, Function0 function1, boolean z11, Function0 function2) {
        return androidx.compose.ui.m.f(a0Var, androidx.compose.ui.platform.r2.e() ? new m(z10, str, jVar, function2, function1, function0, str2, z11) : androidx.compose.ui.platform.r2.b(), new g(z10, str, jVar, str2, function0, function1, z11, function2));
    }

    public static /* synthetic */ androidx.compose.ui.a0 s(androidx.compose.ui.a0 a0Var, boolean z10, String str, androidx.compose.ui.semantics.j jVar, String str2, Function0 function0, Function0 function1, boolean z11, Function0 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            jVar = null;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        if ((i10 & 16) != 0) {
            function0 = null;
        }
        if ((i10 & 32) != 0) {
            function1 = null;
        }
        if ((i10 & 64) != 0) {
            z11 = true;
        }
        return r(a0Var, z10, str, jVar, str2, function0, function1, z11, function2);
    }

    @NotNull
    public static final androidx.compose.ui.a0 t(@NotNull androidx.compose.ui.a0 a0Var, boolean z10, @Nullable String str, @Nullable androidx.compose.ui.semantics.j jVar, @Nullable String str2, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, boolean z11, @Nullable androidx.compose.foundation.interaction.j jVar2, @NotNull Function0<Unit> function2) {
        if (s1.f18603h) {
            return a0Var.B2(new CombinedClickableElement(jVar2, null, true, z10, str, jVar, function2, str2, function0, function1, z11, null));
        }
        return androidx.compose.ui.m.f(a0Var, androidx.compose.ui.platform.r2.e() ? new n(z10, str, jVar, function2, function1, function0, str2, z11) : androidx.compose.ui.platform.r2.b(), new h(jVar2, z10, str, jVar, str2, function0, function1, z11, function2));
    }

    public static /* synthetic */ androidx.compose.ui.a0 u(androidx.compose.ui.a0 a0Var, boolean z10, String str, androidx.compose.ui.semantics.j jVar, String str2, Function0 function0, Function0 function1, boolean z11, androidx.compose.foundation.interaction.j jVar2, Function0 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            jVar = null;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        if ((i10 & 16) != 0) {
            function0 = null;
        }
        if ((i10 & 32) != 0) {
            function1 = null;
        }
        if ((i10 & 64) != 0) {
            z11 = true;
        }
        if ((i10 & 128) != 0) {
            jVar2 = null;
        }
        return t(a0Var, z10, str, jVar, str2, function0, function1, z11, jVar2, function2);
    }

    public static final boolean v(@NotNull androidx.compose.ui.node.p2 p2Var) {
        final kotlin.jvm.internal.i1.a aVar = new kotlin.jvm.internal.i1.a();
        androidx.compose.ui.node.q2.c(p2Var, androidx.compose.foundation.gestures.j4.f14666v, new Function1() { // from class: androidx.compose.foundation.h1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(i1.w(aVar, (androidx.compose.ui.node.p2) obj));
            }
        });
        return aVar.f312744a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public static final boolean w(kotlin.jvm.internal.i1.a aVar, androidx.compose.ui.node.p2 p2Var) {
        boolean z10;
        if (aVar.f312744a) {
            z10 = true;
        } else {
            Intrinsics.checkNotNull(p2Var, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode");
            if (((androidx.compose.foundation.gestures.j4) p2Var).v9()) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        aVar.f312744a = z10;
        return !z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean x(KeyEvent keyEvent) {
        if (!androidx.compose.ui.input.key.d.g(androidx.compose.ui.input.key.e.b(keyEvent), androidx.compose.ui.input.key.d.f38913b.b()) || !y(keyEvent)) {
            return false;
        }
        int i10 = 1 << 1;
        return true;
    }

    private static final boolean y(KeyEvent keyEvent) {
        long jA = androidx.compose.ui.input.key.e.a(keyEvent);
        androidx.compose.ui.input.key.b.a aVar = androidx.compose.ui.input.key.b.f38761b;
        return androidx.compose.ui.input.key.b.E4(jA, aVar.q0()) || androidx.compose.ui.input.key.b.E4(jA, aVar.E0()) || androidx.compose.ui.input.key.b.E4(jA, aVar.s2()) || androidx.compose.ui.input.key.b.E4(jA, aVar.m3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z(KeyEvent keyEvent) {
        return androidx.compose.ui.input.key.d.g(androidx.compose.ui.input.key.e.b(keyEvent), androidx.compose.ui.input.key.d.f38913b.a()) && y(keyEvent);
    }
}
