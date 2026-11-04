package androidx.compose.ui.layout;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
final class l3 implements k3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f39416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final m2 f39417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final m2 f39418d;

    public l3(@NotNull String str) {
        this.f39416b = str;
        this.f39417c = o2.b(str);
        this.f39418d = o2.b(str + " maximum");
    }

    @Override // androidx.compose.ui.layout.k3
    @NotNull
    public m2 a() {
        return this.f39417c;
    }

    @Override // androidx.compose.ui.layout.k3
    @NotNull
    public m2 b() {
        return this.f39418d;
    }

    @Override // androidx.compose.ui.layout.k3
    @NotNull
    public j3 c(@NotNull i2.a aVar) {
        return n3.g(aVar, this);
    }

    @NotNull
    public final String d() {
        return this.f39416b;
    }

    @NotNull
    public String toString() {
        return this.f39416b;
    }
}
