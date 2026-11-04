package com.planner5d.library.model.manager.statistics.events;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public interface j3 {

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    @NotNull
    public static final c f216996s2 = c.f217016a;

    public enum a {
        screen_view,
        photo_uploaded,
        room_type_selected,
        button_click,
        popup_view,
        room_design_selected;


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217004h = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f217004h;
        }
    }

    public enum b {
        photo_upload,
        save_all_to_gallery,
        f217007c,
        back,
        generate_new_design,
        share,
        save_to_gallery,
        delete_folder_confirm,
        delete_folder_cancel;


        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217015k = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f217015k;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ c f217016a = new c();

        private c() {
        }

        @Nullable
        public final f a(int i10) {
            if (i10 == 0) {
                return f.living_room;
            }
            if (i10 == 1) {
                return f.kitchen;
            }
            if (i10 == 2) {
                return f.bedroom;
            }
            if (i10 == 5) {
                return f.office;
            }
            if (i10 == 9) {
                return f.bathroom;
            }
            if (i10 != 11) {
                return null;
            }
            return f.child_room;
        }
    }

    public static final class d {
        public static /* synthetic */ void a(j3 j3Var, a aVar, g gVar, b bVar, f fVar, String str, e eVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: track");
            }
            if ((i10 & 2) != 0) {
                gVar = null;
            }
            if ((i10 & 4) != 0) {
                bVar = null;
            }
            if ((i10 & 8) != 0) {
                fVar = null;
            }
            if ((i10 & 16) != 0) {
                str = null;
            }
            if ((i10 & 32) != 0) {
                eVar = null;
            }
            j3Var.z(aVar, gVar, bVar, fVar, str, eVar);
        }
    }

    public enum e {
        delete,
        in_progress;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217020d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<e> l() {
            return f217020d;
        }
    }

    public enum f {
        bathroom,
        bedroom,
        living_room,
        child_room,
        office,
        kitchen;


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217028h = kotlin.enums.c.c(k());

        static {
            int i10 = 0 | 4;
        }

        @NotNull
        public static kotlin.enums.a<f> l() {
            return f217028h;
        }
    }

    public enum g {
        landing,
        type,
        cards_gallery,
        single_card,
        folders_page;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217035g = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<g> l() {
            return f217035g;
        }
    }

    public enum h {
        tools,
        home,
        onboarding;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217040e = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<h> l() {
            return f217040e;
        }
    }

    void z(@NotNull a aVar, @Nullable g gVar, @Nullable b bVar, @Nullable f fVar, @Nullable String str, @Nullable e eVar);
}
