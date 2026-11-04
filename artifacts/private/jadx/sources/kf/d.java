package kf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f312198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final c f312199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f312200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f312201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final e f312202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f312203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f312204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f312205h;

    public d(@NotNull c wall0, @NotNull c wall1, int i10, int i11, @NotNull e color) {
        Intrinsics.checkNotNullParameter(wall0, "wall0");
        Intrinsics.checkNotNullParameter(wall1, "wall1");
        Intrinsics.checkNotNullParameter(color, "color");
        this.f312198a = wall0;
        this.f312199b = wall1;
        this.f312200c = i10;
        this.f312201d = i11;
        this.f312202e = color;
    }

    @NotNull
    public final e a() {
        return this.f312202e;
    }

    public final int b() {
        return this.f312201d;
    }

    public final int c() {
        return this.f312200c;
    }

    public final boolean d() {
        return this.f312205h;
    }

    @NotNull
    public final c e() {
        c cVar = this.f312203f;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mainWall");
        return null;
    }

    @NotNull
    public final c f() {
        c cVar = this.f312204g;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("relatedWall");
        return null;
    }

    @NotNull
    public final c g() {
        return this.f312198a;
    }

    @NotNull
    public final c h() {
        return this.f312199b;
    }

    public final void i(boolean z10) {
        this.f312205h = z10;
    }

    public final void j(@NotNull c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f312203f = cVar;
    }

    public final void k(@NotNull c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f312204g = cVar;
    }

    public final void l(@NotNull c mainWall, @NotNull c relatedWall, boolean z10) {
        Intrinsics.checkNotNullParameter(mainWall, "mainWall");
        Intrinsics.checkNotNullParameter(relatedWall, "relatedWall");
        j(mainWall);
        k(relatedWall);
        this.f312205h = z10;
        mainWall.h(this);
    }
}
