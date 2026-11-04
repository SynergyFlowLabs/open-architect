package io.ktor.client.statement;

import io.ktor.utils.io.k;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.b1;
import kotlin.l;
import kotlinx.io.c0;
import kotlinx.io.g0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.statement.ReadersKt", f = "Readers.kt", i = {}, l = {17}, m = "readBytes", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f295364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f295365b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f295366c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f295365b = obj;
            this.f295366c |= Integer.MIN_VALUE;
            boolean z10 = true;
            return h.b(null, 0, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.statement.ReadersKt", f = "Readers.kt", i = {}, l = {53}, m = "readBytes", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f295367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f295368b;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f295367a = obj;
            this.f295368b |= Integer.MIN_VALUE;
            return h.c(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.statement.ReadersKt", f = "Readers.kt", i = {}, l = {35}, m = "readRawBytes", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f295369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f295370b;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f295369a = obj;
            this.f295370b |= Integer.MIN_VALUE;
            return h.d(null, this);
        }
    }

    @Nullable
    public static final Object a(@NotNull io.ktor.client.statement.c cVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objJ = k.j(cVar.c(), 0L, dVar, 1, null);
        return objJ == kotlin.coroutines.intrinsics.b.l() ? objJ : Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    public static final Object b(@NotNull io.ktor.client.statement.c cVar, int i10, @NotNull kotlin.coroutines.d<? super byte[]> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i11 = aVar.f295366c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f295366c = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        a aVar2 = aVar;
        Object obj = aVar2.f295365b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i12 = aVar2.f295366c;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byte[] bArr = (byte[]) aVar2.f295364a;
            ResultKt.m(obj);
            return bArr;
        }
        ResultKt.m(obj);
        byte[] bArr2 = new byte[i10];
        io.ktor.utils.io.h hVarC = cVar.c();
        aVar2.f295364a = bArr2;
        aVar2.f295366c = 1;
        return k.D(hVarC, bArr2, 0, 0, aVar2, 6, null) == objL ? objL : bArr2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @l(message = "This method was renamed to readRawBytes() to reflect what it does.", replaceWith = @b1(expression = "readRawBytes()", imports = {}))
    @Nullable
    public static final Object c(@NotNull io.ktor.client.statement.c cVar, @NotNull kotlin.coroutines.d<? super byte[]> dVar) throws Throwable {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f295368b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f295368b = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objI = bVar.f295367a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f295368b;
        if (i11 == 0) {
            ResultKt.m(objI);
            io.ktor.utils.io.h hVarC = cVar.c();
            bVar.f295368b = 1;
            objI = k.I(hVarC, bVar);
            if (objI == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objI);
        }
        return g0.c((c0) objI);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public static final Object d(@NotNull io.ktor.client.statement.c cVar, @NotNull kotlin.coroutines.d<? super byte[]> dVar) throws Throwable {
        c cVar2;
        if (dVar instanceof c) {
            cVar2 = (c) dVar;
            int i10 = cVar2.f295370b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar2.f295370b = i10 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(dVar);
            }
        } else {
            cVar2 = new c(dVar);
        }
        Object objI = cVar2.f295369a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar2.f295370b;
        if (i11 == 0) {
            ResultKt.m(objI);
            io.ktor.utils.io.h hVarC = cVar.c();
            cVar2.f295370b = 1;
            objI = k.I(hVarC, cVar2);
            if (objI == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objI);
        }
        return g0.c((c0) objI);
    }
}
