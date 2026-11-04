package com.planner5d.library.activity.fragment.spaces.documents;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.c2;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class j {

    public static class a implements c2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f136154a;

        public int a() {
            return ((Integer) this.f136154a.get("title")).intValue();
        }

        @NonNull
        public a b(int i10) {
            this.f136154a.put("title", Integer.valueOf(i10));
            return this;
        }

        @Override // androidx.navigation.c2
        @NonNull
        public Bundle d() {
            Bundle bundle = new Bundle();
            if (this.f136154a.containsKey("title")) {
                bundle.putInt("title", ((Integer) this.f136154a.get("title")).intValue());
            }
            return bundle;
        }

        @Override // androidx.navigation.c2
        public int e() {
            return com.planner5d.library.f.j.Fv;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f136154a.containsKey("title") == aVar.f136154a.containsKey("title") && a() == aVar.a() && e() == aVar.e();
        }

        public int hashCode() {
            return ((a() + 31) * 31) + e();
        }

        public String toString() {
            return "ToFolderEdit(actionId=" + e() + "){title=" + a() + "}";
        }

        private a(int i10) {
            HashMap map = new HashMap();
            this.f136154a = map;
            map.put("title", Integer.valueOf(i10));
        }
    }

    private j() {
    }

    @NonNull
    @androidx.annotation.j
    public static a a(int i10) {
        return new a(i10);
    }
}
