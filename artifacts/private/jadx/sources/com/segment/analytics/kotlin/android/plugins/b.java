package com.segment.analytics.kotlin.android.plugins;

import android.content.Context;
import android.media.MediaDrm;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.UUID;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import org.apache.commons.codec.digest.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    static final class a extends l0 implements Function1<Byte, CharSequence> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f266575a = new a();

        a() {
            super(1);
        }

        @NotNull
        public final CharSequence c(byte b10) {
            String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
            return str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ CharSequence invoke(Byte b10) {
            return c(b10.byteValue());
        }
    }

    public static final /* synthetic */ <T> T a(Context context, String serviceConstant) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(serviceConstant, "serviceConstant");
        T t10 = (T) context.getSystemService(serviceConstant);
        Intrinsics.reifiedOperationMarker(1, androidx.exifinterface.media.a.f51379e5);
        return t10;
    }

    @Nullable
    public static final String b() throws Throwable {
        MediaDrm mediaDrm;
        MediaDrm mediaDrm2 = null;
        try {
            mediaDrm = new MediaDrm(new UUID(-1301668207276963122L, -6645017420763422227L));
            try {
                byte[] propertyByteArray = mediaDrm.getPropertyByteArray("deviceUniqueId");
                Intrinsics.checkNotNullExpressionValue(propertyByteArray, "wvDrm.getPropertyByteArr…ROPERTY_DEVICE_UNIQUE_ID)");
                MessageDigest messageDigest = MessageDigest.getInstance(g.f335251e);
                messageDigest.update(propertyByteArray);
                byte[] bArrDigest = messageDigest.digest();
                Intrinsics.checkNotNullExpressionValue(bArrDigest, "md.digest()");
                String strE = e(bArrDigest);
                mediaDrm.close();
                return strE;
            } catch (Exception unused) {
                if (mediaDrm != null) {
                    mediaDrm.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                mediaDrm2 = mediaDrm;
                if (mediaDrm2 != null) {
                    mediaDrm2.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
            mediaDrm = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static final boolean c(@NotNull Context context, @NotNull String feature) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(feature, "feature");
        return context.getPackageManager().hasSystemFeature(feature);
    }

    public static final boolean d(@NotNull Context context, @NotNull String permission) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permission, "permission");
        return context.checkCallingOrSelfPermission(permission) == 0;
    }

    @NotNull
    public static final String e(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int i10 = 5 & 0;
        return ArraysKt.joinToString$default(bArr, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) a.f266575a, 30, (Object) null);
    }
}
