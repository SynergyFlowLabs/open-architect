package com.planner5d.library.project.application;

import com.planner5d.library.project.fragment.aidesigner.AiFlowFragment;
import com.planner5d.library.project.fragment.roomstyle.RoomStyleFragment;
import com.planner5d.library.project.fragment.roomtype.RoomTypeFragment;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@fg.d(dependencies = {com.planner5d.library.application.c.class}, modules = {d.class, j.class, k.class})
@i
public abstract class c extends com.planner5d.library.view.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f223658b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final c f223659c = com.planner5d.library.project.application.a.a().a(com.planner5d.library.application.b.f142455c.a());

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final c a() {
            return c.f223659c;
        }

        private a() {
        }
    }

    @fg.d.b
    public interface b {
        @NotNull
        c a(@NotNull com.planner5d.library.application.c cVar);
    }

    static {
        int i10 = 4 << 0;
    }

    @NotNull
    public abstract pd.a g();

    @NotNull
    public abstract pd.e h();

    public abstract void i(@NotNull AiFlowFragment aiFlowFragment);

    public abstract void j(@NotNull RoomStyleFragment roomStyleFragment);

    public abstract void k(@NotNull RoomTypeFragment roomTypeFragment);
}
