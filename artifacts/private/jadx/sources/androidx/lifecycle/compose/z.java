package androidx.lifecycle.compose;

import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.o0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
public final class z implements o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f52301b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.c0 f52302a;

    public static final class a implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<o0, Unit> f52303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z f52304b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super o0, Unit> function1, z zVar) {
            this.f52303a = function1;
            this.f52304b = zVar;
        }

        @Override // androidx.lifecycle.compose.y
        public void a() {
            this.f52303a.invoke(this.f52304b);
        }
    }

    public z(@NotNull androidx.lifecycle.c0 c0Var) {
        this.f52302a = c0Var;
    }

    @NotNull
    public final y a(@NotNull Function1<? super o0, Unit> function1) {
        return new a(function1, this);
    }

    @Override // androidx.lifecycle.o0
    @NotNull
    public androidx.lifecycle.c0 getLifecycle() {
        return this.f52302a;
    }
}
