package com.planner5d.library.model.manager.statistics.events;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public interface r3 {

    public enum a {
        create,
        edit,
        remove;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217373e = kotlin.enums.c.c(k());

        static {
            int i10 = 0 << 0;
        }

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f217373e;
        }
    }

    public enum b {
        projects,
        snapshots,
        textures;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217378e = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f217378e;
        }
    }

    public enum c {
        gdpr;


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217381c = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<c> l() {
            return f217381c;
        }
    }

    public enum d {
        profile,
        premium_expand,
        premium_collapse,
        purchase_premium,
        purchase_renders,
        purchase_textures,
        my_projects,
        my_renders,
        projects_gallery,
        snapshots_gallery,
        favorites_gallery,
        my_documents,
        design_battle_current,
        design_battle_completed;


        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217397s = kotlin.enums.c.c(k());

        static {
            int i10 = 1 << 3;
        }

        @NotNull
        public static kotlin.enums.a<d> l() {
            return f217397s;
        }
    }

    public enum e {
        portrait,
        landscape;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217401d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<e> l() {
            return f217401d;
        }
    }

    public enum f {
        submit,
        close;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217405d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<f> l() {
            return f217405d;
        }
    }

    public enum g {
        profile,
        timer;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217409d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<g> l() {
            return f217409d;
        }
    }

    public enum h {
        project,
        renders,
        design_battle,
        editor,
        other;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217416g = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<h> l() {
            return f217416g;
        }
    }

    public enum i {
        feed,
        projects,
        renders,
        design_battle,
        editor,
        paywall,
        gallery,
        project2d,
        project3d;


        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217427k = kotlin.enums.c.c(k());

        static {
            int i10 = 0 << 3;
        }

        @NotNull
        public static kotlin.enums.a<i> l() {
            return f217427k;
        }
    }

    public enum j {
        copy,
        email,
        facebook,
        other;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217433f = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<j> l() {
            return f217433f;
        }
    }

    public enum k {
        projects,
        contests;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217437d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<k> l() {
            return f217437d;
        }
    }

    public enum l {
        project,
        snapshot,
        article,
        link,
        contest;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217444g = kotlin.enums.c.c(k());

        static {
            int i10 = 1 | 3;
        }

        @NotNull
        public static kotlin.enums.a<l> l() {
            return f217444g;
        }
    }

    void H(@NotNull b bVar, @NotNull a aVar, @NotNull p3.b bVar2);

    void I(@NotNull e eVar, @NotNull h hVar);

    void K(@Nullable String str);

    void M(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4);

    void P(@NotNull d dVar);

    void R0(@NotNull p3.b bVar, @Nullable p3.a aVar);

    void c0();

    void i0();

    void q(@NotNull f fVar, @NotNull g gVar, int i10, @Nullable Integer num);

    void q0(@Nullable k kVar, @NotNull l lVar, @NotNull j jVar, @Nullable String str);

    void s0();

    void t0();
}
