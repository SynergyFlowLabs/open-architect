package com.planner5d.library.activity.fragment.smartwizard.dimensions;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.item.ItemEditableWall;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class w {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f135584h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f135585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f135586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f135587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final ItemEditableWall f135588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final kf.d f135589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private ItemEditableWall f135590f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private w f135591g;

    public w(int i10, int i11, int i12, @NotNull ItemEditableWall wallItem, @NotNull kf.d constraint) {
        Intrinsics.checkNotNullParameter(wallItem, "wallItem");
        Intrinsics.checkNotNullParameter(constraint, "constraint");
        this.f135585a = i10;
        this.f135586b = i11;
        this.f135587c = i12;
        this.f135588d = wallItem;
        this.f135589e = constraint;
    }

    @NotNull
    public final kf.d a() {
        return this.f135589e;
    }

    public final int b() {
        return this.f135585a;
    }

    public final int c() {
        return this.f135587c;
    }

    public final int d() {
        return this.f135586b;
    }

    @Nullable
    public final ItemEditableWall e() {
        return this.f135590f;
    }

    @Nullable
    public final w f() {
        return this.f135591g;
    }

    @NotNull
    public final ItemEditableWall g() {
        return this.f135588d;
    }

    public final void h(int i10) {
        this.f135585a = i10;
    }

    public final void i(int i10) {
        this.f135587c = i10;
    }

    public final void j(int i10) {
        this.f135586b = i10;
    }

    public final void k(@Nullable ItemEditableWall itemEditableWall) {
        this.f135590f = itemEditableWall;
    }

    public final void l(@Nullable w wVar) {
        this.f135591g = wVar;
    }
}
