package io.ktor.client.engine.android;

import io.ktor.http.content.w;
import io.ktor.http.j1;
import io.ktor.utils.io.e1;
import io.ktor.utils.io.p;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final List<j1> f294303a;

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.engine.android.AndroidClientEngineKt", f = "AndroidClientEngine.kt", i = {}, l = {122, 130, 136}, m = "writeTo", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f294304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f294305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f294306c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f294305b = obj;
            this.f294306c |= Integer.MIN_VALUE;
            return e.b(null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.engine.android.AndroidClientEngineKt$writeTo$2$channel$1", f = "AndroidClientEngine.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function2<e1, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f294307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f294308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w f294309c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(w wVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f294309c = wVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f294309c, dVar);
            bVar.f294308b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f294307a;
            if (i10 == 0) {
                ResultKt.m(obj);
                e1 e1Var = (e1) this.f294308b;
                w.f fVar = (w.f) this.f294309c;
                p pVarC = e1Var.c();
                this.f294307a = 1;
                if (fVar.h(pVarC, this) == objL) {
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
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(e1 e1Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(e1Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static {
        j1.a aVar = j1.f295897b;
        f294303a = CollectionsKt.listOf((Object[]) new j1[]{aVar.c(), aVar.d()});
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d9, code lost:
    
        if (b(r0, r1, r18, r4) == r7) goto L49;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(@org.jetbrains.annotations.NotNull io.ktor.http.content.w r16, @org.jetbrains.annotations.NotNull java.io.OutputStream r17, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r18, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.android.e.b(io.ktor.http.content.w, java.io.OutputStream, kotlin.coroutines.CoroutineContext, kotlin.coroutines.d):java.lang.Object");
    }
}
