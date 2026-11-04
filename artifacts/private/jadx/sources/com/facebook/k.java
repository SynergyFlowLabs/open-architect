package com.facebook;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public interface k {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f100305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f100306b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final Intent f100307c;

        public a(int i10, int i11, @Nullable Intent intent) {
            this.f100305a = i10;
            this.f100306b = i11;
            this.f100307c = intent;
        }

        public static /* synthetic */ a e(a aVar, int i10, int i11, Intent intent, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = aVar.f100305a;
            }
            if ((i12 & 2) != 0) {
                i11 = aVar.f100306b;
            }
            if ((i12 & 4) != 0) {
                intent = aVar.f100307c;
            }
            return aVar.d(i10, i11, intent);
        }

        public final int a() {
            return this.f100305a;
        }

        public final int b() {
            return this.f100306b;
        }

        @Nullable
        public final Intent c() {
            return this.f100307c;
        }

        @NotNull
        public final a d(int i10, int i11, @Nullable Intent intent) {
            return new a(i10, i11, intent);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f100305a == aVar.f100305a && this.f100306b == aVar.f100306b && Intrinsics.areEqual(this.f100307c, aVar.f100307c);
        }

        @Nullable
        public final Intent f() {
            return this.f100307c;
        }

        public final int g() {
            return this.f100305a;
        }

        public final int h() {
            return this.f100306b;
        }

        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.f100305a) * 31) + Integer.hashCode(this.f100306b)) * 31;
            Intent intent = this.f100307c;
            return iHashCode + (intent == null ? 0 : intent.hashCode());
        }

        @NotNull
        public String toString() {
            return "ActivityResultParameters(requestCode=" + this.f100305a + ", resultCode=" + this.f100306b + ", data=" + this.f100307c + ')';
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f100308a = new b();

        private b() {
        }

        @oj.n
        @NotNull
        public static final k a() {
            return new com.facebook.internal.f();
        }
    }

    boolean e(int i10, int i11, @Nullable Intent intent);
}
