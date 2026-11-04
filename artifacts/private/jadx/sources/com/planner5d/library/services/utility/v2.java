package com.planner5d.library.services.utility;

import kotlin.ResultKt;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f229791a = kotlinx.coroutines.sync.g.a(true);

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.SimpleSuspendingCountDownLatch", f = "SimpleSuspendingCountDownLatch.kt", i = {0}, l = {16}, m = "await", n = {"this"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f229792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f229793b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f229795d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f229793b = obj;
            this.f229795d |= Integer.MIN_VALUE;
            return v2.this.a(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object a(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f229795d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f229795d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f229793b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f229795d;
        if (i11 == 0) {
            ResultKt.m(obj);
            kotlinx.coroutines.sync.a aVar2 = this.f229791a;
            aVar.f229792a = this;
            aVar.f229795d = 1;
            if (kotlinx.coroutines.sync.a.C2318a.b(aVar2, null, aVar, 1, null) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (v2) aVar.f229792a;
            ResultKt.m(obj);
        }
        this.b();
        return Unit.f312394a;
    }

    public final void b() {
        try {
            kotlinx.coroutines.sync.a.C2318a.d(this.f229791a, null, 1, null);
        } catch (IllegalStateException unused) {
        }
    }

    public final boolean c() {
        return kotlinx.coroutines.sync.a.C2318a.c(this.f229791a, null, 1, null);
    }
}
