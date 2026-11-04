package io.intercom.android.sdk.helpcenter.api;

import io.intercom.android.sdk.helpcenter.articles.ArticleResponse;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection;
import io.intercom.android.sdk.helpcenter.search.HelpCenterArticleSearchResponse;
import io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent;
import io.intercom.android.sdk.helpcenter.utils.ConstantsKt;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes13.dex */
public interface HelpCenterApi {

    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object fetchArticle$default(HelpCenterApi helpCenterApi, String str, Map map, d dVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchArticle");
            }
            if ((i10 & 2) != 0) {
                map = HelpCenterApiHelper.INSTANCE.addDefaultOptions();
            }
            return helpCenterApi.fetchArticle(str, map, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object fetchCollectionDetails$default(HelpCenterApi helpCenterApi, String str, Map map, d dVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchCollectionDetails");
            }
            if ((i10 & 2) != 0) {
                map = HelpCenterApiHelper.INSTANCE.addDefaultOptions();
            }
            return helpCenterApi.fetchCollectionDetails(str, map, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object fetchCollections$default(HelpCenterApi helpCenterApi, Map map, d dVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchCollections");
            }
            if ((i10 & 1) != 0) {
                map = HelpCenterApiHelper.INSTANCE.addDefaultOptions();
            }
            return helpCenterApi.fetchCollections(map, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object reactToArticle$default(HelpCenterApi helpCenterApi, String str, int i10, String str2, boolean z10, String str3, Map map, d dVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reactToArticle");
            }
            if ((i11 & 8) != 0) {
                z10 = false;
            }
            boolean z11 = z10;
            if ((i11 & 16) != 0) {
                str3 = null;
            }
            String str4 = str3;
            if ((i11 & 32) != 0) {
                map = HelpCenterApiHelper.INSTANCE.addDefaultOptions();
            }
            return helpCenterApi.reactToArticle(str, i10, str2, z11, str4, map, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object searchForArticles$default(HelpCenterApi helpCenterApi, String str, String str2, Map map, d dVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: searchForArticles");
            }
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            if ((i10 & 4) != 0) {
                map = HelpCenterApiHelper.INSTANCE.addDefaultOptions();
            }
            return helpCenterApi.searchForArticles(str, str2, map, dVar);
        }
    }

    @POST("articles/{articleId}")
    @Nullable
    Object fetchArticle(@Path("articleId") @NotNull String str, @Body @NotNull Map<String, String> map, @NotNull d<? super NetworkResponse<ArticleResponse>> dVar);

    @POST("help_center/collections/{id}")
    @Nullable
    Object fetchCollectionDetails(@Path("id") @NotNull String str, @Body @NotNull Map<String, String> map, @NotNull d<? super NetworkResponse<HelpCenterCollectionContent>> dVar);

    @POST("help_center/collections")
    @Nullable
    Object fetchCollections(@Body @NotNull Map<String, String> map, @NotNull d<? super NetworkResponse<? extends List<HelpCenterCollection>>> dVar);

    @POST("articles/{articleId}/react")
    @Nullable
    Object reactToArticle(@Path("articleId") @NotNull String str, @Query("reaction_index") int i10, @NotNull @Query("article_content_id") String str2, @Query("allow_auto_responses") boolean z10, @Nullable @Query(ConstantsKt.KEY_ARTICLE_SOURCE) String str3, @Body @NotNull Map<String, String> map, @NotNull d<? super NetworkResponse<Unit>> dVar);

    @POST("help_center/search")
    @Nullable
    Object searchForArticles(@NotNull @Query("phrase") String str, @Nullable @Query(ConstantsKt.KEY_ARTICLE_SOURCE) String str2, @Body @NotNull Map<String, String> map, @NotNull d<? super NetworkResponse<? extends List<HelpCenterArticleSearchResponse>>> dVar);
}
