package com.planner5d.library.services.utility;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nBundleParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BundleParser.kt\ncom/planner5d/library/services/utility/BundleParser\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,82:1\n1#2:83\n*E\n"})
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Bundle f225281a;

    public j(@Nullable Bundle EMPTY) {
        if (EMPTY == null) {
            EMPTY = Bundle.EMPTY;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        }
        this.f225281a = EMPTY;
    }

    @kotlin.a1
    public static /* synthetic */ void i() {
    }

    public static /* synthetic */ Parcelable q(j jVar, com.planner5d.library.services.r key, Parcelable parcelable, int i10, Object obj) {
        Parcelable parcelable2;
        Parcelable parcelable3 = null;
        if ((i10 & 2) != 0) {
            parcelable = null;
        }
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                Bundle bundleG = jVar.g();
                String str = key.f224891a;
                Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
                parcelable2 = (Parcelable) bundleG.getParcelable(str, Parcelable.class);
            } else {
                parcelable2 = jVar.g().getParcelable(key.f224891a);
            }
            if (parcelable2 != null) {
                Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
                parcelable3 = parcelable2;
            }
        } catch (ClassCastException unused) {
        }
        if (parcelable3 != null) {
            parcelable = parcelable3;
        }
        return parcelable;
    }

    public static /* synthetic */ String u(j jVar, com.planner5d.library.services.r rVar, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return jVar.t(rVar, str);
    }

    public final boolean a(@NotNull com.planner5d.library.services.r... keys) {
        com.planner5d.library.services.r rVar;
        Intrinsics.checkNotNullParameter(keys, "keys");
        if (!(keys.length == 0)) {
            int length = keys.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    rVar = null;
                    break;
                }
                rVar = keys[i10];
                if (!this.f225281a.containsKey(rVar.f224891a)) {
                    break;
                }
                i10++;
            }
            if (rVar == null) {
                return true;
            }
        }
        return false;
    }

    public final float b(@NotNull com.planner5d.library.services.r key, float f10) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f225281a.getFloat(key.f224891a, f10);
    }

    public final int c(@NotNull com.planner5d.library.services.r key, int i10) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f225281a.getInt(key.f224891a, i10);
    }

    public final long d(@NotNull com.planner5d.library.services.r key, long j10) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f225281a.getLong(key.f224891a, j10);
    }

    @NotNull
    public final Bundle e() {
        return this.f225281a;
    }

    public final boolean f(@NotNull com.planner5d.library.services.r key, boolean z10) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f225281a.getBoolean(key.f224891a, z10);
    }

    @NotNull
    public final Bundle g() {
        return this.f225281a;
    }

    @Nullable
    public final Bundle h(@NotNull com.planner5d.library.services.r key, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundle2 = this.f225281a.getBundle(key.f224891a);
        return bundle2 == null ? bundle : bundle2;
    }

    @Nullable
    public final byte[] j(@NotNull com.planner5d.library.services.r key, @Nullable byte[] bArr) {
        Intrinsics.checkNotNullParameter(key, "key");
        byte[] byteArray = this.f225281a.getByteArray(key.f224891a);
        return byteArray == null ? bArr : byteArray;
    }

    @Nullable
    public final float[] k(@NotNull com.planner5d.library.services.r key, @Nullable float[] fArr) {
        Intrinsics.checkNotNullParameter(key, "key");
        float[] floatArray = this.f225281a.getFloatArray(key.f224891a);
        return floatArray == null ? fArr : floatArray;
    }

    @Nullable
    public final int[] l(@NotNull com.planner5d.library.services.r key, @Nullable int[] iArr) {
        Intrinsics.checkNotNullParameter(key, "key");
        int[] intArray = this.f225281a.getIntArray(key.f224891a);
        return intArray == null ? iArr : intArray;
    }

    @Nullable
    public final long[] m(@NotNull com.planner5d.library.services.r key, @Nullable long[] jArr) {
        Intrinsics.checkNotNullParameter(key, "key");
        long[] longArray = this.f225281a.getLongArray(key.f224891a);
        return longArray == null ? jArr : longArray;
    }

    @Nullable
    public final Long n(@NotNull com.planner5d.library.services.r key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String string = this.f225281a.getString(key.f224891a, null);
        if (string != null) {
            return StringsKt.c1(string);
        }
        return null;
    }

    @NotNull
    public final String o(@NotNull com.planner5d.library.services.r key, @NotNull String defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        String string = this.f225281a.getString(key.f224891a, defaultValue);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public final /* synthetic */ <T extends Parcelable> T p(com.planner5d.library.services.r key, T t10) {
        Parcelable parcelable;
        Intrinsics.checkNotNullParameter(key, "key");
        Parcelable parcelable2 = null;
        int i10 = 3 << 0;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                Bundle bundleG = g();
                String str = key.f224891a;
                Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
                parcelable = (Parcelable) bundleG.getParcelable(str, Parcelable.class);
            } else {
                parcelable = g().getParcelable(key.f224891a);
            }
            if (parcelable != null) {
                Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
                parcelable2 = parcelable;
            }
        } catch (ClassCastException unused) {
        }
        if (parcelable2 != null) {
            t10 = (T) parcelable2;
        }
        return t10;
    }

    @Nullable
    public final ArrayList<Parcelable> r(@NotNull com.planner5d.library.services.r key, @Nullable ArrayList<Parcelable> arrayList) {
        Intrinsics.checkNotNullParameter(key, "key");
        ArrayList<Parcelable> parcelableArrayList = this.f225281a.getParcelableArrayList(key.f224891a);
        return parcelableArrayList == null ? arrayList : parcelableArrayList;
    }

    @Nullable
    public final Serializable s(@NotNull com.planner5d.library.services.r key, @Nullable Serializable serializable) {
        Intrinsics.checkNotNullParameter(key, "key");
        Serializable serializable2 = this.f225281a.getSerializable(key.f224891a);
        return serializable2 == null ? serializable : serializable2;
    }

    @Nullable
    public final String t(@NotNull com.planner5d.library.services.r key, @Nullable String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f225281a.getString(key.f224891a, str);
    }

    @Nullable
    public final String[] v(@NotNull com.planner5d.library.services.r key, @Nullable String[] strArr) {
        Intrinsics.checkNotNullParameter(key, "key");
        String[] stringArray = this.f225281a.getStringArray(key.f224891a);
        return stringArray == null ? strArr : stringArray;
    }

    @NotNull
    public final Bundle w(@NotNull com.planner5d.library.services.r key, @NotNull Bundle defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Bundle bundle = this.f225281a.getBundle(key.f224891a);
        return bundle == null ? defaultValue : bundle;
    }
}
