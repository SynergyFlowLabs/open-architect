package androidx.compose.material3;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class xs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final bt f34564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.interaction.j f34565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.interaction.j f34566c;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.RangeSliderLogic$captureThumb$1", f = "Slider.kt", i = {}, l = {2527}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34567a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34569c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.g f34570d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, androidx.compose.foundation.interaction.g gVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f34569c = z10;
            this.f34570d = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return xs.this.new a(this.f34569c, this.f34570d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f34567a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.foundation.interaction.j jVarA = xs.this.a(this.f34569c);
                androidx.compose.foundation.interaction.g gVar = this.f34570d;
                this.f34567a = 1;
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

    public xs(@NotNull bt btVar, @NotNull androidx.compose.foundation.interaction.j jVar, @NotNull androidx.compose.foundation.interaction.j jVar2) {
        this.f34564a = btVar;
        this.f34565b = jVar;
        this.f34566c = jVar2;
    }

    @NotNull
    public final androidx.compose.foundation.interaction.j a(boolean z10) {
        return z10 ? this.f34565b : this.f34566c;
    }

    public final void b(boolean z10, float f10, @NotNull androidx.compose.foundation.interaction.g gVar, @NotNull kotlinx.coroutines.s0 s0Var) {
        bt btVar = this.f34564a;
        btVar.B(z10, f10 - (z10 ? btVar.r() : btVar.q()));
        int i10 = 2 ^ 3;
        kotlinx.coroutines.k.f(s0Var, null, null, new a(z10, gVar, null), 3, null);
    }

    public final int c(float f10) {
        return Float.compare(Math.abs(this.f34564a.r() - f10), Math.abs(this.f34564a.q() - f10));
    }

    @NotNull
    public final androidx.compose.foundation.interaction.j d() {
        return this.f34566c;
    }

    @NotNull
    public final androidx.compose.foundation.interaction.j e() {
        return this.f34565b;
    }

    @NotNull
    public final bt f() {
        return this.f34564a;
    }
}
