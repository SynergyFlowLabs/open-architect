package com.google.android.gms.common;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: com.google.android.gms.common.a$a, reason: collision with other inner class name */
    public static class C0965a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        private Account f105846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f105847b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        private ArrayList f105848c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        private ArrayList f105849d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f105850e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @androidx.annotation.p0
        private String f105851f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @androidx.annotation.p0
        private Bundle f105852g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f105853h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f105854i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @androidx.annotation.p0
        private String f105855j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f105856k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @androidx.annotation.p0
        private a0 f105857l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @androidx.annotation.p0
        private String f105858m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f105859n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f105860o;

        /* JADX INFO: renamed from: com.google.android.gms.common.a$a$a, reason: collision with other inner class name */
        public static class C0966a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @androidx.annotation.p0
            private Account f105861a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @androidx.annotation.p0
            private ArrayList f105862b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @androidx.annotation.p0
            private ArrayList f105863c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f105864d = false;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            @androidx.annotation.p0
            private String f105865e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            @androidx.annotation.p0
            private Bundle f105866f;

            @NonNull
            public C0965a a() {
                com.google.android.gms.common.internal.w.b(true, "We only support hostedDomain filter for account chip styled account picker");
                com.google.android.gms.common.internal.w.b(true, "Consent is only valid for account chip styled account picker");
                C0965a c0965a = new C0965a();
                c0965a.f105849d = this.f105863c;
                c0965a.f105848c = this.f105862b;
                c0965a.f105850e = this.f105864d;
                c0965a.f105857l = null;
                c0965a.f105855j = null;
                c0965a.f105852g = this.f105866f;
                c0965a.f105846a = this.f105861a;
                c0965a.f105847b = false;
                c0965a.f105853h = false;
                c0965a.f105858m = null;
                c0965a.f105854i = 0;
                c0965a.f105851f = this.f105865e;
                c0965a.f105856k = false;
                c0965a.f105859n = false;
                c0965a.f105860o = false;
                return c0965a;
            }

            @NonNull
            public C0966a b(@androidx.annotation.p0 List<Account> list) {
                this.f105862b = list == null ? null : new ArrayList(list);
                return this;
            }

            @NonNull
            public C0966a c(@androidx.annotation.p0 List<String> list) {
                this.f105863c = list == null ? null : new ArrayList(list);
                return this;
            }

            @NonNull
            public C0966a d(boolean z10) {
                this.f105864d = z10;
                return this;
            }

            @NonNull
            public C0966a e(@androidx.annotation.p0 Bundle bundle) {
                this.f105866f = bundle;
                return this;
            }

            @NonNull
            public C0966a f(@androidx.annotation.p0 Account account) {
                this.f105861a = account;
                return this;
            }

            @NonNull
            public C0966a g(@androidx.annotation.p0 String str) {
                this.f105865e = str;
                return this;
            }
        }

        static /* bridge */ /* synthetic */ boolean D(C0965a c0965a) {
            boolean z10 = c0965a.f105859n;
            return false;
        }

        static /* bridge */ /* synthetic */ boolean a(C0965a c0965a) {
            boolean z10 = c0965a.f105860o;
            return false;
        }

        static /* bridge */ /* synthetic */ boolean b(C0965a c0965a) {
            boolean z10 = c0965a.f105847b;
            return false;
        }

        static /* bridge */ /* synthetic */ boolean c(C0965a c0965a) {
            boolean z10 = c0965a.f105853h;
            return false;
        }

        static /* bridge */ /* synthetic */ boolean d(C0965a c0965a) {
            boolean z10 = c0965a.f105856k;
            return false;
        }

        static /* bridge */ /* synthetic */ int e(C0965a c0965a) {
            int i10 = c0965a.f105854i;
            return 0;
        }

        static /* bridge */ /* synthetic */ a0 h(C0965a c0965a) {
            a0 a0Var = c0965a.f105857l;
            return null;
        }

        static /* bridge */ /* synthetic */ String i(C0965a c0965a) {
            String str = c0965a.f105855j;
            return null;
        }

        static /* bridge */ /* synthetic */ String j(C0965a c0965a) {
            String str = c0965a.f105858m;
            return null;
        }
    }

    private a() {
    }

    @NonNull
    @Deprecated
    public static Intent a(@androidx.annotation.p0 Account account, @androidx.annotation.p0 ArrayList<Account> arrayList, @androidx.annotation.p0 String[] strArr, boolean z10, @androidx.annotation.p0 String str, @androidx.annotation.p0 String str2, @androidx.annotation.p0 String[] strArr2, @androidx.annotation.p0 Bundle bundle) {
        Intent intent = new Intent();
        int i10 = 6 >> 1;
        com.google.android.gms.common.internal.w.b(true, "We only support hostedDomain filter for account chip styled account picker");
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", arrayList);
        intent.putExtra("allowableAccountTypes", strArr);
        intent.putExtra("addAccountOptions", bundle);
        intent.putExtra("selectedAccount", account);
        intent.putExtra("alwaysPromptForAccount", z10);
        intent.putExtra("descriptionTextOverride", str);
        intent.putExtra("authTokenType", str2);
        intent.putExtra("addAccountRequiredFeatures", strArr2);
        intent.putExtra("setGmsCoreAccount", false);
        intent.putExtra("overrideTheme", 0);
        intent.putExtra("overrideCustomTheme", 0);
        intent.putExtra("hostedDomainFilter", (String) null);
        return intent;
    }

    @NonNull
    public static Intent b(@NonNull C0965a c0965a) {
        Intent intent = new Intent();
        C0965a.d(c0965a);
        C0965a.i(c0965a);
        com.google.android.gms.common.internal.w.b(true, "We only support hostedDomain filter for account chip styled account picker");
        C0965a.h(c0965a);
        com.google.android.gms.common.internal.w.b(true, "Consent is only valid for account chip styled account picker");
        C0965a.b(c0965a);
        com.google.android.gms.common.internal.w.b(true, "Making the selected account non-clickable is only supported for the THEME_DAY_NIGHT_GOOGLE_MATERIAL2, THEME_LIGHT_GOOGLE_MATERIAL3, THEME_DARK_GOOGLE_MATERIAL3 or THEME_DAY_NIGHT_GOOGLE_MATERIAL3 themes");
        C0965a.d(c0965a);
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", c0965a.f105848c);
        if (c0965a.f105849d != null) {
            intent.putExtra("allowableAccountTypes", (String[]) c0965a.f105849d.toArray(new String[0]));
        }
        intent.putExtra("addAccountOptions", c0965a.f105852g);
        intent.putExtra("selectedAccount", c0965a.f105846a);
        C0965a.b(c0965a);
        intent.putExtra("selectedAccountIsNotClickable", false);
        intent.putExtra("alwaysPromptForAccount", c0965a.f105850e);
        intent.putExtra("descriptionTextOverride", c0965a.f105851f);
        C0965a.c(c0965a);
        intent.putExtra("setGmsCoreAccount", false);
        C0965a.j(c0965a);
        intent.putExtra("realClientPackage", (String) null);
        C0965a.e(c0965a);
        intent.putExtra("overrideTheme", 0);
        C0965a.d(c0965a);
        intent.putExtra("overrideCustomTheme", 0);
        C0965a.i(c0965a);
        intent.putExtra("hostedDomainFilter", (String) null);
        Bundle bundle = new Bundle();
        C0965a.d(c0965a);
        C0965a.h(c0965a);
        C0965a.D(c0965a);
        C0965a.a(c0965a);
        if (!bundle.isEmpty()) {
            intent.putExtra("first_party_options_bundle", bundle);
        }
        return intent;
    }
}
