package coil.request;

import kotlinx.coroutines.a1;
import kotlinx.coroutines.p2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a1<j> f87718a;

    /* JADX WARN: Multi-variable type inference failed */
    public m(@NotNull a1<? extends j> a1Var) {
        this.f87718a = a1Var;
    }

    @Override // coil.request.e
    @NotNull
    public a1<j> a() {
        return this.f87718a;
    }

    @Override // coil.request.e
    public void dispose() {
        if (k()) {
            return;
        }
        p2.a.b(a(), null, 1, null);
    }

    @Override // coil.request.e
    public boolean k() {
        return !a().isActive();
    }
}
