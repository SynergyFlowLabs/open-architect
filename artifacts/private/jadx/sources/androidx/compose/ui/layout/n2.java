package androidx.compose.ui.layout;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class n2 implements m2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f39447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private i3 f39448c = new i3();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private t f39449d = new t();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private i3 f39450e = new i3();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private t f39451f = new t();

    public n2(@Nullable String str) {
        this.f39447b = str;
    }

    public void a(@NotNull t tVar) {
        this.f39451f = tVar;
    }

    @Override // androidx.compose.ui.layout.m2
    @NotNull
    public t b() {
        return this.f39451f;
    }

    public void c(@NotNull i3 i3Var) {
        this.f39448c = i3Var;
    }

    public void d(@NotNull i3 i3Var) {
        this.f39450e = i3Var;
    }

    public void e(@NotNull t tVar) {
        this.f39449d = tVar;
    }

    @Override // androidx.compose.ui.layout.m2
    @NotNull
    public t n() {
        return this.f39449d;
    }

    @NotNull
    public String toString() {
        if (this.f39447b == null) {
            return super.toString();
        }
        return "RectRulers(" + this.f39447b + ')';
    }

    @Override // androidx.compose.ui.layout.m2
    @NotNull
    public i3 x() {
        return this.f39450e;
    }

    @Override // androidx.compose.ui.layout.m2
    @NotNull
    public i3 y() {
        return this.f39448c;
    }
}
