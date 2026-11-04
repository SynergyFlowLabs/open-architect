package androidx.compose.ui.text;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@v
@kotlin.l(message = "Use LinkAnnotatation.Url(url) instead", replaceWith = @kotlin.b1(expression = "LinkAnnotation.Url(url)", imports = {}))
public final class b4 implements f.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f41470b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f41471a;

    public b4(@NotNull String str) {
        this.f41471a = str;
    }

    @NotNull
    public final String a() {
        return this.f41471a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b4) && Intrinsics.areEqual(this.f41471a, ((b4) obj).f41471a);
    }

    public int hashCode() {
        return this.f41471a.hashCode();
    }

    @NotNull
    public String toString() {
        return "UrlAnnotation(url=" + this.f41471a + ')';
    }
}
