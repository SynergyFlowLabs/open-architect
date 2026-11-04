package com.facebook.share.widget;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.appevents.f0;
import com.facebook.g0;
import com.facebook.internal.h0;
import com.facebook.internal.i;
import com.facebook.internal.k;
import com.facebook.internal.l;
import com.facebook.internal.u0;
import com.facebook.p;
import com.facebook.share.internal.ShareFeedContent;
import com.facebook.share.internal.m;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideoContent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class a extends l<ShareContent<?, ?>, v5.b.a> implements v5.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private static final String f102030n = "feed";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final String f102031o = "share";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private static final String f102032p = "share_open_graph";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f102034i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f102035j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final List<l<ShareContent<?, ?>, v5.b.a>.b> f102036k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final b f102028l = new b(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f102029m = a.class.getSimpleName();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f102033q = com.facebook.internal.f.c.Share.l();

    /* JADX INFO: renamed from: com.facebook.share.widget.a$a, reason: collision with other inner class name */
    private final class C0921a extends l<ShareContent<?, ?>, v5.b.a>.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private Object f102037c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f102038d;

        /* JADX INFO: renamed from: com.facebook.share.widget.a$a$a, reason: collision with other inner class name */
        public static final class C0922a implements k.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.facebook.internal.b f102039a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ShareContent<?, ?> f102040b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f102041c;

            C0922a(com.facebook.internal.b bVar, ShareContent<?, ?> shareContent, boolean z10) {
                this.f102039a = bVar;
                this.f102040b = shareContent;
                this.f102041c = z10;
            }

            @Override // com.facebook.internal.k.a
            @Nullable
            public Bundle a() {
                com.facebook.share.internal.c cVar = com.facebook.share.internal.c.f101818a;
                return com.facebook.share.internal.c.c(this.f102039a.d(), this.f102040b, this.f102041c);
            }

            @Override // com.facebook.internal.k.a
            @Nullable
            public Bundle getParameters() {
                com.facebook.share.internal.d dVar = com.facebook.share.internal.d.f101819a;
                return com.facebook.share.internal.d.g(this.f102039a.d(), this.f102040b, this.f102041c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0921a(a this$0) {
            super(this$0);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f102038d = this$0;
            this.f102037c = d.NATIVE;
        }

        @Override // com.facebook.internal.l.b
        @NotNull
        public Object c() {
            return this.f102037c;
        }

        @Override // com.facebook.internal.l.b
        public void d(@NotNull Object obj) {
            Intrinsics.checkNotNullParameter(obj, "<set-?>");
            this.f102037c = obj;
        }

        @Override // com.facebook.internal.l.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean a(@NotNull ShareContent<?, ?> content, boolean z10) {
            Intrinsics.checkNotNullParameter(content, "content");
            return (content instanceof ShareCameraEffectContent) && a.f102028l.e(content.getClass());
        }

        @Override // com.facebook.internal.l.b
        @Nullable
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public com.facebook.internal.b b(@NotNull ShareContent<?, ?> content) {
            Intrinsics.checkNotNullParameter(content, "content");
            com.facebook.share.internal.g gVar = com.facebook.share.internal.g.f101873a;
            com.facebook.share.internal.g.o(content);
            com.facebook.internal.b bVarM = this.f102038d.m();
            boolean zG = this.f102038d.g();
            i iVarH = a.f102028l.h(content.getClass());
            if (iVarH == null) {
                int i10 = 3 | 0;
                return null;
            }
            k kVar = k.f99938a;
            k.n(bVarM, new C0922a(bVarM, content, zG), iVarH);
            return bVarM;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean e(Class<? extends ShareContent<?, ?>> cls) {
            i iVarH = h(cls);
            if (iVarH == null) {
                return false;
            }
            k kVar = k.f99938a;
            return k.b(iVarH);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final boolean f(ShareContent<?, ?> shareContent) {
            return g(shareContent.getClass());
        }

        private final boolean g(Class<? extends ShareContent<?, ?>> cls) {
            if (ShareLinkContent.class.isAssignableFrom(cls)) {
                return true;
            }
            return SharePhotoContent.class.isAssignableFrom(cls) && AccessToken.f98366l.k();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final i h(Class<? extends ShareContent<?, ?>> cls) {
            if (ShareLinkContent.class.isAssignableFrom(cls)) {
                return com.facebook.share.internal.h.SHARE_DIALOG;
            }
            if (SharePhotoContent.class.isAssignableFrom(cls)) {
                return com.facebook.share.internal.h.PHOTOS;
            }
            if (ShareVideoContent.class.isAssignableFrom(cls)) {
                return com.facebook.share.internal.h.VIDEO;
            }
            if (ShareMediaContent.class.isAssignableFrom(cls)) {
                return com.facebook.share.internal.h.MULTIMEDIA;
            }
            if (ShareCameraEffectContent.class.isAssignableFrom(cls)) {
                return com.facebook.share.internal.a.SHARE_CAMERA_EFFECT;
            }
            if (ShareStoryContent.class.isAssignableFrom(cls)) {
                return com.facebook.share.internal.l.SHARE_STORY_ASSET;
            }
            return null;
        }

        private final void l(h0 h0Var, ShareContent<?, ?> shareContent) {
            new a(h0Var, 0, 2, null).c(shareContent);
        }

        @n
        public boolean d(@NotNull Class<? extends ShareContent<?, ?>> contentType) {
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            if (!g(contentType) && !e(contentType)) {
                return false;
            }
            return true;
        }

        @n
        public void i(@NotNull Activity activity, @NotNull ShareContent<?, ?> shareContent) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(shareContent, "shareContent");
            new a(activity).c(shareContent);
        }

        @n
        public void j(@NotNull Fragment fragment, @NotNull ShareContent<?, ?> shareContent) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(shareContent, "shareContent");
            l(new h0(fragment), shareContent);
        }

        @n
        public void k(@NotNull androidx.fragment.app.Fragment fragment, @NotNull ShareContent<?, ?> shareContent) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(shareContent, "shareContent");
            l(new h0(fragment), shareContent);
        }

        private b() {
        }
    }

    private final class c extends l<ShareContent<?, ?>, v5.b.a>.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private Object f102042c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f102043d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a this$0) {
            super(this$0);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f102043d = this$0;
            this.f102042c = d.FEED;
        }

        @Override // com.facebook.internal.l.b
        @NotNull
        public Object c() {
            return this.f102042c;
        }

        @Override // com.facebook.internal.l.b
        public void d(@NotNull Object obj) {
            Intrinsics.checkNotNullParameter(obj, "<set-?>");
            this.f102042c = obj;
        }

        @Override // com.facebook.internal.l.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean a(@NotNull ShareContent<?, ?> content, boolean z10) {
            Intrinsics.checkNotNullParameter(content, "content");
            return (content instanceof ShareLinkContent) || (content instanceof ShareFeedContent);
        }

        @Override // com.facebook.internal.l.b
        @Nullable
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public com.facebook.internal.b b(@NotNull ShareContent<?, ?> content) {
            Bundle bundleF;
            Intrinsics.checkNotNullParameter(content, "content");
            a aVar = this.f102043d;
            aVar.C(aVar.n(), content, d.FEED);
            com.facebook.internal.b bVarM = this.f102043d.m();
            if (content instanceof ShareLinkContent) {
                com.facebook.share.internal.g gVar = com.facebook.share.internal.g.f101873a;
                com.facebook.share.internal.g.q(content);
                m mVar = m.f101896a;
                bundleF = m.g((ShareLinkContent) content);
            } else {
                if (!(content instanceof ShareFeedContent)) {
                    return null;
                }
                m mVar2 = m.f101896a;
                bundleF = m.f((ShareFeedContent) content);
            }
            k kVar = k.f99938a;
            k.p(bVarM, a.f102030n, bundleF);
            return bVarM;
        }
    }

    public enum d {
        AUTOMATIC,
        NATIVE,
        WEB,
        FEED;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            d[] dVarArrValuesCustom = values();
            return (d[]) Arrays.copyOf(dVarArrValuesCustom, dVarArrValuesCustom.length);
        }
    }

    private final class e extends l<ShareContent<?, ?>, v5.b.a>.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private Object f102049c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f102050d;

        /* JADX INFO: renamed from: com.facebook.share.widget.a$e$a, reason: collision with other inner class name */
        public static final class C0923a implements k.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.facebook.internal.b f102051a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ShareContent<?, ?> f102052b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f102053c;

            C0923a(com.facebook.internal.b bVar, ShareContent<?, ?> shareContent, boolean z10) {
                this.f102051a = bVar;
                this.f102052b = shareContent;
                this.f102053c = z10;
            }

            @Override // com.facebook.internal.k.a
            @Nullable
            public Bundle a() {
                com.facebook.share.internal.c cVar = com.facebook.share.internal.c.f101818a;
                return com.facebook.share.internal.c.c(this.f102051a.d(), this.f102052b, this.f102053c);
            }

            @Override // com.facebook.internal.k.a
            @Nullable
            public Bundle getParameters() {
                com.facebook.share.internal.d dVar = com.facebook.share.internal.d.f101819a;
                return com.facebook.share.internal.d.g(this.f102051a.d(), this.f102052b, this.f102053c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(a this$0) {
            super(this$0);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f102050d = this$0;
            this.f102049c = d.NATIVE;
        }

        @Override // com.facebook.internal.l.b
        @NotNull
        public Object c() {
            return this.f102049c;
        }

        @Override // com.facebook.internal.l.b
        public void d(@NotNull Object obj) {
            Intrinsics.checkNotNullParameter(obj, "<set-?>");
            this.f102049c = obj;
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0051  */
        @Override // com.facebook.internal.l.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean a(@NotNull ShareContent<?, ?> content, boolean z10) {
            boolean zB;
            String strI;
            Intrinsics.checkNotNullParameter(content, "content");
            if (!(content instanceof ShareCameraEffectContent) && !(content instanceof ShareStoryContent)) {
                if (z10) {
                    zB = true;
                } else {
                    if (content.g() != null) {
                        k kVar = k.f99938a;
                        zB = k.b(com.facebook.share.internal.h.HASHTAG);
                    } else {
                        zB = true;
                    }
                    if ((content instanceof ShareLinkContent) && (strI = ((ShareLinkContent) content).i()) != null && strI.length() != 0) {
                        if (zB) {
                            k kVar2 = k.f99938a;
                            if (k.b(com.facebook.share.internal.h.LINK_SHARE_QUOTES)) {
                                zB = true;
                            }
                        }
                        zB = false;
                    }
                }
                if (zB && a.f102028l.e(content.getClass())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.facebook.internal.l.b
        @Nullable
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public com.facebook.internal.b b(@NotNull ShareContent<?, ?> content) {
            Intrinsics.checkNotNullParameter(content, "content");
            a aVar = this.f102050d;
            aVar.C(aVar.n(), content, d.NATIVE);
            com.facebook.share.internal.g gVar = com.facebook.share.internal.g.f101873a;
            com.facebook.share.internal.g.o(content);
            com.facebook.internal.b bVarM = this.f102050d.m();
            boolean zG = this.f102050d.g();
            i iVarH = a.f102028l.h(content.getClass());
            if (iVarH == null) {
                return null;
            }
            k kVar = k.f99938a;
            k.n(bVarM, new C0923a(bVarM, content, zG), iVarH);
            return bVarM;
        }
    }

    private final class f extends l<ShareContent<?, ?>, v5.b.a>.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private Object f102054c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f102055d;

        /* JADX INFO: renamed from: com.facebook.share.widget.a$f$a, reason: collision with other inner class name */
        public static final class C0924a implements k.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.facebook.internal.b f102056a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ShareContent<?, ?> f102057b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f102058c;

            C0924a(com.facebook.internal.b bVar, ShareContent<?, ?> shareContent, boolean z10) {
                this.f102056a = bVar;
                this.f102057b = shareContent;
                this.f102058c = z10;
            }

            @Override // com.facebook.internal.k.a
            @Nullable
            public Bundle a() {
                com.facebook.share.internal.c cVar = com.facebook.share.internal.c.f101818a;
                return com.facebook.share.internal.c.c(this.f102056a.d(), this.f102057b, this.f102058c);
            }

            @Override // com.facebook.internal.k.a
            @Nullable
            public Bundle getParameters() {
                com.facebook.share.internal.d dVar = com.facebook.share.internal.d.f101819a;
                return com.facebook.share.internal.d.g(this.f102056a.d(), this.f102057b, this.f102058c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(a this$0) {
            super(this$0);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f102055d = this$0;
            this.f102054c = d.NATIVE;
        }

        @Override // com.facebook.internal.l.b
        @NotNull
        public Object c() {
            return this.f102054c;
        }

        @Override // com.facebook.internal.l.b
        public void d(@NotNull Object obj) {
            Intrinsics.checkNotNullParameter(obj, "<set-?>");
            this.f102054c = obj;
        }

        @Override // com.facebook.internal.l.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean a(@NotNull ShareContent<?, ?> content, boolean z10) {
            Intrinsics.checkNotNullParameter(content, "content");
            return (content instanceof ShareStoryContent) && a.f102028l.e(content.getClass());
        }

        @Override // com.facebook.internal.l.b
        @Nullable
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public com.facebook.internal.b b(@NotNull ShareContent<?, ?> content) {
            Intrinsics.checkNotNullParameter(content, "content");
            com.facebook.share.internal.g gVar = com.facebook.share.internal.g.f101873a;
            com.facebook.share.internal.g.p(content);
            com.facebook.internal.b bVarM = this.f102055d.m();
            boolean zG = this.f102055d.g();
            i iVarH = a.f102028l.h(content.getClass());
            if (iVarH == null) {
                return null;
            }
            k kVar = k.f99938a;
            k.n(bVarM, new C0924a(bVarM, content, zG), iVarH);
            return bVarM;
        }
    }

    private final class g extends l<ShareContent<?, ?>, v5.b.a>.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private Object f102059c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f102060d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(a this$0) {
            super(this$0);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f102060d = this$0;
            this.f102059c = d.WEB;
        }

        private final SharePhotoContent f(SharePhotoContent sharePhotoContent, UUID uuid) {
            SharePhotoContent.a aVarA = new SharePhotoContent.a().a(sharePhotoContent);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = sharePhotoContent.i().size() - 1;
            if (size >= 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    SharePhoto sharePhotoBuild = sharePhotoContent.i().get(i10);
                    Bitmap bitmapE = sharePhotoBuild.e();
                    if (bitmapE != null) {
                        u0 u0Var = u0.f100117a;
                        u0.a aVarD = u0.d(uuid, bitmapE);
                        sharePhotoBuild = new SharePhoto.a().a(sharePhotoBuild).r(Uri.parse(aVarD.b())).p(null).build();
                        arrayList2.add(aVarD);
                    }
                    arrayList.add(sharePhotoBuild);
                    if (i11 > size) {
                        break;
                    }
                    i10 = i11;
                }
            }
            aVarA.z(arrayList);
            u0 u0Var2 = u0.f100117a;
            u0.a(arrayList2);
            return aVarA.build();
        }

        private final String h(ShareContent<?, ?> shareContent) {
            if ((shareContent instanceof ShareLinkContent) || (shareContent instanceof SharePhotoContent)) {
                return "share";
            }
            return null;
        }

        @Override // com.facebook.internal.l.b
        @NotNull
        public Object c() {
            return this.f102059c;
        }

        @Override // com.facebook.internal.l.b
        public void d(@NotNull Object obj) {
            Intrinsics.checkNotNullParameter(obj, "<set-?>");
            this.f102059c = obj;
        }

        @Override // com.facebook.internal.l.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean a(@NotNull ShareContent<?, ?> content, boolean z10) {
            Intrinsics.checkNotNullParameter(content, "content");
            return a.f102028l.f(content);
        }

        @Override // com.facebook.internal.l.b
        @Nullable
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public com.facebook.internal.b b(@NotNull ShareContent<?, ?> content) {
            Bundle bundleD;
            Intrinsics.checkNotNullParameter(content, "content");
            a aVar = this.f102060d;
            aVar.C(aVar.n(), content, d.WEB);
            com.facebook.internal.b bVarM = this.f102060d.m();
            com.facebook.share.internal.g gVar = com.facebook.share.internal.g.f101873a;
            com.facebook.share.internal.g.q(content);
            if (content instanceof ShareLinkContent) {
                m mVar = m.f101896a;
                bundleD = m.c((ShareLinkContent) content);
            } else {
                if (!(content instanceof SharePhotoContent)) {
                    return null;
                }
                SharePhotoContent sharePhotoContentF = f((SharePhotoContent) content, bVarM.d());
                m mVar2 = m.f101896a;
                bundleD = m.d(sharePhotoContentF);
            }
            k kVar = k.f99938a;
            k.p(bVarM, h(content), bundleD);
            return bVarM;
        }
    }

    public /* synthetic */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102061a;

        static {
            int[] iArr = new int[d.valuesCustom().length];
            iArr[d.AUTOMATIC.ordinal()] = 1;
            iArr[d.WEB.ordinal()] = 2;
            iArr[d.NATIVE.ordinal()] = 3;
            f102061a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Activity activity) {
        this(activity, f102033q);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @n
    public static boolean B(@NotNull Class<? extends ShareContent<?, ?>> cls) {
        return f102028l.d(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(Context context, ShareContent<?, ?> shareContent, d dVar) {
        String str;
        if (this.f102035j) {
            dVar = d.AUTOMATIC;
        }
        int i10 = h.f102061a[dVar.ordinal()];
        String str2 = "unknown";
        if (i10 == 1) {
            str = "automatic";
        } else if (i10 != 2) {
            str = i10 != 3 ? "unknown" : "native";
        } else {
            str = com.facebook.internal.a.f99660a0;
        }
        i iVarH = f102028l.h(shareContent.getClass());
        if (iVarH == com.facebook.share.internal.h.SHARE_DIALOG) {
            str2 = "status";
        } else if (iVarH == com.facebook.share.internal.h.PHOTOS) {
            str2 = com.facebook.internal.a.f99676i0;
        } else if (iVarH == com.facebook.share.internal.h.VIDEO) {
            str2 = "video";
        }
        f0.a aVar = f0.f98865b;
        g0 g0Var = g0.f99617a;
        f0 f0VarB = aVar.b(context, g0.o());
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_show", str);
        bundle.putString(com.facebook.internal.a.f99668e0, str2);
        f0VarB.m("fb_share_dialog_show", bundle);
    }

    @n
    public static void D(@NotNull Activity activity, @NotNull ShareContent<?, ?> shareContent) {
        f102028l.i(activity, shareContent);
    }

    @n
    public static void E(@NotNull Fragment fragment, @NotNull ShareContent<?, ?> shareContent) {
        f102028l.j(fragment, shareContent);
    }

    @n
    public static void F(@NotNull androidx.fragment.app.Fragment fragment, @NotNull ShareContent<?, ?> shareContent) {
        f102028l.k(fragment, shareContent);
    }

    public boolean A(@NotNull ShareContent<?, ?> content, @NotNull d mode) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Object obj = mode;
        if (mode == d.AUTOMATIC) {
            obj = l.f99963h;
        }
        return j(content, obj);
    }

    public void G(@NotNull ShareContent<?, ?> content, @NotNull d mode) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(mode, "mode");
        boolean z10 = mode == d.AUTOMATIC;
        this.f102035j = z10;
        Object obj = mode;
        if (z10) {
            obj = l.f99963h;
        }
        w(content, obj);
    }

    @Override // v5.b
    public void a(boolean z10) {
        this.f102034i = z10;
    }

    @Override // v5.b
    public boolean g() {
        return this.f102034i;
    }

    @Override // com.facebook.internal.l
    @NotNull
    protected com.facebook.internal.b m() {
        return new com.facebook.internal.b(q(), null, 2, null);
    }

    @Override // com.facebook.internal.l
    @NotNull
    protected List<l<ShareContent<?, ?>, v5.b.a>.b> p() {
        return this.f102036k;
    }

    @Override // com.facebook.internal.l
    protected void s(@NotNull com.facebook.internal.f callbackManager, @NotNull p<v5.b.a> callback) {
        Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        Intrinsics.checkNotNullParameter(callback, "callback");
        com.facebook.share.internal.k kVar = com.facebook.share.internal.k.f101889a;
        com.facebook.share.internal.k.D(q(), callbackManager, callback);
    }

    public a(int i10) {
        super(i10);
        boolean z10 = false | true;
        this.f102035j = true;
        this.f102036k = CollectionsKt.arrayListOf(new e(this), new c(this), new g(this), new C0921a(this), new f(this));
        com.facebook.share.internal.k kVar = com.facebook.share.internal.k.f101889a;
        com.facebook.share.internal.k.F(i10);
    }

    public /* synthetic */ a(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? f102033q : i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@NotNull androidx.fragment.app.Fragment fragment) {
        this(new h0(fragment), 0, 2, null);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Fragment fragment) {
        this(new h0(fragment), 0, 2, null);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        boolean z10 = false & false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Activity activity, int i10) {
        super(activity, i10);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f102035j = true;
        this.f102036k = CollectionsKt.arrayListOf(new e(this), new c(this), new g(this), new C0921a(this), new f(this));
        com.facebook.share.internal.k kVar = com.facebook.share.internal.k.f101889a;
        com.facebook.share.internal.k.F(i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@NotNull androidx.fragment.app.Fragment fragment, int i10) {
        this(new h0(fragment), i10);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Fragment fragment, int i10) {
        this(new h0(fragment), i10);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
    }

    public /* synthetic */ a(h0 h0Var, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(h0Var, (i11 & 2) != 0 ? f102033q : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull h0 fragmentWrapper, int i10) {
        super(fragmentWrapper, i10);
        Intrinsics.checkNotNullParameter(fragmentWrapper, "fragmentWrapper");
        this.f102035j = true;
        this.f102036k = CollectionsKt.arrayListOf(new e(this), new c(this), new g(this), new C0921a(this), new f(this));
        com.facebook.share.internal.k kVar = com.facebook.share.internal.k.f101889a;
        com.facebook.share.internal.k.F(i10);
    }
}
