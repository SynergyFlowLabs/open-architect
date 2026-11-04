package io.intercom.android.sdk.utilities.coil;

import android.graphics.Bitmap;
import androidx.compose.foundation.shape.n;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.unit.f;
import coil.size.i;
import com.rabbitmq.client.k0;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarShape;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.e;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nAvatarShapeTransformation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AvatarShapeTransformation.kt\nio/intercom/android/sdk/utilities/coil/AvatarShapeTransformation\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,27:1\n33#2:28\n53#3,3:29\n*S KotlinDebug\n*F\n+ 1 AvatarShapeTransformation.kt\nio/intercom/android/sdk/utilities/coil/AvatarShapeTransformation\n*L\n17#1:28\n17#1:29,3\n*E\n"})
public final class AvatarShapeTransformation implements e {
    public static final int $stable = 0;

    @NotNull
    private final AvatarShape avatarShape;

    public AvatarShapeTransformation(@NotNull AvatarShape avatarShape) {
        Intrinsics.checkNotNullParameter(avatarShape, "avatarShape");
        this.avatarShape = avatarShape;
    }

    @Override // q4.e
    @NotNull
    public String getCacheKey() {
        return this.avatarShape.name() + AvatarShapeTransformation.class.getName();
    }

    @Override // q4.e
    @Nullable
    public Object transform(@NotNull Bitmap bitmap, @NotNull i iVar, @NotNull d<? super Bitmap> dVar) {
        n composeShape = AvatarIconKt.getComposeShape(this.avatarShape);
        float width = bitmap.getWidth();
        long jF = n0.n.f((((long) Float.floatToRawIntBits(bitmap.getHeight())) & k0.f265952a) | (Float.floatToRawIntBits(width) << 32));
        androidx.compose.ui.unit.d dVarB = f.b(1.0f, 0.0f, 2, null);
        return new q4.d(composeShape.h().a(jF, dVarB), composeShape.g().a(jF, dVarB), composeShape.f().a(jF, dVarB), composeShape.e().a(jF, dVarB)).transform(bitmap, iVar, dVar);
    }
}
