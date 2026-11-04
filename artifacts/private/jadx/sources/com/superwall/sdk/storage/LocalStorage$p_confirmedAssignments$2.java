package com.superwall.sdk.storage;

import com.superwall.sdk.models.triggers.Experiment;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.storage.LocalStorage$p_confirmedAssignments$2", f = "LocalStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class LocalStorage$p_confirmedAssignments$2 extends o implements Function2<s0, d<? super Unit>, Object> {
    final /* synthetic */ Map<String, Experiment.Variant> $value;
    int label;
    final /* synthetic */ LocalStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LocalStorage$p_confirmedAssignments$2(LocalStorage localStorage, Map<String, Experiment.Variant> map, d<? super LocalStorage$p_confirmedAssignments$2> dVar) {
        super(2, dVar);
        this.this$0 = localStorage;
        this.$value = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new LocalStorage$p_confirmedAssignments$2(this.this$0, this.$value, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        this.this$0._confirmedAssignments = this.$value;
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
        return ((LocalStorage$p_confirmedAssignments$2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
