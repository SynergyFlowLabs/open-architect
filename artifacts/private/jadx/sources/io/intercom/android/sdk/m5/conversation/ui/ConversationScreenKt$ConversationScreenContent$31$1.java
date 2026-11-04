package io.intercom.android.sdk.m5.conversation.ui;

import androidx.compose.runtime.w6;
import io.intercom.android.sdk.m5.conversation.usecase.ConversationScrolledState;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$31$1", f = "ConversationScreen.kt", i = {}, l = {506}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nConversationScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationScreen.kt\nio/intercom/android/sdk/m5/conversation/ui/ConversationScreenKt$ConversationScreenContent$31$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,1059:1\n49#2:1060\n51#2:1064\n46#3:1061\n51#3:1063\n105#4:1062\n*S KotlinDebug\n*F\n+ 1 ConversationScreen.kt\nio/intercom/android/sdk/m5/conversation/ui/ConversationScreenKt$ConversationScreenContent$31$1\n*L\n499#1:1060\n499#1:1064\n499#1:1061\n499#1:1063\n499#1:1062\n*E\n"})
final class ConversationScreenKt$ConversationScreenContent$31$1 extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ boolean $isLandscape;
    final /* synthetic */ boolean $isLargeFont;
    final /* synthetic */ float $lazyListJumpToBottomScrollOffset;
    final /* synthetic */ androidx.compose.foundation.lazy.j1 $lazyListState;
    final /* synthetic */ Function1<ConversationScrolledState, Unit> $onConversationScrolled;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ConversationScreenKt$ConversationScreenContent$31$1(androidx.compose.foundation.lazy.j1 j1Var, float f10, Function1<? super ConversationScrolledState, Unit> function1, boolean z10, boolean z11, kotlin.coroutines.d<? super ConversationScreenKt$ConversationScreenContent$31$1> dVar) {
        super(2, dVar);
        this.$lazyListState = j1Var;
        this.$lazyListJumpToBottomScrollOffset = f10;
        this.$onConversationScrolled = function1;
        this.$isLandscape = z10;
        this.$isLargeFont = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List invokeSuspend$lambda$0(androidx.compose.foundation.lazy.j1 j1Var) {
        return j1Var.K().h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long invokeSuspend$lambda$2(boolean z10) {
        return z10 ? 200L : 0L;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new ConversationScreenKt$ConversationScreenContent$31$1(this.$lazyListState, this.$lazyListJumpToBottomScrollOffset, this.$onConversationScrolled, this.$isLandscape, this.$isLargeFont, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            final androidx.compose.foundation.lazy.j1 j1Var = this.$lazyListState;
            final kotlinx.coroutines.flow.i iVarY = w6.y(new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.a2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ConversationScreenKt$ConversationScreenContent$31$1.invokeSuspend$lambda$0(j1Var);
                }
            });
            final float f10 = this.$lazyListJumpToBottomScrollOffset;
            final androidx.compose.foundation.lazy.j1 j1Var2 = this.$lazyListState;
            kotlinx.coroutines.flow.i iVarD0 = kotlinx.coroutines.flow.k.d0(new kotlinx.coroutines.flow.i<Boolean>() { // from class: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$31$1$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$31$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ConversationScreen.kt\nio/intercom/android/sdk/m5/conversation/ui/ConversationScreenKt$ConversationScreenContent$31$1\n*L\n1#1,218:1\n50#2:219\n500#3,4:220\n*E\n"})
                public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {
                    final /* synthetic */ float $lazyListJumpToBottomScrollOffset$inlined;
                    final /* synthetic */ androidx.compose.foundation.lazy.j1 $lazyListState$inlined;
                    final /* synthetic */ kotlinx.coroutines.flow.j $this_unsafeFlow;

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$31$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$31$1$invokeSuspend$$inlined$map$1$2", f = "ConversationScreen.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(kotlin.coroutines.d dVar) {
                            super(dVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(kotlinx.coroutines.flow.j jVar, float f10, androidx.compose.foundation.lazy.j1 j1Var) {
                        this.$this_unsafeFlow = jVar;
                        this.$lazyListJumpToBottomScrollOffset$inlined = f10;
                        this.$lazyListState$inlined = j1Var;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
                    @Override // kotlinx.coroutines.flow.j
                    @Nullable
                    public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                        AnonymousClass1 anonymousClass1;
                        if (dVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) dVar;
                            int i10 = anonymousClass1.label;
                            if ((i10 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i10 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(dVar);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(dVar);
                        }
                        Object obj2 = anonymousClass1.result;
                        Object objL = kotlin.coroutines.intrinsics.b.l();
                        int i11 = anonymousClass1.label;
                        if (i11 == 0) {
                            ResultKt.m(obj2);
                            kotlinx.coroutines.flow.j jVar = this.$this_unsafeFlow;
                            Boolean boolA = kotlin.coroutines.jvm.internal.b.a(ConversationScreenKt.isLazyListScrolled((List) obj, this.$lazyListJumpToBottomScrollOffset$inlined, this.$lazyListState$inlined.K().c()));
                            anonymousClass1.label = 1;
                            if (jVar.emit(boolA, anonymousClass1) == objL) {
                                return objL;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.m(obj2);
                        }
                        return Unit.f312394a;
                    }
                }

                @Override // kotlinx.coroutines.flow.i
                @Nullable
                public Object collect(@NotNull kotlinx.coroutines.flow.j<? super Boolean> jVar, @NotNull kotlin.coroutines.d dVar) {
                    Object objCollect = iVarY.collect(new AnonymousClass2(jVar, f10, j1Var2), dVar);
                    return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
                }
            }, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.b2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Long.valueOf(ConversationScreenKt$ConversationScreenContent$31$1.invokeSuspend$lambda$2(((Boolean) obj2).booleanValue()));
                }
            });
            final Function1<ConversationScrolledState, Unit> function1 = this.$onConversationScrolled;
            final androidx.compose.foundation.lazy.j1 j1Var3 = this.$lazyListState;
            final boolean z10 = this.$isLandscape;
            final boolean z11 = this.$isLargeFont;
            kotlinx.coroutines.flow.j jVar = new kotlinx.coroutines.flow.j() { // from class: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$31$1.4
                @Override // kotlinx.coroutines.flow.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.d dVar) {
                    return emit(((Boolean) obj2).booleanValue(), (kotlin.coroutines.d<? super Unit>) dVar);
                }

                public final Object emit(boolean z12, kotlin.coroutines.d<? super Unit> dVar) {
                    function1.invoke(new ConversationScrolledState(z12, 0, z10, z11, kotlin.ranges.r.u(j1Var3.K().c() - 1, 0)));
                    return Unit.f312394a;
                }
            };
            this.label = 1;
            if (iVarD0.collect(jVar, this) == objL) {
                return objL;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((ConversationScreenKt$ConversationScreenContent$31$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
