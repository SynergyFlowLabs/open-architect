package com.planner5d.library.activity.fragment.dialog.authentication.onelink;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.c2;
import com.planner5d.library.modules.user.auth.SocialAuthType;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class j {

    public static class a implements c2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f131870a;

        @NonNull
        public String a() {
            return (String) this.f131870a.get("email");
        }

        @NonNull
        public Boolean b() {
            return (Boolean) this.f131870a.get("fromProfile");
        }

        public int c() {
            return ((Integer) this.f131870a.get("id")).intValue();
        }

        @Override // androidx.navigation.c2
        @NonNull
        public Bundle d() {
            Bundle bundle = new Bundle();
            if (this.f131870a.containsKey("id")) {
                bundle.putInt("id", ((Integer) this.f131870a.get("id")).intValue());
            }
            if (this.f131870a.containsKey("email")) {
                bundle.putString("email", (String) this.f131870a.get("email"));
            }
            if (this.f131870a.containsKey("fromProfile")) {
                Boolean bool = (Boolean) this.f131870a.get("fromProfile");
                if (Parcelable.class.isAssignableFrom(Boolean.class) || bool == null) {
                    bundle.putParcelable("fromProfile", (Parcelable) Parcelable.class.cast(bool));
                } else {
                    if (!Serializable.class.isAssignableFrom(Boolean.class)) {
                        throw new UnsupportedOperationException(Boolean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                    }
                    bundle.putSerializable("fromProfile", (Serializable) Serializable.class.cast(bool));
                }
            }
            if (this.f131870a.containsKey("signup")) {
                Boolean bool2 = (Boolean) this.f131870a.get("signup");
                if (!Parcelable.class.isAssignableFrom(Boolean.class) && bool2 != null) {
                    if (Serializable.class.isAssignableFrom(Boolean.class)) {
                        bundle.putSerializable("signup", (Serializable) Serializable.class.cast(bool2));
                        return bundle;
                    }
                    throw new UnsupportedOperationException(Boolean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                bundle.putParcelable("signup", (Parcelable) Parcelable.class.cast(bool2));
            }
            return bundle;
        }

        @Override // androidx.navigation.c2
        public int e() {
            return com.planner5d.library.f.j.Kv;
        }

        /* JADX WARN: Code restructure failed: missing block: B:49:0x00d2, code lost:
        
            if (r7.f() != null) goto L50;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(java.lang.Object r7) {
            /*
                Method dump skipped, instruction units count: 231
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.dialog.authentication.onelink.j.a.equals(java.lang.Object):boolean");
        }

        @NonNull
        public Boolean f() {
            return (Boolean) this.f131870a.get("signup");
        }

        @NonNull
        public a g(@NonNull String str) {
            if (str == null) {
                throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
            }
            this.f131870a.put("email", str);
            return this;
        }

        @NonNull
        public a h(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalArgumentException("Argument \"fromProfile\" is marked as non-null but was passed a null value.");
            }
            this.f131870a.put("fromProfile", bool);
            return this;
        }

        public int hashCode() {
            return ((((((((c() + 31) * 31) + (a() != null ? a().hashCode() : 0)) * 31) + (b() != null ? b().hashCode() : 0)) * 31) + (f() != null ? f().hashCode() : 0)) * 31) + e();
        }

        @NonNull
        public a i(int i10) {
            this.f131870a.put("id", Integer.valueOf(i10));
            return this;
        }

        @NonNull
        public a j(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalArgumentException("Argument \"signup\" is marked as non-null but was passed a null value.");
            }
            this.f131870a.put("signup", bool);
            return this;
        }

        public String toString() {
            return "ToEnterCode(actionId=" + e() + "){id=" + c() + ", email=" + a() + ", fromProfile=" + b() + ", signup=" + f() + "}";
        }

        private a(int i10, @NonNull String str, @NonNull Boolean bool, @NonNull Boolean bool2) {
            HashMap map = new HashMap();
            this.f131870a = map;
            map.put("id", Integer.valueOf(i10));
            if (str == null) {
                throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
            }
            map.put("email", str);
            if (bool == null) {
                throw new IllegalArgumentException("Argument \"fromProfile\" is marked as non-null but was passed a null value.");
            }
            map.put("fromProfile", bool);
            if (bool2 == null) {
                throw new IllegalArgumentException("Argument \"signup\" is marked as non-null but was passed a null value.");
            }
            map.put("signup", bool2);
        }
    }

    public static class b implements c2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f131871a;

        @NonNull
        public Boolean a() {
            return (Boolean) this.f131871a.get("fromProfile");
        }

        @NonNull
        public Boolean b() {
            return (Boolean) this.f131871a.get("signUp");
        }

        @NonNull
        public SocialAuthType c() {
            return (SocialAuthType) this.f131871a.get("type");
        }

        @Override // androidx.navigation.c2
        @NonNull
        public Bundle d() {
            Bundle bundle = new Bundle();
            if (this.f131871a.containsKey("type")) {
                SocialAuthType socialAuthType = (SocialAuthType) this.f131871a.get("type");
                if (Parcelable.class.isAssignableFrom(SocialAuthType.class) || socialAuthType == null) {
                    bundle.putParcelable("type", (Parcelable) Parcelable.class.cast(socialAuthType));
                } else {
                    if (!Serializable.class.isAssignableFrom(SocialAuthType.class)) {
                        throw new UnsupportedOperationException(SocialAuthType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                    }
                    bundle.putSerializable("type", (Serializable) Serializable.class.cast(socialAuthType));
                }
            }
            if (this.f131871a.containsKey("fromProfile")) {
                Boolean bool = (Boolean) this.f131871a.get("fromProfile");
                if (Parcelable.class.isAssignableFrom(Boolean.class) || bool == null) {
                    bundle.putParcelable("fromProfile", (Parcelable) Parcelable.class.cast(bool));
                } else {
                    if (!Serializable.class.isAssignableFrom(Boolean.class)) {
                        throw new UnsupportedOperationException(Boolean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                    }
                    bundle.putSerializable("fromProfile", (Serializable) Serializable.class.cast(bool));
                }
            }
            if (this.f131871a.containsKey("signUp")) {
                Boolean bool2 = (Boolean) this.f131871a.get("signUp");
                if (!Parcelable.class.isAssignableFrom(Boolean.class) && bool2 != null) {
                    if (Serializable.class.isAssignableFrom(Boolean.class)) {
                        bundle.putSerializable("signUp", (Serializable) Serializable.class.cast(bool2));
                        return bundle;
                    }
                    throw new UnsupportedOperationException(Boolean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                bundle.putParcelable("signUp", (Parcelable) Parcelable.class.cast(bool2));
            }
            return bundle;
        }

        @Override // androidx.navigation.c2
        public int e() {
            return com.planner5d.library.f.j.Mv;
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
        
            if (r7.a() != null) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00b2, code lost:
        
            if (r7.b() != null) goto L43;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(java.lang.Object r7) {
            /*
                r6 = this;
                r0 = 1
                if (r6 != r7) goto L5
                r5 = 4
                return r0
            L5:
                r5 = 6
                r1 = 0
                if (r7 == 0) goto Lc3
                r5 = 4
                java.lang.Class r2 = r6.getClass()
                r5 = 1
                java.lang.Class r3 = r7.getClass()
                r5 = 6
                if (r2 == r3) goto L19
                r5 = 7
                goto Lc3
            L19:
                com.planner5d.library.activity.fragment.dialog.authentication.onelink.j$b r7 = (com.planner5d.library.activity.fragment.dialog.authentication.onelink.j.b) r7
                java.util.HashMap r2 = r6.f131871a
                java.lang.String r3 = "type"
                boolean r2 = r2.containsKey(r3)
                java.util.HashMap r4 = r7.f131871a
                boolean r3 = r4.containsKey(r3)
                if (r2 == r3) goto L2c
                return r1
            L2c:
                com.planner5d.library.modules.user.auth.SocialAuthType r2 = r6.c()
                r5 = 5
                if (r2 == 0) goto L43
                com.planner5d.library.modules.user.auth.SocialAuthType r2 = r6.c()
                com.planner5d.library.modules.user.auth.SocialAuthType r3 = r7.c()
                r5 = 5
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L4b
                goto L4a
            L43:
                com.planner5d.library.modules.user.auth.SocialAuthType r2 = r7.c()
                r5 = 0
                if (r2 == 0) goto L4b
            L4a:
                return r1
            L4b:
                java.util.HashMap r2 = r6.f131871a
                r5 = 5
                java.lang.String r3 = "fromProfile"
                boolean r2 = r2.containsKey(r3)
                java.util.HashMap r4 = r7.f131871a
                r5 = 3
                boolean r3 = r4.containsKey(r3)
                r5 = 7
                if (r2 == r3) goto L5f
                return r1
            L5f:
                java.lang.Boolean r2 = r6.a()
                r5 = 4
                if (r2 == 0) goto L77
                java.lang.Boolean r2 = r6.a()
                java.lang.Boolean r3 = r7.a()
                r5 = 4
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L7e
                r5 = 6
                goto L7d
            L77:
                java.lang.Boolean r2 = r7.a()
                if (r2 == 0) goto L7e
            L7d:
                return r1
            L7e:
                r5 = 2
                java.util.HashMap r2 = r6.f131871a
                r5 = 0
                java.lang.String r3 = "ungpsU"
                java.lang.String r3 = "signUp"
                r5 = 5
                boolean r2 = r2.containsKey(r3)
                java.util.HashMap r4 = r7.f131871a
                boolean r3 = r4.containsKey(r3)
                if (r2 == r3) goto L94
                return r1
            L94:
                java.lang.Boolean r2 = r6.b()
                r5 = 1
                if (r2 == 0) goto Lad
                java.lang.Boolean r2 = r6.b()
                r5 = 3
                java.lang.Boolean r3 = r7.b()
                r5 = 3
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto Lb5
                r5 = 6
                goto Lb4
            Lad:
                java.lang.Boolean r2 = r7.b()
                r5 = 0
                if (r2 == 0) goto Lb5
            Lb4:
                return r1
            Lb5:
                int r6 = r6.e()
                r5 = 6
                int r7 = r7.e()
                if (r6 == r7) goto Lc1
                return r1
            Lc1:
                r5 = 7
                return r0
            Lc3:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.dialog.authentication.onelink.j.b.equals(java.lang.Object):boolean");
        }

        @NonNull
        public b f(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalArgumentException("Argument \"fromProfile\" is marked as non-null but was passed a null value.");
            }
            this.f131871a.put("fromProfile", bool);
            return this;
        }

        @NonNull
        public b g(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalArgumentException("Argument \"signUp\" is marked as non-null but was passed a null value.");
            }
            this.f131871a.put("signUp", bool);
            return this;
        }

        @NonNull
        public b h(@NonNull SocialAuthType socialAuthType) {
            if (socialAuthType == null) {
                throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
            }
            this.f131871a.put("type", socialAuthType);
            return this;
        }

        public int hashCode() {
            return (((((((c() != null ? c().hashCode() : 0) + 31) * 31) + (a() != null ? a().hashCode() : 0)) * 31) + (b() != null ? b().hashCode() : 0)) * 31) + e();
        }

        public String toString() {
            return "ToExternalServices(actionId=" + e() + "){type=" + c() + ", fromProfile=" + a() + ", signUp=" + b() + "}";
        }

        private b(@NonNull SocialAuthType socialAuthType, @NonNull Boolean bool, @NonNull Boolean bool2) {
            HashMap map = new HashMap();
            this.f131871a = map;
            if (socialAuthType == null) {
                throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
            }
            map.put("type", socialAuthType);
            if (bool == null) {
                throw new IllegalArgumentException("Argument \"fromProfile\" is marked as non-null but was passed a null value.");
            }
            map.put("fromProfile", bool);
            if (bool2 == null) {
                throw new IllegalArgumentException("Argument \"signUp\" is marked as non-null but was passed a null value.");
            }
            map.put("signUp", bool2);
        }
    }

    public static class c implements c2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f131872a;

        @NonNull
        public String a() {
            return (String) this.f131872a.get("user");
        }

        @NonNull
        public c b(@NonNull String str) {
            if (str == null) {
                throw new IllegalArgumentException("Argument \"user\" is marked as non-null but was passed a null value.");
            }
            this.f131872a.put("user", str);
            return this;
        }

        @Override // androidx.navigation.c2
        @NonNull
        public Bundle d() {
            Bundle bundle = new Bundle();
            if (this.f131872a.containsKey("user")) {
                bundle.putString("user", (String) this.f131872a.get("user"));
            }
            return bundle;
        }

        @Override // androidx.navigation.c2
        public int e() {
            return com.planner5d.library.f.j.Wv;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
        
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
                if (r6 != r7) goto L4
                return r0
            L4:
                r1 = 0
                if (r7 == 0) goto L57
                r5 = 2
                java.lang.Class r2 = r6.getClass()
                r5 = 6
                java.lang.Class r3 = r7.getClass()
                r5 = 4
                if (r2 == r3) goto L15
                goto L57
            L15:
                com.planner5d.library.activity.fragment.dialog.authentication.onelink.j$c r7 = (com.planner5d.library.activity.fragment.dialog.authentication.onelink.j.c) r7
                java.util.HashMap r2 = r6.f131872a
                java.lang.String r3 = "user"
                r5 = 5
                boolean r2 = r2.containsKey(r3)
                java.util.HashMap r4 = r7.f131872a
                boolean r3 = r4.containsKey(r3)
                if (r2 == r3) goto L2a
                r5 = 6
                return r1
            L2a:
                java.lang.String r2 = r6.a()
                if (r2 == 0) goto L40
                java.lang.String r2 = r6.a()
                java.lang.String r3 = r7.a()
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L48
                r5 = 2
                goto L46
            L40:
                java.lang.String r2 = r7.a()
                if (r2 == 0) goto L48
            L46:
                r5 = 5
                return r1
            L48:
                int r6 = r6.e()
                r5 = 6
                int r7 = r7.e()
                r5 = 5
                if (r6 == r7) goto L56
                r5 = 0
                return r1
            L56:
                return r0
            L57:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.dialog.authentication.onelink.j.c.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            return (((a() != null ? a().hashCode() : 0) + 31) * 31) + e();
        }

        public String toString() {
            return "ToPrivacyAgreement(actionId=" + e() + "){user=" + a() + "}";
        }

        private c(@NonNull String str) {
            HashMap map = new HashMap();
            this.f131872a = map;
            if (str == null) {
                throw new IllegalArgumentException("Argument \"user\" is marked as non-null but was passed a null value.");
            }
            map.put("user", str);
        }
    }

    private j() {
    }

    @NonNull
    @androidx.annotation.j
    public static a a(int i10, @NonNull String str, @NonNull Boolean bool, @NonNull Boolean bool2) {
        return new a(i10, str, bool, bool2);
    }

    @NonNull
    @androidx.annotation.j
    public static b b(@NonNull SocialAuthType socialAuthType, @NonNull Boolean bool, @NonNull Boolean bool2) {
        return new b(socialAuthType, bool, bool2);
    }

    @NonNull
    @androidx.annotation.j
    public static c c(@NonNull String str) {
        return new c(str);
    }
}
