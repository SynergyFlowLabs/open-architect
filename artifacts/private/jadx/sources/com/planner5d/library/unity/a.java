package com.planner5d.library.unity;

import com.planner5d.library.math.n;
import com.planner5d.library.walls.Wall;
import com.planner5d.library.walls.WallsInfoWall;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f230643a = new a();

    private a() {
    }

    @NotNull
    public final float[] a(int i10) {
        return new float[i10];
    }

    public final int b(@NotNull float[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return array.length;
    }

    public final float c(@NotNull float[] array, int i10) {
        Intrinsics.checkNotNullParameter(array, "array");
        return array[i10];
    }

    @NotNull
    public final List<Object> d(@NotNull List<Object> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        return list;
    }

    @NotNull
    public final List<Object> e() {
        return new ArrayList();
    }

    public final void f(@NotNull List<Object> list, @NotNull Object item) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(item, "item");
        list.add(item);
    }

    public final void g(@NotNull List<Object> list, @NotNull Wall item) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(item, "item");
        list.add(item);
    }

    @Nullable
    public final <T> T h(@NotNull List<? extends T> list, int i10) {
        Intrinsics.checkNotNullParameter(list, "list");
        return list.get(i10);
    }

    @Nullable
    public final Object i(@NotNull List<? extends Object> list, int i10) {
        Intrinsics.checkNotNullParameter(list, "list");
        return list.get(i10);
    }

    @Nullable
    public final e j(@NotNull List<e> list, int i10) {
        Intrinsics.checkNotNullParameter(list, "list");
        return (e) h(list, i10);
    }

    @Nullable
    public final h k(@NotNull List<h> list, int i10) {
        Intrinsics.checkNotNullParameter(list, "list");
        return (h) h(list, i10);
    }

    @Nullable
    public final n l(@NotNull List<n> list, int i10) {
        Intrinsics.checkNotNullParameter(list, "list");
        return (n) h(list, i10);
    }

    @Nullable
    public final WallsInfoWall m(@NotNull List<? extends WallsInfoWall> list, int i10) {
        Intrinsics.checkNotNullParameter(list, "list");
        return (WallsInfoWall) h(list, i10);
    }

    public final int n(@NotNull List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        return list.size();
    }

    public final void o(@NotNull float[] array, int i10, float f10) {
        Intrinsics.checkNotNullParameter(array, "array");
        array[i10] = f10;
    }
}
