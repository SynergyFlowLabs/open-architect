package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Typeface;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@kotlin.l(message = "Replaced with PlatformFontLoader during the introduction of async fonts, all usages should be replaced", replaceWith = @kotlin.b1(expression = "PlatformFontLoader", imports = {}))
public final class h0 implements androidx.compose.ui.text.font.x.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f40494b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f40495a;

    public h0(@NotNull Context context) {
        this.f40495a = context;
    }

    @Override // androidx.compose.ui.text.font.x.b
    @kotlin.l(message = "Replaced by FontFamily.Resolver, this method should not be called", replaceWith = @kotlin.b1(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Typeface a(@NotNull androidx.compose.ui.text.font.x xVar) {
        if (xVar instanceof androidx.compose.ui.text.font.l1) {
            return i0.f40508a.a(this.f40495a, ((androidx.compose.ui.text.font.l1) xVar).i());
        }
        throw new IllegalArgumentException("Unknown font type: " + xVar);
    }
}
