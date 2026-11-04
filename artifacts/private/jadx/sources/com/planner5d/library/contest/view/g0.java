package com.planner5d.library.contest.view;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.c2;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class g0 {

    public static class a implements c2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f153704a;

        public long a() {
            return ((Long) this.f153704a.get("contestUid")).longValue();
        }

        @NonNull
        public a b(long j10) {
            this.f153704a.put("contestUid", Long.valueOf(j10));
            return this;
        }

        @Override // androidx.navigation.c2
        @NonNull
        public Bundle d() {
            Bundle bundle = new Bundle();
            if (this.f153704a.containsKey("contestUid")) {
                bundle.putLong("contestUid", ((Long) this.f153704a.get("contestUid")).longValue());
            }
            return bundle;
        }

        @Override // androidx.navigation.c2
        public int e() {
            return com.planner5d.library.contest.e.i.f151146zc;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f153704a.containsKey("contestUid") == aVar.f153704a.containsKey("contestUid") && a() == aVar.a() && e() == aVar.e();
        }

        public int hashCode() {
            return ((((int) (a() ^ (a() >>> 32))) + 31) * 31) + e();
        }

        public String toString() {
            return "ToSingleContestArchiveFragment(actionId=" + e() + "){contestUid=" + a() + "}";
        }

        private a(long j10) {
            HashMap map = new HashMap();
            this.f153704a = map;
            map.put("contestUid", Long.valueOf(j10));
        }
    }

    private g0() {
    }

    @NonNull
    @androidx.annotation.j
    public static a a(long j10) {
        return new a(j10);
    }

    @NonNull
    @androidx.annotation.j
    public static c2 b() {
        return new androidx.navigation.a(com.planner5d.library.contest.e.i.Ac);
    }
}
