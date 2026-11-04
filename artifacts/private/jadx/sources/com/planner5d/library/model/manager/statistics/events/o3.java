package com.planner5d.library.model.manager.statistics.events;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public interface o3 {

    public enum a {
        undo,
        redo,
        share,
        save_to_file,
        snapshot,
        click_export,
        success_export;


        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217225i = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f217225i;
        }
    }

    public enum b {
        category,
        subcategory;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217229d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f217229d;
        }
    }

    public enum c {
        f217230a,
        contest;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217233d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<c> l() {
            return f217233d;
        }
    }

    public enum d {
        dwg,
        dfx;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217237d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<d> l() {
            return f217237d;
        }
    }

    public enum e {
        create,
        rename,
        duplicate,
        remove,
        active,
        ordering;


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217245h = kotlin.enums.c.c(k());

        static {
            int i10 = 3 << 5;
        }

        @NotNull
        public static kotlin.enums.a<e> l() {
            return f217245h;
        }
    }

    public enum f {
        renders;


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217248c = kotlin.enums.c.c(k());

        static {
            int i10 = 2 << 0;
        }

        @NotNull
        public static kotlin.enums.a<f> l() {
            return f217248c;
        }
    }

    public enum g {
        catalog_click,
        catalog_drag,
        catalog_search_click,
        catalog_search_drag,
        duplicate,
        item_info,
        room_wizard,
        ai_chat;


        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217258j = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<g> l() {
            return f217258j;
        }
    }

    public enum h {
        toggle_show,
        wall_split,
        toggle_flip,
        toggle_closed,
        rotated;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217265g = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<h> l() {
            return f217265g;
        }
    }

    public enum i {
        ground,
        room,
        partition,
        pr,
        window,
        door,
        wall,
        ruler,
        point,
        other;


        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217277l = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<i> l() {
            return f217277l;
        }
    }

    public enum j {
        f217278a,
        f217279b,
        VR;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217282e = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<j> l() {
            return f217282e;
        }
    }

    public enum k {
        project_title,
        project_background,
        metric_unit,
        grid,
        toggle_target_lines,
        toggle_objects,
        toggle_measurements,
        joystick,
        snapping,
        lock_walls,
        move_walls_one_direction,
        camera_on_ground,
        other;


        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217297o = kotlin.enums.c.c(k());

        static {
            int i10 = 7 & 5;
        }

        @NotNull
        public static kotlin.enums.a<k> l() {
            return f217297o;
        }
    }

    void B0(@Nullable j jVar, @NotNull e eVar, @Nullable Long l10);

    void D(@Nullable j jVar, long j10, @NotNull b bVar, @Nullable f fVar);

    void G(@Nullable j jVar, @NotNull i iVar, @Nullable String str, boolean z10, @Nullable String str2, @Nullable String str3, boolean z11, boolean z12, @Nullable Long l10);

    void G0();

    void I0(@Nullable j jVar, @NotNull String str, int i10);

    void N0();

    void O(@Nullable j jVar, @NotNull i iVar, @Nullable String str, @Nullable Long l10);

    void Q(@Nullable j jVar, @NotNull i iVar, @Nullable String str, int i10, boolean z10, boolean z11, @Nullable Long l10);

    void Q0();

    void T(@Nullable j jVar, @Nullable Long l10);

    void U(@Nullable j jVar, int i10, boolean z10, boolean z11, @Nullable Long l10);

    void U0(@Nullable j jVar, @NotNull k kVar, @Nullable Long l10);

    void V0(@Nullable j jVar, @Nullable Long l10);

    void X(@Nullable j jVar, @NotNull i iVar, @Nullable String str, @NotNull h hVar, @Nullable Long l10);

    void a0(@Nullable j jVar, @Nullable Long l10);

    void d0(@Nullable j jVar, boolean z10, @NotNull c cVar, @Nullable Long l10, @Nullable Long l11);

    void g0(@Nullable j jVar, boolean z10, @NotNull c cVar, @Nullable Long l10, @Nullable Long l11);

    void h0(@Nullable j jVar, @NotNull i iVar, @Nullable String str, @Nullable Long l10);

    void j0(@Nullable j jVar, int i10, boolean z10, boolean z11, @Nullable Integer num, @Nullable Integer num2, boolean z12, boolean z13, boolean z14, @Nullable Long l10);

    void k(@Nullable j jVar, @Nullable Long l10);

    void m0(@Nullable j jVar, @Nullable j jVar2, @Nullable Long l10);

    void n(@Nullable j jVar, @Nullable Long l10);

    void p(@Nullable j jVar, @NotNull a aVar, @Nullable Long l10, @Nullable d dVar);

    void w(@Nullable j jVar, @NotNull i iVar, @Nullable String str, @Nullable Long l10, @NotNull g gVar, @Nullable f fVar, @Nullable Long l11);

    void x(@Nullable j jVar, @NotNull i iVar, @Nullable String str, boolean z10, @Nullable Long l10);
}
