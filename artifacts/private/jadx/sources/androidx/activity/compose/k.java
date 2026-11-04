package androidx.activity.compose;

import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.n7;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class k<I, O> extends androidx.activity.result.h<I> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f9830c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final b<I> f9831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n7<g.a<I, O>> f9832b;

    /* JADX WARN: Multi-variable type inference failed */
    public k(@NotNull b<I> bVar, @NotNull n7<? extends g.a<I, O>> n7Var) {
        this.f9831a = bVar;
        this.f9832b = n7Var;
    }

    @Override // androidx.activity.result.h
    @NotNull
    public g.a<I, O> a() {
        return this.f9832b.getValue();
    }

    @Override // androidx.activity.result.h
    public void c(I i10, @Nullable androidx.core.app.e eVar) {
        this.f9831a.b(i10, eVar);
    }

    @Override // androidx.activity.result.h
    @kotlin.l(message = "Registration is automatically handled by rememberLauncherForActivityResult")
    public void d() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
