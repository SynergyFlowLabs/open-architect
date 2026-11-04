package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f48451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f48452b;

    public a1(@NonNull ViewGroup viewGroup) {
    }

    public int a() {
        return this.f48452b | this.f48451a;
    }

    public void b(@NonNull View view, @NonNull View view2, int i10) {
        c(view, view2, i10, 0);
    }

    public void c(@NonNull View view, @NonNull View view2, int i10, int i11) {
        if (i11 == 1) {
            this.f48452b = i10;
        } else {
            this.f48451a = i10;
        }
    }

    public void d(@NonNull View view) {
        e(view, 0);
    }

    public void e(@NonNull View view, int i10) {
        if (i10 == 1) {
            this.f48452b = 0;
        } else {
            this.f48451a = 0;
        }
    }
}
