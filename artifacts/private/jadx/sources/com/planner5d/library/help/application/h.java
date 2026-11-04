package com.planner5d.library.help.application;

import android.app.Application;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.dialog.about.About;
import com.planner5d.library.activity.fragment.dialog.support.SupportDialog;
import com.planner5d.library.activity.fragment.profile.about.AboutFragment;
import com.planner5d.library.model.manager.h1;
import com.planner5d.library.model.manager.h2;
import com.planner5d.library.model.manager.o4;
import com.planner5d.library.model.manager.p5;
import com.planner5d.library.model.manager.statistics.events.v3;
import com.planner5d.library.model.manager.u1;
import com.planner5d.library.model.manager.y1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@fg.d(modules = {i.class, j0.class})
@i0
public abstract class h extends com.planner5d.library.view.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f179982b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static h f179983c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        public static /* synthetic */ void b() {
        }

        @NotNull
        public final h a() {
            h hVar = h.f179983c;
            if (hVar != null) {
                return hVar;
            }
            Intrinsics.throwUninitializedPropertyAccessException("INSTANCE");
            return null;
        }

        public final void c(@NotNull h hVar) {
            Intrinsics.checkNotNullParameter(hVar, "<set-?>");
            h.f179983c = hVar;
        }

        private a() {
        }
    }

    @fg.d.b
    public interface b {
        @NotNull
        h a(@NotNull i iVar);
    }

    @NotNull
    public static final h l() {
        return f179982b.a();
    }

    public static final void x(@NotNull h hVar) {
        f179982b.c(hVar);
    }

    @NotNull
    public abstract Application f();

    @NotNull
    public abstract com.planner5d.library.model.manager.h g();

    public abstract int h();

    @NotNull
    public abstract Class<? extends FragmentController> i();

    @NotNull
    public abstract com.planner5d.library.activity.fragment.dialog.k j();

    @NotNull
    public abstract com.planner5d.library.activity.fragment.x k();

    @NotNull
    public abstract h1 m();

    @NotNull
    public abstract u1 n();

    @NotNull
    public abstract y1 o();

    @NotNull
    public abstract h2 p();

    @NotNull
    public abstract com.planner5d.library.model.manager.config.p q();

    @NotNull
    public abstract v3 r();

    @NotNull
    public abstract o4 s();

    @NotNull
    public abstract p5 t();

    public abstract void u(@NotNull About about);

    public abstract void v(@NotNull SupportDialog supportDialog);

    public abstract void w(@NotNull AboutFragment aboutFragment);
}
