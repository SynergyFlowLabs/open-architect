package com.planner5d.library.dgenerator.application;

import com.planner5d.library.dgenerator.fragment.gallery.GalleryFragment;
import com.planner5d.library.dgenerator.fragment.gallery.pager.GalleryPagerFragment;
import com.planner5d.library.dgenerator.fragment.list.AutoStyleListFragment;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@q
@fg.d(dependencies = {com.planner5d.library.application.c.class}, modules = {d.class, r.class})
public abstract class c extends com.planner5d.library.view.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final b f160073b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final c f160074c;

    @fg.d.a
    public interface a {
        @fg.b
        @NotNull
        a a(@NotNull pd.e eVar);

        @NotNull
        a b(@NotNull com.planner5d.library.application.c cVar);

        @NotNull
        c build();

        @fg.b
        @NotNull
        a c(@NotNull pd.a aVar);

        @NotNull
        a d(@NotNull d dVar);
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final c a() {
            return c.f160074c;
        }

        private b() {
        }
    }

    static {
        a aVarA = com.planner5d.library.dgenerator.application.a.a();
        com.planner5d.library.project.application.c.a aVar = com.planner5d.library.project.application.c.f223658b;
        f160074c = aVarA.a(aVar.a().h()).c(aVar.a().g()).b(com.planner5d.library.application.b.f142455c.a()).d(new d()).build();
    }

    public abstract void g(@NotNull GalleryFragment galleryFragment);

    public abstract void h(@NotNull GalleryPagerFragment galleryPagerFragment);

    public abstract void i(@NotNull AutoStyleListFragment autoStyleListFragment);
}
