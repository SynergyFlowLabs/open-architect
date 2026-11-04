package ah;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nApplicationInfoExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApplicationInfoExtensions.kt\nio/customer/messagingpush/extensions/ApplicationInfoExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,29:1\n1#2:30\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f9239a = 0;

    @Nullable
    public static final Integer a(@NotNull Bundle bundle, @NotNull String name) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        int i10 = f9239a;
        Integer numValueOf = Integer.valueOf(bundle.getInt(name, i10));
        if (numValueOf.intValue() == i10) {
            return null;
        }
        return numValueOf;
    }

    @Nullable
    public static final String b(@NotNull Bundle bundle, @NotNull String name) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        String string = bundle.getString(name, null);
        if (string == null || StringsKt.w3(string)) {
            return null;
        }
        return string;
    }

    public static final /* synthetic */ <T extends Parcelable> T c(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (Build.VERSION.SDK_INT > 33) {
            Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
            return (T) bundle.getParcelable(key, Parcelable.class);
        }
        T t10 = (T) bundle.getParcelable(key);
        Intrinsics.reifiedOperationMarker(2, androidx.exifinterface.media.a.f51379e5);
        return t10;
    }
}
