package com.facebook.share.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.g0;
import com.facebook.internal.e1;
import com.facebook.internal.f1;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareMessengerActionButton;
import com.facebook.share.model.ShareMessengerURLActionButton;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import com.facebook.u;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q1;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g f101873a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final c f101874b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final c f101875c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final c f101876d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final c f101877e = new b();

    private static final class a extends c {
        @Override // com.facebook.share.internal.g.c
        public void b(@NotNull ShareLinkContent linkContent) {
            Intrinsics.checkNotNullParameter(linkContent, "linkContent");
            e1 e1Var = e1.f99794a;
            if (!e1.Z(linkContent.i())) {
                throw new u("Cannot share link content with quote using the share api");
            }
        }

        @Override // com.facebook.share.internal.g.c
        public void d(@NotNull ShareMediaContent mediaContent) {
            Intrinsics.checkNotNullParameter(mediaContent, "mediaContent");
            throw new u("Cannot share ShareMediaContent using the share api");
        }

        @Override // com.facebook.share.internal.g.c
        public void e(@NotNull SharePhoto photo) {
            Intrinsics.checkNotNullParameter(photo, "photo");
            g.f101873a.w(photo, this);
        }

        @Override // com.facebook.share.internal.g.c
        public void i(@NotNull ShareVideoContent videoContent) {
            Intrinsics.checkNotNullParameter(videoContent, "videoContent");
            e1 e1Var = e1.f99794a;
            if (!e1.Z(videoContent.e())) {
                throw new u("Cannot share video content with place IDs using the share api");
            }
            if (!e1.a0(videoContent.c())) {
                throw new u("Cannot share video content with people IDs using the share api");
            }
            if (!e1.Z(videoContent.f())) {
                throw new u("Cannot share video content with referrer URL using the share api");
            }
        }
    }

    private static final class b extends c {
        @Override // com.facebook.share.internal.g.c
        public void g(@Nullable ShareStoryContent shareStoryContent) {
            g.f101873a.B(shareStoryContent, this);
        }
    }

    public static class c {
        public void a(@NotNull ShareCameraEffectContent cameraEffectContent) {
            Intrinsics.checkNotNullParameter(cameraEffectContent, "cameraEffectContent");
            g.f101873a.l(cameraEffectContent);
        }

        public void b(@NotNull ShareLinkContent linkContent) {
            Intrinsics.checkNotNullParameter(linkContent, "linkContent");
            g.f101873a.r(linkContent, this);
        }

        public void c(@NotNull ShareMedia<?, ?> medium) {
            Intrinsics.checkNotNullParameter(medium, "medium");
            g gVar = g.f101873a;
            g.t(medium, this);
        }

        public void d(@NotNull ShareMediaContent mediaContent) {
            Intrinsics.checkNotNullParameter(mediaContent, "mediaContent");
            g.f101873a.s(mediaContent, this);
        }

        public void e(@NotNull SharePhoto photo) {
            Intrinsics.checkNotNullParameter(photo, "photo");
            g.f101873a.x(photo, this);
        }

        public void f(@NotNull SharePhotoContent photoContent) {
            Intrinsics.checkNotNullParameter(photoContent, "photoContent");
            g.f101873a.v(photoContent, this);
        }

        public void g(@Nullable ShareStoryContent shareStoryContent) {
            g.f101873a.B(shareStoryContent, this);
        }

        public void h(@Nullable ShareVideo shareVideo) {
            g.f101873a.C(shareVideo, this);
        }

        public void i(@NotNull ShareVideoContent videoContent) {
            Intrinsics.checkNotNullParameter(videoContent, "videoContent");
            g.f101873a.D(videoContent, this);
        }
    }

    private static final class d extends c {
        @Override // com.facebook.share.internal.g.c
        public void d(@NotNull ShareMediaContent mediaContent) {
            Intrinsics.checkNotNullParameter(mediaContent, "mediaContent");
            throw new u("Cannot share ShareMediaContent via web sharing dialogs");
        }

        @Override // com.facebook.share.internal.g.c
        public void e(@NotNull SharePhoto photo) {
            Intrinsics.checkNotNullParameter(photo, "photo");
            g.f101873a.y(photo, this);
        }

        @Override // com.facebook.share.internal.g.c
        public void i(@NotNull ShareVideoContent videoContent) {
            Intrinsics.checkNotNullParameter(videoContent, "videoContent");
            throw new u("Cannot share ShareVideoContent via web sharing dialogs");
        }
    }

    private g() {
    }

    private final void A(ShareMessengerURLActionButton shareMessengerURLActionButton) {
        if (shareMessengerURLActionButton.f() == null) {
            throw new u("Must specify url for ShareMessengerURLActionButton");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(ShareStoryContent shareStoryContent, c cVar) {
        if (shareStoryContent == null || (shareStoryContent.j() == null && shareStoryContent.l() == null)) {
            throw new u("Must pass the Facebook app a background asset, a sticker asset, or both");
        }
        if (shareStoryContent.j() != null) {
            cVar.c(shareStoryContent.j());
        }
        if (shareStoryContent.l() != null) {
            cVar.e(shareStoryContent.l());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(ShareVideo shareVideo, c cVar) {
        if (shareVideo == null) {
            throw new u("Cannot share a null ShareVideo");
        }
        Uri uriE = shareVideo.e();
        if (uriE == null) {
            throw new u("ShareVideo does not have a LocalUrl specified");
        }
        e1 e1Var = e1.f99794a;
        if (!e1.U(uriE) && !e1.X(uriE)) {
            throw new u("ShareVideo must reference a video that is on the device");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(ShareVideoContent shareVideoContent, c cVar) {
        cVar.h(shareVideoContent.l());
        SharePhoto sharePhotoK = shareVideoContent.k();
        if (sharePhotoK != null) {
            cVar.e(sharePhotoK);
        }
    }

    private final void k(ShareContent<?, ?> shareContent, c cVar) throws u {
        if (shareContent == null) {
            throw new u("Must provide non-null content to share");
        }
        if (shareContent instanceof ShareLinkContent) {
            cVar.b((ShareLinkContent) shareContent);
            return;
        }
        if (shareContent instanceof SharePhotoContent) {
            cVar.f((SharePhotoContent) shareContent);
            return;
        }
        if (shareContent instanceof ShareVideoContent) {
            cVar.i((ShareVideoContent) shareContent);
            return;
        }
        if (shareContent instanceof ShareMediaContent) {
            cVar.d((ShareMediaContent) shareContent);
        } else if (shareContent instanceof ShareCameraEffectContent) {
            cVar.a((ShareCameraEffectContent) shareContent);
        } else if (shareContent instanceof ShareStoryContent) {
            cVar.g((ShareStoryContent) shareContent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(ShareCameraEffectContent shareCameraEffectContent) {
        String strJ = shareCameraEffectContent.j();
        e1 e1Var = e1.f99794a;
        if (e1.Z(strJ)) {
            throw new u("Must specify a non-empty effectId");
        }
    }

    @n
    public static final void m(@Nullable ShareContent<?, ?> shareContent) {
        f101873a.k(shareContent, f101876d);
    }

    @n
    public static final void n(@Nullable ShareContent<?, ?> shareContent) {
        f101873a.k(shareContent, f101875c);
    }

    @n
    public static final void o(@Nullable ShareContent<?, ?> shareContent) {
        f101873a.k(shareContent, f101875c);
    }

    @n
    public static final void p(@Nullable ShareContent<?, ?> shareContent) {
        f101873a.k(shareContent, f101877e);
    }

    @n
    public static final void q(@Nullable ShareContent<?, ?> shareContent) {
        f101873a.k(shareContent, f101874b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(ShareLinkContent shareLinkContent, c cVar) {
        Uri uriA = shareLinkContent.a();
        if (uriA != null) {
            e1 e1Var = e1.f99794a;
            if (!e1.b0(uriA)) {
                throw new u("Content Url must be an http:// or https:// url");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(ShareMediaContent shareMediaContent, c cVar) {
        List<ShareMedia<?, ?>> listI = shareMediaContent.i();
        if (listI == null || listI.isEmpty()) {
            throw new u("Must specify at least one medium in ShareMediaContent.");
        }
        if (listI.size() <= 6) {
            Iterator<ShareMedia<?, ?>> it = listI.iterator();
            while (it.hasNext()) {
                cVar.c(it.next());
            }
        } else {
            q1 q1Var = q1.f312784a;
            String str = String.format(Locale.ROOT, "Cannot add more than %d media.", Arrays.copyOf(new Object[]{6}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(locale, format, *args)");
            throw new u(str);
        }
    }

    @n
    public static final void t(@NotNull ShareMedia<?, ?> medium, @NotNull c validator) {
        Intrinsics.checkNotNullParameter(medium, "medium");
        Intrinsics.checkNotNullParameter(validator, "validator");
        if (medium instanceof SharePhoto) {
            validator.e((SharePhoto) medium);
        } else {
            if (medium instanceof ShareVideo) {
                validator.h((ShareVideo) medium);
                return;
            }
            q1 q1Var = q1.f312784a;
            String str = String.format(Locale.ROOT, "Invalid media type: %s", Arrays.copyOf(new Object[]{medium.getClass().getSimpleName()}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(locale, format, *args)");
            throw new u(str);
        }
    }

    private final void u(SharePhoto sharePhoto) {
        if (sharePhoto == null) {
            throw new u("Cannot share a null SharePhoto");
        }
        Bitmap bitmapE = sharePhoto.e();
        Uri uriG = sharePhoto.g();
        if (bitmapE == null && uriG == null) {
            throw new u("SharePhoto does not have a Bitmap or ImageUrl specified");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(SharePhotoContent sharePhotoContent, c cVar) {
        List<SharePhoto> listI = sharePhotoContent.i();
        if (listI == null || listI.isEmpty()) {
            throw new u("Must specify at least one Photo in SharePhotoContent.");
        }
        if (listI.size() <= 6) {
            Iterator<SharePhoto> it = listI.iterator();
            while (it.hasNext()) {
                cVar.e(it.next());
            }
        } else {
            q1 q1Var = q1.f312784a;
            String str = String.format(Locale.ROOT, "Cannot add more than %d photos.", Arrays.copyOf(new Object[]{6}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(locale, format, *args)");
            throw new u(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(SharePhoto sharePhoto, c cVar) {
        u(sharePhoto);
        Bitmap bitmapE = sharePhoto.e();
        Uri uriG = sharePhoto.g();
        if (bitmapE == null) {
            e1 e1Var = e1.f99794a;
            if (e1.b0(uriG)) {
                throw new u("Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(SharePhoto sharePhoto, c cVar) {
        w(sharePhoto, cVar);
        if (sharePhoto.e() == null) {
            e1 e1Var = e1.f99794a;
            if (e1.b0(sharePhoto.g())) {
                return;
            }
        }
        f1 f1Var = f1.f99837a;
        g0 g0Var = g0.f99617a;
        f1.g(g0.n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(SharePhoto sharePhoto, c cVar) {
        u(sharePhoto);
    }

    private final void z(ShareMessengerActionButton shareMessengerActionButton) {
        if (shareMessengerActionButton == null) {
            return;
        }
        e1 e1Var = e1.f99794a;
        if (e1.Z(shareMessengerActionButton.a())) {
            throw new u("Must specify title for ShareMessengerActionButton");
        }
        if (shareMessengerActionButton instanceof ShareMessengerURLActionButton) {
            A((ShareMessengerURLActionButton) shareMessengerActionButton);
        }
    }
}
