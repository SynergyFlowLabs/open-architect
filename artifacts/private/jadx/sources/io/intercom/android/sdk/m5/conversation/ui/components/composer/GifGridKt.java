package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.g5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.x5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.foundation.text.b4;
import androidx.compose.material3.n40;
import androidx.compose.material3.ni;
import androidx.compose.material3.q50;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.platform.c4;
import androidx.compose.ui.platform.z3;
import androidx.compose.ui.text.y3;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.block.ImageBlockKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
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
@SourceDebugExtension({"SMAP\nGifGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GifGrid.kt\nio/intercom/android/sdk/m5/conversation/ui/components/composer/GifGridKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt\n+ 11 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,176:1\n1282#2,6:177\n1282#2,6:183\n1282#2,6:267\n1282#2,6:273\n1282#2,6:280\n1282#2,6:299\n75#3:189\n87#4:190\n83#4,10:191\n94#4:297\n80#5,6:201\n87#5,3:216\n90#5,2:225\n80#5,6:240\n87#5,3:255\n90#5,2:264\n94#5:288\n94#5:296\n391#6,9:207\n400#6:227\n391#6,9:246\n400#6:266\n401#6,2:286\n401#6,2:294\n4360#7,6:219\n4360#7,6:258\n113#8:228\n113#8:229\n113#8:279\n113#8:290\n113#8:291\n113#8:292\n113#8:293\n113#8:298\n99#9:230\n96#9,9:231\n106#9:289\n425#10,10:305\n436#10,4:316\n1#11:315\n*S KotlinDebug\n*F\n+ 1 GifGrid.kt\nio/intercom/android/sdk/m5/conversation/ui/components/composer/GifGridKt\n*L\n58#1:177,6\n59#1:183,6\n88#1:267,6\n79#1:273,6\n119#1:280,6\n154#1:299,6\n60#1:189\n61#1:190\n61#1:191,10\n61#1:297\n61#1:201,6\n61#1:216,3\n61#1:225,2\n65#1:240,6\n65#1:255,3\n65#1:264,2\n65#1:288\n61#1:296\n61#1:207,9\n61#1:227\n65#1:246,9\n65#1:266\n65#1:286,2\n61#1:294,2\n61#1:219,6\n65#1:258,6\n68#1:228\n73#1:229\n117#1:279\n127#1:290\n132#1:291\n133#1:292\n134#1:293\n150#1:298\n65#1:230\n65#1:231,9\n65#1:289\n136#1:305,10\n136#1:316,4\n136#1:315\n*E\n"})
public final class GifGridKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void GifGrid(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final List<? extends Block> gifs, @NotNull final Function1<? super Block, Unit> onGifClick, @NotNull final Function1<? super String, Unit> onGifSearchQueryChange, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.runtime.c0 c0Var2;
        androidx.compose.foundation.interaction.j jVar;
        z3 z3Var;
        androidx.compose.ui.a0.a aVar;
        androidx.compose.foundation.layout.q qVar;
        n3 n3Var;
        Object obj;
        final n3 n3Var2;
        Object obj2;
        Intrinsics.checkNotNullParameter(gifs, "gifs");
        Intrinsics.checkNotNullParameter(onGifClick, "onGifClick");
        Intrinsics.checkNotNullParameter(onGifSearchQueryChange, "onGifSearchQueryChange");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(2027814826);
        androidx.compose.ui.a0 a0Var2 = (i11 & 1) != 0 ? androidx.compose.ui.a0.E : a0Var;
        c0VarR.E(-1549192846);
        Object objI0 = c0VarR.i0();
        androidx.compose.runtime.c0.a aVar2 = androidx.compose.runtime.c0.f35327a;
        if (objI0 == aVar2.a()) {
            objI0 = d7.g("", null, 2, null);
            c0VarR.Y(objI0);
        }
        n3 n3Var3 = (n3) objI0;
        c0VarR.A();
        c0VarR.E(-1549190918);
        Object objI1 = c0VarR.i0();
        if (objI1 == aVar2.a()) {
            objI1 = androidx.compose.foundation.interaction.i.a();
            c0VarR.Y(objI1);
        }
        androidx.compose.foundation.interaction.j jVar2 = (androidx.compose.foundation.interaction.j) objI1;
        c0VarR.A();
        z3 z3Var2 = (z3) c0VarR.W(androidx.compose.ui.platform.q1.y());
        androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
        androidx.compose.foundation.layout.q qVar2 = androidx.compose.foundation.layout.q.f16330a;
        androidx.compose.foundation.layout.q.m mVarY = qVar2.y();
        androidx.compose.ui.e.a aVar4 = androidx.compose.ui.e.f37317a;
        androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(mVarY, aVar4.u(), c0VarR, 0);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        androidx.compose.runtime.b1 b1VarK = c0VarR.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, aVar3);
        androidx.compose.ui.node.g.a aVar5 = androidx.compose.ui.node.g.I;
        Function0<androidx.compose.ui.node.g> function0A = aVar5.a();
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
        y7.n(c0VarD, a1VarB, aVar5.e());
        y7.n(c0VarD, b1VarK, aVar5.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar5.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar5.f());
        androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
        c0VarR.E(-1834338565);
        if (Intrinsics.areEqual(n3Var3.getValue(), "intercom version")) {
            qVar = qVar2;
            n3Var = n3Var3;
            jVar = jVar2;
            z3Var = z3Var2;
            obj = null;
            aVar = aVar3;
            q50.t("17.2.0", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, 0, 0, 262142);
            c0Var2 = c0VarR;
        } else {
            c0Var2 = c0VarR;
            jVar = jVar2;
            z3Var = z3Var2;
            aVar = aVar3;
            qVar = qVar2;
            n3Var = n3Var3;
            obj = null;
        }
        c0Var2.A();
        float f10 = 8;
        androidx.compose.ui.a0 a0VarT = d5.t(i6.h(aVar, 0.0f, 1, obj), androidx.compose.ui.unit.h.r(f10), 0.0f, 2, obj);
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i12 = IntercomTheme.$stable;
        androidx.compose.ui.a0 a0VarS = d5.s(androidx.compose.foundation.v.c(a0VarT, androidx.compose.ui.graphics.q0.w(intercomTheme.getColors(c0Var2, i12).m714getPrimaryText0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), intercomTheme.getShapes(c0Var2, i12).m()), androidx.compose.ui.unit.h.r(f10), androidx.compose.ui.unit.h.r(12));
        androidx.compose.ui.layout.a1 a1VarE = u5.e(qVar.w(), aVar4.q(), c0Var2, 48);
        int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
        androidx.compose.runtime.b1 b1VarK2 = c0Var2.k();
        androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0Var2, a0VarS);
        Function0<androidx.compose.ui.node.g> function0A2 = aVar5.a();
        if (c0Var2.S() == null) {
            androidx.compose.runtime.v.r();
        }
        c0Var2.q();
        if (c0Var2.P()) {
            c0Var2.q0(function0A2);
        } else {
            c0Var2.l();
        }
        androidx.compose.runtime.c0 c0VarD2 = y7.d(c0Var2);
        y7.n(c0VarD2, a1VarE, aVar5.e());
        y7.n(c0VarD2, b1VarK2, aVar5.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar5.b();
        if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
            c0VarD2.Y(Integer.valueOf(iHashCode2));
            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
        }
        y7.n(c0VarD2, a0VarN2, aVar5.f());
        y5 y5Var = y5.f16577a;
        String str = (String) n3Var.getValue();
        y3 type04 = intercomTheme.getTypography(c0Var2, i12).getType04();
        androidx.compose.ui.a0.a aVar6 = aVar;
        androidx.compose.ui.a0 a0VarQ = x5.q(y5Var, aVar6, 1.0f, false, 2, null);
        b4 b4VarG = b4.g(b4.f18781h.a(), 0, null, 0, androidx.compose.ui.text.input.t.f41944b.m(), null, null, null, 119, null);
        c0Var2.E(-1582275237);
        final z3 z3Var3 = z3Var;
        boolean zD = c0Var2.D(z3Var3);
        Object objI2 = c0Var2.i0();
        if (zD || objI2 == aVar2.a()) {
            objI2 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.b1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return GifGridKt.GifGrid$lambda$11$lambda$8$lambda$3$lambda$2(z3Var3, (androidx.compose.foundation.text.y3) obj3);
                }
            };
            c0Var2.Y(objI2);
        }
        c0Var2.A();
        androidx.compose.foundation.text.z3 z3Var4 = new androidx.compose.foundation.text.z3(null, null, null, null, (Function1) objI2, null, 47, null);
        c0Var2.E(-1582287683);
        int i13 = (i10 & 7168) ^ 3072;
        boolean z10 = (i13 > 2048 && c0Var2.D(onGifSearchQueryChange)) || (i10 & 3072) == 2048;
        Object objI3 = c0Var2.i0();
        if (z10 || objI3 == aVar2.a()) {
            n3Var2 = n3Var;
            objI3 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.c1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return GifGridKt.GifGrid$lambda$11$lambda$8$lambda$5$lambda$4(n3Var2, onGifSearchQueryChange, (String) obj3);
                }
            };
            c0Var2.Y(objI3);
        } else {
            n3Var2 = n3Var;
        }
        c0Var2.A();
        final androidx.compose.foundation.interaction.j jVar3 = jVar;
        final n3 n3Var4 = n3Var2;
        androidx.compose.runtime.c0 c0Var3 = c0Var2;
        final androidx.compose.ui.a0 a0Var3 = a0Var2;
        androidx.compose.foundation.text.s0.z(str, (Function1) objI3, a0VarQ, false, false, type04, b4VarG, z3Var4, true, 0, 0, null, null, null, null, androidx.compose.runtime.internal.w.e(1827261249, true, new pj.n<Function2<? super androidx.compose.runtime.c0, ? super Integer, ? extends Unit>, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt$GifGrid$1$1$3
            @Override // pj.n
            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super androidx.compose.runtime.c0, ? super Integer, ? extends Unit> function2, androidx.compose.runtime.c0 c0Var4, Integer num) {
                invoke((Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit>) function2, c0Var4, num.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
            public final void invoke(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> it, androidx.compose.runtime.c0 c0Var4, int i14) {
                androidx.compose.runtime.c0 c0Var5;
                int i15;
                Intrinsics.checkNotNullParameter(it, "it");
                if ((i14 & 14) == 0) {
                    c0Var5 = c0Var4;
                    i15 = i14 | (c0Var5.k0(it) ? 4 : 2);
                } else {
                    c0Var5 = c0Var4;
                    i15 = i14;
                }
                if ((i15 & 91) == 18 && c0Var5.d()) {
                    c0Var5.u();
                    return;
                }
                n40 n40Var = n40.f30917a;
                String value = n3Var2.getValue();
                androidx.compose.ui.text.input.j1 j1VarC = androidx.compose.ui.text.input.j1.f41895a.c();
                g5 g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                androidx.compose.ui.graphics.q0.a aVar7 = androidx.compose.ui.graphics.q0.f38131b;
                n40Var.h(value, it, true, true, j1VarC, jVar3, false, null, ComposableSingletons$GifGridKt.INSTANCE.m244getLambda1$intercom_sdk_base_release(), null, null, null, null, null, null, n40Var.k(0L, 0L, 0L, 0L, aVar7.s(), aVar7.s(), 0L, 0L, 0L, 0L, null, aVar7.s(), aVar7.s(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0Var5, 221184, 432, 0, 0, 3072, 2147477455, 4095), g5VarF, null, c0Var4, ((i15 << 3) & com.planner5d.library.engine.input.f.b.B) | 100887936, 102236160, 163520);
            }
        }, c0Var2, 54), c0Var3, 100663296, androidx.profileinstaller.n.c.f73814m, 32280);
        l6.a(i6.B(aVar6, androidx.compose.ui.unit.h.r(f10)), c0Var3, 6);
        if (((CharSequence) n3Var4.getValue()).length() > 0) {
            c0Var3.E(-1804490114);
            int i14 = R.drawable.intercom_close;
            c0Var3.E(-1582228259);
            boolean z11 = (i13 > 2048 && c0Var3.D(onGifSearchQueryChange)) || (i10 & 3072) == 2048;
            Object objI4 = c0Var3.i0();
            if (z11 || objI4 == aVar2.a()) {
                objI4 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.d1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GifGridKt.GifGrid$lambda$11$lambda$8$lambda$7$lambda$6(n3Var4, onGifSearchQueryChange);
                    }
                };
                c0Var3.Y(objI4);
            }
            c0Var3.A();
            GifGridIcon(i14, (Function0) objI4, c0Var3, 0, 0);
            c0Var3.A();
            obj2 = null;
        } else {
            c0Var3.E(-1804309663);
            obj2 = null;
            GifGridIcon(R.drawable.intercom_gif_search_icon, null, c0Var3, 0, 2);
            c0Var3.A();
        }
        c0Var3.o();
        l6.a(i6.i(aVar6, androidx.compose.ui.unit.h.r(4)), c0Var3, 6);
        androidx.compose.foundation.lazy.staggeredgrid.k.k(new androidx.compose.foundation.lazy.staggeredgrid.e1.b(3), i6.h(a0Var3, 0.0f, 1, obj2), null, d5.f(androidx.compose.ui.unit.h.r(f10)), false, androidx.compose.ui.unit.h.r(f10), qVar.G(androidx.compose.ui.unit.h.r(f10)), null, false, null, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.e1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return GifGridKt.GifGrid$lambda$11$lambda$10(gifs, onGifClick, (androidx.compose.foundation.lazy.staggeredgrid.o0) obj3);
            }
        }, c0Var3, 1772544, 0, 916);
        c0Var3.o();
        s5 s5VarT = c0Var3.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.f1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return GifGridKt.GifGrid$lambda$12(a0Var3, gifs, onGifClick, onGifSearchQueryChange, i10, i11, (androidx.compose.runtime.c0) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GifGrid$lambda$11$lambda$10(final List gifs, final Function1 onGifClick, androidx.compose.foundation.lazy.staggeredgrid.o0 LazyVerticalStaggeredGrid) {
        Intrinsics.checkNotNullParameter(gifs, "$gifs");
        Intrinsics.checkNotNullParameter(onGifClick, "$onGifClick");
        Intrinsics.checkNotNullParameter(LazyVerticalStaggeredGrid, "$this$LazyVerticalStaggeredGrid");
        LazyVerticalStaggeredGrid.u(gifs.size(), null, new Function1<Integer, Object>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt$GifGrid$lambda$11$lambda$10$$inlined$itemsIndexed$default$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i10) {
                gifs.get(i10);
                return null;
            }
        }, null, androidx.compose.runtime.internal.w.c(-1466459515, true, new pj.o<androidx.compose.foundation.lazy.staggeredgrid.x, Integer, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt$GifGrid$lambda$11$lambda$10$$inlined$itemsIndexed$default$4
            @Override // pj.o
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.lazy.staggeredgrid.x xVar, Integer num, androidx.compose.runtime.c0 c0Var, Integer num2) {
                invoke(xVar, num.intValue(), c0Var, num2.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            public final void invoke(androidx.compose.foundation.lazy.staggeredgrid.x xVar, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
                int i12;
                if ((i11 & 6) == 0) {
                    i12 = (c0Var.D(xVar) ? 4 : 2) | i11;
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
                    androidx.compose.runtime.m0.A0(-1466459515, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed.<anonymous> (LazyStaggeredGridDsl.kt:436)");
                }
                Block block = (Block) gifs.get(i10);
                c0Var.E(-1572851321);
                ImageBlockKt.ImageBlock(block, null, onGifClick, true, null, c0Var, 3080, 18);
                c0Var.A();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            }
        }));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GifGrid$lambda$11$lambda$8$lambda$3$lambda$2(z3 z3Var, androidx.compose.foundation.text.y3 KeyboardActions) {
        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
        if (z3Var != null) {
            z3Var.b();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GifGrid$lambda$11$lambda$8$lambda$5$lambda$4(n3 searchText, Function1 onGifSearchQueryChange, String it) {
        Intrinsics.checkNotNullParameter(searchText, "$searchText");
        Intrinsics.checkNotNullParameter(onGifSearchQueryChange, "$onGifSearchQueryChange");
        Intrinsics.checkNotNullParameter(it, "it");
        searchText.setValue(it);
        onGifSearchQueryChange.invoke(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GifGrid$lambda$11$lambda$8$lambda$7$lambda$6(n3 searchText, Function1 onGifSearchQueryChange) {
        Intrinsics.checkNotNullParameter(searchText, "$searchText");
        Intrinsics.checkNotNullParameter(onGifSearchQueryChange, "$onGifSearchQueryChange");
        searchText.setValue("");
        onGifSearchQueryChange.invoke("");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GifGrid$lambda$12(androidx.compose.ui.a0 a0Var, List gifs, Function1 onGifClick, Function1 onGifSearchQueryChange, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(gifs, "$gifs");
        Intrinsics.checkNotNullParameter(onGifClick, "$onGifClick");
        Intrinsics.checkNotNullParameter(onGifSearchQueryChange, "$onGifSearchQueryChange");
        GifGrid(a0Var, gifs, onGifClick, onGifSearchQueryChange, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    /* JADX WARN: Code duplicated, block: B:36:0x0079  */
    /* JADX WARN: Code duplicated, block: B:39:0x0084  */
    /* JADX WARN: Code duplicated, block: B:42:0x008b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0093  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void GifGridIcon(@androidx.annotation.v final int i10, Function0<Unit> function0, androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        int i13;
        Function0<Unit> function1;
        final Function0<Unit> function2;
        boolean z10;
        boolean z11;
        Object objI0;
        s5 s5VarT;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1949834895);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (c0VarR.K(i10) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 == 0) {
            if ((i11 & com.planner5d.library.engine.input.f.b.B) == 0) {
                function1 = function0;
                i13 |= c0VarR.k0(function1) ? 32 : 16;
            }
            if ((i13 & 91) == 18 || !c0VarR.d()) {
                if (i14 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                androidx.compose.ui.a0 a0VarA = c4.a(i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), String.valueOf(i10));
                if (function2 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                c0VarR.E(-2076063811);
                z11 = (i13 & com.planner5d.library.engine.input.f.b.B) == 32;
                objI0 = c0VarR.i0();
                if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.g1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GifGridKt.GifGridIcon$lambda$14$lambda$13(function2);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                ni.o(u0.e.c(i10, c0VarR, i13 & 14), null, androidx.compose.foundation.i1.j(a0VarA, z10, null, null, null, (Function0) objI0, 14, null), IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m685getActionContrastWhite0d7_KjU(), c0VarR, 56, 0);
            } else {
                c0VarR.u();
                function2 = function1;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.h1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GifGridKt.GifGridIcon$lambda$15(i10, function2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 48;
        function1 = function0;
        if ((i13 & 91) == 18) {
            if (i14 != 0) {
                function2 = null;
            } else {
                function2 = function1;
            }
            androidx.compose.ui.a0 a0VarA2 = c4.a(i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), String.valueOf(i10));
            if (function2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            c0VarR.E(-2076063811);
            if ((i13 & com.planner5d.library.engine.input.f.b.B) == 32) {
            }
            objI0 = c0VarR.i0();
            if (z11) {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.g1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GifGridKt.GifGridIcon$lambda$14$lambda$13(function2);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.g1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GifGridKt.GifGridIcon$lambda$14$lambda$13(function2);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            ni.o(u0.e.c(i10, c0VarR, i13 & 14), null, androidx.compose.foundation.i1.j(a0VarA2, z10, null, null, null, (Function0) objI0, 14, null), IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m685getActionContrastWhite0d7_KjU(), c0VarR, 56, 0);
        } else {
            if (i14 != 0) {
                function2 = null;
            } else {
                function2 = function1;
            }
            androidx.compose.ui.a0 a0VarA3 = c4.a(i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), String.valueOf(i10));
            if (function2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            c0VarR.E(-2076063811);
            if ((i13 & com.planner5d.library.engine.input.f.b.B) == 32) {
            }
            objI0 = c0VarR.i0();
            if (z11) {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.g1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GifGridKt.GifGridIcon$lambda$14$lambda$13(function2);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.g1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GifGridKt.GifGridIcon$lambda$14$lambda$13(function2);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            ni.o(u0.e.c(i10, c0VarR, i13 & 14), null, androidx.compose.foundation.i1.j(a0VarA3, z10, null, null, null, (Function0) objI0, 14, null), IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m685getActionContrastWhite0d7_KjU(), c0VarR, 56, 0);
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.h1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GifGridKt.GifGridIcon$lambda$15(i10, function2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GifGridIcon$lambda$14$lambda$13(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GifGridIcon$lambda$15(int i10, Function0 function0, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        GifGridIcon(i10, function0, c0Var, t4.a(i11 | 1), i12);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void PreviewGifGrid(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1512591839);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            int i11 = 4 | 0;
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$GifGridKt.INSTANCE.m246getLambda3$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.a1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GifGridKt.PreviewGifGrid$lambda$16(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewGifGrid$lambda$16(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        PreviewGifGrid(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
