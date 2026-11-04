package androidx.browser.trusted;

import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f11980a = "androidx.browser.trusted.displaymode.KEY_ID";

    public static class a implements n {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f11981b = 0;

        @Override // androidx.browser.trusted.n
        @NonNull
        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putInt(n.f11980a, 0);
            return bundle;
        }
    }

    public static class b implements n {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f11982d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f11983e = "androidx.browser.trusted.displaymode.KEY_STICKY";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f11984f = "androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f11985b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f11986c;

        public b(boolean z10, int i10) {
            this.f11985b = z10;
            this.f11986c = i10;
        }

        @NonNull
        static n c(@NonNull Bundle bundle) {
            return new b(bundle.getBoolean(f11983e), bundle.getInt(f11984f));
        }

        public boolean a() {
            return this.f11985b;
        }

        @Override // androidx.browser.trusted.n
        @NonNull
        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putInt(n.f11980a, 1);
            bundle.putBoolean(f11983e, this.f11985b);
            bundle.putInt(f11984f, this.f11986c);
            return bundle;
        }

        public int d() {
            return this.f11986c;
        }
    }

    @NonNull
    static n c(@NonNull Bundle bundle) {
        return bundle.getInt(f11980a) != 1 ? new a() : b.c(bundle);
    }

    @NonNull
    Bundle b();
}
