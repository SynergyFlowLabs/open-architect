package com.facebook.share.internal;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import androidx.media3.common.s0;
import com.devtodev.core.data.metrics.MetricConsts;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.appevents.f0;
import com.facebook.g0;
import com.facebook.internal.e1;
import com.facebook.internal.u0;
import com.facebook.internal.w0;
import com.facebook.p;
import com.facebook.q0;
import com.facebook.r0;
import com.facebook.share.model.CameraEffectTextures;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import com.facebook.u;
import com.facebook.v;
import com.facebook.w;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final k f101889a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f101890b = "me/staging_resources";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f101891c = "file";

    public static final class a extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p<v5.b.a> f101892b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p<v5.b.a> pVar) {
            super(pVar);
            this.f101892b = pVar;
        }

        @Override // com.facebook.share.internal.e
        public void a(@NotNull com.facebook.internal.b appCall) {
            Intrinsics.checkNotNullParameter(appCall, "appCall");
            k kVar = k.f101889a;
            k.u(this.f101892b);
        }

        @Override // com.facebook.share.internal.e
        public void b(@NotNull com.facebook.internal.b appCall, @NotNull u error) {
            Intrinsics.checkNotNullParameter(appCall, "appCall");
            Intrinsics.checkNotNullParameter(error, "error");
            k kVar = k.f101889a;
            k.v(this.f101892b, error);
        }

        @Override // com.facebook.share.internal.e
        public void c(@NotNull com.facebook.internal.b appCall, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(appCall, "appCall");
            if (bundle != null) {
                k kVar = k.f101889a;
                String strI = k.i(bundle);
                if (strI == null || StringsKt.N1("post", strI, true)) {
                    k.y(this.f101892b, k.k(bundle));
                } else if (StringsKt.N1("cancel", strI, true)) {
                    k.u(this.f101892b);
                } else {
                    k.v(this.f101892b, new u(w0.U0));
                }
            }
        }
    }

    private k() {
    }

    @n
    @NotNull
    public static final GraphRequest A(@Nullable AccessToken accessToken, @Nullable Bitmap bitmap, @Nullable GraphRequest.b bVar) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable(f101891c, bitmap);
        return new GraphRequest(accessToken, f101890b, bundle, r0.POST, bVar, null, 32, null);
    }

    @n
    @NotNull
    public static final GraphRequest B(@Nullable AccessToken accessToken, @NotNull Uri imageUri, @Nullable GraphRequest.b bVar) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        String path = imageUri.getPath();
        e1 e1Var = e1.f99794a;
        if (e1.X(imageUri) && path != null) {
            return C(accessToken, new File(path), bVar);
        }
        if (!e1.U(imageUri)) {
            throw new u("The image Uri must be either a file:// or content:// Uri");
        }
        GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(imageUri, s0.X0);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable(f101891c, parcelableResourceWithMimeType);
        return new GraphRequest(accessToken, f101890b, bundle, r0.POST, bVar, null, 32, null);
    }

    @n
    @NotNull
    public static final GraphRequest C(@Nullable AccessToken accessToken, @Nullable File file, @Nullable GraphRequest.b bVar) throws FileNotFoundException {
        GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(ParcelFileDescriptor.open(file, 268435456), s0.X0);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable(f101891c, parcelableResourceWithMimeType);
        return new GraphRequest(accessToken, f101890b, bundle, r0.POST, bVar, null, 32, null);
    }

    @n
    public static final void D(final int i10, @Nullable com.facebook.k kVar, @Nullable final p<v5.b.a> pVar) {
        if (!(kVar instanceof com.facebook.internal.f)) {
            throw new u("Unexpected CallbackManager, please use the provided Factory.");
        }
        ((com.facebook.internal.f) kVar).b(i10, new com.facebook.internal.f.a() { // from class: com.facebook.share.internal.i
            @Override // com.facebook.internal.f.a
            public final boolean a(int i11, Intent intent) {
                return k.E(i10, pVar, i11, intent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean E(int i10, p pVar, int i11, Intent intent) {
        return q(i10, i11, intent, l(pVar));
    }

    @n
    public static final void F(final int i10) {
        com.facebook.internal.f.f99815b.c(i10, new com.facebook.internal.f.a() { // from class: com.facebook.share.internal.j
            @Override // com.facebook.internal.f.a
            public final boolean a(int i11, Intent intent) {
                return k.G(i10, i11, intent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean G(int i10, int i11, Intent intent) {
        return q(i10, i11, intent, l(null));
    }

    @n
    @NotNull
    public static final JSONArray H(@NotNull JSONArray jsonArray, boolean z10) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        JSONArray jSONArray = new JSONArray();
        int length = jsonArray.length();
        if (length > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                Object objI = jsonArray.get(i10);
                if (objI instanceof JSONArray) {
                    objI = H((JSONArray) objI, z10);
                } else if (objI instanceof JSONObject) {
                    objI = I((JSONObject) objI, z10);
                }
                jSONArray.put(objI);
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return jSONArray;
    }

    @n
    @Nullable
    public static final JSONObject I(@Nullable JSONObject jSONObject, boolean z10) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONArray jSONArrayNames = jSONObject.names();
            if (jSONArrayNames == null) {
                return null;
            }
            int length = jSONArrayNames.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    String key = jSONArrayNames.getString(i10);
                    Object objH = jSONObject.get(key);
                    if (objH instanceof JSONObject) {
                        objH = I((JSONObject) objH, true);
                    } else if (objH instanceof JSONArray) {
                        objH = H((JSONArray) objH, true);
                    }
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    Pair<String, String> pairG = g(key);
                    String str = (String) pairG.first;
                    String str2 = (String) pairG.second;
                    if (z10) {
                        if (str != null && Intrinsics.areEqual(str, com.facebook.devicerequests.internal.a.f99540g)) {
                            jSONObject2.put(key, objH);
                        } else if (str == null || Intrinsics.areEqual(str, "og")) {
                            jSONObject2.put(str2, objH);
                        } else {
                            jSONObject3.put(str2, objH);
                        }
                    } else if (str == null || !Intrinsics.areEqual(str, MetricConsts.FacebookInfo)) {
                        jSONObject2.put(str2, objH);
                    } else {
                        jSONObject2.put(key, objH);
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            if (jSONObject3.length() > 0) {
                jSONObject2.put("data", jSONObject3);
            }
            return jSONObject2;
        } catch (JSONException unused) {
            throw new u("Failed to create json object from share content");
        }
    }

    private final com.facebook.internal.b c(int i10, int i11, Intent intent) {
        w0 w0Var = w0.f100148a;
        UUID uuidS = w0.s(intent);
        if (uuidS == null) {
            return null;
        }
        return com.facebook.internal.b.f99720d.b(uuidS, i10);
    }

    private final u0.a d(UUID uuid, Uri uri, Bitmap bitmap) {
        if (bitmap != null) {
            u0 u0Var = u0.f100117a;
            return u0.d(uuid, bitmap);
        }
        if (uri == null) {
            return null;
        }
        u0 u0Var2 = u0.f100117a;
        return u0.e(uuid, uri);
    }

    private final u0.a e(UUID uuid, ShareMedia<?, ?> shareMedia) {
        Uri uriE;
        Bitmap bitmapE;
        if (shareMedia instanceof SharePhoto) {
            SharePhoto sharePhoto = (SharePhoto) shareMedia;
            bitmapE = sharePhoto.e();
            uriE = sharePhoto.g();
        } else if (shareMedia instanceof ShareVideo) {
            uriE = ((ShareVideo) shareMedia).e();
            bitmapE = null;
        } else {
            uriE = null;
            bitmapE = null;
        }
        return d(uuid, uriE, bitmapE);
    }

    @n
    @Nullable
    public static final Bundle f(@Nullable ShareStoryContent shareStoryContent, @NotNull UUID appCallId) {
        Intrinsics.checkNotNullParameter(appCallId, "appCallId");
        Bundle bundle = null;
        if (shareStoryContent != null && shareStoryContent.j() != null) {
            ShareMedia<?, ?> shareMediaJ = shareStoryContent.j();
            u0.a aVarE = f101889a.e(appCallId, shareMediaJ);
            if (aVarE == null) {
                return null;
            }
            bundle = new Bundle();
            bundle.putString("type", shareMediaJ.b().name());
            bundle.putString("uri", aVarE.b());
            String strO = o(aVarE.e());
            if (strO != null) {
                e1 e1Var = e1.f99794a;
                e1.o0(bundle, f.f101834g0, strO);
            }
            u0 u0Var = u0.f100117a;
            u0.a(CollectionsKt.listOf(aVarE));
        }
        return bundle;
    }

    @n
    @NotNull
    public static final Pair<String, String> g(@NotNull String fullName) {
        String strSubstring;
        String strSubstring2;
        int i10;
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        boolean z10 = false;
        int iQ3 = StringsKt.q3(fullName, AbstractJsonLexerKt.COLON, 0, false, 6, null);
        if (iQ3 == -1 || fullName.length() <= (i10 = iQ3 + 1)) {
            strSubstring = null;
            strSubstring2 = fullName;
        } else {
            strSubstring = fullName.substring(0, iQ3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            strSubstring2 = fullName.substring(i10);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "(this as java.lang.String).substring(startIndex)");
        }
        return new Pair<>(strSubstring, strSubstring2);
    }

    @n
    @Nullable
    public static final List<Bundle> h(@Nullable ShareMediaContent shareMediaContent, @NotNull UUID appCallId) {
        Bundle bundle;
        Intrinsics.checkNotNullParameter(appCallId, "appCallId");
        List<ShareMedia<?, ?>> listI = shareMediaContent == null ? null : shareMediaContent.i();
        if (listI == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (ShareMedia<?, ?> shareMedia : listI) {
            u0.a aVarE = f101889a.e(appCallId, shareMedia);
            if (aVarE == null) {
                bundle = null;
            } else {
                arrayList.add(aVarE);
                bundle = new Bundle();
                bundle.putString("type", shareMedia.b().name());
                bundle.putString("uri", aVarE.b());
            }
            if (bundle != null) {
                arrayList2.add(bundle);
            }
        }
        u0 u0Var = u0.f100117a;
        u0.a(arrayList);
        return arrayList2;
    }

    @n
    @Nullable
    public static final String i(@NotNull Bundle result) {
        Intrinsics.checkNotNullParameter(result, "result");
        return result.containsKey(w0.U) ? result.getString(w0.U) : result.getString(w0.S);
    }

    @n
    @Nullable
    public static final List<String> j(@Nullable SharePhotoContent sharePhotoContent, @NotNull UUID appCallId) {
        Intrinsics.checkNotNullParameter(appCallId, "appCallId");
        List<SharePhoto> listI = sharePhotoContent == null ? null : sharePhotoContent.i();
        if (listI == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listI.iterator();
        while (it.hasNext()) {
            u0.a aVarE = f101889a.e(appCallId, (SharePhoto) it.next());
            if (aVarE != null) {
                arrayList.add(aVarE);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((u0.a) it2.next()).b());
        }
        u0 u0Var = u0.f100117a;
        u0.a(arrayList);
        return arrayList2;
    }

    @n
    @Nullable
    public static final String k(@NotNull Bundle result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.containsKey(f.G0)) {
            return result.getString(f.G0);
        }
        return result.containsKey(f.F0) ? result.getString(f.F0) : result.getString(f.f101861u);
    }

    @n
    @NotNull
    public static final e l(@Nullable p<v5.b.a> pVar) {
        return new a(pVar);
    }

    @n
    @Nullable
    public static final Bundle m(@Nullable ShareStoryContent shareStoryContent, @NotNull UUID appCallId) {
        Intrinsics.checkNotNullParameter(appCallId, "appCallId");
        if (shareStoryContent != null && shareStoryContent.l() != null) {
            new ArrayList().add(shareStoryContent.l());
            u0.a aVarE = f101889a.e(appCallId, shareStoryContent.l());
            if (aVarE == null) {
                return null;
            }
            Bundle bundle = new Bundle();
            bundle.putString("uri", aVarE.b());
            String strO = o(aVarE.e());
            if (strO != null) {
                e1 e1Var = e1.f99794a;
                e1.o0(bundle, f.f101834g0, strO);
            }
            u0 u0Var = u0.f100117a;
            u0.a(CollectionsKt.listOf(aVarE));
            return bundle;
        }
        return null;
    }

    @n
    @Nullable
    public static final Bundle n(@Nullable ShareCameraEffectContent shareCameraEffectContent, @NotNull UUID appCallId) {
        Intrinsics.checkNotNullParameter(appCallId, "appCallId");
        CameraEffectTextures cameraEffectTexturesK = shareCameraEffectContent == null ? null : shareCameraEffectContent.k();
        if (cameraEffectTexturesK == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        for (String str : cameraEffectTexturesK.f()) {
            u0.a aVarD = f101889a.d(appCallId, cameraEffectTexturesK.e(str), cameraEffectTexturesK.c(str));
            if (aVarD != null) {
                arrayList.add(aVarD);
                bundle.putString(str, aVarD.b());
            }
        }
        u0 u0Var = u0.f100117a;
        u0.a(arrayList);
        return bundle;
    }

    @n
    @Nullable
    public static final String o(@Nullable Uri uri) {
        if (uri == null) {
            return null;
        }
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "uri.toString()");
        int iF3 = StringsKt.F3(string, '.', 0, false, 6, null);
        if (iF3 == -1) {
            return null;
        }
        String strSubstring = string.substring(iF3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    @n
    @Nullable
    public static final String p(@Nullable ShareVideoContent shareVideoContent, @NotNull UUID appCallId) {
        ShareVideo shareVideoL;
        Intrinsics.checkNotNullParameter(appCallId, "appCallId");
        Uri uriE = (shareVideoContent == null || (shareVideoL = shareVideoContent.l()) == null) ? null : shareVideoL.e();
        if (uriE == null) {
            return null;
        }
        u0 u0Var = u0.f100117a;
        u0.a aVarE = u0.e(appCallId, uriE);
        u0.a(CollectionsKt.listOf(aVarE));
        return aVarE.b();
    }

    @n
    public static final boolean q(int i10, int i11, @Nullable Intent intent, @Nullable e eVar) {
        u uVarU;
        com.facebook.internal.b bVarC = f101889a.c(i10, i11, intent);
        if (bVarC == null) {
            return false;
        }
        u0 u0Var = u0.f100117a;
        u0.c(bVarC.d());
        if (eVar == null) {
            return true;
        }
        Bundle bundleB = null;
        if (intent != null) {
            w0 w0Var = w0.f100148a;
            uVarU = w0.u(w0.t(intent));
        } else {
            uVarU = null;
        }
        if (uVarU == null) {
            if (intent != null) {
                w0 w0Var2 = w0.f100148a;
                bundleB = w0.B(intent);
            }
            eVar.c(bVarC, bundleB);
        } else if (uVarU instanceof w) {
            eVar.a(bVarC);
        } else {
            eVar.b(bVarC, uVarU);
        }
        return true;
    }

    @n
    public static final void r(@Nullable p<v5.b.a> pVar, @Nullable String str) {
        x(pVar, str);
    }

    @n
    public static final void s(@Nullable p<v5.b.a> pVar, @NotNull Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (exception instanceof u) {
            v(pVar, (u) exception);
        } else {
            r(pVar, Intrinsics.stringPlus("Error preparing share content: ", exception.getLocalizedMessage()));
        }
    }

    @n
    public static final void t(@Nullable p<v5.b.a> pVar, @Nullable String str, @NotNull q0 graphResponse) {
        Intrinsics.checkNotNullParameter(graphResponse, "graphResponse");
        FacebookRequestError facebookRequestErrorG = graphResponse.g();
        if (facebookRequestErrorG == null) {
            y(pVar, str);
            return;
        }
        String strI = facebookRequestErrorG.i();
        e1 e1Var = e1.f99794a;
        if (e1.Z(strI)) {
            strI = "Unexpected error sharing.";
        }
        w(pVar, graphResponse, strI);
    }

    @n
    public static final void u(@Nullable p<v5.b.a> pVar) {
        f101889a.z(com.facebook.internal.a.V, null);
        if (pVar == null) {
            return;
        }
        pVar.onCancel();
    }

    @n
    public static final void v(@Nullable p<v5.b.a> pVar, @NotNull u ex) {
        Intrinsics.checkNotNullParameter(ex, "ex");
        f101889a.z("error", ex.getMessage());
        if (pVar == null) {
            return;
        }
        pVar.a(ex);
    }

    @n
    public static final void w(@Nullable p<v5.b.a> pVar, @Nullable q0 q0Var, @Nullable String str) {
        f101889a.z("error", str);
        if (pVar == null) {
            return;
        }
        pVar.a(new v(q0Var, str));
    }

    @n
    public static final void x(@Nullable p<v5.b.a> pVar, @Nullable String str) {
        f101889a.z("error", str);
        if (pVar == null) {
            return;
        }
        pVar.a(new u(str));
    }

    @n
    public static final void y(@Nullable p<v5.b.a> pVar, @Nullable String str) {
        f101889a.z(com.facebook.internal.a.U, null);
        if (pVar == null) {
            return;
        }
        pVar.b(new v5.b.a(str));
    }

    private final void z(String str, String str2) {
        g0 g0Var = g0.f99617a;
        f0 f0Var = new f0(g0.n());
        Bundle bundle = new Bundle();
        bundle.putString(com.facebook.internal.a.T, str);
        if (str2 != null) {
            bundle.putString(com.facebook.internal.a.Y, str2);
        }
        f0Var.m(com.facebook.internal.a.f99682l0, bundle);
    }
}
