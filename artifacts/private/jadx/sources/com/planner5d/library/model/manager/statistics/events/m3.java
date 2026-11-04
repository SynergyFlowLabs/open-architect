package com.planner5d.library.model.manager.statistics.events;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public interface m3 {

    public enum a {
        change_name,
        choose_folder,
        crop_document,
        change_view,
        file_sorting;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217138g = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f217138g;
        }
    }

    public enum b {
        yes,
        no;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217142d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f217142d;
        }
    }

    public enum c {
        document,
        folder;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217146d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<c> l() {
            return f217146d;
        }
    }

    public enum e {
        icons,
        list;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217156d = kotlin.enums.c.c(k());

        static {
            int i10 = 5 ^ 1;
        }

        @NotNull
        public static kotlin.enums.a<e> l() {
            return f217156d;
        }
    }

    void D0(@NotNull a aVar, @Nullable c cVar, @Nullable e eVar, @Nullable d dVar, @Nullable b bVar);

    void F(@NotNull d dVar, boolean z10);

    void H0(@NotNull a aVar, @Nullable c cVar);

    void p0(boolean z10, boolean z11);

    public enum d {
        sortByName("name"),
        date_created(null, 1, null),
        last_update(null, 1, null);


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217151f = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f217152a;

        static {
            int i10 = 4 ^ 0;
        }

        d(String str) {
            this.f217152a = str == null ? name() : str;
        }

        @NotNull
        public static kotlin.enums.a<d> l() {
            return f217151f;
        }

        @NotNull
        public final String n() {
            return this.f217152a;
        }

        /* synthetic */ d(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str);
        }
    }
}
