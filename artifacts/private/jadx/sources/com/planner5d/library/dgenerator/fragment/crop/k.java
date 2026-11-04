package com.planner5d.library.dgenerator.fragment.crop;

import android.net.Uri;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import androidx.lifecycle.w0;
import com.planner5d.library.database.model.AutoStyle;
import com.planner5d.library.services.utility.s;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final pd.a f160121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final pd.e f160122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final c1<Pair<a, Long>> f160123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final w0<Pair<a, Long>> f160124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final c1<AutoStyle> f160125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final w0<AutoStyle> f160126f;

    public enum a {
        Next;


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f160129c = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f160129c;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.dgenerator.fragment.crop.AutoStyleImageCropViewModel$loadAutoStyle$1", f = "AutoStyleImageCropViewModel.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f160130a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f160132c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j10, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f160132c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return k.this.new b(this.f160132c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f160130a;
            if (i10 == 0) {
                ResultKt.m(obj);
                pd.a aVar = k.this.f160121a;
                long j10 = this.f160132c;
                this.f160130a = 1;
                obj = aVar.a(j10, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            k.this.f160125e.o((AutoStyle) obj);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.dgenerator.fragment.crop.AutoStyleImageCropViewModel$processCropResult$1", f = "AutoStyleImageCropViewModel.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f160133a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f160134b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Uri f160136d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Uri uri, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f160136d = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return k.this.new c(this.f160136d, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            k kVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f160134b;
            if (i10 == 0) {
                ResultKt.m(obj);
                AutoStyle autoStyle = (AutoStyle) k.this.f160125e.f();
                if (autoStyle != null) {
                    Uri uri = this.f160136d;
                    k kVar2 = k.this;
                    autoStyle.H(uri.toString());
                    pd.e eVar = kVar2.f160122b;
                    this.f160133a = kVar2;
                    this.f160134b = 1;
                    obj = eVar.a(autoStyle, this);
                    if (obj == objL) {
                        return objL;
                    }
                    kVar = kVar2;
                }
                return Unit.f312394a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar = (k) this.f160133a;
            ResultKt.m(obj);
            kVar.f160123c.o(new Pair(a.Next, kotlin.coroutines.jvm.internal.b.g(((Number) obj).longValue())));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public k(@NotNull pd.a getAutoStyleUseCase, @NotNull pd.e saveAutoStyleUseCase) {
        Intrinsics.checkNotNullParameter(getAutoStyleUseCase, "getAutoStyleUseCase");
        Intrinsics.checkNotNullParameter(saveAutoStyleUseCase, "saveAutoStyleUseCase");
        this.f160121a = getAutoStyleUseCase;
        this.f160122b = saveAutoStyleUseCase;
        c1<Pair<a, Long>> c1Var = new c1<>(null);
        this.f160123c = c1Var;
        this.f160124d = c1Var;
        c1<AutoStyle> c1Var2 = new c1<>(null);
        this.f160125e = c1Var2;
        this.f160126f = c1Var2;
    }

    public final void Y() {
        this.f160123c.r(null);
    }

    @NotNull
    public final w0<AutoStyle> Z() {
        return this.f160126f;
    }

    @NotNull
    public final w0<Pair<a, Long>> a0() {
        return this.f160124d;
    }

    public final void b0(long j10) {
        kotlinx.coroutines.k.f(g2.a(this), s.f229729a.h(), null, new b(j10, null), 2, null);
    }

    public final void c0(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        int i10 = 3 << 0;
        kotlinx.coroutines.k.f(g2.a(this), s.f229729a.h(), null, new c(uri, null), 2, null);
    }
}
