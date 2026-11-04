package com.planner5d.library.activity.fragment.feed.holders;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewStub;
import androidx.compose.runtime.internal.w0;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.activity.fragment.feed.s;
import com.planner5d.library.model.manager.n1;
import com.planner5d.library.model.manager.project.d0;
import com.planner5d.library.model.manager.u0;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.services.utility.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f133369h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final d0 f133370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final y0 f133371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final n1 f133372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final u0 f133373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.feed.view.holders.b f133374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.contest.g f133375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final RecyclerView.w f133376g;

    /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.feed.holders.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C1466a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f133377a;

        static {
            int[] iArr = new int[hc.a.EnumC1914a.values().length];
            try {
                iArr[hc.a.EnumC1914a.ProjectList.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[hc.a.EnumC1914a.DesignGeneratorLabel.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[hc.a.EnumC1914a.DesignGeneratorItem.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[hc.a.EnumC1914a.DesignBattleLabel.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[hc.a.EnumC1914a.DesignBattleItem.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[hc.a.EnumC1914a.Inspiration.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[hc.a.EnumC1914a.ForYourHome.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[hc.a.EnumC1914a.Tips.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[hc.a.EnumC1914a.Videos.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[hc.a.EnumC1914a.DesignOfDay.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f133377a = iArr;
        }
    }

    @ij.a
    public a(@NotNull d0 projectManager, @NotNull y0 imageManager, @NotNull n1 languageManager, @NotNull u0 hapticManager, @NotNull com.planner5d.library.feed.view.holders.b designOfDayProvider, @NotNull com.planner5d.library.model.manager.contest.g contestManager) {
        Intrinsics.checkNotNullParameter(projectManager, "projectManager");
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        Intrinsics.checkNotNullParameter(languageManager, "languageManager");
        Intrinsics.checkNotNullParameter(hapticManager, "hapticManager");
        Intrinsics.checkNotNullParameter(designOfDayProvider, "designOfDayProvider");
        Intrinsics.checkNotNullParameter(contestManager, "contestManager");
        this.f133370a = projectManager;
        this.f133371b = imageManager;
        this.f133372c = languageManager;
        this.f133373d = hapticManager;
        this.f133374e = designOfDayProvider;
        this.f133375f = contestManager;
        RecyclerView.w wVar = new RecyclerView.w();
        this.f133376g = wVar;
        s.a aVar = s.a.Article;
        wVar.n(aVar.n(), wVar.i(aVar.n()) * 3);
    }

    @NotNull
    public final com.planner5d.library.feed.view.holders.c<?> a(@NotNull Context context, @NotNull s0 scope, @NotNull t coroutineDispatchers, @NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull ja.c viewHolderProjectListener, @NotNull ja.b feedProjectListListener, @NotNull ja.a feedBlogAdapterListener, @NotNull Function1<? super jc.e, Unit> onFavoriteClicked, @NotNull hc.a.EnumC1914a viewType, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(viewHolderProjectListener, "viewHolderProjectListener");
        Intrinsics.checkNotNullParameter(feedProjectListListener, "feedProjectListListener");
        Intrinsics.checkNotNullParameter(feedBlogAdapterListener, "feedBlogAdapterListener");
        Intrinsics.checkNotNullParameter(onFavoriteClicked, "onFavoriteClicked");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        switch (C1466a.f133377a[viewType.ordinal()]) {
            case 1:
                return new p(context, bitmapTargetManager, scope, this.f133370a, viewHolderProjectListener, feedProjectListListener, this.f133373d);
            case 2:
                return new m(context);
            case 3:
                return new j(context, viewHolderProjectListener, scope, coroutineDispatchers);
            case 4:
                return new l(context);
            case 5:
                return new h(context, viewHolderProjectListener, bitmapTargetManager, this.f133371b, scope, coroutineDispatchers, this.f133375f, this.f133372c, this.f133373d);
            case 6:
            case 7:
            case 8:
            case 9:
                return new k(context, feedBlogAdapterListener, bitmapTargetManager, this.f133371b, scope, viewType, this.f133376g, bundle);
            case 10:
                return this.f133374e.a(context, bitmapTargetManager, onFavoriteClicked);
            default:
                return new com.planner5d.library.feed.view.holders.c<>(new ViewStub(context));
        }
    }
}
