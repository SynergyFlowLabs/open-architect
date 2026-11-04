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
@f(c = "com.superwall.sdk.storage.LocalStorage$p_confirmedAssignments$1", f = "LocalStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class LocalStorage$p_confirmedAssignments$1 extends o implements Function2<s0, d<? super Map<String, ? extends Experiment.Variant>>, Object> {
    int label;
    final /* synthetic */ LocalStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LocalStorage$p_confirmedAssignments$1(LocalStorage localStorage, d<? super LocalStorage$p_confirmedAssignments$1> dVar) {
        super(2, dVar);
        this.this$0 = localStorage;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new LocalStorage$p_confirmedAssignments$1(this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, d<? super Map<String, ? extends Experiment.Variant>> dVar) {
        return invoke2(s0Var, (d<? super Map<String, Experiment.Variant>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        return this.this$0._confirmedAssignments;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(s0 s0Var, d<? super Map<String, Experiment.Variant>> dVar) {
        return ((LocalStorage$p_confirmedAssignments$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
