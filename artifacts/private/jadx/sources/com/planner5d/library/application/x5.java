package com.planner5d.library.application;

import android.app.Application;
import android.content.Context;
import android.view.View;
import com.planner5d.library.widget.carousel.CarouselView;
import com.planner5d.library.widget.preloader.PreloaderCoverView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class x5 extends w5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f148322d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Context f148323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.drawable.d f148324c;

    public static final class a implements s5 {
        a() {
        }

        @Override // com.planner5d.library.application.s5
        public com.planner5d.library.widget.a1 a(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            com.planner5d.library.widget.preloader.h0 h0VarA = new com.planner5d.library.widget.preloader.t(view).a();
            Intrinsics.checkNotNullExpressionValue(h0VarA, "get(...)");
            return h0VarA;
        }

        @Override // com.planner5d.library.application.s5
        public com.planner5d.library.widget.j b(boolean z10, int i10) {
            return new CarouselView(x5.this.f148323b, null, 0, Boolean.valueOf(z10), Integer.valueOf(i10));
        }

        @Override // com.planner5d.library.application.s5
        public View c() {
            return new PreloaderCoverView(x5.this.f148323b);
        }
    }

    public x5(@NotNull Context context, @NotNull com.planner5d.library.widget.drawable.d drawableUtilsVector) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(drawableUtilsVector, "drawableUtilsVector");
        this.f148323b = context;
        this.f148324c = drawableUtilsVector;
    }

    @Override // com.planner5d.library.application.w5
    @NotNull
    public Application a() {
        return b.f142455c.a().S0();
    }

    @Override // com.planner5d.library.application.w5
    @NotNull
    public com.planner5d.library.widget.drawable.d b() {
        return this.f148324c;
    }

    @Override // com.planner5d.library.application.w5
    @NotNull
    public com.planner5d.library.services.utility.z0 c() {
        return b.f142455c.a().O1();
    }

    @Override // com.planner5d.library.application.w5
    @NotNull
    public com.planner5d.library.model.manager.config.p d() {
        return b.f142455c.a().n2();
    }

    @Override // com.planner5d.library.application.w5
    @NotNull
    public s5 e() {
        return new a();
    }
}
