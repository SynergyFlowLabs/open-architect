package androidx.compose.foundation.lazy.layout;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class o extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f17490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.q<Float, androidx.compose.animation.core.s> f17491b;

    public o(int i10, @NotNull androidx.compose.animation.core.q<Float, androidx.compose.animation.core.s> qVar) {
        this.f17490a = i10;
        this.f17491b = qVar;
    }

    public final int a() {
        return this.f17490a;
    }

    @NotNull
    public final androidx.compose.animation.core.q<Float, androidx.compose.animation.core.s> b() {
        return this.f17491b;
    }
}
