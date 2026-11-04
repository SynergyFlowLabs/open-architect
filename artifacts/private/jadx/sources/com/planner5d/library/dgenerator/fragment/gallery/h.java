package com.planner5d.library.dgenerator.fragment.gallery;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.c2;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class h {

    public static class a implements c2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f160161a;

        public long a() {
            return ((Long) this.f160161a.get("autoStyleId")).longValue();
        }

        public int b() {
            return ((Integer) this.f160161a.get("imageIndex")).intValue();
        }

        @NonNull
        public String c() {
            return (String) this.f160161a.get("toolbarTitle");
        }

        @Override // androidx.navigation.c2
        @NonNull
        public Bundle d() {
            Bundle bundle = new Bundle();
            if (this.f160161a.containsKey("toolbarTitle")) {
                bundle.putString("toolbarTitle", (String) this.f160161a.get("toolbarTitle"));
            }
            if (this.f160161a.containsKey("autoStyleId")) {
                bundle.putLong("autoStyleId", ((Long) this.f160161a.get("autoStyleId")).longValue());
            }
            if (this.f160161a.containsKey("imageIndex")) {
                bundle.putInt("imageIndex", ((Integer) this.f160161a.get("imageIndex")).intValue());
            }
            return bundle;
        }

        @Override // androidx.navigation.c2
        public int e() {
            return lb.b.j.Jw;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f160161a.containsKey("toolbarTitle") != aVar.f160161a.containsKey("toolbarTitle")) {
                    return false;
                }
                if (c() == null ? aVar.c() == null : c().equals(aVar.c())) {
                    return this.f160161a.containsKey("autoStyleId") == aVar.f160161a.containsKey("autoStyleId") && a() == aVar.a() && this.f160161a.containsKey("imageIndex") == aVar.f160161a.containsKey("imageIndex") && b() == aVar.b() && e() == aVar.e();
                }
                return false;
            }
            return false;
        }

        @NonNull
        public a f(long j10) {
            this.f160161a.put("autoStyleId", Long.valueOf(j10));
            return this;
        }

        @NonNull
        public a g(int i10) {
            this.f160161a.put("imageIndex", Integer.valueOf(i10));
            return this;
        }

        @NonNull
        public a h(@NonNull String str) {
            if (str == null) {
                throw new IllegalArgumentException("Argument \"toolbarTitle\" is marked as non-null but was passed a null value.");
            }
            this.f160161a.put("toolbarTitle", str);
            return this;
        }

        public int hashCode() {
            return (((((((c() != null ? c().hashCode() : 0) + 31) * 31) + ((int) (a() ^ (a() >>> 32)))) * 31) + b()) * 31) + e();
        }

        public String toString() {
            return "ToGalleryPager(actionId=" + e() + "){toolbarTitle=" + c() + ", autoStyleId=" + a() + ", imageIndex=" + b() + "}";
        }

        private a(@NonNull String str, long j10, int i10) {
            HashMap map = new HashMap();
            this.f160161a = map;
            if (str == null) {
                throw new IllegalArgumentException("Argument \"toolbarTitle\" is marked as non-null but was passed a null value.");
            }
            map.put("toolbarTitle", str);
            map.put("autoStyleId", Long.valueOf(j10));
            map.put("imageIndex", Integer.valueOf(i10));
        }
    }

    private h() {
    }

    @NonNull
    @androidx.annotation.j
    public static a a(@NonNull String str, long j10, int i10) {
        return new a(str, j10, i10);
    }
}
