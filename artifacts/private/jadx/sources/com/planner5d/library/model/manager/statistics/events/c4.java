package com.planner5d.library.model.manager.statistics.events;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public interface c4 {

    public enum a {
        open,
        skip,
        back,
        f216781d,
        error,
        select,
        pick_location;


        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f216786i = kotlin.enums.c.c(k());

        static {
            int i10 = 1 >> 4;
        }

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f216786i;
        }
    }

    public static final class b {
        public static /* synthetic */ void a(c4 c4Var, a aVar, c cVar, String str, String str2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addressFormAction");
            }
            if ((i10 & 4) != 0) {
                str = null;
            }
            if ((i10 & 8) != 0) {
                str2 = null;
            }
            c4Var.Z0(aVar, cVar, str, str2);
        }

        public static /* synthetic */ void b(c4 c4Var, d dVar, String str, Integer num, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: surveyFormAction");
            }
            if ((i10 & 2) != 0) {
                str = null;
            }
            if ((i10 & 4) != 0) {
                num = null;
            }
            c4Var.a1(dVar, str, num);
        }
    }

    public enum c {
        object,
        address_input,
        location_pick,
        loader;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f216792f = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<c> l() {
            return f216792f;
        }
    }

    public enum d {
        initial_loader,
        how_do_you_plan_to_use_planner_5d,
        which_best_describes_you,
        what_is_your_goal,
        what_type_of_space;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f216799g = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<d> l() {
            return f216799g;
        }
    }

    public enum e {
        plan_a_renovation_before_starting,
        design_a_new_home_from_scratch,
        test_what_furniture_fits_in_a_room,
        create_projects_to_present_to_clients,
        share_designs_with_family_or_friends,
        build_a_dream_home_or_fantasy_project,
        learn_interior_design_for_fun_or_study,
        make_images_and_walkthroughs_for_real_estate,
        something_else;


        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f216810k;

        static {
            boolean z10 = !true;
            int i10 = 6 & 4;
            f216810k = kotlin.enums.c.c(k());
        }

        @NotNull
        public static kotlin.enums.a<e> l() {
            return f216810k;
        }
    }

    public enum f {
        household_owner,
        interior_design_enthusiast,
        future_property_buyer,
        interior_designer,
        real_estate_agent_stager,
        architect,
        property_developer,
        student_architecture_design,
        contractor_builder,
        other;


        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f216822l = kotlin.enums.c.c(k());

        static {
            int i10 = 4 << 5;
        }

        @NotNull
        public static kotlin.enums.a<f> l() {
            return f216822l;
        }
    }

    public enum g {
        house,
        room,
        office,
        apartment,
        landscape,
        other;


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f216830h = kotlin.enums.c.c(k());

        static {
            int i10 = 2 & 0;
        }

        @NotNull
        public static kotlin.enums.a<g> l() {
            return f216830h;
        }
    }

    public enum h {
        personal_use,
        professional_use,
        for_school;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f216835e = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<h> l() {
            return f216835e;
        }
    }

    void Z0(@NotNull a aVar, @NotNull c cVar, @Nullable String str, @Nullable String str2);

    void a1(@NotNull d dVar, @Nullable String str, @Nullable Integer num);
}
