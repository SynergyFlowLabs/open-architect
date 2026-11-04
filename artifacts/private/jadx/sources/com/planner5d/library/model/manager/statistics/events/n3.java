package com.planner5d.library.model.manager.statistics.events;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public interface n3 {

    public enum a {
        open,
        add,
        delete,
        move,
        edit,
        share,
        send_to_upload_plan,
        send_to_design_generator,
        onboarding_shown,
        onboarding_tap_next,
        onboarding_tap_dont_show,
        server_sync;


        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217181n = kotlin.enums.c.c(k());

        static {
            int i10 = 0 & 5;
        }

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f217181n;
        }
    }

    public enum b {
        upload_to_server_start,
        upload_to_server_done,
        upload_to_server_error,
        download_from_server_start,
        download_from_server_done,
        download_from_server_error;


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217189h = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f217189h;
        }
    }

    public enum c {
        document,
        folder,
        menu;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217194e = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<c> l() {
            return f217194e;
        }
    }

    public enum d {
        gallery,
        camera,
        file,
        share_extension;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217200f = kotlin.enums.c.c(k());

        static {
            int i10 = 7 | 1;
        }

        @NotNull
        public static kotlin.enums.a<d> l() {
            return f217200f;
        }
    }

    void T0(@Nullable c cVar, @Nullable d dVar);

    void e0(@Nullable c cVar, @Nullable b bVar);

    void i1(@NotNull a aVar, @Nullable c cVar);

    void v(@NotNull a aVar, @Nullable c cVar, @Nullable d dVar, @Nullable b bVar);
}
