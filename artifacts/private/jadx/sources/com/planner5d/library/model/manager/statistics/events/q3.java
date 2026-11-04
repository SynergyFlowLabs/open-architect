package com.planner5d.library.model.manager.statistics.events;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public interface q3 {

    public enum a {
        open,
        play,
        close,
        click_share,
        share,
        back,
        filter,
        like;


        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217341j = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f217341j;
        }
    }

    public enum b {
        inspiration(1),
        for_your_home(2),
        tips(3),
        videos(4),
        design_of_the_day(5);


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217348h = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f217349a;

        b(int i10) {
            this.f217349a = i10;
        }

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f217348h;
        }

        public final int n() {
            return this.f217349a;
        }
    }

    public static final class c {
        public static /* synthetic */ void a(q3 q3Var, a aVar, b bVar, Integer num, d dVar, String str, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: feedPage");
            }
            if ((i10 & 16) != 0) {
                str = null;
            }
            q3Var.d1(aVar, bVar, num, dVar, str);
        }
    }

    public enum d {
        also_read,
        home_page,
        all_article,
        show_more_articles,
        show_more_videos,
        deeplink,
        unknown;


        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217358i = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<d> l() {
            return f217358i;
        }
    }

    @Nullable
    b A0(@Nullable Integer num);

    void Y0();

    void d1(@NotNull a aVar, @Nullable b bVar, @Nullable Integer num, @Nullable d dVar, @Nullable String str);

    void e1(@NotNull a aVar, @NotNull b bVar, @Nullable d dVar);
}
