package androidx.navigation.fragment;

import android.os.Bundle;
import androidx.annotation.l0;
import androidx.fragment.app.Fragment;
import androidx.navigation.g0;
import androidx.navigation.h0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    public static final class a implements Function0<Bundle> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f70932a;

        public a(Fragment fragment) {
            this.f70932a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f70932a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f70932a + " has null arguments");
        }
    }

    @l0
    public static final /* synthetic */ <Args extends g0> h0<Args> a(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.reifiedOperationMarker(4, "Args");
        return new h0<>(j1.d(g0.class), new a(fragment));
    }
}
