package io.intercom.android.sdk.m5.home.ui;

import android.content.Context;
import android.view.Window;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.t4;
import androidx.core.view.k2;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.m5.home.HomeViewModel;
import io.intercom.android.sdk.m5.home.states.HomeUiEffects;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.models.PoweredBy;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.LinkOpener;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.a0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nHomeScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeScreen.kt\nio/intercom/android/sdk/m5/home/ui/HomeScreenKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,272:1\n1282#2,6:273\n1282#2,6:363\n75#3:279\n75#3:360\n70#4:280\n66#4,10:281\n70#4:369\n67#4,9:370\n77#4:409\n77#4:413\n80#5,6:291\n87#5,3:306\n90#5,2:315\n80#5,6:328\n87#5,3:343\n90#5,2:352\n94#5:358\n80#5,6:379\n87#5,3:394\n90#5,2:403\n94#5:408\n94#5:412\n391#6,9:297\n400#6:317\n391#6,9:334\n400#6:354\n401#6,2:356\n391#6,9:385\n400#6,3:405\n401#6,2:410\n4360#7,6:309\n4360#7,6:346\n4360#7,6:397\n87#8:318\n84#8,9:319\n94#8:359\n113#9:355\n113#9:361\n113#9:362\n*S KotlinDebug\n*F\n+ 1 HomeScreen.kt\nio/intercom/android/sdk/m5/home/ui/HomeScreenKt\n*L\n79#1:273,6\n236#1:363,6\n91#1:279\n197#1:360\n97#1:280\n97#1:281,10\n229#1:369\n229#1:370,9\n229#1:409\n97#1:413\n97#1:291,6\n97#1:306,3\n97#1:315,2\n119#1:328,6\n119#1:343,3\n119#1:352,2\n119#1:358\n229#1:379,6\n229#1:394,3\n229#1:403,2\n229#1:408\n97#1:412\n97#1:297,9\n97#1:317\n119#1:334,9\n119#1:354\n119#1:356,2\n229#1:385,9\n229#1:405,3\n97#1:410,2\n97#1:309,6\n119#1:346,6\n229#1:397,6\n119#1:318\n119#1:319,9\n119#1:359\n195#1:355\n232#1:361\n235#1:362\n*E\n"})
public final class HomeScreenKt {
    private static final int ANIMATION_DURATION = 600;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.ui.HomeScreenKt$HomeScreen$1, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.home.ui.HomeScreenKt$HomeScreen$1", f = "HomeScreen.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160705l0}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ HomeViewModel $homeViewModel;
        final /* synthetic */ Function1<String, Unit> $navigateToExistingConversation;
        final /* synthetic */ Function0<Unit> $navigateToMessages;
        final /* synthetic */ Function0<Unit> $navigateToNewConversation;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(HomeViewModel homeViewModel, Function0<Unit> function0, Function0<Unit> function1, Function1<? super String, Unit> function2, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$homeViewModel = homeViewModel;
            this.$navigateToMessages = function0;
            this.$navigateToNewConversation = function1;
            this.$navigateToExistingConversation = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass1(this.$homeViewModel, this.$navigateToMessages, this.$navigateToNewConversation, this.$navigateToExistingConversation, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                o0<HomeUiEffects> effect = this.$homeViewModel.getEffect();
                final Function0<Unit> function0 = this.$navigateToMessages;
                final Function0<Unit> function1 = this.$navigateToNewConversation;
                final Function1<String, Unit> function2 = this.$navigateToExistingConversation;
                kotlinx.coroutines.flow.j<? super HomeUiEffects> jVar = new kotlinx.coroutines.flow.j() { // from class: io.intercom.android.sdk.m5.home.ui.HomeScreenKt.HomeScreen.1.1
                    @Override // kotlinx.coroutines.flow.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.d dVar) {
                        return emit((HomeUiEffects) obj2, (kotlin.coroutines.d<? super Unit>) dVar);
                    }

                    public final Object emit(HomeUiEffects homeUiEffects, kotlin.coroutines.d<? super Unit> dVar) {
                        if (Intrinsics.areEqual(homeUiEffects, HomeUiEffects.NavigateToMessages.INSTANCE)) {
                            function0.invoke();
                        } else if (Intrinsics.areEqual(homeUiEffects, HomeUiEffects.NavigateToNewConversation.INSTANCE)) {
                            function1.invoke();
                        } else {
                            if (!(homeUiEffects instanceof HomeUiEffects.NavigateToConversation)) {
                                throw new k0();
                            }
                            function2.invoke(((HomeUiEffects.NavigateToConversation) homeUiEffects).getConversationId());
                        }
                        return Unit.f312394a;
                    }
                };
                this.label = 1;
                if (effect.collect(jVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            throw new a0();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r48v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r48v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v18 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v18 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v19 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v19 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v34 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v34 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v26 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v26 ??, new type: io.intercom.android.sdk.utilities.ThemeUtils
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to set immutable type for var: r48v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r48v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$0(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v35 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void HomeScreen(@org.jetbrains.annotations.NotNull io.intercom.android.sdk.m5.home.HomeViewModel r34, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r35, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r36, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r37, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r38, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r39, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r40, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r41, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r42, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super io.intercom.android.sdk.models.Conversation, kotlin.Unit> r43, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r44, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super io.intercom.android.sdk.blocks.lib.models.TicketType, kotlin.Unit> r45, @org.jetbrains.annotations.Nullable androidx.compose.runtime.c0 r46, int r47, int r48) {
        /*
            Method dump skipped, instruction units count: 1335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.home.ui.HomeScreenKt.HomeScreen(io.intercom.android.sdk.m5.home.HomeViewModel, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.c0, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeScreen$lambda$11$lambda$10$lambda$8$lambda$7(Function0 onCloseClick) {
        Intrinsics.checkNotNullParameter(onCloseClick, "$onCloseClick");
        onCloseClick.invoke();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeScreen$lambda$11$lambda$5$lambda$4(PoweredBy poweredBy, Context context) {
        Intrinsics.checkNotNullParameter(poweredBy, "$poweredBy");
        Intrinsics.checkNotNullParameter(context, "$context");
        Injector.get().getMetricTracker().clickedPoweredBy("home");
        LinkOpener.handleUrl(poweredBy.getLinkUrl(), context, Injector.get().getApi());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeScreen$lambda$12(HomeViewModel homeViewModel, Function0 onMessagesClicked, Function0 onHelpClicked, Function0 onTicketsClicked, Function1 onTicketItemClicked, Function0 navigateToMessages, Function0 navigateToNewConversation, Function1 navigateToExistingConversation, Function0 onNewConversationClicked, Function1 onConversationClicked, Function0 onCloseClick, Function1 onTicketLinkClicked, int i10, int i11, c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(homeViewModel, "$homeViewModel");
        Intrinsics.checkNotNullParameter(onMessagesClicked, "$onMessagesClicked");
        Intrinsics.checkNotNullParameter(onHelpClicked, "$onHelpClicked");
        Intrinsics.checkNotNullParameter(onTicketsClicked, "$onTicketsClicked");
        Intrinsics.checkNotNullParameter(onTicketItemClicked, "$onTicketItemClicked");
        Intrinsics.checkNotNullParameter(navigateToMessages, "$navigateToMessages");
        Intrinsics.checkNotNullParameter(navigateToNewConversation, "$navigateToNewConversation");
        Intrinsics.checkNotNullParameter(navigateToExistingConversation, "$navigateToExistingConversation");
        Intrinsics.checkNotNullParameter(onNewConversationClicked, "$onNewConversationClicked");
        Intrinsics.checkNotNullParameter(onConversationClicked, "$onConversationClicked");
        Intrinsics.checkNotNullParameter(onCloseClick, "$onCloseClick");
        Intrinsics.checkNotNullParameter(onTicketLinkClicked, "$onTicketLinkClicked");
        HomeScreen(homeViewModel, onMessagesClicked, onHelpClicked, onTicketsClicked, onTicketItemClicked, navigateToMessages, navigateToNewConversation, navigateToExistingConversation, onNewConversationClicked, onConversationClicked, onCloseClick, onTicketLinkClicked, c0Var, t4.a(i10 | 1), t4.a(i11));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeScreen$lambda$2$lambda$1(Window it, n7 uiState) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(uiState, "$uiState");
        k2.a(it, it.getDecorView()).i(isDarkContentEnabled((HomeUiState) uiState.getValue()));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getHeaderContentOpacity(int i10, float f10) {
        return kotlin.ranges.r.H((f10 - i10) / f10, 0.0f, 1.0f);
    }

    private static final boolean isDarkContentEnabled(HomeUiState homeUiState) {
        if (homeUiState instanceof HomeUiState.Content) {
            return ColorExtensionsKt.m735isDarkColor8_81llA(ColorExtensionsKt.toComposeColor$default(((HomeUiState.Content) homeUiState).getHeader().getIntro().getTextColorLight(), 0.0f, 1, null));
        }
        if (homeUiState instanceof HomeUiState.Error) {
            return ColorExtensionsKt.m735isDarkColor8_81llA(ColorExtensionsKt.toComposeColor$default(((HomeUiState.Error) homeUiState).getHeader().getForegroundColor(), 0.0f, 1, null));
        }
        return true;
    }
}
