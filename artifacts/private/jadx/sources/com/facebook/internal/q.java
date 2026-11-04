package com.facebook.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.util.HashSet;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final q f100051a = new q();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f100054d = "8a3c4b262d721acd49a4bf97d5213199c86fa2b9";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f100055e = "cc2751449a350f668590264ed76692694a80308a";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f100052b = "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f100053c = "df6b721c8b4d3b6eb44c861d4415007e5a35fc95";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final String f100056f = "9b8f518b086098de3d77736f9458a3d2f6f95a37";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final String f100057g = "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final String f100058h = "c56fb7d591ba6704df047fd98f535372fea00211";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final HashSet<String> f100059i = SetsKt.hashSetOf(f100054d, f100055e, f100052b, f100053c, f100056f, f100057g, f100058h);

    private q() {
    }

    @oj.n
    public static final boolean a(@NotNull Context context, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        String brand = Build.BRAND;
        int i10 = context.getApplicationInfo().flags;
        Intrinsics.checkNotNullExpressionValue(brand, "brand");
        if (StringsKt.u2(brand, "generic", false, 2, null) && (i10 & 2) != 0) {
            return true;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 64);
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr != null) {
                Intrinsics.checkNotNullExpressionValue(signatureArr, "packageInfo.signatures");
                if (signatureArr.length != 0) {
                    Signature[] signatureArr2 = packageInfo.signatures;
                    Intrinsics.checkNotNullExpressionValue(signatureArr2, "packageInfo.signatures");
                    for (Signature signature : signatureArr2) {
                        HashSet<String> hashSet = f100059i;
                        e1 e1Var = e1.f99794a;
                        byte[] byteArray = signature.toByteArray();
                        Intrinsics.checkNotNullExpressionValue(byteArray, "it.toByteArray()");
                        if (!CollectionsKt.contains(hashSet, e1.F0(byteArray))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }
}
