package io.intercom.android.sdk.m5.data;

import io.intercom.android.sdk.UnreadConversationCountListener;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.a0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.z0;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "io.intercom.android.sdk.m5.data.UnreadCountTracker$addListener$job$1", f = "UnreadCountTracker.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
final class UnreadCountTracker$addListener$job$1 extends o implements Function2<s0, d<? super Unit>, Object> {
    final /* synthetic */ UnreadConversationCountListener $listener;
    int label;
    final /* synthetic */ UnreadCountTracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UnreadCountTracker$addListener$job$1(UnreadCountTracker unreadCountTracker, UnreadConversationCountListener unreadConversationCountListener, d<? super UnreadCountTracker$addListener$job$1> dVar) {
        super(2, dVar);
        this.this$0 = unreadCountTracker;
        this.$listener = unreadConversationCountListener;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new UnreadCountTracker$addListener$job$1(this.this$0, this.$listener, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            z0<Set<String>> unreadConversationIds = this.this$0.getDataLayer().getUnreadConversationIds();
            final UnreadConversationCountListener unreadConversationCountListener = this.$listener;
            j<? super Set<String>> jVar = new j() { // from class: io.intercom.android.sdk.m5.data.UnreadCountTracker$addListener$job$1.1
                @Override // kotlinx.coroutines.flow.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((Set<String>) obj2, (d<? super Unit>) dVar);
                }

                public final Object emit(Set<String> set, d<? super Unit> dVar) {
                    unreadConversationCountListener.onCountUpdate(set.size());
                    return Unit.f312394a;
                }
            };
            this.label = 1;
            if (unreadConversationIds.collect(jVar, this) == objL) {
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
    public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
        return ((UnreadCountTracker$addListener$job$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
