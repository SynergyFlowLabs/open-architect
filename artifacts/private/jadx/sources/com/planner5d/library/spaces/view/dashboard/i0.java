package com.planner5d.library.spaces.view.dashboard;

import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.flow.z0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
public final class i0 extends f2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f230275c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final k0<i> f230276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final z0<i> f230277b;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.spaces.view.dashboard.SpacesInfoViewModel$loadSpaceCardBackground$1", f = "SpacesInfoViewModel.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f230278a;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return i0.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f230278a;
            if (i10 == 0) {
                ResultKt.m(obj);
                this.f230278a = 1;
                if (d1.b(1000L, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            i0.this.f230276a.setValue(i.f((i) i0.this.f230276a.getValue(), "https://storage.planner5d.com/thumbs.600/f71413fca3b0eb1553a6f1a6391bf2f2.jpg?=v1756818620", null, null, false, 6, null));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public i0() {
        k0<i> k0VarA = b1.a(new i(null, "4247 Cloverdale Ave, LA", "3 bathrooms, 2 bedrooms, 4,048 sqft", true, 1, null));
        this.f230276a = k0VarA;
        this.f230277b = kotlinx.coroutines.flow.k.n(k0VarA);
        W();
    }

    private final void W() {
        kotlinx.coroutines.k.f(g2.a(this), null, null, new a(null), 3, null);
    }

    @NotNull
    public final z0<i> V() {
        return this.f230277b;
    }

    public final void X() {
        k0<i> k0Var = this.f230276a;
        k0Var.setValue(i.f(k0Var.getValue(), null, null, null, true, 7, null));
        W();
    }
}
