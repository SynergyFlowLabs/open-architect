package androidx.compose.ui.tooling;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.g5;
import androidx.compose.material.a9;
import androidx.compose.material.fe;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.e6;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.l3;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.y7;
import androidx.compose.ui.layout.a1;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPreviewActivity.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewActivity.android.kt\nandroidx/compose/ui/tooling/PreviewActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n1#2:140\n*E\n"})
public final class PreviewActivity extends androidx.activity.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f42355b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f42356a = "PreviewActivity";

    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f42357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f42358b;

        a(String str, String str2) {
            this.f42357a = str;
            this.f42358b = str2;
        }

        @androidx.compose.runtime.o
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) throws Exception {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(-840626948, i10, -1, "androidx.compose.ui.tooling.PreviewActivity.setComposableContent.<anonymous> (PreviewActivity.android.kt:74)");
            }
            androidx.compose.ui.tooling.a.f42371a.h(this.f42357a, this.f42358b, c0Var, new Object[0]);
            if (m0.l0()) {
                m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) throws Exception {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nPreviewActivity.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewActivity.android.kt\nandroidx/compose/ui/tooling/PreviewActivity$setParameterizedContent$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,139:1\n1282#2,6:140\n*S KotlinDebug\n*F\n+ 1 PreviewActivity.android.kt\nandroidx/compose/ui/tooling/PreviewActivity$setParameterizedContent$1\n*L\n104#1:140,6\n*E\n"})
    static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object[] f42359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f42360b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f42361c;

        @SourceDebugExtension({"SMAP\nPreviewActivity.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewActivity.android.kt\nandroidx/compose/ui/tooling/PreviewActivity$setParameterizedContent$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,139:1\n1282#2,6:140\n*S KotlinDebug\n*F\n+ 1 PreviewActivity.android.kt\nandroidx/compose/ui/tooling/PreviewActivity$setParameterizedContent$1$1\n*L\n120#1:140,6\n*E\n"})
        static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Object[] f42362a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l3 f42363b;

            a(Object[] objArr, l3 l3Var) {
                this.f42362a = objArr;
                this.f42363b = l3Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(l3 l3Var, Object[] objArr) {
                l3Var.j((l3Var.m1() + 1) % objArr.length);
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            public final void d(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (m0.l0()) {
                    m0.A0(958604965, i10, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous>.<anonymous> (PreviewActivity.android.kt:117)");
                }
                Function2<androidx.compose.runtime.c0, Integer, Unit> function2A = androidx.compose.ui.tooling.c.f42497a.a();
                boolean zK0 = c0Var.k0(this.f42362a);
                final l3 l3Var = this.f42363b;
                final Object[] objArr = this.f42362a;
                Object objI0 = c0Var.i0();
                if (zK0 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function0() { // from class: androidx.compose.ui.tooling.s
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PreviewActivity.b.a.f(l3Var, objArr);
                        }
                    };
                    c0Var.Y(objI0);
                }
                a9.d(function2A, (Function0) objI0, null, null, null, null, 0L, 0L, null, c0Var, 6, androidx.constraintlayout.core.motion.utils.v.g.f44096p);
                if (m0.l0()) {
                    m0.z0();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
                d(c0Var, num.intValue());
                return Unit.f312394a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.tooling.PreviewActivity$b$b, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nPreviewActivity.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewActivity.android.kt\nandroidx/compose/ui/tooling/PreviewActivity$setParameterizedContent$1$2\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,139:1\n70#2:140\n67#2,9:141\n77#2:180\n80#3,6:150\n87#3,3:165\n90#3,2:174\n94#3:179\n391#4,9:156\n400#4,3:176\n4360#5,6:168\n*S KotlinDebug\n*F\n+ 1 PreviewActivity.android.kt\nandroidx/compose/ui/tooling/PreviewActivity$setParameterizedContent$1$2\n*L\n108#1:140\n108#1:141,9\n108#1:180\n108#1:150,6\n108#1:165,3\n108#1:174,2\n108#1:179\n108#1:156,9\n108#1:176,3\n108#1:168,6\n*E\n"})
        static final class C0341b implements pj.n<g5, androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f42364a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f42365b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object[] f42366c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ l3 f42367d;

            C0341b(String str, String str2, Object[] objArr, l3 l3Var) {
                this.f42364a = str;
                this.f42365b = str2;
                this.f42366c = objArr;
                this.f42367d = l3Var;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(g5 g5Var, androidx.compose.runtime.c0 c0Var, int i10) throws Exception {
                if ((i10 & 6) == 0) {
                    i10 |= c0Var.D(g5Var) ? 4 : 2;
                }
                if (!c0Var.h((i10 & 19) != 18, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (m0.l0()) {
                    m0.A0(57310875, i10, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous>.<anonymous> (PreviewActivity.android.kt:107)");
                }
                androidx.compose.ui.a0 a0VarP = d5.p(androidx.compose.ui.a0.E, g5Var);
                String str = this.f42364a;
                String str2 = this.f42365b;
                Object[] objArr = this.f42366c;
                l3 l3Var = this.f42367d;
                a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
                b1 b1VarK = c0Var.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarP);
                androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
                Function0<androidx.compose.ui.node.g> function0A = aVar.a();
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
                y7.n(c0VarD, a1VarK, aVar.e());
                y7.n(c0VarD, b1VarK, aVar.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN, aVar.f());
                androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                androidx.compose.ui.tooling.a.f42371a.h(str, str2, c0Var, objArr[l3Var.m1()]);
                c0Var.o();
                if (m0.l0()) {
                    m0.z0();
                }
            }

            @Override // pj.n
            public /* bridge */ /* synthetic */ Unit invoke(g5 g5Var, androidx.compose.runtime.c0 c0Var, Integer num) throws Exception {
                c(g5Var, c0Var, num.intValue());
                return Unit.f312394a;
            }
        }

        b(Object[] objArr, String str, String str2) {
            this.f42359a = objArr;
            this.f42360b = str;
            this.f42361c = str2;
        }

        @androidx.compose.runtime.o
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(-861939235, i10, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous> (PreviewActivity.android.kt:103)");
            }
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = e6.b(0);
                c0Var.Y(objI0);
            }
            l3 l3Var = (l3) objI0;
            fe.h(null, null, null, null, null, androidx.compose.runtime.internal.w.e(958604965, true, new a(this.f42359a, l3Var), c0Var, 54), 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, androidx.compose.runtime.internal.w.e(57310875, true, new C0341b(this.f42360b, this.f42361c, this.f42359a, l3Var), c0Var, 54), c0Var, androidx.profileinstaller.n.c.f73814m, 12582912, 131039);
            if (m0.l0()) {
                m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class c implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f42368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f42369b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object[] f42370c;

        c(String str, String str2, Object[] objArr) {
            this.f42368a = str;
            this.f42369b = str2;
            this.f42370c = objArr;
        }

        @androidx.compose.runtime.o
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) throws Exception {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(-1901447514, i10, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous> (PreviewActivity.android.kt:128)");
            }
            androidx.compose.ui.tooling.a aVar = androidx.compose.ui.tooling.a.f42371a;
            String str = this.f42368a;
            String str2 = this.f42369b;
            Object[] objArr = this.f42370c;
            aVar.h(str, str2, c0Var, Arrays.copyOf(objArr, objArr.length));
            if (m0.l0()) {
                m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) throws Exception {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    private final void w(String str) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        String strA5 = StringsKt.A5(str, '.', null, 2, null);
        String strS5 = StringsKt.s5(str, '.', null, 2, null);
        String stringExtra = getIntent().getStringExtra("parameterProviderClassName");
        if (stringExtra != null) {
            x(strA5, strS5, stringExtra);
        } else {
            androidx.activity.compose.f.b(this, null, androidx.compose.runtime.internal.w.c(-840626948, true, new a(strA5, strS5)), 1, null);
        }
    }

    private final void x(String str, String str2, String str3) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object[] objArrF = v.f(v.a(str3), getIntent().getIntExtra("parameterProviderIndex", -1));
        if (objArrF.length > 1) {
            androidx.activity.compose.f.b(this, null, androidx.compose.runtime.internal.w.c(-861939235, true, new b(objArrF, str, str2)), 1, null);
        } else {
            androidx.activity.compose.f.b(this, null, androidx.compose.runtime.internal.w.c(-1901447514, true, new c(str, str2, objArrF)), 1, null);
        }
    }

    @Override // androidx.activity.l, androidx.core.app.m, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        String stringExtra;
        super.onCreate(bundle);
        if ((getApplicationInfo().flags & 2) == 0) {
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent != null && (stringExtra = intent.getStringExtra(androidx.navigation.compose.e.f70674g)) != null) {
            w(stringExtra);
        }
    }
}
