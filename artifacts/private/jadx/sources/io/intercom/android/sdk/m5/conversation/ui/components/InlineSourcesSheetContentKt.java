package io.intercom.android.sdk.m5.conversation.ui.components;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.ni;
import androidx.compose.material3.q50;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.y3;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.models.InlineSource;
import io.intercom.android.sdk.models.Source;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.LinkOpener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nInlineSourcesSheetContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineSourcesSheetContent.kt\nio/intercom/android/sdk/m5/conversation/ui/components/InlineSourcesSheetContentKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,207:1\n75#2:208\n113#3:209\n113#3:248\n113#3:249\n66#4:210\n87#5:211\n84#5,9:212\n94#5:253\n80#6,6:221\n87#6,3:236\n90#6,2:245\n94#6:252\n391#7,9:227\n400#7:247\n401#7,2:250\n4360#8,6:239\n204#9,13:254\n*S KotlinDebug\n*F\n+ 1 InlineSourcesSheetContent.kt\nio/intercom/android/sdk/m5/conversation/ui/components/InlineSourcesSheetContentKt\n*L\n51#1:208\n51#1:209\n56#1:248\n57#1:249\n51#1:210\n48#1:211\n48#1:212,9\n48#1:253\n48#1:221,6\n48#1:236,3\n48#1:245,2\n48#1:252\n48#1:227,9\n48#1:247\n48#1:250,2\n48#1:239,6\n66#1:254,13\n*E\n"})
public final class InlineSourcesSheetContentKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void InlineSourcesSheetContent(@NotNull final List<InlineSource> selectedSources, @NotNull final List<Source> sources, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        String strD;
        Intrinsics.checkNotNullParameter(selectedSources, "selectedSources");
        Intrinsics.checkNotNullParameter(sources, "sources");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-2127469664);
        androidx.compose.ui.a0 a0Var2 = (i11 & 4) != 0 ? androidx.compose.ui.a0.E : a0Var;
        androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
        androidx.compose.ui.a0 a0VarK = i6.k(i6.h(aVar, 0.0f, 1, null), 0.0f, androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(((Configuration) c0VarR.W(AndroidCompositionLocals_androidKt.f())).screenHeightDp) * 0.5f), 1, null);
        androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        androidx.compose.runtime.b1 b1VarK = c0VarR.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarK);
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
        androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
        androidx.compose.ui.a0 a0VarV = d5.v(d5.t(i6.h(aVar, 0.0f, 1, null), androidx.compose.ui.unit.h.r(40), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, androidx.compose.ui.unit.h.r(16), 7, null);
        if (sources.size() == 1) {
            c0VarR.E(504735737);
            strD = u0.i.d(R.string.intercom_source, c0VarR, 0);
            c0VarR.A();
        } else {
            c0VarR.E(504813144);
            strD = u0.i.d(R.string.intercom_sources, c0VarR, 0);
            c0VarR.A();
        }
        q50.t(strD, a0VarV, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04(), c0VarR, 48, 0, 131068);
        androidx.compose.foundation.lazy.h.h(null, null, null, false, null, null, null, false, null, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InlineSourcesSheetContentKt.InlineSourcesSheetContent$lambda$11$lambda$10(sources, selectedSources, (androidx.compose.foundation.lazy.w0) obj);
            }
        }, c0VarR, 0, 511);
        c0VarR.o();
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final androidx.compose.ui.a0 a0Var3 = a0Var2;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.l0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InlineSourcesSheetContentKt.InlineSourcesSheetContent$lambda$12(selectedSources, sources, a0Var3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InlineSourcesSheetContent$lambda$11$lambda$10(final List sources, final List selectedSources, androidx.compose.foundation.lazy.w0 LazyColumn) {
        Intrinsics.checkNotNullParameter(sources, "$sources");
        Intrinsics.checkNotNullParameter(selectedSources, "$selectedSources");
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final Function2 function2 = new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.m0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return InlineSourcesSheetContentKt.InlineSourcesSheetContent$lambda$11$lambda$10$lambda$0(((Integer) obj).intValue(), (Source) obj2);
            }
        };
        LazyColumn.A(sources.size(), new Function1<Integer, Object>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.InlineSourcesSheetContentKt$InlineSourcesSheetContent$lambda$11$lambda$10$$inlined$itemsIndexed$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i10) {
                return function2.invoke(Integer.valueOf(i10), sources.get(i10));
            }
        }, new Function1<Integer, Object>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.InlineSourcesSheetContentKt$InlineSourcesSheetContent$lambda$11$lambda$10$$inlined$itemsIndexed$default$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i10) {
                sources.get(i10);
                return null;
            }
        }, androidx.compose.runtime.internal.w.c(2039820996, true, new pj.o<androidx.compose.foundation.lazy.i, Integer, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.InlineSourcesSheetContentKt$InlineSourcesSheetContent$lambda$11$lambda$10$$inlined$itemsIndexed$default$3
            @Override // pj.o
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.lazy.i iVar, Integer num, androidx.compose.runtime.c0 c0Var, Integer num2) {
                invoke(iVar, num.intValue(), c0Var, num2.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            public final void invoke(androidx.compose.foundation.lazy.i iVar, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
                int i12;
                boolean z10;
                long jM690getBackground0d7_KjU;
                IntercomTheme intercomTheme;
                int i13;
                final long jM687getAdminBackground0d7_KjU;
                if ((i11 & 6) == 0) {
                    i12 = i11 | (c0Var.D(iVar) ? 4 : 2);
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    i12 |= c0Var.K(i10) ? 32 : 16;
                }
                if (!c0Var.h((i12 & com.planner5d.library.engine.input.f.b.F1) != 146, i12 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(2039820996, i12, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                final Source source = (Source) sources.get(i10);
                c0Var.E(-1170768112);
                List list = selectedSources;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z10 = false;
                            break;
                        } else if (Intrinsics.areEqual(((InlineSource) it.next()).getHref(), source.getUrl())) {
                            z10 = true;
                            break;
                        }
                    }
                } else {
                    z10 = false;
                    break;
                }
                final boolean zAreEqual = Intrinsics.areEqual(source.getType(), "article");
                final Context context = (Context) c0Var.W(AndroidCompositionLocals_androidKt.g());
                androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                androidx.compose.foundation.layout.q qVar = androidx.compose.foundation.layout.q.f16330a;
                androidx.compose.foundation.layout.q.m mVarY = qVar.y();
                androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(mVarY, aVar2.u(), c0Var, 0);
                int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
                androidx.compose.runtime.b1 b1VarK = c0Var.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, aVar);
                androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
                Function0<androidx.compose.ui.node.g> function0A = aVar3.a();
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
                y7.n(c0VarD, a1VarB, aVar3.e());
                y7.n(c0VarD, b1VarK, aVar3.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN, aVar3.f());
                androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
                androidx.compose.ui.e.c cVarQ = aVar2.q();
                if (z10) {
                    c0Var.E(328418136);
                    jM690getBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c0Var, IntercomTheme.$stable).m687getAdminBackground0d7_KjU();
                    c0Var.A();
                } else {
                    c0Var.E(328531069);
                    jM690getBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c0Var, IntercomTheme.$stable).m690getBackground0d7_KjU();
                    c0Var.A();
                }
                androidx.compose.ui.a0 a0VarJ = androidx.compose.foundation.i1.j(androidx.compose.foundation.v.d(aVar, jM690getBackground0d7_KjU, null, 2, null), false, null, null, null, new Function0<Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.InlineSourcesSheetContentKt$InlineSourcesSheetContent$1$1$2$1$1
                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.f312394a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        LinkOpener.handleUrl(source.getUrl(), context, Injector.get().getApi(), zAreEqual);
                    }
                }, 15, null);
                float f10 = 24;
                androidx.compose.ui.a0 a0VarV = d5.v(d5.t(a0VarJ, 0.0f, androidx.compose.ui.unit.h.r(f10), 1, null), 0.0f, 0.0f, androidx.compose.ui.unit.h.r(f10), 0.0f, 11, null);
                androidx.compose.ui.layout.a1 a1VarE = u5.e(qVar.w(), cVarQ, c0Var, 48);
                int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
                androidx.compose.runtime.b1 b1VarK2 = c0Var.k();
                androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0Var, a0VarV);
                Function0<androidx.compose.ui.node.g> function0A2 = aVar3.a();
                if (c0Var.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var.q();
                if (c0Var.P()) {
                    c0Var.q0(function0A2);
                } else {
                    c0Var.l();
                }
                androidx.compose.runtime.c0 c0VarD2 = y7.d(c0Var);
                y7.n(c0VarD2, a1VarE, aVar3.e());
                y7.n(c0VarD2, b1VarK2, aVar3.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar3.b();
                if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN2, aVar3.f());
                y5 y5Var = y5.f16577a;
                androidx.compose.ui.a0 a0VarB = i6.B(aVar, androidx.compose.ui.unit.h.r(40));
                androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                int iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
                androidx.compose.runtime.b1 b1VarK3 = c0Var.k();
                androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0Var, a0VarB);
                Function0<androidx.compose.ui.node.g> function0A3 = aVar3.a();
                if (c0Var.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var.q();
                if (c0Var.P()) {
                    c0Var.q0(function0A3);
                } else {
                    c0Var.l();
                }
                androidx.compose.runtime.c0 c0VarD3 = y7.d(c0Var);
                y7.n(c0VarD3, a1VarK, aVar3.e());
                y7.n(c0VarD3, b1VarK3, aVar3.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3 = aVar3.b();
                if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iHashCode3))) {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                }
                y7.n(c0VarD3, a0VarN3, aVar3.f());
                androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                String strValueOf = String.valueOf(i10 + 1);
                IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                int i14 = IntercomTheme.$stable;
                y3 type05 = intercomTheme2.getTypography(c0Var, i14).getType05();
                androidx.compose.ui.text.font.v0.a aVar4 = androidx.compose.ui.text.font.v0.f41742b;
                q50.t(strValueOf, d0Var.b(aVar, aVar2.i()), 0L, null, 0L, null, aVar4.k(), null, 0L, null, null, 0L, 0, false, 0, 0, null, type05, c0Var, 1572864, 0, 131004);
                c0Var.o();
                androidx.compose.ui.a0 a0VarH = i6.h(aVar, 0.0f, 1, null);
                float f11 = 8;
                androidx.compose.ui.layout.a1 a1VarB2 = androidx.compose.foundation.layout.j0.b(qVar.G(androidx.compose.ui.unit.h.r(f11)), aVar2.u(), c0Var, 6);
                int iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
                androidx.compose.runtime.b1 b1VarK4 = c0Var.k();
                androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0Var, a0VarH);
                Function0<androidx.compose.ui.node.g> function0A4 = aVar3.a();
                if (c0Var.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var.q();
                if (c0Var.P()) {
                    c0Var.q0(function0A4);
                } else {
                    c0Var.l();
                }
                androidx.compose.runtime.c0 c0VarD4 = y7.d(c0Var);
                y7.n(c0VarD4, a1VarB2, aVar3.e());
                y7.n(c0VarD4, b1VarK4, aVar3.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B4 = aVar3.b();
                if (c0VarD4.P() || !Intrinsics.areEqual(c0VarD4.i0(), Integer.valueOf(iHashCode4))) {
                    c0VarD4.Y(Integer.valueOf(iHashCode4));
                    c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                }
                y7.n(c0VarD4, a0VarN4, aVar3.f());
                androidx.compose.ui.layout.a1 a1VarE2 = u5.e(qVar.w(), aVar2.q(), c0Var, 48);
                int iHashCode5 = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
                androidx.compose.runtime.b1 b1VarK5 = c0Var.k();
                androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0Var, aVar);
                Function0<androidx.compose.ui.node.g> function0A5 = aVar3.a();
                if (c0Var.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var.q();
                if (c0Var.P()) {
                    c0Var.q0(function0A5);
                } else {
                    c0Var.l();
                }
                androidx.compose.runtime.c0 c0VarD5 = y7.d(c0Var);
                y7.n(c0VarD5, a1VarE2, aVar3.e());
                y7.n(c0VarD5, b1VarK5, aVar3.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B5 = aVar3.b();
                if (c0VarD5.P() || !Intrinsics.areEqual(c0VarD5.i0(), Integer.valueOf(iHashCode5))) {
                    c0VarD5.Y(Integer.valueOf(iHashCode5));
                    c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                }
                y7.n(c0VarD5, a0VarN5, aVar3.f());
                if (z10) {
                    c0Var.E(1230588762);
                    intercomTheme = intercomTheme2;
                    i13 = i14;
                    jM687getAdminBackground0d7_KjU = intercomTheme.getColors(c0Var, i13).m719getSourceBackground0d7_KjU();
                    c0Var.A();
                } else {
                    intercomTheme = intercomTheme2;
                    i13 = i14;
                    c0Var.E(1230702811);
                    jM687getAdminBackground0d7_KjU = intercomTheme.getColors(c0Var, i13).m687getAdminBackground0d7_KjU();
                    c0Var.A();
                }
                androidx.compose.ui.a0 a0VarW = i6.w(aVar, androidx.compose.ui.unit.h.r(f10));
                c0Var.E(455352025);
                boolean zL = c0Var.L(jM687getAdminBackground0d7_KjU);
                Object objI0 = c0Var.i0();
                if (zL || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1<androidx.compose.ui.graphics.drawscope.f, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.InlineSourcesSheetContentKt$InlineSourcesSheetContent$1$1$2$1$2$2$1$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.drawscope.f fVar) {
                            invoke2(fVar);
                            return Unit.f312394a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(androidx.compose.ui.graphics.drawscope.f drawBehind) {
                            Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
                            androidx.compose.ui.graphics.drawscope.f.B4(drawBehind, jM687getAdminBackground0d7_KjU, 0.0f, 0L, 0.0f, null, null, 0, okhttp3.internal.ws.g.f334652s, null);
                        }
                    };
                    c0Var.Y(objI0);
                }
                c0Var.A();
                androidx.compose.ui.a0 a0VarB2 = androidx.compose.ui.draw.n.b(a0VarW, (Function1) objI0);
                androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                int iHashCode6 = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
                androidx.compose.runtime.b1 b1VarK6 = c0Var.k();
                androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0Var, a0VarB2);
                Function0<androidx.compose.ui.node.g> function0A6 = aVar3.a();
                if (c0Var.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var.q();
                if (c0Var.P()) {
                    c0Var.q0(function0A6);
                } else {
                    c0Var.l();
                }
                androidx.compose.runtime.c0 c0VarD6 = y7.d(c0Var);
                y7.n(c0VarD6, a1VarK2, aVar3.e());
                y7.n(c0VarD6, b1VarK6, aVar3.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B6 = aVar3.b();
                if (c0VarD6.P() || !Intrinsics.areEqual(c0VarD6.i0(), Integer.valueOf(iHashCode6))) {
                    c0VarD6.Y(Integer.valueOf(iHashCode6));
                    c0VarD6.f(Integer.valueOf(iHashCode6), function2B6);
                }
                y7.n(c0VarD6, a0VarN6, aVar3.f());
                ni.o(u0.e.c(zAreEqual ? io.intercom.android.sdk.ui.R.drawable.intercom_ic_public_article : io.intercom.android.sdk.ui.R.drawable.intercom_ic_link, c0Var, 0), null, d0Var.b(i6.w(aVar, androidx.compose.ui.unit.h.r(12)), aVar2.i()), intercomTheme.getColors(c0Var, i13).m699getDescriptionText0d7_KjU(), c0Var, 56, 0);
                c0Var.o();
                l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(f11)), c0Var, 6);
                c0Var.E(455394169);
                String strD = zAreEqual ? u0.i.d(R.string.intercom_help_center_article, c0Var, 0) : InlineSourcesSheetContentKt.getHost(source.getUrl());
                c0Var.A();
                Intrinsics.checkNotNull(strD);
                q50.t(strD, null, intercomTheme.getColors(c0Var, i13).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0Var, i13).getType04Point5(), c0Var, 0, 0, 131066);
                c0Var.o();
                q50.t(source.getTitle(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3.m(intercomTheme.getTypography(c0Var, i13).getType04Point5(), 0L, 0L, aVar4.o(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), c0Var, 0, 0, 131070);
                c0Var.o();
                c0Var.o();
                IntercomDividerKt.IntercomDivider(null, c0Var, 0, 1);
                c0Var.o();
                c0Var.A();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            }
        }));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object InlineSourcesSheetContent$lambda$11$lambda$10$lambda$0(int i10, Source source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return source.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InlineSourcesSheetContent$lambda$12(List selectedSources, List sources, androidx.compose.ui.a0 a0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(selectedSources, "$selectedSources");
        Intrinsics.checkNotNullParameter(sources, "$sources");
        InlineSourcesSheetContent(selectedSources, sources, a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void InlineSourcesSheetContentPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1197768873);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$InlineSourcesSheetContentKt.INSTANCE.m205getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.j0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InlineSourcesSheetContentKt.InlineSourcesSheetContentPreview$lambda$13(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InlineSourcesSheetContentPreview$lambda$13(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        InlineSourcesSheetContentPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getHost(String str) {
        try {
            str = new URL(str).getHost();
        } catch (MalformedURLException unused) {
        }
        return str;
    }
}
