package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.internal.e1;
import com.facebook.share.model.AppGroupCreationContent;
import com.facebook.share.model.GameRequestContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final m f101896a = new m();

    private m() {
    }

    @n
    @NotNull
    public static final Bundle a(@NotNull AppGroupCreationContent appGroupCreationContent) {
        String string;
        Intrinsics.checkNotNullParameter(appGroupCreationContent, "appGroupCreationContent");
        Bundle bundle = new Bundle();
        e1 e1Var = e1.f99794a;
        e1.o0(bundle, "name", appGroupCreationContent.c());
        e1.o0(bundle, "description", appGroupCreationContent.b());
        AppGroupCreationContent.a aVarA = appGroupCreationContent.a();
        String lowerCase = null;
        if (aVarA != null && (string = aVarA.toString()) != null) {
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            lowerCase = string.toLowerCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        }
        e1.o0(bundle, f.f101859t, lowerCase);
        return bundle;
    }

    @n
    @NotNull
    public static final Bundle b(@NotNull GameRequestContent gameRequestContent) {
        String string;
        String lowerCase;
        String string2;
        Intrinsics.checkNotNullParameter(gameRequestContent, "gameRequestContent");
        Bundle bundle = new Bundle();
        e1 e1Var = e1.f99794a;
        e1.o0(bundle, "message", gameRequestContent.f());
        e1.m0(bundle, "to", gameRequestContent.h());
        e1.o0(bundle, "title", gameRequestContent.j());
        e1.o0(bundle, "data", gameRequestContent.c());
        GameRequestContent.a aVarA = gameRequestContent.a();
        String lowerCase2 = null;
        if (aVarA == null || (string = aVarA.toString()) == null) {
            lowerCase = null;
        } else {
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            lowerCase = string.toLowerCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        }
        e1.o0(bundle, f.f101823b, lowerCase);
        e1.o0(bundle, "object_id", gameRequestContent.g());
        GameRequestContent.e eVarE = gameRequestContent.e();
        if (eVarE != null && (string2 = eVarE.toString()) != null) {
            Locale ENGLISH2 = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH2, "ENGLISH");
            lowerCase2 = string2.toLowerCase(ENGLISH2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
        }
        e1.o0(bundle, f.f101835h, lowerCase2);
        e1.m0(bundle, f.f101837i, gameRequestContent.i());
        return bundle;
    }

    @n
    @NotNull
    public static final Bundle c(@NotNull ShareLinkContent shareLinkContent) {
        Intrinsics.checkNotNullParameter(shareLinkContent, "shareLinkContent");
        Bundle bundleE = e(shareLinkContent);
        e1 e1Var = e1.f99794a;
        e1.p0(bundleE, "href", shareLinkContent.a());
        e1.o0(bundleE, f.f101843l, shareLinkContent.i());
        return bundleE;
    }

    @n
    @NotNull
    public static final Bundle d(@NotNull SharePhotoContent sharePhotoContent) {
        Intrinsics.checkNotNullParameter(sharePhotoContent, "sharePhotoContent");
        Bundle bundleE = e(sharePhotoContent);
        List<SharePhoto> listI = sharePhotoContent.i();
        if (listI == null) {
            listI = CollectionsKt.emptyList();
        }
        List<SharePhoto> list = listI;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((SharePhoto) it.next()).g()));
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        bundleE.putStringArray("media", (String[]) array);
        return bundleE;
    }

    @n
    @NotNull
    public static final Bundle e(@NotNull ShareContent<?, ?> shareContent) {
        String strA;
        Intrinsics.checkNotNullParameter(shareContent, "shareContent");
        Bundle bundle = new Bundle();
        e1 e1Var = e1.f99794a;
        ShareHashtag shareHashtagG = shareContent.g();
        if (shareHashtagG == null) {
            strA = null;
            int i10 = 2 >> 0;
        } else {
            strA = shareHashtagG.a();
        }
        e1.o0(bundle, f.f101845m, strA);
        return bundle;
    }

    @n
    @NotNull
    public static final Bundle f(@NotNull ShareFeedContent shareFeedContent) {
        Intrinsics.checkNotNullParameter(shareFeedContent, "shareFeedContent");
        Bundle bundle = new Bundle();
        e1 e1Var = e1.f99794a;
        e1.o0(bundle, "to", shareFeedContent.o());
        e1.o0(bundle, "link", shareFeedContent.i());
        e1.o0(bundle, "picture", shareFeedContent.n());
        e1.o0(bundle, "source", shareFeedContent.m());
        e1.o0(bundle, "name", shareFeedContent.l());
        e1.o0(bundle, f.P0, shareFeedContent.j());
        e1.o0(bundle, "description", shareFeedContent.k());
        return bundle;
    }

    @n
    @e.a({"DeprecatedMethod"})
    @NotNull
    public static final Bundle g(@NotNull ShareLinkContent shareLinkContent) {
        Intrinsics.checkNotNullParameter(shareLinkContent, "shareLinkContent");
        Bundle bundle = new Bundle();
        e1 e1Var = e1.f99794a;
        e1.o0(bundle, "link", e1.L(shareLinkContent.a()));
        e1.o0(bundle, f.f101843l, shareLinkContent.i());
        ShareHashtag shareHashtagG = shareLinkContent.g();
        e1.o0(bundle, f.f101845m, shareHashtagG == null ? null : shareHashtagG.a());
        return bundle;
    }
}
