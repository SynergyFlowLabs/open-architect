package com.planner5d.library.view.application;

import android.content.Context;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.x;
import com.planner5d.library.model.manager.u1;
import com.planner5d.library.model.manager.y1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@fg.d(modules = {d.class, n.class})
@m
public abstract class c extends com.planner5d.library.view.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f244830b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static c f244831c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        public static /* synthetic */ void b() {
        }

        @NotNull
        public final c a() {
            c cVar = c.f244831c;
            if (cVar != null) {
                return cVar;
            }
            Intrinsics.throwUninitializedPropertyAccessException("INSTANCE");
            return null;
        }

        public final void c(@NotNull c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            c.f244831c = cVar;
        }

        private a() {
        }
    }

    @fg.d.b
    public interface b {
        @NotNull
        c a(@NotNull d dVar);
    }

    @NotNull
    public static final c k() {
        return f244830b.a();
    }

    public static final void n(@NotNull c cVar) {
        f244830b.c(cVar);
    }

    public abstract int f();

    @NotNull
    public abstract Context g();

    @NotNull
    public abstract Class<? extends FragmentController> h();

    @NotNull
    public abstract com.planner5d.library.activity.fragment.dialog.k i();

    @NotNull
    public abstract x j();

    @NotNull
    public abstract u1 l();

    @NotNull
    public abstract y1 m();
}
