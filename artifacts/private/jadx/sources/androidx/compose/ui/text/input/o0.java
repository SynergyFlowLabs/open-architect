package androidx.compose.ui.text.input;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class o0 implements j1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f41923c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char f41924b;

    public o0() {
        this((char) 0, 1, null);
    }

    @Override // androidx.compose.ui.text.input.j1
    @NotNull
    public h1 a(@NotNull androidx.compose.ui.text.f fVar) {
        return new h1(new androidx.compose.ui.text.f(StringsKt.g2(String.valueOf(this.f41924b), fVar.m().length()), null, 2, null), m0.f41903a.a());
    }

    public final char b() {
        return this.f41924b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0) && this.f41924b == ((o0) obj).f41924b;
    }

    public int hashCode() {
        return Character.hashCode(this.f41924b);
    }

    public o0(char c10) {
        this.f41924b = c10;
    }

    public /* synthetic */ o0(char c10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? kotlin.text.b0.E : c10);
    }
}
