package com.superwall.sdk.config;

import com.superwall.sdk.models.assignment.Assignment;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.config.ConfigManager$getAssignments$3$1", f = "ConfigManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class ConfigManager$getAssignments$3$1 extends o implements Function2<List<? extends Assignment>, kotlin.coroutines.d<? super Unit>, Object> {
    int label;
    final /* synthetic */ ConfigManager this$0;

    /* JADX INFO: renamed from: com.superwall.sdk.config.ConfigManager$getAssignments$3$1$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.config.ConfigManager$getAssignments$3$1$1", f = "ConfigManager.kt", i = {}, l = {299}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        int label;
        final /* synthetic */ ConfigManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ConfigManager configManager, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = configManager;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                ConfigManager configManager = this.this$0;
                this.label = 1;
                if (configManager.preloadPaywalls(this) == objL) {
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
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfigManager$getAssignments$3$1(ConfigManager configManager, kotlin.coroutines.d<? super ConfigManager$getAssignments$3$1> dVar) {
        super(2, dVar);
        this.this$0 = configManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new ConfigManager$getAssignments$3$1(this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends Assignment> list, kotlin.coroutines.d<? super Unit> dVar) {
        return invoke2((List<Assignment>) list, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        k.f(this.this$0.ioScope, null, null, new AnonymousClass1(this.this$0, null), 3, null);
        return Unit.f312394a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<Assignment> list, kotlin.coroutines.d<? super Unit> dVar) {
        return ((ConfigManager$getAssignments$3$1) create(list, dVar)).invokeSuspend(Unit.f312394a);
    }
}
