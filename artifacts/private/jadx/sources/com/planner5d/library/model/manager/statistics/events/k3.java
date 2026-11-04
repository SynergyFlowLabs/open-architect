package com.planner5d.library.model.manager.statistics.events;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public interface k3 {

    public enum a {
        sign_in,
        sign_up,
        authenticate;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217056e = kotlin.enums.c.c(k());

        static {
            int i10 = 5 ^ 2;
        }

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f217056e;
        }
    }

    public enum b {
        none,
        not_agree,
        true_sign_up_screen;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217061e = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f217061e;
        }
    }

    public enum c {
        email,
        facebook,
        google_plus,
        anonymous,
        one_link_email_digital_code,
        one_link_email,
        one_link_email_confirmation_link,
        login_link;


        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217071j = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<c> l() {
            return f217071j;
        }
    }

    public enum d {
        sign_up_screen,
        stay_in_touch_screen;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217075d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<d> l() {
            return f217075d;
        }
    }

    public enum e {
        sign_in,
        sign_up,
        about,
        purchase,
        first_start,
        change_user,
        onboarding;


        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217084i = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<e> l() {
            return f217084i;
        }
    }
}
