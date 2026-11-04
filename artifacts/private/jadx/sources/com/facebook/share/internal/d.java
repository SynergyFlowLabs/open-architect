package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.internal.e1;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideoContent;
import com.facebook.u;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f101819a = new d();

    private d() {
    }

    private final Bundle a(ShareCameraEffectContent shareCameraEffectContent, Bundle bundle, boolean z10) {
        Bundle bundleH = h(shareCameraEffectContent, z10);
        e1 e1Var = e1.f99794a;
        e1.o0(bundleH, f.f101836h0, shareCameraEffectContent.j());
        if (bundle != null) {
            bundleH.putBundle(f.f101840j0, bundle);
        }
        try {
            b bVar = b.f101816a;
            JSONObject jSONObjectB = b.b(shareCameraEffectContent.i());
            if (jSONObjectB != null) {
                e1.o0(bundleH, f.f101838i0, jSONObjectB.toString());
            }
            return bundleH;
        } catch (JSONException e10) {
            throw new u(Intrinsics.stringPlus("Unable to create a JSON Object from the provided CameraEffectArguments: ", e10.getMessage()));
        }
    }

    private final Bundle b(ShareLinkContent shareLinkContent, boolean z10) {
        Bundle bundleH = h(shareLinkContent, z10);
        e1 e1Var = e1.f99794a;
        e1.o0(bundleH, f.f101824b0, shareLinkContent.i());
        e1.p0(bundleH, f.K, shareLinkContent.a());
        e1.p0(bundleH, f.T, shareLinkContent.a());
        return bundleH;
    }

    private final Bundle c(ShareMediaContent shareMediaContent, List<Bundle> list, boolean z10) {
        Bundle bundleH = h(shareMediaContent, z10);
        bundleH.putParcelableArrayList(f.f101826c0, new ArrayList<>(list));
        return bundleH;
    }

    private final Bundle d(SharePhotoContent sharePhotoContent, List<String> list, boolean z10) {
        Bundle bundleH = h(sharePhotoContent, z10);
        bundleH.putStringArrayList(f.Z, new ArrayList<>(list));
        return bundleH;
    }

    private final Bundle e(ShareStoryContent shareStoryContent, Bundle bundle, Bundle bundle2, boolean z10) {
        Bundle bundleH = h(shareStoryContent, z10);
        if (bundle != null) {
            bundleH.putParcelable(f.T0, bundle);
        }
        if (bundle2 != null) {
            bundleH.putParcelable(f.U0, bundle2);
        }
        List<String> listK = shareStoryContent.k();
        if (listK != null && !listK.isEmpty()) {
            bundleH.putStringArrayList(f.R0, new ArrayList<>(listK));
        }
        e1 e1Var = e1.f99794a;
        e1.o0(bundleH, f.S0, shareStoryContent.i());
        return bundleH;
    }

    private final Bundle f(ShareVideoContent shareVideoContent, String str, boolean z10) {
        Bundle bundleH = h(shareVideoContent, z10);
        e1 e1Var = e1.f99794a;
        e1.o0(bundleH, "TITLE", shareVideoContent.j());
        e1.o0(bundleH, f.W, shareVideoContent.i());
        e1.o0(bundleH, f.f101822a0, str);
        return bundleH;
    }

    @n
    @Nullable
    public static final Bundle g(@NotNull UUID callId, @NotNull ShareContent<?, ?> shareContent, boolean z10) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        Intrinsics.checkNotNullParameter(shareContent, "shareContent");
        if (shareContent instanceof ShareLinkContent) {
            return f101819a.b((ShareLinkContent) shareContent, z10);
        }
        if (shareContent instanceof SharePhotoContent) {
            k kVar = k.f101889a;
            SharePhotoContent sharePhotoContent = (SharePhotoContent) shareContent;
            List<String> listJ = k.j(sharePhotoContent, callId);
            if (listJ == null) {
                listJ = CollectionsKt.emptyList();
            }
            return f101819a.d(sharePhotoContent, listJ, z10);
        }
        if (shareContent instanceof ShareVideoContent) {
            k kVar2 = k.f101889a;
            ShareVideoContent shareVideoContent = (ShareVideoContent) shareContent;
            return f101819a.f(shareVideoContent, k.p(shareVideoContent, callId), z10);
        }
        if (shareContent instanceof ShareMediaContent) {
            k kVar3 = k.f101889a;
            ShareMediaContent shareMediaContent = (ShareMediaContent) shareContent;
            List<Bundle> listH = k.h(shareMediaContent, callId);
            if (listH == null) {
                listH = CollectionsKt.emptyList();
            }
            return f101819a.c(shareMediaContent, listH, z10);
        }
        if (shareContent instanceof ShareCameraEffectContent) {
            k kVar4 = k.f101889a;
            ShareCameraEffectContent shareCameraEffectContent = (ShareCameraEffectContent) shareContent;
            return f101819a.a(shareCameraEffectContent, k.n(shareCameraEffectContent, callId), z10);
        }
        if (!(shareContent instanceof ShareStoryContent)) {
            return null;
        }
        k kVar5 = k.f101889a;
        ShareStoryContent shareStoryContent = (ShareStoryContent) shareContent;
        return f101819a.e(shareStoryContent, k.f(shareStoryContent, callId), k.m(shareStoryContent, callId), z10);
    }

    private final Bundle h(ShareContent<?, ?> shareContent, boolean z10) {
        Bundle bundle = new Bundle();
        e1 e1Var = e1.f99794a;
        e1.p0(bundle, f.J, shareContent.a());
        e1.o0(bundle, f.G, shareContent.e());
        e1.o0(bundle, f.I, shareContent.b());
        e1.o0(bundle, f.X, shareContent.f());
        e1.o0(bundle, f.X, shareContent.f());
        bundle.putBoolean(f.Y, z10);
        List<String> listC = shareContent.c();
        if (listC != null && !listC.isEmpty()) {
            bundle.putStringArrayList(f.H, new ArrayList<>(listC));
        }
        ShareHashtag shareHashtagG = shareContent.g();
        e1.o0(bundle, f.L, shareHashtagG == null ? null : shareHashtagG.a());
        return bundle;
    }
}
