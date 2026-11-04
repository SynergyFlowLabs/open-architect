package com.planner5d.library.model.manager.statistics.events;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public interface t3 {

    public enum a {
        shown,
        closed,
        choosen;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217474e = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f217474e;
        }
    }

    public enum b {
        rate_us_popup,
        unlock_full_catalog_fo_24h,
        premium_feature_unlock,
        ai_improve_renders;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217480f = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f217480f;
        }
    }

    public enum c {
        contest_prize_dialog,
        two_minutes_into_the_third_session,
        editor;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217485e = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<c> l() {
            return f217485e;
        }
    }

    public enum d {
        third_login,
        add_3_item,
        submit_to_design_battle,
        receive_battle_prize,
        get_present,
        on_item_resize,
        on_item_edit,
        on_premium_item_move,
        on_locked_item_click,
        toggle_flip,
        copy_project,
        item_clone,
        toggle_closed,
        ai_improve_renders;


        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217501s = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<d> l() {
            return f217501s;
        }
    }

    public enum e {
        ok,
        cancel;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217505d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<e> l() {
            return f217505d;
        }
    }

    void C0(@NotNull a aVar, @NotNull c cVar, @Nullable Boolean bool);

    void O0(@NotNull a aVar, @NotNull c cVar, @Nullable Boolean bool, @Nullable d dVar);

    void R(@NotNull a aVar, @NotNull c cVar, @Nullable Boolean bool, @NotNull com.planner5d.library.widget.rate.c cVar2);

    void r0(@NotNull a aVar);
}
