package io.ktor.http.cio;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class y {

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.http.cio.MultipartJvmAndPosixKt$discardBlocking$1", f = "MultipartJvmAndPosix.kt", i = {}, l = {12}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Long>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f295651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.h f295652b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(io.ktor.utils.io.h hVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f295652b = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f295652b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f295651a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            io.ktor.utils.io.h hVar = this.f295652b;
            this.f295651a = 1;
            Object objJ = io.ktor.utils.io.k.j(hVar, 0L, this, 1, null);
            return objJ == objL ? objL : objJ;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Long> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final void a(@NotNull io.ktor.utils.io.h hVar) throws InterruptedException {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        kotlinx.coroutines.j.b(null, new a(hVar, null), 1, null);
    }
}
