package com.planner5d.library.interactor;

import com.planner5d.library.model.manager.e1;
import com.planner5d.library.model.manager.o4;
import com.planner5d.library.model.manager.statistics.events.p3;
import com.planner5d.library.model.manager.statistics.events.r3;
import com.planner5d.library.model.manager.x4;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@com.planner5d.library.help.application.i0
public final class l0 implements le.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final o4 f180200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final e1 f180201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final r3 f180202c;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.interactor.SendSupportRequestInteractor", f = "SendSupportRequestInteractor.kt", i = {0}, l = {28}, m = "submit", n = {"this"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f180203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f180204b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f180206d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f180204b = obj;
            this.f180206d |= Integer.MIN_VALUE;
            return l0.this.a(null, null, false, 0, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.interactor.SendSupportRequestInteractor$submit$2", f = "SendSupportRequestInteractor.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f180207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f180208b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f180209c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f180210d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f180211e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ l0 f180212f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, String str, String str2, boolean z10, l0 l0Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f180208b = i10;
            this.f180209c = str;
            this.f180210d = str2;
            this.f180211e = z10;
            this.f180212f = l0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f180208b, this.f180209c, this.f180210d, this.f180211e, this.f180212f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f180207a;
            if (i10 == 0) {
                ResultKt.m(obj);
                x4 x4Var = new x4();
                x4Var.f222393d = this.f180208b;
                x4Var.f222392c = this.f180209c;
                x4Var.f222391b = this.f180210d;
                x4Var.f222394e = this.f180211e;
                x4Var.f222390a = this.f180212f.f180201b.a();
                o4 o4Var = this.f180212f.f180200a;
                this.f180207a = 1;
                if (o4Var.h(x4Var, this) == objL) {
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
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public l0(@NotNull o4 supportManager, @NotNull e1 installationManager, @NotNull r3 statisticsEventGeneric) {
        Intrinsics.checkNotNullParameter(supportManager, "supportManager");
        Intrinsics.checkNotNullParameter(installationManager, "installationManager");
        Intrinsics.checkNotNullParameter(statisticsEventGeneric, "statisticsEventGeneric");
        this.f180200a = supportManager;
        this.f180201b = installationManager;
        this.f180202c = statisticsEventGeneric;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    @Override // le.n
    @Nullable
    public Object a(@Nullable String str, @Nullable String str2, boolean z10, int i10, @NotNull kotlin.coroutines.d<? super com.planner5d.library.activity.fragment.dialog.support.k.b> dVar) {
        a aVar;
        l0 l0Var;
        l0 l0Var2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i11 = aVar.f180206d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f180206d = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        a aVar2 = aVar;
        Object obj = aVar2.f180204b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i12 = aVar2.f180206d;
        if (i12 == 0) {
            ResultKt.m(obj);
            this.f180202c.R0(p3.b.submit, null);
            try {
                z1 z1VarH = com.planner5d.library.services.utility.s.f229729a.h();
                b bVar = new b(i10, str, str2, z10, this, null);
                aVar2.f180203a = this;
                aVar2.f180206d = 1;
                if (kotlinx.coroutines.i.h(z1VarH, bVar, aVar2) == objL) {
                    return objL;
                }
                l0Var2 = this;
            } catch (Exception e10) {
                e = e10;
                l0Var = this;
                timber.log.b.f381052a.f(e, "Failed to send support request", new Object[0]);
                l0Var.f180202c.R0(p3.b.error, p3.a.other);
                return com.planner5d.library.activity.fragment.dialog.support.k.b.Error;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l0Var2 = (l0) aVar2.f180203a;
            try {
                ResultKt.m(obj);
            } catch (Exception e11) {
                e = e11;
                l0Var = l0Var2;
                timber.log.b.f381052a.f(e, "Failed to send support request", new Object[0]);
                l0Var.f180202c.R0(p3.b.error, p3.a.other);
                return com.planner5d.library.activity.fragment.dialog.support.k.b.Error;
            }
        }
        l0Var2.f180202c.R0(p3.b.success, null);
        return com.planner5d.library.activity.fragment.dialog.support.k.b.SubmitSuccess;
    }
}
