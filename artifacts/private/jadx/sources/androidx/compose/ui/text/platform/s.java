package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.text.font.v0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
public final class s implements q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f42107c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Typeface f42108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.text.font.y f42109b;

    public s(@NotNull Typeface typeface) {
        this.f42108a = typeface;
    }

    @Override // androidx.compose.ui.text.font.n1
    @Nullable
    public androidx.compose.ui.text.font.y a() {
        return this.f42109b;
    }

    @Override // androidx.compose.ui.text.platform.q
    @NotNull
    public Typeface b(@NotNull v0 v0Var, int i10, int i11) {
        return this.f42108a;
    }

    @NotNull
    public final Typeface c() {
        return this.f42108a;
    }
}
