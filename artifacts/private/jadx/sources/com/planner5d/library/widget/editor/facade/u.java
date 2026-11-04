package com.planner5d.library.widget.editor.facade;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 1)
public final class u {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f256161f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final g f256162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final com.planner5d.library.widget.editor.helper.selector.a f256163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final i0.b f256164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final f f256165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final com.planner5d.library.widget.editor.helper.g f256166e;

    public u() {
        this(null, null, null, null, null, 31, null);
    }

    @Nullable
    public final f a() {
        return this.f256165d;
    }

    @Nullable
    public final g b() {
        return this.f256162a;
    }

    @Nullable
    public final com.planner5d.library.widget.editor.helper.g c() {
        return this.f256166e;
    }

    @Nullable
    public final com.planner5d.library.widget.editor.helper.selector.a d() {
        return this.f256163b;
    }

    @Nullable
    public final i0.b e() {
        return this.f256164c;
    }

    public u(@Nullable g gVar, @Nullable com.planner5d.library.widget.editor.helper.selector.a aVar, @Nullable i0.b bVar, @Nullable f fVar, @Nullable com.planner5d.library.widget.editor.helper.g gVar2) {
        this.f256162a = gVar;
        this.f256163b = aVar;
        this.f256164c = bVar;
        this.f256165d = fVar;
        this.f256166e = gVar2;
    }

    public /* synthetic */ u(g gVar, com.planner5d.library.widget.editor.helper.selector.a aVar, i0.b bVar, f fVar, com.planner5d.library.widget.editor.helper.g gVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : gVar, (i10 & 2) != 0 ? null : aVar, (i10 & 4) != 0 ? null : bVar, (i10 & 8) != 0 ? null : fVar, (i10 & 16) != 0 ? null : gVar2);
    }
}
