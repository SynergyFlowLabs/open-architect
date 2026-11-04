package io.intercom.android.sdk.m5.push;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.core.content.FileProvider;
import coil.request.i;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.IntercomFileProviderKt;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.AvatarUtils;
import io.intercom.android.sdk.utilities.BitmapUtilsKt;
import io.intercom.android.sdk.utilities.IntercomCoilKt;
import io.intercom.android.sdk.utilities.NameUtils;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import io.intercom.android.sdk.views.AvatarDefaultDrawable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlin.text.StringsKt;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nIntercomPushBitmapUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntercomPushBitmapUtils.kt\nio/intercom/android/sdk/m5/push/IntercomPushBitmapUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,132:1\n1#2:133\n*E\n"})
public final class IntercomPushBitmapUtilsKt {
    private static final float BIG_PICTURE_HEIGHT_DP = 256.0f;
    private static final float BIG_PICTURE_WIDTH_DP = 512.0f;
    private static final float LARGE_ICON_SIZE_DP = 48.0f;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.push.IntercomPushBitmapUtilsKt$loadBitmaps$1, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.m5.push.IntercomPushBitmapUtilsKt$loadBitmaps$1", f = "IntercomPushBitmapUtils.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160729t0, com.planner5d.library.engine.input.f.b.f160707m}, m = "invokeSuspend", n = {"avatarBitmapJob"}, s = {"L$0"})
    static final class AnonymousClass1 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ AppConfig $appConfig;
        final /* synthetic */ String $authorName;
        final /* synthetic */ i1.h<Bitmap> $avatarBitmap;
        final /* synthetic */ String $avatarImageUrl;
        final /* synthetic */ i1.h<Bitmap> $contentBitmap;
        final /* synthetic */ String $contentImageUrl;
        final /* synthetic */ Context $context;
        final /* synthetic */ Function2<Bitmap, Bitmap, Unit> $onComplete;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function2<? super Bitmap, ? super Bitmap, Unit> function2, i1.h<Bitmap> hVar, i1.h<Bitmap> hVar2, Context context, String str, String str2, String str3, AppConfig appConfig, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$onComplete = function2;
            this.$contentBitmap = hVar;
            this.$avatarBitmap = hVar2;
            this.$context = context;
            this.$contentImageUrl = str;
            this.$avatarImageUrl = str2;
            this.$authorName = str3;
            this.$appConfig = appConfig;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onComplete, this.$contentBitmap, this.$avatarBitmap, this.$context, this.$contentImageUrl, this.$avatarImageUrl, this.$authorName, this.$appConfig, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
        
            if (r1.d1(r14) == r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r14.label
                r13 = 5
                r2 = 0
                r3 = 2
                r4 = 1
                r13 = 1
                if (r1 == 0) goto L2e
                if (r1 == r4) goto L25
                r13 = 0
                if (r1 != r3) goto L1a
                kotlin.ResultKt.m(r15)     // Catch: java.lang.Throwable -> L16
                goto L88
            L16:
                r0 = move-exception
                r15 = r0
                goto L9b
            L1a:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r15 = "eis/i/ /ere tboeunc /sea coloeouvhwl/kt// /tn rfrim"
                java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                r13 = 6
                r14.<init>(r15)
                throw r14
            L25:
                java.lang.Object r1 = r14.L$0
                kotlinx.coroutines.p2 r1 = (kotlinx.coroutines.p2) r1
                r13 = 3
                kotlin.ResultKt.m(r15)     // Catch: java.lang.Throwable -> L16
                goto L7b
            L2e:
                kotlin.ResultKt.m(r15)
                java.lang.Object r15 = r14.L$0
                r5 = r15
                kotlinx.coroutines.s0 r5 = (kotlinx.coroutines.s0) r5
                io.intercom.android.sdk.m5.push.IntercomPushBitmapUtilsKt$loadBitmaps$1$contentBitmapJob$1 r8 = new io.intercom.android.sdk.m5.push.IntercomPushBitmapUtilsKt$loadBitmaps$1$contentBitmapJob$1     // Catch: java.lang.Throwable -> L16
                kotlin.jvm.internal.i1$h<android.graphics.Bitmap> r15 = r14.$contentBitmap     // Catch: java.lang.Throwable -> L16
                android.content.Context r1 = r14.$context     // Catch: java.lang.Throwable -> L16
                java.lang.String r6 = r14.$contentImageUrl     // Catch: java.lang.Throwable -> L16
                r8.<init>(r15, r1, r6, r2)     // Catch: java.lang.Throwable -> L16
                r9 = 3
                r13 = 4
                r10 = 0
                r6 = 0
                r13 = r6
                r7 = 0
                r7 = 0
                r13 = 6
                kotlinx.coroutines.p2 r15 = kotlinx.coroutines.i.e(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L16
                r13 = 3
                io.intercom.android.sdk.m5.push.IntercomPushBitmapUtilsKt$loadBitmaps$1$avatarBitmapJob$1 r6 = new io.intercom.android.sdk.m5.push.IntercomPushBitmapUtilsKt$loadBitmaps$1$avatarBitmapJob$1     // Catch: java.lang.Throwable -> L16
                kotlin.jvm.internal.i1$h<android.graphics.Bitmap> r7 = r14.$avatarBitmap     // Catch: java.lang.Throwable -> L16
                r13 = 4
                android.content.Context r8 = r14.$context     // Catch: java.lang.Throwable -> L16
                java.lang.String r9 = r14.$avatarImageUrl     // Catch: java.lang.Throwable -> L16
                r13 = 6
                java.lang.String r10 = r14.$authorName     // Catch: java.lang.Throwable -> L16
                r13 = 0
                io.intercom.android.sdk.identity.AppConfig r11 = r14.$appConfig     // Catch: java.lang.Throwable -> L16
                r12 = 0
                r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L16
                r9 = 3
                r10 = 1
                r10 = 0
                r8 = r6
                r8 = r6
                r6 = 0
                r13 = 0
                r7 = 0
                kotlinx.coroutines.p2 r1 = kotlinx.coroutines.i.e(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L16
                r13 = 5
                r14.L$0 = r1     // Catch: java.lang.Throwable -> L16
                r14.label = r4     // Catch: java.lang.Throwable -> L16
                java.lang.Object r15 = r15.d1(r14)     // Catch: java.lang.Throwable -> L16
                r13 = 0
                if (r15 != r0) goto L7b
                r13 = 2
                goto L87
            L7b:
                r13 = 2
                r14.L$0 = r2     // Catch: java.lang.Throwable -> L16
                r14.label = r3     // Catch: java.lang.Throwable -> L16
                r13 = 2
                java.lang.Object r15 = r1.d1(r14)     // Catch: java.lang.Throwable -> L16
                if (r15 != r0) goto L88
            L87:
                return r0
            L88:
                kotlin.jvm.functions.Function2<android.graphics.Bitmap, android.graphics.Bitmap, kotlin.Unit> r15 = r14.$onComplete
                kotlin.jvm.internal.i1$h<android.graphics.Bitmap> r0 = r14.$contentBitmap
                r13 = 6
                T r0 = r0.f312751a
                kotlin.jvm.internal.i1$h<android.graphics.Bitmap> r14 = r14.$avatarBitmap
                T r14 = r14.f312751a
                r13 = 5
                r15.invoke(r0, r14)
                r13 = 1
                kotlin.Unit r14 = kotlin.Unit.f312394a
                return r14
            L9b:
                kotlin.jvm.functions.Function2<android.graphics.Bitmap, android.graphics.Bitmap, kotlin.Unit> r0 = r14.$onComplete
                kotlin.jvm.internal.i1$h<android.graphics.Bitmap> r1 = r14.$contentBitmap
                T r1 = r1.f312751a
                r13 = 2
                kotlin.jvm.internal.i1$h<android.graphics.Bitmap> r14 = r14.$avatarBitmap
                r13 = 6
                T r14 = r14.f312751a
                r0.invoke(r1, r14)
                throw r15
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.push.IntercomPushBitmapUtilsKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @Nullable
    public static final Uri getBitmapUri(@NotNull Context context, @NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        try {
            File file = new File(context.getCacheDir(), io.sentry.protocol.d.b.f306176b);
            file.mkdirs();
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            File file2 = new File(file, string + ".png");
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmap.compress(Bitmap.CompressFormat.PNG, 90, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return FileProvider.getUriForFile(context, IntercomFileProviderKt.fileProviderAuthority(context), file2);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap loadAvatarBitmapBlocking(Context context, String str, String str2, AppConfig appConfig) {
        Drawable drawableLoadIntercomImageBlocking;
        if (StringsKt.w3(str) && StringsKt.w3(str2)) {
            return null;
        }
        int iDpToPx = ScreenUtils.dpToPx(LARGE_ICON_SIZE_DP, context);
        if (!StringsKt.w3(str) || StringsKt.w3(str2)) {
            AvatarDefaultDrawable defaultDrawable = AvatarUtils.getDefaultDrawable(context, appConfig);
            drawableLoadIntercomImageBlocking = IntercomCoilKt.loadIntercomImageBlocking(context, new i.a(context).s(defaultDrawable).r0(new q4.b()).j(str).q(l1.c()).e0(iDpToPx, iDpToPx).f());
            if (drawableLoadIntercomImageBlocking == null) {
                drawableLoadIntercomImageBlocking = defaultDrawable;
            }
        } else {
            drawableLoadIntercomImageBlocking = AvatarUtils.getInitialsDrawable(NameUtils.getInitial(str2), appConfig);
        }
        Intrinsics.checkNotNull(drawableLoadIntercomImageBlocking);
        return BitmapUtilsKt.drawableToBitmap(drawableLoadIntercomImageBlocking, iDpToPx, iDpToPx);
    }

    public static final void loadBitmaps(@NotNull Context context, @NotNull String contentImageUrl, @NotNull String avatarImageUrl, @NotNull String authorName, @NotNull Function2<? super Bitmap, ? super Bitmap, Unit> onComplete) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(contentImageUrl, "contentImageUrl");
        Intrinsics.checkNotNullParameter(avatarImageUrl, "avatarImageUrl");
        Intrinsics.checkNotNullParameter(authorName, "authorName");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        AppConfig appConfig = Injector.get().getAppConfigProvider().get();
        k.f(f2.f314023a, l1.c(), null, new AnonymousClass1(onComplete, new i1.h(), new i1.h(), context, contentImageUrl, avatarImageUrl, authorName, appConfig, null), 2, null);
    }

    public static /* synthetic */ void loadBitmaps$default(Context context, String str, String str2, String str3, Function2 function2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "";
        }
        if ((i10 & 4) != 0) {
            str2 = "";
        }
        if ((i10 & 8) != 0) {
            str3 = "";
        }
        loadBitmaps(context, str, str2, str3, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap loadContentBitmapBlocking(Context context, String str) {
        if (StringsKt.w3(str)) {
            return null;
        }
        int iDpToPx = ScreenUtils.dpToPx(BIG_PICTURE_WIDTH_DP, context);
        int iDpToPx2 = ScreenUtils.dpToPx(BIG_PICTURE_HEIGHT_DP, context);
        Drawable drawableB = j.a.b(context, R.drawable.intercom_push_image_load_failes);
        Drawable drawableLoadIntercomImageBlocking = IntercomCoilKt.loadIntercomImageBlocking(context, new i.a(context).q(l1.c()).j(str).s(drawableB).f());
        if (drawableLoadIntercomImageBlocking != null) {
            drawableB = drawableLoadIntercomImageBlocking;
        }
        if (drawableB != null) {
            return BitmapUtilsKt.drawableToBitmap(drawableB, iDpToPx, iDpToPx2);
        }
        return null;
    }
}
