package ef;

import android.view.View;
import androidx.compose.runtime.internal.w0;
import androidx.core.view.b1;
import androidx.core.view.g3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 1)
public final class b implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f274869a = 0;

    @Override // androidx.core.view.b1
    @NotNull
    public g3 b(@NotNull View view, @NotNull g3 insets) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        int i10 = insets.f(g3.m.g()).f47826d;
        timber.log.b.C2515b c2515b = timber.log.b.f381052a;
        c2515b.a("navigationBarInset %s", Integer.valueOf(i10));
        int i11 = insets.f(g3.m.d()).f47826d;
        c2515b.a("keyboardBottomInset %s", Integer.valueOf(i11));
        view.setPadding(0, 0, 0, i11 > 0 ? i11 - i10 : 0);
        return insets;
    }
}
