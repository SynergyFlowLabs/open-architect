package com.superwall.sdk.dependencies;

import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.dependencies.DependencyContainer$httpConnection$1", f = "DependencyContainer.kt", i = {}, l = {237}, m = "invokeSuspend", n = {}, s = {})
final class DependencyContainer$httpConnection$1 extends kotlin.coroutines.jvm.internal.o implements pj.n<Boolean, String, kotlin.coroutines.d<? super Map<String, ? extends String>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ DependencyContainer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DependencyContainer$httpConnection$1(DependencyContainer dependencyContainer, kotlin.coroutines.d<? super DependencyContainer$httpConnection$1> dVar) {
        super(3, dVar);
        this.this$0 = dependencyContainer;
    }

    @Override // pj.n
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, String str, kotlin.coroutines.d<? super Map<String, ? extends String>> dVar) {
        return invoke(bool.booleanValue(), str, (kotlin.coroutines.d<? super Map<String, String>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return obj;
        }
        ResultKt.m(obj);
        boolean z10 = this.Z$0;
        String str = (String) this.L$0;
        DependencyContainer dependencyContainer = this.this$0;
        this.label = 1;
        Object objMakeHeaders = dependencyContainer.makeHeaders(z10, str, this);
        return objMakeHeaders == objL ? objL : objMakeHeaders;
    }

    public final Object invoke(boolean z10, String str, kotlin.coroutines.d<? super Map<String, String>> dVar) {
        DependencyContainer$httpConnection$1 dependencyContainer$httpConnection$1 = new DependencyContainer$httpConnection$1(this.this$0, dVar);
        dependencyContainer$httpConnection$1.Z$0 = z10;
        dependencyContainer$httpConnection$1.L$0 = str;
        return dependencyContainer$httpConnection$1.invokeSuspend(Unit.f312394a);
    }
}
