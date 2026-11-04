package androidx.compose.foundation.internal;

import android.content.ClipData;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.platform.k1;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f15653a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f15654b = 0;

    private a() {
    }

    @n
    public static final boolean a(@Nullable k1 k1Var) {
        if (k1Var == null) {
            return false;
        }
        return k1Var.a().getDescription().hasMimeType("text/*");
    }

    @n
    @Nullable
    public static final androidx.compose.ui.text.f b(@NotNull k1 k1Var) {
        CharSequence text;
        ClipData.Item itemAt = k1Var.a().getItemAt(0);
        if (itemAt == null || (text = itemAt.getText()) == null) {
            return null;
        }
        return b.a(text);
    }

    @n
    @Nullable
    public static final String c(@NotNull k1 k1Var) {
        CharSequence text;
        ClipData.Item itemAt = k1Var.a().getItemAt(0);
        if (itemAt == null || (text = itemAt.getText()) == null) {
            return null;
        }
        return text.toString();
    }

    @n
    @Nullable
    public static final k1 d(@Nullable androidx.compose.ui.text.f fVar) {
        if (fVar == null) {
            return null;
        }
        return new k1(ClipData.newPlainText("plain text", b.b(fVar)));
    }
}
