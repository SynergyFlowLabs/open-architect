package com.planner5d.library.activity.fragment.dialog.authentication;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.c2;
import com.planner5d.library.modules.user.auth.SocialAuthType;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class t0 {

    public static class a implements c2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f131998a;

        @NonNull
        public ErrorMessageException a() {
            return (ErrorMessageException) this.f131998a.get("error");
        }

        @NonNull
        public Boolean b() {
            return (Boolean) this.f131998a.get("fromProfile");
        }

        @NonNull
        public a c(@NonNull ErrorMessageException errorMessageException) {
            if (errorMessageException == null) {
                throw new IllegalArgumentException("Argument \"error\" is marked as non-null but was passed a null value.");
            }
            this.f131998a.put("error", errorMessageException);
            return this;
        }

        @Override // androidx.navigation.c2
        @NonNull
        public Bundle d() {
            Bundle bundle = new Bundle();
            if (this.f131998a.containsKey("error")) {
                ErrorMessageException errorMessageException = (ErrorMessageException) this.f131998a.get("error");
                if (Parcelable.class.isAssignableFrom(ErrorMessageException.class) || errorMessageException == null) {
                    bundle.putParcelable("error", (Parcelable) Parcelable.class.cast(errorMessageException));
                } else {
                    if (!Serializable.class.isAssignableFrom(ErrorMessageException.class)) {
                        throw new UnsupportedOperationException(ErrorMessageException.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                    }
                    bundle.putSerializable("error", (Serializable) Serializable.class.cast(errorMessageException));
                }
            }
            if (this.f131998a.containsKey("fromProfile")) {
                Boolean bool = (Boolean) this.f131998a.get("fromProfile");
                if (!Parcelable.class.isAssignableFrom(Boolean.class) && bool != null) {
                    if (Serializable.class.isAssignableFrom(Boolean.class)) {
                        bundle.putSerializable("fromProfile", (Serializable) Serializable.class.cast(bool));
                        return bundle;
                    }
                    throw new UnsupportedOperationException(Boolean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                bundle.putParcelable("fromProfile", (Parcelable) Parcelable.class.cast(bool));
            }
            return bundle;
        }

        @Override // androidx.navigation.c2
        public int e() {
            return com.planner5d.library.f.j.Lv;
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
        
            if (r7.b() != null) goto L33;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(java.lang.Object r7) {
            /*
                r6 = this;
                r5 = 1
                r0 = 1
                if (r6 != r7) goto L5
                return r0
            L5:
                r1 = 0
                r5 = 5
                if (r7 == 0) goto L8e
                r5 = 5
                java.lang.Class r2 = r6.getClass()
                java.lang.Class r3 = r7.getClass()
                r5 = 0
                if (r2 == r3) goto L16
                goto L8e
            L16:
                com.planner5d.library.activity.fragment.dialog.authentication.t0$a r7 = (com.planner5d.library.activity.fragment.dialog.authentication.t0.a) r7
                java.util.HashMap r2 = r6.f131998a
                r5 = 4
                java.lang.String r3 = "error"
                boolean r2 = r2.containsKey(r3)
                r5 = 1
                java.util.HashMap r4 = r7.f131998a
                boolean r3 = r4.containsKey(r3)
                if (r2 == r3) goto L2b
                return r1
            L2b:
                r5 = 1
                com.planner5d.library.services.exceptions.ErrorMessageException r2 = r6.a()
                if (r2 == 0) goto L42
                com.planner5d.library.services.exceptions.ErrorMessageException r2 = r6.a()
                r5 = 6
                com.planner5d.library.services.exceptions.ErrorMessageException r3 = r7.a()
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L4c
                goto L4a
            L42:
                r5 = 7
                com.planner5d.library.services.exceptions.ErrorMessageException r2 = r7.a()
                r5 = 5
                if (r2 == 0) goto L4c
            L4a:
                r5 = 1
                return r1
            L4c:
                java.util.HashMap r2 = r6.f131998a
                java.lang.String r3 = "fromProfile"
                boolean r2 = r2.containsKey(r3)
                java.util.HashMap r4 = r7.f131998a
                r5 = 5
                boolean r3 = r4.containsKey(r3)
                r5 = 1
                if (r2 == r3) goto L60
                r5 = 1
                return r1
            L60:
                java.lang.Boolean r2 = r6.b()
                r5 = 5
                if (r2 == 0) goto L78
                java.lang.Boolean r2 = r6.b()
                r5 = 4
                java.lang.Boolean r3 = r7.b()
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L80
                r5 = 0
                goto L7e
            L78:
                java.lang.Boolean r2 = r7.b()
                if (r2 == 0) goto L80
            L7e:
                r5 = 3
                return r1
            L80:
                int r6 = r6.e()
                r5 = 6
                int r7 = r7.e()
                if (r6 == r7) goto L8d
                r5 = 4
                return r1
            L8d:
                return r0
            L8e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.dialog.authentication.t0.a.equals(java.lang.Object):boolean");
        }

        @NonNull
        public a f(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalArgumentException("Argument \"fromProfile\" is marked as non-null but was passed a null value.");
            }
            this.f131998a.put("fromProfile", bool);
            return this;
        }

        public int hashCode() {
            return (((((a() != null ? a().hashCode() : 0) + 31) * 31) + (b() != null ? b().hashCode() : 0)) * 31) + e();
        }

        public String toString() {
            return "ToError(actionId=" + e() + "){error=" + a() + ", fromProfile=" + b() + "}";
        }

        private a(@NonNull ErrorMessageException errorMessageException, @NonNull Boolean bool) {
            HashMap map = new HashMap();
            this.f131998a = map;
            if (errorMessageException == null) {
                throw new IllegalArgumentException("Argument \"error\" is marked as non-null but was passed a null value.");
            }
            map.put("error", errorMessageException);
            if (bool == null) {
                throw new IllegalArgumentException("Argument \"fromProfile\" is marked as non-null but was passed a null value.");
            }
            map.put("fromProfile", bool);
        }
    }

    public static class b implements c2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f131999a;

        @NonNull
        public Boolean a() {
            return (Boolean) this.f131999a.get("fromProfile");
        }

        @NonNull
        public Boolean b() {
            return (Boolean) this.f131999a.get("signUp");
        }

        @NonNull
        public SocialAuthType c() {
            return (SocialAuthType) this.f131999a.get("type");
        }

        @Override // androidx.navigation.c2
        @NonNull
        public Bundle d() {
            Bundle bundle = new Bundle();
            if (this.f131999a.containsKey("type")) {
                SocialAuthType socialAuthType = (SocialAuthType) this.f131999a.get("type");
                if (Parcelable.class.isAssignableFrom(SocialAuthType.class) || socialAuthType == null) {
                    bundle.putParcelable("type", (Parcelable) Parcelable.class.cast(socialAuthType));
                } else {
                    if (!Serializable.class.isAssignableFrom(SocialAuthType.class)) {
                        throw new UnsupportedOperationException(SocialAuthType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                    }
                    bundle.putSerializable("type", (Serializable) Serializable.class.cast(socialAuthType));
                }
            }
            if (this.f131999a.containsKey("fromProfile")) {
                Boolean bool = (Boolean) this.f131999a.get("fromProfile");
                if (Parcelable.class.isAssignableFrom(Boolean.class) || bool == null) {
                    bundle.putParcelable("fromProfile", (Parcelable) Parcelable.class.cast(bool));
                } else {
                    if (!Serializable.class.isAssignableFrom(Boolean.class)) {
                        throw new UnsupportedOperationException(Boolean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                    }
                    bundle.putSerializable("fromProfile", (Serializable) Serializable.class.cast(bool));
                }
            }
            if (this.f131999a.containsKey("signUp")) {
                Boolean bool2 = (Boolean) this.f131999a.get("signUp");
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

        /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
        
            if (r7.a() != null) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00b0, code lost:
        
            if (r7.b() != null) goto L44;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(java.lang.Object r7) {
            /*
                r6 = this;
                r5 = 7
                r0 = 1
                if (r6 != r7) goto L5
                return r0
            L5:
                r1 = 0
                if (r7 == 0) goto Lc0
                r5 = 3
                java.lang.Class r2 = r6.getClass()
                java.lang.Class r3 = r7.getClass()
                r5 = 7
                if (r2 == r3) goto L16
                goto Lc0
            L16:
                r5 = 4
                com.planner5d.library.activity.fragment.dialog.authentication.t0$b r7 = (com.planner5d.library.activity.fragment.dialog.authentication.t0.b) r7
                java.util.HashMap r2 = r6.f131999a
                java.lang.String r3 = "type"
                boolean r2 = r2.containsKey(r3)
                r5 = 7
                java.util.HashMap r4 = r7.f131999a
                boolean r3 = r4.containsKey(r3)
                if (r2 == r3) goto L2c
                r5 = 6
                return r1
            L2c:
                r5 = 2
                com.planner5d.library.modules.user.auth.SocialAuthType r2 = r6.c()
                if (r2 == 0) goto L44
                com.planner5d.library.modules.user.auth.SocialAuthType r2 = r6.c()
                r5 = 5
                com.planner5d.library.modules.user.auth.SocialAuthType r3 = r7.c()
                boolean r2 = r2.equals(r3)
                r5 = 1
                if (r2 != 0) goto L4c
                goto L4b
            L44:
                com.planner5d.library.modules.user.auth.SocialAuthType r2 = r7.c()
                r5 = 1
                if (r2 == 0) goto L4c
            L4b:
                return r1
            L4c:
                r5 = 0
                java.util.HashMap r2 = r6.f131999a
                java.lang.String r3 = "fromProfile"
                r5 = 7
                boolean r2 = r2.containsKey(r3)
                r5 = 4
                java.util.HashMap r4 = r7.f131999a
                boolean r3 = r4.containsKey(r3)
                if (r2 == r3) goto L60
                return r1
            L60:
                java.lang.Boolean r2 = r6.a()
                r5 = 3
                if (r2 == 0) goto L79
                java.lang.Boolean r2 = r6.a()
                java.lang.Boolean r3 = r7.a()
                r5 = 5
                boolean r2 = r2.equals(r3)
                r5 = 1
                if (r2 != 0) goto L80
                r5 = 3
                goto L7f
            L79:
                java.lang.Boolean r2 = r7.a()
                if (r2 == 0) goto L80
            L7f:
                return r1
            L80:
                java.util.HashMap r2 = r6.f131999a
                java.lang.String r3 = "signUp"
                boolean r2 = r2.containsKey(r3)
                r5 = 1
                java.util.HashMap r4 = r7.f131999a
                boolean r3 = r4.containsKey(r3)
                if (r2 == r3) goto L93
                r5 = 5
                return r1
            L93:
                java.lang.Boolean r2 = r6.b()
                r5 = 6
                if (r2 == 0) goto Lab
                java.lang.Boolean r2 = r6.b()
                r5 = 7
                java.lang.Boolean r3 = r7.b()
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto Lb3
                r5 = 3
                goto Lb2
            Lab:
                java.lang.Boolean r2 = r7.b()
                r5 = 0
                if (r2 == 0) goto Lb3
            Lb2:
                return r1
            Lb3:
                int r6 = r6.e()
                int r7 = r7.e()
                r5 = 4
                if (r6 == r7) goto Lbf
                return r1
            Lbf:
                return r0
            Lc0:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.dialog.authentication.t0.b.equals(java.lang.Object):boolean");
        }

        @NonNull
        public b f(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalArgumentException("Argument \"fromProfile\" is marked as non-null but was passed a null value.");
            }
            this.f131999a.put("fromProfile", bool);
            return this;
        }

        @NonNull
        public b g(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalArgumentException("Argument \"signUp\" is marked as non-null but was passed a null value.");
            }
            this.f131999a.put("signUp", bool);
            return this;
        }

        @NonNull
        public b h(@NonNull SocialAuthType socialAuthType) {
            if (socialAuthType == null) {
                throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
            }
            this.f131999a.put("type", socialAuthType);
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
            this.f131999a = map;
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
        private final HashMap f132000a;

        @NonNull
        public String a() {
            return (String) this.f132000a.get("user");
        }

        @NonNull
        public c b(@NonNull String str) {
            if (str == null) {
                throw new IllegalArgumentException("Argument \"user\" is marked as non-null but was passed a null value.");
            }
            this.f132000a.put("user", str);
            return this;
        }

        @Override // androidx.navigation.c2
        @NonNull
        public Bundle d() {
            Bundle bundle = new Bundle();
            if (this.f132000a.containsKey("user")) {
                bundle.putString("user", (String) this.f132000a.get("user"));
            }
            return bundle;
        }

        @Override // androidx.navigation.c2
        public int e() {
            return com.planner5d.library.f.j.Wv;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
        
            if (r7.a() != null) goto L21;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(java.lang.Object r7) {
            /*
                r6 = this;
                r5 = 7
                r0 = 1
                if (r6 != r7) goto L5
                return r0
            L5:
                r5 = 4
                r1 = 0
                if (r7 == 0) goto L5f
                java.lang.Class r2 = r6.getClass()
                r5 = 5
                java.lang.Class r3 = r7.getClass()
                r5 = 2
                if (r2 == r3) goto L17
                r5 = 6
                goto L5f
            L17:
                r5 = 5
                com.planner5d.library.activity.fragment.dialog.authentication.t0$c r7 = (com.planner5d.library.activity.fragment.dialog.authentication.t0.c) r7
                java.util.HashMap r2 = r6.f132000a
                java.lang.String r3 = "reus"
                java.lang.String r3 = "user"
                boolean r2 = r2.containsKey(r3)
                r5 = 3
                java.util.HashMap r4 = r7.f132000a
                boolean r3 = r4.containsKey(r3)
                if (r2 == r3) goto L2f
                r5 = 3
                return r1
            L2f:
                java.lang.String r2 = r6.a()
                r5 = 5
                if (r2 == 0) goto L49
                java.lang.String r2 = r6.a()
                r5 = 4
                java.lang.String r3 = r7.a()
                r5 = 0
                boolean r2 = r2.equals(r3)
                r5 = 4
                if (r2 != 0) goto L51
                r5 = 2
                goto L50
            L49:
                java.lang.String r2 = r7.a()
                r5 = 7
                if (r2 == 0) goto L51
            L50:
                return r1
            L51:
                int r6 = r6.e()
                int r7 = r7.e()
                if (r6 == r7) goto L5d
                r5 = 6
                return r1
            L5d:
                r5 = 2
                return r0
            L5f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.dialog.authentication.t0.c.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            return (((a() != null ? a().hashCode() : 0) + 31) * 31) + e();
        }

        public String toString() {
            return "ToPrivacyAgreement(actionId=" + e() + "){user=" + a() + "}";
        }

        private c(@NonNull String str) {
            HashMap map = new HashMap();
            this.f132000a = map;
            if (str == null) {
                throw new IllegalArgumentException("Argument \"user\" is marked as non-null but was passed a null value.");
            }
            map.put("user", str);
        }
    }

    private t0() {
    }

    @NonNull
    @androidx.annotation.j
    public static a a(@NonNull ErrorMessageException errorMessageException, @NonNull Boolean bool) {
        return new a(errorMessageException, bool);
    }

    @NonNull
    @androidx.annotation.j
    public static b b(@NonNull SocialAuthType socialAuthType, @NonNull Boolean bool, @NonNull Boolean bool2) {
        return new b(socialAuthType, bool, bool2);
    }

    @NonNull
    @androidx.annotation.j
    public static c2 c() {
        return new androidx.navigation.a(com.planner5d.library.f.j.Ov);
    }

    @NonNull
    @androidx.annotation.j
    public static c d(@NonNull String str) {
        return new c(str);
    }

    @NonNull
    @androidx.annotation.j
    public static c2 e() {
        return new androidx.navigation.a(com.planner5d.library.f.j.nw);
    }
}
