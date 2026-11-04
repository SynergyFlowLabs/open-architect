package io.intercom.android.sdk.helpcenter.search;

import android.app.Activity;
import android.view.Window;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.u7;
import androidx.compose.foundation.text.b4;
import androidx.compose.foundation.text.y3;
import androidx.compose.foundation.text.z3;
import androidx.compose.material3.ei;
import androidx.compose.material3.j40;
import androidx.compose.material3.n40;
import androidx.compose.material3.o1;
import androidx.compose.material3.u40;
import androidx.compose.material3.z90;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.internal.w;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t;
import androidx.compose.runtime.t4;
import androidx.compose.ui.a0;
import androidx.compose.ui.focus.g0;
import androidx.compose.ui.focus.j0;
import androidx.compose.ui.focus.q;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.platform.q1;
import androidx.compose.ui.text.input.b0;
import androidx.compose.ui.text.input.p0;
import androidx.core.view.k2;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nHelpCenterSearchTopBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelpCenterSearchTopBar.kt\nio/intercom/android/sdk/helpcenter/search/HelpCenterSearchTopBarKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,159:1\n1282#2,6:160\n1282#2,6:167\n1282#2,6:173\n1282#2,6:180\n75#3:166\n75#3:179\n85#4:186\n117#4,2:187\n*S KotlinDebug\n*F\n+ 1 HelpCenterSearchTopBar.kt\nio/intercom/android/sdk/helpcenter/search/HelpCenterSearchTopBarKt\n*L\n55#1:160,6\n57#1:167,6\n58#1:173,6\n74#1:180,6\n56#1:166\n62#1:179\n57#1:186\n57#1:187,2\n*E\n"})
public final class HelpCenterSearchTopBarKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$2, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.helpcenter.search.HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$2", f = "HelpCenterSearchTopBar.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ Function1<k0<String>, Unit> $onTextChanged;
        final /* synthetic */ k0<String> $textFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function1<? super k0<String>, Unit> function1, k0<String> k0Var, kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$onTextChanged = function1;
            this.$textFlow = k0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass2(this.$onTextChanged, this.$textFlow, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            this.$onTextChanged.invoke(this.$textFlow);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$4, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nHelpCenterSearchTopBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelpCenterSearchTopBar.kt\nio/intercom/android/sdk/helpcenter/search/HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$4\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,159:1\n113#2:160\n*S KotlinDebug\n*F\n+ 1 HelpCenterSearchTopBar.kt\nio/intercom/android/sdk/helpcenter/search/HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$4\n*L\n89#1:160\n*E\n"})
    static final class AnonymousClass4 implements Function2<c0, Integer, Unit> {
        final /* synthetic */ q $focusManager;
        final /* synthetic */ g0 $focusRequester;
        final /* synthetic */ Function1<String, Unit> $onSearchAction;
        final /* synthetic */ n3<String> $searchText$delegate;
        final /* synthetic */ k0<String> $textFlow;

        /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$4$3, reason: invalid class name */
        static final class AnonymousClass3 implements Function2<c0, Integer, Unit> {
            final /* synthetic */ n3<String> $searchText$delegate;
            final /* synthetic */ k0<String> $textFlow;

            AnonymousClass3(n3<String> n3Var, k0<String> k0Var) {
                this.$searchText$delegate = n3Var;
                this.$textFlow = k0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$0(k0 textFlow, n3 searchText$delegate) {
                Intrinsics.checkNotNullParameter(textFlow, "$textFlow");
                Intrinsics.checkNotNullParameter(searchText$delegate, "$searchText$delegate");
                HelpCenterSearchTopBarKt.HelpCenterSearchTopBar$lambda$3(searchText$delegate, "");
                textFlow.setValue("");
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
                invoke(c0Var, num.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            @t(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(c0 c0Var, int i10) {
                if ((i10 & 11) == 2 && c0Var.d()) {
                    c0Var.u();
                    return;
                }
                if (HelpCenterSearchTopBarKt.HelpCenterSearchTopBar$lambda$2(this.$searchText$delegate).length() > 0) {
                    final k0<String> k0Var = this.$textFlow;
                    final n3<String> n3Var = this.$searchText$delegate;
                    ei.D(new Function0() { // from class: io.intercom.android.sdk.helpcenter.search.e
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HelpCenterSearchTopBarKt.AnonymousClass4.AnonymousClass3.invoke$lambda$0(k0Var, n3Var);
                        }
                    }, null, false, null, null, null, ComposableSingletons$HelpCenterSearchTopBarKt.INSTANCE.m98getLambda2$intercom_sdk_base_release(), c0Var, 1572864, 62);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(g0 g0Var, n3<String> n3Var, Function1<? super String, Unit> function1, q qVar, k0<String> k0Var) {
            this.$focusRequester = g0Var;
            this.$searchText$delegate = n3Var;
            this.$onSearchAction = function1;
            this.$focusManager = qVar;
            this.$textFlow = k0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$0(Function1 onSearchAction, q focusManager, n3 searchText$delegate, y3 KeyboardActions) {
            Intrinsics.checkNotNullParameter(onSearchAction, "$onSearchAction");
            Intrinsics.checkNotNullParameter(focusManager, "$focusManager");
            Intrinsics.checkNotNullParameter(searchText$delegate, "$searchText$delegate");
            Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
            if (HelpCenterSearchTopBarKt.HelpCenterSearchTopBar$lambda$2(searchText$delegate).length() > 0) {
                onSearchAction.invoke(HelpCenterSearchTopBarKt.HelpCenterSearchTopBar$lambda$2(searchText$delegate));
                q.o(focusManager, false, 1, null);
            }
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1(k0 textFlow, n3 searchText$delegate, String newText) {
            Intrinsics.checkNotNullParameter(textFlow, "$textFlow");
            Intrinsics.checkNotNullParameter(searchText$delegate, "$searchText$delegate");
            Intrinsics.checkNotNullParameter(newText, "newText");
            HelpCenterSearchTopBarKt.HelpCenterSearchTopBar$lambda$3(searchText$delegate, newText);
            textFlow.setValue(newText);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            invoke(c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(c0 c0Var, int i10) {
            if ((i10 & 11) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            String strHelpCenterSearchTopBar$lambda$2 = HelpCenterSearchTopBarKt.HelpCenterSearchTopBar$lambda$2(this.$searchText$delegate);
            a0 a0VarA = j0.a(i6.i(i6.h(a0.E, 0.0f, 1, null), androidx.compose.ui.unit.h.r(56)), this.$focusRequester);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i11 = IntercomTheme.$stable;
            androidx.compose.ui.text.y3 type04 = intercomTheme.getTypography(c0Var, i11).getType04();
            b4 b4Var = new b4(0, (Boolean) null, b0.f41811b.o(), androidx.compose.ui.text.input.t.f41944b.m(), (p0) null, (Boolean) null, (y0.f) null, 115, (DefaultConstructorMarker) null);
            final Function1<String, Unit> function1 = this.$onSearchAction;
            final q qVar = this.$focusManager;
            final n3<String> n3Var = this.$searchText$delegate;
            z3 z3Var = new z3(null, null, null, null, new Function1() { // from class: io.intercom.android.sdk.helpcenter.search.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HelpCenterSearchTopBarKt.AnonymousClass4.invoke$lambda$0(function1, qVar, n3Var, (y3) obj);
                }
            }, null, 47, null);
            n40 n40Var = n40.f30917a;
            long jM714getPrimaryText0d7_KjU = intercomTheme.getColors(c0Var, i11).m714getPrimaryText0d7_KjU();
            long jM714getPrimaryText0d7_KjU2 = intercomTheme.getColors(c0Var, i11).m714getPrimaryText0d7_KjU();
            long jM714getPrimaryText0d7_KjU3 = intercomTheme.getColors(c0Var, i11).m714getPrimaryText0d7_KjU();
            q0.a aVar = q0.f38131b;
            j40 j40VarK = n40Var.k(jM714getPrimaryText0d7_KjU, jM714getPrimaryText0d7_KjU2, jM714getPrimaryText0d7_KjU3, 0L, aVar.s(), aVar.s(), aVar.s(), 0L, intercomTheme.getColors(c0Var, i11).m714getPrimaryText0d7_KjU(), 0L, null, aVar.s(), aVar.s(), aVar.s(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0Var, 1794048, 3504, 0, 0, 3072, 2147468936, 4095);
            final k0<String> k0Var = this.$textFlow;
            final n3<String> n3Var2 = this.$searchText$delegate;
            u40.h(strHelpCenterSearchTopBar$lambda$2, new Function1() { // from class: io.intercom.android.sdk.helpcenter.search.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HelpCenterSearchTopBarKt.AnonymousClass4.invoke$lambda$1(k0Var, n3Var2, (String) obj);
                }
            }, a0VarA, false, false, type04, null, ComposableSingletons$HelpCenterSearchTopBarKt.INSTANCE.m97getLambda1$intercom_sdk_base_release(), null, w.e(1908343233, true, new AnonymousClass3(this.$searchText$delegate, this.$textFlow), c0Var, 54), null, null, null, false, null, b4Var, z3Var, true, 0, 0, null, null, j40VarK, c0Var, 817889280, 12779520, 0, 3964248);
        }
    }

    @androidx.compose.runtime.o
    @t(applier = "androidx.compose.ui.UiComposable")
    public static final void HelpCenterSearchTopBar(@NotNull final Function0<Unit> onBackClick, @NotNull final Function1<? super k0<String>, Unit> onTextChanged, @NotNull final Function1<? super String, Unit> onSearchAction, @Nullable c0 c0Var, final int i10) {
        int i11;
        c0 c0Var2;
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(onTextChanged, "onTextChanged");
        Intrinsics.checkNotNullParameter(onSearchAction, "onSearchAction");
        c0 c0VarR = c0Var.R(1649601348);
        if ((i10 & 14) == 0) {
            i11 = (c0VarR.k0(onBackClick) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i11 |= c0VarR.k0(onTextChanged) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c0VarR.k0(onSearchAction) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && c0VarR.d()) {
            c0VarR.u();
            c0Var2 = c0VarR;
        } else {
            c0VarR.E(149283995);
            Object objI0 = c0VarR.i0();
            c0.a aVar = c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = new g0();
                c0VarR.Y(objI0);
            }
            g0 g0Var = (g0) objI0;
            c0VarR.A();
            q qVar = (q) c0VarR.W(q1.n());
            c0VarR.E(149287229);
            Object objI1 = c0VarR.i0();
            if (objI1 == aVar.a()) {
                objI1 = d7.g("", null, 2, null);
                c0VarR.Y(objI1);
            }
            n3 n3Var = (n3) objI1;
            c0VarR.A();
            c0VarR.E(149288863);
            Object objI2 = c0VarR.i0();
            if (objI2 == aVar.a()) {
                objI2 = b1.a("");
                c0VarR.Y(objI2);
            }
            k0 k0Var = (k0) objI2;
            c0VarR.A();
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i12 = IntercomTheme.$stable;
            final boolean z10 = !ColorExtensionsKt.m735isDarkColor8_81llA(intercomTheme.getColors(c0VarR, i12).m704getHeader0d7_KjU());
            Activity activity = (Activity) c0VarR.W(androidx.activity.compose.g.a());
            final Window window = activity != null ? activity.getWindow() : null;
            c0VarR.E(149295521);
            if (window != null) {
                b2.m(new Function0() { // from class: io.intercom.android.sdk.helpcenter.search.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HelpCenterSearchTopBarKt.HelpCenterSearchTopBar$lambda$6$lambda$5(window, z10);
                    }
                }, c0VarR, 0);
                Unit unit = Unit.f312394a;
            }
            c0VarR.A();
            Unit unit2 = Unit.f312394a;
            b2.i(unit2, new AnonymousClass2(onTextChanged, k0Var, null), c0VarR, 70);
            c0VarR.E(149307211);
            Object objI3 = c0VarR.i0();
            if (objI3 == aVar.a()) {
                objI3 = new HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$3$1(g0Var, null);
                c0VarR.Y(objI3);
            }
            c0VarR.A();
            b2.i(unit2, (Function2) objI3, c0VarR, 70);
            c0Var2 = c0VarR;
            o1.y0(w.e(-227105272, true, new AnonymousClass4(g0Var, n3Var, onSearchAction, qVar, k0Var), c0VarR, 54), u7.i(a0.E), w.e(-1996576886, true, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.helpcenter.search.HelpCenterSearchTopBarKt.HelpCenterSearchTopBar.5
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var3, Integer num) {
                    invoke(c0Var3, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(c0 c0Var3, int i13) {
                    if ((i13 & 11) == 2 && c0Var3.d()) {
                        c0Var3.u();
                        return;
                    }
                    int i14 = 6 << 0;
                    ei.D(onBackClick, null, false, null, null, null, ComposableSingletons$HelpCenterSearchTopBarKt.INSTANCE.m99getLambda3$intercom_sdk_base_release(), c0Var3, 1572864, 62);
                }
            }, c0VarR, 54), null, 0.0f, null, z90.f34997a.E(intercomTheme.getColors(c0VarR, i12).m704getHeader0d7_KjU(), 0L, intercomTheme.getColors(c0VarR, i12).m711getOnHeader0d7_KjU(), intercomTheme.getColors(c0VarR, i12).m711getOnHeader0d7_KjU(), intercomTheme.getColors(c0VarR, i12).m711getOnHeader0d7_KjU(), 0L, c0VarR, z90.f35007k << 18, 34), null, c0Var2, 390, 184);
        }
        s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.helpcenter.search.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HelpCenterSearchTopBarKt.HelpCenterSearchTopBar$lambda$8(onBackClick, onTextChanged, onSearchAction, i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String HelpCenterSearchTopBar$lambda$2(n3<String> n3Var) {
        return n3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HelpCenterSearchTopBar$lambda$3(n3<String> n3Var, String str) {
        n3Var.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HelpCenterSearchTopBar$lambda$6$lambda$5(Window it, boolean z10) {
        Intrinsics.checkNotNullParameter(it, "$it");
        k2.a(it, it.getDecorView()).i(z10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HelpCenterSearchTopBar$lambda$8(Function0 onBackClick, Function1 onTextChanged, Function1 onSearchAction, int i10, c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(onBackClick, "$onBackClick");
        Intrinsics.checkNotNullParameter(onTextChanged, "$onTextChanged");
        Intrinsics.checkNotNullParameter(onSearchAction, "$onSearchAction");
        HelpCenterSearchTopBar(onBackClick, onTextChanged, onSearchAction, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
