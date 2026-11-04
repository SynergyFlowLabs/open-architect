package com.planner5d.library.widget.editor;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.os.Bundle;
import androidx.annotation.f1;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.math.m;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.widget.editor.editaction.h;
import com.planner5d.library.widget.editor.facade.u;
import com.planner5d.library.widget.editor.helper.g1;
import com.planner5d.library.widget.event.directional.i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;

/* JADX INFO: loaded from: classes12.dex */
public interface a extends i {

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    @NotNull
    public static final C1721a f254298t2 = C1721a.f254305a;

    /* JADX INFO: renamed from: u2, reason: collision with root package name */
    public static final int f254299u2 = 855638016;

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    public static final int f254300v2 = -16777216;

    /* JADX INFO: renamed from: w2, reason: collision with root package name */
    public static final int f254301w2 = 570425344;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f254302x2 = 1878891;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public static final int f254303y2 = -14898325;

    /* JADX INFO: renamed from: z2, reason: collision with root package name */
    public static final int f254304z2 = 857516907;

    /* JADX INFO: renamed from: com.planner5d.library.widget.editor.a$a, reason: collision with other inner class name */
    public static final class C1721a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C1721a f254305a = new C1721a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private static final c f254306b = new c(com.planner5d.library.f.s.TG);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private static final c f254307c = new c(com.planner5d.library.f.s.RG);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private static final c f254308d = new c(com.planner5d.library.f.s.XG);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private static final c f254309e = new c(com.planner5d.library.f.s.QG);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private static final c f254310f = new c(com.planner5d.library.f.s.VG);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        private static final c f254311g = new c(com.planner5d.library.f.s.WG);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        private static final c f254312h = new c(com.planner5d.library.f.s.SG);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        private static final c f254313i = new c(com.planner5d.library.f.s.UG);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        private static final c f254314j = new c(com.planner5d.library.f.s.YG);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        private static final c f254315k = new c(com.planner5d.library.f.s.ZG);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        private static final c f254316l = new c(com.planner5d.library.f.s.IC);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NotNull
        private static final c f254317m = new c(com.planner5d.library.f.s.HB);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f254318n = 855638016;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f254319o = -16777216;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f254320p = 570425344;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f254321q = 1878891;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f254322r = -14898325;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f254323s = 857516907;

        private C1721a() {
        }

        public static /* synthetic */ void a() {
        }

        @NotNull
        public final c b() {
            return f254309e;
        }

        @NotNull
        public final c c() {
            return f254307c;
        }

        @NotNull
        public final c d() {
            return f254312h;
        }

        @NotNull
        public final c e() {
            return f254306b;
        }

        @NotNull
        public final c f() {
            return f254313i;
        }

        @NotNull
        public final c g() {
            return f254317m;
        }

        @NotNull
        public final c h() {
            return f254316l;
        }

        @NotNull
        public final c i() {
            return f254310f;
        }

        @NotNull
        public final c j() {
            return f254311g;
        }

        @NotNull
        public final c k() {
            return f254308d;
        }

        @NotNull
        public final c l() {
            return f254314j;
        }

        @NotNull
        public final c m() {
            return f254315k;
        }
    }

    @w0(parameters = 1)
    public static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f254324b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f254325a;

        public b(int i10) {
            this.f254325a = i10;
        }

        public final int a() {
            return this.f254325a;
        }
    }

    @w0(parameters = 1)
    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f254326b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f254327a;

        public c(@f1 int i10) {
            this.f254327a = i10;
        }

        @NotNull
        public final String a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string = context.getString(this.f254327a);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
    }

    public enum d {
        Left,
        Right;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f254331d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<d> l() {
            return f254331d;
        }
    }

    void a(float f10);

    void b();

    void e(float f10, boolean z10);

    void f(@NotNull com.planner5d.library.widget.editor.editaction.e eVar, @NotNull h hVar);

    @NotNull
    String getEditorCode();

    @Nullable
    vd.a getRenderCamera();

    @Nullable
    Item getSelectedItem();

    @Nullable
    Bundle getState();

    void h(float f10, boolean z10);

    @Nullable
    Observable<Void> i(@Nullable Item item);

    @NotNull
    PointF j(@NotNull PointF pointF);

    void m(@Nullable Item item);

    @Nullable
    Observable<Bitmap> o();

    void setHelper(@Nullable g1 g1Var);

    void setListeners(@NotNull u uVar);

    void setState(@Nullable Bundle bundle);

    void u(boolean z10);

    @NotNull
    PointF x(@NotNull m mVar);

    @Nullable
    Observable<b> y(@Nullable ItemProject itemProject);

    @NotNull
    Observable<Void> z();
}
