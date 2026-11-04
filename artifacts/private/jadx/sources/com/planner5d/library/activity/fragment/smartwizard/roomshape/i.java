package com.planner5d.library.activity.fragment.smartwizard.roomshape;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public enum i {
    square("square_shape_room"),
    diamond("diamond_room"),
    lType("l_shape_room"),
    tetris("tetris_room"),
    rectangle("rectangle_shape_room"),
    new_room("new_room"),
    shovel("shovel_room");


    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f135638j = kotlin.enums.c.c(k());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f135639a;

    static {
        int i10 = 2 >> 6;
    }

    i(String str) {
        this.f135639a = str;
    }

    @NotNull
    public static kotlin.enums.a<i> l() {
        return f135638j;
    }

    @NotNull
    public final String n() {
        return this.f135639a;
    }
}
