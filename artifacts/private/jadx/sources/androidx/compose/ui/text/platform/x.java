package androidx.compose.ui.text.platform;

import androidx.annotation.l1;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.n7;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
public final class x implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final x f42116a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static y f42117b = new v();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f42118c = 8;

    private x() {
    }

    @Override // androidx.compose.ui.text.platform.y
    @NotNull
    public n7<Boolean> a() {
        return f42117b.a();
    }

    @l1
    public final void b(@Nullable y yVar) {
        if (yVar == null) {
            yVar = new v();
        }
        f42117b = yVar;
    }
}
