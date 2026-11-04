package com.planner5d.library.activity.fragment.dialog.authentication.onelink;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.c2;
import com.planner5d.library.modules.user.auth.SocialAuthType;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class e0 {

    public static class a implements c2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f131866a;

        @NonNull
        public Boolean a() {
            return (Boolean) this.f131866a.get("fromProfile");
        }

        @NonNull
        public Boolean b() {
            return (Boolean) this.f131866a.get("signUp");
        }

        @NonNull
        public SocialAuthType c() {
            return (SocialAuthType) this.f131866a.get("type");
        }

        @Override // androidx.navigation.c2
        @NonNull
        public Bundle d() {
            Bundle bundle = new Bundle();
            if (this.f131866a.containsKey("type")) {
                SocialAuthType socialAuthType = (SocialAuthType) this.f131866a.get("type");
                if (Parcelable.class.isAssignableFrom(SocialAuthType.class) || socialAuthType == null) {
                    bundle.putParcelable("type", (Parcelable) Parcelable.class.cast(socialAuthType));
                } else {
                    if (!Serializable.class.isAssignableFrom(SocialAuthType.class)) {
                        throw new UnsupportedOperationException(SocialAuthType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                    }
                    bundle.putSerializable("type", (Serializable) Serializable.class.cast(socialAuthType));
                }
            }
            if (this.f131866a.containsKey("fromProfile")) {
                Boolean bool = (Boolean) this.f131866a.get("fromProfile");
                if (Parcelable.class.isAssignableFrom(Boolean.class) || bool == null) {
                    bundle.putParcelable("fromProfile", (Parcelable) Parcelable.class.cast(bool));
                } else {
                    if (!Serializable.class.isAssignableFrom(Boolean.class)) {
                        throw new UnsupportedOperationException(Boolean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                    }
                    bundle.putSerializable("fromProfile", (Serializable) Serializable.class.cast(bool));
                }
            }
            if (this.f131866a.containsKey("signUp")) {
                Boolean bool2 = (Boolean) this.f131866a.get("signUp");
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

        /* JADX WARN: Code restructure failed: missing block: B:43:0x00b2, code lost:
        
            if (r7.b() != null) goto L44;
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
                r5 = 5
                return r0
            L5:
                r1 = 0
                if (r7 == 0) goto Lc2
                java.lang.Class r2 = r6.getClass()
                r5 = 6
                java.lang.Class r3 = r7.getClass()
                if (r2 == r3) goto L16
                r5 = 2
                goto Lc2
            L16:
                com.planner5d.library.activity.fragment.dialog.authentication.onelink.e0$a r7 = (com.planner5d.library.activity.fragment.dialog.authentication.onelink.e0.a) r7
                java.util.HashMap r2 = r6.f131866a
                java.lang.String r3 = "type"
                boolean r2 = r2.containsKey(r3)
                r5 = 6
                java.util.HashMap r4 = r7.f131866a
                r5 = 2
                boolean r3 = r4.containsKey(r3)
                r5 = 5
                if (r2 == r3) goto L2c
                return r1
            L2c:
                com.planner5d.library.modules.user.auth.SocialAuthType r2 = r6.c()
                r5 = 5
                if (r2 == 0) goto L43
                com.planner5d.library.modules.user.auth.SocialAuthType r2 = r6.c()
                com.planner5d.library.modules.user.auth.SocialAuthType r3 = r7.c()
                boolean r2 = r2.equals(r3)
                r5 = 4
                if (r2 != 0) goto L4c
                goto L4a
            L43:
                r5 = 1
                com.planner5d.library.modules.user.auth.SocialAuthType r2 = r7.c()
                if (r2 == 0) goto L4c
            L4a:
                r5 = 0
                return r1
            L4c:
                r5 = 7
                java.util.HashMap r2 = r6.f131866a
                java.lang.String r3 = "fromProfile"
                boolean r2 = r2.containsKey(r3)
                java.util.HashMap r4 = r7.f131866a
                r5 = 4
                boolean r3 = r4.containsKey(r3)
                r5 = 5
                if (r2 == r3) goto L60
                return r1
            L60:
                java.lang.Boolean r2 = r6.a()
                r5 = 1
                if (r2 == 0) goto L77
                java.lang.Boolean r2 = r6.a()
                r5 = 2
                java.lang.Boolean r3 = r7.a()
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L7f
                goto L7e
            L77:
                java.lang.Boolean r2 = r7.a()
                r5 = 1
                if (r2 == 0) goto L7f
            L7e:
                return r1
            L7f:
                r5 = 6
                java.util.HashMap r2 = r6.f131866a
                java.lang.String r3 = "signUp"
                r5 = 5
                boolean r2 = r2.containsKey(r3)
                r5 = 7
                java.util.HashMap r4 = r7.f131866a
                r5 = 1
                boolean r3 = r4.containsKey(r3)
                r5 = 7
                if (r2 == r3) goto L95
                return r1
            L95:
                r5 = 4
                java.lang.Boolean r2 = r6.b()
                if (r2 == 0) goto Lae
                java.lang.Boolean r2 = r6.b()
                r5 = 0
                java.lang.Boolean r3 = r7.b()
                boolean r2 = r2.equals(r3)
                r5 = 6
                if (r2 != 0) goto Lb5
                r5 = 0
                goto Lb4
            Lae:
                java.lang.Boolean r2 = r7.b()
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
                return r0
            Lc2:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.dialog.authentication.onelink.e0.a.equals(java.lang.Object):boolean");
        }

        @NonNull
        public a f(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalArgumentException("Argument \"fromProfile\" is marked as non-null but was passed a null value.");
            }
            this.f131866a.put("fromProfile", bool);
            return this;
        }

        @NonNull
        public a g(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalArgumentException("Argument \"signUp\" is marked as non-null but was passed a null value.");
            }
            this.f131866a.put("signUp", bool);
            return this;
        }

        @NonNull
        public a h(@NonNull SocialAuthType socialAuthType) {
            if (socialAuthType == null) {
                throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
            }
            this.f131866a.put("type", socialAuthType);
            return this;
        }

        public int hashCode() {
            return (((((((c() != null ? c().hashCode() : 0) + 31) * 31) + (a() != null ? a().hashCode() : 0)) * 31) + (b() != null ? b().hashCode() : 0)) * 31) + e();
        }

        public String toString() {
            return "ToExternalServices(actionId=" + e() + "){type=" + c() + ", fromProfile=" + a() + ", signUp=" + b() + "}";
        }

        private a(@NonNull SocialAuthType socialAuthType, @NonNull Boolean bool, @NonNull Boolean bool2) {
            HashMap map = new HashMap();
            this.f131866a = map;
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

    public static class b implements c2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f131867a;

        @NonNull
        public Boolean a() {
            return (Boolean) this.f131867a.get("fromProfile");
        }

        @NonNull
        public Boolean b() {
            return (Boolean) this.f131867a.get("signup");
        }

        public int c() {
            return ((Integer) this.f131867a.get("title")).intValue();
        }

        @Override // androidx.navigation.c2
        @NonNull
        public Bundle d() {
            Bundle bundle = new Bundle();
            if (this.f131867a.containsKey("signup")) {
                Boolean bool = (Boolean) this.f131867a.get("signup");
                if (Parcelable.class.isAssignableFrom(Boolean.class) || bool == null) {
                    bundle.putParcelable("signup", (Parcelable) Parcelable.class.cast(bool));
                } else {
                    if (!Serializable.class.isAssignableFrom(Boolean.class)) {
                        throw new UnsupportedOperationException(Boolean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                    }
                    bundle.putSerializable("signup", (Serializable) Serializable.class.cast(bool));
                }
            }
            if (this.f131867a.containsKey("title")) {
                bundle.putInt("title", ((Integer) this.f131867a.get("title")).intValue());
            }
            if (this.f131867a.containsKey("fromProfile")) {
                Boolean bool2 = (Boolean) this.f131867a.get("fromProfile");
                if (!Parcelable.class.isAssignableFrom(Boolean.class) && bool2 != null) {
                    if (Serializable.class.isAssignableFrom(Boolean.class)) {
                        bundle.putSerializable("fromProfile", (Serializable) Serializable.class.cast(bool2));
                        return bundle;
                    }
                    throw new UnsupportedOperationException(Boolean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                bundle.putParcelable("fromProfile", (Parcelable) Parcelable.class.cast(bool2));
            }
            return bundle;
        }

        @Override // androidx.navigation.c2
        public int e() {
            return com.planner5d.library.f.j.mw;
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x009f, code lost:
        
            if (r7.a() != null) goto L40;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(java.lang.Object r7) {
            /*
                r6 = this;
                r0 = 0
                r0 = 1
                if (r6 != r7) goto L5
                return r0
            L5:
                r1 = 0
                if (r7 == 0) goto Lb1
                java.lang.Class r2 = r6.getClass()
                java.lang.Class r3 = r7.getClass()
                r5 = 7
                if (r2 == r3) goto L16
                r5 = 7
                goto Lb1
            L16:
                com.planner5d.library.activity.fragment.dialog.authentication.onelink.e0$b r7 = (com.planner5d.library.activity.fragment.dialog.authentication.onelink.e0.b) r7
                java.util.HashMap r2 = r6.f131867a
                java.lang.String r3 = "npisgp"
                java.lang.String r3 = "signup"
                boolean r2 = r2.containsKey(r3)
                java.util.HashMap r4 = r7.f131867a
                boolean r3 = r4.containsKey(r3)
                r5 = 1
                if (r2 == r3) goto L2d
                r5 = 7
                return r1
            L2d:
                java.lang.Boolean r2 = r6.b()
                if (r2 == 0) goto L44
                java.lang.Boolean r2 = r6.b()
                r5 = 0
                java.lang.Boolean r3 = r7.b()
                r5 = 6
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L4b
                goto L4a
            L44:
                java.lang.Boolean r2 = r7.b()
                if (r2 == 0) goto L4b
            L4a:
                return r1
            L4b:
                java.util.HashMap r2 = r6.f131867a
                java.lang.String r3 = "title"
                boolean r2 = r2.containsKey(r3)
                r5 = 2
                java.util.HashMap r4 = r7.f131867a
                r5 = 1
                boolean r3 = r4.containsKey(r3)
                if (r2 == r3) goto L5f
                r5 = 7
                return r1
            L5f:
                int r2 = r6.c()
                r5 = 6
                int r3 = r7.c()
                r5 = 0
                if (r2 == r3) goto L6c
                return r1
            L6c:
                r5 = 0
                java.util.HashMap r2 = r6.f131867a
                java.lang.String r3 = "fromProfile"
                r5 = 3
                boolean r2 = r2.containsKey(r3)
                java.util.HashMap r4 = r7.f131867a
                r5 = 5
                boolean r3 = r4.containsKey(r3)
                r5 = 7
                if (r2 == r3) goto L82
                r5 = 1
                return r1
            L82:
                java.lang.Boolean r2 = r6.a()
                r5 = 1
                if (r2 == 0) goto L9b
                java.lang.Boolean r2 = r6.a()
                r5 = 0
                java.lang.Boolean r3 = r7.a()
                boolean r2 = r2.equals(r3)
                r5 = 4
                if (r2 != 0) goto La3
                r5 = 4
                goto La1
            L9b:
                java.lang.Boolean r2 = r7.a()
                if (r2 == 0) goto La3
            La1:
                r5 = 4
                return r1
            La3:
                int r6 = r6.e()
                r5 = 0
                int r7 = r7.e()
                if (r6 == r7) goto Lb0
                r5 = 1
                return r1
            Lb0:
                return r0
            Lb1:
                r5 = 3
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.dialog.authentication.onelink.e0.b.equals(java.lang.Object):boolean");
        }

        @NonNull
        public b f(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalArgumentException("Argument \"fromProfile\" is marked as non-null but was passed a null value.");
            }
            this.f131867a.put("fromProfile", bool);
            return this;
        }

        @NonNull
        public b g(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalArgumentException("Argument \"signup\" is marked as non-null but was passed a null value.");
            }
            this.f131867a.put("signup", bool);
            return this;
        }

        @NonNull
        public b h(int i10) {
            this.f131867a.put("title", Integer.valueOf(i10));
            return this;
        }

        public int hashCode() {
            return (((((((b() != null ? b().hashCode() : 0) + 31) * 31) + c()) * 31) + (a() != null ? a().hashCode() : 0)) * 31) + e();
        }

        public String toString() {
            return "ToSignInWithLinkConfirmation(actionId=" + e() + "){signup=" + b() + ", title=" + c() + ", fromProfile=" + a() + "}";
        }

        private b(@NonNull Boolean bool, int i10, @NonNull Boolean bool2) {
            HashMap map = new HashMap();
            this.f131867a = map;
            if (bool == null) {
                throw new IllegalArgumentException("Argument \"signup\" is marked as non-null but was passed a null value.");
            }
            map.put("signup", bool);
            map.put("title", Integer.valueOf(i10));
            if (bool2 == null) {
                throw new IllegalArgumentException("Argument \"fromProfile\" is marked as non-null but was passed a null value.");
            }
            map.put("fromProfile", bool2);
        }
    }

    private e0() {
    }

    @NonNull
    @androidx.annotation.j
    public static a a(@NonNull SocialAuthType socialAuthType, @NonNull Boolean bool, @NonNull Boolean bool2) {
        return new a(socialAuthType, bool, bool2);
    }

    @NonNull
    @androidx.annotation.j
    public static b b(@NonNull Boolean bool, int i10, @NonNull Boolean bool2) {
        return new b(bool, i10, bool2);
    }
}
