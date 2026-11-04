package com.google.android.datatransport.cct;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.devtodev.analytics.internal.storage.sqlite.PeopleCardEntry;
import com.google.android.datatransport.runtime.h;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f103184c = "cct";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f103185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final String f103186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f103187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f103188g = "1$";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f103189h = "\\";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Set<com.google.android.datatransport.e> f103190i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f103191j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f103192k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final String f103193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final String f103194b;

    static {
        String strA = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f103185d = strA;
        String strA2 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f103186e = strA2;
        String strA3 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f103187f = strA3;
        f103190i = Collections.unmodifiableSet(new HashSet(Arrays.asList(com.google.android.datatransport.e.b("proto"), com.google.android.datatransport.e.b(PeopleCardEntry.json))));
        f103191j = new a(strA, null);
        f103192k = new a(strA2, strA3);
    }

    public a(@NonNull String str, @p0 String str2) {
        this.f103193a = str;
        this.f103194b = str2;
    }

    @NonNull
    static String c(@NonNull byte[] bArr) {
        return new String(bArr, Charset.forName("UTF-8"));
    }

    @NonNull
    static byte[] d(@NonNull String str) {
        return str.getBytes(Charset.forName("UTF-8"));
    }

    @NonNull
    public static a e(@NonNull byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith(f103188g)) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote(f103189h), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }

    @Override // com.google.android.datatransport.runtime.h
    public Set<com.google.android.datatransport.e> a() {
        return f103190i;
    }

    @p0
    public byte[] b() {
        String str = this.f103194b;
        if (str == null && this.f103193a == null) {
            return null;
        }
        String str2 = this.f103193a;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", f103188g, str2, f103189h, str).getBytes(Charset.forName("UTF-8"));
    }

    @p0
    public String f() {
        return this.f103194b;
    }

    @NonNull
    public String g() {
        return this.f103193a;
    }

    @Override // com.google.android.datatransport.runtime.g
    @p0
    public byte[] getExtras() {
        return b();
    }

    @Override // com.google.android.datatransport.runtime.g
    @NonNull
    public String getName() {
        return f103184c;
    }
}
