package com.planner5d.library.spaces.view.search;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.c2;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class w {

    public static class a implements c2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f230489a;

        @NonNull
        public String a() {
            return (String) this.f230489a.get("address");
        }

        @NonNull
        public a b(@NonNull String address) {
            if (address == null) {
                throw new IllegalArgumentException("Argument \"address\" is marked as non-null but was passed a null value.");
            }
            this.f230489a.put("address", address);
            return this;
        }

        @Override // androidx.navigation.c2
        @NonNull
        public Bundle d() {
            Bundle bundle = new Bundle();
            if (this.f230489a.containsKey("address")) {
                bundle.putString("address", (String) this.f230489a.get("address"));
            }
            return bundle;
        }

        @Override // androidx.navigation.c2
        public int e() {
            return de.b.i.f272112bb;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
        
            if (r7.a() != null) goto L21;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(java.lang.Object r7) {
            /*
                r6 = this;
                r0 = 1
                r5 = r0
                if (r6 != r7) goto L6
                r5 = 3
                return r0
            L6:
                r1 = 0
                r5 = 5
                if (r7 == 0) goto L5d
                java.lang.Class r2 = r6.getClass()
                r5 = 1
                java.lang.Class r3 = r7.getClass()
                if (r2 == r3) goto L16
                goto L5d
            L16:
                r5 = 5
                com.planner5d.library.spaces.view.search.w$a r7 = (com.planner5d.library.spaces.view.search.w.a) r7
                r5 = 1
                java.util.HashMap r2 = r6.f230489a
                r5 = 2
                java.lang.String r3 = "address"
                boolean r2 = r2.containsKey(r3)
                r5 = 6
                java.util.HashMap r4 = r7.f230489a
                boolean r3 = r4.containsKey(r3)
                if (r2 == r3) goto L2d
                return r1
            L2d:
                r5 = 6
                java.lang.String r2 = r6.a()
                r5 = 4
                if (r2 == 0) goto L46
                java.lang.String r2 = r6.a()
                java.lang.String r3 = r7.a()
                r5 = 5
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L4e
                r5 = 4
                goto L4c
            L46:
                java.lang.String r2 = r7.a()
                if (r2 == 0) goto L4e
            L4c:
                r5 = 0
                return r1
            L4e:
                int r6 = r6.e()
                r5 = 0
                int r7 = r7.e()
                r5 = 0
                if (r6 == r7) goto L5c
                r5 = 5
                return r1
            L5c:
                return r0
            L5d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.spaces.view.search.w.a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            return (((a() != null ? a().hashCode() : 0) + 31) * 31) + e();
        }

        public String toString() {
            return "ToFakeLoading(actionId=" + e() + "){address=" + a() + "}";
        }

        private a(@NonNull String address) {
            HashMap map = new HashMap();
            this.f230489a = map;
            if (address == null) {
                throw new IllegalArgumentException("Argument \"address\" is marked as non-null but was passed a null value.");
            }
            map.put("address", address);
        }
    }

    public static class b implements c2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f230490a;

        @NonNull
        public String a() {
            return (String) this.f230490a.get("address");
        }

        @NonNull
        public b b(@NonNull String address) {
            if (address == null) {
                throw new IllegalArgumentException("Argument \"address\" is marked as non-null but was passed a null value.");
            }
            this.f230490a.put("address", address);
            return this;
        }

        @Override // androidx.navigation.c2
        @NonNull
        public Bundle d() {
            Bundle bundle = new Bundle();
            if (this.f230490a.containsKey("address")) {
                bundle.putString("address", (String) this.f230490a.get("address"));
            }
            return bundle;
        }

        @Override // androidx.navigation.c2
        public int e() {
            return de.b.i.f272154eb;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null && getClass() == object.getClass()) {
                b bVar = (b) object;
                if (this.f230490a.containsKey("address") != bVar.f230490a.containsKey("address")) {
                    return false;
                }
                if (a() == null ? bVar.a() == null : a().equals(bVar.a())) {
                    return e() == bVar.e();
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return (((a() != null ? a().hashCode() : 0) + 31) * 31) + e();
        }

        public String toString() {
            return "ToLoading(actionId=" + e() + "){address=" + a() + "}";
        }

        private b(@NonNull String address) {
            HashMap map = new HashMap();
            this.f230490a = map;
            if (address == null) {
                throw new IllegalArgumentException("Argument \"address\" is marked as non-null but was passed a null value.");
            }
            map.put("address", address);
        }
    }

    private w() {
    }

    @NonNull
    @androidx.annotation.j
    public static a a(@NonNull String address) {
        return new a(address);
    }

    @NonNull
    @androidx.annotation.j
    public static b b(@NonNull String address) {
        return new b(address);
    }
}
