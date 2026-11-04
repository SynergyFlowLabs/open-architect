package io.ktor.util.cio;

import io.ktor.utils.io.p;
import io.ktor.utils.io.q;
import io.ktor.utils.io.t;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlinx.io.c0;
import kotlinx.io.g0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class l {

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.util.cio.ReadersKt", f = "Readers.kt", i = {}, l = {19}, m = "toByteArray", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f296552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f296553b;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296552a = obj;
            this.f296553b |= Integer.MIN_VALUE;
            return l.a(null, 0, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public static final Object a(@NotNull io.ktor.utils.io.h hVar, int i10, @NotNull kotlin.coroutines.d<? super byte[]> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i11 = aVar.f296553b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f296553b = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objH = aVar.f296552a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i12 = aVar.f296553b;
        if (i12 == 0) {
            ResultKt.m(objH);
            aVar.f296553b = 1;
            objH = io.ktor.utils.io.k.H(hVar, i10, aVar);
            if (objH == objL) {
                return objL;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objH);
        }
        return g0.c((c0) objH);
    }

    public static /* synthetic */ Object b(io.ktor.utils.io.h hVar, int i10, kotlin.coroutines.d dVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return a(hVar, i10, dVar);
    }

    public static final void c(@NotNull p pVar, @NotNull Function1<? super p, Unit> block) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            block.invoke(pVar);
            h0.d(1);
            q.c(pVar);
            h0.c(1);
        } catch (Throwable th2) {
            try {
                t.e(pVar, th2);
                throw th2;
            } catch (Throwable th3) {
                h0.d(1);
                q.c(pVar);
                h0.c(1);
                throw th3;
            }
        }
    }
}
