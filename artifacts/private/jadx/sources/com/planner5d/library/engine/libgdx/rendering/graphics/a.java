package com.planner5d.library.engine.libgdx.rendering.graphics;

import com.planner5d.library.engine.k;
import com.planner5d.library.engine.util.math.Matrix4;
import com.planner5d.library.math.m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a implements com.planner5d.library.engine.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final e f160817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final m f160818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final m f160819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final m f160820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Matrix4 f160821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Matrix4 f160822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Matrix4 f160823g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final Matrix4 f160824h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f160825i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f160826j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f160827k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f160828l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.engine.util.math.c f160829m;

    public a(@NotNull e camera) {
        Intrinsics.checkNotNullParameter(camera, "camera");
        this.f160817a = camera;
        m position = camera.f160835a;
        Intrinsics.checkNotNullExpressionValue(position, "position");
        this.f160818b = position;
        m direction = camera.f160836b;
        Intrinsics.checkNotNullExpressionValue(direction, "direction");
        this.f160819c = direction;
        m up = camera.f160837c;
        Intrinsics.checkNotNullExpressionValue(up, "up");
        this.f160820d = up;
        Matrix4 projection = camera.f160838d;
        Intrinsics.checkNotNullExpressionValue(projection, "projection");
        this.f160821e = projection;
        Matrix4 view = camera.f160839e;
        Intrinsics.checkNotNullExpressionValue(view, "view");
        this.f160822f = view;
        Matrix4 combined = camera.f160840f;
        Intrinsics.checkNotNullExpressionValue(combined, "combined");
        this.f160823g = combined;
        Matrix4 invProjectionView = camera.f160841g;
        Intrinsics.checkNotNullExpressionValue(invProjectionView, "invProjectionView");
        this.f160824h = invProjectionView;
        this.f160825i = camera.f160842h;
        this.f160826j = camera.f160843i;
        this.f160827k = camera.f160844j;
        this.f160828l = camera.f160845k;
        com.planner5d.library.engine.util.math.c frustum = camera.f160846l;
        Intrinsics.checkNotNullExpressionValue(frustum, "frustum");
        this.f160829m = frustum;
    }

    @Override // com.planner5d.library.engine.g
    public float M1() {
        return this.f160827k;
    }

    @Override // com.planner5d.library.engine.g
    public void N1(float f10) {
        this.f160817a.f160843i = f10;
        this.f160826j = f10;
    }

    @Override // com.planner5d.library.engine.g
    @NotNull
    public m O1(@NotNull k graphics, @NotNull m worldCoordinates) {
        Intrinsics.checkNotNullParameter(graphics, "graphics");
        Intrinsics.checkNotNullParameter(worldCoordinates, "worldCoordinates");
        m mVarF = this.f160817a.f(graphics, t4.a.c(worldCoordinates));
        Intrinsics.checkNotNullExpressionValue(mVarF, "project(...)");
        return mVarF;
    }

    @Override // com.planner5d.library.engine.g
    public void P1(float f10, float f11, float f12) {
        this.f160817a.c(f10, f11, f12);
    }

    @Override // com.planner5d.library.engine.g
    @NotNull
    public m Q1() {
        return this.f160819c;
    }

    @Override // com.planner5d.library.engine.g
    public void R1(float f10) {
        this.f160817a.f160845k = f10;
        this.f160828l = f10;
    }

    @Override // com.planner5d.library.engine.g
    @NotNull
    public com.planner5d.library.engine.util.math.k S1(@NotNull k graphics, float f10, float f11) {
        Intrinsics.checkNotNullParameter(graphics, "graphics");
        com.planner5d.library.engine.util.math.k kVarA = this.f160817a.a(graphics, f10, f11);
        Intrinsics.checkNotNullExpressionValue(kVarA, "getPickRay(...)");
        return kVarA;
    }

    @Override // com.planner5d.library.engine.g
    public float T1() {
        return this.f160828l;
    }

    @Override // com.planner5d.library.engine.g
    @NotNull
    public Matrix4 U1() {
        return this.f160821e;
    }

    @Override // com.planner5d.library.engine.g
    public float V1() {
        return this.f160825i;
    }

    @Override // com.planner5d.library.engine.g
    @NotNull
    public com.planner5d.library.engine.util.math.c W1() {
        return this.f160829m;
    }

    @Override // com.planner5d.library.engine.g
    public float X1() {
        return this.f160826j;
    }

    @Override // com.planner5d.library.engine.g
    @NotNull
    public Matrix4 Y1() {
        return this.f160823g;
    }

    @Override // com.planner5d.library.engine.g
    @NotNull
    public Matrix4 a2() {
        return this.f160824h;
    }

    @Override // com.planner5d.library.engine.g
    public void b2(float f10) {
        this.f160817a.f160844j = f10;
        this.f160827k = f10;
    }

    @Override // com.planner5d.library.engine.g
    public void c2(float f10) {
        this.f160817a.f160842h = f10;
        this.f160825i = f10;
    }

    @Override // com.planner5d.library.engine.g
    @NotNull
    public m getPosition() {
        return this.f160818b;
    }

    @Override // com.planner5d.library.engine.g
    @NotNull
    public Matrix4 getView() {
        return this.f160822f;
    }

    @Override // com.planner5d.library.engine.g
    @NotNull
    public m z() {
        return this.f160820d;
    }
}
