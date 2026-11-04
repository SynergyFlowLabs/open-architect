package io.intercom.android.sdk.utilities;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import coil.request.f;
import coil.request.i;
import coil.request.r;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.utilities.coil.AvatarShapeTransformation;
import io.intercom.android.sdk.views.AvatarDefaultDrawable;
import io.intercom.android.sdk.views.AvatarInitialsDrawable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class AvatarUtils {
    public static void createAvatar(Avatar avatar, ImageView imageView, int i10, AppConfig appConfig) {
        Context context = imageView.getContext();
        IntercomCoilKt.loadIntercomImage(context, getAvatarImageRequestBuilder(context, avatar, appConfig).l0(imageView).f());
    }

    public static i.a getAvatarImageRequestBuilder(Context context, Avatar avatar, AppConfig appConfig) {
        Drawable placeHolderDrawable = getPlaceHolderDrawable(context, avatar, appConfig);
        return new i.a(context).j(ThemeUtils.selectUrlForTheme(context, avatar.getImageUrl(), avatar.getImageDarkUrl())).M(placeHolderDrawable).s(placeHolderDrawable).i(true).r0(new AvatarShapeTransformation(avatar.getShape()));
    }

    public static AvatarDefaultDrawable getDefaultDrawable(Context context, AppConfig appConfig) {
        return new AvatarDefaultDrawable(context, appConfig.getSecondaryColorDark());
    }

    public static AvatarInitialsDrawable getInitialsDrawable(String str, AppConfig appConfig) {
        return new AvatarInitialsDrawable(str.toUpperCase(), appConfig.getSecondaryColorDark());
    }

    public static Drawable getPlaceHolderDrawable(Context context, Avatar avatar, AppConfig appConfig) {
        return avatar.getInitials().isEmpty() ? getDefaultDrawable(context, appConfig) : getInitialsDrawable(avatar.getInitials(), appConfig);
    }

    public static void loadAvatarIntoView(Avatar avatar, ImageView imageView, AppConfig appConfig) {
        createAvatar(avatar, imageView, 0, appConfig);
    }

    public static void preloadAvatar(Avatar avatar, final Runnable runnable, Activity activity) {
        String strSelectUrlForTheme = ThemeUtils.selectUrlForTheme(activity, avatar.getImageUrl(), avatar.getImageDarkUrl());
        if (strSelectUrlForTheme == null || strSelectUrlForTheme.isEmpty()) {
            runnable.run();
        } else {
            IntercomCoilKt.loadIntercomImage(activity, new i.a(activity).j(strSelectUrlForTheme).D(new i.b() { // from class: io.intercom.android.sdk.utilities.AvatarUtils.1
                @Override // coil.request.i.b
                public void onCancel(@NotNull i iVar) {
                }

                @Override // coil.request.i.b
                public void onError(@NonNull i iVar, @NonNull f fVar) {
                    runnable.run();
                }

                @Override // coil.request.i.b
                public void onStart(@NotNull i iVar) {
                }

                @Override // coil.request.i.b
                public void onSuccess(@NonNull i iVar, @NonNull r rVar) {
                    runnable.run();
                }
            }).f());
        }
    }
}
