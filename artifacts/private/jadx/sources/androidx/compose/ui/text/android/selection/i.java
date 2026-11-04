package androidx.compose.ui.text.android.selection;

import androidx.compose.runtime.internal.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
public final class i implements e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f41437e = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final CharSequence f41438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final h f41439d;

    public i(@NotNull CharSequence charSequence, @NotNull h hVar) {
        this.f41438c = charSequence;
        this.f41439d = hVar;
    }

    @Override // androidx.compose.ui.text.android.selection.e
    public int a(int i10) {
        do {
            i10 = this.f41439d.r(i10);
            if (i10 == -1 || i10 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(this.f41438c.charAt(i10 - 1)));
        return i10;
    }

    @Override // androidx.compose.ui.text.android.selection.e
    public int b(int i10) {
        do {
            i10 = this.f41439d.q(i10);
            if (i10 == -1 || i10 == this.f41438c.length()) {
                return -1;
            }
        } while (Character.isWhitespace(this.f41438c.charAt(i10)));
        return i10;
    }

    @Override // androidx.compose.ui.text.android.selection.e
    public int c(int i10) {
        do {
            i10 = this.f41439d.r(i10);
            if (i10 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.f41438c.charAt(i10)));
        return i10;
    }

    @Override // androidx.compose.ui.text.android.selection.e
    public int d(int i10) {
        do {
            i10 = this.f41439d.q(i10);
            if (i10 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.f41438c.charAt(i10 - 1)));
        return i10;
    }
}
