package androidx.browser.trusted.sharing;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f12032d = "androidx.browser.trusted.sharing.KEY_TITLE";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f12033e = "androidx.browser.trusted.sharing.KEY_TEXT";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f12034f = "androidx.browser.trusted.sharing.KEY_URIS";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    public final String f12035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public final String f12036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    public final List<Uri> f12037c;

    public a(@p0 String str, @p0 String str2, @p0 List<Uri> list) {
        this.f12035a = str;
        this.f12036b = str2;
        this.f12037c = list;
    }

    @NonNull
    public static a a(@NonNull Bundle bundle) {
        return new a(bundle.getString("androidx.browser.trusted.sharing.KEY_TITLE"), bundle.getString("androidx.browser.trusted.sharing.KEY_TEXT"), bundle.getParcelableArrayList(f12034f));
    }

    @NonNull
    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString("androidx.browser.trusted.sharing.KEY_TITLE", this.f12035a);
        bundle.putString("androidx.browser.trusted.sharing.KEY_TEXT", this.f12036b);
        if (this.f12037c != null) {
            bundle.putParcelableArrayList(f12034f, new ArrayList<>(this.f12037c));
        }
        return bundle;
    }
}
