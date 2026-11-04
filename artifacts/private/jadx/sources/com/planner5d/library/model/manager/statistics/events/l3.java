package com.planner5d.library.model.manager.statistics.events;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public interface l3 {

    public enum a {
        contests_voting_opened,
        contests_vote_added,
        contests_vote_skipped,
        contests_voting_start,
        contests_voting_closed,
        share,
        open_link;


        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217104i = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f217104i;
        }
    }

    public enum b {
        toolbar_menu,
        list_projects,
        voting,
        main_design_battle_page,
        new_voting,
        bottom_sheet,
        home_page,
        unknown,
        claim_prize_card_popup,
        project_submit_screen,
        deeplink_android;


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217117m = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f217117m;
        }
    }

    void A();

    void K0();

    void L0(@Nullable Long l10, @NotNull a aVar, @Nullable b bVar);

    void g(@NotNull b bVar);

    void g1();

    void j1(@Nullable Long l10, @NotNull a aVar, @Nullable b bVar);

    void r(long j10);

    void x0(@Nullable Long l10);

    void z0(@Nullable Long l10);
}
