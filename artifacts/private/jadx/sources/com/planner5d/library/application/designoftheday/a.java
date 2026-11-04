package com.planner5d.library.application.designoftheday;

import android.content.Context;
import com.planner5d.library.model.manager.y0;
import fg.h;
import fg.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@h
public final class a {

    /* JADX INFO: renamed from: com.planner5d.library.application.designoftheday.a$a, reason: collision with other inner class name */
    public static final class C1514a implements com.planner5d.library.feed.view.holders.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ y0 f142498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f142499b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kc.a f142500c;

        C1514a(y0 y0Var, d dVar, kc.a aVar) {
            this.f142498a = y0Var;
            this.f142499b = dVar;
            this.f142500c = aVar;
        }

        @Override // com.planner5d.library.feed.view.holders.b
        public com.planner5d.library.feed.view.holders.c<?> a(Context context, com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, Function1<? super jc.e, Unit> onFavoriteClicked) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
            Intrinsics.checkNotNullParameter(onFavoriteClicked, "onFavoriteClicked");
            return new com.planner5d.library.feed.view.holders.a(context, bitmapTargetManager, this.f142498a, this.f142499b, this.f142500c, onFavoriteClicked);
        }
    }

    @i
    @NotNull
    public final com.planner5d.library.feed.view.holders.b a(@NotNull y0 imageManager, @NotNull d navigation, @NotNull kc.a feedStatistics) {
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        Intrinsics.checkNotNullParameter(feedStatistics, "feedStatistics");
        return new C1514a(imageManager, navigation, feedStatistics);
    }

    @i
    @NotNull
    public final kc.a b(@NotNull f feedStatistics) {
        Intrinsics.checkNotNullParameter(feedStatistics, "feedStatistics");
        return feedStatistics;
    }
}
