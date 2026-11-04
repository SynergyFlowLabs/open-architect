package fi;

import io.ktor.http.v0;
import io.ktor.utils.io.o0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@o0
public abstract class u extends io.ktor.http.content.w.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f275278b = kotlin.g0.c(new Function0() { // from class: fi.t
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return u.i();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.utils.io.b i() {
        return new io.ktor.utils.io.b(false, 1, null);
    }

    private final io.ktor.utils.io.b j() {
        return (io.ktor.utils.io.b) this.f275278b.getValue();
    }

    @NotNull
    public final io.ktor.utils.io.p k() {
        return j();
    }

    @Nullable
    public final Object l(@NotNull io.ktor.utils.io.p pVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        Object objF = io.ktor.utils.io.k.f(j(), pVar, dVar);
        return objF == kotlin.coroutines.intrinsics.b.l() ? objF : Unit.f312394a;
    }

    public abstract void m(@NotNull v0 v0Var);
}
