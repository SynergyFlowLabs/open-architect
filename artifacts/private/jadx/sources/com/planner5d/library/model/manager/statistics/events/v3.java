package com.planner5d.library.model.manager.statistics.events;

import java.util.List;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public interface v3 {

    public enum a {
        style_scandinavian,
        style_eclectic,
        style_country,
        style_modern,
        style_classic,
        style_industrial,
        style_minimalist,
        style_boho;


        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217605j = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f217605j;
        }
    }

    public enum b {
        design_dream_home,
        home_building_renovation,
        study_interior_design,
        for_clients;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217611f = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f217611f;
        }
    }

    public enum c {
        search,
        youtube,
        school,
        tiktok,
        ig_fb,
        podcast,
        friends,
        find_in_store,
        skip;


        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217622k = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<c> l() {
            return f217622k;
        }
    }

    public enum d {
        house,
        apartment,
        outdoor,
        office;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217628f = kotlin.enums.c.c(k());

        static {
            int i10 = 2 & 1;
            int i11 = 3 >> 2;
        }

        @NotNull
        public static kotlin.enums.a<d> l() {
            return f217628f;
        }
    }

    public enum e {
        video_new,
        onboarding_start,
        purpose_selected,
        space_selection,
        space_selected,
        personalisation,
        onboarding_finished;


        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217637i = kotlin.enums.c.c(k());

        static {
            int i10 = 6 & 3;
        }

        @NotNull
        public static kotlin.enums.a<e> l() {
            return f217637i;
        }
    }

    void L(int i10);

    void N(@NotNull List<Pair<String, Integer>> list);

    void a(int i10, @NotNull String str);

    void h1();

    void s(int i10, @NotNull String str);

    void y0(@NotNull String str);
}
