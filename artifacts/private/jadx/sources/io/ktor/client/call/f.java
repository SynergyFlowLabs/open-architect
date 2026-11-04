package io.ktor.client.call;

import kotlin.ResultKt;
import kotlinx.io.c0;
import kotlinx.io.g0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.call.SavedCallKt", f = "SavedCall.kt", i = {0}, l = {36}, m = "save", n = {"$this$save"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f294258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f294259b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f294260c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f294259b = obj;
            this.f294260c |= Integer.MIN_VALUE;
            return f.a(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public static final Object a(@NotNull b bVar, @NotNull kotlin.coroutines.d<? super b> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f294260c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f294260c = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objI = aVar.f294259b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f294260c;
        if (i11 == 0) {
            ResultKt.m(objI);
            io.ktor.utils.io.h hVarC = bVar.k().c();
            aVar.f294258a = bVar;
            aVar.f294260c = 1;
            objI = io.ktor.utils.io.k.I(hVarC, aVar);
            if (objI == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (b) aVar.f294258a;
            ResultKt.m(objI);
        }
        return new g(bVar.i(), bVar.j(), bVar.k(), g0.c((c0) objI));
    }
}
