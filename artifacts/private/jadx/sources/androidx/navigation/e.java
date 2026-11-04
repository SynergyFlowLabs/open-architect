package androidx.navigation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class e {

    public static final class a implements Function0<Bundle> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f70903a;

        public a(Activity activity) {
            this.f70903a = activity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Intent intent = this.f70903a.getIntent();
            if (intent == null) {
                throw new IllegalStateException("Activity " + this.f70903a + " has a null Intent");
            }
            Activity activity = this.f70903a;
            Bundle extras = intent.getExtras();
            if (extras != null) {
                return extras;
            }
            throw new IllegalStateException("Activity " + activity + " has null extras in " + intent);
        }
    }

    @androidx.annotation.l0
    public static final /* synthetic */ <Args extends g0> h0<Args> a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.reifiedOperationMarker(4, "Args");
        return new h0<>(kotlin.jvm.internal.j1.d(g0.class), new a(activity));
    }
}
