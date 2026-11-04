package com.planner5d.library.model.manager.statistics.events;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public interface x3 {

    public enum a {
        open,
        open_p5d,
        rename,
        duplicate,
        share,
        to_folder,
        remove_from_folder,
        download,
        archive,
        restore;


        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217674l = kotlin.enums.c.c(k());

        static {
            int i10 = 4 & 4;
        }

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f217674l;
        }
    }

    public enum b {
        projects_new_project,
        projects_new_project_fab,
        upload_plan,
        room_wizard;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217680f = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f217680f;
        }
    }

    public enum c {
        from_scratch,
        duplicate_owned,
        duplicate_unowned,
        room_wizard;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217686f = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<c> l() {
            return f217686f;
        }
    }

    public enum d {
        projects,
        gallery,
        deeplink,
        unknown;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217692f = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<d> l() {
            return f217692f;
        }
    }

    public enum e {
        my_projects,
        home_page,
        back_button,
        url,
        other;


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217700h = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f217693a = new a(null);

        public static final class a {

            /* JADX INFO: renamed from: com.planner5d.library.model.manager.statistics.events.x3$e$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C1628a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f217701a;

                static {
                    int[] iArr = new int[b4.c.values().length];
                    try {
                        iArr[b4.c.my_projects.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b4.c.home_page.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b4.c.back_button.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b4.c.text_rendered.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[b4.c.other.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[b4.c.url.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[b4.c.gallery.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    f217701a = iArr;
                }
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @oj.n
            @NotNull
            public final e a(@NotNull b4.c source) {
                Intrinsics.checkNotNullParameter(source, "source");
                switch (C1628a.f217701a[source.ordinal()]) {
                    case 1:
                        return e.my_projects;
                    case 2:
                        return e.home_page;
                    case 3:
                        return e.back_button;
                    case 4:
                    case 5:
                    case 6:
                        return e.url;
                    case 7:
                        return e.other;
                    default:
                        throw new kotlin.k0();
                }
            }

            private a() {
            }
        }

        @oj.n
        @NotNull
        public static final e l(@NotNull b4.c cVar) {
            return f217693a.a(cVar);
        }

        @NotNull
        public static kotlin.enums.a<e> n() {
            return f217700h;
        }
    }

    void B(@NotNull c cVar, @Nullable Long l10);

    void M0(@Nullable String str, @Nullable e eVar);

    void c(@Nullable d dVar, boolean z10, @Nullable Long l10);

    void c1(@NotNull b bVar);

    void u0(@NotNull a aVar, @Nullable p3.b bVar, @Nullable Long l10);
}
