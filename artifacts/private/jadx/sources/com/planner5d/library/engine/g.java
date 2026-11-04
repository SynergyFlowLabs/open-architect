package com.planner5d.library.engine;

import com.planner5d.library.engine.util.math.Matrix4;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public interface g {
    void L1();

    float M1();

    void N1(float f10);

    @NotNull
    com.planner5d.library.math.m O1(@NotNull k kVar, @NotNull com.planner5d.library.math.m mVar);

    void P1(float f10, float f11, float f12);

    @NotNull
    com.planner5d.library.math.m Q1();

    void R1(float f10);

    @NotNull
    com.planner5d.library.engine.util.math.k S1(@NotNull k kVar, float f10, float f11);

    float T1();

    @NotNull
    Matrix4 U1();

    float V1();

    @NotNull
    com.planner5d.library.engine.util.math.c W1();

    float X1();

    @NotNull
    Matrix4 Y1();

    void Z1(boolean z10);

    @NotNull
    Matrix4 a2();

    void b2(float f10);

    void c2(float f10);

    @NotNull
    com.planner5d.library.math.m getPosition();

    @NotNull
    Matrix4 getView();

    @NotNull
    com.planner5d.library.math.m z();
}
