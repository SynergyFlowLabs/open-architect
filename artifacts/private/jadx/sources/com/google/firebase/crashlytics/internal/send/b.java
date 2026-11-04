package com.google.firebase.crashlytics.internal.send;

import android.content.Context;
import androidx.annotation.NonNull;
import com.devtodev.analytics.internal.storage.sqlite.PeopleCardEntry;
import com.google.android.datatransport.k;
import com.google.android.datatransport.m;
import com.google.android.datatransport.runtime.w;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.s0;
import com.google.firebase.crashlytics.internal.model.f0;
import com.google.firebase.crashlytics.internal.model.serialization.j;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f121811f = "FIREBASE_CRASHLYTICS_REPORT";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f121813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k<f0, byte[]> f121814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final j f121808c = new j();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f121809d = d("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f121810e = d("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final k<f0, byte[]> f121812g = new k() { // from class: com.google.firebase.crashlytics.internal.send.a
        @Override // com.google.android.datatransport.k
        public final Object apply(Object obj) {
            return b.f121808c.O((f0) obj).getBytes(Charset.forName("UTF-8"));
        }
    };

    b(e eVar, k<f0, byte[]> kVar) {
        this.f121813a = eVar;
        this.f121814b = kVar;
    }

    public static b b(Context context, com.google.firebase.crashlytics.internal.settings.k kVar, s0 s0Var) {
        w.f(context);
        m mVarG = w.c().g(new com.google.android.datatransport.cct.a(f121809d, f121810e));
        com.google.android.datatransport.e eVarB = com.google.android.datatransport.e.b(PeopleCardEntry.json);
        k<f0, byte[]> kVar2 = f121812g;
        return new b(new e(mVarG.b(f121811f, f0.class, eVarB, kVar2), kVar.a(), s0Var), kVar2);
    }

    private static String d(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str.length() + str2.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb2.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb2.append(str2.charAt(i10));
            }
        }
        return sb2.toString();
    }

    @NonNull
    public Task<com.google.firebase.crashlytics.internal.common.f0> c(@NonNull com.google.firebase.crashlytics.internal.common.f0 f0Var, boolean z10) {
        return this.f121813a.i(f0Var, z10).a();
    }
}
