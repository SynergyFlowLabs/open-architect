package io.intercom.android.sdk.helpcenter.utils;

import android.content.Context;
import io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityLauncher;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import oj.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nHelpCenterUrlUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelpCenterUrlUtils.kt\nio/intercom/android/sdk/helpcenter/utils/HelpCenterUrlUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,61:1\n1755#2,3:62\n*S KotlinDebug\n*F\n+ 1 HelpCenterUrlUtils.kt\nio/intercom/android/sdk/helpcenter/utils/HelpCenterUrlUtilsKt\n*L\n60#1:62,3\n*E\n"})
public final class HelpCenterUrlUtilsKt {
    @NotNull
    public static final String extractIdFromLastSegment(@NotNull String lastSegment) {
        Intrinsics.checkNotNullParameter(lastSegment, "lastSegment");
        List listSplit$default = StringsKt.split$default(lastSegment, new String[]{"-"}, false, 0, 6, null);
        return !listSplit$default.isEmpty() ? (String) listSplit$default.get(0) : "";
    }

    public static final boolean isHelpCenterArticleUrl(@NotNull String url, @NotNull Set<String> helpCenterUrls) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(helpCenterUrls, "helpCenterUrls");
        return isHelpCenterUrl(url, helpCenterUrls) && StringsKt.V2(url, "/articles/", false, 2, null);
    }

    public static final boolean isHelpCenterCollectionUrl(@NotNull String url, @NotNull Set<String> helpCenterUrls) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(helpCenterUrls, "helpCenterUrls");
        return isHelpCenterUrl(url, helpCenterUrls) && StringsKt.V2(url, "/collections/", false, 2, null);
    }

    private static final boolean isHelpCenterUrl(String str, Set<String> set) {
        Set<String> set2 = set;
        if ((set2 instanceof Collection) && set2.isEmpty()) {
            return false;
        }
        Iterator<T> it = set2.iterator();
        while (it.hasNext()) {
            if (StringsKt.u2(str, (String) it.next(), false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    @j
    public static final void openArticle(@NotNull Context context, @NotNull String articleId, @NotNull String place) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        Intrinsics.checkNotNullParameter(place, "place");
        openArticle$default(context, articleId, place, false, 8, null);
    }

    public static /* synthetic */ void openArticle$default(Context context, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        openArticle(context, str, str2, z10);
    }

    public static final void openCollection(@NotNull Context context, @NotNull String collectionId, @NotNull String place) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        Intrinsics.checkNotNullParameter(place, "place");
        IntercomRootActivityLauncher.INSTANCE.startHelpCenterCollection(context, collectionId, place);
    }

    public static final void openCollections(@NotNull Context context, @NotNull List<String> collectionIds, @NotNull String place) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(collectionIds, "collectionIds");
        Intrinsics.checkNotNullParameter(place, "place");
        if (collectionIds.size() == 1) {
            IntercomRootActivityLauncher.INSTANCE.startHelpCenterCollection(context, (String) CollectionsKt.first((List) collectionIds), place);
        } else {
            IntercomRootActivityLauncher.INSTANCE.startHelpCenterCollections(context, collectionIds, place);
        }
    }

    @j
    public static final void openArticle(@NotNull Context context, @NotNull String articleId, @NotNull String place, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        Intrinsics.checkNotNullParameter(place, "place");
        context.startActivity(IntercomArticleActivity.Companion.buildIntent(context, new IntercomArticleActivity.ArticleActivityArguments(articleId, place, false, z10, 4, null)));
    }
}
