package io.intercom.android.sdk.m5.conversation.data;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,111:1\n47#2,5:112\n*E\n"})
public final class CombinedEventAsFlowKt$combinedEventAsFlow$$inlined$filter$1 implements i<ParsedAblyEvent> {
    final /* synthetic */ i $this_unsafeTransform$inlined;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.data.CombinedEventAsFlowKt$combinedEventAsFlow$$inlined$filter$1$2, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CombinedEventAsFlow.kt\nio/intercom/android/sdk/m5/conversation/data/CombinedEventAsFlowKt\n*L\n1#1,218:1\n18#2:219\n19#2:221\n34#3:220\n*E\n"})
    public static final class AnonymousClass2<T> implements j {
        final /* synthetic */ j $this_unsafeFlow;

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.data.CombinedEventAsFlowKt$combinedEventAsFlow$$inlined$filter$1$2$1, reason: invalid class name */
        @f(c = "io.intercom.android.sdk.m5.conversation.data.CombinedEventAsFlowKt$combinedEventAsFlow$$inlined$filter$1$2", f = "CombinedEventAsFlow.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        public static final class AnonymousClass1 extends d {
            Object L$0;
            Object L$1;
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

        public AnonymousClass2(j jVar) {
            this.$this_unsafeFlow = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
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
                j jVar = this.$this_unsafeFlow;
                if (((ParsedAblyEvent) obj) instanceof ParsedAblyEvent.ConversationAblyEvent.NewComment) {
                    anonymousClass1.label = 1;
                    if (jVar.emit(obj, anonymousClass1) == objL) {
                        return objL;
                    }
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

    public CombinedEventAsFlowKt$combinedEventAsFlow$$inlined$filter$1(i iVar) {
        this.$this_unsafeTransform$inlined = iVar;
    }

    @Override // kotlinx.coroutines.flow.i
    @Nullable
    public Object collect(@NotNull j<? super ParsedAblyEvent> jVar, @NotNull kotlin.coroutines.d dVar) {
        Object objCollect = this.$this_unsafeTransform$inlined.collect(new AnonymousClass2(jVar), dVar);
        return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
    }
}
