package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.internal.e1;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.SharePhotoContent;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f101818a = new c();

    private c() {
    }

    private final Bundle a(ShareLinkContent shareLinkContent, boolean z10) {
        return d(shareLinkContent, z10);
    }

    private final Bundle b(SharePhotoContent sharePhotoContent, List<String> list, boolean z10) {
        Bundle bundleD = d(sharePhotoContent, z10);
        bundleD.putStringArrayList(f.F, new ArrayList<>(list));
        return bundleD;
    }

    @n
    @Nullable
    public static final Bundle c(@NotNull UUID callId, @NotNull ShareContent<?, ?> shareContent, boolean z10) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        Intrinsics.checkNotNullParameter(shareContent, "shareContent");
        if (shareContent instanceof ShareLinkContent) {
            return f101818a.a((ShareLinkContent) shareContent, z10);
        }
        if (!(shareContent instanceof SharePhotoContent)) {
            return null;
        }
        k kVar = k.f101889a;
        SharePhotoContent sharePhotoContent = (SharePhotoContent) shareContent;
        List<String> listJ = k.j(sharePhotoContent, callId);
        if (listJ == null) {
            listJ = CollectionsKt.emptyList();
        }
        return f101818a.b(sharePhotoContent, listJ, z10);
    }

    private final Bundle d(ShareContent<?, ?> shareContent, boolean z10) {
        Bundle bundle = new Bundle();
        e1 e1Var = e1.f99794a;
        e1.p0(bundle, f.f101871z, shareContent.a());
        e1.o0(bundle, f.f101867x, shareContent.e());
        e1.o0(bundle, f.D, shareContent.f());
        bundle.putBoolean(f.E, z10);
        List<String> listC = shareContent.c();
        if (listC != null && !listC.isEmpty()) {
            bundle.putStringArrayList(f.f101869y, new ArrayList<>(listC));
        }
        return bundle;
    }
}
