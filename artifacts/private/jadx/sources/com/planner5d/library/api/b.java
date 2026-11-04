package com.planner5d.library.api;

import androidx.annotation.p0;
import io.intercom.android.sdk.models.AttributeType;
import io.sentry.k4;
import okhttp3.e0;
import okhttp3.g0;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Streaming;
import retrofit2.http.Tag;
import retrofit2.http.Url;

/* JADX INFO: loaded from: classes6.dex */
public interface b {
    @HTTP(hasBody = true, method = "DELETE", path = "v2/id")
    c A(@Tag id.a aVar, @Body JSONObject jSONObject) throws e;

    @PUT("user")
    c A0(@Body JSONObject jSONObject) throws e;

    @Headers({"Content-Type: application/octet-stream"})
    @PUT
    Call<String> B(@Tag id.a aVar, @Url String str, @Header("x-goog-content-length-range") String str2, @Body e0 e0Var) throws e;

    @PATCH("spaces/{hash}/documents/{documentHash}")
    c B0(@Tag id.a aVar, @Path("hash") String str, @Path("documentHash") String str2, @Body JSONObject jSONObject) throws e;

    @GET("catalogs/user-models/{modelHash}")
    c C(@Tag id.a aVar, @Path("modelHash") String str) throws e;

    @Headers({"Content-Type: application/json"})
    @POST("ai/tasks/restyle")
    c C0(@Tag id.a aVar, @Query("application") String str, @Query("application_version") String str2, @Body JSONObject jSONObject, @Query("operating_system") String str3) throws e;

    @POST("screenshot/{hash}")
    c D(@Tag id.a aVar, @Path("hash") String str, @Body JSONObject jSONObject) throws e;

    @DELETE("user")
    c D0(@Tag id.a aVar) throws e;

    @Headers({com.planner5d.library.api.support.p.f142412r})
    @GET("user")
    c E(@Tag id.a aVar, @Query("hash") String str, @Query("from") String str2, @Query("autologout") int i10) throws e;

    @GET("screens/{userId}")
    c E0(@Tag id.a aVar, @Path("userId") long j10, @Query("ids") String str) throws e;

    @GET("v2/feed/{type}")
    c F(@Tag @p0 id.a aVar, @Path("type") String str, @Query("last") String str2, @Query(AttributeType.LIST) String str3, @Query("tag") Long l10, @Query("sort") String str4, @Query("pageSize") Integer num) throws e;

    @GET("sync?action=thumbnails")
    c F0(@Tag id.a aVar, @Query(AttributeType.DATE) String str, @Query("start") String str2) throws e;

    @POST("/api/projects/{hash}/export")
    c G(@Tag id.a aVar, @Body JSONObject jSONObject, @Path("hash") String str, @Query("application") String str2, @Query("application_version") long j10, @Query("operating_system") String str3) throws e;

    @GET("favourites")
    c G0(@Tag id.a aVar, @Query("path") String str) throws e;

    @POST("catalogs/search")
    c H(@Tag @p0 id.a aVar, @Body JSONObject jSONObject) throws e;

    @GET("spaces")
    c H0(@Tag id.a aVar, @Query("all") boolean z10, @Query("archived") boolean z11, @Query("pageSize") int i10, @Query(net.openid.appauth.f.c.f332989a) int i11) throws e;

    @PUT("v2/procodes")
    c I(@Tag id.a aVar, @Body JSONObject jSONObject) throws e;

    @GET("v2/ai?type=recognition&status=1")
    c I0(@Tag id.a aVar) throws e;

    @PUT("user")
    c J(@Body JSONObject jSONObject) throws e;

    @GET("sync")
    c J0(@Tag id.a aVar, @Query(AttributeType.DATE) String str, @Query("start") String str2, @Query("application") String str3, @Query("application_version") long j10) throws e;

    @POST("csi")
    c K(@Tag @p0 id.a aVar, @Body JSONObject jSONObject, @Query("application") String str, @Query("application_version") long j10, @Query("operating_system") String str2) throws e;

    @POST("spaces/document-upload-destination")
    c K0(@Tag id.a aVar, @Body JSONObject jSONObject) throws e;

    @POST("v2/ai")
    c L(@Tag id.a aVar, @Body JSONObject jSONObject, @Query("application") String str, @Query("application_version") long j10, @Query("operating_system") String str2) throws e;

    @POST("log")
    c L0(@Tag @p0 id.a aVar, @Body JSONObject jSONObject) throws e;

    @Headers({"Content-Type: application/json"})
    @POST("wizard/tasks")
    c M(@Tag id.a aVar, @Query("application") String str, @Query("application_version") String str2, @Body JSONObject jSONObject, @Query("operating_system") String str3) throws e;

    @Headers({com.planner5d.library.api.support.p.f142412r})
    @POST("auth")
    c M0(@p0 @Query("hash") String str, @Body JSONObject jSONObject) throws e;

    @GET("contests/{id}/catalog")
    c N(@Tag @p0 id.a aVar, @Path("id") long j10) throws e;

    @DELETE("spaces/{hash}/documents/{documentHash}")
    c N0(@Tag id.a aVar, @Path("hash") String str, @Path("documentHash") String str2) throws e;

    @DELETE("auth")
    c O(@Tag id.a aVar, @Query("provider") String str) throws e;

    @Headers({"Content-Type: application/merge-patch+json"})
    @PATCH("spaces/{hash}/documents/folders/{folderHash}")
    c O0(@Tag id.a aVar, @Path("hash") String str, @Path("folderHash") String str2, @Body JSONObject jSONObject) throws e;

    @GET("screens/{userId}/?deleted")
    c P(@Tag id.a aVar, @Path("userId") long j10) throws e;

    @GET("uprop")
    c P0(@Tag id.a aVar, @Query("name") String str) throws e;

    @POST("spaces/{hash}/documents/upload-link")
    c Q(@Tag id.a aVar, @Path("hash") String str, @Body JSONObject jSONObject) throws e;

    @Headers({com.planner5d.library.api.support.p.f142412r})
    @POST("user")
    c Q0(@p0 @Query("hash") String str, @Body JSONObject jSONObject) throws e;

    @GET("v2/feed/{type}")
    c R(@Tag @p0 id.a aVar, @Path("type") String str, @Query("url") String str2) throws e;

    @DELETE("spaces/{hash}")
    c R0(@Tag id.a aVar, @Path("hash") String str) throws e;

    @PUT("screens")
    c S(@Tag id.a aVar, @Body JSONObject jSONObject) throws e;

    @POST("spaces/documents")
    c S0(@Tag id.a aVar, @Body JSONObject jSONObject) throws e;

    @POST("ai/spaces/find-project")
    c T(@Tag id.a aVar, @Body JSONObject jSONObject) throws e;

    @POST("spaces/{hash}/documents/folders")
    c T0(@Tag id.a aVar, @Path("hash") String str, @Body JSONObject jSONObject) throws e;

    @POST("/api/ai/chat")
    c U(@Tag id.a aVar, @Body JSONObject jSONObject, @Query("application") String str, @Query("application_version") long j10, @Query("operating_system") String str2) throws e;

    @Headers({com.planner5d.library.api.support.p.f142412r})
    @PUT("user")
    c U0(@p0 @Query("hash") String str, @Body JSONObject jSONObject) throws e;

    @GET("project/{id}")
    c V(@Tag @p0 id.a aVar, @Path("id") String str) throws e;

    @Headers({"Content-Type: application/merge-patch+json"})
    @PATCH("spaces/{hash}")
    c V0(@Tag id.a aVar, @Path("hash") String str, @Body JSONObject jSONObject) throws e;

    @POST("contests/{id}/vote")
    c W(@Tag id.a aVar, @Path("id") long j10, @Body JSONObject jSONObject) throws e;

    @GET("spaces/{hash}/documents/folders/{folderHash}")
    c W0(@Tag id.a aVar, @Path("hash") String str, @Path("folderHash") String str2) throws e;

    @GET("spaces/{hash}")
    c X(@Tag id.a aVar, @Path("hash") String str) throws e;

    @POST("favourites")
    c Y(@Tag id.a aVar, @Body JSONObject jSONObject) throws e;

    @POST("find/address")
    c Z(@Tag @p0 id.a aVar, @Body JSONObject jSONObject) throws e;

    @DELETE("v2/ai")
    c a(@Tag id.a aVar, @Query("id") String str) throws e;

    @POST("contests/{id}/join")
    c a0(@Tag id.a aVar, @Path("id") long j10, @Query("application") String str, @Query("application_version") long j11, @Query("operating_system") String str2) throws e;

    @GET("blog/posts")
    c b(@Tag @p0 id.a aVar, @Header(com.google.common.net.d.f119511k) String str, @Query(net.openid.appauth.f.c.f332989a) int i10, @Query("application") String str2, @Query("application_version") long j10, @Query("operating_system") String str3) throws e;

    @GET("sets")
    c b0(@Tag id.a aVar) throws e;

    @GET("blog/categories")
    c c(@Tag @p0 id.a aVar, @Header(com.google.common.net.d.f119511k) String str) throws e;

    @GET("screens/{userId}")
    c c0(@Tag id.a aVar, @Path("userId") long j10, @Query(net.openid.appauth.f.c.f332989a) int i10) throws e;

    @Headers({com.planner5d.library.api.support.p.f142412r})
    @PUT("user")
    c d(@Body JSONObject jSONObject) throws e;

    @POST("ai/spaces/find-house")
    c d0(@Tag id.a aVar, @Body JSONObject jSONObject) throws e;

    @GET("textures")
    c e(@Tag @p0 id.a aVar) throws e;

    @PUT("v2/id")
    c e0(@Tag @p0 id.a aVar, @Body JSONObject jSONObject) throws e;

    @GET("spaces/{hash}/documents/{documentHash}/download-link")
    c f(@Tag id.a aVar, @Path("hash") String str, @Path("documentHash") String str2) throws e;

    @PUT("v2/id")
    c f0(@Tag @p0 id.a aVar, @Query("hash") String str, @Body JSONObject jSONObject) throws e;

    @POST("ai/ai-auto-styles")
    c g(@Tag id.a aVar, @Query("application") String str, @Query("application_version") String str2, @Body JSONObject jSONObject, @Query("operating_system") String str3) throws e;

    @Headers({com.planner5d.library.api.support.p.f142412r})
    @POST("user/one-time-tokens")
    c g0(@Body JSONObject jSONObject) throws e;

    @GET("v2/products")
    c h(@Tag id.a aVar, @Query("application") String str, @Query("application_version") long j10, @Query("device") String str2, @Query("operating_system") String str3, @Query(k4.c.f305753i) String str4) throws e;

    @DELETE("spaces/{hash}/documents/folders/{folderHash}")
    c h0(@Tag id.a aVar, @Path("hash") String str, @Path("folderHash") String str2) throws e;

    @PUT("account")
    c i(@Tag id.a aVar, @Body JSONObject jSONObject) throws e;

    @GET("room-types")
    c i0(@Tag @p0 id.a aVar, @Query(net.openid.appauth.f.c.f332989a) int i10, @Query("application") String str, @Query("application_version") long j10, @Query("operating_system") String str2) throws e;

    @POST("textures")
    c j(@Tag id.a aVar, @Body JSONObject jSONObject) throws e;

    @PUT("uprop")
    c j0(@Tag id.a aVar, @Body JSONObject jSONObject) throws e;

    @POST("contests/{id}/submit")
    c k(@Tag id.a aVar, @Path("id") long j10, @Body JSONObject jSONObject, @Query("application") String str, @Query("application_version") long j11, @Query("operating_system") String str2) throws e;

    @POST("auth?link=1")
    c k0(@Tag id.a aVar, @Body JSONObject jSONObject) throws e;

    @POST("gallery/{hash}")
    c l(@Tag id.a aVar, @Path("hash") String str, @Body JSONObject jSONObject) throws e;

    @POST(io.sentry.protocol.f.f306242h)
    @Multipart
    c l0(@Tag @p0 id.a aVar, @Part("version") String str, @Part("tag") String str2, @Part("message") String str3, @Part("notes") String str4, @Part("system") String str5, @Part("application") String str6, @Part("application_version") int i10, @Part(com.planner5d.library.model.manager.crashreporting.n.a.f191217d) String str7, @Part("email") String str8, @Part okhttp3.y.c cVar) throws e;

    @POST("sync")
    c m(@Tag id.a aVar, @Body JSONObject jSONObject) throws e;

    @POST("spaces")
    c m0(@Tag id.a aVar, @Body JSONObject jSONObject) throws e;

    @GET("config")
    c n(@Tag @p0 id.a aVar, @Query("application") String str, @Query("application_version") long j10, @Query("device") String str2, @Query("operating_system") String str3, @Query(k4.c.f305753i) String str4) throws e;

    @DELETE("favourites")
    c n0(@Tag id.a aVar, @Query(androidx.media3.exoplayer.upstream.f.f65973m) String str, @Query("path") String str2) throws e;

    @GET("spaces/{hash}/documents")
    c o(@Tag id.a aVar, @Path("hash") String str, @Query("folder") String str2, @Query("archived") boolean z10, @Query("pageSize") int i10, @Query(net.openid.appauth.f.c.f332989a) int i11) throws e;

    @GET("spaces/{hash}/documents/{documentHash}")
    c o0(@Tag id.a aVar, @Path("hash") String str, @Path("documentHash") String str2) throws e;

    @GET("contests")
    c p(@Tag id.a aVar) throws e;

    @PUT("screenshot/{id}")
    c p0(@Tag id.a aVar, @Path("id") long j10, @Body JSONObject jSONObject) throws e;

    @GET("contests/{id}/vote")
    c q(@Tag id.a aVar, @Path("id") long j10, @Query("application") String str, @Query("application_version") long j11, @Query("operating_system") String str2, @Query("batches") long j12) throws e;

    @POST("v2/payments")
    c q0(@Tag id.a aVar, @Body JSONObject jSONObject) throws e;

    @POST("spaces/{hash}/documents")
    c r(@Tag id.a aVar, @Path("hash") String str, @Body JSONObject jSONObject) throws e;

    @GET("v2/messages")
    c r0(@Tag @p0 id.a aVar, @Query("application") String str, @Query("application_version") long j10, @Query("device") String str2, @Query("operating_system") String str3) throws e;

    @Headers({"Content-Type: application/json"})
    @POST("ai/decorator")
    c s(@Tag id.a aVar, @Query("application") String str, @Query("application_version") String str2, @Body JSONObject jSONObject, @Query("operating_system") String str3) throws e;

    @GET
    c s0(@Tag @p0 id.a aVar, @Url String str, @Query("application") String str2, @Query("application_version") long j10, @Query("device") String str3, @Query("operating_system") String str4, @Query(k4.c.f305753i) String str5, @Query(com.planner5d.library.model.manager.crashreporting.n.a.f191216c) String str6) throws e;

    @GET("auth")
    c t(@Tag id.a aVar) throws e;

    @Headers({"Content-Type: application/json"})
    @POST("ai/tasks/furnish")
    c t0(@Tag id.a aVar, @Query("application") String str, @Query("application_version") String str2, @Body JSONObject jSONObject, @Query("operating_system") String str3) throws e;

    @GET("account")
    c u(@Tag id.a aVar) throws e;

    @DELETE("screens")
    c u0(@Tag id.a aVar, @Query("id") long j10) throws e;

    @GET("user")
    c v(@Tag id.a aVar) throws e;

    @POST("user")
    @Multipart
    c v0(@Tag id.a aVar, @Part okhttp3.y.c cVar, @Part("hash") String str) throws e;

    @Streaming
    @GET
    Call<g0> w(@Tag id.a aVar, @Url String str) throws e;

    @GET("sync")
    c w0(@Tag id.a aVar, @Query(AttributeType.DATE) String str, @Query("application") String str2, @Query("application_version") long j10) throws e;

    @GET("account")
    c x(@Tag id.a aVar) throws e;

    @POST("renders/enhance")
    c x0(@Tag id.a aVar, @Body JSONObject jSONObject) throws e;

    @POST("payments/intent")
    c y(@Tag id.a aVar, @Body JSONObject jSONObject) throws e;

    @PUT("renders")
    c y0(@Tag id.a aVar, @Query("task") long j10, @Query("mode") int i10, @Query("from") String str, @Query("application") String str2, @Query("application_version") long j11, @Body JSONObject jSONObject) throws e;

    @GET("spaces/{hash}/documents/folders")
    c z(@Tag id.a aVar, @Path("hash") String str, @Query("archived") boolean z10, @Query("pageSize") int i10, @Query(net.openid.appauth.f.c.f332989a) int i11) throws e;

    @GET("room-styles")
    c z0(@Tag @p0 id.a aVar, @Query(net.openid.appauth.f.c.f332989a) int i10, @Query("application") String str, @Query("application_version") long j10, @Query("operating_system") String str2) throws e;
}
