package com.planner5d.library.activity.fragment.intenthandler;

import android.app.Activity;
import android.content.Intent;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import le.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class b extends f2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f133951d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final e f133952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final c1<a> f133953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<a> f133954c;

    @w0(parameters = 1)
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f133955a = 0;

        /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.intenthandler.b$a$a, reason: collision with other inner class name */
        @w0(parameters = 1)
        public static final class C1472a extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final C1472a f133956b = new C1472a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f133957c = 0;

            private C1472a() {
                super(null);
            }

            public boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof C1472a);
            }

            public int hashCode() {
                return -737791486;
            }

            @NotNull
            public String toString() {
                return com.facebook.internal.a.f99695s;
            }
        }

        /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.intenthandler.b$a$b, reason: collision with other inner class name */
        @w0(parameters = 1)
        public static final class C1473b extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final C1473b f133958b = new C1473b();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f133959c = 0;

            private C1473b() {
                super(null);
            }

            public boolean equals(@Nullable Object obj) {
                if (this != obj && !(obj instanceof C1473b)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 2092464539;
            }

            @NotNull
            public String toString() {
                return "InProgress";
            }
        }

        @w0(parameters = 1)
        public static final class c extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final c f133960b = new c();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f133961c = 0;

            private c() {
                super(null);
            }

            public boolean equals(@Nullable Object obj) {
                if (this != obj && !(obj instanceof c)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 947918011;
            }

            @NotNull
            public String toString() {
                return "Initial";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.intenthandler.b$b, reason: collision with other inner class name */
    @f(c = "com.planner5d.library.activity.fragment.intenthandler.IntentHandlerViewModel$onNewIntent$1", f = "IntentHandlerViewModel.kt", i = {}, l = {24}, m = "invokeSuspend", n = {}, s = {})
    static final class C1474b extends o implements Function2<s0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f133962a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Intent f133964c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Activity f133965d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1474b(Intent intent, Activity activity, d<? super C1474b> dVar) {
            super(2, dVar);
            this.f133964c = intent;
            this.f133965d = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return b.this.new C1474b(this.f133964c, this.f133965d, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Unit] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f133962a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    e eVar = b.this.f133952a;
                    Intent intent = this.f133964c;
                    Activity activity = this.f133965d;
                    this.f133962a = 1;
                    if (eVar.a(intent, activity, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                b.this.f133953b.r(a.C1472a.f133956b);
                this = Unit.f312394a;
                return this;
            } catch (Throwable th2) {
                b.this.f133953b.r(a.C1472a.f133956b);
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C1474b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public b(@NotNull e handleNewIntentUseCase) {
        Intrinsics.checkNotNullParameter(handleNewIntentUseCase, "handleNewIntentUseCase");
        this.f133952a = handleNewIntentUseCase;
        c1<a> c1Var = new c1<>(a.c.f133960b);
        this.f133953b = c1Var;
        this.f133954c = c1Var;
    }

    @NotNull
    public final androidx.lifecycle.w0<a> W() {
        return this.f133954c;
    }

    public final void X(@NotNull Intent intent, @NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f133953b.r(a.C1473b.f133958b);
        k.f(g2.a(this), null, null, new C1474b(intent, activity, null), 3, null);
    }
}
