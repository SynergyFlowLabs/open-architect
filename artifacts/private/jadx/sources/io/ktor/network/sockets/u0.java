package io.ktor.network.sockets;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.p2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nSockets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sockets.kt\nio/ktor/network/sockets/SocketsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,201:1\n1#2:202\n*E\n"})
public final class u0 {

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.network.sockets.SocketsKt", f = "Sockets.kt", i = {0}, l = {46}, m = "awaitClosed", n = {"$this$awaitClosed"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f296351b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f296352c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296351b = obj;
            this.f296352c |= Integer.MIN_VALUE;
            return u0.a(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public static final Object a(@NotNull d dVar, @NotNull kotlin.coroutines.d<? super Unit> dVar2) {
        a aVar;
        if (dVar2 instanceof a) {
            aVar = (a) dVar2;
            int i10 = aVar.f296352c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f296352c = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar2);
            }
        } else {
            aVar = new a(dVar2);
        }
        Object obj = aVar.f296351b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f296352c;
        if (i11 == 0) {
            ResultKt.m(obj);
            p2 p2VarB8 = dVar.b8();
            aVar.f296350a = dVar;
            aVar.f296352c = 1;
            if (p2VarB8.d1(aVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = (d) aVar.f296350a;
            ResultKt.m(obj);
        }
        if (dVar.b8().isCancelled()) {
            throw dVar.b8().y0();
        }
        return Unit.f312394a;
    }

    @NotNull
    public static final p b(@NotNull h0 h0Var) {
        Intrinsics.checkNotNullParameter(h0Var, "<this>");
        return new p(h0Var, e(h0Var), g(h0Var, false, 1, null));
    }

    public static final int c(@NotNull f0 f0Var) {
        Intrinsics.checkNotNullParameter(f0Var, "<this>");
        return k0.a(f0Var.getLocalAddress());
    }

    public static final boolean d(@NotNull d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return dVar.b8().x();
    }

    @NotNull
    public static final io.ktor.utils.io.h e(@NotNull c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        io.ktor.utils.io.b bVar = new io.ktor.utils.io.b(false);
        cVar.l(bVar);
        return bVar;
    }

    @NotNull
    public static final io.ktor.utils.io.p f(@NotNull e eVar, boolean z10) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        io.ktor.utils.io.b bVar = new io.ktor.utils.io.b(z10);
        eVar.e(bVar);
        return bVar;
    }

    public static /* synthetic */ io.ktor.utils.io.p g(e eVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return f(eVar, z10);
    }
}
