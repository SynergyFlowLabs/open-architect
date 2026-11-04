package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.widget.SpinnerAdapter;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface f1 extends SpinnerAdapter {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f11277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final LayoutInflater f11278b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private LayoutInflater f11279c;

        public a(@NonNull Context context) {
            this.f11277a = context;
            this.f11278b = LayoutInflater.from(context);
        }

        @NonNull
        public LayoutInflater a() {
            LayoutInflater layoutInflater = this.f11279c;
            return layoutInflater != null ? layoutInflater : this.f11278b;
        }

        @androidx.annotation.p0
        public Resources.Theme b() {
            LayoutInflater layoutInflater = this.f11279c;
            if (layoutInflater == null) {
                return null;
            }
            return layoutInflater.getContext().getTheme();
        }

        public void c(@androidx.annotation.p0 Resources.Theme theme) {
            if (theme == null) {
                this.f11279c = null;
            } else if (theme.equals(this.f11277a.getTheme())) {
                this.f11279c = this.f11278b;
            } else {
                this.f11279c = LayoutInflater.from(new androidx.appcompat.view.d(this.f11277a, theme));
            }
        }
    }

    @androidx.annotation.p0
    Resources.Theme getDropDownViewTheme();

    void setDropDownViewTheme(@androidx.annotation.p0 Resources.Theme theme);
}
