package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.runtime.n3;
import androidx.compose.runtime.w6;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiStateKt;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$13$1", f = "LazyMessageList.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nLazyMessageList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyMessageList.kt\nio/intercom/android/sdk/m5/conversation/ui/components/LazyMessageListKt$LazyMessageList$13$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,497:1\n49#2:498\n51#2:502\n46#3:499\n51#3:501\n105#4:500\n*S KotlinDebug\n*F\n+ 1 LazyMessageList.kt\nio/intercom/android/sdk/m5/conversation/ui/components/LazyMessageListKt$LazyMessageList$13$1\n*L\n142#1:498\n142#1:502\n142#1:499\n142#1:501\n142#1:500\n*E\n"})
final class LazyMessageListKt$LazyMessageList$13$1 extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ n3<Boolean> $isListAtTheBottom$delegate;
    final /* synthetic */ androidx.compose.foundation.lazy.j1 $lazyListState;
    int label;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$13$1$3, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$13$1$3", f = "LazyMessageList.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.o implements Function2<Boolean, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ n3<Boolean> $isListAtTheBottom$delegate;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(n3<Boolean> n3Var, kotlin.coroutines.d<? super AnonymousClass3> dVar) {
            super(2, dVar);
            this.$isListAtTheBottom$delegate = n3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$isListAtTheBottom$delegate, dVar);
            anonymousClass3.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, kotlin.coroutines.d<? super Unit> dVar) {
            return invoke(bool.booleanValue(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            LazyMessageListKt.LazyMessageList$lambda$19(this.$isListAtTheBottom$delegate, this.Z$0);
            return Unit.f312394a;
        }

        public final Object invoke(boolean z10, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass3) create(Boolean.valueOf(z10), dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyMessageListKt$LazyMessageList$13$1(androidx.compose.foundation.lazy.j1 j1Var, n3<Boolean> n3Var, kotlin.coroutines.d<? super LazyMessageListKt$LazyMessageList$13$1> dVar) {
        super(2, dVar);
        this.$lazyListState = j1Var;
        this.$isListAtTheBottom$delegate = n3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List invokeSuspend$lambda$0(androidx.compose.foundation.lazy.j1 j1Var) {
        return j1Var.K().h();
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new LazyMessageListKt$LazyMessageList$13$1(this.$lazyListState, this.$isListAtTheBottom$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            final androidx.compose.foundation.lazy.j1 j1Var = this.$lazyListState;
            final kotlinx.coroutines.flow.i iVarY = w6.y(new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.b1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LazyMessageListKt$LazyMessageList$13$1.invokeSuspend$lambda$0(j1Var);
                }
            });
            kotlinx.coroutines.flow.i<Boolean> iVar = new kotlinx.coroutines.flow.i<Boolean>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$13$1$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$13$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 LazyMessageList.kt\nio/intercom/android/sdk/m5/conversation/ui/components/LazyMessageListKt$LazyMessageList$13$1\n*L\n1#1,218:1\n50#2:219\n142#3:220\n*E\n"})
                public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {
                    final /* synthetic */ kotlinx.coroutines.flow.j $this_unsafeFlow;

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$13$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$13$1$invokeSuspend$$inlined$map$1$2", f = "LazyMessageList.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
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

                    public AnonymousClass2(kotlinx.coroutines.flow.j jVar) {
                        this.$this_unsafeFlow = jVar;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
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
                            androidx.compose.foundation.lazy.v vVar = (androidx.compose.foundation.lazy.v) CollectionsKt.lastOrNull((List) obj);
                            Boolean boolA = kotlin.coroutines.jvm.internal.b.a(Intrinsics.areEqual(vVar != null ? vVar.getKey() : null, ConversationUiStateKt.LastAnchorRowKey));
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
                    Object objCollect = iVarY.collect(new AnonymousClass2(jVar), dVar);
                    return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
                }
            };
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$isListAtTheBottom$delegate, null);
            this.label = 1;
            if (kotlinx.coroutines.flow.k.C(iVar, anonymousClass3, this) == objL) {
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
        return ((LazyMessageListKt$LazyMessageList$13$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
