package androidx.compose.ui.graphics;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface o1 {

    public static final class a implements androidx.compose.ui.graphics.shadow.i {
        a() {
        }
    }

    @NotNull
    default androidx.compose.ui.graphics.shadow.k a() {
        return new a();
    }

    @NotNull
    androidx.compose.ui.graphics.layer.c b();

    void c(@NotNull androidx.compose.ui.graphics.layer.c cVar);
}
