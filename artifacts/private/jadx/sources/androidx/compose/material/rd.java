package androidx.compose.material;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class rd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.interaction.j f24644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.interaction.j f24645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n7<Float> f24646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n7<Float> f24647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n7<Function2<Boolean, Float, Unit>> f24648e;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.RangeSliderLogic$captureThumb$1", f = "Slider.kt", i = {}, l = {1168}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24649a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f24651c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.g f24652d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, androidx.compose.foundation.interaction.g gVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f24651c = z10;
            this.f24652d = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return rd.this.new a(this.f24651c, this.f24652d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f24649a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.foundation.interaction.j jVarA = rd.this.a(this.f24651c);
                androidx.compose.foundation.interaction.g gVar = this.f24652d;
                this.f24649a = 1;
                if (jVarA.b(gVar, this) == objL) {
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
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rd(@NotNull androidx.compose.foundation.interaction.j jVar, @NotNull androidx.compose.foundation.interaction.j jVar2, @NotNull androidx.compose.runtime.n7<Float> n7Var, @NotNull androidx.compose.runtime.n7<Float> n7Var2, @NotNull androidx.compose.runtime.n7<? extends Function2<? super Boolean, ? super Float, Unit>> n7Var3) {
        this.f24644a = jVar;
        this.f24645b = jVar2;
        this.f24646c = n7Var;
        this.f24647d = n7Var2;
        this.f24648e = n7Var3;
    }

    @NotNull
    public final androidx.compose.foundation.interaction.j a(boolean z10) {
        return z10 ? this.f24644a : this.f24645b;
    }

    public final void b(boolean z10, float f10, @NotNull androidx.compose.foundation.interaction.g gVar, @NotNull kotlinx.coroutines.s0 s0Var) {
        this.f24648e.getValue().invoke(Boolean.valueOf(z10), Float.valueOf(f10 - (z10 ? this.f24646c : this.f24647d).getValue().floatValue()));
        kotlinx.coroutines.k.f(s0Var, null, null, new a(z10, gVar, null), 3, null);
    }

    public final int c(float f10) {
        return Float.compare(Math.abs(this.f24646c.getValue().floatValue() - f10), Math.abs(this.f24647d.getValue().floatValue() - f10));
    }

    @NotNull
    public final androidx.compose.foundation.interaction.j d() {
        return this.f24645b;
    }

    @NotNull
    public final androidx.compose.runtime.n7<Function2<Boolean, Float, Unit>> e() {
        return this.f24648e;
    }

    @NotNull
    public final androidx.compose.runtime.n7<Float> f() {
        return this.f24647d;
    }

    @NotNull
    public final androidx.compose.runtime.n7<Float> g() {
        return this.f24646c;
    }

    @NotNull
    public final androidx.compose.foundation.interaction.j h() {
        return this.f24644a;
    }
}
