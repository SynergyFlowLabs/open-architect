package androidx.compose.ui.input.pointer;

import android.view.PointerIcon;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final x f38971a = new b(1000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final x f38972b = new b(1007);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final x f38973c = new b(1008);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final x f38974d = new b(1002);

    @NotNull
    public static final x a(int i10) {
        return new b(i10);
    }

    @NotNull
    public static final x b(@NotNull PointerIcon pointerIcon) {
        return new a(pointerIcon);
    }

    @NotNull
    public static final x c() {
        return f38972b;
    }

    @NotNull
    public static final x d() {
        return f38971a;
    }

    @NotNull
    public static final x e() {
        return f38974d;
    }

    @NotNull
    public static final x f() {
        return f38973c;
    }
}
