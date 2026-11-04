package com.planner5d.library.uploadplan.application;

import com.planner5d.library.activity.fragment.x;
import com.planner5d.library.uploadplan.view.UploadPlanCreateFragment;
import com.planner5d.library.uploadplan.view.UploadPlanScaleRulerFragment;
import com.planner5d.library.uploadplan.view.UploadPlanUploadFragment;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@fg.d(dependencies = {com.planner5d.library.application.c.class}, modules = {h.class, c.class, u.class})
@t
public abstract class g extends com.planner5d.library.view.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f230718b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final f0<g> f230719c = g0.c(new Function0() { // from class: com.planner5d.library.uploadplan.application.f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return g.g();
        }
    });

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final g a() {
            return (g) g.f230719c.getValue();
        }

        private a() {
        }
    }

    @fg.d.b
    public interface b {
        @NotNull
        g a(@NotNull com.planner5d.library.application.c cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g g() {
        return com.planner5d.library.uploadplan.application.a.a().a(com.planner5d.library.application.b.f142455c.a());
    }

    @NotNull
    public abstract com.planner5d.library.activity.fragment.dialog.k i();

    @NotNull
    public abstract x j();

    public abstract void k(@NotNull UploadPlanCreateFragment uploadPlanCreateFragment);

    public abstract void l(@NotNull UploadPlanScaleRulerFragment uploadPlanScaleRulerFragment);

    public abstract void m(@NotNull UploadPlanUploadFragment uploadPlanUploadFragment);
}
