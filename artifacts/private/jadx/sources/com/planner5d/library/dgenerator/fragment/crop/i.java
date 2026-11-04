package com.planner5d.library.dgenerator.fragment.crop;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.c2;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class i {

    public static class a implements c2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f160120a;

        public long a() {
            return ((Long) this.f160120a.get("autoStyleId")).longValue();
        }

        @NonNull
        public a b(long j10) {
            this.f160120a.put("autoStyleId", Long.valueOf(j10));
            return this;
        }

        @Override // androidx.navigation.c2
        @NonNull
        public Bundle d() {
            Bundle bundle = new Bundle();
            if (this.f160120a.containsKey("autoStyleId")) {
                bundle.putLong("autoStyleId", ((Long) this.f160120a.get("autoStyleId")).longValue());
            }
            return bundle;
        }

        @Override // androidx.navigation.c2
        public int e() {
            return lb.b.j.fx;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f160120a.containsKey("autoStyleId") == aVar.f160120a.containsKey("autoStyleId") && a() == aVar.a() && e() == aVar.e();
        }

        public int hashCode() {
            return ((((int) (a() ^ (a() >>> 32))) + 31) * 31) + e();
        }

        public String toString() {
            return "ToRoomType(actionId=" + e() + "){autoStyleId=" + a() + "}";
        }

        private a(long j10) {
            HashMap map = new HashMap();
            this.f160120a = map;
            map.put("autoStyleId", Long.valueOf(j10));
        }
    }

    private i() {
    }

    @NonNull
    @androidx.annotation.j
    public static a a(long j10) {
        return new a(j10);
    }
}
