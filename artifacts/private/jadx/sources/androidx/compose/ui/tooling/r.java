package androidx.compose.ui.tooling;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.text.font.l1;
import kotlin.b1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
public final class r implements androidx.compose.ui.text.font.x.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f42637b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f42638a;

    public r(@NotNull Context context) {
        this.f42638a = context;
    }

    @Override // androidx.compose.ui.text.font.x.b
    @kotlin.l(message = "Replaced by FontFamily.Resolver, this method should not be called", replaceWith = @b1(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Typeface a(@NotNull androidx.compose.ui.text.font.x xVar) {
        if (xVar instanceof l1) {
            return x.f42644a.a(this.f42638a, (l1) xVar);
        }
        throw new IllegalArgumentException("Unknown font type: " + xVar.getClass().getName());
    }
}
