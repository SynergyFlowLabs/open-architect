package androidx.lifecycle.compose;

import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.o0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
public final class a0 implements o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f52186b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.c0 f52187a;

    public static final class a implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<o0, Unit> f52188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0 f52189b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super o0, Unit> function1, a0 a0Var) {
            this.f52188a = function1;
            this.f52189b = a0Var;
        }

        @Override // androidx.lifecycle.compose.b0
        public void a() {
            this.f52188a.invoke(this.f52189b);
        }
    }

    public a0(@NotNull androidx.lifecycle.c0 c0Var) {
        this.f52187a = c0Var;
    }

    @NotNull
    public final b0 a(@NotNull Function1<? super o0, Unit> function1) {
        return new a(function1, this);
    }

    @Override // androidx.lifecycle.o0
    @NotNull
    public androidx.lifecycle.c0 getLifecycle() {
        return this.f52187a;
    }
}
