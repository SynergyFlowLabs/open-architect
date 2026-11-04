package com.planner5d.library.activity.helper.event.content;

import android.os.Bundle;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.gallery.Gallery;
import com.planner5d.library.activity.fragment.gallery.GalleryPager;
import com.planner5d.library.activity.fragment.gallery.project.GalleryProjectFragment;
import com.planner5d.library.activity.fragment.projects.Project2D;
import com.planner5d.library.activity.fragment.projects.Project3D;
import com.planner5d.library.activity.fragment.projects.ProjectsPagesFragment;
import com.planner5d.library.api.f;
import com.planner5d.library.database.model.ProjectRevision;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.h;
import com.planner5d.library.model.manager.q0;
import com.planner5d.library.model.manager.statistics.events.b4;
import com.planner5d.library.model.manager.statistics.events.x3;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.i;
import com.planner5d.library.widget.editor.helper.g1;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 1)
public final class d extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f136801g = 0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(@NotNull h model, @NotNull q0.d filter, @Nullable h hVar, @NotNull b4.c source) {
        this(model, filter, hVar, false, source);
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(source, "source");
    }

    private final Class<? extends FragmentController> r(String str, String str2, String str3, boolean z10, boolean z11, Bundle bundle) {
        d().m(r.in3d, z10).j(r.projectUri, str).j(r.projectUriShare, str2).j(r.projectTitle, str3).m(r.projectReadOnly, true).m(r.projectFromGallery, z11).t(r.source, z11 ? x3.d.gallery : x3.d.deeplink).m(r.created, false);
        if (bundle != null) {
            d().h(r.editor, bundle);
        }
        p(str3);
        return z10 ? Project3D.class : Project2D.class;
    }

    @NotNull
    public final d q(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        d().s(bundle);
        return this;
    }

    @NotNull
    public final d s(@Nullable x3.d dVar, boolean z10) {
        if (!Intrinsics.areEqual(e(), Project3D.class) && !Intrinsics.areEqual(e(), Project2D.class)) {
            return this;
        }
        d().t(r.source, dVar);
        d().m(r.created, z10);
        return this;
    }

    public d(@NotNull h model, @NotNull q0.d filter, @Nullable h hVar, boolean z10, @NotNull b4.c source) {
        r rVar;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(source, "source");
        h(new i());
        if (model.f180739a == q0.c.projects) {
            d().h(r.model, model.f());
            i(GalleryProjectFragment.class);
            rVar = r.floorPlansList;
        } else {
            d().h(r.model, model.f()).h(r.filter, new q0.d(hVar != null ? hVar.f180740b : null, filter).a()).m(r.designOfDayNoCounters, z10).t(r.source, source);
            i(GalleryPager.class);
            rVar = r.snapshotsList;
        }
        k(new d(Gallery.class, new i().t(r.tab, rVar).h(rVar, new i().h(r.filter, filter.a()).a()).a()));
    }

    public d(@NotNull h model) {
        Intrinsics.checkNotNullParameter(model, "model");
        h(new i());
        String str = f.a().f142273k + "project/" + model.f180741c;
        String strE = model.e();
        Intrinsics.checkNotNullExpressionValue(strE, "getUri(...)");
        i(r(str, strE, model.f180743e, true, true, null));
    }

    public d(@Nullable String str, @NotNull String uriShare, @Nullable String str2, boolean z10, boolean z11, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(uriShare, "uriShare");
        h(new i());
        i(r(str, uriShare, str2, z10, z11, bundle));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(@NotNull Project model, boolean z10, @Nullable Bundle bundle, boolean z11, @Nullable a aVar) {
        this(model.getId(), model.projectId, model.title, model.data, z10, bundle, aVar);
        Intrinsics.checkNotNullParameter(model, "model");
        if (z11) {
            g1.n1();
        }
    }

    public d(@Nullable Long l10, @Nullable Long l11, @Nullable String str, @Nullable byte[] bArr, boolean z10, @Nullable Bundle bundle, @Nullable a aVar) {
        h(new i().m(r.in3d, z10).j(r.id, l10 != null ? l10.toString() : null).j(r.projectTitle, l10 == null ? str : null).n(r.projectData, l10 != null ? null : bArr));
        if (l11 != null) {
            d().g(r.projectId, l11.longValue());
        }
        if (bundle != null) {
            d().h(r.editor, bundle);
        }
        i(z10 ? Project3D.class : Project2D.class);
        p(str);
        l(aVar == null ? new d(ProjectsPagesFragment.class, new i().t(r.tab, r.floorPlansList).a()).b() : aVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(@NotNull ProjectRevision revision) {
        Intrinsics.checkNotNullParameter(revision, "revision");
        Long id2 = revision.getId();
        this(false, id2 != null ? id2.longValue() : 0L, revision.p(), revision.s());
    }

    public d(boolean z10, long j10, @Nullable Date date, @Nullable byte[] bArr) {
        i(z10 ? Project3D.class : Project2D.class);
        h(new i().g(r.projectRevisionId, j10).t(r.projectRevisionDate, date).n(r.projectData, bArr).m(r.projectReadOnly, true).m(r.showTitle, true));
    }

    public d(@NotNull Class<? extends FragmentController> fragmentClass, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(fragmentClass, "fragmentClass");
        i(fragmentClass);
        h(new i(bundle));
    }

    public /* synthetic */ d(Class cls, Bundle bundle, e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, bundle, (i10 & 4) != 0 ? e.None : eVar);
    }

    public d(@NotNull Class<? extends FragmentController> fragmentClass, @Nullable Bundle bundle, @NotNull e animation) {
        Intrinsics.checkNotNullParameter(fragmentClass, "fragmentClass");
        Intrinsics.checkNotNullParameter(animation, "animation");
        i(fragmentClass);
        h(new i(bundle));
        g(animation);
    }
}
