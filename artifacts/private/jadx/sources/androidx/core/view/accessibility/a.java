package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public static final String f48458d = "ACCESSIBILITY_CLICKABLE_SPAN_ID";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f48459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f48460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f48461c;

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public a(int i10, @NonNull j jVar, int i11) {
        this.f48459a = i10;
        this.f48460b = jVar;
        this.f48461c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@NonNull View view) {
        Bundle bundle = new Bundle();
        bundle.putInt(f48458d, this.f48459a);
        this.f48460b.S0(this.f48461c, bundle);
    }
}
