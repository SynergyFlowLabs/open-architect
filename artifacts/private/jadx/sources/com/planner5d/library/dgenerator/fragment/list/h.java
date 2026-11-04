package com.planner5d.library.dgenerator.fragment.list;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.c2;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class h {

    public static class a implements c2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f160323a;

        public long a() {
            return ((Long) this.f160323a.get("autoStyleId")).longValue();
        }

        @NonNull
        public String b() {
            return (String) this.f160323a.get("toolbarTitle");
        }

        @NonNull
        public a c(long j10) {
            this.f160323a.put("autoStyleId", Long.valueOf(j10));
            return this;
        }

        @Override // androidx.navigation.c2
        @NonNull
        public Bundle d() {
            Bundle bundle = new Bundle();
            if (this.f160323a.containsKey("toolbarTitle")) {
                bundle.putString("toolbarTitle", (String) this.f160323a.get("toolbarTitle"));
            }
            if (this.f160323a.containsKey("autoStyleId")) {
                bundle.putLong("autoStyleId", ((Long) this.f160323a.get("autoStyleId")).longValue());
            }
            return bundle;
        }

        @Override // androidx.navigation.c2
        public int e() {
            return lb.b.j.Iw;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f160323a.containsKey("toolbarTitle") != aVar.f160323a.containsKey("toolbarTitle")) {
                    return false;
                }
                if (b() == null ? aVar.b() == null : b().equals(aVar.b())) {
                    return this.f160323a.containsKey("autoStyleId") == aVar.f160323a.containsKey("autoStyleId") && a() == aVar.a() && e() == aVar.e();
                }
                return false;
            }
            return false;
        }

        @NonNull
        public a f(@NonNull String str) {
            if (str == null) {
                throw new IllegalArgumentException("Argument \"toolbarTitle\" is marked as non-null but was passed a null value.");
            }
            this.f160323a.put("toolbarTitle", str);
            return this;
        }

        public int hashCode() {
            return (((((b() != null ? b().hashCode() : 0) + 31) * 31) + ((int) (a() ^ (a() >>> 32)))) * 31) + e();
        }

        public String toString() {
            return "ToGallery(actionId=" + e() + "){toolbarTitle=" + b() + ", autoStyleId=" + a() + "}";
        }

        private a(@NonNull String str, long j10) {
            HashMap map = new HashMap();
            this.f160323a = map;
            if (str == null) {
                throw new IllegalArgumentException("Argument \"toolbarTitle\" is marked as non-null but was passed a null value.");
            }
            map.put("toolbarTitle", str);
            map.put("autoStyleId", Long.valueOf(j10));
        }
    }

    public static class b implements c2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f160324a;

        public long a() {
            return ((Long) this.f160324a.get("autoStyleId")).longValue();
        }

        @NonNull
        public b b(long j10) {
            this.f160324a.put("autoStyleId", Long.valueOf(j10));
            return this;
        }

        @Override // androidx.navigation.c2
        @NonNull
        public Bundle d() {
            Bundle bundle = new Bundle();
            if (this.f160324a.containsKey("autoStyleId")) {
                bundle.putLong("autoStyleId", ((Long) this.f160324a.get("autoStyleId")).longValue());
            }
            return bundle;
        }

        @Override // androidx.navigation.c2
        public int e() {
            return lb.b.j.Lw;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f160324a.containsKey("autoStyleId") == bVar.f160324a.containsKey("autoStyleId") && a() == bVar.a() && e() == bVar.e();
        }

        public int hashCode() {
            return ((((int) (a() ^ (a() >>> 32))) + 31) * 31) + e();
        }

        public String toString() {
            return "ToImageCrop(actionId=" + e() + "){autoStyleId=" + a() + "}";
        }

        private b(long j10) {
            HashMap map = new HashMap();
            this.f160324a = map;
            map.put("autoStyleId", Long.valueOf(j10));
        }
    }

    private h() {
    }

    @NonNull
    @androidx.annotation.j
    public static a a(@NonNull String str, long j10) {
        return new a(str, j10);
    }

    @NonNull
    @androidx.annotation.j
    public static b b(long j10) {
        return new b(j10);
    }
}
