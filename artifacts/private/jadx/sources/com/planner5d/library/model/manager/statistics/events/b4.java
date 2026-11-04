package com.planner5d.library.model.manager.statistics.events;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public interface b4 {

    public enum a {
        open,
        share,
        like,
        to_folder,
        remove_from_folder,
        archive,
        restore,
        download,
        back,
        ai_render_improvement_clicked,
        ai_render_improvement_started;


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f216743m = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f216743m;
        }
    }

    public static final class b {
        public static /* synthetic */ void a(b4 b4Var, a aVar, p3.b bVar, Long l10, c cVar, e eVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: snapshotsSnapshotActionWithType");
            }
            if ((i10 & 8) != 0) {
                cVar = null;
            }
            b4Var.J0(aVar, bVar, l10, cVar, eVar);
        }
    }

    public enum c {
        my_projects,
        text_rendered,
        back_button,
        home_page,
        gallery,
        url,
        other;


        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f216753j = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f216744a = new a(null);

        public static final class a {

            /* JADX INFO: renamed from: com.planner5d.library.model.manager.statistics.events.b4$c$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C1627a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f216754a;

                static {
                    int[] iArr = new int[x3.e.values().length];
                    try {
                        iArr[x3.e.my_projects.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[x3.e.home_page.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[x3.e.back_button.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[x3.e.url.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[x3.e.other.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f216754a = iArr;
                }
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @oj.n
            @NotNull
            public final c a(@NotNull x3.e source) {
                Intrinsics.checkNotNullParameter(source, "source");
                int i10 = C1627a.f216754a[source.ordinal()];
                if (i10 == 1) {
                    return c.my_projects;
                }
                if (i10 == 2) {
                    return c.home_page;
                }
                if (i10 == 3) {
                    return c.back_button;
                }
                int i11 = 5 << 4;
                if (i10 == 4) {
                    return c.url;
                }
                int i12 = i11 | 5;
                if (i10 == 5) {
                    return c.other;
                }
                throw new kotlin.k0();
            }

            private a() {
            }
        }

        @oj.n
        @NotNull
        public static final c l(@NotNull x3.e eVar) {
            return f216744a.a(eVar);
        }

        @NotNull
        public static kotlin.enums.a<c> n() {
            return f216753j;
        }
    }

    public enum d {
        cloud;


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f216757c = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<d> l() {
            return f216757c;
        }
    }

    void J0(@NotNull a aVar, @Nullable p3.b bVar, @Nullable Long l10, @Nullable c cVar, @NotNull e eVar);

    void k0(@Nullable String str, @Nullable c cVar);

    public enum e {
        screenshot,
        draft,
        hd,
        pro4k("4k"),
        ai_enhancer,
        snapshot;


        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f216765i = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oj.f
        @NotNull
        public final String f216766a;

        static {
            int i10 = 3 >> 3;
        }

        e(String str) {
            this.f216766a = str == null ? name() : str;
        }

        @NotNull
        public static kotlin.enums.a<e> l() {
            return f216765i;
        }

        e() {
            this(null);
        }
    }
}
