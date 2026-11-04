package io.noties.markwon.image.destination;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes8.dex */
public class b extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f297637c = "https://android.asset/";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f297638d = "file:///android_asset/";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f297639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f297640b;

    public b() {
        this(null);
    }

    @NonNull
    public static b c(@p0 a aVar) {
        return new b(aVar);
    }

    @Override // io.noties.markwon.image.destination.a
    @NonNull
    public String b(@NonNull String str) {
        if (TextUtils.isEmpty(Uri.parse(str).getScheme())) {
            return this.f297639a.b(str).replace(f297637c, f297638d);
        }
        a aVar = this.f297640b;
        return aVar != null ? aVar.b(str) : str;
    }

    public b(@p0 a aVar) {
        this.f297639a = new c(f297637c);
        this.f297640b = aVar;
    }
}
