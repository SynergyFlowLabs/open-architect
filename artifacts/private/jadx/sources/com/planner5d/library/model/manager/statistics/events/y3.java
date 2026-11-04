package com.planner5d.library.model.manager.statistics.events;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public interface y3 {

    public enum a {
        google,
        other;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217710d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f217710d;
        }
    }

    public enum b {
        network,
        other,
        user_canceled,
        validation,
        sign_in_required,
        already_owned;


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217718h = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f217718h;
        }
    }

    public enum c {
        locked_item,
        locked_item_gift,
        locked_edit,
        locked_save,
        menu_catalog,
        snapshot,
        snapshots,
        textures,
        editing,
        onboarding,
        profile,
        upload_plan,
        ai_decorator,
        ai_designer,
        ai_renders,
        smart_wizard,
        compare_plans,
        export_to_cad,
        f217739w,
        deeplink,
        plan_recognitions,
        ai_chat;


        /* JADX INFO: renamed from: p1, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217735p1 = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<c> l() {
            return f217735p1;
        }
    }

    public enum d {
        start,
        sku,
        processing,
        failed,
        complete;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217746g = kotlin.enums.c.c(k());

        static {
            int i10 = 3 | 2;
        }

        @NotNull
        public static kotlin.enums.a<d> l() {
            return f217746g;
        }
    }

    public enum e {
        catalog,
        snapshots,
        textures,
        design_generator,
        plan_recognitions;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217753g = kotlin.enums.c.c(k());

        static {
            int i10 = 4 | 2;
        }

        @NotNull
        public static kotlin.enums.a<e> l() {
            return f217753g;
        }
    }

    void C(@NotNull d dVar);

    void P0(@NotNull a aVar, @NotNull e eVar, @NotNull fd.e eVar2, @Nullable String str, boolean z10, @Nullable Float f10, @Nullable String str2, @Nullable c cVar);

    void S0(@NotNull e eVar, @NotNull fd.e eVar2);

    void f(@NotNull c cVar);

    void j();

    void o0(@NotNull a aVar, @NotNull e eVar, @NotNull fd.e eVar2, @Nullable String str, boolean z10, @Nullable Float f10, @Nullable String str2, @Nullable c cVar);

    void t(@NotNull a aVar, @NotNull e eVar, @Nullable String str, @NotNull b bVar, @Nullable String str2);

    void u(@Nullable c cVar, @Nullable String str);

    void y(@NotNull e eVar, @NotNull String str);
}
