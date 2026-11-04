package com.planner5d.library.activity.fragment.dialog.support;

import android.content.Context;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.model.manager.o4;
import com.planner5d.library.model.manager.q4;
import com.planner5d.library.model.manager.y4;
import com.planner5d.library.services.q0;
import com.planner5d.library.services.utility.s;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.s0;
import le.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends f2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final a f133021j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f133022k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final o4 f133023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final q4 f133024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final n f133025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final c1<Boolean> f133026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final c1<Boolean> f133027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final c1<Integer> f133028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final c1<Integer> f133029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f133030h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final c1<b> f133031i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public enum b {
        Initial,
        SubmitInProgress,
        SubmitSuccess,
        Error;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f133037f = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f133037f;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.support.SupportViewModel$submit$1", f = "SupportViewModel.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f133038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f133039b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f133041d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f133042e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f133043f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, String str2, boolean z10, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f133041d = str;
            this.f133042e = str2;
            this.f133043f = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return k.this.new c(this.f133041d, this.f133042e, this.f133043f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            c1 c1Var;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f133039b;
            if (i10 == 0) {
                ResultKt.m(obj);
                k.this.X().r(b.SubmitInProgress);
                c1<b> c1VarX = k.this.X();
                n nVar = k.this.f133025c;
                String str = this.f133041d;
                String str2 = this.f133042e;
                boolean z10 = this.f133043f;
                int iY = k.this.Y();
                this.f133038a = c1VarX;
                this.f133039b = 1;
                Object objA = nVar.a(str, str2, z10, iY, this);
                if (objA == objL) {
                    return objL;
                }
                obj = objA;
                c1Var = c1VarX;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1Var = (c1) this.f133038a;
                ResultKt.m(obj);
            }
            c1Var.r(obj);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static {
        int i10 = 2 | 0;
    }

    @ij.a
    public k(@NotNull o4 supportManager, @NotNull q4 supportManagerDataService, @NotNull n sendSupportRequestUseCase) {
        Intrinsics.checkNotNullParameter(supportManager, "supportManager");
        Intrinsics.checkNotNullParameter(supportManagerDataService, "supportManagerDataService");
        Intrinsics.checkNotNullParameter(sendSupportRequestUseCase, "sendSupportRequestUseCase");
        this.f133023a = supportManager;
        this.f133024b = supportManagerDataService;
        this.f133025c = sendSupportRequestUseCase;
        this.f133026d = new c1<>(Boolean.FALSE);
        this.f133027e = new c1<>(Boolean.TRUE);
        this.f133028f = new c1<>(null);
        this.f133029g = new c1<>(null);
        this.f133031i = new c1<>(b.Initial);
    }

    private final void h0(String str, String str2) {
        c1<Boolean> c1Var = this.f133026d;
        Boolean bool = Boolean.TRUE;
        c1Var.r(bool);
        if (this.f133030h == 0) {
            c1<Boolean> c1Var2 = this.f133026d;
            Boolean bool2 = Boolean.FALSE;
            c1Var2.r(bool2);
            this.f133027e.r(bool2);
        } else {
            this.f133027e.r(bool);
        }
        q0 q0Var = q0.f224534a;
        if (!q0Var.h(str)) {
            this.f133026d.r(Boolean.FALSE);
            this.f133028f.r(Integer.valueOf(pc.b.r.Ma));
        } else if (!q0Var.b(str)) {
            this.f133026d.r(Boolean.FALSE);
            this.f133028f.r(Integer.valueOf(pc.b.r.D8));
        }
        if (q0Var.h(str2)) {
            return;
        }
        this.f133026d.r(Boolean.FALSE);
        this.f133029g.r(Integer.valueOf(pc.b.r.Ma));
    }

    @NotNull
    public final c1<Integer> V() {
        return this.f133029g;
    }

    @NotNull
    public final c1<Integer> W() {
        return this.f133028f;
    }

    @NotNull
    public final c1<b> X() {
        return this.f133031i;
    }

    public final int Y() {
        return this.f133030h;
    }

    @NotNull
    public final String Z(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String strF = this.f133024b.f(context);
        return strF == null ? this.f133024b.b() : strF;
    }

    @NotNull
    public final y4[] a0() {
        return this.f133023a.c();
    }

    @NotNull
    public final c1<Boolean> b0() {
        return this.f133026d;
    }

    @NotNull
    public final c1<Boolean> c0() {
        return this.f133027e;
    }

    public final void d0() {
        c1<Boolean> c1Var = this.f133026d;
        Boolean bool = Boolean.TRUE;
        c1Var.r(bool);
        this.f133027e.r(bool);
        this.f133028f.r(null);
        this.f133029g.r(null);
    }

    public final void f0(int i10) {
        this.f133030h = i10;
    }

    public final void g0(@Nullable String str, @Nullable String str2, boolean z10) {
        h0(str, str2);
        if (Intrinsics.areEqual(this.f133026d.f(), Boolean.TRUE)) {
            int i10 = 4 | 0;
            kotlinx.coroutines.k.f(g2.a(this), s.f229729a.a(), null, new c(str, str2, z10, null), 2, null);
        }
    }
}
