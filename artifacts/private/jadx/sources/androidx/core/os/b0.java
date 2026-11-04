package androidx.core.os;

import android.os.PersistableBundle;
import androidx.annotation.w0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(22)
final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b0 f48032a = new b0();

    private b0() {
    }

    @oj.n
    public static final void a(@NotNull PersistableBundle persistableBundle, @Nullable String str, boolean z10) {
        persistableBundle.putBoolean(str, z10);
    }

    @oj.n
    public static final void b(@NotNull PersistableBundle persistableBundle, @Nullable String str, @NotNull boolean[] zArr) {
        persistableBundle.putBooleanArray(str, zArr);
    }
}
