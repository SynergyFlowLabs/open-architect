package com.android.volley.toolbox;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerFuture;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.l1;

/* JADX INFO: loaded from: classes3.dex */
@e.a({"MissingPermission"})
public class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AccountManager f89512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Account f89513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f89514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f89515d;

    public b(Context context, Account account, String str) {
        this(context, account, str, false);
    }

    @Override // com.android.volley.toolbox.d
    public void a(String str) {
        this.f89512a.invalidateAuthToken(this.f89513b.type, str);
    }

    @Override // com.android.volley.toolbox.d
    public String b() throws com.android.volley.d {
        String string;
        int i10 = 4 ^ 0;
        AccountManagerFuture<Bundle> authToken = this.f89512a.getAuthToken(this.f89513b, this.f89514c, this.f89515d, null, null);
        try {
            Bundle result = authToken.getResult();
            if (!authToken.isDone() || authToken.isCancelled()) {
                string = null;
            } else {
                if (result.containsKey("intent")) {
                    throw new com.android.volley.d((Intent) result.getParcelable("intent"));
                }
                string = result.getString("authtoken");
            }
            if (string != null) {
                return string;
            }
            throw new com.android.volley.d("Got null auth token for type: " + this.f89514c);
        } catch (Exception e10) {
            throw new com.android.volley.d("Error while retrieving auth token", e10);
        }
    }

    public Account c() {
        return this.f89513b;
    }

    public String d() {
        return this.f89514c;
    }

    public b(Context context, Account account, String str, boolean z10) {
        this(AccountManager.get(context), account, str, z10);
    }

    @l1
    b(AccountManager accountManager, Account account, String str, boolean z10) {
        this.f89512a = accountManager;
        this.f89513b = account;
        this.f89514c = str;
        this.f89515d = z10;
    }
}
