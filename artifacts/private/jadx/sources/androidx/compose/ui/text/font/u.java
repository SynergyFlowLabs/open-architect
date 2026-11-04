package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class u extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final String f41720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final v0 f41721h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f41722i;

    public /* synthetic */ u(String str, v0 v0Var, int i10, u0.e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, v0Var, i10, eVar);
    }

    @Override // androidx.compose.ui.text.font.x
    @NotNull
    public v0 a() {
        return this.f41721h;
    }

    @Override // androidx.compose.ui.text.font.x
    public int c() {
        return this.f41722i;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return t.d(this.f41720g, uVar.f41720g) && Intrinsics.areEqual(a(), uVar.a()) && q0.f(c(), uVar.c()) && Intrinsics.areEqual(e(), uVar.e());
    }

    @Nullable
    public final Typeface f(@NotNull Context context) {
        return k1.a().c(this.f41720g, a(), c(), e(), context);
    }

    public int hashCode() {
        return (((((t.f(this.f41720g) * 31) + a().hashCode()) * 31) + q0.h(c())) * 31) + e().hashCode();
    }

    @NotNull
    public String toString() {
        return "Font(familyName=\"" + ((Object) t.g(this.f41720g)) + "\", weight=" + a() + ", style=" + ((Object) q0.i(c())) + ')';
    }

    private u(String str, v0 v0Var, int i10, u0.e eVar) {
        super(o0.f41676b.c(), b1.f41558a, eVar, null);
        this.f41720g = str;
        this.f41721h = v0Var;
        this.f41722i = i10;
    }
}
