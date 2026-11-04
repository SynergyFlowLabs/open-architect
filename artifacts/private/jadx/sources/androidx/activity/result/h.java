package androidx.activity.result;

import androidx.annotation.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class h<I> {
    @NotNull
    public abstract g.a<I, ?> a();

    public void b(I i10) {
        c(i10, null);
    }

    public abstract void c(I i10, @Nullable androidx.core.app.e eVar);

    @l0
    public abstract void d();
}
