package com.planner5d.library.services.utility;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nBundleBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BundleBuilder.kt\ncom/planner5d/library/services/utility/BundleBuilder\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,101:1\n37#2,2:102\n*S KotlinDebug\n*F\n+ 1 BundleBuilder.kt\ncom/planner5d/library/services/utility/BundleBuilder\n*L\n66#1:102,2\n*E\n"})
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Bundle f225263a;

    public i(@Nullable Bundle bundle) {
        this.f225263a = bundle == null ? new Bundle() : new Bundle(bundle);
    }

    private final void d(Bundle bundle, com.planner5d.library.services.r rVar, Serializable serializable) {
        if (bundle.isEmpty()) {
            return;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (Intrinsics.areEqual(str, rVar.f224891a) && (obj instanceof Serializable)) {
                bundle.putSerializable(rVar.f224891a, serializable);
            }
            if (obj instanceof Bundle) {
                d((Bundle) obj, rVar, serializable);
            }
        }
    }

    @NotNull
    public final Bundle a() {
        return this.f225263a;
    }

    @NotNull
    public final i b(@NotNull com.planner5d.library.services.r key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f225263a.remove(key.f224891a);
        return this;
    }

    @NotNull
    public final i c(@NotNull com.planner5d.library.services.r key, @Nullable Serializable serializable) {
        Intrinsics.checkNotNullParameter(key, "key");
        d(this.f225263a, key, serializable);
        return this;
    }

    @NotNull
    public final i e(@NotNull com.planner5d.library.services.r key, float f10) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f225263a.putFloat(key.f224891a, f10);
        return this;
    }

    @NotNull
    public final i f(@NotNull com.planner5d.library.services.r key, int i10) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f225263a.putInt(key.f224891a, i10);
        return this;
    }

    @NotNull
    public final i g(@NotNull com.planner5d.library.services.r key, long j10) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f225263a.putLong(key.f224891a, j10);
        return this;
    }

    @NotNull
    public final i h(@NotNull com.planner5d.library.services.r key, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f225263a.putBundle(key.f224891a, bundle);
        return this;
    }

    @NotNull
    public final i i(@NotNull com.planner5d.library.services.r key, @Nullable Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f225263a.putParcelable(key.f224891a, parcelable);
        return this;
    }

    @NotNull
    public final i j(@NotNull com.planner5d.library.services.r key, @Nullable String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f225263a.putString(key.f224891a, str);
        return this;
    }

    @NotNull
    public final i k(@NotNull com.planner5d.library.services.r key, @NotNull ArrayList<Parcelable> value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f225263a.putParcelableArrayList(key.f224891a, value);
        return this;
    }

    @NotNull
    public final i l(@NotNull com.planner5d.library.services.r key, @NotNull List<String> value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return r(key, (String[]) value.toArray(new String[0]));
    }

    @NotNull
    public final i m(@NotNull com.planner5d.library.services.r key, boolean z10) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f225263a.putBoolean(key.f224891a, z10);
        return this;
    }

    @NotNull
    public final i n(@NotNull com.planner5d.library.services.r key, @Nullable byte[] bArr) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f225263a.putByteArray(key.f224891a, bArr);
        return this;
    }

    @NotNull
    public final i o(@NotNull com.planner5d.library.services.r key, @NotNull float[] value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f225263a.putFloatArray(key.f224891a, value);
        return this;
    }

    @NotNull
    public final i p(@NotNull com.planner5d.library.services.r key, @NotNull int[] value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f225263a.putIntArray(key.f224891a, value);
        return this;
    }

    @NotNull
    public final i q(@NotNull com.planner5d.library.services.r key, @NotNull long[] value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f225263a.putLongArray(key.f224891a, value);
        return this;
    }

    @NotNull
    public final i r(@NotNull com.planner5d.library.services.r key, @NotNull String[] value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f225263a.putStringArray(key.f224891a, value);
        return this;
    }

    @NotNull
    public final i s(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.f225263a.putAll(bundle);
        return this;
    }

    @NotNull
    public final i t(@NotNull com.planner5d.library.services.r key, @Nullable Serializable serializable) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f225263a.putSerializable(key.f224891a, serializable);
        return this;
    }

    public i() {
        this(null);
    }
}
