package io.customer.sdk.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.c0;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final WeakReference<Activity> f288624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final c0.a f288625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Bundle f288626c;

    public b(@NotNull WeakReference<Activity> activity, @NotNull c0.a event, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(event, "event");
        this.f288624a = activity;
        this.f288625b = event;
        this.f288626c = bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b e(b bVar, WeakReference weakReference, c0.a aVar, Bundle bundle, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            weakReference = bVar.f288624a;
        }
        if ((i10 & 2) != 0) {
            aVar = bVar.f288625b;
        }
        if ((i10 & 4) != 0) {
            bundle = bVar.f288626c;
        }
        return bVar.d(weakReference, aVar, bundle);
    }

    @NotNull
    public final WeakReference<Activity> a() {
        return this.f288624a;
    }

    @NotNull
    public final c0.a b() {
        return this.f288625b;
    }

    @Nullable
    public final Bundle c() {
        return this.f288626c;
    }

    @NotNull
    public final b d(@NotNull WeakReference<Activity> activity, @NotNull c0.a event, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(event, "event");
        return new b(activity, event, bundle);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Intrinsics.areEqual(this.f288624a, bVar.f288624a) && this.f288625b == bVar.f288625b && Intrinsics.areEqual(this.f288626c, bVar.f288626c)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final WeakReference<Activity> f() {
        return this.f288624a;
    }

    @Nullable
    public final Bundle g() {
        return this.f288626c;
    }

    @NotNull
    public final c0.a h() {
        return this.f288625b;
    }

    public int hashCode() {
        int iHashCode = ((this.f288624a.hashCode() * 31) + this.f288625b.hashCode()) * 31;
        Bundle bundle = this.f288626c;
        return iHashCode + (bundle == null ? 0 : bundle.hashCode());
    }

    @NotNull
    public String toString() {
        return "LifecycleStateChange(activity=" + this.f288624a + ", event=" + this.f288625b + ", bundle=" + this.f288626c + ")";
    }
}
