package com.superwall.sdk.config;

import com.superwall.sdk.models.assignment.AssignmentPostback;
import com.superwall.sdk.network.SuperwallAPI;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.config.Assignments$confirmAssignment$1$1", f = "Assignments.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
final class Assignments$confirmAssignment$1$1 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ AssignmentPostback $postback;
    int label;
    final /* synthetic */ Assignments this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Assignments$confirmAssignment$1$1(Assignments assignments, AssignmentPostback assignmentPostback, kotlin.coroutines.d<? super Assignments$confirmAssignment$1$1> dVar) {
        super(2, dVar);
        this.this$0 = assignments;
        this.$postback = assignmentPostback;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new Assignments$confirmAssignment$1$1(this.this$0, this.$postback, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            SuperwallAPI superwallAPI = this.this$0.network;
            AssignmentPostback assignmentPostback = this.$postback;
            this.label = 1;
            if (superwallAPI.confirmAssignments(assignmentPostback, this) == objL) {
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
    public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((Assignments$confirmAssignment$1$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
